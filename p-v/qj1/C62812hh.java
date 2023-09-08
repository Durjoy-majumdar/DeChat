package qj1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: qj1.hh */
public final class C62812hh implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C62795gh f178287d;

    public C62812hh(C62795gh ghVar) {
        this.f178287d = ghVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f178287d.f178242A;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        this.f178287d.getClass();
        e0Var.mo107140d(0, this.f178287d.f166287d.getContext().getResources().getColor(C0966R.color.f356948a24), this.f178287d.f166287d.getContext().getResources().getString(C0966R.string.nd7));
    }
}
