package mz1;

import fy3.C32224a;
import gy3.C87413o;
import javax.microedition.khronos.opengles.GL10;
import p80.C110194c;
import rx3.C13598b0;
import u80.C111139a;

/* renamed from: mz1.j */
public final class C88865j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109651k f256321d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88865j(C109651k kVar) {
        super(0);
        this.f256321d = kVar;
    }

    public Object invoke() {
        this.f256321d.f328261g.mo159588m(true);
        C109651k kVar = this.f256321d;
        C111139a aVar = kVar.f328261g.f331382g;
        if (aVar != null) {
            aVar.f332759n = true;
        }
        kVar.f328262h.mo160067e((GL10) null, kVar.f328263i, kVar.f328264j);
        C110194c c = this.f256321d.f328262h.mo160065c();
        if (c != null) {
            C109651k kVar2 = this.f256321d;
            int i = kVar2.f328263i;
            int i2 = kVar2.f328264j;
            c.f329657j = i;
            c.f329658n = i2;
        }
        C109651k kVar3 = this.f256321d;
        int i3 = kVar3.f328263i;
        int i4 = kVar3.f328264j;
        C109650f fVar = new C109650f(i3, i4, i3, i4, 2, 1);
        fVar.f332759n = false;
        fVar.f332760o = true;
        kVar3.f328266o = fVar;
        C32224a<C13598b0> aVar2 = this.f256321d.f328270s;
        if (aVar2 != null) {
            ((C88867l) aVar2).invoke();
        }
        return C13598b0.f38549a;
    }
}
