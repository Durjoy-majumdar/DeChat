package xk1;

import android.content.DialogInterface;
import gy3.C8477a0;
import te3.C49007cj0;
import te3.C50119ke1;
import xk1.C15747k0;

/* renamed from: xk1.n0 */
public final class C15760n0 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f42486d;

    /* renamed from: e */
    public final /* synthetic */ C15747k0 f42487e;

    public C15760n0(C8477a0 a0Var, C15747k0 k0Var) {
        this.f42486d = a0Var;
        this.f42487e = k0Var;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C15747k0.C15748a aVar;
        if (!this.f42486d.f27482d && (aVar = this.f42487e.f42470f) != null) {
            C15747k0.C15748a.C15749a.m14709a(aVar, false, (C49007cj0) null, (C50119ke1) null, false, 0, 0, 62, (Object) null);
        }
    }
}
