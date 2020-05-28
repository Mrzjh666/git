package hotel.com.jd.service.Impl;

import hotel.com.jd.domain.Manager;
import hotel.com.jd.mapper.ManagerMapper;
import hotel.com.jd.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;

public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerMapper managerMapper;
    @Override
    public Manager login(String loginName, String password) {

        return managerMapper.findManager(loginName,password);

    }
}
