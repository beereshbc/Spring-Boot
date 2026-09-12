package com.springboot.springboot;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {


    private final SoftwareEngineerRepository SoftwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
      this.SoftwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineer(){
        return SoftwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {

        SoftwareEngineerRepository.save(softwareEngineer);

    }
}
