package qj1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.u9 */
public final class C63029u9 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62993t9 f178877d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63029u9(C62993t9 t9Var) {
        super(0);
        this.f178877d = t9Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0081 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0190 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r11 = this;
            qj1.t9 r0 = r11.f178877d
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r0 = r0.f178740p
            int r0 = r0.getChildCount()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000b:
            java.lang.String r4 = "container.getChildAt(index)"
            if (r2 >= r0) goto L_0x0025
            qj1.t9 r5 = r11.f178877d
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r5 = r5.f178740p
            android.view.View r5 = r5.getChildAt(r2)
            gy3.C87412m.m108593f(r5, r4)
            int r4 = r5.getVisibility()
            if (r4 != 0) goto L_0x0022
            int r3 = r3 + 1
        L_0x0022:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x0025:
            qj1.t9 r0 = r11.f178877d
            int r2 = r0.f178742r
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 >= r6) goto L_0x0084
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            int r2 = r2.getOrientation()
            if (r2 == 0) goto L_0x0193
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            r2.setOrientation(r1)
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            r2.mo77558c()
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            r2.setIsNeedAnimateShow(r7)
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            int r2 = r2.getChildCount()
            r3 = 0
        L_0x004c:
            if (r3 >= r2) goto L_0x0193
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r8 = r0.f178740p
            android.view.View r8 = r8.getChildAt(r3)
            gy3.C87412m.m108593f(r8, r4)
            int r9 = r8.getVisibility()
            if (r9 != 0) goto L_0x0081
            boolean r9 = r8 instanceof com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout
            if (r9 == 0) goto L_0x0065
            r10 = r8
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r10 = (com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout) r10
            goto L_0x0066
        L_0x0065:
            r10 = r5
        L_0x0066:
            if (r10 == 0) goto L_0x0073
            int r10 = r10.f159272i
            if (r10 != r6) goto L_0x006e
            r10 = 1
            goto L_0x006f
        L_0x006e:
            r10 = 0
        L_0x006f:
            if (r10 != 0) goto L_0x0073
            r10 = 1
            goto L_0x0074
        L_0x0073:
            r10 = 0
        L_0x0074:
            if (r10 == 0) goto L_0x0081
            if (r9 == 0) goto L_0x007b
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r8 = (com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout) r8
            goto L_0x007c
        L_0x007b:
            r8 = r5
        L_0x007c:
            if (r8 == 0) goto L_0x0081
            r8.mo77544e()
        L_0x0081:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x0084:
            r8 = 3
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r3 >= r8) goto L_0x00a3
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            float r2 = r2.getScaleX()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0095
            r2 = 1
            goto L_0x0096
        L_0x0095:
            r2 = 0
        L_0x0096:
            if (r2 != 0) goto L_0x00fb
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            r2.setScaleX(r9)
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r0 = r0.f178740p
            r0.setScaleY(r9)
            goto L_0x00fb
        L_0x00a3:
            r3 = 4
            if (r2 < r3) goto L_0x00e0
            java.lang.Class<cl1.d0> r2 = cl1.C54963d0.class
            androidx.lifecycle.i0 r0 = r0.mo87696x0(r2)
            cl1.d0 r0 = (cl1.C54963d0) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r0 = r0.f154077t
            java.lang.Object r0 = r0.getValue()
            gi1.c r0 = (gi1.C59464c) r0
            if (r0 == 0) goto L_0x00be
            int r0 = r0.f169898c
            if (r0 != r7) goto L_0x00be
            r0 = 1
            goto L_0x00bf
        L_0x00be:
            r0 = 0
        L_0x00bf:
            if (r0 != 0) goto L_0x00e0
            qj1.t9 r0 = r11.f178877d
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            float r2 = r2.getScaleX()
            r3 = 1058642330(0x3f19999a, float:0.6)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x00d2
            r2 = 1
            goto L_0x00d3
        L_0x00d2:
            r2 = 0
        L_0x00d3:
            if (r2 != 0) goto L_0x00fb
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            r2.setScaleX(r3)
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r0 = r0.f178740p
            r0.setScaleY(r3)
            goto L_0x00fb
        L_0x00e0:
            qj1.t9 r0 = r11.f178877d
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            float r2 = r2.getScaleX()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x00ee
            r2 = 1
            goto L_0x00ef
        L_0x00ee:
            r2 = 0
        L_0x00ef:
            if (r2 != 0) goto L_0x00fb
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            r2.setScaleX(r9)
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r0 = r0.f178740p
            r0.setScaleY(r9)
        L_0x00fb:
            qj1.t9 r0 = r11.f178877d
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            int r2 = r2.getOrientation()
            if (r2 == r7) goto L_0x0193
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            r2.setOrientation(r7)
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            r2.mo77558c()
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            r2.setIsNeedAnimateShow(r1)
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            a14.z1 r3 = r2.f159285g
            if (r3 == 0) goto L_0x011d
            a14.C53973z1.C53974a.m60623a(r3, r5, r7, r5)
        L_0x011d:
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout> r3 = r2.f159282d
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0136
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout> r3 = r2.f159282d
            java.lang.Object r3 = r3.pop()
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r3 = (com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout) r3
            if (r3 == 0) goto L_0x011d
            r3.mo77543d()
            r2.mo77559d(r1, r3)
            goto L_0x011d
        L_0x0136:
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout> r3 = r2.f159283e
            java.util.Iterator r3 = r3.iterator()
        L_0x013c:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x014f
            java.lang.Object r8 = r3.next()
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r8 = (com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout) r8
            r8.mo77543d()
            r2.mo77559d(r1, r8)
            goto L_0x013c
        L_0x014f:
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout> r2 = r2.f159283e
            r2.clear()
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r2 = r0.f178740p
            int r2 = r2.getChildCount()
            r3 = 0
        L_0x015b:
            if (r3 >= r2) goto L_0x0193
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r8 = r0.f178740p
            android.view.View r8 = r8.getChildAt(r3)
            gy3.C87412m.m108593f(r8, r4)
            int r9 = r8.getVisibility()
            if (r9 != 0) goto L_0x0190
            boolean r9 = r8 instanceof com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout
            if (r9 == 0) goto L_0x0174
            r10 = r8
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r10 = (com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout) r10
            goto L_0x0175
        L_0x0174:
            r10 = r5
        L_0x0175:
            if (r10 == 0) goto L_0x0182
            int r10 = r10.f159272i
            if (r10 != r6) goto L_0x017d
            r10 = 1
            goto L_0x017e
        L_0x017d:
            r10 = 0
        L_0x017e:
            if (r10 != r7) goto L_0x0182
            r10 = 1
            goto L_0x0183
        L_0x0182:
            r10 = 0
        L_0x0183:
            if (r10 == 0) goto L_0x0190
            if (r9 == 0) goto L_0x018a
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r8 = (com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout) r8
            goto L_0x018b
        L_0x018a:
            r8 = r5
        L_0x018b:
            if (r8 == 0) goto L_0x0190
            r8.mo77543d()
        L_0x0190:
            int r3 = r3 + 1
            goto L_0x015b
        L_0x0193:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63029u9.invoke():java.lang.Object");
    }
}
