package pm1;

import cm1.C0797z;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pm1.h */
public final class C35559h extends C87413o implements C32227p<Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32227p<Integer, Integer, C13598b0> f95075d;

    /* renamed from: e */
    public final /* synthetic */ C62381d f95076e;

    /* renamed from: f */
    public final /* synthetic */ C0797z f95077f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35559h(C32227p<? super Integer, ? super Integer, C13598b0> pVar, C62381d dVar, C0797z zVar) {
        super(2);
        this.f95075d = pVar;
        this.f95076e = dVar;
        this.f95077f = zVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C32227p<Integer, Integer, C13598b0> pVar = this.f95075d;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2));
        }
        String r = this.f95076e.mo87439r();
        Log.m105924i(r, "checkAutoPlayByOutside videoSizeChangeCallback feed=" + this.f95077f + " w=" + intValue + " h=" + intValue2);
        return C13598b0.f38549a;
    }
}
