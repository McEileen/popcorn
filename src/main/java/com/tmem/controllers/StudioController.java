package com.tmem.controllers;

import com.tmem.entities.Studio;
import com.tmem.services.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/studios")
public class StudioController {
    private StudioService service;

    @Autowired
    public void setService(StudioService service) {
        this.service = service;
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
    public Page<Studio> index(@RequestParam(name="page", required = false, defaultValue = "0") int page) {
        return this.service.findAll(page);
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.POST)
    public Studio create(@RequestBody Studio studio) {
        return this.service.create(studio);
    }

}
