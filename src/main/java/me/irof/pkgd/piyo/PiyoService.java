package me.irof.pkgd.piyo;

import org.springframework.stereotype.Service;

@Service
public class PiyoService {
    PiyoRepository repository;

    public PiyoService(PiyoRepository repository) {
        this.repository = repository;
    }
}
