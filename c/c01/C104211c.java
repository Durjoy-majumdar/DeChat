package c01;

import com.tencent.p014mm.vfs.C86015s1;
import fy3.C32224a;
import gy3.C87413o;
import p375qh.C110390f;
import rx3.C13598b0;

/* renamed from: c01.c */
public final class C104211c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104207a f308500d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104211c(C104207a aVar) {
        super(0);
        this.f308500d = aVar;
    }

    public Object invoke() {
        C110390f fVar = this.f308500d.f308496f;
        if (fVar != null) {
            fVar.mo161907l();
        }
        this.f308500d.f308494d.quitSafely();
        C86015s1 s1Var = this.f308500d.f308495e;
        if (s1Var != null) {
            s1Var.close();
        }
        this.f308500d.f308495e = null;
        return C13598b0.f38549a;
    }
}
