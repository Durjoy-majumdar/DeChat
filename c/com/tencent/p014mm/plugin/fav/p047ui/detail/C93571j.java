package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.view.View;
import android.widget.ImageView;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.j */
public class C93571j implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C101834rc0 f270233d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f270234e;

    /* renamed from: f */
    public final /* synthetic */ int f270235f;

    /* renamed from: g */
    public final /* synthetic */ FavoriteImgDetailUI f270236g;

    public C93571j(FavoriteImgDetailUI favoriteImgDetailUI, C101834rc0 rc02, ImageView imageView, int i) {
        this.f270236g = favoriteImgDetailUI;
        this.f270233d = rc02;
        this.f270234e = imageView;
        this.f270235f = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            r8 = r18
            r0.add(r8)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$12"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r16
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            int r0 = r18.getAction()
            r9 = 0
            if (r0 == 0) goto L_0x002f
            goto L_0x018d
        L_0x002f:
            r0 = 2
            int[] r1 = new int[r0]
            r7.getLocationInWindow(r1)
            com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI r2 = r6.f270236g
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$h> r2 = r2.f270092p
            te3.rc0 r3 = r6.f270233d
            java.lang.String r3 = r3.f299280T
            java.lang.Object r2 = r2.get(r3)
            com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$h r2 = (com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteImgDetailUI.C93530h) r2
            r3 = 6
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = r1[r9]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r9] = r5
            r5 = 1
            r7 = r1[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r5] = r7
            int r7 = r2.f270125i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r0] = r7
            int r7 = r2.f270126j
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 3
            r4[r10] = r7
            float r7 = r18.getRawX()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r11 = 4
            r4[r11] = r7
            float r7 = r18.getRawY()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r12 = 5
            r4[r12] = r7
            java.lang.String r7 = "MicroMsg.FavoriteImgDetailUI"
            java.lang.String r13 = "alvinluo scanImage locationInWindow: %s, %s, imageWidth: %s, imageHeight: %s, touch: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r13, r4)
            android.widget.ImageView r4 = r6.f270234e
            float r13 = r18.getRawX()
            r14 = r1[r9]
            float r14 = (float) r14
            float r13 = r13 - r14
            int r14 = r6.f270235f
            float r14 = (float) r14
            float r13 = r13 - r14
            float r14 = r18.getRawY()
            r1 = r1[r5]
            float r1 = (float) r1
            float r14 = r14 - r1
            int r1 = r6.f270235f
            float r1 = (float) r1
            float r14 = r14 - r1
            int r1 = r2.f270125i
            int r2 = r2.f270126j
            if (r4 != 0) goto L_0x00a7
            goto L_0x013e
        L_0x00a7:
            if (r1 <= 0) goto L_0x013e
            if (r2 > 0) goto L_0x00ad
            goto L_0x013e
        L_0x00ad:
            float[] r15 = new float[r0]
            r15[r9] = r13
            r15[r5] = r14
            android.graphics.Matrix r13 = r4.getImageMatrix()
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            if (r4 == 0) goto L_0x00c2
            android.graphics.Rect r4 = r4.getBounds()
            goto L_0x00c3
        L_0x00c2:
            r4 = 0
        L_0x00c3:
            if (r4 == 0) goto L_0x00ca
            int r14 = r4.width()
            goto L_0x00cb
        L_0x00ca:
            r14 = r1
        L_0x00cb:
            if (r4 == 0) goto L_0x00d2
            int r4 = r4.height()
            goto L_0x00d3
        L_0x00d2:
            r4 = r2
        L_0x00d3:
            java.lang.String r3 = "MicroMsg.ScanViewUtils"
            if (r13 != 0) goto L_0x00d8
            goto L_0x00e9
        L_0x00d8:
            android.graphics.Matrix r12 = new android.graphics.Matrix
            r12.<init>()
            boolean r13 = r13.invert(r12)
            if (r13 != 0) goto L_0x00eb
            java.lang.String r12 = "invertMapPoint invert matrix failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r12)
        L_0x00e9:
            r12 = 0
            goto L_0x00f9
        L_0x00eb:
            float[] r13 = new float[r0]
            r12.mapPoints(r13, r15)
            android.graphics.PointF r12 = new android.graphics.PointF
            r11 = r13[r9]
            r13 = r13[r5]
            r12.<init>(r11, r13)
        L_0x00f9:
            if (r12 == 0) goto L_0x013c
            float r11 = r12.x
            float r13 = (float) r14
            float r11 = r11 / r13
            r12.x = r11
            float r11 = r12.y
            float r13 = (float) r4
            float r11 = r11 / r13
            r12.y = r11
            r11 = 7
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r13 = r15[r9]
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r11[r9] = r13
            r13 = r15[r5]
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r11[r5] = r13
            r11[r0] = r12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r11[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 4
            r11[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r1 = 5
            r11[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1 = 6
            r11[r1] = r0
            java.lang.String r0 = "alvinluo convertScreenToImageCoordinate screenCoordinate x: %s, y: %s, imageCoordinate: %s, imageWidth: %s, imageHeight: %s, show: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r11)
        L_0x013c:
            r15 = r12
            goto L_0x013f
        L_0x013e:
            r15 = 0
        L_0x013f:
            eb0.v0 r0 = eb0.C86493v0.m107224d()
            java.lang.String r1 = "basescanui@datacenter"
            eb0.v0$c r0 = r0.mo120947c(r1, r5)
            if (r15 == 0) goto L_0x0164
            float r1 = r15.x
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "key_basescanui_touch_normalize_x"
            r0.mo120962i(r2, r1)
            float r1 = r15.y
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "key_basescanui_touch_normalize_y"
            r0.mo120962i(r2, r1)
            goto L_0x018d
        L_0x0164:
            java.lang.String r1 = "alvinluo get touchCoordinate is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "key_basescanui_screen_position"
            r0.mo120962i(r2, r1)
            float r1 = r18.getRawX()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "key_basescanui_screen_x"
            r0.mo120962i(r2, r1)
            float r1 = r18.getRawY()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "key_basescanui_screen_y"
            r0.mo120962i(r2, r1)
        L_0x018d:
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$12"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r16
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.detail.C93571j.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
