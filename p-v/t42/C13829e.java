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
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: t42.e */
public final class C13829e extends C86430i<C7597n> {

    /* renamed from: t42.e$a */
    public static final class C13830a<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C13829e f38967a;

        /* renamed from: b */
        public final /* synthetic */ String f38968b;

        public C13830a(C13829e eVar, String str) {
            this.f38967a = eVar;
            this.f38968b = str;
        }

        public void onReceiveValue(Object obj) {
            C119179t tVar = C119157j.f356862d;
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183886q(new C13827d(this.f38967a, (String) obj, this.f38968b), 2000, "DumpCpuProfile_" + this.f38967a.mo120841d().f26666a);
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "stopCpuProfile";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        if (!WeChatEnvironment.hasDebugger()) {
            Log.m105920e("MicroMsg.JsApiStopCpuProfile", "hy: no debug environment! please check");
            mo120840p().invoke(mo120843h(C31415g.C7595b.f25864c));
            return;
        }
        String optString = hVar.optString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        T t = this.f251227a;
        C13598b0 b0Var = null;
        C87433d dVar = t instanceof C87433d ? (C87433d) t : null;
        if (dVar != null) {
            dVar.mo121870Q(";(function(profiler) {return JSON.stringify(profiler.stopProfiling());})(__debug_v8_cpu_profiler);", new C13830a(this, optString));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.JsApiStopCpuProfile", "hy: context not server type. not valid");
            mo120840p().invoke(mo120843h(C31415g.C7595b.f25864c));
        }
    }
}
