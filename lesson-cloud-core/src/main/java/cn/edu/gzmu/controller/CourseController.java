package cn.edu.gzmu.controller;

import cn.edu.gzmu.model.entity.Course;
import cn.edu.gzmu.service.CourseService;
import cn.edu.gzmu.controller.BaseController;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Course Controller
 *
 * @author echo
 * @version 1.0
 * @date 2019-5-20 9:18:57
 */
@RepositoryRestController
@RequestMapping("/courses/search")
public class CourseController extends BaseController<Course, CourseService, Long> {

}
