package pl1;

import android.graphics.Bitmap;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import s60.C101536b;

/* renamed from: pl1.m */
public final class C100815m extends C101536b<Bitmap> {

    /* renamed from: d */
    public float f295326d;

    /* renamed from: e */
    public Integer f295327e;

    public C100815m(float f, Integer num) {
        this.f295326d = f;
        this.f295327e = num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba A[SYNTHETIC, Splitter:B:35:0x00ba] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w60.C65941g<? extends android.graphics.Bitmap> mo139547a(r60.C101350i<?> r6, k60.C99102f<?, android.graphics.Bitmap> r7, w60.C65941g<android.graphics.Bitmap> r8) {
        /*
            r5 = this;
            java.lang.String r0 = "RSInvalidStateException "
            java.lang.String r1 = "Finder.FinderBlurBitmapProfucer"
            java.lang.String r2 = "targetView"
            gy3.C87412m.m108594g(r6, r2)
            java.lang.String r2 = "reaper"
            gy3.C87412m.m108594g(r7, r2)
            java.lang.String r7 = "input"
            gy3.C87412m.m108594g(r8, r7)
            android.view.View r6 = r6.mo140837a()
            if (r6 != 0) goto L_0x001c
            return r8
        L_0x001c:
            T r6 = r8.f189590a
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L_0x0023
            return r8
        L_0x0023:
            int r7 = r6.getHeight()
            int r7 = r7 / 5
            int r2 = r6.getWidth()
            int r2 = r2 / 5
            r3 = 1
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r6, r7, r2, r3, r3)
            if (r6 != 0) goto L_0x0037
            return r8
        L_0x0037:
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r6)
            java.lang.Integer r8 = r5.f295327e
            if (r8 == 0) goto L_0x0056
            int r8 = r8.intValue()
            r2 = -1
            if (r8 == r2) goto L_0x0056
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r8 = r2.getColor(r8)
            r7.drawColor(r8)
        L_0x0056:
            r7 = 0
            float r8 = r5.f295326d     // Catch:{ all -> 0x0097 }
            r2 = 1103626240(0x41c80000, float:25.0)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0065
            int r8 = (int) r8     // Catch:{ all -> 0x0097 }
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.fastblur(r6, r8)     // Catch:{ all -> 0x0097 }
            goto L_0x0074
        L_0x0065:
            tj3.i r8 = new tj3.i     // Catch:{ all -> 0x0097 }
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0097 }
            r8.<init>(r2)     // Catch:{ all -> 0x0097 }
            float r7 = r5.f295326d     // Catch:{ all -> 0x0092 }
            r8.mo162692b(r6, r7)     // Catch:{ all -> 0x0092 }
            r7 = r8
        L_0x0074:
            if (r7 == 0) goto L_0x00c5
            r7.destroy()     // Catch:{ RSInvalidStateException -> 0x007a }
            goto L_0x00c5
        L_0x007a:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
        L_0x0080:
            r8.append(r0)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r7)
            goto L_0x00c5
        L_0x0092:
            r7 = move-exception
            r4 = r8
            r8 = r7
            r7 = r4
            goto L_0x0098
        L_0x0097:
            r8 = move-exception
        L_0x0098:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cb }
            r2.<init>()     // Catch:{ all -> 0x00cb }
            java.lang.String r3 = "setBlurBitmap error:"
            r2.append(r3)     // Catch:{ all -> 0x00cb }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x00cb }
            r2.append(r8)     // Catch:{ all -> 0x00cb }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x00cb }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)     // Catch:{ all -> 0x00cb }
            float r8 = r5.f295326d     // Catch:{ all -> 0x00cb }
            int r8 = (int) r8     // Catch:{ all -> 0x00cb }
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.fastblur(r6, r8)     // Catch:{ all -> 0x00cb }
            if (r7 == 0) goto L_0x00c5
            r7.destroy()     // Catch:{ RSInvalidStateException -> 0x00be }
            goto L_0x00c5
        L_0x00be:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            goto L_0x0080
        L_0x00c5:
            w60.g r7 = new w60.g
            r7.<init>(r6)
            return r7
        L_0x00cb:
            r6 = move-exception
            if (r7 == 0) goto L_0x00e9
            r7.destroy()     // Catch:{ RSInvalidStateException -> 0x00d2 }
            goto L_0x00e9
        L_0x00d2:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r7)
        L_0x00e9:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pl1.C100815m.mo139547a(r60.i, k60.f, w60.g):w60.g");
    }

    /* renamed from: b */
    public String mo139548b(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        return str;
    }
}
