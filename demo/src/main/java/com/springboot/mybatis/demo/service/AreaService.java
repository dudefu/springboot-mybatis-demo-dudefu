package com.springboot.mybatis.demo.service;

import java.util.List;

import com.springboot.mybatis.demo.entity.Area;

public interface AreaService {

	/**
	 * 获取区域列表
	 * 
	 * @return
	 */
	List<Area> getAreaList();

	/**
	 * 通过区域Id获取区域信息
	 * 
	 * @param areaId
	 * @return
	 */
	Area getAreaById(int areaId);

	/**
	 * 增加区域信息
	 * 
	 * @param area
	 * @return
	 */
	boolean addArea(Area area);

	/**
	 * 修改区域信息
	 * 
	 * @param area
	 * @return
	 */
	boolean modifyArea(Area area);

	/**
	 * 删除区域信息
	 * 
	 * @param area
	 * @return
	 */
	boolean deleteArea(int areaId);

}
