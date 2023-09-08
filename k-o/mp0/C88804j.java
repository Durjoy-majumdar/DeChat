package mp0;

import a70.C112760b;
import android.content.Context;
import android.net.Uri;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.C84073q2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import gu0.C87387c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kr0.C88267e;
import lp0.C88620b;
import p958eb.C86475f;

/* renamed from: mp0.j */
public class C88804j implements C88620b<C83928t1> {

    /* renamed from: a */
    public boolean f256209a = false;

    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        Class cls = C86475f.class;
        C83928t1 t1Var = (C83928t1) d1Var;
        AppBrandRuntimeWC J1 = t1Var.getRuntime();
        if (J1 != null && ((C88267e) J1.f238150p) != null) {
            C80301a aVar = null;
            if (this.f256209a) {
                long currentTimeMillis = System.currentTimeMillis();
                C83165i jsRuntime = ((C88267e) J1.f238150p).getJsRuntime();
                C86475f fVar = (C86475f) t1Var.mo116160O0().mo125517G0(cls);
                mo123203e(jsRuntime, fVar != null ? fVar.mo120910U() : null, context, String.format("CPU_%s_%d.cpuprofile", new Object[]{str, Long.valueOf(currentTimeMillis)}));
                List<C40482o> d = mo123202d(J1);
                if (d != null) {
                    Iterator it = ((ArrayList) d).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        C40482o oVar = (C40482o) it.next();
                        String format = String.format("CPU_%s_%d_worker_%d.cpuprofile", new Object[]{str, Long.valueOf(currentTimeMillis), Integer.valueOf(i)});
                        if (oVar instanceof C87387c) {
                            mo123203e(oVar, ((C87387c) oVar).mo121806b0(), context, format);
                        } else {
                            Log.m105928w("MiroMsg.GameCpuProfile", "hy: not worker instance");
                            mo123203e(oVar, (MBRuntime) null, context, format);
                        }
                        i++;
                    }
                    return;
                }
                return;
            }
            Uri n = C116299g2.m163858n(C112760b.m154195C() + "appbrand/trace/");
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
            C83165i jsRuntime2 = ((C88267e) J1.f238150p).getJsRuntime();
            C86475f fVar2 = (C86475f) t1Var.mo116160O0().mo125517G0(cls);
            if (fVar2 != null) {
                aVar = fVar2.mo120910U();
            }
            jsRuntime2.evaluateJavascript(";var __debug_v8_cpu_profiler = (function(profiler) {if (typeof profiler === 'undefined') { profiler = new NativeGlobal.CpuProfiler();} profiler.token = profiler.startProfiling(); return profiler;})(__debug_v8_cpu_profiler);(function(profiler) { return profiler.token;})(__debug_v8_cpu_profiler);", new C61551l(this, context));
            if (aVar != null) {
                aVar.mo111518n(true);
            }
            List<C40482o> d2 = mo123202d(J1);
            if (d2 != null) {
                ArrayList arrayList = (ArrayList) d2;
                Log.m105925i("MiroMsg.GameCpuProfile", "hy: trigger worker cpu profiling: %d", Integer.valueOf(arrayList.size()));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((C40482o) it4.next()).evaluateJavascript(";var __debug_v8_cpu_profiler = (function(profiler) {if (typeof profiler === 'undefined') { profiler = new NativeGlobal.CpuProfiler();} profiler.token = profiler.startProfiling(); return profiler;})(__debug_v8_cpu_profiler);(function(profiler) { return profiler.token;})(__debug_v8_cpu_profiler);", new C61551l(this, context));
                }
            }
        }
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return this.f256209a ? "Stop CPU Profile" : "Start CPU Profile";
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        AppBrandSysConfigWC appBrandSysConfigWC = (AppBrandSysConfigWC) ((C83928t1) d1Var).mo109671p(AppBrandSysConfigWC.class);
        return appBrandSysConfigWC.f261072r.f238585d == 1 || appBrandSysConfigWC.f261072r.f238585d == 2 || WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv() || BuildInfo.IS_FLAVOR_RED || C84072q1.m103586a(str).f245471o || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED;
    }

    /* renamed from: d */
    public final List<C40482o> mo123202d(AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime.mo113047b0() == null) {
            Log.m105920e("MiroMsg.GameCpuProfile", "hy: service released. abort walking through workers");
            return null;
        }
        C84073q2 r0 = appBrandRuntime.mo113047b0().mo114347r0();
        if (r0 != null) {
            return r0.mo116729d();
        }
        return null;
    }

    /* renamed from: e */
    public final void mo123203e(C40482o oVar, MBRuntime mBRuntime, Context context, String str) {
        oVar.evaluateJavascript(";(function(profiler) {return JSON.stringify(profiler.stopProfiling());})(__debug_v8_cpu_profiler);", new j$$a(this, str, context));
        if (mBRuntime != null) {
            mBRuntime.mo111518n(false);
        }
    }
}
