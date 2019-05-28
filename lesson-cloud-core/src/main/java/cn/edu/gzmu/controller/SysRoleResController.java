package cn.edu.gzmu.controller;

import cn.edu.gzmu.model.entity.SysRoleRes;
import cn.edu.gzmu.service.SysRoleResService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SysRoleRes Controller
 *
 * @author echo
 * @version 1.0
 * @date 2019-5-28 10:48:37
 */
@RequiredArgsConstructor
@RepositoryRestController
@RequestMapping("/sysRoleRes/search")
public class SysRoleResController extends BaseController<SysRoleRes, SysRoleResService, Long> {
    private final static String RESOURCE = "/sysRoleRes/search";

}
