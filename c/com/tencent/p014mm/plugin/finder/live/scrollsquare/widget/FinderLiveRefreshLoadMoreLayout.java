package com.tencent.p014mm.plugin.finder.live.scrollsquare.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ck1.C54871a;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import er1.C58739j4;
import gy3.C87412m;
import kotlin.Metadata;
import p849e3.C107198j;
import p849e3.C107200l;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/scrollsquare/widget/FinderLiveRefreshLoadMoreLayout;", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "Le3/j;", "", "R0", "Z", "isSupportNestScroll", "()Z", "setSupportNestScroll", "(Z)V", "Le3/l;", "U0", "Lrx3/g;", "getScrollingChildHelper", "()Le3/l;", "scrollingChildHelper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.scrollsquare.widget.FinderLiveRefreshLoadMoreLayout */
public final class FinderLiveRefreshLoadMoreLayout extends RefreshLoadMoreLayout implements C107198j {

    /* renamed from: R0 */
    public boolean f159498R0;

    /* renamed from: S0 */
    public final int[] f159499S0 = new int[2];

    /* renamed from: T0 */
    public final int[] f159500T0 = new int[2];

    /* renamed from: U0 */
    public final C13601g f159501U0 = C36568h.m40985a(new C54871a(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveRefreshLoadMoreLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(attributeSet, "attrs");
    }

    private final C107200l getScrollingChildHelper() {
        return (C107200l) this.f159501U0.getValue();
    }

    /* renamed from: L */
    public void mo17026L(int i) {
        getScrollingChildHelper().mo157674k(i);
    }

    /* renamed from: Z */
    public boolean mo77716Z(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        view.toString();
        view2.toString();
        C58739j4.f168176a.mo83692U();
        return this.f159498R0 ? getScrollingChildHelper().mo157673j(i, i2) : this.f165572f;
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        C58739j4.f168176a.mo83692U();
        return getScrollingChildHelper().mo157665b(f, f2);
    }

    /* renamed from: i */
    public void mo77718i(View view, int i) {
        C87412m.m108594g(view, "target");
        view.toString();
        C58739j4.f168176a.mo83692U();
        if ((view instanceof RecyclerView) && C87412m.m108589b(view, getRecyclerView())) {
            getScrollingChildHelper().mo157674k(i);
        }
        super.mo77718i(view, i);
    }

    /* renamed from: n */
    public void mo77719n(View view, int i, int i2, int[] iArr, int i3) {
        C87412m.m108594g(view, "target");
        C87412m.m108594g(iArr, "consumed");
        if ((view instanceof RecyclerView) && C87412m.m108589b(view, getRecyclerView()) && this.f159498R0) {
            if (getScrollingChildHelper().mo157667d(i, i2, iArr, this.f159499S0, i3)) {
                int[] iArr2 = this.f159500T0;
                int i4 = iArr2[0];
                int[] iArr3 = this.f159499S0;
                iArr2[0] = i4 + iArr3[0];
                iArr2[1] = iArr2[1] + iArr3[1];
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        super.mo77719n(view, i, i2, iArr, i3);
    }

    public final void setSupportNestScroll(boolean z) {
        this.f159498R0 = z;
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo157673j(i, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveRefreshLoadMoreLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(attributeSet, "attrs");
    }
}
