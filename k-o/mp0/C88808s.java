package mp0;

import a70.C112760b;
import android.content.Context;
import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.Locale;
import kr0.C88267e;
import lp0.C88620b;

/* renamed from: mp0.s */
public class C88808s implements C88620b<C83928t1> {
    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        if (t1Var.getRuntime() instanceof AppBrandRuntimeWC) {
            AppBrandRuntimeWC J1 = t1Var.getRuntime();
            String str2 = C112760b.m154195C() + "appbrand/trace/";
            Uri n = C116299g2.m163858n(str2);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            Locale locale = Locale.ENGLISH;
            String str3 = str2 + String.format(locale, "HEAP_%s_%d.heapsnapshot", new Object[]{str, Long.valueOf(System.currentTimeMillis())});
            ((C88267e) J1.f238150p).getJsRuntime().evaluateJavascript("(function() {var profiler = new NativeGlobal.HeapProfiler();var snapshot = profiler.takeSnapshot();return snapshot.serialize('" + str3 + "');})()", new C34627r(this, context, str3));
            if (!J1.mo121254q1() && !t1Var.mo116168W0()) {
                if (WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED) {
                    String str4 = str2 + String.format(locale, "WebView_HEAP_%s_%d.heapsnapshot", new Object[]{str, Long.valueOf(System.currentTimeMillis())});
                    Log.m105925i("MiroMsg.GameHeapProfile", "WebViewDumpSnapshot to :%s suc:%b", str4, Boolean.valueOf(t1Var.mo116525M1().savePage(new C86009m1(str4).mo119971i(), (String) null, 100000)));
                }
            }
        }
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ String mo115971b(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return "Take Heap Snapshot";
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        AppBrandSysConfigWC appBrandSysConfigWC = (AppBrandSysConfigWC) ((C83928t1) d1Var).mo109671p(AppBrandSysConfigWC.class);
        return appBrandSysConfigWC.f261072r.f238585d == 1 || appBrandSysConfigWC.f261072r.f238585d == 2 || WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv() || BuildInfo.IS_FLAVOR_RED || C84072q1.m103586a(str).f245471o || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED;
    }
}
