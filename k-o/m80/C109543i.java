package m80;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import o80.C109993a;
import rx3.C13598b0;
import s62.C101554f;
import z04.C112551y;

/* renamed from: m80.i */
public final class C109543i extends C109537f {

    /* renamed from: x */
    public MediaCodec.BufferInfo f327902x = new MediaCodec.BufferInfo();

    /* renamed from: y */
    public final String f327903y = "MicroMsg.MediaCodecTransDecoder";

    /* renamed from: z */
    public volatile boolean f327904z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109543i(long j, long j2, C109993a aVar, Surface surface, int i, boolean z, C32226l<? super C109537f, C13598b0> lVar) {
        super(j, j2, aVar, surface, i, z);
        C87412m.m108594g(aVar, "mediaExtractorWrapper");
        try {
            this.f327873g = aVar.f329158e;
            String c = aVar.mo161326c();
            if (C112551y.m153809i("video/dolby-vision", c, true) && !C101554f.m133321f()) {
                c = "video/hevc";
            }
            C104619a c2 = C104619a.m140211c(c);
            this.f327872f = c2;
            c2.mo148202a(this.f327873g, surface, (MediaCrypto) null, 0);
            C104619a aVar2 = this.f327872f;
            C87412m.m108591d(aVar2);
            aVar2.mo148222y();
            if (lVar != null) {
                lVar.invoke(this);
            }
        } catch (Exception e) {
            String str = this.f327903y;
            Log.printErrStackTrace(str, e, "create decoder error:" + e.getMessage(), new Object[0]);
            throw new IllegalStateException("init decoder error");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1.f327903y, r0, "inputDecoder error", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010b, code lost:
        if (r1.f327885s != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.mo175913w(986, 76, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x019a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1.f327903y, r0, "sendDecoderEOS error", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x011f, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x011f, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo145769e() {
        /*
            r18 = this;
            r1 = r18
        L_0x0002:
            r2 = 0
            r3 = 2
            r4 = 60000(0xea60, double:2.9644E-319)
            r6 = 1
            r7 = 0
            java.lang.Object r8 = r1.f327880n     // Catch:{ Exception -> 0x00ff }
            monitor-enter(r8)     // Catch:{ Exception -> 0x00ff }
            boolean r0 = r1.f327881o     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r1.f327903y     // Catch:{ all -> 0x00fc }
            java.lang.String r9 = "inputDecoder already finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)     // Catch:{ all -> 0x00fc }
        L_0x0017:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00fc }
            monitor-exit(r8)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r0 = r1.f327903y     // Catch:{ Exception -> 0x00ff }
            java.lang.String r8 = "inputDecoder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)     // Catch:{ Exception -> 0x00ff }
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x00ff }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f327872f     // Catch:{ Exception -> 0x00ff }
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x00ff }
            java.nio.ByteBuffer[] r0 = r0.mo148208j()     // Catch:{ Exception -> 0x00ff }
            if (r0 != 0) goto L_0x0033
            r6 = 0
            goto L_0x011f
        L_0x0033:
            com.tencent.mm.compatible.deviceinfo.a r10 = r1.f327872f     // Catch:{ Exception -> 0x00ff }
            gy3.C87412m.m108591d(r10)     // Catch:{ Exception -> 0x00ff }
            int r10 = r10.mo148204f(r4)     // Catch:{ Exception -> 0x00ff }
            r12 = r10
            r10 = 0
        L_0x003e:
            if (r12 >= 0) goto L_0x0058
            r11 = 15
            if (r10 >= r11) goto L_0x0058
            boolean r11 = r18.mo160768f()     // Catch:{ Exception -> 0x00ff }
            if (r11 == 0) goto L_0x004c
            goto L_0x011f
        L_0x004c:
            com.tencent.mm.compatible.deviceinfo.a r11 = r1.f327872f     // Catch:{ Exception -> 0x00ff }
            gy3.C87412m.m108591d(r11)     // Catch:{ Exception -> 0x00ff }
            int r12 = r11.mo148204f(r4)     // Catch:{ Exception -> 0x00ff }
            int r10 = r10 + 1
            goto L_0x003e
        L_0x0058:
            r1.f327904z = r7     // Catch:{ Exception -> 0x00ff }
            if (r12 < 0) goto L_0x00ca
            r0 = r0[r12]     // Catch:{ Exception -> 0x00ff }
            r0.clear()     // Catch:{ Exception -> 0x00ff }
            o80.a r10 = r1.f327869c     // Catch:{ Exception -> 0x00ff }
            gy3.C87412m.m108591d(r10)     // Catch:{ Exception -> 0x00ff }
            boolean r10 = o80.C109993a.m149513d(r10, r0, r7, r3, r2)     // Catch:{ Exception -> 0x00ff }
            if (r10 != 0) goto L_0x0075
            java.lang.String r0 = r1.f327903y     // Catch:{ Exception -> 0x00ff }
            java.lang.String r8 = "read sample end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)     // Catch:{ Exception -> 0x00ff }
            goto L_0x011f
        L_0x0075:
            o80.a r10 = r1.f327869c     // Catch:{ Exception -> 0x00ff }
            long r14 = r10.mo161325b()     // Catch:{ Exception -> 0x00ff }
            o80.a r10 = r1.f327869c     // Catch:{ Exception -> 0x00ff }
            int r10 = r10.f329162i     // Catch:{ Exception -> 0x00ff }
            r0.position(r7)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r0 = r1.f327903y     // Catch:{ Exception -> 0x00ff }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ff }
            r11.<init>()     // Catch:{ Exception -> 0x00ff }
            java.lang.String r13 = "sampleTime : "
            r11.append(r13)     // Catch:{ Exception -> 0x00ff }
            r11.append(r14)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r13 = " us"
            r11.append(r13)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00ff }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)     // Catch:{ Exception -> 0x00ff }
            if (r10 < 0) goto L_0x00aa
            long r2 = r1.f327868b     // Catch:{ Exception -> 0x00ff }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r0     // Catch:{ Exception -> 0x00ff }
            long r2 = r2 * r4
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00b3
        L_0x00aa:
            r1.f327904z = r6     // Catch:{ Exception -> 0x00ff }
            java.lang.String r0 = r1.f327903y     // Catch:{ Exception -> 0x00ff }
            java.lang.String r2 = "sawInputEOS"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x00ff }
        L_0x00b3:
            com.tencent.mm.compatible.deviceinfo.a r11 = r1.f327872f     // Catch:{ Exception -> 0x00ff }
            gy3.C87412m.m108591d(r11)     // Catch:{ Exception -> 0x00ff }
            r13 = 0
            boolean r0 = r1.f327904z     // Catch:{ Exception -> 0x00ff }
            if (r0 == 0) goto L_0x00c1
            r0 = 4
            r17 = 4
            goto L_0x00c3
        L_0x00c1:
            r17 = 0
        L_0x00c3:
            r2 = r14
            r14 = r10
            r15 = r2
            r11.mo148213o(r12, r13, r14, r15, r17)     // Catch:{ Exception -> 0x00ff }
            goto L_0x00d1
        L_0x00ca:
            java.lang.String r0 = r1.f327903y     // Catch:{ Exception -> 0x00ff }
            java.lang.String r2 = "input buffer not available"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)     // Catch:{ Exception -> 0x00ff }
        L_0x00d1:
            boolean r0 = r18.mo160768f()     // Catch:{ Exception -> 0x00ff }
            java.lang.String r2 = r1.f327903y     // Catch:{ Exception -> 0x00ff }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ff }
            r3.<init>()     // Catch:{ Exception -> 0x00ff }
            java.lang.String r4 = "inputDecoder cost "
            r3.append(r4)     // Catch:{ Exception -> 0x00ff }
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)     // Catch:{ Exception -> 0x00ff }
            r3.append(r4)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00ff }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x00ff }
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = r1.f327903y     // Catch:{ Exception -> 0x00ff }
            java.lang.String r2 = "drainDecoder eos"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x00ff }
            goto L_0x011f
        L_0x00f9:
            boolean r6 = r1.f327904z     // Catch:{ Exception -> 0x00ff }
            goto L_0x011f
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ Exception -> 0x00ff }
            throw r0     // Catch:{ Exception -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            java.lang.String r2 = r1.f327903y
            java.lang.String r3 = "inputDecoder error"
            java.lang.Object[] r4 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
            boolean r0 = r1.f327885s
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = "MicroMsg.MediaEditorIDKeyStat"
            java.lang.String r2 = "markRemuxDecodeFrameFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 986(0x3da, double:4.87E-321)
            r11 = 76
            r13 = 1
            r8.mo175913w(r9, r11, r13)
        L_0x011f:
            if (r6 == 0) goto L_0x0002
            java.lang.String r0 = r1.f327903y
            java.lang.String r2 = "inputDecoder end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.Object r2 = r1.f327880n     // Catch:{ Exception -> 0x019a }
            monitor-enter(r2)     // Catch:{ Exception -> 0x019a }
            boolean r0 = r1.f327881o     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = r1.f327903y     // Catch:{ all -> 0x0197 }
            java.lang.String r3 = "drainDecoder already finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x0197 }
        L_0x0136:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0197 }
            monitor-exit(r2)     // Catch:{ Exception -> 0x019a }
            java.lang.String r0 = r1.f327903y     // Catch:{ Exception -> 0x019a }
            java.lang.String r2 = "sendDecoderEOS"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x019a }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f327872f     // Catch:{ Exception -> 0x019a }
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x019a }
            java.nio.ByteBuffer[] r0 = r0.mo148208j()     // Catch:{ Exception -> 0x019a }
            com.tencent.mm.compatible.deviceinfo.a r2 = r1.f327872f     // Catch:{ Exception -> 0x019a }
            gy3.C87412m.m108591d(r2)     // Catch:{ Exception -> 0x019a }
            r3 = 60000(0xea60, double:2.9644E-319)
            int r2 = r2.mo148204f(r3)     // Catch:{ Exception -> 0x019a }
            r9 = r2
        L_0x0156:
            if (r9 >= 0) goto L_0x016c
            boolean r2 = r18.mo160768f()     // Catch:{ Exception -> 0x019a }
            if (r2 == 0) goto L_0x015f
            goto L_0x01a4
        L_0x015f:
            com.tencent.mm.compatible.deviceinfo.a r2 = r1.f327872f     // Catch:{ Exception -> 0x019a }
            gy3.C87412m.m108591d(r2)     // Catch:{ Exception -> 0x019a }
            r3 = 60000(0xea60, double:2.9644E-319)
            int r9 = r2.mo148204f(r3)     // Catch:{ Exception -> 0x019a }
            goto L_0x0156
        L_0x016c:
            if (r9 < 0) goto L_0x0193
            r0 = r0[r9]     // Catch:{ Exception -> 0x019a }
            r0.clear()     // Catch:{ Exception -> 0x019a }
            o80.a r2 = r1.f327869c     // Catch:{ Exception -> 0x019a }
            gy3.C87412m.m108591d(r2)     // Catch:{ Exception -> 0x019a }
            r3 = 0
            r4 = 2
            o80.C109993a.m149513d(r2, r0, r7, r4, r3)     // Catch:{ Exception -> 0x019a }
            o80.a r2 = r1.f327869c     // Catch:{ Exception -> 0x019a }
            long r12 = r2.mo161325b()     // Catch:{ Exception -> 0x019a }
            r0.position(r7)     // Catch:{ Exception -> 0x019a }
            if (r9 < 0) goto L_0x0193
            com.tencent.mm.compatible.deviceinfo.a r8 = r1.f327872f     // Catch:{ Exception -> 0x019a }
            gy3.C87412m.m108591d(r8)     // Catch:{ Exception -> 0x019a }
            r10 = 0
            r11 = 0
            r14 = 4
            r8.mo148213o(r9, r10, r11, r12, r14)     // Catch:{ Exception -> 0x019a }
        L_0x0193:
            r18.mo160768f()     // Catch:{ Exception -> 0x019a }
            goto L_0x01a4
        L_0x0197:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x019a }
            throw r0     // Catch:{ Exception -> 0x019a }
        L_0x019a:
            r0 = move-exception
            java.lang.String r2 = r1.f327903y
            java.lang.String r3 = "sendDecoderEOS error"
            java.lang.Object[] r4 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
        L_0x01a4:
            r18.mo145767c()
            fy3.a<rx3.b0> r0 = r1.f327875i
            if (r0 == 0) goto L_0x01ae
            r0.invoke()
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m80.C109543i.mo145769e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0138, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0139, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13.f327903y, r1, "drainDecoder error", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0144, code lost:
        if (r13.f327885s != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0146, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.mo175913w(986, 76, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0158, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo160768f() {
        /*
            r13 = this;
            r0 = 0
            java.lang.String r1 = r13.f327903y     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = "drainDecoder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r1 = r13.f327880n     // Catch:{ Exception -> 0x0138 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0138 }
            boolean r2 = r13.f327881o     // Catch:{ all -> 0x0135 }
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = r13.f327903y     // Catch:{ all -> 0x0135 }
            java.lang.String r3 = "drainDecoder already finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x0135 }
        L_0x0016:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0135 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x0138 }
            com.tencent.mm.compatible.deviceinfo.a r1 = r13.f327872f     // Catch:{ Exception -> 0x0138 }
            gy3.C87412m.m108591d(r1)     // Catch:{ Exception -> 0x0138 }
            android.media.MediaCodec$BufferInfo r2 = r13.f327902x     // Catch:{ Exception -> 0x0138 }
            r3 = 100
            int r1 = r1.mo148205g(r2, r3)     // Catch:{ Exception -> 0x0138 }
        L_0x0026:
            r2 = -1
            if (r1 != r2) goto L_0x0032
            java.lang.String r1 = r13.f327903y     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = "no output from decoder available, break"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0134
        L_0x0032:
            r2 = -3
            if (r1 != r2) goto L_0x003e
            java.lang.String r1 = r13.f327903y     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = "decoder output buffers changed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0134
        L_0x003e:
            r2 = -2
            if (r1 != r2) goto L_0x0071
            com.tencent.mm.compatible.deviceinfo.a r1 = r13.f327872f     // Catch:{ Exception -> 0x0138 }
            gy3.C87412m.m108591d(r1)     // Catch:{ Exception -> 0x0138 }
            android.media.MediaFormat r1 = r1.mo148212n()     // Catch:{ Exception -> 0x0138 }
            r13.f327873g = r1     // Catch:{ Exception -> 0x0138 }
            java.lang.String r1 = r13.f327903y     // Catch:{ Exception -> 0x0138 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            r2.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r3 = "decoder output format changed: "
            r2.append(r3)     // Catch:{ Exception -> 0x0138 }
            android.media.MediaFormat r3 = r13.f327873g     // Catch:{ Exception -> 0x0138 }
            r2.append(r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0138 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0138 }
            android.media.MediaFormat r1 = r13.f327873g     // Catch:{ Exception -> 0x0138 }
            if (r1 == 0) goto L_0x0134
            fy3.l<? super android.media.MediaFormat, rx3.b0> r2 = r13.f327876j     // Catch:{ Exception -> 0x0138 }
            if (r2 == 0) goto L_0x0134
            r2.invoke(r1)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0134
        L_0x0071:
            if (r1 >= 0) goto L_0x008b
            java.lang.String r2 = r13.f327903y     // Catch:{ Exception -> 0x0138 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            r3.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "unexpected result from decoder.dequeueOutputBuffer: "
            r3.append(r4)     // Catch:{ Exception -> 0x0138 }
            r3.append(r1)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0138 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0134
        L_0x008b:
            android.media.MediaCodec$BufferInfo r2 = r13.f327902x     // Catch:{ Exception -> 0x0138 }
            long r5 = r2.presentationTimeUs     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = r13.f327903y     // Catch:{ Exception -> 0x0138 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            r7.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r8 = "presentationTimeUs : "
            r7.append(r8)     // Catch:{ Exception -> 0x0138 }
            r7.append(r5)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0138 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)     // Catch:{ Exception -> 0x0138 }
            long r7 = r13.f327867a     // Catch:{ Exception -> 0x0138 }
            r2 = 1000(0x3e8, float:1.401E-42)
            long r9 = (long) r2     // Catch:{ Exception -> 0x0138 }
            long r7 = r7 * r9
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x00e3
            android.media.MediaCodec$BufferInfo r2 = r13.f327902x     // Catch:{ Exception -> 0x0138 }
            int r2 = r2.flags     // Catch:{ Exception -> 0x0138 }
            r2 = r2 & 4
            if (r2 != 0) goto L_0x00e3
            com.tencent.mm.compatible.deviceinfo.a r2 = r13.f327872f     // Catch:{ Exception -> 0x0138 }
            gy3.C87412m.m108591d(r2)     // Catch:{ Exception -> 0x0138 }
            r2.mo148216r(r1, r0)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r1 = r13.f327903y     // Catch:{ Exception -> 0x0138 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            r2.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r3 = "decoder pts: "
            r2.append(r3)     // Catch:{ Exception -> 0x0138 }
            r2.append(r5)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r3 = ", not reach start: "
            r2.append(r3)     // Catch:{ Exception -> 0x0138 }
            long r3 = r13.f327867a     // Catch:{ Exception -> 0x0138 }
            long r3 = r3 * r9
            r2.append(r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0138 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0138 }
            return r0
        L_0x00e3:
            android.media.MediaCodec$BufferInfo r2 = r13.f327902x     // Catch:{ Exception -> 0x0138 }
            int r7 = r2.size     // Catch:{ Exception -> 0x0138 }
            if (r7 == 0) goto L_0x011f
            r13.mo160761b(r1, r2)     // Catch:{ Exception -> 0x0138 }
            long r1 = r13.f327868b     // Catch:{ Exception -> 0x0138 }
            long r3 = r1 * r9
            r7 = 1
            r11 = 1
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0105
            long r1 = r1 * r9
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x0105
            java.lang.String r1 = r13.f327903y     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = "exceed endTimeMs"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ Exception -> 0x0138 }
            return r11
        L_0x0105:
            android.media.MediaCodec$BufferInfo r1 = r13.f327902x     // Catch:{ Exception -> 0x0138 }
            int r1 = r1.flags     // Catch:{ Exception -> 0x0138 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x011e
            com.tencent.mm.compatible.deviceinfo.a r0 = r13.f327872f     // Catch:{ Exception -> 0x011d }
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x011d }
            r0.mo148223z()     // Catch:{ Exception -> 0x011d }
            com.tencent.mm.compatible.deviceinfo.a r0 = r13.f327872f     // Catch:{ Exception -> 0x011d }
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x011d }
            r0.mo148214p()     // Catch:{ Exception -> 0x011d }
        L_0x011d:
            return r11
        L_0x011e:
            return r0
        L_0x011f:
            com.tencent.mm.compatible.deviceinfo.a r2 = r13.f327872f     // Catch:{ Exception -> 0x0138 }
            gy3.C87412m.m108591d(r2)     // Catch:{ Exception -> 0x0138 }
            r2.mo148216r(r1, r0)     // Catch:{ Exception -> 0x0138 }
            com.tencent.mm.compatible.deviceinfo.a r1 = r13.f327872f     // Catch:{ Exception -> 0x0138 }
            gy3.C87412m.m108591d(r1)     // Catch:{ Exception -> 0x0138 }
            android.media.MediaCodec$BufferInfo r2 = r13.f327902x     // Catch:{ Exception -> 0x0138 }
            int r1 = r1.mo148205g(r2, r3)     // Catch:{ Exception -> 0x0138 }
            if (r1 >= 0) goto L_0x0026
        L_0x0134:
            return r0
        L_0x0135:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0138 }
            throw r2     // Catch:{ Exception -> 0x0138 }
        L_0x0138:
            r1 = move-exception
            java.lang.String r2 = r13.f327903y
            java.lang.String r3 = "drainDecoder error"
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r4)
            boolean r1 = r13.f327885s
            if (r1 == 0) goto L_0x0158
            java.lang.String r1 = "MicroMsg.MediaEditorIDKeyStat"
            java.lang.String r2 = "markRemuxDecodeFrameFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 986(0x3da, double:4.87E-321)
            r6 = 76
            r8 = 1
            r3.mo175913w(r4, r6, r8)
        L_0x0158:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m80.C109543i.mo160768f():boolean");
    }
}
