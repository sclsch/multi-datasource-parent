package work.hdjava.ds.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import work.hdjava.ds.dao.UniversityRankDao;
import work.hdjava.ds.entity.UniversityRank;
import work.hdjava.ds.service.UniversityRankService;

/**
 * (UniversityRank)表服务实现类
 *
 * @author makejava
 * @since 2022-10-15 11:29:41
 */
@Service("universityRankService")
public class UniversityRankServiceImpl extends ServiceImpl<UniversityRankDao, UniversityRank> implements UniversityRankService {

}

