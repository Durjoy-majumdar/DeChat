package com.tencent.p014mm.plugin.vlog.p117ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import sx3.C110826x0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/CropOperationContainer;", "Landroid/widget/RelativeLayout;", "", "enable", "Lrx3/b0;", "setEditorItemFirstTouch", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.widget.CropOperationContainer */
public final class CropOperationContainer extends RelativeLayout {

    /* renamed from: d */
    public final Set<Integer> f207440d = C110826x0.m151017e(Integer.valueOf(C0966R.C0970id.l5o), Integer.valueOf(C0966R.C0970id.hvw));

    /* renamed from: e */
    public boolean f207441e;

    public CropOperationContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final boolean mo98736a(MotionEvent motionEvent, boolean z, View view) {
        int action = motionEvent.getAction();
        if (z || action == 3) {
            motionEvent.setAction(3);
            boolean dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
            motionEvent.setAction(action);
            return dispatchTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        C87412m.m108593f(obtain, "obtain(event)");
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        boolean dispatchTouchEvent2 = view.dispatchTouchEvent(obtain);
        obtain.recycle();
        return dispatchTouchEvent2;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Log.m105918d("CropOperationContainer", "dispatchTouchEvent: " + motionEvent);
        if (!this.f207441e) {
            return super.dispatchTouchEvent(motionEvent);
        }
        boolean z2 = false;
        for (int childCount = getChildCount() - 1; -1 < childCount && !z2; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(childAt == null || motionEvent == null)) {
                float x = (motionEvent.getX() + ((float) getScrollX())) - ((float) childAt.getLeft());
                float y = (motionEvent.getY() + ((float) getScrollY())) - ((float) childAt.getTop());
                if (childAt.getVisibility() == 0 && x >= 0.0f && x < ((float) (childAt.getRight() - childAt.getLeft())) && y >= 0.0f && y < ((float) (childAt.getBottom() - childAt.getTop()))) {
                    z = true;
                    if (z && this.f207440d.contains(Integer.valueOf(childAt.getId()))) {
                        C87412m.m108591d(motionEvent);
                        z2 = mo98736a(motionEvent, false, childAt);
                    }
                }
            }
            z = false;
            C87412m.m108591d(motionEvent);
            z2 = mo98736a(motionEvent, false, childAt);
        }
        for (int childCount2 = getChildCount() - 1; -1 < childCount2 && !z2; childCount2--) {
            View childAt2 = getChildAt(childCount2);
            if (childAt2 != null && motionEvent != null && childAt2.getVisibility() == 0 && !this.f207440d.contains(Integer.valueOf(childAt2.getId()))) {
                z2 = mo98736a(motionEvent, false, childAt2);
            }
        }
        return z2;
    }

    public final void setEditorItemFirstTouch(boolean z) {
        this.f207441e = z;
    }

    public CropOperationContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
