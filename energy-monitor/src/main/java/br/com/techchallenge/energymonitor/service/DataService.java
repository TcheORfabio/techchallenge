package br.com.techchallenge.energymonitor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DataService {
    
    public void saveData(DataRequest<T extends Dto> request) {
        log.info(request.getData());
    }
}
