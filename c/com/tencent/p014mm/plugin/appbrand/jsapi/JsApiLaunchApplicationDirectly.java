package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.Launch3RdAppEvent;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyTransparentUI;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import ji3.C9457a;
import nj3.C76879j;
import ob0.C47350c;
import org.json.JSONObject;
import p206nj.C88955f;
import p237sp.C13754y;
import p763ym.C79138l;
import te3.C49856ij2;
import te3.C50000jj2;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly */
public final class JsApiLaunchApplicationDirectly extends JsApiLaunchApplication {
    private static final int CTRL_INDEX = 620;
    private static final String NAME = "launchApplicationDirectly";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask */
    public static class LaunchApplicationTask extends AppBrandProxyTransparentUIProcessTask {
        public static final Parcelable.Creator<LaunchApplicationTask> CREATOR = new C1560b();

        /* renamed from: j */
        public int f10983j;

        /* renamed from: n */
        public String f10984n;

        /* renamed from: o */
        public String f10985o;

        /* renamed from: p */
        public String f10986p;

        /* renamed from: q */
        public Bundle f10987q;

        /* renamed from: r */
        public boolean f10988r;

        /* renamed from: s */
        public Runnable f10989s;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask$a */
        public class C1559a implements C1567b.C1568a {

            /* renamed from: a */
            public final /* synthetic */ AppBrandProxyTransparentUIProcessTask.C17865c f10990a;

            public C1559a(AppBrandProxyTransparentUIProcessTask.C17865c cVar) {
                this.f10990a = cVar;
            }

