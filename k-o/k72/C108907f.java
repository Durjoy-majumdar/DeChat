package k72;

import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p914oj.C110052b;

/* renamed from: k72.f */
public class C108907f implements C108898a {

    /* renamed from: a */
    public C110052b f326229a;

    /* renamed from: b */
    public C108913i f326230b;

    /* renamed from: c */
    public long f326231c;

    /* renamed from: d */
    public long f326232d;

    /* renamed from: e */
    public MediaFormat f326233e;

    /* renamed from: f */
    public C104619a f326234f;

    /* renamed from: g */
    public MediaCodec.BufferInfo f326235g = new MediaCodec.BufferInfo();

    /* renamed from: h */
    public int f326236h = -1;

    /* renamed from: i */
    public int f326237i;

    /* renamed from: j */
    public int f326238j;

    /* renamed from: k */
    public byte[] f326239k;

    /* renamed from: l */
    public int f326240l = 0;

    /* renamed from: m */
    public boolean f326241m = false;

    /* renamed from: a */
    public void mo160029a(int i) {
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecDecoder", "setFrameDropInterval: %s", Integer.valueOf(i));
        this.f326237i = i;
    }

    /* renamed from: b */
    public int mo160030b() {
        int integer = this.f326233e.getInteger("color-format");
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecDecoder", "src color format: %s", Integer.valueOf(integer));
        return integer != 19 ? 1 : 2;
    }

    /* renamed from: c */
    public Point mo160031c() {
        return new Point(this.f326233e.getInteger("width"), this.f326233e.getInteger("height"));
    }

