package me.irof.pkgd.hoge.service;

import me.irof.pkgd.hoge.repository.HogeRepository;
import org.springframework.stereotype.Service;

@Service
public class HogeService {

    HogeRepository repository;

    public HogeService(HogeRepository repository) {
        this.repository = repository;
    }
}
