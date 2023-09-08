package c01;

import android.media.MediaCodec;
import com.tencent.p014mm.sdk.platformtools.Util;
import e01.C107075a;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import m01.C109455d;
import n80.C109697b;
import rx3.C13598b0;
import yz0.C112509d;

/* renamed from: c01.p */
public final class C104224p {

    /* renamed from: a */
    public C109455d f308513a;

    /* renamed from: b */
    public OutputStream f308514b;

    /* renamed from: c */
    public C109697b f308515c;

    /* renamed from: d */
    public long f308516d = -1;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e A[Catch:{ Exception -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a8 A[Catch:{ Exception -> 0x00c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104224p(a01.C103219b r11, m01.C109455d r12) {
        /*
            r10 = this;
            java.lang.String r0 = "init"
            gy3.C87412m.m108594g(r12, r0)
            r10.<init>()
            r10.f308513a = r12
            r0 = -1
            r10.f308516d = r0
            java.lang.Class<h81.h> r12 = h81.C32735h.class
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_finder_screec_cast_pc_use_async_codec
            if (r11 == 0) goto L_0x00e6
            r1 = 2
            r2 = -1
            r3 = 23
            r4 = 1
            r5 = 0
            boolean r6 = p206nj.C11171e.m11046c(r3)     // Catch:{ Exception -> 0x0067 }
            if (r6 == 0) goto L_0x0059
            gj.m r6 = p156gj.C107835h0.f322856m     // Catch:{ Exception -> 0x0067 }
            int r6 = r6.f322867G     // Catch:{ Exception -> 0x0067 }
            if (r6 == r2) goto L_0x0037
            if (r6 == r4) goto L_0x004b
            if (r6 == r1) goto L_0x0035
            di3.d r6 = di3.C86312j.m106911c(r12)     // Catch:{ Exception -> 0x0067 }
            h81.h r6 = (h81.C32735h) r6     // Catch:{ Exception -> 0x0067 }
            boolean r6 = r6.mo58784wf(r0, r4)     // Catch:{ Exception -> 0x0067 }
            goto L_0x004c
        L_0x0035:
            r6 = 0
            goto L_0x004c
        L_0x0037:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ Exception -> 0x0067 }
            if (r6 != 0) goto L_0x004b
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x0067 }
            if (r6 == 0) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            di3.d r6 = di3.C86312j.m106911c(r12)     // Catch:{ Exception -> 0x0067 }
            h81.h r6 = (h81.C32735h) r6     // Catch:{ Exception -> 0x0067 }
            boolean r6 = r6.mo58784wf(r0, r4)     // Catch:{ Exception -> 0x0067 }
            goto L_0x004c
        L_0x004b:
            r6 = 1
        L_0x004c:
            if (r6 == 0) goto L_0x0059
            n80.f r6 = new n80.f     // Catch:{ Exception -> 0x0067 }
            c01.f r7 = new c01.f     // Catch:{ Exception -> 0x0067 }
            r7.<init>(r10)     // Catch:{ Exception -> 0x0067 }
            r6.<init>(r11, r7)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0063
        L_0x0059:
            n80.e r6 = new n80.e     // Catch:{ Exception -> 0x0067 }
            c01.i r7 = new c01.i     // Catch:{ Exception -> 0x0067 }
            r7.<init>(r10)     // Catch:{ Exception -> 0x0067 }
            r6.<init>(r11, r7)     // Catch:{ Exception -> 0x0067 }
        L_0x0063:
            r10.f308515c = r6     // Catch:{ Exception -> 0x0067 }
            goto L_0x00e6
        L_0x0067:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r8 = "MicroMsg.ScreenCastVideoEncoder"
            java.lang.String r9 = "encoder  error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r6, r9, r7)
            r11.mo142937c()     // Catch:{ Exception -> 0x00c0 }
            boolean r3 = p206nj.C11171e.m11046c(r3)     // Catch:{ Exception -> 0x00c0 }
            if (r3 == 0) goto L_0x00b3
            gj.m r3 = p156gj.C107835h0.f322856m     // Catch:{ Exception -> 0x00c0 }
            int r3 = r3.f322867G     // Catch:{ Exception -> 0x00c0 }
            if (r3 == r2) goto L_0x0091
            if (r3 == r4) goto L_0x00a5
            if (r3 == r1) goto L_0x008f
            di3.d r12 = di3.C86312j.m106911c(r12)     // Catch:{ Exception -> 0x00c0 }
            h81.h r12 = (h81.C32735h) r12     // Catch:{ Exception -> 0x00c0 }
            boolean r12 = r12.mo58784wf(r0, r4)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00a6
        L_0x008f:
            r12 = 0
            goto L_0x00a6
        L_0x0091:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ Exception -> 0x00c0 }
            if (r1 != 0) goto L_0x00a5
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x00c0 }
            if (r1 == 0) goto L_0x009a
            goto L_0x00a5
        L_0x009a:
            di3.d r12 = di3.C86312j.m106911c(r12)     // Catch:{ Exception -> 0x00c0 }
            h81.h r12 = (h81.C32735h) r12     // Catch:{ Exception -> 0x00c0 }
            boolean r12 = r12.mo58784wf(r0, r4)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00a6
        L_0x00a5:
            r12 = 1
        L_0x00a6:
            if (r12 == 0) goto L_0x00b3
            n80.f r12 = new n80.f     // Catch:{ Exception -> 0x00c0 }
            c01.l r0 = new c01.l     // Catch:{ Exception -> 0x00c0 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x00c0 }
            r12.<init>(r11, r0)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00bd
        L_0x00b3:
            n80.e r12 = new n80.e     // Catch:{ Exception -> 0x00c0 }
            c01.o r0 = new c01.o     // Catch:{ Exception -> 0x00c0 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x00c0 }
            r12.<init>(r11, r0)     // Catch:{ Exception -> 0x00c0 }
        L_0x00bd:
            r10.f308515c = r12     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00e6
        L_0x00c0:
            r12 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0[r5] = r11
            java.lang.String r11 = "still happened crash %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r12, r11, r0)
            java.lang.String r11 = "MicroMsg.CastReportHelper"
            java.lang.String r12 = "markInitVideoEncoderFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1634(0x662, double:8.073E-321)
            r3 = 34
            r5 = 1
            r0.mo175913w(r1, r3, r5)
            m01.d r11 = r10.f308513a
            r11.mo157531b()
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.C104224p.<init>(a01.b, m01.d):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m139026a(c01.C104224p r5, n80.C109697b r6) {
        /*
            r5.getClass()
            android.view.Surface r6 = r6.mo160919c()
            m01.d r0 = r5.f308513a
            r0.mo157530a(r6)
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_finder_screec_cast_pc_debug
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            gj.m r1 = p156gj.C107835h0.f322856m
            int r1 = r1.f322866F
            r2 = -1
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L_0x0029
            if (r1 == r3) goto L_0x003e
            r2 = 2
            if (r1 == r2) goto L_0x003d
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            boolean r3 = r0.mo58784wf(r6, r4)
            goto L_0x003e
        L_0x0029:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r1 != 0) goto L_0x003d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 == 0) goto L_0x0032
            goto L_0x003d
        L_0x0032:
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            boolean r3 = r0.mo58784wf(r6, r4)
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            if (r3 == 0) goto L_0x0078
            com.tencent.mm.vfs.VFSStrategy$$b r6 = com.tencent.p014mm.vfs.VFSStrategy.f348871a
            java.lang.String r6 = "ScreenCastDebug"
            com.tencent.mm.vfs.m1 r6 = a70.C112760b.m154236i0(r6)
            boolean r0 = r6.mo119967g()
            if (r0 != 0) goto L_0x0051
            r6.mo119987x()
        L_0x0051:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = r6.mo119971i()
            r0.append(r6)
            java.lang.String r6 = "/video_"
            r0.append(r6)
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r0.append(r1)
            java.lang.String r6 = ".h264"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.io.OutputStream r6 = com.tencent.p014mm.vfs.C86013q1.m106429K(r6, r4)
            r5.f308514b = r6
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.C104224p.m139026a(c01.p, n80.b):void");
    }

    /* renamed from: b */
    public static final void m139027b(C104224p pVar, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        pVar.getClass();
        boolean z = false;
        if (!(bufferInfo != null && bufferInfo.size == 0) && bufferInfo != null && byteBuffer != null) {
            byte[] bArr = new byte[bufferInfo.size];
            byteBuffer.get(bArr);
            byteBuffer.position(bufferInfo.offset);
            pVar.f308513a.mo157532c(bArr);
            OutputStream outputStream = pVar.f308514b;
            if (outputStream != null) {
                try {
                    outputStream.write(bArr);
                    C13598b0 b0Var = C13598b0.f38549a;
                } catch (IOException unused) {
                    OutputStream outputStream2 = pVar.f308514b;
                    if (outputStream2 != null) {
                        outputStream2.close();
                        C13598b0 b0Var2 = C13598b0.f38549a;
                    }
                }
            }
            if (C112509d.f336921e == null) {
                C112509d.f336921e = new C107075a();
            }
            C107075a aVar = C112509d.f336921e;
            if (aVar != null && aVar.f320507m == -1) {
                z = true;
            }
            if (z) {
                long ticksToNow = Util.ticksToNow(pVar.f308516d);
                pVar.f308516d = ticksToNow;
                if (C112509d.f336921e == null) {
                    C112509d.f336921e = new C107075a();
                }
                C107075a aVar2 = C112509d.f336921e;
                if (aVar2 != null) {
                    aVar2.f320507m = ticksToNow;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo145814c() {
        C109697b bVar = this.f308515c;
        if (bVar != null) {
            bVar.mo160922f();
        }
        OutputStream outputStream = this.f308514b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
