package org.biukhanhhau.webapplyjob.repository;

import org.biukhanhhau.webapplyjob.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Inforrepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addInfor(Information information){
        String sql = "insert into information (username, birth, phone, email, address, field, note) values (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                            information.getUsername(),
                            information.getBirth(),
                            information.getPhone(),
                            information.getEmail(),
                            information.getAddress(),
                            information.getField(),
                            information.getNote());
    }
}
