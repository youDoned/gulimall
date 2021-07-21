package com.atguigu.gulimall.product;


import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest //(classes = GulimallProductApplication.class)
public class GulimallProductApplicationTests {



    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;

    @Test
    public void testFindPath() {

        Long[] catelogPath = categoryService.findCatelogPath(251L);
        log.info("完整路径：{}", Arrays.asList(catelogPath));

    }

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("小牛逼啊");
        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }

/*    @Test
    public void testUpload() throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        *String endpoint = "oss-cn-shanghai.aliyuncs.com";
        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        String accessKeyId = "LTAI5t9kBg2PeSjZuuy1TkGY";
        String accessKeySecret = "6pTLUyiesFcTRuMlNT58xjbZ7E6kI2";
        // 创建OSSClient实例。
        OssClient ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);


        // 上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\Mr yuan\\Desktop\\图片\\wallhaven-k7wor1_1920x1080.png");

        ossClient.putObject("gulimall8888", "like it ", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传成功...");
    }*/
}
