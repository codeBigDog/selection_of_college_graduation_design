package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.checkPassword;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersLandingTable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName ManagerCheckPassword.java
 * @Description TODO
 * @createTime 2020年01月11日 17:16:00
 */
@ApiModel(value = "管理员密码校验实体")
public class ManagerCheckPassword {

    @ApiModelProperty(value = "数据库中的信息实体")
    private ManagersLandingTable DBManagersLandingTable;

    @ApiModelProperty(value = "用户输入的信息实体")
    private ManagersLandingTable yourManagersLandingTable;

    public ManagerCheckPassword() {
    }

    public ManagerCheckPassword(ManagersLandingTable DBManagersLandingTable, ManagersLandingTable yourManagersLandingTable) {
        this.DBManagersLandingTable = DBManagersLandingTable;
        this.yourManagersLandingTable = yourManagersLandingTable;
    }

    public ManagersLandingTable getDBManagersLandingTable() {
        return DBManagersLandingTable;
    }

    public void setDBManagersLandingTable(ManagersLandingTable DBManagersLandingTable) {
        this.DBManagersLandingTable = DBManagersLandingTable;
    }

    public ManagersLandingTable getYourManagersLandingTable() {
        return yourManagersLandingTable;
    }

    public void setYourManagersLandingTable(ManagersLandingTable yourManagersLandingTable) {
        this.yourManagersLandingTable = yourManagersLandingTable;
    }

    public int check() {
        int returnKey = -1;
        String passwordValue1 = this.getDBManagersLandingTable().getPasswordvalue() + "";
        String passwordValue2 = this.getYourManagersLandingTable().getPasswordvalue() + "";
        passwordValue1 = passwordValue1.trim();
        passwordValue1 = passwordValue1.replaceFirst(" ", "");
        passwordValue2 = passwordValue2.trim();
        passwordValue2 = passwordValue2.replaceFirst(" ", "");
        if (passwordValue1.equals(passwordValue2)) {
            returnKey = 1;
        } else {
            returnKey = 0;
        }
        return returnKey;
    }

    @Override
    public String toString() {
        return "ManagerCheckPassword{" +
                "DBManagersLandingTable=" + DBManagersLandingTable +
                ", yourManagersLandingTable=" + yourManagersLandingTable +
                '}';
    }
}
