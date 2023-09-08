package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.window.embedding.SplitController;
import com.eclipsesource.mmv8.Platform;
import com.huawei.easygo.sdk.EasyGo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch;
import com.tencent.p014mm.sdk.vendor.Honor;
import com.tencent.p014mm.sdk.vendor.Huawei;
import com.tencent.p014mm.sdk.vendor.MIUI;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kg3.C76577a;
import kj2.C117407d;
import lg3.C88494d;
import oa1.C117731d;
import p1057w2.C90885a;
import p156gj.C45918i0;
import p156gj.C87203t;
import p206nj.C11171e;
import p206nj.C47264o;
import p206nj.C76866m;

/* renamed from: com.tencent.mm.ui.k4 */
public class C85875k4 {

    /* renamed from: A */
    public static Boolean f250150A = null;

    /* renamed from: B */
    public static Boolean f250151B = null;

    /* renamed from: C */
    public static Boolean f250152C = null;

    /* renamed from: D */
    public static Boolean f250153D = null;

    /* renamed from: E */
    public static Boolean f250154E = null;

    /* renamed from: a */
    public static Rect f250155a = new Rect(0, 0, 0, 0);

    /* renamed from: b */
    public static boolean f250156b = false;

    /* renamed from: c */
    public static SparseArray<WindowInsets> f250157c = new SparseArray<>(4);

    /* renamed from: d */
    public static SparseArray<Rect> f250158d = new SparseArray<>(4);

    /* renamed from: e */
    public static final Object f250159e = new Object();

    /* renamed from: f */
    public static Boolean f250160f;

    /* renamed from: g */
    public static Boolean f250161g;

    /* renamed from: h */
    public static Boolean f250162h = null;

    /* renamed from: i */
    public static Boolean f250163i = null;

    /* renamed from: j */
    public static Boolean f250164j = null;

    /* renamed from: k */
    public static Boolean f250165k = null;

    /* renamed from: l */
    public static Boolean f250166l = null;

    /* renamed from: m */
    public static Boolean f250167m = null;

    /* renamed from: n */
    public static Boolean f250168n = null;

    /* renamed from: o */
    public static Boolean f250169o = null;

    /* renamed from: p */
    public static Boolean f250170p = null;

    /* renamed from: q */
    public static boolean f250171q = false;

    /* renamed from: r */
    public static boolean f250172r = false;

    /* renamed from: s */
    public static Boolean f250173s = null;

    /* renamed from: t */
    public static Boolean f250174t = null;

    /* renamed from: u */
    public static Boolean f250175u = null;

    /* renamed from: v */
    public static Boolean f250176v = null;

    /* renamed from: w */
    public static String f250177w = "xiaomi&28, redmi&28, samsung&28, vivo&28, oppo&29, huawei&29, honor&29, oneplus&29, meizu&24, smartisan&24, other&29";

    /* renamed from: x */
    public static boolean f250178x = false;

    /* renamed from: y */
    public static boolean f250179y = false;

    /* renamed from: z */
    public static Boolean f250180z = null;

    /* renamed from: com.tencent.mm.ui.k4$a */
    public class C85876a implements View.OnApplyWindowInsetsListener {

        /* renamed from: d */
        public final /* synthetic */ View f250181d;

        /* renamed from: e */
        public final /* synthetic */ View f250182e;

