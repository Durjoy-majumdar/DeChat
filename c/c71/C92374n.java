package c71;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j71.C108587c;
import j71.C108591i;
import rx3.C13598b0;

/* renamed from: c71.n */
public final class C92374n extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C92379t f264335d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92374n(C92379t tVar) {
        super(1);
        this.f264335d = tVar;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C92379t tVar = this.f264335d;
            C108587c cVar = tVar.f264349i;
            if (cVar != null) {
                C92373m mVar = new C92373m(tVar);
                C108591i iVar = cVar.f325060i;
                if (iVar != null) {
                    byte[] bArr = new byte[(iVar.f325082c * iVar.f325083d * 4)];
                    iVar.f325079J.position(0);
                    iVar.f325079J.get(bArr);
                    mVar.invoke(bArr);
                } else {
                    C87412m.m108603p("renderer");
                    throw null;
                }
            } else {
                C87412m.m108603p("mixPixelBuffer");
                throw null;
            }
        } else {
            C92380u uVar = this.f264335d.f264348h;
            if (uVar != null) {
                uVar.mo126340b(false);
            } else {
                C87412m.m108603p("videoDecoder");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
