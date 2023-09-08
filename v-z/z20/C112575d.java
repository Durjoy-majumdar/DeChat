package z20;

import android.graphics.Bitmap;

/* renamed from: z20.d */
public final class C112575d implements Cloneable {

    /* renamed from: d */
    public final int f337085d;

    /* renamed from: e */
    public Bitmap f337086e;

    /* renamed from: f */
    public float f337087f;

    public C112575d(int i) {
        this.f337085d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0041, code lost:
        if ((r11 == r8.f337087f) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo164320a(android.graphics.Canvas r9, android.graphics.Bitmap r10, float r11) {
        /*
            r8 = this;
            java.lang.String r0 = "canvas"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "preBitmap"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "draw cacheColorWeight "
            r0.append(r1)
            float r1 = r8.f337087f
            r0.append(r1)
            java.lang.String r1 = ", colorWeight:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", cacheFilteredBitmap:"
            r0.append(r1)
            android.graphics.Bitmap r1 = r8.f337086e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.FilterItem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            android.graphics.Bitmap r0 = r8.f337086e
            if (r0 == 0) goto L_0x0043
            float r0 = r8.f337087f
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x005a
        L_0x0043:
            r8.f337087f = r11
            z10.a r2 = z10.C112558a.f336997a
            int r4 = r8.f337085d
            int r5 = r10.getWidth()
            int r6 = r10.getHeight()
            float r7 = r8.f337087f
            r3 = r10
            android.graphics.Bitmap r10 = r2.mo164288b(r3, r4, r5, r6, r7)
            r8.f337086e = r10
        L_0x005a:
            android.graphics.Bitmap r10 = r8.f337086e
            gy3.C87412m.m108591d(r10)
            r11 = 0
            r0 = 0
            r9.drawBitmap(r10, r0, r0, r11)
            java.lang.String r9 = "lxl item draw"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.C112575d.mo164320a(android.graphics.Canvas, android.graphics.Bitmap, float):void");
    }

    public Object clone() {
        return super.clone();
    }
}
