package androidx.compose.p002ui.platform;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.o */
public final class C103670o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C103690u1 f306228d;

    /* renamed from: e */
    public final /* synthetic */ C103662m f306229e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103670o(C103690u1 u1Var, C103662m mVar) {
        super(0);
        this.f306228d = u1Var;
        this.f306229e = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r0 == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r14 = this;
            androidx.compose.ui.platform.u1 r0 = r14.f306228d
            u1.i r1 = r0.f306265h
            u1.i r2 = r0.f306266i
            java.lang.Float r3 = r0.f306263f
            java.lang.Float r0 = r0.f306264g
            r4 = 0
            if (r1 == 0) goto L_0x0021
            if (r3 == 0) goto L_0x0021
            fy3.a<java.lang.Float> r5 = r1.f332605a
            java.lang.Object r5 = r5.invoke()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r3 = r3.floatValue()
            float r5 = r5 - r3
            goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            if (r2 == 0) goto L_0x0038
            if (r0 == 0) goto L_0x0038
            fy3.a<java.lang.Float> r3 = r2.f332605a
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r0 = r0.floatValue()
            float r3 = r3 - r0
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            r0 = 0
            r6 = 1
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0041
            r7 = 1
            goto L_0x0042
        L_0x0041:
            r7 = 0
        L_0x0042:
            if (r7 == 0) goto L_0x004b
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0049
            r0 = 1
        L_0x0049:
            if (r0 != 0) goto L_0x00c1
        L_0x004b:
            androidx.compose.ui.platform.m r0 = r14.f306229e
            androidx.compose.ui.platform.u1 r4 = r14.f306228d
            int r4 = r4.f306261d
            int r0 = r0.mo144787p(r4)
            androidx.compose.ui.platform.m r7 = r14.f306229e
            r9 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r11 = 0
            r12 = 8
            r13 = 0
            r8 = r0
            androidx.compose.p002ui.platform.C103662m.m137847s(r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.ui.platform.m r4 = r14.f306229e
            r6 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r0 = r4.mo144777c(r0, r6)
            if (r1 == 0) goto L_0x008f
            fy3.a<java.lang.Float> r4 = r1.f332605a
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r0.setScrollX(r4)
            fy3.a<java.lang.Float> r4 = r1.f332606b
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r0.setMaxScrollX(r4)
        L_0x008f:
            if (r2 == 0) goto L_0x00b1
            fy3.a<java.lang.Float> r4 = r2.f332605a
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r0.setScrollY(r4)
            fy3.a<java.lang.Float> r4 = r2.f332606b
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r0.setMaxScrollY(r4)
        L_0x00b1:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r4 < r6) goto L_0x00bc
            int r4 = (int) r5
            int r3 = (int) r3
            androidx.compose.p002ui.platform.m$$d.m137869a(r0, r4, r3)
        L_0x00bc:
            androidx.compose.ui.platform.m r3 = r14.f306229e
            r3.mo144788q(r0)
        L_0x00c1:
            if (r1 == 0) goto L_0x00cf
            androidx.compose.ui.platform.u1 r0 = r14.f306228d
            fy3.a<java.lang.Float> r1 = r1.f332605a
            java.lang.Object r1 = r1.invoke()
            java.lang.Float r1 = (java.lang.Float) r1
            r0.f306263f = r1
        L_0x00cf:
            if (r2 == 0) goto L_0x00dd
            androidx.compose.ui.platform.u1 r0 = r14.f306228d
            fy3.a<java.lang.Float> r1 = r2.f332605a
            java.lang.Object r1 = r1.invoke()
            java.lang.Float r1 = (java.lang.Float) r1
            r0.f306264g = r1
        L_0x00dd:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C103670o.invoke():java.lang.Object");
    }
}
