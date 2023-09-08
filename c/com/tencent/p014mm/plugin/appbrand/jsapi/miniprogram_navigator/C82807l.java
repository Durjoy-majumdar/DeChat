package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.text.TextUtils;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82794c;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import gt0.C87370k0;
import hp3.C87581a;
import js0.C9514m;
import lp3.C46888b;
import lp3.C88629c;
import lp3.C88631d;
import lp3.C88633e;
import lp3.C88643g;
import op0.C89256c;
import org.json.JSONObject;
import p823sg.C77710q;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l */
public class C82807l implements C82794c {

    /* renamed from: a */
    public static final C82807l f242181a = new C82807l();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l$a */
    public class C82808a implements C88631d.C76721a<Object> {

        /* renamed from: a */
        public final /* synthetic */ C82794c.C82798c f242182a;

        /* renamed from: b */
        public final /* synthetic */ C86812g f242183b;

        /* renamed from: c */
        public final /* synthetic */ C9514m f242184c;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l$a$a */
        public class C82809a implements Runnable {
            public C82809a() {
            }

            public void run() {
                if (C82808a.this.f242184c.f29691a != null) {
                    ((C89256c) C82808a.this.f242184c.f29691a).dismiss();
                }
            }
        }

        public C82808a(C82807l lVar, C82794c.C82798c cVar, C86812g gVar, C9514m mVar) {
            this.f242182a = cVar;
            this.f242183b = gVar;
            this.f242184c = mVar;
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            String str;
            if (this.f242182a != null) {
                boolean z = false;
                if (obj instanceof Exception) {
                    str = ((Exception) obj).getMessage();
                } else if (C82794c.C82796b.C82797a.IGNORE == obj) {
                    z = true;
                    str = "ok";
                } else {
                    str = C82794c.C82796b.C82797a.CANCEL == obj ? "cancel" : obj == null ? VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR : obj.toString();
                }
                this.f242182a.mo1732a(z, str);
            }
            this.f242183b.mo113024P0(new C82809a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l$b */
    public class C82810b implements C87581a<Void, AppBrandInitConfigLU> {

        /* renamed from: a */
        public final /* synthetic */ C9514m f242186a;

        /* renamed from: b */
        public final /* synthetic */ C81879g f242187b;

        /* renamed from: c */
        public final /* synthetic */ C82794c.C82798c f242188c;

        /* renamed from: d */
        public final /* synthetic */ LaunchParcel f242189d;

        public C82810b(C82807l lVar, C9514m mVar, C81879g gVar, C82794c.C82798c cVar, LaunchParcel launchParcel) {
            this.f242186a = mVar;
            this.f242187b = gVar;
            this.f242188c = cVar;
            this.f242189d = launchParcel;
        }

        public Object call(Object obj) {
            AppBrandInitConfigLU appBrandInitConfigLU = (AppBrandInitConfigLU) obj;
            if (this.f242186a.f29691a != null) {
                ((C89256c) this.f242186a.f29691a).dismiss();
            }
            if (appBrandInitConfigLU == null) {
                C88643g.m110544b().mo72091a(new Exception("get attrs failed"));
                return null;
            } else if (TextUtils.isEmpty(appBrandInitConfigLU.f239362d)) {
                if (!BuildInfo.DEBUG) {
                    C88643g.m110544b().mo72091a(new Exception("get invalid appId"));
                    return null;
                }
                throw new IllegalAccessError("get invalid appId");
            } else if (!this.f242187b.isRunning()) {
                C88643g.m110544b().mo72091a(new Exception("fail:interrupted"));
                return null;
            } else {
                C86812g gVar = (C86812g) this.f242187b.getRuntime();
                if (gVar == null) {
                    C88643g.m110544b().mo72091a(new Exception("fail:internal error"));
                    return null;
                }
                C82794c.C82798c cVar = this.f242188c;
                if (cVar != null) {
                    cVar.mo1733b(appBrandInitConfigLU);
                }
                appBrandInitConfigLU.f234811P = gVar.mo113036W().f234811P;
                gVar.mo121255t1(appBrandInitConfigLU, this.f242189d.f243738o);
                C82794c.C82798c cVar2 = this.f242188c;
                if (cVar2 == null) {
                    return null;
                }
                cVar2.mo1732a(true, "ok");
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l$c */
    public class C82811c implements C87581a<AppBrandInitConfigLU, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C81879g f242190a;

        /* renamed from: b */
        public final /* synthetic */ LaunchParcel f242191b;

        /* renamed from: c */
        public final /* synthetic */ JSONObject f242192c;

        public C82811c(C81879g gVar, LaunchParcel launchParcel, JSONObject jSONObject) {
            this.f242190a = gVar;
            this.f242191b = launchParcel;
            this.f242192c = jSONObject;
        }

        public Object call(Object obj) {
            Boolean bool = (Boolean) obj;
            C88643g.m110543a(C82807l.this.mo115047c(this.f242190a, this.f242191b, this.f242192c));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l$d */
    public class C82812d implements C87581a<Boolean, Void> {

        /* renamed from: a */
        public final /* synthetic */ C9514m f242194a;

        /* renamed from: b */
        public final /* synthetic */ C86812g f242195b;

        /* renamed from: c */
        public final /* synthetic */ String f242196c;

        /* renamed from: d */
        public final /* synthetic */ String f242197d;

        /* renamed from: e */
        public final /* synthetic */ C81879g f242198e;

        /* renamed from: f */
        public final /* synthetic */ LaunchParcel f242199f;

        public C82812d(C9514m mVar, C86812g gVar, String str, String str2, C81879g gVar2, LaunchParcel launchParcel) {
            this.f242194a = mVar;
            this.f242195b = gVar;
            this.f242196c = str;
            this.f242197d = str2;
            this.f242198e = gVar2;
            this.f242199f = launchParcel;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            C46888b c = C88643g.m110545c();
            this.f242194a.f29691a = new C89256c();
            ((C89256c) this.f242194a.f29691a).f257150d = new C82813m(this);
            C89256c cVar = (C89256c) this.f242194a.f29691a;
            C82814n nVar = new C82814n(this, c);
            cVar.f257153g = nVar;
            C87370k0.C87371a aVar = cVar.f257152f;
            if (aVar != null) {
                aVar.setOnCancelListener(nVar);
            }
            ((C89256c) this.f242194a.f29691a).mo123573a(this.f242195b);
            if (!C82807l.this.mo114796d(this.f242198e, this.f242199f, new C82815o(this, c))) {
                c.mo72093c(Boolean.TRUE);
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public int mo115045a(HalfScreenConfig halfScreenConfig) {
        return 0;
    }

    /* renamed from: b */
    public final void mo115046b(C81879g gVar, String str, int i, String str2, C82794c.C82795a aVar, JSONObject jSONObject, HalfScreenConfig halfScreenConfig, C82794c.C82798c cVar) {
        int i2;
        C81879g gVar2 = gVar;
        String str3 = str;
        C82794c.C82795a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject;
        HalfScreenConfig halfScreenConfig2 = halfScreenConfig;
        Class<KSProcessWeAppLaunch> cls = KSProcessWeAppLaunch.class;
        C83226n.m102133j(cls, str3);
        C83226n.m102124a(cls, str3, String.format("Network:%s", new Object[]{NetStatusUtil.getNetTypeString(gVar.getRuntime().f238141d)}));
        Object[] objArr = new Object[3];
        objArr[0] = gVar.getAppId();
        objArr[1] = str3;
        objArr[2] = Integer.valueOf(aVar2 != null ? aVar2.f242162f : 0);
        Log.m105925i("MicroMsg.MiniProgramNavigator", "navigateTo fromAppID(%s) targetAppID(%s) sourceType:%d", objArr);
        String appId = gVar.getAppId();
        JSONObject optJSONObject = jSONObject2.optJSONObject("extraData");
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("privateExtraData");
        C83780d1 l0 = gVar2 instanceof C83780d1 ? (C83780d1) gVar2 : ((C81925i2) gVar2).mo114341l0();
        String R0 = l0 != null ? l0.mo116163R0() : "";
        C86812g gVar3 = (C86812g) gVar.getRuntime();
        String str4 = gVar.getAppId() + XVFSFile.PATH_SEPARATOR + gVar3.mo113036W().f234837q + XVFSFile.PATH_SEPARATOR + (gVar3.mo113036W().f234841u + 1000);
        AppBrandStatObject n1 = gVar3.mo121253n1();
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        if (aVar2 == null || (i2 = aVar2.f242157a) == 0) {
            i2 = 1037;
        }
        appBrandStatObject.f245533f = i2;
        appBrandStatObject.f245536i = n1.f245536i;
        if (!(aVar2 == null || aVar2.f242157a == 0 || Util.isNullOrNil(aVar2.f242158b))) {
            str4 = String.format("%s:%s", new Object[]{str4, aVar2.f242158b});
        }
        appBrandStatObject.f245534g = str4;
        appBrandStatObject.f245531d = aVar2 != null ? aVar2.f242159c : 0;
        appBrandStatObject.f245532e = aVar2 != null ? aVar2.f242160d : null;
        appBrandStatObject.f245537j = aVar2 != null ? aVar2.f242163g : null;
        AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f239397e = gVar.getAppId();
        String str5 = "{}";
        appBrandLaunchReferrer.f239398f = optJSONObject == null ? str5 : optJSONObject.toString();
        if (optJSONObject2 != null) {
            str5 = optJSONObject2.toString();
        }
        appBrandLaunchReferrer.f239399g = str5;
        appBrandLaunchReferrer.f239396d = 1;
        appBrandLaunchReferrer.f239401i = R0;
        appBrandLaunchReferrer.f239403n = aVar2 != null ? aVar2.f242162f : 0;
        appBrandLaunchReferrer.f239402j = aVar2 != null ? aVar2.f242161e : null;
        appBrandLaunchReferrer.f239404o = aVar2 != null ? aVar2.f242164h : null;
        LaunchParcel launchParcel = new LaunchParcel();
        launchParcel.f243730d = null;
        launchParcel.f243731e = str3;
        launchParcel.f243732f = 0;
        launchParcel.f243733g = i;
        if (jSONObject2.has("devuin")) {
            launchParcel.f243734h = C77710q.m93739b(jSONObject2.optString("devuin"));
        }
        launchParcel.f243735i = str2;
        launchParcel.f243738o = appBrandStatObject;
        launchParcel.f243739p = appBrandLaunchReferrer;
        launchParcel.f243740q = null;
        launchParcel.mo115684d();
        launchParcel.f243713E = halfScreenConfig2 == null ? HalfScreenConfig.f157929P : halfScreenConfig2;
        launchParcel.f243726S = gVar3.mo113036W().f234845x0;
        launchParcel.f243727T = gVar3.mo113036W().f234847y0;
        launchParcel.f243711C = mo115045a(halfScreenConfig2);
        launchParcel.f243715G = aVar2 != null && aVar2.f242165i;
        C9514m mVar = new C9514m();
        ((C88633e) C88643g.m110546d()).mo11397F(gVar3).mo123062e(new C82812d(mVar, gVar3, appId, str, gVar, launchParcel)).mo123062e(new C82811c(gVar2, launchParcel, jSONObject2)).mo123062e(new C82810b(this, mVar, gVar, cVar, launchParcel)).mo123065b(new C82808a(this, cVar, gVar3, mVar));
    }

    /* renamed from: c */
    public C88629c<AppBrandInitConfigLU> mo115047c(C81879g gVar, LaunchParcel launchParcel, JSONObject jSONObject) {
        return C88643g.m110547e(null);
    }

    /* renamed from: d */
    public boolean mo114796d(C81879g gVar, LaunchParcel launchParcel, C82794c.C82796b bVar) {
        return false;
    }
}
