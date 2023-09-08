package dy1;

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
import com.tencent.p014mm.plugin.lite.api.C4770c;
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
import te3.C49856ij2;
import te3.C50000jj2;

/* renamed from: dy1.k */
public class C7554k extends C4770c {

    /* renamed from: dy1.k$a */
    public class C7555a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ Boolean f25814d;

        /* renamed from: e */
        public final /* synthetic */ String f25815e;

        /* renamed from: f */
        public final /* synthetic */ Bundle f25816f;

        /* renamed from: g */
        public final /* synthetic */ String f25817g;

        /* renamed from: h */
        public final /* synthetic */ String f25818h;

        /* renamed from: i */
        public final /* synthetic */ String f25819i;

        /* renamed from: j */
        public final /* synthetic */ String f25820j;

        /* renamed from: n */
        public final /* synthetic */ String f25821n;

        /* renamed from: dy1.k$a$a */
        public class C7556a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f25823d;

            /* renamed from: e */
            public final /* synthetic */ int f25824e;

            /* renamed from: f */
            public final /* synthetic */ String f25825f;

            /* renamed from: g */
            public final /* synthetic */ C47350c f25826g;

            /* renamed from: dy1.k$a$a$a */
            public class C7557a implements C6650r1.C6651a {
                public C7557a() {
                }

                /* renamed from: a */
                public void mo2088a(boolean z, boolean z2) {
                    Log.m105925i("LiteAppJsApiLaunchApplication", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
                    if (z2) {
                        C7554k.this.f19815f.mo5690b();
                    } else {
                        C7554k.this.f19815f.mo5689a("fail");
                    }
                }
            }

            public C7556a(int i, int i2, String str, C47350c cVar) {
                this.f25823d = i;
                this.f25824e = i2;
                this.f25825f = str;
                this.f25826g = cVar;
            }

