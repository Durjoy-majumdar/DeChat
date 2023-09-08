package androidx.compose.p002ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import p436a1.C103223b;
import p436a1.C103226c;
import p436a1.C103262s;

/* renamed from: androidx.compose.ui.platform.u0 */
public class C103689u0 extends ViewGroup {

    /* renamed from: d */
    public boolean f306260d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103689u0(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setClipChildren(false);
        setTag(C0966R.C0970id.evz, Boolean.TRUE);
    }

    /* renamed from: a */
    public final void mo144861a(C103262s sVar, View view, long j) {
        C87412m.m108594g(sVar, "canvas");
        C87412m.m108594g(view, "view");
        Canvas canvas = C103226c.f304431a;
        super.drawChild(((C103223b) sVar).f304427a, view, j);
    }

    public void dispatchDraw(Canvas canvas) {
        boolean z;
        C87412m.m108594g(canvas, "canvas");
        int childCount = super.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            } else if (((C103637j2) childAt).f306110n) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f306260d = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.f306260d = false;
            }
        }
    }

    public int getChildCount() {
        if (this.f306260d) {
            return super.getChildCount();
        }
        return 0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
