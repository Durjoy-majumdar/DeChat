package bt1;

import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: bt1.l */
public final class C54575l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54585t f153029d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f153030e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54575l(C54585t tVar, C8479f0<String> f0Var) {
        super(0);
        this.f153029d = tVar;
        this.f153030e = f0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0102, code lost:
        r5 = r4.f186904i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r13 = this;
            bt1.t r0 = r13.f153029d
            te3.zy r1 = r0.f153060p
            if (r1 == 0) goto L_0x0028
            java.util.LinkedList<te3.hi4> r1 = r1.f186899d
            if (r1 == 0) goto L_0x0028
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r1.next()
            te3.hi4 r2 = (te3.hi4) r2
            if (r2 == 0) goto L_0x000e
            java.lang.String r2 = r2.f183504d
            java.lang.String r3 = "track.path"
            gy3.C87412m.m108593f(r2, r3)
            bt1.C54585t.m61347j(r0, r2)
            goto L_0x000e
        L_0x0028:
            bt1.t r0 = r13.f153029d
            java.lang.String r0 = r0.f153062r
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "Finder.PostVideoWidget"
            if (r0 == 0) goto L_0x0096
            bt1.t r0 = r13.f153029d
            te3.zy r2 = r0.f153060p
            if (r2 == 0) goto L_0x0096
            bt1.c r3 = r0.f153046B     // Catch:{ all -> 0x0081 }
            te3.nr3 r2 = r3.mo75447b(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = r2.f184541d     // Catch:{ all -> 0x0081 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0081 }
            if (r3 != 0) goto L_0x0096
            java.lang.String r3 = r2.f184541d     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "coverInfo.coverUrl"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ all -> 0x0081 }
            r0.f153062r = r3     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = r2.f184542e     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "coverInfo.fullCoverUrl"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ all -> 0x0081 }
            r0.f153063s = r3     // Catch:{ all -> 0x0081 }
            int r3 = r2.f184543f     // Catch:{ all -> 0x0081 }
            r0.f153064t = r3     // Catch:{ all -> 0x0081 }
            r0.f153069y = r2     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "initFakeVideoLogic replace cover quality:"
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            int r3 = r0.f153064t     // Catch:{ all -> 0x0081 }
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = " path:"
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = r0.f153062r     // Catch:{ all -> 0x0081 }
            r2.append(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0081 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)     // Catch:{ all -> 0x0081 }
            goto L_0x0096
        L_0x0081:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "initFakeVideoLogic replace cover e:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
        L_0x0096:
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            bt1.t r2 = r13.f153029d
            java.lang.String r2 = r2.f153062r
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x00af
            bt1.t r2 = r13.f153029d
            java.lang.String r2 = r2.f153062r
            android.graphics.Bitmap r2 = com.tencent.p014mm.graphics.MMBitmapFactory.m98734c(r2)
            r0.f27484d = r2
        L_0x00af:
            T r2 = r0.f27484d
            if (r2 != 0) goto L_0x01c3
            gy3.f0<java.lang.String> r2 = r13.f153030e
            T r2 = r2.f27484d
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r3 = 0
            if (r2 != 0) goto L_0x00cd
            gy3.f0<java.lang.String> r2 = r13.f153030e
            T r2 = r2.f27484d
            java.lang.String r2 = (java.lang.String) r2
            android.graphics.Bitmap r2 = com.tencent.p014mm.graphics.MMBitmapFactory.m98734c(r2)
            r0.f27484d = r2
            goto L_0x00fb
        L_0x00cd:
            bt1.t r2 = r13.f153029d
            te3.zy r2 = r2.f153060p
            if (r2 == 0) goto L_0x00fb
            java.util.LinkedList<te3.hi4> r2 = r2.f186899d
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r2 = sx3.C110818d0.m150917O(r2, r3)
            te3.hi4 r2 = (te3.hi4) r2
            if (r2 == 0) goto L_0x00fb
            java.lang.String r2 = r2.f183504d
            if (r2 == 0) goto L_0x00fb
            bt1.t r4 = r13.f153029d
            java.lang.String r5 = "initFakeVideoLogic: get thumb from composition info"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            uq1.e r5 = uq1.C65433e.f188292a
            java.lang.String r2 = r5.mo89557h(r2)
            java.lang.String r4 = r4.f153062r
            com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            android.graphics.Bitmap r2 = com.tencent.p014mm.graphics.MMBitmapFactory.m98734c(r2)
            r0.f27484d = r2
        L_0x00fb:
            r2 = 0
            bt1.t r4 = r13.f153029d     // Catch:{ Exception -> 0x016f }
            te3.zy r4 = r4.f153060p     // Catch:{ Exception -> 0x016f }
            if (r4 == 0) goto L_0x0109
            te3.az r5 = r4.f186904i     // Catch:{ Exception -> 0x016f }
            if (r5 == 0) goto L_0x0109
            te3.n93 r5 = r5.f297915z     // Catch:{ Exception -> 0x016f }
            goto L_0x010a
        L_0x0109:
            r5 = r2
        L_0x010a:
            if (r5 == 0) goto L_0x0110
            T r2 = r0.f27484d     // Catch:{ Exception -> 0x016f }
            goto L_0x0188
        L_0x0110:
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L_0x0120
            te3.az r4 = r4.f186904i     // Catch:{ Exception -> 0x016f }
            if (r4 == 0) goto L_0x0120
            int r4 = r4.f297901i     // Catch:{ Exception -> 0x016f }
            float r4 = (float) r4     // Catch:{ Exception -> 0x016f }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x016f }
            goto L_0x0121
        L_0x0120:
            r4 = r2
        L_0x0121:
            bt1.t r6 = r13.f153029d     // Catch:{ Exception -> 0x016f }
            te3.zy r6 = r6.f153060p     // Catch:{ Exception -> 0x016f }
            if (r6 == 0) goto L_0x0133
            te3.az r6 = r6.f186904i     // Catch:{ Exception -> 0x016f }
            if (r6 == 0) goto L_0x0133
            int r6 = r6.f297897e     // Catch:{ Exception -> 0x016f }
            float r6 = (float) r6     // Catch:{ Exception -> 0x016f }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ Exception -> 0x016f }
            goto L_0x0134
        L_0x0133:
            r6 = r2
        L_0x0134:
            if (r4 == 0) goto L_0x0142
            if (r6 == 0) goto L_0x0142
            float r5 = r6.floatValue()     // Catch:{ Exception -> 0x016f }
            float r4 = r4.floatValue()     // Catch:{ Exception -> 0x016f }
            float r5 = r4 / r5
        L_0x0142:
            bt1.t r4 = r13.f153029d     // Catch:{ Exception -> 0x016f }
            android.graphics.Rect r4 = r4.f153067w     // Catch:{ Exception -> 0x016f }
            if (r4 == 0) goto L_0x0188
            T r6 = r0.f27484d     // Catch:{ Exception -> 0x016f }
            r7 = r6
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ Exception -> 0x016f }
            int r6 = r4.left     // Catch:{ Exception -> 0x016f }
            float r6 = (float) r6     // Catch:{ Exception -> 0x016f }
            float r6 = r6 * r5
            int r8 = (int) r6     // Catch:{ Exception -> 0x016f }
            int r6 = r4.top     // Catch:{ Exception -> 0x016f }
            float r6 = (float) r6     // Catch:{ Exception -> 0x016f }
            float r6 = r6 * r5
            int r9 = (int) r6     // Catch:{ Exception -> 0x016f }
            int r6 = r4.width()     // Catch:{ Exception -> 0x016f }
            float r6 = (float) r6     // Catch:{ Exception -> 0x016f }
            float r6 = r6 * r5
            int r10 = (int) r6     // Catch:{ Exception -> 0x016f }
            int r4 = r4.height()     // Catch:{ Exception -> 0x016f }
            float r4 = (float) r4     // Catch:{ Exception -> 0x016f }
            float r4 = r4 * r5
            int r11 = (int) r4     // Catch:{ Exception -> 0x016f }
            r12 = 0
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.cropBitmap(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x016f }
            goto L_0x0188
        L_0x016f:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "generate halfThumb fail:"
            r5.append(r6)
            java.lang.String r4 = r4.getLocalizedMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r4)
        L_0x0188:
            if (r2 == 0) goto L_0x01c3
            bt1.t r1 = r13.f153029d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class<tz.f> r5 = p707tz.C65000f.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            tz.f r5 = (p707tz.C65000f) r5
            java.lang.String r5 = r5.ca0()
            r4.append(r5)
            java.lang.String r5 = "vsg_half_thumb_"
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.f153066v = r4
            r1 = r2
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r4 = 60
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG
            bt1.t r6 = r13.f153029d
            java.lang.String r6 = r6.f153066v
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r1, r4, r5, r6, r3)
            r0.f27484d = r2
        L_0x01c3:
            T r1 = r0.f27484d
            if (r1 == 0) goto L_0x01d1
            bt1.k r1 = new bt1.k
            bt1.t r2 = r13.f153029d
            r1.<init>(r0, r2)
            o40.C61926c.m72668M(r1)
        L_0x01d1:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54575l.invoke():java.lang.Object");
    }
}
