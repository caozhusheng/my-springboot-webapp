#学习文档 https://www.w3cschool.cn/springboot/springboot-jvc224kp.html

# my-springboot-webapp
spring boot学习的第一个简单web项目

Spring Boot(英文中是“引导”的意思)，是用来简化Spring应用的搭建到开发的过程。应用开箱即用，只要通过 “just run”（可能是 java -jar 或 tomcat 或 maven插件run 或 shell脚本），就可以启动项目。二者，Spring Boot 只要很少的Spring配置文件（例如那些xml，property）。

因为“习惯优先于配置”的原则，使得Spring Boot在快速开发应用和微服务架构实践中得到广泛应用。

#可以直接使用Maven骨架工程生成Maven骨架Web项目，即man archetype:generate命令： 创建springboot的web项目
mvn archetype:generate -DgroupId=com.ztesoft.app -DartifactId=czs-webApp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

#项目启动类 WebAppApplication
1. @SpringBootApplication：Spring Boot 应用的标识

2. Application很简单，一个main函数作为主入口。SpringApplication引导应用，并将Application本身作为参数传递给run方法。具体run方法会启动嵌入式的Tomcat并初始化Spring环境及其各Spring组件。

#项目加入了spring boot的自动配置功能
Spring Boot 提供了对应用进行自动化配置
