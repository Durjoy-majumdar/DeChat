package com.tencent.p014mm.plugin.gallery.picker.view;

import android.widget.ImageView;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.gallery.picker.view.e */
public final class C4431e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f19163d;

    /* renamed from: e */
    public final /* synthetic */ ImageCropUI f19164e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f19165f;

    /* renamed from: g */
    public final /* synthetic */ C32227p<Integer, Integer, Object> f19166g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4431e(String str, ImageCropUI imageCropUI, ImageView imageView, C32227p<? super Integer, ? super Integer, ? extends Object> pVar) {
        super(0);
        this.f19163d = str;
        this.f19164e = imageCropUI;
        this.f19165f = imageView;
        this.f19166g = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r21 = this;
            r0 = r21
            java.lang.String r1 = r0.f19163d
            r2 = 0
            r3 = 10
            byte[] r1 = com.tencent.p014mm.vfs.C86013q1.m106433O(r1, r2, r3)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r3 = r0.f19164e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((byte[]) r1)
            r3.f19118w = r1
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            boolean r1 = r1.f19118w
            java.lang.String r3 = "ImageCropReport"
            java.lang.String r4 = "MicroMsg.AvatarCropUI"
            if (r1 == 0) goto L_0x0077
            java.lang.Class<bq.g0> r1 = p008bq.C92279g0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            bq.g0 r1 = (p008bq.C92279g0) r1
            java.lang.String r2 = r0.f19163d
            qz1.b r1 = r1.mo126019w(r2, r2)
            r1.start()
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r2 = 30
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.os.Debug$MemoryInfo r5 = p723vf.C90773a.m113836b(r5)
            if (r5 == 0) goto L_0x0051
            int r6 = r5.nativePss
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r10 = (long) r2
            long r12 = (long) r6
            r8 = 1361(0x551, double:6.724E-321)
            r7 = r14
            r7.mo175913w(r8, r10, r12)
            r2 = 31
            int r5 = r5.dalvikPss
            long r10 = (long) r2
            long r12 = (long) r5
            r7.mo175913w(r8, r10, r12)
        L_0x0051:
            r2 = 32
            java.lang.String r5 = "inc: 32"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r9 = (long) r2
            r7 = 1361(0x551, double:6.724E-321)
            r11 = 1
            r6.mo175913w(r7, r9, r11)
            java.lang.String r2 = "emoji preview gif"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            com.tencent.mm.plugin.gallery.picker.view.c r2 = new com.tencent.mm.plugin.gallery.picker.view.c
            android.widget.ImageView r3 = r0.f19165f
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r4 = r0.f19164e
            fy3.p<java.lang.Integer, java.lang.Integer, java.lang.Object> r5 = r0.f19166g
            r2.<init>(r3, r4, r1, r5)
            o40.C61926c.m72668M(r2)
            goto L_0x0352
        L_0x0077:
            java.lang.String r1 = "previewMatting start calculate size"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            int[] r5 = r1.f19119x
            java.lang.String r6 = "mattingImageInfo"
            r7 = 0
            if (r5 == 0) goto L_0x0375
            r5 = r5[r2]
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r1 = r1.mo5346J7()
            int r1 = r1.getWidth()
            r8 = 4
            java.lang.String r9 = "inc: 4"
            r10 = 1
            if (r5 > r1) goto L_0x00ca
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            int[] r5 = r1.f19119x
            if (r5 == 0) goto L_0x00c6
            r5 = r5[r10]
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r1 = r1.mo5346J7()
            int r1 = r1.getHeight()
            if (r5 > r1) goto L_0x00ca
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            int[] r1 = r1.f19119x
            if (r1 == 0) goto L_0x00c2
            r5 = r1[r2]
            r1 = r1[r10]
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r14 = (long) r8
            r12 = 1361(0x551, double:6.724E-321)
            r16 = 1
            r11.mo175913w(r12, r14, r16)
            r3 = r1
        L_0x00bf:
            r1 = 0
            goto L_0x02a2
        L_0x00c2:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x00c6:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x00ca:
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            int[] r1 = r1.f19119x
            if (r1 == 0) goto L_0x0371
            r5 = r1[r2]
            r1 = r1[r10]
            boolean r1 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.isLongVertical(r5, r1)
            r5 = 15
            r11 = 5
            java.lang.String r12 = "inc: 5"
            if (r1 == 0) goto L_0x011b
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            int[] r13 = r1.f19119x
            if (r13 == 0) goto L_0x0117
            r14 = r13[r10]
            r13 = r13[r2]
            int r14 = r14 / r13
            if (r14 > r5) goto L_0x011b
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r1 = r1.mo5346J7()
            int r1 = r1.getWidth()
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r5 = r0.f19164e
            int[] r5 = r5.f19119x
            if (r5 == 0) goto L_0x0113
            r8 = r5[r10]
            int r8 = r8 * r1
            r5 = r5[r2]
            int r8 = r8 / r5
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r11 = (long) r11
            r14 = 1361(0x551, double:6.724E-321)
            r18 = 1
            r16 = r11
            r13.mo175913w(r14, r16, r18)
            r5 = r1
            r1 = r8
            goto L_0x015d
        L_0x0113:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0117:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x011b:
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            int[] r1 = r1.f19119x
            if (r1 == 0) goto L_0x036d
            r13 = r1[r2]
            r1 = r1[r10]
            boolean r1 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.isLongHorizontal(r13, r1)
            if (r1 == 0) goto L_0x016a
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            int[] r13 = r1.f19119x
            if (r13 == 0) goto L_0x0166
            r14 = r13[r2]
            r13 = r13[r10]
            int r14 = r14 / r13
            if (r14 > r5) goto L_0x016a
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r1 = r1.mo5346J7()
            int r1 = r1.getWidth()
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r5 = r0.f19164e
            int[] r5 = r5.f19119x
            if (r5 == 0) goto L_0x0162
            r8 = r5[r2]
            int r8 = r8 * r1
            r5 = r5[r10]
            int r8 = r8 / r5
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r11 = (long) r11
            r14 = 1361(0x551, double:6.724E-321)
            r18 = 1
            r16 = r11
            r13.mo175913w(r14, r16, r18)
            r5 = r8
        L_0x015d:
            r3 = r1
            r1 = 0
            r2 = 1
            goto L_0x02a2
        L_0x0162:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0166:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x016a:
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            int[] r5 = r1.f19119x
            if (r5 == 0) goto L_0x0369
            r12 = r5[r2]
            r5 = r5[r10]
            int r12 = r12 * r5
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r1 = r1.mo5346J7()
            int r1 = r1.getWidth()
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r5 = r0.f19164e
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r5 = r5.mo5346J7()
            int r5 = r5.getHeight()
            int r1 = r1 * r5
            int r12 = r12 / r1
            double r12 = (double) r12
            double r12 = java.lang.Math.sqrt(r12)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            int[] r1 = r1.f19119x
            if (r1 == 0) goto L_0x0365
            r5 = r1[r2]
            r1 = r1[r10]
            boolean r1 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.isLongVertical(r5, r1)
            if (r1 != 0) goto L_0x01c5
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            int[] r1 = r1.f19119x
            if (r1 == 0) goto L_0x01c1
            r5 = r1[r2]
            r1 = r1[r10]
            boolean r1 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.isLongHorizontal(r5, r1)
            if (r1 == 0) goto L_0x01b1
            goto L_0x01c5
        L_0x01b1:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r8 = (long) r8
            r15 = 1361(0x551, double:6.724E-321)
            r19 = 1
            r17 = r8
            r14.mo175913w(r15, r17, r19)
            goto L_0x0228
        L_0x01c1:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x01c5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "inc: "
            r1.append(r5)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r8 = (long) r11
            r15 = 1361(0x551, double:6.724E-321)
            r19 = 1
            r17 = r8
            r14.mo175913w(r15, r17, r19)
            r1 = 6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r1)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r8 = (long) r1
            r15 = 1361(0x551, double:6.724E-321)
            r19 = 1
            r17 = r8
            r14.mo175913w(r15, r17, r19)
            r1 = 28
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r3 = r0.f19164e
            int[] r3 = r3.f19119x
            if (r3 == 0) goto L_0x0361
            r5 = r3[r10]
            float r5 = (float) r5
            r3 = r3[r2]
            float r3 = (float) r3
            float r8 = r5 / r3
            float r3 = r3 / r5
            float r3 = java.lang.Math.max(r8, r3)
            int r3 = (int) r3
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r8 = (long) r1
            long r2 = (long) r3
            r15 = 1361(0x551, double:6.724E-321)
            r17 = r8
            r19 = r2
            r14.mo175913w(r15, r17, r19)
            r2 = 1
        L_0x0228:
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0297
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r3 = r0.f19164e
            int[] r5 = r3.f19119x
            if (r5 == 0) goto L_0x0293
            r8 = r5[r10]
            float r8 = (float) r8
            r1 = 0
            r5 = r5[r1]
            float r5 = (float) r5
            float r8 = r8 / r5
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r3 = r3.mo5346J7()
            int r3 = r3.getHeight()
            float r3 = (float) r3
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r5 = r0.f19164e
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r5 = r5.mo5346J7()
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r3 = r3 / r5
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0274
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r3 = r0.f19164e
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r3 = r3.mo5346J7()
            int r3 = r3.getHeight()
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r5 = r0.f19164e
            int[] r5 = r5.f19119x
            if (r5 == 0) goto L_0x0270
            r1 = 0
            r8 = r5[r1]
            int r8 = r8 * r3
            r5 = r5[r10]
            int r8 = r8 / r5
            r5 = r8
            goto L_0x00bf
        L_0x0270:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0274:
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r3 = r0.f19164e
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r3 = r3.mo5346J7()
            int r3 = r3.getWidth()
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r5 = r0.f19164e
            int[] r5 = r5.f19119x
            if (r5 == 0) goto L_0x028f
            r8 = r5[r10]
            int r8 = r8 * r3
            r1 = 0
            r5 = r5[r1]
            int r8 = r8 / r5
            r5 = r3
            r3 = r8
            goto L_0x02a2
        L_0x028f:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0293:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0297:
            r1 = 0
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r3 = r0.f19164e
            int[] r3 = r3.f19119x
            if (r3 == 0) goto L_0x035d
            r5 = r3[r1]
            r3 = r3[r10]
        L_0x02a2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "emoji preview image width: "
            r8.append(r9)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r9 = r0.f19164e
            int[] r9 = r9.f19119x
            if (r9 == 0) goto L_0x0359
            r9 = r9[r1]
            r8.append(r9)
            java.lang.String r9 = " height: "
            r8.append(r9)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r9 = r0.f19164e
            int[] r9 = r9.f19119x
            if (r9 == 0) goto L_0x0355
            r6 = r9[r10]
            r8.append(r6)
            java.lang.String r6 = " realWidth: "
            r8.append(r6)
            r8.append(r5)
            java.lang.String r6 = " realHeighr: "
            r8.append(r6)
            r8.append(r3)
            java.lang.String r6 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r6 = r0.f19164e
            int r6 = r6.f19117v
            r8 = 270(0x10e, float:3.78E-43)
            r9 = 90
            if (r6 == r9) goto L_0x02ed
            if (r6 != r8) goto L_0x02eb
            goto L_0x02ed
        L_0x02eb:
            r10 = r5
            goto L_0x02ee
        L_0x02ed:
            r10 = r3
        L_0x02ee:
            if (r6 == r9) goto L_0x02f2
            if (r6 != r8) goto L_0x02f3
        L_0x02f2:
            r3 = r5
        L_0x02f3:
            nw1.a r5 = nw1.C11277a.f33206a
            r6 = 14
            r5.mo11334b(r6)
            r6 = 13
            r5.mo11333a(r6)
            java.lang.String r6 = r0.f19163d
            r1 = 0
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r6, r3, r10, r1)
            if (r1 == 0) goto L_0x0311
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r3 = r0.f19164e
            int r3 = r3.f19117v
            float r3 = (float) r3
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r3)
        L_0x0311:
            if (r7 != 0) goto L_0x0324
            r1 = 8
            r5.mo11333a(r1)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            r2 = -1
            r1.setResult(r2)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            r1.finish()
            goto L_0x0352
        L_0x0324:
            java.lang.String r1 = "emoji bitmap decode successful"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19164e
            r1.f19112q = r7
            if (r2 == 0) goto L_0x033a
            r1 = 17
            r5.mo11334b(r1)
            r1 = 16
            r5.mo11333a(r1)
            goto L_0x0344
        L_0x033a:
            r1 = 20
            r5.mo11334b(r1)
            r1 = 19
            r5.mo11333a(r1)
        L_0x0344:
            com.tencent.mm.plugin.gallery.picker.view.d r1 = new com.tencent.mm.plugin.gallery.picker.view.d
            android.widget.ImageView r2 = r0.f19165f
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r3 = r0.f19164e
            fy3.p<java.lang.Integer, java.lang.Integer, java.lang.Object> r4 = r0.f19166g
            r1.<init>(r2, r7, r3, r4)
            o40.C61926c.m72668M(r1)
        L_0x0352:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0355:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0359:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x035d:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0361:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0365:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0369:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x036d:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0371:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0375:
            gy3.C87412m.m108603p(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.picker.view.C4431e.invoke():java.lang.Object");
    }
}
