package p634or;

import a14.C53895h;
import com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines;
import com.tencent.p014mm.plugin.flutter.p884ui.CachedFlutterActivity;
import com.tencent.p014mm.plugin.flutter.p884ui.TransparentCachedFlutterActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32227p;
import gu1.C107913h;
import gy3.C87412m;
import java.util.Map;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterEngineCache;
import p220pr.C62491f;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import wx3.C66212f;

@C86522b
/* renamed from: or.a */
public final class C110060a extends C86301e implements C62491f {
    /* renamed from: V3 */
    public void mo87522V3(String str) {
        C87412m.m108594g(str, "engineId");
        CachedFlutterEngines.f346097a.getClass();
        FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get(str);
        FlutterEngineCache.getInstance().remove(str);
        Log.m105924i("MicroMsg.CachedFlutterEngines", "clear: engineId=" + str + ", engine=" + flutterEngine);
        if (flutterEngine != null) {
            flutterEngine.destroy();
        }
    }

    /* renamed from: kz */
    public PatchedFlutterActivity.CachedEngineIntentBuilder mo87523kz(String str) {
        C87412m.m108594g(str, "cachedEngineId");
        int i = CachedFlutterActivity.f313157e;
        return new PatchedFlutterActivity.CachedEngineIntentBuilder(CachedFlutterActivity.class, str);
    }

    public Object xo0(String str, boolean z, C32227p<? super FlutterEngine, ? super Map<String, Object>, C13598b0> pVar, C15601d<? super C13604l<String, ? extends FlutterEngine>> dVar) {
        return CachedFlutterEngines.f346097a.mo175365c(str, "home", "/", z, pVar, dVar);
    }

    public PatchedFlutterActivity.CachedEngineIntentBuilder zn0(String str) {
        C87412m.m108594g(str, "cachedEngineId");
        int i = TransparentCachedFlutterActivity.f313159f;
        PatchedFlutterActivity.CachedEngineIntentBuilder backgroundMode = new PatchedFlutterActivity.CachedEngineIntentBuilder(TransparentCachedFlutterActivity.class, str).backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent);
        C87412m.m108593f(backgroundMode, "CachedEngineIntentBuilde…ckgroundMode.transparent)");
        return backgroundMode;
    }

    public C13604l<String, FlutterEngine> zo0(String str, boolean z, C32227p<? super FlutterEngine, ? super Map<String, Object>, C13598b0> pVar) {
        C87412m.m108594g(str, "pluginName");
        CachedFlutterEngines.f346097a.getClass();
        return (C13604l) C53895h.m60468f((C66212f) null, new C107913h(str, "/", z, pVar, (C15601d<? super C107913h>) null), 1, (Object) null);
    }
}
