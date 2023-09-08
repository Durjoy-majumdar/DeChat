package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.Launch3RdAppEvent;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyTransparentUI;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.List;
import ji3.C9457a;
import ob0.C47350c;
import org.json.JSONObject;
import p763ym.C79138l;
import p823sg.C90193h;
import te3.C49856ij2;
import te3.C50000jj2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication */
public class JsApiLaunchApplication extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 427;
    private static final String NAME = "launchApplication";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask */
    public static class LaunchApplicationTask extends AppBrandProxyTransparentUIProcessTask {
        public static final Parcelable.Creator<LaunchApplicationTask> CREATOR = new C1550b();

        /* renamed from: j */
        public int f10933j;

        /* renamed from: n */
        public String f10934n;

        /* renamed from: o */
        public String f10935o;

        /* renamed from: p */
        public String f10936p;

        /* renamed from: q */
        public Bundle f10937q;

        /* renamed from: r */
        public boolean f10938r;

        /* renamed from: s */
        public Runnable f10939s;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask$a */
        public class C1549a implements C1556b.C1557a {

            /* renamed from: a */
            public final /* synthetic */ AppBrandProxyTransparentUIProcessTask.C17865c f10940a;

            public C1549a(AppBrandProxyTransparentUIProcessTask.C17865c cVar) {
                this.f10940a = cVar;
            }

            /* renamed from: a */
            public void mo1573a(boolean z, boolean z2) {
                Log.m105925i("MicroMsg.JsApiLaunchApplication", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
                if (z) {
                    LaunchApplicationTask.this.f10938r = true;
                    ((AppBrandProxyTransparentUI.C115242a) this.f10940a).mo175005a();
                    return;
                }
                LaunchApplicationTask.this.f10938r = false;
                ((AppBrandProxyTransparentUI.C115242a) this.f10940a).mo175005a();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask$b */
        public class C1550b implements Parcelable.Creator<LaunchApplicationTask> {
            public Object createFromParcel(Parcel parcel) {
                return new LaunchApplicationTask(parcel, (C1551a) null);
            }

            public Object[] newArray(int i) {
                return new LaunchApplicationTask[i];
            }
        }

        public LaunchApplicationTask(Activity activity) {
            super(activity);
        }

        /* renamed from: b */
        public void mo1569b(Parcel parcel) {
            this.f10933j = parcel.readInt();
            this.f10934n = parcel.readString();
            this.f10935o = parcel.readString();
            this.f10936p = parcel.readString();
            this.f10937q = parcel.readBundle();
            boolean z = true;
            if (parcel.readByte() != 1) {
                z = false;
            }
            this.f10938r = z;
        }

        /* renamed from: c */
        public void mo1570c() {
            Log.m105924i("MicroMsg.JsApiLaunchApplication", "runInClientProcess");
            if (this.f10939s != null) {
                Log.m105924i("MicroMsg.JsApiLaunchApplication", "runInClientProcess asyncCallback != null");
                ((C1551a.C1552a.C1555c) this.f10939s).run();
            }
        }

        /* renamed from: d */
        public void mo1571d(Context context, AppBrandProxyTransparentUIProcessTask.C17865c cVar) {
            Class cls = C79138l.class;
            C1556b bVar = new C1556b(new C1549a(cVar));
            WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
            wXAppExtendObject.extInfo = this.f10936p;
            WXMediaMessage wXMediaMessage = new WXMediaMessage(wXAppExtendObject);
            wXMediaMessage.sdkVer = Build.SDK_INT;
            wXMediaMessage.messageExt = this.f10936p;
            Launch3RdAppEvent launch3RdAppEvent = new Launch3RdAppEvent();
            Launch3RdAppEvent.C1089a aVar = launch3RdAppEvent.f9317d;
            aVar.f9319a = wXMediaMessage;
            aVar.f9320b = this.f10934n;
            aVar.f9321c = this.f10933j;
            aVar.f9322d = context;
            aVar.f9324f = this.f10937q;
            aVar.f9323e = bVar;
            launch3RdAppEvent.publish();
            boolean z = launch3RdAppEvent.f9318e.f9325a;
            if (!z) {
                if (Util.isNullOrNil(this.f10934n) || Util.isNullOrNil(this.f10935o)) {
                    Log.m105924i("MicroMsg.JsApiLaunchApplication", "launchApplication nil appId or parameter.");
                } else {
                    String str = this.f10934n + "://" + this.f10935o;
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    Log.m105925i("MicroMsg.JsApiLaunchApplication", "launchApplication by opensdk failed, try to launch by scheme(%s).", str);
                    intent.addFlags(268435456);
                    List<ResolveInfo> queryIntentActivities = Util.queryIntentActivities(context, intent);
                    if ((queryIntentActivities != null && !queryIntentActivities.isEmpty()) || Util.isAffectedByPackageVisibility(MMApplicationContext.getContext())) {
                        if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals((!TextUtils.isEmpty(intent.getPackage()) || queryIntentActivities == null || queryIntentActivities.size() != 1) ? intent.getPackage() : ((C79138l) C86312j.m106911c(cls)).mo74017uF(queryIntentActivities.get(0)))) {
                            bVar.f10965c = false;
                            bVar.f10964b = false;
                            bVar.f10966d = false;
                            bVar.f10963a = false;
                            z = ((C79138l) C86312j.m106911c(cls)).Dm0(context, intent, (String) null, bVar, this.f10937q);
                        }
                    }
                }
            }
            bVar.mo1580b(z);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10933j);
            parcel.writeString(this.f10934n);
            parcel.writeString(this.f10935o);
            parcel.writeString(this.f10936p);
            parcel.writeBundle(this.f10937q);
            parcel.writeByte(this.f10938r ? (byte) 1 : 0);
        }

        public LaunchApplicationTask(Parcel parcel, C1551a aVar) {
            mo1569b(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$a */
    public class C1551a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C81925i2 f10942a;

        /* renamed from: b */
        public final /* synthetic */ int f10943b;

        /* renamed from: c */
        public final /* synthetic */ String f10944c;

        /* renamed from: d */
        public final /* synthetic */ Bundle f10945d;

        /* renamed from: e */
        public final /* synthetic */ String f10946e;

        /* renamed from: f */
        public final /* synthetic */ String f10947f;

        /* renamed from: g */
        public final /* synthetic */ String f10948g;

        /* renamed from: h */
        public final /* synthetic */ String f10949h;

        /* renamed from: i */
        public final /* synthetic */ String f10950i;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$a$a */
        public class C1552a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f10952d;

            /* renamed from: e */
            public final /* synthetic */ int f10953e;

            /* renamed from: f */
            public final /* synthetic */ C47350c f10954f;

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$a$a$a */
            public class C1553a implements C1556b.C1557a {
                public C1553a() {
                }

                /* renamed from: a */
                public void mo1573a(boolean z, boolean z2) {
                    Log.m105925i("MicroMsg.JsApiLaunchApplication", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
                    if (z) {
                        C1551a aVar = C1551a.this;
                        aVar.f10942a.mo109647a(aVar.f10943b, JsApiLaunchApplication.this.mo115109j("ok"));
                        return;
                    }
                    C1551a aVar2 = C1551a.this;
                    aVar2.f10942a.mo109647a(aVar2.f10943b, JsApiLaunchApplication.this.mo115109j("fail:scheme launch fail"));
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$a$a$b */
            public class C1554b implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ Intent f10957d;

                /* renamed from: e */
                public final /* synthetic */ C50000jj2 f10958e;

                /* renamed from: f */
                public final /* synthetic */ C1556b f10959f;

                public C1554b(Intent intent, C50000jj2 jj22, C1556b bVar) {
                    this.f10957d = intent;
                    this.f10958e = jj22;
                    this.f10959f = bVar;
                }

                public void run() {
                    this.f10959f.mo1580b(((C79138l) C86312j.m106911c(C79138l.class)).mo73999QH(C1551a.this.f10942a.getContext(), this.f10957d, (String) null, this.f10958e.f136156f, this.f10959f, C1551a.this.f10945d));
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$a$a$c */
            public class C1555c implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ LaunchApplicationTask f10961d;

                public C1555c(LaunchApplicationTask launchApplicationTask) {
                    this.f10961d = launchApplicationTask;
                }

                public void run() {
                    Log.m105925i("MicroMsg.JsApiLaunchApplication", "callback task.success:%b", Boolean.valueOf(this.f10961d.f10938r));
                    LaunchApplicationTask launchApplicationTask = this.f10961d;
                    launchApplicationTask.getClass();
                    ((HashSet) AppBrandProxyTransparentUIProcessTask.f49238i).remove(launchApplicationTask);
                    if (!this.f10961d.f10938r) {
                        C1551a aVar = C1551a.this;
                        aVar.f10942a.mo109647a(aVar.f10943b, JsApiLaunchApplication.this.mo115109j("fail:sdk launch fail"));
                        return;
                    }
                    C1551a aVar2 = C1551a.this;
                    aVar2.f10942a.mo109647a(aVar2.f10943b, JsApiLaunchApplication.this.mo115109j("ok"));
                }
            }

            public C1552a(int i, int i2, C47350c cVar) {
                this.f10952d = i;
                this.f10953e = i2;
                this.f10954f = cVar;
            }

            public void run() {
                Signature[] a;
                Signature signature;
                Class cls = C79138l.class;
                if (this.f10952d == 0 && this.f10953e == 0) {
                    C50000jj2 jj22 = (C50000jj2) this.f10954f.f127056b.f127083a;
                    int i = jj22.f136155e;
                    if (i == 0) {
                        C1556b bVar = new C1556b(new C1553a());
                        Log.m105925i("MicroMsg.JsApiLaunchApplication", "launchApplication check result(showType : %d, errCode : %d)", Integer.valueOf(jj22.f136156f), Integer.valueOf(jj22.f136155e));
                        if (!Util.isNullOrNil(C1551a.this.f10944c)) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C1551a.this.f10944c));
                            intent.addFlags(268435456);
                            List<ResolveInfo> queryIntentActivities = Util.queryIntentActivities(C1551a.this.f10942a.getContext(), intent);
                            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                                if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals((!TextUtils.isEmpty(intent.getPackage()) || queryIntentActivities.size() != 1) ? intent.getPackage() : ((C79138l) C86312j.m106911c(cls)).mo74017uF(queryIntentActivities.get(0)))) {
                                    MMHandlerThread.postToMainThread(new C1554b(intent, jj22, bVar));
                                    return;
                                }
                            }
                        }
                        if (!Util.isNullOrNil(C1551a.this.f10946e) && !Util.isNullOrNil(C1551a.this.f10947f) && (a = C6647c.m6936a(C1551a.this.f10942a.mo114344o0(), C1551a.this.f10946e)) != null && (signature = a[0]) != null) {
                            String f = C90193h.m112878f(signature.toByteArray());
                            if (f == null || !f.equalsIgnoreCase(C1551a.this.f10947f)) {
                                Log.m105924i("MicroMsg.JsApiLaunchApplication", "launchApplication signature not match");
                            } else {
                                try {
                                    Intent launchIntentForPackage = MMApplicationContext.getContext().getPackageManager().getLaunchIntentForPackage(C1551a.this.f10946e);
                                    if (launchIntentForPackage != null) {
                                        Bundle bundle = new Bundle();
                                        C72688j0.m85023i(bundle, C1551a.this.f10948g);
                                        launchIntentForPackage.putExtras(bundle);
                                        launchIntentForPackage.addFlags(268435456);
                                        bVar.mo1580b(((C79138l) C86312j.m106911c(cls)).Dm0(C1551a.this.f10942a.mo114344o0(), launchIntentForPackage, (String) null, bVar, C1551a.this.f10945d));
                                        return;
                                    }
                                } catch (Exception e) {
                                    Log.m105921e("MicroMsg.JsApiLaunchApplication", "launchApplication getLaunchIntentForPackage, %s", e.getMessage());
                                }
                            }
                        }
                        LaunchApplicationTask launchApplicationTask = new LaunchApplicationTask(C1551a.this.f10942a.getRuntime().mo113026R());
                        C1551a aVar = C1551a.this;
                        launchApplicationTask.f10934n = aVar.f10949h;
                        launchApplicationTask.f10935o = aVar.f10948g;
                        launchApplicationTask.f10936p = aVar.f10950i;
                        launchApplicationTask.f10937q = aVar.f10945d;
                        launchApplicationTask.f10933j = jj22.f136156f;
                        launchApplicationTask.f10939s = new C1555c(launchApplicationTask);
                        ((HashSet) AppBrandProxyTransparentUIProcessTask.f49238i).add(launchApplicationTask);
                        launchApplicationTask.mo22082a();
                    } else if (i != 2) {
                        C1551a aVar2 = C1551a.this;
                        aVar2.f10942a.mo109647a(aVar2.f10943b, JsApiLaunchApplication.this.mo115109j("fail:check fail 1"));
                    } else {
                        C1551a aVar3 = C1551a.this;
                        aVar3.f10942a.mo109647a(aVar3.f10943b, JsApiLaunchApplication.this.mo115109j("fail:check fail forbidden scene 2"));
                    }
                } else {
                    C1551a aVar4 = C1551a.this;
                    aVar4.f10942a.mo109647a(aVar4.f10943b, JsApiLaunchApplication.this.mo115109j("fail:check fail"));
                }
            }
        }

        public C1551a(C81925i2 i2Var, int i, String str, Bundle bundle, String str2, String str3, String str4, String str5, String str6) {
            this.f10942a = i2Var;
            this.f10943b = i;
            this.f10944c = str;
            this.f10945d = bundle;
            this.f10946e = str2;
            this.f10947f = str3;
            this.f10948g = str4;
            this.f10949h = str5;
            this.f10950i = str6;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            Log.m105925i("MicroMsg.JsApiLaunchApplication", "on RunCgi callback errType:%d errCode:%d msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            C9457a.m9137a(new C1552a(i, i2, cVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$b */
    public static class C1556b implements C44580q1 {

        /* renamed from: a */
        public volatile boolean f10963a;

        /* renamed from: b */
        public volatile boolean f10964b;

        /* renamed from: c */
        public volatile boolean f10965c;

        /* renamed from: d */
        public volatile boolean f10966d;

        /* renamed from: e */
        public C1557a f10967e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$b$a */
        public interface C1557a {
            /* renamed from: a */
            void mo1573a(boolean z, boolean z2);
        }

        public C1556b(C1557a aVar) {
            this.f10967e = aVar;
        }

        /* renamed from: a */
        public void mo1579a(boolean z, boolean z2) {
            C1557a aVar;
            this.f10965c = true;
            this.f10964b = z;
            if (this.f10966d && (aVar = this.f10967e) != null) {
                aVar.mo1573a(this.f10963a, z);
            }
        }

        /* renamed from: b */
        public void mo1580b(boolean z) {
            C1557a aVar;
            this.f10963a = z;
            this.f10966d = true;
            if (this.f10965c && (aVar = this.f10967e) != null) {
                aVar.mo1573a(z, this.f10964b);
            }
        }
    }

    /* renamed from: w */
    public void mo1505u(C81925i2 i2Var, JSONObject jSONObject, int i) {
        String str;
        C81925i2 i2Var2 = i2Var;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiLaunchApplication", "data is null");
            i2Var2.mo109647a(i2, mo115109j("fail:data is null"));
            return;
        }
        String optString = jSONObject2.optString("appId");
        String optString2 = jSONObject2.optString("schemeUrl");
        String optString3 = jSONObject2.optString("parameter");
        int i3 = Util.getInt(jSONObject2.optString("alertType"), 0);
        int i4 = Util.getInt(jSONObject2.optString("operateDirectly"), 0);
        String optString4 = jSONObject2.optString("extInfo");
        String optString5 = jSONObject2.optString("packageName");
        String optString6 = jSONObject2.optString("signature");
        String optString7 = jSONObject2.optString("sourceInfo");
        String optString8 = jSONObject2.optString("bizInfo");
        int i5 = i4;
        Log.m105925i("MicroMsg.JsApiLaunchApplication", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s", optString, optString2, optString4, optString3, optString5, optString6);
        if (!Util.isNullOrNil(optString) || !Util.isNullOrNil(optString2) || !Util.isNullOrNil(optString5)) {
            String appId = i2Var.getAppId();
            C83780d1 l0 = i2Var.mo114341l0();
            if (l0 != null) {
                str = l0.mo116162Q0();
            } else {
                Log.m105920e("MicroMsg.JsApiLaunchApplication", "getCurrentPageView is null");
                str = null;
            }
            Bundle bundle = new Bundle();
            if (!Util.isNullOrNil(str)) {
                try {
                    bundle.putString("current_page_url", URLEncoder.encode(str, "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
            }
            bundle.putString("current_page_appid", appId);
            bundle.putString("current_page_biz_info", optString8);
            bundle.putString("current_page_source_info", optString7);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C49856ij2();
            bVar.f127067b = new C50000jj2();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/checklaunchapp";
            bVar.f127069d = 1125;
            C49856ij2 ij22 = (C49856ij2) bVar.mo72403a().f127055a.f127080a;
            ij22.f135396d = appId;
            ij22.f135397e = optString;
            int i6 = ((AppBrandRuntimeWC) i2Var.getRuntime()).mo121253n1().f245533f;
            ij22.f135398f = i6;
            ij22.f135399g = str;
            ij22.f135400h = optString2;
            ij22.f135401i = i3;
            ij22.f135402j = 1;
            ij22.f135403n = i5;
            ij22.f135405p = optString5;
            Log.m105925i("MicroMsg.JsApiLaunchApplication", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s, operateDirectly : %s)", appId, optString, Integer.valueOf(i6), ij22.f135399g, ij22.f135400h, Integer.valueOf(ij22.f135401i), Integer.valueOf(ij22.f135403n));
            Bundle bundle2 = bundle;
            C1551a aVar = r0;
            String str2 = optString5;
            C47350c a = bVar.mo72403a();
            C1551a aVar2 = new C1551a(i2Var, i, optString2, bundle2, str2, optString6, optString3, optString, optString4);
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, aVar);
            return;
        }
        Log.m105920e("MicroMsg.JsApiLaunchApplication", "appid and scheme is null or nil");
        i2Var2.mo109647a(i2, mo115109j("fail:appid and scheme is null or nil"));
    }
}
