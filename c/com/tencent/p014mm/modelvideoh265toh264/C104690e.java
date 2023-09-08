package com.tencent.p014mm.modelvideoh265toh264;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.modelvideoh265toh264.C104685a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p914oj.C110052b;
import s62.C101554f;

/* renamed from: com.tencent.mm.modelvideoh265toh264.e */
public class C104690e implements C104685a {

    /* renamed from: a */
    public C110052b f310874a;

    /* renamed from: b */
    public C104685a.C104686a f310875b;

    /* renamed from: c */
    public long f310876c;

    /* renamed from: d */
    public long f310877d;

    /* renamed from: e */
    public MediaFormat f310878e;

    /* renamed from: f */
    public C104619a f310879f;

    /* renamed from: g */
    public MediaCodec.BufferInfo f310880g = new MediaCodec.BufferInfo();

    /* renamed from: h */
    public int f310881h;

    /* renamed from: i */
    public int f310882i;

    /* renamed from: j */
    public int f310883j;

    /* renamed from: k */
    public byte[] f310884k;

    /* renamed from: l */
    public int f310885l = 0;

    /* renamed from: m */
    public int f310886m = -1;

    public C104690e(C110052b bVar, MediaFormat mediaFormat, int i) {
        Log.m105925i("MicroMsg.MediaCodecTranscodeDecoder", "create MediaCodecTranscodeDecoder: %s, %s, %s", bVar, mediaFormat, Integer.valueOf(i));
        this.f310874a = bVar;
        this.f310878e = mediaFormat;
        this.f310881h = i;
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04f0 A[LOOP:0: B:5:0x0041->B:162:0x04f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x04ef A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo148339a() {
        /*
            r46 = this;
            r1 = r46
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f310879f
            java.lang.String r2 = "MicroMsg.MediaCodecTranscodeDecoder"
            r3 = 1
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "drainDecoder, decoder is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return r3
        L_0x000f:
            java.nio.ByteBuffer[] r0 = r0.mo148211m()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r5 = r0.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "decoderOutputByteBuffers length: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
            com.tencent.mm.compatible.deviceinfo.a r4 = r1.f310879f
            android.media.MediaCodec$BufferInfo r5 = r1.f310880g
            r7 = 60000(0xea60, double:2.9644E-319)
            int r4 = r4.mo148205g(r5, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "outputBufferIndex-->"
            r5.append(r9)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
        L_0x0041:
            r5 = -1
            if (r4 != r5) goto L_0x004a
            java.lang.String r0 = "no output from decoder available, break"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x009e
        L_0x004a:
            r5 = -3
            if (r4 != r5) goto L_0x0059
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f310879f
            java.nio.ByteBuffer[] r0 = r0.mo148211m()
            java.lang.String r4 = "decoder output buffers changed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            goto L_0x0092
        L_0x0059:
            r5 = -2
            if (r4 != r5) goto L_0x007b
            com.tencent.mm.compatible.deviceinfo.a r4 = r1.f310879f
            android.media.MediaFormat r4 = r4.mo148212n()
            r1.f310878e = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "decoder output format changed: "
            r4.append(r5)
            android.media.MediaFormat r5 = r1.f310878e
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            goto L_0x0092
        L_0x007b:
            if (r4 >= 0) goto L_0x0095
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "unexpected result from decoder.dequeueOutputBuffer: "
            r5.append(r9)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r4)
        L_0x0092:
            r5 = 0
            goto L_0x04e2
        L_0x0095:
            java.lang.String r5 = "perform decoding"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r5)
            r5 = r0[r4]
            if (r5 != 0) goto L_0x00a1
        L_0x009e:
            r5 = 0
            goto L_0x04ef
        L_0x00a1:
            android.media.MediaCodec$BufferInfo r9 = r1.f310880g
            long r10 = r9.presentationTimeUs
            long r12 = r1.f310876c
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            r7 = 2
            r8 = 4
            int r18 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r18 >= 0) goto L_0x00d3
            int r12 = r9.flags
            r12 = r12 & r8
            if (r12 != 0) goto L_0x00d3
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f310879f
            r0.mo148216r(r4, r6)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r0[r6] = r4
            long r4 = r1.f310876c
            long r4 = r4 * r14
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0[r3] = r4
            java.lang.String r3 = "decoder pts: %s, not reach start: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
            return r6
        L_0x00d3:
            int r12 = r9.size
            if (r12 == 0) goto L_0x04dc
            int r0 = r9.offset
            r5.position(r0)
            android.media.MediaCodec$BufferInfo r0 = r1.f310880g
            int r9 = r0.offset
            int r0 = r0.size
            int r9 = r9 + r0
            r5.limit(r9)
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            android.media.MediaCodec$BufferInfo r0 = r1.f310880g
            int r9 = r1.f310885l
            int r9 = r9 + r3
            r1.f310885l = r9
            int r14 = r1.f310882i
            if (r14 <= r3) goto L_0x0100
            int r9 = r9 % r14
            if (r9 != 0) goto L_0x0100
        L_0x00f8:
            r33 = r4
            r29 = r10
            r34 = r12
            goto L_0x0479
        L_0x0100:
            byte[] r9 = r1.f310884k
            if (r9 != 0) goto L_0x010c
            int r9 = r5.remaining()
            byte[] r9 = new byte[r9]
            r1.f310884k = r9
        L_0x010c:
            long r16 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.compatible.deviceinfo.a r9 = r1.f310879f     // Catch:{ Exception -> 0x0119 }
            android.media.MediaFormat r9 = r9.mo148212n()     // Catch:{ Exception -> 0x0119 }
            r1.f310878e = r9     // Catch:{ Exception -> 0x0119 }
            goto L_0x011e
        L_0x0119:
            java.lang.String r9 = "get output format error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
        L_0x011e:
            byte[] r9 = r1.f310884k
            int r14 = r5.remaining()
            r5.get(r9, r6, r14)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r9[r6] = r5
            r9[r3] = r0
            int r5 = r0.size
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9[r7] = r5
            long r16 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r16)
            java.lang.Long r5 = java.lang.Long.valueOf(r16)
            r14 = 3
            r9[r14] = r5
            java.lang.String r5 = "processDecodeOutputBuffer, byteBuffer: %s, bufferInfo: %s, size: %d cost %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r9)
            com.tencent.mm.modelvideoh265toh264.a$a r5 = r1.f310875b
            if (r5 == 0) goto L_0x00f8
            byte[] r9 = r1.f310884k
            int r15 = r0.flags
            r15 = r15 & r8
            if (r15 == 0) goto L_0x0153
            r27 = 1
            goto L_0x0155
        L_0x0153:
            r27 = 0
        L_0x0155:
            long r14 = r0.presentationTimeUs
            com.tencent.mm.modelvideoh265toh264.j r5 = (com.tencent.p014mm.modelvideoh265toh264.C104695j) r5
            java.lang.String r7 = "MicroMsg.VideoTranscoder"
            if (r9 == 0) goto L_0x046e
            int r0 = r9.length
            if (r0 != 0) goto L_0x0162
            goto L_0x046e
        L_0x0162:
            com.tencent.mm.modelvideoh265toh264.a r0 = r5.f310925s
            com.tencent.mm.modelvideoh265toh264.e r0 = (com.tencent.p014mm.modelvideoh265toh264.C104690e) r0
            android.media.MediaFormat r3 = r0.f310878e
            java.lang.String r6 = "width"
            int r3 = r3.getInteger(r6)
            android.media.MediaFormat r0 = r0.f310878e
            java.lang.String r8 = "height"
            int r0 = r0.getInteger(r8)
            r29 = r10
            android.graphics.Point r10 = new android.graphics.Point
            r10.<init>(r3, r0)
            int r0 = r10.x
            r5.f310909c = r0
            int r0 = r10.y
            r5.f310910d = r0
            long r31 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r0 = r5.f310928v
            java.lang.String r3 = "videoTargetWidth: %s, videoTargetHeight: %s, initWidth: %s, initHeight: %s, videoNeedScale: %s"
            java.lang.String r11 = "scaleYuvTargetWidth: %s, scaleYuvTargetHeight: %s, srcWidth: %s, srcHeight: %s"
            r33 = r4
            if (r0 != 0) goto L_0x0232
            int r0 = r5.f310916j
            if (r0 <= 0) goto L_0x019d
            int r0 = r5.f310915i
            if (r0 > 0) goto L_0x01cd
        L_0x019d:
            int r0 = r5.f310909c
            r5.f310915i = r0
            int r4 = r5.f310910d
            r5.f310916j = r4
            r4 = 4
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r1[r4] = r0
            int r0 = r5.f310916j
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 1
            r1[r4] = r0
            int r0 = r5.f310909c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 2
            r1[r4] = r0
            int r0 = r5.f310910d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 3
            r1[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r1)
        L_0x01cd:
            android.media.MediaFormat r0 = r5.f310927u
            if (r0 == 0) goto L_0x022e
            int r0 = r0.getInteger(r6)
            android.media.MediaFormat r1 = r5.f310927u
            int r1 = r1.getInteger(r8)
            int r4 = r5.f310913g
            if (r4 <= 0) goto L_0x01e3
            int r4 = r5.f310914h
            if (r4 > 0) goto L_0x0229
        L_0x01e3:
            int r4 = r10.y
            int r4 = r1 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= 0) goto L_0x01f6
            int r4 = r10.x
            if (r0 != r4) goto L_0x01f6
            r5.f310913g = r0
            r5.f310914h = r1
            goto L_0x01fe
        L_0x01f6:
            int r4 = r10.x
            r5.f310913g = r4
            int r4 = r10.y
            r5.f310914h = r4
        L_0x01fe:
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r6 = r5.f310913g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 0
            r4[r8] = r6
            int r6 = r5.f310914h
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 1
            r4[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r8 = 2
            r4[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r8 = 3
            r4[r8] = r6
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r8 = 4
            r4[r8] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r4)
        L_0x0229:
            r34 = r12
        L_0x022b:
            r11 = 2
            goto L_0x0306
        L_0x022e:
            r34 = r12
            goto L_0x030b
        L_0x0232:
            int r0 = r5.f310916j
            if (r0 <= 0) goto L_0x023e
            int r0 = r5.f310915i
            if (r0 > 0) goto L_0x023b
            goto L_0x023e
        L_0x023b:
            r34 = r12
            goto L_0x0289
        L_0x023e:
            int r0 = r5.f310909c
            int r1 = r5.f310910d
            int r4 = r5.f310911e
            r34 = r12
            int r12 = r5.f310912f
            android.graphics.Point r0 = r5.mo148352e(r0, r1, r4, r12)
            if (r0 == 0) goto L_0x0257
            int r1 = r0.x
            r5.f310915i = r1
            int r0 = r0.y
            r5.f310916j = r0
            goto L_0x025f
        L_0x0257:
            int r0 = r5.f310909c
            r5.f310915i = r0
            int r0 = r5.f310910d
            r5.f310916j = r0
        L_0x025f:
            r1 = 4
            java.lang.Object[] r0 = new java.lang.Object[r1]
            int r1 = r5.f310915i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r0[r4] = r1
            int r1 = r5.f310916j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 1
            r0[r4] = r1
            int r1 = r5.f310909c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 2
            r0[r4] = r1
            int r1 = r5.f310910d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 3
            r0[r4] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r0)
        L_0x0289:
            android.media.MediaFormat r0 = r5.f310927u
            if (r0 == 0) goto L_0x030b
            int r0 = r0.getInteger(r6)
            android.media.MediaFormat r1 = r5.f310927u
            int r1 = r1.getInteger(r8)
            int r4 = r5.f310913g
            if (r4 <= 0) goto L_0x029f
            int r4 = r5.f310914h
            if (r4 > 0) goto L_0x022b
        L_0x029f:
            int r4 = r5.f310911e
            int r6 = r5.f310912f
            android.graphics.Point r4 = r5.mo148352e(r0, r1, r4, r6)
            if (r4 == 0) goto L_0x02b3
            int r6 = r4.x
            r5.f310913g = r6
            int r4 = r4.y
            r5.f310914h = r4
            r4 = 1
            goto L_0x02cf
        L_0x02b3:
            int r4 = r10.y
            int r4 = r1 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= 0) goto L_0x02c6
            int r4 = r10.x
            if (r0 != r4) goto L_0x02c6
            r5.f310913g = r0
            r5.f310914h = r1
            goto L_0x02ce
        L_0x02c6:
            int r4 = r10.x
            r5.f310913g = r4
            int r4 = r10.y
            r5.f310914h = r4
        L_0x02ce:
            r4 = 0
        L_0x02cf:
            if (r4 == 0) goto L_0x02d9
            int r6 = r5.f310913g
            r5.f310915i = r6
            int r6 = r5.f310914h
            r5.f310916j = r6
        L_0x02d9:
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r8 = r5.f310913g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11 = 0
            r6[r11] = r8
            int r8 = r5.f310914h
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11 = 1
            r6[r11] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r11 = 2
            r6[r11] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r12 = 3
            r6[r12] = r8
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r8 = 4
            r6[r8] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r6)
        L_0x0306:
            r25 = r0
            r26 = r1
            goto L_0x0310
        L_0x030b:
            r11 = 2
            r25 = 0
            r26 = 0
        L_0x0310:
            com.tencent.mm.modelvideoh265toh264.a r0 = r5.f310925s
            com.tencent.mm.modelvideoh265toh264.e r0 = (com.tencent.p014mm.modelvideoh265toh264.C104690e) r0
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            int r1 = r0.f310886m
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "src color format: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r3)
            int r0 = r0.f310886m
            r1 = 19
            if (r0 == r1) goto L_0x032f
            r24 = 1
            goto L_0x0331
        L_0x032f:
            r24 = 2
        L_0x0331:
            boolean r0 = r5.f310917k
            if (r0 == 0) goto L_0x0361
            int r0 = r10.x
            int r1 = r10.y
            int r3 = r5.f310915i
            int r4 = r5.f310916j
            r19 = r9
            r20 = r0
            r21 = r1
            r22 = r3
            r23 = r4
            int r0 = com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI.writeYuvDataForSegmentLock(r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r31)
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r28 = 0
            r3[r28] = r4
            java.lang.String r4 = "writeYuvDataForSegment used %sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r3)
            goto L_0x0365
        L_0x0361:
            r1 = 1
            r28 = 0
            r0 = 0
        L_0x0365:
            if (r0 >= 0) goto L_0x0375
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r28] = r0
            java.lang.String r0 = "writeYuvDataForSegment error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r3)
        L_0x0375:
            boolean r0 = r5.f310917k
            java.lang.String r1 = "initAndStartEncoderIfNeed, useX264: %s"
            if (r0 == 0) goto L_0x03c5
            com.tencent.mm.modelvideoh265toh264.j$c r0 = r5.f310918l
            if (r0 != 0) goto L_0x0440
            int r0 = r5.f310913g
            int r3 = r5.f310914h
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r5.f310921o
            int r6 = r4.f267168f
            float r6 = (float) r6
            int r8 = r4.f267169g
            int r10 = r4.f267177r
            r41 = 8
            int r4 = r4.f267176q
            r43 = 1102577664(0x41b80000, float:23.0)
            r44 = 0
            r45 = 51
            r36 = r0
            r37 = r3
            r38 = r6
            r39 = r8
            r40 = r10
            r42 = r4
            com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI.initH264EncoderLock(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            com.tencent.mm.modelvideoh265toh264.j$c r0 = new com.tencent.mm.modelvideoh265toh264.j$c
            r3 = 0
            r0.<init>(r5, r3)
            r5.f310918l = r0
            zt3.t r3 = zt3.C119157j.f356862d
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183884o(r0)
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            boolean r3 = r5.f310917k
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 0
            r0[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            goto L_0x0440
        L_0x03c5:
            com.tencent.mm.modelvideoh265toh264.c r0 = r5.f310919m
            if (r0 != 0) goto L_0x0440
            com.tencent.mm.modelvideoh265toh264.c r0 = new com.tencent.mm.modelvideoh265toh264.c
            int r3 = r5.f310913g
            int r4 = r5.f310914h
            com.tencent.mm.modelcontrol.VideoTransPara r6 = r5.f310921o
            int r8 = r6.f267169g
            r23 = 1
            int r6 = r6.f267168f
            r19 = r0
            r20 = r3
            r21 = r4
            r22 = r8
            r24 = r6
            r19.<init>(r20, r21, r22, r23, r24)
            r5.f310919m = r0
            com.tencent.mm.modelvideoh265toh264.i r3 = new com.tencent.mm.modelvideoh265toh264.i
            r3.<init>(r5)
            r0.f310852b = r3
            int r3 = r5.f310929w     // Catch:{ Exception -> 0x0423 }
            int r0 = r0.mo148335b(r3)     // Catch:{ Exception -> 0x0423 }
            java.lang.String r3 = "init mediaCodecEncoder: %s"
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0423 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0423 }
            r4 = 0
            r6[r4] = r0     // Catch:{ Exception -> 0x0423 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r6)     // Catch:{ Exception -> 0x0423 }
            com.tencent.mm.modelvideoh265toh264.c r0 = r5.f310919m     // Catch:{ Exception -> 0x0423 }
            r0.getClass()     // Catch:{ Exception -> 0x0423 }
            java.lang.String r3 = "MicroMsg.MediaCodecTransCodeEncoder"
            java.lang.String r4 = "Start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ Exception -> 0x0423 }
            r3 = 1
            r0.f310866p = r3     // Catch:{ Exception -> 0x0421 }
            com.tencent.mm.modelvideoh265toh264.j$b r0 = r5.f310920n     // Catch:{ Exception -> 0x0423 }
            if (r0 != 0) goto L_0x041e
            com.tencent.mm.modelvideoh265toh264.j$b r0 = new com.tencent.mm.modelvideoh265toh264.j$b     // Catch:{ Exception -> 0x0423 }
            java.lang.String r3 = "remuxer_encode"
            r0.<init>(r3)     // Catch:{ Exception -> 0x0423 }
            r5.f310920n = r0     // Catch:{ Exception -> 0x0423 }
        L_0x041e:
            r3 = 1
            r8 = 0
            goto L_0x0433
        L_0x0421:
            r0 = move-exception
            goto L_0x0425
        L_0x0423:
            r0 = move-exception
            r3 = 1
        L_0x0425:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r6 = r0.getMessage()
            r8 = 0
            r4[r8] = r6
            java.lang.String r6 = "init mediaCodecEncoder error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r4)
        L_0x0433:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            boolean r3 = r5.f310917k
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0[r8] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
        L_0x0440:
            boolean r0 = r5.f310917k
            if (r0 != 0) goto L_0x0479
            com.tencent.mm.modelvideoh265toh264.j$b r0 = r5.f310920n
            if (r0 == 0) goto L_0x0479
            android.os.Message r0 = android.os.Message.obtain()
            r1 = 1
            r0.what = r1
            com.tencent.mm.modelvideoh265toh264.b r1 = com.tencent.p014mm.modelvideoh265toh264.C92861b.f267508d
            int r3 = r9.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            byte[] r1 = r1.mo126905m(r3)
            int r3 = r9.length
            r4 = 0
            java.lang.System.arraycopy(r9, r4, r1, r4, r3)
            r0.obj = r1
            r3 = r27
            r0.arg1 = r3
            int r1 = (int) r14
            r0.arg2 = r1
            com.tencent.mm.modelvideoh265toh264.j$b r1 = r5.f310920n
            r1.sendMessage(r0)
            goto L_0x0479
        L_0x046e:
            r33 = r4
            r29 = r10
            r34 = r12
            java.lang.String r0 = "onYuvDataImp error data is null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x0479:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r34)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "processDecodeOutputBuffer %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r1, r0)
            r1 = r46
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f310879f
            r4 = r33
            r0.mo148216r(r4, r3)
            long r3 = r1.f310877d
            r5 = 1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x04ac
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            int r0 = (r29 > r3 ? 1 : (r29 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04ac
            java.lang.String r0 = "exceed endTimeMs"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r2 = 1
            return r2
        L_0x04ac:
            android.media.MediaCodec$BufferInfo r0 = r1.f310880g
            int r0 = r0.flags
            r3 = 4
            r0 = r0 & r3
            if (r0 == 0) goto L_0x04da
            java.lang.String r0 = "receive end of stream"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f310879f     // Catch:{ Exception -> 0x04c8 }
            r0.mo148223z()     // Catch:{ Exception -> 0x04c8 }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f310879f     // Catch:{ Exception -> 0x04c8 }
            r0.mo148214p()     // Catch:{ Exception -> 0x04c8 }
            r3 = 0
            r1.f310879f = r3     // Catch:{ Exception -> 0x04c8 }
            r3 = 1
            goto L_0x04d9
        L_0x04c8:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = "stop and release decoder error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r4)
        L_0x04d9:
            return r3
        L_0x04da:
            r5 = 0
            return r5
        L_0x04dc:
            r5 = 0
            com.tencent.mm.compatible.deviceinfo.a r6 = r1.f310879f
            r6.mo148216r(r4, r5)
        L_0x04e2:
            com.tencent.mm.compatible.deviceinfo.a r4 = r1.f310879f
            android.media.MediaCodec$BufferInfo r6 = r1.f310880g
            r7 = 60000(0xea60, double:2.9644E-319)
            int r4 = r4.mo148205g(r6, r7)
            if (r4 >= 0) goto L_0x04f0
        L_0x04ef:
            return r5
        L_0x04f0:
            r6 = 0
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelvideoh265toh264.C104690e.mo148339a():boolean");
    }

    /* renamed from: b */
    public int mo148340b(String str, long j, long j2) {
        MediaCodecInfo mediaCodecInfo;
        this.f310876c = j;
        this.f310877d = j2;
        Log.m105924i("MicroMsg.MediaCodecTranscodeDecoder", "initDecoder() called with: format = [" + this.f310878e + "]");
        try {
            String string = this.f310878e.getString("mime");
            if ("video/dolby-vision".equalsIgnoreCase(string) && !C101554f.m133321f()) {
                string = "video/hevc";
            }
            this.f310879f = C104619a.m140211c(string);
            int codecCount = MediaCodecList.getCodecCount();
            int i = 0;
            loop0:
            while (true) {
                if (i >= codecCount) {
                    mediaCodecInfo = null;
                    break;
                }
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
                if (!mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(string)) {
                            break loop0;
                        }
                    }
                    continue;
                }
                i++;
            }
            Log.m105925i("MicroMsg.MediaCodecTranscodeDecoder", "found codec: %s", mediaCodecInfo);
            if (mediaCodecInfo != null) {
                Log.m105925i("MicroMsg.MediaCodecTranscodeDecoder", "codec name: %s", mediaCodecInfo.getName());
                int c = mo148341c(mediaCodecInfo, string);
                this.f310886m = c;
                Log.m105925i("MicroMsg.MediaCodecTranscodeDecoder", "found colorFormat: %s", Integer.valueOf(c));
                this.f310878e.setInteger("color-format", this.f310886m);
            }
            this.f310879f.mo148202a(this.f310878e, (Surface) null, (MediaCrypto) null, 0);
            this.f310879f.mo148222y();
            return 0;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", e, "Init decoder failed : %s", e.getMessage());
            return -1;
        }
    }

    /* renamed from: c */
    public int mo148341c(MediaCodecInfo mediaCodecInfo, String str) {
        Log.m105925i("MicroMsg.MediaCodecTranscodeDecoder", "selectColorFormat, mimeType: %s, codecInfo: %s", str, mediaCodecInfo);
        long currentTicks = Util.currentTicks();
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        Log.m105925i("MicroMsg.MediaCodecTranscodeDecoder", "getCapabilitiesForType used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
        Log.m105925i("MicroMsg.MediaCodecTranscodeDecoder", "color format length: %s", Integer.valueOf(capabilitiesForType.colorFormats.length));
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i < iArr.length) {
                int i3 = iArr[i];
                Log.m105925i("MicroMsg.MediaCodecTranscodeDecoder", "capabilities colorFormat: %s", Integer.valueOf(i3));
                if ((i3 == 19 || i3 == 21) && (i3 > i2 || i3 == 21)) {
                    i2 = i3;
                }
                i++;
            } else {
                Log.m105925i("MicroMsg.MediaCodecTranscodeDecoder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), Integer.valueOf(i2));
                return i2;
            }
        }
    }

    /* renamed from: d */
    public void mo148342d() {
        if (this.f310879f != null) {
            try {
                Log.m105924i("MicroMsg.MediaCodecTranscodeDecoder", "stop decoder");
                this.f310879f.mo148223z();
                this.f310879f.mo148214p();
                this.f310879f = null;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", e, "stop decoder error: %s", e.getMessage());
            }
        }
    }
}
