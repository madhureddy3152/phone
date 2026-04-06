package using_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("objectconfig.xml");
        Sample s = ac.getBean("mySample", Sample.class);
        s.text();  // method call
        System.out.println(s);
    }
}

