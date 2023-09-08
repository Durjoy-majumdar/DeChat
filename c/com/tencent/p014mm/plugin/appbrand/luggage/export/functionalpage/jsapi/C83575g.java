package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83568b;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.g */
public final class C83575g implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C83576h f244125d;

    /* renamed from: e */
    public final /* synthetic */ WechatNativeExtraDataInvokeFunctionalPage f244126e;

    /* renamed from: f */
    public final /* synthetic */ MMActivity f244127f;

    public C83575g(C83576h hVar, WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, MMActivity mMActivity) {
        this.f244125d = hVar;
        this.f244126e = wechatNativeExtraDataInvokeFunctionalPage;
        this.f244127f = mMActivity;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        C83568b.C83569a.m102591b(this.f244125d, this.f244126e, this.f244127f, (String) null, 4, (Object) null);
        this.f244127f.finish();
    }
}