    /* renamed from: d */
    public void mo160032d(C108913i iVar) {
        this.f326230b = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d0, code lost:
        if (r3 != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0117, code lost:
        if (mo160039g() != false) goto L_0x0151;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ea A[EDGE_INSN: B:47:0x00ea->B:35:0x00ea ?: BREAK  , SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo160033e() {
        /*
            r20 = this;
            r0 = r20
            r1 = 0
            r0.f326240l = r1
            r0.f326241m = r1
        L_0x0007:
            oj.b r2 = r0.f326229a
            com.tencent.mm.compatible.deviceinfo.a r3 = r0.f326234f
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r6 = "input buffer not available"
            r7 = 60000(0xea60, double:2.9644E-319)
            java.lang.String r9 = "MicroMsg.MMSightRemuxMediaCodecDecoder"
            r10 = 1
            if (r3 != 0) goto L_0x001f
            java.lang.String r2 = "input decoder is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
        L_0x001c:
            r2 = 1
            goto L_0x00d3
        L_0x001f:
            java.nio.ByteBuffer[] r3 = r3.mo148208j()
            if (r3 != 0) goto L_0x0028
            r2 = 0
            goto L_0x00d3
        L_0x0028:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            int r12 = r3.length
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r1] = r12
            java.lang.String r12 = "decoderInputByteBuffers size: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r11)
            r11 = 0
        L_0x0037:
            com.tencent.mm.compatible.deviceinfo.a r12 = r0.f326234f
            int r14 = r12.mo148204f(r7)
            if (r14 >= 0) goto L_0x0062
            r12 = 15
            if (r11 >= r12) goto L_0x0062
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r14 = r20.mo160039g()
            java.lang.Object[] r15 = new java.lang.Object[r10]
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r12)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r15[r1] = r12
            java.lang.String r12 = "drain cost1 %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r15)
            if (r14 == 0) goto L_0x005f
        L_0x005e:
            goto L_0x001c
        L_0x005f:
            int r11 = r11 + 1
            goto L_0x0037
        L_0x0062:
            if (r14 < 0) goto L_0x00b3
            r3 = r3[r14]
            r3.clear()
            int r11 = r2.mo161387f(r3, r1)
            r0.f326238j = r11
            r3.position(r1)
            long r17 = r2.mo161383b()
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.Long r3 = java.lang.Long.valueOf(r17)
            r2[r1] = r3
            java.lang.String r3 = "sampleTime: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r2)
            int r2 = r0.f326238j
            if (r2 < 0) goto L_0x0092
            long r2 = r0.f326232d
            long r2 = r2 * r4
            int r11 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r11 < 0) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            r2 = 0
            goto L_0x0093
        L_0x0092:
            r2 = 1
        L_0x0093:
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            r3[r1] = r11
            java.lang.String r11 = "sawInputEOS: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r3)
            com.tencent.mm.compatible.deviceinfo.a r13 = r0.f326234f
            r15 = 0
            int r3 = r0.f326238j
            if (r2 == 0) goto L_0x00ab
            r11 = 4
            r19 = 4
            goto L_0x00ad
        L_0x00ab:
            r19 = 0
        L_0x00ad:
            r16 = r3
            r13.mo148213o(r14, r15, r16, r17, r19)
            goto L_0x00b7
        L_0x00b3:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r6)
            r2 = 0
        L_0x00b7:
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r3 = r20.mo160039g()
            java.lang.Object[] r13 = new java.lang.Object[r10]
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13[r1] = r11
            java.lang.String r11 = "drain cost2 %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r13)
            if (r3 == 0) goto L_0x00d3
            goto L_0x005e
        L_0x00d3:
            if (r2 == 0) goto L_0x00d6
            goto L_0x00ea
        L_0x00d6:
            oj.b r2 = r0.f326229a
            r2.mo161382a()
            oj.b r2 = r0.f326229a
            int r2 = r2.mo161384c()
            int r3 = r0.f326236h
            if (r2 == r3) goto L_0x0007
            java.lang.String r2 = "track index not match, break"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
        L_0x00ea:
            oj.b r2 = r0.f326229a
            java.lang.String r3 = "sendDecoderEOS"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            com.tencent.mm.compatible.deviceinfo.a r3 = r0.f326234f
            java.nio.ByteBuffer[] r3 = r3.mo148208j()
            com.tencent.mm.compatible.deviceinfo.a r11 = r0.f326234f
            int r13 = r11.mo148204f(r7)
            if (r13 >= 0) goto L_0x011a
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r7[r1] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r7[r10] = r8
            java.lang.String r8 = "check decoder input buffer index = %d count = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r7)
            boolean r7 = r20.mo160039g()
            if (r7 == 0) goto L_0x011a
            goto L_0x0151
        L_0x011a:
            if (r13 < 0) goto L_0x014c
            r3 = r3[r13]
            r3.clear()
            int r7 = r2.mo161387f(r3, r1)
            r0.f326238j = r7
            r3.position(r1)
            long r2 = r2.mo161383b()
            if (r13 < 0) goto L_0x0149
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r6[r1] = r7
            java.lang.String r1 = "send EOS, decoderInputBufferIndex: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r6)
            com.tencent.mm.compatible.deviceinfo.a r12 = r0.f326234f
            r14 = 0
            r15 = 0
            long r16 = r2 * r4
            r18 = 4
            r12.mo148213o(r13, r14, r15, r16, r18)
            goto L_0x014c
        L_0x0149:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r6)
        L_0x014c:
            r0.f326241m = r10
            r20.mo160039g()
        L_0x0151:
            k72.e r1 = new k72.e
            r1.<init>(r0)
            r2 = 500(0x1f4, double:2.47E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r1, r2)
            oj.b r1 = r0.f326229a
            r1.mo161388g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k72.C108907f.mo160033e():void");
    }

    /* renamed from: f */
    public int mo160034f(String str, long j, long j2, int i) {
        MediaCodecInfo mediaCodecInfo;
        if (!Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.MMSightRemuxMediaCodecDecoder", "initDecoder, srcFilePath: %s, startTime: %s, endTime: %s, videoFps: %s", str, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i));
            try {
                C110052b bVar = new C110052b();
                this.f326229a = bVar;
                bVar.mo161392k(str);
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f326229a.mo161385d()) {
                        break;
                    }
                    MediaFormat e = this.f326229a.mo161386e(i2);
                    if (e.getString("mime").toLowerCase().startsWith("video/")) {
                        this.f326236h = i2;
                        this.f326233e = e;
                        break;
                    }
                    i2++;
                }
                int i3 = this.f326236h;
                if (i3 < 0) {
                    return -1;
                }
                this.f326231c = j;
                this.f326232d = j2;
                this.f326229a.mo161390i(i3);
                String string = this.f326233e.getString("mime");
                this.f326234f = C104619a.m140211c(string);
                int codecCount = MediaCodecList.getCodecCount();
                int i4 = 0;
                loop1:
                while (true) {
                    if (i4 >= codecCount) {
                        mediaCodecInfo = null;
                        break;
                    }
                    mediaCodecInfo = MediaCodecList.getCodecInfoAt(i4);
                    if (!mediaCodecInfo.isEncoder()) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        for (String equalsIgnoreCase : supportedTypes) {
                            if (equalsIgnoreCase.equalsIgnoreCase(string)) {
                                break loop1;
                            }
                        }
                        continue;
                    }
                    i4++;
                }
                Log.m105925i("MicroMsg.MMSightRemuxMediaCodecDecoder", "found codec: %s", mediaCodecInfo);
                if (mediaCodecInfo != null) {
                    Log.m105925i("MicroMsg.MMSightRemuxMediaCodecDecoder", "codec name: %s", mediaCodecInfo.getName());
                    int h = mo160040h(mediaCodecInfo, string);
                    Log.m105925i("MicroMsg.MMSightRemuxMediaCodecDecoder", "found colorFormat: %s", Integer.valueOf(h));
                    this.f326233e.setInteger("color-format", h);
                }
                this.f326234f.mo148202a(this.f326233e, (Surface) null, (MediaCrypto) null, 0);
                this.f326234f.mo148222y();
                return 0;
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.MMSightRemuxMediaCodecDecoder", e2, "Init decoder failed : %s", e2.getMessage());
            }
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01de A[LOOP:0: B:5:0x0041->B:74:0x01de, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01dd A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo160039g() {
        /*
            r21 = this;
            r1 = r21
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f326234f
            r2 = 1
            java.lang.String r3 = "MicroMsg.MMSightRemuxMediaCodecDecoder"
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "drainDecoder, decoder is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            return r2
        L_0x000f:
            java.nio.ByteBuffer[] r0 = r0.mo148211m()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r5 = r0.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "decoderOutputByteBuffers length: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
            com.tencent.mm.compatible.deviceinfo.a r4 = r1.f326234f
            android.media.MediaCodec$BufferInfo r5 = r1.f326235g
            r7 = 60000(0xea60, double:2.9644E-319)
            int r4 = r4.mo148205g(r5, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "outputBufferIndex-->"
            r5.append(r9)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
        L_0x0041:
            r5 = -1
            if (r4 != r5) goto L_0x004c
            java.lang.String r0 = "no output from decoder available, break"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x0049:
            r5 = 0
            goto L_0x01dd
        L_0x004c:
            r5 = -3
            if (r4 != r5) goto L_0x005d
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f326234f
            java.nio.ByteBuffer[] r0 = r0.mo148211m()
            java.lang.String r4 = "decoder output buffers changed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
        L_0x005a:
            r5 = 0
            goto L_0x01d0
        L_0x005d:
            r5 = -2
            if (r4 != r5) goto L_0x007f
            com.tencent.mm.compatible.deviceinfo.a r4 = r1.f326234f
            android.media.MediaFormat r4 = r4.mo148212n()
            r1.f326233e = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "decoder output format changed: "
            r4.append(r5)
            android.media.MediaFormat r5 = r1.f326233e
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            goto L_0x005a
        L_0x007f:
            if (r4 >= 0) goto L_0x0096
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "unexpected result from decoder.dequeueOutputBuffer: "
            r5.append(r9)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)
            goto L_0x005a
        L_0x0096:
            java.lang.String r5 = "perform decoding"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r3, r5)
            r5 = r0[r4]
            if (r5 != 0) goto L_0x00a0
            goto L_0x0049
        L_0x00a0:
            android.media.MediaCodec$BufferInfo r9 = r1.f326235g
            long r10 = r9.presentationTimeUs
            long r12 = r1.f326231c
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            r7 = 2
            r8 = 4
            int r17 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r17 >= 0) goto L_0x00d2
            int r12 = r9.flags
            r12 = r12 & r8
            if (r12 != 0) goto L_0x00d2
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f326234f
            r0.mo148216r(r4, r6)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r0[r6] = r4
            long r4 = r1.f326231c
            long r4 = r4 * r14
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0[r2] = r4
            java.lang.String r2 = "decoder pts: %s, not reach start: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
            return r6
        L_0x00d2:
            int r12 = r9.size
            if (r12 == 0) goto L_0x01ca
            int r0 = r9.offset
            r5.position(r0)
            android.media.MediaCodec$BufferInfo r0 = r1.f326235g
            int r9 = r0.offset
            int r0 = r0.size
            int r9 = r9 + r0
            r5.limit(r9)
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            android.media.MediaCodec$BufferInfo r0 = r1.f326235g
            int r9 = r1.f326240l
            int r9 = r9 + r2
            r1.f326240l = r9
            int r14 = r1.f326237i
            r15 = 1
            if (r14 <= r2) goto L_0x00fb
            int r9 = r9 % r14
            if (r9 != 0) goto L_0x00fb
            goto L_0x016e
        L_0x00fb:
            byte[] r9 = r1.f326239k
            if (r9 != 0) goto L_0x0107
            int r9 = r5.remaining()
            byte[] r9 = new byte[r9]
            r1.f326239k = r9
        L_0x0107:
            long r19 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.compatible.deviceinfo.a r9 = r1.f326234f     // Catch:{ Exception -> 0x0114 }
            android.media.MediaFormat r9 = r9.mo148212n()     // Catch:{ Exception -> 0x0114 }
            r1.f326233e = r9     // Catch:{ Exception -> 0x0114 }
            goto L_0x0119
        L_0x0114:
            java.lang.String r9 = "get output format error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
        L_0x0119:
            byte[] r9 = r1.f326239k
            int r14 = r5.remaining()
            r5.get(r9, r6, r14)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r9[r6] = r5
            r9[r2] = r0
            int r5 = r0.size
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9[r7] = r5
            r5 = 3
            long r19 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r19)
            java.lang.Long r7 = java.lang.Long.valueOf(r19)
            r9[r5] = r7
            java.lang.String r5 = "processDecodeOutputBuffer, byteBuffer: %s, bufferInfo: %s, size: %d cost %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r9)
            k72.i r5 = r1.f326230b
            if (r5 == 0) goto L_0x016e
            long r8 = r1.f326232d
            int r14 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r14 == 0) goto L_0x0156
            long r6 = r0.presentationTimeUs
            r17 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r17
            int r19 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r19 < 0) goto L_0x0156
            r6 = 1
            goto L_0x0157
        L_0x0156:
            r6 = 0
        L_0x0157:
            byte[] r7 = r1.f326239k
            if (r7 == 0) goto L_0x0164
            boolean r8 = r1.f326241m
            if (r8 != 0) goto L_0x0164
            if (r6 == 0) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            r6 = 0
            goto L_0x0165
        L_0x0164:
            r6 = 1
        L_0x0165:
            long r8 = r0.presentationTimeUs
            r17 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r17
            r5.mo160036a(r7, r6, r8)
        L_0x016e:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r12)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "processDecodeOutputBuffer %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r5, r0)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f326234f
            r0.mo148216r(r4, r6)
            long r4 = r1.f326232d
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x019b
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x019b
            java.lang.String r0 = "exceed endTimeMs"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            r1.f326241m = r2
            return r2
        L_0x019b:
            android.media.MediaCodec$BufferInfo r0 = r1.f326235g
            int r0 = r0.flags
            r4 = 4
            r0 = r0 & r4
            if (r0 == 0) goto L_0x01c8
            java.lang.String r0 = "receive end of stream"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f326234f     // Catch:{ Exception -> 0x01b8 }
            r0.mo148223z()     // Catch:{ Exception -> 0x01b8 }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f326234f     // Catch:{ Exception -> 0x01b8 }
            r0.mo148214p()     // Catch:{ Exception -> 0x01b8 }
            r1.f326241m = r2     // Catch:{ Exception -> 0x01b8 }
            r0 = 0
            r1.f326234f = r0     // Catch:{ Exception -> 0x01b8 }
            goto L_0x01c7
        L_0x01b8:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = "stop and release decoder error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
        L_0x01c7:
            return r2
        L_0x01c8:
            r5 = 0
            return r5
        L_0x01ca:
            r5 = 0
            com.tencent.mm.compatible.deviceinfo.a r6 = r1.f326234f
            r6.mo148216r(r4, r5)
        L_0x01d0:
            com.tencent.mm.compatible.deviceinfo.a r4 = r1.f326234f
            android.media.MediaCodec$BufferInfo r6 = r1.f326235g
            r7 = 60000(0xea60, double:2.9644E-319)
            int r4 = r4.mo148205g(r6, r7)
            if (r4 >= 0) goto L_0x01de
        L_0x01dd:
            return r5
        L_0x01de:
            r6 = 0
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: k72.C108907f.mo160039g():boolean");
    }

    /* renamed from: h */
    public int mo160040h(MediaCodecInfo mediaCodecInfo, String str) {
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecDecoder", "selectColorFormat, mimeType: %s, codecInfo: %s", str, mediaCodecInfo);
        long currentTicks = Util.currentTicks();
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecDecoder", "getCapabilitiesForType used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecDecoder", "color format length: %s", Integer.valueOf(capabilitiesForType.colorFormats.length));
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i < iArr.length) {
                int i3 = iArr[i];
                Log.m105925i("MicroMsg.MMSightRemuxMediaCodecDecoder", "capabilities colorFormat: %s", Integer.valueOf(i3));
                if ((i3 == 19 || i3 == 21) && (i3 > i2 || i3 == 21)) {
                    i2 = i3;
                }
                i++;
            } else {
                Log.m105925i("MicroMsg.MMSightRemuxMediaCodecDecoder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), Integer.valueOf(i2));
                return i2;
            }
        }
    }
}
