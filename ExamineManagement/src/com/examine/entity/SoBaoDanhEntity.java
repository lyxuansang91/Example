/**
 * 
 */
package com.examine.entity;


/**
 * @author sang
 *
 */
public class SoBaoDanhEntity {
	private String oSoBaoDanh;
	private String oMaThiSinh;
	private String oMaKhoa;
	/**
	 * 
	 */
	public SoBaoDanhEntity() {
	}
	/**
	 * @param oSoBaoDanh
	 * @param oMaThiSinh
	 * @param oMaKhoa
	 */
	public SoBaoDanhEntity(String oSoBaoDanh, String oMaThiSinh, String oMaKhoa) {
		this.oSoBaoDanh = oSoBaoDanh;
		this.oMaThiSinh = oMaThiSinh;
		this.oMaKhoa = oMaKhoa;
	}
	/**
	 * @return the oSoBaoDanh
	 */
	public String getSoBaoDanh() {
		return oSoBaoDanh;
	}
	/**
	 * @param oSoBaoDanh the oSoBaoDanh to set
	 */
	public void setSoBaoDanh(String oSoBaoDanh) {
		this.oSoBaoDanh = oSoBaoDanh;
	}
	/**
	 * @return the oMaThiSinh
	 */
	public String getMaThiSinh() {
		return oMaThiSinh;
	}
	/**
	 * @param oMaThiSinh the oMaThiSinh to set
	 */
	public void setMaThiSinh(String oMaThiSinh) {
		this.oMaThiSinh = oMaThiSinh;
	}
	/**
	 * @return the oMaKhoa
	 */
	public String getMaKhoa() {
		return oMaKhoa;
	}
	/**
	 * @param oMaKhoa the oMaKhoa to set
	 */
	public void setMaKhoa(String oMaKhoa) {
		this.oMaKhoa = oMaKhoa;
	}
	
}
