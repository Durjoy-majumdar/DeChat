package com.tencent.p014mm.view.recyclerview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/view/recyclerview/InterceptRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Landroid/view/View;", "E1", "Landroid/view/View;", "getInterceptChildView", "()Landroid/view/View;", "setInterceptChildView", "(Landroid/view/View;)V", "interceptChildView", "Landroid/graphics/Rect;", "F1", "Landroid/graphics/Rect;", "getRect", "()Landroid/graphics/Rect;", "rect", "", "G1", "Z", "isCurIntercept", "()Z", "setCurIntercept", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.recyclerview.InterceptRecyclerView */
public final class InterceptRecyclerView extends WxRecyclerView {

    /* renamed from: E1 */
    public View f24981E1;

    /* renamed from: F1 */
    public final Rect f24982F1 = new Rect();

    /* renamed from: G1 */
    public boolean f24983G1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final View getInterceptChildView() {
        return this.f24981E1;
    }

    public final Rect getRect() {
        return this.f24982F1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        if (motionEvent.getAction() == 0) {
            this.f24983G1 = false;
            View view = this.f24981E1;
            if (view != null) {
                if (view.getVisibility() == 0) {
                    view.getGlobalVisibleRect(this.f24982F1);
                    if (this.f24982F1.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        Log.m105918d("InterceptRecyclerView", "onInterceptTouchEvent() called hit child intercept");
                        this.f24983G1 = true;
                        return false;
                    }
                }
            }
        }
        if (this.f24983G1) {
            requestDisallowInterceptTouchEvent(true);
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (Log.isDebug()) {
            Log.m105918d("InterceptRecyclerView", "onInterceptTouchEvent() called with res=" + onInterceptTouchEvent + " e = " + MotionEvent.actionToString(motionEvent.getAction()));
        }
        return onInterceptTouchEvent;
    }

    public final void setCurIntercept(boolean z) {
        this.f24983G1 = z;
    }

    public final void setInterceptChildView(View view) {
        this.f24981E1 = view;
    }
}
