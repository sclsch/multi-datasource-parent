package work.hdjava.dyn.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.http.ResponseEntity;
import work.hdjava.dyn.annotation.DS;
import work.hdjava.dyn.config.DynamicDataSource;
import work.hdjava.dyn.dao.UniversityRankDao;
import work.hdjava.dyn.dao.VpsDao;
import work.hdjava.dyn.entity.UniversityRank;
import work.hdjava.dyn.entity.Vps;
import work.hdjava.dyn.service.UniversityRankService;
import work.hdjava.dyn.service.VpsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Vps)表控制层
 *
 * @author makejava
 * @since 2022-10-15 11:11:59
 */
@RestController
public class DynaController {
    /**
     * 服务对象
     */
    @Resource
    private VpsDao vpsDao;

    @Resource
    private UniversityRankDao universityRankDao;

    @Resource
    private VpsService vpsService;
    @Resource
    private UniversityRankService universityRankService;

    /**
     *  询所有数据
     * @return 所有数据
     */
    @GetMapping(value = "/selectAllVps")
    @DS("dataSource2")
    public ResponseEntity selectAllVps() {
     //  DynamicDataSource.name.set("dataSource2");
     //   List<Vps> vps = vpsService.list();
        List<Vps> vps = vpsDao.selectAll();
        return ResponseEntity.ok(vps);
    }

    @GetMapping(value = "/selectAllRanks")
    @DS("dataSource1")
    public ResponseEntity selectAllRanks() {
    //    DynamicDataSource.name.set("dataSource1");
        //TODO 出现sql语法错误，字段命名是关键字，怎么解决？
        //List<UniversityRank> universityRanks = universityRankService.list();
        List<UniversityRank> universityRanks = universityRankDao.selectAll();
        return ResponseEntity.ok(universityRanks);
    }

}

