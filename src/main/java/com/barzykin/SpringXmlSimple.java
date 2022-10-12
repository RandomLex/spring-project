package com.barzykin;

import com.barzykin.model.Group;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlSimple {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Group java = ctx.getBean("java", Group.class);
        java.print();
    }
}
