package wf1;

import a14.C53916l;
import android.content.DialogInterface;
import gy3.C8477a0;
import wf1.C15221m0;

/* renamed from: wf1.o0 */
public final class C15229o0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15242u0 f41446d;

    /* renamed from: e */
    public final /* synthetic */ C53916l<Boolean> f41447e;

    /* renamed from: f */
    public final /* synthetic */ C8477a0 f41448f;

    public C15229o0(C15242u0 u0Var, C53916l<? super Boolean> lVar, C8477a0 a0Var) {
        this.f41446d = u0Var;
        this.f41447e = lVar;
        this.f41448f = a0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f41446d.mo14155c3().f41435f = false;
        C15242u0 u0Var = this.f41446d;
        u0Var.f41469h = this.f41447e;
        this.f41448f.f27482d = true;
        C15221m0.C15222a aVar = u0Var.mo14155c3().f41436g;
        if (aVar != null) {
            aVar.mo14141b();
        }
        C15221m0.C15222a aVar2 = this.f41446d.mo14155c3().f41436g;
        if (aVar2 != null) {
            aVar2.mo14124d();
        }
    }
}
