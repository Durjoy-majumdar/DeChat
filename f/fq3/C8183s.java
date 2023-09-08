package fq3;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import p157gk.C32467x;
import rx3.C13598b0;

/* renamed from: fq3.s */
public final class C8183s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C32467x, C13598b0> f27078d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<C32467x> f27079e;

    /* renamed from: f */
    public final /* synthetic */ int f27080f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8183s(C32226l<? super C32467x, C13598b0> lVar, ArrayList<C32467x> arrayList, int i) {
        super(0);
        this.f27078d = lVar;
        this.f27079e = arrayList;
        this.f27080f = i;
    }

    public Object invoke() {
        C32226l<C32467x, C13598b0> lVar = this.f27078d;
        C32467x xVar = this.f27079e.get(this.f27080f);
        C87412m.m108593f(xVar, "data[index]");
        lVar.invoke(xVar);
        return C13598b0.f38549a;
    }
}
