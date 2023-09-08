package p141db;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import js0.C88024r;
import org.json.JSONObject;

/* renamed from: db.g */
public class C86222g extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 100;
    public static final String NAME = "canvasToTempFilePath";

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0227, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0229, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x022e, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e5 A[Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0229 A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:90:0x020c] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.appbrand.jsapi.file.C82446i m106822w(com.tencent.p014mm.plugin.appbrand.page.C83780d1 r24, org.json.JSONObject r25, boolean r26) {
        /*
            r0 = r24
            r1 = r25
            java.lang.String r2 = "fail:gen bitmap failed because of null pointer!"
            java.lang.Class<hr0.a> r3 = hr0.C87583a.class
            java.lang.String r4 = "MicroMsg.WAGameJsApiCanvasToTempFilePath"
            r5 = 1
            r6 = 0
            java.lang.String r7 = "canvasId"
            int r7 = r1.getInt(r7)     // Catch:{ JSONException -> 0x03f2 }
            if (r0 != 0) goto L_0x001e
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            java.lang.String r1 = "fail: no page"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            r0.<init>(r1, r2)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            return r0
        L_0x001e:
            java.lang.Class<hb.c> r8 = p547hb.C87464c.class
            java.lang.Object r8 = r0.mo116150E0(r8)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            hb.c r8 = (p547hb.C87464c) r8     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            java.lang.String r9 = "isScreenCanvas"
            boolean r9 = r1.optBoolean(r9, r6)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            if (r8 == 0) goto L_0x0058
            com.tencent.magicbrush.ui.MagicBrushView r11 = r8.mo111251c()     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            if (r11 == 0) goto L_0x0058
            if (r9 != 0) goto L_0x003d
            r11 = r26
            android.graphics.Bitmap r8 = r8.mo111239D(r7, r11)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            goto L_0x0059
        L_0x003d:
            com.tencent.magicbrush.ui.MagicBrushView r11 = r8.mo111251c()     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            com.tencent.magicbrush.a r11 = r11.getMagicBrush()     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            od.b r12 = r11.f235098n     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            com.tencent.magicbrush.ui.MagicBrushView r8 = r8.mo111251c()     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            int r13 = r8.getVirtualElementId()     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            r14 = -1
            r16 = 2500(0x9c4, double:1.235E-320)
            r15 = 1
            android.graphics.Bitmap r8 = r12.mo123492a(r13, r14, r15, r16)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            goto L_0x0059
        L_0x0058:
            r8 = 0
        L_0x0059:
            if (r8 != 0) goto L_0x0080
            java.lang.String r0 = "get screenBitmap return null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            ra.d r0 = p224ra.C89909e.m112439d(r3, r5)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            r10 = r0
            hr0.a r10 = (hr0.C87583a) r10     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            r11 = 807(0x327, double:3.987E-321)
            if (r9 == 0) goto L_0x006e
            r0 = 14
            goto L_0x0070
        L_0x006e:
            r0 = 15
        L_0x0070:
            r13 = r0
            r15 = 1
            r10.mo121689f(r11, r13, r15)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            java.lang.String r1 = "fail:get bitmap failed"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            r0.<init>(r1, r2)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            return r0
        L_0x0080:
            int r9 = r8.getWidth()     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            float r9 = (float) r9     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            int r11 = r8.getHeight()     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            float r11 = (float) r11     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            int r12 = r8.getWidth()     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            float r12 = (float) r12     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            int r13 = r8.getHeight()     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            float r13 = (float) r13     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            java.lang.String r14 = "screenWidth:%f,screenHeight:%f,canvasWidth:%f,canvasHeight:%f"
            r15 = 4
            java.lang.Object[] r10 = new java.lang.Object[r15]     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            java.lang.Float r16 = java.lang.Float.valueOf(r9)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            r10[r6] = r16     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            java.lang.Float r16 = java.lang.Float.valueOf(r11)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            r10[r5] = r16     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            java.lang.Float r16 = java.lang.Float.valueOf(r12)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            r5 = 2
            r10[r5] = r16     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            java.lang.Float r16 = java.lang.Float.valueOf(r13)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            r19 = 3
            r10[r19] = r16     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r14, r10)     // Catch:{ OutOfMemoryError -> 0x03ee, RuntimeException -> 0x03eb }
            java.lang.String r10 = "x"
            r5 = 0
            r21 = r2
            r20 = r3
            double r2 = r1.optDouble(r10, r5)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            float r2 = (float) r2     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.String r3 = "y"
            double r5 = r1.optDouble(r3, r5)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            float r3 = (float) r5     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.String r5 = "width"
            r10 = r7
            double r6 = (double) r12     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            double r5 = r1.optDouble(r5, r6)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            float r5 = (float) r5     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.String r6 = "height"
            r22 = r8
            double r7 = (double) r13     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            double r6 = r1.optDouble(r6, r7)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            float r6 = (float) r6     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.String r7 = "x:%f,y:%f,width:%f,height:%f"
            java.lang.Object[] r8 = new java.lang.Object[r15]     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.Float r14 = java.lang.Float.valueOf(r2)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r16 = 0
            r8[r16] = r14     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.Float r14 = java.lang.Float.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r16 = 1
            r8[r16] = r14     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.Float r14 = java.lang.Float.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r16 = 2
            r8[r16] = r14     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.Float r14 = java.lang.Float.valueOf(r6)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r8[r19] = r14     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r8)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r7 = 0
            int r8 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x012d
            int r8 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x012d
            int r8 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x0119
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x012d
        L_0x0119:
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x0120
            float r2 = r2 / r12
            float r2 = r2 * r9
        L_0x0120:
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x0127
            float r3 = r3 / r13
            float r3 = r3 * r11
        L_0x0127:
            float r5 = r5 / r12
            float r5 = r5 * r9
            float r6 = r6 / r13
            float r6 = r6 * r11
        L_0x012d:
            float r8 = r2 + r5
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0135
            float r5 = r9 - r2
        L_0x0135:
            float r8 = r3 + r6
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x013d
            float r6 = r11 - r3
        L_0x013d:
            java.lang.String r8 = "destWidth"
            double r12 = (double) r5     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            double r12 = r1.optDouble(r8, r12)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            float r8 = (float) r12     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.String r12 = "destHeight"
            double r13 = (double) r6     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            double r12 = r1.optDouble(r12, r13)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            float r14 = (float) r12     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.String r12 = "x:%f,y:%f,screenWidth:%f,screenHeight:%f,width:%f,height:%f,imgWidth:%f,imgHeight:%f"
            r13 = 8
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.Float r16 = java.lang.Float.valueOf(r2)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r17 = 0
            r13[r17] = r16     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.Float r16 = java.lang.Float.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r17 = 1
            r13[r17] = r16     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.Float r16 = java.lang.Float.valueOf(r9)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r17 = 2
            r13[r17] = r16     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.Float r16 = java.lang.Float.valueOf(r11)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r13[r19] = r16     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.Float r16 = java.lang.Float.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r13[r15] = r16     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            java.lang.Float r16 = java.lang.Float.valueOf(r6)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r15 = 5
            r13[r15] = r16     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r16 = 6
            java.lang.Float r23 = java.lang.Float.valueOf(r8)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r13[r16] = r23     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r16 = 7
            java.lang.Float r23 = java.lang.Float.valueOf(r14)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r13[r16] = r23     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r13)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            int r12 = (int) r2     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            if (r12 < 0) goto L_0x03ab
            int r13 = (int) r3     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            if (r13 < 0) goto L_0x03ab
            int r15 = (int) r5     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            if (r15 <= 0) goto L_0x03ab
            int r7 = (int) r6     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            if (r7 <= 0) goto L_0x03ab
            float r0 = r2 + r5
            int r0 = (int) r0     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            int r1 = (int) r9     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            if (r0 > r1) goto L_0x03ab
            float r0 = r3 + r6
            int r0 = (int) r0     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            int r1 = (int) r11     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            if (r0 > r1) goto L_0x03ab
            int r0 = (int) r8     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            if (r0 <= 0) goto L_0x03ab
            int r1 = (int) r14     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            if (r1 > 0) goto L_0x01b2
            goto L_0x03ab
        L_0x01b2:
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x01c0
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x01bb
            goto L_0x01c0
        L_0x01bb:
            r3 = r14
            r2 = r22
            r9 = 4
            goto L_0x01d2
        L_0x01c0:
            r16 = 0
            r2 = 0
            r11 = r22
            r3 = r14
            r14 = r15
            r9 = 4
            r15 = r7
            r17 = r2
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r22.recycle()     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
        L_0x01d2:
            java.lang.String r7 = "fail:gen bitmap failed!"
            if (r2 != 0) goto L_0x01e5
            java.lang.String r0 = "screenBitmap.content null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            r0.<init>(r7, r2)     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            return r0
        L_0x01e5:
            int r11 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            if (r11 <= 0) goto L_0x039a
            int r11 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x03e6, RuntimeException -> 0x03e2 }
            if (r11 > 0) goto L_0x01f3
            goto L_0x039a
        L_0x01f3:
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x01ff
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x01fc
            goto L_0x01ff
        L_0x01fc:
            r11 = r20
            goto L_0x023a
        L_0x01ff:
            r5 = 0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r2, r0, r1, r5)     // Catch:{ NullPointerException -> 0x0349, IllegalArgumentException -> 0x02f8 }
            r2.recycle()     // Catch:{ NullPointerException -> 0x0349, IllegalArgumentException -> 0x02f8 }
            if (r1 != 0) goto L_0x0237
            r11 = r20
            r2 = 1
            ra.d r0 = p224ra.C89909e.m112439d(r11, r2)     // Catch:{ NullPointerException -> 0x0231, IllegalArgumentException -> 0x0229 }
            r12 = r0
            hr0.a r12 = (hr0.C87583a) r12     // Catch:{ NullPointerException -> 0x0231, IllegalArgumentException -> 0x0229 }
            r13 = 807(0x327, double:3.987E-321)
            r15 = 9
            r17 = 1
            r12.mo121689f(r13, r15, r17)     // Catch:{ NullPointerException -> 0x0231, IllegalArgumentException -> 0x0229 }
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ NullPointerException -> 0x0231, IllegalArgumentException -> 0x0229 }
            r2 = 0
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ NullPointerException -> 0x0231, IllegalArgumentException -> 0x0229 }
            r6 = r21
            r0.<init>(r6, r5)     // Catch:{ NullPointerException -> 0x0227, IllegalArgumentException -> 0x0229 }
            return r0
        L_0x0227:
            r0 = move-exception
            goto L_0x0234
        L_0x0229:
            r0 = move-exception
            goto L_0x022e
        L_0x022b:
            r0 = move-exception
            goto L_0x0409
        L_0x022e:
            r2 = r1
            goto L_0x02fb
        L_0x0231:
            r0 = move-exception
            r6 = r21
        L_0x0234:
            r2 = r1
            goto L_0x034e
        L_0x0237:
            r11 = r20
            r2 = r1
        L_0x023a:
            android.graphics.Bitmap$CompressFormat r0 = xk0.C91267e.m114491w(r25)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            if (r0 != r1) goto L_0x025b
            int r1 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            int r3 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r3, r5)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r3.<init>(r1)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r5 = 0
            r6 = 0
            r3.drawBitmap(r2, r5, r5, r6)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r2 = r1
        L_0x025b:
            java.lang.String r1 = r24.getAppId()     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r3.<init>()     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r5 = "canvas_"
            r3.append(r5)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r3.append(r10)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r3 = r3.toString()     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r1 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.genMediaFilePath(r1, r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            int r3 = xk0.C91267e.m114492x(r25)     // Catch:{ IOException -> 0x02da }
            r5 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r2, r3, r0, r1, r5)     // Catch:{ IOException -> 0x02da }
            java.lang.String r2 = r24.getAppId()     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            if (r0 != r3) goto L_0x0287
            java.lang.String r0 = "jpg"
            goto L_0x028a
        L_0x0287:
            java.lang.String r0 = "png"
        L_0x028a:
            r3 = 1
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject r0 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.m99829b(r2, r1, r0, r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            if (r0 != 0) goto L_0x02a9
            java.lang.String r0 = "gen temp file failed, canvasId : %s."
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r3 = 0
            r1[r3] = r2     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r1)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r1 = "fail:gen temp file failed"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r0.<init>(r1, r2)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            return r0
        L_0x02a9:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r2 = "tempFilePath"
            java.lang.String r3 = r0.f238902d     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r1.put(r2, r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r2 = "save file(id : %s) to path : %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r5 = r0.f238902d     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r6 = 0
            r3[r6] = r5     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r0 = r0.f238903e     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r5 = 1
            r3[r5] = r0     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r2, r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r2 = "ok"
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r0.<init>(r2, r5)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r0.mo114816a(r1)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            return r0
        L_0x02d7:
            r3 = 0
            goto L_0x0438
        L_0x02da:
            r0 = move-exception
            java.lang.String r1 = "save bitmap to file failed, viewId(%s). exception : %s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r5 = 0
            r2[r5] = r3     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r3 = 1
            r2[r3] = r0     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r1, r2)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r1 = "fail:write file failed"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r0.<init>(r1, r2)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            return r0
        L_0x02f8:
            r0 = move-exception
            r11 = r20
        L_0x02fb:
            java.lang.String r1 = "hy: dump exception ilae: %d, %d, %f, %f"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            int r6 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r7 = 0
            r5[r7] = r6     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            int r2 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r6 = 1
            r5[r6] = r2     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Float r2 = java.lang.Float.valueOf(r8)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r6 = 2
            r5[r6] = r2     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Float r2 = java.lang.Float.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r5[r19] = r2     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r1, r5)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r1 = "hy: illegalArgument exception occured!!"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r1, r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r1 = 1
            ra.d r0 = p224ra.C89909e.m112439d(r11, r1)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r12 = r0
            hr0.a r12 = (hr0.C87583a) r12     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r13 = 807(0x327, double:3.987E-321)
            r15 = 10
            r17 = 1
            r12.mo121689f(r13, r15, r17)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r1 = "fail:gen bitmap failed because of illegal argument!"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r0.<init>(r1, r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            return r0
        L_0x0349:
            r0 = move-exception
            r11 = r20
            r6 = r21
        L_0x034e:
            java.lang.String r1 = "hy: dump exception npe: %d, %d, %f, %f"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            int r7 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r9 = 0
            r5[r9] = r7     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            int r2 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r7 = 1
            r5[r7] = r2     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Float r2 = java.lang.Float.valueOf(r8)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r7 = 2
            r5[r7] = r2     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Float r2 = java.lang.Float.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r5[r19] = r2     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r1, r5)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r1 = "hy: weired exception occured!!"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r1, r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r1 = 1
            ra.d r0 = p224ra.C89909e.m112439d(r11, r1)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r12 = r0
            hr0.a r12 = (hr0.C87583a) r12     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r13 = 807(0x327, double:3.987E-321)
            r15 = 9
            r17 = 1
            r12.mo121689f(r13, r15, r17)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r0.<init>(r6, r2)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            return r0
        L_0x039a:
            r11 = r20
            java.lang.String r0 = "screenBitmap.content width or height <=0!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r0.<init>(r7, r2)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            return r0
        L_0x03ab:
            r11 = r20
            r9 = 4
            java.lang.String r0 = "illegal arguments(x : %s, y : %s, width : %s, height : %s) failed, canvasId(%s)."
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r7 = 0
            r1[r7] = r2     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Float r2 = java.lang.Float.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r3 = 1
            r1[r3] = r2     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Float r2 = java.lang.Float.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r3 = 2
            r1[r3] = r2     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Float r2 = java.lang.Float.valueOf(r6)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r1[r19] = r2     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r1[r9] = r2     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r1)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r1 = "fail:illegal arguments"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r0.<init>(r1, r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            return r0
        L_0x03e2:
            r0 = move-exception
            r11 = r20
            goto L_0x0409
        L_0x03e6:
            r0 = move-exception
            r11 = r20
            goto L_0x02d7
        L_0x03eb:
            r0 = move-exception
            r11 = r3
            goto L_0x0409
        L_0x03ee:
            r0 = move-exception
            r11 = r3
            goto L_0x02d7
        L_0x03f2:
            r0 = move-exception
            r11 = r3
            java.lang.String r1 = "canvasId do not exist. exception : %s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r2 = 0
            r3[r2] = r0     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r1, r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            java.lang.String r1 = "fail:canvasId do not exist"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            r0.<init>(r1, r3)     // Catch:{ OutOfMemoryError -> 0x0435, RuntimeException -> 0x022b }
            return r0
        L_0x0409:
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = "hy: runtime exception!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r1, r2)
            r1 = 1
            ra.d r2 = p224ra.C89909e.m112439d(r11, r1)
            r3 = r2
            hr0.a r3 = (hr0.C87583a) r3
            r4 = 807(0x327, double:3.987E-321)
            r6 = 13
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            com.tencent.mm.plugin.appbrand.jsapi.file.i r1 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.toString()
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "fail:runtime exception! %s"
            r1.<init>(r0, r2)
            return r1
        L_0x0435:
            r0 = move-exception
            goto L_0x02d7
        L_0x0438:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "hy: out of memory!!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r1)
            r1 = 1
            ra.d r0 = p224ra.C89909e.m112439d(r11, r1)
            r1 = r0
            hr0.a r1 = (hr0.C87583a) r1
            r2 = 807(0x327, double:3.987E-321)
            r4 = 12
            r6 = 1
            r1.mo121689f(r2, r4, r6)
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "fail:out of memory!"
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p141db.C86222g.m106822w(com.tencent.mm.plugin.appbrand.page.d1, org.json.JSONObject, boolean):com.tencent.mm.plugin.appbrand.jsapi.file.i");
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88024r.m109571a().postToWorker(new C86221f(this, (C81925i2) fVar, i, jSONObject));
    }
}
