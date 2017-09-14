package com.rs.service;

import java.util.List;

import com.rs.model.Download;

public interface DownloadService {

	public List<Download> seletctList();

	public List<Download> seletctByStrategyid(String strategy_id);

	public List<Download> seletctByTime(String beginTime, String endTime);

	public int insert(Download download);

}
