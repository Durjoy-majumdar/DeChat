package com.tencent.p014mm.plugin.vlog.p117ui.thumb;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/MultiTrackRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView */
public final class MultiTrackRecyclerView extends RecyclerView {

    /* renamed from: y1 */
    public int f207428y1 = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTrackRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setChildrenDrawingOrderEnabled(true);
        setClipToPadding(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            motionEvent.getAction();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f207428y1;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int C = i3 - (linearLayoutManager != null ? linearLayoutManager.mo16957C() : 0);
        return (C < 0 || i2 < C || C >= i) ? i2 : i2 == i + -1 ? C : i2 + 1;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            motionEvent.getAction();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTrackRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setChildrenDrawingOrderEnabled(true);
        setClipToPadding(false);
    }
}
