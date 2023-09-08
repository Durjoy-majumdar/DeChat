package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.core.C43515k;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import d93.C45298c;
import di3.C86312j;
import e00.C45520t;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import ob0.C47350c;
import p763ym.C79138l;
import pe3.C47465a;
import ql0.C89699b;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import te3.C50592nt2;
import te3.C50730ot2;
import te3.C52304zt1;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.x0 */
public final class C44120x0 extends C15053a {

    /* renamed from: d */
    public static final C44120x0 f119516d = new C44120x0();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.x0$a */
    public static final class C44121a implements C40324j.C40326a {

        /* renamed from: a */
        public final WeakReference<Context> f119517a;

        /* renamed from: b */
        public final String f119518b;

        /* renamed from: c */
        public final Uri f119519c;

        /* renamed from: d */
        public final WeakReference<C13849g> f119520d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.x0$a$a */
        public static final class C44122a implements C44580q1 {

            /* renamed from: a */
            public final /* synthetic */ C13849g f119521a;

            /* renamed from: b */
            public final /* synthetic */ C44121a f119522b;

            public C44122a(C13849g gVar, C44121a aVar) {
                this.f119521a = gVar;
                this.f119522b = aVar;
            }

            /* renamed from: a */
            public final void mo1579a(boolean z, boolean z2) {
                if (z || z2) {
                    C44120x0.f119516d.mo68755e(this.f119521a, this.f119522b.f119518b, "launchAppByScheme:ok", "");
                } else {
                    C44120x0.f119516d.mo68755e(this.f119521a, this.f119522b.f119518b, "launchAppByScheme:fail", "open url fail");
                }
            }
        }

