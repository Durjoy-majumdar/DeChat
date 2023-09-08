package p247u3;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1", mo125469f = "ContiguousPagedList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: u3.p */
public final class C65113p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C65124q f187410d;

    /* renamed from: e */
    public final /* synthetic */ boolean f187411e;

    /* renamed from: f */
    public final /* synthetic */ boolean f187412f;

    /* renamed from: g */
    public final /* synthetic */ boolean f187413g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65113p(C65124q qVar, boolean z, boolean z2, boolean z3, C15601d dVar) {
        super(2, dVar);
        this.f187410d = qVar;
        this.f187411e = z;
        this.f187412f = z2;
        this.f187413g = z3;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        return new C65113p(this.f187410d, this.f187411e, this.f187412f, this.f187413g, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C65113p) create(obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        if (this.f187411e) {
            this.f187410d.f187452t.mo79082c();
        }
        boolean z = true;
        if (this.f187412f) {
            this.f187410d.f187446n = true;
        }
        if (this.f187413g) {
            this.f187410d.f187447o = true;
        }
        C65124q qVar = this.f187410d;
        boolean z2 = qVar.f187446n && qVar.f187448p <= qVar.f187208i.f187210b;
        if (!qVar.f187447o || qVar.f187449q < (qVar.size() - 1) - qVar.f187208i.f187210b) {
            z = false;
        }
        if (z2 || z) {
            if (z2) {
                qVar.f187446n = false;
            }
            if (z) {
                qVar.f187447o = false;
            }
            qVar.mo89299n(z2, z);
        }
        return C13598b0.f38549a;
    }
}
