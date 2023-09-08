package com.tencent.p014mm.legacy.app;

import android.app.Application;
import android.content.res.Resources;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.app.C80633w0;
import com.tencent.p014mm.app.C80635x0;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29553m0;
import com.tencent.p014mm.plugin.appbrand.task.C84273a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.xwebutil.C19911o;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.pinus.XWebBrowserProcessHelper;
import f40.C86709a0;
import h40.C87429d;
import hi3.C87520e;
import ii3.C87740c;
import java.util.ArrayList;
import org.xwalk.core.XWalkEnvironment;
import p787ai.C79546a;

/* renamed from: com.tencent.mm.legacy.app.f */
public class C80962f extends C87429d {
    /* renamed from: b */
    public static void m98847b() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        C80589e.f235760a.getApplication();
        Log.m105924i("MicroMsg.SVGInit", "SVG initSVGPreload");
        C80633w0 w0Var = new C80633w0();
        C87520e.C87523c cVar = C87520e.f253545a;
        C87740c.f254036a = w0Var;
        C87520e.f253555k = C80635x0.f235900a;
        Application application = C80635x0.f235902c;
        Resources resources = C80635x0.f235903d;
        C87520e.m108847e(application, C80635x0.f235901b);
        if (C87520e.f253556l) {
            C87740c.m109160c("MicroMsg.SVGResourceLoader", "svg loaded, skip this time.", new Object[0]);
        } else {
            try {
                if (!C87520e.m108851i(application, resources)) {
                    C87740c.m109160c("MicroMsg.SVGResourceLoader", "SVG initSVGPreloadFallback", new Object[0]);
                    long nanoTime = System.nanoTime();
                    C87520e.m108852j(application);
                    try {
                        C87520e.m108850h(application, resources);
                    } catch (ClassNotFoundException e) {
                        C87740c.m109161d("MicroMsg.SVGResourceLoader", e, "", new Object[0]);
                    }
                    C87740c.m109160c("MicroMsg.SVGResourceLoader", "SVG fallback Register spent %s", Long.valueOf((System.nanoTime() - nanoTime) / 1000));
                }
            } catch (StackOverflowError e2) {
                C87740c.m109161d("MicroMsg.SVGResourceLoader", e2, "", new Object[0]);
                try {
                    z = C87520e.m108851i(application, resources);
                } catch (StackOverflowError unused) {
                    C87740c.m109159b("MicroMsg.SVGResourceLoader", "StackOverflowError again.", new Object[0]);
                    z = false;
                }
                if (!z) {
                    C87740c.m109160c("MicroMsg.SVGResourceLoader", "SVG initSVGPreloadFallback", new Object[0]);
                    long nanoTime2 = System.nanoTime();
                    C87520e.m108852j(application);
                    try {
                        C87520e.m108850h(application, resources);
                    } catch (ClassNotFoundException e3) {
                        C87740c.m109161d("MicroMsg.SVGResourceLoader", e3, "", new Object[0]);
                    }
                    C87740c.m109160c("MicroMsg.SVGResourceLoader", "SVG fallback Register spent %s", Long.valueOf((System.nanoTime() - nanoTime2) / 1000));
                }
            } catch (Throwable th) {
                C87740c.m109160c("MicroMsg.SVGResourceLoader", "SVG initSVGPreloadFallback", new Object[0]);
                long nanoTime3 = System.nanoTime();
                C87520e.m108852j(application);
                try {
                    C87520e.m108850h(application, resources);
                } catch (ClassNotFoundException e4) {
                    C87740c.m109161d("MicroMsg.SVGResourceLoader", e4, "", new Object[0]);
                }
                C87740c.m109160c("MicroMsg.SVGResourceLoader", "SVG fallback Register spent %s", Long.valueOf((System.nanoTime() - nanoTime3) / 1000));
                throw th;
            }
            C87520e.f253556l = true;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        ArrayList<long[]> arrayList = C79546a.f233249u;
        arrayList.add(new long[]{783, 4, currentTimeMillis2});
        arrayList.add(new long[]{783, 5, 1});
        Log.m105925i("MicroMsg.DefaultBootStep", "SVG newInstance done, spent %s", Long.valueOf(currentTimeMillis2));
    }

    /* renamed from: c */
    public static void m98848c() {
        C19911o.m21657b();
        XWebSdk.setForceDarkMode(C85875k4.m106211z());
        XWebSdk.setForceDarkBehavior(XWalkEnvironment.ForceDarkBehavior.MEDIA_QUERY_ONLY);
        String processName = MMApplicationContext.getProcessName();
        if (MMApplicationContext.isMainProcess() || C84273a0.f246143j.equals(processName)) {
            Log.m105924i("MicroMsg.DefaultBootStep", "initXWebChildProcessCrashDumpPath, processName:" + processName);
            XWebBrowserProcessHelper.setCrashDumpFileCallback(new C80961e());
        }
        if (C29553m0.f80469a.mo56809b()) {
            XWebSdk.setV8LiteMode(true);
        }
    }

    /* renamed from: a */
    public void mo63021a() {
    }

    /* renamed from: d */
    public String mo112743d() {
        return C86709a0.m107531m().mo58407a().f124988a;
    }
}
