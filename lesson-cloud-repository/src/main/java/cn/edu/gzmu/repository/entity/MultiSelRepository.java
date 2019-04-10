package cn.edu.gzmu.repository.entity;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * multi_sel Repository
 *
 * @author echo
 * @version 1.0
 * @date 2019-4-10 14:11:03
 */
@RepositoryRestResource
public interface MultiSelRepository extends cn.edu.gzmu.repository.BaseRepository<cn.edu.gzmu.model.entity.MultiSel, Long> {
}