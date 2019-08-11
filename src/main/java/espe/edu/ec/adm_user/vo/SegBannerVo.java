package espe.edu.ec.adm_user.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import espe.edu.ec.adm_user.dao.SegBannerRepository;
import espe.edu.ec.adm_user.model.SegBanner;

/**
 *
 * @author kevin
 */
@Service
public class SegBannerVo {

    @Autowired
    private SegBannerRepository bannerRep;

    public List<SegBanner> listBanner() {
        Iterable<SegBanner> sistemas = bannerRep.findallBanner();
        List<SegBanner> list = new ArrayList<SegBanner>();
        sistemas.forEach(list::add);
        return list;
    }

    public Optional<SegBanner> getban(Long usuId) {
        return bannerRep.findById(usuId);
    }
}
