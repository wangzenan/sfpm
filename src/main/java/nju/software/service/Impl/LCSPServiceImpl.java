package nju.software.service.Impl;

import nju.software.service.LCSPService;
import java.sql.Date;

import org.springframework.stereotype.Service;

import nju.software.data.dao.LcspDAO;


@Service
public class LCSPServiceImpl implements LCSPService {

    public void updateLCSP(Integer xlh, Date sprq) {
        new LcspDAO().updateLCSP(xlh, sprq);
    }

}
