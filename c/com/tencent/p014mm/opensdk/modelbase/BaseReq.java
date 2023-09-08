package com.tencent.p014mm.opensdk.modelbase;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.channel.p943a.C81053a;

/* renamed from: com.tencent.mm.opensdk.modelbase.BaseReq */
public abstract class BaseReq {
    public String openId;
    public String transaction;

    public abstract boolean checkArgs();

    public void fromBundle(Bundle bundle) {
        this.transaction = C81053a.m99034a(bundle, "_wxapi_basereq_transaction");
        this.openId = C81053a.m99034a(bundle, "_wxapi_basereq_openid");
    }

    public abstract int getType();

    public void toBundle(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", getType());
        bundle.putString("_wxapi_basereq_transaction", this.transaction);
        bundle.putString("_wxapi_basereq_openid", this.openId);
    }
}
