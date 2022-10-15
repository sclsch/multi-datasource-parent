package work.hdjava.mapper.controller;

import work.hdjava.mapper.dao.school.UniversityRankDao;
import work.hdjava.mapper.dao.vps.VpsDao;
import work.hdjava.mapper.entity.UniversityRank;
import work.hdjava.mapper.entity.Vps;
import work.hdjava.mapper.service.UniversityRankService;
import work.hdjava.mapper.service.VpsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
    public ResponseEntity selectAllVps() {
     //  DynamicDataSource.name.set("dataSource2");
     //   List<Vps> vps = vpsService.list();
        List<Vps> vps = vpsDao.selectAll();
        return ResponseEntity.ok(vps);
    }

    @GetMapping(value = "/selectAllRanks")
    public ResponseEntity selectAllRanks() {
    //    DynamicDataSource.name.set("dataSource1");
        //TODO 出现sql语法错误，字段命名是关键字，怎么解决？
        //List<UniversityRank> universityRanks = universityRankService.list();
        List<UniversityRank> universityRanks = universityRankDao.selectAll();
        return ResponseEntity.ok(universityRanks);
    }

}

