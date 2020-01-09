package cn.com.zztt.eurekaserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @className: EurekaServerApplication
 * @description: 注册中心服务端启动类
 * EnableEurekaServer 声明为尤里卡服务器（注册中心）
 * @author: zztt
 **/
@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
        log.info("[注册中心]：服务端启动！");
    }

}
