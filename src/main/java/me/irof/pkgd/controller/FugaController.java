package me.irof.pkgd.controller;

import me.irof.pkgd.service.FugaService;
import me.irof.pkgd.service.PiyoService;
import org.springframework.stereotype.Controller;

@Controller
public class FugaController {
    FugaService service;
    PiyoService piyoService;

    public FugaController(FugaService service) {
        this.service = service;
    }
}
