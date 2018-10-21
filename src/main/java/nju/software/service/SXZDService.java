package nju.software.service;

import nju.software.data.dataobject.PubSlSxzd;

public interface SXZDService {
    void insertSxzd(PubSlSxzd sxzd);
    void updateSxzd(PubSlSxzd sxzd);
    PubSlSxzd getSxzdOfSfpm(int ajxh);
}
