package com.tencent.p014mm.plugin.finder.live.box.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.sidebar.DraggableConstraintLayout;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/box/viewpager/FinderLiveBoxViewPager;", "Landroidx/viewpager/widget/ViewPager;", "", "height", "Lrx3/b0;", "setMaxHeight", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "maxHeight", "I", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxViewPager */
public final class FinderLiveBoxViewPager extends ViewPager {
    public static final C55897a Companion = new C55897a((C8480h) null);
    public static final String TAG = "FinderLiveBoxViewPager";
    private int maxHeight;

    /* renamed from: com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxViewPager$a */
    public static final class C55897a {
        public C55897a(C8480h hVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveBoxViewPager(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DraggableConstraintLayout draggableConstraintLayout;
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        boolean z = false;
        if (valueOf != null && valueOf.intValue() == 0) {
            DraggableConstraintLayout draggableConstraintLayout2 = (DraggableConstraintLayout) getRootView().findViewById(C0966R.C0970id.jkp);
            if (draggableConstraintLayout2 != null) {
                draggableConstraintLayout2.setNeedIntercept(false);
            }
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                z = true;
            }
            if (z && (draggableConstraintLayout = (DraggableConstraintLayout) getRootView().findViewById(C0966R.C0970id.jkp)) != null) {
                draggableConstraintLayout.setNeedIntercept(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.maxHeight;
        if (i3 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
            return;
        }
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            measureChild(childAt, i, i2);
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i4) {
                i4 = measuredHeight;
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    public final void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveBoxViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }
}
