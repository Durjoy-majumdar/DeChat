package com.tencent.p014mm.feature.performance;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import be2.C28302a;
import be2.C79692b;
import be2.C79693c;
import ce2.C28544a;
import com.tencent.matrix.lifecycle.C80403e;
import com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner;
import com.tencent.matrix.p469fd.FDDumpBridge;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.matrix.C80981c;
import com.tencent.p014mm.plugin.expansions.C85178q;
import com.tencent.p014mm.plugin.performance.elf.AbstractProcessChecker;
import com.tencent.p014mm.plugin.performance.watchdogs.C85324a;
import com.tencent.p014mm.plugin.performance.watchdogs.C85325b;
import com.tencent.p014mm.plugin.performance.watchdogs.C85326c;
import com.tencent.p014mm.plugin.performance.watchdogs.C85341m;
import com.tencent.p014mm.plugin.performance.watchdogs.C85342n;
import com.tencent.p014mm.plugin.performance.watchdogs.C85349q;
import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.plugin.performance.watchdogs.ThreadWatchDog;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.GCSemiSpaceTrimWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.PatronsWrapper;
import com.tencent.p014mm.sdk.platformtools.RuntimeVerifyMuteWrapper;
import com.tencent.p014mm.sdk.platformtools.ThreadStackShinkerWrapper;
import com.tencent.p014mm.sdk.platformtools.WVReservedSpaceShinkerWrapper;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import ge2.C32427c;
import h81.C32735h;
import java.util.LinkedList;
import java.util.List;
import je2.C117345a;
import kj2.C117407d;
import oa1.C117731d;
import p1028re.C89931d;
import p1177ce.C113310f;
import p212oe.C117750b;
import p212oe.C89203l;
import p285zh.C119114c;
import p757xv.C91352r;
import p757xv.C91353u;
import p757xv.C91354v;
import p761yd.C38993b;
import p933be.C113173i;
import qe3.C89625d;
import r40.C89868a;
import r70.C89892d;
import zt3.C119140a;
import zt3.C119146d;
import zt3.C119157j;
import zt3.C119179t;

@C86522b(dependencies = {C28920c0.class}, onProcess = {C80625v0.MATCH_NOT_PLAIN_NOT_ISOLATED_PROCESSES})
/* renamed from: com.tencent.mm.feature.performance.q */
public class C80864q extends C86301e implements C91353u {

    /* renamed from: g */
    public static volatile C79692b f237693g;

    /* renamed from: d */
    public C117345a f237694d = new C117345a();

    /* renamed from: e */
    public volatile boolean f237695e;

    /* renamed from: f */
    public volatile long f237696f;

    public C80864q() {
        this.f237695e = MMApplicationContext.isMainProcess() || MMApplicationContext.isAppBrandProcess() || MMApplicationContext.isToolsProcess();
        this.f237696f = 0;
    }

    /* renamed from: CU */
    public C91352r mo112623CU() {
        return MemoryWatchDog.f248575A;
    }

    /* renamed from: Fp */
    public boolean mo112624Fp() {
        return C117750b.m166050h();
    }

    /* renamed from: Sw */
    public boolean mo112625Sw() {
        return C85324a.f248603f;
    }

    public long Zk0() {
        return AbstractProcessChecker.m105295f();
    }

    /* renamed from: ck */
    public int mo112627ck() {
        return C85342n.m105365c();
    }

    /* renamed from: eq */
    public boolean mo112628eq() {
        return C79693c.m96809c();
    }

    /* renamed from: m6 */
    public boolean mo112629m6() {
        return C80981c.INSTANCE.mo112802h();
    }

    /* renamed from: mt */
    public int mo112630mt() {
        return C85342n.m105363a();
    }

    public C91354v n70() {
        return ThreadWatchDog.getDog();
    }

    public void onAccountInitialized(Context context) {
        if (MMApplicationContext.isMainProcess()) {
            C86709a0.m107525e().postToWorkerDelayed(new q$$j(this), 2000);
        }
    }

    public void onAccountReleased(Context context) {
    }

