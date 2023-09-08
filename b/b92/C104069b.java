package b92;

import fy3.C32224a;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;
import rx3.C36570n;
import u80.C111141c;
import w80.C111742d;

/* renamed from: b92.b */
public final class C104069b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104065a f307803d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104069b(C104065a aVar) {
        super(0);
        this.f307803d = aVar;
    }

    public Object invoke() {
        ((C110194c) ((C36570n) this.f307803d.f307799l).getValue()).close();
        C111141c cVar = this.f307803d.f307793f;
        if (cVar != null) {
            cVar.mo158471l();
        }
        C111742d.C65942b bVar = this.f307803d.f307797j;
        if (bVar != null) {
            C111742d.f334647a.mo163471q(bVar);
        }
        return C13598b0.f38549a;
    }
}
