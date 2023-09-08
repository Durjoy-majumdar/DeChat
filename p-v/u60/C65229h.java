package u60;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;

/* renamed from: u60.h */
public final class C65229h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65222f<C65220d> f187761d;

    /* renamed from: e */
    public final /* synthetic */ C65220d f187762e;

    /* renamed from: f */
    public final /* synthetic */ C65234n f187763f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65229h(C65222f<C65220d> fVar, C65220d dVar, C65234n nVar) {
        super(0);
        this.f187761d = fVar;
        this.f187762e = dVar;
        this.f187763f = nVar;
    }

    public Object invoke() {
        LinkedList<C65231j<T>> linkedList = this.f187761d.f187748d;
        C65220d dVar = this.f187762e;
        C65234n nVar = this.f187763f;
        for (C65231j a : linkedList) {
            C87412m.m108592e(dVar, "null cannot be cast to non-null type T of com.tencent.mm.loader.loader.LoaderCore.dispatch.<no name provided>.invoke$lambda-0");
            a.mo539a(dVar, nVar);
        }
        return C13598b0.f38549a;
    }
}
