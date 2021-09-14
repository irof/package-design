package me.irof.pkgd.controller.hoge;

import me.irof.pkgd.service.hoge.HogeService;
import me.irof.pkgd.service.piyo.PiyoService;
import org.springframework.stereotype.Controller;

@Controller
public class HogeController {

    HogeService service;
    PiyoService piyoService;

    public HogeController(HogeService service) {
        this.service = service;
    }
}
