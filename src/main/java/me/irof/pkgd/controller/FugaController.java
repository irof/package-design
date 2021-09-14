package me.irof.pkgd.controller;

import me.irof.pkgd.service.FugaService;
import org.springframework.stereotype.Controller;

@Controller
public class FugaController {
    FugaService service;

    public FugaController(FugaService service) {
        this.service = service;
    }
}
