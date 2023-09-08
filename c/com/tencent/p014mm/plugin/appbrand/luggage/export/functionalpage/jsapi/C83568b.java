package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di0.C86299o;
import gy3.C87412m;
import hu0.C87593a;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b */
public interface C83568b {

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b$a */
    public static final class C83569a {
        /* renamed from: a */
        public static void m102590a(C83568b bVar, WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, Context context, String str) {
            C87412m.m108594g(wechatNativeExtraDataInvokeFunctionalPage, "invokeArgs");
            Bundle bundle = new Bundle();
            WXLaunchWxaRedirectingPage.Resp resp = new WXLaunchWxaRedirectingPage.Resp(Bundle.EMPTY);
            String str2 = wechatNativeExtraDataInvokeFunctionalPage.f244091d;
            C87412m.m108591d(str2);
            resp.invokeTicket = str2;
            resp.callbackActivity = wechatNativeExtraDataInvokeFunctionalPage.f244098n;
            resp.errStr = str;
            resp.toBundle(bundle);
            C72688j0.m85021g(bundle);
            C72688j0.m85022h(bundle);
            C87593a aVar = C87593a.f253677a;
            String str3 = wechatNativeExtraDataInvokeFunctionalPage.f244091d;
            C87412m.m108591d(str3);
            Activity a = aVar.mo122047a(str3);
            if (a != null) {
                a.overridePendingTransition(0, 0);
            }
            if (context == null) {
                context = MMApplicationContext.getContext();
            }
            MMessageActV2.Args args = new MMessageActV2.Args();
            args.targetPkgName = wechatNativeExtraDataInvokeFunctionalPage.f244097j;
            args.bundle = bundle;
            C72688j0.m85024j(args);
            MMessageActV2.send(context, args);
        }

        /* renamed from: b */
        public static /* synthetic */ void m102591b(C83568b bVar, WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, Context context, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    context = null;
                }
                if ((i & 4) != 0) {
                    str = null;
                }
                bVar.mo115908b(wechatNativeExtraDataInvokeFunctionalPage, context, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: backToApp");
        }
    }

    /* renamed from: a */
    void mo115907a(WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, C86299o oVar);

    /* renamed from: b */
    void mo115908b(WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, Context context, String str);

    /* renamed from: c */
    String mo115909c();
}
