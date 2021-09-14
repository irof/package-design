package me.irof.pkgd.service;

import me.irof.pkgd.repository.FugaRepository;
import org.springframework.stereotype.Service;

@Service
public class FugaService {
    FugaRepository repository;

    public FugaService(FugaRepository repository) {
        this.repository = repository;
    }
}
