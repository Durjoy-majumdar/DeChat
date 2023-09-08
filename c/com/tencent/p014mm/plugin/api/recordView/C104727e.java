package com.tencent.p014mm.plugin.api.recordView;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.api.recordView.e */
public class C104727e implements View.OnTouchListener {

    /* renamed from: d */
    public long f311001d = -1;

    /* renamed from: e */
    public float f311002e = -1.0f;

    /* renamed from: f */
    public int f311003f = 0;

    /* renamed from: g */
    public C104728a f311004g;

    /* renamed from: com.tencent.mm.plugin.api.recordView.e$a */
    public interface C104728a {
        /* renamed from: a */
        void mo148395a();

        /* renamed from: b */
        void mo148396b();

        /* renamed from: c */
        void mo148397c();

        /* renamed from: e */
        void mo148398e(float f, float f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            r0.add(r10)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/api/recordView/MMSightRecordViewTouchListener"
            java.lang.String r2 = "android/view/View$OnTouchListener"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = r8
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            int r9 = r10.getAction()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1
            java.lang.String r2 = "MicroMsg.MMSightRecordViewTouchListener"
            if (r9 == 0) goto L_0x00d8
            r3 = 0
            if (r9 == r1) goto L_0x00ce
            r0 = 2
            if (r9 == r0) goto L_0x0051
            r10 = 5
            if (r9 == r10) goto L_0x0045
            r10 = 6
            if (r9 == r10) goto L_0x0039
            goto L_0x0116
        L_0x0039:
            java.lang.String r9 = "ACTION_POINTER_UP"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r9)
            int r9 = r8.f311003f
            int r9 = r9 - r1
            r8.f311003f = r9
            goto L_0x0116
        L_0x0045:
            java.lang.String r9 = "ACTION_POINTER_DOWN"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r9)
            int r9 = r8.f311003f
            int r9 = r9 + r1
            r8.f311003f = r9
            goto L_0x0116
        L_0x0051:
            int r9 = r8.f311003f
            if (r9 < r0) goto L_0x0116
            r4 = 0
            if (r9 < r0) goto L_0x0082
            float r9 = r10.getX(r3)     // Catch:{ Exception -> 0x0074 }
            float r0 = r10.getY(r3)     // Catch:{ Exception -> 0x0074 }
            float r5 = r10.getX(r1)     // Catch:{ Exception -> 0x0074 }
            float r10 = r10.getY(r1)     // Catch:{ Exception -> 0x0074 }
            float r9 = r9 - r5
            float r9 = java.lang.Math.abs(r9)     // Catch:{ Exception -> 0x0074 }
            float r0 = r0 - r10
            float r10 = java.lang.Math.abs(r0)     // Catch:{ Exception -> 0x0074 }
            float r9 = r9 + r10
            goto L_0x0083
        L_0x0074:
            r9 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r9 = r9.getMessage()
            r10[r3] = r9
            java.lang.String r9 = "pointerDistance error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r9, r10)
        L_0x0082:
            r9 = 0
        L_0x0083:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r10[r3] = r0
            java.lang.String r0 = "distance: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r0, r10)
            int r10 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0116
            float r10 = r8.f311002e
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x009e
            r8.f311002e = r9
            goto L_0x0116
        L_0x009e:
            float r10 = r9 - r10
            float r10 = java.lang.Math.abs(r10)
            r0 = 1097859072(0x41700000, float:15.0)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0116
            float r10 = r8.f311002e
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x00be
            java.lang.String r10 = "zoom out"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r10)
            com.tencent.mm.plugin.api.recordView.e$a r10 = r8.f311004g
            if (r10 == 0) goto L_0x00cb
            r10.mo148395a()
            goto L_0x00cb
        L_0x00be:
            java.lang.String r10 = "zoom in"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r10)
            com.tencent.mm.plugin.api.recordView.e$a r10 = r8.f311004g
            if (r10 == 0) goto L_0x00cb
            r10.mo148396b()
        L_0x00cb:
            r8.f311002e = r9
            goto L_0x0116
        L_0x00ce:
            java.lang.String r9 = "ACTION_UP"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r9)
            r8.f311002e = r0
            r8.f311003f = r3
            goto L_0x0116
        L_0x00d8:
            java.lang.String r9 = "ACTION_DOWN"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r9)
            long r2 = r8.f311001d
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x00fa
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r8.f311001d
            long r2 = r2 - r4
            r4 = 400(0x190, double:1.976E-321)
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x00fa
            com.tencent.mm.plugin.api.recordView.e$a r9 = r8.f311004g
            if (r9 == 0) goto L_0x0109
            r9.mo148397c()
            goto L_0x0109
        L_0x00fa:
            com.tencent.mm.plugin.api.recordView.e$a r9 = r8.f311004g
            if (r9 == 0) goto L_0x0109
            float r2 = r10.getX()
            float r10 = r10.getY()
            r9.mo148398e(r2, r10)
        L_0x0109:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r8.f311001d = r9
            r8.f311002e = r0
            int r9 = r8.f311003f
            int r9 = r9 + r1
            r8.f311003f = r9
        L_0x0116:
            r2 = 1
            java.lang.String r4 = "com/tencent/mm/plugin/api/recordView/MMSightRecordViewTouchListener"
            java.lang.String r5 = "android/view/View$OnTouchListener"
            java.lang.String r6 = "onTouch"
            java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = r8
            j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.api.recordView.C104727e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
