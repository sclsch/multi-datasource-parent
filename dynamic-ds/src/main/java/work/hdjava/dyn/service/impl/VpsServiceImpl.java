package work.hdjava.dyn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import work.hdjava.dyn.dao.VpsDao;
import work.hdjava.dyn.entity.Vps;
import work.hdjava.dyn.service.VpsService;
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

