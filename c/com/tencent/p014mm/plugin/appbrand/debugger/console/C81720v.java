package com.tencent.p014mm.plugin.appbrand.debugger.console;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p447aw.C103918d;
import p447aw.C54369c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vc3.C78382a;
import z04.C112550d0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.v */
public final class C81720v {

    /* renamed from: a */
    public static final C81720v f239836a = new C81720v();

    /* renamed from: b */
    public static int f239837b;

    /* renamed from: c */
    public static final C13601g f239838c = C36568h.m40985a(C29477e.f80332d);

    /* renamed from: d */
    public static final C13601g f239839d = C36568h.m40985a(C29476d.f80331d);

    /* renamed from: e */
    public static final C13601g f239840e = C36568h.m40985a(C40437f.f108670d);

    /* renamed from: f */
    public static final C13601g f239841f = C36568h.m40985a(C81721a.f239842d);

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.v$d */
    public static final class C29476d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C29476d f80331d = new C29476d();

        public C29476d() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(MMApplicationContext.isAppBrandProcess());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.v$e */
    public static final class C29477e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C29477e f80332d = new C29477e();

        public C29477e() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(MMApplicationContext.isMainProcess());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.v$f */
    public static final class C40437f extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C40437f f108670d = new C40437f();

        public C40437f() {
            super(0);
        }

        public Object invoke() {
            String processName = MMApplicationContext.getProcessName();
            C87412m.m108593f(processName, "getProcessName()");
            String applicationId = MMApplicationContext.getApplicationId();
            C87412m.m108593f(applicationId, "getApplicationId()");
            String a0 = C112550d0.m153791a0(processName, applicationId, processName);
            return a0.length() == 0 ? FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT : a0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.v$a */
    public static final class C81721a extends C87413o implements C32224a<ConsoleDebugLogImpl> {

        /* renamed from: d */
        public static final C81721a f239842d = new C81721a();

        public C81721a() {
            super(0);
        }

        public Object invoke() {
            ConsoleDebugLogImpl consoleDebugLogImpl = new ConsoleDebugLogImpl((String) ((C36570n) C81720v.f239840e).getValue());
            consoleDebugLogImpl.f239795b = C81720v.f239837b;
            return consoleDebugLogImpl;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.v$b */
    public static final class C81722b implements AbsRequestFloatWindowPermissionDialog.C85613a {
        /* renamed from: a */
        public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            Log.m105924i("MicroMsg.AppBrand.ConsolePrinterAccessible", "onResultAllow");
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            C81720v.f239836a.mo114086a();
        }

        /* renamed from: b */
        public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            Log.m105924i("MicroMsg.AppBrand.ConsolePrinterAccessible", "onResultCancel");
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
        }

        /* renamed from: c */
        public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            Log.m105924i("MicroMsg.AppBrand.ConsolePrinterAccessible", "onResultRefuse");
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.v$c */
    public static final class C81723c implements Runnable {

        /* renamed from: d */
        public static final C81723c f239843d = new C81723c();

        public final void run() {
            boolean z = C81725x.f239845a;
            boolean z2 = C81725x.f239845a;
            Log.m105924i("MicroMsg.AppBrand.FloatConsolePrinter", "enable, curIsEnable: " + z2);
            if (!z2) {
                C81725x.f239845a = true;
                C81725x.f239846b.mo76980d();
            }
        }
    }

    static {
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        int i = Integer.MAX_VALUE;
        if (a != null) {
            i = a.getInt("ConsolePrinterPrintLevel", Integer.MAX_VALUE);
        }
        f239837b = i;
    }

    /* renamed from: a */
    public final void mo114086a() {
        Log.m105924i("MicroMsg.AppBrand.ConsolePrinterAccessible", "enable");
        boolean z = false;
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger()) {
            int i = f239837b;
            if (2 <= i && i < 6) {
                z = true;
            }
            if (z) {
                if (((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())) {
                    if (mo114088c()) {
                        ((C119157j) C119157j.f356862d).mo183895z(C81723c.f239843d);
                    }
                    if (mo114088c() || ((Boolean) ((C36570n) f239839d).getValue()).booleanValue()) {
                        ConsoleDebugLogImpl b = mo114087b();
                        b.f239795b = f239837b;
                        C80669j.f236039k = b;
                        return;
                    }
                    return;
                } else if (mo114088c()) {
                    ((C54369c) C86312j.m106911c(C54369c.class)).mo75135iA(MMApplicationContext.getContext(), "你的手机没有授权微信获得浮窗权限，无法打开console输出面板", new C81722b(), C78382a.m94650b());
                    return;
                } else {
                    return;
                }
            }
        }
        Log.m105924i("MicroMsg.AppBrand.ConsolePrinterAccessible", "enable, not need");
    }

    /* renamed from: b */
    public final ConsoleDebugLogImpl mo114087b() {
        return (ConsoleDebugLogImpl) ((C36570n) f239841f).getValue();
    }

    /* renamed from: c */
    public final boolean mo114088c() {
        return ((Boolean) ((C36570n) f239838c).getValue()).booleanValue();
    }
}
