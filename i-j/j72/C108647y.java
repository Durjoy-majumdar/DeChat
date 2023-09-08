package j72;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import h81.C32735h;
import i72.C108389l;
import j72.C108600b;
import j72.C108604d;
import java.nio.ByteBuffer;
import mu3.C109639a;
import p206nj.C11171e;

/* renamed from: j72.y */
public class C108647y {

    /* renamed from: A */
    public C108612h f325351A;

    /* renamed from: B */
    public final Object f325352B = new Object();

    /* renamed from: C */
    public boolean f325353C = false;

    /* renamed from: D */
    public boolean f325354D = true;

    /* renamed from: E */
    public long f325355E = 0;

    /* renamed from: a */
    public C108600b f325356a = new C108600b(new C108648a());

    /* renamed from: b */
    public int f325357b;

    /* renamed from: c */
    public int f325358c;

    /* renamed from: d */
    public int f325359d;

    /* renamed from: e */
    public int f325360e;

    /* renamed from: f */
    public int f325361f;

    /* renamed from: g */
    public int f325362g;

    /* renamed from: h */
    public C104619a f325363h;

    /* renamed from: i */
    public MediaFormat f325364i;

    /* renamed from: j */
    public long f325365j = 0;

    /* renamed from: k */
    public ByteBuffer[] f325366k;

    /* renamed from: l */
    public ByteBuffer[] f325367l;

    /* renamed from: m */
    public int f325368m = -1;

    /* renamed from: n */
    public int f325369n = -1;

    /* renamed from: o */
    public MediaCodec.BufferInfo f325370o;

    /* renamed from: p */
    public int f325371p = 0;

    /* renamed from: q */
    public boolean f325372q = false;

    /* renamed from: r */
    public boolean f325373r = false;

    /* renamed from: s */
    public boolean f325374s = false;

    /* renamed from: t */
    public int f325375t = -1;

    /* renamed from: u */
    public int f325376u = -1;

    /* renamed from: v */
    public int f325377v = -1;

    /* renamed from: w */
    public int f325378w = -1;

    /* renamed from: x */
    public int f325379x;

    /* renamed from: y */
    public int f325380y;

    /* renamed from: z */
    public boolean f325381z = false;

