package ce1;

import android.view.View;

/* renamed from: ce1.s */
public final class C0490s implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C0479p f1214d;

    public C0490s(C0479p pVar) {
        this.f1214d = pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (gy3.C87412m.m108589b(r10, r0) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r10)
            r0.add(r11)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initEdit$touchListener$1"
            java.lang.String r2 = "android/view/View$OnTouchListener"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = r9
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            ce1.p r0 = r9.f1214d
            com.tencent.mm.ui.widget.MMEditText r0 = r0.f1183e
            r1 = 0
            if (r0 == 0) goto L_0x009a
            boolean r0 = gy3.C87412m.m108589b(r10, r0)
            r2 = 0
            if (r0 != 0) goto L_0x003f
            ce1.p r0 = r9.f1214d
            com.tencent.mm.ui.widget.MMEditText r0 = r0.f1184f
            if (r0 == 0) goto L_0x0039
            boolean r10 = gy3.C87412m.m108589b(r10, r0)
            if (r10 == 0) goto L_0x008c
            goto L_0x003f
        L_0x0039:
            java.lang.String r10 = "descEdit"
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x003f:
            if (r11 == 0) goto L_0x004a
            int r10 = r11.getActionMasked()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x004b
        L_0x004a:
            r10 = r1
        L_0x004b:
            java.lang.String r11 = "scrollView"
            r0 = 1
            if (r10 != 0) goto L_0x0052
            goto L_0x0066
        L_0x0052:
            int r3 = r10.intValue()
            if (r3 != 0) goto L_0x0066
            ce1.p r10 = r9.f1214d
            android.widget.ScrollView r10 = r10.f1187i
            if (r10 == 0) goto L_0x0062
            r10.requestDisallowInterceptTouchEvent(r0)
            goto L_0x008c
        L_0x0062:
            gy3.C87412m.m108603p(r11)
            throw r1
        L_0x0066:
            r3 = 3
            if (r10 != 0) goto L_0x006a
            goto L_0x0071
        L_0x006a:
            int r4 = r10.intValue()
            if (r4 != r3) goto L_0x0071
            goto L_0x007c
        L_0x0071:
            if (r10 != 0) goto L_0x0074
            goto L_0x007b
        L_0x0074:
            int r10 = r10.intValue()
            if (r10 != r0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            if (r0 == 0) goto L_0x008c
            ce1.p r10 = r9.f1214d
            android.widget.ScrollView r10 = r10.f1187i
            if (r10 == 0) goto L_0x0088
            r10.requestDisallowInterceptTouchEvent(r2)
            goto L_0x008c
        L_0x0088:
            gy3.C87412m.m108603p(r11)
            throw r1
        L_0x008c:
            r3 = 0
            java.lang.String r5 = "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initEdit$touchListener$1"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r9
            j20.C117292a.m165362h(r3, r4, r5, r6, r7, r8)
            return r2
        L_0x009a:
            java.lang.String r10 = "nameEdit"
            gy3.C87412m.m108603p(r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ce1.C0490s.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
