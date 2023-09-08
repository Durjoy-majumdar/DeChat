package si1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: si1.c */
public final class C63898c implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C63902g f181124d;

    public C63898c(C63902g gVar) {
        this.f181124d = gVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C77407n nVar = this.f181124d.f181131n;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        C63902g gVar = this.f181124d;
        e0Var.mo107140d(1, gVar.getContext().getResources().getColor(C0966R.color.f356948a24), gVar.getContext().getResources().getString(C0966R.string.dr8));
    }
}
