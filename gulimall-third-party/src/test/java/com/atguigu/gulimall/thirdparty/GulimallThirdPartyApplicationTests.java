package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallThirdPartyApplicationTests {


    @Resource
    OSSClient ossClient;


    @Test
    public void contextLoads() {
    }

    @Test
    public void testUpload() throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        /**String endpoint = "oss-cn-shanghai.aliyuncs.com";
         // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
         String accessKeyId = "LTAI5t9kBg2PeSjZuuy1TkGY";
         String accessKeySecret = "6pTLUyiesFcTRuMlNT58xjbZ7E6kI2";
         // 创建OSSClient实例。
         OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
         */

        // 上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\Mr yuan\\Desktop\\图片\\wallhaven-k7wor1_1920x1080.png");

        ossClient.putObject("gulimall8888", "so likeit.jpg ", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传成功...");
    }

}
