package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import p849e3.C58524o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveRecyclerView;", "Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "Le3/o;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView */
public final class FinderLiveRecyclerView extends FinderRecyclerView implements C58524o {

    /* renamed from: K1 */
    public final String f159815K1 = "Finder.FinderLiveRecyclerView";

    /* renamed from: L1 */
    public View f159816L1;

    /* renamed from: M1 */
    public boolean f159817M1;

    /* renamed from: N1 */
    public boolean f159818N1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        View view = this.f159816L1;
        if (view != null) {
            C87412m.m108591d(view);
            return view.getId() != C0966R.C0970id.djn;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = this.f159816L1 != null;
        if (z) {
            this.f159818N1 = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!z) {
            return dispatchTouchEvent;
        }
        this.f159818N1 = false;
        return dispatchTouchEvent ? dispatchTouchEvent : super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.f159818N1 && super.onInterceptTouchEvent(motionEvent);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C87412m.m108594g(view, "target");
        Log.m105924i(this.f159815K1, "onNestedScroll");
        if (view == this.f159816L1 && !this.f159817M1 && i2 != 0) {
            this.f159817M1 = true;
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        Log.m105924i(this.f159815K1, "onNestedScrollAccepted");
        if ((i & 2) != 0) {
            this.f159816L1 = view2;
            this.f159817M1 = false;
        }
        super.onNestedScrollAccepted(view, view2, i);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        C87412m.m108594g(view, "child");
        Log.m105924i(this.f159815K1, "onStopNestedScroll");
        this.f159816L1 = null;
        this.f159817M1 = false;
    }

    /* renamed from: r1 */
    public void mo17115r1(int i) {
        String str = this.f159815K1;
        Log.m105924i(str, "scrollToPosition " + i);
        super.mo17115r1(i);
    }

    /* renamed from: s1 */
    public void mo17122s1(int i, int i2, Interpolator interpolator) {
        Log.m105924i(this.f159815K1, "smoothScrollBy");
        super.mo17122s1(i, i2, interpolator);
    }

    public void scrollBy(int i, int i2) {
        Log.m105924i(this.f159815K1, "scrollBy");
        super.scrollBy(i, i2);
    }

    public void scrollTo(int i, int i2) {
        Log.m105924i(this.f159815K1, "scrollTo");
        super.scrollTo(i, i2);
    }

    public void smoothScrollBy(int i, int i2) {
        Log.m105924i(this.f159815K1, "smoothScrollBy");
        mo17122s1(i, i2, (Interpolator) null);
    }

    /* renamed from: t1 */
    public void mo17149t1(int i) {
        Log.m105924i(this.f159815K1, "smoothScrollToPosition");
        super.mo17149t1(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
