package using_xml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Marks this class as a Spring configuration class
@Configuration

// Scans the package "using_xml" for @Component, @Service, @Repository, etc.
@ComponentScan(basePackages = "using_xml")
public class Config {
    // No need to define beans manually since we use @Component annotations
}
