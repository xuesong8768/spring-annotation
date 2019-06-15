package com.xue;

import com.xue.bean.Person;
import com.xue.config.MainConfig2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
//    public static void main( String[] args ) {
//        System.out.println( "Hello World!" );
//        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        Person person= (Person) context.getBean("person");
//        System.out.println(person);
//    }

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(MainConfig2.class);
        Person person= context.getBean(Person.class);
        System.out.println(person);

        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        for (String str:beanNamesForType) {
            System.out.println(str);
        }
    }
}
