package cn.edu.gzmu.controller;

import cn.edu.gzmu.model.entity.Essay;
import cn.edu.gzmu.service.EssayService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Essay Controller
 *
 * @author echo
 * @version 1.0
 * @date 2019-5-28 10:48:37
 */
@RequiredArgsConstructor
@RepositoryRestController
@RequestMapping("/essay/search")
public class EssayController extends BaseController<Essay, EssayService, Long> {
    private final static String RESOURCE = "/essay/search";

}
