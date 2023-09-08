package fq3;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import p157gk.C32466a;
import rx3.C13598b0;

/* renamed from: fq3.e */
public final class C8181e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C32466a, C13598b0> f27073d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<C32466a> f27074e;

    /* renamed from: f */
    public final /* synthetic */ int f27075f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8181e(C32226l<? super C32466a, C13598b0> lVar, ArrayList<C32466a> arrayList, int i) {
        super(0);
        this.f27073d = lVar;
        this.f27074e = arrayList;
        this.f27075f = i;
    }

    public Object invoke() {
        C32226l<C32466a, C13598b0> lVar = this.f27073d;
        C32466a aVar = this.f27074e.get(this.f27075f);
        C87412m.m108593f(aVar, "data[index]");
        lVar.invoke(aVar);
        return C13598b0.f38549a;
    }
}
