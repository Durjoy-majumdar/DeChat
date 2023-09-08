package lg3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tencent.p014mm.autogen.events.VoipCallEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kj2.C117407d;
import oa1.C117731d;
import qg3.C47840i;

/* renamed from: lg3.d */
public class C88494d {

    /* renamed from: c */
    public static DisplayMetrics f255611c = null;

    /* renamed from: d */
    public static DisplayMetrics f255612d = null;

    /* renamed from: e */
    public static DisplayMetrics f255613e = null;

    /* renamed from: f */
    public static boolean f255614f = true;

    /* renamed from: g */
    public static float f255615g = 1.0f;

    /* renamed from: h */
    public static boolean f255616h;

    /* renamed from: i */
    public static int f255617i;

    /* renamed from: j */
    public static C46859b f255618j;

    /* renamed from: k */
    public static Boolean f255619k;

    /* renamed from: l */
    public static Boolean f255620l;

    /* renamed from: m */
    public static boolean f255621m;

    /* renamed from: n */
    public static boolean f255622n = true;

    /* renamed from: a */
    public Method f255623a = null;

    /* renamed from: b */
    public Field f255624b = null;

    /* renamed from: lg3.d$b */
    public interface C46859b {
    }

    /* renamed from: lg3.d$a */
    public class C88495a extends BroadcastReceiver {
        public C88495a() {
        }

