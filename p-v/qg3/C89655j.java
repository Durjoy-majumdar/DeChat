package qg3;

import a70.C0014c;
import a70.C112760b;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import androidx.window.embedding.SplitController;
import bp3.C79758p;
import bp3.C79760s;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80622u0;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.app.C80635x0;
import com.tencent.p014mm.ipcinvoker.C80910p;
import com.tencent.p014mm.legacy.app.WeChatSplash;
import com.tencent.p014mm.legacy.app.WeChatSplashStartup;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.entry.ApplicationLike;
import gy3.C87412m;
import hi3.C87520e;
import j40.C87829b;
import java.io.File;
import lg3.C76694b;
import lg3.C88494d;
import lg3.C88497f;
import tc3.C13871e;
import tc3.C90390a;

/* renamed from: qg3.j */
public class C89655j extends C89646b {
    /* renamed from: d */
    public void mo123976d(ApplicationLike applicationLike) {
        super.mo123976d(applicationLike);
        Application application = applicationLike.getApplication();
        C80622u0 a = C80622u0.m98265a(application);
        if ((a == C80622u0.MM || a == C80622u0.TOOLS) && C85861e4.m106120g()) {
            SplitController.initialize(application.getApplicationContext(), C0966R.xml.f8914k);
        }
        WeChatSplash.m98819a();
    }

    /* renamed from: f */
    public void mo123978f(ApplicationLike applicationLike) {
        super.mo123978f(applicationLike);
        C79760s.m96908a("initBasicLibrary");
        Application application = applicationLike.getApplication();
        boolean z = false;
        if (C80625v0.MATCH_NOT_PLAIN_NOT_ISOLATED_PROCESSES.matches(application)) {
            C89652g gVar = new C89652g(this, application);
            C80910p.C80914d[] dVarArr = C80910p.f237761a;
            synchronized (dVarArr) {
                dVarArr[0] = gVar;
            }
        }
        C79760s.m96909b();
        try {
            C79760s.m96908a("initGUIRelatedLibrary");
            Application application2 = applicationLike.getApplication();
            C79760s.m96908a("initResources");
            MMApplicationContext.setResourcesProvider(new C89654h(this, application2));
            C79760s.m96909b();
            if (C80622u0.m98265a(application2).f235888f) {
                String a = C0014c.f14b.mo19a("login_user_name", "");
                File file = new File(C112760b.m154225d(), "version_history.cfg");
                if (Util.isNullOrNil(a) && !file.exists()) {
                    C76694b.m92339e();
                }
                C88494d.f255618j = new C47840i(this);
                if (C88497f.m110368a()) {
                    if (!MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("special_dark_mode_set_follow_system", false)) {
                        MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("dark_mode_follow_system", true);
                        C85875k4.m106201p0();
                        MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("special_dark_mode_set_follow_system", true);
                    }
                } else if (!MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("dark_mode_set_follow_system", false)) {
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("dark_mode_follow_system", true);
                    C85875k4.m106201p0();
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("dark_mode_set_follow_system", true);
                }
                C80635x0.f235900a = null;
                C80635x0.f235901b = "com.tencent.mm.boot";
                Resources resources = application2.getResources();
                C87520e.m108847e(application2, C80635x0.f235901b);
                C80635x0.f235902c = application2;
                C80635x0.f235903d = resources;
            }
            C79760s.m96908a("prepareKernelStartup");
            WeChatSplash.m98820b(this.f257875b, new WeChatSplashStartup());
            if (C80622u0.m98265a(applicationLike.getApplication()).f235888f) {
                C87829b bVar = this.f257875b;
                C87412m.m108594g(bVar, Scopes.PROFILE);
                Application application3 = bVar.f124990c;
                C87412m.m108593f(application3, "profile.application()");
                C87412m.m108593f(bVar.f124988a, "profile.processName");
                if (MultiProcessMMKV.getMMKV("activity_hook").getInt("has_error", 0) != 0) {
                    long decodeLong = MultiProcessMMKV.getMMKV("activity_hook").decodeLong("has_error", 0);
                    C13871e eVar = C13871e.f39036a;
                    eVar.mo13201b((int) decodeLong);
                    C13871e.m13176a(eVar, 1856, 1, 0, 4, (Object) null);
                } else {
                    Class<Instrumentation> cls = Instrumentation.class;
                    try {
                        cls.getDeclaredMethod("execStartActivity", new Class[]{Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class});
                        z = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.ActivityHook", th, "catch throw in check hack", new Object[0]);
                        MultiProcessMMKV.getMMKV("activity_hook").encode("has_error", 1);
                        C13871e eVar2 = C13871e.f39036a;
                        eVar2.mo13201b(1);
                        C13871e.m13176a(eVar2, 1856, 1, 0, 4, (Object) null);
                    }
                }
                if (z) {
                    C79758p.f233760a.mo109886i(new C90390a(application3));
                } else {
                    Log.m105920e("MicroMsg.ActivityHook", "ActivityHook dont hack, it's not safe");
                }
                C13871e eVar3 = C13871e.f39036a;
            }
        } catch (Throwable th4) {
            throw th4;
        } finally {
            C79760s.m96909b();
        }
    }
}
