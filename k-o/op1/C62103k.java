package op1;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C64370fp1;

/* renamed from: op1.k */
public final class C62103k extends C87413o implements C32226l<C64370fp1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62084h f176598d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62103k(C62084h hVar) {
        super(1);
        this.f176598d = hVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C64370fp1) obj, "productInfo");
        this.f176598d.notifyDataSetChanged();
        return C13598b0.f38549a;
    }
}
