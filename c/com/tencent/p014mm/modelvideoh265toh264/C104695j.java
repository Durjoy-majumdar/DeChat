package com.tencent.p014mm.modelvideoh265toh264;

import android.graphics.Point;
import android.media.MediaFormat;
import android.os.Message;
import android.os.Process;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.modelvideoh265toh264.C104685a;
import com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.Future;
import lu3.C88654b;
import p914oj.C110052b;

/* renamed from: com.tencent.mm.modelvideoh265toh264.j */
public class C104695j implements C104685a.C104686a {

    /* renamed from: x */
    public static int f310906x = -1;

    /* renamed from: a */
    public long f310907a = -1;

    /* renamed from: b */
    public long f310908b = -1;

    /* renamed from: c */
    public int f310909c;

    /* renamed from: d */
    public int f310910d;

    /* renamed from: e */
    public int f310911e;

    /* renamed from: f */
    public int f310912f;

    /* renamed from: g */
    public int f310913g;

    /* renamed from: h */
    public int f310914h;

    /* renamed from: i */
    public int f310915i;

    /* renamed from: j */
    public int f310916j;

    /* renamed from: k */
    public boolean f310917k = false;

    /* renamed from: l */
    public C104698c f310918l;

    /* renamed from: m */
    public C104687c f310919m;

    /* renamed from: n */
    public C104697b f310920n;

    /* renamed from: o */
    public VideoTransPara f310921o;

    /* renamed from: p */
    public String f310922p;

    /* renamed from: q */
    public C110052b f310923q;

    /* renamed from: r */
    public int f310924r;

    /* renamed from: s */
    public C104685a f310925s;

    /* renamed from: t */
    public int f310926t = -1;

    /* renamed from: u */
    public MediaFormat f310927u;

    /* renamed from: v */
    public boolean f310928v = false;

    /* renamed from: w */
    public int f310929w;

    /* renamed from: com.tencent.mm.modelvideoh265toh264.j$a */
    public class C104696a implements Runnable {
        public C104696a() {
        }

