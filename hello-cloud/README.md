#SpringColud HELLO-WORD

含有3个modules
1. provider
2. provider2
3. consumer

两个提供者，一个消费者。两个提供者代码基本相同(为了区别两个节点，api返回字符串区分了下)，为了方便ide中直接测试loadbalance效果，所以重复建立两个模块。

首先https://www.consul.io/ 下载consul注册中心并安装，然后依次运行3个spring boot项目

同时参考下：https://www.cnblogs.com/ityouknow/p/9340591.html教程

启动完毕后：
1. 注册中心 http://localhost:8500/
2. 消费者api(可反复调用看lb效果) http://localhost:8080/consumer/hello/{word}

依次停provider/provider2后，都调用2号接口观察返回不同的结果，当没有任何provider时候，触发Feign Hystrix服务降级机制，执行HelloServiceImpl的实现

consul集群 https://blog.csdn.net/admin_ming/article/details/86688771

