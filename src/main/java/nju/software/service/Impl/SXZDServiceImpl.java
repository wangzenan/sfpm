package nju.software.service.Impl;

import nju.software.data.dao.SxzdDAO;
import nju.software.data.dataobject.PubSlSxzd;
import nju.software.service.SXZDService;
import org.springframework.stereotype.Service;

@Service
public class SXZDServiceImpl implements SXZDService {


    public void insertSxzd(PubSlSxzd sxzd) {
      //  PubSlSxzd before=new SxzdDAO().getMaxZdbhOfSxzdByAjxh(sxzd.getPubSlSxzdPK().getAjxh());

     //   sxzd.getPubSlSxzdPK().setZdbh(before.getPubSlSxzdPK().getZdbh()+1);
        PubSlSxzd before=new SxzdDAO().getMaxZdbhOfSxzdByAjxh(sxzd.getAjxh());
        sxzd.setZdbh(before.getZdbh()+1);
        new SxzdDAO().insert(sxzd);
    }

    public  void updateSxzd(PubSlSxzd sxzd){
        new SxzdDAO().updateSxzd(sxzd);
    }

    public PubSlSxzd getSxzdOfSfpm(int ajxh){
        return new SxzdDAO().getSxzdOfSfpmByAjxh(ajxh);
    }


}
