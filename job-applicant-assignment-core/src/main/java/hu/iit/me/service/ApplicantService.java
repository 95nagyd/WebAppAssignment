package hu.iit.me.service;

import hu.iit.me.model.Applicant;
import java.util.Collection;

public interface ApplicantService {

    Collection<Applicant> listAllApplicants();

    Collection<Applicant> listApplicantsByName(String name);

    Collection<Applicant> listApplicantsByBirthYear(int year);

    Collection<Applicant> listApplicantsByCity(String city);

    Collection<Applicant> listApplicantByGender(String gender);

}
