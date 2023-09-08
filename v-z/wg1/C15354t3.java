package wg1;

import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nj3.C76912y0;
import p687sr.C64153e;
import te3.C49098d51;
import te3.C50523nc3;

/* renamed from: wg1.t3 */
public final class C15354t3 implements C64153e.C64155b {

    /* renamed from: a */
    public final /* synthetic */ C15278g3 f41706a;

    public C15354t3(C15278g3 g3Var) {
        this.f41706a = g3Var;
    }

    /* renamed from: a */
    public void mo4980a(boolean z) {
        C50523nc3 nc32;
        C15278g3 g3Var = this.f41706a;
        C49098d51 d512 = g3Var.f41548C;
        boolean z2 = true;
        if (d512 == null || (nc32 = d512.f132128q) == null || !nc32.f138532d) {
            z2 = false;
        }
        String string = z2 ? g3Var.getActivity().getString(C0966R.string.mr5) : g3Var.getActivity().getString(C0966R.string.dzj);
        C87412m.m108593f(string, "if (isPay) {\n           …edu_toast_tips)\n        }");
        C76912y0.m92773l(g3Var.getActivity(), string);
    }
}
