package com.tencent.p014mm.plugin.finder.megavideo.p053ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import zl1.C66910a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001b\u0010\t\u001a\u00020\u00038FX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/ui/OverScrollRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;", "Lcom/tencent/mm/plugin/finder/megavideo/ui/OverScrollVerticalBehavior;", "getBehavior", "E1", "Lrx3/g;", "getOverScrollBehavior", "()Lcom/tencent/mm/plugin/finder/megavideo/ui/OverScrollVerticalBehavior;", "overScrollBehavior", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.megavideo.ui.OverScrollRecyclerView */
public final class OverScrollRecyclerView extends WxRecyclerView implements CoordinatorLayout.C54199b {

    /* renamed from: E1 */
    public final C13601g f160150E1 = C36568h.m40985a(C66910a.f192268d);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverScrollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final OverScrollVerticalBehavior getOverScrollBehavior() {
        return (OverScrollVerticalBehavior) this.f160150E1.getValue();
    }

    public OverScrollVerticalBehavior getBehavior() {
        return getOverScrollBehavior();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
