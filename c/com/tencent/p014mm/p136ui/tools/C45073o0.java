package com.tencent.p014mm.p136ui.tools;

import android.view.GestureDetector;
import android.view.View;
import com.tencent.p014mm.p136ui.tools.C45059m0;

/* renamed from: com.tencent.mm.ui.tools.o0 */
public class C45073o0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ GestureDetector f122259d;

    /* renamed from: e */
    public final /* synthetic */ View f122260e;

    /* renamed from: f */
    public final /* synthetic */ View f122261f;

    /* renamed from: g */
    public final /* synthetic */ View f122262g;

    /* renamed from: h */
    public final /* synthetic */ C45059m0.C45068i f122263h;

    /* renamed from: i */
    public final /* synthetic */ C45059m0 f122264i;

    public C45073o0(C45059m0 m0Var, GestureDetector gestureDetector, View view, View view2, View view3, C45059m0.C45068i iVar) {
        this.f122264i = m0Var;
        this.f122259d = gestureDetector;
        this.f122260e = view;
        this.f122261f = view2;
        this.f122262g = view3;
        this.f122263h = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0156  */
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
            java.lang.String r0 = "com/tencent/mm/ui/tools/ImagePreviewAnimation$8"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r16
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            android.view.GestureDetector r0 = r6.f122259d
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r7)
            java.lang.Object[] r9 = r1.mo10232b()
            java.lang.String r10 = "com/tencent/mm/ui/tools/ImagePreviewAnimation$8"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/GestureDetector_EXEC_"
            java.lang.String r14 = "onTouchEvent"
            java.lang.String r15 = "(Landroid/view/MotionEvent;)Z"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r5 = 0
            java.lang.Object r1 = r1.mo10231a(r5)
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r9 = r0.onTouchEvent(r1)
            java.lang.String r10 = "com/tencent/mm/ui/tools/ImagePreviewAnimation$8"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/GestureDetector_EXEC_"
            java.lang.String r14 = "onTouchEvent"
            java.lang.String r15 = "(Landroid/view/MotionEvent;)Z"
            j20.C117292a.m165360f(r8, r9, r10, r11, r12, r13, r14, r15)
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            android.view.VelocityTracker r1 = r0.f122216D
            if (r1 != 0) goto L_0x0069
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.f122216D = r1
        L_0x0069:
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            android.view.VelocityTracker r0 = r0.f122216D
            r0.addMovement(r7)
            int r0 = r18.getAction()
            if (r0 != 0) goto L_0x0086
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            float r1 = r18.getX()
            r0.f122245y = r1
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            float r1 = r18.getY()
            r0.f122246z = r1
        L_0x0086:
            int r0 = r18.getAction()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x00c7
            com.tencent.mm.ui.tools.m0 r8 = r6.f122264i
            boolean r0 = r8.f122214B
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r8.f122213A
            if (r0 == 0) goto L_0x00a8
            r9 = 0
            r10 = 0
            android.view.View r11 = r6.f122260e
            android.view.View r12 = r6.f122261f
            android.view.View r13 = r6.f122262g
            com.tencent.p014mm.p136ui.tools.C45059m0.m49910a(r8, r9, r10, r11, r12, r13)
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            r0.f122213A = r5
            goto L_0x00c3
        L_0x00a8:
            boolean r0 = r8.f122213A
            if (r0 == 0) goto L_0x00c3
            com.tencent.mm.ui.tools.m0$h r0 = r8.f122220H
            if (r0 == 0) goto L_0x00b4
            r0.mo68703o0()
            goto L_0x00bd
        L_0x00b4:
            android.view.View r0 = r6.f122260e
            android.view.View r3 = r6.f122261f
            com.tencent.mm.ui.tools.m0$i r4 = r6.f122263h
            r8.mo70409d(r0, r3, r4, r1)
        L_0x00bd:
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            r0.f122213A = r5
            r0.f122214B = r5
        L_0x00c3:
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            r0.f122215C = r5
        L_0x00c7:
            int r0 = r18.getAction()
            r3 = 2
            if (r0 != r3) goto L_0x015e
            int r0 = r18.getPointerCount()
            if (r0 != r3) goto L_0x00e5
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/ui/tools/ImagePreviewAnimation$8"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r16
            r8 = 0
            r5 = r7
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x00e5:
            r8 = 0
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            android.view.VelocityTracker r0 = r0.f122216D
            r3 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r3)
            float r3 = r0.getXVelocity()
            int r3 = (int) r3
            float r0 = r0.getYVelocity()
            int r0 = (int) r0
            float r4 = r18.getX()
            com.tencent.mm.ui.tools.m0 r5 = r6.f122264i
            float r5 = r5.f122245y
            float r10 = r4 - r5
            float r4 = r18.getY()
            com.tencent.mm.ui.tools.m0 r5 = r6.f122264i
            float r5 = r5.f122246z
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r10)
            r7 = 1132068864(0x437a0000, float:250.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0128
            int r5 = java.lang.Math.abs(r0)
            int r3 = java.lang.Math.abs(r3)
            if (r5 <= r3) goto L_0x0128
            if (r0 <= 0) goto L_0x0128
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            boolean r0 = r0.f122215C
            if (r0 == 0) goto L_0x012e
        L_0x0128:
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            boolean r3 = r0.f122213A
            if (r3 == 0) goto L_0x013f
        L_0x012e:
            com.tencent.mm.ui.tools.m0 r9 = r6.f122264i
            android.view.View r12 = r6.f122260e
            android.view.View r13 = r6.f122261f
            android.view.View r14 = r6.f122262g
            r11 = r4
            com.tencent.p014mm.p136ui.tools.C45059m0.m49910a(r9, r10, r11, r12, r13, r14)
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            r0.f122213A = r2
            goto L_0x0141
        L_0x013f:
            r0.f122213A = r8
        L_0x0141:
            r0 = 1128792064(0x43480000, float:200.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x014c
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            r0.f122214B = r8
            goto L_0x0150
        L_0x014c:
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            r0.f122214B = r2
        L_0x0150:
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            android.view.VelocityTracker r0 = r0.f122216D
            if (r0 == 0) goto L_0x015f
            r0.recycle()
            com.tencent.mm.ui.tools.m0 r0 = r6.f122264i
            r0.f122216D = r1
            goto L_0x015f
        L_0x015e:
            r8 = 0
        L_0x015f:
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/ui/tools/ImagePreviewAnimation$8"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r16
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.C45073o0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
