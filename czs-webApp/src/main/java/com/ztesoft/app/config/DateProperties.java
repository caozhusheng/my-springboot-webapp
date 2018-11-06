package com.ztesoft.app.config;

import org.springframework.beans.factory.annotation.Value;
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
public class DateProperties {

    public DateProperties() {
        System.out.println("=========DateProperties construct!==========");
    }

    @Value("${czs.date.driver-class-name}")
    private String driverClassName;

    @Value("${czs.date.url}")
    private String url;

    @Value("${czs.date.username}")
    private String username;

    @Value("${czs.date.password}")
    private String password;

    @Override
    public String toString() {
        return "DateProperties{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
