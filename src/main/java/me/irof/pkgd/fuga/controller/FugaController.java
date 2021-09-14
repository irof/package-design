package me.irof.pkgd.fuga.controller;

import me.irof.pkgd.fuga.service.FugaService;
import me.irof.pkgd.piyo.service.PiyoService;
import org.springframework.stereotype.Controller;

@Controller
public class FugaController {
    FugaService service;
    PiyoService piyoService;

    public FugaController(FugaService service) {
        this.service = service;
    }
}
