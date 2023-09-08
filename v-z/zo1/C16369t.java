package zo1;

import android.view.View;
import bp1.C54519d;
import cl1.C0689t;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;
import te3.C51276so2;

/* renamed from: zo1.t */
public final class C16369t implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C77407n f43758d;

    /* renamed from: e */
    public final /* synthetic */ C16361r f43759e;

    public C16369t(C77407n nVar, C16361r rVar) {
        this.f43758d = nVar;
        this.f43759e = rVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        this.f43758d.mo107567l((View) null);
        e0Var.clear();
        C16361r rVar = this.f43759e;
        Class cls = C54519d.class;
        boolean z = false;
        if (((C54519d) rVar.mo87696x0(cls)).mo75376j3()) {
            C54519d dVar = (C54519d) rVar.mo87696x0(cls);
            int i = dVar.f152858u;
            if (i != -1 ? i == 5 : dVar.mo75372e3().f182366L == 5) {
                e0Var.mo107144g(6, rVar.f166287d.getContext().getResources().getString(C0966R.string.fyj), C0966R.raw.icons_outlined_eyes_on);
            } else {
                e0Var.mo107144g(7, rVar.f166287d.getContext().getResources().getString(C0966R.string.fyi), C0966R.raw.icons_outlined_eyes_off);
            }
            e0Var.mo107144g(8, rVar.f166287d.getContext().getResources().getString(C0966R.string.mb_), C0966R.raw.icons_outlined_delete);
        } else {
            e0Var.mo107144g(4, rVar.f166287d.getContext().getResources().getString(C0966R.string.dxw), C0966R.raw.icons_outlined_report_problem);
        }
        C51276so2 so22 = ((C55001u) ((C0689t) rVar.mo87696x0(C0689t.class)).business(C55001u.class)).f154420q.f182413y0;
        if (so22 != null && so22.f141656i == 1) {
            z = true;
        }
        if (z && !((C54519d) rVar.mo87696x0(cls)).mo75376j3()) {
            e0Var.mo107135b(9, C0966R.string.mrj, C0966R.raw.finder_live_ticket_icon_in_live);
        }
    }
}
