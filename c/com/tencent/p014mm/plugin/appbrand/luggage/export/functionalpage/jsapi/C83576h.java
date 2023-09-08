package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83568b;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di0.C86299o;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import org.json.JSONException;
import org.json.JSONObject;
import p170ic.C87687a;
import rx3.C13598b0;
import s00.C90110f;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.h */
public final class C83576h implements C83568b {

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.h$a */
    public static final class C83577a extends C87413o implements C32226l<MMActivity, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C83576h f244128d;

        /* renamed from: e */
        public final /* synthetic */ WechatNativeExtraDataInvokeFunctionalPage f244129e;

        /* renamed from: f */
        public final /* synthetic */ WxaExposedParams f244130f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83577a(C83576h hVar, WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, WxaExposedParams wxaExposedParams) {
            super(1);
            this.f244128d = hVar;
            this.f244129e = wechatNativeExtraDataInvokeFunctionalPage;
            this.f244130f = wxaExposedParams;
        }

        public Object invoke(Object obj) {
            MMActivity mMActivity = (MMActivity) obj;
            C87412m.m108594g(mMActivity, LocaleUtil.ITALIAN);
            mMActivity.mmSetOnActivityResultCallback(new C83575g(this.f244128d, this.f244129e, mMActivity));
            Intent intent = new Intent();
            WxaExposedParams wxaExposedParams = this.f244130f;
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, mMActivity.getString(C0966R.string.f7820sm));
            intent.putExtra("rawUrl", C83727p2.m102772b(wxaExposedParams));
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
        try {
            JSONObject jSONObject = new JSONObject(wechatNativeExtraDataInvokeFunctionalPage.f244093f);
            ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
            String optString = jSONObject.optString("appId", (String) null);
            if (optString == null) {
                C83568b.C83569a.m102591b(this, wechatNativeExtraDataInvokeFunctionalPage, (Context) null, (String) null, 6, (Object) null);
                return;
            }
            String optString2 = jSONObject.optString("pageId");
            int optInt = jSONObject.optInt("appVersion", 0);
            int optInt2 = jSONObject.optInt("versionType", 0);
            WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
            bVar.f239557a = optString;
            bVar.f239567k = optString2;
            bVar.f239563g = optInt;
            bVar.f239564h = optInt2;
            bVar.f239566j = 16;
            C83571d.m102592a((Context) null, new C83577a(this, wechatNativeExtraDataInvokeFunctionalPage, bVar.mo113977a()));
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
        return "sdk_openFeedback";
    }
}