            /* renamed from: a */
            public void mo1583a(boolean z, boolean z2) {
                Log.m105925i("MicroMsg.JsApiLaunchApplicationDirectly", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
                if (z) {
                    LaunchApplicationTask.this.f10988r = true;
                    ((AppBrandProxyTransparentUI.C115242a) this.f10990a).mo175005a();
                    return;
                }
                LaunchApplicationTask.this.f10988r = false;
                ((AppBrandProxyTransparentUI.C115242a) this.f10990a).mo175005a();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask$b */
        public class C1560b implements Parcelable.Creator<LaunchApplicationTask> {
            public Object createFromParcel(Parcel parcel) {
                return new LaunchApplicationTask(parcel, (C1561a) null);
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
            this.f10983j = parcel.readInt();
            this.f10984n = parcel.readString();
            this.f10985o = parcel.readString();
            this.f10986p = parcel.readString();
            this.f10987q = parcel.readBundle();
            boolean z = true;
            if (parcel.readByte() != 1) {
                z = false;
            }
            this.f10988r = z;
        }

        /* renamed from: c */
        public void mo1570c() {
            Log.m105924i("MicroMsg.JsApiLaunchApplicationDirectly", "runInClientProcess");
            if (this.f10989s != null) {
                Log.m105924i("MicroMsg.JsApiLaunchApplicationDirectly", "runInClientProcess asyncCallback != null");
                ((C1561a.C1562a.C1566d) this.f10989s).run();
            }
        }

        /* renamed from: d */
        public void mo1571d(Context context, AppBrandProxyTransparentUIProcessTask.C17865c cVar) {
            C1567b.C1568a aVar;
            Class cls = C79138l.class;
            C1567b bVar = new C1567b(new C1559a(cVar));
            WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
            wXAppExtendObject.extInfo = this.f10986p;
            WXMediaMessage wXMediaMessage = new WXMediaMessage(wXAppExtendObject);
            wXMediaMessage.sdkVer = Build.SDK_INT;
            wXMediaMessage.messageExt = this.f10986p;
            Launch3RdAppEvent launch3RdAppEvent = new Launch3RdAppEvent();
            Launch3RdAppEvent.C1089a aVar2 = launch3RdAppEvent.f9317d;
            aVar2.f9319a = wXMediaMessage;
            aVar2.f9320b = this.f10984n;
            aVar2.f9321c = this.f10983j;
            aVar2.f9322d = context;
            aVar2.f9324f = this.f10987q;
            aVar2.f9323e = bVar;
            launch3RdAppEvent.publish();
            boolean z = launch3RdAppEvent.f9318e.f9325a;
            if (!z) {
                if (Util.isNullOrNil(this.f10984n) || Util.isNullOrNil(this.f10985o)) {
                    Log.m105924i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication nil appId or parameter.");
                } else {
                    String str = this.f10984n + "://" + this.f10985o;
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    Log.m105925i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication by opensdk failed, try to launch by scheme(%s).", str);
                    intent.addFlags(268435456);
                    List<ResolveInfo> queryIntentActivities = Util.queryIntentActivities(context, intent);
                    if ((queryIntentActivities != null && !queryIntentActivities.isEmpty()) || Util.isAffectedByPackageVisibility(MMApplicationContext.getContext())) {
                        if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals((!TextUtils.isEmpty(intent.getPackage()) || queryIntentActivities == null || queryIntentActivities.size() != 1) ? intent.getPackage() : ((C79138l) C86312j.m106911c(cls)).mo74017uF(queryIntentActivities.get(0)))) {
                            bVar.f11018c = false;
                            bVar.f11017b = false;
                            bVar.f11019d = false;
                            bVar.f11016a = false;
                            z = ((C79138l) C86312j.m106911c(cls)).Dm0(context, intent, (String) null, bVar, this.f10987q);
                        }
                    }
                }
            }
            bVar.f11016a = z;
            bVar.f11019d = true;
            if (bVar.f11018c && (aVar = bVar.f11020e) != null) {
                aVar.mo1583a(z, bVar.f11017b);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10983j);
            parcel.writeString(this.f10984n);
            parcel.writeString(this.f10985o);
            parcel.writeString(this.f10986p);
            parcel.writeBundle(this.f10987q);
            parcel.writeByte(this.f10988r ? (byte) 1 : 0);
        }

        public LaunchApplicationTask(Parcel parcel, C1561a aVar) {
            mo1569b(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$a */
    public class C1561a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C81925i2 f10992a;

        /* renamed from: b */
        public final /* synthetic */ int f10993b;

        /* renamed from: c */
        public final /* synthetic */ String f10994c;

        /* renamed from: d */
        public final /* synthetic */ String f10995d;

        /* renamed from: e */
        public final /* synthetic */ String f10996e;

        /* renamed from: f */
        public final /* synthetic */ String f10997f;

        /* renamed from: g */
        public final /* synthetic */ String f10998g;

        /* renamed from: h */
        public final /* synthetic */ String f10999h;

        /* renamed from: i */
        public final /* synthetic */ String f11000i;

        /* renamed from: j */
        public final /* synthetic */ Bundle f11001j;

        /* renamed from: k */
        public final /* synthetic */ String f11002k;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$a$a */
        public class C1562a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f11004d;

            /* renamed from: e */
            public final /* synthetic */ int f11005e;

            /* renamed from: f */
            public final /* synthetic */ C47350c f11006f;

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$a$a$a */
            public class C1563a implements Runnable {
                public C1563a() {
                }

                public void run() {
                    C1561a aVar = C1561a.this;
                    JsApiLaunchApplicationDirectly jsApiLaunchApplicationDirectly = JsApiLaunchApplicationDirectly.this;
                    String str = aVar.f10997f;
                    String str2 = aVar.f10995d;
                    String str3 = aVar.f10998g;
                    String str4 = aVar.f10999h;
                    String str5 = aVar.f11000i;
                    C81925i2 i2Var = aVar.f10992a;
                    int i = aVar.f10993b;
                    jsApiLaunchApplicationDirectly.getClass();
                    C76879j.m92709C(i2Var.getContext(), i2Var.getContext().getString(C0966R.string.a6o), "", i2Var.getContext().getString(C0966R.string.f7642md), i2Var.getContext().getString(C0966R.string.f7635m5), false, new C1773p3(jsApiLaunchApplicationDirectly, i2Var, str2, str, str3, str4, str5, i), new C1842q3(jsApiLaunchApplicationDirectly, i2Var, i));
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$a$a$b */
            public class C1564b implements C1567b.C1568a {
                public C1564b() {
                }

                /* renamed from: a */
                public void mo1583a(boolean z, boolean z2) {
                    Log.m105925i("MicroMsg.JsApiLaunchApplicationDirectly", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
                    C1561a aVar = C1561a.this;
                    JsApiLaunchApplicationDirectly jsApiLaunchApplicationDirectly = JsApiLaunchApplicationDirectly.this;
                    C81925i2 i2Var = aVar.f10992a;
                    jsApiLaunchApplicationDirectly.getClass();
                    MMHandlerThread.postToMainThread(new C82866o3(jsApiLaunchApplicationDirectly, i2Var));
                    if (z) {
                        C1561a aVar2 = C1561a.this;
                        aVar2.f10992a.mo109647a(aVar2.f10993b, JsApiLaunchApplicationDirectly.this.mo115109j("ok"));
                        return;
                    }
                    C1561a aVar3 = C1561a.this;
                    aVar3.f10992a.mo109647a(aVar3.f10993b, JsApiLaunchApplicationDirectly.this.mo115109j("fail:scheme launch fail"));
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$a$a$c */
            public class C1565c implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ Intent f11010d;

                /* renamed from: e */
                public final /* synthetic */ C50000jj2 f11011e;

                /* renamed from: f */
                public final /* synthetic */ C1567b f11012f;

                public C1565c(Intent intent, C50000jj2 jj22, C1567b bVar) {
                    this.f11010d = intent;
                    this.f11011e = jj22;
                    this.f11012f = bVar;
                }

                public void run() {
                    C1567b.C1568a aVar;
                    boolean QH = ((C79138l) C86312j.m106911c(C79138l.class)).mo73999QH(C1561a.this.f10992a.getContext(), this.f11010d, (String) null, this.f11011e.f136156f, this.f11012f, C1561a.this.f11001j);
                    C1567b bVar = this.f11012f;
                    bVar.f11016a = QH;
                    bVar.f11019d = true;
                    if (bVar.f11018c && (aVar = bVar.f11020e) != null) {
                        aVar.mo1583a(QH, bVar.f11017b);
                    }
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$a$a$d */
            public class C1566d implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ LaunchApplicationTask f11014d;

                public C1566d(LaunchApplicationTask launchApplicationTask) {
                    this.f11014d = launchApplicationTask;
                }

                public void run() {
                    Log.m105925i("MicroMsg.JsApiLaunchApplicationDirectly", "callback task.success:%b", Boolean.valueOf(this.f11014d.f10988r));
                    LaunchApplicationTask launchApplicationTask = this.f11014d;
                    launchApplicationTask.getClass();
                    ((HashSet) AppBrandProxyTransparentUIProcessTask.f49238i).remove(launchApplicationTask);
                    if (!this.f11014d.f10988r) {
                        C1561a aVar = C1561a.this;
                        aVar.f10992a.mo109647a(aVar.f10993b, JsApiLaunchApplicationDirectly.this.mo115109j("fail:sdk launch fail"));
                        return;
                    }
                    C1561a aVar2 = C1561a.this;
                    aVar2.f10992a.mo109647a(aVar2.f10993b, JsApiLaunchApplicationDirectly.this.mo115109j("ok"));
                }
            }

            public C1562a(int i, int i2, C47350c cVar) {
                this.f11004d = i;
                this.f11005e = i2;
                this.f11006f = cVar;
            }

            public void run() {
                boolean z;
                int i;
                if (this.f11004d == 0 && this.f11005e == 0) {
                    C50000jj2 jj22 = (C50000jj2) this.f11006f.f127056b.f127083a;
                    Log.m105925i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication check result(showType:%d, errCode:%d, jumpFlog:%d)", Integer.valueOf(jj22.f136156f), Integer.valueOf(jj22.f136155e), Integer.valueOf(jj22.f136157g));
                    MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
                    boolean z2 = multiProcessMMKV != null ? multiProcessMMKV.getBoolean("AppBrandLaunchApplicationMockLogic#forceCheckLaunchAppSuccess", false) : false;
                    Log.m105924i("MicroMsg.AppBrandLaunchApplicationMockLogic", "forceCheckLaunchAppSuccess#get, value: " + z2);
                    if (z2 || (i = jj22.f136155e) == 0) {
                        C1656c0 c0Var = C1656c0.f11315a;
                        if (!c0Var.mo1682a(C1561a.this.f10994c)) {
                            C1561a aVar = C1561a.this;
                            String str = aVar.f10995d;
                            String str2 = aVar.f10996e;
                            if (str == null) {
                                z = false;
                            } else {
                                Log.m105924i("MicroMsg.AppBrand.CheckIsThirdAppInstalledLogic", "checkByAppId, appId: " + str);
                                IPCBoolean iPCBoolean = (IPCBoolean) C15618a.m14628d(new IPCString(str), C1628b0.f11249a);
                                if (iPCBoolean != null ? iPCBoolean.f10312d : false) {
                                    z = true;
                                } else {
                                    z = c0Var.mo1682a(str + "://" + str2);
                                }
                            }
                            if (!z) {
                                Log.m105924i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication, no weishi app");
                                if (jj22.f136157g == 1) {
                                    C1561a aVar2 = C1561a.this;
                                    aVar2.f10992a.mo109647a(aVar2.f10993b, JsApiLaunchApplicationDirectly.this.mo115109j("fail:install app denied"));
                                    return;
                                }
                                Log.m105924i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication, no weishi app, go download it");
                                MMHandlerThread.postToMainThread(new C1563a());
                                return;
                            }
                        }
                        if (!Util.isNullOrNil(C1561a.this.f10994c)) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C1561a.this.f10994c));
                            intent.addFlags(268435456);
                            List<ResolveInfo> queryIntentActivities = Util.queryIntentActivities(C1561a.this.f10992a.getContext(), intent);
                            if ((queryIntentActivities != null && !queryIntentActivities.isEmpty()) || Util.isAffectedByPackageVisibility(MMApplicationContext.getContext())) {
                                if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals((!TextUtils.isEmpty(intent.getPackage()) || queryIntentActivities == null || queryIntentActivities.size() != 1) ? intent.getPackage() : ((C79138l) C86312j.m106911c(C79138l.class)).mo74017uF(queryIntentActivities.get(0)))) {
                                    MMHandlerThread.postToMainThread(new C1565c(intent, jj22, new C1567b(new C1564b())));
                                    return;
                                }
                            }
                        }
                        LaunchApplicationTask launchApplicationTask = new LaunchApplicationTask(C1561a.this.f10992a.getRuntime().mo113026R());
                        C1561a aVar3 = C1561a.this;
                        launchApplicationTask.f10984n = aVar3.f10995d;
                        launchApplicationTask.f10985o = aVar3.f10996e;
                        launchApplicationTask.f10986p = aVar3.f11002k;
                        launchApplicationTask.f10987q = aVar3.f11001j;
                        launchApplicationTask.f10983j = jj22.f136156f;
                        launchApplicationTask.f10989s = new C1566d(launchApplicationTask);
                        ((HashSet) AppBrandProxyTransparentUIProcessTask.f49238i).add(launchApplicationTask);
                        launchApplicationTask.mo22082a();
                    } else if (i != 2) {
                        C1561a aVar4 = C1561a.this;
                        aVar4.f10992a.mo109647a(aVar4.f10993b, JsApiLaunchApplicationDirectly.this.mo115109j("fail:check fail 1"));
                    } else {
                        C1561a aVar5 = C1561a.this;
                        aVar5.f10992a.mo109647a(aVar5.f10993b, JsApiLaunchApplicationDirectly.this.mo115109j("fail:check fail forbidden scene 2"));
                    }
                } else {
                    C1561a aVar6 = C1561a.this;
                    aVar6.f10992a.mo109647a(aVar6.f10993b, JsApiLaunchApplicationDirectly.this.mo115109j("fail:check fail"));
                }
            }
        }

        public C1561a(C81925i2 i2Var, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Bundle bundle, String str8) {
            this.f10992a = i2Var;
            this.f10993b = i;
            this.f10994c = str;
            this.f10995d = str2;
            this.f10996e = str3;
            this.f10997f = str4;
            this.f10998g = str5;
            this.f10999h = str6;
            this.f11000i = str7;
            this.f11001j = bundle;
            this.f11002k = str8;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            Log.m105925i("MicroMsg.JsApiLaunchApplicationDirectly", "on RunCgi callback errType:%d errCode:%d msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            C9457a.m9137a(new C1562a(i, i2, cVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$b */
    public static class C1567b implements C44580q1 {

        /* renamed from: a */
        public volatile boolean f11016a;

        /* renamed from: b */
        public volatile boolean f11017b;

        /* renamed from: c */
        public volatile boolean f11018c;

        /* renamed from: d */
        public volatile boolean f11019d;

        /* renamed from: e */
        public C1568a f11020e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$b$a */
        public interface C1568a {
            /* renamed from: a */
            void mo1583a(boolean z, boolean z2);
        }

        public C1567b(C1568a aVar) {
            this.f11020e = aVar;
        }

        /* renamed from: a */
        public void mo1579a(boolean z, boolean z2) {
            C1568a aVar;
            this.f11018c = true;
            this.f11017b = z;
            if (this.f11019d && (aVar = this.f11020e) != null) {
                aVar.mo1583a(this.f11016a, z);
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
            Log.m105920e("MicroMsg.JsApiLaunchApplicationDirectly", "data is null");
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
        String optString6 = jSONObject2.optString("installSchemeUrl");
        String optString7 = jSONObject2.optString("fileMd5");
        String optString8 = jSONObject2.optString("taskName");
        String optString9 = jSONObject2.optString("sourceInfo");
        String str2 = optString5;
        String optString10 = jSONObject2.optString("bizInfo");
        String str3 = optString7;
        Log.m105925i("MicroMsg.JsApiLaunchApplicationDirectly", "appid : %s, scheme : %s, extinfo:[%s], parameter : %s", optString, optString2, optString4, optString3);
        if (!Util.isNullOrNil(optString) || !Util.isNullOrNil(optString2)) {
            String appId = i2Var.getAppId();
            C83780d1 l0 = i2Var.mo114341l0();
            if (l0 != null) {
                str = l0.mo116162Q0();
            } else {
                Log.m105920e("MicroMsg.JsApiLaunchApplicationDirectly", "getCurrentPageView is null");
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
            bundle.putString("current_page_biz_info", optString10);
            bundle.putString("current_page_source_info", optString9);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C49856ij2();
            bVar.f127067b = new C50000jj2();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/checklaunchapp";
            bVar.f127069d = 1125;
            C49856ij2 ij22 = (C49856ij2) bVar.mo72403a().f127055a.f127080a;
            ij22.f135396d = appId;
            ij22.f135397e = optString;
            int i5 = ((AppBrandRuntimeWC) i2Var.getRuntime()).mo121253n1().f245533f;
            ij22.f135398f = i5;
            ij22.f135399g = str;
            ij22.f135400h = optString2;
            ij22.f135401i = i3;
            ij22.f135402j = 1;
            ij22.f135403n = i4;
            ij22.f135404o = optString6;
            Log.m105925i("MicroMsg.JsApiLaunchApplicationDirectly", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s, operateDirectly : %s)", appId, optString, Integer.valueOf(i5), ij22.f135399g, ij22.f135400h, Integer.valueOf(ij22.f135401i), Integer.valueOf(ij22.f135403n));
            String str4 = optString8;
            C1561a aVar = r0;
            C1561a aVar2 = new C1561a(i2Var, i, optString2, optString, optString3, optString6, str4, str3, str2, bundle, optString4);
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), aVar);
            return;
        }
        Log.m105920e("MicroMsg.JsApiLaunchApplicationDirectly", "appid and scheme is null or nil");
        i2Var2.mo109647a(i2, mo115109j("fail:appid and scheme is null or nil"));
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$AddDownloadTaskStraightTask */
    public static class AddDownloadTaskStraightTask extends MainProcessTask {
        public static final Parcelable.Creator<AddDownloadTaskStraightTask> CREATOR = new C1558a();

        /* renamed from: f */
        public C82870p f10968f;

        /* renamed from: g */
        public C81925i2 f10969g;

        /* renamed from: h */
        public int f10970h;

        /* renamed from: i */
        public String f10971i;

        /* renamed from: j */
        public String f10972j;

        /* renamed from: n */
        public String f10973n;

        /* renamed from: o */
        public String f10974o;

        /* renamed from: p */
        public long f10975p;

        /* renamed from: q */
        public String f10976q;

        /* renamed from: r */
        public String f10977r;

        /* renamed from: s */
        public String f10978s;

        /* renamed from: t */
        public String f10979t;

        /* renamed from: u */
        public boolean f10980u;

        /* renamed from: v */
        public String f10981v;

        /* renamed from: w */
        public long f10982w;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$AddDownloadTaskStraightTask$a */
        public class C1558a implements Parcelable.Creator<AddDownloadTaskStraightTask> {
            public Object createFromParcel(Parcel parcel) {
                return new AddDownloadTaskStraightTask(parcel);
            }

            public Object[] newArray(int i) {
                return new AddDownloadTaskStraightTask[i];
            }
        }

        public AddDownloadTaskStraightTask(C82870p pVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
            this.f10968f = pVar;
            this.f10969g = i2Var;
            this.f10970h = i;
            this.f10971i = jSONObject.optString("taskName");
            this.f10972j = jSONObject.optString("taskUrl");
            this.f10973n = jSONObject.optString("fileMd5");
            this.f10974o = jSONObject.optString("alternativeUrl");
            this.f10975p = (long) jSONObject.optInt("taskSize", 0);
            this.f10976q = jSONObject.optString("extInfo");
            this.f10977r = jSONObject.optString("fileType");
            this.f10978s = jSONObject.optString("appId");
            this.f10979t = jSONObject.optString("packageName");
            this.f10980u = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f10971i = parcel.readString();
            this.f10972j = parcel.readString();
            this.f10973n = parcel.readString();
            this.f10974o = parcel.readString();
            this.f10975p = parcel.readLong();
            this.f10976q = parcel.readString();
            this.f10977r = parcel.readString();
            this.f10978s = parcel.readString();
            this.f10979t = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f10980u = z;
            this.f10981v = parcel.readString();
            this.f10982w = parcel.readLong();
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            if (this.f10980u) {
                if (Util.isNullOrNil(this.f10981v)) {
                    str = "fail";
                } else {
                    str = String.format("fail:%s", new Object[]{this.f10981v});
                }
                this.f10969g.mo109647a(this.f10970h, this.f10968f.mo115109j(str));
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("downloadId", Long.valueOf(this.f10982w));
            this.f10969g.mo109647a(this.f10970h, this.f10968f.mo115112m("ok", hashMap));
        }

        /* renamed from: j */
        public void mo1553j() {
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                this.f10981v = "fail_sdcard_not_ready";
            } else {
                long j = this.f10975p;
                if (j > 0 && !C88955f.m111059c(j)) {
                    this.f10981v = "fail_sdcard_has_not_enough_space";
                } else if (Util.isNullOrNil(this.f10972j)) {
                    this.f10981v = "fail_invalid_url";
                } else {
                    Log.m105925i("MicroMsg.JsApiLaunchApplicationDirectly", "runInMainProcess taskUrl:%s md5:%s", this.f10972j, this.f10973n);
                    C40939n nVar = new C40939n((C40939n.C2206a) null);
                    nVar.f110176a = this.f10972j;
                    nVar.f110177b = this.f10974o;
                    nVar.f110178c = this.f10975p;
                    nVar.f110179d = this.f10971i;
                    nVar.f110180e = this.f10973n;
                    nVar.f110182g = this.f10978s;
                    nVar.f110183h = this.f10979t;
                    nVar.f110184i = true;
                    nVar.f110181f = Util.getInt(this.f10977r, 1);
                    nVar.f110187l = TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE;
                    nVar.f110192q = this.f10976q;
                    long b = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63956b(nVar);
                    Log.m105924i("MicroMsg.JsApiLaunchApplicationDirectly", "doAddDownloadTaskStraight, downloadId = " + b);
                    if (b <= 0) {
                        Log.m105920e("MicroMsg.JsApiLaunchApplicationDirectly", "doAddDownloadTaskStraight fail, downloadId = " + b);
                        this.f10981v = "";
                    } else {
                        this.f10980u = false;
                        this.f10982w = b;
                    }
                }
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f10971i);
            parcel.writeString(this.f10972j);
            parcel.writeString(this.f10973n);
            parcel.writeString(this.f10974o);
            parcel.writeLong(this.f10975p);
            parcel.writeString(this.f10976q);
            parcel.writeString(this.f10977r);
            parcel.writeString(this.f10978s);
            parcel.writeString(this.f10979t);
            parcel.writeInt(this.f10980u ? 1 : 0);
            parcel.writeString(this.f10981v);
            parcel.writeLong(this.f10982w);
        }

        public AddDownloadTaskStraightTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