        public void onReceive(Context context, Intent intent) {
            boolean z;
            boolean z2;
            boolean z3;
            if (intent.getAction().equalsIgnoreCase("android.intent.action.SCREEN_OFF")) {
                C88494d.this.getClass();
                VoipCallEvent voipCallEvent = new VoipCallEvent();
                voipCallEvent.publish();
                if (!voipCallEvent.f236298d.f236299a) {
                    C88494d.this.getClass();
                    boolean z4 = false;
                    if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_screen_adaptive_huawei_three", "1", false, true), 1) > 0) {
                        Log.m105924i("MicroMsg.MMDensityManager", "isOpenHuaWeiSpecial360!!");
                        z = true;
                    } else {
                        z = false;
                    }
                    Log.m105925i("MicroMsg.MMDensityManager", "isOpenHuaWeiSpecial360 change killSelfAndCallUp now:%s, original:%s", Boolean.valueOf(z), Boolean.valueOf(C88494d.m110352i()));
                    if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_screen_adaptive_huawei_four", "0", false, true), 1) > 0) {
                        Log.m105924i("MicroMsg.MMDensityManager", "isOpenHuaWeiSpecialAll!!");
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Log.m105925i("MicroMsg.MMDensityManager", "nowisOpenHuaWeiSpecialAll change killSelfAndCallUp now:%s, original:%s", Boolean.valueOf(z2), Boolean.valueOf(C88494d.m110353j()));
                    if ((z == C88494d.m110352i() && z2 == C88494d.m110353j()) ? false : true) {
                        C88494d.m110346a(C88494d.this, "densityChange");
                        return;
                    }
                    C88494d.this.getClass();
                    int i = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getInt("screenResolution_density_dpi_new", 0);
                    C85875k4.m106204s();
                    int i2 = C85875k4.m106204s().densityDpi;
                    if (i == 0) {
                        MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putInt("screenResolution_density_dpi_new", i2);
                    }
                    Log.m105925i("MicroMsg.MMDensityManager", "dancy densityChangeNew, mDensityDpi:%s,  mCurrentDensityDpi:%s", Integer.valueOf(i), Integer.valueOf(i2));
                    if (i == 0 || i == i2) {
                        z3 = false;
                    } else {
                        MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putInt("screenResolution_density_dpi_new", i2);
                        z3 = true;
                    }
                    if (z3) {
                        try {
                            if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_android_density_check_kill_enable", "1", false, true), 1) > 0) {
                                z4 = true;
                            }
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.MMDensityManager", e, "isOpenKillSelf", new Object[0]);
                        }
                        if (z4) {
                            Log.m105924i("MicroMsg.MMDensityManager", "killSelfAndCallUp ");
                            C88494d.m110346a(C88494d.this, "densityChange");
                        }
                    }
                }
            }
        }
    }

    static {
        String str = Build.BRAND;
        if (str != null) {
            String lowerCase = str.toLowerCase();
            if ((lowerCase.contains("huawei") || lowerCase.contains("honor")) && Build.VERSION.SDK_INT == 24) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88494d(android.util.DisplayMetrics r14) {
        /*
            r13 = this;
            r13.<init>()
            r0 = 0
            r13.f255623a = r0
            r13.f255624b = r0
            f255613e = r14
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r2 = "MicroMsg.MMDensityManager"
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0049
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "huawei"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x002a
            java.lang.String r1 = "honor"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0049
        L_0x002a:
            if (r14 == 0) goto L_0x0049
            int r0 = r14.widthPixels
            int r1 = r14.heightPixels
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 720(0x2d0, float:1.009E-42)
            if (r0 != r1) goto L_0x0049
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 == r1) goto L_0x0042
            r1 = 27
            if (r0 != r1) goto L_0x0049
        L_0x0042:
            java.lang.String r0 = "dancy huaweiSpecial 720!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            f255616h = r0
            int r0 = com.tencent.p014mm.p136ui.C85875k4.m106182g()
            f255617i = r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            if (r0 == 0) goto L_0x0075
            boolean r0 = m110354k()
            f255614f = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            r0.addAction(r1)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            lg3.d$a r5 = new lg3.d$a
            r5.<init>()
            r1.registerReceiver(r5, r0)
            goto L_0x00d8
        L_0x0075:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r0 == 0) goto L_0x00a8
            boolean r0 = m110354k()
            if (r0 == 0) goto L_0x00a4
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r1 = "clicfg_screen_adaptive_appbrand"
            java.lang.String r5 = "0"
            java.lang.String r0 = r0.mo182444f(r1, r5, r4, r3)     // Catch:{ Exception -> 0x0097 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)     // Catch:{ Exception -> 0x0097 }
            if (r0 <= 0) goto L_0x0095
            r0 = 1
            goto L_0x00a0
        L_0x0095:
            r0 = 0
            goto L_0x00a0
        L_0x0097:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r5 = "isOpenScreenAdaptiveForAppBrand"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r1)
            goto L_0x0095
        L_0x00a0:
            if (r0 == 0) goto L_0x00a4
            r0 = 1
            goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            f255614f = r0
            goto L_0x00d8
        L_0x00a8:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r0 == 0) goto L_0x00d8
            boolean r0 = m110354k()
            if (r0 == 0) goto L_0x00d5
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r1 = "clicfg_screen_adaptive_tool"
            java.lang.String r5 = "1"
            java.lang.String r0 = r0.mo182444f(r1, r5, r4, r3)     // Catch:{ Exception -> 0x00c8 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)     // Catch:{ Exception -> 0x00c8 }
            if (r0 <= 0) goto L_0x00d0
            r0 = 1
            goto L_0x00d1
        L_0x00c8:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r5 = "isOpenScreenAdaptiveForTool"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r1)
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            if (r0 == 0) goto L_0x00d5
            r0 = 1
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            f255614f = r0
        L_0x00d8:
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            boolean r5 = f255614f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1[r4] = r5
            boolean r5 = m110351h()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1[r3] = r5
            java.lang.String r5 = "openScreenAdaptive:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r5, r4)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            boolean r5 = m110351h()
            java.lang.String r6 = "screenResolution_isModifyDensity"
            r1.putBoolean(r6, r5)
            r1.commit()
            int r1 = m110350g()
            float r1 = (float) r1
            int r5 = com.tencent.p014mm.p136ui.C85875k4.m106202q()
            r6 = 600(0x258, float:8.41E-43)
            r7 = 1137180672(0x43c80000, float:400.0)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r5 < r6) goto L_0x0126
            r1 = 1143930880(0x442f0000, float:700.0)
            f255615g = r8
            goto L_0x0133
        L_0x0126:
            r6 = 533(0x215, float:7.47E-43)
            if (r5 < r6) goto L_0x012f
            r1 = 1142292480(0x44160000, float:600.0)
            f255615g = r8
            goto L_0x0133
        L_0x012f:
            float r5 = r7 / r1
            f255615g = r5
        L_0x0133:
            int r5 = r14.widthPixels
            int r6 = r14.heightPixels
            int r5 = java.lang.Math.min(r5, r6)
            float r6 = (float) r5
            float r9 = r6 / r1
            r10 = 4
            java.lang.Object[] r11 = new java.lang.Object[r10]
            int r12 = r14.widthPixels
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r4] = r12
            int r12 = r14.heightPixels
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r3] = r12
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r11[r0] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r12 = 3
            r11[r12] = r1
            java.lang.String r1 = "applyScreenAdaptiveDensity originWidth:%s, originheight:%s, targetField:%s, screenWidth:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r11)
            int r1 = com.tencent.p014mm.p136ui.C85875k4.m106178e()
            if (r1 == 0) goto L_0x01f2
            int r11 = f255617i
            if (r11 == 0) goto L_0x01f2
            if (r5 == 0) goto L_0x0172
            float r11 = (float) r11
            float r11 = r11 / r6
            goto L_0x0174
        L_0x0172:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x0174:
            int r6 = com.tencent.p014mm.p136ui.C85875k4.m106203r()
            if (r6 == r1) goto L_0x017f
            float r6 = (float) r6
            float r1 = (float) r1
            float r6 = r6 / r1
            float r8 = r6 * r11
        L_0x017f:
            r1 = 1064514355(0x3f733333, float:0.95)
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x0189
            r8 = 1064514355(0x3f733333, float:0.95)
        L_0x0189:
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106210y()
            r6 = 1067030938(0x3f99999a, float:1.2)
            r11 = 1069547520(0x3fc00000, float:1.5)
            if (r1 != 0) goto L_0x01a3
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106207v()
            if (r1 == 0) goto L_0x019b
            goto L_0x01a3
        L_0x019b:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x01a9
            r8 = 1067030938(0x3f99999a, float:1.2)
            goto L_0x01a9
        L_0x01a3:
            int r1 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x01a9
            r8 = 1069547520(0x3fc00000, float:1.5)
        L_0x01a9:
            float r1 = f255615g
            float r1 = r1 * r8
            f255615g = r1
            float r9 = r9 * r8
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Float r6 = java.lang.Float.valueOf(r9)
            r1[r4] = r6
            int r6 = com.tencent.p014mm.p136ui.C85875k4.m106178e()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r3] = r6
            int r6 = com.tencent.p014mm.p136ui.C85875k4.m106203r()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r0] = r6
            int r0 = f255617i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1[r10] = r0
            r0 = 5
            java.lang.Float r5 = java.lang.Float.valueOf(r8)
            r1[r0] = r5
            r0 = 6
            float r5 = f255615g
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1[r0] = r5
            java.lang.String r0 = "scale targetDensity:%s , DeviceDpi:%s, WindowDpi:%s, DeviceWidth:%s, DisplayWidth:%s, dpiScale:%s, systemScale:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r1)
        L_0x01f2:
            float r0 = r14.scaledDensity
            float r1 = r14.density
            float r0 = r0 / r1
            float r0 = r0 * r9
            r1 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 * r9
            int r1 = (int) r1
            android.util.DisplayMetrics r5 = new android.util.DisplayMetrics
            r5.<init>()
            r5.setTo(r14)
            r5.scaledDensity = r0
            r5.densityDpi = r1
            r5.density = r9
            f255611c = r5
            f255612d = r5
            boolean r0 = m110351h()
            if (r0 == 0) goto L_0x023c
            android.util.DisplayMetrics r0 = f255611c
            r14.setTo(r0)
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources$Theme r14 = r14.getTheme()
            android.content.res.Resources r14 = r14.getResources()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            android.util.DisplayMetrics r0 = f255611c
            r14.setTo(r0)
            java.lang.Object[] r14 = new java.lang.Object[r3]
            android.util.DisplayMetrics r0 = f255611c
            r14[r4] = r0
            java.lang.String r0 = " Target DisplayMetrics[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r14)
            goto L_0x0251
        L_0x023c:
            android.util.DisplayMetrics r0 = f255613e
            int r0 = r0.widthPixels
            int r14 = r14.heightPixels
            int r14 = java.lang.Math.min(r0, r14)
            float r14 = (float) r14
            android.util.DisplayMetrics r0 = f255613e
            float r1 = r0.density
            float r14 = r14 / r1
            float r7 = r7 / r14
            f255615g = r7
            f255611c = r0
        L_0x0251:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lg3.C88494d.<init>(android.util.DisplayMetrics):void");
    }

    /* renamed from: a */
    public static void m110346a(C88494d dVar, String str) {
        dVar.getClass();
        C117407d.INSTANCE.idkeyStat(1055, 1, 1, false);
        Log.m105925i("MicroMsg.MMDensityManager", "killSelfAndCallUp, mIcheckDensitylistener:%s", f255618j);
        C46859b bVar = f255618j;
        if (bVar != null) {
            ((C47840i) bVar).mo72582a();
        }
    }

    /* renamed from: c */
    public static boolean m110347c() {
        String str = Build.BRAND;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (f255622n) {
            return true;
        }
        if (m110353j() && C85875k4.m106206u()) {
            Log.m105924i("MicroMsg.MMDensityManager", "dancy huaweiSpecial all!!");
            return true;
        } else if (!m110352i() || !f255616h) {
            return str.contains("samsung") && Build.VERSION.SDK_INT == 23;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    public static DisplayMetrics m110348d() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(f255612d);
        return displayMetrics;
    }

    /* renamed from: f */
    public static float m110349f() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    /* renamed from: g */
    public static int m110350g() {
        return MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getInt("screenResolution_target_field", 400);
    }

    /* renamed from: h */
    public static boolean m110351h() {
        return f255614f && !m110347c();
    }

    /* renamed from: i */
    public static boolean m110352i() {
        if (f255620l == null) {
            try {
                if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_screen_adaptive_huawei_three", "1", false, true), 1) > 0) {
                    Log.m105924i("MicroMsg.MMDensityManager", "isOpenHuaWeiSpecial360!!");
                    f255620l = new Boolean(true);
                } else {
                    f255620l = new Boolean(false);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MMDensityManager", e, "isOpenHuaWeiSpecial360", new Object[0]);
                f255620l = new Boolean(false);
            }
        }
        return f255620l.booleanValue();
    }

    /* renamed from: j */
    public static boolean m110353j() {
        if (f255619k == null) {
            try {
                if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_screen_adaptive_huawei_four", "0", false, true), 1) > 0) {
                    Log.m105924i("MicroMsg.MMDensityManager", "isOpenHuaWeiSpecialAll!!");
                    f255619k = new Boolean(true);
                } else {
                    f255619k = new Boolean(false);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MMDensityManager", e, "isOpenHuaWeiSpecialAll", new Object[0]);
                f255619k = new Boolean(false);
            }
        }
        return f255619k.booleanValue();
    }

    /* renamed from: k */
    public static boolean m110354k() {
        try {
            return Util.getInt(C117731d.m166007c().mo182444f("clicfg_screen_adaptive", "1", false, true), 1) > 0;
        } catch (Exception | UnsatisfiedLinkError e) {
            Log.printErrStackTrace("MicroMsg.MMDensityManager", e, "isOpenScreenAdaptiveForMM", new Object[0]);
            return false;
        }
    }

    /* renamed from: n */
    public static void m110355n(int i) {
        MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putInt("screenResolution_target_field", i);
    }

    /* renamed from: b */
    public Configuration mo122940b(Configuration configuration) {
        if (!m110351h()) {
            return configuration;
        }
        Configuration configuration2 = new Configuration(configuration);
        configuration2.densityDpi = mo122941e().densityDpi;
        mo122942l();
        return configuration2;
    }

    /* renamed from: e */
    public DisplayMetrics mo122941e() {
        if (!m110351h()) {
            return f255613e;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(f255611c);
        return displayMetrics;
    }

    /* renamed from: l */
    public final void mo122942l() {
        try {
            DisplayMetrics e = mo122941e();
            if (this.f255623a == null) {
                Method declaredMethod = Bitmap.class.getDeclaredMethod("setDefaultDensity", new Class[]{Integer.TYPE});
                declaredMethod.setAccessible(true);
                this.f255623a = declaredMethod;
            }
            this.f255623a.invoke((Object) null, new Object[]{Integer.valueOf(e.densityDpi)});
            if (this.f255624b == null) {
                Field declaredField = DisplayMetrics.class.getDeclaredField("DENSITY_DEVICE");
                this.f255624b = declaredField;
                if (!f255621m) {
                    try {
                        declaredField.setAccessible(true);
                        Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                        declaredField2.setAccessible(true);
                        declaredField2.setInt(declaredField, declaredField.getModifiers() & -17);
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.MMDensityManager", e2, "", new Object[0]);
                        f255621m = true;
                    }
                }
            }
            this.f255624b.setInt((Object) null, e.densityDpi);
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.MMDensityManager", e3, "", new Object[0]);
        }
    }

    /* renamed from: m */
    public final String mo122943m(DisplayMetrics displayMetrics) {
        if (displayMetrics == null) {
            return "";
        }
        return String.format("scaledDensity:%s densityDpi:%s density:%s", new Object[]{Float.valueOf(displayMetrics.scaledDensity), Integer.valueOf(displayMetrics.densityDpi), Float.valueOf(displayMetrics.density)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ee, code lost:
        if ((kg3.C76577a.m92162m(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()) == 0.8f && m110350g() != 440) != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0145, code lost:
        if (r0 == false) goto L_0x015b;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122944o(android.content.res.Configuration r19, android.util.DisplayMetrics r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r3 = "screenResolution_density_dpi"
            r4 = 0
            int r0 = r0.getInt(r3, r4)
            com.tencent.p014mm.p136ui.C85875k4.m106204s()
            android.util.DisplayMetrics r5 = com.tencent.p014mm.p136ui.C85875k4.m106204s()
            int r5 = r5.densityDpi
            if (r0 != 0) goto L_0x002a
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r6)
            r6.putInt(r3, r5)
        L_0x002a:
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r7[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r9 = 1
            r7[r9] = r8
            java.lang.String r8 = "MicroMsg.MMDensityManager"
            java.lang.String r10 = "dancy test checkDensity, mDensityDpi:%s,  mCurrentDensityDpi:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r7)
            if (r0 == 0) goto L_0x0052
            if (r0 == r5) goto L_0x0052
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            r0.putInt(r3, r5)
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r0 != 0) goto L_0x0147
            boolean r0 = m110351h()
            if (r0 != 0) goto L_0x005d
            goto L_0x00f1
        L_0x005d:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r0 = kg3.C76577a.m92162m(r0)
            r12 = 1063256064(0x3f600000, float:0.875)
            r13 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x006f
            r0 = 0
            goto L_0x00c5
        L_0x006f:
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x0074
            goto L_0x00be
        L_0x0074:
            r12 = 1066275963(0x3f8e147b, float:1.11)
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x007d
            r0 = 2
            goto L_0x00c5
        L_0x007d:
            r12 = 1067450368(0x3fa00000, float:1.25)
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x0085
            r0 = 3
            goto L_0x00c5
        L_0x0085:
            r12 = 1068498944(0x3fb00000, float:1.375)
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x008d
            r0 = 4
            goto L_0x00c5
        L_0x008d:
            r12 = 1070596096(0x3fd00000, float:1.625)
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x00c4
            r12 = 1067869798(0x3fa66666, float:1.3)
            boolean r12 = kg3.C76577a.m92146B(r0, r12)
            if (r12 == 0) goto L_0x009d
            goto L_0x00c4
        L_0x009d:
            r12 = 1072693248(0x3ff00000, float:1.875)
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x00c2
            r12 = 1068540887(0x3fb0a3d7, float:1.38)
            boolean r12 = kg3.C76577a.m92146B(r0, r12)
            if (r12 == 0) goto L_0x00ad
            goto L_0x00c2
        L_0x00ad:
            r12 = 1073846682(0x4001999a, float:2.025)
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x00c0
            r12 = 1070092780(0x3fc851ec, float:1.565)
            boolean r0 = kg3.C76577a.m92146B(r0, r12)
            if (r0 == 0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r0 = 1
            goto L_0x00c5
        L_0x00c0:
            r0 = 7
            goto L_0x00c5
        L_0x00c2:
            r0 = 6
            goto L_0x00c5
        L_0x00c4:
            r0 = 5
        L_0x00c5:
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r12[r4] = r14
            java.lang.String r14 = "old version text index: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r14, r12)
            r12 = 440(0x1b8, float:6.17E-43)
            r14 = 1061997773(0x3f4ccccd, float:0.8)
            if (r0 != r9) goto L_0x00f3
            android.content.Context r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r15 = kg3.C76577a.m92162m(r15)
            int r15 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r15 != 0) goto L_0x00ed
            int r15 = m110350g()
            if (r15 == r12) goto L_0x00ed
            r15 = 1
            goto L_0x00ee
        L_0x00ed:
            r15 = 0
        L_0x00ee:
            if (r15 == 0) goto L_0x00f1
            goto L_0x00f3
        L_0x00f1:
            r0 = 0
            goto L_0x0145
        L_0x00f3:
            android.content.Context r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r15 = kg3.C76577a.m92162m(r15)
            int r15 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r15 != 0) goto L_0x0107
            int r15 = m110350g()
            if (r15 == r12) goto L_0x0107
            r15 = 1
            goto L_0x0108
        L_0x0107:
            r15 = 0
        L_0x0108:
            if (r15 == 0) goto L_0x010b
            r0 = 0
        L_0x010b:
            if (r0 == 0) goto L_0x0128
            switch(r0) {
                case 2: goto L_0x0124;
                case 3: goto L_0x0120;
                case 4: goto L_0x011d;
                case 5: goto L_0x0119;
                case 6: goto L_0x0115;
                case 7: goto L_0x0111;
                default: goto L_0x0110;
            }
        L_0x0110:
            goto L_0x012b
        L_0x0111:
            r13 = 1070805811(0x3fd33333, float:1.65)
            goto L_0x012b
        L_0x0115:
            r13 = 1069966950(0x3fc66666, float:1.55)
            goto L_0x012b
        L_0x0119:
            r13 = 1068708659(0x3fb33333, float:1.4)
            goto L_0x012b
        L_0x011d:
            r13 = 1066401792(0x3f900000, float:1.125)
            goto L_0x012b
        L_0x0120:
            r13 = 1066359849(0x3f8f5c29, float:1.12)
            goto L_0x012b
        L_0x0124:
            r13 = 1066192077(0x3f8ccccd, float:1.1)
            goto L_0x012b
        L_0x0128:
            r13 = 1061997773(0x3f4ccccd, float:0.8)
        L_0x012b:
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            kg3.C76577a.m92149E(r14, r13)
            r13 = 400(0x190, float:5.6E-43)
            if (r0 == 0) goto L_0x0141
            switch(r0) {
                case 2: goto L_0x013f;
                case 3: goto L_0x013f;
                case 4: goto L_0x013c;
                case 5: goto L_0x013c;
                case 6: goto L_0x013c;
                case 7: goto L_0x013c;
                default: goto L_0x0139;
            }
        L_0x0139:
            r12 = 400(0x190, float:5.6E-43)
            goto L_0x0141
        L_0x013c:
            r12 = 340(0x154, float:4.76E-43)
            goto L_0x0141
        L_0x013f:
            r12 = 360(0x168, float:5.04E-43)
        L_0x0141:
            m110355n(r12)
            r0 = 1
        L_0x0145:
            if (r0 == 0) goto L_0x015b
        L_0x0147:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            lg3.d$b r12 = f255618j
            r0[r4] = r12
            java.lang.String r12 = "checkDensity density change, mIcheckDensitylistener:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r0)
            lg3.d$b r0 = f255618j
            if (r0 == 0) goto L_0x015b
            qg3.i r0 = (qg3.C47840i) r0
            r0.mo72582a()
        L_0x015b:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r12 = "screenResolution_density_report_new"
            boolean r0 = r0.getBoolean(r12, r4)
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r13 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r13)
            java.lang.String r14 = "screenResolution_density_report_pad"
            boolean r13 = r13.getBoolean(r14, r4)
            r15 = 10
            r16 = 9
            r17 = 8
            java.lang.String r3 = "window"
            if (r0 != 0) goto L_0x021b
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x02eb }
            r0.<init>()     // Catch:{ Exception -> 0x02eb }
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x02eb }
            java.lang.Object r10 = r10.getSystemService(r3)     // Catch:{ Exception -> 0x02eb }
            android.view.WindowManager r10 = (android.view.WindowManager) r10     // Catch:{ Exception -> 0x02eb }
            android.view.Display r10 = r10.getDefaultDisplay()     // Catch:{ Exception -> 0x02eb }
            r10.getMetrics(r0)     // Catch:{ Exception -> 0x02eb }
            int r10 = r0.widthPixels     // Catch:{ Exception -> 0x02eb }
            int r5 = r0.heightPixels     // Catch:{ Exception -> 0x02eb }
            float r0 = r0.density     // Catch:{ Exception -> 0x02eb }
            android.util.DisplayMetrics r7 = r18.mo122941e()     // Catch:{ Exception -> 0x02eb }
            float r7 = r7.density     // Catch:{ Exception -> 0x02eb }
            int r11 = java.lang.Math.min(r10, r5)     // Catch:{ Exception -> 0x02eb }
            float r11 = (float) r11     // Catch:{ Exception -> 0x02eb }
            float r11 = r11 / r0
            int r11 = (int) r11     // Catch:{ Exception -> 0x02eb }
            kj2.d r6 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x02eb }
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x02eb }
            r9[r4] = r10     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x02eb }
            r10 = 1
            r9[r10] = r5     // Catch:{ Exception -> 0x02eb }
            java.lang.String r0 = java.lang.Float.toString(r0)     // Catch:{ Exception -> 0x02eb }
            r5 = 2
            r9[r5] = r0     // Catch:{ Exception -> 0x02eb }
            java.lang.String r0 = java.lang.Float.toString(r7)     // Catch:{ Exception -> 0x02eb }
            r5 = 3
            r9[r5] = r0     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x02eb }
            r5 = 4
            r9[r5] = r0     // Catch:{ Exception -> 0x02eb }
            int r0 = com.tencent.p014mm.p136ui.C85875k4.m106178e()     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02eb }
            r5 = 5
            r9[r5] = r0     // Catch:{ Exception -> 0x02eb }
            int r0 = com.tencent.p014mm.p136ui.C85875k4.m106203r()     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02eb }
            r5 = 6
            r9[r5] = r0     // Catch:{ Exception -> 0x02eb }
            int r0 = f255617i     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02eb }
            r5 = 7
            r9[r5] = r0     // Catch:{ Exception -> 0x02eb }
            android.util.DisplayMetrics r0 = f255613e     // Catch:{ Exception -> 0x02eb }
            int r5 = r0.widthPixels     // Catch:{ Exception -> 0x02eb }
            int r0 = r0.heightPixels     // Catch:{ Exception -> 0x02eb }
            int r0 = java.lang.Math.min(r5, r0)     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02eb }
            r9[r17] = r0     // Catch:{ Exception -> 0x02eb }
            float r0 = f255615g     // Catch:{ Exception -> 0x02eb }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ Exception -> 0x02eb }
            r9[r16] = r0     // Catch:{ Exception -> 0x02eb }
            r0 = 17089(0x42c1, float:2.3947E-41)
            r6.mo160131h(r0, r9)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()     // Catch:{ Exception -> 0x02eb }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)     // Catch:{ Exception -> 0x02eb }
            r5 = 1
            r0.putBoolean(r12, r5)     // Catch:{ Exception -> 0x02eb }
        L_0x021b:
            int r0 = com.tencent.p014mm.p136ui.C85875k4.m106178e()     // Catch:{ Exception -> 0x02eb }
            if (r0 == 0) goto L_0x0232
            int r0 = f255617i     // Catch:{ Exception -> 0x02eb }
            float r0 = (float) r0     // Catch:{ Exception -> 0x02eb }
            int r5 = com.tencent.p014mm.p136ui.C85875k4.m106178e()     // Catch:{ Exception -> 0x02eb }
            float r5 = (float) r5     // Catch:{ Exception -> 0x02eb }
            r6 = 1126170624(0x43200000, float:160.0)
            float r5 = r5 / r6
            float r0 = r0 / r5
            int r0 = java.lang.Math.round(r0)     // Catch:{ Exception -> 0x02eb }
            goto L_0x0233
        L_0x0232:
            r0 = 0
        L_0x0233:
            android.util.DisplayMetrics r5 = com.tencent.p014mm.p136ui.C85875k4.m106204s()     // Catch:{ Exception -> 0x02eb }
            int r6 = r5.heightPixels     // Catch:{ Exception -> 0x02eb }
            int r7 = r5.widthPixels     // Catch:{ Exception -> 0x02eb }
            int r6 = java.lang.Math.min(r6, r7)     // Catch:{ Exception -> 0x02eb }
            float r6 = (float) r6     // Catch:{ Exception -> 0x02eb }
            float r7 = r5.density     // Catch:{ Exception -> 0x02eb }
            float r6 = r6 / r7
            int r6 = java.lang.Math.round(r6)     // Catch:{ Exception -> 0x02eb }
            r7 = 550(0x226, float:7.71E-43)
            if (r6 < r7) goto L_0x024d
            r9 = 1
            goto L_0x024e
        L_0x024d:
            r9 = 0
        L_0x024e:
            if (r0 < r7) goto L_0x0252
            r7 = 1
            goto L_0x0253
        L_0x0252:
            r7 = 0
        L_0x0253:
            if (r7 != 0) goto L_0x0257
            if (r9 == 0) goto L_0x02f3
        L_0x0257:
            if (r13 != 0) goto L_0x02f3
            int r7 = r5.widthPixels     // Catch:{ Exception -> 0x02eb }
            int r9 = r5.heightPixels     // Catch:{ Exception -> 0x02eb }
            float r5 = r5.density     // Catch:{ Exception -> 0x02eb }
            android.util.DisplayMetrics r10 = r18.mo122941e()     // Catch:{ Exception -> 0x02eb }
            float r10 = r10.density     // Catch:{ Exception -> 0x02eb }
            int r11 = java.lang.Math.min(r7, r9)     // Catch:{ Exception -> 0x02eb }
            float r11 = (float) r11     // Catch:{ Exception -> 0x02eb }
            float r11 = r11 / r5
            int r11 = (int) r11     // Catch:{ Exception -> 0x02eb }
            kj2.d r12 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x02eb }
            r13 = 12
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02eb }
            r13[r4] = r0     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x02eb }
            r6 = 1
            r13[r6] = r0     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x02eb }
            r6 = 2
            r13[r6] = r0     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x02eb }
            r6 = 3
            r13[r6] = r0     // Catch:{ Exception -> 0x02eb }
            java.lang.String r0 = java.lang.Float.toString(r5)     // Catch:{ Exception -> 0x02eb }
            r5 = 4
            r13[r5] = r0     // Catch:{ Exception -> 0x02eb }
            java.lang.String r0 = java.lang.Float.toString(r10)     // Catch:{ Exception -> 0x02eb }
            r5 = 5
            r13[r5] = r0     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x02eb }
            r5 = 6
            r13[r5] = r0     // Catch:{ Exception -> 0x02eb }
            int r0 = com.tencent.p014mm.p136ui.C85875k4.m106178e()     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02eb }
            r5 = 7
            r13[r5] = r0     // Catch:{ Exception -> 0x02eb }
            int r0 = com.tencent.p014mm.p136ui.C85875k4.m106203r()     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02eb }
            r13[r17] = r0     // Catch:{ Exception -> 0x02eb }
            int r0 = f255617i     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02eb }
            r13[r16] = r0     // Catch:{ Exception -> 0x02eb }
            android.util.DisplayMetrics r0 = f255613e     // Catch:{ Exception -> 0x02eb }
            int r5 = r0.widthPixels     // Catch:{ Exception -> 0x02eb }
            int r0 = r0.heightPixels     // Catch:{ Exception -> 0x02eb }
            int r0 = java.lang.Math.min(r5, r0)     // Catch:{ Exception -> 0x02eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02eb }
            r13[r15] = r0     // Catch:{ Exception -> 0x02eb }
            r0 = 11
            float r5 = f255615g     // Catch:{ Exception -> 0x02eb }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x02eb }
            r13[r0] = r5     // Catch:{ Exception -> 0x02eb }
            r0 = 17305(0x4399, float:2.425E-41)
            r12.mo160131h(r0, r13)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()     // Catch:{ Exception -> 0x02eb }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)     // Catch:{ Exception -> 0x02eb }
            r5 = 1
            r0.putBoolean(r14, r5)     // Catch:{ Exception -> 0x02eb }
            goto L_0x02f3
        L_0x02eb:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r6, r5)
        L_0x02f3:
            boolean r0 = m110351h()
            if (r0 == 0) goto L_0x0349
            r18.mo122942l()
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object r3 = r5.getSystemService(r3)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r3 = r3.getDefaultDisplay()
            r3.getMetrics(r0)
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            android.util.DisplayMetrics r5 = f255611c
            java.lang.String r5 = r1.mo122943m(r5)
            r3[r4] = r5
            r4 = r20
            java.lang.String r4 = r1.mo122943m(r4)
            r5 = 1
            r3[r5] = r4
            java.lang.String r0 = r1.mo122943m(r0)
            r4 = 2
            r3[r4] = r0
            int r0 = r2.densityDpi
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 3
            r3[r4] = r0
            float r0 = r2.fontScale
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2 = 4
            r3[r2] = r0
            android.util.DisplayMetrics r0 = f255613e
            r2 = 5
            r3[r2] = r0
            java.lang.String r0 = " \n************************************************************************* \nTarget -> %s \nCurrent -> %s \nWindowManager -> %s \nConfiguration -> %s fontScale -> %s \noriginalMetric -> [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r3)
        L_0x0349:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lg3.C88494d.mo122944o(android.content.res.Configuration, android.util.DisplayMetrics):void");
    }
}
