package com.tencent.p014mm.p136ui;

/* renamed from: com.tencent.mm.ui.i3 */
public final class C74783i3 {

    /* renamed from: com.tencent.mm.ui.i3$a */
    public static final class C6978a {

        /* renamed from: a */
        public final int f24704a;

        /* renamed from: b */
        public final int f24705b;

        public C6978a(int i, int i2) {
            this.f24704a = i;
            this.f24705b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6978a)) {
                return false;
            }
            C6978a aVar = (C6978a) obj;
            return this.f24704a == aVar.f24704a && this.f24705b == aVar.f24705b;
        }

        public int hashCode() {
            return (this.f24704a * 31) + this.f24705b;
        }

        public String toString() {
            return "Size(width=" + this.f24704a + ", height=" + this.f24705b + ')';
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r2 = (r2 = r0.getCurrentWindowMetrics()).getBounds();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.tencent.p014mm.p136ui.C74783i3.C6978a m89537a(android.content.Context r4) {
        /*
            if (r4 != 0) goto L_0x0009
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108591d(r4)
        L_0x0009:
            java.lang.String r0 = "window"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L_0x006d
            r1 = 0
            if (r0 == 0) goto L_0x0030
            android.view.WindowMetrics r2 = r0.getCurrentWindowMetrics()
            if (r2 == 0) goto L_0x0030
            android.graphics.Rect r2 = r2.getBounds()
            if (r2 == 0) goto L_0x0030
            int r2 = r2.width()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0031
        L_0x0030:
            r2 = r1
        L_0x0031:
            if (r0 == 0) goto L_0x0047
            android.view.WindowMetrics r3 = r0.getCurrentWindowMetrics()
            if (r3 == 0) goto L_0x0047
            android.graphics.Rect r3 = r3.getBounds()
            if (r3 == 0) goto L_0x0047
            int r1 = r3.height()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0047:
            if (r2 != 0) goto L_0x004a
            goto L_0x0050
        L_0x004a:
            int r3 = r2.intValue()
            if (r3 == 0) goto L_0x006d
        L_0x0050:
            if (r1 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            int r3 = r1.intValue()
            if (r3 == 0) goto L_0x006d
        L_0x0059:
            com.tencent.mm.ui.i3$a r4 = new com.tencent.mm.ui.i3$a
            gy3.C87412m.m108591d(r2)
            int r0 = r2.intValue()
            gy3.C87412m.m108591d(r1)
            int r1 = r1.intValue()
            r4.<init>(r0, r1)
            return r4
        L_0x006d:
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            if (r0 == 0) goto L_0x007d
            android.view.Display r0 = r0.getDefaultDisplay()
            if (r0 == 0) goto L_0x007d
            r0.getRealSize(r1)
        L_0x007d:
            int r0 = r1.x
            if (r0 == 0) goto L_0x008b
            int r1 = r1.y
            if (r1 == 0) goto L_0x008b
            com.tencent.mm.ui.i3$a r4 = new com.tencent.mm.ui.i3$a
            r4.<init>(r0, r1)
            return r4
        L_0x008b:
            com.tencent.mm.ui.i3$a r0 = new com.tencent.mm.ui.i3$a
            android.content.res.Resources r1 = r4.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.heightPixels
            r0.<init>(r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C74783i3.m89537a(android.content.Context):com.tencent.mm.ui.i3$a");
    }
}
