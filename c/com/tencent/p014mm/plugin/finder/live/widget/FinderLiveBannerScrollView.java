package com.tencent.p014mm.plugin.finder.live.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import android.widget.Scroller;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveBannerScrollView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveBannerScrollView */
public class FinderLiveBannerScrollView extends ScrollView {

    /* renamed from: d */
    public Scroller f198087d = new Scroller(getContext());

    public FinderLiveBannerScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void computeScroll() {
        Scroller scroller = this.f198087d;
        C87412m.m108591d(scroller);
        if (scroller.computeScrollOffset()) {
            Scroller scroller2 = this.f198087d;
            C87412m.m108591d(scroller2);
            int currX = scroller2.getCurrX();
            Scroller scroller3 = this.f198087d;
            C87412m.m108591d(scroller3);
            scrollTo(currX, scroller3.getCurrY());
            postInvalidate();
        }
        super.computeScroll();
    }

    public void fling(int i) {
        super.fling(i);
    }

    public FinderLiveBannerScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
