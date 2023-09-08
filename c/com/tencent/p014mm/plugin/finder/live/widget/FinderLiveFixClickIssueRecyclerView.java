package com.tencent.p014mm.plugin.finder.live.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR2\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveFixClickIssueRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lrx3/b0;", "y1", "Lfy3/l;", "getTouchEventListener", "()Lfy3/l;", "setTouchEventListener", "(Lfy3/l;)V", "touchEventListener", "", "value", "z1", "Z", "getConsumedTouchEnvent", "()Z", "setConsumedTouchEnvent", "(Z)V", "consumedTouchEnvent", "A1", "getAnimating", "setAnimating", "animating", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView */
public final class FinderLiveFixClickIssueRecyclerView extends RecyclerView {

    /* renamed from: A1 */
    public boolean f160076A1;

    /* renamed from: y1 */
    public C32226l<? super MotionEvent, C13598b0> f160077y1;

    /* renamed from: z1 */
    public boolean f160078z1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveFixClickIssueRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final boolean getAnimating() {
        return this.f160076A1;
    }

    public final boolean getConsumedTouchEnvent() {
        return this.f160078z1;
    }

    public final C32226l<MotionEvent, C13598b0> getTouchEventListener() {
        return this.f160077y1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        boolean z = getScrollState() == 2;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 0 && z) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (!canScrollVertically(-1) || !canScrollVertically(1)) {
                mo17155w1();
                return false;
            }
        }
        return onInterceptTouchEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f160076A1) {
            Log.m105920e("FinderLiveFixClickIssueRecyclerView", "view is animating,dispatchTouchEvent consumed!!!");
            return true;
        }
        C32226l<? super MotionEvent, C13598b0> lVar = this.f160077y1;
        if (lVar != null) {
            lVar.invoke(motionEvent);
        }
        if (this.f160078z1) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAnimating(boolean z) {
        this.f160076A1 = z;
    }

    public final void setConsumedTouchEnvent(boolean z) {
        if (z != this.f160078z1) {
            Log.m105924i("FinderLiveFixClickIssueRecyclerView", "set consumedTouchEnvent " + z);
        }
        this.f160078z1 = z;
    }

    public final void setTouchEventListener(C32226l<? super MotionEvent, C13598b0> lVar) {
        this.f160077y1 = lVar;
    }
}
