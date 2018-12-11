package hu.iit.me.dao;

import hu.iit.me.model.Job;

import java.util.ArrayList;
import java.util.Collection;

public class JobDAOImplementation implements JobDAOInterface {

    private Collection<Job> jobs;

    public JobDAOImplementation() {
        this.jobs = new ArrayList<>();
        jobs.add(new Job("1","Munka mindenkinek","Miskolc","RabszolgaMunkaltato","komisszió"));
        jobs.add(new Job("2","Álom munka ételfutár","Miskolc","DonPizza","futár"));
        jobs.add(new Job("3","Álom állás","Győr","ITCompany","informatika"));
        jobs.add(new Job("4","Valami állás","Budapest","Valami Kft.","futár"));
        jobs.add(new Job("5","Álláslehetőség","Miskolc","Company Kft.","takarító"));
    }

    @Override
    public Collection<Job> listAllJobs() {
        return jobs;
    }

    @Override
    public Collection<Job> listJobsByTitle(String title) {
        Collection<Job> listedJobs = new ArrayList<>();
        for(Job job : jobs) {
            if(job.getJobTitle().contains(title)){
                listedJobs.add(job);
            }
        }
        return listedJobs;
    }

    @Override
    public Collection<Job> listJobsByCity(String city) {
        Collection<Job> listedJobs = new ArrayList<>();
        for(Job job : jobs) {
            if(job.getJobCity().contains(city)){
                listedJobs.add(job);
            }
        }
        return listedJobs;
    }

    @Override
    public Collection<Job> listJobsByCompanyName(String companyName) {
        Collection<Job> listedJobs = new ArrayList<>();
        for(Job job : jobs) {
            if(job.getJobCompanyName().equals(companyName)){
                listedJobs.add(job);
            }
        }
        return listedJobs;
    }

    @Override
    public Collection<Job> listJobsByCategory(String category) {
        Collection<Job> listedJobs = new ArrayList<>();
        for(Job job : jobs) {
            if(job.getJobCategory().equals(category)){
                listedJobs.add(job);
            }
        }
        return listedJobs;
    }
}
