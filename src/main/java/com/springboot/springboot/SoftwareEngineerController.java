package com.springboot.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-enginner")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineer(){
        return softwareEngineerService.getAllSoftwareEngineer();
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineerById(
            @PathVariable Integer id
    ){
        return softwareEngineerService.getSoftwareEngineerById(id);
    }


    @PostMapping
    public void addNewSoftwareEngineer(
           @RequestBody SoftwareEngineer softwareEngineer){
            softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }


}
