package me.irof.pkgd.hoge.controller;

import me.irof.pkgd.hoge.service.HogeService;
import me.irof.pkgd.piyo.service.PiyoService;
import org.springframework.stereotype.Controller;

@Controller
public class HogeController {

    HogeService service;
    PiyoService piyoService;

    public HogeController(HogeService service) {
        this.service = service;
    }
}
