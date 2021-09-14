package me.irof.pkgd.fuga;

import org.springframework.stereotype.Service;

@Service
public class FugaService {
    FugaRepository repository;

    public FugaService(FugaRepository repository) {
        this.repository = repository;
    }
}
