package p267x;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p1166z0.C112543i;
import p1166z0.C112544j;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p436a1.C103220a;
import p436a1.C103229d0;
import p436a1.C103237h0;
import p436a1.C103240i;
import p436a1.C103244k0;
import p436a1.C103245l;
import p436a1.C103251o;
import p436a1.C103257q;
import p436a1.C103262s;
import p436a1.C103266t0;
import p436a1.C103273w0;
import p436a1.C103276y;
import p436a1.C27726j0;
import p560i2.C108325f;
import p658q1.C110298h0;
import p835c1.C104225a;
import p835c1.C104236j;
import p835c1.C104237k;
import p868x0.C111978c;
import p868x0.C111985j;
import rx3.C13603j;

/* renamed from: x.d */
public final class C111895d extends C87413o implements C32226l<C111978c, C111985j> {

    /* renamed from: d */
    public final /* synthetic */ float f334993d;

    /* renamed from: e */
    public final /* synthetic */ C103266t0 f334994e;

    /* renamed from: f */
    public final /* synthetic */ C110298h0<C111890c> f334995f;

    /* renamed from: g */
    public final /* synthetic */ C103257q f334996g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111895d(float f, C103266t0 t0Var, C110298h0<C111890c> h0Var, C103257q qVar) {
        super(1);
        this.f334993d = f;
        this.f334994e = t0Var;
        this.f334995f = h0Var;
        this.f334996g = qVar;
    }

    public Object invoke(Object obj) {
        C27726j0 j0Var;
        C111978c cVar = (C111978c) obj;
        C87412m.m108594g(cVar, "$this$drawWithCache");
        boolean z = true;
        if (!(cVar.mo143034T(this.f334993d) >= 0.0f && C112545k.m153757c(cVar.mo163642e()) > 0.0f)) {
            return cVar.mo163641a(C66219f.f190256d);
        }
        float f = (float) 2;
        float min = Math.min(C108325f.m146734a(this.f334993d, 0.0f) ? 1.0f : (float) Math.ceil((double) cVar.mo143034T(this.f334993d)), (float) Math.ceil((double) (C112545k.m153757c(cVar.mo163642e()) / f)));
        float f2 = min / f;
        long a = C112540f.m153745a(f2, f2);
        long a2 = C112546l.m153761a(C112545k.m153758d(cVar.mo163642e()) - min, C112545k.m153756b(cVar.mo163642e()) - min);
        if (f * min <= C112545k.m153757c(cVar.mo163642e())) {
            z = false;
        }
        C103237h0 a3 = this.f334994e.mo143025a(cVar.mo163642e(), cVar.f335227d.getLayoutDirection(), cVar);
        if (a3 instanceof C103237h0.C27725a) {
            C103257q qVar = this.f334996g;
            C103237h0.C27725a aVar = (C103237h0.C27725a) a3;
            if (z) {
                return cVar.mo163641a(new C111910g(aVar, qVar));
            }
            if (qVar instanceof C103273w0) {
                long j = ((C103273w0) qVar).f304518b;
                C87412m.m108594g(Build.VERSION.SDK_INT >= 29 ? C103251o.f304456a.mo143024a(j, 5) : new PorterDuffColorFilter(C103276y.m136796g(j), C103220a.m136601b(5)), "nativeColorFilter");
            }
            aVar.getClass();
            throw null;
        } else if (a3 instanceof C103237h0.C103239c) {
            C110298h0<C111890c> h0Var = this.f334995f;
            C103257q qVar2 = this.f334996g;
            C103237h0.C103239c cVar2 = (C103237h0.C103239c) a3;
            if (C112544j.m153754b(cVar2.f304447a)) {
                C104237k kVar = new C104237k(min, 0.0f, 0, 0, (C103244k0) null, 30, (C8480h) null);
                float f3 = min;
                C111917i iVar = r7;
                C111917i iVar2 = new C111917i(z, qVar2, cVar2.f304447a.f336969e, f2, f3, a, a2, kVar);
                return cVar.mo163641a(iVar);
            }
            C103257q qVar3 = qVar2;
            C111890c cVar3 = (C111890c) h0Var.f329878a;
            if (cVar3 == null) {
                cVar3 = new C111890c((C103229d0) null, (C103262s) null, (C104225a) null, (C27726j0) null, 15, (C8480h) null);
                h0Var.f329878a = cVar3;
            }
            C27726j0 j0Var2 = cVar3.f334987d;
            if (j0Var2 == null) {
                j0Var2 = C103245l.m136700a();
                cVar3.f334987d = j0Var2;
            }
            C27726j0 j0Var3 = j0Var2;
            C112543i iVar3 = cVar2.f304447a;
            j0Var3.reset();
            j0Var3.mo55582g(iVar3);
            if (!z) {
                C27726j0 a4 = C103245l.m136700a();
                float f4 = (iVar3.f336967c - iVar3.f336965a) - min;
                float f5 = (iVar3.f336968d - iVar3.f336966b) - min;
                long a5 = C111923k.m152634a(iVar3.f336969e, min);
                long a6 = C111923k.m152634a(iVar3.f336970f, min);
                long a7 = C111923k.m152634a(iVar3.f336972h, min);
                long a8 = C111923k.m152634a(iVar3.f336971g, min);
                float f6 = min;
                float f7 = min;
                j0Var = j0Var3;
                ((C103240i) a4).mo55582g(new C112543i(f6, f7, f4, f5, a5, a6, a8, a7, (C8480h) null));
                j0Var.mo55586j(j0Var, a4, 0);
            } else {
                j0Var = j0Var3;
            }
            return cVar.mo163641a(new C111921j(j0Var, qVar3));
        } else if (a3 instanceof C103237h0.C103238b) {
            C103257q qVar4 = this.f334996g;
            if (z) {
                a = C112539e.f336955b;
            }
            if (z) {
                a2 = cVar.mo163642e();
            }
            return cVar.mo163641a(new C111914h(qVar4, a, a2, z ? C104236j.f308530a : new C104237k(min, 0.0f, 0, 0, (C103244k0) null, 30, (C8480h) null)));
        } else {
            throw new C13603j();
        }
    }
}
