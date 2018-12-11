package hu.iit.me.service;

import hu.iit.me.model.Applicant;
import java.util.Collection;

public interface ApplicantServiceInterface {

    Collection<Applicant> getAllApplicants();

    Collection<Applicant> getApplicantsByName(String name);

    Collection<Applicant> getApplicantsByBirthYear(int year);

    Collection<Applicant> getApplicantsByCity(String city);

    Collection<Applicant> getApplicantsByGender(String gender);

}
