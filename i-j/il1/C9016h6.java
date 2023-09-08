package il1;

import android.view.View;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import d50.C58115i;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: il1.h6 */
public final class C9016h6 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C8993g6 f28487d;

    public C9016h6(C8993g6 g6Var) {
        this.f28487d = g6Var;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C58115i iVar;
        C77407n nVar = this.f28487d.f28420j;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        C8993g6 g6Var = this.f28487d;
        g6Var.getClass();
        C54655b b = FinderLiveService.f159376d.mo77626b();
        boolean z = true;
        if (b == null || (iVar = b.f172989A) == null || !iVar.f166264k) {
            z = false;
        }
        if (z) {
            e0Var.mo107142f(g6Var.f28416f, g6Var.f28411a.getContext().getResources().getString(C0966R.string.dea));
            e0Var.mo107142f(g6Var.f28417g, g6Var.f28411a.getContext().getResources().getString(C0966R.string.deb));
            e0Var.mo107142f(g6Var.f28419i, g6Var.f28411a.getContext().getResources().getString(C0966R.string.mv9));
            e0Var.mo107140d(g6Var.f28415e, g6Var.f28411a.getContext().getResources().getColor(C0966R.color.f356948a24), g6Var.f28411a.getContext().getResources().getString(C0966R.string.de_));
            return;
        }
        e0Var.mo107142f(0, g6Var.f28411a.getContext().getResources().getString(C0966R.string.dec));
        e0Var.mo107142f(g6Var.f28414d, g6Var.f28411a.getContext().getResources().getString(C0966R.string.ded));
        e0Var.mo107142f(g6Var.f28418h, g6Var.f28411a.getContext().getResources().getString(C0966R.string.mv_));
    }
}
