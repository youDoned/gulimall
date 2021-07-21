package com.atguigu.gulimall.product.service.impl;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;
import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryBrandRelationService;
import com.atguigu.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    CategoryBrandRelationService categoryBrandRelationService;
    /**继承ServiceImple 里面有泛型指定的mapper 就是 CategoryDao
     * 所以下面就不写了CategoDao 了*/
   /* @Autowired
    CategoryDao categoryDao;*/


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查询出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);


        /**2.组装成父子的树形结构
         * 1)找到所有的一级分类
         */
        List<CategoryEntity> level1Menus = entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0).
                map((menu)->{
                    menu.setChildren(getChildrens(menu,entities));
                    return menu;
                }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return level1Menus;
    }

    //自定义删除批量删除
    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 检查是否引用了菜单 以后做  todo是代办事项的标志
        //直接删除 数据库 是物理删除

        //但是一般是逻辑删除就是 标志位  判断 0  1

    }

    @Override
    public Long[] findCatelogPath(Long catelogId) {

        List<Long> paths = new ArrayList<>();
        List<Long> parentPath = findParentPath(catelogId, paths);

        Collections.reverse(parentPath);

        return  parentPath.toArray(new Long[parentPath.size()]);
    }

    /**
     * 级联更新关联的数据
     * @param category
     */
    @Transactional
    @Override
    public void updateCascade(CategoryEntity category) {
        this.updateById(category);
        categoryBrandRelationService.updateCategory(category.getCatId(), category.getName());

    }

    private List<Long> findParentPath(Long catelogId, List<Long> paths) {
        //收集当前节点id
        paths.add((catelogId));
        CategoryEntity byId = this.getById(catelogId);
        if (byId != null) {
           if (byId.getParentCid() !=0) {
               findParentPath(byId.getParentCid(), paths);
           }
        }


        return paths;
    }

    //root 当前菜单  all 所有菜单 递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){

        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntiry -> {
            //1.找到子菜单
            categoryEntiry.setChildren(getChildrens(categoryEntiry, all));
            return categoryEntiry;
        }).sorted((menu1,menu2)->{
            //相减 菜单的排序
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }


}









