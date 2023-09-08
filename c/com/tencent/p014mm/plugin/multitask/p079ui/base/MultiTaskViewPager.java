package com.tencent.p014mm.plugin.multitask.p079ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p849e3.C107168a0;
import p849e3.C107207u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskViewPager;", "Lcom/tencent/mm/ui/base/CustomViewPager;", "Lcom/tencent/mm/ui/widget/MMWebView$c;", "", "enable", "Lrx3/b0;", "setCanOnlySlideBySide", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "multitask-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager */
public class MultiTaskViewPager extends CustomViewPager implements MMWebView.C45104c {

    /* renamed from: d */
    public boolean f315159d;

    public MultiTaskViewPager(Context context) {
        super(context);
    }

    /* renamed from: a */
    public boolean mo70479a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (((i3 != 0 || i >= 0) && (Math.abs(i3 - i5) >= 160 || i <= 0)) || i2 != 0) {
            return false;
        }
        setUnableDrag(false, true);
        return true;
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (this.f315159d) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            if (viewGroup.getVisibility() == 0) {
                int scrollX = viewGroup.getScrollX();
                int scrollY = viewGroup.getScrollY();
                for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    int i5 = i2 + scrollX;
                    if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                        if (canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop()) && childAt.isEnabled()) {
                            return true;
                        }
                    }
                }
            }
        }
        if (z) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (view.canScrollHorizontally(-i)) {
                if (view.getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setCanOnlySlideBySide(boolean z) {
        this.f315159d = z;
    }

    public MultiTaskViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
