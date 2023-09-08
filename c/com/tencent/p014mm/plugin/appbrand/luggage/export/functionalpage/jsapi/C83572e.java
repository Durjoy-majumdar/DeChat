package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83568b;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.e */
public final class C83572e implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C83573f f244118d;

    /* renamed from: e */
    public final /* synthetic */ WechatNativeExtraDataInvokeFunctionalPage f244119e;

    /* renamed from: f */
    public final /* synthetic */ MMActivity f244120f;

    public C83572e(C83573f fVar, WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, MMActivity mMActivity) {
        this.f244118d = fVar;
        this.f244119e = wechatNativeExtraDataInvokeFunctionalPage;
        this.f244120f = mMActivity;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        C83568b.C83569a.m102591b(this.f244118d, this.f244119e, this.f244120f, (String) null, 4, (Object) null);
        this.f244120f.finish();
    }
}
