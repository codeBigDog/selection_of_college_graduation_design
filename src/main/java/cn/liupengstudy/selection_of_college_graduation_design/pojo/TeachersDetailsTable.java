package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "教师详细信息")
public class TeachersDetailsTable {

    @ApiModelProperty(value = "自增ID")
    private Integer id;

    @ApiModelProperty(value = "教师编号")
    private String teacherid;

    @ApiModelProperty(value = "联系方式")
    private String phonenumber;

    @ApiModelProperty(value = "姓名")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "TeachersDetailsTable{" +
                "id=" + id +
                ", teacherid='" + teacherid + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}