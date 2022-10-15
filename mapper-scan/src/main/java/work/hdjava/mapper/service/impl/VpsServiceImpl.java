package work.hdjava.mapper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import work.hdjava.mapper.dao.vps.VpsDao;
import work.hdjava.mapper.entity.Vps;
import work.hdjava.mapper.service.VpsService;
import org.springframework.stereotype.Service;

/**
 * (Vps)表服务实现类
 *
 * @author makejava
 * @since 2022-10-15 11:11:59
 */
@Service("vpsService")
public class VpsServiceImpl extends ServiceImpl<VpsDao, Vps> implements VpsService {

}

