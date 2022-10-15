package work.hdjava.dyn.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * (UniversityRank)表实体类
 *
 * @author makejava
 * @since 2022-10-15 11:27:38
 */
@SuppressWarnings("serial")
public class UniversityRank  {
    //自增主键
    private Integer id;
    //地区
    private String area;
    //类型
    private String type;
    //得分
    private String score;
    //专业
    private String majar;
    //年度
    private String year;
    //名次
    private Integer rank;
    //学校名称
    private String school;
    //入库时间
    private Date opDate;
    //冗余1
    private String extr1;
    //冗余1
    private String extr2;
    //冗余1
    private String extr3;
    //冗余1
    private String extr4;
    //冗余1
    private String extr5;
    //冗余1
    private String extr6;
    //冗余1
    private String extr7;
    //冗余1
    private String extr8;
    //冗余1
    private String extr9;
    //冗余1
    private String extr10;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getMajar() {
        return majar;
    }

    public void setMajar(String majar) {
        this.majar = majar;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    public String getExtr1() {
        return extr1;
    }

    public void setExtr1(String extr1) {
        this.extr1 = extr1;
    }

    public String getExtr2() {
        return extr2;
    }

    public void setExtr2(String extr2) {
        this.extr2 = extr2;
    }

    public String getExtr3() {
        return extr3;
    }

    public void setExtr3(String extr3) {
        this.extr3 = extr3;
    }

    public String getExtr4() {
        return extr4;
    }

    public void setExtr4(String extr4) {
        this.extr4 = extr4;
    }

    public String getExtr5() {
        return extr5;
    }

    public void setExtr5(String extr5) {
        this.extr5 = extr5;
    }

    public String getExtr6() {
        return extr6;
    }

    public void setExtr6(String extr6) {
        this.extr6 = extr6;
    }

    public String getExtr7() {
        return extr7;
    }

    public void setExtr7(String extr7) {
        this.extr7 = extr7;
    }

    public String getExtr8() {
        return extr8;
    }

    public void setExtr8(String extr8) {
        this.extr8 = extr8;
    }

    public String getExtr9() {
        return extr9;
    }

    public void setExtr9(String extr9) {
        this.extr9 = extr9;
    }

    public String getExtr10() {
        return extr10;
    }

    public void setExtr10(String extr10) {
        this.extr10 = extr10;
    }


}

