package qj1;

import cj1.C54843w3;
import cl1.C54963d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.d2 */
public final class C62695d2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63068w1 f178017d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f178018e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62695d2(C63068w1 w1Var, C8478d0 d0Var) {
        super(0);
        this.f178017d = w1Var;
        this.f178018e = d0Var;
    }

    public Object invoke() {
        Class cls = C54963d0.class;
        String str = this.f178017d.f178988q;
        Log.m105924i(str, "set mic setting success micSettingFlag:" + this.f178018e.f27483d);
        if (((C54963d0) this.f178017d.mo87696x0(cls)).f154048B.f144323d != ((long) this.f178018e.f27483d)) {
            ((C54963d0) this.f178017d.mo87696x0(cls)).f154048B.f144323d = (long) this.f178018e.f27483d;
            C54843w3.f153747a.mo75790e(this.f178017d.mo87684A0());
        }
        return C13598b0.f38549a;
    }
}
