package hu.iit.me.controller;

import hu.iit.me.dto.ApplicantDTO;
import hu.iit.me.service.ApplicantServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/applicants")
public class ApplicantController {

    private ApplicantServiceInterface applicantServiceInterface;

    public ApplicantController(ApplicantServiceInterface applicantServiceInterface) {
        this.applicantServiceInterface = applicantServiceInterface;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<ApplicantDTO> listAllApplicants() {
        return ApplicantDTO.convertApplicantListToApplicantDTOList(applicantServiceInterface.getAllApplicants());
    }

    @RequestMapping(value = "/byName/{name}", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<ApplicantDTO> listApplicantsByName(@PathVariable String name) {
        return ApplicantDTO.convertApplicantListToApplicantDTOList(applicantServiceInterface.getApplicantsByName(name));
    }

    @RequestMapping(value = "/byBirth/{year}", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<ApplicantDTO> listApplicantsByBirthYear(@PathVariable int year) {
        return ApplicantDTO.convertApplicantListToApplicantDTOList(applicantServiceInterface.getApplicantsByBirthYear(year));
    }

    @RequestMapping(value = "/byCity/{city}", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<ApplicantDTO> listApplicantsByCity(@PathVariable String city) {
        return ApplicantDTO.convertApplicantListToApplicantDTOList(applicantServiceInterface.getApplicantsByCity(city));
    }

    @RequestMapping(value = "/byGender/{gender}", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<ApplicantDTO> listApplicantsByGender(@PathVariable String gender) {
        return ApplicantDTO.convertApplicantListToApplicantDTOList(applicantServiceInterface.getApplicantsByGender(gender));
    }

}
