package cn1;

import an1.C0091d;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: cn1.g */
public final class C0835g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0091d f1968d;

    /* renamed from: e */
    public final /* synthetic */ int f1969e;

    /* renamed from: f */
    public final /* synthetic */ C0740i2 f1970f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView.C16613e<C60905o> f1971g;

    /* renamed from: h */
    public final /* synthetic */ int f1972h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0835g(C0091d dVar, int i, C0740i2 i2Var, RecyclerView.C16613e<C60905o> eVar, int i2) {
        super(0);
        this.f1968d = dVar;
        this.f1969e = i;
        this.f1970f = i2Var;
        this.f1971g = eVar;
        this.f1972h = i2;
    }

    public Object invoke() {
        if (C87412m.m108589b((C0740i2) C110818d0.m150917O(this.f1968d.f529e, this.f1969e), this.f1970f)) {
            this.f1968d.f529e.remove(this.f1969e);
            this.f1971g.notifyItemRemoved(this.f1972h);
        }
        return C13598b0.f38549a;
    }
}
