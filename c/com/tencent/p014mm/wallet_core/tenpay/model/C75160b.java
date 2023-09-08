package com.tencent.p014mm.wallet_core.tenpay.model;

import com.tencent.p014mm.wallet_core.model.C75120i;
import com.tencent.p014mm.wallet_core.tenpay.model.ITenpaySave;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.wallet_core.tenpay.model.b */
public abstract class C75160b extends C75790l implements C75159a {
    private static final String TAG = "MicroMsg.NetSceneTenpayRetriableBase";
    private boolean can_pay_retry2;
    private int errCode = 0;
    private String errMsg = "";
    private boolean hasCGiRetried = false;
    private boolean hasRetried = false;
    public boolean isPaySuccess = false;
    private ITenpaySave.RetryPayInfo retryPayInfo;
    private boolean shouldRetr = false;

    public boolean canPayRetry() {
        return this.can_pay_retry2;
    }

    public boolean canRetry() {
        return false;
    }

    public boolean checkPaySuccess() {
        return this.isPaySuccess;
    }

    public void configRequest(boolean z, boolean z2) {
        super.configRequest(z, z2);
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public boolean getHasRetried() {
        return this.hasRetried;
    }

    public ITenpaySave.RetryPayInfo getRetryPayInfo() {
        return this.retryPayInfo;
    }

    public boolean isShouldRetr() {
        return this.shouldRetr;
    }

    public boolean ishasCGiRetried() {
        return this.hasCGiRetried;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        this.errCode = i;
        this.errMsg = str;
    }

    public void onGYNetEnd2(C75120i iVar, JSONObject jSONObject) {
        super.onGYNetEnd2(iVar, jSONObject);
        boolean z = false;
        if (jSONObject != null && jSONObject.optInt("can_pay_retry") == 1) {
            z = true;
        }
        this.can_pay_retry2 = z;
        ITenpaySave.RetryPayInfo retryPayInfo2 = new ITenpaySave.RetryPayInfo();
        this.retryPayInfo = retryPayInfo2;
        retryPayInfo2.mo104873a(jSONObject);
    }

    public void resetForRetry() {
        reset();
        this.hasCGiRetried = true;
        this.isFake = false;
    }

    public void setErrCode(int i) {
        this.errCode = i;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setHasRetried(boolean z) {
        this.hasRetried = z;
    }

    public void setPaySuccess(boolean z) {
        this.isPaySuccess = z;
    }

    public void setRetry() {
        reset();
        HashMap hashMap = new HashMap();
        hashMap.put("is_retry_pay", "1");
        addRequestData(hashMap);
        this.hasCGiRetried = true;
        this.isFake = false;
    }

    public void setShouldRetr(boolean z) {
        this.shouldRetr = z;
    }

    public boolean shouldResolveJsonWhenError() {
        return !getHasRetried();
    }

    public void updateConfig(int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("retry_count", i + "");
        hashMap.put("is_last_retry", i2 + "");
        addRequestData(hashMap);
    }
}
