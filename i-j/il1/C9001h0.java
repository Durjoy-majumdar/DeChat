package il1;

import android.view.View;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: il1.h0 */
public final class C9001h0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C8986g0 f28436d;

    public C9001h0(C8986g0 g0Var) {
        this.f28436d = g0Var;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f28436d.f28403l;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        C8986g0 g0Var = this.f28436d;
        e0Var.mo107140d(0, g0Var.f28392a.getContext().getResources().getColor(C0966R.color.f356948a24), ((C54963d0) g0Var.f28394c.mo87696x0(C54963d0.class)).f154078u == 5 ? g0Var.f28392a.getContext().getResources().getString(C0966R.string.dr5) : g0Var.f28392a.getContext().getResources().getString(C0966R.string.dr8));
    }
}