        public C44121a(WeakReference<Context> weakReference, String str, Uri uri, WeakReference<C13849g> weakReference2) {
            C87412m.m108594g(weakReference, "contextReference");
            C87412m.m108594g(str, "callbackId");
            C87412m.m108594g(uri, "schemeUri");
            C87412m.m108594g(weakReference2, "jsApiHandlerReference");
            this.f119517a = weakReference;
            this.f119518b = str;
            this.f119519c = uri;
            this.f119520d = weakReference2;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            C13849g gVar = this.f119520d.get();
            Context context = this.f119517a.get();
            if (gVar == null || context == null) {
                Log.m105920e("MicroMsg.JsApiLaunchAppByScheme", "context or jsApiHandler is recycled ");
            } else if (i == 0 && i2 == 0) {
                C50730ot2 ot22 = null;
                C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
                if (aVar instanceof C50730ot2) {
                    ot22 = (C50730ot2) aVar;
                }
                if (ot22 == null || ot22.getBaseResponse() == null) {
                    C44120x0.f119516d.mo68755e(gVar, this.f119518b, "launchAppByScheme:fail", "check base resp fail");
                } else if (ot22.getBaseResponse().f135955d != 0) {
                    C44120x0.f119516d.mo68755e(gVar, this.f119518b, "launchAppByScheme:fail", "check resp fail");
                } else {
                    Log.m105924i("MicroMsg.JsApiLaunchAppByScheme", "call doLaunchByScheme:" + this.f119519c);
                    C44120x0 x0Var = C44120x0.f119516d;
                    Uri uri = this.f119519c;
                    String str2 = ot22.f139360d;
                    C44122a aVar2 = new C44122a(gVar, this);
                    x0Var.getClass();
                    Intent intent = new Intent("android.intent.action.VIEW", uri);
                    intent.addFlags(268435456);
                    ((C79138l) C86312j.m106911c(C79138l.class)).px0(context, intent, str2, aVar2);
                }
            } else {
                C44120x0.f119516d.mo68755e(gVar, this.f119518b, "launchAppByScheme:fail", "check cgi fail");
            }
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        Uri uri;
        String str;
        String str2;
        C13855j jVar2 = jVar;
        C13851h1 h1Var2 = h1Var;
        C87412m.m108594g(jVar2, "env");
        C87412m.m108594g(h1Var2, "msg");
        Map<String, Object> map = h1Var2.f38983a;
        C13849g gVar = jVar2.f39001d;
        if (map == null || ((HashMap) map).isEmpty()) {
            String str3 = h1Var2.f38990c;
            C87412m.m108593f(str3, "msg.callbackId");
            mo68755e(gVar, str3, "launchAppByScheme:fail", "params dic is invalid");
            Log.m105920e("MicroMsg.JsApiLaunchAppByScheme", "schemeUrl is nil for launchAppByScheme");
            return true;
        }
        Object obj = ((HashMap) map).get("schemeUrl");
        C43515k kVar = null;
        String str4 = obj instanceof String ? (String) obj : null;
        if (str4 == null || str4.length() == 0) {
            Log.m105920e("MicroMsg.JsApiLaunchAppByScheme", "schemeUrl is nil for launchAppByScheme");
            String str5 = h1Var2.f38990c;
            C87412m.m108593f(str5, "msg.callbackId");
            mo68755e(gVar, str5, "launchAppByScheme:fail", "schemeUrl is null");
            return true;
        }
        try {
            uri = Uri.parse(str4);
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.JsApiLaunchAppByScheme", "schemeUri is not valid:" + str4);
            uri = null;
        }
        if (uri == null) {
            String str6 = h1Var2.f38990c;
            C87412m.m108593f(str6, "msg.callbackId");
            mo68755e(gVar, str6, "launchAppByScheme:fail", "schemeUrl is invalid");
            return true;
        }
        C45520t c = jVar.mo13183c();
        BaseWebViewController baseWebViewController = c instanceof BaseWebViewController ? (BaseWebViewController) c : null;
        if (baseWebViewController != null) {
            kVar = baseWebViewController.f117550X;
        }
        if (kVar != null) {
            Point point = kVar.f117652a;
            if ((point.x == 0 && point.y == 0) ? false : true) {
                C45298c U = baseWebViewController.mo67698U();
                int i = U.f122692i;
                String str7 = U.f122688e;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = U.f122703t;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = U.f122704u;
                if (str9 == null) {
                    str9 = "";
                    str = str9;
                } else {
                    str = "";
                }
                int i2 = U.f122708y;
                int i3 = U.f122709z;
                Uri uri2 = uri;
                C52304zt1 zt12 = U.f122707x;
                int i4 = zt12 != null ? zt12.f146213d : 0;
                int i5 = U.f122685b;
                long j = kVar.f117653b;
                Point point2 = kVar.f117652a;
                long j2 = 0;
                if (j > 0) {
                    j2 = System.currentTimeMillis() - j;
                }
                C13849g gVar2 = gVar;
                long j3 = j2;
                C50592nt2 nt22 = new C50592nt2();
                nt22.f138761d = i5;
                C45520t c2 = jVar.mo13183c();
                if (c2 == null || (str2 = c2.getCurrentUrl()) == null) {
                    str2 = str;
                }
                nt22.f138762e = str2;
                nt22.f138763f = str4;
                nt22.f138775u = i;
                nt22.f138765h = str7;
                nt22.f138766i = str8;
                nt22.f138767j = str9;
                nt22.f138768n = i2;
                nt22.f138769o = i3;
                nt22.f138770p = i4;
                nt22.f138772r = j3;
                nt22.f138773s = point2.x;
                nt22.f138774t = point2.y;
                nt22.f138771q = 1;
                Log.m105924i("MicroMsg.JsApiLaunchAppByScheme", "do MMNewCheckLaunchAppReq, scene:" + nt22.f138761d + ", content_type:" + nt22.f138768n + ", appmsg_inner_type:" + nt22.f138769o + ", scheme_url:" + nt22.f138763f);
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = nt22;
                bVar.f127067b = new C50730ot2();
                bVar.f127068c = "/cgi-bin/micromsg-bin/newchecklaunchapp";
                bVar.f127069d = 9558;
                Context context = jVar.f38998a;
                if (!(context instanceof Activity)) {
                    context = baseWebViewController.f117553a.getActivityContextIfHas();
                }
                C47350c a = bVar.mo72403a();
                WeakReference weakReference = new WeakReference(context);
                String str10 = h1Var.f38990c;
                C87412m.m108593f(str10, "msg.callbackId");
                ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C44121a(weakReference, str10, uri2, new WeakReference(gVar2)));
                return true;
            }
        }
        Log.m105920e("MicroMsg.JsApiLaunchAppByScheme", "launchAppByScheme fail not click webview");
        String str11 = h1Var2.f38990c;
        C87412m.m108593f(str11, "msg.callbackId");
        mo68755e(gVar, str11, "launchAppByScheme:fail", "can not launch app without user interaction");
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return C89699b.C89702c.CTRL_INDEX;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "launchAppByScheme";
    }

    /* renamed from: e */
    public final void mo68755e(C13849g gVar, String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("err_desc", str3);
        gVar.mo10774a(str, str2, linkedHashMap);
    }
}
