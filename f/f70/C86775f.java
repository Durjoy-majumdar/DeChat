package f70;

import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C86428f;
import e70.C86457d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87667c;
import i70.C87672e;
import java.util.Collection;
import java.util.List;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: f70.f */
public final class C86775f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86770d<C86428f<C86457d>, C87667c<C86457d, Object>> f251884d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86775f(C86770d<C86428f<C86457d>, C87667c<C86457d, Object>> dVar) {
        super(0);
        this.f251884d = dVar;
    }

    public Object invoke() {
        C87672e eVar;
        Log.m105924i("MicroMsg.MagicSclBizFlutterPluginBase", "onDestroy");
        C87667c<C86457d, Object> E = this.f251884d.mo110354E();
        if (!(E == null || (eVar = E.f253920g) == null)) {
            Collection<C87672e.C87673a> values = eVar.f253937a.values();
            C87412m.m108593f(values, "canvasMap.values");
            List<T> y0 = C110818d0.m150953y0(values);
            C86770d<C86428f<C86457d>, C87667c<C86457d, Object>> dVar = this.f251884d;
            for (T t : y0) {
                if (t.f253939b.length() > 0) {
                    dVar.f251872d.mo121187d(t.f253939b + '-' + t.f253938a);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
