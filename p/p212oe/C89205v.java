package p212oe;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.PowerManager;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.p014mm.sdk.platformtools.ApplicationGlobal;
import java.util.HashMap;
import java.util.Map;
import p1190de.C116608a;
import p210o.C11323a;

/* renamed from: oe.v */
public final class C89205v extends C116608a {

    /* renamed from: e */
    public static C11323a<Activity, String> f257038e = new v$$b();

    /* renamed from: b */
    public final Map<String, C114467i> f257039b = new HashMap();

    /* renamed from: c */
    public Application.ActivityLifecycleCallbacks f257040c;

    /* renamed from: d */
    public Object f257041d;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|(2:9|10)|11|12|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0047 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111817b() {
        /*
            r5 = this;
            java.lang.String r0 = "1"
            super.mo111817b()
            oe.v$$g r1 = new oe.v$$g
            r1.<init>(r5)
            r5.f257040c = r1
            android.app.Application r1 = com.tencent.p014mm.sdk.platformtools.ApplicationGlobal.context()
            android.app.Application$ActivityLifecycleCallbacks r2 = r5.f257040c
            r1.registerActivityLifecycleCallbacks(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L_0x0053
            oa1.d r1 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = "clicfg_battery_thermal_alert"
            r3 = 0
            r4 = 1
            java.lang.String r1 = r1.mo182444f(r2, r0, r3, r4)     // Catch:{ Exception -> 0x0053 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0053 }
            if (r0 == 0) goto L_0x0053
            ce.g r0 = r5.f349668a     // Catch:{ Exception -> 0x0053 }
            android.content.Context r0 = r0.mo165879a()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x0053 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ Exception -> 0x0053 }
            if (r0 == 0) goto L_0x0053
            java.lang.Object r1 = r5.f257041d     // Catch:{ Exception -> 0x0053 }
            if (r1 == 0) goto L_0x0047
            android.os.PowerManager$OnThermalStatusChangedListener r1 = (android.os.PowerManager.OnThermalStatusChangedListener) r1     // Catch:{ all -> 0x0047 }
            r0.removeThermalStatusListener(r1)     // Catch:{ all -> 0x0047 }
        L_0x0047:
            oe.v$$e r1 = new oe.v$$e     // Catch:{ Exception -> 0x0053 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0053 }
            r5.f257041d = r1     // Catch:{ Exception -> 0x0053 }
            android.os.PowerManager$OnThermalStatusChangedListener r1 = (android.os.PowerManager.OnThermalStatusChangedListener) r1     // Catch:{ Exception -> 0x0053 }
            r0.addThermalStatusListener(r1)     // Catch:{ Exception -> 0x0053 }
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p212oe.C89205v.mo111817b():void");
    }

    /* renamed from: d */
    public int mo111818d() {
        return 0;
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
        if (this.f257040c != null) {
            ApplicationGlobal.context().unregisterActivityLifecycleCallbacks(this.f257040c);
        }
        ((HashMap) this.f257039b).clear();
        if (Build.VERSION.SDK_INT >= 29 && this.f257041d != null) {
            try {
                PowerManager powerManager = (PowerManager) this.f349668a.mo165879a().getSystemService("power");
                if (powerManager != null) {
                    powerManager.removeThermalStatusListener((PowerManager.OnThermalStatusChangedListener) this.f257041d);
                }
            } catch (Throwable unused) {
            }
            this.f257041d = null;
        }
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.ModuleJiffiesMonitor";
    }
}
