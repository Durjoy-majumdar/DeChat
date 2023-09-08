package tn1;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import sn1.C13738c;

/* renamed from: tn1.e */
public final class C14055e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C14056f f39421d;

    /* renamed from: e */
    public final /* synthetic */ String f39422e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14055e(C14056f fVar, String str) {
        super(0);
        this.f39421d = fVar;
        this.f39422e = str;
    }

    public Object invoke() {
        C13738c cVar = this.f39421d.f39429g;
        if (cVar != null) {
            cVar.mo85581g();
        }
        if (this.f39422e.length() == 0) {
            this.f39421d.f39430h.clear();
        }
        C14056f fVar = this.f39421d;
        String str = this.f39422e;
        fVar.getClass();
        C87412m.m108594g(str, "<set-?>");
        fVar.f39425c = str;
        C14056f.m13408a(this.f39421d);
        return C13598b0.f38549a;
    }
}
