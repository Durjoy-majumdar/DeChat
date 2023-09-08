package o53;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import m53.C10756c;
import m53.C10760f;
import m53.C10761g;
import q53.C12049b0;
import q53.C12053c0;
import rx3.C13598b0;
import s43.C13624e;
import te3.C51526uc2;

/* renamed from: o53.d */
public final class C11358d extends C87413o implements C32226l<C12049b0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11367m f33453d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11358d(C11367m mVar) {
        super(1);
        this.f33453d = mVar;
    }

    public Object invoke(Object obj) {
        long j;
        C12049b0 b0Var = (C12049b0) obj;
        C87412m.m108594g(b0Var, LocaleUtil.ITALIAN);
        if (b0Var.mo11902a()) {
            b0Var.f35096c.mo5085n();
            this.f33453d.mo11381c();
        } else {
            C11367m mVar = this.f33453d;
            mVar.getClass();
            C10761g gVar = new C10761g();
            gVar.f32228g = C10760f.DIRECT_CHARGE;
            C12049b0 b0Var2 = mVar.f33469c;
            if (b0Var2 != null) {
                C12053c0 c0Var = b0Var2.f35095b;
                C51526uc2 uc22 = c0Var.f35120c;
                gVar.f32227f = uc22.f142743h.f131486e.f132669d;
                C13624e eVar = mVar.f33467a;
                gVar.f32229h = ((long) eVar.f38606j) - c0Var.f35119b;
                gVar.f32226e = uc22.f142742g;
                gVar.f32223b = eVar.f38597a;
                gVar.f32231j = false;
                if (b0Var.mo11902a()) {
                    j = 0;
                } else {
                    C12053c0 c0Var2 = b0Var.f35095b;
                    j = ((long) c0Var2.f35118a.f38606j) - c0Var2.f35119b;
                }
                gVar.f32232k = j;
                gVar.f32233l = b0Var.f35095b.f35120c;
                gVar.f32225d = new C11355a(mVar);
                ((C10756c) C86709a0.m107533q(C10756c.class)).q10(mVar.f33467a.f38598b, gVar);
            } else {
                C87412m.m108603p("consumePanel");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
