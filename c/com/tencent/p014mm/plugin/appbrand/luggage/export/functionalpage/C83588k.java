package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import android.os.Parcelable;
import android.text.TextUtils;
import bk0.C79709a;
import com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized;
import com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized;
import com.tencent.luggage.sdk.processes.main.LuggageRegisterTask;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime$$h;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime$$z;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C84249s1;
import com.tencent.p014mm.plugin.appbrand.appcache.AssetReader;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C81559o;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact.C82526a;
import com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact.C82527b;
import com.tencent.p014mm.plugin.appbrand.media.record.C83626f;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84535h3;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84560k4;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.utils.C84791w1;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C87412m;
import hp0.C87574a;
import hp3.C87581a;
import ik0.C87744a;
import java.util.Iterator;
import java.util.Map;
import js0.C9514m;
import nr3.C89060f;
import op0.C89251a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p170ic.C87690d;
import p959ec.C86499a;
import wq0.C91065g;
import yq0.C91566l;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k */
public class C83588k extends AppBrandRuntimeWC {

    /* renamed from: T1 */
    public static final /* synthetic */ int f244152T1 = 0;

    /* renamed from: R1 */
    public volatile C83556c f244153R1;

    /* renamed from: S1 */
    public C83592b f244154S1;

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k$a */
    public class C83589a extends AppBrandRuntime$$z {

        /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k$a$a */
        public class C83590a implements C87581a<Void, Void> {
            public C83590a() {
            }

