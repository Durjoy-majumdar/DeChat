package zi1;

import cl1.C55006x0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hh1.C8530f;
import rx3.C13598b0;
import te3.C64622p31;

/* renamed from: zi1.a */
public final class C66828a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66829b f191947d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66828a(C66829b bVar) {
        super(0);
        this.f191947d = bVar;
    }

    public Object invoke() {
        C55006x0.C0697b e3;
        C55006x0.C0697b e35;
        C64622p31 p312;
        Class cls = C55006x0.class;
        C66829b bVar = this.f191947d;
        bVar.f191950c--;
        String str = bVar.f191951d;
        if (!(str == null || str.length() == 0)) {
            C66829b bVar2 = this.f191947d;
            String str2 = bVar2.f191951d;
            C55006x0.C0697b e36 = ((C55006x0) bVar2.f191949b.mo71262a(cls)).mo76053e3();
            if (C87412m.m108589b(str2, (e36 == null || (p312 = e36.f1651d) == null) ? null : p312.f184746d) && (e35 = ((C55006x0) this.f191947d.f191949b.mo71262a(cls)).mo76053e3()) != null) {
                e35.f1649b = this.f191947d.f191950c;
            }
        }
        C66829b bVar3 = this.f191947d;
        if (bVar3.f191950c >= 0) {
            C55006x0.C0697b e37 = ((C55006x0) bVar3.f191949b.mo71262a(cls)).mo76053e3();
            if ((e37 != null && e37.f1648a == 1) && (e3 = ((C55006x0) bVar3.f191949b.mo71262a(cls)).mo76053e3()) != null) {
                C8530f.m8426a(bVar3.f191948a, e3, true, false, false);
            }
        }
        C66829b bVar4 = this.f191947d;
        int i = bVar4.f191950c;
        if (i <= 0) {
            bVar4.mo90805c(i);
        }
        return C13598b0.f38549a;
    }
}
