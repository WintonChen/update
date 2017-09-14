package com.rs.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.dao.DownloadDao;
import com.rs.model.Download;
import com.rs.service.DownloadService;

@Service
public class DownloadServiceImpl implements DownloadService{

	private  Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private DownloadDao downloadDao;
	
	@Override
	public List<Download> seletctList() {
		return downloadDao.selectList();
	}

	@Override
	public List<Download> seletctByStrategyid(String strategy_id) {
		return downloadDao.seletctByStrategyid(strategy_id);
	}

	@Override
	public List<Download> seletctByTime(String beginTime, String endTime) {
		return downloadDao.seletctByTime(beginTime, endTime);
	}

	@Override
	public int insert(Download download) {
		return downloadDao.insert(download);
	}

}
