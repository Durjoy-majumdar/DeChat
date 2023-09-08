package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.sidebar.DraggableConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveScrollView;", "Landroid/widget/HorizontalScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveScrollView */
public final class FinderLiveScrollView extends HorizontalScrollView {

    /* renamed from: d */
    public int f17869d;

    /* renamed from: e */
    public int f17870e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DraggableConstraintLayout draggableConstraintLayout;
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        boolean z = false;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f17869d = (int) motionEvent.getX();
            this.f17870e = (int) motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
            DraggableConstraintLayout draggableConstraintLayout2 = (DraggableConstraintLayout) getRootView().findViewById(C0966R.C0970id.jkp);
            if (draggableConstraintLayout2 != null) {
                draggableConstraintLayout2.setNeedIntercept(false);
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            int abs = Math.abs(((int) motionEvent.getX()) - this.f17869d);
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.f17870e);
            double atan2 = (((double) 180) * Math.atan2((double) abs, (double) abs2)) / 3.141592653589793d;
            Log.m105924i("FinderLiveScrollView", " angel: " + atan2 + " disX: " + abs + " disY: " + abs2);
            ViewParent parent = getParent();
            if (atan2 >= 30.0d) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
