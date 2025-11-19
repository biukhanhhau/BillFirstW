package org.biukhanhhau.webapplyjob.service;

import org.biukhanhhau.webapplyjob.Information;
import org.biukhanhhau.webapplyjob.repository.Inforrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service
public class InforService {

    @Autowired
    Inforrepo repo;

    public void addInformation(@ModelAttribute Information information){
        // Hàm save() sẽ tự động insert vào DB
        // Và nó tự xử lý luôn việc ID tự tăng (auto increment)
        repo.addInfor(information);
    }
}