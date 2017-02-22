# SSH2
###one:第一次 pom.xml全配置，以及javax-servlet-api包找不到解决
####(直接拷ttps://mvnrepository.com/artifact/javax.servlet/javax.servlet-api)的配置，idea会自动再下载

####http://blog.csdn.net/upupjavajava/article/details/43270899  idea生成实体类

#####问题
######1.org.hibernate.HibernateException: Could not obtain transaction-synchronized Session for current thread
######1.问题原因，因为hibernate配置了事务处理，所以必须加上@Transactional注解，告诉spring执行程序时，需要进行事务处理。
######2.Already value [org.springframework.orm.hibernate5.SessionHolder@ff3f1d] for key [org.hibernate.inter
######2.问题原因:<bean id="transactionManager" class="org.springframework.orm.hibernate4.HibernateTransactionManager"> 应配置hibernate5的
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:aop="http://www.springframework.org/schema/aop"
xmlns:tx="http://www.springframework.org/schema/tx"
xsi:schemaLocation="
http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans.xsd
http://www.springframework.org/schema/tx
http://www.springframework.org/schema/tx/spring-tx.xsd
http://www.springframework.org/schema/aop
http://www.springframework.org/schema/aop/spring-aop.xsd">



http://blog.csdn.net/adermxl/article/details/46011499   spring +hibernate

