package com.tencent.p014mm.plugin.appbrand.app;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import at0.C103915c;
import com.tencent.luggage.sdk.config.C0926a;
import com.tencent.mars.Mars;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.accessibility.core.area.ViewTouchAreaExpander;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C80882c;
import com.tencent.p014mm.ipcinvoker.C80906n;
import com.tencent.p014mm.ipcinvoker.extension.C80893c;
import com.tencent.p014mm.ipcinvoker.wx_extension.C1262l;
import com.tencent.p014mm.p136ui.C85922p4;
import com.tencent.p014mm.p136ui.C85923q4;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.plugin.appbrand.AppBrandPersistentRuntimeConfig$watchApp$2;
import com.tencent.p014mm.plugin.appbrand.C1973u4;
import com.tencent.p014mm.plugin.appbrand.C83702n;
import com.tencent.p014mm.plugin.appbrand.C84263t4;
import com.tencent.p014mm.plugin.appbrand.appcache.C81229b1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81274j2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81282k1;
import com.tencent.p014mm.plugin.appbrand.crash_report.AppBrandCrashReportFullMonitor$setup$3;
import com.tencent.p014mm.plugin.appbrand.debugger.C29474a;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShellClientProcessHelper;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShellClientProcessHelper$receiver$1;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82725i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29555x;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83189z;
import com.tencent.p014mm.plugin.appbrand.keylogger.C40483p;
import com.tencent.p014mm.plugin.appbrand.keylogger.C40484r;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83224m;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83227o;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C83535c;
import com.tencent.p014mm.plugin.appbrand.msg.dyeingtemplate.DyeingTemplateMsgHandler$initialize$1;
import com.tencent.p014mm.plugin.appbrand.report.C29628g0;
import com.tencent.p014mm.plugin.appbrand.report.C84112f0;
import com.tencent.p014mm.plugin.appbrand.report.C84178q;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84186b0;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.task.preload.C84330h;
import com.tencent.p014mm.plugin.appbrand.utils.C104817g;
import com.tencent.p014mm.plugin.appbrand.utils.C29680s;
import com.tencent.p014mm.plugin.appbrand.utils.C84749i0;
import com.tencent.p014mm.plugin.appbrand.utils.C84796y0;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84852n0;
import com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18054e;
import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.thread.DeprecatedThreadFactory;
import com.tencent.p014mm.tcp.libmmtcp.C30800a;
import com.tencent.p014mm.udp.libmmudp.C30803a;
import com.tencent.xweb.XWebSdk;
import cr0.C86119n;
import di3.C86301e;
import di3.C86312j;
import dn0.C45428e;
import e00.C45518r0;
import eb0.C45628s0;
import ei3.C86522b;
import f81.C7998c;
import gs0.C32515a;
import gy3.C87412m;
import h81.C32735h;
import iu0.C87820i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import jr0.C88013a;
import jr3.C33653a;
import js0.C88020k;
import kj2.C117407d;
import kn0.C88232e;
import kn0.C88236n;
import ks0.C21379a;
import lu0.C88650c;
import mp3.C88816a;
import mp3.C88824h;
import mp3.C88825i;
import nr3.C89057c;
import nr3.C89061h;
import p1031sb.C90157d;
import p206nj.C88957l;
import p224ra.C89909e;
import p416qd.C89590b;
import p629ny.C76979h;
import p757xv.C91352r;
import p757xv.C91353u;
import p814gd.C45904a;
import p927ab.C79484f;
import pj0.C89357b;
import pj0.C89358c;
import pj0.C89359d;
import pj0.C89360e;
import pj0.C89361f;
import pj0.C89362g;
import qj0.C89680a;
import rx3.C13598b0;
import rx3.C13601g;
import t10.C36935a;
import vn2.C90851e;
import yi0.C91452a;
import yi0.C91456b;
import yi0.C91459c;
import yi0.C91460d;
import ym0.C91507b;
import ym0.C91512j;
import yq0.C91548e;

@C86522b(dependencies = {C7998c.class, C1262l.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI, C80625v0.MATCH_SUPPORT})
/* renamed from: com.tencent.mm.plugin.appbrand.app.q */
public class C81180q extends C86301e {

    /* renamed from: e */
    public static final C80882c f238504e = new q$$b();

    /* renamed from: d */
    public final C84749i0 f238505d = new C84749i0();

