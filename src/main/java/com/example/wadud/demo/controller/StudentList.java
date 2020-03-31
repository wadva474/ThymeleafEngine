package com.example.wadud.demo.controller;


import com.example.wadud.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentList {
    @RequestMapping("/demo")
    public String list(Model model) {
        model.addAttribute("message", "Hello Thymeleaf");
        //returns to templates/demo.html page.
        double grade = 90.5;
        model.addAttribute("grade", grade);
        model.addAttribute("GPA", convertGpa(grade));
        return "demo";
    }

    @RequestMapping("/demo2")
    public String studentList(Model model) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "wadud", 67.5));
        studentList.add(new Student(2, "Sola", 97.5));
        studentList.add(new Student(3, "John", 60.5));
        model.addAttribute("studentList", studentList);
        return "demo2";
    }


    @RequestMapping("/demo3")
    public String demo3(HttpServletRequest request, Model model) {
        //Request
        request.setAttribute("request", "request data");
        //Sesseion
        request.getSession().setAttribute("session", "session data");
        //Application
        request.getSession().getServletContext().setAttribute("application", "application data");
        return "demo2";
    }

    private String convertGpa(double grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade < 90 && grade >= 80) {
            return "B";
        } else if (grade < 80 && grade >= 70) {
            return "C";
        } else if (grade < 70 && grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

