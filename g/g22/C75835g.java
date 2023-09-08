package g22;

import android.view.View;
import e22.C75529q0;

/* renamed from: g22.g */
public class C75835g implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ int f222453d;

    /* renamed from: e */
    public final /* synthetic */ C75529q0 f222454e;

    /* renamed from: f */
    public final /* synthetic */ C75838j f222455f;

    public C75835g(C75838j jVar, int i, C75529q0 q0Var) {
        this.f222455f = jVar;
        this.f222453d = i;
        this.f222454e = q0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r0 != 3) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r10)
            r0.add(r11)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$4"
            java.lang.String r2 = "android/view/View$OnTouchListener"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = r9
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            g22.j r0 = r9.f222455f
            int r1 = r0.f222468n
            r2 = 1
            if (r1 != r2) goto L_0x0088
            boolean r0 = r0.f222461d
            if (r0 == 0) goto L_0x0088
            int r0 = r11.getActionMasked()
            if (r0 == 0) goto L_0x0080
            if (r0 == r2) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0038
            r1 = 3
            if (r0 == r1) goto L_0x0076
            goto L_0x0088
        L_0x0038:
            long r0 = java.lang.System.currentTimeMillis()
            g22.j r3 = r9.f222455f
            long r4 = r3.f222479y
            long r0 = r0 - r4
            r4 = 100
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0088
            androidx.recyclerview.widget.p r0 = r3.f222467j
            if (r0 == 0) goto L_0x0088
            android.content.Context r11 = r3.f222465h
            android.content.res.Resources r11 = r11.getResources()
            r0 = 2131233567(0x7f080b1f, float:1.8083275E38)
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r0)
            r10.setBackground(r11)
            g22.j r10 = r9.f222455f
            int r11 = r9.f222453d
            r10.f222471q = r11
            androidx.recyclerview.widget.p r10 = r10.f222467j
            e22.q0 r11 = r9.f222454e
            r10.mo17537u(r11)
            r3 = 1
            java.lang.String r5 = "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$4"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r9
            j20.C117292a.m165362h(r3, r4, r5, r6, r7, r8)
            return r2
        L_0x0076:
            g22.j r0 = r9.f222455f
            r1 = 0
            r0.f222479y = r1
            r0.getClass()
            goto L_0x0088
        L_0x0080:
            g22.j r0 = r9.f222455f
            long r1 = java.lang.System.currentTimeMillis()
            r0.f222479y = r1
        L_0x0088:
            g22.j r0 = r9.f222455f
            android.view.View$OnTouchListener r0 = r0.f222476v
            if (r0 == 0) goto L_0x0091
            r0.onTouch(r10, r11)
        L_0x0091:
            r10 = 0
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$4"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r9
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g22.C75835g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
