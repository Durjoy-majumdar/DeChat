package do1;

import com.tencent.p014mm.sdk.platformtools.Log;
import do1.C58341h;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: do1.m */
public final class C31226m extends C87413o implements C32226l<C58341h.C58345g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58341h f83664d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31226m(C58341h hVar) {
        super(1);
        this.f83664d = hVar;
    }

    public Object invoke(Object obj) {
        C58341h.C58345g gVar = (C58341h.C58345g) obj;
        C87412m.m108594g(gVar, "ret");
        String str = this.f83664d.f167027c;
        Log.m105924i(str, "performFinderBackground: preload result = " + gVar);
        return C13598b0.f38549a;
    }
}
