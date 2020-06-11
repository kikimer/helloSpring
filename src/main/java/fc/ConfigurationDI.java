package fc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "fc", nameGenerator = BeanNameGeneratorImpl.class)
public class ConfigurationDI {
}
