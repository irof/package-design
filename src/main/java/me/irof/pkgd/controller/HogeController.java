package me.irof.pkgd.controller;

import me.irof.pkgd.service.HogeService;
import org.springframework.stereotype.Controller;

@Controller
public class HogeController {

    HogeService service;
    PiyoService piyoService;

    public HogeController(HogeService service) {
        this.service = service;
    }
}
