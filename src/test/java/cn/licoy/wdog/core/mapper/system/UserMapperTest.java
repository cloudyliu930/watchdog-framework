package cn.licoy.wdog.core.mapper.system;

import cn.licoy.wdog.core.entity.system.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @author Licoy
 * @version 2018/4/20/16:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void test(){
        List<SysUser> list = sysUserMapper.list();
        System.out.println(list.toString());
    }

}