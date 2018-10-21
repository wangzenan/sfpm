package nju.software.service.Impl;

import nju.software.data.dao.LctxDAO;
import nju.software.data.dataobject.PubLctxb;
import nju.software.service.LctxService;
import org.springframework.stereotype.Service;

@Service
public class LctxServiceImpl implements LctxService {

    public void AddLctx(PubLctxb lctx) {
        new LctxDAO().insert(lctx);
    }
}
