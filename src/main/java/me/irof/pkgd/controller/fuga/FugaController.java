package me.irof.pkgd.controller.fuga;

import me.irof.pkgd.service.fuga.FugaService;
import me.irof.pkgd.service.piyo.PiyoService;
import org.springframework.stereotype.Controller;

@Controller
public class FugaController {
    FugaService service;
    PiyoService piyoService;

    public FugaController(FugaService service) {
        this.service = service;
    }
}
