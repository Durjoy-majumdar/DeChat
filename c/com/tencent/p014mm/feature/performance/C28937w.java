package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import h81.C32735h;
import java.util.concurrent.TimeUnit;
import p1028re.C89928a;
import p206nj.C76862i;
import p761yd.C38993b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.feature.performance.w */
public class C28937w implements C89928a {

    /* renamed from: d */
    public volatile boolean f79384d = false;

    /* renamed from: e */
    public volatile boolean f79385e = false;

    /* renamed from: f */
    public volatile boolean f79386f = false;

    /* renamed from: g */
    public volatile boolean f79387g = false;

    /* renamed from: h */
    public volatile boolean f79388h = false;

    /* renamed from: i */
    public volatile boolean f79389i = false;

    /* renamed from: j */
    public final /* synthetic */ C80864q f79390j;

    public C28937w(C80864q qVar) {
        this.f79390j = qVar;
    }

    /* renamed from: a */
    public void mo391a(int i) {
        if (WeChatEnvironment.hasDebugger()) {
            Log.m105924i("MicroMsg.PluginPerformance", "debugger env: flush");
            mo56331c();
            mo56332d();
        }
    }

    /* renamed from: b */
    public void mo392b() {
        mo56331c();
        mo56332d();
    }

    /* renamed from: c */
    public final void mo56331c() {
        this.f79384d = C38993b.m41994d(C32735h.C32737c.clicfg_matrix_trim_memory_madvise_mmkv, true, false);
        this.f79385e = C38993b.m41994d(C32735h.C32737c.clicfg_matrix_trim_memory_madvise_x_so, BuildInfo.DEBUG || WeChatEnvironment.hasDebugger(), false);
        this.f79386f = C38993b.m41994d(C32735h.C32737c.clicfg_matrix_trim_memory_madvise_x_odex, false, false);
        this.f79387g = C38993b.m41994d(C32735h.C32737c.clicfg_matrix_trim_memory_madvise_x_base_apk, false, false);
        this.f79388h = C38993b.m41994d(C32735h.C32737c.clicfg_matrix_trim_memory_madvise_x_tinker_apk, false, false);
        this.f79389i = C38993b.m41994d(C32735h.C32737c.clicfg_matrix_trim_memory_madvise_x_mm_apk, false, false);
        Log.m105925i("MicroMsg.PluginPerformance", "MADV_DONTNEED: mmkv=%s, xso=%s, xodex=%s, baseApk=%s, tinkerApk=%s, mmApk=%s", Boolean.valueOf(this.f79384d), Boolean.valueOf(this.f79385e), Boolean.valueOf(this.f79386f), Boolean.valueOf(this.f79387g), Boolean.valueOf(this.f79388h), Boolean.valueOf(this.f79389i));
    }

    /* renamed from: d */
    public final void mo56332d() {
        if (!C38993b.m41993c(C32735h.C32737c.clicfg_matrix_trim_memory_madvise_enable, BuildInfo.DEBUG || WeChatEnvironment.hasDebugger())) {
            Log.m105924i("MicroMsg.PluginPerformance", "MADV_DONTNEED: madvise disabled by expt");
        } else if (!C76862i.m92661a("xperf")) {
            Log.m105920e("MicroMsg.PluginPerformance", "MADV_DONTNEED: ExpansionsProxy: xperf NOT installed");
        } else if (System.currentTimeMillis() - this.f79390j.f237696f < TimeUnit.MINUTES.toMillis(1)) {
            Log.m105920e("MicroMsg.PluginPerformance", "MADV_DONTNEED: avoid trimming frequently");
        } else {
            ((C119157j) C119157j.f356862d).mo183885p(new w$$a(this), "trim-madvise");
        }
    }
}
