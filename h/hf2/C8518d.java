package hf2;

import com.tencent.p014mm.C0966R;
import gy3.C8477a0;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: hf2.d */
public final class C8518d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f27556d;

    /* renamed from: e */
    public final /* synthetic */ C46035f f27557e;

    public C8518d(C8477a0 a0Var, C46035f fVar) {
        this.f27556d = a0Var;
        this.f27557e = fVar;
    }

    public final void run() {
        if (!this.f27556d.f27482d && !this.f27557e.getActivity().isFinishing()) {
            C46035f fVar = this.f27557e;
            C89779i0 i0Var = fVar.f124146i;
            if (i0Var != null) {
                i0Var.dismiss();
                fVar.f124146i = null;
            }
            fVar.f124146i = C76879j.m92723Q(fVar.getContext(), (String) null, fVar.getString(C0966R.string.a4d), true, true, C8520h.f27562d);
        }
    }
}
