package tm0;

import android.os.Build;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84780r0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p156gj.C87201q;
import p156gj.C87203t;
import wi0.C90988l;

/* renamed from: tm0.l0 */
public final class C90545l0 implements C14037r0<C81879g> {
    /* renamed from: a */
    public Map mo13450a(String str, C82381f fVar) {
        C81879g gVar = (C81879g) fVar;
        C87412m.m108594g(str, "type");
        C87412m.m108594g(gVar, "component");
        HashMap hashMap = new HashMap();
        String str2 = Build.CPU_ABI;
        C87412m.m108593f(str2, "CPU_ABI");
        hashMap.put("abi", str2);
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                String str3 = strArr[0];
                C87412m.m108593f(str3, "Build.SUPPORTED_ABIS[0]");
                hashMap.put("deviceAbi", str3);
            }
        }
        AppBrandRuntime runtime = gVar.getRuntime();
        AppBrandSysConfigLU appBrandSysConfigLU = null;
        C90988l d0 = runtime != null ? runtime.mo113051d0() : null;
        if (d0 instanceof AppBrandSysConfigLU) {
            appBrandSysConfigLU = (AppBrandSysConfigLU) d0;
        }
        if (appBrandSysConfigLU != null) {
            hashMap.put("benchmarkLevel", Integer.valueOf(appBrandSysConfigLU.f234887p0));
        }
        String str4 = Build.BRAND;
        C87412m.m108593f(str4, "BRAND");
        hashMap.put("brand", str4);
        String k = C87203t.m108275k();
        C87412m.m108593f(k, "getModel()");
        hashMap.put("model", k);
        hashMap.put("system", "Android " + Build.VERSION.RELEASE);
        int a = C84780r0.m104449a(gVar);
        String b = C87201q.m108258b();
        if (b == null) {
            b = "unknown";
        }
        hashMap.put("memorySize", Integer.valueOf(a));
        hashMap.put("cpuType", b);
        return hashMap;
    }
}
