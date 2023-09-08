package t42;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import e42.C31415g;
import e42.C7596h;
import e42.C7597n;
import e42.C86430i;
import gy3.C87412m;
import h42.C87433d;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import zt3.C119157j;

/* renamed from: t42.c */
public final class C13825c extends C86430i<C7597n> {

    /* renamed from: t42.c$a */
    public static final class C13826a<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C13825c f38960a;

        public C13826a(C13825c cVar) {
            this.f38960a = cVar;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            Log.m105924i("MicroMsg.MBJsApiStartCpuProfile", "hy: already start profiling. token is " + str);
            ((C119157j) C119157j.f356862d).mo183895z(new C13824b(this.f38960a));
            this.f38960a.mo120840p().invoke(this.f38960a.mo120846k(C90364q0.m113146e(new C13604l(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str))));
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "startCpuProfile";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        if (!WeChatEnvironment.hasDebugger()) {
            Log.m105920e("MicroMsg.MBJsApiStartCpuProfile", "hy: no debug environment! please check");
            mo120840p().invoke(mo120843h(C31415g.C7595b.f25864c));
            return;
        }
        T t = this.f251227a;
        C13598b0 b0Var = null;
        C87433d dVar = t instanceof C87433d ? (C87433d) t : null;
        if (dVar != null) {
            dVar.mo121870Q(";var __debug_v8_cpu_profiler = (function(profiler) {if (typeof profiler === 'undefined') { profiler = new NativeGlobal.CpuProfiler();} profiler.token = profiler.startProfiling(); return profiler;})(__debug_v8_cpu_profiler);(function(profiler) { return profiler.token;})(__debug_v8_cpu_profiler);", new C13826a(this));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.MBJsApiStartCpuProfile", "hy: context not server type. not valid");
            mo120840p().invoke(mo120843h(C31415g.C7595b.f25864c));
        }
    }
}
