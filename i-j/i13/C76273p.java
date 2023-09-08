package i13;

import android.support.design.widget.MMBottomSheetBehavior;

/* renamed from: i13.p */
public final class C76273p implements MMBottomSheetBehavior.C67072d {

    /* renamed from: a */
    public float f223460a;

    /* renamed from: b */
    public final /* synthetic */ C76259g f223461b;

    public C76273p(C76259g gVar) {
        this.f223461b = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo91079a(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r10, r0)
            i13.g r0 = r9.f223461b
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r0.f223411Q
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0024
            com.tencent.mm.ui.widget.MMEditText r0 = r0.f223426n
            gy3.C87412m.m108591d(r0)
            float r4 = r10.getX()
            int r4 = (int) r4
            float r5 = r10.getY()
            int r5 = (int) r5
            boolean r0 = r1.mo144909q(r0, r4, r5)
            if (r3 != r0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x00d3
            i13.g r0 = r9.f223461b
            com.tencent.mm.ui.widget.MMEditText r0 = r0.f223426n
            r1 = 0
            if (r0 == 0) goto L_0x0038
            r4 = -1
            boolean r0 = r0.canScrollVertically(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            i13.g r4 = r9.f223461b
            com.tencent.mm.ui.widget.MMEditText r4 = r4.f223426n
            if (r4 == 0) goto L_0x0047
            boolean r1 = r4.canScrollVertically(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x0047:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r0
            java.lang.String r5 = "MicroMsg.TransVoiceDialog"
            java.lang.String r6 = "can scroll up, %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r1
            java.lang.String r6 = "can scroll down, %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r4)
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r6 = r10.getAction()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r2] = r6
            float r6 = r10.getX()
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r4[r3] = r6
            float r6 = r10.getY()
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r7 = 2
            r4[r7] = r6
            r6 = 3
            float r8 = r10.getRawX()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r4[r6] = r8
            r6 = 4
            float r8 = r10.getRawY()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r4[r6] = r8
            java.lang.String r6 = "action: %d, x: %f, y: %f, rawX: %f, rawY: %f."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r4)
            int r4 = r10.getAction()
            if (r4 == 0) goto L_0x00cd
            if (r4 == r7) goto L_0x00a1
            goto L_0x00d3
        L_0x00a1:
            float r10 = r10.getY()
            float r4 = r9.f223460a
            float r10 = r10 - r4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Float r4 = java.lang.Float.valueOf(r10)
            r3[r2] = r4
            java.lang.String r4 = "yOffset: %f."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r4, r3)
            r3 = 0
            int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c2
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r10 = gy3.C87412m.m108589b(r10, r0)
            return r10
        L_0x00c2:
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d3
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r10 = gy3.C87412m.m108589b(r10, r1)
            return r10
        L_0x00cd:
            float r10 = r10.getY()
            r9.f223460a = r10
        L_0x00d3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i13.C76273p.mo91079a(android.view.MotionEvent):boolean");
    }
}
