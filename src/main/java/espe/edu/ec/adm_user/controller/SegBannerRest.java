package espe.edu.ec.adm_user.controller;

import espe.edu.ec.adm_user.dao.SegBannerRepository;
import espe.edu.ec.adm_user.model.SegBanner;
import espe.edu.ec.adm_user.vo.SegBannerVo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kevin
 */
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/adm")
public class SegBannerRest {

 @Autowired
 private SegBannerVo bannerVo;

 @Autowired
 private SegBannerRepository bannerRep;

 @RequestMapping(value = "/banner", method = RequestMethod.GET)
 public ResponseEntity<SegBanner> listdemo() {
  List<SegBanner> banner = bannerVo.listBanner();
  return new ResponseEntity(banner, HttpStatus.OK);
 }

 @RequestMapping(value = "/banner/{id}", method = RequestMethod.GET)
 public ResponseEntity<SegBanner> banById(@PathVariable String id) {
  SegBanner baner = bannerRep.findByusuCc(id);
  return new ResponseEntity(baner, HttpStatus.OK);
 }
}