        public void run() {
            C104695j jVar = C104695j.this;
            Log.m105925i("MicroMsg.VideoTranscoder", "waitEncoderFinish: %s %s %s ", jVar.f310918l, Boolean.valueOf(jVar.f310917k), jVar.f310920n);
            if (jVar.f310917k) {
                C104698c cVar = jVar.f310918l;
                if (cVar != null) {
                    cVar.f310935g = true;
                    try {
                        Future future = cVar.f255969d;
                        if (future != null && !future.isCancelled()) {
                            cVar.f255969d.get();
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.VideoTranscoder", e, "waitEncoderFinish, join error: %s", e.getMessage());
                    }
                }
            } else {
                C104697b bVar = jVar.f310920n;
                if (bVar != null) {
                    try {
                        bVar.quit();
                        jVar.f310920n.join();
                        jVar.f310920n = null;
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.VideoTranscoder", e2, "waitEncoderFinish, join error: %s", e2.getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.modelvideoh265toh264.j$b */
    public class C104697b extends MMHandler {

        /* renamed from: a */
        public Point f310931a = null;

        public C104697b(String str) {
            super(str);
        }

        public void handleMessage(Message message) {
            int i;
            int i2;
            long j;
            Message message2 = message;
            if (message2.what == 1) {
                byte[] bArr = (byte[]) message2.obj;
                boolean z = message2.arg1 == 1;
                long j2 = (long) message2.arg2;
                C104695j jVar = C104695j.this;
                if (jVar.f310919m != null) {
                    C104690e eVar = (C104690e) jVar.f310925s;
                    this.f310931a = new Point(eVar.f310878e.getInteger("width"), eVar.f310878e.getInteger("height"));
                    MediaFormat mediaFormat = C104695j.this.f310927u;
                    if (mediaFormat != null) {
                        i2 = mediaFormat.getInteger("width");
                        i = C104695j.this.f310927u.getInteger("height");
                    } else {
                        i2 = 0;
                        i = 0;
                    }
                    C104695j jVar2 = C104695j.this;
                    C104687c cVar = jVar2.f310919m;
                    Point point = this.f310931a;
                    int i3 = point.x;
                    int i4 = point.y;
                    C104690e eVar2 = (C104690e) jVar2.f310925s;
                    Log.m105925i("MicroMsg.MediaCodecTranscodeDecoder", "src color format: %s", Integer.valueOf(eVar2.f310886m));
                    int i5 = eVar2.f310886m != 19 ? 1 : 2;
                    if (z || bArr == null) {
                        cVar.mo148337d(cVar.f310871u, true, j2);
                    } else {
                        boolean z2 = (i3 == cVar.f310853c && i4 == cVar.f310854d) ? false : true;
                        Log.m105919d("MicroMsg.MediaCodecTransCodeEncoder", "writeData, needScale: %s, srcSize: [%s, %s] [%s, %s], targetSize: [%s, %s], pts: %s, srcColorFormat: %s, dstColorFormat: %s, data.size:%s", Boolean.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(cVar.f310853c), Integer.valueOf(cVar.f310854d), Long.valueOf(j2), Integer.valueOf(i5), Integer.valueOf(cVar.f310872v), Integer.valueOf(bArr.length));
                        if (cVar.f310871u == null) {
                            cVar.f310871u = new byte[(((cVar.f310853c * cVar.f310854d) * 3) >> 1)];
                        }
                        if (cVar.f310871u.length != bArr.length) {
                            cVar.f310871u = new byte[bArr.length];
                        }
                        if (cVar.f310855e != 19 || z2) {
                            j = j2;
                            MP4MuxerJNI.yuv420pTo420XXAndScaleLock(bArr, i5, cVar.f310871u, cVar.f310872v, i2, i, i3, i4, cVar.f310853c, cVar.f310854d);
                        } else {
                            System.arraycopy(bArr, 0, cVar.f310871u, 0, bArr.length);
                            j = j2;
                        }
                        cVar.f310857g++;
                        cVar.mo148337d(cVar.f310871u, false, j);
                    }
                    C92861b bVar = C92861b.f267508d;
                    synchronized (bVar) {
                        try {
                            bVar.mo126900k(bArr);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.modelvideoh265toh264.j$c */
    public class C104698c extends C88654b {

        /* renamed from: e */
        public volatile int f310933e;

        /* renamed from: f */
        public int f310934f;

        /* renamed from: g */
        public boolean f310935g;

        /* renamed from: h */
        public Object f310936h = new Object();

        public C104698c(C104695j jVar, C104694i iVar) {
        }

        public String getKey() {
            return "MediaCodecFFMpegTranscoder_Encoder";
        }

        public void run() {
            if (this.f310934f == -1) {
                this.f310934f = Process.myTid();
                Process.setThreadPriority(Process.myTid(), -2);
                Log.m105925i("MicroMsg.VideoTranscoder", "encodeTid: %s", Integer.valueOf(this.f310934f));
            }
            this.f310933e = 0;
            synchronized (this.f310936h) {
                while (!this.f310935g) {
                    long currentTicks = Util.currentTicks();
                    Log.m105924i("MicroMsg.VideoTranscoder", "try trigger encode");
                    int triggerEncodeForSegmentLock = MP4MuxerJNI.triggerEncodeForSegmentLock(Math.max(0, this.f310933e), false);
                    Log.m105925i("MicroMsg.VideoTranscoder", "ing: trigger encode use %dms, Encode index[%d, %d), threadId: %s", Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(this.f310933e), Integer.valueOf(triggerEncodeForSegmentLock), Long.valueOf(Thread.currentThread().getId()));
                    if (triggerEncodeForSegmentLock == this.f310933e) {
                        try {
                            Thread.sleep(5);
                        } catch (Exception unused) {
                            Log.m105920e("MicroMsg.VideoTranscoder", "thread sleep error");
                        }
                    }
                    this.f310933e = triggerEncodeForSegmentLock;
                }
                long currentTicks2 = Util.currentTicks();
                this.f310933e = MP4MuxerJNI.triggerEncodeForSegmentLock(this.f310933e, true);
                Log.m105925i("MicroMsg.VideoTranscoder", "end: trigger encode use %dms, curEncode index %d, threadId: %s", Long.valueOf(Util.ticksToNow(currentTicks2)), Integer.valueOf(this.f310933e), Long.valueOf(Thread.currentThread().getId()));
            }
        }
    }

    public C104695j(int i) {
        Log.m105925i("MicroMsg.VideoTranscoder", "create VideoTranscoder: %s", Integer.valueOf(i));
        this.f310929w = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0160, code lost:
        if (r6 != false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a8, code lost:
        if (r0.mo148339a() != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        r5 = r5.f267168f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017b A[EDGE_INSN: B:62:0x017b->B:49:0x017b ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo148348a() {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r0 = r1.f310922p
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = r1.f310922p
            java.lang.String r0 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(r0)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r0
            java.lang.String r6 = "MicroMsg.VideoTranscoder"
            java.lang.String r7 = "src file: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 != 0) goto L_0x0070
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0062 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "videoFPS"
            double r7 = r5.getDouble(r0)     // Catch:{ Exception -> 0x0062 }
            int r0 = (int) r7     // Catch:{ Exception -> 0x0062 }
            com.tencent.mm.modelcontrol.VideoTransPara r5 = r1.f310921o     // Catch:{ Exception -> 0x0062 }
            if (r5 == 0) goto L_0x003c
            int r5 = r5.f267168f     // Catch:{ Exception -> 0x0062 }
            if (r5 <= 0) goto L_0x003c
            double r7 = (double) r5     // Catch:{ Exception -> 0x0062 }
            goto L_0x003e
        L_0x003c:
            r7 = 4629137466983448576(0x403e000000000000, double:30.0)
        L_0x003e:
            double r9 = (double) r0     // Catch:{ Exception -> 0x0062 }
            double r9 = r9 / r7
            double r9 = java.lang.Math.ceil(r9)     // Catch:{ Exception -> 0x0062 }
            int r5 = (int) r9     // Catch:{ Exception -> 0x0062 }
            r1.f310926t = r5     // Catch:{ Exception -> 0x0062 }
            java.lang.String r9 = "frameDropInterval: %s, videoFPS: %s, targetFPS: %s"
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0062 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0062 }
            r10[r4] = r5     // Catch:{ Exception -> 0x0062 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0062 }
            r10[r3] = r0     // Catch:{ Exception -> 0x0062 }
            java.lang.Double r0 = java.lang.Double.valueOf(r7)     // Catch:{ Exception -> 0x0062 }
            r10[r2] = r0     // Catch:{ Exception -> 0x0062 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r10)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0070
        L_0x0062:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r7 = r0.getMessage()
            r5[r4] = r7
            java.lang.String r7 = "calcFrameDropCount error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r7, r5)
        L_0x0070:
            com.tencent.mm.modelvideoh265toh264.a r0 = r1.f310925s
            int r5 = r1.f310926t
            com.tencent.mm.modelvideoh265toh264.e r0 = (com.tencent.p014mm.modelvideoh265toh264.C104690e) r0
            r0.getClass()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6[r4] = r7
            java.lang.String r7 = "MicroMsg.MediaCodecTranscodeDecoder"
            java.lang.String r8 = "setFrameDropInterval: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
            r0.f310882i = r5
            com.tencent.mm.modelvideoh265toh264.a r0 = r1.f310925s
            com.tencent.mm.modelvideoh265toh264.j$a r5 = new com.tencent.mm.modelvideoh265toh264.j$a
            r5.<init>()
            com.tencent.mm.modelvideoh265toh264.e r0 = (com.tencent.p014mm.modelvideoh265toh264.C104690e) r0
            r0.f310885l = r4
        L_0x0096:
            oj.b r6 = r0.f310874a
            com.tencent.mm.compatible.deviceinfo.a r8 = r0.f310879f
            r9 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r11 = "input buffer not available"
            r12 = 60000(0xea60, double:2.9644E-319)
            if (r8 != 0) goto L_0x00aa
            java.lang.String r6 = "input decoder is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            goto L_0x0162
        L_0x00aa:
            java.nio.ByteBuffer[] r8 = r8.mo148208j()
            if (r8 != 0) goto L_0x00b3
            r2 = 0
            goto L_0x0163
        L_0x00b3:
            java.lang.Object[] r14 = new java.lang.Object[r3]
            int r15 = r8.length
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r4] = r15
            java.lang.String r15 = "decoderInputByteBuffers size: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r15, r14)
            r14 = 0
        L_0x00c2:
            com.tencent.mm.compatible.deviceinfo.a r15 = r0.f310879f
            int r17 = r15.mo148204f(r12)
            if (r17 >= 0) goto L_0x00ef
            r15 = 15
            if (r14 >= r15) goto L_0x00ef
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r17 = r0.mo148339a()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r15)
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            r2[r4] = r15
            java.lang.String r15 = "drain cost1 %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r15, r2)
            if (r17 == 0) goto L_0x00eb
            goto L_0x0162
        L_0x00eb:
            int r14 = r14 + 1
            r2 = 2
            goto L_0x00c2
        L_0x00ef:
            if (r17 < 0) goto L_0x0143
            r2 = r8[r17]
            r2.clear()
            int r8 = r6.mo161387f(r2, r4)
            r0.f310883j = r8
            r2.position(r4)
            long r20 = r6.mo161383b()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Long r6 = java.lang.Long.valueOf(r20)
            r2[r4] = r6
            java.lang.String r6 = "sampleTime: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r2)
            int r2 = r0.f310883j
            if (r2 < 0) goto L_0x011f
            long r14 = r0.f310877d
            long r14 = r14 * r9
            int r2 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r2 = 0
            goto L_0x0120
        L_0x011f:
            r2 = 1
        L_0x0120:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r6[r4] = r8
            java.lang.String r8 = "sawInputEOS: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
            com.tencent.mm.compatible.deviceinfo.a r6 = r0.f310879f
            r18 = 0
            int r8 = r0.f310883j
            if (r2 == 0) goto L_0x0139
            r14 = 4
            r22 = 4
            goto L_0x013b
        L_0x0139:
            r22 = 0
        L_0x013b:
            r16 = r6
            r19 = r8
            r16.mo148213o(r17, r18, r19, r20, r22)
            goto L_0x0147
        L_0x0143:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r11)
            r2 = 0
        L_0x0147:
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r6 = r0.mo148339a()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r14)
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r8[r4] = r14
            java.lang.String r14 = "drain cost2 %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r14, r8)
            if (r6 == 0) goto L_0x0163
        L_0x0162:
            r2 = 1
        L_0x0163:
            if (r2 == 0) goto L_0x0166
            goto L_0x017b
        L_0x0166:
            oj.b r2 = r0.f310874a
            r2.mo161382a()
            oj.b r2 = r0.f310874a
            int r2 = r2.mo161384c()
            int r6 = r0.f310881h
            if (r2 == r6) goto L_0x01f0
            java.lang.String r2 = "track index not match, break"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
        L_0x017b:
            oj.b r2 = r0.f310874a
            java.lang.String r6 = "sendDecoderEOS"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            com.tencent.mm.compatible.deviceinfo.a r6 = r0.f310879f
            java.nio.ByteBuffer[] r6 = r6.mo148208j()
            com.tencent.mm.compatible.deviceinfo.a r8 = r0.f310879f
            int r15 = r8.mo148204f(r12)
            if (r15 >= 0) goto L_0x01ab
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r8[r4] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            r8[r3] = r12
            java.lang.String r12 = "check decoder input buffer index = %d count = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r8)
            boolean r8 = r0.mo148339a()
            if (r8 == 0) goto L_0x01ab
            goto L_0x01e2
        L_0x01ab:
            if (r15 < 0) goto L_0x01df
            r6 = r6[r15]
            r6.clear()
            int r8 = r2.mo161387f(r6, r4)
            r0.f310883j = r8
            r6.position(r4)
            long r12 = r2.mo161383b()
            if (r15 < 0) goto L_0x01dc
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r2[r4] = r3
            java.lang.String r3 = "send EOS, decoderInputBufferIndex: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r2)
            com.tencent.mm.compatible.deviceinfo.a r14 = r0.f310879f
            r16 = 0
            r17 = 0
            long r18 = r12 * r9
            r20 = 4
            r14.mo148213o(r15, r16, r17, r18, r20)
            goto L_0x01df
        L_0x01dc:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r11)
        L_0x01df:
            r0.mo148339a()
        L_0x01e2:
            com.tencent.mm.modelvideoh265toh264.d r2 = new com.tencent.mm.modelvideoh265toh264.d
            r2.<init>(r0)
            r3 = 500(0x1f4, double:2.47E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r2, r3)
            r5.run()
            return
        L_0x01f0:
            r2 = 2
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelvideoh265toh264.C104695j.mo148348a():void");
    }

    /* renamed from: b */
    public int mo148349b(MediaFormat mediaFormat, boolean z) {
        Log.m105925i("MicroMsg.VideoTranscoder", "initDecoder, format: %s, filePath: %s, scaleFrame: %s", mediaFormat, this.f310922p, Boolean.valueOf(z));
        this.f310927u = mediaFormat;
        this.f310928v = z;
        C104690e eVar = new C104690e(this.f310923q, mediaFormat, this.f310924r);
        this.f310925s = eVar;
        int b = eVar.mo148340b(this.f310922p, this.f310907a, this.f310908b);
        Util.ticksToNow(Util.currentTicks());
        Log.m105925i("MicroMsg.VideoTranscoder", "init decoder ret: %s", Integer.valueOf(b));
        if (b < 0) {
            Log.m105924i("MicroMsg.VideoTranscoder", "init mediaCodecDecoder failed, try ffmepg");
            try {
                ((C104690e) this.f310925s).mo148342d();
                this.f310925s = null;
            } catch (Exception unused) {
            }
            C104690e eVar2 = new C104690e(this.f310923q, mediaFormat, this.f310924r);
            this.f310925s = eVar2;
            b = eVar2.mo148340b(this.f310922p, this.f310907a, this.f310908b);
        }
        ((C104690e) this.f310925s).f310875b = this;
        Log.m105925i("MicroMsg.VideoTranscoder", "init finish, ret: %d, decoderType: %d", Integer.valueOf(b), Integer.valueOf(f310906x));
        return b;
    }

    /* renamed from: c */
    public void mo148350c(int i, int i2) {
        Log.m105925i("MicroMsg.VideoTranscoder", "registerDesiredSize: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        this.f310911e = i;
        this.f310912f = i2;
    }

    /* renamed from: d */
    public void mo148351d() {
        Log.m105925i("MicroMsg.VideoTranscoder", "release, decoderType: %d", Integer.valueOf(f310906x));
        try {
            C104685a aVar = this.f310925s;
            if (aVar != null) {
                ((C104690e) aVar).mo148342d();
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.VideoTranscoder", "release error: %s", e.getMessage());
        } catch (Throwable th) {
            MP4MuxerJNI.releaseDataBufLock(0);
            f310906x = -1;
            throw th;
        }
        MP4MuxerJNI.releaseDataBufLock(0);
        f310906x = -1;
    }

    /* renamed from: e */
    public final Point mo148352e(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Log.m105918d("MicroMsg.VideoTranscoder", "scale() called with: decoderOutputWidth = [" + i + "], decoderOutputHeight = [" + i2 + "], specWidth = [" + i3 + "], specHeight = [" + i4 + "]");
        if (i > i3 || i2 > i4) {
            int max = Math.max(i, i2);
            int min = Math.min(i, i2);
            int max2 = Math.max(i3, i4);
            int min2 = Math.min(i3, i4);
            if (max % 16 != 0 || Math.abs(max - max2) >= 16 || min % 16 != 0 || Math.abs(min - min2) >= 16) {
                int i7 = max / 2;
                if (i7 == max2 && min / 2 == min2) {
                    Log.m105924i("MicroMsg.VideoTranscoder", "calc scale, double ratio");
                    int i8 = i / 2;
                    int i9 = i2 / 2;
                    if (i8 % 2 != 0) {
                        i8++;
                    }
                    if (i9 % 2 != 0) {
                        i9++;
                    }
                    return new Point(i8, i9);
                }
                int i15 = min / 2;
                if (i7 % 16 != 0 || Math.abs(i7 - max2) >= 16 || i15 % 16 != 0 || Math.abs(i15 - min2) >= 16) {
                    Point point = new Point();
                    if (i < i2) {
                        i5 = Math.min(i3, i4);
                        i6 = (int) (((double) i2) / ((((double) i) * 1.0d) / ((double) i5)));
                    } else {
                        int min3 = Math.min(i3, i4);
                        int i16 = min3;
                        i5 = (int) (((double) i) / ((((double) i2) * 1.0d) / ((double) min3)));
                        i6 = i16;
                    }
                    if (i6 % 2 != 0) {
                        i6++;
                    }
                    if (i5 % 2 != 0) {
                        i5++;
                    }
                    Log.m105925i("MicroMsg.VideoTranscoder", "calc scale, outputsize: %s %s", Integer.valueOf(i5), Integer.valueOf(i6));
                    point.x = i5;
                    point.y = i6;
                    int i17 = i5 % 16;
                    if (i17 != 0) {
                        int min4 = i5 - Math.min(16, i17);
                        i5 = min4 < Integer.MAX_VALUE ? min4 : i5 - i17;
                    }
                    point.x = i5;
                    int i18 = point.y;
                    int i19 = i18 % 16;
                    if (i19 != 0) {
                        int min5 = i18 - Math.min(16, i19);
                        i18 = min5 < Integer.MAX_VALUE ? min5 : i18 - i19;
                    }
                    point.y = i18;
                    return point;
                }
                Log.m105924i("MicroMsg.VideoTranscoder", "calc scale, double ratio divide by 16");
                int i25 = i / 2;
                int i26 = i2 / 2;
                if (i25 % 2 != 0) {
                    i25++;
                }
                if (i26 % 2 != 0) {
                    i26++;
                }
                return new Point(i25, i26);
            }
            Log.m105924i("MicroMsg.VideoTranscoder", "calc scale, same len divide by 16, no need scale");
            return null;
        }
        Log.m105924i("MicroMsg.VideoTranscoder", "calc scale, small or equal to spec size");
        return null;
    }
}
