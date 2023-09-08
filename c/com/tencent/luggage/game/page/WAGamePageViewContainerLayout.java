package com.tencent.luggage.game.page;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;

public class WAGamePageViewContainerLayout extends FrameLayout {

    /* renamed from: d */
    public C80208b f234758d;

    /* renamed from: e */
    public Activity f234759e;

    /* renamed from: f */
    public C80207a f234760f;

    /* renamed from: com.tencent.luggage.game.page.WAGamePageViewContainerLayout$a */
    public interface C80207a {
    }

    /* renamed from: com.tencent.luggage.game.page.WAGamePageViewContainerLayout$b */
    public enum C80208b {
        UNDEFINED,
        PORTRAIT,
        LANDSCAPE,
        PORTRAIT_REVERSE,
        LANDSCAPE_REVERSE
    }

    public WAGamePageViewContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if ((r5 == r4 || r5 == r2) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0091, code lost:
        if ((r5 == r3 || r5 == r1) != false) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            com.tencent.luggage.game.page.WAGamePageViewContainerLayout$b r1 = com.tencent.luggage.game.page.WAGamePageViewContainerLayout.C80208b.LANDSCAPE_REVERSE
            com.tencent.luggage.game.page.WAGamePageViewContainerLayout$b r2 = com.tencent.luggage.game.page.WAGamePageViewContainerLayout.C80208b.PORTRAIT_REVERSE
            com.tencent.luggage.game.page.WAGamePageViewContainerLayout$b r3 = com.tencent.luggage.game.page.WAGamePageViewContainerLayout.C80208b.LANDSCAPE
            com.tencent.luggage.game.page.WAGamePageViewContainerLayout$b r4 = com.tencent.luggage.game.page.WAGamePageViewContainerLayout.C80208b.PORTRAIT
            super.onLayout(r19, r20, r21, r22, r23)
            android.app.Activity r5 = r0.f234759e
            if (r5 == 0) goto L_0x00f8
            android.view.WindowManager r5 = r5.getWindowManager()
            android.view.Display r5 = r5.getDefaultDisplay()
            int r5 = r5.getRotation()
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0041
            if (r5 == r7) goto L_0x003f
            if (r5 == r6) goto L_0x003d
            r9 = 3
            if (r5 == r9) goto L_0x003b
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9[r8] = r5
            java.lang.String r5 = "MicroMsg.WAContainerView"
            java.lang.String r10 = "hy: invalid rotate: %d!"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r10, r9)
            com.tencent.luggage.game.page.WAGamePageViewContainerLayout$b r5 = com.tencent.luggage.game.page.WAGamePageViewContainerLayout.C80208b.UNDEFINED
            goto L_0x0042
        L_0x003b:
            r5 = r1
            goto L_0x0042
        L_0x003d:
            r5 = r2
            goto L_0x0042
        L_0x003f:
            r5 = r3
            goto L_0x0042
        L_0x0041:
            r5 = r4
        L_0x0042:
            com.tencent.luggage.game.page.WAGamePageViewContainerLayout$a r9 = r0.f234760f
            if (r9 == 0) goto L_0x00f6
            com.tencent.luggage.game.page.WAGamePageViewContainerLayout$b r10 = r0.f234758d
            com.tencent.luggage.game.page.b$f r9 = (com.tencent.luggage.game.page.C80211b.C80218f) r9
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r8] = r10
            r6[r7] = r5
            java.lang.String r11 = "Luggage.Game.WAGamePageViewRenderer"
            java.lang.String r12 = "hy: after change. old direction:%s, new direction: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r11, r12, r6)
            com.tencent.luggage.game.page.b r6 = com.tencent.luggage.game.page.C80211b.this
            r6.getClass()
            if (r10 == r4) goto L_0x0063
            if (r10 != r2) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r6 = 0
            goto L_0x0064
        L_0x0063:
            r6 = 1
        L_0x0064:
            if (r6 == 0) goto L_0x0075
            com.tencent.luggage.game.page.b r6 = com.tencent.luggage.game.page.C80211b.this
            r6.getClass()
            if (r5 == r4) goto L_0x0072
            if (r5 != r2) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r6 = 0
            goto L_0x0073
        L_0x0072:
            r6 = 1
        L_0x0073:
            if (r6 != 0) goto L_0x00f6
        L_0x0075:
            com.tencent.luggage.game.page.b r6 = com.tencent.luggage.game.page.C80211b.this
            r6.getClass()
            if (r10 == r3) goto L_0x0081
            if (r10 != r1) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r6 = 0
            goto L_0x0082
        L_0x0081:
            r6 = 1
        L_0x0082:
            if (r6 == 0) goto L_0x0094
            com.tencent.luggage.game.page.b r6 = com.tencent.luggage.game.page.C80211b.this
            r6.getClass()
            if (r5 == r3) goto L_0x0090
            if (r5 != r1) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r6 = 0
            goto L_0x0091
        L_0x0090:
            r6 = 1
        L_0x0091:
            if (r6 == 0) goto L_0x0094
            goto L_0x00f6
        L_0x0094:
            com.tencent.luggage.game.page.b r6 = com.tencent.luggage.game.page.C80211b.this
            r6.getClass()
            if (r5 == r4) goto L_0x009f
            if (r5 != r2) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r7 = 0
        L_0x009f:
            if (r7 == 0) goto L_0x00e0
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            if (r5 != r4) goto L_0x00aa
            if (r10 == r3) goto L_0x00ae
        L_0x00aa:
            if (r5 != r2) goto L_0x00b4
            if (r10 != r1) goto L_0x00b4
        L_0x00ae:
            r1 = 1119092736(0x42b40000, float:90.0)
            r6.postRotate(r1)
            goto L_0x00b9
        L_0x00b4:
            r1 = 1132920832(0x43870000, float:270.0)
            r6.postRotate(r1)
        L_0x00b9:
            com.tencent.luggage.game.page.b r1 = com.tencent.luggage.game.page.C80211b.this
            android.widget.ImageView r1 = r1.f234776q
            r1.setVisibility(r8)
            com.tencent.luggage.game.page.b r1 = com.tencent.luggage.game.page.C80211b.this
            android.widget.ImageView r2 = r1.f234776q
            android.graphics.Bitmap r11 = r1.f234774o
            r12 = 0
            r13 = 0
            int r14 = r11.getWidth()
            com.tencent.luggage.game.page.b r1 = com.tencent.luggage.game.page.C80211b.this
            android.graphics.Bitmap r1 = r1.f234774o
            int r15 = r1.getHeight()
            r17 = 1
            r16 = r6
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)
            r2.setImageBitmap(r1)
            goto L_0x00f6
        L_0x00e0:
            boolean r1 = r9.f234788a
            if (r1 == 0) goto L_0x00ed
            com.tencent.luggage.game.page.b r1 = com.tencent.luggage.game.page.C80211b.this
            com.tencent.luggage.game.page.WAGamePageViewContainerLayout r1 = r1.f234768f
            r2 = 0
            r1.setOnConfigurationChangedListener(r2)
            goto L_0x00f6
        L_0x00ed:
            com.tencent.luggage.game.page.b r1 = com.tencent.luggage.game.page.C80211b.this
            android.widget.ImageView r2 = r1.f234776q
            android.graphics.Bitmap r1 = r1.f234774o
            r2.setImageBitmap(r1)
        L_0x00f6:
            r0.f234758d = r5
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.game.page.WAGamePageViewContainerLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void setOnConfigurationChangedListener(C80207a aVar) {
        this.f234760f = aVar;
    }

    public WAGamePageViewContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f234758d = null;
        this.f234760f = null;
        this.f234759e = AndroidContextUtil.castActivityOrNull(getContext());
    }
}