    /* renamed from: j72.y$a */
    public class C108648a implements C108600b.C108602b {
        public C108648a() {
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: a */
        public void mo159674a(byte[] r27) {
            /*
                r26 = this;
                r1 = r26
                r2 = r27
                long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                j72.y r0 = j72.C108647y.this
                j72.b r5 = r0.f325356a
                int r6 = r5.f325152c
                int r5 = r5.f325151b
                r7 = 1
                r8 = 0
                if (r6 != r5) goto L_0x0016
                r5 = 1
                goto L_0x0017
            L_0x0016:
                r5 = 0
            L_0x0017:
                if (r5 == 0) goto L_0x001f
                boolean r6 = r0.f325373r
                if (r6 == 0) goto L_0x001f
                r6 = 1
                goto L_0x0020
            L_0x001f:
                r6 = 0
            L_0x0020:
                boolean r9 = r0.f325354D
                if (r9 != 0) goto L_0x0033
                java.lang.Object r9 = r0.f325352B
                monitor-enter(r9)
                boolean r11 = r0.f325353C     // Catch:{ all -> 0x0030 }
                if (r11 == 0) goto L_0x002e
                monitor-exit(r9)     // Catch:{ all -> 0x0030 }
                goto L_0x0187
            L_0x002e:
                monitor-exit(r9)     // Catch:{ all -> 0x0030 }
                goto L_0x0033
            L_0x0030:
                r0 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x0030 }
                throw r0
            L_0x0033:
                boolean r9 = r0.f325372q     // Catch:{ Exception -> 0x0157 }
                if (r9 != 0) goto L_0x0041
                java.lang.String r0 = "MicroMsg.MMSightYUVMediaCodecRecorder"
                java.lang.String r6 = "writeData, not start!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)     // Catch:{ Exception -> 0x0157 }
                goto L_0x0187
            L_0x0041:
                com.tencent.mm.compatible.deviceinfo.a r9 = r0.f325363h     // Catch:{ Exception -> 0x0157 }
                if (r9 != 0) goto L_0x004e
                java.lang.String r0 = "MicroMsg.MMSightYUVMediaCodecRecorder"
                java.lang.String r6 = "encoder is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)     // Catch:{ Exception -> 0x0157 }
                goto L_0x0187
            L_0x004e:
                long r11 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x0157 }
                com.tencent.mm.compatible.deviceinfo.a r9 = r0.f325363h     // Catch:{ Exception -> 0x0157 }
                java.nio.ByteBuffer[] r9 = r9.mo148208j()     // Catch:{ Exception -> 0x0157 }
                r0.f325366k = r9     // Catch:{ Exception -> 0x0157 }
                com.tencent.mm.compatible.deviceinfo.a r9 = r0.f325363h     // Catch:{ Exception -> 0x0157 }
                java.nio.ByteBuffer[] r9 = r9.mo148211m()     // Catch:{ Exception -> 0x0157 }
                r0.f325367l = r9     // Catch:{ Exception -> 0x0157 }
                com.tencent.mm.compatible.deviceinfo.a r9 = r0.f325363h     // Catch:{ Exception -> 0x0157 }
                r13 = 100
                int r9 = r9.mo148204f(r13)     // Catch:{ Exception -> 0x0157 }
                r0.f325368m = r9     // Catch:{ Exception -> 0x0157 }
                if (r9 >= 0) goto L_0x0078
                java.lang.String r9 = "MicroMsg.MMSightYUVMediaCodecRecorder"
                java.lang.String r13 = "video no input available, drain first"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r13)     // Catch:{ Exception -> 0x0157 }
                r0.mo159666a()     // Catch:{ Exception -> 0x0157 }
            L_0x0078:
                com.tencent.mm.compatible.deviceinfo.a r9 = r0.f325363h     // Catch:{ Exception -> 0x0157 }
                if (r9 != 0) goto L_0x0085
                java.lang.String r0 = "MicroMsg.MMSightYUVMediaCodecRecorder"
                java.lang.String r6 = "encoder is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)     // Catch:{ Exception -> 0x0157 }
                goto L_0x0187
            L_0x0085:
                java.lang.String r9 = "MicroMsg.MMSightYUVMediaCodecRecorder"
                java.lang.String r13 = "inputBufferIndex: %s"
                java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0157 }
                int r15 = r0.f325368m     // Catch:{ Exception -> 0x0157 }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0157 }
                r14[r8] = r15     // Catch:{ Exception -> 0x0157 }
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r9, r13, r14)     // Catch:{ Exception -> 0x0157 }
                long r13 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x0157 }
                int r9 = r0.f325368m     // Catch:{ Exception -> 0x0157 }
                if (r9 < 0) goto L_0x012a
                long r15 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x0157 }
                int r9 = r2.length     // Catch:{ Exception -> 0x0157 }
                r17 = r11
                long r10 = (long) r9     // Catch:{ Exception -> 0x0157 }
                r19 = 1000000000(0x3b9aca00, double:4.94065646E-315)
                long r10 = r10 * r19
                r19 = 1600000(0x186a00, double:7.90505E-318)
                long r10 = r10 / r19
                long r15 = r15 - r10
                long r9 = r0.f325365j     // Catch:{ Exception -> 0x0157 }
                long r15 = r15 - r9
                r9 = 1000(0x3e8, double:4.94E-321)
                long r9 = r15 / r9
                r11 = 0
                int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r15 >= 0) goto L_0x00c7
                long r7 = r0.f325355E     // Catch:{ Exception -> 0x0157 }
                int r19 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r19 > 0) goto L_0x00c7
                long r7 = -r9
                r0.f325355E = r7     // Catch:{ Exception -> 0x0157 }
            L_0x00c7:
                long r7 = r0.f325355E     // Catch:{ Exception -> 0x0157 }
                long r7 = r7 + r9
                java.lang.String r9 = "MicroMsg.MMSightYUVMediaCodecRecorder"
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0157 }
                r10.<init>()     // Catch:{ Exception -> 0x0157 }
                java.lang.String r11 = "presentationTime: "
                r10.append(r11)     // Catch:{ Exception -> 0x0157 }
                r10.append(r7)     // Catch:{ Exception -> 0x0157 }
                java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0157 }
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r9, r10)     // Catch:{ Exception -> 0x0157 }
                java.nio.ByteBuffer[] r9 = r0.f325366k     // Catch:{ Exception -> 0x0157 }
                int r10 = r0.f325368m     // Catch:{ Exception -> 0x0157 }
                r9 = r9[r10]     // Catch:{ Exception -> 0x0157 }
                r9.clear()     // Catch:{ Exception -> 0x0157 }
                r9.put(r2)     // Catch:{ Exception -> 0x0157 }
                r10 = 0
                r9.position(r10)     // Catch:{ Exception -> 0x0157 }
                boolean r9 = r0.f325372q     // Catch:{ Exception -> 0x0157 }
                if (r9 == 0) goto L_0x010b
                if (r6 != 0) goto L_0x010b
                com.tencent.mm.compatible.deviceinfo.a r6 = r0.f325363h     // Catch:{ Exception -> 0x0157 }
                int r9 = r0.f325368m     // Catch:{ Exception -> 0x0157 }
                r21 = 0
                int r10 = r2.length     // Catch:{ Exception -> 0x0157 }
                r25 = 0
                r19 = r6
                r20 = r9
                r22 = r10
                r23 = r7
                r19.mo148213o(r20, r21, r22, r23, r25)     // Catch:{ Exception -> 0x0157 }
                goto L_0x0133
            L_0x010b:
                java.lang.String r6 = "MicroMsg.MMSightYUVMediaCodecRecorder"
                java.lang.String r9 = "end of stream"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r6, r9)     // Catch:{ Exception -> 0x0157 }
                r6 = 1
                r0.f325374s = r6     // Catch:{ Exception -> 0x0157 }
                com.tencent.mm.compatible.deviceinfo.a r6 = r0.f325363h     // Catch:{ Exception -> 0x0157 }
                int r9 = r0.f325368m     // Catch:{ Exception -> 0x0157 }
                r21 = 0
                int r10 = r2.length     // Catch:{ Exception -> 0x0157 }
                r25 = 4
                r19 = r6
                r20 = r9
                r22 = r10
                r23 = r7
                r19.mo148213o(r20, r21, r22, r23, r25)     // Catch:{ Exception -> 0x0157 }
                goto L_0x0133
            L_0x012a:
                r17 = r11
                java.lang.String r6 = "MicroMsg.MMSightYUVMediaCodecRecorder"
                java.lang.String r7 = "input buffer not available"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r6, r7)     // Catch:{ Exception -> 0x0157 }
            L_0x0133:
                r0.mo159666a()     // Catch:{ Exception -> 0x0157 }
                java.lang.String r0 = "MicroMsg.MMSightYUVMediaCodecRecorder"
                java.lang.String r6 = "encoder used %sms %sms"
                r7 = 2
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0157 }
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r17)     // Catch:{ Exception -> 0x0157 }
                java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x0157 }
                r9 = 0
                r8[r9] = r7     // Catch:{ Exception -> 0x0157 }
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r13)     // Catch:{ Exception -> 0x0157 }
                java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x0157 }
                r9 = 1
                r8[r9] = r7     // Catch:{ Exception -> 0x0157 }
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r6, r8)     // Catch:{ Exception -> 0x0157 }
                goto L_0x0187
            L_0x0157:
                r0 = move-exception
                java.lang.String r6 = "MicroMsg.MMSightRecorderIDKeyStat"
                java.lang.String r7 = "markMediaCodecWriteYUVError"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r18 = 440(0x1b8, double:2.174E-321)
                r20 = 21
                r22 = 1
                r24 = 0
                r17.idkeyStat(r18, r20, r22, r24)
                java.lang.String r6 = "MicroMsg.MMSightYUVMediaCodecRecorder"
                java.lang.String r7 = "writeData error: %s"
                r8 = 1
                java.lang.Object[] r9 = new java.lang.Object[r8]
                java.lang.String r8 = r0.getMessage()
                r10 = 0
                r9[r10] = r8
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r9)
                java.lang.String r6 = "MicroMsg.MMSightYUVMediaCodecRecorder"
                java.lang.String r7 = ""
                java.lang.Object[] r8 = new java.lang.Object[r10]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r7, r8)
            L_0x0187:
                com.tencent.mm.modelvideoh265toh264.b r6 = com.tencent.p014mm.modelvideoh265toh264.C92861b.f267508d
                monitor-enter(r6)
                r6.mo126900k(r2)     // Catch:{ all -> 0x01c1 }
                monitor-exit(r6)
                java.lang.String r0 = "MicroMsg.MMSightYUVMediaCodecRecorder"
                java.lang.String r2 = "markStop: %s isEnd %s costTime %d"
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]
                j72.y r7 = j72.C108647y.this
                boolean r7 = r7.f325373r
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                r8 = 0
                r6[r8] = r7
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
                r8 = 1
                r6[r8] = r7
                long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r4 = 2
                r6[r4] = r3
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r6)
                if (r5 == 0) goto L_0x01c0
                j72.y r0 = j72.C108647y.this
                boolean r2 = r0.f325373r
                if (r2 == 0) goto L_0x01c0
                r0.mo159672g()
            L_0x01c0:
                return
            L_0x01c1:
                r0 = move-exception
                r2 = r0
                monitor-exit(r6)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: j72.C108647y.C108648a.mo159674a(byte[]):void");
        }
    }

    /* renamed from: j72.y$b */
    public class C108649b implements Runnable {
        public C108649b() {
        }

        public void run() {
            C108647y.this.mo159667b();
            C108612h hVar = C108647y.this.f325351A;
            if (hVar != null) {
                C108633r rVar = C108633r.this;
                rVar.getClass();
                ThreadPool.post(new C108640s(rVar), "MMSightMediaCodecMP4MuxRecorder_stop");
                C108647y.this.f325351A = null;
            }
        }
    }

    public C108647y(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, C108644v vVar) {
        this.f325357b = i;
        this.f325358c = i2;
        Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "create MMSightYUVMediaCodecRecorder, init targetWidth: %d, targetHeight: %d", Integer.valueOf(i3), Integer.valueOf(i4));
        Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "create MMSightYUVMediaCodecRecorder, after align 16, targetWidth: %d, targetHeight: %d", Integer.valueOf(i3), Integer.valueOf(i4));
        this.f325359d = i3;
        this.f325360e = i4;
        this.f325380y = i7;
        this.f325379x = i6;
        this.f325370o = new MediaCodec.BufferInfo();
        this.f325371p = i5;
        this.f325381z = z;
        this.f325354D = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_ignore_mediacodec_lock, false);
        Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "create BigSightMediaCodecYUVRecorder, frameWidth: %s, frameHeight: %s, targetWidth: %s, targetHeight: %s, bitrate: %s, needRotateEachFrame: %s, muxer: %s", Integer.valueOf(this.f325357b), Integer.valueOf(this.f325358c), Integer.valueOf(this.f325359d), Integer.valueOf(this.f325360e), Integer.valueOf(i5), Boolean.valueOf(z), vVar);
    }

    /* renamed from: a */
    public final void mo159666a() {
        this.f325369n = this.f325363h.mo148205g(this.f325370o, 100);
        Log.m105926v("MicroMsg.MMSightYUVMediaCodecRecorder", "outputBufferIndex-->" + this.f325369n);
        while (true) {
            int i = this.f325369n;
            if (i == -1) {
                Log.m105919d("MicroMsg.MMSightYUVMediaCodecRecorder", "no output from encoder available, break encoderEndStream %s", Boolean.valueOf(this.f325374s));
                if (!this.f325374s) {
                    return;
                }
            } else if (i == -3) {
                this.f325367l = this.f325363h.mo148211m();
                Log.m105918d("MicroMsg.MMSightYUVMediaCodecRecorder", "encoder output buffers changed");
            } else if (i == -2) {
                Log.m105918d("MicroMsg.MMSightYUVMediaCodecRecorder", "encoder output format changed: " + this.f325363h.mo148212n());
            } else if (i < 0) {
                Log.m105928w("MicroMsg.MMSightYUVMediaCodecRecorder", "unexpected result from encoder.dequeueOutputBuffer: " + this.f325369n);
            } else {
                Log.m105926v("MicroMsg.MMSightYUVMediaCodecRecorder", "perform encoding");
                ByteBuffer byteBuffer = this.f325367l[this.f325369n];
                if (byteBuffer != null) {
                    this.f325362g++;
                    MediaCodec.BufferInfo bufferInfo = this.f325370o;
                    if ((bufferInfo.flags & 2) != 0) {
                        Log.m105927v("MicroMsg.MMSightYUVMediaCodecRecorder", "ignoring BUFFER_FLAG_CODEC_CONFIG, size: %s, %s", Integer.valueOf(bufferInfo.size), Boolean.FALSE);
                    }
                    MediaCodec.BufferInfo bufferInfo2 = this.f325370o;
                    if (bufferInfo2.size != 0) {
                        byteBuffer.position(bufferInfo2.offset);
                        MediaCodec.BufferInfo bufferInfo3 = this.f325370o;
                        byteBuffer.limit(bufferInfo3.offset + bufferInfo3.size);
                        MediaCodec.BufferInfo bufferInfo4 = this.f325370o;
                        C108646x xVar = (C108646x) this;
                        if (xVar.f325350F >= 0 && bufferInfo4 != null && bufferInfo4.size == byteBuffer.limit() - byteBuffer.position()) {
                            long currentTicks = Util.currentTicks();
                            SightVideoJNI.writeH264DataLock(xVar.f325350F, byteBuffer, bufferInfo4.size, bufferInfo4.presentationTimeUs);
                            Log.m105925i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "writeH264Data used %sms, size: %s %s", Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(bufferInfo4.size), Integer.valueOf(byteBuffer.capacity()));
                        }
                    }
                    this.f325363h.mo148216r(this.f325369n, false);
                    if ((this.f325370o.flags & 4) != 0) {
                        if (!this.f325373r) {
                            Log.m105920e("MicroMsg.MMSightYUVMediaCodecRecorder", "reached end of stream unexpectedly");
                            return;
                        }
                        Log.m105928w("MicroMsg.MMSightYUVMediaCodecRecorder", "do stop encoder");
                        mo159667b();
                        C108612h hVar = this.f325351A;
                        if (hVar != null) {
                            C108633r rVar = C108633r.this;
                            rVar.getClass();
                            ThreadPool.post(new C108640s(rVar), "MMSightMediaCodecMP4MuxRecorder_stop");
                            this.f325351A = null;
                            return;
                        }
                        return;
                    }
                } else {
                    throw new RuntimeException("encoderOutputBuffer " + this.f325369n + " was null");
                }
            }
            int g = this.f325363h.mo148205g(this.f325370o, 100);
            this.f325369n = g;
            if (g <= 0) {
                Log.m105927v("MicroMsg.MMSightYUVMediaCodecRecorder", "get outputBufferIndex %d", Integer.valueOf(g));
            }
            if (this.f325369n < 0 && !this.f325374s) {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo159667b() {
        /*
            r6 = this;
            boolean r0 = r6.f325354D
            if (r0 == 0) goto L_0x0008
            r6.mo159668c()
            return
        L_0x0008:
            java.lang.Object r0 = r6.f325352B
            monitor-enter(r0)
            boolean r1 = r6.f325353C     // Catch:{ all -> 0x0022 }
            if (r1 != 0) goto L_0x0020
            r1 = 0
            long r3 = r6.f325365j     // Catch:{ all -> 0x0022 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            r1 = 1
            r6.f325353C = r1     // Catch:{ all -> 0x0022 }
            r6.mo159668c()     // Catch:{ all -> 0x0022 }
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j72.C108647y.mo159667b():void");
    }

    /* renamed from: c */
    public final void mo159668c() {
        try {
            C108600b bVar = this.f325356a;
            if (bVar != null) {
                bVar.mo159597b();
            }
            if (this.f325363h != null) {
                Log.m105924i("MicroMsg.MMSightYUVMediaCodecRecorder", "stop encoder");
                this.f325363h.mo148223z();
                this.f325363h.mo148214p();
                this.f325372q = false;
                this.f325363h = null;
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMSightYUVMediaCodecRecorder", "clear error: %s", e.getMessage());
        }
    }

    /* renamed from: d */
    public final int mo159669d() {
        MediaCodecInfo mediaCodecInfo;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MMSIGHT_MEDIACODEC_COLORFORMAT_INT;
        long currentTicks = Util.currentTicks();
        int codecCount = MediaCodecList.getCodecCount();
        int i = 0;
        loop0:
        while (true) {
            if (i >= codecCount) {
                mediaCodecInfo = null;
                break;
            }
            mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            if (mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase("video/avc")) {
                        break loop0;
                    }
                }
                continue;
            }
            i++;
        }
        int i2 = -1;
        if (mediaCodecInfo == null) {
            Log.m105920e("MicroMsg.MMSightYUVMediaCodecRecorder", "Unable to find an appropriate codec for video/avc");
            C108389l.m146845f();
            return -1;
        }
        Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "found codec: %s, used %sms", mediaCodecInfo.getName(), Long.valueOf(Util.ticksToNow(currentTicks)));
        long currentTicks2 = Util.currentTicks();
        if (CaptureMMProxy.getInstance() != null) {
            i2 = CaptureMMProxy.getInstance().getInt(aVar, -1);
        }
        Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "saveColorFormat: %s", Integer.valueOf(i2));
        if (i2 <= 0) {
            long currentTicks3 = Util.currentTicks();
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
            Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "getCapabilitiesForType used %sms", Long.valueOf(Util.ticksToNow(currentTicks3)));
            Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "color format length: %s", Integer.valueOf(capabilitiesForType.colorFormats.length));
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr = capabilitiesForType.colorFormats;
                if (i4 >= iArr.length) {
                    break;
                }
                int i5 = iArr[i4];
                Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "capabilities colorFormat: %s", Integer.valueOf(i5));
                if ((i5 == 19 || i5 == 21 || i5 == 2130706688) && (i5 > i3 || i5 == 21)) {
                    i3 = i5;
                }
                i4++;
            }
            Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), Integer.valueOf(i3));
            i2 = i3;
        }
        this.f325361f = i2;
        long ticksToNow = Util.ticksToNow(currentTicks2);
        if (this.f325361f > 0 && ticksToNow > 200 && CaptureMMProxy.getInstance() != null) {
            CaptureMMProxy.getInstance().set(aVar, Integer.valueOf(this.f325361f));
        }
        Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "found colorFormat: %s, used %sms", Integer.valueOf(this.f325361f), Long.valueOf(ticksToNow));
        long currentTicks4 = Util.currentTicks();
        Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "initRotate: %s", Integer.valueOf(this.f325375t));
        if (this.f325381z) {
            int i6 = this.f325375t;
            this.f325364i = MediaFormat.createVideoFormat("video/avc", (i6 == 180 || i6 == 0) ? this.f325359d : this.f325360e, (i6 == 180 || i6 == 0) ? this.f325360e : this.f325359d);
        } else {
            int i7 = this.f325375t;
            this.f325364i = MediaFormat.createVideoFormat("video/avc", (i7 == 180 || i7 == 0) ? this.f325360e : this.f325359d, (i7 == 180 || i7 == 0) ? this.f325359d : this.f325360e);
        }
        Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "createVideoFormat used %sms", Long.valueOf(Util.ticksToNow(currentTicks4)));
        if (C11171e.m11046c(23)) {
            try {
                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("video/avc");
                if (!(capabilitiesForType2 == null || (codecProfileLevelArr = capabilitiesForType2.profileLevels) == null)) {
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.level = 0;
                    codecProfileLevel.profile = 0;
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                        int i8 = codecProfileLevel2.profile;
                        int i9 = codecProfileLevel2.level;
                        Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "profile: %s, level: %s", Integer.valueOf(i8), Integer.valueOf(i9));
                        if ((i8 == 1 || i8 == 2 || i8 == 8) && i8 >= codecProfileLevel.profile && i9 >= codecProfileLevel.level) {
                            codecProfileLevel.profile = i8;
                            codecProfileLevel.level = i9;
                        }
                    }
                    Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "best profile: %s, level: %s", Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level));
                    int i15 = codecProfileLevel.profile;
                    if (i15 > 0 && codecProfileLevel.level >= 256) {
                        this.f325364i.setInteger(Scopes.PROFILE, i15);
                        this.f325364i.setInteger(FirebaseAnalytics.C113379b.LEVEL, 256);
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MMSightYUVMediaCodecRecorder", "trySetProfile error: %s", e.getMessage());
            }
        }
        try {
            if (C11171e.m11046c(21)) {
                this.f325364i.setInteger("bitrate-mode", 1);
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.MMSightYUVMediaCodecRecorder", "trySetBitRateMode error: %s", e2.getMessage());
        }
        this.f325364i.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.f325371p);
        this.f325364i.setInteger("frame-rate", this.f325380y);
        this.f325364i.setInteger("color-format", this.f325361f);
        this.f325364i.setInteger("i-frame-interval", this.f325379x);
        Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "mediaFormat: %s", this.f325364i);
        C104619a b = C104619a.m140210b(mediaCodecInfo.getName());
        this.f325363h = b;
        b.mo148202a(this.f325364i, (Surface) null, (MediaCrypto) null, 1);
        this.f325363h.mo148222y();
        if (this.f325354D) {
            return 0;
        }
        synchronized (this.f325352B) {
            this.f325353C = false;
        }
        return 0;
    }

    /* renamed from: e */
    public void mo159670e() {
        Log.m105924i("MicroMsg.MMSightYUVMediaCodecRecorder", "Start");
        this.f325372q = true;
        Log.m105924i("MicroMsg.MMSightYUVMediaCodecRecorder", "Start：isStart：" + this.f325372q);
        this.f325365j = System.nanoTime();
    }

    /* renamed from: f */
    public void mo159671f(C108612h hVar) {
        this.f325351A = hVar;
        this.f325373r = true;
        C108600b bVar = this.f325356a;
        boolean z = bVar.f325152c == bVar.f325151b;
        Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "!!!stop, isStart!!: %s %s isEnd %s", Boolean.valueOf(this.f325372q), this.f325351A, Boolean.valueOf(z));
        if (z) {
            mo159672g();
        }
    }

    /* renamed from: g */
    public final void mo159672g() {
        Log.m105925i("MicroMsg.MMSightYUVMediaCodecRecorder", "stopImp %s  isStart:%b", Util.getStack().toString(), Boolean.valueOf(this.f325372q));
        try {
            if (this.f325372q) {
                MMHandlerThread.postToMainThreadDelayed(new C108649b(), 500);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMSightYUVMediaCodecRecorder", "stop error: %s", e.getMessage());
        }
    }

    /* renamed from: h */
    public void mo159673h(byte[] bArr, int i, int i2, int i3) {
        int i4;
        boolean z;
        int i5;
        Util.currentTicks();
        int i6 = this.f325375t;
        boolean z2 = this.f325381z;
        if (!z2) {
            int i7 = this.f325376u;
            if (i7 == -1 || i7 == i6) {
                i4 = i6;
                z = false;
            } else {
                int max = Math.max(0, i6 <= 180 ? i7 - i6 : i7 + (360 - i6));
                if (max >= 360) {
                    z = true;
                    i4 = 0;
                } else {
                    i4 = max;
                    z = true;
                }
            }
        } else {
            int i8 = this.f325376u;
            if (i8 != -1) {
                i6 = i8;
            }
            i4 = i6;
            z = z2;
        }
        int i9 = this.f325375t;
        int i15 = this.f325376u;
        if (!(i15 == -1 || i15 == i9)) {
            i9 = i15;
        }
        int i16 = (i9 == 0 || i9 == 180) ? i2 : i3;
        int i17 = (i9 == 0 || i9 == 180) ? i3 : i2;
        int i18 = this.f325359d;
        boolean z3 = (i16 == i18 && i17 == this.f325360e) ? false : true;
        int i19 = this.f325377v;
        boolean z4 = (i19 == -1 || (i5 = this.f325378w) == -1 || (i19 == i18 && i5 == this.f325360e)) ? z3 : true;
        Log.m105919d("MicroMsg.MMSightYUVMediaCodecRecorder", "writeData, needRotateEachFrame: %s, needScale: %s, width: %s, height: %s, rotate: %s, needRotate %s srcWidth %d srcHeight %d determinRotate %d", Boolean.valueOf(this.f325381z), Boolean.valueOf(z4), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(z), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i9));
        C108604d dVar = new C108604d(i16, i17, this.f325361f, this.f325359d, this.f325360e, z4, z, i4, bArr);
        C108600b bVar = this.f325356a;
        if (!bVar.f325156g) {
            if (bVar.f325154e == null) {
                bVar.f325154e = new MMHandler(Looper.myLooper());
            }
            int i25 = bVar.f325151b;
            int i26 = i25 % C108600b.f325149i;
            MMHandler mMHandler = bVar.f325150a[i26];
            if (mMHandler != null) {
                C109639a serial = mMHandler.getSerial();
                C108604d.C108605a aVar = bVar.f325157h;
                dVar.f325163c = i25;
                dVar.f325170j = i26;
                dVar.f325164d = Util.currentTicks();
                Log.m105925i("MicroMsg.FrameBufProcessor", "create framebuf %d %d", Integer.valueOf(dVar.f325161a.length), Integer.valueOf(dVar.f325163c));
                new MMHandler(serial).post(new C108603c(dVar, aVar));
                bVar.f325151b++;
            }
        }
    }
}
