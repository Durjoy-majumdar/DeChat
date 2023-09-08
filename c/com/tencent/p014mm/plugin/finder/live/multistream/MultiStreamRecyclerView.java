package com.tencent.p014mm.plugin.finder.live.multistream;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.view.sidebar.DraggableConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/multistream/MultiStreamRecyclerView;", "Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "Lkotlin/Function0;", "Lrx3/b0;", "itemClick", "setRecyclerClick", "", "alpha", "setAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView */
public final class MultiStreamRecyclerView extends FinderRecyclerView {

    /* renamed from: K1 */
    public int f159452K1;

    /* renamed from: L1 */
    public int f159453L1;

    /* renamed from: M1 */
    public C32224a<C13598b0> f159454M1;

    /* renamed from: N1 */
    public C32226l<? super MotionEvent, C13598b0> f159455N1;

    /* renamed from: O1 */
    public C32224a<Boolean> f159456O1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiStreamRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C32224a<C13598b0> aVar;
        C32226l<? super MotionEvent, C13598b0> lVar = this.f159455N1;
        if (lVar != null) {
            lVar.invoke(motionEvent);
        }
        C32224a<Boolean> aVar2 = this.f159456O1;
        if (aVar2 != null && aVar2.invoke().booleanValue()) {
            return false;
        }
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f159452K1 = (int) motionEvent.getX();
            this.f159453L1 = (int) motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
            DraggableConstraintLayout draggableConstraintLayout = (DraggableConstraintLayout) getRootView().findViewById(C0966R.C0970id.jkp);
            if (draggableConstraintLayout != null) {
                draggableConstraintLayout.setNeedIntercept(false);
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            getParent().requestDisallowInterceptTouchEvent((((double) 180) * Math.atan2((double) Math.abs(((int) motionEvent.getX()) - this.f159452K1), (double) Math.abs(((int) motionEvent.getY()) - this.f159453L1))) / 3.141592653589793d >= 30.0d);
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                int y = (int) motionEvent.getY();
                int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                if (Math.abs(((int) motionEvent.getX()) - this.f159452K1) <= scaledTouchSlop && Math.abs(y - this.f159453L1) <= scaledTouchSlop && !C58739j4.f168176a.mo83683L() && (aVar = this.f159454M1) != null) {
                    aVar.invoke();
                }
                DraggableConstraintLayout draggableConstraintLayout2 = (DraggableConstraintLayout) getRootView().findViewById(C0966R.C0970id.jkp);
                if (draggableConstraintLayout2 != null) {
                    draggableConstraintLayout2.setNeedIntercept(true);
                }
            }
        }
        return (motionEvent != null && motionEvent.getPointerCount() == 1) && super.dispatchTouchEvent(motionEvent);
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        Log.m105924i("MultiStreamRecyclerView", "setAlpha alpha:" + f);
    }

    public final void setRecyclerClick(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "itemClick");
        this.f159454M1 = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiStreamRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
