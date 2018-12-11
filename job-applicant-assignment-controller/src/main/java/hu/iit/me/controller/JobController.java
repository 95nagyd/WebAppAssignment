package hu.iit.me.controller;

import hu.iit.me.dto.JobDTO;
import hu.iit.me.service.JobServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/jobs")
public class JobController {

    private JobServiceInterface jobServiceInterface;

    public JobController(JobServiceInterface jobServiceInterface) {
        this.jobServiceInterface = jobServiceInterface;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<JobDTO> listAllJobs() {
        return JobDTO.convertJobListToJobDTOList(jobServiceInterface.getAllJobs());
    }

    @RequestMapping(value = "/byTitle/{title}", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<JobDTO> listJobsByTitle(@PathVariable String title) {
        return JobDTO.convertJobListToJobDTOList(jobServiceInterface.getJobsByTitle(title));
    }

    @RequestMapping(value = "/byCity/{city}", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<JobDTO> listJobsByCity(@PathVariable String city) {
        return JobDTO.convertJobListToJobDTOList(jobServiceInterface.getJobsByCity(city));
    }

    @RequestMapping(value = "/byCompany/{companyName}", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<JobDTO> listJobsByCompanyName(@PathVariable String companyName) {
        return JobDTO.convertJobListToJobDTOList(jobServiceInterface.getJobsByCompanyName(companyName));
    }

    @RequestMapping(value = "/byCategory/{category}", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<JobDTO> listJobsByCategory(@PathVariable String category) {
        return JobDTO.convertJobListToJobDTOList(jobServiceInterface.getJobsByCategory(category));
    }

}
