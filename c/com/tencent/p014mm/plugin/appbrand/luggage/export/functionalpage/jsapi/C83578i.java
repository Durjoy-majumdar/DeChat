package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83568b;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.i */
public final class C83578i implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C83579j f244131d;

    /* renamed from: e */
    public final /* synthetic */ WechatNativeExtraDataInvokeFunctionalPage f244132e;

    /* renamed from: f */
    public final /* synthetic */ MMActivity f244133f;

    public C83578i(C83579j jVar, WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, MMActivity mMActivity) {
        this.f244131d = jVar;
        this.f244132e = wechatNativeExtraDataInvokeFunctionalPage;
        this.f244133f = mMActivity;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        C83568b.C83569a.m102591b(this.f244131d, this.f244132e, this.f244133f, (String) null, 4, (Object) null);
        this.f244133f.finish();
    }
}
