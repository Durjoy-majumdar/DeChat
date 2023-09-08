package com.tencent.midas.data;

public class APPluginDataInterface {
    public static final String LAUNCHPAY_INTERVAL_TIME = "launchpayintervaltime";
    public static final String LAUNCHPAY_TIME = "launchpaytime";
    public static final String LAUNCHPAY_UUID = "launchpayuuid";
    public static final String SHARE_PREFERENCE_NAME = "TencentUnipay";
    private static volatile APPluginDataInterface gInstance = new APPluginDataInterface();
    private String acctType = "";
    private boolean autoPay = true;
    private String discountType = "";
    private String discountUrl = "";
    private String discoutId = "";
    private String drmInfo = "";
    private String extras = "";
    private String goodsTokenUrl = "";
    private String h5Message = "";
    private String h5Url = "";
    private boolean isCanChange = true;
    private boolean isNumVisible = true;
    private boolean isShowListOtherNum = true;
    private boolean isShowNum = true;
    private String launchInterface = APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY;
    private boolean logEnable = true;
    private int mallType = 0;
    private String offerId = "";
    private String openId = "";
    private String openKey = "";
    private String payChannel = "";

    /* renamed from: pf */
    private String f343437pf = "";
    private String pfKey = "";
    private APMultiProcessData processData = null;
    private String prodcutId = "";
    private String propUnit = "";
    private String remark = "";
    private String reqType = "";
    private byte[] resData = null;
    private int resId = 0;
    private String resUrl = "";
    private String reserv = "";
    private int saveType = 0;
    private String saveValue = "";
    private String serviceCode = "";
    private String serviceName = "";
    private int serviceType = 0;
    private String sessionId = "";
    private String sessionType = "";
    private int tokenType = 0;
    private String unit = "";
    private String zoneId = "";

    private APPluginDataInterface() {
    }

    public static void init() {
        gInstance = new APPluginDataInterface();
    }

    public static APPluginDataInterface singleton() {
        if (gInstance == null) {
            synchronized (APPluginDataInterface.class) {
                if (gInstance == null) {
                    gInstance = new APPluginDataInterface();
                }
            }
        }
        return gInstance;
    }

    public String getAcctType() {
        return this.acctType;
    }

    public String getDiscountType() {
        return this.discountType;
    }

    public String getDiscountUrl() {
        return this.discountUrl;
    }

    public String getDiscoutId() {
        return this.discoutId;
    }

    public String getDrmInfo() {
        return this.drmInfo;
    }

    public String getExtras() {
        return this.extras;
    }

    public String getGoodsTokenUrl() {
        return this.goodsTokenUrl;
    }

    public String getH5Message() {
        return this.h5Message;
    }

    public String getH5Url() {
        return this.h5Url;
    }

    public String getLaunchInterface() {
        return this.launchInterface;
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
        return this.payChannel;
    }

    public String getPf() {
        return this.f343437pf;
    }

    public String getPfKey() {
        return this.pfKey;
    }

    public APMultiProcessData getProcessData() {
        return this.processData;
    }

    public String getProdcutId() {
        return this.prodcutId;
    }

    public String getPropUnit() {
        return this.propUnit;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getReqType() {
        return this.reqType;
    }

    public byte[] getResData() {
        return this.resData;
    }

    public int getResId() {
        return this.resId;
    }

    public String getResUrl() {
        return this.resUrl;
    }

    public String getReserv() {
        return this.reserv;
    }

    public int getSaveType() {
        return this.saveType;
    }

    public String getSaveValue() {
        return this.saveValue;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public int getServiceType() {
        return this.serviceType;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getSessionType() {
        return this.sessionType;
    }

    public int getTokenType() {
        return this.tokenType;
    }

    public String getUnit() {
        return this.unit;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public boolean isAutoPay() {
        return this.autoPay;
    }

    public boolean isCanChange() {
        return this.isCanChange;
    }

    public boolean isLogEnable() {
        return this.logEnable;
    }

    public boolean isNumVisible() {
        return this.isNumVisible;
    }

    public boolean isShowListOtherNum() {
        return this.isShowListOtherNum;
    }

    public boolean isShowNum() {
        return this.isShowNum;
    }

    public void setAcctType(String str) {
        this.acctType = str;
    }

    public void setAutoPay(boolean z) {
        this.autoPay = z;
    }

    public void setCanChange(boolean z) {
        this.isCanChange = z;
    }

    public void setDiscountType(String str) {
        this.discountType = str;
    }

    public void setDiscountUrl(String str) {
        this.discountUrl = str;
    }

    public void setDiscoutId(String str) {
        this.discoutId = str;
    }

    public void setDrmInfo(String str) {
        this.drmInfo = str;
    }

    public void setExtras(String str) {
        this.extras = str;
    }

    public void setGoodsTokenUrl(String str) {
        this.goodsTokenUrl = str;
    }

    public void setH5Message(String str) {
        gInstance.h5Message = str;
    }

    public void setH5Url(String str) {
        this.h5Url = str;
    }

    public void setLaunchInterface(String str) {
        this.launchInterface = str;
    }

    public void setLogEnable(boolean z) {
        this.logEnable = z;
    }

    public void setMallType(int i) {
        this.mallType = i;
    }

    public void setNumVisible(boolean z) {
        this.isNumVisible = z;
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
        this.payChannel = str;
    }

    public void setPf(String str) {
        this.f343437pf = str;
    }

    public void setPfKey(String str) {
        this.pfKey = str;
    }

    public void setProcessData(APMultiProcessData aPMultiProcessData) {
        this.processData = aPMultiProcessData;
    }

    public void setProdcutId(String str) {
        this.prodcutId = str;
    }

    public void setPropUnit(String str) {
        this.propUnit = str;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setReqType(String str) {
        this.reqType = str;
    }

    public void setResData(byte[] bArr) {
        this.resData = bArr;
    }

    public void setResId(int i) {
        this.resId = i;
    }

    public void setResUrl(String str) {
        this.resUrl = str;
    }

    public void setReserv(String str) {
        this.reserv = str;
    }

    public void setSaveType(int i) {
        this.saveType = i;
    }

    public void setSaveValue(String str) {
        this.saveValue = str;
    }

    public void setServiceCode(String str) {
        this.serviceCode = str;
    }

    public void setServiceName(String str) {
        this.serviceName = str;
    }

    public void setServiceType(int i) {
        this.serviceType = i;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setSessionType(String str) {
        this.sessionType = str;
    }

    public void setShowListOtherNum(boolean z) {
        this.isShowListOtherNum = z;
    }

    public void setShowNum(boolean z) {
        this.isShowNum = z;
    }

    public void setTokenType(int i) {
        this.tokenType = i;
    }

    public void setUnit(String str) {
        this.unit = str;
    }

    public void setZoneId(String str) {
        this.zoneId = str;
    }
}
