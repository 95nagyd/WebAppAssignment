package web.config;

import hu.iit.me.controller.ApplicantController;
import hu.iit.me.service.ApplicantServiceInterface;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


@EnableWebMvc
@Configuration
@ComponentScan
public class ApplicantServiceContext {

    private ApplicantServiceInterface applicantServiceInterface;

    @Autowired
    public ApplicantServiceContext(ApplicantServiceInterface applicantServiceInterface) {
        this.applicantServiceInterface = applicantServiceInterface;
    }

    @Bean
    public ApplicantController applicantController(){
        return new ApplicantController(applicantServiceInterface);
    }

}
