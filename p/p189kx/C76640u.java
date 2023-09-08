package p189kx;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qbar.QbarNative;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import di3.C86301e;
import ei3.C86522b;
import p200lx.C76736w;
import ze3.C79323a;

@C86522b
/* renamed from: kx.u */
public class C76640u extends C86301e implements C76736w {
    public Bitmap p10(Context context, String str, int i, int i2, double d) {
        return C79323a.m96021b(context, str, i, i2, d);
    }

    /* renamed from: qj */
    public Bitmap mo106913qj(Context context, String str, int i, int i2) {
        return C79323a.m96021b(context, str, i, i2, 0.1d);
    }

    public Bitmap qk0(Context context, Bitmap bitmap, String str, int i, double d) {
        byte[] bArr = new byte[CodecError.DEQUEUEINPUTBUFFER_ILLEGAL];
        int[] iArr = new int[2];
        int Encode = QbarNative.Encode(bArr, iArr, str, 12, i, "UTF-8", -1);
        if (Encode == 0) {
            Bitmap a = C79323a.m96020a(context, bitmap, bArr, iArr, d);
            Log.m105925i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", a);
            return a;
        }
        Log.m105925i("MicroMsg.QRCodeBitmapFactory", "result %d %s", Integer.valueOf(Encode), Util.getStack().toString());
        return null;
    }

