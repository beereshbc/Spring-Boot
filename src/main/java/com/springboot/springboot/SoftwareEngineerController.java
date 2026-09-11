package com.springboot.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-enginner")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineer(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Beeresh",
                        "Java, Javascript, Node.js React.js, MongoDB, Tailwind CSS"
                ),
                new SoftwareEngineer(
                        1,
                        "Alice",
                        "Python, Javascript, Express.js React.js, MongoDB, Tailwind CSS"
                )
        );
    }

}
