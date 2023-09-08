package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderMaxSizeLinearLayout;", "Landroid/widget/LinearLayout;", "", "maxHeight", "Lrx3/b0;", "setMaxHeight", "getMaxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLinearLayout */
public final class FinderMaxSizeLinearLayout extends LinearLayout {

    /* renamed from: d */
    public final String f15308d = "Finder.FinderMaxSizeLinearLayout";

    /* renamed from: e */
    public int f15309e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMaxSizeLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    public final int getMaxHeight() {
        return this.f15309e;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f15309e;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public final void setMaxHeight(int i) {
        this.f15309e = i;
        String str = this.f15308d;
        Log.m105924i(str, "[setMaxHeight],maxHeight:" + this.f15309e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMaxSizeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
