package gl1;

import android.view.View;
import qj1.C12522mf;
import qj1.C62632a6;

/* renamed from: gl1.g2 */
public final class C59549g2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170184d;

    public C59549g2(C59559k kVar) {
        this.f170184d = kVar;
    }

    public final void run() {
        View view;
        C12522mf mfVar;
        C59559k kVar = this.f170184d;
        C62632a6 a6Var = kVar.f170249r;
        if (a6Var != null && (view = a6Var.f177874u) != null && (mfVar = kVar.f170201C) != null) {
            mfVar.f36002y = view;
            mfVar.mo12154c1(view);
        }
    }
}
