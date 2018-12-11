package hu.iit.me.service;

import hu.iit.me.model.Job;
import java.util.Collection;

public interface JobService {

    Collection<Job> listAllJobs();

    Collection<Job> listJobsByTitle(String title);

    Collection<Job> listJobsByCity(String city);

    Collection<Job> listJobsByCompanyName(String companyName);

    Collection<Job> listJobsByCategory(String category);

}
