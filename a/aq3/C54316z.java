package aq3;

import fy3.C32227p;
import gq3.C59626g;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: aq3.z */
public final class C54316z extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54313w f152440d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54316z(C54313w wVar) {
        super(2);
        this.f152440d = wVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C0198x xVar = new C0198x(this.f152440d.getActivity());
            C54313w wVar = this.f152440d;
            C59626g.m69503a(xVar, wVar.f152434e, wVar.f152435f, wVar.f152436g, new C54315y(wVar), hVar, 4096);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
