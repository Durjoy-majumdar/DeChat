package ol1;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: ol1.c */
public final class C11481c implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C11476b f33752d;

    public C11481c(C11476b bVar) {
        this.f33752d = bVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        ConstraintLayout constraintLayout = this.f33752d.f33741q;
        if (constraintLayout != null) {
            if (constraintLayout.getVisibility() == 8) {
                e0Var.mo107125a(1, C0966R.string.dlw);
            }
            e0Var.mo107125a(2, C0966R.string.dik);
            return;
        }
        C87412m.m108603p("completeLayout");
        throw null;
    }
}
