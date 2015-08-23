/**
 * 
 */
package person.me.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author HOME
 *
 */
@SpringBootApplication
@EnableAutoConfiguration 
@ComponentScan("person.me.rc") 
public class Application extends SpringBootServletInitializer {
	
	//final static Logger log = Logger.getLogger(Application.class.getName());
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application;//.sources(Application.class);
    }	
	
	public static void main(String[] args) {
		//log.info("Starting application");
		SpringApplication.run(Application.class, args);
	}

}
