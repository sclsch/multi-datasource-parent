package work.hdjava.dyn.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Vps)表实体类
 *
 * @author makejava
 * @since 2022-10-15 11:11:59
 */
@SuppressWarnings("serial")
public class Vps {

    private Long id;
    //内存
    private Integer mem;
    //VPS名称
    private String vpsName;
    //描述
    private String description;
    //数据中心
    private String dataCenter;
    //带宽
    private String broadBand;
    //虚拟技术
    private String virtualTech;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMem() {
        return mem;
    }

    public void setMem(Integer mem) {
        this.mem = mem;
    }

    public String getVpsName() {
        return vpsName;
    }

    public void setVpsName(String vpsName) {
        this.vpsName = vpsName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public String getBroadBand() {
        return broadBand;
    }

    public void setBroadBand(String broadBand) {
        this.broadBand = broadBand;
    }

    public String getVirtualTech() {
        return virtualTech;
    }

    public void setVirtualTech(String virtualTech) {
        this.virtualTech = virtualTech;
    }


}

