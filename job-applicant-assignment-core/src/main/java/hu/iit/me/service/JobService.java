package hu.iit.me.service;

import hu.iit.me.model.Job;
import java.util.Collection;

public interface JobService {

    Collection<Job> getAllJobs();

    Collection<Job> getJobsByTitle(String title);

    Collection<Job> getJobsByCity(String city);

    Collection<Job> getJobsByCompanyName(String companyName);

    Collection<Job> getJobsByCategory(String category);

}
