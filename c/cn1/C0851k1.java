package cn1;

import an1.C0103p;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: cn1.k1 */
public final class C0851k1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0103p f2007d;

    /* renamed from: e */
    public final /* synthetic */ int f2008e;

    /* renamed from: f */
    public final /* synthetic */ C0740i2 f2009f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView.C16613e<C60905o> f2010g;

    /* renamed from: h */
    public final /* synthetic */ int f2011h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0851k1(C0103p pVar, int i, C0740i2 i2Var, RecyclerView.C16613e<C60905o> eVar, int i2) {
        super(0);
        this.f2007d = pVar;
        this.f2008e = i;
        this.f2009f = i2Var;
        this.f2010g = eVar;
        this.f2011h = i2;
    }

    public Object invoke() {
        if (C87412m.m108589b(this.f2009f, (C0740i2) C110818d0.m150917O(this.f2007d.f546e, this.f2008e))) {
            this.f2007d.f546e.remove(this.f2008e);
            this.f2010g.notifyItemRemoved(this.f2011h);
        }
        return C13598b0.f38549a;
    }
}
