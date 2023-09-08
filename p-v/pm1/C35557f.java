package pm1;

import cm1.C0797z;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pm1.f */
public final class C35557f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f95067d;

    /* renamed from: e */
    public final /* synthetic */ C62381d f95068e;

    /* renamed from: f */
    public final /* synthetic */ C0797z f95069f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35557f(C32224a<C13598b0> aVar, C62381d dVar, C0797z zVar) {
        super(0);
        this.f95067d = aVar;
        this.f95068e = dVar;
        this.f95069f = zVar;
    }

    public Object invoke() {
        C32224a<C13598b0> aVar = this.f95067d;
        if (aVar != null) {
            aVar.invoke();
        }
        String r = this.f95068e.mo87439r();
        Log.m105924i(r, "checkAutoPlayByOutside liveFinishCallback feed=" + this.f95069f);
        return C13598b0.f38549a;
    }
}
