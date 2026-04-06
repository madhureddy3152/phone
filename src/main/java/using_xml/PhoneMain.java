package using_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PhoneMain {
    public static void main(String[] args) {

        ApplicationContext ac =
            new AnnotationConfigApplicationContext(Config.class);

        User user = ac.getBean("user", User.class);

        user.nokia.calling();
        user.samsung.calling();
        user.phone.calling();
    }
}