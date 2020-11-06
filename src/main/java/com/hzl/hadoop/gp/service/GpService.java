package com.hzl.hadoop.gp.service;

import com.hzl.hadoop.gp.vo.GpVO;
import com.hzl.hadoop.gp.vo.VolumeVO;

import java.util.List;

/**
 * description
 *
 * @author hzl 2020/10/31 5:09 PM
 */
public interface GpService {
	/**
	 * 插入股票数据
	 *
	 * @return
	 * @author hzl 2020-11-04 9:45 AM
	 */
	GpVO insert(String code);

	/**
	 * 收盘成交价波动
	 *
	 * @return
	 * @author hzl 2020-11-04 9:45 AM
	 */
	List<VolumeVO> queryVolume(VolumeVO volumeVO);
}
