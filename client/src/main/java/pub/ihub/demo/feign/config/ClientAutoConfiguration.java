package pub.ihub.demo.feign.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liheng
 */
@Configuration
@ComponentScan("pub.ihub.demo.feign.fallback")
public class ClientAutoConfiguration {

}
