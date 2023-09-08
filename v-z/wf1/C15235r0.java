package wf1;

import android.content.DialogInterface;
import gy3.C8477a0;
import wf1.C15221m0;

/* renamed from: wf1.r0 */
public final class C15235r0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f41455d;

    /* renamed from: e */
    public final /* synthetic */ C15242u0 f41456e;

    public C15235r0(C8477a0 a0Var, C15242u0 u0Var) {
        this.f41455d = a0Var;
        this.f41456e = u0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f41455d.f27482d = true;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        C15221m0.C15222a aVar = this.f41456e.mo14155c3().f41436g;
        if (aVar != null) {
            aVar.mo14140a();
        }
    }
}
