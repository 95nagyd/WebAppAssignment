package hu.iit.me.service;

import hu.iit.me.dao.ApplicantDAOInterface;
import hu.iit.me.model.Applicant;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ApplicantServiceImplementation implements ApplicantServiceInterface {

    private ApplicantDAOInterface applicantDAOInterface;

    public ApplicantServiceImplementation(ApplicantDAOInterface applicantDAOInterface) {
        this.applicantDAOInterface = applicantDAOInterface;
    }

    @Override
    public Collection<Applicant> getAllApplicants() {
        return applicantDAOInterface.listAllApplicants();
    }

    @Override
    public Collection<Applicant> getApplicantsByName(String name) {
        return applicantDAOInterface.listApplicantsByName(name);
    }

    @Override
    public Collection<Applicant> getApplicantsByBirthYear(int year) {
        return applicantDAOInterface.listApplicantsByBirthYear(year);
    }

    @Override
    public Collection<Applicant> getApplicantsByCity(String city) {
        return applicantDAOInterface.listApplicantsByCity(city);
    }

    @Override
    public Collection<Applicant> getApplicantsByGender(String gender) {
        return applicantDAOInterface.listApplicantsByGender(gender);
    }
}
