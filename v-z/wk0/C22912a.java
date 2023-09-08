package wk0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.QbarNative;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import it3.C21134a;
import java.util.HashSet;
import java.util.Iterator;
import p200lx.C34401j0;
import wk0.C22914c;

/* renamed from: wk0.a */
public class C22912a extends C22914c {

    /* renamed from: d */
    public String f65868d;

    /* renamed from: e */
    public C21134a f65869e = ((C34401j0) C86312j.m106911c(C34401j0.class)).ar0("MicroMsg.appbrand.ScanQBarDecoder");

    /* renamed from: f */
    public Object f65870f = new Object();

    /* renamed from: g */
    public volatile boolean f65871g = false;

    /* renamed from: h */
    public byte[] f65872h;

    /* renamed from: i */
    public byte[] f65873i;

    public C22912a(C22914c.C22917c cVar, String str) {
        super(cVar);
        this.f65868d = str;
    }

    /* renamed from: b */
    public int[] mo36091b(String str) {
        HashSet hashSet = new HashSet();
        if (str.contains("barcode")) {
            hashSet.add(1);
        }
        if (str.contains("qrcode")) {
            hashSet.add(2);
        }
        hashSet.add(4);
        int[] iArr = new int[hashSet.size()];
        int i = 0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num != null) {
                iArr[i] = num.intValue();
                i++;
            }
        }
        return iArr;
    }

    /* renamed from: c */
    public final void mo36092c() {
        synchronized (this.f65870f) {
            if (this.f65871g) {
                C21134a aVar = this.f65869e;
                if (aVar != null) {
                    aVar.mo33090g();
                }
                this.f65869e = null;
                this.f65871g = false;
                Log.m105918d("MicroMsg.appbrand.ScanQBarDecoder", "QbarNative.Release()");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Rect mo36093d(android.graphics.Rect r10, android.graphics.Point r11, int r12, int r13, int r14, int r15) {
        /*
            r9 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r1 = r10.left
            int r2 = r10.top
            int r3 = r10.right
            int r10 = r10.bottom
            r4 = 270(0x10e, float:3.78E-43)
            r5 = 90
            r6 = 0
            if (r11 == 0) goto L_0x0049
            if (r14 == r5) goto L_0x002e
            if (r14 != r4) goto L_0x0019
            goto L_0x002e
        L_0x0019:
            int r7 = r11.y
            int r8 = r13 - r7
            if (r8 > 0) goto L_0x0021
            r7 = 0
            goto L_0x0023
        L_0x0021:
            int r7 = r13 - r7
        L_0x0023:
            int r11 = r11.x
            int r8 = r12 - r11
            if (r8 > 0) goto L_0x002b
        L_0x0029:
            r11 = 0
            goto L_0x0041
        L_0x002b:
            int r11 = r12 - r11
            goto L_0x0041
        L_0x002e:
            int r7 = r11.y
            int r8 = r12 - r7
            if (r8 > 0) goto L_0x0036
            r7 = 0
            goto L_0x0038
        L_0x0036:
            int r7 = r12 - r7
        L_0x0038:
            int r11 = r11.x
            int r8 = r13 - r11
            if (r8 > 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            int r11 = r13 - r11
        L_0x0041:
            r8 = 1
            if (r15 != r8) goto L_0x004b
            int r11 = r11 / 2
            int r7 = r7 / 2
            goto L_0x004b
        L_0x0049:
            r11 = 0
            r7 = 0
        L_0x004b:
            if (r14 == 0) goto L_0x00b5
            if (r14 == r5) goto L_0x009a
            r15 = 180(0xb4, float:2.52E-43)
            if (r14 == r15) goto L_0x0072
            if (r14 == r4) goto L_0x0057
            goto L_0x00c1
        L_0x0057:
            int r2 = r2 + r7
            r0.left = r2
            int r12 = r13 - r3
            int r12 = r12 - r11
            r0.top = r12
            if (r12 >= 0) goto L_0x0062
            r12 = 0
        L_0x0062:
            r0.top = r12
            int r10 = r10 + r7
            r0.right = r10
            int r13 = r13 - r1
            int r13 = r13 - r11
            r0.bottom = r13
            if (r13 >= 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r6 = r13
        L_0x006f:
            r0.bottom = r6
            goto L_0x00c1
        L_0x0072:
            int r14 = r12 - r3
            int r14 = r14 - r11
            r0.left = r14
            if (r14 >= 0) goto L_0x007a
            r14 = 0
        L_0x007a:
            r0.left = r14
            int r10 = r13 - r10
            int r10 = r10 - r7
            r0.top = r10
            if (r10 >= 0) goto L_0x0084
            r10 = 0
        L_0x0084:
            r0.top = r10
            int r12 = r12 - r1
            int r12 = r12 - r11
            r0.right = r12
            if (r12 >= 0) goto L_0x008d
            r12 = 0
        L_0x008d:
            r0.right = r12
            int r13 = r13 - r2
            int r13 = r13 - r7
            r0.bottom = r13
            if (r13 >= 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r6 = r13
        L_0x0097:
            r0.bottom = r6
            goto L_0x00c1
        L_0x009a:
            int r10 = r12 - r10
            int r10 = r10 - r7
            r0.left = r10
            if (r10 >= 0) goto L_0x00a2
            r10 = 0
        L_0x00a2:
            r0.left = r10
            int r1 = r1 + r11
            r0.top = r1
            int r12 = r12 - r2
            int r12 = r12 - r7
            r0.right = r12
            if (r12 >= 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r6 = r12
        L_0x00af:
            r0.right = r6
            int r3 = r3 + r11
            r0.bottom = r3
            goto L_0x00c1
        L_0x00b5:
            int r1 = r1 + r11
            r0.left = r1
            int r2 = r2 + r7
            r0.top = r2
            int r3 = r3 + r11
            r0.right = r3
            int r10 = r10 + r7
            r0.bottom = r10
        L_0x00c1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wk0.C22912a.mo36093d(android.graphics.Rect, android.graphics.Point, int, int, int, int):android.graphics.Rect");
    }

    /* renamed from: e */
    public final void mo36094e(QbarNative.QBarPoint qBarPoint, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        QbarNative.QBarPoint qBarPoint2 = qBarPoint;
        int i8 = i5;
        if (qBarPoint2 != null) {
            if (i8 == 90 || i8 == 270) {
                i6 = i;
                i7 = i2;
            } else {
                i7 = i;
                i6 = i2;
            }
            float f = qBarPoint2.f56815x0;
            float f2 = qBarPoint2.f56816x1;
            float f3 = qBarPoint2.f56817x2;
            float f4 = qBarPoint2.f56818x3;
            float f5 = qBarPoint2.f56819y0;
            float f6 = qBarPoint2.f56820y1;
            float f7 = qBarPoint2.f56821y2;
            float f8 = qBarPoint2.f56822y3;
            int i9 = 360 - ((i8 * 2) % v2helper.VOIP_ENC_HEIGHT_LV1);
            if (i9 == 90) {
                float f9 = (float) i7;
                qBarPoint2.f56815x0 = f9 - f4;
                qBarPoint2.f56816x1 = f9 - f;
                qBarPoint2.f56817x2 = f9 - f2;
                qBarPoint2.f56818x3 = f9 - f3;
                qBarPoint2.f56819y0 = f8;
                qBarPoint2.f56820y1 = f5;
                qBarPoint2.f56821y2 = f6;
                qBarPoint2.f56822y3 = f7;
            } else if (i9 == 180) {
                float f15 = (float) i7;
                qBarPoint2.f56815x0 = f15 - f3;
                qBarPoint2.f56816x1 = f15 - f4;
                qBarPoint2.f56817x2 = f15 - f;
                qBarPoint2.f56818x3 = f15 - f2;
                float f16 = (float) i6;
                qBarPoint2.f56819y0 = f16 - f7;
                qBarPoint2.f56820y1 = f16 - f8;
                qBarPoint2.f56821y2 = f16 - f5;
                qBarPoint2.f56822y3 = f16 - f6;
            } else if (i9 == 270) {
                qBarPoint2.f56815x0 = f2;
                qBarPoint2.f56816x1 = f3;
                qBarPoint2.f56817x2 = f4;
                qBarPoint2.f56818x3 = f;
                float f17 = (float) i6;
                qBarPoint2.f56819y0 = f17 - f6;
                qBarPoint2.f56820y1 = f17 - f7;
                qBarPoint2.f56821y2 = f17 - f8;
                qBarPoint2.f56822y3 = f17 - f5;
            }
            float max = Math.max((((float) i4) * 1.0f) / ((float) i6), (((float) i3) * 1.0f) / ((float) i7));
            qBarPoint2.f56815x0 *= max;
            qBarPoint2.f56816x1 *= max;
            qBarPoint2.f56817x2 *= max;
            qBarPoint2.f56818x3 *= max;
            qBarPoint2.f56819y0 *= max;
            qBarPoint2.f56820y1 *= max;
            qBarPoint2.f56821y2 *= max;
            qBarPoint2.f56822y3 *= max;
        }
    }
}
