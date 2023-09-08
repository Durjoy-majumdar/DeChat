package w33;

import c30.C104289g;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: w33.g */
public final class C15035g extends C87413o implements C32226l<C104289g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f41171d;

    /* renamed from: e */
    public final /* synthetic */ int f41172e;

    /* renamed from: f */
    public final /* synthetic */ float f41173f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15035g(String str, int i, float f) {
        super(1);
        this.f41171d = str;
        this.f41172e = i;
        this.f41173f = f;
    }

    public Object invoke(Object obj) {
        C104289g gVar = (C104289g) obj;
        C87412m.m108594g(gVar, "$this$subJson");
        gVar.put("name", this.f41171d);
        gVar.mo145953n("tid", this.f41172e);
        gVar.put("cpuLoad", Float.valueOf(this.f41173f));
        return C13598b0.f38549a;
    }
}
