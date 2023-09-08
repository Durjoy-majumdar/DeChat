package com.pay.network.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.pay.http.APBaseHttpAns;
import com.pay.http.APBaseHttpReq;
import com.pay.http.APHttpHandle;
import com.pay.http.IAPHttpAnsObserver;
import com.pay.tool.APProductItem;
import com.tencent.midas.comm.APLog;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class APMpAns extends APBaseHttpAns {
    private String beginTime = "";
    private String endTime = "";
    private String firstsave_present_count = "";
    private List<APProductItem> mGoodsList = new ArrayList();
    private String mpJson = "";
    private List<String> mpList = new ArrayList();
    private List<String> mpPresentList = new ArrayList();
    private List<String> mpValueList = new ArrayList();
    private String rate = "";

    public APMpAns(APHttpHandle aPHttpHandle, IAPHttpAnsObserver iAPHttpAnsObserver, HashMap<String, APBaseHttpReq> hashMap, String str) {
        super(aPHttpHandle, iAPHttpAnsObserver, hashMap, str);
    }

    public String getBeginTime() {
        return this.beginTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getFirstsave_present_count() {
        return this.firstsave_present_count;
    }

    public String getMpJson() {
        return this.mpJson;
    }

    public List<String> getMpList() {
        return this.mpList;
    }

    public List<String> getMpPresentList() {
        return this.mpPresentList;
    }

    public List<String> getMpValueList() {
        return this.mpValueList;
    }

    public List<APProductItem> getProductList() {
        return this.mGoodsList;
    }

    public String getRate() {
        return this.rate;
    }

    public void onErrorAns(APBaseHttpReq aPBaseHttpReq) {
    }

    public void onFinishAns(byte[] bArr, APBaseHttpReq aPBaseHttpReq) {
        super.onFinishAns(bArr, aPBaseHttpReq);
        String str = new String(bArr);
        this.mpJson = str;
        APLog.m161214i("APMpAns", "resultData=" + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int parseInt = Integer.parseInt(jSONObject.getString("ret").toString());
            this.resultCode = parseInt;
            if (parseInt == 0) {
                if (jSONObject.has("product_list")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("product_list");
                    this.mGoodsList.clear();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        APProductItem aPProductItem = new APProductItem();
                        try {
                            aPProductItem.name = jSONObject2.getString("name");
                            aPProductItem.productId = jSONObject2.getString("productid");
                            aPProductItem.price = jSONObject2.getString(FirebaseAnalytics.C113379b.PRICE);
                            aPProductItem.num = jSONObject2.getString("num");
                            this.mGoodsList.add(aPProductItem);
                        } catch (Exception unused) {
                        }
                    }
                }
                this.rate = jSONObject.getString(TPReportKeys.Common.COMMON_MEDIA_RATE);
                APCommMethod.transformStrToList(jSONObject.getString("list"), this.mpList);
                this.firstsave_present_count = jSONObject.getString("firstsave_present_count");
                APCommMethod.transformStrToMpInfoList(jSONObject.getString("present_level"), this.mpValueList, this.mpPresentList);
                this.beginTime = jSONObject.getString("begin_time");
                this.endTime = jSONObject.getString("end_time");
                return;
            }
            this.resultMsg = jSONObject.getString("msg");
            String str2 = jSONObject.getString("err_code").toString();
            if (!str2.equals("")) {
                this.resultMsg = "系统繁忙,请稍后再试\n(" + str2 + ")";
            }
        } catch (Exception unused2) {
        }
    }

    public void onReceiveAns(byte[] bArr, int i, long j, APBaseHttpReq aPBaseHttpReq) {
    }

    public void onStartAns(APBaseHttpReq aPBaseHttpReq) {
    }

    public void onStopAns(APBaseHttpReq aPBaseHttpReq) {
    }

    public void setBeginTime(String str) {
        this.beginTime = str;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setFirstsave_present_count(String str) {
        this.firstsave_present_count = str;
    }

    public void setMpList(List<String> list) {
        this.mpList = list;
    }

    public void setMpPresentList(List<String> list) {
        this.mpPresentList = list;
    }

    public void setMpValueList(List<String> list) {
        this.mpValueList = list;
    }

    public void setRate(String str) {
        this.rate = str;
    }
}
