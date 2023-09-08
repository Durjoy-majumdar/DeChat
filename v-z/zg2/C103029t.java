package zg2;

import com.tencent.p014mm.plugin.recordvideo.background.VideoMixer;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zg2.t */
public final class C103029t extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ VideoMixer f304008d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103029t(VideoMixer videoMixer) {
        super(1);
        this.f304008d = videoMixer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if ((r6 != null && r6.f273431g == 2) != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007e, code lost:
        if (r0 != false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r10 = (java.lang.String) r10
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x000f
            int r2 = r10.length()
            if (r2 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r2 = 0
            goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            r3 = -1
            java.lang.String r4 = ""
            java.lang.String r5 = "MicroMsg.Media.VideoMixer"
            if (r2 == 0) goto L_0x002e
            java.lang.String r10 = "remux failed, ret path is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r10)
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r10 = r9.f304008d
            fy3.r<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.Integer, rx3.b0> r10 = r10.f272851b
            if (r10 == 0) goto L_0x00f9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r10.mo162I(r4, r4, r0, r1)
            goto L_0x00f9
        L_0x002e:
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r2 = r9.f304008d
            ah2.a r2 = r2.f272850a
            gy3.C87412m.m108591d(r10)
            r2.getClass()
            r2.f263374e = r10
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r10 = r9.f304008d
            ei2.g r10 = r10.f272854e
            r2 = 0
            if (r10 == 0) goto L_0x00fc
            r10.mo136911d()
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r10 = r9.f304008d
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r6 = r10.f272866q
            if (r6 == 0) goto L_0x0050
            int r7 = r6.f273431g
            if (r7 != r0) goto L_0x0050
            r7 = 1
            goto L_0x0051
        L_0x0050:
            r7 = 0
        L_0x0051:
            r8 = 2
            if (r7 != 0) goto L_0x005f
            if (r6 == 0) goto L_0x005c
            int r7 = r6.f273431g
            if (r7 != r8) goto L_0x005c
            r7 = 1
            goto L_0x005d
        L_0x005c:
            r7 = 0
        L_0x005d:
            if (r7 == 0) goto L_0x0098
        L_0x005f:
            if (r6 == 0) goto L_0x0067
            int r7 = r6.f273430f
            if (r7 != r0) goto L_0x0067
            r7 = 1
            goto L_0x0068
        L_0x0067:
            r7 = 0
        L_0x0068:
            if (r7 != 0) goto L_0x0080
            if (r6 == 0) goto L_0x0072
            int r7 = r6.f273430f
            if (r7 != r8) goto L_0x0072
            r7 = 1
            goto L_0x0073
        L_0x0072:
            r7 = 0
        L_0x0073:
            if (r7 != 0) goto L_0x0080
            if (r6 == 0) goto L_0x007d
            int r7 = r6.f273430f
            r8 = 4
            if (r7 != r8) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            if (r0 == 0) goto L_0x0098
        L_0x0080:
            ah2.a r0 = r10.f272850a
            java.lang.String r0 = r0.f263374e
            com.tencent.mm.plugin.sight.base.ABAPrams r10 = r10.f272867r
            if (r6 == 0) goto L_0x008e
            int r2 = r6.f273431g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x008e:
            gy3.C87412m.m108591d(r2)
            int r2 = r2.intValue()
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.addReportMetadata(r0, r10, r2, r1)
        L_0x0098:
            hi2.o r10 = hi2.C98464o.f288797a     // Catch:{ Exception -> 0x00b6 }
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r0 = r9.f304008d     // Catch:{ Exception -> 0x00b6 }
            ah2.a r0 = r0.f272850a     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r0 = r0.f263374e     // Catch:{ Exception -> 0x00b6 }
            hi2.o$a r10 = r10.mo137832a(r0)     // Catch:{ Exception -> 0x00b6 }
            if (r10 == 0) goto L_0x00b7
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r0 = r9.f304008d     // Catch:{ Exception -> 0x00b6 }
            th2.e r1 = th2.C64938e.f186988a     // Catch:{ Exception -> 0x00b6 }
            fh2.c r0 = r0.f272855f     // Catch:{ Exception -> 0x00b6 }
            boolean r0 = r0.f287132h     // Catch:{ Exception -> 0x00b6 }
            int r2 = r10.f288802e     // Catch:{ Exception -> 0x00b6 }
            int r10 = r10.f288803f     // Catch:{ Exception -> 0x00b6 }
            r1.mo89090a(r0, r2, r10)     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00b7
        L_0x00b6:
        L_0x00b7:
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r10 = r9.f304008d
            java.lang.String r10 = com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.m119411b(r10)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r10 = "mix create thumb failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r10 = r9.f304008d
            fy3.r<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.Integer, rx3.b0> r0 = r10.f272851b
            if (r0 == 0) goto L_0x00f9
            ah2.a r10 = r10.f272850a
            java.lang.String r10 = r10.f263374e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.mo162I(r10, r4, r1, r2)
            goto L_0x00f9
        L_0x00dd:
            java.lang.String r0 = "mix create thumb succ"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r0 = r9.f304008d
            fy3.r<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.Integer, rx3.b0> r1 = r0.f272851b
            if (r1 == 0) goto L_0x00f9
            ah2.a r0 = r0.f272850a
            java.lang.String r0 = r0.f263374e
            gy3.C87412m.m108591d(r10)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.mo162I(r0, r10, r2, r3)
        L_0x00f9:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        L_0x00fc:
            java.lang.String r10 = "frameRetriever"
            gy3.C87412m.m108603p(r10)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zg2.C103029t.invoke(java.lang.Object):java.lang.Object");
    }
}
