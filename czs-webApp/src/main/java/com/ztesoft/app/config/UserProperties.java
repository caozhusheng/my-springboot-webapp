package com.ztesoft.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <Description>
 *
 * @author cao.zhusheng
 * @version 1.0
 * @taskId
 * @CreateDate 2018/11/5
 * @see com.ztesoft.app.config
 * @since R9
 */
@Component
@ConfigurationProperties(prefix = "czs.user")
public class UserProperties {

    public UserProperties() {
        System.out.println("======UserProperties start=======");
    }

    private String name;

    private String app;

    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "UserProperties{" +
                "name='" + name + '\'' +
                ", app='" + app + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
