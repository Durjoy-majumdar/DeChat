package rs1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import gy3.C87412m;
import jq3.C60905o;

/* renamed from: rs1.i1 */
public final class C13268i1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f37646d;

    /* renamed from: e */
    public final /* synthetic */ View f37647e;

    /* renamed from: f */
    public final /* synthetic */ View f37648f;

    /* renamed from: g */
    public final /* synthetic */ View f37649g;

    public C13268i1(C60905o oVar, View view, View view2, View view3) {
        this.f37646d = oVar;
        this.f37647e = view;
        this.f37648f = view2;
        this.f37649g = view3;
    }

    public final void run() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.f37646d.f44854d.getLocationInWindow(iArr);
        this.f37647e.getLocationInWindow(iArr2);
        iArr2[0] = iArr2[0] - iArr[0];
        iArr2[1] = iArr2[1] - iArr[1];
        ViewGroup.LayoutParams layoutParams = this.f37647e.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.LayoutParams layoutParams2 = this.f37648f.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams2).topMargin = ((FrameLayout.LayoutParams) layoutParams).topMargin + ((this.f37647e.getHeight() - this.f37649g.getHeight()) / 2);
        this.f37648f.requestLayout();
    }
}
