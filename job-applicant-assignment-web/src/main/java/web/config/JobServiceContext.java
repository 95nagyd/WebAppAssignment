package web.config;

import hu.iit.me.controller.JobController;
import hu.iit.me.service.JobServiceInterface;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


@EnableWebMvc
@Configuration
@ComponentScan
public class JobServiceContext {

    private JobServiceInterface jobServiceInterface;

    @Autowired
    public JobServiceContext(JobServiceInterface jobServiceInterface) {
        this.jobServiceInterface = jobServiceInterface;
    }

    @Bean
    public JobController jobController(){
        return new JobController(jobServiceInterface);
    }

}
