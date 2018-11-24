# 基于spring boot的dubbo简易脚手架

## 依赖：
     1.Jdk1.8
     2.ZooKeeper 3.4+

## 结构：
        master
            api
            provider
            consumer
    
    master：父工程，管理所有依赖
    api：定义服务接口、pojo
    provider：服务提供者、对api中服务接口的实现
    consumer：服务使用者

## 说明：
    1.master整体编译打包
    2.优先启动provider，不然consumer会因找不到服务提供者而报错
    3.可部署dubbo-admin监控服务状态

## 疏通：
    provider与consumer都启动后，访问 http://localhost:8081/save，返回带有id的json证明服务疏通。
