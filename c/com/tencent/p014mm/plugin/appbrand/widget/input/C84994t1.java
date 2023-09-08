package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t1 */
public class C84994t1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C84957h f247690d;

    /* renamed from: e */
    public final /* synthetic */ C84971n1 f247691e;

    public C84994t1(C84981s1 s1Var, C84957h hVar, C84971n1 n1Var) {
        this.f247690d = hVar;
        this.f247691e = n1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
        /*
            r16 = this;
            r6 = r16
            r7 = r18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r17
            r0.add(r1)
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/appbrand/widget/input/NativeWidgetContainerWithInputDuplicateTouch$2"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r16
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            int r0 = r18.getAction()
            if (r0 == 0) goto L_0x0031
            com.tencent.mm.plugin.appbrand.widget.input.h r0 = r6.f247690d
            sn0.C90259e.m112994b(r0, r7)
        L_0x0031:
            com.tencent.mm.plugin.appbrand.widget.input.n1 r0 = r6.f247691e
            com.tencent.mm.plugin.appbrand.widget.input.h r1 = r0.f247633a
            ct0.e r1 = r1.f247610e
            android.view.ViewGroup r2 = r1.f250653a
            boolean r2 = r2.onFilterTouchEventForSecurity(r7)
            r3 = 3
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x00db
            int r2 = r18.getActionMasked()
            if (r2 != 0) goto L_0x0050
            ct0.b r2 = new ct0.b
            android.view.ViewGroup r4 = r1.f250653a
            r2.<init>(r4)
            goto L_0x0056
        L_0x0050:
            java.util.LinkedList<android.view.View> r2 = r1.f250654b
            java.util.Iterator r2 = r2.iterator()
        L_0x0056:
            int r4 = r18.getActionMasked()
            r5 = 0
            if (r4 != 0) goto L_0x006d
            ct0.e$b r4 = new ct0.e$b
            long r11 = r18.getDownTime()
            long r13 = r18.getEventTime()
            r15 = 0
            r10 = r4
            r10.<init>(r11, r13, r15)
            goto L_0x006e
        L_0x006d:
            r4 = r5
        L_0x006e:
            r1.f250655c = r4
            r4 = 0
        L_0x0071:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x00cc
            java.lang.Object r10 = r2.next()
            android.view.View r10 = (android.view.View) r10
            int r11 = r18.getActionIndex()
            android.view.ViewGroup r12 = r1.f250653a
            boolean r12 = r12.isMotionEventSplittingEnabled()
            if (r12 == 0) goto L_0x0090
            int r12 = r7.getPointerId(r11)
            int r12 = r8 << r12
            goto L_0x0091
        L_0x0090:
            r12 = -1
        L_0x0091:
            float r13 = r7.getX(r11)
            float r11 = r7.getY(r11)
            int r14 = r18.getActionMasked()
            if (r14 != 0) goto L_0x00c4
            boolean r14 = com.tencent.p014mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat.m104661a(r10)
            if (r14 == 0) goto L_0x0071
            android.view.ViewGroup r14 = r1.f250653a
            boolean r11 = com.tencent.p014mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat.m104662b(r14, r13, r11, r10, r5)
            if (r11 != 0) goto L_0x00ae
            goto L_0x0071
        L_0x00ae:
            boolean r11 = com.tencent.p014mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat.m104664d(r10)
            if (r11 == 0) goto L_0x0071
            android.view.ViewGroup r11 = r1.f250653a
            boolean r11 = com.tencent.p014mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat.dispatchTransformedTouchEvent(r11, r7, r9, r10, r12)
            if (r11 == 0) goto L_0x0071
            java.util.LinkedList<android.view.View> r11 = r1.f250654b
            r11.addLast(r10)
            r4 = r4 | 1
            goto L_0x0071
        L_0x00c4:
            android.view.ViewGroup r11 = r1.f250653a
            boolean r10 = com.tencent.p014mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat.dispatchTransformedTouchEvent(r11, r7, r9, r10, r12)
            r4 = r4 | r10
            goto L_0x0071
        L_0x00cc:
            int r2 = r18.getActionMasked()
            if (r2 == r8) goto L_0x00d5
            if (r2 == r3) goto L_0x00d5
            goto L_0x00dc
        L_0x00d5:
            java.util.LinkedList<android.view.View> r1 = r1.f250654b
            r1.clear()
            goto L_0x00dc
        L_0x00db:
            r4 = 0
        L_0x00dc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[textscroll] handled | "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.InputTouchDuplicateDispatcher"
            ct0.C86128a.m106644c(r2, r1, r7)
            r1 = 2
            int r2 = r18.getActionMasked()
            if (r1 != r2) goto L_0x0123
            if (r4 == 0) goto L_0x0118
            boolean r1 = r0.f247634b
            if (r1 != 0) goto L_0x0118
            com.tencent.mm.plugin.appbrand.widget.input.n1$c<android.view.ViewGroup, com.tencent.mm.plugin.appbrand.page.b2> r1 = r0.f247637e
            com.tencent.mm.plugin.appbrand.widget.input.h r2 = r0.f247633a
            android.view.View r1 = r1.mo117855a(r2)
            com.tencent.mm.plugin.appbrand.page.b2 r1 = (com.tencent.p014mm.plugin.appbrand.page.C83763b2) r1
            if (r1 == 0) goto L_0x0118
            boolean r2 = r1.f244482h
            r2 = r2 ^ r8
            r0.f247635c = r2
            r1.setPullDownEnabled(r9)
            r1.requestDisallowInterceptTouchEvent(r8)
            r0.f247634b = r8
        L_0x0118:
            if (r4 == 0) goto L_0x011d
            r0.f247636d = r8
            goto L_0x0123
        L_0x011d:
            boolean r1 = r0.f247636d
            if (r1 == 0) goto L_0x0123
            r0.f247636d = r9
        L_0x0123:
            int r1 = r18.getActionMasked()
            if (r1 == 0) goto L_0x0145
            if (r1 == r8) goto L_0x012e
            if (r1 == r3) goto L_0x012e
            goto L_0x0146
        L_0x012e:
            boolean r1 = r0.f247634b
            if (r1 == 0) goto L_0x0145
            com.tencent.mm.plugin.appbrand.widget.input.n1$c<android.view.ViewGroup, com.tencent.mm.plugin.appbrand.page.b2> r1 = r0.f247637e
            com.tencent.mm.plugin.appbrand.widget.input.h r2 = r0.f247633a
            android.view.View r1 = r1.mo117855a(r2)
            com.tencent.mm.plugin.appbrand.page.b2 r1 = (com.tencent.p014mm.plugin.appbrand.page.C83763b2) r1
            if (r1 == 0) goto L_0x0143
            boolean r2 = r0.f247635c
            r1.setPullDownEnabled(r2)
        L_0x0143:
            r0.f247634b = r9
        L_0x0145:
            r4 = 0
        L_0x0146:
            if (r4 == 0) goto L_0x0158
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/plugin/appbrand/widget/input/NativeWidgetContainerWithInputDuplicateTouch$2"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r16
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x0158:
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/appbrand/widget/input/NativeWidgetContainerWithInputDuplicateTouch$2"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r16
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.input.C84994t1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
