package me.irof.pkgd.service;

import me.irof.pkgd.repository.PiyoRepository;
import org.springframework.stereotype.Service;

@Service
public class PiyoService {
    PiyoRepository repository;

    public PiyoService(PiyoRepository repository) {
        this.repository = repository;
    }
}
