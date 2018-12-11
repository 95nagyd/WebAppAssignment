package web.config;

import hu.iit.me.dao.ApplicantDAOInterface;
import hu.iit.me.service.ApplicantServiceInterface;
import hu.iit.me.service.ApplicantServiceImplementation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


@Configuration
@ComponentScan
public class ApplicantServiceMethodContext {

    private ApplicantDAOInterface applicantDAOInterface;

    @Autowired
    public ApplicantServiceMethodContext(ApplicantDAOInterface applicantDAOInterface){
        this.applicantDAOInterface = applicantDAOInterface;
    }

    @Bean
    public ApplicantServiceInterface applicantServiceInterface(){
        return new ApplicantServiceImplementation(applicantDAOInterface);
    }

}