    public static void vx0() {
        if (Build.VERSION.SDK_INT >= 24) {
            Locale.setDefault(Locale.Category.FORMAT, Locale.ENGLISH);
        }
    }

    public void onCreate(Context context) {
        Class cls = C45518r0.class;
        Log.m105924i("MicroMsg.PluginAppBrand", "installedOfPluginAppBrand()");
        C80906n.f237751c = f238504e;
        if (!MMApplicationContext.isAppBrandProcess()) {
            new AppBrandSplashPreloadService$2(this, C40008f.f107254d).alive();
        }
        if (MMApplicationContext.isAppBrandProcess()) {
            C91456b bVar = C91456b.f262190a;
            MMUncaughtExceptionHandler.addOnUncaughtExceptionListener(new C91459c(bVar));
            CrashReportFactory.addCrashReportListener(new C91460d(bVar));
            new AppBrandCrashReportFullMonitor$setup$3(C40008f.f107254d).alive();
            ((C45518r0) C86312j.m106911c(cls)).l80();
        }
        if (MMApplicationContext.isMainProcess()) {
            new DyeingTemplateMsgHandler$initialize$1(C40008f.f107254d).alive();
        }
        Log.m105924i("MicroMsg.PluginAppBrand", "configure()");
        C80893c.m98760a(C32515a.f86359w);
        if (!MMApplicationContext.isMMProcess() && C89061h.f256712a == null) {
            C88825i iVar = new C88825i((C88816a) new C89057c(new MMHandler(DeprecatedThreadFactory.createHandlerThread("WeChat.WORKER").getLooper())), "WeChat.WORKER");
            C89061h.f256712a = iVar;
            C88824h.m110908b("WeChat.WORKER", iVar);
        }
        boolean z = true;
        if (MMApplicationContext.isAppBrandProcess()) {
            vx0();
            Application application = C80589e.f235760a.getApplication();
            application.registerActivityLifecycleCallbacks(new C81182r(this));
            application.registerComponentCallbacks(new C81183s(this));
            if (!C91452a.f262180e.getAndSet(true)) {
                CrashReportFactory.addCrashReportExtraMessageGetter(C91452a.f262179d);
            }
        }
        Class cls2 = C91353u.class;
        Class<C81180q> cls3 = C81180q.class;
        Class cls4 = C32735h.class;
        if (C88013a.m109543a()) {
            C40484r rVar = new C40484r();
            C40483p pVar = C83226n.f243073a;
            pVar.getClass();
            Log.m105924i("KeyStepLoggerWrapper", "setLoggerDelegate");
            pVar.f108773a = rVar;
            C83226n.f243074b = true;
        }
        C88957l.m111079o(Mars.libMarsBase, cls3.getClassLoader());
        C88957l.m111079o(Mars.libMarsMM, cls3.getClassLoader());
        C84186b0 b0Var = C84186b0.f245919a;
        C83227o.C83228a aVar = C83227o.f243075a;
        C83224m mVar = C83224m.C83225a.f243072a;
        List list = (List) ((HashMap) mVar.f243071a).get(KSProcessWeAppLaunch.NAME);
        if (list == null) {
            list = new LinkedList();
            ((HashMap) mVar.f243071a).put(KSProcessWeAppLaunch.NAME, list);
        }
        list.add(b0Var);
        if (MMApplicationContext.isAppBrandProcess()) {
            ClassLoader classLoader = C89362g.f257343a;
            C89590b.m112029c(new C89357b());
            C30803a.f82806a = new C89358c();
            C30800a.f82805a = new C89359d();
            C36935a.f97989a = new C89360e();
            C33653a.f91067a = new C89361f();
            C88020k.f254631c = false;
            XWebSdk.registerBroadcastListener(MMApplicationContext.getContext(), C87820i.f254225a);
            ((C45518r0) C86312j.m106911c(cls)).l80();
        }
        if (MMApplicationContext.isMainProcess()) {
            C84852n0.f247339d.getClass();
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onRegister");
            ((CopyOnWriteArraySet) C81274j2.f238683b).add(C84852n0.f247340e);
            C81229b1 b1Var = new C81229b1();
            Set<C81282k1.C81284b> set = C81282k1.f238688a;
            synchronized (set) {
                ((HashSet) set).add(b1Var);
            }
            ((C76979h) C86312j.m106911c(C76979h.class)).mo107083uC(new C1512t(this));
        }
        Application application2 = C80589e.f235760a.getApplication();
        if (MMApplicationContext.isAppBrandProcess()) {
            application2.registerActivityLifecycleCallbacks(AppBrandProcessSuicideLogic.f238431h);
            AppBrandProcessSuicideLogic.f238430g.set(true);
            C117407d.INSTANCE.idkeyStat(365, 4, 1, false);
            KVCommCrossProcessReceiver.f346932d = 1000;
            application2.registerComponentCallbacks(C84330h.f246220d);
        }
        if (MMApplicationContext.isMainProcess() || MMApplicationContext.isAppBrandProcess()) {
            C84112f0 f0Var = C84112f0.f245579b;
            C0926a.C0928b.f2135a = f0Var;
            C90157d.C90158a.f258859a = f0Var;
            C89909e.m112440e(C84796y0.class, C104817g.f311301d);
            C103915c.C67105b bVar2 = C103915c.f307262l;
            ViewTouchAreaExpander viewTouchAreaExpander = ViewTouchAreaExpander.INSTANCE;
            Objects.requireNonNull(viewTouchAreaExpander);
            C103915c.f307263m = new q$$a(viewTouchAreaExpander);
            C13601g gVar = C83189z.f242989d;
        }
        C89909e.m112440e(C86119n.class, new C29628g0());
        if (MMApplicationContext.isAppBrandProcess()) {
            ((C45518r0) C86312j.m106911c(cls)).mo70755Z7();
            Log.m105924i("MicroMsg.PluginAppBrand", "init DefaultJsApiPool");
            if (C79484f.f233043b == null) {
                synchronized (C79484f.class) {
                    if (C79484f.f233043b == null) {
                        C79484f.f233043b = new C79484f();
                    }
                }
            }
            C79484f.f233043b.f233044a = new C89680a();
        }
        if (MMApplicationContext.isMainProcess()) {
            C29555x.m38804a();
            C90851e eVar = C90851e.INSTANCE;
            eVar.f260824d.put(1, new C84263t4());
            eVar.f260824d.put(3, new C1973u4());
            if (!DebuggerShell.f239772d && !WeChatEnvironment.hasDebugger()) {
                z = false;
            }
            if (z) {
                DebuggerShell debuggerShell = DebuggerShell.f239770b.get();
                debuggerShell.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.tencent.mm.appbrand.debugger");
                MMApplicationContext.getContext().registerReceiver(debuggerShell, intentFilter);
                for (DebuggerShell.C81694b next : C29474a.f80327a) {
                    if (next != null && !Util.isNullOrNil(next.name())) {
                        ((HashMap) debuggerShell.f239773a).put(next.name(), next);
                    }
                }
            }
            AppBrandVideoWrapper.setVideoViewFactory(new C91507b());
            AppBrandVideoWrapper.setAudioFocusComponentFactory(C82725i2.f242039e);
            C91512j.m114810c().mo125426d(MMApplicationContext.getContext(), false, false, C88650c.m110561b(), (C45428e) null);
            return;
        }
        if (MMApplicationContext.isAppBrandProcess()) {
            C91352r CU = ((C91353u) C86312j.m106911c(cls2)).mo112623CU();
            C84178q qVar = C84178q.f245831a;
            ((MemoryWatchDog) CU).mo118589o(qVar);
            ((C91353u) C86312j.m106911c(cls2)).n70().setExtraInfoFactory(qVar);
            DebuggerShellClientProcessHelper$receiver$1 debuggerShellClientProcessHelper$receiver$1 = DebuggerShellClientProcessHelper.f239774a;
            try {
                Context context2 = MMApplicationContext.getContext();
                DebuggerShellClientProcessHelper$receiver$1 debuggerShellClientProcessHelper$receiver$12 = DebuggerShellClientProcessHelper.f239774a;
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("com.tencent.mm.appbrand.debugger.appbrand_process_reload_configs");
                C13598b0 b0Var2 = C13598b0.f38549a;
                context2.registerReceiver(debuggerShellClientProcessHelper$receiver$12, intentFilter2);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.AppBrand.DebuggerShellClientProcessHelper", "setup get exception " + th);
            }
            C84749i0 i0Var = this.f238505d;
            i0Var.getClass();
            Log.m105924i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.AppSingletonRegistry ");
            application2.registerActivityLifecycleCallbacks(i0Var);
            C84749i0 i0Var2 = this.f238505d;
            i0Var2.f247164f = true;
            i0Var2.f247165g = application2;
            C21379a aVar2 = C21379a.INST;
            Log.m105925i("MicroMsg.AppSingletonRegistry", "registerAppSingleton() called with: singleton = [%s]", aVar2);
            ((LinkedList) i0Var2.f247162d).offer(aVar2);
            application2.registerActivityLifecycleCallbacks(new C83702n());
            new AppBrandPersistentRuntimeConfig$watchApp$2(C40008f.f107254d).alive();
            AtomicBoolean atomicBoolean = C85924r4.f250284c;
            application2.registerActivityLifecycleCallbacks(new C85923q4(new C85922p4()));
            C85924r4.f250284c.set(true);
            application2.registerActivityLifecycleCallbacks(C83535c.f244059d);
            C91512j.m114810c().mo125426d(MMApplicationContext.getContext(), false, false, C88650c.m110561b(), (C45428e) null);
            int i = 2;
            int i2 = WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED ? 2 : 0;
            C32735h hVar = (C32735h) C86312j.m106911c(cls4);
            if (hVar != null) {
                i2 = hVar.mo58779Qe(C32735h.C32737c.clicfg_android_wxa_video_fix_notify_error, i2);
                Log.m105924i("MicroMsg.SameLayer.AppBrandAVABTests", "notifyErrorWorkaroundChannel, expt is " + i2);
            }
            Boolean bool = null;
            Boolean valueOf = MultiProcessMMKV.getMMKV("xweb_abtest_command").contains("video_fix_notify_error_command_value") ? Boolean.valueOf(MultiProcessMMKV.getMMKV("xweb_abtest_command").getBoolean("video_fix_notify_error_command_value", false)) : null;
            if (valueOf == null) {
                i = i2;
            } else if (!valueOf.booleanValue()) {
                i = 0;
            }
            Log.m105924i("MicroMsg.SameLayer.AppBrandAVABTests", "notifyErrorWorkaroundChannel: " + i);
            C88236n.f255055b0 = i;
            boolean z2 = WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED;
            C32735h hVar2 = (C32735h) C86312j.m106911c(cls4);
            if (hVar2 != null) {
                z2 = hVar2.mo58784wf(C32735h.C32737c.clicfg_android_wxa_video_interrupt_cache, z2);
                Log.m105924i("MicroMsg.SameLayer.AppBrandAVABTests", "cancelCacheWhenPlay, expt is " + z2);
            }
            if (MultiProcessMMKV.getMMKV("xweb_abtest_command").contains("video_cancel_cache_when_play_command_value")) {
                bool = Boolean.valueOf(MultiProcessMMKV.getMMKV("xweb_abtest_command").getBoolean("video_cancel_cache_when_play_command_value", false));
            }
            if (bool != null) {
                z2 = bool.booleanValue();
            }
            Log.m105924i("MicroMsg.SameLayer.AppBrandAVABTests", "cancelCacheWhenPlay: " + z2);
            Log.m105924i("MicroMsg.AppBrand.DataSourceFactoryCreator", "cancelCacheWhenPlay#set, value: " + z2);
            C88232e.f255047a = z2;
            Log.m105924i("MicroMsg.SameLayer.AppBrandXWebVideoStrategy", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            if (C29680s.m38859d() == 5) {
                Log.m105924i("MicroMsg.SameLayer.AppBrandXWebVideoStrategy", "init, use ThumbPlayer");
                C18054e eVar2 = C18054e.f49894a;
                C87412m.m108594g(MMApplicationContext.getContext(), "context");
            }
            C91548e.f262376d = new C81184u(this);
        }
        if (MMApplicationContext.isToolsProcess()) {
            boolean z3 = ((C32735h) C86312j.m106911c(cls4)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_native_video_proxy, 0) == 1;
            C91512j.m114810c().mo125426d(MMApplicationContext.getContext(), z3, z3, C88650c.m110561b(), new C45904a());
        }
        if (MMApplicationContext.isAppBrandProcess()) {
            C81187v vVar = new C81187v(this);
            CdnLogic.InitSavePath("/data/user/0/" + MMApplicationContext.getPackageName() + "/MicroMsg/CronetCache/appbrand/cache/", vVar, true ^ C45628s0.m50756U());
        }
        MMApplicationContext.isToolsProcess();
    }
}
