package me.irof.pkgd.hoge;

import org.springframework.stereotype.Controller;

@Controller
public class HogeController {

    HogeService service;

    public HogeController(HogeService service) {
        this.service = service;
    }
}
