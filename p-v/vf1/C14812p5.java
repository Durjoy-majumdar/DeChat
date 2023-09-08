package vf1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: vf1.p5 */
public final class C14812p5 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderTopicFeedUI f40800d;

    public C14812p5(FinderTopicFeedUI finderTopicFeedUI) {
        this.f40800d = finderTopicFeedUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.mo107176v()) {
            e0Var.mo107144g(10004, this.f40800d.getContext().getString(C0966R.string.gvt), C0966R.raw.icons_outlined_report_problem);
        }
    }
}
