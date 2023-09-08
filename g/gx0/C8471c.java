package gx0;

import c00.C0405n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.BrandServiceIndexUI;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: gx0.c */
public class C8471c implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ BrandServiceIndexUI f27474d;

    public C8471c(BrandServiceIndexUI brandServiceIndexUI) {
        this.f27474d = brandServiceIndexUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (!((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
            e0Var.mo107142f(1, this.f27474d.getContext().getResources().getString(C0966R.string.e5m));
        }
        e0Var.mo107142f(2, this.f27474d.getContext().getResources().getString(C0966R.string.e5n));
        if (!((C45696d) C86709a0.m107533q(C45696d.class)).Rq0()) {
            e0Var.mo107142f(3, this.f27474d.getContext().getResources().getString(C0966R.string.m2s));
        }
    }
}
