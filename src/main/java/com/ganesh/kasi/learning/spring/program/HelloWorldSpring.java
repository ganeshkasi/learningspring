package com.ganesh.kasi.learning.spring.program;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class HelloWorldSpring {
    public static void main(String[] args) {

        /*ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml"); // xml file should be kept root folder */

        @NotNull
        /*ApplicationContext context;*/
                AbstractApplicationContext context; // to register a shutdownhook
        context = new ClassPathXmlApplicationContext("beans.xml"); // xml file should be kept in resources folder ie: src/main/resources
        context.registerShutdownHook();

        @NotNull
        PrintMsg printMsg = (PrintMsg) context.getBean("printMsgBeanID");
        printMsg.printmsgMethod();

        @NotNull
        PrintMsg printMsgAlias = (PrintMsg) context.getBean("printMsgAlias");
        printMsgAlias.printmsgMethod();

        GetterSetterInj getterSetterInj = context.getBean(GetterSetterInj.class);
        System.out.println(getterSetterInj.toString());

        ConstructorInj constructorInj = context.getBean(ConstructorInj.class);
        System.out.println(constructorInj.toString());

        InnerBeanObject innerBeanObject = context.getBean(InnerBeanObject.class);
        System.out.println(innerBeanObject);

        InjectObject injectObject = context.getBean(InjectObject.class);
        System.out.println(injectObject);

        CollectionInit collectionInit = context.getBean(CollectionInit.class);
        System.out.println(collectionInit.toString());

        SpringBeanInheritance springBeanInheritance = (SpringBeanInheritance) context.getBean("springBeanInheritance_002");
        System.out.println(springBeanInheritance.toString());

        SpringBeanInheritanceListMerge springBeanInheritanceListMerge_001 = (SpringBeanInheritanceListMerge) context.getBean("springBeanInheritanceListMerge_001");
        System.out.println(springBeanInheritanceListMerge_001.toString());

        SpringBeanInheritanceListMerge springBeanInheritanceListMerge_002 = (SpringBeanInheritanceListMerge) context.getBean("springBeanInheritanceListMerge_002");
        System.out.println(springBeanInheritanceListMerge_002.toString());

        SpringBeanInheritanceListMerge springBeanInheritanceListMerge_003 = (SpringBeanInheritanceListMerge) context.getBean("springBeanInheritanceListMerge_003");
        System.out.println(springBeanInheritanceListMerge_003.toString());

        Shape shapeCircle = (Shape) context.getBean("circleID");
        shapeCircle.draw();

        Shape shapeTriangle = (Shape) context.getBean("triangleID");
        shapeTriangle.draw();

        Shape shapeRectangle = (Shape) context.getBean("rectangleID");
        shapeRectangle.draw();
    }
}
