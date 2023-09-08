package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83568b;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProfileUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di0.C86299o;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONException;
import org.json.JSONObject;
import p170ic.C87687a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.f */
public final class C83573f implements C83568b {

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.f$a */
    public static final class C83574a extends C87413o implements C32226l<MMActivity, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f244121d;

        /* renamed from: e */
        public final /* synthetic */ C86299o f244122e;

        /* renamed from: f */
        public final /* synthetic */ C83573f f244123f;

        /* renamed from: g */
        public final /* synthetic */ WechatNativeExtraDataInvokeFunctionalPage f244124g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83574a(String str, C86299o oVar, C83573f fVar, WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage) {
            super(1);
            this.f244121d = str;
            this.f244122e = oVar;
            this.f244123f = fVar;
            this.f244124g = wechatNativeExtraDataInvokeFunctionalPage;
        }

        public Object invoke(Object obj) {
            MMActivity mMActivity = (MMActivity) obj;
            C87412m.m108594g(mMActivity, LocaleUtil.ITALIAN);
            mMActivity.mmSetOnActivityResultCallback(new C83572e(this.f244123f, this.f244124g, mMActivity));
            String str = this.f244121d;
            String str2 = this.f244122e.f250947s.f239397e;
            WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
            bVar.f239560d = str;
            C13598b0 b0Var = C13598b0.f38549a;
            AppBrandProfileUI.m104016Q7(mMActivity, str, 9, 1236, str2, false, bVar.mo113977a(), (Bundle) null, (ActivityStarterIpcDelegate) null, C87687a.m109085a(this.f244123f));
            mMActivity.overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo115907a(WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, C86299o oVar) {
        C87412m.m108594g(wechatNativeExtraDataInvokeFunctionalPage, "invokeArgs");
        C87412m.m108594g(oVar, "appOpenBundle");
        try {
            String optString = new JSONObject(wechatNativeExtraDataInvokeFunctionalPage.f244093f).optString("username", (String) null);
            if (optString == null) {
                C83568b.C83569a.m102591b(this, wechatNativeExtraDataInvokeFunctionalPage, (Context) null, (String) null, 6, (Object) null);
            } else {
                C83571d.m102592a((Context) null, new C83574a(optString, oVar, this, wechatNativeExtraDataInvokeFunctionalPage));
            }
        } catch (JSONException unused) {
            C83568b.C83569a.m102591b(this, wechatNativeExtraDataInvokeFunctionalPage, (Context) null, (String) null, 6, (Object) null);
        }
    }

    /* renamed from: b */
    public void mo115908b(WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, Context context, String str) {
        C83568b.C83569a.m102590a(this, wechatNativeExtraDataInvokeFunctionalPage, context, str);
    }

    /* renamed from: c */
    public String mo115909c() {
        return "sdk_openAppProfile";
    }
}
