package s50;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import u80.C111142d;
import u80.C111143e;
import w80.C111742d;

/* renamed from: s50.y */
public final class C63721y extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63714v f180620d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63721y(C63714v vVar) {
        super(0);
        this.f180620d = vVar;
    }

    public Object invoke() {
        C63700b0 b0Var = this.f180620d.f180609g;
        if (b0Var != null) {
            Log.m105924i("MicroMsg.LiveCoreVisitor", "queue release");
            C111143e eVar = b0Var.f180570b;
            if (eVar != null) {
                eVar.mo158471l();
            }
            C111142d dVar = b0Var.f180571c;
            if (dVar != null) {
                dVar.mo158471l();
            }
            b0Var.f180576h.stopTimer();
        }
        C111742d.C65942b bVar = this.f180620d.f180606d;
        if (bVar != null) {
            C111742d.f334647a.mo163471q(bVar);
        }
        return C13598b0.f38549a;
    }
}
