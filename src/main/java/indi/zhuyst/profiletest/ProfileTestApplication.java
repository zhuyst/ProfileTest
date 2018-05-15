package indi.zhuyst.profiletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProfileTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ProfileTestApplication.class, args);
        DemoSettings demoSettings = (DemoSettings) ctx.getBean("demoSettings");

        System.out.println("*********************");
        System.out.println(demoSettings.getName());
        System.out.println("*********************");
    }
}
