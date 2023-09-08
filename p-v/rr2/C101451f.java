package rr2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.mediabasic.data.MediaResultInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2", mo125469f = "SnsCoverEffectImagePlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: rr2.f */
public final class C101451f extends C91594j implements C32227p<C0000n0, C15601d<? super MediaResultInfo>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C101447e f297117d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101451f(C101447e eVar, C15601d<? super C101451f> dVar) {
        super(2, dVar);
        this.f297117d = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        C101451f fVar = new C101451f(this.f297117d, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        return fVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        Object invokeSuspend = ((C101451f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        return invokeSuspend;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            kotlin.ResultKt.throwOnFailure(r21)
            rr2.e r0 = r1.f297117d
            cq3.a r0 = rr2.C101447e.m133156x(r0)
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x016e
            rr2.e r0 = r1.f297117d
            java.lang.String r6 = "access$getSource$p"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            android.graphics.Bitmap r0 = r0.f297113q
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            if (r0 != 0) goto L_0x0029
            goto L_0x016e
        L_0x0029:
            rr2.e r0 = r1.f297117d
            cq3.a r0 = rr2.C101447e.m133156x(r0)
            gy3.C87412m.m108591d(r0)
            int r0 = r0.getWidth()
            rr2.e r8 = r1.f297117d
            cq3.a r8 = rr2.C101447e.m133156x(r8)
            gy3.C87412m.m108591d(r8)
            int r8 = r8.getHeight()
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            r9.left = r5
            r9.right = r0
            int r11 = r8 - r0
            r12 = 2
            int r11 = r11 / r12
            r9.top = r11
            int r11 = r8 - r11
            r9.bottom = r11
            r10.left = r5
            r10.right = r0
            r10.top = r5
            r10.bottom = r8
            android.graphics.Matrix r0 = new android.graphics.Matrix
            rr2.e r8 = r1.f297117d
            cq3.a r8 = rr2.C101447e.m133156x(r8)
            gy3.C87412m.m108591d(r8)
            android.graphics.Matrix r8 = r8.getMainMatrix()
            r0.<init>(r8)
            rr2.e r8 = r1.f297117d
            java.lang.String r11 = "access$getBlurBitmapOffsetHeight$p"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r7)
            int r8 = r8.f297111o
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r7)
            if (r8 == 0) goto L_0x009f
            r8 = 9
            float[] r8 = new float[r8]
            r0.getValues(r8)
            r8 = r8[r5]
            r13 = 0
            rr2.e r14 = r1.f297117d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r7)
            int r14 = r14.f297111o
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r7)
            float r11 = (float) r14
            float r11 = r11 * r8
            float r8 = (float) r12
            float r11 = r11 / r8
            r0.postTranslate(r13, r11)
        L_0x009f:
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            r0.invert(r8)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r9)
            r8.mapRect(r0)
            r0.round(r9)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r10)
            r8.mapRect(r0)
            r0.round(r10)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            rr2.e r0 = r1.f297117d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            android.graphics.Bitmap r13 = r0.f297113q
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            hi2.e r0 = hi2.C32925e.f89499a
            java.lang.String r6 = "sns_cover_img"
            java.lang.String r0 = hi2.C32925e.m39859d(r0, r6, r4, r12, r4)
            b62.a r6 = b62.C92177a.IMAGE
            java.lang.String r9 = "access$saveBitmap"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r7)
            java.lang.String r11 = "saveBitmap"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r7)
            r12 = 1
            if (r13 == 0) goto L_0x014e
            int r14 = r10.left     // Catch:{ Exception -> 0x0142 }
            int r14 = java.lang.Math.max(r14, r5)     // Catch:{ Exception -> 0x0142 }
            int r15 = r10.top     // Catch:{ Exception -> 0x0142 }
            int r15 = java.lang.Math.max(r15, r5)     // Catch:{ Exception -> 0x0142 }
            int r16 = r10.width()     // Catch:{ Exception -> 0x0142 }
            int r4 = r16 + r14
            int r5 = r13.getWidth()     // Catch:{ Exception -> 0x0142 }
            if (r4 < r5) goto L_0x0103
            int r4 = r13.getWidth()     // Catch:{ Exception -> 0x0142 }
            int r4 = r4 - r14
            goto L_0x0107
        L_0x0103:
            int r4 = r10.width()     // Catch:{ Exception -> 0x0142 }
        L_0x0107:
            r16 = r4
            int r4 = r10.height()     // Catch:{ Exception -> 0x0142 }
            int r4 = r4 + r15
            int r5 = r13.getHeight()     // Catch:{ Exception -> 0x0142 }
            if (r4 < r5) goto L_0x011a
            int r4 = r13.getHeight()     // Catch:{ Exception -> 0x0142 }
            int r4 = r4 - r15
            goto L_0x011e
        L_0x011a:
            int r4 = r10.height()     // Catch:{ Exception -> 0x0142 }
        L_0x011e:
            r17 = r4
            r18 = 0
            r19 = 0
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0142 }
            r5 = 100
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0142 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r4, r5, r10, r0, r12)     // Catch:{ Exception -> 0x0142 }
            com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo r4 = new com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo     // Catch:{ Exception -> 0x0142 }
            r17 = 0
            r18 = 4
            r19 = 0
            r14 = r4
            r15 = r6
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0142 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r7)     // Catch:{ Exception -> 0x0142 }
            goto L_0x0152
        L_0x0142:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = "MicroMsg.SnsCoverEffectImagePlugin"
            java.lang.String r6 = "saveBitmapToImage error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r6, r5)
        L_0x014e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r7)
            r4 = 0
        L_0x0152:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r7)
            if (r4 == 0) goto L_0x015a
            r8.add(r4)
        L_0x015a:
            com.tencent.mm.plugin.mediabasic.data.MediaResultInfo r0 = new com.tencent.mm.plugin.mediabasic.data.MediaResultInfo
            int r4 = r8.size()
            if (r4 <= 0) goto L_0x0165
            r4 = 0
            r5 = 1
            goto L_0x0167
        L_0x0165:
            r4 = 0
            r5 = 0
        L_0x0167:
            r0.<init>(r5, r8, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r0
        L_0x016e:
            com.tencent.mm.plugin.mediabasic.data.MediaResultInfo r0 = new com.tencent.mm.plugin.mediabasic.data.MediaResultInfo
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r0.<init>(r6, r5, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rr2.C101451f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
