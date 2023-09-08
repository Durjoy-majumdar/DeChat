package ku0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import ku0.C88288a;
import rx3.C13598b0;

/* renamed from: ku0.b */
public final class C88296b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C88288a.C88292d f255235d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f255236e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88296b(C88288a.C88292d dVar, C82381f fVar) {
        super(0);
        this.f255235d = dVar;
        this.f255236e = fVar;
    }

    public Object invoke() {
        C88288a.C88293e eVar = this.f255235d.f255227b;
        C82919r2 r2Var = eVar.f255228a;
        eVar.f255228a = null;
        if (r2Var != null) {
            if (C88288a.f255200F) {
                Log.m105918d(this.f255235d.f255226a, "publish event onXWebLivePusherCameraFrame");
            }
            this.f255236e.mo109669n(r2Var, (int[]) null);
        }
        return C13598b0.f38549a;
    }
}
