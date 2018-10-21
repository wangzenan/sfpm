package nju.software.service.Impl;

import nju.software.data.dataobject.SfjdDwwt;
import nju.software.service.LiAnService;
import org.springframework.stereotype.Service;

import nju.software.data.dao.LiAnDAO;

//注解为一个服务
@Service
public class LiAnServiceImpl implements LiAnService {

    public void liAn(SfjdDwwt sfjdDwwt) {
        new LiAnDAO().liAn(sfjdDwwt);


    }

    public void tuiAn(SfjdDwwt sfjdDwwt) {
        new LiAnDAO().tuiAn(sfjdDwwt);
    }

    public void save(SfjdDwwt sfjdDwwt) {
        SfjdDwwt before=new LiAnDAO().getMaxXlhDwwt();
        sfjdDwwt.setXlh(before.getXlh()+1);
        new LiAnDAO().insert(sfjdDwwt);
    }
    
    public void delete(Integer XLH) {
        new LiAnDAO().delete(XLH);
    }
    
    public SfjdDwwt queryById(Integer id) {
        return new LiAnDAO().queryById(id);
    }

}
