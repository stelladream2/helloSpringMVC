package kr.ac.hansung.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.web.dao.Offer;
import kr.ac.hansung.web.dao.OfferDAO;

@Service("offersService")
public class OffersService {
	
	private OfferDAO offerDao;
	
	@Autowired
	public void setOffersDao(OfferDAO offersDao) {
		this.offerDao = offersDao;
	}

	public List<Offer> getCurrent() {
		return offerDao.getOffers();
	}
}
