package lq1;

import com.tencent.p014mm.C0966R;
import eb0.C75592q0;
import er1.C58784w3;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C76874e0;
import sq1.C64151e;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: lq1.d0 */
public final class C61350d0 implements C11182m0 {

    /* renamed from: d */
    public C64151e f174507d;

    /* renamed from: e */
    public final String f174508e;

    public C61350d0(C64151e eVar, String str) {
        C87412m.m108594g(eVar, "commentItem");
        C87412m.m108594g(str, "feedUsername");
        this.f174507d = eVar;
        this.f174508e = str;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        C87412m.m108594g(e0Var, "menu");
        C58784w3 w3Var = C58784w3.f168295a;
        if (w3Var.mo83899R0(this.f174508e)) {
            boolean z = false;
            e0Var.mo107125a(0, C0966R.string.f7936wt);
            if (!C87412m.m108589b(this.f174507d.f181868d.getUsername(), C66785b.f191882e.mo90662O5()) && !C87412m.m108589b(this.f174507d.f181868d.getUsername(), C75592q0.m90789s())) {
                z = true;
            }
            if (z) {
                e0Var.mo107125a(2, C0966R.string.f7968xs);
            }
            e0Var.mo107125a(1, C0966R.string.f7944x1);
            if (z && w3Var.mo83899R0(this.f174508e)) {
                if (!this.f174507d.f181868d.mo88885v2()) {
                    e0Var.mo107125a(3, C0966R.string.d0c);
                } else if (C37521f.f99374d.mo61180f()) {
                    e0Var.mo107125a(3, C0966R.string.d0c);
                }
            }
        }
    }
}
