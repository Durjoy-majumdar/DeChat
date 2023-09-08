package rm0;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: rm0.j */
public class C90040j implements C90009a {

    /* renamed from: d */
    public static Boolean f258649d;

    /* renamed from: e */
    public static Boolean f258650e;

    /* renamed from: f */
    public static Boolean f258651f;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Ef0(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r5, com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2 r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0047
            boolean r1 = r5.isRunning()
            if (r1 == 0) goto L_0x0047
            if (r6 != 0) goto L_0x000c
            goto L_0x0047
        L_0x000c:
            boolean r1 = r5 instanceof com.tencent.p014mm.plugin.appbrand.jsapi.C82554k
            java.lang.String r2 = "MicroMsg.SensorJsEventControllerWx"
            if (r1 != 0) goto L_0x0018
            java.lang.String r5 = "hasPermission AppBrandComponentWithExtra"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
            goto L_0x0047
        L_0x0018:
            r1 = r5
            com.tencent.mm.plugin.appbrand.jsapi.k r1 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82554k) r1
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r1.getRuntime()
            if (r3 != 0) goto L_0x0028
            java.lang.String r5 = "runtime is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
            goto L_0x0047
        L_0x0028:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r1.getRuntime()
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC
            if (r3 != 0) goto L_0x0036
            java.lang.String r5 = "hasPermission not AppBrandRuntimeWC"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
            goto L_0x0047
        L_0x0036:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.getRuntime()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r1
            wq0.g r1 = r1.f251968f1
            java.lang.Class r6 = r6.getClass()
            boolean r5 = r1.mo125128a(r5, r6)
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            if (r5 == 0) goto L_0x004c
            r5 = 1
            return r5
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rm0.C90040j.Ef0(com.tencent.mm.plugin.appbrand.jsapi.f, com.tencent.mm.plugin.appbrand.jsapi.r2):boolean");
    }

    public boolean V20() {
        if (f258649d == null) {
            f258649d = Boolean.TRUE;
            Log.m105924i("MicroMsg.SensorJsEventControllerWx", "ignorePublishFrequencyLimit: true");
        }
        return f258649d.booleanValue();
    }

    public boolean W50() {
        if (f258650e == null) {
            f258650e = Boolean.TRUE;
            Log.m105924i("MicroMsg.SensorJsEventControllerWx", "useNewDeviceMotionStrategy: true");
        }
        return f258650e.booleanValue();
    }

    public int jh0() {
        return 20;
    }

    public boolean jp0() {
        if (f258651f == null) {
            Boolean bool = Boolean.TRUE;
            f258651f = bool;
            Log.m105925i("MicroMsg.SensorJsEventControllerWx", "disableDispatchJsApi:%b", bool);
        }
        return f258651f.booleanValue();
    }

    /* renamed from: n1 */
    public int mo124337n1() {
        return 5;
    }
}
