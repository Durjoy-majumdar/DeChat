package dn2;

import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: dn2.h */
public final class C7390h implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C7373a f25529d;

    public C7390h(C7373a aVar, C77407n nVar) {
        this.f25529d = aVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C7373a aVar = this.f25529d;
        C87412m.m108593f(e0Var, "menu");
        e0Var.mo107146h(5, aVar.f25505a.getString(C0966R.string.mxs), C0966R.raw.icons_outlined_download, aVar.f25505a.getResources().getColor(C0966R.color.FG_0));
        e0Var.mo107146h(6, aVar.f25505a.getString(C0966R.string.mxo), C0966R.raw.icons_outlined_pencil, aVar.f25505a.getResources().getColor(C0966R.color.FG_0));
        if (!aVar.f25507c) {
            e0Var.mo107146h(7, aVar.f25505a.getString(C0966R.string.mxr), C0966R.raw.icons_outlined_refresh, aVar.f25505a.getResources().getColor(C0966R.color.FG_0));
        }
    }
}
