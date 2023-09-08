package vx2;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import hc0.C20937c;

/* renamed from: vx2.o */
public class C78493o {

    /* renamed from: a */
    public static C20937c f229928a;

    /* renamed from: b */
    public static C20937c f229929b;

    /* renamed from: c */
    public static boolean f229930c = false;

    static {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59355k = 512;
        bVar.f59354j = 512;
        bVar.f59353i = 5;
        bVar.f59346b = true;
        bVar.f59345a = true;
        f229928a = bVar.mo32666a();
        C20937c.C20939b bVar2 = new C20937c.C20939b();
        bVar2.f59355k = 512;
        bVar2.f59354j = 512;
        bVar2.f59353i = 1;
        bVar2.f59345a = true;
        f229929b = bVar2.mo32666a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m94790a() {
        /*
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r1 = "enable_dynamic_background_for_test"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            java.lang.String r3 = "MicroMsg.TaskBarConfig"
            r4 = 1
            if (r1 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "alvinluo initEnableNativeDynamicBackground enableForTest: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
            f229930c = r4
            m94792c(r4)
            yx2.C79167e.m95840d()
            return
        L_0x0029:
            boolean r1 = p156gj.C87203t.m108279o()
            r5 = 2
            if (r1 == 0) goto L_0x0066
            java.lang.String r1 = "enable_dynamic_background"
            boolean r1 = r0.getBoolean(r1, r4)
            java.lang.Class<h81.h> r6 = h81.C32735h.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            h81.h r6 = (h81.C32735h) r6
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_multitask_taskbar_enable_dynamic_bg
            int r6 = r6.mo58779Qe(r7, r4)
            if (r6 != r4) goto L_0x0048
            r6 = 1
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r7[r2] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            r7[r4] = r8
            java.lang.String r8 = "dynamicbg enable state: %b %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r7)
            if (r1 == 0) goto L_0x0062
            if (r6 == 0) goto L_0x0062
            r1 = 1
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            f229930c = r1
            goto L_0x0068
        L_0x0066:
            f229930c = r2
        L_0x0068:
            android.content.SharedPreferences r1 = yx2.C79167e.f232467a
            if (r1 == 0) goto L_0x00a1
            java.lang.String r6 = "dynamic_bg_init_start_point_count"
            int r1 = r1.getInt(r6, r2)
            android.content.SharedPreferences r6 = yx2.C79167e.f232467a
            java.lang.String r7 = "dynamic_bg_draw_start_point_count"
            int r6 = r6.getInt(r7, r2)
            android.content.SharedPreferences r7 = yx2.C79167e.f232467a
            java.lang.String r8 = "dynamic_bg_init_crash"
            boolean r7 = r7.getBoolean(r8, r2)
            yx2.C79167e.f232469c = r7
            if (r7 != 0) goto L_0x008e
            if (r1 >= r5) goto L_0x008e
            if (r6 < r5) goto L_0x008b
            goto L_0x008e
        L_0x008b:
            yx2.C79167e.f232468b = r2
            goto L_0x00a1
        L_0x008e:
            yx2.C79167e.f232468b = r4
            android.content.SharedPreferences r1 = yx2.C79167e.f232467a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r6 = "dynamic_bg_will_crash"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r6, r4)
            r1.apply()
            r1 = 1
            goto L_0x00a2
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            if (r1 == 0) goto L_0x00ee
            r6 = -1
            java.lang.String r7 = "dynamic_background_version"
            int r6 = r0.getInt(r7, r6)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r8[r2] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r8[r4] = r9
            java.lang.String r9 = "alvinluo localVersion %d, currentVersion: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r8)
            if (r6 == r4) goto L_0x00e6
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r1[r4] = r6
            java.lang.String r6 = "alvinluo ignore crash because of new version"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r7, r4)
            r0.apply()
            yx2.C79167e.m95840d()
            m94792c(r4)
            r1 = 0
            goto L_0x00ee
        L_0x00e6:
            java.lang.String r0 = "alvinluo disable dynamicBackground because of crash"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            m94792c(r2)
        L_0x00ee:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            boolean r5 = f229930c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0[r2] = r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r4] = r1
            java.lang.String r1 = "alvinluo AppBrandDesktopConfig initEnableNativeDynamicBackground: %b, willCrash: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vx2.C78493o.m94790a():void");
    }

    /* renamed from: b */
    public static boolean m94791b() {
        Log.m105919d("MicroMsg.TaskBarConfig", "alvinluo isEnableNativeDynamicBackground %b, thread: %d", Boolean.valueOf(f229930c), Long.valueOf(Thread.currentThread().getId()));
        return f229930c;
    }

    /* renamed from: c */
    public static void m94792c(boolean z) {
        SharedPreferences defaultPreference;
        Log.m105925i("MicroMsg.TaskBarConfig", "alvinluo setEnableNativeDynamicBackground enable: %b", Boolean.valueOf(z));
        if (!(f229930c == z || (defaultPreference = MMApplicationContext.getDefaultPreference()) == null)) {
            defaultPreference.edit().putBoolean("enable_dynamic_background", z).apply();
        }
        f229930c = z;
    }
}
