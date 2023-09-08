package qg3;

import android.app.Application;
import android.os.Build;
import android.os.SystemClock;
import bp3.C79757o;
import com.tencent.p014mm.app.C28674a;
import com.tencent.p014mm.app.C28680l;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.app.C80635x0;
import com.tencent.p014mm.booter.C80824k0;
import com.tencent.p014mm.legacy.app.WeChatSplash;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.splash.C85788m;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.xwebutil.C86027m;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.pinus.XWebChildProcessHelper;
import di3.C86312j;
import f40.C86739i0;
import h40.C87422a;
import j40.C46396a;
import j40.C87829b;
import p206nj.C88957l;
import p261wl.C38166b;
import p261wl.C38170c;
import p261wl.C38175j;
import p787ai.C79546a;
import r40.C47925e;
import zt3.C119154h;

/* renamed from: qg3.l */
public class C89657l extends C89646b {

    /* renamed from: c */
    public final Application f257885c;

    /* renamed from: d */
    public final ApplicationLike f257886d;

    /* renamed from: e */
    public final String f257887e;

    /* renamed from: f */
    public final long f257888f = System.currentTimeMillis();

    public C89657l() {
        ApplicationLike applicationLike = C80589e.f235760a;
        applicationLike.getApplicationStartMillisTime();
        long applicationStartElapsedTime = applicationLike.getApplicationStartElapsedTime();
        int[] iArr = C79546a.f233229a;
        C86739i0.f251798a = applicationStartElapsedTime;
        Application application = applicationLike.getApplication();
        this.f257885c = application;
        this.f257886d = applicationLike;
        this.f257887e = C79757o.m96896a(application);
    }

    /* renamed from: d */
    public void mo123976d(ApplicationLike applicationLike) {
        Application application = this.f257885c;
        if (Build.MANUFACTURER.equals("samsung") && Build.VERSION.SDK_INT <= 24) {
            application.registerActivityLifecycleCallbacks(new C47925e(application));
        }
        WeChatSplash.m98819a();
        C119154h.m168040a(this.f257885c.getApplicationContext(), new C80824k0());
        XWebSdk.setReportInterface(C86027m.f250516b);
        XWebSdk.setLibraryLoader(C86027m.f250519e);
    }

    /* renamed from: f */
    public void mo123978f(ApplicationLike applicationLike) {
        C87422a.f253331b = SystemClock.elapsedRealtime();
        System.currentTimeMillis();
        Application application = this.f257885c;
        C38175j jVar = C38175j.INSTANCE;
        C28674a aVar = C28674a.INSTANCE;
        C38170c[] cVarArr = C38166b.f100834a;
        if (cVarArr[0] == null) {
            synchronized (cVarArr) {
                if (cVarArr[0] == null) {
                    C38166b.f100836c = application;
                    cVarArr[0] = jVar;
                    C38166b.f100835b = aVar;
                }
            }
        }
        C86312j.m106912d(this.f257885c, C28680l.f78663e.get(), aVar);
        C87829b bVar = new C87829b(this.f257887e, this.f257885c, this.f257886d);
        C46396a.C46397a aVar2 = bVar.f124992e;
        long j = this.f257888f;
        aVar2.f124993a = j;
        XWebSdk.setApplicationStartTime(j);
        XWebChildProcessHelper.setCrashDumpFileCallback(new C89656k(this));
        C116281f0.m163819m(bVar.f124990c);
        C88957l.m111079o("stlport_shared", this.f257885c.getClassLoader());
        C88957l.m111079o("c++_shared", this.f257885c.getClassLoader());
        Log.m105924i("MicroMsg.XWeb.IsolatedStartupRoutine", "is plain process. load nothing");
        WeChatSplash.m98820b(bVar, (C85788m.C85789a) null);
        C80635x0.f235900a = null;
        C80635x0.f235901b = "com.tencent.mm.boot";
    }
}
