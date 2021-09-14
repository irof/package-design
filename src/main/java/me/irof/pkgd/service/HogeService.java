package me.irof.pkgd.service;

import me.irof.pkgd.repository.HogeRepository;
import org.springframework.stereotype.Service;

@Service
public class HogeService {

    HogeRepository repository;

    public HogeService(HogeRepository repository) {
        this.repository = repository;
    }
}
