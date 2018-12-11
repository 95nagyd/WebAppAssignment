package web.config;

import hu.iit.me.dao.JobDAOInterface;
import hu.iit.me.dao.JobDAOImplementation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;


@Configuration
@ComponentScan
public class JobDAOContext {

    @Bean
    public JobDAOInterface jobDAOInterface() {
        return new JobDAOImplementation();
    }

}
