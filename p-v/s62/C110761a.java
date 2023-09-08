package s62;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.ByteBuffer;
import p206nj.C11171e;
import p331dj.C107045e;

/* renamed from: s62.a */
public class C110761a extends C110767k {

    /* renamed from: w */
    public AudioTrack f331292w;

    /* renamed from: x */
    public int f331293x;

    /* renamed from: y */
    public int f331294y;

    /* renamed from: z */
    public boolean f331295z = false;

    public C110761a(C110766j jVar, MMHandler mMHandler) {
        super(jVar, mMHandler);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        r5 = r1.f331322l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d6, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d8, code lost:
        r16 = "encoder-padding";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ef  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo162278h(com.tencent.p014mm.compatible.deviceinfo.C104619a r33) {
        /*
            r32 = this;
            r1 = r32
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = r32.mo162299i()
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "MicroMsg.AudioTrackDataSource"
            java.lang.String r5 = "%s handle decoder before start"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
            oj.b r2 = r1.f331324n
            if (r2 == 0) goto L_0x0022
            int r5 = r1.f331322l
            r6 = -1
            if (r5 > r6) goto L_0x001d
            goto L_0x0022
        L_0x001d:
            android.media.MediaFormat r2 = r2.mo161386e(r5)
            goto L_0x0024
        L_0x0022:
            android.media.MediaFormat r2 = r1.f331319i
        L_0x0024:
            oa1.d r5 = oa1.C117731d.m166007c()
            java.lang.String r6 = "clicfg_video_check_encoder_delay"
            boolean r5 = r5.mo182445g(r6, r4, r0)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            r5 = r5 | r6
            r6 = 28
            boolean r6 = p206nj.C11171e.m11044a(r6)
            if (r6 == 0) goto L_0x003c
            r5 = 0
        L_0x003c:
            if (r5 == 0) goto L_0x020b
            java.lang.String r5 = "encoder-delay"
            r2.setInteger(r5, r4)
            java.lang.String r7 = "encoder-padding"
            r2.setInteger(r7, r4)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = r1.f331314d
            r8.clear()
            boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            r13 = 4
            r14 = 8
            if (r12 != 0) goto L_0x0064
            r16 = r7
            r15 = 0
            goto L_0x00e9
        L_0x0064:
            java.io.RandomAccessFile r11 = com.tencent.p014mm.vfs.C86013q1.m106420B(r11, r4)     // Catch:{ Exception -> 0x00e1, all -> 0x00db }
            byte[] r12 = new byte[r14]     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            int r15 = uf0.C102014a.f300376f     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            uf0.a r15 = uf0.C102016c.m134340b(r11, r12, r15)     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            r16 = r7
            long r6 = r15.f300396d     // Catch:{ Exception -> 0x00e4, all -> 0x00d5 }
            r17 = 8
            long r6 = r6 + r17
            long r19 = r15.mo141508a()     // Catch:{ Exception -> 0x00e4, all -> 0x00d5 }
            long r19 = r19 - r17
            r15 = 0
        L_0x007f:
            r17 = 0
            int r21 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r21 <= 0) goto L_0x00d0
            r11.seek(r6)     // Catch:{ Exception -> 0x00e5, all -> 0x00d5 }
            r11.read(r12)     // Catch:{ Exception -> 0x00e5, all -> 0x00d5 }
            int r14 = uf0.C102016c.m134343e(r12, r4)     // Catch:{ Exception -> 0x00e5, all -> 0x00d5 }
            int r4 = uf0.C102016c.m134343e(r12, r13)     // Catch:{ Exception -> 0x00e5, all -> 0x00d5 }
            int r13 = uf0.C102014a.f300378h     // Catch:{ Exception -> 0x00e5, all -> 0x00d5 }
            if (r4 != r13) goto L_0x00ad
            uf0.o r13 = new uf0.o     // Catch:{ Exception -> 0x00e5, all -> 0x00d5 }
            r26 = 0
            r21 = r13
            r22 = r14
            r23 = r6
            r25 = r4
            r21.<init>(r22, r23, r25, r26)     // Catch:{ Exception -> 0x00e5, all -> 0x00d5 }
            r13.mo141539b(r11, r12)     // Catch:{ Exception -> 0x00e5, all -> 0x00d5 }
            r8.add(r13)     // Catch:{ Exception -> 0x00e5, all -> 0x00d5 }
            goto L_0x00c7
        L_0x00ad:
            int r13 = uf0.C102014a.f300377g     // Catch:{ Exception -> 0x00e5, all -> 0x00d5 }
            if (r4 != r13) goto L_0x00c7
            uf0.l r13 = new uf0.l     // Catch:{ Exception -> 0x00e5, all -> 0x00d5 }
            r26 = 0
            r21 = r13
            r22 = r14
            r23 = r6
            r25 = r4
            r21.<init>(r22, r23, r25, r26)     // Catch:{ Exception -> 0x00e5, all -> 0x00d5 }
            r13.mo141524b(r11, r12)     // Catch:{ Exception -> 0x00c5, all -> 0x00d5 }
            r15 = r13
            goto L_0x00c7
        L_0x00c5:
            r15 = r13
            goto L_0x00e5
        L_0x00c7:
            long r13 = (long) r14
            long r19 = r19 - r13
            long r6 = r6 + r13
            r4 = 0
            r13 = 4
            r14 = 8
            goto L_0x007f
        L_0x00d0:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r11)
            r4 = 1
            goto L_0x00e9
        L_0x00d5:
            r0 = move-exception
            r6 = r11
            goto L_0x00dd
        L_0x00d8:
            r16 = r7
            goto L_0x00e4
        L_0x00db:
            r0 = move-exception
            r6 = 0
        L_0x00dd:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            throw r0
        L_0x00e1:
            r16 = r7
            r11 = 0
        L_0x00e4:
            r15 = 0
        L_0x00e5:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r11)
            r4 = 0
        L_0x00e9:
            long r6 = java.lang.System.currentTimeMillis()
            if (r4 == 0) goto L_0x020b
            java.util.Iterator r4 = r8.iterator()
        L_0x00f3:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0112
            java.lang.Object r8 = r4.next()
            uf0.o r8 = (uf0.C102026o) r8
            uf0.g r11 = r8.f300461w
            if (r11 == 0) goto L_0x00f3
            long r11 = r11.f300406y
            int r13 = uf0.C102018g.f300403B
            long r13 = (long) r13
            int r19 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r19 != 0) goto L_0x010e
            r11 = 1
            goto L_0x010f
        L_0x010e:
            r11 = 0
        L_0x010f:
            if (r11 == 0) goto L_0x00f3
            goto L_0x0113
        L_0x0112:
            r8 = 0
        L_0x0113:
            long r11 = r15.f300433w
            uf0.d r4 = r8.f300462x
            if (r4 == 0) goto L_0x020b
            java.util.List<java.lang.Long> r4 = r4.f300401x
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r4 != r0) goto L_0x020b
            uf0.d r4 = r8.f300462x
            uf0.g r8 = r8.f300461w
            long r13 = r8.f300405x
            long r0 = r8.f300404w
            java.util.List<java.lang.Long> r8 = r4.f300401x
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r15 = 0
            java.lang.Object r8 = r8.get(r15)
            java.lang.Long r8 = (java.lang.Long) r8
            long r20 = r8.longValue()
            java.util.List<java.lang.Long> r4 = r4.f300400w
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r4 = r4.get(r15)
            java.lang.Long r4 = (java.lang.Long) r4
            long r22 = r4.longValue()
            long r24 = r22 * r0
            long r24 = r24 / r11
            long r24 = r20 + r24
            int r4 = r32.mo162284v()
            long r11 = r13 - r24
            r26 = r6
            long r6 = (long) r4
            long r28 = r20 * r6
            r30 = r9
            long r8 = r28 / r0
            long r6 = r6 * r11
            long r6 = r6 / r0
            int r0 = r2.getInteger(r5)     // Catch:{ Exception -> 0x0165 }
            goto L_0x0167
        L_0x0165:
            r0 = 0
        L_0x0167:
            r1 = 10
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r13 = 0
            r1[r13] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r20)
            r13 = 1
            r1[r13] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r22)
            r13 = 2
            r1[r13] = r10
            r10 = 3
            java.lang.Long r14 = java.lang.Long.valueOf(r24)
            r1[r10] = r14
            java.lang.Long r10 = java.lang.Long.valueOf(r11)
            r11 = 4
            r1[r11] = r10
            r10 = 5
            java.lang.Long r11 = java.lang.Long.valueOf(r8)
            r1[r10] = r11
            r10 = 6
            java.lang.Long r11 = java.lang.Long.valueOf(r6)
            r1[r10] = r11
            r10 = 7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r10] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r10 = 8
            r1[r10] = r4
            r4 = 9
            r1[r4] = r2
            java.lang.String r4 = "mediaDuration:%s, editStartTime:%s, editDuration:%s, editEndTime:%s, paddingTimeUnits:%s, encoderDelay:%s, encoderPadding:%s, sampleRate:%s, oriEncoderDelay:%s, trackFormat:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0206
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0206
            int r1 = (int) r8
            r2.setInteger(r5, r1)
            int r4 = (int) r6
            r5 = r16
            r2.setInteger(r5, r4)
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r8 = 0
            r4[r8] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r6)
            r6 = 1
            r4[r6] = r5
            java.lang.String r5 = "set encoder-delay:%s, encoder-padding:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
            kj2.d r3 = kj2.C117407d.INSTANCE
            r4 = 1117(0x45d, float:1.565E-42)
            r3.mo182088q(r4, r8)
            r4 = 1117(0x45d, double:5.52E-321)
            r12 = 1
            long r14 = r26 - r30
            r10 = 1117(0x45d, double:5.52E-321)
            r9 = r3
            r9.mo182089r(r10, r12, r14)
            r12 = 3
            long r14 = (long) r0
            r9.mo182089r(r10, r12, r14)
            r12 = 4
            long r14 = (long) r1
            r9.mo182089r(r10, r12, r14)
            r12 = 5
            int r1 = r1 - r0
            long r14 = (long) r1
            r10 = r4
            r9.mo182089r(r10, r12, r14)
            goto L_0x020b
        L_0x0206:
            java.lang.String r0 = "ignore set encoder-delay and encoder-padding and reset to 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x020b:
            r0 = r33
            r1 = 0
            r3 = 0
            r0.mo148202a(r2, r1, r1, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s62.C110761a.mo162278h(com.tencent.mm.compatible.deviceinfo.a):boolean");
    }

    /* renamed from: j */
    public void mo162279j(C104619a aVar, MediaFormat mediaFormat) {
        Log.m105925i("MicroMsg.AudioTrackDataSource", "%s on output format changed: %s", mo162299i(), mediaFormat);
        if (mediaFormat.containsKey("sample-rate")) {
            this.f331294y = mediaFormat.getInteger("sample-rate");
        }
    }

    /* renamed from: k */
    public void mo162280k() {
        Log.m105925i("MicroMsg.AudioTrackDataSource", "%s on pause", mo162299i());
        AudioTrack audioTrack = this.f331292w;
        if (audioTrack != null && audioTrack.getState() == 1) {
            this.f331292w.pause();
        }
    }

    /* renamed from: n */
    public boolean mo162281n(long j, long j2, C104619a aVar, ByteBuffer byteBuffer, int i, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
        Log.m105919d("MicroMsg.AudioTrackDataSource", "%s start to process output buffer state %d time[%d, %d] index %d", mo162299i(), Integer.valueOf(this.f331311a), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i));
        int i2 = this.f331311a;
        if (!(i2 == 3 || i2 == 5 || i2 == 7)) {
            Log.m105925i("MicroMsg.AudioTrackDataSource", "%s it no need process buffer now state %d", mo162299i(), Integer.valueOf(this.f331311a));
            return false;
        }
        if (this.f331292w == null) {
            Object[] objArr = new Object[3];
            objArr[0] = mo162299i();
            objArr[1] = Integer.valueOf(mo162284v());
            if (this.f331293x == 0) {
                this.f331293x = this.f331319i.getInteger("channel-count");
            }
            objArr[2] = Integer.valueOf(this.f331293x);
            Log.m105925i("MicroMsg.AudioTrackDataSource", "%s init audio track, sampleRate:%s, channels:%s", objArr);
            if (this.f331293x == 0) {
                this.f331293x = this.f331319i.getInteger("channel-count");
            }
            int i3 = this.f331293x == 1 ? 4 : 12;
            C107045e eVar = new C107045e(3, mo162284v(), i3, 2, AudioTrack.getMinBufferSize(mo162284v(), i3, 2), 1);
            this.f331292w = eVar;
            if (eVar.getState() != 1) {
                Log.m105929w("MicroMsg.AudioTrackDataSource", "%s can not create audio track [%d]", mo162299i(), Integer.valueOf(this.f331292w.getState()));
                this.f331292w.release();
                this.f331292w = null;
                z = false;
            } else {
                mo162286x(this.f331295z);
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        int i4 = this.f331311a;
        if ((i4 == 3 || i4 == 5 || i4 == 6) && (this.f331292w.getPlayState() == 2 || this.f331292w.getPlayState() == 1)) {
            mo162285w();
        }
        if ((this.f331311a == 4) && this.f331292w.getPlayState() == 3) {
            mo162280k();
        }
        try {
            this.f331312b.f331301f = bufferInfo2.presentationTimeUs;
            int i5 = bufferInfo2.size;
            byte[] bArr = new byte[i5];
            byteBuffer.get(bArr);
            byteBuffer.clear();
            long currentTicks = Util.currentTicks();
            if (i5 > 0) {
                this.f331292w.write(bArr, 0, i5);
            }
            Log.m105919d("MicroMsg.AudioTrackDataSource", "%s finish to process index[%d] time[%d] to audio track, size:%s, cost:%s", mo162299i(), Integer.valueOf(i), Long.valueOf(this.f331312b.f331301f), Integer.valueOf(bufferInfo2.size), Long.valueOf(Util.ticksToNow(currentTicks)));
            aVar.mo148216r(i, false);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AudioTrackDataSource", "%s audio release output buffer error %s", mo162299i(), e.toString());
        }
        return true;
    }

    /* renamed from: o */
    public void mo162282o() {
        try {
            AudioTrack audioTrack = this.f331292w;
            if (audioTrack != null) {
                audioTrack.flush();
                this.f331292w.release();
            }
        } catch (Exception unused) {
        }
        super.mo162282o();
    }

    /* renamed from: u */
    public String mo162283u() {
        return "audio";
    }

    /* renamed from: v */
    public final int mo162284v() {
        if (this.f331294y == 0) {
            this.f331294y = this.f331319i.getInteger("sample-rate");
        }
        return this.f331294y;
    }

    /* renamed from: w */
    public void mo162285w() {
        Log.m105925i("MicroMsg.AudioTrackDataSource", "%s on start", mo162299i());
        AudioTrack audioTrack = this.f331292w;
        if (audioTrack != null && audioTrack.getState() == 1) {
            this.f331292w.play();
        }
    }

    /* renamed from: x */
    public void mo162286x(boolean z) {
        if (this.f331292w == null) {
            Log.m105929w("MicroMsg.AudioTrackDataSource", "%s set mute[%b] but audio track is null", mo162299i(), Boolean.valueOf(z));
            this.f331295z = z;
        } else if (C11171e.m11044a(21)) {
            Log.m105919d("MicroMsg.AudioTrackDataSource", "%s api below 21 set mute[%b]", mo162299i(), Boolean.valueOf(z));
            if (z) {
                this.f331292w.setStereoVolume(0.0f, 0.0f);
            } else {
                this.f331292w.setStereoVolume(1.0f, 1.0f);
            }
        } else {
            Log.m105919d("MicroMsg.AudioTrackDataSource", "%s api higher 21 set mute[%b]", mo162299i(), Boolean.valueOf(z));
            if (z) {
                this.f331292w.setVolume(0.0f);
            } else {
                this.f331292w.setVolume(1.0f);
            }
        }
    }
}
