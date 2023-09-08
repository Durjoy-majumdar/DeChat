package com.tencent.p014mm.plugin.profile.p088ui.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileViewPager */
public final class BizProfileViewPager extends ViewPager {
    public static final int $stable = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizProfileViewPager(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizProfileViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }
}
