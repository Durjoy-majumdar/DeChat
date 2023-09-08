package kx0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread.BizPCRecentReadUI;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: kx0.k */
public final class C46781k implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ BizPCRecentReadUI f125899d;

    public C46781k(BizPCRecentReadUI bizPCRecentReadUI) {
        this.f125899d = bizPCRecentReadUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107140d(0, this.f125899d.getContext().getResources().getColor(C0966R.color.f2966ao), this.f125899d.getString(C0966R.string.n0d));
    }
}
