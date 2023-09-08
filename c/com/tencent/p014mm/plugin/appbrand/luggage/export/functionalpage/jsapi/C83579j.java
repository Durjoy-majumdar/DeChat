package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83568b;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di0.C86299o;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import p170ic.C87687a;
import rx3.C13598b0;
import s00.C90110f;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.j */
public final class C83579j implements C83568b {

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.j$a */
    public static final class C83580a extends C87413o implements C32226l<MMActivity, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C83579j f244134d;

        /* renamed from: e */
        public final /* synthetic */ WechatNativeExtraDataInvokeFunctionalPage f244135e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83580a(C83579j jVar, WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, String str) {
            super(1);
            this.f244134d = jVar;
            this.f244135e = wechatNativeExtraDataInvokeFunctionalPage;
        }

        public Object invoke(Object obj) {
            MMActivity mMActivity = (MMActivity) obj;
            C87412m.m108594g(mMActivity, LocaleUtil.ITALIAN);
            mMActivity.mmSetOnActivityResultCallback(new C83578i(this.f244134d, this.f244135e, mMActivity));
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://jiazhang.qq.com/wap/family/dist/main/index.html?_wv=1&source=h5_wx_sdk#/Index");
            intent.putExtra("forceHideShare", true);
            C13598b0 b0Var = C13598b0.f38549a;
            C88144b.m109796n(mMActivity, "webview", ".ui.tools.WebViewUI", intent, C87687a.m109085a(mMActivity), true);
            mMActivity.overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo115907a(WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, C86299o oVar) {
        C87412m.m108594g(wechatNativeExtraDataInvokeFunctionalPage, "invokeArgs");
        C87412m.m108594g(oVar, "appOpenBundle");
        ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        C83571d.m102592a((Context) null, new C83580a(this, wechatNativeExtraDataInvokeFunctionalPage, "https://jiazhang.qq.com/wap/family/dist/main/index.html?_wv=1&source=h5_wx_sdk#/Index"));
    }

    /* renamed from: b */
    public void mo115908b(WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, Context context, String str) {
        C83568b.C83569a.m102590a(this, wechatNativeExtraDataInvokeFunctionalPage, context, str);
    }

    /* renamed from: c */
    public String mo115909c() {
        return "sdk_openGrowthCare";
    }
}
