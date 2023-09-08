package m90;

import android.media.MediaCodec;
import fy3.C32227p;
import java.nio.ByteBuffer;
import m90.C109557d;
import rx3.C13598b0;

/* renamed from: m90.f */
public class C109567f implements C32227p<ByteBuffer, MediaCodec.BufferInfo, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109557d.C109561c f327994d;

    public C109567f(C109557d.C109561c cVar) {
        this.f327994d = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = r10.f327994d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11
            android.media.MediaCodec$BufferInfo r12 = (android.media.MediaCodec.BufferInfo) r12
            r0 = 0
            r11.position(r0)
            int r0 = r11.remaining()
            int r1 = r12.size
            if (r0 < r1) goto L_0x0103
            m90.d$c r0 = r10.f327994d
            m90.d r1 = m90.C109557d.this
            n80.b r2 = r1.f327969i
            if (r2 == 0) goto L_0x0103
            int r2 = r2.f328349f
            long r2 = (long) r2
            long r4 = r0.f327990d
            long r6 = r1.f327942H
            r8 = 1
            long r8 = r8 + r6
            r1.f327942H = r8
            long r4 = r4 * r6
            java.lang.String r0 = "MicroMsg.Media.MediaCodecMP4MuxRecorder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "["
            r1.append(r6)
            int r6 = r10.hashCode()
            r1.append(r6)
            java.lang.String r6 = "] writeH264Data  ,bufferInfo.size : "
            r1.append(r6)
            int r6 = r12.size
            r1.append(r6)
            java.lang.String r6 = ",presentationTimeUs:"
            r1.append(r6)
            long r6 = r12.presentationTimeUs
            r1.append(r6)
            java.lang.String r6 = ",flags:"
            r1.append(r6)
            int r6 = r12.flags
            r1.append(r6)
            java.lang.String r6 = ",keyFrame:"
            r1.append(r6)
            int r6 = r12.flags
            r6 = r6 & 1
            if (r6 <= 0) goto L_0x0065
            java.lang.String r6 = "yes"
            goto L_0x0067
        L_0x0065:
            java.lang.String r6 = "no"
        L_0x0067:
            r1.append(r6)
            java.lang.String r6 = ", frameCnt:["
            r1.append(r6)
            m90.d$c r6 = r10.f327994d
            m90.d r6 = m90.C109557d.this
            long r6 = r6.f327942H
            r1.append(r6)
            java.lang.String r6 = " "
            r1.append(r6)
            r1.append(r2)
            java.lang.String r2 = "], pts:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            int r0 = r12.flags
            r0 = r0 & 1
            if (r0 <= 0) goto L_0x00b5
            m90.d$c r0 = r10.f327994d
            m90.d r0 = m90.C109557d.this
            eu.f$a r0 = r0.f327943I
            if (r0 == 0) goto L_0x00b5
            long r1 = r12.presentationTimeUs
            xj0.c r0 = (xj0.C91217c) r0
            monitor-enter(r0)
            xj0.f r3 = r0.f261764a     // Catch:{ all -> 0x00b2 }
            xj0.o$c r3 = r3.f261769d     // Catch:{ all -> 0x00b2 }
            if (r3 == 0) goto L_0x00b0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r4
            sj0.f$$e r3 = (sj0.f$$e) r3     // Catch:{ all -> 0x00b2 }
            r3.mo124451a(r1)     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b5
        L_0x00b2:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            throw r11
        L_0x00b5:
            m90.d$c r0 = r10.f327994d
            m90.d r0 = m90.C109557d.this
            j72.z r1 = r0.f327975o
            j72.f$c r1 = r1.f325384a
            j72.f$c r2 = j72.C108607f.C108610c.Stop
            if (r1 != r2) goto L_0x00e1
            java.lang.String r11 = "MicroMsg.Media.MediaCodecMP4MuxRecorder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "["
            r12.append(r0)
            int r0 = r10.hashCode()
            r12.append(r0)
            java.lang.String r0 = "] writeH264Data, already stop"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
            goto L_0x0103
        L_0x00e1:
            com.tencent.mm.plugin.sight.base.e r0 = r0.f327977q
            int r1 = r12.size
            long r2 = r12.presentationTimeUs
            r0.getClass()
            java.lang.Object r12 = com.tencent.p014mm.plugin.sight.base.C106139e.f316166c
            monitor-enter(r12)
            int r0 = r0.f316167a     // Catch:{ all -> 0x0100 }
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.writeH264Data(r0, r11, r1, r2)     // Catch:{ all -> 0x0100 }
            rx3.b0 r11 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0100 }
            monitor-exit(r12)
            m90.d$c r11 = r10.f327994d
            m90.d r11 = m90.C109557d.this
            int r12 = r11.f327956V
            int r12 = r12 + 1
            r11.f327956V = r12
            goto L_0x0103
        L_0x0100:
            r11 = move-exception
            monitor-exit(r12)
            throw r11
        L_0x0103:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m90.C109567f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
