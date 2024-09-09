package project_directory_temp.rest.repository;

import com.jbproject.jutopia.rest.entity.InitEntity;
import com.jbproject.jutopia.rest.repository.custom.InitRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InitRepositoryInterface extends JpaRepository<InitEntity, Long>, InitRepositoryCustom {
}