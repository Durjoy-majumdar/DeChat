package com.tencent.p014mm.view.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/view/recyclerview/HorizontalRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lkotlin/Function1;", "", "Lrx3/b0;", "F1", "Lfy3/l;", "getOnInterceptChangedListener", "()Lfy3/l;", "setOnInterceptChangedListener", "(Lfy3/l;)V", "onInterceptChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.recyclerview.HorizontalRecyclerView */
public final class HorizontalRecyclerView extends WxRecyclerView {

    /* renamed from: E1 */
    public boolean f24979E1;

    /* renamed from: F1 */
    public C32226l<? super Boolean, C13598b0> f24980F1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final C32226l<Boolean, C13598b0> getOnInterceptChangedListener() {
        return this.f24980F1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent != this.f24979E1) {
            C32226l<? super Boolean, C13598b0> lVar = this.f24980F1;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(onInterceptTouchEvent));
            }
            this.f24979E1 = onInterceptTouchEvent;
        }
        return onInterceptTouchEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnInterceptChangedListener(C32226l<? super Boolean, C13598b0> lVar) {
        this.f24980F1 = lVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
