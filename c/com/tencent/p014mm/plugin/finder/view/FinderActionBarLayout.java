package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderActionBarLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderActionBarLayout */
public final class FinderActionBarLayout extends LinearLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderActionBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        super.onLayout(z, i, i2, i3, i4);
        View findViewById4 = findViewById(C0966R.C0970id.kcj);
        if (findViewById4 != null && (findViewById = findViewById(C0966R.C0970id.flx)) != null && (findViewById2 = findViewById(C0966R.C0970id.j4k)) != null && (findViewById3 = findViewById(C0966R.C0970id.m7c)) != null) {
            boolean z2 = (findViewById.getVisibility() == 8 && findViewById2.getVisibility() == 8 && findViewById3.getVisibility() == 8) ? false : true;
            int left = findViewById.getLeft();
            int left2 = findViewById2.getLeft();
            if (left <= 0 || left2 <= 0 ? left2 > 0 : left > left2) {
                left = left2;
            }
            int left3 = findViewById3.getLeft();
            if (left <= 0 || left3 <= 0 ? left3 > 0 : left > left3) {
                left = left3;
            }
            int measuredWidth = (getMeasuredWidth() - findViewById4.getMeasuredWidth()) / 2;
            int measuredWidth2 = findViewById4.getMeasuredWidth() + measuredWidth;
            if (z2 && measuredWidth2 > left) {
                int i5 = measuredWidth2 - left;
                measuredWidth -= i5;
                measuredWidth2 -= i5;
            }
            findViewById4.layout(measuredWidth, findViewById4.getTop(), measuredWidth2, findViewById4.getBottom());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderActionBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
