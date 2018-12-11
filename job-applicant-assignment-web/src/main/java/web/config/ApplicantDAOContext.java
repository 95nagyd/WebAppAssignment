package web.config;

import hu.iit.me.dao.ApplicantDAOInterface;
import hu.iit.me.dao.ApplicantDAOImplementation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;


@Configuration
@ComponentScan
public class ApplicantDAOContext {

    @Bean
    public ApplicantDAOInterface applicantDAOInterface() {
        return new ApplicantDAOImplementation();
    }

}
