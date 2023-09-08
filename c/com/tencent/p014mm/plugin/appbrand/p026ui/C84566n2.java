package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.soter.core.biometric.FaceManager;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import h81.C32735h;
import oa1.C117731d;
import p156gj.C87203t;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.n2 */
public final class C84566n2 {

    /* renamed from: a */
    public static Boolean f246763a;

    /* renamed from: b */
    public static Boolean f246764b;

    /* renamed from: c */
    public static Boolean f246765c;

    /* renamed from: d */
    public static Boolean f246766d;

    /* renamed from: e */
    public static final int f246767e = ((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) ? 1 : 0);

    /* renamed from: f */
    public static final int[] f246768f;

    static {
        String[] l = C90599h.m113519l(C117731d.m166007c().mo182444f("clicfg_android_appbrand_in_mm_fallback_scenes", (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) ? C90599h.m113515h(new Integer[]{1023, 1065, Integer.valueOf(WXWebReporter.WXWEB_IDKEY_FR_WORD_ID), Integer.valueOf(FaceManager.FACE_ACQUIRED_LEFT), 1111}, ";") : "", true, true), ';');
        if (l != null) {
            f246768f = new int[l.length];
            for (int i = 0; i < l.length; i++) {
                f246768f[i] = Util.getInt(l[i], 0);
            }
            return;
        }
        f246768f = new int[0];
    }

    /* renamed from: a */
    public static boolean m104152a() {
        Boolean bool = f246765c;
        if (bool != null) {
            return bool.booleanValue();
        }
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        int i = (a == null || !C84499c0.m104089c()) ? Integer.MIN_VALUE : a.getInt("pref_key_run_in_mm_strategy_mmkv_config", Integer.MIN_VALUE);
        if (Integer.MIN_VALUE == i) {
            i = !C87203t.m108279o() ? 0 : C117731d.m166007c().mo182443e("clicfg_android_appbrand_in_mm_strategy", f246767e, true, true);
        }
        return 1 == i;
    }

    /* renamed from: b */
    public static boolean m104153b() {
        if (!C84499c0.m104089c()) {
            return true;
        }
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        return a != null && a.getBoolean("enable_multi_system_recent_tasks", true);
    }

    /* renamed from: c */
    public static void m104154c(boolean z) {
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        if (!(a == null || a.getInt("pref_key_run_in_mm_strategy_mmkv_config", Integer.MIN_VALUE) == 2)) {
            a.putInt("pref_key_run_in_mm_strategy_mmkv_config", z ? 1 : 0);
        }
        f246765c = Boolean.valueOf(z);
    }