    /* renamed from: xd */
    public Bitmap mo106915xd(Context context, Bitmap bitmap, String str, int i) {
        byte[] bArr = new byte[CodecError.DEQUEUEINPUTBUFFER_ILLEGAL];
        int[] iArr = new int[2];
        int Encode = QbarNative.Encode(bArr, iArr, str, 12, i, "UTF-8", -1);
        if (Encode == 0) {
            Bitmap a = C79323a.m96020a(context, bitmap, bArr, iArr, 0.1d);
            Log.m105925i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", a);
            return a;
        }
        Log.m105925i("MicroMsg.QRCodeBitmapFactory", "result %d %s", Integer.valueOf(Encode), Util.getStack().toString());
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f0, code lost:
        if (r13 <= 6) goto L_0x00f2;
     */
    /* renamed from: zO */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo106916zO(android.content.Context r27, java.lang.String r28, int r29, int r30, int r31) {
        /*
            r26 = this;
            r0 = r30
            r1 = r31
            r2 = 40000(0x9c40, float:5.6052E-41)
            byte[] r2 = new byte[r2]
            r10 = 2
            int[] r11 = new int[r10]
            r6 = 12
            r9 = -1
            java.lang.String r8 = "UTF-8"
            r3 = r2
            r4 = r11
            r5 = r28
            r7 = r29
            int r3 = com.tencent.qbar.QbarNative.Encode(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r4 = "MicroMsg.QRCodeBitmapFactory"
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L_0x0308
            android.content.res.Resources r3 = r27.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r7 = r3.widthPixels
            int r3 = r3.heightPixels
            if (r7 >= r3) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r7 = r3
        L_0x0031:
            double r7 = (double) r7
            r12 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r7 = r7 * r12
            int r3 = (int) r7
            r7 = r11[r5]
            double r8 = (double) r7
            r12 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r8 = r8 * r12
            int r8 = (int) r8
            int r9 = r8 * 2
            int r7 = r7 + r9
            int r3 = r3 / r7
            if (r3 != 0) goto L_0x004c
            r3 = 1
        L_0x004c:
            int r9 = r8 * r3
            int r7 = r7 * r3
            r12 = r11[r6]
            int r12 = r12 * r3
            int r13 = r3 * 2
            int r8 = r8 * r13
            int r8 = r8 + r12
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r7, r8, r12)
            int r12 = r7 * r8
            int[] r14 = new int[r12]
            int r12 = r3 / 2
            int r13 = r13 + r12
            int r16 = r3 * 3
            int r10 = r16 + r12
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r15)
            r29 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r4.setAntiAlias(r6)
            r6 = -1
            java.util.Arrays.fill(r14, r6)
            r6 = 6
            r24 = r5
            int[] r5 = new int[r6]
            r16 = 0
            r5[r16] = r10
            r18 = 1
            r5[r18] = r10
            r18 = r11[r16]
            r16 = -1
            int r18 = r18 + -1
            int r18 = r18 + -3
            int r18 = r18 * r3
            int r18 = r18 + r12
            r17 = 2
            r5[r17] = r18
            r6 = 3
            r5[r6] = r10
            r25 = 4
            r5[r25] = r10
            r6 = 1
            r18 = r11[r6]
            int r18 = r18 + -1
            int r18 = r18 + -3
            int r18 = r18 * r3
            int r18 = r18 + r12
            r12 = 5
            r5[r12] = r18
            r18 = r13
            r12 = 0
        L_0x00b2:
            r13 = r11[r6]
            if (r12 >= r13) goto L_0x017d
            r13 = 0
        L_0x00b7:
            r19 = 0
            r6 = r11[r19]
            if (r13 >= r6) goto L_0x016f
            int r19 = r12 * r6
            int r19 = r19 + r13
            r20 = r10
            byte r10 = r2[r19]
            r19 = r2
            r2 = 1
            if (r10 != r2) goto L_0x0162
            r2 = 6
            if (r12 < 0) goto L_0x00d3
            if (r12 > r2) goto L_0x00d3
            if (r13 < 0) goto L_0x00d3
            if (r13 <= r2) goto L_0x00f2
        L_0x00d3:
            if (r12 < 0) goto L_0x00e2
            if (r12 > r2) goto L_0x00e2
            int r2 = r6 + -7
            if (r13 < r2) goto L_0x00e2
            int r6 = r6 + -1
            if (r13 <= r6) goto L_0x00e0
            goto L_0x00e2
        L_0x00e0:
            r2 = 6
            goto L_0x00f2
        L_0x00e2:
            r2 = 1
            r6 = r11[r2]
            int r2 = r6 + -7
            if (r12 < r2) goto L_0x0115
            int r6 = r6 + -1
            if (r12 > r6) goto L_0x0115
            if (r13 < 0) goto L_0x0115
            r2 = 6
            if (r13 > r2) goto L_0x0116
        L_0x00f2:
            r6 = 0
        L_0x00f3:
            if (r6 >= r3) goto L_0x0112
            r10 = 0
        L_0x00f6:
            if (r10 >= r3) goto L_0x010f
            int r17 = r12 * r3
            int r17 = r17 + r9
            int r17 = r17 + r6
            int r17 = r17 * r7
            int r21 = r13 * r3
            int r17 = r17 + r21
            int r17 = r17 + r9
            int r17 = r17 + r10
            r21 = -1
            r14[r17] = r21
            int r10 = r10 + 1
            goto L_0x00f6
        L_0x010f:
            int r6 = r6 + 1
            goto L_0x00f3
        L_0x0112:
            r23 = r11
            goto L_0x0165
        L_0x0115:
            r2 = 6
        L_0x0116:
            r6 = 10
            boolean[] r6 = new boolean[r6]
            r10 = 5
            r16 = 1
            r6[r10] = r16
            double r16 = java.lang.Math.random()
            r21 = 4621819117588971520(0x4024000000000000, double:10.0)
            r23 = r11
            double r10 = r16 * r21
            int r10 = (int) r10
            boolean r6 = r6[r10]
            if (r6 == 0) goto L_0x0148
            r6 = 0
        L_0x012f:
            if (r6 >= r3) goto L_0x0165
            r10 = 0
        L_0x0132:
            if (r10 >= r3) goto L_0x0145
            int r11 = r12 * r3
            int r11 = r11 + r9
            int r11 = r11 + r6
            int r11 = r11 * r7
            int r16 = r13 * r3
            int r11 = r11 + r16
            int r11 = r11 + r9
            int r11 = r11 + r10
            r14[r11] = r0
            int r10 = r10 + 1
            goto L_0x0132
        L_0x0145:
            int r6 = r6 + 1
            goto L_0x012f
        L_0x0148:
            r6 = 0
        L_0x0149:
            if (r6 >= r3) goto L_0x0165
            r10 = 0
        L_0x014c:
            if (r10 >= r3) goto L_0x015f
            int r11 = r12 * r3
            int r11 = r11 + r9
            int r11 = r11 + r6
            int r11 = r11 * r7
            int r16 = r13 * r3
            int r11 = r11 + r16
            int r11 = r11 + r9
            int r11 = r11 + r10
            r14[r11] = r1
            int r10 = r10 + 1
            goto L_0x014c
        L_0x015f:
            int r6 = r6 + 1
            goto L_0x0149
        L_0x0162:
            r23 = r11
            r2 = 6
        L_0x0165:
            int r13 = r13 + 1
            r2 = r19
            r10 = r20
            r11 = r23
            goto L_0x00b7
        L_0x016f:
            r19 = r2
            r20 = r10
            r23 = r11
            r2 = 6
            int r12 = r12 + 1
            r2 = r19
            r6 = 1
            goto L_0x00b2
        L_0x017d:
            r20 = r10
            r2 = 0
            r16 = 0
            r17 = 0
            r12 = r15
            r6 = r18
            r13 = r14
            r14 = r2
            r2 = r15
            r15 = r7
            r18 = r7
            r19 = r8
            r12.setPixels(r13, r14, r15, r16, r17, r18, r19)
            r7 = 0
        L_0x0193:
            r8 = 3
            if (r7 >= r8) goto L_0x01c5
            r4.setColor(r1)
            android.graphics.Paint$Style r8 = android.graphics.Paint.Style.FILL
            r4.setStyle(r8)
            int r8 = r7 * 2
            r10 = r5[r8]
            int r10 = r10 + r9
            float r10 = (float) r10
            int r11 = r8 + 1
            r12 = r5[r11]
            int r12 = r12 + r9
            float r12 = (float) r12
            r13 = r20
            float r14 = (float) r13
            r15 = r24
            r15.drawCircle(r10, r12, r14, r4)
            r10 = -1
            r4.setColor(r10)
            r8 = r5[r8]
            int r8 = r8 + r9
            float r8 = (float) r8
            r10 = r5[r11]
            int r10 = r10 + r9
            float r10 = (float) r10
            float r11 = (float) r6
            r15.drawCircle(r8, r10, r11, r4)
            int r7 = r7 + 1
            goto L_0x0193
        L_0x01c5:
            r15 = r24
            r1 = 0
        L_0x01c8:
            r6 = 3
            if (r1 >= r6) goto L_0x0201
            r4.setColor(r0)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            r4.setStyle(r6)
            int r6 = r1 * 2
            r7 = r5[r6]
            int r7 = r7 + r9
            int r8 = r7 - r3
            int r10 = r3 * 1
            int r10 = r10 / 4
            int r8 = r8 - r10
            r11 = 1
            int r6 = r6 + r11
            r6 = r5[r6]
            int r6 = r6 + r9
            int r11 = r6 - r3
            int r11 = r11 - r10
            int r7 = r7 + r3
            int r7 = r7 + r10
            int r6 = r6 + r3
            int r6 = r6 + r10
            float r8 = (float) r8
            float r10 = (float) r11
            float r7 = (float) r7
            float r6 = (float) r6
            r18 = r15
            r19 = r8
            r20 = r10
            r21 = r7
            r22 = r6
            r23 = r4
            r18.drawRect(r19, r20, r21, r22, r23)
            int r1 = r1 + 1
            goto L_0x01c8
        L_0x0201:
            r0 = 0
        L_0x0202:
            r1 = 3
            if (r0 >= r1) goto L_0x02f9
            r6 = -1
            r4.setColor(r6)
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.FILL_AND_STROKE
            r4.setStyle(r7)
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            int r8 = r0 * 2
            r10 = r5[r8]
            int r10 = r10 + r9
            int r10 = r10 - r3
            int r11 = r3 * 1
            int r11 = r11 / 4
            int r10 = r10 - r11
            float r10 = (float) r10
            int r12 = r8 + 1
            r13 = r5[r12]
            int r13 = r13 + r9
            int r13 = r13 - r3
            int r13 = r13 - r11
            float r13 = (float) r13
            r7.moveTo(r10, r13)
            r10 = r5[r8]
            int r10 = r10 + r9
            float r13 = (float) r10
            r14 = r5[r12]
            int r14 = r14 + r9
            int r14 = r14 - r3
            float r1 = (float) r14
            int r10 = r10 + r3
            int r16 = r3 / 4
            int r10 = r10 + r16
            float r10 = (float) r10
            int r14 = r14 - r11
            float r14 = (float) r14
            r7.quadTo(r13, r1, r10, r14)
            r1 = r5[r8]
            int r1 = r1 + r9
            int r1 = r1 - r3
            int r1 = r1 - r11
            float r1 = (float) r1
            r10 = r5[r12]
            int r10 = r10 + r9
            int r10 = r10 - r3
            int r10 = r10 - r11
            float r10 = (float) r10
            r7.lineTo(r1, r10)
            r7.close()
            r15.drawPath(r7, r4)
            r1 = r5[r8]
            int r1 = r1 + r9
            int r1 = r1 - r3
            int r1 = r1 - r11
            float r1 = (float) r1
            r10 = r5[r12]
            int r10 = r10 + r9
            int r10 = r10 - r3
            int r10 = r10 - r11
            float r10 = (float) r10
            r7.moveTo(r1, r10)
            r1 = r5[r8]
            int r1 = r1 + r9
            int r1 = r1 - r3
            float r10 = (float) r1
            r13 = r5[r12]
            int r13 = r13 + r9
            float r14 = (float) r13
            int r1 = r1 - r16
            float r1 = (float) r1
            int r13 = r13 + r3
            int r13 = r13 + r11
            float r13 = (float) r13
            r7.quadTo(r10, r14, r1, r13)
            r1 = r5[r8]
            int r1 = r1 + r9
            int r1 = r1 - r3
            int r1 = r1 - r11
            float r1 = (float) r1
            r10 = r5[r12]
            int r10 = r10 + r9
            int r10 = r10 - r3
            int r10 = r10 - r11
            float r10 = (float) r10
            r7.lineTo(r1, r10)
            r7.close()
            r15.drawPath(r7, r4)
            r1 = r5[r8]
            int r1 = r1 + r9
            int r1 = r1 + r3
            int r1 = r1 + r11
            float r1 = (float) r1
            r10 = r5[r12]
            int r10 = r10 + r9
            int r10 = r10 + r3
            int r10 = r10 + r11
            float r10 = (float) r10
            r7.moveTo(r1, r10)
            r1 = r5[r8]
            int r1 = r1 + r9
            float r10 = (float) r1
            r13 = r5[r12]
            int r13 = r13 + r9
            int r13 = r13 + r3
            float r14 = (float) r13
            int r1 = r1 - r3
            int r1 = r1 - r16
            float r1 = (float) r1
            int r13 = r13 + r11
            float r13 = (float) r13
            r7.quadTo(r10, r14, r1, r13)
            r1 = r5[r8]
            int r1 = r1 + r9
            int r1 = r1 + r3
            int r1 = r1 + r11
            float r1 = (float) r1
            r10 = r5[r12]
            int r10 = r10 + r9
            int r10 = r10 + r3
            int r10 = r10 + r11
            float r10 = (float) r10
            r7.lineTo(r1, r10)
            r7.close()
            r15.drawPath(r7, r4)
            r1 = r5[r8]
            int r1 = r1 + r9
            int r1 = r1 + r3
            int r1 = r1 + r11
            float r1 = (float) r1
            r10 = r5[r12]
            int r10 = r10 + r9
            int r10 = r10 + r3
            int r10 = r10 + r11
            float r10 = (float) r10
            r7.moveTo(r1, r10)
            r1 = r5[r8]
            int r1 = r1 + r9
            int r1 = r1 + r3
            float r10 = (float) r1
            r13 = r5[r12]
            int r13 = r13 + r9
            float r14 = (float) r13
            int r1 = r1 + r16
            float r1 = (float) r1
            int r13 = r13 - r3
            int r13 = r13 - r11
            float r13 = (float) r13
            r7.quadTo(r10, r14, r1, r13)
            r1 = r5[r8]
            int r1 = r1 + r9
            int r1 = r1 + r3
            int r1 = r1 + r11
            float r1 = (float) r1
            r8 = r5[r12]
            int r8 = r8 + r9
            int r8 = r8 + r3
            int r8 = r8 + r11
            float r8 = (float) r8
            r7.lineTo(r1, r8)
            r7.close()
            r15.drawPath(r7, r4)
            int r0 = r0 + 1
            goto L_0x0202
        L_0x02f9:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r1 = "createBitmap %s"
            r4 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            r15 = r2
            goto L_0x0323
        L_0x0308:
            r0 = 1
            r1 = 0
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            com.tencent.mm.sdk.platformtools.MMStack r1 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r1 = r1.toString()
            r2[r0] = r1
            java.lang.String r0 = "result %d %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r2)
            r15 = 0
        L_0x0323:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p189kx.C76640u.mo106916zO(android.content.Context, java.lang.String, int, int, int):android.graphics.Bitmap");
    }
}
