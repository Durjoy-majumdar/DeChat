package com.tencent.kinda.framework.sns_cross;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;

public class SnsServiceBean {
    private String mAppId = "";
    private int mChannel;
    private Context mContext;
    private PayInfo mPayInfo;
    private int mPayScene;
    private String mReceiverName = "";
    private String mReqKey;
    private String mTrueName = "";

    public SnsServiceBean(Context context, PayInfo payInfo) {
        this.mPayInfo = payInfo;
        this.mContext = context;
        this.mReqKey = payInfo.f212592j;
        this.mChannel = payInfo.f212589g;
        this.mPayScene = payInfo.f212587e;
        Bundle bundle = payInfo.f212600u;
        if (bundle != null) {
            this.mReceiverName = bundle.getString("extinfo_key_1");
            this.mTrueName = payInfo.f212600u.getString("extinfo_key_2");
            this.mAppId = payInfo.f212600u.getString("app_id");
        }
    }

    public String getAppId() {
        return this.mAppId;
    }

    public int getChannel() {
        return this.mChannel;
    }

    public Context getContext() {
        return this.mContext;
    }

    public PayInfo getPayInfo() {
        return this.mPayInfo;
    }

    public int getPayScene() {
        return this.mPayScene;
    }

    public String getReceiverName() {
        return this.mReceiverName;
    }

    public String getReqKey() {
        return this.mReqKey;
    }

    public String getTrueName() {
        return this.mTrueName;
    }

    public void setChannel(int i) {
        this.mChannel = i;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void setPayInfo(PayInfo payInfo) {
        this.mPayInfo = payInfo;
    }

    public void setPayScene(int i) {
        this.mPayScene = i;
    }

    public void setReceiverName(String str) {
        this.mReceiverName = str;
    }

    public void setReqKey(String str) {
        this.mReqKey = str;
    }

    public void setTrueName(String str) {
        this.mTrueName = str;
    }
}
