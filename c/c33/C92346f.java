package c33;

import a33.C91947a;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import fh2.C97882i;
import gf3.C98108b;
import gy3.C87412m;
import h90.C98324b;

/* renamed from: c33.f */
public final class C92346f extends C98108b {

    /* renamed from: b */
    public C97882i.C97883a f264244b;

    /* renamed from: c */
    public C98324b f264245c;

    /* renamed from: d */
    public RecordConfigProvider f264246d;

    /* renamed from: e */
    public C91947a f264247e;

    /* renamed from: f */
    public C97882i f264248f;

    public C92346f(C97882i.C97883a aVar, C98324b bVar, RecordConfigProvider recordConfigProvider, C91947a aVar2, C97882i iVar) {
        C87412m.m108594g(aVar, "encode");
        C87412m.m108594g(iVar, "editConfig");
        this.f264244b = aVar;
        this.f264245c = bVar;
        this.f264246d = recordConfigProvider;
        this.f264247e = aVar2;
        this.f264248f = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (((r4 == null || (r13 = r4.f272926n) == null || r13.f267180u != 2) ? false : true) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x006d, code lost:
        if (((r4 == null || (r13 = r4.f272926n) == null || r13.f267160G != 4) ? false : true) != false) goto L_0x006f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo126328c(b62.C92178b r11, b62.C92179c r12, wx3.C15601d<? super com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo> r13) {
        /*
            r10 = this;
            b62.d r1 = b62.C92180d.MediaRemuxIgnore
            java.lang.String r12 = "MicroMsg.VideoCheckDaemonChain"
            java.lang.String r13 = "come in VideoCheckDaemon"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            fh2.i$a r13 = r10.f264244b
            boolean r13 = r13.f287160j
            if (r13 != 0) goto L_0x0268
            h90.b r13 = r10.f264245c
            r0 = 1
            r2 = 0
            if (r13 == 0) goto L_0x001d
            boolean r13 = r13.mo137612b()
            if (r13 != r0) goto L_0x001d
            r13 = 1
            goto L_0x001e
        L_0x001d:
            r13 = 0
        L_0x001e:
            if (r13 == 0) goto L_0x0268
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r10.f264246d
            if (r4 == 0) goto L_0x002e
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r4.f272926n
            if (r13 == 0) goto L_0x002e
            int r13 = r13.f267180u
            if (r13 != r0) goto L_0x002e
            r13 = 1
            goto L_0x002f
        L_0x002e:
            r13 = 0
        L_0x002f:
            r3 = 2
            if (r13 != 0) goto L_0x0041
            if (r4 == 0) goto L_0x003e
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r4.f272926n
            if (r13 == 0) goto L_0x003e
            int r13 = r13.f267180u
            if (r13 != r3) goto L_0x003e
            r13 = 1
            goto L_0x003f
        L_0x003e:
            r13 = 0
        L_0x003f:
            if (r13 == 0) goto L_0x0129
        L_0x0041:
            if (r4 == 0) goto L_0x004d
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r4.f272926n
            if (r13 == 0) goto L_0x004d
            int r13 = r13.f267160G
            if (r13 != r0) goto L_0x004d
            r13 = 1
            goto L_0x004e
        L_0x004d:
            r13 = 0
        L_0x004e:
            if (r13 != 0) goto L_0x006f
            if (r4 == 0) goto L_0x005c
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r4.f272926n
            if (r13 == 0) goto L_0x005c
            int r13 = r13.f267160G
            if (r13 != r3) goto L_0x005c
            r13 = 1
            goto L_0x005d
        L_0x005c:
            r13 = 0
        L_0x005d:
            if (r13 != 0) goto L_0x006f
            if (r4 == 0) goto L_0x006c
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r4.f272926n
            if (r13 == 0) goto L_0x006c
            int r13 = r13.f267160G
            r3 = 4
            if (r13 != r3) goto L_0x006c
            r13 = 1
            goto L_0x006d
        L_0x006c:
            r13 = 0
        L_0x006d:
            if (r13 == 0) goto L_0x0129
        L_0x006f:
            a33.a r13 = r10.f264247e
            if (r13 != 0) goto L_0x009c
            android.os.Bundle r11 = r11.f263830b
            c33.h r3 = c33.C92351h.f264261a
            gy3.C87412m.m108591d(r4)
            fh2.i$a r6 = r10.f264244b
            fh2.i r5 = r10.f264248f
            h90.b r7 = r10.f264245c
            if (r11 == 0) goto L_0x008a
            java.lang.String r13 = "KEY_EXPORT_HEVC_HARD"
            boolean r13 = r11.getBoolean(r13, r2)
            r8 = r13
            goto L_0x008b
        L_0x008a:
            r8 = 0
        L_0x008b:
            if (r11 == 0) goto L_0x0095
            java.lang.String r13 = "KEY_EXPORT_HEVC_SOFT"
            boolean r11 = r11.getBoolean(r13, r2)
            r9 = r11
            goto L_0x0096
        L_0x0095:
            r9 = 0
        L_0x0096:
            a33.a r11 = r3.mo126330a(r4, r5, r6, r7, r8, r9)
            r10.f264247e = r11
        L_0x009c:
            a33.a r11 = r10.f264247e
            r13 = 0
            if (r11 == 0) goto L_0x00a4
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r3 = r11.f263223a
            goto L_0x00a5
        L_0x00a4:
            r3 = r13
        L_0x00a5:
            if (r3 != 0) goto L_0x00a8
            goto L_0x00ac
        L_0x00a8:
            r4 = 3000(0xbb8, float:4.204E-42)
            r3.f273429e = r4
        L_0x00ac:
            if (r11 == 0) goto L_0x00b8
            int r11 = r11.mo125796b()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r11)
            goto L_0x00b9
        L_0x00b8:
            r3 = r13
        L_0x00b9:
            a33.a r11 = r10.f264247e
            if (r11 == 0) goto L_0x00c8
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r10.f264246d
            if (r4 == 0) goto L_0x00c4
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.f272926n
            goto L_0x00c5
        L_0x00c4:
            r4 = r13
        L_0x00c5:
            r11.mo125795a(r4)
        L_0x00c8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r4 = "ABA: useDarmonVideo: "
            r11.append(r4)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            if (r3 != 0) goto L_0x00df
            goto L_0x00ff
        L_0x00df:
            int r11 = r3.intValue()
            if (r11 != r0) goto L_0x00ff
            th2.f r11 = th2.C101891f.f300035a
            r11.mo141388v(r0)
            r11.mo141369c(r0)
            java.lang.String r11 = "aba no use DarmonVideo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r11 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        L_0x00ff:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = "ABA::check DarmonVideo, add the metadate for video of low bitrate path: "
            r11.append(r3)
            h90.b r3 = r10.f264245c
            gy3.C87412m.m108591d(r3)
            java.lang.String r3 = r3.f288185f
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            th2.f r11 = th2.C101891f.f300035a
            r11.mo141369c(r2)
            h90.b r11 = r10.f264245c
            gy3.C87412m.m108591d(r11)
            java.lang.String r11 = r11.f288185f
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.addReportMetadata(r11, r13, r0, r2)
        L_0x0129:
            th2.f r11 = th2.C101891f.f300035a
            r11.mo141388v(r2)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r11 = r10.f264246d
            if (r11 == 0) goto L_0x0268
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "daemonMediaCaptureInfo into: \ndaemonVideoPath = "
            r13.append(r1)
            h90.b r1 = r10.f264245c
            gy3.C87412m.m108591d(r1)
            java.lang.String r1 = r1.f288185f
            r13.append(r1)
            java.lang.String r1 = ", daemonVideoSize = "
            r13.append(r1)
            h90.b r3 = r10.f264245c
            gy3.C87412m.m108591d(r3)
            java.lang.String r3 = r3.f288185f
            long r3 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)
            r13.append(r3)
            java.lang.String r3 = ", \nsourceVideoPath = "
            r13.append(r3)
            h90.b r4 = r10.f264245c
            gy3.C87412m.m108591d(r4)
            java.lang.String r4 = r4.f288180a
            r13.append(r4)
            java.lang.String r4 = ", captureSize = "
            r13.append(r4)
            h90.b r5 = r10.f264245c
            gy3.C87412m.m108591d(r5)
            java.lang.String r5 = r5.f288180a
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            r13.append(r5)
            java.lang.String r5 = ", \noutputSize = "
            r13.append(r5)
            java.lang.String r6 = r11.f272901B
            r13.append(r6)
            java.lang.String r6 = ", outputSize = "
            r13.append(r6)
            java.lang.String r7 = r11.f272901B
            long r7 = com.tencent.p014mm.vfs.C86013q1.m106451l(r7)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            h90.b r13 = r10.f264245c
            gy3.C87412m.m108591d(r13)
            java.lang.String r13 = r13.f288185f
            java.lang.String r7 = r11.f272901B
            com.tencent.p014mm.vfs.C86013q1.m106442c(r13, r7)
            h90.b r13 = r10.f264245c
            gy3.C87412m.m108591d(r13)
            java.lang.String r13 = r13.f288186g
            java.lang.String r7 = r11.f272902C
            com.tencent.p014mm.vfs.C86013q1.m106442c(r13, r7)
            hi2.h r13 = hi2.C98453h.f288774a
            h90.b r7 = r10.f264245c
            r13.mo137809g(r7)
            r13.mo137814l(r11, r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "daemonMediaCaptureInfo 1: "
            r13.append(r0)
            h90.b r0 = r10.f264245c
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "daemonMediaCaptureInfo 2: \ndaemonVideoPath = "
            r13.append(r0)
            h90.b r0 = r10.f264245c
            gy3.C87412m.m108591d(r0)
            java.lang.String r0 = r0.f288185f
            r13.append(r0)
            r13.append(r1)
            h90.b r0 = r10.f264245c
            gy3.C87412m.m108591d(r0)
            java.lang.String r0 = r0.f288185f
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            r13.append(r0)
            r13.append(r3)
            h90.b r0 = r10.f264245c
            gy3.C87412m.m108591d(r0)
            java.lang.String r0 = r0.f288180a
            r13.append(r0)
            r13.append(r4)
            h90.b r0 = r10.f264245c
            gy3.C87412m.m108591d(r0)
            java.lang.String r0 = r0.f288180a
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            r13.append(r0)
            r13.append(r5)
            java.lang.String r0 = r11.f272901B
            r13.append(r0)
            r13.append(r6)
            java.lang.String r0 = r11.f272901B
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            a33.g r12 = a33.C91956g.f263271a
            java.lang.String r13 = r11.f272901B
            java.lang.String r0 = "this.outputVideoPath"
            gy3.C87412m.m108593f(r13, r0)
            java.lang.String r1 = r11.f272902C
            java.lang.String r3 = "this.thumbPath"
            gy3.C87412m.m108593f(r1, r3)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r10.f264246d
            if (r3 == 0) goto L_0x024c
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f272926n
            if (r3 == 0) goto L_0x024c
            int r2 = r3.f267179t
        L_0x024c:
            r12.mo125811a(r13, r1, r2)
            java.lang.String r11 = r11.f272901B
            gy3.C87412m.m108593f(r11, r0)
            r12.mo125812b(r11)
            r3 = 1
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r11 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            b62.d r2 = b62.C92180d.MediaRemuxError
            r5 = 0
            r6 = 8
            r7 = 0
            java.lang.String r4 = "use daemon video"
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r11
        L_0x0268:
            java.lang.String r11 = "no go to use aba"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r11 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c33.C92346f.mo126328c(b62.b, b62.c, wx3.d):java.lang.Object");
    }
}
