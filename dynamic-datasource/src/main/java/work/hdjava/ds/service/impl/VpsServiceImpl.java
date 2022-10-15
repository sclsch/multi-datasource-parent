package work.hdjava.ds.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import work.hdjava.ds.dao.VpsDao;
import work.hdjava.ds.entity.Vps;
import work.hdjava.ds.service.VpsService;

/**
 * (Vps)表服务实现类
 *
 * @author makejava
 * @since 2022-10-15 11:11:59
 */
@Service("vpsService")
public class VpsServiceImpl extends ServiceImpl<VpsDao, Vps> implements VpsService {

}

