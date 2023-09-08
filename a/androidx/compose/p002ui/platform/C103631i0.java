package androidx.compose.p002ui.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Set;
import p583k2.C108830a;
import p658q1.C110301j;
import p658q1.j$$h;

/* renamed from: androidx.compose.ui.platform.i0 */
public final class C103631i0 extends ViewGroup {

    /* renamed from: d */
    public final HashMap<C108830a, C110301j> f306084d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<C110301j, C108830a> f306085e = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103631i0(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setClipChildren(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<C108830a, C110301j> getHolderToLayoutNode() {
        return this.f306084d;
    }

    public final HashMap<C110301j, C108830a> getLayoutNodeToHolder() {
        return this.f306085e;
    }

    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    public void onDescendantInvalidated(View view, View view2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Set<C108830a> keySet = this.f306084d.keySet();
        C87412m.m108593f(keySet, "holderToLayoutNode.keys");
        for (C108830a aVar : keySet) {
            aVar.layout(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom());
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean z = true;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                z = false;
            }
            if (z) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                Set<C108830a> keySet = this.f306084d.keySet();
                C87412m.m108593f(keySet, "holderToLayoutNode.keys");
                for (C108830a aVar : keySet) {
                    int i4 = aVar.f325940v;
                    if (!(i4 == Integer.MIN_VALUE || (i3 = aVar.f325941w) == Integer.MIN_VALUE)) {
                        aVar.measure(i4, i3);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C110301j jVar = this.f306084d.get(childAt);
            if (childAt.isLayoutRequested() && jVar != null) {
                j$$h j__h = C110301j.f329884p0;
                jVar.mo161712N(false);
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
