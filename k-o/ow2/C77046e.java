package ow2;

import android.view.VelocityTracker;
import android.view.View;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import en3.C75627f;

/* renamed from: ow2.e */
public final class C77046e extends C75627f {

    /* renamed from: a */
    public float f225073a;

    /* renamed from: b */
    public PullDownListView f225074b;

    /* renamed from: c */
    public View f225075c;

    /* renamed from: d */
    public VelocityTracker f225076d;

    /* renamed from: e */
    public int f225077e;

    /* renamed from: f */
    public int f225078f = C74942w4.m89784a(MMApplicationContext.getContext(), 30);

    /* renamed from: g */
    public boolean f225079g;

    /* renamed from: h */
    public int f225080h;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.os.Vibrator} */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r0 != 3) goto L_0x00f5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo105974a(android.view.MotionEvent r7, boolean r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r7, r0)
            android.view.VelocityTracker r0 = r6.f225076d
            if (r0 != 0) goto L_0x000f
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f225076d = r0
        L_0x000f:
            android.view.VelocityTracker r0 = r6.f225076d
            if (r0 == 0) goto L_0x0016
            r0.addMovement(r7)
        L_0x0016:
            int r0 = r7.getActionMasked()
            r1 = 0
            if (r0 == 0) goto L_0x00e2
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L_0x00a1
            if (r0 == r3) goto L_0x0029
            r8 = 3
            if (r0 == r8) goto L_0x00a1
            goto L_0x00f5
        L_0x0029:
            if (r8 == 0) goto L_0x00f5
            r6.f225080h = r9
            r7.getRawX()
            float r8 = r7.getRawY()
            float r0 = r6.f225073a
            float r8 = r8 - r0
            android.view.VelocityTracker r0 = r6.f225076d
            if (r0 == 0) goto L_0x0040
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r1)
        L_0x0040:
            android.view.VelocityTracker r0 = r6.f225076d
            r1 = 0
            if (r0 == 0) goto L_0x004c
            int r5 = r6.f225077e
            float r0 = r0.getXVelocity(r5)
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            android.view.VelocityTracker r5 = r6.f225076d
            if (r5 == 0) goto L_0x0057
            int r1 = r6.f225077e
            float r1 = r5.getYVelocity(r1)
        L_0x0057:
            if (r9 == r4) goto L_0x0080
            if (r9 == r3) goto L_0x005d
            goto L_0x00f5
        L_0x005d:
            r6.f225079g = r4
            android.view.View r7 = r6.f225075c
            if (r7 == 0) goto L_0x0067
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
        L_0x0067:
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            com.tencent.mm.ui.widget.listview.PullDownListView r7 = r6.f225074b
            if (r7 == 0) goto L_0x00f5
            if (r2 == 0) goto L_0x00f5
            r7 = 1097859072(0x41700000, float:15.0)
            float r8 = r8 / r7
            int r7 = (int) r8
            r2.topMargin = r7
            android.view.View r7 = r6.f225075c
            if (r7 != 0) goto L_0x007b
            goto L_0x00f5
        L_0x007b:
            r7.setLayoutParams(r2)
            goto L_0x00f5
        L_0x0080:
            r6.f225079g = r4
            float r8 = java.lang.Math.abs(r8)
            int r9 = r6.f225078f
            float r9 = (float) r9
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x00f5
            float r8 = java.lang.Math.abs(r1)
            float r9 = java.lang.Math.abs(r0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x00f5
            com.tencent.mm.ui.widget.listview.PullDownListView r8 = r6.f225074b
            if (r8 == 0) goto L_0x00f5
            r8.dispatchTouchEvent(r7)
            goto L_0x00f5
        L_0x00a1:
            android.view.VelocityTracker r8 = r6.f225076d
            if (r8 == 0) goto L_0x00a8
            r8.clear()
        L_0x00a8:
            android.view.VelocityTracker r8 = r6.f225076d
            if (r8 == 0) goto L_0x00af
            r8.recycle()
        L_0x00af:
            r6.f225076d = r2
            int r8 = r6.f225080h
            if (r8 != r4) goto L_0x00bd
            com.tencent.mm.ui.widget.listview.PullDownListView r8 = r6.f225074b
            if (r8 == 0) goto L_0x00df
            r8.dispatchTouchEvent(r7)
            goto L_0x00df
        L_0x00bd:
            if (r8 != r3) goto L_0x00df
            com.tencent.mm.ui.widget.listview.PullDownListView r7 = r6.f225074b
            if (r7 == 0) goto L_0x00c6
            r7.mo104538n()
        L_0x00c6:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r8 = "vibrator"
            java.lang.Object r7 = r7.getSystemService(r8)
            boolean r8 = r7 instanceof android.os.Vibrator
            if (r8 == 0) goto L_0x00d8
            r2 = r7
            android.os.Vibrator r2 = (android.os.Vibrator) r2
        L_0x00d8:
            if (r2 == 0) goto L_0x00df
            r7 = 10
            r2.vibrate(r7)
        L_0x00df:
            r6.f225080h = r1
            goto L_0x00f5
        L_0x00e2:
            int r8 = r7.getPointerId(r1)
            r6.f225077e = r8
            r7.getRawX()
            float r7 = r7.getRawY()
            r6.f225073a = r7
            r6.f225079g = r1
            r6.f225080h = r1
        L_0x00f5:
            boolean r7 = r6.f225079g
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ow2.C77046e.mo105974a(android.view.MotionEvent, boolean, int):boolean");
    }

    /* renamed from: b */
    public int mo105975b() {
        return 3;
    }
}
