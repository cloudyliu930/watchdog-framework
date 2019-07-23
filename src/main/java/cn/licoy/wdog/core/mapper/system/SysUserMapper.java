package cn.licoy.wdog.core.mapper.system;

import cn.licoy.wdog.core.entity.system.SysUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> list();

}
