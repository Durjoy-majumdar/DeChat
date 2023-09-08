package c71;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: c71.m */
public final class C92373m extends C87413o implements C32226l<byte[], C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C92379t f264334d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92373m(C92379t tVar) {
        super(1);
        this.f264334d = tVar;
    }

    public Object invoke(Object obj) {
        byte[] bArr = (byte[]) obj;
        C87412m.m108594g(bArr, LocaleUtil.ITALIAN);
        C92380u uVar = this.f264334d.f264348h;
        if (uVar != null) {
            uVar.mo126340b(false);
            C92362c cVar = this.f264334d.f264352l;
            if (cVar != null) {
                cVar.f264300b.post(new C92364d(cVar, bArr, -1));
            }
            return C13598b0.f38549a;
        }
        C87412m.m108603p("videoDecoder");
        throw null;
    }
}
