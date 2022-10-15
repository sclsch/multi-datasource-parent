package work.hdjava.dyn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import work.hdjava.dyn.dao.UniversityRankDao;
import work.hdjava.dyn.entity.UniversityRank;
import work.hdjava.dyn.service.UniversityRankService;
import org.springframework.stereotype.Service;

/**
 * (UniversityRank)表服务实现类
 *
 * @author makejava
 * @since 2022-10-15 11:29:41
 */
@Service("universityRankService")
public class UniversityRankServiceImpl extends ServiceImpl<UniversityRankDao, UniversityRank> implements UniversityRankService {

}

