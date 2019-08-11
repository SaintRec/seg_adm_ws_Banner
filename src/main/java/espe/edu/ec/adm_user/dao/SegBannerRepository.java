package espe.edu.ec.adm_user.dao;

import java.util.List;

import espe.edu.ec.adm_user.model.SegBanner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author kevin
 */
public interface SegBannerRepository extends CrudRepository<SegBanner, Long> {

    @Query(value = "SELECT * FROM siseac.SEG_BANNER order by USU_ID", nativeQuery = true)
    List<SegBanner> findallBanner();

    SegBanner findByusuCc(String usuCc);
}
