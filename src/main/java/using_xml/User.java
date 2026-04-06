package using_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

    String name = "Madhu";

    @Autowired
    Nokia nokia;

    @Autowired
    Samsung samsung;

    @Autowired
    @Qualifier("nokia")
    Phone phone;
}