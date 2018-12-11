package hu.iit.me.dto;

import hu.iit.me.model.Applicant;

import java.util.ArrayList;
import java.util.Collection;

public class ApplicantDTO {

    private String applicantID;
    private String applicantName;
    private int applicantBirthYear;
    private String applicantCity;
    private String applicantGender;

    public ApplicantDTO(){}

    public ApplicantDTO(String applicantID, String applicantName, int applicantBirthYear, String applicantCity, String applicantGender) {
        this.applicantID = applicantID;
        this.applicantName = applicantName;
        this.applicantBirthYear = applicantBirthYear;
        this.applicantCity = applicantCity;
        this.applicantGender = applicantGender;
    }

    public static ArrayList<ApplicantDTO> convertApplicantListToApplicantDTOList(Collection<Applicant> applicants) {
        ArrayList<ApplicantDTO> applicantDTOs = new ArrayList<>();
        for(Applicant applicant : applicants) {
            applicantDTOs.add(convertApplicantToApplicantDTO(applicant));
        }
        return applicantDTOs;
    }

    public static ApplicantDTO convertApplicantToApplicantDTO(Applicant applicant) {
        ApplicantDTO applicantDTO = new ApplicantDTO();
        applicantDTO.setApplicantID(applicant.getApplicantID());
        applicantDTO.setApplicantName(applicant.getApplicantName());
        applicantDTO.setApplicantBirthYear(applicant.getApplicantBirthYear());
        applicantDTO.setApplicantCity(applicant.getApplicantCity());
        applicantDTO.setApplicantGender(applicant.getApplicantGender());
        return applicantDTO;
    }

    public void setApplicantID(String applicantID) {
        this.applicantID = applicantID;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public void setApplicantBirthYear(int applicantBirthYear) {
        this.applicantBirthYear = applicantBirthYear;
    }

    public void setApplicantCity(String applicantCity) {
        this.applicantCity = applicantCity;
    }

    public void setApplicantGender(String applicantGender) {
        this.applicantGender = applicantGender;
    }


    public String getApplicantName() {
        return applicantName;
    }

    public int getApplicantBirthYear() {
        return applicantBirthYear;
    }

    public String getApplicantCity() {
        return applicantCity;
    }

    public String getApplicantGender() {
        return applicantGender;
    }

}