            public void run() {
                Signature[] a;
                Signature signature;
                int i;
                Class cls = C79138l.class;
                Log.m105919d("LiteAppJsApiLaunchApplication", "on RunCgi callback errType:%d errCode:%d msg:%s", Integer.valueOf(this.f25823d), Integer.valueOf(this.f25824e), this.f25825f);
                if (this.f25823d == 0 && this.f25824e == 0) {
                    C50000jj2 jj22 = (C50000jj2) this.f25826g.f127056b.f127083a;
                    if (!C7555a.this.f25814d.booleanValue() || (i = jj22.f136155e) == 0) {
                        C6650r1 xn = ((C53543s) C86312j.m106911c(C53543s.class)).mo74028xn(new C7557a());
                        Log.m105925i("LiteAppJsApiLaunchApplication", "launchApplication check result(showType : %d, errCode : %d)", Integer.valueOf(jj22.f136156f), Integer.valueOf(jj22.f136155e));
                        Context context = MMApplicationContext.getContext();
                        if (!Util.isNullOrNil(C7555a.this.f25815e)) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C7555a.this.f25815e));
                            intent.addFlags(268435456);
                            List<ResolveInfo> queryIntentActivities = Util.queryIntentActivities(context, intent);
                            if ((queryIntentActivities != null && !queryIntentActivities.isEmpty()) || Util.isAffectedByPackageVisibility(MMApplicationContext.getContext())) {
                                if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals((!TextUtils.isEmpty(intent.getPackage()) || queryIntentActivities == null || queryIntentActivities.size() != 1) ? intent.getPackage() : ((C79138l) C86312j.m106911c(cls)).mo74017uF(queryIntentActivities.get(0)))) {
                                    ((C6652s1) xn).mo7576b(((C79138l) C86312j.m106911c(cls)).mo73999QH(context, intent, (String) null, jj22.f136156f, xn, C7555a.this.f25816f));
                                    return;
                                }
                            }
                        }
                        if (!Util.isNullOrNil(C7555a.this.f25817g) && !Util.isNullOrNil(C7555a.this.f25818h) && (a = C6647c.m6936a(context, C7555a.this.f25817g)) != null && (signature = a[0]) != null) {
                            String f = C90193h.m112878f(signature.toByteArray());
                            if (f == null || !f.equalsIgnoreCase(C7555a.this.f25818h)) {
                                Log.m105924i("LiteAppJsApiLaunchApplication", "launchApplication signature not match");
                            } else {
                                try {
                                    Intent launchIntentForPackage = MMApplicationContext.getContext().getPackageManager().getLaunchIntentForPackage(C7555a.this.f25817g);
                                    if (launchIntentForPackage != null) {
                                        Bundle bundle = new Bundle();
                                        C72688j0.m85023i(bundle, C7555a.this.f25819i);
                                        launchIntentForPackage.putExtras(bundle);
                                        launchIntentForPackage.addFlags(268435456);
                                        ((C6652s1) xn).mo7576b(((C79138l) C86312j.m106911c(cls)).Dm0(context, launchIntentForPackage, (String) null, xn, C7555a.this.f25816f));
                                        return;
                                    }
                                } catch (Exception e) {
                                    Log.m105921e("LiteAppJsApiLaunchApplication", "launchApplication getLaunchIntentForPackage, %s", e.getMessage());
                                }
                            }
                        }
                        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
                        wXAppExtendObject.extInfo = C7555a.this.f25820j;
                        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXAppExtendObject);
                        wXMediaMessage.sdkVer = Build.SDK_INT;
                        wXMediaMessage.messageExt = C7555a.this.f25820j;
                        Launch3RdAppEvent launch3RdAppEvent = new Launch3RdAppEvent();
                        Launch3RdAppEvent.C1089a aVar = launch3RdAppEvent.f9317d;
                        aVar.f9319a = wXMediaMessage;
                        C7555a aVar2 = C7555a.this;
                        aVar.f9320b = aVar2.f25821n;
                        aVar.f9321c = jj22.f136156f;
                        aVar.f9322d = context;
                        aVar.f9324f = aVar2.f25816f;
                        aVar.f9323e = xn;
                        launch3RdAppEvent.publish();
                        boolean z = launch3RdAppEvent.f9318e.f9325a;
                        if (!z && !Util.isNullOrNil(C7555a.this.f25821n) && !Util.isNullOrNil(C7555a.this.f25819i)) {
                            String str = C7555a.this.f25821n + "://" + C7555a.this.f25819i;
                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                            Log.m105925i("LiteAppJsApiLaunchApplication", "launchApplication by opensdk failed, try to launch by scheme(%s).", str);
                            intent2.addFlags(268435456);
                            List<ResolveInfo> queryIntentActivities2 = Util.queryIntentActivities(context, intent2);
                            if ((queryIntentActivities2 != null && !queryIntentActivities2.isEmpty()) || Util.isAffectedByPackageVisibility(MMApplicationContext.getContext())) {
                                if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals((!TextUtils.isEmpty(intent2.getPackage()) || queryIntentActivities2 == null || queryIntentActivities2.size() != 1) ? intent2.getPackage() : ((C79138l) C86312j.m106911c(cls)).mo74017uF(queryIntentActivities2.get(0)))) {
                                    C6652s1 s1Var = (C6652s1) xn;
                                    s1Var.f23966c = false;
                                    s1Var.f23965b = false;
                                    s1Var.f23967d = false;
                                    s1Var.f23964a = false;
                                    z = ((C79138l) C86312j.m106911c(cls)).Dm0(context, intent2, (String) null, s1Var, C7555a.this.f25816f);
                                }
                            }
                        }
                        ((C6652s1) xn).mo7576b(z);
                    } else if (i != 2) {
                        C7554k.this.f19815f.mo5689a("check fail");
                    } else {
                        C7554k.this.f19815f.mo5689a("check fail forbidden scene");
                    }
                } else {
                    C7554k.this.f19815f.mo5689a("check fail");
                }
            }
        }

        public C7555a(Boolean bool, String str, Bundle bundle, String str2, String str3, String str4, String str5, String str6) {
            this.f25814d = bool;
            this.f25815e = str;
            this.f25816f = bundle;
            this.f25817g = str2;
            this.f25818h = str3;
            this.f25819i = str4;
            this.f25820j = str5;
            this.f25821n = str6;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C40319a0.m43494b(new C7556a(i, i2, str, cVar));
            return 0;
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("appID");
        String optString2 = jSONObject2.optString("schemeUrl");
        String optString3 = jSONObject2.optString("parameter");
        String optString4 = jSONObject2.optString("packageName");
        String optString5 = jSONObject2.optString("signature");
        int optInt = jSONObject2.optInt("alertType");
        String optString6 = jSONObject2.optString("extInfo");
        String optString7 = jSONObject2.optString("sourceInfo");
        String optString8 = jSONObject2.optString("bizInfo");
        Boolean valueOf = Boolean.valueOf(jSONObject2.optBoolean("checkLaunchApp", true));
        Log.m105925i("LiteAppJsApiLaunchApplication", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s", optString, optString2, optString6, optString3, optString4, optString5);
        if (!Util.isNullOrNil(optString) || !Util.isNullOrNil(optString2) || !Util.isNullOrNil(optString4)) {
            String optString9 = jSONObject2.optString("preVerifyAppId");
            String optString10 = jSONObject2.optString("currentUrl");
            Bundle bundle = new Bundle();
            try {
                bundle.putString("current_page_url", URLEncoder.encode(optString10, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            bundle.putString("current_page_appid", optString9);
            bundle.putString("current_page_biz_info", optString8);
            bundle.putString("current_page_source_info", optString7);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C49856ij2();
            bVar.f127067b = new C50000jj2();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/checklaunchapp";
            bVar.f127069d = 1125;
            C47350c a = bVar.mo72403a();
            C49856ij2 ij22 = (C49856ij2) a.f127055a.f127080a;
            ij22.f135396d = optString9;
            ij22.f135397e = optString;
            ij22.f135398f = 0;
            ij22.f135399g = optString10;
            ij22.f135400h = optString2;
            ij22.f135401i = optInt;
            ij22.f135402j = 0;
            ij22.f135405p = optString4;
            Log.m105925i("LiteAppJsApiLaunchApplication", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s)", optString9, optString, 0, ij22.f135399g, ij22.f135400h, Integer.valueOf(ij22.f135401i));
            C89144l0.m111429e(a, new C7555a(valueOf, optString2, bundle, optString4, optString5, optString3, optString6, optString), false);
            return;
        }
        Log.m105920e("LiteAppJsApiLaunchApplication", "appid and scheme is null or nil");
        this.f19815f.mo5689a("fail");
    }
}
