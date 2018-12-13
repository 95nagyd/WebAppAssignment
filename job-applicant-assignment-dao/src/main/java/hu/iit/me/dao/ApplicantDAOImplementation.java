package hu.iit.me.dao;

import hu.iit.me.model.Applicant;

import java.util.ArrayList;
import java.util.Collection;

public class ApplicantDAOImplementation implements ApplicantDAOInterface {

    private Collection<Applicant> applicants;

    public ApplicantDAOImplementation() {
        this.applicants = new ArrayList<>();
        applicants.add(new Applicant("1","Pásztor Dani",1990,"Miskolc","male"));
        applicants.add(new Applicant("2","Nagy Eszter",1992,"Eger","female"));
        applicants.add(new Applicant("3","Szarka Laci",1998,"Debrecen","male"));
        applicants.add(new Applicant("4","Szarka Peti",1990,"Debrecen","male"));
        applicants.add(new Applicant("5","Pásztor Zsuzsa",1992,"Miskolc","female"));
        applicants.add(new Applicant("6","Nagy József",1990,"Miskolc","male"));
        applicants.add(new Applicant("7","Tóth Tünde",1995,"Miskolc","female"));
        applicants.add(new Applicant("8","Fodor Béla",1992,"Eger","male"));
    }

    @Override
    public Collection<Applicant> listAllApplicants() {
        return applicants;
    }

    @Override
    public Collection<Applicant> listApplicantsByName(String name) {
        Collection<Applicant> listedApplicants = new ArrayList<>();
        for(Applicant applicant : applicants) {
            if(applicant.getApplicantName().contains(name)){
                listedApplicants.add(applicant);
            }
        }
        return listedApplicants;
    }

    @Override
    public Collection<Applicant> listApplicantsByBirthYear(int year) {
        Collection<Applicant> listedApplicants = new ArrayList<>();
        for(Applicant applicant : applicants) {
            if(applicant.getApplicantBirthYear() == year){
                listedApplicants.add(applicant);
            }
        }
        return listedApplicants;
    }

    @Override
    public Collection<Applicant> listApplicantsByCity(String city) {
        Collection<Applicant> listedApplicants = new ArrayList<>();
        for(Applicant applicant : applicants) {
            if(applicant.getApplicantCity().equals(city)){
                listedApplicants.add(applicant);
            }
        }
        return listedApplicants;
    }

    @Override
    public Collection<Applicant> listApplicantsByGender(String gender) {
        Collection<Applicant> listedApplicants = new ArrayList<>();
        for(Applicant applicant : applicants) {
            if(applicant.getApplicantGender().equals(gender)){
                listedApplicants.add(applicant);
            }
        }
        return listedApplicants;
    }
}
