package zk1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gg1.C32444a;
import nj3.C11182m0;
import nj3.C76874e0;
import tf0.C13887q1;

/* renamed from: zk1.k0 */
public final class C16266k0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C16260i0 f43553d;

    public C16266k0(C16260i0 i0Var) {
        this.f43553d = i0Var;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        StringBuilder sb = new StringBuilder("live bottom sheet:");
        if (e0Var.mo107176v()) {
            e0Var.mo107125a(this.f43553d.f43538e, C0966R.string.d5q);
            sb.append(this.f43553d.getString(C0966R.string.d5q) + ',');
            C32444a aVar = C32444a.f86121a;
            if (C32444a.f86128b2.mo60266n().intValue() == 1 && ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13348kt() > 0) {
                e0Var.mo107125a(this.f43553d.f43540g, C0966R.string.lrj);
                sb.append(this.f43553d.getString(C0966R.string.lrj) + ',');
            }
            e0Var.mo107125a(this.f43553d.f43539f, C0966R.string.d5r);
            sb.append(this.f43553d.getString(C0966R.string.d5r) + ',');
        }
        Log.m105924i(this.f43553d.f43537d, String.valueOf(sb));
    }
}
