package com.entity.model;

import com.entity.JingdianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 景点信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-03 18:46:28
 */
public class JingdianxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景点名称
	 */
	
	private String jingdianmingcheng;
		
	/**
	 * 景点分类
	 */
	
	private String jingdianfenlei;
		
	/**
	 * 等级
	 */
	
	private String dengji;
		
	/**
	 * 景点图片
	 */
	
	private String jingdiantupian;
		
	/**
	 * 门票
	 */
	
	private Integer menpiao;
		
	/**
	 * 开放时间
	 */
	
	private String kaifangshijian;
		
	/**
	 * 服务电话
	 */
	
	private String fuwudianhua;
		
	/**
	 * 详细地址
	 */
	
	private String xiangxidizhi;
		
	/**
	 * 当地是否有疫情
	 */
	
	private String dangdishifouyouyiqing;
		
	/**
	 * 景点介绍
	 */
	
	private String jingdianjieshao;
				
	
	/**
	 * 设置：景点名称
	 */
	 
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	
	/**
	 * 获取：景点名称
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
				
	
	/**
	 * 设置：景点分类
	 */
	 
	public void setJingdianfenlei(String jingdianfenlei) {
		this.jingdianfenlei = jingdianfenlei;
	}
	
	/**
	 * 获取：景点分类
	 */
	public String getJingdianfenlei() {
		return jingdianfenlei;
	}
				
	
	/**
	 * 设置：等级
	 */
	 
	public void setDengji(String dengji) {
		this.dengji = dengji;
	}
	
	/**
	 * 获取：等级
	 */
	public String getDengji() {
		return dengji;
	}
				
	
	/**
	 * 设置：景点图片
	 */
	 
	public void setJingdiantupian(String jingdiantupian) {
		this.jingdiantupian = jingdiantupian;
	}
	
	/**
	 * 获取：景点图片
	 */
	public String getJingdiantupian() {
		return jingdiantupian;
	}
				
	
	/**
	 * 设置：门票
	 */
	 
	public void setMenpiao(Integer menpiao) {
		this.menpiao = menpiao;
	}
	
	/**
	 * 获取：门票
	 */
	public Integer getMenpiao() {
		return menpiao;
	}
				
	
	/**
	 * 设置：开放时间
	 */
	 
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
				
	
	/**
	 * 设置：服务电话
	 */
	 
	public void setFuwudianhua(String fuwudianhua) {
		this.fuwudianhua = fuwudianhua;
	}
	
	/**
	 * 获取：服务电话
	 */
	public String getFuwudianhua() {
		return fuwudianhua;
	}
				
	
	/**
	 * 设置：详细地址
	 */
	 
	public void setXiangxidizhi(String xiangxidizhi) {
		this.xiangxidizhi = xiangxidizhi;
	}
	
	/**
	 * 获取：详细地址
	 */
	public String getXiangxidizhi() {
		return xiangxidizhi;
	}
				
	
	/**
	 * 设置：当地是否有疫情
	 */
	 
	public void setDangdishifouyouyiqing(String dangdishifouyouyiqing) {
		this.dangdishifouyouyiqing = dangdishifouyouyiqing;
	}
	
	/**
	 * 获取：当地是否有疫情
	 */
	public String getDangdishifouyouyiqing() {
		return dangdishifouyouyiqing;
	}
				
	
	/**
	 * 设置：景点介绍
	 */
	 
	public void setJingdianjieshao(String jingdianjieshao) {
		this.jingdianjieshao = jingdianjieshao;
	}
	
	/**
	 * 获取：景点介绍
	 */
	public String getJingdianjieshao() {
		return jingdianjieshao;
	}
			
}
