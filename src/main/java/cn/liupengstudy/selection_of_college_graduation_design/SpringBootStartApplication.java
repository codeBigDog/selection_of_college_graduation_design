package cn.liupengstudy.selection_of_college_graduation_design;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/20 - 7:54 下午
 * @修改人和其它信息
 */

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(SelectionOfCollegeGraduationDesignApplication.class);
    }
}