    public void onCreate(Context context) {
        Class cls = C32735h.class;
        C117345a aVar = this.f237694d;
        boolean isMainProcess = MMApplicationContext.isMainProcess();
        aVar.getClass();
        Log.m105924i("ThreadPool.Profiler", "[open] isProcessMain=" + isMainProcess);
        AppForegroundDelegate.INSTANCE.mo174209b(aVar);
        C119146d.f356849a = aVar.f351310v;
        C119146d.f356850b = aVar.f351308t;
        C119140a.f356821h = aVar.f351309u;
        boolean z = false;
        if (WeChatEnvironment.hasDebugger() || ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_enable_threadstack_shrink_rel_new, false)) {
            ThreadStackShinkerWrapper.markEnabled(MMApplicationContext.getContext());
            ThreadStackShinkerWrapper.storeIgnoredCreatorSoPatterns(MMApplicationContext.getContext(), ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_threadstack_shrink_ignore_so_patterns_rel_new, ""));
        } else {
            ThreadStackShinkerWrapper.markDisabled(MMApplicationContext.getContext());
        }
        if (WeChatEnvironment.hasDebugger() || ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_enable_wv_reserved_space_shinker, false)) {
            WVReservedSpaceShinkerWrapper.markEnabled(MMApplicationContext.getContext());
            WVReservedSpaceShinkerWrapper.markStartupFine(MMApplicationContext.getContext());
        } else {
            WVReservedSpaceShinkerWrapper.markDisabled(MMApplicationContext.getContext());
        }
        if (WeChatEnvironment.hasDebugger() || ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_enable_patrons_gc_space_tweak, false)) {
            PatronsWrapper.installExceptionFuse();
            PatronsWrapper.markEnabled(MMApplicationContext.getContext(), false);
        } else {
            PatronsWrapper.markDisabled(MMApplicationContext.getContext());
        }
        if (WeChatEnvironment.hasDebugger() || ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_enable_moving_gc_semispace_tweak, false)) {
            GCSemiSpaceTrimWrapper.markEnabled(MMApplicationContext.getContext(), false);
        } else {
            GCSemiSpaceTrimWrapper.markDisabled(MMApplicationContext.getContext());
        }
        if (WeChatEnvironment.hasDebugger() || ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_enable_patrons_3g_agressive_strategy, false)) {
            PatronsWrapper.markAggressiveStrategyEnabled(MMApplicationContext.getContext());
        } else {
            PatronsWrapper.markAggressiveStrategyDisabled(MMApplicationContext.getContext());
        }
        if (WeChatEnvironment.hasDebugger() || ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_enable_runtime_verify_mute, false)) {
            RuntimeVerifyMuteWrapper.markEnabled(MMApplicationContext.getContext());
        } else {
            RuntimeVerifyMuteWrapper.markDisabled(MMApplicationContext.getContext());
        }
        C89931d.f258426c.mo124253c(new q$$h(this));
        if (MMApplicationContext.isPushProcess()) {
            C32427c cVar = C32427c.f85998c;
            try {
                cVar.f86002a = C32427c.m39719a(((float) ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_process_enable, 0)) / 10000.0f);
                C32427c.f85997b = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_android_process_check_time, 1200000);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ProcessElf", e, "", new Object[0]);
                C32427c.f85997b = 1200000;
                cVar.f86002a = false;
            }
            Log.m105925i("MicroMsg.ProcessElf", "[call] isEnable:%b CHECK_TIME:%s", Boolean.valueOf(cVar.f86002a), Long.valueOf(C32427c.f85997b));
            if (cVar.f86002a) {
                MMHandler mMHandler = C32427c.f85999d;
                Runnable runnable = C32427c.f86001f;
                mMHandler.removeCallbacks(runnable);
                mMHandler.postDelayed(runnable, C32427c.f85997b);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("ACTION_ELF_CHECK_RESPONSE");
            intentFilter.addAction("com.tencent.mm.MMUIModeManager");
            MMApplicationContext.getContext().registerReceiver(C32427c.f86000e, intentFilter);
        }
        Application application = C80589e.f235760a.getApplication();
        application.registerActivityLifecycleCallbacks(new C89868a());
        MemoryWatchDog memoryWatchDog = MemoryWatchDog.f248575A;
        memoryWatchDog.f248576d = memoryWatchDog.f248584o.getMemoryClass();
        memoryWatchDog.f248577e = memoryWatchDog.f248584o.getLargeMemoryClass();
        ((Application) MMApplicationContext.getContext()).registerActivityLifecycleCallbacks(memoryWatchDog);
        memoryWatchDog.f248589t = System.currentTimeMillis();
        long j = 1800000;
        ((C119157j) C119157j.f356862d).mo183879j(memoryWatchDog, memoryWatchDog.f248582j ? 300000 : 1800000, "MicroMsg.MemoryWatchDog");
        C89931d.f258426c.mo124253c(memoryWatchDog);
        C85324a aVar2 = C85324a.f248602e;
        aVar2.getClass();
        if (MMApplicationContext.isAppBrandProcess()) {
            try {
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_high_pss_threshold, 2000000);
                C85324a.f248604g = Qe;
                if (Qe != 0) {
                    ((C119157j) C119157j.f356862d).mo183879j(aVar2, 300000, "AppbrandMemoryMonitor");
                }
            } catch (Exception unused) {
            }
        }
        if (!C85349q.f248707b && MMApplicationContext.isToolsProcess()) {
            MemoryWatchDog memoryWatchDog2 = MemoryWatchDog.f248575A;
            C85349q.C85351b bVar = C85349q.f248706a;
            memoryWatchDog2.mo118589o(bVar);
            ThreadWatchDog.getDog().setExtraInfoFactory(bVar);
            C89892d.f258345b = C85349q.f248708c;
            C85349q.f248707b = true;
        }
        double random = Math.random();
        if (random >= 1.0d / ((double) ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_boot_memory_watchdog_sample_rate, 100000))) {
            Log.m105925i("MicroMsg.PluginPerformance", "NOT report memory info after boot (%s)", Double.valueOf(random));
        } else {
            Log.m105925i("MicroMsg.PluginPerformance", "will repot memory info after boot (%s)", Double.valueOf(random));
            C86709a0.m107528h().mo121097c(new C80865r(this));
        }
        application.registerActivityLifecycleCallbacks(ThreadWatchDog.getDog());
        C85325b bVar2 = C85325b.f248606p;
        bVar2.getClass();
        try {
            bVar2.f248615n = FDDumpBridge.getFDLimit();
            MultiProcessMMKV.getDefault().encode(MMApplicationContext.getProcessName() + "_mFdLimit", bVar2.f248615n);
            Log.m105925i("MicroMsg.FDWatchDog", "FdLimit = %s", Integer.valueOf(bVar2.f248615n));
            int i = 230;
            int i2 = bVar2.f248615n;
            if (i2 <= 1024) {
                i = 231;
            } else if (i2 <= 2048) {
                i = 232;
            } else if (i2 <= 4096) {
                i = 233;
            }
            C117407d.INSTANCE.idkeyStat(1031, (long) i, 1, false);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.FDWatchDog", th, "get resource limit err", new Object[0]);
            C117407d.INSTANCE.idkeyStat(1031, 251, 1, false);
        }
        ((C119157j) C119157j.f356862d).mo183878i(bVar2, 1800000);
        C85341m mVar = C85341m.f248689g;
        mVar.getClass();
        if (!MMApplicationContext.isMainProcess()) {
            Log.m105920e("MicroMsg.ProcessWatchDog", "NOT main process");
        } else {
            C119179t tVar = C119157j.f356862d;
            if (mVar.f248690d) {
                j = 300000;
            }
            ((C119157j) tVar).mo183878i(mVar, j);
        }
        if (!C38993b.m41995e("clicfg_foreground_oom_adj_watchdog_enable", false)) {
            Log.m105924i("MicroMsg.ForegroundOomAdjWatchDog", "disabled");
        } else {
            ProcessUIResumedStateOwner.INSTANCE.observeForever(new C85326c());
        }
        C85178q.m105040d(new C28935s());
        MMBitmapFactory.m98740i(new C80867u(this));
        boolean c = C38993b.m41993c(C32735h.C32737c.clicfg_matrix_memory_mallopt_purge, true);
        boolean c2 = C38993b.m41993c(C32735h.C32737c.clicfg_matrix_memory_mallopt_purge_32_bit, false);
        if (!c) {
            Log.m105924i("MicroMsg.PluginPerformance", "setupMallOpt: disabled");
        } else if (BuildInfo.IS_ARM64 || c2) {
            C28939y yVar = new C28939y(this);
            C89931d dVar = C89931d.f258426c;
            dVar.mo124253c(yVar);
            if (C38993b.m41993c(C32735h.C32737c.clicfg_matrix_memory_mallopt_purge_app_bg, BuildInfo.DEBUG || WeChatEnvironment.hasDebugger() || C89625d.f257845k || BuildInfo.IS_FLAVOR_P_ALPHA)) {
                dVar.mo124252b(yVar);
            }
        } else {
            Log.m105924i("MicroMsg.PluginPerformance", "setupMallOpt: disabled for 32bit");
        }
        ProcessUIResumedStateOwner.INSTANCE.addLifecycleCallback((C80403e) new C28936v(this));
        C28937w wVar = new C28937w(this);
        C89931d dVar2 = C89931d.f258426c;
        dVar2.mo124253c(wVar);
        if (C38993b.m41993c(C32735h.C32737c.clicfg_matrix_trim_memory_madvise_enable_app_bg, BuildInfo.DEBUG || WeChatEnvironment.hasDebugger())) {
            dVar2.mo124252b(wVar);
        }
        String processName = MMApplicationContext.getProcessName();
        if (C79692b.f233595g == null) {
            C79692b.f233595g = new C79692b(processName.replace(XVFSFile.PATH_SEPARATOR, "_"));
        }
        f237693g = C79692b.f233595g;
        C79692b bVar3 = f237693g;
        bVar3.f233596d = bVar3.f233597e.decodeInt("state", 0);
        Log.m105919d("MicroMsg.ForegroundKilledDetect", "%s: CHECK LAST STATE = %s", bVar3.f233598f, Integer.toBinaryString(bVar3.f233596d));
        if ((bVar3.f233596d & 1) == 1) {
            if ((bVar3.f233596d & 2) == 2) {
                if (!((bVar3.f233596d & 4) == 4)) {
                    Log.m105921e("MicroMsg.ForegroundKilledDetect", "%s: LAST STATE ERROR: %s", bVar3.f233598f, Integer.toBinaryString(bVar3.f233596d));
                    C86709a0.m107528h().mo121097c(new C28302a(bVar3));
                }
            }
        }
        bVar3.f233596d &= -2;
        bVar3.f233596d &= -3;
        bVar3.f233596d &= -5;
        bVar3.mo109808a();
        f237693g.onAppForeground("boot");
        application.registerActivityLifecycleCallbacks(f237693g);
        CrashReportFactory.addCrashReportExtraMessageGetter(f237693g);
        Log.m105925i("MicroMsg.PluginPerformance", "build.ENABLE_MATRIX_MEMORY_HOOK = %s, build.ENABLE_MATRIX_PTHREAD_HOOK = %s, build.ENABLE_MATRIX_SILENCE_ANALYSE = %s", Boolean.valueOf(BuildInfo.ENABLE_MATRIX_MEMORY_HOOK), Boolean.valueOf(BuildInfo.ENABLE_MATRIX_PTHREAD_HOOK), Boolean.valueOf(BuildInfo.ENABLE_MATRIX_SILENCE_ANALYSE));
        if (C117750b.m166044b() > 0) {
            Log.m105928w("MicroMsg.PluginPerformance", "Enable pthread hook for further trace");
            C28544a.INSTANCE.mo56047c("<cmd><diagnostic><PthreadHook\n enable='1' process='mm' duration='1' hook='.*\\.so$' thread='.*'/></diagnostic></cmd>");
        }
        q$$a q__a = new q$$a();
        List<C89203l.C89204a> list = C89203l.f257037a;
        synchronized (list) {
            ((LinkedList) list).add(q__a);
        }
        if (MMApplicationContext.isMainProcess()) {
            C119179t tVar2 = C119157j.f356862d;
            q$$i q__i = new q$$i(this);
            C119157j jVar = (C119157j) tVar2;
            jVar.getClass();
            jVar.mo183886q(q__i, 10000, (String) null);
            C113173i e2 = C117750b.m166047e();
            if (e2 != null) {
                C113310f fVar = e2.f338613h.f339057d;
                fVar.f339027B = new q$$b();
                fVar.f339028C = new q$$c();
            }
            if (C117750b.m166050h() && C117750b.m166049g()) {
                ((C119157j) C119157j.f356862d).mo183875f(new q$$d());
            }
            if (((C32735h) C86312j.m106911c(cls)) != null) {
                BitmapUtil.setDisableMediaApi(C117731d.m166007c().mo182444f("clicfg_disable_mediaapi_use_fileapi", "0", false, true).equals("1"));
            }
            ((C119157j) C119157j.f356862d).mo183875f(new q$$e(application));
        }
        if (MMApplicationContext.isMainProcess() || MMApplicationContext.isPushProcess()) {
            C119114c.f356701r = new q$$f();
            C119114c.f356702s = new q$$g();
        }
        if (MMApplicationContext.isMainProcess()) {
            if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || C89625d.f257845k || ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_app_background_fallback_notify_enable2, 1) == 1) {
                z = true;
            }
            AppForegroundDelegate.f343441u = z;
        }
    }
}
