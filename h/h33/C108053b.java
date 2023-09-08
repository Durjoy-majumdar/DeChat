package h33;

import fy3.C32226l;
import gy3.C87413o;
import h33.C108047a;
import rx3.C13598b0;

/* renamed from: h33.b */
public final class C108053b extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108047a f323567d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108053b(C108047a aVar) {
        super(1);
        this.f323567d = aVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C108047a.C108048a aVar = this.f323567d.f323562g;
        if (aVar != null) {
            aVar.mo158444b(intValue);
        }
        return C13598b0.f38549a;
    }
}
