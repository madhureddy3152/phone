package using_xml;

import org.springframework.stereotype.Component;

@Component
public class Nokia implements Phone {

    @Override
    public void calling() {
        System.out.println("Calling from the Nokia");
    }
}

