package com.tencent.p014mm.modelrecovery;

import android.app.Application;
import android.content.Context;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.recovery.RecoveryInitializer;
import com.tencent.p014mm.recoveryv2.C85672d;
import com.tencent.p014mm.recoveryv2.C85675e;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import g40.C87134f;
import h81.C32735h;
import j40.C87829b;
import p910lj.C76701a;
import wc0.C90944f;
import wc0.b$$a;
import wc0.c$$a;
import zt3.C119157j;
import zt3.C119179t;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.modelrecovery.PluginRecovery */
public class PluginRecovery extends C86301e {
    public void onCreate(Context context) {
        super.onCreate(context);
        final C87829b a = C86709a0.m107531m().mo58407a();
        if (MMApplicationContext.isMainProcess()) {
            final Application application = C86709a0.m107531m().mo58407a().f124990c;
            C86709a0.m107528h().mo121097c(new C87134f(this) {
                /* renamed from: e */
                public void mo1180e() {
                    Log.m105924i("MicroMsg.recovery.PluginRecovery", "Check app profile: ");
                    Log.m105924i("MicroMsg.recovery.PluginRecovery", "UserId = " + ScopedStorageUtil.WorkProfiles.getAppUserId());
                    Log.m105924i("MicroMsg.recovery.PluginRecovery", "UserInfo = " + ScopedStorageUtil.WorkProfiles.getAppUserInfo(application));
                    Log.m105924i("MicroMsg.recovery.PluginRecovery", "UserProfile = " + ScopedStorageUtil.WorkProfiles.getAppProfile(application));
                    boolean isRunningInDualApp = ScopedStorageUtil.WorkProfiles.isRunningInDualApp(application);
                    Log.m105924i("MicroMsg.recovery.PluginRecovery", "RunningInDualApp = " + isRunningInDualApp);
                    if (isRunningInDualApp && WeChatEnvironment.isCoolassistEnv()) {
                        C76701a.makeText(application, (CharSequence) "微信正运行在分身应用, 部分功能可能存在兼容性问题", 0).show();
                    }
                    synchronized (RecoveryInitializer.class) {
                    }
                }

                /* renamed from: g */
                public void mo1181g(boolean z) {
                }
            });
        }
        ((C119157j) C119157j.f356862d).mo183875f(new b$$a());
        if (MMApplicationContext.isMainProcess()) {
            ((C119157j) C119157j.f356862d).mo183875f(new Runnable(this) {
                public void run() {
                    try {
                        if (BuildInfo.IS_FLAVOR_RED) {
                            C85675e eVar = new C85675e(a.f124990c);
                            C85675e.f249645i = true;
                            eVar.mo119259a();
                        }
                        C90944f.m114050b(a.f124990c);
                        C90944f.m114049a(a.f124990c);
                        Application application = a.f124990c;
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.recovery.PluginRecovery", e, "post recovery fail", new Object[0]);
                    }
                }
            });
            C86709a0.m107528h().mo121097c(new C87134f(this) {
                /* renamed from: e */
                public void mo1180e() {
                    C86709a0.m107528h().mo121101p(this);
                    ((C119157j) C119157j.f356862d).mo183875f(new Runnable() {
                        public void run() {
                            if (C86709a0.m107528h().f251724a.f251792d) {
                                Log.m105924i("MicroMsg.recovery.PluginRecovery", "pull recovery online config");
                                Context context = MMApplicationContext.getContext();
                                try {
                                    C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
                                    if (hVar != null) {
                                        C85672d.C85674b bVar = new C85672d.C85674b(context, "recovery_enable");
                                        bVar.mo119256e();
                                        boolean z = true;
                                        bVar.getBoolean("enable", true);
                                        int Qe = hVar.mo58779Qe(C32735h.C32737c.clicfg_recovery_r_enable, 1);
                                        if (Qe <= 0) {
                                            z = false;
                                        }
                                        bVar.putBoolean("enable", z);
                                        bVar.mo119242c();
                                        Log.m105924i("MicroMsg.recovery.reporter", "online config, enabled = " + Qe);
                                        C85675e eVar = new C85675e(context);
                                        int Qe2 = hVar.mo58779Qe(C32735h.C32737c.clicfg_recovery_r_threshold_1, 5);
                                        int Qe3 = hVar.mo58779Qe(C32735h.C32737c.clicfg_recovery_r_threshold_2, 6);
                                        long He = hVar.mo58777He(C32735h.C32737c.clicfg_recovery_r_auto_reset, 10000);
                                        long He2 = hVar.mo58777He(C32735h.C32737c.clicfg_recovery_r_interval, 10000);
                                        long He3 = hVar.mo58777He(C32735h.C32737c.clicfg_recovery_r_interval_sub, 30000);
                                        long He4 = hVar.mo58777He(C32735h.C32737c.clicfg_recovery_r_app_exit_info, 1800000);
                                        if (WeChatEnvironment.isCoolassistEnv() || WeChatEnvironment.hasDebugger()) {
                                            He4 = 0;
                                        }
                                        if (Qe2 >= 2) {
                                            Log.m105924i("MicroMsg.recovery.reporter", "setThresholdLevel1, value = " + Qe2);
                                            eVar.f249646a = Qe2;
                                        }
                                        if (Qe3 >= eVar.f249646a) {
                                            Log.m105924i("MicroMsg.recovery.reporter", "setThresholdLevel2, value = " + Qe3);
                                            eVar.f249647b = Qe3;
                                        }
                                        if (He >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                                            Log.m105924i("MicroMsg.recovery.reporter", "setAutoResetDelay, value = " + He);
                                            eVar.f249651f = He;
                                        }
                                        if (He2 >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                                            Log.m105924i("MicroMsg.recovery.reporter", "setCrashInterval, value = " + He2);
                                            eVar.f249648c = He2;
                                        }
                                        if (He3 >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                                            Log.m105924i("MicroMsg.recovery.reporter", "setCrashSubInterval, value = " + He3);
                                            eVar.f249649d = He3;
                                        }
                                        if (He4 >= 0) {
                                            Log.m105924i("MicroMsg.recovery.reporter", "setAppExitInfoInterval, value = " + He4);
                                            eVar.f249652g = He4;
                                        }
                                        eVar.mo119259a();
                                    }
                                } catch (Throwable th) {
                                    Log.printErrStackTrace("MicroMsg.recovery.reporter", th, "pull abtest config for recovery fail", new Object[0]);
                                }
                            }
                            long j = new C85675e(a.f124990c).f249651f;
                            Log.m105924i("MicroMsg.recovery.PluginRecovery", "unregister recovery after millis: " + j);
                            C119179t tVar = C119157j.f356862d;
                            c$$a c__a = new c$$a();
                            C119157j jVar = (C119157j) tVar;
                            jVar.getClass();
                            jVar.mo183892w(c__a, j, false);
                        }
                    });
                }

                /* renamed from: g */
                public void mo1181g(boolean z) {
                }
            });
        }
    }
}
