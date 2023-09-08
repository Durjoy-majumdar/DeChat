package com.tencent.p014mm.plugin.gallery.picker.view;

import android.widget.ImageView;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.gallery.picker.view.b */
public final class C4428b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f19151d;

    /* renamed from: e */
    public final /* synthetic */ ImageCropUI f19152e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f19153f;

    /* renamed from: g */
    public final /* synthetic */ C32227p<Integer, Integer, Object> f19154g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4428b(String str, ImageCropUI imageCropUI, ImageView imageView, C32227p<? super Integer, ? super Integer, ? extends Object> pVar) {
        super(0);
        this.f19151d = str;
        this.f19152e = imageCropUI;
        this.f19153f = imageView;
        this.f19154g = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0153  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r24 = this;
            r0 = r24
            java.lang.String r1 = "MicroMsg.AvatarCropUI"
            java.lang.String r2 = "enter defaultImageContentCreator"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.String r2 = r0.f19151d
            android.graphics.BitmapFactory$Options r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r2)
            java.lang.String r3 = "ImageCropReport"
            r5 = 0
            r6 = 1280(0x500, float:1.794E-42)
            r7 = 0
            if (r2 == 0) goto L_0x012b
            int r8 = r2.outWidth
            if (r8 <= 0) goto L_0x0021
            int r8 = r2.outHeight
            if (r8 <= 0) goto L_0x0021
            r8 = 1
            goto L_0x0022
        L_0x0021:
            r8 = 0
        L_0x0022:
            if (r8 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = r7
        L_0x0026:
            if (r2 == 0) goto L_0x012b
            int r7 = r2.outWidth
            int r2 = r2.outHeight
            int r8 = r7 * r2
            r9 = 1638400(0x190000, float:2.295887E-39)
            int r9 = r9 / r8
            double r8 = (double) r9
            double r8 = java.lang.Math.sqrt(r8)
            java.lang.String r10 = "defaultImageContentCreator start calculate size"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12 = 4
            java.lang.String r13 = "inc: 4"
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x0057
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r8 = (long) r12
            r16 = 1361(0x551, double:6.724E-321)
            r20 = 1
            r18 = r8
            r15.mo175913w(r16, r18, r20)
            r6 = r7
            r4 = 0
            goto L_0x0128
        L_0x0057:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.isLongVertical(r7, r2)
            r11 = 1097859072(0x41700000, float:15.0)
            r14 = 5
            java.lang.String r15 = "inc: 5"
            if (r10 == 0) goto L_0x007c
            float r10 = (float) r2
            float r4 = (float) r7
            float r10 = r10 / r4
            int r4 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x007c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r15)
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r8 = (long) r14
            r18 = 1361(0x551, double:6.724E-321)
            r22 = 1
            r20 = r8
            r17.mo175913w(r18, r20, r22)
            int r2 = r2 * 1280
            int r2 = r2 / r7
            goto L_0x009e
        L_0x007c:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.isLongHorizontal(r7, r2)
            if (r4 == 0) goto L_0x00a1
            float r4 = (float) r7
            float r10 = (float) r2
            float r4 = r4 / r10
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x00a1
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r15)
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r8 = (long) r14
            r18 = 1361(0x551, double:6.724E-321)
            r22 = 1
            r20 = r8
            r17.mo175913w(r18, r20, r22)
            int r7 = r7 * 1280
            int r7 = r7 / r2
            r6 = r7
            r2 = 1280(0x500, float:1.794E-42)
        L_0x009e:
            r4 = 1
            goto L_0x0128
        L_0x00a1:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.isLongVertical(r7, r2)
            if (r4 != 0) goto L_0x00bf
            boolean r4 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.isLongHorizontal(r7, r2)
            if (r4 == 0) goto L_0x00ae
            goto L_0x00bf
        L_0x00ae:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r10 = (long) r12
            r18 = 1361(0x551, double:6.724E-321)
            r22 = 1
            r20 = r10
            r17.mo175913w(r18, r20, r22)
            r4 = 0
            goto L_0x0118
        L_0x00bf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "inc: "
            r4.append(r10)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r11 = (long) r14
            r18 = 1361(0x551, double:6.724E-321)
            r22 = 1
            r20 = r11
            r17.mo175913w(r18, r20, r22)
            r4 = 6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r4)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r10 = (long) r4
            r18 = 1361(0x551, double:6.724E-321)
            r22 = 1
            r20 = r10
            r17.mo175913w(r18, r20, r22)
            r4 = 28
            float r10 = (float) r2
            float r11 = (float) r7
            float r12 = r10 / r11
            float r11 = r11 / r10
            float r10 = java.lang.Math.max(r12, r11)
            int r10 = (int) r10
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r11 = (long) r4
            long r13 = (long) r10
            r18 = 1361(0x551, double:6.724E-321)
            r20 = r11
            r22 = r13
            r17.mo175913w(r18, r20, r22)
            r4 = 1
        L_0x0118:
            double r10 = (double) r7
            double r10 = r10 * r8
            int r7 = (int) r10
            double r10 = (double) r2
            double r8 = r8 * r10
            int r2 = (int) r8
            if (r7 >= r6) goto L_0x0127
            if (r2 >= r6) goto L_0x0127
            r2 = 1280(0x500, float:1.794E-42)
            goto L_0x0128
        L_0x0127:
            r6 = r7
        L_0x0128:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            goto L_0x012e
        L_0x012b:
            r2 = 1280(0x500, float:1.794E-42)
            r4 = 0
        L_0x012e:
            r8 = -1
            r9 = 8
            if (r7 != 0) goto L_0x0153
            java.lang.String r2 = "preview error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            java.lang.String r1 = "inc: 8"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r13 = (long) r9
            r11 = 1361(0x551, double:6.724E-321)
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19152e
            r1.setResult(r8)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19152e
            r1.finish()
            goto L_0x01d2
        L_0x0153:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "emoji preview image targetWidth: "
            r3.append(r7)
            r3.append(r6)
            java.lang.String r7 = " targetHeight: "
            r3.append(r7)
            r3.append(r2)
            r7 = 32
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            nw1.a r3 = nw1.C11277a.f33206a
            r7 = 14
            r3.mo11334b(r7)
            r7 = 13
            r3.mo11333a(r7)
            java.lang.String r7 = r0.f19151d
            r10 = 1
            android.graphics.Bitmap r13 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbBitmap(r7, r2, r6, r10, r5)
            if (r13 != 0) goto L_0x0197
            r3.mo11333a(r9)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19152e
            r1.setResult(r8)
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r1 = r0.f19152e
            r1.finish()
            goto L_0x01d2
        L_0x0197:
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r2 = r0.f19152e
            r2.f19112q = r13
            java.lang.String r2 = "image bitmap decode successful"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            if (r4 == 0) goto L_0x01ad
            r1 = 17
            r3.mo11334b(r1)
            r1 = 16
            r3.mo11333a(r1)
            goto L_0x01b7
        L_0x01ad:
            r1 = 20
            r3.mo11334b(r1)
            r1 = 19
            r3.mo11333a(r1)
        L_0x01b7:
            int r14 = r13.getWidth()
            int r15 = r13.getHeight()
            com.tencent.mm.plugin.gallery.picker.view.a r1 = new com.tencent.mm.plugin.gallery.picker.view.a
            android.widget.ImageView r12 = r0.f19153f
            fy3.p<java.lang.Integer, java.lang.Integer, java.lang.Object> r2 = r0.f19154g
            com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r3 = r0.f19152e
            r11 = r1
            r16 = r2
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            o40.C61926c.m72668M(r1)
        L_0x01d2:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.picker.view.C4428b.invoke():java.lang.Object");
    }
}