    /* renamed from: d */
    public static boolean m104155d(boolean z) {
        int i = 0;
        if (!C84499c0.m104089c()) {
            return false;
        }
        try {
            MultiProcessMMKV a = C1510o.f10864a.mo1516a();
            if (a != null) {
                Log.m105925i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "setUseSingleProcessMMDispatchStrategy: [%b]", Boolean.valueOf(z));
                if (a.getInt("pref_key_run_in_mm_strategy_mmkv_config", 2) != 1) {
                    if (z) {
                        i = 2;
                    }
                    boolean encode = a.encode("pref_key_run_in_mm_strategy_mmkv_config", i);
                    f246766d = Boolean.valueOf(z);
                    return encode;
                }
            }
            return false;
        } finally {
            f246766d = Boolean.valueOf(z);
        }
    }

    /* renamed from: e */
    public static boolean m104156e(int i) {
        if (!XWebSdk.supportMultiProcess(MMApplicationContext.getContext())) {
            Log.m105924i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "setXWebMultiProcessType, core not support multi process");
            return false;
        }
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        if (a == null) {
            return false;
        }
        Log.m105925i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "setXWebMultiProcessType, multiProcessType: [%s]", Integer.valueOf(i));
        return a.encode("pref_key_xweb_multi_process_type_new", i);
    }

    /* renamed from: f */
    public static void m104157f(boolean z) {
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        if (a != null) {
            a.putInt("enable_single_task_dispatch", z ? 1 : 0);
        }
        f246763a = Boolean.valueOf(z);
    }

    /* renamed from: g */
    public static void m104158g(boolean z) {
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        if (a != null) {
            a.putInt("enable_three_proc_tasks_dispatch", z ? 1 : 0);
        }
        f246764b = Boolean.valueOf(z);
    }

    /* renamed from: h */
    public static boolean m104159h() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_spearated_wagame_in_single_task, (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) ? 1 : 0) == 1;
    }

    /* renamed from: i */
    public static boolean m104160i() {
        Boolean bool = f246766d;
        if (bool != null) {
            return bool.booleanValue();
        }
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        int i = (a == null || !C84499c0.m104089c()) ? Integer.MIN_VALUE : a.getInt("pref_key_run_in_mm_strategy_mmkv_config", Integer.MIN_VALUE);
        if (Integer.MIN_VALUE == i) {
            i = !C87203t.m108279o() ? 0 : C117731d.m166007c().mo182443e("clicfg_android_appbrand_in_mm_strategy", f246767e, true, true);
        }
        return 2 == i;
    }

    /* renamed from: j */
    public static boolean m104161j() {
        Boolean bool = f246763a;
        if (bool != null) {
            return bool.booleanValue();
        }
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        if (a == null) {
            Log.m105928w("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useSingleTaskDispatchStrategy: mmkv is null");
            return false;
        }
        int i = a.getInt("enable_single_task_dispatch", 2);
        if (i == 1) {
            f246763a = Boolean.TRUE;
        } else if (i == 0) {
            f246763a = Boolean.FALSE;
        } else {
            int e = C117731d.m166007c().mo182443e("clicfg_android_appbrand_enable_task_single_strategy", 0, true, true);
            if (BuildInfo.IS_FLAVOR_RED) {
                e = 1;
            }
            Boolean valueOf = Boolean.valueOf(e == 1);
            f246763a = valueOf;
            if (valueOf.booleanValue() && !C87203t.m108279o()) {
                Log.m105924i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useSingleTaskDispatchStrategy: test is64BitRuntime fail");
                f246763a = Boolean.FALSE;
            }
            boolean booleanValue = f246763a.booleanValue();
        }
        Log.m105925i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useSingleTaskDispatchStrategy: [%b]", f246763a);
        return f246763a.booleanValue();
    }

    /* renamed from: k */
    public static boolean m104162k() {
        Boolean bool = f246764b;
        if (bool != null) {
            return bool.booleanValue();
        }
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        if (a == null) {
            Log.m105928w("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useThreeTasksDispatchStrategy: mmkv is null");
            return false;
        }
        int i = a.getInt("enable_three_proc_tasks_dispatch", 2);
        if (i == 1) {
            f246764b = Boolean.TRUE;
        } else if (i == 0) {
            f246764b = Boolean.FALSE;
        } else {
            Boolean valueOf = Boolean.valueOf(C117731d.m166007c().mo182443e("clicfg_android_appbrand_enable_task_single_strategy", 0, true, true) == 2);
            f246764b = valueOf;
            if (valueOf.booleanValue() && !C87203t.m108279o()) {
                Log.m105924i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useThreeTasksDispatchStrategy: test is64BitRuntime fail");
                f246764b = Boolean.FALSE;
            }
            boolean booleanValue = f246764b.booleanValue();
        }
        Log.m105925i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useThreeTasksDispatchStrategy: [%b]", f246764b);
        return f246764b.booleanValue();
    }

    /* renamed from: l */
    public static boolean m104163l() {
        if (!XWebSdk.supportMultiProcess(MMApplicationContext.getContext())) {
            Log.m105924i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useXWebMultiProcess, core not support multi process");
            return false;
        } else if (m104161j() || m104160i()) {
            MultiProcessMMKV a = C1510o.f10864a.mo1516a();
            if (a != null && a.decodeInt("pref_key_xweb_multi_process_type_new", 0) > 0) {
                return true;
            }
            XWebSdk.WebViewModeForAppBrand webViewModeCommandForAppBrand = XWebSdk.getWebViewModeCommandForAppBrand();
            Log.m105924i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useXWebMultiProcess, appbrand webview mode:" + webViewModeCommandForAppBrand.name());
            return webViewModeCommandForAppBrand.ordinal() > XWebSdk.WebViewModeForAppBrand.DISABLE_MULTI_PROCESS.ordinal();
        } else {
            Log.m105924i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useXWebMultiProcess, dispatch strategy not support multi process");
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m104164m() {
        if (!XWebSdk.supportMultiProcess(MMApplicationContext.getContext())) {
            Log.m105924i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useXWebMultiProcessTypeRenderGpu, core not support multi process");
            return false;
        } else if (m104161j() || m104160i()) {
            MultiProcessMMKV a = C1510o.f10864a.mo1516a();
            if (a != null && a.decodeInt("pref_key_xweb_multi_process_type_new", 0) == 2) {
                return true;
            }
            XWebSdk.WebViewModeForAppBrand webViewModeCommandForAppBrand = XWebSdk.getWebViewModeCommandForAppBrand();
            Log.m105924i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useXWebMultiProcessTypeRenderGpu, appbrand webview mode:" + webViewModeCommandForAppBrand.name());
            return webViewModeCommandForAppBrand.ordinal() == XWebSdk.WebViewModeForAppBrand.GPU_RENDER_UNSANDBOX.ordinal() || webViewModeCommandForAppBrand.ordinal() == XWebSdk.WebViewModeForAppBrand.GPU_RENDER_SANDBOX.ordinal();
        } else {
            Log.m105924i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useXWebMultiProcess, dispatch strategy not support multi process");
            return false;
        }
    }
}
