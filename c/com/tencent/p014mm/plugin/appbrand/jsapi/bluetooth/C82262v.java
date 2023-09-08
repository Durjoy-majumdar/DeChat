package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81783f0;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81801r;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.v */
public final class C82262v extends C82919r2 {
    public static final int CTRL_INDEX = 1090;
    public static final String NAME = "onMonitoredBluetoothDeviceFound";

    /* renamed from: i */
    public final MonitoredBluetoothDeviceInfo f241169i;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.v$a */
    public static final class C82263a extends C87413o implements C32226l<AppBrandRuntime, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82262v f241170d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<C81925i2, C13598b0> f241171e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82263a(C82262v vVar, C32226l<? super C81925i2, C13598b0> lVar) {
            super(1);
            this.f241170d = vVar;
            this.f241171e = lVar;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            AppBrandRuntime appBrandRuntime = (AppBrandRuntime) obj;
            C87412m.m108594g(appBrandRuntime, "runtime");
            Log.m105924i("MicroMsg.AppBrand.MonitoredBluetoothDevices", "dispatchWhenReady, runtime is ready");
            C81925i2 b0 = appBrandRuntime.mo113047b0();
            if (b0 != null) {
                C82262v vVar = this.f241170d;
                C32226l<C81925i2, C13598b0> lVar = this.f241171e;
                vVar.mo115161k(b0);
                vVar.mo115158h();
                C81801r.m100367a(vVar.f241169i, C81783f0.DISPATCH_ON_MONITORED_BLUETOOTH_DEVICE_FOUND, new C82264w(b0));
                if (lVar != null) {
                    lVar.invoke(b0);
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105928w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "dispatchWhenReady, appService is null");
            }
            return C13598b0.f38549a;
        }
    }

    public C82262v(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        C87412m.m108594g(monitoredBluetoothDeviceInfo, "deviceInfo");
        this.f241169i = monitoredBluetoothDeviceInfo;
        String str = monitoredBluetoothDeviceInfo.field_appId;
        String str2 = monitoredBluetoothDeviceInfo.field_bluetoothDeviceId;
        Log.m105924i("MicroMsg.AppBrand.MonitoredBluetoothDevices", "<init>#OnMonitoredBluetoothDeviceFoundEvent, appId: " + str + ", deviceId: " + str2);
        mo115164n("bluetoothDeviceId", str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114660p(fy3.C32226l<? super com.tencent.p014mm.plugin.appbrand.C81925i2, rx3.C13598b0> r9) {
        /*
            r8 = this;
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo r0 = r8.f241169i
            java.lang.String r0 = r0.field_appId
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = com.tencent.p014mm.plugin.appbrand.C81682d.m100222b(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0010
            com.tencent.mm.plugin.appbrand.i2 r1 = r1.f238150p
            kr0.e r1 = (kr0.C88267e) r1
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            com.tencent.mm.plugin.appbrand.jsapi.f$a r5 = r1.f241595t
            if (r5 == 0) goto L_0x0024
            com.tencent.mm.plugin.appbrand.jsruntime.i r6 = r1.getJsRuntime()
            java.lang.String r7 = "onMonitoredBluetoothDeviceFound"
            boolean r5 = r5.mo114784b(r7, r6)
            goto L_0x0025
        L_0x0024:
            r5 = 1
        L_0x0025:
            if (r4 != r5) goto L_0x0029
            r5 = 1
            goto L_0x002a
        L_0x0029:
            r5 = 0
        L_0x002a:
            if (r5 != 0) goto L_0x006e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "dispatchWhenReady, dispatchWhenRuntimeReady, appService exists: "
            r5.append(r6)
            if (r1 == 0) goto L_0x0039
            r3 = 1
        L_0x0039:
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            java.lang.String r3 = "MicroMsg.AppBrand.MonitoredBluetoothDevices"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            java.lang.String r1 = "appId"
            gy3.C87412m.m108593f(r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.v$a r1 = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.v$a
            r1.<init>(r8, r9)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r9 = com.tencent.p014mm.plugin.appbrand.C81682d.m100222b(r0)
            if (r9 == 0) goto L_0x005e
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.y r2 = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.y
            r2.<init>(r1, r9)
            r9.mo113020N0(r2)
            r2 = r9
        L_0x005e:
            if (r2 != 0) goto L_0x0085
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.a0 r9 = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.a0
            r9.<init>(r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.x r1 = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.x
            r1.<init>(r9, r0)
            com.tencent.p014mm.plugin.appbrand.C83231l.m102140a(r0, r1)
            goto L_0x0085
        L_0x006e:
            r8.mo115161k(r1)
            r8.mo115158h()
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo r0 = r8.f241169i
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.f0 r2 = com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81783f0.DISPATCH_ON_MONITORED_BLUETOOTH_DEVICE_FOUND
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w r3 = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w
            r3.<init>(r1)
            com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81801r.m100367a(r0, r2, r3)
            if (r9 == 0) goto L_0x0085
            r9.invoke(r1)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82262v.mo114660p(fy3.l):void");
    }
}
