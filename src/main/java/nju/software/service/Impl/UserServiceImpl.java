package nju.software.service.Impl;

import nju.software.service.UserService;
import org.springframework.stereotype.Service;

import nju.software.data.dataobject.UserForm;
//ע��Ϊһ������
@Service
public class UserServiceImpl implements UserService {
    public boolean login(UserForm user) {
        if("1".equals(user.getUsername()) 
                && "1".equals(user.getPassword()))
            return true;
        return false;
    }
}
