package com.tencent.p014mm.p136ui.chatting.gallery;

import a14.C0000n0;
import fy3.C32227p;
import m03.C99783d;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$startSurfaceChecker$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {839}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.ui.chatting.gallery.k1 */
public final class C97080k1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f284790d;

    /* renamed from: e */
    public /* synthetic */ Object f284791e;

    /* renamed from: f */
    public final /* synthetic */ C97136u0 f284792f;

    /* renamed from: g */
    public final /* synthetic */ C99783d f284793g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97080k1(C97136u0 u0Var, C99783d dVar, C15601d<? super C97080k1> dVar2) {
        super(2, dVar2);
        this.f284792f = u0Var;
        this.f284793g = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C97080k1 k1Var = new C97080k1(this.f284792f, this.f284793g, dVar);
        k1Var.f284791e = obj;
        return k1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C97080k1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f284790d
            r3 = 1
            if (r2 == 0) goto L_0x001c
            if (r2 != r3) goto L_0x0014
            java.lang.Object r2 = r0.f284791e
            a14.n0 r2 = (a14.C0000n0) r2
            kotlin.ResultKt.throwOnFailure(r26)
            r4 = r0
            goto L_0x0037
        L_0x0014:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r26)
            java.lang.Object r2 = r0.f284791e
            a14.n0 r2 = (a14.C0000n0) r2
            r4 = r0
        L_0x0024:
            boolean r5 = a14.C53930o0.m60560g(r2)
            if (r5 == 0) goto L_0x021c
            r5 = 500(0x1f4, double:2.47E-321)
            r4.f284791e = r2
            r4.f284790d = r3
            java.lang.Object r5 = a14.C53965x0.m60607b(r5, r4)
            if (r5 != r1) goto L_0x0037
            return r1
        L_0x0037:
            com.tencent.mm.ui.chatting.gallery.u0 r5 = r4.f284792f
            m03.d r6 = r4.f284793g
            int r7 = r5.f285042z
            int r8 = r6.getCurrentPosition()
            r5.f285042z = r8
            r9 = 0
            r11 = 4
            r12 = 3
            r13 = 2
            java.lang.String r14 = "MicroMsg.Imagegallery.handler.video.tp"
            r15 = 0
            if (r7 == r8) goto L_0x019f
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r5.f285025B = r7
            long r7 = r6.getLastSurfaceUpdateTime()
            java.lang.String r16 = ""
            r3 = 13836(0x360c, float:1.9388E-41)
            int r17 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r17 <= 0) goto L_0x00c8
            long r9 = r5.f285024A
            int r17 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r17 == 0) goto L_0x00c8
            r5.f285024A = r7
            int r6 = r5.f285026C
            if (r6 == r13) goto L_0x0076
            if (r6 == r12) goto L_0x0073
            if (r6 == r11) goto L_0x0070
            goto L_0x00c4
        L_0x0070:
            r7 = 23
            goto L_0x0078
        L_0x0073:
            r7 = 22
            goto L_0x0078
        L_0x0076:
            r7 = 21
        L_0x0078:
            java.lang.Object[] r8 = new java.lang.Object[r11]
            int r9 = r5.hashCode()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r15] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r10 = 1
            r8[r10] = r9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r13] = r6
            java.lang.String r6 = r5.f285034r
            r8[r12] = r6
            java.lang.String r6 = "%d rpt rptRepairEffect idKey %d errorTime %d filename %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r6, r8)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = 354(0x162, double:1.75E-321)
            long r7 = (long) r7
            r22 = 1
            r24 = 0
            r17 = r6
            r20 = r7
            r17.idkeyStat(r18, r20, r22, r24)
            java.lang.Object[] r7 = new java.lang.Object[r12]
            r8 = 301(0x12d, float:4.22E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r15] = r8
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 1
            r7[r9] = r8
            r7[r13] = r16
            r6.mo160131h(r3, r7)
        L_0x00c4:
            r5.f285026C = r15
            goto L_0x019c
        L_0x00c8:
            int r7 = r5.f285026C
            r8 = -1
            if (r7 == r8) goto L_0x019c
            int r7 = r7 + 1
            r5.f285026C = r7
            java.lang.Object[] r9 = new java.lang.Object[r13]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9[r15] = r7
            int r7 = r5.f285027D
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 1
            r9[r10] = r7
            java.lang.String r7 = "media play is playing[%d], but surface is not update!! repair time[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r7, r9)
            int r7 = r5.f285027D
            if (r7 < r13) goto L_0x00f3
            f03.h r7 = r5.f285037u
            if (r7 == 0) goto L_0x00f3
            r7.mo134532e()
        L_0x00f3:
            int r7 = r5.f285026C
            java.lang.String r9 = "surface not update, it try seek time[%d] to repair."
            if (r7 == r13) goto L_0x0183
            if (r7 == r12) goto L_0x0164
            if (r7 == r11) goto L_0x0145
            java.lang.String r6 = "rpt surface not update!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r6)
            java.lang.Object[] r6 = new java.lang.Object[r13]
            int r7 = r5.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r15] = r7
            java.lang.String r7 = r5.f285034r
            r9 = 1
            r6[r9] = r7
            java.lang.String r7 = "%d rpt rptSurfaceNotUpdate %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r7, r6)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r12]
            r10 = 300(0x12c, float:4.2E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7[r15] = r10
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r7[r9] = r10
            r7[r13] = r16
            r6.mo160131h(r3, r7)
            r18 = 354(0x162, double:1.75E-321)
            r20 = 20
            r22 = 1
            r24 = 0
            r17 = r6
            r17.idkeyStat(r18, r20, r22, r24)
            r5.f285026C = r8
            goto L_0x019c
        L_0x0145:
            int r3 = r5.f285042z
            int r3 = r3 + -4000
            int r3 = r3 / 1000
            if (r3 >= 0) goto L_0x014e
            r3 = 0
        L_0x014e:
            r8 = 1
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r7[r15] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r9, r7)
            double r9 = (double) r3
            r6.mo24787a(r9, r8)
            int r3 = r5.f285027D
            int r3 = r3 + r8
            r5.f285027D = r3
            goto L_0x019c
        L_0x0164:
            r8 = 1
            int r3 = r5.f285042z
            int r3 = r3 + -2000
            int r3 = r3 / 1000
            if (r3 >= 0) goto L_0x016e
            r3 = 0
        L_0x016e:
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r7[r15] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r9, r7)
            double r9 = (double) r3
            r6.mo24787a(r9, r8)
            int r3 = r5.f285027D
            int r3 = r3 + r8
            r5.f285027D = r3
            goto L_0x019c
        L_0x0183:
            r8 = 1
            int r3 = r5.f285042z
            int r3 = r3 / 1000
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r7[r15] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r9, r7)
            double r9 = (double) r3
            r6.mo24787a(r9, r8)
            int r3 = r5.f285027D
            int r3 = r3 + r8
            r5.f285027D = r3
        L_0x019c:
            r9 = 1
            goto L_0x0219
        L_0x019f:
            r8 = 1
            java.lang.Object[] r3 = new java.lang.Object[r11]
            long r9 = r5.f285025B
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r3[r15] = r9
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r3[r8] = r9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r13] = r7
            int r7 = r5.f285042z
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r12] = r7
            java.lang.String r7 = "check time[%d, %d], play time[%d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r7, r3)
            long r7 = r5.f285025B
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x019c
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r7)
            r9 = 1500(0x5dc, double:7.41E-321)
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x019c
            java.lang.String r3 = "play time not update! request all video data to play. "
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r3)
            int r3 = r6.getCurrentPosition()
            a14.z1 r7 = r5.f285031o
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L_0x01ec
            a14.C53973z1.C53974a.m60623a(r7, r8, r9, r8)
        L_0x01ec:
            r5.f285031o = r8
            java.lang.String r7 = r5.f285034r
            boolean r8 = r6.mo24838g()
            hd0.C98429r0.m127832w(r7, r3, r8)
            r6.stop()
            f03.h r3 = r5.f285037u
            if (r3 == 0) goto L_0x0201
            r3.mo134532e()
        L_0x0201:
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.chatting.gallery.u0$a> r3 = r5.f285035s
            java.lang.String r6 = r5.f285034r
            java.lang.Object r3 = r3.get(r6)
            com.tencent.mm.ui.chatting.gallery.u0$a r3 = (com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.C97137a) r3
            if (r3 != 0) goto L_0x020e
            goto L_0x0219
        L_0x020e:
            com.tencent.mm.storage.f4 r6 = r3.f285044b
            int r3 = r3.f285043a
            r5.mo136047J(r6, r3)
            r6 = 0
            r5.f285025B = r6
        L_0x0219:
            r3 = 1
            goto L_0x0024
        L_0x021c:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97080k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
