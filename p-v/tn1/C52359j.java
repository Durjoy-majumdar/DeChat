package tn1;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import sn1.C48432d;
import te3.C50638o60;

/* renamed from: tn1.j */
public final class C52359j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C52360k f146335d;

    /* renamed from: e */
    public final /* synthetic */ String f146336e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52359j(C52360k kVar, String str) {
        super(0);
        this.f146335d = kVar;
        this.f146336e = str;
    }

    public Object invoke() {
        C48432d dVar = this.f146335d.f146343g;
        if (dVar != null) {
            dVar.mo85581g();
        }
        C52360k kVar = this.f146335d;
        kVar.f146338b = 0;
        String str = this.f146336e;
        C87412m.m108594g(str, "<set-?>");
        kVar.f146345i = str;
        this.f146335d.f146344h.clear();
        if (this.f146336e.length() > 0) {
            C52360k.m58604a(this.f146335d);
        } else {
            this.f146335d.f146340d.mo237D(0, 0, new C50638o60(), 0, 0);
        }
        return C13598b0.f38549a;
    }
}
