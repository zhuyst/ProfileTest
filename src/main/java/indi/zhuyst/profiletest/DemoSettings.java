package indi.zhuyst.profiletest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("demoSettings")
@ConfigurationProperties(prefix = "demo")
public class DemoSettings {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
