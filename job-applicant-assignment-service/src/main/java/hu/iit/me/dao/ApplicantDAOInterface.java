package hu.iit.me.dao;

import hu.iit.me.model.Applicant;
import java.util.Collection;

public interface ApplicantDAOInterface {

    Collection<Applicant> listAllApplicants();

    Collection<Applicant> listApplicantsByName(String name);

    Collection<Applicant> listApplicantsByBirthYear(int year);

    Collection<Applicant> listApplicantsByCity(String city);

    Collection<Applicant> listApplicantsByGender(String gender);

}
