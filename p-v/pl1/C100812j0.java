package pl1;

import android.graphics.Bitmap;
import q60.C101036c;
import rx3.C13604l;

/* renamed from: pl1.j0 */
public class C100812j0 extends C101036c {
    /* JADX WARNING: type inference failed for: r4v6, types: [android.graphics.Bitmap] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w60.C65941g<android.graphics.Bitmap> mo87424a(r60.C101350i<?> r20, k60.C99102f<?, android.graphics.Bitmap> r21, y60.C102802a r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "targetView"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "reaper"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.String r3 = "input"
            r4 = r22
            gy3.C87412m.m108594g(r4, r3)
            o40.b r3 = new o40.b
            java.lang.String r5 = "ProfileDrawerCoverBitmapProducer"
            r3.<init>(r5)
            java.io.InputStream r7 = r22.mo142542a()
            r4 = 0
            if (r7 == 0) goto L_0x0192
            n60.f r2 = r2.f290573b
            int r8 = r2.f293168f
            int r9 = r2.f293169g
            er1.w3 r2 = er1.C58784w3.f168295a
            r10 = 1
            r11 = 0
            r2.getClass()
            java.lang.Class<ds.n> r2 = p143ds.C97528n.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            r6 = r2
            ds.n r6 = (p143ds.C97528n) r6
            r12 = 1
            android.graphics.Bitmap r13 = r6.mo136634Vf(r7, r8, r9, r10, r11, r12)
            if (r13 == 0) goto L_0x0192
            java.lang.ref.WeakReference<T> r2 = r1.f296896a
            if (r2 != 0) goto L_0x004a
            r2 = r4
            goto L_0x004e
        L_0x004a:
            java.lang.Object r2 = r2.get()
        L_0x004e:
            boolean r5 = r2 instanceof android.view.View
            if (r5 == 0) goto L_0x0055
            android.view.View r2 = (android.view.View) r2
            goto L_0x0056
        L_0x0055:
            r2 = r4
        L_0x0056:
            if (r2 == 0) goto L_0x0060
            r5 = 2131304568(0x7f092078, float:1.8227282E38)
            java.lang.Object r2 = r2.getTag(r5)
            goto L_0x0061
        L_0x0060:
            r2 = r4
        L_0x0061:
            boolean r5 = r2 instanceof java.lang.Integer
            if (r5 == 0) goto L_0x0068
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x0069
        L_0x0068:
            r2 = r4
        L_0x0069:
            if (r2 == 0) goto L_0x0070
            int r2 = r2.intValue()
            goto L_0x0071
        L_0x0070:
            r2 = 0
        L_0x0071:
            java.lang.ref.WeakReference<T> r1 = r1.f296896a
            if (r1 != 0) goto L_0x0077
            r1 = r4
            goto L_0x007b
        L_0x0077:
            java.lang.Object r1 = r1.get()
        L_0x007b:
            boolean r5 = r1 instanceof android.view.View
            if (r5 == 0) goto L_0x0082
            android.view.View r1 = (android.view.View) r1
            goto L_0x0083
        L_0x0082:
            r1 = r4
        L_0x0083:
            if (r1 == 0) goto L_0x008d
            r5 = 2131304569(0x7f092079, float:1.8227284E38)
            java.lang.Object r1 = r1.getTag(r5)
            goto L_0x008e
        L_0x008d:
            r1 = r4
        L_0x008e:
            boolean r5 = r1 instanceof java.lang.String
            if (r5 == 0) goto L_0x0095
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
        L_0x0095:
            if (r4 != 0) goto L_0x0099
            java.lang.String r4 = ""
        L_0x0099:
            r1 = 3
            r5 = 1082130432(0x40800000, float:4.0)
            r6 = 1
            r7 = 2
            if (r6 != r2) goto L_0x00f4
            int r6 = r13.getWidth()
            int r8 = r13.getHeight()
            if (r6 != r8) goto L_0x00c9
            int r1 = r13.getWidth()
            float r1 = (float) r1
            r5 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r5
            r5 = 4
            float r5 = (float) r5
            float r1 = r1 / r5
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            int r5 = r13.getWidth()
            float r5 = (float) r5
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            rx3.l r6 = new rx3.l
            r6.<init>(r1, r5)
            goto L_0x0125
        L_0x00c9:
            int r6 = r13.getWidth()
            int r8 = r13.getHeight()
            if (r6 <= r8) goto L_0x00d8
            rx3.l r6 = r0.mo140266b(r13)
            goto L_0x0125
        L_0x00d8:
            int r6 = r13.getHeight()
            float r6 = (float) r6
            int r8 = r13.getWidth()
            float r8 = (float) r8
            float r8 = r8 * r5
            float r1 = (float) r1
            float r8 = r8 / r1
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x00ef
            rx3.l r6 = r0.mo140268d(r13)
            goto L_0x0125
        L_0x00ef:
            rx3.l r6 = r0.mo140267c(r13)
            goto L_0x0125
        L_0x00f4:
            if (r7 != r2) goto L_0x00fb
            rx3.l r6 = r0.mo140266b(r13)
            goto L_0x0125
        L_0x00fb:
            int r6 = r13.getWidth()
            int r8 = r13.getHeight()
            if (r6 <= r8) goto L_0x010a
            rx3.l r6 = r0.mo140266b(r13)
            goto L_0x0125
        L_0x010a:
            int r6 = r13.getHeight()
            float r6 = (float) r6
            int r8 = r13.getWidth()
            float r8 = (float) r8
            float r8 = r8 * r5
            float r1 = (float) r1
            float r8 = r8 / r1
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0121
            rx3.l r6 = r0.mo140268d(r13)
            goto L_0x0125
        L_0x0121:
            rx3.l r6 = r0.mo140267c(r13)
        L_0x0125:
            A r1 = r6.f38555d
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            B r5 = r6.f38556e
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r6 = r13.getWidth()
            float r6 = (float) r6
            float r6 = r6 - r1
            float r7 = (float) r7
            float r6 = r6 / r7
            int r8 = r13.getHeight()
            float r8 = (float) r8
            float r8 = r8 - r5
            float r8 = r8 / r7
            java.lang.String r7 = r0.f295824a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "feedId:"
            r9.append(r10)
            r9.append(r4)
            java.lang.String r4 = " cardShowStyle:"
            r9.append(r4)
            r9.append(r2)
            java.lang.String r2 = " targetWidth:"
            r9.append(r2)
            r9.append(r1)
            java.lang.String r2 = " targetHeight:"
            r9.append(r2)
            r9.append(r5)
            java.lang.String r2 = " x:"
            r9.append(r2)
            r9.append(r6)
            java.lang.String r2 = " y:"
            r9.append(r2)
            r9.append(r8)
            java.lang.String r2 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            int r14 = (int) r6
            int r15 = (int) r8
            int r1 = (int) r1
            int r2 = (int) r5
            r18 = 1
            r16 = r1
            r17 = r2
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.cropBitmap(r13, r14, r15, r16, r17, r18)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0192:
            r3.mo86838a()
            w60.g r1 = new w60.g
            r1.<init>(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pl1.C100812j0.mo87424a(r60.i, k60.f, y60.a):w60.g");
    }

    /* renamed from: b */
    public final C13604l<Float, Float> mo140266b(Bitmap bitmap) {
        return new C13604l<>(Float.valueOf((float) bitmap.getHeight()), Float.valueOf((float) bitmap.getHeight()));
    }

    /* renamed from: c */
    public final C13604l<Float, Float> mo140267c(Bitmap bitmap) {
        return new C13604l<>(Float.valueOf((((float) bitmap.getHeight()) * 3.0f) / ((float) 4)), Float.valueOf((float) bitmap.getHeight()));
    }

    /* renamed from: d */
    public final C13604l<Float, Float> mo140268d(Bitmap bitmap) {
        return new C13604l<>(Float.valueOf((float) bitmap.getWidth()), Float.valueOf((((float) bitmap.getWidth()) * 4.0f) / ((float) 3)));
    }
}
