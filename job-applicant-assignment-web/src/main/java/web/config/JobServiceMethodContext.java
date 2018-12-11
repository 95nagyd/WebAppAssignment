package web.config;

import hu.iit.me.dao.JobDAOInterface;
import hu.iit.me.service.JobServiceInterface;
import hu.iit.me.service.JobServiceImplementation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


@Configuration
@ComponentScan
public class JobServiceMethodContext {

    private JobDAOInterface jobDAOInterface;

    @Autowired
    public JobServiceMethodContext(JobDAOInterface jobDAOInterface){
        this.jobDAOInterface = jobDAOInterface;
    }

    @Bean
    public JobServiceInterface jobServiceInterface(){
        return new JobServiceImplementation(jobDAOInterface);
    }

}
