package kx0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread.BizPCRecentReadUI;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: kx0.m */
public final class C46784m implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ BizPCRecentReadUI f125902d;

    public C46784m(BizPCRecentReadUI bizPCRecentReadUI) {
        this.f125902d = bizPCRecentReadUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.add(0, 0, 1, (CharSequence) this.f125902d.getString(C0966R.string.n0a));
    }
}
