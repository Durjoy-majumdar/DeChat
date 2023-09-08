package com.tencent.p014mm.plugin.appbrand.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.luggage.sdk.processes.main.LuggageInitTask;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.C1523c3;
import com.tencent.p014mm.plugin.appbrand.C81810e;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81286k3;
import com.tencent.p014mm.plugin.appbrand.debugger.console.C81720v;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84341w;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.FilesCopy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86013q1;
import di0.C86294i;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import iu0.C87815d;
import p1038ta.C90382a;
import p1038ta.C90383b;
import p170ic.C87690d;

@C86522b(dependencies = {C81180q.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI, C80625v0.MATCH_SUPPORT})
/* renamed from: com.tencent.mm.plugin.appbrand.app.PluginAppBrand */
public final class PluginAppBrand extends C86301e implements C86294i, C1523c3 {
    public static final String TAG = "MicroMsg.PluginAppBrand[speedtest]";
    private C81286k3 mWxaPkgStorageRouter;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.PluginAppBrand$a */
    public class C81137a implements Runnable {
        public C81137a(PluginAppBrand pluginAppBrand) {
        }

        public void run() {
            C81169m2 m2Var = new C81169m2();
            if (C90383b.f259396a != null) {
                Log.m105920e("Luggage.LuggageBoot", "do not setup more than once.");
                return;
            }
            C90383b.f259396a = m2Var;
            m2Var.mo113342a(new C90382a());
        }
    }

    private void configure() {
    }

    private void copyWxaDecodeKeyFile() {
        String str = MMApplicationContext.getContext().getApplicationContext().getFilesDir().getAbsolutePath() + "/" + "wasae.dat";
        if (!C86013q1.m106450k(str) || !"43bff1e72298b0ea0b73e2960d3c97b8".equals(C86013q1.m106456q(str))) {
            Log.m105919d(TAG, "copy key file ok: %b", Boolean.valueOf(FilesCopy.copyAssets(MMApplicationContext.getContext(), "wasae.dat", str)));
            return;
        }
        Log.m105918d(TAG, "key file exist, skip copy");
    }

    public static SharedPreferences getProcessSharedPrefs() {
        return C1510o.f10864a.mo1516a();
    }

    private void installed() {
        Log.m105924i(TAG, "installed()");
        if (MMApplicationContext.isMainProcess()) {
            AppBrandProcessesManager.m103872O(C84341w.m103968b());
        }
    }

    public static boolean isAppBrandProcess() {
        try {
            String packageName = MMApplicationContext.getPackageName();
            String str = C86709a0.m107531m().mo58407a().f124988a;
            return str.startsWith(packageName + ":appbrand");
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSupportProcess() {
        try {
            return WeChatProcess.PROCESS_SUPPORT.equals(C86709a0.m107531m().mo58407a().f124988a);
        } catch (Exception unused) {
            return false;
        }
    }

    public void execute() {
        boolean z = false;
        Log.m105925i(TAG, "execute() current process name = %s, isMainThread %b", C86709a0.m107531m().mo58407a().f124988a, Boolean.valueOf(MMHandlerThread.isMainThread()));
        MMApplicationContext.isMainProcess();
        if (isAppBrandProcess()) {
            new LuggageInitTask(MMApplicationContext.getProcessName()).mo114395c();
        }
        C87690d.m109091b("WeChatMultiProcessInitDelegateImpl", new C81137a(this));
        C80589e.f235760a.getApplication();
        if (MMApplicationContext.isMainProcess()) {
            C30650a.m39147b(new C81810e(), "//wagame", "//enable_appbrand_monkey_test", "//disable_appbrand_monkey_test", "//appbrand_monkey_bringtofront", "//appbrand_monkey_test_skip_appbrand_process_suicide", "//appbrand_predownload_trigger", "//callsearchshowoutwxaapp", "//getsearchshowoutwxaapp", "//appbrandtest", "//wxafts", "//wxatest", "//xweb_video_player", "//appbrand_video", "//showad", "//allshowad", "//localwxalibrary", "//enable_appbrand_file_size_statistics_debug", "//enableweappallhalfscreen", "//deletexnetlibdebugdir", "//xnetusingdebugso", "//appbrand_file_clean", "//appbrand_switch_render", "//appbrand_headless_start");
            C30650a.m39147b(new C87815d(), "//skia");
        } else {
            isAppBrandProcess();
            MMApplicationContext.isToolsProcess();
            if (isAppBrandProcess()) {
                copyWxaDecodeKeyFile();
            }
        }
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger()) {
            z = true;
        }
        if (z) {
            C81720v.f239836a.mo114086a();
        }
    }

    public C81286k3 getWxaPkgStorageRouter() {
        if (this.mWxaPkgStorageRouter == null) {
            C81161g2.requireAccountInitializedOnDemand();
            C81258h3 h3Var = C81161g2.f238471g;
            C81161g2.requireAccountInitializedOnDemand();
            this.mWxaPkgStorageRouter = new C81286k3(h3Var, C81161g2.f238472h);
        }
        return this.mWxaPkgStorageRouter;
    }

    public void onCreate(Context context) {
        installed();
        configure();
        execute();
    }

    public void requireAndWaitForAccountInitialized() {
        requireAccountInitialized();
    }

    public void waitFor() {
    }
}
