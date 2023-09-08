package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.Launch3RdAppEvent;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.pluginsdk.model.app.C6650r1;
import com.tencent.p014mm.pluginsdk.model.app.C6652s1;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import org.json.JSONObject;
import p763ym.C53543s;
import p763ym.C79138l;
import p823sg.C90193h;
import p828wa.C53096b;
import te3.C49856ij2;
import te3.C50000jj2;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.r0 */
public class C5976r0 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.r0$a */
    public class C5977a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C43620m2.C5947b f22210d;

        /* renamed from: e */
        public final /* synthetic */ String f22211e;

        /* renamed from: f */
        public final /* synthetic */ Context f22212f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f22213g;

        /* renamed from: h */
        public final /* synthetic */ String f22214h;

        /* renamed from: i */
        public final /* synthetic */ String f22215i;

        /* renamed from: j */
        public final /* synthetic */ String f22216j;

        /* renamed from: n */
        public final /* synthetic */ String f22217n;

        /* renamed from: o */
        public final /* synthetic */ String f22218o;

        /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.r0$a$a */
        public class C5978a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f22219d;

            /* renamed from: e */
            public final /* synthetic */ int f22220e;

            /* renamed from: f */
            public final /* synthetic */ String f22221f;

            /* renamed from: g */
            public final /* synthetic */ C47350c f22222g;

            /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.r0$a$a$a */
            public class C5979a implements C6650r1.C6651a {
                public C5979a() {
                }

                /* renamed from: a */
                public void mo2088a(boolean z, boolean z2) {
                    Log.m105925i("MicroMsg.JsApiLaunchApplication", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
                    if (z) {
                        C5977a.this.f22210d.mo6945a((String) null, (JSONObject) null);
                    } else {
                        C5977a.this.f22210d.mo6945a("fail", (JSONObject) null);
                    }
                }
            }

            public C5978a(int i, int i2, String str, C47350c cVar) {
                this.f22219d = i;
                this.f22220e = i2;
                this.f22221f = str;
                this.f22222g = cVar;
            }

            public void run() {
                Signature signature;
                Class cls = C79138l.class;
                Log.m105919d("MicroMsg.JsApiLaunchApplication", "on RunCgi callback errType:%d errCode:%d msg:%s", Integer.valueOf(this.f22219d), Integer.valueOf(this.f22220e), this.f22221f);
                if (this.f22219d == 0 && this.f22220e == 0) {
                    C50000jj2 jj22 = (C50000jj2) this.f22222g.f127056b.f127083a;
                    int i = jj22.f136155e;
                    if (i == 0) {
                        C6650r1 xn = ((C53543s) C86312j.m106911c(C53543s.class)).mo74028xn(new C5979a());
                        Log.m105925i("MicroMsg.JsApiLaunchApplication", "launchApplication check result(showType : %d, errCode : %d)", Integer.valueOf(jj22.f136156f), Integer.valueOf(jj22.f136155e));
                        if (!Util.isNullOrNil(C5977a.this.f22211e)) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C5977a.this.f22211e));
                            intent.addFlags(268435456);
                            List<ResolveInfo> queryIntentActivities = Util.queryIntentActivities(C5977a.this.f22212f, intent);
                            if ((queryIntentActivities != null && !queryIntentActivities.isEmpty()) || Util.isAffectedByPackageVisibility(MMApplicationContext.getContext())) {
                                if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals((!TextUtils.isEmpty(intent.getPackage()) || queryIntentActivities == null || queryIntentActivities.size() != 1) ? intent.getPackage() : ((C79138l) C86312j.m106911c(cls)).mo74017uF(queryIntentActivities.get(0)))) {
                                    C5977a aVar = C5977a.this;
                                    ((C6652s1) xn).mo7576b(((C79138l) C86312j.m106911c(cls)).mo73999QH(aVar.f22212f, intent, (String) null, jj22.f136156f, xn, aVar.f22213g));
                                    return;
                                }
                            }
                        }
                        if (!Util.isNullOrNil(C5977a.this.f22214h) && !Util.isNullOrNil(C5977a.this.f22215i)) {
                            C5977a aVar2 = C5977a.this;
                            Signature[] a = C6647c.m6936a(aVar2.f22212f, aVar2.f22214h);
                            if (!(a == null || (signature = a[0]) == null)) {
                                String f = C90193h.m112878f(signature.toByteArray());
                                if (f == null || !f.equalsIgnoreCase(C5977a.this.f22215i)) {
                                    Log.m105924i("MicroMsg.JsApiLaunchApplication", "launchApplication signature not match");
                                } else {
                                    try {
                                        Intent launchIntentForPackage = MMApplicationContext.getContext().getPackageManager().getLaunchIntentForPackage(C5977a.this.f22214h);
                                        if (launchIntentForPackage != null) {
                                            Bundle bundle = new Bundle();
                                            C72688j0.m85023i(bundle, C5977a.this.f22216j);
                                            launchIntentForPackage.putExtras(bundle);
                                            launchIntentForPackage.addFlags(268435456);
                                            C5977a aVar3 = C5977a.this;
                                            ((C6652s1) xn).mo7576b(((C79138l) C86312j.m106911c(cls)).Dm0(aVar3.f22212f, launchIntentForPackage, (String) null, xn, aVar3.f22213g));
                                            return;
                                        }
                                    } catch (Exception e) {
                                        Log.m105921e("MicroMsg.JsApiLaunchApplication", "launchApplication getLaunchIntentForPackage, %s", e.getMessage());
                                    }
                                }
                            }
                        }
                        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
                        wXAppExtendObject.extInfo = C5977a.this.f22217n;
                        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXAppExtendObject);
                        wXMediaMessage.sdkVer = Build.SDK_INT;
                        wXMediaMessage.messageExt = C5977a.this.f22217n;
                        Launch3RdAppEvent launch3RdAppEvent = new Launch3RdAppEvent();
                        Launch3RdAppEvent.C1089a aVar4 = launch3RdAppEvent.f9317d;
                        aVar4.f9319a = wXMediaMessage;
                        C5977a aVar5 = C5977a.this;
                        aVar4.f9320b = aVar5.f22218o;
                        aVar4.f9321c = jj22.f136156f;
                        aVar4.f9322d = aVar5.f22212f;
                        aVar4.f9324f = aVar5.f22213g;
                        aVar4.f9323e = xn;
                        launch3RdAppEvent.publish();
                        boolean z = launch3RdAppEvent.f9318e.f9325a;
                        if (!z && !Util.isNullOrNil(C5977a.this.f22218o) && !Util.isNullOrNil(C5977a.this.f22216j)) {
                            String str = C5977a.this.f22218o + "://" + C5977a.this.f22216j;
                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                            Log.m105925i("MicroMsg.JsApiLaunchApplication", "launchApplication by opensdk failed, try to launch by scheme(%s).", str);
                            intent2.addFlags(268435456);
                            List<ResolveInfo> queryIntentActivities2 = Util.queryIntentActivities(C5977a.this.f22212f, intent2);
                            if ((queryIntentActivities2 != null && !queryIntentActivities2.isEmpty()) || Util.isAffectedByPackageVisibility(MMApplicationContext.getContext())) {
                                if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals((!TextUtils.isEmpty(intent2.getPackage()) || queryIntentActivities2 == null || queryIntentActivities2.size() != 1) ? intent2.getPackage() : ((C79138l) C86312j.m106911c(cls)).mo74017uF(queryIntentActivities2.get(0)))) {
                                    C6652s1 s1Var = (C6652s1) xn;
                                    s1Var.f23966c = false;
                                    s1Var.f23965b = false;
                                    s1Var.f23967d = false;
                                    s1Var.f23964a = false;
                                    C5977a aVar6 = C5977a.this;
                                    z = ((C79138l) C86312j.m106911c(cls)).Dm0(aVar6.f22212f, intent2, (String) null, s1Var, aVar6.f22213g);
                                }
                            }
                        }
                        ((C6652s1) xn).mo7576b(z);
                    } else if (i != 2) {
                        C5977a.this.f22210d.mo6945a("check fail", (JSONObject) null);
                    } else {
                        C5977a.this.f22210d.mo6945a("check fail forbidden scene", (JSONObject) null);
                    }
                } else {
                    C5977a.this.f22210d.mo6945a("check fail", (JSONObject) null);
                }
            }
        }

        public C5977a(C5976r0 r0Var, C43620m2.C5947b bVar, String str, Context context, Bundle bundle, String str2, String str3, String str4, String str5, String str6) {
            this.f22210d = bVar;
            this.f22211e = str;
            this.f22212f = context;
            this.f22213g = bundle;
            this.f22214h = str2;
            this.f22215i = str3;
            this.f22216j = str4;
            this.f22217n = str5;
            this.f22218o = str6;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C40319a0.m43494b(new C5978a(i, i2, str, cVar));
            return 0;
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "launchApplication";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        C43620m2.C5947b bVar2 = bVar;
        Log.m105924i("MicroMsg.JsApiLaunchApplication", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            Log.m105920e("MicroMsg.JsApiLaunchApplication", "data is null");
            bVar2.mo6945a("fail", (JSONObject) null);
            return;
        }
        String optString = e.optString("appID");
        String optString2 = e.optString("schemeUrl");
        String optString3 = e.optString("parameter");
        String optString4 = e.optString("packageName");
        String optString5 = e.optString("signature");
        int optInt = e.optInt("alertType");
        String optString6 = e.optString("extInfo");
        String optString7 = e.optString("sourceInfo");
        String optString8 = e.optString("bizInfo");
        Log.m105925i("MicroMsg.JsApiLaunchApplication", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s", optString, optString2, optString6, optString3, optString4, optString5);
        if (!Util.isNullOrNil(optString) || !Util.isNullOrNil(optString2) || !Util.isNullOrNil(optString4)) {
            String optString9 = e.optString("preVerifyAppId");
            String optString10 = e.optString("currentUrl");
            Bundle bundle = new Bundle();
            try {
                bundle.putString("current_page_url", URLEncoder.encode(optString10, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            bundle.putString("current_page_appid", optString9);
            bundle.putString("current_page_biz_info", optString8);
            bundle.putString("current_page_source_info", optString7);
            C47350c.C47352b bVar3 = new C47350c.C47352b();
            bVar3.f127066a = new C49856ij2();
            bVar3.f127067b = new C50000jj2();
            bVar3.f127068c = "/cgi-bin/mmbiz-bin/checklaunchapp";
            bVar3.f127069d = 1125;
            C47350c a = bVar3.mo72403a();
            C49856ij2 ij22 = (C49856ij2) a.f127055a.f127080a;
            ij22.f135396d = optString9;
            ij22.f135397e = optString;
            ij22.f135398f = 0;
            ij22.f135399g = optString10;
            ij22.f135400h = optString2;
            ij22.f135401i = optInt;
            ij22.f135402j = 0;
            ij22.f135405p = optString4;
            Log.m105925i("MicroMsg.JsApiLaunchApplication", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s)", optString9, optString, 0, ij22.f135399g, ij22.f135400h, Integer.valueOf(ij22.f135401i));
            C89144l0.m111429e(a, new C5977a(this, bVar, optString2, context, bundle, optString4, optString5, optString3, optString6, optString), false);
            return;
        }
        Log.m105920e("MicroMsg.JsApiLaunchApplication", "appid and scheme is null or nil");
        bVar2.mo6945a("fail", (JSONObject) null);
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }
}
