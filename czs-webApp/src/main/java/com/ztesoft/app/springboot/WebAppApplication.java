package com.ztesoft.app.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ztesoft.app.config.DateProperties;
import com.ztesoft.app.config.UserProperties;

/**
 * <Description>
 *
 * @author cao.zhusheng
 * @version 1.0
 * @taskId
 * @CreateDate 2018/11/5
 * @see com.ztesoft.app.springboot
 * @since R9
 */
@SpringBootApplication
public class WebAppApplication {

    public static final Logger LOGGER = LoggerFactory.getLogger(WebAppApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Begin to start WebAppApplication!");
        ConfigurableApplicationContext context = SpringApplication.run(WebAppApplication.class, args);
        UserProperties userProperties = context.getBean(UserProperties.class);
        LOGGER.info("user properties" + userProperties.toString());
        DateProperties dateProperties = context.getBean(DateProperties.class);
        LOGGER.info("date properties" + dateProperties.toString());
        LOGGER.info("WebAppApplication started!");
    }
}
