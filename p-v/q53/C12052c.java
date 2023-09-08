package q53;

import android.view.View;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import q53.C12041a;
import rx3.C13598b0;

/* renamed from: q53.c */
public final class C12052c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12041a f35115d;

    /* renamed from: e */
    public final /* synthetic */ C12041a.C12042a f35116e;

    /* renamed from: f */
    public final /* synthetic */ C12041a.C12042a.C12043a f35117f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12052c(C12041a aVar, C12041a.C12042a aVar2, C12041a.C12042a.C12043a aVar3) {
        super(0);
        this.f35115d = aVar;
        this.f35116e = aVar2;
        this.f35117f = aVar3;
    }

    public Object invoke() {
        int b = C76577a.m92151b(this.f35115d.f35061a, 16) * 2;
        this.f35116e.f35076e = this.f35117f.f44854d.getWidth();
        View view = this.f35115d.f35069i;
        if (view != null) {
            this.f35117f.f44854d.getLayoutParams().width = ((view.getWidth() - C76577a.m92151b(this.f35115d.f35061a, 32)) - b) / 3;
            this.f35117f.f44854d.requestLayout();
            return C13598b0.f38549a;
        }
        C87412m.m108603p("mCustomView");
        throw null;
    }
}
