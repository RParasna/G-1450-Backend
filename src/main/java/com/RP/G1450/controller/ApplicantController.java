package com.RP.G1450.controller;

import com.RP.G1450.model.Applicant;
import com.RP.G1450.service.ApplicantService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/applicant")
@CrossOrigin
public class ApplicantController {

    private  final ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }


    @PostMapping
    public Applicant saveApplicant(@RequestBody Applicant applicant) {
        return applicantService.saveApplicant(applicant);
    }

    @PutMapping
    public  Applicant updatApplicant(@RequestBody Applicant applicant) {
        return applicantService.updateApplicant(applicant);
    }
}
