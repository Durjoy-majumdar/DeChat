package z33;

import android.content.Context;
import gy3.C87412m;
import java.util.List;
import sx3.C64197v;

/* renamed from: z33.b */
public final class C91616b {

    /* renamed from: b */
    public static final List<String> f262465b = C64197v.m75537f("/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp", "/sys/devices/system/cpu/cpu0/cpufreq/FakeShmoo_cpu_temp", "/sys/class/thermal/thermal_zone0/temp", "/sys/class/i2c-adapter/i2c-4/4-004c/temperature", "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature", "/sys/devices/platform/omap/omap_temp_sensor.0/temperature", "/sys/devices/platform/tegra_tmon/temp1_input", "/sys/kernel/debug/tegra_thermal/temp_tj", "/sys/devices/platform/s5p-tmu/temperature", "/sys/class/thermal/thermal_zone1/temp", "/sys/class/hwmon/hwmon0/device/temp1_input", "/sys/devices/virtual/thermal/thermal_zone1/temp", "/sys/devices/virtual/thermal/thermal_zone0/temp", "/sys/class/thermal/thermal_zone3/temp", "/sys/class/thermal/thermal_zone4/temp", "/sys/class/hwmon/hwmonX/temp1_input", "/sys/devices/platform/s5p-tmu/curr_temp");

    /* renamed from: a */
    public final Context f262466a;

    public C91616b(Context context) {
        C87412m.m108594g(context, "mContext");
        this.f262466a = context;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo125486a() {
        /*
            r14 = this;
            java.util.List<java.lang.String> r0 = f262465b
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            r1 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003d }
            r3.<init>(r2)     // Catch:{ Exception -> 0x003d }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x003d }
            r2.<init>(r3)     // Catch:{ Exception -> 0x003d }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003d }
            r4.<init>(r2)     // Catch:{ Exception -> 0x003d }
            java.lang.String r5 = r4.readLine()     // Catch:{ Exception -> 0x003d }
            r4.close()     // Catch:{ Exception -> 0x003d }
            r2.close()     // Catch:{ Exception -> 0x003d }
            r3.close()     // Catch:{ Exception -> 0x003d }
            double r2 = java.lang.Double.parseDouble(r5)     // Catch:{  }
            java.lang.Double r1 = java.lang.Double.valueOf(r2)     // Catch:{  }
            goto L_0x003e
        L_0x003d:
        L_0x003e:
            r2 = 0
            if (r1 == 0) goto L_0x0006
            double r4 = r1.doubleValue()
            r0 = 1
            r6 = 4643000109586448384(0x406f400000000000, double:250.0)
            r8 = -4594234569871327232(0xc03e000000000000, double:-30.0)
            r10 = 0
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 > 0) goto L_0x0059
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x0059
            r4 = 1
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            if (r4 == 0) goto L_0x0061
            double r2 = r1.doubleValue()
            goto L_0x007b
        L_0x0061:
            double r4 = r1.doubleValue()
            r11 = 1000(0x3e8, float:1.401E-42)
            double r11 = (double) r11
            double r4 = r4 / r11
            int r13 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x0072
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 == 0) goto L_0x007b
            double r0 = r1.doubleValue()
            double r2 = r0 / r11
        L_0x007b:
            int r0 = (int) r2
            return r0
        L_0x007d:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z33.C91616b.mo125486a():int");
    }
}
