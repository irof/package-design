package me.irof.pkgd;

import org.springframework.stereotype.Service;

@Service
public class FugaService {
    FugaRepository repository;

    public FugaService(FugaRepository repository) {
        this.repository = repository;
    }
}