        public C85876a(View view, View view2) {
            this.f250181d = view;
            this.f250182e = view2;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f250181d.getLayoutParams();
            C85875k4.f250155a.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            View view2 = this.f250182e;
            view2.setPadding(view2.getPaddingLeft(), this.f250182e.getPaddingTop(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            return this.f250181d.onApplyWindowInsets(windowInsets);
        }
    }

    /* renamed from: A */
    public static boolean m106144A(Configuration configuration) {
        return (configuration.uiMode & 48) == 32;
    }

    /* renamed from: B */
    public static boolean m106145B(Resources resources) {
        if (!m106147D() && !m106146C()) {
            return false;
        }
        if (!m106149F()) {
            return m106211z();
        }
        if (resources != null) {
            return (resources.getConfiguration().uiMode & 48) == 32;
        }
        Log.m105924i("MicroMsg.UIUtils", "dancy test is not darkmode, activity is null ");
        return false;
    }

    /* renamed from: C */
    public static boolean m106146C() {
        if (m106150G() && !m106148E() && (m106152I() || m106151H())) {
            if (f250176v == null) {
                String str = null;
                f250176v = new Boolean(false);
                try {
                    str = C117731d.m166007c().mo182444f("clicfg_dark_mode_brand_api", f250177w, false, false);
                    Log.m105925i("MicroMsg.UIUtils", "dancy test darkModeUsableBrandAPI: %s", str);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.UIUtils", e, "darModeUsableBrandAPI", new Object[0]);
                }
                if (!Util.isNullOrNil(str)) {
                    String lowerCase = Build.BRAND.toLowerCase();
                    if (f250177w.contains(lowerCase)) {
                        for (String str2 : str.split(",")) {
                            if (str2.contains(lowerCase)) {
                                Log.m105925i("MicroMsg.UIUtils", "dancy test usable brandAPI: %s", str2);
                                String[] split = str2.split("&");
                                if (split.length >= 2 && !Util.isNullOrNil(split[1])) {
                                    try {
                                        int parseInt = Integer.parseInt(split[1]);
                                        Log.m105919d("MicroMsg.UIUtils", "dancy test api: %s", Integer.valueOf(parseInt));
                                        if (Build.VERSION.SDK_INT >= parseInt) {
                                            f250176v = new Boolean(true);
                                        }
                                    } catch (NumberFormatException e2) {
                                        Log.printErrStackTrace("MicroMsg.UIUtils", e2, "parse api error!", new Object[0]);
                                    }
                                }
                            }
                        }
                    } else if (str.contains("other") && Build.VERSION.SDK_INT >= 29) {
                        f250176v = new Boolean(true);
                    }
                }
            }
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                f250176v = new Boolean(true);
            }
            if (f250176v.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public static boolean m106147D() {
        return m106150G() && !m106148E() && (m106152I() || m106151H()) && Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: E */
    public static boolean m106148E() {
        if (f250175u == null) {
            f250175u = new Boolean(false);
            String lowerCase = C87203t.m108275k().toLowerCase();
            String f = C117731d.m166007c().mo182444f("clicfg_dark_mode_disable_device", "", false, true);
            if (!Util.isNullOrNil(f) && f.contains(lowerCase)) {
                Log.m105924i("MicroMsg.UIUtils", "isDarkModeDisableDevice ture!!!");
                Boolean bool = new Boolean(true);
                f250175u = bool;
                return bool.booleanValue();
            }
        }
        return f250175u.booleanValue();
    }

    /* renamed from: F */
    public static boolean m106149F() {
        if (!f250179y) {
            f250178x = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("dark_mode_follow_system", false);
            f250179y = true;
        }
        return f250178x;
    }

    /* renamed from: G */
    public static boolean m106150G() {
        if (f250173s == null) {
            try {
                if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_dark_mode_on", "1", false, true), 1) > 0) {
                    Log.m105924i("MicroMsg.UIUtils", "dancy test, isDarkModeOn!!");
                    f250173s = new Boolean(true);
                } else {
                    Log.m105924i("MicroMsg.UIUtils", "dancy test, isDarkModeOn close!!");
                    f250173s = new Boolean(false);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.UIUtils", e, "isDarkModeOn", new Object[0]);
                f250173s = new Boolean(false);
            }
        }
        return f250173s.booleanValue();
    }

    /* renamed from: H */
    public static boolean m106151H() {
        if (f250174t == null) {
            try {
                if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_dark_mode_unused_on", "1", false, false), 1) > 0) {
                    Log.m105924i("MicroMsg.UIUtils", "dancy test, isDarkModeUnusedOn!!");
                    f250174t = new Boolean(true);
                } else {
                    Log.m105924i("MicroMsg.UIUtils", "dancy test, isDarkModeUnusedOn close!!");
                    f250174t = new Boolean(false);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.UIUtils", e, "isDarkModeUnusedOn", new Object[0]);
                f250174t = new Boolean(false);
            }
        }
        return f250174t.booleanValue();
    }

    /* renamed from: I */
    public static boolean m106152I() {
        if (f250150A == null) {
            f250150A = Boolean.valueOf(MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("dark_mode_used", false));
        }
        return f250150A.booleanValue();
    }

    /* renamed from: J */
    public static boolean m106153J(float f, float f2) {
        return ((double) Math.abs(f - f2)) <= 1.0E-5d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m106154K(int r9) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.vendor.Huawei.ifHUAWEI()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x006f
            com.huawei.easygo.sdk.EasyGo r0 = com.tencent.p014mm.p136ui.C85811a5.f249921a
            int r0 = com.tencent.p014mm.p136ui.C85811a5.m106024a(r0, r9)
            if (r0 != r1) goto L_0x0013
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            if (r0 != 0) goto L_0x00b3
            com.huawei.easygo.sdk.EasyGo r0 = com.tencent.p014mm.p136ui.C85811a5.f249921a
            java.lang.String r4 = "EasyGo"
            if (r0 != 0) goto L_0x001e
        L_0x001c:
            r0 = 0
            goto L_0x006d
        L_0x001e:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "@int:taskId"
            r5.put(r6, r9)     // Catch:{ JSONException -> 0x0064 }
            r6 = 0
            java.lang.String r7 = "magicwindow"
            java.lang.String r8 = "isInMagicWindowMode"
            com.huawei.easygo.sdk.module.EasyGoRet r0 = r0.invokeSync(r7, r8, r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r0.code
            r5.append(r6)
            java.lang.String r6 = ""
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            android.os.Bundle r0 = r0.result
            java.lang.String r5 = "boolean"
            boolean r0 = r0.getBoolean(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "isInMagicWindow"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            goto L_0x006d
        L_0x0064:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x001c
        L_0x006d:
            if (r0 != 0) goto L_0x00b3
        L_0x006f:
            boolean r0 = com.tencent.p014mm.sdk.vendor.MIUI.isXiaoMi()
            if (r0 == 0) goto L_0x0082
            com.miui.easygo.sdk.EasyGo r0 = com.tencent.p014mm.p136ui.C85865h1.f250081a
            int r0 = com.tencent.p014mm.p136ui.C85865h1.m106131a(r0, r9)
            if (r0 != r1) goto L_0x007f
            r0 = 0
            goto L_0x0080
        L_0x007f:
            r0 = 1
        L_0x0080:
            if (r0 != 0) goto L_0x00b3
        L_0x0082:
            boolean r0 = p206nj.C76866m.m92677f()
            if (r0 == 0) goto L_0x00a0
            int r0 = com.tencent.p014mm.p136ui.C85930s4.m106241a(r9)
            if (r0 == r1) goto L_0x009d
            boolean r0 = m106171a0()
            if (r0 != 0) goto L_0x009b
            boolean r0 = m106169Z()
            if (r0 != 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r0 = 1
            goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            if (r0 != 0) goto L_0x00b3
        L_0x00a0:
            boolean r0 = p206nj.C76866m.m92674c()
            if (r0 == 0) goto L_0x00b2
            int r9 = com.tencent.p014mm.p136ui.C85985z2.m106329a(r9)
            if (r9 != r1) goto L_0x00ae
            r9 = 0
            goto L_0x00af
        L_0x00ae:
            r9 = 1
        L_0x00af:
            if (r9 == 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r2 = 0
        L_0x00b3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C85875k4.m106154K(int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0065  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m106155L(android.content.ContentResolver r4) {
        /*
            boolean r0 = p206nj.C76866m.m92673b()
            java.lang.String r1 = "error occur"
            r2 = 0
            if (r0 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            java.lang.String r0 = "hw_fold_display_mode_prepare"
            int r0 = android.provider.Settings.Global.getInt(r4, r0)     // Catch:{ Exception -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            java.lang.String r0 = "MicroMsg.huaweiUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x0016:
            r0 = 0
        L_0x0017:
            r3 = 1
            if (r0 == r3) goto L_0x0043
            boolean r0 = p206nj.C76866m.m92672a()
            if (r0 != 0) goto L_0x0021
            goto L_0x002d
        L_0x0021:
            java.lang.String r0 = "hn_fold_display_mode_prepare"
            int r0 = android.provider.Settings.Global.getInt(r4, r0)     // Catch:{ Exception -> 0x0028 }
            goto L_0x002e
        L_0x0028:
            java.lang.String r0 = "MicroMsg.HonorUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x002d:
            r0 = 0
        L_0x002e:
            if (r0 == r3) goto L_0x0043
            java.lang.String r0 = "device_posture"
            int r4 = android.provider.Settings.Global.getInt(r4, r0, r2)     // Catch:{ Exception -> 0x0037 }
            goto L_0x003d
        L_0x0037:
            java.lang.String r4 = "MicroMsg.MIUIUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            r4 = 0
        L_0x003d:
            r0 = 3
            if (r4 != r0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r4 = 0
            goto L_0x0044
        L_0x0043:
            r4 = 1
        L_0x0044:
            boolean r0 = m106169Z()
            if (r0 != 0) goto L_0x0056
            boolean r0 = m106210y()
            if (r0 != 0) goto L_0x0056
            boolean r0 = m106166W()
            if (r0 == 0) goto L_0x0066
        L_0x0056:
            if (r4 != 0) goto L_0x0065
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r4 = com.tencent.p014mm.p136ui.C85878m2.m106214c(r4)
            if (r4 != 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r4 = 0
            goto L_0x0066
        L_0x0065:
            r4 = 1
        L_0x0066:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0[r2] = r1
            java.lang.String r1 = "MicroMsg.UIUtils"
            java.lang.String r2 = "fold isExpand:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C85875k4.m106155L(android.content.ContentResolver):boolean");
    }

    /* renamed from: M */
    public static boolean m106156M(Context context) {
        return C85811a5.m106027d(context) || C85865h1.m106133c(context) || context.getResources().getConfiguration().toString().contains("oplus-magic-window") || (m106199o0() && m106155L(context.getContentResolver()));
    }

    /* renamed from: N */
    public static boolean m106157N() {
        if (!m106160Q() && !m106161R()) {
            if (f250165k == null) {
                String str = Build.BRAND;
                if (Util.isNullOrNil(str) || !str.toLowerCase().contains("royole")) {
                    f250165k = new Boolean(false);
                } else {
                    String k = C87203t.m108275k();
                    if (Util.isEqual(k, "Royole FlexPai 2") || Util.isEqual(k, "ROYOLE Flexi")) {
                        Log.m105924i("MicroMsg.UIUtils", "isRoyoleFoldableDevice!!!");
                        f250165k = new Boolean(true);
                    } else {
                        f250165k = new Boolean(false);
                    }
                }
            }
            return f250165k.booleanValue() || m106166W() || m106164U() || m106159P() || m106169Z();
        }
    }

    /* renamed from: O */
    public static boolean m106158O() {
        Class<String> cls = String.class;
        if (f250169o == null) {
            try {
                Class<?> cls2 = Class.forName("com.huawei.android.os.SystemPropertiesEx");
                boolean z = true;
                if (!"tablet".equals(cls2.getMethod("get", new Class[]{cls, cls}).invoke(cls2.newInstance(), new Object[]{"ro.build.characteristics", ""}))) {
                    if (!MMApplicationContext.getContext().getPackageManager().hasSystemFeature("com.huawei.software.features.pad")) {
                        z = false;
                    }
                }
                f250169o = new Boolean(z);
            } catch (Exception unused) {
                f250169o = new Boolean(false);
            }
        }
        return f250169o.booleanValue();
    }

    /* renamed from: P */
    public static boolean m106159P() {
        if (f250163i == null) {
            if (Honor.INSTANCE.ifHONOR()) {
                if ("HNMGI".equalsIgnoreCase(Build.DEVICE)) {
                    String str = Build.MODEL;
                    if ("DIA-AN00".equalsIgnoreCase(str) || "MGI-AN00".equalsIgnoreCase(str)) {
                        f250163i = new Boolean(true);
                    }
                }
                if (MMApplicationContext.getContext().getPackageManager().hasSystemFeature("com.hihonor.hardware.sensor.posture")) {
                    f250163i = new Boolean(true);
                } else {
                    f250163i = new Boolean(false);
                }
            } else {
                f250163i = new Boolean(false);
            }
        }
        return f250163i.booleanValue();
    }

    /* renamed from: Q */
    public static boolean m106160Q() {
        if (f250162h == null) {
            if (!Huawei.ifHUAWEI() || m106158O()) {
                f250162h = new Boolean(false);
            } else {
                String str = Build.DEVICE;
                if (str.equals("HWBAL") || str.equals("unknownQTZ") || str.equals("HWBAL-QL")) {
                    f250162h = new Boolean(false);
                } else if (str.equals("HWTAH") || str.equals("HWTAH-C") || str.equals("unknownRLI") || str.equals("unknownTXL") || str.equals("unknownRHA") || str.equals("HWTET")) {
                    f250162h = new Boolean(true);
                } else if (MMApplicationContext.getContext().getPackageManager().hasSystemFeature("com.huawei.hardware.sensor.posture")) {
                    f250162h = new Boolean(true);
                } else {
                    f250162h = new Boolean(false);
                }
            }
        }
        return f250162h.booleanValue();
    }

    /* renamed from: R */
    public static boolean m106161R() {
        int i;
        if (f250164j == null) {
            if (MIUI.isXiaoMi()) {
                boolean z = true;
                try {
                    i = ((Integer) C45918i0.f123898c.invoke((Object) null, new Object[]{"persist.sys.muiltdisplay_type", 0})).intValue();
                } catch (Exception e) {
                    try {
                        Log.printErrStackTrace("MicroMsg.SystemProperties", e, "", new Object[0]);
                        i = 0;
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.UIUtils", e2, "get muiltdisplay_type failed", new Object[0]);
                        f250164j = new Boolean(false);
                    }
                }
                if (i != 2) {
                    z = false;
                }
                f250164j = new Boolean(z);
            } else {
                f250164j = new Boolean(false);
            }
        }
        return f250164j.booleanValue();
    }

    /* renamed from: S */
    public static boolean m106162S() {
        if (!MIUI.isXiaoMi()) {
            return false;
        }
        String str = Build.DEVICE;
        return str.equals("enuma") || str.equals("elish") || str.equals("nabu");
    }

    /* renamed from: T */
    public static boolean m106163T() {
        return C117731d.m166007c().mo182445g("clicfg_multitask_mode_enable", true, true);
    }

    /* renamed from: U */
    public static boolean m106164U() {
        if (f250167m == null) {
            f250167m = new Boolean(MMApplicationContext.getContext().getPackageManager().hasSystemFeature("oplus.feature.largescreen.land") || MMApplicationContext.getContext().getPackageManager().hasSystemFeature("oplus.feature.largescreen.port"));
        }
        return f250167m.booleanValue();
    }

    /* renamed from: V */
    public static boolean m106165V() {
        return MMApplicationContext.getContext().getPackageManager().hasSystemFeature("oplus.hardware.type.tablet");
    }

    /* renamed from: W */
    public static boolean m106166W() {
        if (f250166l == null) {
            String str = Build.BRAND;
            if (Util.isNullOrNil(str) || !str.toLowerCase().contains("samsung")) {
                f250166l = new Boolean(false);
            } else {
                String k = C87203t.m108275k();
                if (k.contains("SM-F9") || k.contains("SM-W202") || k.contains("SM-W90")) {
                    Log.m105924i("MicroMsg.UIUtils", "isSamsungFoldableDevice!!!");
                    f250166l = new Boolean(true);
                } else {
                    f250166l = new Boolean(false);
                }
            }
        }
        return f250166l.booleanValue();
    }

    /* renamed from: X */
    public static boolean m106167X() {
        return (MMApplicationContext.getContext().getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[RETURN, SYNTHETIC] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m106168Y() {
        /*
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0121
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r4 = "oppo"
            boolean r5 = r1.contains(r4)
            java.lang.String r6 = "meizu"
            java.lang.String r7 = "samsung"
            java.lang.String r8 = "honor"
            java.lang.String r9 = "huawei"
            java.lang.String r10 = "xiaomi"
            java.lang.String r11 = "vivo"
            r12 = 27
            if (r5 != 0) goto L_0x0052
            boolean r5 = r1.contains(r11)
            if (r5 != 0) goto L_0x0052
            boolean r5 = r1.contains(r10)
            if (r5 != 0) goto L_0x0052
            boolean r5 = r1.contains(r9)
            if (r5 != 0) goto L_0x0052
            boolean r5 = r1.contains(r8)
            if (r5 != 0) goto L_0x0052
            boolean r5 = r1.contains(r7)
            if (r5 != 0) goto L_0x0052
            boolean r5 = r1.contains(r6)
            if (r5 == 0) goto L_0x004d
            goto L_0x0052
        L_0x004d:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 > r12) goto L_0x0121
            goto L_0x0073
        L_0x0052:
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x0063
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 == r12) goto L_0x0073
            boolean r0 = com.tencent.p014mm.sdk.vendor.Oppo.isUnDefaultFont()
            if (r0 == 0) goto L_0x0121
            goto L_0x0073
        L_0x0063:
            boolean r1 = r1.contains(r11)
            if (r1 != 0) goto L_0x006f
            boolean r1 = p206nj.C88960n.m111088a()
            if (r1 == 0) goto L_0x0076
        L_0x006f:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 > r12) goto L_0x0076
        L_0x0073:
            r2 = 1
            goto L_0x0121
        L_0x0076:
            boolean r1 = f250172r
            if (r1 != 0) goto L_0x011b
            f250172r = r3
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0101
            java.lang.String r0 = r0.toLowerCase()
            boolean r1 = r0.contains(r10)
            if (r1 == 0) goto L_0x009e
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = "/data/system/theme/fonts/"
            java.lang.String r5 = "Roboto-Regular.ttf"
            r1.<init>((java.lang.String) r4, (java.lang.String) r5)
            boolean r4 = r1.mo119967g()
            java.lang.String r1 = r1.mo119971i()
            goto L_0x0104
        L_0x009e:
            boolean r1 = r0.contains(r9)
            if (r1 != 0) goto L_0x00ef
            boolean r1 = r0.contains(r8)
            if (r1 == 0) goto L_0x00ab
            goto L_0x00ef
        L_0x00ab:
            boolean r1 = r0.contains(r7)
            if (r1 == 0) goto L_0x00d7
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = "sans.loc"
            java.lang.String r5 = "/data/app_fonts/0/"
            r1.<init>((java.lang.String) r5, (java.lang.String) r4)
            boolean r5 = m106170a(r1)
            java.lang.String r1 = r1.mo119971i()
            if (r5 != 0) goto L_0x00d5
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r5 = "/data/user/0/com.android.settings/app_fonts/"
            r1.<init>((java.lang.String) r5, (java.lang.String) r4)
            boolean r4 = m106170a(r1)
            java.lang.String r1 = r1.mo119971i()
            goto L_0x0104
        L_0x00d5:
            r4 = r5
            goto L_0x0104
        L_0x00d7:
            boolean r1 = r0.contains(r6)
            if (r1 == 0) goto L_0x0101
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = "/data/data/com.meizu.customizecenter/font/"
            java.lang.String r5 = "flymeFont.ttf"
            r1.<init>((java.lang.String) r4, (java.lang.String) r5)
            boolean r4 = r1.mo119967g()
            java.lang.String r1 = r1.mo119971i()
            goto L_0x0104
        L_0x00ef:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = "/data/skin/fonts/"
            java.lang.String r5 = "DroidSansChinese.ttf"
            r1.<init>((java.lang.String) r4, (java.lang.String) r5)
            boolean r4 = r1.mo119967g()
            java.lang.String r1 = r1.mo119971i()
            goto L_0x0104
        L_0x0101:
            java.lang.String r1 = ""
            r4 = 0
        L_0x0104:
            f250171q = r4
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r5[r3] = r0
            r0 = 2
            r5[r0] = r1
            java.lang.String r0 = "MicroMsg.UIUtils"
            java.lang.String r1 = "isCustomFont:[ %s, %b, %s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r5)
        L_0x011b:
            boolean r0 = f250171q
            if (r0 == 0) goto L_0x0121
            goto L_0x0073
        L_0x0121:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C85875k4.m106168Y():boolean");
    }

    /* renamed from: Z */
    public static boolean m106169Z() {
        if (f250168n == null) {
            if (Util.isEqual(C45918i0.m51188a("ro.vivo.device.type"), "foldable")) {
                f250168n = new Boolean(true);
            } else {
                f250168n = new Boolean(false);
            }
        }
        return f250168n.booleanValue();
    }

    /* renamed from: a */
    public static boolean m106170a(C86009m1 m1Var) {
        if (m1Var.mo119967g()) {
            try {
                String N = C86013q1.m106432N(m1Var.mo119971i());
                if (!Util.isNullOrNil(N)) {
                    return !N.contains("default#default");
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a0 */
    public static boolean m106171a0() {
        return Util.isEqual(C45918i0.m51188a("ro.vivo.device.type"), "tablet");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.ViewGroup m106172b(android.view.Window r7, android.view.View r8) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            hj.b r1 = new hj.b
            java.lang.String r2 = "mContentRoot"
            r1.<init>(r7, r2, r0)
            r1.mo121999b()
            java.lang.reflect.Field r2 = r1.f253583d
            r3 = 0
            if (r2 == 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r2 == 0) goto L_0x002d
            java.lang.Object r1 = r1.mo121998a()     // Catch:{ NoSuchFieldException -> 0x0023, IllegalAccessException -> 0x0021, IllegalArgumentException -> 0x001f }
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ NoSuchFieldException -> 0x0023, IllegalAccessException -> 0x0021, IllegalArgumentException -> 0x001f }
            goto L_0x002e
        L_0x001f:
            r1 = move-exception
            goto L_0x0024
        L_0x0021:
            r1 = move-exception
            goto L_0x0024
        L_0x0023:
            r1 = move-exception
        L_0x0024:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = "MicroMsg.UIUtils"
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r5, r2)
        L_0x002d:
            r1 = r0
        L_0x002e:
            if (r1 == 0) goto L_0x0031
            return r1
        L_0x0031:
            if (r8 == 0) goto L_0x0047
            android.view.ViewParent r8 = r8.getParent()
        L_0x0037:
            android.view.View r1 = r7.getDecorView()
            if (r8 == r1) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            android.view.ViewParent r0 = r8.getParent()
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x0037
        L_0x0047:
            if (r0 != 0) goto L_0x005f
            android.view.View r8 = r7.getDecorView()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            android.view.View r8 = r8.getChildAt(r3)
            boolean r1 = r8 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x005a
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            return r8
        L_0x005a:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.clearFlags(r8)
        L_0x005f:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C85875k4.m106172b(android.view.Window, android.view.View):android.view.ViewGroup");
    }

    /* renamed from: b0 */
    public static void m106173b0(Window window, boolean z) {
        if (window != null && window.getDecorView() != null && Build.VERSION.SDK_INT >= 26) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility | 16 : systemUiVisibility & -17);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: float[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] m106174c(android.graphics.Bitmap r17, int r18, int r19) {
        /*
            r8 = r18
            r9 = r19
            r10 = 0
            r0 = r17
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r8, r9, r10)
            int r11 = r8 * r9
            int[] r12 = new int[r11]
            r2 = 0
            r4 = 0
            r5 = 0
            r1 = r12
            r3 = r18
            r6 = r18
            r7 = r19
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
            float[][] r0 = new float[r11][]
            r1 = 0
        L_0x001f:
            r2 = 3
            if (r1 >= r11) goto L_0x002e
            float[] r2 = new float[r2]
            r3 = r12[r1]
            android.graphics.Color.colorToHSV(r3, r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L_0x001f
        L_0x002e:
            r1 = 8
            int[] r1 = new int[r1]
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r4 = 0
        L_0x0038:
            r5 = 7
            r6 = 1
            if (r4 >= r11) goto L_0x0070
            r7 = 1
        L_0x003d:
            if (r7 > r5) goto L_0x006d
            r12 = r0[r4]
            r12 = r12[r10]
            r13 = 1135869952(0x43b40000, float:360.0)
            float r14 = (float) r7
            r15 = 1088421888(0x40e00000, float:7.0)
            float r14 = r14 / r15
            float r14 = r14 * r13
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x006a
            r5 = r1[r7]
            int r5 = r5 + r6
            r1[r7] = r5
            java.lang.Object r5 = r3.get(r7)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0061
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0061:
            r6 = r0[r4]
            r5.add(r6)
            r3.put(r7, r5)
            goto L_0x006d
        L_0x006a:
            int r7 = r7 + 1
            goto L_0x003d
        L_0x006d:
            int r4 = r4 + 1
            goto L_0x0038
        L_0x0070:
            r0 = -1
            r4 = 1
            r7 = 0
        L_0x0073:
            if (r4 > r5) goto L_0x007e
            r11 = r1[r4]
            if (r11 <= r7) goto L_0x007b
            r0 = r4
            r7 = r11
        L_0x007b:
            int r4 = r4 + 1
            goto L_0x0073
        L_0x007e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r0 = r3.get(r0, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            int r3 = java.lang.Math.max(r18, r19)
            r4 = 1036831949(0x3dcccccd, float:0.1)
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r11 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            r5 = 2
            if (r1 <= r3) goto L_0x00df
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3 = 0
            r9 = 0
        L_0x00a3:
            int r13 = r0.size()
            if (r9 >= r13) goto L_0x00c5
            java.lang.Object r13 = r0.get(r9)
            float[] r13 = (float[]) r13
            r13 = r13[r5]
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c2
            java.lang.Object r1 = r0.get(r9)
            float[] r1 = (float[]) r1
            r3 = r1[r5]
            r16 = r3
            r3 = r1
            r1 = r16
        L_0x00c2:
            int r9 = r9 + 1
            goto L_0x00a3
        L_0x00c5:
            r0 = r3[r5]
            double r13 = (double) r0
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x00cd
            goto L_0x00eb
        L_0x00cd:
            r1 = r3[r6]
            double r13 = (double) r1
            int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00db
            float r1 = r1 - r4
            r3[r6] = r1
            float r0 = r0 - r4
            r3[r5] = r0
            goto L_0x00eb
        L_0x00db:
            float r0 = r0 - r4
            r3[r5] = r0
            goto L_0x00eb
        L_0x00df:
            java.lang.Object r0 = r0.get(r10)
            r3 = r0
            float[] r3 = (float[]) r3
            r0 = 1041865114(0x3e19999a, float:0.15)
            r3[r5] = r0
        L_0x00eb:
            float[] r0 = new float[r2]
            r1 = r3[r5]
            double r13 = (double) r1
            r2 = 1056964608(0x3f000000, float:0.5)
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 > 0) goto L_0x0105
            r7 = r3[r10]
            r0[r10] = r7
            r7 = r3[r6]
            r0[r6] = r7
            r7 = 1060320051(0x3f333333, float:0.7)
            float r1 = r1 + r7
            r0[r5] = r1
            goto L_0x011c
        L_0x0105:
            r9 = r3[r10]
            r0[r10] = r9
            r9 = r3[r6]
            r0[r6] = r9
            double r11 = (double) r1
            double r11 = r11 + r7
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0119
            float r1 = r1 - r2
            r0[r5] = r1
            goto L_0x011c
        L_0x0119:
            float r1 = r1 + r2
            r0[r5] = r1
        L_0x011c:
            r1 = r0[r6]
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0125
            float r1 = r1 - r4
            r0[r6] = r1
        L_0x0125:
            int[] r1 = new int[r5]
            int r2 = android.graphics.Color.HSVToColor(r3)
            r1[r10] = r2
            int r0 = android.graphics.Color.HSVToColor(r0)
            r1[r6] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C85875k4.m106174c(android.graphics.Bitmap, int, int):int[]");
    }

    /* renamed from: c0 */
    public static boolean m106175c0(Window window, boolean z) {
        if (window == null || window.getDecorView() == null || Build.VERSION.SDK_INT < 23 || (MIUI.isMIUI() && MIUI.isMIUIV8())) {
            return false;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
        return true;
    }

    /* renamed from: d */
    public static int m106176d(int i) {
        int i2;
        int i3;
        int i4;
        if (!m106211z()) {
            return i;
        }
        float[] fArr = new float[3];
        ThreadLocal<double[]> threadLocal = C90885a.f260864a;
        C90885a.m113996a(Color.red(i), Color.green(i), Color.blue(i), fArr);
        float f = fArr[2];
        if (((double) f) >= 0.45d) {
            return i;
        }
        float f2 = 1.0f - f;
        if (((double) f2) > 0.8d) {
            f2 = 0.8f;
        }
        float f3 = fArr[0];
        float abs = (1.0f - Math.abs((f2 * 2.0f) - 1.0f)) * fArr[1];
        float f4 = f2 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f3 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f3) / 60) {
            case 0:
                i4 = Math.round((abs + f4) * 255.0f);
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                break;
            case 1:
                i4 = Math.round((abs2 + f4) * 255.0f);
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                break;
            case 2:
                i4 = Math.round(f4 * 255.0f);
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                i4 = Math.round(f4 * 255.0f);
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                i4 = Math.round((abs2 + f4) * 255.0f);
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                i4 = Math.round((abs + f4) * 255.0f);
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                i2 = 0;
                i4 = 0;
                i3 = 0;
                break;
        }
        return Color.rgb(C90885a.m114005j(i4, 0, 255), C90885a.m114005j(i3, 0, 255), C90885a.m114005j(i2, 0, 255));
    }

    /* renamed from: d0 */
    public static void m106177d0(Window window) {
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    /* renamed from: e */
    public static int m106178e() {
        Integer num = 0;
        try {
            Method declaredMethod = Class.forName("android.view.WindowManagerGlobal").getDeclaredMethod("getWindowManagerService", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            Method declaredMethod2 = invoke.getClass().getDeclaredMethod("getInitialDisplayDensity", new Class[]{Integer.TYPE});
            declaredMethod2.setAccessible(true);
            num = (Integer) declaredMethod2.invoke(invoke, new Object[]{num});
        } catch (Exception e) {
            Log.m105921e("MicroMsg.UIUtils", "Exception:%s", e);
        }
        return num.intValue();
    }

    /* renamed from: e0 */
    public static boolean m106179e0(View view, View view2) {
        if (!C11171e.m11046c(21)) {
            return true;
        }
        if (view == null || !(view instanceof ViewGroup) || view2 == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return false;
        }
        view.setOnApplyWindowInsetsListener(new C85876a(view, view2));
        return true;
    }

    /* renamed from: f */
    public static int m106180f() {
        Display.Mode[] supportedModes;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getMetrics(displayMetrics);
        int i = 0;
        if (Build.VERSION.SDK_INT >= 23 && (supportedModes = defaultDisplay.getSupportedModes()) != null && supportedModes.length > 0) {
            int max = Math.max(supportedModes[0].getPhysicalWidth(), supportedModes[0].getPhysicalHeight());
            Log.m105925i("MicroMsg.UIUtils", "getDeviceHeight:%s", Integer.valueOf(max));
            if (supportedModes.length > 1) {
                int max2 = Math.max(supportedModes[1].getPhysicalWidth(), supportedModes[1].getPhysicalHeight());
                if (max2 > 0 && max > 1440 && max2 >= max) {
                    max = max2;
                }
                Log.m105925i("MicroMsg.UIUtils", "getDeviceHeightTwo:%s", Integer.valueOf(max2));
            }
            i = max;
        }
        if (i == 0) {
            C117407d.INSTANCE.idkeyStat(1055, 2, 1, false);
        }
        return i;
    }

    /* renamed from: f0 */
    public static boolean m106181f0(Context context) {
        if (context == null) {
            return false;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getRealSize(point);
        defaultDisplay.getSize(point2);
        return ((double) ((((float) point.x) * 1.0f) / ((float) point2.x))) >= 1.7d || ((double) ((((float) point.y) * 1.0f) / ((float) point2.y))) >= 1.7d;
    }

    /* renamed from: g */
    public static int m106182g() {
        int i;
        Display.Mode[] supportedModes;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getMetrics(displayMetrics);
        if (Build.VERSION.SDK_INT < 23 || (supportedModes = defaultDisplay.getSupportedModes()) == null || supportedModes.length <= 0) {
            i = 0;
        } else {
            i = Math.min(supportedModes[0].getPhysicalWidth(), supportedModes[0].getPhysicalHeight());
            Log.m105925i("MicroMsg.UIUtils", "getDeviceWidthOne:%s", Integer.valueOf(i));
            if (supportedModes.length > 1) {
                int min = Math.min(supportedModes[1].getPhysicalWidth(), supportedModes[1].getPhysicalHeight());
                if (min > 0 && i > 1440 && min < i) {
                    i = min;
                }
                Log.m105925i("MicroMsg.UIUtils", "getDeviceWidthTwo:%s", Integer.valueOf(min));
            }
        }
        if (i == 0) {
            C117407d.INSTANCE.idkeyStat(1055, 2, 1, false);
        }
        if (m106160Q() && !m106208w() && m106185h0(displayMetrics) != 0) {
            i = m106185h0(displayMetrics);
        }
        Log.m105925i("MicroMsg.UIUtils", "getDeviceWidth:%s", Integer.valueOf(i));
        return i;
    }

    /* renamed from: g0 */
    public static int m106183g0(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return ((((int) ((((float) (i & 255)) * f) + (((float) (i2 & 255)) * f2))) & 255) << 0) | ((((int) ((((float) ((i >> 24) & 255)) * f) + (((float) ((i2 >> 24) & 255)) * f2))) & 255) << 24) | ((((int) ((((float) ((i >> 16) & 255)) * f) + (((float) ((i2 >> 16) & 255)) * f2))) & 255) << 16) | ((((int) ((((float) ((i >> 8) & 255)) * f) + (((float) ((i2 >> 8) & 255)) * f2))) & 255) << 8);
    }

    /* renamed from: h */
    public static Point m106184h(Context context) {
        Point point = new Point();
        if (context == null) {
            return point;
        }
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    /* renamed from: h0 */
    public static int m106185h0(DisplayMetrics displayMetrics) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField("noncompatWidthPixels");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(displayMetrics)).intValue();
            Field declaredField2 = DisplayMetrics.class.getDeclaredField("noncompatHeightPixels");
            declaredField2.setAccessible(true);
            int intValue2 = ((Integer) declaredField2.get(displayMetrics)).intValue();
            Log.m105925i("MicroMsg.UIUtils", "noncompatWidth, width:%s, height:%s", Integer.valueOf(intValue), Integer.valueOf(intValue2));
            return Math.min(intValue, intValue2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.UIUtils", e, "", new Object[0]);
            return 0;
        }
    }

    /* renamed from: i */
    public static Point m106186i(Context context) {
        Point point = new Point();
        if (context == null) {
            return point;
        }
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    /* renamed from: i0 */
    public static void m106187i0(Activity activity, int i) {
        if (activity != null) {
            try {
                if (activity.getWindow() != null) {
                    activity.getWindow().addFlags(Integer.MIN_VALUE);
                    activity.getWindow().setStatusBarColor(i);
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.UIUtils", th, "", new Object[0]);
            }
        }
    }

    /* renamed from: j */
    public static int m106188j(Context context) {
        int identifier;
        if (!m106190k(context) || (identifier = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", Platform.ANDROID)) <= 0) {
            return 0;
        }
        return Resources.getSystem().getDimensionPixelSize(identifier);
    }

    /* renamed from: j0 */
    public static void m106189j0(Paint paint, float f) {
        if (paint != null) {
            if (!m106168Y()) {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setStrokeWidth(f);
            } else if (f == 0.8f) {
                paint.setFakeBoldText(true);
            }
        }
    }

    /* renamed from: k */
    public static boolean m106190k(Context context) {
        return m106192l(context) > 0;
    }

    /* renamed from: k0 */
    public static void m106191k0(Paint paint) {
        if (paint != null) {
            if (m106168Y()) {
                paint.setFakeBoldText(true);
                return;
            }
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(0.8f);
        }
    }

    /* renamed from: l */
    public static int m106192l(Context context) {
        if (context == null) {
            return 0;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            Log.m105920e("MicroMsg.UIUtils", "getRealBottomHeight, get NULL windowManager");
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        Point h = m106184h(context);
        int max = Math.max(point.y, point.x);
        int max2 = Math.max(h.y, h.x);
        Rect rect = new Rect();
        if (context instanceof Activity) {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            max = Math.max(rect.bottom - rect.top, rect.right - rect.left);
        }
        return max2 - max;
    }

    /* renamed from: l0 */
    public static void m106193l0(Paint paint) {
        if (paint != null) {
            if (m106168Y()) {
                paint.setFakeBoldText(false);
            } else {
                paint.setStyle(Paint.Style.FILL);
            }
        }
    }

    /* renamed from: m */
    public static Rect m106194m(Activity activity) {
        Rect rect;
        boolean z;
        Rect rect2;
        WindowInsets windowInsets;
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        synchronized (C85875k4.class) {
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            if (f250158d.get(rotation) != null) {
                Rect rect3 = f250158d.get(rotation);
                return rect3;
            }
            Rect rect4 = null;
            if (activity.getWindow() == null) {
                return null;
            }
            if (m106205t(activity, true)) {
                if (Build.VERSION.SDK_INT < 28 || (windowInsets = f250157c.get(rotation)) == null || windowInsets.getDisplayCutout() == null) {
                    z = false;
                } else {
                    rect4 = new Rect(windowInsets.getDisplayCutout().getSafeInsetLeft(), windowInsets.getDisplayCutout().getSafeInsetTop(), i - windowInsets.getDisplayCutout().getSafeInsetRight(), i2 - windowInsets.getDisplayCutout().getSafeInsetBottom());
                    z = true;
                }
                if (!z) {
                    int o = m106198o(activity);
                    if (rotation == 0) {
                        rect2 = new Rect(0, o, i, i2);
                    } else if (rotation == 1) {
                        rect2 = new Rect(o, 0, i, i2);
                    } else if (rotation == 2) {
                        rect2 = new Rect(0, 0, i, i2 - o);
                    } else if (rotation != 3) {
                        rect = new Rect(0, 0, i, i2);
                    } else {
                        rect2 = new Rect(0, 0, i - o, i2);
                    }
                    rect = rect2;
                } else {
                    rect = rect4;
                }
            } else {
                rect = new Rect(0, 0, i, i2);
            }
            f250158d.put(rotation, rect);
            return rect;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0153 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0154 A[SYNTHETIC, Splitter:B:63:0x0154] */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m106195m0(android.app.Activity r11) {
        /*
            if (r11 == 0) goto L_0x0187
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x000a
            goto L_0x0187
        L_0x000a:
            java.lang.Boolean r0 = f250151B
            r1 = 0
            java.lang.String r2 = "MicroMsg.UIUtils"
            r3 = 1
            if (r0 != 0) goto L_0x004d
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x003e }
            java.lang.String r4 = "clicfg_new_widecolor_mode_on"
            java.lang.String r5 = "0"
            java.lang.String r0 = r0.mo182444f(r4, r5, r1, r3)     // Catch:{ Exception -> 0x003e }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)     // Catch:{ Exception -> 0x003e }
            if (r0 <= 0) goto L_0x0031
            java.lang.String r0 = "isWideColorModeOn!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x003e }
            java.lang.Boolean r0 = new java.lang.Boolean     // Catch:{ Exception -> 0x003e }
            r0.<init>(r3)     // Catch:{ Exception -> 0x003e }
            f250151B = r0     // Catch:{ Exception -> 0x003e }
            goto L_0x004d
        L_0x0031:
            java.lang.String r0 = "isWideColorModeOn close!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x003e }
            java.lang.Boolean r0 = new java.lang.Boolean     // Catch:{ Exception -> 0x003e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x003e }
            f250151B = r0     // Catch:{ Exception -> 0x003e }
            goto L_0x004d
        L_0x003e:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = "isWideColorModeOn"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r4)
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r1)
            f250151B = r0
        L_0x004d:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x0055
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 == 0) goto L_0x005c
        L_0x0055:
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r3)
            f250151B = r0
        L_0x005c:
            java.lang.Boolean r0 = f250151B
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0150
            java.lang.Boolean r0 = f250152C
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x00a0
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r1)
            f250152C = r0
            java.lang.String r0 = p156gj.C87203t.m108275k()
            java.lang.String r0 = r0.toLowerCase()
            oa1.d r5 = oa1.C117731d.m166007c()
            java.lang.String r6 = "clicfg_new_widecolor_mode_disable_device"
            java.lang.String r5 = r5.mo182444f(r6, r4, r1, r3)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 != 0) goto L_0x00a0
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = "isWideColorModeDisableDevice ture!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r3)
            f250152C = r0
            boolean r0 = r0.booleanValue()
            goto L_0x00a6
        L_0x00a0:
            java.lang.Boolean r0 = f250152C
            boolean r0 = r0.booleanValue()
        L_0x00a6:
            if (r0 != 0) goto L_0x0150
            java.lang.Boolean r0 = f250153D
            if (r0 != 0) goto L_0x0137
            r0 = 0
            java.lang.Boolean r5 = new java.lang.Boolean
            r5.<init>(r1)
            f250153D = r5
            oa1.d r5 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r6 = "clicfg_new_widecolor_mode_brand_api"
            java.lang.String r0 = r5.mo182444f(r6, r4, r1, r1)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r4 = "wideColorModeDisableBrandAPI: %s"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00c9 }
            r5[r1] = r0     // Catch:{ Exception -> 0x00c9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r5)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00d2
        L_0x00c9:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = "wideColorModeDisableBrandAPI"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r4, r6, r5)
        L_0x00d2:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x0137
            java.lang.String r4 = android.os.Build.BRAND
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r5 = ","
            java.lang.String[] r0 = r0.split(r5)
            int r5 = r0.length
            r6 = 0
        L_0x00e6:
            if (r6 >= r5) goto L_0x0137
            r7 = r0[r6]
            boolean r8 = r7.contains(r4)
            if (r8 == 0) goto L_0x0134
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r1] = r7
            java.lang.String r9 = "disable widecolor brandAPI: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r8)
            java.lang.String r8 = "&"
            java.lang.String[] r7 = r7.split(r8)
            int r8 = r7.length
            r9 = 2
            if (r8 < r9) goto L_0x0134
            r8 = r7[r3]
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0134
            r7 = r7[r3]     // Catch:{ NumberFormatException -> 0x012b }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x012b }
            java.lang.String r8 = "widecolor api: %s"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ NumberFormatException -> 0x012b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x012b }
            r9[r1] = r10     // Catch:{ NumberFormatException -> 0x012b }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r8, r9)     // Catch:{ NumberFormatException -> 0x012b }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ NumberFormatException -> 0x012b }
            if (r8 < r7) goto L_0x0134
            java.lang.Boolean r7 = new java.lang.Boolean     // Catch:{ NumberFormatException -> 0x012b }
            r7.<init>(r3)     // Catch:{ NumberFormatException -> 0x012b }
            f250153D = r7     // Catch:{ NumberFormatException -> 0x012b }
            goto L_0x0134
        L_0x012b:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r9 = "parse widecolor api error!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r7, r9, r8)
        L_0x0134:
            int r6 = r6 + 1
            goto L_0x00e6
        L_0x0137:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x013f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 == 0) goto L_0x0146
        L_0x013f:
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r3)
            f250153D = r0
        L_0x0146:
            java.lang.Boolean r0 = f250153D
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0150
            r0 = 1
            goto L_0x0151
        L_0x0150:
            r0 = 0
        L_0x0151:
            if (r0 != 0) goto L_0x0154
            return
        L_0x0154:
            android.content.res.Resources r0 = r11.getResources()     // Catch:{ all -> 0x017e }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x017e }
            boolean r0 = r0.isScreenWideColorGamut()     // Catch:{ all -> 0x017e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x017e }
            r4.<init>()     // Catch:{ all -> 0x017e }
            java.lang.String r5 = "isScreenWideColorGamut :"
            r4.append(r5)     // Catch:{ all -> 0x017e }
            r4.append(r0)     // Catch:{ all -> 0x017e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x017e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0187
            android.view.Window r11 = r11.getWindow()     // Catch:{ all -> 0x017e }
            r11.setColorMode(r3)     // Catch:{ all -> 0x017e }
            goto L_0x0187
        L_0x017e:
            r11 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "setWideColorImageMode"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r11, r1, r0)
        L_0x0187:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C85875k4.m106195m0(android.app.Activity):void");
    }

    /* renamed from: n */
    public static int m106196n(float f) {
        return (int) (((float) m106182g()) * f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m106197n0() {
        /*
            java.lang.Boolean r0 = f250170p
            java.lang.String r1 = "MicroMsg.UIUtils"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00e5
            com.huawei.easygo.sdk.EasyGo r0 = com.tencent.p014mm.p136ui.C85811a5.f249921a
            if (r0 != 0) goto L_0x0013
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.p014mm.p136ui.C85811a5.m106025b(r0)
        L_0x0013:
            boolean r0 = com.tencent.p014mm.p136ui.C85811a5.m106026c()
            com.miui.easygo.sdk.EasyGo r4 = com.tencent.p014mm.p136ui.C85865h1.f250081a
            if (r4 != 0) goto L_0x002e
            boolean r4 = m106161R()
            if (r4 != 0) goto L_0x0027
            boolean r4 = m106162S()
            if (r4 == 0) goto L_0x002e
        L_0x0027:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.p014mm.p136ui.C85865h1.m106132b(r4)
        L_0x002e:
            java.util.List<java.lang.Integer> r4 = com.tencent.p014mm.p136ui.C85865h1.f250082b
            java.lang.String r5 = "MIUIUtil"
            if (r4 == 0) goto L_0x0059
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0059
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.util.List<java.lang.Integer> r6 = com.tencent.p014mm.p136ui.C85865h1.f250082b
            java.lang.Object r6 = r6.get(r2)
            r4[r2] = r6
            java.lang.String r6 = "dancy test retList get(0):%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r4)
            java.util.List<java.lang.Integer> r4 = com.tencent.p014mm.p136ui.C85865h1.f250082b
            java.lang.Object r4 = r4.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != 0) goto L_0x0059
            r4 = 1
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r6[r2] = r7
            java.lang.String r7 = "dancy test flag :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r7, r6)
            boolean r5 = m106171a0()
            if (r5 != 0) goto L_0x0076
            boolean r5 = m106169Z()
            if (r5 != 0) goto L_0x0076
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x0082
        L_0x0076:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r5 = com.tencent.p014mm.p136ui.C85930s4.m106242b(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
        L_0x0082:
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0096
            boolean r5 = m106169Z()
            if (r5 != 0) goto L_0x0094
            boolean r5 = m106171a0()
            if (r5 == 0) goto L_0x0096
        L_0x0094:
            r5 = 1
            goto L_0x0097
        L_0x0096:
            r5 = 0
        L_0x0097:
            m9.a r6 = com.tencent.p014mm.p136ui.C85985z2.f250438a
            if (r6 != 0) goto L_0x00a2
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.p014mm.p136ui.C85985z2.m106331c(r6)
        L_0x00a2:
            boolean r6 = com.tencent.p014mm.p136ui.C85985z2.m106330b()
            java.lang.Boolean r7 = new java.lang.Boolean
            if (r0 != 0) goto L_0x00b9
            if (r4 != 0) goto L_0x00b9
            if (r5 != 0) goto L_0x00b9
            if (r6 != 0) goto L_0x00b9
            boolean r8 = m106199o0()
            if (r8 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r8 = 0
            goto L_0x00ba
        L_0x00b9:
            r8 = 1
        L_0x00ba:
            r7.<init>(r8)
            f250170p = r7
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r2] = r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8[r3] = r0
            r0 = 2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r8[r0] = r4
            r0 = 3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r8[r0] = r4
            r0 = 4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            r8[r0] = r4
            java.lang.String r0 = "supportMagicWindow:%s, hwInitSucceed:%s, miUIInitSucceed:%s, vivoInMagicWindow:%s, oppoInitSucceed:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r8)
        L_0x00e5:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Boolean r3 = f250170p
            boolean r3 = r3.booleanValue()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "supportMagicWindow:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            java.lang.Boolean r0 = f250170p
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C85875k4.m106197n0():boolean");
    }

    /* renamed from: o */
    public static int m106198o(Context context) {
        return C47264o.m52556a(context, 25);
    }

    /* renamed from: o0 */
    public static boolean m106199o0() {
        if (!C11171e.m11046c(31)) {
            return false;
        }
        boolean z = SplitController.Companion.getInstance().isSplitSupported() && C85861e4.m106120g();
        Log.m105925i("MicroMsg.UIUtils", "supportSplit：%s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: p */
    public static int m106200p(Context context) {
        int a = C47264o.m52556a(context, -1);
        if (a > 0) {
            Rect rect = new Rect();
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            if (i <= a) {
                return a;
            }
            Log.m105929w("MicroMsg.UIUtils", "[fixStatusBarHeight] top:%s statusHeight:%s", Integer.valueOf(i), Integer.valueOf(a));
            return 0;
        } else if (!(context instanceof Activity)) {
            return C76577a.m92151b(context, 20);
        } else {
            Rect rect2 = new Rect();
            Activity activity = (Activity) context;
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            int height = activity.getWindow().getDecorView().getHeight();
            int[] iArr = new int[2];
            activity.getWindow().getDecorView().getLocationOnScreen(iArr);
            return (height - rect2.height() < 0 || iArr[1] <= 200) ? rect2.top : height - rect2.height();
        }
    }

    /* renamed from: p0 */
    public static void m106201p0() {
        f250178x = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("dark_mode_follow_system", false);
    }

    /* renamed from: q */
    public static int m106202q() {
        Log.m105925i("MicroMsg.UIUtils", "getWidthDp, getDeviceDpi:%d, getWindowDpi:%d, getDeviceWidth:%d", Integer.valueOf(m106178e()), Integer.valueOf(m106203r()), Integer.valueOf(m106182g()));
        int e = m106178e();
        int r = m106203r();
        int g = m106182g();
        if (e != 0) {
            if (m106157N()) {
                DisplayMetrics displayMetrics = C88494d.f255613e;
                if (displayMetrics != null) {
                    return Math.round(((float) Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels)) / displayMetrics.density);
                }
            } else if (e != r && !m106206u()) {
                return Math.round(((float) g) / (((float) e) / 160.0f));
            } else {
                DisplayMetrics s = m106204s();
                return Math.round(((float) Math.min(s.heightPixels, s.widthPixels)) / s.density);
            }
        }
        return 0;
    }

    /* renamed from: r */
    public static int m106203r() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    /* renamed from: s */
    public static DisplayMetrics m106204s() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: android.view.WindowInsets} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m106205t(android.content.Context r7, boolean r8) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.vendor.Vivo.vivohasCutOut(r7)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0101
            boolean r0 = com.tencent.p014mm.sdk.vendor.Oppo.oppohasCutOut(r7)
            if (r0 != 0) goto L_0x0101
            boolean r0 = com.tencent.p014mm.sdk.vendor.Huawei.huaweihasCutOut(r7)
            if (r0 != 0) goto L_0x0101
            if (r7 != 0) goto L_0x0019
        L_0x0016:
            r7 = 0
            goto L_0x00fc
        L_0x0019:
            boolean r0 = r7 instanceof android.app.Activity
            if (r0 != 0) goto L_0x001e
            goto L_0x0016
        L_0x001e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r0 < r3) goto L_0x00ee
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r3 = "has_cutout"
            boolean r0 = r0.getBoolean(r3, r1)
            f250156b = r0
            r0 = r7
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r3 = r0.getWindow()
            android.view.View r3 = r3.getDecorView()
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            java.lang.Object r4 = f250159e
            monitor-enter(r4)
            android.util.SparseArray<android.view.WindowInsets> r5 = f250157c     // Catch:{ all -> 0x00eb }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x00eb }
            android.view.WindowInsets r5 = (android.view.WindowInsets) r5     // Catch:{ all -> 0x00eb }
            if (r5 != 0) goto L_0x00c4
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMHandlerThread.isMainThread()     // Catch:{ all -> 0x00eb }
            if (r5 == 0) goto L_0x0072
            boolean r5 = r3.isAttachedToWindow()     // Catch:{ all -> 0x00eb }
            if (r5 == 0) goto L_0x0072
            android.view.WindowInsets r5 = r3.getRootWindowInsets()     // Catch:{ all -> 0x00eb }
            android.util.SparseArray<android.view.WindowInsets> r7 = f250157c     // Catch:{ all -> 0x00eb }
            android.view.WindowInsets r8 = r3.getRootWindowInsets()     // Catch:{ all -> 0x00eb }
            r7.put(r0, r8)     // Catch:{ all -> 0x00eb }
            goto L_0x00c4
        L_0x0072:
            if (r8 == 0) goto L_0x009e
            boolean r8 = com.tencent.p014mm.sdk.platformtools.MMHandlerThread.isMainThread()     // Catch:{ all -> 0x00eb }
            if (r8 != 0) goto L_0x009e
            boolean r8 = r3.isAttachedToWindow()     // Catch:{ all -> 0x00eb }
            if (r8 == 0) goto L_0x009e
            com.tencent.mm.ui.l4 r7 = new com.tencent.mm.ui.l4     // Catch:{ all -> 0x00eb }
            r5 = 500(0x1f4, double:2.47E-321)
            r8 = 0
            r7.<init>(r5, r8, r3)     // Catch:{ all -> 0x00eb }
            com.tencent.mm.sdk.platformtools.MMHandler r8 = new com.tencent.mm.sdk.platformtools.MMHandler     // Catch:{ all -> 0x00eb }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00eb }
            r8.<init>((android.os.Looper) r3)     // Catch:{ all -> 0x00eb }
            java.lang.Object r7 = r7.exec(r8)     // Catch:{ all -> 0x00eb }
            r5 = r7
            android.view.WindowInsets r5 = (android.view.WindowInsets) r5     // Catch:{ all -> 0x00eb }
            android.util.SparseArray<android.view.WindowInsets> r7 = f250157c     // Catch:{ all -> 0x00eb }
            r7.put(r0, r5)     // Catch:{ all -> 0x00eb }
            goto L_0x00c4
        L_0x009e:
            r8 = r7
            android.app.Activity r8 = (android.app.Activity) r8     // Catch:{ all -> 0x00eb }
            boolean r5 = r8.isFinishing()     // Catch:{ all -> 0x00eb }
            if (r5 != 0) goto L_0x00c0
            boolean r8 = r8.isDestroyed()     // Catch:{ all -> 0x00eb }
            if (r8 == 0) goto L_0x00ae
            goto L_0x00c0
        L_0x00ae:
            android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ all -> 0x00eb }
            com.tencent.mm.ui.r4 r7 = com.tencent.p014mm.p136ui.C85924r4.m106238c(r7, r2)     // Catch:{ all -> 0x00eb }
            com.tencent.mm.ui.m4 r8 = new com.tencent.mm.ui.m4     // Catch:{ all -> 0x00eb }
            r8.<init>(r0, r3, r7)     // Catch:{ all -> 0x00eb }
            r7.mo119830a(r8)     // Catch:{ all -> 0x00eb }
            boolean r7 = f250156b     // Catch:{ all -> 0x00eb }
            monitor-exit(r4)     // Catch:{ all -> 0x00eb }
            goto L_0x00fc
        L_0x00c0:
            boolean r7 = f250156b     // Catch:{ all -> 0x00eb }
            monitor-exit(r4)     // Catch:{ all -> 0x00eb }
            goto L_0x00fc
        L_0x00c4:
            if (r5 == 0) goto L_0x00e9
            android.view.DisplayCutout r7 = r5.getDisplayCutout()     // Catch:{ all -> 0x00eb }
            if (r7 == 0) goto L_0x00e9
            java.util.List r7 = r7.getBoundingRects()     // Catch:{ all -> 0x00eb }
            if (r7 == 0) goto L_0x00e9
            int r7 = r7.size()     // Catch:{ all -> 0x00eb }
            if (r7 <= 0) goto L_0x00e9
            f250156b = r2     // Catch:{ all -> 0x00eb }
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()     // Catch:{ all -> 0x00eb }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r7)     // Catch:{ all -> 0x00eb }
            java.lang.String r8 = "has_cutout"
            boolean r0 = f250156b     // Catch:{ all -> 0x00eb }
            r7.putBoolean(r8, r0)     // Catch:{ all -> 0x00eb }
        L_0x00e9:
            monitor-exit(r4)     // Catch:{ all -> 0x00eb }
            goto L_0x00fa
        L_0x00eb:
            r7 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00eb }
            throw r7
        L_0x00ee:
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            java.lang.String r8 = "android.hardware.notch_support"
            boolean r7 = r7.hasSystemFeature(r8)
            f250156b = r7
        L_0x00fa:
            boolean r7 = f250156b
        L_0x00fc:
            if (r7 == 0) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r7 = 0
            goto L_0x0102
        L_0x0101:
            r7 = 1
        L_0x0102:
            java.lang.String r8 = "MicroMsg.UIUtils"
            java.lang.String r0 = "hasCutOut:%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            r2[r1] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C85875k4.m106205t(android.content.Context, boolean):boolean");
    }

    /* renamed from: u */
    public static boolean m106206u() {
        String str = Build.BRAND;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.contains("huawei") && !lowerCase.contains("honor")) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 27) {
            return false;
        }
        Log.m105924i("MicroMsg.UIUtils", "dancy huaweiSpecial!!");
        return true;
    }

    /* renamed from: v */
    public static boolean m106207v() {
        Boolean bool = f250161g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (m106202q() >= 550) {
            f250161g = Boolean.TRUE;
            return true;
        }
        f250161g = Boolean.FALSE;
        return false;
    }

    /* renamed from: w */
    public static boolean m106208w() {
        boolean z;
        if (!m106197n0() && !m106199o0()) {
            return false;
        }
        if (!C85811a5.m106027d(MMApplicationContext.getContext()) && !C85865h1.m106133c(MMApplicationContext.getContext())) {
            Context context = MMApplicationContext.getContext();
            if (!(context != null && (m106171a0() || m106169Z()) && context.getResources().getConfiguration().toString().contains("multi-landscape")) && !MMApplicationContext.getContext().getResources().getConfiguration().toString().contains("oplus-magic-window") && (!m106199o0() || (!m106155L(MMApplicationContext.getContext().getContentResolver()) && !m106210y()))) {
                z = false;
                Log.m105925i("MicroMsg.UIUtils", "inMagicWindowMode:%s", Boolean.valueOf(z));
                return z;
            }
        }
        z = true;
        Log.m105925i("MicroMsg.UIUtils", "inMagicWindowMode:%s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: x */
    public static boolean m106209x(int i) {
        EasyGo easyGo = C85811a5.f249921a;
        if (easyGo != null && C85811a5.m106024a(easyGo, i) == 2) {
            return true;
        }
        com.miui.easygo.sdk.EasyGo easyGo2 = C85865h1.f250081a;
        if (easyGo2 != null && C85865h1.m106131a(easyGo2, i) == 2) {
            return true;
        }
        if (C85930s4.f250298b != null && (m106171a0() || m106169Z()) && C85930s4.m106241a(i) == 2) {
            return true;
        }
        return C85985z2.f250438a != null && C85985z2.m106329a(i) == 2;
    }

    /* renamed from: y */
    public static boolean m106210y() {
        if (WeChatSomeFeatureSwitch.isDeviceTypeTablet) {
            return true;
        }
        Boolean bool = f250160f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (m106157N()) {
            f250160f = Boolean.FALSE;
            return false;
        } else if (Huawei.ifHUAWEI() && m106158O()) {
            f250160f = Boolean.TRUE;
            return true;
        } else if (MIUI.isXiaoMi() && m106162S()) {
            f250160f = Boolean.TRUE;
            return true;
        } else if (C76866m.m92677f() && m106171a0()) {
            f250160f = Boolean.TRUE;
            return true;
        } else if (!C76866m.m92674c() || !m106165V()) {
            String str = Build.MANUFACTURER;
            if (Util.nullAs(str, "").toLowerCase().contains("lenovo".toLowerCase()) && "Lenovo TB-9707F".equalsIgnoreCase(Build.MODEL)) {
                f250160f = Boolean.TRUE;
                return true;
            }
            if (!(Util.nullAs(str, "").toLowerCase().contains("eebbk".toLowerCase()) && "X2".equalsIgnoreCase(Build.MODEL))) {
                if (!(Util.nullAs(str, "").toLowerCase().contains("eebbk".toLowerCase()) && "A2".equalsIgnoreCase(Build.MODEL))) {
                    if (m106202q() >= 600) {
                        f250160f = Boolean.TRUE;
                        return true;
                    }
                    f250160f = Boolean.FALSE;
                    return false;
                }
            }
            f250160f = Boolean.TRUE;
            return true;
        } else {
            f250160f = Boolean.TRUE;
            return true;
        }
    }

    /* renamed from: z */
    public static boolean m106211z() {
        if (m106149F()) {
            return m106145B(MMApplicationContext.getContext().getResources()) && m106146C();
        }
        if (f250180z == null) {
            f250180z = Boolean.valueOf(MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean(XWalkReaderBasePlugin.PARAM_KEY_DARK_MODE, false));
        }
        return f250180z.booleanValue() && (m106147D() || m106146C());
    }
}
