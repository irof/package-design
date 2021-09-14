package me.irof.pkgd;

import org.springframework.stereotype.Controller;

@Controller
public class FugaController {
    FugaService service;
    PiyoService piyoService;

    public FugaController(FugaService service) {
        this.service = service;
    }
}
