package cn.edu.gzmu.controller;

import cn.edu.gzmu.model.entity.Userconnection;
import cn.edu.gzmu.service.UserconnectionService;
import cn.edu.gzmu.controller.BaseController;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Userconnection Controller
 *
 * @author echo
 * @version 1.0
 * @date 2019-5-14 11:36:13
 */
@RepositoryRestController
@RequestMapping("/userconnections/search")
public class UserconnectionController extends BaseController<Userconnection, UserconnectionService, Long> {

}
