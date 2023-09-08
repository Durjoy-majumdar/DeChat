package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
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
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.C24274p;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import ob0.C47350c;
import org.json.JSONObject;
import p763ym.C79138l;
import te3.C49856ij2;
import te3.C50000jj2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative */
public class JsApiLaunchApplicationForNative extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 665;
    private static final String NAME = "launchApplicationForNative";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask */
    public static class LaunchApplicationTask extends AppBrandProxyTransparentUIProcessTask {
        public static final Parcelable.Creator<LaunchApplicationTask> CREATOR = new C1595b();

        /* renamed from: j */
        public int f11154j;

        /* renamed from: n */
        public String f11155n;

        /* renamed from: o */
        public String f11156o;

        /* renamed from: p */
        public String f11157p;

        /* renamed from: q */
        public Bundle f11158q;

        /* renamed from: r */
        public boolean f11159r;

        /* renamed from: s */
        public Runnable f11160s;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask$a */
        public class C1594a implements C1596a.C1597a {

            /* renamed from: a */
            public final /* synthetic */ AppBrandProxyTransparentUIProcessTask.C17865c f11161a;

            public C1594a(AppBrandProxyTransparentUIProcessTask.C17865c cVar) {
                this.f11161a = cVar;
            }

            /* renamed from: a */
            public void mo1637a(boolean z, boolean z2) {
                Log.m105925i("MicroMsg.JsApiLaunchApplicationForNative", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
                if (z) {
                    LaunchApplicationTask.this.f11159r = true;
                    ((AppBrandProxyTransparentUI.C115242a) this.f11161a).mo175005a();
                    return;
                }
                LaunchApplicationTask.this.f11159r = false;
                ((AppBrandProxyTransparentUI.C115242a) this.f11161a).mo175005a();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask$b */
        public class C1595b implements Parcelable.Creator<LaunchApplicationTask> {
            public Object createFromParcel(Parcel parcel) {
                return new LaunchApplicationTask(parcel, (C24274p) null);
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
            this.f11154j = parcel.readInt();
            this.f11155n = parcel.readString();
            this.f11156o = parcel.readString();
            this.f11157p = parcel.readString();
            this.f11158q = parcel.readBundle();
            boolean z = true;
            if (parcel.readByte() != 1) {
                z = false;
            }
            this.f11159r = z;
        }

        /* renamed from: c */
        public void mo1570c() {
            Log.m105924i("MicroMsg.JsApiLaunchApplicationForNative", "runInClientProcess");
            if (this.f11160s != null) {
                Log.m105924i("MicroMsg.JsApiLaunchApplicationForNative", "runInClientProcess asyncCallback != null");
                ((C24274p.C24275a.C24278c) this.f11160s).run();
            }
        }

        /* renamed from: d */
        public void mo1571d(Context context, AppBrandProxyTransparentUIProcessTask.C17865c cVar) {
            Class cls = C79138l.class;
            C1596a aVar = new C1596a(new C1594a(cVar));
            WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
            wXAppExtendObject.extInfo = this.f11157p;
            WXMediaMessage wXMediaMessage = new WXMediaMessage(wXAppExtendObject);
            wXMediaMessage.sdkVer = Build.SDK_INT;
            wXMediaMessage.messageExt = this.f11157p;
            Launch3RdAppEvent launch3RdAppEvent = new Launch3RdAppEvent();
            Launch3RdAppEvent.C1089a aVar2 = launch3RdAppEvent.f9317d;
            aVar2.f9319a = wXMediaMessage;
            aVar2.f9320b = this.f11155n;
            aVar2.f9321c = this.f11154j;
            aVar2.f9322d = context;
            aVar2.f9324f = this.f11158q;
            aVar2.f9323e = aVar;
            launch3RdAppEvent.publish();
            boolean z = launch3RdAppEvent.f9318e.f9325a;
            if (!z) {
                if (Util.isNullOrNil(this.f11155n) || Util.isNullOrNil(this.f11156o)) {
                    Log.m105924i("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication nil appId or parameter.");
                } else {
                    String str = this.f11155n + "://" + this.f11156o;
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    Log.m105925i("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication by opensdk failed, try to launch by scheme(%s).", str);
                    intent.addFlags(268435456);
                    List<ResolveInfo> queryIntentActivities = Util.queryIntentActivities(context, intent);
                    if ((queryIntentActivities != null && !queryIntentActivities.isEmpty()) || Util.isAffectedByPackageVisibility(MMApplicationContext.getContext())) {
                        if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals((!TextUtils.isEmpty(intent.getPackage()) || queryIntentActivities == null || queryIntentActivities.size() != 1) ? intent.getPackage() : ((C79138l) C86312j.m106911c(cls)).mo74017uF(queryIntentActivities.get(0)))) {
                            aVar.f11165c = false;
                            aVar.f11164b = false;
                            aVar.f11166d = false;
                            aVar.f11163a = false;
                            z = ((C79138l) C86312j.m106911c(cls)).Dm0(context, intent, (String) null, aVar, this.f11158q);
                        }
                    }
                }
            }
            aVar.mo1640b(z);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11154j);
            parcel.writeString(this.f11155n);
            parcel.writeString(this.f11156o);
            parcel.writeString(this.f11157p);
            parcel.writeBundle(this.f11158q);
            parcel.writeByte(this.f11159r ? (byte) 1 : 0);
        }

        public LaunchApplicationTask(Parcel parcel, C24274p pVar) {
            mo1569b(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$a */
    public static class C1596a implements C44580q1 {

        /* renamed from: a */
        public volatile boolean f11163a;

        /* renamed from: b */
        public volatile boolean f11164b;

        /* renamed from: c */
        public volatile boolean f11165c;

        /* renamed from: d */
        public volatile boolean f11166d;

        /* renamed from: e */
        public C1597a f11167e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$a$a */
        public interface C1597a {
            /* renamed from: a */
            void mo1637a(boolean z, boolean z2);
        }

        public C1596a(C1597a aVar) {
            this.f11167e = aVar;
        }

        /* renamed from: a */
        public void mo1579a(boolean z, boolean z2) {
            C1597a aVar;
            this.f11165c = true;
            this.f11164b = z;
            if (this.f11166d && (aVar = this.f11167e) != null) {
                aVar.mo1637a(this.f11163a, z);
            }
        }

        /* renamed from: b */
        public void mo1640b(boolean z) {
            C1597a aVar;
            this.f11163a = z;
            this.f11166d = true;
            if (this.f11165c && (aVar = this.f11167e) != null) {
                aVar.mo1637a(z, this.f11164b);
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C81925i2 i2Var = (C81925i2) fVar;
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiLaunchApplicationForNative", "data is null");
            i2Var.mo109647a(i2, mo115109j("fail:data is null"));
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
        Log.m105925i("MicroMsg.JsApiLaunchApplicationForNative", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s", optString, optString2, optString4, optString3, optString5, optString6);
        if (!Util.isNullOrNil(optString) || !Util.isNullOrNil(optString2) || !Util.isNullOrNil(optString5)) {
            String appId = i2Var.getAppId();
            C83780d1 l0 = i2Var.mo114341l0();
            if (l0 != null) {
                str = l0.mo116162Q0();
            } else {
                Log.m105920e("MicroMsg.JsApiLaunchApplicationForNative", "getCurrentPageView is null");
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
            Log.m105925i("MicroMsg.JsApiLaunchApplicationForNative", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s, operateDirectly : %s)", appId, optString, Integer.valueOf(i6), ij22.f135399g, ij22.f135400h, Integer.valueOf(ij22.f135401i), Integer.valueOf(ij22.f135403n));
            C47350c a = bVar.mo72403a();
            String str2 = optString5;
            C24274p pVar = r0;
            C24274p pVar2 = new C24274p(this, i2Var, i, optString2, bundle, str2, optString6, optString3, optString, optString4);
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, pVar);
            return;
        }
        Log.m105920e("MicroMsg.JsApiLaunchApplicationForNative", "appid and scheme is null or nil");
        i2Var.mo109647a(i2, mo115109j("fail:appid and scheme is null or nil"));
    }
}
