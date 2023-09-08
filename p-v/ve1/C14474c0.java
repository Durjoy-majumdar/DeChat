package ve1;

import android.widget.FrameLayout;
import jq3.C60905o;
import ur1.C65468g;

/* renamed from: ve1.c0 */
public final class C14474c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C14680x f40114d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40115e;

    public C14474c0(C14680x xVar, C60905o oVar) {
        this.f40114d = xVar;
        this.f40115e = oVar;
    }

    public final void run() {
        C65468g gVar = this.f40114d.f40601e.f158622n;
        if (gVar != null) {
            FrameLayout m = gVar.mo89588m();
            m.setPadding(m.getPaddingLeft(), this.f40115e.f44854d.getHeight(), m.getPaddingRight(), m.getPaddingBottom());
        }
    }
}