            public Object call(Object obj) {
                Void voidR = (Void) obj;
                C83588k kVar = C83588k.this;
                kVar.f244153R1 = new C83556c(kVar);
                C83589a.this.mo113114c();
                return null;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k$a$b */
        public class C83591b implements C87581a<Void, Void> {
            public C83591b() {
            }

            public Object call(Object obj) {
                AppBrandLaunchReferrer appBrandLaunchReferrer;
                int i;
                Void voidR = (Void) obj;
                C83588k kVar = C83588k.this;
                int i2 = C83588k.f244152T1;
                kVar.getClass();
                AppBrandSysConfigWC appBrandSysConfigWC = (AppBrandSysConfigWC) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new IPCString(kVar.f238147j), C83595n.class);
                if (appBrandSysConfigWC != null) {
                    appBrandSysConfigWC.f261072r = new WxaPkgWrappingInfo();
                    appBrandSysConfigWC.f261072r.f238585d = kVar.mo113210l1().f239365g;
                    appBrandSysConfigWC.f261072r.pkgVersion = kVar.mo113210l1().f234802F;
                    appBrandSysConfigWC.f261072r.f238587f = true;
                    appBrandSysConfigWC.f234856A = new LaunchWxaAppInfoParcelized(AppRuntimeApiPermissionBundle.f245265g, (Parcelable) null, (String) null, false, false, (LaunchWxaAppMigrateInfoParcelized) null);
                } else {
                    appBrandSysConfigWC = null;
                }
                if (appBrandSysConfigWC == null) {
                    kVar.mo113006E();
                } else {
                    ((AppBrandRuntime$$h) kVar.f238104B).add(appBrandSysConfigWC);
                    C81634a h = C81634a.m100133h(kVar.f238147j, "{}", "{}", false, false);
                    h.f239599G = kVar.mo113210l1().f239367i;
                    ((AppBrandRuntime$$h) kVar.f238104B).add(h);
                    kVar.f251968f1 = new C91065g(kVar, -1, true);
                    kVar.mo113062j0(true);
                    kVar.mo113209k2();
                }
                C83588k kVar2 = C83588k.this;
                AppBrandInitConfigWC M1 = kVar2.mo113210l1();
                if (M1 == null || (appBrandLaunchReferrer = M1.f234846y) == null || appBrandLaunchReferrer.f239396d != 7) {
                    Log.m105924i("MicroMsg.OpenSdkJsApiProcessor", "initConfig is null or lanunchScene is err, return");
                    return null;
                }
                String str = !TextUtils.isEmpty(M1.f234807K) ? M1.f234807K : M1.f234846y.f239405p;
                Log.m105919d("MicroMsg.OpenSdkJsApiProcessor", "openapiInvokeData:%s", str);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString("args"));
                    C9514m mVar = new C9514m();
                    if (((C82419d1) kVar2.f238163z).getTempDirectory(mVar) != C81410b0.OK) {
                        return null;
                    }
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj2 = jSONObject2.get(next);
                        if (obj2 instanceof String) {
                            String str2 = (String) obj2;
                            if (str2 != null && str2.startsWith("content://")) {
                                jSONObject2.put(next, C84791w1.m104471a(kVar2, (String) mVar.f29691a, (String) obj2));
                            }
                        }
                        if (obj2 instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) obj2;
                            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                Object obj3 = jSONArray.get(i3);
                                if (obj3 instanceof String) {
                                    String str3 = (String) obj3;
                                    if (str3 != null && str3.startsWith("content://")) {
                                        jSONArray.put(C84791w1.m104471a(kVar2, (String) mVar.f29691a, (String) obj3));
                                    }
                                }
                            }
                            jSONObject2.put(next, jSONArray);
                        }
                    }
                    jSONObject.put("args", jSONObject2.toString());
                    String jSONObject3 = jSONObject.toString();
                    if (!TextUtils.isEmpty(M1.f234807K)) {
                        M1.f234807K = jSONObject3;
                    } else {
                        M1.f234846y.f239405p = jSONObject3;
                    }
                    i = 1;
                    try {
                        Object[] objArr = new Object[1];
                        objArr[0] = str;
                        Log.m105919d("MicroMsg.OpenSdkJsApiProcessor", "transfer finish, openapiInvokeData:%s", objArr);
                        return null;
                    } catch (JSONException e) {
                        e = e;
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = e;
                        Log.printInfoStack("MicroMsg.OpenSdkJsApiProcessor", "", objArr2);
                        return null;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    i = 1;
                }
            }
        }

        public C83589a() {
        }

        /* renamed from: b */
        public void mo54191b() {
            C89060f.m111322a().mo123064p(new C83591b()).mo123062e(new C83590a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k$b */
    public interface C83592b {
        /* renamed from: a */
        void mo115910a(AppBrandInitConfig appBrandInitConfig, Object obj);
    }

    public C83588k(AppBrandRuntimeContainerWC appBrandRuntimeContainerWC) {
        super(appBrandRuntimeContainerWC);
    }

    /* renamed from: A0 */
    public void mo113001A0() {
        C83556c cVar = this.f244153R1;
        AppBrandInitConfigWC M1 = mo113210l1();
        String str = !TextUtils.isEmpty(M1.f234807K) ? M1.f234807K : M1.f234846y.f239405p;
        boolean z = !TextUtils.isEmpty(mo113210l1().f234807K);
        cVar.getClass();
        C87412m.m108594g(str, "invokeData");
        C83596o tVar = cVar.f244105a.mo113210l1().f234820U != null ? new C83600t(cVar.f244105a) : z ? new NewSDKInvokeProcess(cVar.f244105a) : new C83597q(cVar.f244105a);
        cVar.f244106b = tVar;
        tVar.mo115858c(str);
    }

    /* renamed from: B0 */
    public void mo113002B0(AppBrandInitConfig appBrandInitConfig, Object obj) {
        super.mo113002B0(appBrandInitConfig, obj);
        C83592b bVar = this.f244154S1;
        if (bVar != null) {
            bVar.mo115910a(appBrandInitConfig, obj);
        }
    }

    /* renamed from: L1 */
    public C79709a mo113181L1() {
        return C79709a.f233621a;
    }

    /* renamed from: m2 */
    public final C83563j mo113178J1() {
        return (C83563j) super.mo113178J1();
    }

    /* renamed from: p */
    public C84560k4 mo113072p() {
        return new C84535h3(this.f238141d);
    }

    /* renamed from: q */
    public C89251a mo113074q() {
        return new C89251a.C89254c();
    }

    /* renamed from: r */
    public C83849m0 mo113076r() {
        return new C83561i(this);
    }

    /* renamed from: s0 */
    public void mo113079s0() {
        C87690d.m109091b("clearDuplicatedInstanceOnAppCreate", new C84249s1(this));
        mo113193X1();
        C84185b.m103775h(this);
        C83560h hVar = C83560h.f244111d;
        mo113014I0(C91566l.C91569b.class, hVar);
        mo113014I0(C87744a.C87747b.class, hVar);
        mo113013H0(new C83589a());
        AssetReader assetReader = AssetReader.f238551j;
        if (mo113184O1(false) == null) {
            assetReader.getClass();
            mo113014I0(ICommLibReader.class, assetReader);
            new LuggageRegisterTask(C86499a.m107251a(this)).mo114395c();
            mo113026R().setRequestedOrientation(1);
            C87574a.m108908a(this.f238147j);
            Map<String, IListener> map = C83626f.f244216a;
            String str = this.f238147j;
            C82526a aVar = new C82526a();
            MMToClientEvent.m100655q(str, aVar);
            this.f238113K.mo122978a(new C82527b(aVar));
            C81559o.m100046s(this);
            return;
        }
        throw new IllegalStateException("Duplicated call!!");
    }

    /* renamed from: t */
    public C81925i2 mo113080t() {
        return new C83557e();
    }
}
