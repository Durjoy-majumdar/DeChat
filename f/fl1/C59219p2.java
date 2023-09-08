package fl1;

import android.view.View;
import qj1.C12522mf;
import qj1.C62632a6;

/* renamed from: fl1.p2 */
public final class C59219p2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169364d;

    public C59219p2(C59161f fVar) {
        this.f169364d = fVar;
    }

    public final void run() {
        View view;
        C12522mf mfVar;
        C59161f fVar = this.f169364d;
        C62632a6 a6Var = fVar.f169234q;
        if (a6Var != null && (view = a6Var.f177874u) != null && (mfVar = fVar.f169187B) != null) {
            mfVar.f36002y = view;
            mfVar.mo12154c1(view);
        }
    }
}
