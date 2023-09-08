package qj1;

import android.view.View;

/* renamed from: qj1.v4 */
public final class C12705v4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12669t4 f36401d;

    /* renamed from: e */
    public final /* synthetic */ View f36402e;

    public C12705v4(C12669t4 t4Var, View view) {
        this.f36401d = t4Var;
        this.f36402e = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0043, code lost:
        r3 = r3.getLayoutParams();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            qj1.t4 r0 = r4.f36401d
            qj1.C12669t4.m12161Z0(r0)
            android.view.View r0 = r4.f36402e
            int r0 = r0.getMeasuredWidth()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            android.view.View r0 = r4.f36402e
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x0091
        L_0x0016:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "showFinishBg but costInnerContainer size:"
            r0.append(r2)
            android.view.View r2 = r4.f36402e
            int r2 = r2.getMeasuredWidth()
            r0.append(r2)
            r2 = 45
            r0.append(r2)
            android.view.View r3 = r4.f36402e
            int r3 = r3.getMeasuredHeight()
            r0.append(r3)
            java.lang.String r3 = ",freeTimeOverPag:"
            r0.append(r3)
            qj1.t4 r3 = r4.f36401d
            org.libpag.PAGView r3 = r3.f36281E
            if (r3 == 0) goto L_0x0050
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x0050
            int r3 = r3.width
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0051
        L_0x0050:
            r3 = r1
        L_0x0051:
            r0.append(r3)
            r0.append(r2)
            qj1.t4 r2 = r4.f36401d
            org.libpag.PAGView r2 = r2.f36281E
            if (r2 == 0) goto L_0x006a
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L_0x006a
            int r2 = r2.height
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x006b
        L_0x006a:
            r2 = r1
        L_0x006b:
            r0.append(r2)
            r2 = 33
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FinderLiveChargePayLazyPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            android.view.View r0 = r4.f36402e
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            qj1.t4 r2 = r4.f36401d
            rx3.g r2 = r2.f36283G
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            qj1.n4 r2 = (qj1.C12541n4) r2
            r0.addOnGlobalLayoutListener(r2)
        L_0x0091:
            android.view.View r0 = r4.f36402e
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L_0x009d
            qj1.t4 r2 = r4.f36401d
            r2.f36282F = r0
        L_0x009d:
            android.view.View r0 = r4.f36402e
            r0.setBackground(r1)
            qj1.t4 r0 = r4.f36401d
            org.libpag.PAGView r0 = r0.f36281E
            if (r0 != 0) goto L_0x00a9
            goto L_0x00ad
        L_0x00a9:
            r1 = 0
            r0.setVisibility(r1)
        L_0x00ad:
            qj1.t4 r0 = r4.f36401d
            org.libpag.PAGView r0 = r0.f36281E
            if (r0 == 0) goto L_0x00b6
            r0.play()
        L_0x00b6:
            qj1.t4 r0 = r4.f36401d
            org.libpag.PAGView r0 = r0.f36281E
            if (r0 != 0) goto L_0x00bd
            goto L_0x00c1
        L_0x00bd:
            r1 = 0
            r0.setAlpha(r1)
        L_0x00c1:
            qj1.t4 r0 = r4.f36401d
            org.libpag.PAGView r0 = r0.f36281E
            if (r0 == 0) goto L_0x00d8
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L_0x00d8
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            if (r0 == 0) goto L_0x00d8
            r0.start()
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12705v4.run():void");
    }
}
