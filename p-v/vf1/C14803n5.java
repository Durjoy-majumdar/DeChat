package vf1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI;
import er1.C58784w3;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: vf1.n5 */
public final class C14803n5 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderTopicFeedUI f40789d;

    public C14803n5(FinderTopicFeedUI finderTopicFeedUI) {
        this.f40789d = finderTopicFeedUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        if (e0Var.mo107176v()) {
            String string = this.f40789d.getContext().getString(C0966R.string.f360098a33);
            C87412m.m108593f(string, "context.getString(com.te…ring.app_share_to_weixin)");
            String string2 = this.f40789d.getContext().getString(C0966R.string.epb);
            C87412m.m108593f(string2, "context.getString(com.te…ng.finder_share_timeline)");
            if (FinderTopicFeedUI.m2987O7(this.f40789d)) {
                C58784w3 w3Var = C58784w3.f168295a;
                String Y = w3Var.mo83911Y("", C0966R.string.eo6);
                str2 = w3Var.mo83911Y("", C0966R.string.eo7);
                str = Y;
                z2 = true;
                z = true;
            } else {
                str = string;
                str2 = string2;
                z2 = false;
                z = false;
            }
            e0Var.mo107150j(10002, str, C0966R.raw.finder_icons_filled_share, this.f40789d.getContext().getResources().getColor(C0966R.color.f2939n), z2);
            e0Var.mo107150j(10003, str2, C0966R.raw.bottomsheet_icon_moment, 0, z);
        }
    }
}
