package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.o0 */
public class C115569o0 implements View.OnTouchListener {

    /* renamed from: d */
    public float f346625d;

    /* renamed from: e */
    public short f346626e = 0;

    /* renamed from: f */
    public final /* synthetic */ C115538c0 f346627f;

    public C115569o0(C115538c0 c0Var) {
        this.f346627f = c0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00df, code lost:
        if (r8.f346626e == -1) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            r0.add(r10)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$7"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r8
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            boolean r1 = r0.f346504J
            if (r1 == 0) goto L_0x0027
            com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0.m162437p(r0)
        L_0x0027:
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            boolean r0 = r0.f346510Q
            r6 = 1
            if (r0 != 0) goto L_0x003c
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$7"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r8
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x003c:
            int r0 = r10.getAction()
            java.lang.String r1 = "MicroMsg.MMPoiMapUI"
            r7 = 0
            if (r0 == 0) goto L_0x014e
            if (r0 == r6) goto L_0x0144
            r2 = 2
            if (r0 == r2) goto L_0x004c
            goto L_0x0169
        L_0x004c:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            float r2 = r10.getRawY()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0[r7] = r2
            java.lang.String r2 = "newpoi action move %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r0)
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            boolean r0 = r0.f346512R
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "newpoi blocked."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            com.tencent.mm.ui.base.MMLoadMoreListView r0 = r0.f346545o
            r0.setSelection(r7)
        L_0x006f:
            float r0 = r8.f346625d
            float r2 = r10.getRawY()
            float r0 = r0 - r2
            float r2 = java.lang.Math.abs(r0)
            com.tencent.mm.plugin.location.ui.impl.c0 r3 = r8.f346627f
            android.app.Activity r3 = r3.f346582d
            r4 = 1101004800(0x41a00000, float:20.0)
            int r3 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r3, r4)
            float r3 = (float) r3
            r4 = -1
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x008d
            r8.f346626e = r7
            goto L_0x0097
        L_0x008d:
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            r8.f346626e = r6
            goto L_0x0097
        L_0x0095:
            r8.f346626e = r4
        L_0x0097:
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            int r2 = r0.mo175579u()
            int r0 = r0.f346508N
            if (r2 > r0) goto L_0x00a3
            r0 = 1
            goto L_0x00a4
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            if (r0 == 0) goto L_0x00aa
            short r0 = r8.f346626e
            if (r0 == r6) goto L_0x00e1
        L_0x00aa:
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            int r2 = r0.mo175579u()
            int r0 = r0.f346507M
            if (r2 < r0) goto L_0x00b6
            r0 = 1
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            if (r0 == 0) goto L_0x00bd
            short r0 = r8.f346626e
            if (r0 == r4) goto L_0x00e1
        L_0x00bd:
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            int r2 = r0.mo175579u()
            int r0 = r0.f346508N
            if (r2 > r0) goto L_0x00c9
            r0 = 1
            goto L_0x00ca
        L_0x00c9:
            r0 = 0
        L_0x00ca:
            if (r0 == 0) goto L_0x00ef
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            boolean r2 = r0.f346504J
            if (r2 == 0) goto L_0x00d5
            com.tencent.mm.ui.base.MMLoadMoreListView r0 = r0.f346546p
            goto L_0x00d7
        L_0x00d5:
            com.tencent.mm.ui.base.MMLoadMoreListView r0 = r0.f346545o
        L_0x00d7:
            boolean r0 = r0.getScroll2Top()
            if (r0 != 0) goto L_0x00ef
            short r0 = r8.f346626e
            if (r0 != r4) goto L_0x00ef
        L_0x00e1:
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$7"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r8
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r7
        L_0x00ef:
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            boolean r0 = r0.f346510Q
            if (r0 == 0) goto L_0x0136
            short r0 = r8.f346626e
            if (r0 == 0) goto L_0x0136
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r2[r7] = r0
            java.lang.String r0 = "newpoi start play isUP %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r0, r2)
            short r0 = r8.f346626e
            if (r0 != r6) goto L_0x0121
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            r0.f346542k1 = r6
            com.tencent.mm.plugin.location.ui.impl.c0$i r1 = com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0.C115548i.OPENED
            r0.mo175583y(r1)
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$7"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r8
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r7
        L_0x0121:
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            com.tencent.mm.plugin.location.ui.impl.c0$i r1 = com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0.C115548i.COLLAPSED
            r0.mo175583y(r1)
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$7"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r8
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r7
        L_0x0136:
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$7"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r8
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0144:
            java.lang.String r0 = "newpoi action up "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            r0.f346512R = r7
            goto L_0x0169
        L_0x014e:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            float r2 = r10.getRawY()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0[r7] = r2
            java.lang.String r2 = "newpoi action down %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r0)
            float r0 = r10.getRawY()
            r8.f346625d = r0
            com.tencent.mm.plugin.location.ui.impl.c0 r0 = r8.f346627f
            r0.f346512R = r7
        L_0x0169:
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$7"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r8
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.impl.C115569o0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
