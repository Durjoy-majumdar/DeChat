package vf1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: vf1.g3 */
public final class C14766g3 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveOrderUI f40742d;

    /* renamed from: e */
    public final /* synthetic */ String f40743e;

    public C14766g3(FinderLiveOrderUI finderLiveOrderUI, String str) {
        this.f40742d = finderLiveOrderUI;
        this.f40743e = str;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107144g(0, this.f40742d.getContext().getResources().getString(C0966R.string.n_c), C0966R.color.FG_0);
        e0Var.mo107144g(1, this.f40742d.getContext().getResources().getString(C0966R.string.n_b, new Object[]{this.f40743e}), C0966R.color.FG_0);
    }
}
