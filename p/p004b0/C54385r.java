package p004b0;

import androidx.compose.foundation.lazy.layout.C54150c;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import java.util.List;
import my3.C61594j;
import p175j0.C60667k2;
import p175j0.C60690y0;
import rx3.C13598b0;
import sx3.C64186f0;

/* renamed from: b0.r */
public final class C54385r extends C87413o implements C32224a<C54386s> {

    /* renamed from: d */
    public final /* synthetic */ C60667k2<C32226l<C54372f0, C13598b0>> f152575d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<C61594j> f152576e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54385r(C60667k2<? extends C32226l<? super C54372f0, C13598b0>> k2Var, C60690y0<C61594j> y0Var) {
        super(0);
        this.f152575d = k2Var;
        this.f152576e = y0Var;
    }

    public Object invoke() {
        C54375h0 h0Var = new C54375h0();
        this.f152575d.getValue().invoke(h0Var);
        C54150c<C54379j> cVar = h0Var.f152558b;
        List list = h0Var.f152559c;
        if (list == null) {
            list = C64186f0.f181907d;
        }
        return new C54386s(cVar, list, this.f152576e.getValue());
    }
}
