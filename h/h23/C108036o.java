package h23;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import n80.C109697b;
import rx3.C13598b0;

/* renamed from: h23.o */
public final class C108036o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108038q f323516d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108036o(C108038q qVar) {
        super(0);
        this.f323516d = qVar;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.VLogRemuxer", "video onEncodeEnd");
        C109697b bVar = this.f323516d.f323521d;
        if (bVar != null) {
            bVar.mo160922f();
        }
        this.f323516d.f323529l = true;
        this.f323516d.mo158428d();
        return C13598b0.f38549a;
    }
}
