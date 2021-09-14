package me.irof.pkgd.service.hoge;

import me.irof.pkgd.repository.hoge.HogeRepository;
import org.springframework.stereotype.Service;

@Service
public class HogeService {

    HogeRepository repository;

    public HogeService(HogeRepository repository) {
        this.repository = repository;
    }
}
