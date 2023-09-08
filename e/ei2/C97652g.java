package ei2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import bi2.C92262a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import yh2.C102867i;

/* renamed from: ei2.g */
public final class C97652g implements C97648b {

    /* renamed from: a */
    public final C97649d f286447a;

    /* renamed from: b */
    public final Paint f286448b;

    /* renamed from: c */
    public final Bitmap f286449c;

    /* renamed from: d */
    public final Canvas f286450d;

    /* renamed from: e */
    public Bitmap f286451e;

    /* renamed from: f */
    public Canvas f286452f;

    /* renamed from: g */
    public final Matrix f286453g;

    /* renamed from: h */
    public Bitmap f286454h;

    /* renamed from: i */
    public final C102867i f286455i;

    /* renamed from: j */
    public final Matrix f286456j;

    /* renamed from: k */
    public C97650e f286457k = new C97650e();

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        if ((r14[3] == 0.0f) != false) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0207  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C97652g(ei2.C97649d r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "retrieverData"
            gy3.C87412m.m108594g(r1, r2)
            r19.<init>()
            r0.f286447a = r1
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r0.f286448b = r2
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r0.f286453g = r3
            yh2.i r4 = new yh2.i
            java.util.List<bi2.a> r5 = r1.f286433c
            r4.<init>(r5)
            r0.f286455i = r4
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r0.f286456j = r4
            ei2.e r5 = new ei2.e
            r5.<init>()
            r0.f286457k = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "create StoryFrameRetriever, "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.StoryFrameRetriever"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r5 = 1
            r2.setAntiAlias(r5)
            r2.setFilterBitmap(r5)
            int r2 = r1.f286434d
            int r7 = r1.f286435e
            int r8 = r1.f286438h
            r9 = 270(0x10e, float:3.78E-43)
            r10 = 90
            r11 = 0
            if (r8 == r10) goto L_0x006a
            if (r8 == r9) goto L_0x006a
            int r8 = r1.f286436f
            int r12 = r1.f286437g
            if (r8 <= r12) goto L_0x0068
            r8 = 1
            goto L_0x0078
        L_0x0068:
            r8 = 0
            goto L_0x0078
        L_0x006a:
            int r8 = r1.f286437g
            int r12 = r1.f286436f
            if (r8 <= r12) goto L_0x0072
            r8 = 1
            goto L_0x0073
        L_0x0072:
            r8 = 0
        L_0x0073:
            r18 = r7
            r7 = r2
            r2 = r18
        L_0x0078:
            ei2.e r12 = r0.f286457k
            float[] r13 = r1.f286431a
            float[] r14 = r1.f286432b
            r12.getClass()
            java.lang.String r15 = "drawingRect"
            gy3.C87412m.m108594g(r13, r15)
            r15 = 2
            r9 = 0
            if (r14 == 0) goto L_0x00bf
            int r10 = r14.length
            r13 = 4
            if (r10 == r13) goto L_0x008f
            goto L_0x00bf
        L_0x008f:
            r10 = r14[r11]
            int r10 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r10 != 0) goto L_0x0097
            r10 = 1
            goto L_0x0098
        L_0x0097:
            r10 = 0
        L_0x0098:
            if (r10 == 0) goto L_0x00bd
            r10 = r14[r5]
            int r10 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r10 != 0) goto L_0x00a2
            r10 = 1
            goto L_0x00a3
        L_0x00a2:
            r10 = 0
        L_0x00a3:
            if (r10 == 0) goto L_0x00bd
            r10 = r14[r15]
            int r10 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r10 != 0) goto L_0x00ad
            r10 = 1
            goto L_0x00ae
        L_0x00ad:
            r10 = 0
        L_0x00ae:
            if (r10 == 0) goto L_0x00bd
            r10 = 3
            r13 = r14[r10]
            int r10 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r10 != 0) goto L_0x00b9
            r10 = 1
            goto L_0x00ba
        L_0x00b9:
            r10 = 0
        L_0x00ba:
            if (r10 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r10 = 1
            goto L_0x00c0
        L_0x00bf:
            r10 = 0
        L_0x00c0:
            if (r10 == 0) goto L_0x00e4
            gy3.C87412m.m108591d(r14)
            r10 = r14[r5]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "topOffset :"
            r13.append(r14)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "MicroMsg.RetrieverTransform"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            android.graphics.Matrix r12 = r12.f286442b
            float r10 = -r10
            r12.postTranslate(r9, r10)
        L_0x00e4:
            boolean r10 = r19.mo136909b()
            r12 = 1132920832(0x43870000, float:270.0)
            r13 = 180(0xb4, float:2.52E-43)
            r14 = 1119092736(0x42b40000, float:90.0)
            r17 = 1135869952(0x43b40000, float:360.0)
            java.lang.String r11 = "scale:"
            if (r10 == 0) goto L_0x0207
            int r2 = r1.f286434d
            int r7 = r1.f286435e
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r7, r10)
            java.lang.String r7 = "createBitmap(retrieverDa… Bitmap.Config.ARGB_8888)"
            gy3.C87412m.m108593f(r2, r7)
            r0.f286449c = r2
            int r2 = r1.f286434d
            int r7 = r1.f286435e
            float[] r10 = r1.f286431a
            r5 = r10[r15]
            r16 = 3
            r10 = r10[r16]
            float r2 = r0.mo136910c(r2, r7, r5, r10)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r4.postScale(r2, r2)
            boolean r2 = r1.f286439i
            if (r2 == 0) goto L_0x018a
            if (r8 == 0) goto L_0x018a
            int r2 = r1.f286438h
            r4 = 90
            if (r2 == r4) goto L_0x013d
            r4 = 270(0x10e, float:3.78E-43)
            if (r2 == r4) goto L_0x013d
            if (r2 != r13) goto L_0x018a
        L_0x013d:
            int r2 = r1.f286435e
            int r4 = r1.f286434d
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r4, r5)
            r0.f286451e = r2
            android.graphics.Canvas r2 = new android.graphics.Canvas
            android.graphics.Bitmap r4 = r0.f286451e
            gy3.C87412m.m108591d(r4)
            r2.<init>(r4)
            r0.f286452f = r2
            int r2 = r1.f286438h
            float r2 = (float) r2
            float r2 = r17 - r2
            r3.postRotate(r2)
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x0163
            r4 = 1
            goto L_0x0164
        L_0x0163:
            r4 = 0
        L_0x0164:
            if (r4 == 0) goto L_0x0174
            android.graphics.Canvas r2 = r0.f286452f
            gy3.C87412m.m108591d(r2)
            int r2 = r2.getWidth()
            float r2 = (float) r2
            r3.postTranslate(r2, r9)
            goto L_0x018a
        L_0x0174:
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x017a
            r2 = 1
            goto L_0x017b
        L_0x017a:
            r2 = 0
        L_0x017b:
            if (r2 == 0) goto L_0x018a
            android.graphics.Canvas r2 = r0.f286452f
            gy3.C87412m.m108591d(r2)
            int r2 = r2.getHeight()
            float r2 = (float) r2
            r3.postTranslate(r9, r2)
        L_0x018a:
            java.lang.String r2 = r1.f286440j
            int r3 = r1.f286435e
            int r4 = r1.f286434d
            r5 = 1
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r2, r3, r4, r5)
            if (r2 == 0) goto L_0x02de
            int r3 = r1.f286434d
            float r3 = (float) r3
            int r4 = r2.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r4 = r1.f286435e
            float r4 = (float) r4
            int r6 = r2.getHeight()
            float r6 = (float) r6
            float r4 = r4 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 != 0) goto L_0x01b1
            r7 = 1
            goto L_0x01b2
        L_0x01b1:
            r7 = 0
        L_0x01b2:
            if (r7 == 0) goto L_0x01c0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x01b9
            goto L_0x01ba
        L_0x01b9:
            r5 = 0
        L_0x01ba:
            if (r5 != 0) goto L_0x01bd
            goto L_0x01c0
        L_0x01bd:
            r0.f286454h = r2
            goto L_0x01f2
        L_0x01c0:
            float r5 = java.lang.Math.max(r3, r4)
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(r2, r9, r5, r5)
            int r5 = r2.getWidth()
            int r6 = r2.getHeight()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x01e1
            int r3 = r2.getWidth()
            int r4 = r1.f286434d
            int r3 = r3 - r4
            int r3 = r3 / r15
            int r5 = r3 + r4
            r11 = r3
            r3 = 0
            goto L_0x01ec
        L_0x01e1:
            int r3 = r2.getHeight()
            int r4 = r1.f286435e
            int r3 = r3 - r4
            int r3 = r3 / r15
            int r6 = r3 + r4
            r11 = 0
        L_0x01ec:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r11, r3, r5, r6)
            r0.f286454h = r2
        L_0x01f2:
            boolean r2 = r1.f286439i
            if (r2 == 0) goto L_0x02de
            int r1 = r1.f286438h
            if (r1 == 0) goto L_0x02de
            android.graphics.Bitmap r2 = r0.f286454h
            float r1 = (float) r1
            float r1 = r17 - r1
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r2, r1)
            r0.f286454h = r1
            goto L_0x02de
        L_0x0207:
            boolean r8 = r1.f286439i
            if (r8 == 0) goto L_0x0291
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r2, r7, r8)
            java.lang.String r10 = "createBitmap(realWidth, … Bitmap.Config.ARGB_8888)"
            gy3.C87412m.m108593f(r8, r10)
            r0.f286449c = r8
            int r8 = r1.f286438h
            r10 = 90
            if (r8 == r10) goto L_0x0224
            r10 = 270(0x10e, float:3.78E-43)
            if (r8 == r10) goto L_0x0224
            if (r8 != r13) goto L_0x0270
        L_0x0224:
            int r8 = r1.f286434d
            int r10 = r1.f286435e
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r10, r13)
            r0.f286451e = r8
            android.graphics.Canvas r8 = new android.graphics.Canvas
            android.graphics.Bitmap r10 = r0.f286451e
            gy3.C87412m.m108591d(r10)
            r8.<init>(r10)
            r0.f286452f = r8
            int r8 = r1.f286438h
            float r8 = (float) r8
            float r8 = r17 - r8
            r3.postRotate(r8)
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x024a
            r10 = 1
            goto L_0x024b
        L_0x024a:
            r10 = 0
        L_0x024b:
            if (r10 == 0) goto L_0x025b
            android.graphics.Canvas r5 = r0.f286452f
            gy3.C87412m.m108591d(r5)
            int r5 = r5.getWidth()
            float r5 = (float) r5
            r3.postTranslate(r5, r9)
            goto L_0x0270
        L_0x025b:
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x0260
            goto L_0x0261
        L_0x0260:
            r5 = 0
        L_0x0261:
            if (r5 == 0) goto L_0x0270
            android.graphics.Canvas r5 = r0.f286452f
            gy3.C87412m.m108591d(r5)
            int r5 = r5.getHeight()
            float r5 = (float) r5
            r3.postTranslate(r9, r5)
        L_0x0270:
            float[] r1 = r1.f286431a
            r3 = r1[r15]
            r5 = 3
            r1 = r1[r5]
            float r1 = r0.mo136910c(r2, r7, r3, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r4.postScale(r1, r1)
            goto L_0x02de
        L_0x0291:
            int r2 = r1.f286434d
            int r3 = r1.f286435e
            int r2 = java.lang.Math.min(r2, r3)
            int r3 = r1.f286434d
            int r5 = r1.f286435e
            int r3 = java.lang.Math.max(r3, r5)
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r5)
            java.lang.String r3 = "createBitmap(Math.min(re… Bitmap.Config.ARGB_8888)"
            gy3.C87412m.m108593f(r2, r3)
            r0.f286449c = r2
            int r2 = r1.f286434d
            int r3 = r1.f286435e
            int r2 = java.lang.Math.min(r2, r3)
            int r3 = r1.f286434d
            int r5 = r1.f286435e
            int r3 = java.lang.Math.max(r3, r5)
            float[] r1 = r1.f286431a
            r5 = r1[r15]
            r7 = 3
            r1 = r1[r7]
            float r1 = r0.mo136910c(r2, r3, r5, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r4.postScale(r1, r1)
        L_0x02de:
            android.graphics.Canvas r1 = new android.graphics.Canvas
            android.graphics.Bitmap r2 = r0.f286449c
            r1.<init>(r2)
            r0.f286450d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ei2.C97652g.<init>(ei2.d):void");
    }

    /* renamed from: a */
    public C58605a mo126334a() {
        long j;
        if (this.f286447a.f286433c.size() == 0) {
            return null;
        }
        int save = this.f286450d.save();
        this.f286450d.drawColor(0, PorterDuff.Mode.MULTIPLY);
        this.f286450d.concat(this.f286456j);
        C97650e eVar = this.f286457k;
        Canvas canvas = this.f286450d;
        eVar.getClass();
        C87412m.m108594g(canvas, "canvas");
        eVar.f286441a = canvas.save();
        canvas.concat(eVar.f286442b);
        try {
            j = this.f286455i.mo142583a(this.f286450d, this.f286448b);
        } catch (Exception unused) {
            j = MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        C97650e eVar2 = this.f286457k;
        Canvas canvas2 = this.f286450d;
        eVar2.getClass();
        C87412m.m108594g(canvas2, "canvas");
        int i = eVar2.f286441a;
        if (i < 1) {
            Log.m105928w("MicroMsg.RetrieverTransform", "canvas restore saveCount: " + eVar2.f286441a);
        } else {
            canvas2.restoreToCount(i);
        }
        if (save < 1) {
            Log.m105928w("MicroMsg.StoryFrameRetriever", "canvas restore saveCount: " + save);
        } else {
            this.f286450d.restoreToCount(save);
        }
        Canvas canvas3 = this.f286452f;
        if (canvas3 == null || this.f286451e == null) {
            return new C58605a(this.f286449c, j);
        }
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.MULTIPLY);
        }
        Canvas canvas4 = this.f286452f;
        if (canvas4 != null) {
            canvas4.save();
        }
        Canvas canvas5 = this.f286452f;
        C87412m.m108591d(canvas5);
        canvas5.drawBitmap(this.f286449c, this.f286453g, (Paint) null);
        Canvas canvas6 = this.f286452f;
        if (canvas6 != null) {
            canvas6.restore();
        }
        Bitmap bitmap = this.f286451e;
        C87412m.m108591d(bitmap);
        return new C58605a(bitmap, j);
    }

    /* renamed from: b */
    public final boolean mo136909b() {
        return (this.f286447a.f286440j.length() > 0) && C86013q1.m106450k(this.f286447a.f286440j);
    }

    /* renamed from: c */
    public final float mo136910c(int i, int i2, float f, float f2) {
        float f3 = ((float) i) / f;
        float f4 = ((float) i2) / f2;
        int i3 = (f3 > f4 ? 1 : (f3 == f4 ? 0 : -1));
        if ((i3 == 0) || i > i2) {
            return f3;
        }
        if (i3 < 0) {
            return f4;
        }
        if (f3 > f4) {
            return f3;
        }
        return 1.0f;
    }

    /* renamed from: d */
    public final void mo136911d() {
        try {
            for (C92262a b : this.f286447a.f286433c) {
                b.mo126256b();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.StoryFrameRetriever", e, "destroy error", new Object[0]);
        }
    }

    /* renamed from: e */
    public final void mo136912e() {
        try {
            for (C92262a d : this.f286447a.f286433c) {
                d.mo126258d();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.StoryFrameRetriever", e, "start error", new Object[0]);
        }
    }
}
