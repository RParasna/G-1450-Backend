package com.RP.G1450.service.imp;

import com.RP.G1450.model.Applicant;
import com.RP.G1450.repository.ApplicantRepository;
import com.RP.G1450.service.ApplicantService;
import org.springframework.stereotype.Service;

@Service
public class ApplicantServiceImplementation implements ApplicantService {

    private final ApplicantRepository applicantRepository;

    public ApplicantServiceImplementation(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    @Override
    public Applicant saveApplicant(Applicant applicant) {
        return applicantRepository.save(applicant);
    }

    @Override
    public Applicant updateApplicant(Applicant applicant) {
        return applicantRepository.save(applicant);
    }
}
