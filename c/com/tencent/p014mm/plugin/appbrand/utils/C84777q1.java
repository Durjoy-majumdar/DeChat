package com.tencent.p014mm.plugin.appbrand.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.q1 */
public final class C84777q1 {

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.q1$a */
    public static final class C84778a {

        /* renamed from: a */
        public final int f247200a;

        /* renamed from: b */
        public final int f247201b;

        public C84778a(int i, int i2) {
            this.f247200a = i;
            this.f247201b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C84778a)) {
                return false;
            }
            C84778a aVar = (C84778a) obj;
            return this.f247200a == aVar.f247200a && this.f247201b == aVar.f247201b;
        }

        public int hashCode() {
            return (this.f247200a * 31) + this.f247201b;
        }

        public String toString() {
            return "Size(width=" + this.f247200a + ", height=" + this.f247201b + ')';
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r2 = (r2 = r0.getCurrentWindowMetrics()).getBounds();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.tencent.p014mm.plugin.appbrand.utils.C84777q1.C84778a m104441a(android.content.Context r4) {
        /*
            java.lang.String r0 = "window"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L_0x0040
            r1 = 0
            if (r0 == 0) goto L_0x0023
            android.view.WindowMetrics r2 = r0.getCurrentWindowMetrics()
            if (r2 == 0) goto L_0x0023
            android.graphics.Rect r2 = r2.getBounds()
            if (r2 == 0) goto L_0x0023
            int r2 = r2.width()
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0036
            android.view.WindowMetrics r3 = r0.getCurrentWindowMetrics()
            if (r3 == 0) goto L_0x0036
            android.graphics.Rect r3 = r3.getBounds()
            if (r3 == 0) goto L_0x0036
            int r1 = r3.height()
        L_0x0036:
            if (r2 == 0) goto L_0x0040
            if (r1 == 0) goto L_0x0040
            com.tencent.mm.plugin.appbrand.utils.q1$a r4 = new com.tencent.mm.plugin.appbrand.utils.q1$a
            r4.<init>(r2, r1)
            return r4
        L_0x0040:
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            if (r0 == 0) goto L_0x0050
            android.view.Display r0 = r0.getDefaultDisplay()
            if (r0 == 0) goto L_0x0050
            r0.getRealSize(r1)
        L_0x0050:
            int r0 = r1.x
            if (r0 == 0) goto L_0x005e
            int r1 = r1.y
            if (r1 == 0) goto L_0x005e
            com.tencent.mm.plugin.appbrand.utils.q1$a r4 = new com.tencent.mm.plugin.appbrand.utils.q1$a
            r4.<init>(r0, r1)
            return r4
        L_0x005e:
            com.tencent.mm.plugin.appbrand.utils.q1$a r0 = new com.tencent.mm.plugin.appbrand.utils.q1$a
            android.content.res.Resources r1 = r4.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.heightPixels
            r0.<init>(r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.utils.C84777q1.m104441a(android.content.Context):com.tencent.mm.plugin.appbrand.utils.q1$a");
    }

    /* renamed from: b */
    public static final boolean m104442b(Context context) {
        C87412m.m108594g(context, "ctx");
        C84778a a = m104441a(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3 && Math.sqrt(Math.pow((double) (((float) a.f247200a) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) a.f247201b) / displayMetrics.ydpi), 2.0d)) >= 7.5d;
    }
}
