package o53;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import m53.C10756c;
import m53.C10761g;
import q53.C12049b0;
import q53.C12053c0;
import rx3.C13598b0;

/* renamed from: o53.b */
public final class C11356b extends C87413o implements C32226l<C12049b0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11367m f33451d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11356b(C11367m mVar) {
        super(1);
        this.f33451d = mVar;
    }

    public Object invoke(Object obj) {
        long j;
        C12049b0 b0Var = (C12049b0) obj;
        C87412m.m108594g(b0Var, LocaleUtil.ITALIAN);
        C11367m mVar = this.f33451d;
        mVar.getClass();
        C10761g gVar = new C10761g();
        gVar.f32230i = b0Var.f35096c;
        gVar.f32231j = false;
        gVar.f32223b = mVar.f33467a.f38597a;
        if (b0Var.mo11902a()) {
            j = 0;
        } else {
            C12053c0 c0Var = b0Var.f35095b;
            j = ((long) c0Var.f35118a.f38606j) - c0Var.f35119b;
        }
        gVar.f32232k = j;
        gVar.f32225d = new C11362h(mVar);
        ((C10756c) C86709a0.m107533q(C10756c.class)).q10(mVar.f33467a.f38598b, gVar);
        return C13598b0.f38549a;
    }
}
