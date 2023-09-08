package p634or;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fu1.C8207a;
import gu1.C107914l;
import gy3.C87412m;
import h81.C32735h;
import java.util.Map;
import p172io.flutter.FlutterInjector;
import p172io.flutter.embedding.engine.FlutterShellArgs;
import p172io.flutter.embedding.engine.loader.ApplicationInfoLoader;
import p172io.flutter.embedding.engine.loader.FlutterLoader;
import p206nj.C88957l;
import p220pr.C100835h;
import wx3.C15601d;
import wx3.C66212f;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: or.l */
public class C117890l extends C86301e implements C100835h {

    /* renamed from: d */
    public boolean f352422d;

    public boolean Ah0() {
        return this.f352422d;
    }

    /* renamed from: TL */
    public void mo140310TL(Context context, String str, Map<String, Object> map) {
        CachedFlutterEngines.f346097a.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "entryPoint");
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C107914l(str, false, context, map, (C15601d<? super C107914l>) null), 3, (Object) null);
    }

    public void f40(boolean z, Runnable runnable) {
        if (this.f352422d) {
            runnable.run();
            return;
        }
        try {
            ApplicationInfoLoader.customAotSharedLibraryPath = C88957l.m111071g("app");
            long currentTimeMillis = System.currentTimeMillis();
            Context context = MMApplicationContext.getContext();
            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
            flutterLoader.startInitializationAsync(context);
            FlutterShellArgs flutterShellArgs = new FlutterShellArgs(new String[0]);
            if (z) {
                flutterShellArgs.add(FlutterShellArgs.ARG_VERBOSE_LOGGING);
            }
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_flutter_bind_cpu_cores, true)) {
                flutterShellArgs.add(FlutterShellArgs.ARG_BIND_CPU_CORES);
            }
            flutterLoader.ensureInitializationCompleteAsync(context, flutterShellArgs.toArray(), new Handler(Looper.getMainLooper()), runnable);
            long currentTimeMillis2 = System.currentTimeMillis();
            this.f352422d = true;
            Log.m105925i("MicroMsg.FlutterFeatureService", "initFlutterEngine useTime %d", Long.valueOf(currentTimeMillis2 - currentTimeMillis));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FlutterFeatureService", e, "failed to initFlutter", new Object[0]);
            runnable.run();
        }
    }

    public void onCreate(Context context) {
        if (MMApplicationContext.isMainProcess()) {
            int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_WarmUpFlutterEngineAtStartup_Int, 0);
            boolean z = e == 0 ? ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_warmup_flutter_engine_startup, 1) == 1 : e == 1;
            Log.m105925i("MicroMsg.FlutterFeatureService", "need warmup flutter engine:%s", Boolean.valueOf(z));
            if (z) {
                CachedFlutterEngines.f346097a.mo175366d();
            }
            C30650a.m39147b(new C8207a(), "//flutter");
        }
    }
}
