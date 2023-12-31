package com.tencent.midas.api.request;

import java.io.Serializable;

public abstract class APMidasBaseRequest implements Serializable {
    public static final int MALL_TYPE_DEFAULT = 0;
    public static final int MALL_TYPE_GROUPBUY = 1;
    public static final int MALL_TYPE_VMALL = 2;
    private static final long serialVersionUID = -9123623786877679280L;
    public String acctType = "common";
    public APMidasExtendInfo extendInfo = new APMidasExtendInfo();
    public String h5Url = "";
    public boolean isCanChange = true;
    public int mallType = 0;
    public APMidasMPInfo mpInfo = new APMidasMPInfo();
    public String offerId = "";
    public String openId = "";
    public String openKey = "";

    /* renamed from: pf */
    public String f343435pf = "";
    public String pfKey = "";
    public String remark = "";
    public byte[] resData;
    public int resId = 0;
    public String reserv;
    public String saveValue = "";
    public String sessionId = "";
    public String sessionType = "";
    public String zoneId = "";

    public class APMidasExtendInfo implements Serializable {
        private static final long serialVersionUID = -5387967973327966068L;
        public boolean isShowListOtherNum = true;
        public boolean isShowNum = true;
        public String unit = "";

        public APMidasExtendInfo() {
        }
    }

    public class APMidasMPInfo implements Serializable {
        private static final long serialVersionUID = 631101753621041424L;
        public String discountType = "";
        public String discountUrl = "";
        public String discoutId = "";
        public String drmInfo = "";
        public String extras = "";
        public String payChannel = "";

        public APMidasMPInfo() {
        }
    }

    public String getAcctType() {
        return this.acctType;
    }

    public String getDiscountType() {
        return this.mpInfo.discountType;
    }

    public String getDiscountUrl() {
        return this.mpInfo.discountUrl;
    }

    public String getDiscoutId() {
        return this.mpInfo.discoutId;
    }

    public String getDrmInfo() {
        return this.mpInfo.drmInfo;
    }

    public String getExtras() {
        return this.mpInfo.extras;
    }

    public String getH5Url() {
        return this.h5Url;
    }

    public boolean getIsCanChange() {
        return this.isCanChange;
    }

    public int getMallType() {
        return this.mallType;
    }

    public String getOfferId() {
        return this.offerId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public String getOpenKey() {
        return this.openKey;
    }

    public String getPayChannel() {
        return this.mpInfo.payChannel;
    }

    public String getPf() {
        return this.f343435pf;
    }

    public String getPfKey() {
        return this.pfKey;
    }

    public String getRemark() {
        return this.remark;
    }

    public byte[] getResData() {
        return this.resData;
    }

    public int getResId() {
        return this.resId;
    }

    public String getReserv() {
        return this.reserv;
    }

    public String getSaveValue() {
        return this.saveValue;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getSessionType() {
        return this.sessionType;
    }

    public boolean getShowListOtherNum() {
        return this.extendInfo.isShowListOtherNum;
    }

    public boolean getShowNum() {
        return this.extendInfo.isShowNum;
    }

    public String getUnit() {
        return this.extendInfo.unit;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setAcctType(String str) {
        this.acctType = str;
    }

    public void setDiscountType(String str) {
        this.mpInfo.discountType = str;
    }

    public void setDiscountUrl(String str) {
        this.mpInfo.discountUrl = str;
    }

    public void setDiscoutId(String str) {
        this.mpInfo.discoutId = str;
    }

    public void setDrmInfo(String str) {
        this.mpInfo.drmInfo = str;
    }

    public void setExtras(String str) {
        this.mpInfo.extras = str;
    }

    public void setH5Url(String str) {
        this.h5Url = str;
    }

    public void setIsCanChange(boolean z) {
        this.isCanChange = z;
    }

    public void setMallType(int i) {
        this.mallType = i;
    }

    public void setOfferId(String str) {
        this.offerId = str;
    }

    public void setOpenId(String str) {
        this.openId = str;
    }

    public void setOpenKey(String str) {
        this.openKey = str;
    }

    public void setPayChannel(String str) {
        this.mpInfo.payChannel = str;
    }

    public void setPf(String str) {
        this.f343435pf = str;
    }

    public void setPfKey(String str) {
        this.pfKey = str;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setResData(byte[] bArr) {
        this.resData = bArr;
    }

    public void setResId(int i) {
        this.resId = i;
    }

    public void setReserv(String str) {
        this.reserv = str;
    }

    public void setSaveValue(String str) {
        this.saveValue = str;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setSessionType(String str) {
        this.sessionType = str;
    }

    public void setShowListOtherNum(boolean z) {
        this.extendInfo.isShowListOtherNum = z;
    }

    public void setShowNum(boolean z) {
        this.extendInfo.isShowNum = z;
    }

    public void setUnit(String str) {
        this.extendInfo.unit = str;
    }

    public void setZoneId(String str) {
        this.zoneId = str;
    }
}
