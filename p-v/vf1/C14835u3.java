package vf1;

import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI;
import el1.C7741d;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: vf1.u3 */
public final class C14835u3 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveVisitorWhiteListUI f40833d;

    public C14835u3(FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI) {
        this.f40833d = finderLiveVisitorWhiteListUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107142f(1, this.f40833d.getString(C0966R.string.e_2));
        e0Var.mo107142f(2, this.f40833d.getString(C0966R.string.n9j));
        if (((C7741d) C39818r.f106831a.mo62444c(this.f40833d).mo75002a(C7741d.class)).f26217D) {
            e0Var.mo107154n(3, this.f40833d.getString(C0966R.string.e27), this.f40833d.getString(C0966R.string.n9m), 0);
        }
        e0Var.mo107154n(4, this.f40833d.getString(C0966R.string.n9t), this.f40833d.getString(C0966R.string.n9u), 0);
    }
}
