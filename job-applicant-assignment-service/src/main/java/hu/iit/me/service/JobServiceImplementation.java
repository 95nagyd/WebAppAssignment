package hu.iit.me.service;

import hu.iit.me.dao.JobDAOInterface;
import hu.iit.me.model.Job;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class JobServiceImplementation implements JobServiceInterface {

    private JobDAOInterface jobDAOInterface;

    public JobServiceImplementation(JobDAOInterface jobDAOInterface) {
        this.jobDAOInterface = jobDAOInterface;
    }

    @Override
    public Collection<Job> getAllJobs() {
        return jobDAOInterface.listAllJobs();
    }

    @Override
    public Collection<Job> getJobsByTitle(String title) {
        return  jobDAOInterface.listJobsByTitle(title);
    }

    @Override
    public Collection<Job> getJobsByCity(String city) {
        return jobDAOInterface.listJobsByCity(city);
    }

    @Override
    public Collection<Job> getJobsByCompanyName(String companyName) {
        return jobDAOInterface.listJobsByCompanyName(companyName);
    }

    @Override
    public Collection<Job> getJobsByCategory(String category) {
        return jobDAOInterface.listJobsByCategory(category);
    }
}
