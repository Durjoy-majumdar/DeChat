package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveWrapContentViewPager;", "Landroidx/viewpager/widget/ViewPager;", "", "widthMeasureSpec", "heightMeasureSpec", "Lrx3/b0;", "onMeasure", "position", "reMeasureCurrentPage", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveWrapContentViewPager */
public class FinderLiveWrapContentViewPager extends ViewPager {
    public static final C56029a Companion = new C56029a((C8480h) null);
    public static final String TAG = "FinderLiveWrapContentViewPager";

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveWrapContentViewPager$a */
    public static final class C56029a {
        public C56029a(C8480h hVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveWrapContentViewPager(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public void onMeasure(int i, int i2) {
        C13598b0 b0Var;
        View childAt = getChildAt(getCurrentItem());
        if (childAt != null) {
            measureChild(childAt, i, i2);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            super.onMeasure(i, i2);
        }
    }

    public void reMeasureCurrentPage(int i) {
        setCurrentItem(i);
        requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveWrapContentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }
}
