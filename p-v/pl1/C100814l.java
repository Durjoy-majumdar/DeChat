package pl1;

import android.graphics.Bitmap;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import s60.C101536b;

/* renamed from: pl1.l */
public final class C100814l extends C101536b<Bitmap> {

    /* renamed from: d */
    public float f295325d;

    public C100814l(float f) {
        this.f295325d = f;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011c A[SYNTHETIC, Splitter:B:41:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0136  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w60.C65941g<? extends android.graphics.Bitmap> mo139547a(r60.C101350i<?> r19, k60.C99102f<?, android.graphics.Bitmap> r20, w60.C65941g<android.graphics.Bitmap> r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r21
            java.lang.String r2 = "RSInvalidStateException "
            java.lang.String r3 = "Finder.FinderBlurBackgroundBitmapProducer"
            java.lang.String r4 = "targetView"
            r5 = r19
            gy3.C87412m.m108594g(r5, r4)
            java.lang.String r4 = "reaper"
            r6 = r20
            gy3.C87412m.m108594g(r6, r4)
            java.lang.String r4 = "input"
            gy3.C87412m.m108594g(r0, r4)
            T r4 = r0.f189590a
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            if (r4 != 0) goto L_0x0024
            return r0
        L_0x0024:
            android.view.View r5 = r19.mo140837a()
            if (r5 != 0) goto L_0x002b
            return r0
        L_0x002b:
            int r6 = r5.getMeasuredWidth()
            int r5 = r5.getMeasuredHeight()
            int r7 = r4.getWidth()
            int r8 = r4.getHeight()
            float r9 = (float) r7
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = r9 * r10
            float r12 = (float) r8
            float r11 = r11 / r12
            r13 = 1061158912(0x3f400000, float:0.75)
            r15 = 1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x004b
            r11 = 1
            goto L_0x004c
        L_0x004b:
            r11 = 0
        L_0x004c:
            if (r7 == 0) goto L_0x017a
            if (r8 == 0) goto L_0x017a
            if (r6 == 0) goto L_0x017a
            if (r5 != 0) goto L_0x0056
            goto L_0x017a
        L_0x0056:
            float r7 = (float) r6
            float r8 = r7 * r10
            float r9 = r8 / r9
            float r13 = (float) r5
            float r12 = r12 * r9
            float r12 = r13 - r12
            r16 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r16
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            r10.postScale(r9, r9)
            r9 = 0
            r10.postTranslate(r9, r12)
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r6, r5, r12)
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r12)
            if (r11 == 0) goto L_0x0170
            int r11 = r5 / 20
            int r14 = r6 / 20
            r17 = r12
            r12 = 0
            android.graphics.Bitmap r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r4, r11, r14, r15, r12)
            if (r11 != 0) goto L_0x0099
            T r11 = r0.f189590a
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            android.graphics.Bitmap$Config r11 = r11.getConfig()
            android.graphics.Bitmap r11 = r4.copy(r11, r15)
            if (r11 != 0) goto L_0x0099
            return r0
        L_0x0099:
            int r0 = r11.getWidth()
            int r12 = r11.getHeight()
            int r5 = r5 * r0
            int r6 = r6 * r12
            if (r5 <= r6) goto L_0x00b6
            r5 = 1065353216(0x3f800000, float:1.0)
            float r13 = r13 * r5
            float r5 = (float) r12
            float r13 = r13 / r5
            float r0 = (float) r0
            float r0 = r0 * r13
            float r7 = r7 - r0
            float r7 = r7 * r16
            r0 = r13
            r13 = 0
            goto L_0x00c0
        L_0x00b6:
            float r0 = (float) r0
            float r0 = r8 / r0
            float r5 = (float) r12
            float r5 = r5 * r0
            float r13 = r13 - r5
            float r13 = r13 * r16
            r7 = 0
        L_0x00c0:
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r5.postScale(r0, r0)
            r5.postTranslate(r7, r13)
            tj3.i r6 = new tj3.i     // Catch:{ all -> 0x00f8 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00f8 }
            r6.<init>(r0)     // Catch:{ all -> 0x00f8 }
            float r0 = r1.f295325d     // Catch:{ all -> 0x00f6 }
            r6.mo162692b(r11, r0)     // Catch:{ all -> 0x00f6 }
            r6.destroy()     // Catch:{ RSInvalidStateException -> 0x00dd }
            goto L_0x0128
        L_0x00dd:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x00e4:
            r0.append(r2)
            java.lang.String r2 = r6.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x0128
        L_0x00f6:
            r0 = move-exception
            goto L_0x00fa
        L_0x00f8:
            r0 = move-exception
            r6 = 0
        L_0x00fa:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x014f }
            r7.<init>()     // Catch:{ all -> 0x014f }
            java.lang.String r8 = "setBlurBitmap error:"
            r7.append(r8)     // Catch:{ all -> 0x014f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x014f }
            r7.append(r0)     // Catch:{ all -> 0x014f }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x014f }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ all -> 0x014f }
            float r0 = r1.f295325d     // Catch:{ all -> 0x014f }
            int r0 = (int) r0     // Catch:{ all -> 0x014f }
            android.graphics.Bitmap r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.fastblur(r11, r0)     // Catch:{ all -> 0x014f }
            if (r6 == 0) goto L_0x0128
            r6.destroy()     // Catch:{ RSInvalidStateException -> 0x0120 }
            goto L_0x0128
        L_0x0120:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x00e4
        L_0x0128:
            if (r11 != 0) goto L_0x0136
            r2 = 0
            r9.drawBitmap(r4, r10, r2)
            w60.g r0 = new w60.g
            r7 = r17
            r0.<init>(r7)
            return r0
        L_0x0136:
            r7 = r17
            r2 = 0
            r9.drawBitmap(r11, r5, r2)
            java.lang.String r0 = "#14000000"
            int r0 = android.graphics.Color.parseColor(r0)
            r9.drawColor(r0)
            java.lang.String r0 = "#60D2D2D2"
            int r0 = android.graphics.Color.parseColor(r0)
            r9.drawColor(r0)
            goto L_0x0171
        L_0x014f:
            r0 = move-exception
            r4 = r0
            if (r6 == 0) goto L_0x016f
            r6.destroy()     // Catch:{ RSInvalidStateException -> 0x0157 }
            goto L_0x016f
        L_0x0157:
            r0 = move-exception
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = r5.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
        L_0x016f:
            throw r4
        L_0x0170:
            r7 = r12
        L_0x0171:
            r2 = 0
            r9.drawBitmap(r4, r10, r2)
            w60.g r0 = new w60.g
            r0.<init>(r7)
        L_0x017a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pl1.C100814l.mo139547a(r60.i, k60.f, w60.g):w60.g");
    }

    /* renamed from: b */
    public String mo139548b(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        return str;
    }
}
