package nju.software.service.Impl;

import java.util.List;

import nju.software.data.dataobject.SfjdDwwt;
import nju.software.service.MainService;
import org.springframework.stereotype.Service;

//import nju.software.data.dataobject.Auction;
import nju.software.data.dao.MainDAO;

@Service
public class MainServiceImpl implements MainService {

    public List<SfjdDwwt> queryAll() {

        return new MainDAO().queryAll();


    }
    
    public void save(SfjdDwwt sfjdDwwt) {
       new  MainDAO().save(sfjdDwwt);
    }

    public List<SfjdDwwt> search(List<String> select1List, List<String> input2List, List<String> select2List) {
        return  new MainDAO().search(select1List,input2List,select2List);
    }




    

}
