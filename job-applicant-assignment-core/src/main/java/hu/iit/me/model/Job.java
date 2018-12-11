package hu.iit.me.model;

public class Job {

    private String jobID;
    private String jobTitle;
    private String jobCity;
    private String jobCompanyName;
    private String jobCategory;

    public Job(String jobID, String jobTitle, String jobCity, String jobCompanyName, String jobCategory) {
        this.jobID = jobID;
        this.jobTitle = jobTitle;
        this.jobCity = jobCity;
        this.jobCompanyName = jobCompanyName;
        this.jobCategory = jobCategory;
    }

    public String getJobID() {
        return jobID;
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