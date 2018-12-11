package hu.iit.me.dto;

import hu.iit.me.model.Job;

import java.util.ArrayList;
import java.util.Collection;

public class JobDTO {

    private String jobID;
    private String jobTitle;
    private String jobCity;
    private String jobCompanyName;
    private String jobCategory;

    public JobDTO(){}

    public JobDTO(String jobID, String jobTitle, String jobCity, String jobCompanyName, String jobCategory) {
        this.jobID = jobID;
        this.jobTitle = jobTitle;
        this.jobCity = jobCity;
        this.jobCompanyName = jobCompanyName;
        this.jobCategory = jobCategory;
    }


    public static ArrayList<JobDTO> convertJobListToJobDTOList(Collection<Job> jobs) {
        ArrayList<JobDTO> jobDTOs = new ArrayList<>();
        for(Job job : jobs) {
            jobDTOs.add(convertJobToJobDTO(job));
        }
        return jobDTOs;
    }


    public static JobDTO convertJobToJobDTO(Job job) {
        JobDTO jobDTO = new JobDTO();
        jobDTO.setJobID(job.getJobID());
        jobDTO.setJobTitle(job.getJobTitle());
        jobDTO.setJobCity(job.getJobCity());
        jobDTO.setJobCompanyName(job.getJobCompanyName());
        jobDTO.setJobCategory(job.getJobCategory());
        return jobDTO;
    }


    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobCity(String jobCity) {
        this.jobCity = jobCity;
    }

    public void setJobCompanyName(String jobCompanyName) {
        this.jobCompanyName = jobCompanyName;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobCity() {
        return jobCity;
    }

    public String getJobCompanyName() {
        return jobCompanyName;
    }

    public String getJobCategory() {
        return jobCategory;
    }

}
