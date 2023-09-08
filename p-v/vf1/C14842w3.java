package vf1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveWhiteListUI;

/* renamed from: vf1.w3 */
public final class C14842w3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveWhiteListUI f40841d;

    public C14842w3(FinderLiveWhiteListUI finderLiveWhiteListUI) {
        this.f40841d = finderLiveWhiteListUI;
    }

    public final void run() {
        int f = C75044y4.m89994f(this.f40841d.getContext());
        View view = this.f40841d.f14608o;
        ViewGroup viewGroup = null;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = f;
        }
        View view2 = this.f40841d.f14608o;
        ViewParent parent = view2 != null ? view2.getParent() : null;
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this.f40841d.f14608o, marginLayoutParams);
        }
    }
}
