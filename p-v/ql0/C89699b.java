package ql0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import op0.C89251a;
import org.json.JSONObject;
import sl0.C90217b;
import sp0.C90283e;

/* renamed from: ql0.b */
public class C89699b extends C90217b {
    public static final int CTRL_INDEX = 467;
    public static final String NAME = "createLoadSubPackageTask";

    /* renamed from: ql0.b$a */
    public class C89700a implements C89251a.C89253b {

        /* renamed from: a */
        public final /* synthetic */ C82554k f257992a;

        /* renamed from: b */
        public final /* synthetic */ String f257993b;

        /* renamed from: c */
        public final /* synthetic */ String f257994c;

        /* renamed from: d */
        public final /* synthetic */ String f257995d;

        public C89700a(C82554k kVar, String str, String str2, String str3) {
            this.f257992a = kVar;
            this.f257993b = str;
            this.f257994c = str2;
            this.f257995d = str3;
        }

        /* renamed from: a */
        public /* synthetic */ void mo114320a(List list) {
        }

        /* renamed from: b */
        public void mo114321b(C89251a.C89255d dVar) {
            C89699b.this.mo124020x(this.f257992a, this.f257993b, dVar, this.f257994c, this.f257995d);
        }
    }

    /* renamed from: ql0.b$b */
    public class C89701b implements C89251a.C89252a {

        /* renamed from: a */
        public final /* synthetic */ String f257997a;

        /* renamed from: b */
        public final /* synthetic */ C82554k f257998b;

        /* renamed from: c */
        public final /* synthetic */ String f257999c;

        public C89701b(C89699b bVar, String str, C82554k kVar, String str2) {
            this.f257997a = str;
            this.f257998b = kVar;
            this.f257999c = str2;
        }

        /* renamed from: a */
        public void mo123572a(WxaPkgLoadProgress wxaPkgLoadProgress) {
            Log.m105925i("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: module name: %s progress: %s", this.f257997a, wxaPkgLoadProgress.toString());
            C89702c.m112168t(this.f257998b, this.f257999c, "progressUpdate", this.f257997a, wxaPkgLoadProgress.f238582d, wxaPkgLoadProgress.f238583e, wxaPkgLoadProgress.f238584f);
        }
    }

    /* renamed from: ql0.b$c */
    public static class C89702c extends C82926s {
        public static final int CTRL_INDEX = 468;
        public static final String NAME = "onLoadSubPackageTaskStateChange";

        /* renamed from: s */
        public static void m112167s(C82381f fVar, String str, String str2, String str3) {
            m112168t(fVar, str, str2, str3, -1, -1, -1);
        }

        /* renamed from: t */
        public static void m112168t(C82381f fVar, String str, String str2, String str3, int i, long j, long j2) {
            Log.m105925i("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: formatEventCallback taskId: %s, state: %s, progress: %d, currentWritten: %d, totalWritten: %d", str, str2, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2));
            HashMap hashMap = new HashMap();
            hashMap.put("taskId", str);
            hashMap.put("state", str2);
            hashMap.put("moduleName", str3);
            if (i >= 0) {
                hashMap.put("progress", Integer.valueOf(i));
            }
            if (j >= 0) {
                hashMap.put("totalBytesWritten", Long.valueOf(j));
            }
            if (j2 >= 0) {
                hashMap.put("totalBytesExpectedToWrite", Long.valueOf(j2));
            }
            String jSONObject = new JSONObject(hashMap).toString();
            C89702c cVar = new C89702c();
            cVar.mo115194p(fVar);
            cVar.f242407f = jSONObject;
            cVar.mo115158h();
        }
    }

    /* renamed from: a */
    public String mo122435a() {
        return "loadTaskId";
    }

    /* renamed from: d */
    public void mo122436d(C82381f fVar, JSONObject jSONObject, String str) {
        C82554k kVar = (C82554k) fVar;
        String appId = fVar.getAppId();
        String optString = jSONObject.optString("moduleName");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: null or nil moduleName");
            mo124019w(kVar, str, optString);
            return;
        }
        AppBrandRuntime runtime = kVar.getRuntime();
        if (runtime == null || runtime.mo113064k0()) {
            Log.m105920e("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: runtime is not in valid state!");
            mo124019w(kVar, str, optString);
            return;
        }
        C89251a aVar = runtime.f238115M;
        if (aVar == null) {
            Log.m105920e("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: modularizingHelper null!");
            mo124019w(kVar, str, optString);
        } else if (aVar.mo123571d() || optString.equals(ModulePkgInfo.MAIN_MODULE_NAME)) {
            try {
                aVar.mo123569b(optString, new C89700a(kVar, str, appId, optString), new C89701b(this, optString, kVar, str), false);
            } catch (IllegalAccessError e) {
                Log.printErrStackTrace("MicroMsg.JsApiCreateLoadSubPackageTask", e, "loadModule(%s)", optString);
                mo124019w(kVar, str, optString);
            } catch (NullPointerException e2) {
                Log.printErrStackTrace("MicroMsg.JsApiCreateLoadSubPackageTask", e2, "loadModule(%s) npe, isRunning:%b", optString, Boolean.valueOf(fVar.isRunning()));
                mo124019w(kVar, str, optString);
            }
        } else {
            Log.m105928w("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: not support modularizing but still called JsApiCreateLoadSubPackageTask");
            mo124019w(kVar, str, optString);
        }
    }

    public String getTaskId() {
        StringBuilder sb = new StringBuilder();
        AtomicInteger atomicInteger = C90283e.f259174b;
        C90283e.C90285b.f259176a.getClass();
        sb.append(C90283e.f259174b.incrementAndGet());
        sb.append("");
        return sb.toString();
    }

    /* renamed from: w */
    public final void mo124019w(C82381f fVar, String str, String str2) {
        C89702c.m112167s(fVar, str, "fail", str2);
    }

    /* renamed from: x */
    public void mo124020x(C82381f fVar, String str, C89251a.C89255d dVar, String str2, String str3) {
        Log.m105925i("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: loadResult: %s, with appId[%s] moduleName[%s]", dVar.toString(), str2, str3);
        int ordinal = dVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    Log.m105928w("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: should not happen cancel!!");
                    C89702c.m112167s(fVar, str, "fail", str3);
                    return;
                } else if (ordinal != 3) {
                    return;
                }
            }
            C89702c.m112167s(fVar, str, "fail", str3);
            return;
        }
        C89702c.m112167s(fVar, str, "success", str3);
    }
}
