初始化一个maven项目
```
mvn -B archetype:generate \
  -DarchetypeGroupId=org.apache.maven.archetypes \
  -DgroupId=com.yaozhenyu \
  -DartifactId=yaocloud
```

## 发现的坑

1. 服务端配置注册中心地址: 如果注册中心配置了server.context-path,那么要defaultZone的格式为http://localhost:8761/{context-path}/eureka/
```
eureka:
  instance:
    hostname: localhost
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/  
```

2. feign

```
# 服务提供方

eureka:
  instance:
    hostname: localhost # 这里要配置,否则找不到服务
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/  

# 服务调用方,要配置ribbon,否则报负载均衡错误
ribbon:
  eureka:
    enabled: true
```