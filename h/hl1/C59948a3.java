package hl1;

import android.view.View;
import qj1.C12522mf;
import qj1.C62632a6;

/* renamed from: hl1.a3 */
public final class C59948a3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171072d;

    public C59948a3(C59988k kVar) {
        this.f171072d = kVar;
    }

    public final void run() {
        View view;
        C12522mf mfVar;
        C59988k kVar = this.f171072d;
        C62632a6 a6Var = kVar.f171246v;
        if (a6Var != null && (view = a6Var.f177874u) != null && (mfVar = kVar.f171234p0) != null) {
            mfVar.f36002y = view;
            mfVar.mo12154c1(view);
        }
    }
}
