package j72;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import h81.C32735h;
import j72.C108606e;
import java.nio.ByteBuffer;
import p375qh.C110390f;

/* renamed from: j72.j */
public class C108614j implements C108606e {

    /* renamed from: A */
    public int f325184A;

    /* renamed from: B */
    public volatile boolean f325185B = false;

    /* renamed from: C */
    public long f325186C = 0;

    /* renamed from: D */
    public long f325187D = -1;

    /* renamed from: E */
    public boolean f325188E = false;

    /* renamed from: F */
    public MMHandler f325189F;

    /* renamed from: G */
    public Runnable f325190G = new C108616b();

    /* renamed from: H */
    public long f325191H = 0;

    /* renamed from: I */
    public C110390f.C89659b f325192I = new C108617c();

    /* renamed from: a */
    public C104619a f325193a;

    /* renamed from: b */
    public MediaFormat f325194b;

    /* renamed from: c */
    public MediaCodec.BufferInfo f325195c;

    /* renamed from: d */
    public long f325196d = 0;

    /* renamed from: e */
    public int f325197e;

    /* renamed from: f */
    public int f325198f;

    /* renamed from: g */
    public long f325199g;

    /* renamed from: h */
    public long f325200h;

    /* renamed from: i */
    public int f325201i;

    /* renamed from: j */
    public boolean f325202j = false;

    /* renamed from: k */
    public boolean f325203k = false;

    /* renamed from: l */
    public C108606e.C98917a f325204l = null;

    /* renamed from: m */
    public long f325205m = 0;

    /* renamed from: n */
    public final Object f325206n = new Object();

    /* renamed from: o */
    public volatile boolean f325207o = false;

    /* renamed from: p */
    public volatile boolean f325208p = false;

    /* renamed from: q */
    public boolean f325209q = true;

    /* renamed from: r */
    public boolean f325210r = false;

    /* renamed from: s */
    public MMHandler f325211s = new C108615a(Looper.getMainLooper());

    /* renamed from: t */
    public volatile C110390f f325212t = null;

    /* renamed from: u */
    public boolean f325213u;

    /* renamed from: v */
    public boolean f325214v;

    /* renamed from: w */
    public final Object f325215w = new byte[0];

    /* renamed from: x */
    public C108606e.C98918b f325216x;

    /* renamed from: y */
    public int f325217y;

    /* renamed from: z */
    public int f325218z;

    /* renamed from: j72.j$a */
    public class C108615a extends MMHandler {
        public C108615a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C108606e.C98917a aVar = C108614j.this.f325204l;
            if (aVar != null) {
                aVar.mo138250a();
                C108614j.this.f325204l = null;
            }
        }
    }

    /* renamed from: j72.j$b */
    public class C108616b implements Runnable {
        public C108616b() {
        }

        public void run() {
            if (C108614j.this.f325212t != null) {
                C108614j jVar = C108614j.this;
                jVar.f325188E = true;
                jVar.mo159643m();
            }
        }
    }

    /* renamed from: j72.j$c */
    public class C108617c implements C110390f.C89659b {
        public C108617c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
            if (r2.f325207o != false) goto L_0x0185;
         */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0188  */
        /* JADX WARNING: Removed duplicated region for block: B:94:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo35508a(byte[] r24, int r25) {
            /*
                r23 = this;
                r1 = r23
                r0 = r24
                j72.j r2 = j72.C108614j.this
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r2.f325211s
                r3 = 0
                r2.sendEmptyMessage(r3)
                j72.j r2 = j72.C108614j.this
                boolean r4 = r2.f325202j
                r5 = 1
                r4 = r4 ^ r5
                boolean r6 = r2.f325213u
                if (r4 != 0) goto L_0x0185
                boolean r4 = r2.f325209q
                if (r4 == 0) goto L_0x0020
                boolean r4 = r2.f325207o
                if (r4 == 0) goto L_0x002b
                goto L_0x0185
            L_0x0020:
                java.lang.Object r4 = r2.f325206n
                monitor-enter(r4)
                boolean r7 = r2.f325207o     // Catch:{ all -> 0x0182 }
                if (r7 == 0) goto L_0x002a
                monitor-exit(r4)     // Catch:{ all -> 0x0182 }
                goto L_0x0185
            L_0x002a:
                monitor-exit(r4)     // Catch:{ all -> 0x0182 }
            L_0x002b:
                long r7 = r2.f325196d
                r9 = 0
                int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r4 != 0) goto L_0x0039
                long r7 = java.lang.System.nanoTime()
                r2.f325196d = r7
            L_0x0039:
                com.tencent.mm.compatible.deviceinfo.a r4 = r2.f325193a
                if (r4 != 0) goto L_0x003f
                goto L_0x0185
            L_0x003f:
                boolean r4 = r2.f325185B
                if (r4 == 0) goto L_0x004c
                java.lang.String r0 = "MicroMsg.MMSightAACMediaCodecRecorder"
                java.lang.String r2 = "not start now"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                goto L_0x0185
            L_0x004c:
                com.tencent.mm.compatible.deviceinfo.a r4 = r2.f325193a
                java.lang.String r7 = "send audio to encoder error, encoder is null, end:"
                java.lang.String r8 = "MicroMsg.MMSightAACMediaCodecRecorder"
                if (r4 != 0) goto L_0x0069
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            L_0x0066:
                r7 = r6
                goto L_0x017e
            L_0x0069:
                java.nio.ByteBuffer[] r4 = r4.mo148208j()     // Catch:{ all -> 0x0164 }
                com.tencent.mm.compatible.deviceinfo.a r11 = r2.f325193a     // Catch:{ all -> 0x0164 }
                r12 = 10000(0x2710, double:4.9407E-320)
                int r11 = r11.mo148204f(r12)     // Catch:{ all -> 0x0164 }
                r2.f325197e = r11     // Catch:{ all -> 0x0164 }
                if (r11 >= 0) goto L_0x0093
                java.lang.String r11 = "audio no input available, drain first"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r11)     // Catch:{ all -> 0x0164 }
                r11 = 0
            L_0x007f:
                r14 = 5
                if (r11 >= r14) goto L_0x0093
                r2.mo159640g(r3)     // Catch:{ all -> 0x0164 }
                com.tencent.mm.compatible.deviceinfo.a r14 = r2.f325193a     // Catch:{ all -> 0x0164 }
                int r14 = r14.mo148204f(r12)     // Catch:{ all -> 0x0164 }
                r2.f325197e = r14     // Catch:{ all -> 0x0164 }
                if (r14 < 0) goto L_0x0090
                goto L_0x0093
            L_0x0090:
                int r11 = r11 + 1
                goto L_0x007f
            L_0x0093:
                com.tencent.mm.compatible.deviceinfo.a r11 = r2.f325193a     // Catch:{ all -> 0x0164 }
                if (r11 != 0) goto L_0x00aa
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0164 }
                r0.<init>()     // Catch:{ all -> 0x0164 }
                r0.append(r7)     // Catch:{ all -> 0x0164 }
                r0.append(r6)     // Catch:{ all -> 0x0164 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0164 }
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)     // Catch:{ all -> 0x0164 }
                goto L_0x0066
            L_0x00aa:
                int r7 = r2.f325197e     // Catch:{ all -> 0x0164 }
                if (r7 < 0) goto L_0x0066
                r4 = r4[r7]     // Catch:{ all -> 0x0164 }
                r4.clear()     // Catch:{ all -> 0x0164 }
                r4.put(r0)     // Catch:{ all -> 0x0164 }
                r4.position(r3)     // Catch:{ all -> 0x0164 }
                int r0 = r0.length     // Catch:{ all -> 0x0164 }
                r2.f325198f = r0     // Catch:{ all -> 0x0164 }
                long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0164 }
                r2.f325199g = r3     // Catch:{ all -> 0x0164 }
                int r0 = r2.f325198f     // Catch:{ all -> 0x0164 }
                long r11 = (long) r0     // Catch:{ all -> 0x0164 }
                r13 = 1000000000(0x3b9aca00, double:4.94065646E-315)
                long r11 = r11 * r13
                int r7 = r2.f325217y     // Catch:{ all -> 0x0164 }
                long r13 = (long) r7     // Catch:{ all -> 0x0164 }
                long r11 = r11 / r13
                long r3 = r3 - r11
                r2.f325199g = r3     // Catch:{ all -> 0x0164 }
                r3 = -3
                if (r0 != r3) goto L_0x00d9
                java.lang.String r0 = "Audio read error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ all -> 0x0164 }
            L_0x00d9:
                long r3 = r2.f325199g     // Catch:{ all -> 0x0164 }
                long r11 = r2.f325196d     // Catch:{ all -> 0x0164 }
                long r11 = r3 - r11
                r13 = 1000(0x3e8, double:4.94E-321)
                long r11 = r11 / r13
                r7 = r6
                long r5 = r2.f325186C     // Catch:{ all -> 0x0162 }
                java.lang.Long.signum(r5)
                long r5 = r5 * r13
                long r11 = r11 - r5
                r2.f325200h = r11     // Catch:{ all -> 0x0162 }
                int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r0 >= 0) goto L_0x00fa
                long r5 = r2.f325191H     // Catch:{ all -> 0x0162 }
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 > 0) goto L_0x00fa
                long r5 = -r3
                r2.f325191H = r5     // Catch:{ all -> 0x0162 }
            L_0x00fa:
                long r5 = r2.f325191H     // Catch:{ all -> 0x0162 }
                long r3 = r3 + r5
                r2.f325199g = r3     // Catch:{ all -> 0x0162 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
                r0.<init>()     // Catch:{ all -> 0x0162 }
                java.lang.String r3 = "queueing "
                r0.append(r3)     // Catch:{ all -> 0x0162 }
                int r3 = r2.f325198f     // Catch:{ all -> 0x0162 }
                r0.append(r3)     // Catch:{ all -> 0x0162 }
                java.lang.String r3 = " audio bytes with pts(ms) "
                r0.append(r3)     // Catch:{ all -> 0x0162 }
                long r3 = r2.f325200h     // Catch:{ all -> 0x0162 }
                float r3 = (float) r3     // Catch:{ all -> 0x0162 }
                r4 = 1148846080(0x447a0000, float:1000.0)
                float r3 = r3 / r4
                r0.append(r3)     // Catch:{ all -> 0x0162 }
                java.lang.String r3 = ", end:"
                r0.append(r3)     // Catch:{ all -> 0x0162 }
                r0.append(r7)     // Catch:{ all -> 0x0162 }
                java.lang.String r3 = ", enqueue:"
                r0.append(r3)     // Catch:{ all -> 0x0162 }
                int r3 = r2.f325197e     // Catch:{ all -> 0x0162 }
                r0.append(r3)     // Catch:{ all -> 0x0162 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0162 }
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r8, r0)     // Catch:{ all -> 0x0162 }
                if (r7 == 0) goto L_0x014a
                java.lang.String r0 = "EOS received in sendAudioToEncoder"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ all -> 0x0162 }
                com.tencent.mm.compatible.deviceinfo.a r9 = r2.f325193a     // Catch:{ all -> 0x0162 }
                int r10 = r2.f325197e     // Catch:{ all -> 0x0162 }
                r11 = 0
                int r12 = r2.f325198f     // Catch:{ all -> 0x0162 }
                long r13 = r2.f325200h     // Catch:{ all -> 0x0162 }
                r15 = 4
                r9.mo148213o(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0162 }
                goto L_0x017e
            L_0x014a:
                com.tencent.mm.compatible.deviceinfo.a r0 = r2.f325193a     // Catch:{ all -> 0x0162 }
                int r3 = r2.f325197e     // Catch:{ all -> 0x0162 }
                r18 = 0
                int r4 = r2.f325198f     // Catch:{ all -> 0x0162 }
                long r5 = r2.f325200h     // Catch:{ all -> 0x0162 }
                r22 = 0
                r16 = r0
                r17 = r3
                r19 = r4
                r20 = r5
                r16.mo148213o(r17, r18, r19, r20, r22)     // Catch:{ all -> 0x0162 }
                goto L_0x017e
            L_0x0162:
                r0 = move-exception
                goto L_0x0166
            L_0x0164:
                r0 = move-exception
                r7 = r6
            L_0x0166:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "_offerAudioEncoder exception "
                r3.append(r4)
                java.lang.String r0 = r0.getMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            L_0x017e:
                r2.mo159640g(r7)
                goto L_0x0186
            L_0x0182:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0182 }
                throw r0
            L_0x0185:
                r7 = r6
            L_0x0186:
                if (r7 == 0) goto L_0x01ce
                j72.j r0 = j72.C108614j.this
                boolean r2 = r0.f325188E
                if (r2 != 0) goto L_0x01ce
                java.lang.Object r2 = r0.f325215w
                monitor-enter(r2)
                j72.j r0 = j72.C108614j.this     // Catch:{ all -> 0x01cb }
                j72.e$b r0 = r0.f325216x     // Catch:{ all -> 0x01cb }
                if (r0 == 0) goto L_0x01ab
                java.lang.String r0 = "MicroMsg.MMSightAACMediaCodecRecorder"
                java.lang.String r3 = "do aac stop callback"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x01cb }
                j72.j r0 = j72.C108614j.this     // Catch:{ all -> 0x01cb }
                j72.e$b r0 = r0.f325216x     // Catch:{ all -> 0x01cb }
                r0.mo138251a()     // Catch:{ all -> 0x01cb }
                j72.j r0 = j72.C108614j.this     // Catch:{ all -> 0x01cb }
                r3 = 0
                r0.f325216x = r3     // Catch:{ all -> 0x01cb }
                goto L_0x01b2
            L_0x01ab:
                java.lang.String r0 = "MicroMsg.MMSightAACMediaCodecRecorder"
                java.lang.String r3 = "aac stop callback is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)     // Catch:{ all -> 0x01cb }
            L_0x01b2:
                j72.j r0 = j72.C108614j.this     // Catch:{ all -> 0x01cb }
                r3 = 1
                r0.f325214v = r3     // Catch:{ all -> 0x01cb }
                monitor-exit(r2)     // Catch:{ all -> 0x01cb }
                r0.f325188E = r3
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r0.f325189F
                java.lang.Runnable r0 = r0.f325190G
                r2.removeCallbacks(r0)
                j72.j r0 = j72.C108614j.this
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r0.f325189F
                java.lang.Runnable r0 = r0.f325190G
                r2.post(r0)
                goto L_0x01ce
            L_0x01cb:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x01cb }
                throw r0
            L_0x01ce:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j72.C108614j.C108617c.mo35508a(byte[], int):void");
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
            Log.m105929w("MicroMsg.MMSightAACMediaCodecRecorder", "on rec error, %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: j72.j$d */
    public class C108618d implements Runnable {
        public C108618d() {
        }

        public void run() {
            try {
                C108614j.this.mo159641h();
                C108614j.this.mo159643m();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MMSightAACMediaCodecRecorder", "delay to stop encoder error: %s", e.getMessage());
            }
        }
    }

    public C108614j(int i, int i2, int i3, C108644v vVar, boolean z) {
        this.f325218z = i2;
        this.f325217y = i;
        this.f325184A = i3;
        if (i3 <= 0) {
            this.f325184A = 1;
        }
        this.f325209q = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_ignore_mediacodec_lock, false);
        this.f325210r = z;
        Log.m105925i("MicroMsg.MMSightAACMediaCodecRecorder", "create MMSightAACMediaCodecRecorder, audioBitrate: %s, audioSampleRate: %s, audioChannelCount:%s, isUseFFmpegMuxer:%s", Integer.valueOf(this.f325218z), Integer.valueOf(this.f325217y), Integer.valueOf(this.f325184A), Boolean.valueOf(this.f325210r));
    }

    /* renamed from: a */
    public int mo138252a(C108606e.C98918b bVar) {
        Object[] objArr = new Object[4];
        objArr[0] = Boolean.valueOf(this.f325212t == null);
        objArr[1] = Boolean.valueOf(this.f325216x == null);
        objArr[2] = Boolean.valueOf(bVar == null);
        objArr[3] = Boolean.valueOf(this.f325213u);
        Log.m105925i("MicroMsg.MMSightAACMediaCodecRecorder", "call stop, pcmRecorder null[%B], old stopCallback null[%B]new stopCallback null[%B], pcmMarkStop[%B]", objArr);
        if (this.f325212t == null && !this.f325203k) {
            return -1;
        }
        this.f325213u = true;
        synchronized (this.f325215w) {
            this.f325216x = bVar;
            if (this.f325214v && bVar != null) {
                Log.m105924i("MicroMsg.MMSightAACMediaCodecRecorder", "has stop, directly call stop callback");
                bVar.mo138251a();
                this.f325216x = null;
            }
        }
        MMHandlerThread.postToMainThreadDelayed(new C108618d(), 500);
        return 0;
    }

    /* renamed from: b */
    public void mo138253b(boolean z) {
        this.f325203k = z;
    }

    /* renamed from: c */
    public int mo138254c(int i, String str) {
        if (!this.f325203k && this.f325212t != null) {
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(this.f325216x == null);
            Log.m105921e("MicroMsg.MMSightAACMediaCodecRecorder", "call init, before pcmRecorder stop, stopCallback null ? %B", objArr);
            this.f325212t.mo161907l();
        }
        if (this.f325193a != null) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = Boolean.valueOf(this.f325216x == null);
            Log.m105921e("MicroMsg.MMSightAACMediaCodecRecorder", "call init, before audioEncoder stop, stopCallback null ? %B", objArr2);
            mo159641h();
            C108606e.C98918b bVar = this.f325216x;
            if (bVar != null) {
                bVar.mo138251a();
                this.f325216x = null;
            }
        }
        this.f325213u = false;
        synchronized (this.f325215w) {
            this.f325214v = false;
            this.f325188E = false;
            this.f325216x = null;
        }
        if (!this.f325203k) {
            this.f325212t = new C110390f(this.f325217y, this.f325184A, 5);
            this.f325212t.mo161900e(1);
            this.f325212t.mo161902g(128);
            this.f325212t.mo161904i(true);
            this.f325212t.f330245x = this.f325192I;
        }
        MMHandler mMHandler = this.f325189F;
        if (mMHandler == null) {
            Log.m105924i("MicroMsg.MMSightAACMediaCodecRecorder", "create pcm control handler");
            this.f325189F = new MMHandler();
        } else if (mMHandler.getLooper() != Looper.myLooper()) {
            Log.m105929w("MicroMsg.MMSightAACMediaCodecRecorder", "error pcm control handler looper[%s, %s], recreate handler", this.f325189F.getLooper(), Looper.myLooper());
            this.f325189F = new MMHandler();
        }
        Log.m105925i("MicroMsg.MMSightAACMediaCodecRecorder", "sample rate %d, audio rate %d", Integer.valueOf(this.f325217y), Integer.valueOf(this.f325218z));
        try {
            this.f325195c = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            this.f325194b = mediaFormat;
            mediaFormat.setString("mime", "audio/mp4a-latm");
            this.f325194b.setInteger("aac-profile", 2);
            this.f325194b.setInteger("sample-rate", this.f325217y);
            this.f325194b.setInteger("channel-count", this.f325184A);
            this.f325194b.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.f325218z);
            this.f325194b.setInteger("max-input-size", this.f325184A * 16384);
            C104619a d = C104619a.m140212d("audio/mp4a-latm", false);
            this.f325193a = d;
            d.mo148202a(this.f325194b, (Surface) null, (MediaCrypto) null, 1);
            this.f325193a.mo148222y();
            if (this.f325209q) {
                this.f325207o = false;
                this.f325205m = System.currentTimeMillis();
            } else {
                synchronized (this.f325206n) {
                    this.f325207o = false;
                    this.f325205m = System.currentTimeMillis();
                }
            }
            this.f325202j = false;
            return 0;
        } catch (Throwable th) {
            try {
                Log.printErrStackTrace("MicroMsg.MMSightAACMediaCodecRecorder", th, "start aac encoder error: %s", th.getMessage());
                mo159641h();
                Log.m105924i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecAACInitError");
                C115669n.INSTANCE.idkeyStat(440, 15, 1, false);
                return -1;
            } finally {
                this.f325202j = false;
            }
        }
    }

    public void clear() {
        Log.m105924i("MicroMsg.MMSightAACMediaCodecRecorder", "clear");
        mo159641h();
        mo159643m();
    }

    /* renamed from: d */
    public void mo138256d() {
        this.f325202j = true;
    }

    /* renamed from: e */
    public C110390f.C89659b mo138257e() {
        return this.f325192I;
    }

    /* renamed from: f */
    public int mo138258f(C108606e.C98917a aVar) {
        int i = 0;
        Log.m105925i("MicroMsg.MMSightAACMediaCodecRecorder", "start, onPcmReady: %s", aVar);
        this.f325204l = aVar;
        if (this.f325203k) {
            this.f325211s.sendEmptyMessage(0);
        } else if (this.f325212t == null) {
            Log.m105924i("MicroMsg.MMSightAACMediaCodecRecorder", "start, pcmrecorder is null");
            return -1;
        } else if (!this.f325212t.mo161906k()) {
            i = -1;
        }
        this.f325186C = 0;
        this.f325187D = -1;
        return i;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:32|33|(1:35)(1:36)|37|(1:39)(1:40)|41|(2:43|44)(1:45)|46|47|48|51|52|(1:54)(1:55)|56|(1:58)(1:59)|60|(1:62)(1:63)|64) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0135 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013b A[Catch:{ Exception -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0141 A[Catch:{ Exception -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0146 A[Catch:{ Exception -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0150 A[Catch:{ Exception -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0155 A[Catch:{ Exception -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015b A[Catch:{ Exception -> 0x01a8 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo159640g(boolean r20) {
        /*
            r19 = this;
            r7 = r19
            r0 = r20
            java.lang.String r8 = "channel-count"
            java.lang.String r9 = "sample-rate"
            java.lang.String r10 = "aac-profile"
            com.tencent.mm.compatible.deviceinfo.a r1 = r7.f325193a
            java.lang.String r11 = "MicroMsg.MMSightAACMediaCodecRecorder"
            if (r1 != 0) goto L_0x0025
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "drain audio encoder error, encoder is null, end:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            return
        L_0x0025:
            r12 = 0
            r13 = 1
            java.nio.ByteBuffer[] r1 = r1.mo148211m()     // Catch:{ Exception -> 0x01a8 }
            r14 = r1
        L_0x002c:
            com.tencent.mm.compatible.deviceinfo.a r1 = r7.f325193a     // Catch:{ Exception -> 0x01a8 }
            android.media.MediaCodec$BufferInfo r2 = r7.f325195c     // Catch:{ Exception -> 0x01a8 }
            r3 = 10000(0x2710, double:4.9407E-320)
            int r1 = r1.mo148205g(r2, r3)     // Catch:{ Exception -> 0x01a8 }
            r7.f325201i = r1     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r2 = "outputBufferIndex-->%s"
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01a8 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01a8 }
            r3[r12] = r1     // Catch:{ Exception -> 0x01a8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r11, r2, r3)     // Catch:{ Exception -> 0x01a8 }
            int r1 = r7.f325201i     // Catch:{ Exception -> 0x01a8 }
            r2 = -1
            if (r1 != r2) goto L_0x0051
            java.lang.String r0 = "no output available, break"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01b6
        L_0x0051:
            r2 = -3
            if (r1 != r2) goto L_0x005b
            com.tencent.mm.compatible.deviceinfo.a r1 = r7.f325193a     // Catch:{ Exception -> 0x01a8 }
            java.nio.ByteBuffer[] r14 = r1.mo148211m()     // Catch:{ Exception -> 0x01a8 }
            goto L_0x002c
        L_0x005b:
            r2 = -2
            if (r1 != r2) goto L_0x0079
            com.tencent.mm.compatible.deviceinfo.a r1 = r7.f325193a     // Catch:{ Exception -> 0x01a8 }
            android.media.MediaFormat r1 = r1.mo148212n()     // Catch:{ Exception -> 0x01a8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a8 }
            r2.<init>()     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r3 = "encoder output format changed: "
            r2.append(r3)     // Catch:{ Exception -> 0x01a8 }
            r2.append(r1)     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x01a8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r1)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x002c
        L_0x0079:
            if (r1 >= 0) goto L_0x0089
            java.lang.String r2 = "unexpected result from encoder.dequeueOutputBuffer: %s"
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01a8 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01a8 }
            r3[r12] = r1     // Catch:{ Exception -> 0x01a8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r11, r2, r3)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x002c
        L_0x0089:
            java.lang.String r1 = "perform encoding"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r11, r1)     // Catch:{ Exception -> 0x01a8 }
            int r1 = r7.f325201i     // Catch:{ Exception -> 0x01a8 }
            r15 = r14[r1]     // Catch:{ Exception -> 0x01a8 }
            if (r15 == 0) goto L_0x018a
            boolean r1 = r7.f325207o     // Catch:{ Exception -> 0x01a8 }
            if (r1 == 0) goto L_0x0099
            return
        L_0x0099:
            r7.f325208p = r13     // Catch:{ Exception -> 0x01a8 }
            android.media.MediaCodec$BufferInfo r1 = r7.f325195c     // Catch:{ Exception -> 0x01a8 }
            int r2 = r1.flags     // Catch:{ Exception -> 0x01a8 }
            r6 = 2
            r2 = r2 & r6
            if (r2 == 0) goto L_0x00c6
            java.lang.String r2 = "ignoring BUFFER_FLAG_CODEC_CONFIG,size: %s, %s"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01a8 }
            int r1 = r1.size     // Catch:{ Exception -> 0x01a8 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01a8 }
            r3[r12] = r1     // Catch:{ Exception -> 0x01a8 }
            boolean r1 = r19.mo159637j()     // Catch:{ Exception -> 0x01a8 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x01a8 }
            r3[r13] = r1     // Catch:{ Exception -> 0x01a8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r11, r2, r3)     // Catch:{ Exception -> 0x01a8 }
            boolean r1 = r19.mo159637j()     // Catch:{ Exception -> 0x01a8 }
            if (r1 == 0) goto L_0x00c6
            android.media.MediaCodec$BufferInfo r1 = r7.f325195c     // Catch:{ Exception -> 0x01a8 }
            r1.size = r12     // Catch:{ Exception -> 0x01a8 }
        L_0x00c6:
            android.media.MediaCodec$BufferInfo r1 = r7.f325195c     // Catch:{ Exception -> 0x01a8 }
            int r2 = r1.size     // Catch:{ Exception -> 0x01a8 }
            r16 = 4
            if (r2 == 0) goto L_0x0168
            int r1 = r1.offset     // Catch:{ Exception -> 0x01a8 }
            r15.position(r1)     // Catch:{ Exception -> 0x01a8 }
            android.media.MediaCodec$BufferInfo r1 = r7.f325195c     // Catch:{ Exception -> 0x01a8 }
            int r2 = r1.offset     // Catch:{ Exception -> 0x01a8 }
            int r1 = r1.size     // Catch:{ Exception -> 0x01a8 }
            int r2 = r2 + r1
            r15.limit(r2)     // Catch:{ Exception -> 0x01a8 }
            boolean r1 = r7.f325210r     // Catch:{ Exception -> 0x01a8 }
            if (r1 == 0) goto L_0x0163
            android.media.MediaCodec$BufferInfo r3 = r7.f325195c     // Catch:{ Exception -> 0x0133 }
            com.tencent.mm.compatible.deviceinfo.a r1 = r7.f325193a     // Catch:{ Exception -> 0x0133 }
            android.media.MediaFormat r1 = r1.mo148212n()     // Catch:{ Exception -> 0x0133 }
            if (r1 == 0) goto L_0x00f7
            com.tencent.mm.compatible.deviceinfo.a r1 = r7.f325193a     // Catch:{ Exception -> 0x0133 }
            android.media.MediaFormat r1 = r1.mo148212n()     // Catch:{ Exception -> 0x0133 }
            int r1 = r1.getInteger(r10)     // Catch:{ Exception -> 0x0133 }
            r4 = r1
            goto L_0x00f8
        L_0x00f7:
            r4 = 2
        L_0x00f8:
            com.tencent.mm.compatible.deviceinfo.a r1 = r7.f325193a     // Catch:{ Exception -> 0x0133 }
            android.media.MediaFormat r1 = r1.mo148212n()     // Catch:{ Exception -> 0x0133 }
            if (r1 == 0) goto L_0x0110
            com.tencent.mm.compatible.deviceinfo.a r1 = r7.f325193a     // Catch:{ Exception -> 0x0133 }
            android.media.MediaFormat r1 = r1.mo148212n()     // Catch:{ Exception -> 0x0133 }
            int r1 = r1.getInteger(r9)     // Catch:{ Exception -> 0x0133 }
            int r1 = i72.C98606a.m128205b(r1)     // Catch:{ Exception -> 0x0133 }
            r5 = r1
            goto L_0x0111
        L_0x0110:
            r5 = 4
        L_0x0111:
            com.tencent.mm.compatible.deviceinfo.a r1 = r7.f325193a     // Catch:{ Exception -> 0x0133 }
            android.media.MediaFormat r1 = r1.mo148212n()     // Catch:{ Exception -> 0x0133 }
            if (r1 == 0) goto L_0x0126
            com.tencent.mm.compatible.deviceinfo.a r1 = r7.f325193a     // Catch:{ Exception -> 0x0133 }
            android.media.MediaFormat r1 = r1.mo148212n()     // Catch:{ Exception -> 0x0133 }
            int r1 = r1.getInteger(r8)     // Catch:{ Exception -> 0x0133 }
            r17 = r1
            goto L_0x0128
        L_0x0126:
            r17 = 1
        L_0x0128:
            r1 = r19
            r2 = r15
            r18 = 2
            r6 = r17
            r1.mo159639l(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0135 }
            goto L_0x0168
        L_0x0133:
            r18 = 2
        L_0x0135:
            android.media.MediaCodec$BufferInfo r3 = r7.f325195c     // Catch:{ Exception -> 0x01a8 }
            android.media.MediaFormat r1 = r7.f325194b     // Catch:{ Exception -> 0x01a8 }
            if (r1 == 0) goto L_0x0141
            int r1 = r1.getInteger(r10)     // Catch:{ Exception -> 0x01a8 }
            r4 = r1
            goto L_0x0142
        L_0x0141:
            r4 = 2
        L_0x0142:
            android.media.MediaFormat r1 = r7.f325194b     // Catch:{ Exception -> 0x01a8 }
            if (r1 == 0) goto L_0x0150
            int r1 = r1.getInteger(r9)     // Catch:{ Exception -> 0x01a8 }
            int r1 = i72.C98606a.m128205b(r1)     // Catch:{ Exception -> 0x01a8 }
            r5 = r1
            goto L_0x0151
        L_0x0150:
            r5 = 4
        L_0x0151:
            android.media.MediaFormat r1 = r7.f325194b     // Catch:{ Exception -> 0x01a8 }
            if (r1 == 0) goto L_0x015b
            int r1 = r1.getInteger(r8)     // Catch:{ Exception -> 0x01a8 }
            r6 = r1
            goto L_0x015c
        L_0x015b:
            r6 = 1
        L_0x015c:
            r1 = r19
            r2 = r15
            r1.mo159639l(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x0168
        L_0x0163:
            android.media.MediaCodec$BufferInfo r1 = r7.f325195c     // Catch:{ Exception -> 0x01a8 }
            r7.mo159638k(r15, r1)     // Catch:{ Exception -> 0x01a8 }
        L_0x0168:
            com.tencent.mm.compatible.deviceinfo.a r1 = r7.f325193a     // Catch:{ Exception -> 0x01a8 }
            int r2 = r7.f325201i     // Catch:{ Exception -> 0x01a8 }
            r1.mo148216r(r2, r12)     // Catch:{ Exception -> 0x01a8 }
            r7.f325208p = r12     // Catch:{ Exception -> 0x01a8 }
            android.media.MediaCodec$BufferInfo r1 = r7.f325195c     // Catch:{ Exception -> 0x01a8 }
            int r1 = r1.flags     // Catch:{ Exception -> 0x01a8 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x002c
            if (r0 != 0) goto L_0x0181
            java.lang.String r0 = "reached end of stream unexpectedly"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01b6
        L_0x0181:
            java.lang.String r0 = "do stop audio encoder"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)     // Catch:{ Exception -> 0x01a8 }
            r19.mo159641h()     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01b6
        L_0x018a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x01a8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a8 }
            r1.<init>()     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r2 = "encoderOutputBuffer "
            r1.append(r2)     // Catch:{ Exception -> 0x01a8 }
            int r2 = r7.f325201i     // Catch:{ Exception -> 0x01a8 }
            r1.append(r2)     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r2 = " was null"
            r1.append(r2)     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01a8 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01a8 }
            throw r0     // Catch:{ Exception -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r0 = r0.getMessage()
            r1[r12] = r0
            java.lang.String r0 = "drainEncoder error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r1)
        L_0x01b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j72.C108614j.mo159640g(boolean):void");
    }

    /* renamed from: h */
    public void mo159641h() {
        if (this.f325209q) {
            mo159642i();
            return;
        }
        synchronized (this.f325206n) {
            mo159642i();
        }
    }

    /* renamed from: i */
    public final void mo159642i() {
        if (!this.f325207o && 0 != this.f325205m) {
            while (this.f325208p) {
                Thread.yield();
            }
            this.f325207o = true;
            try {
                if (this.f325193a != null) {
                    Log.m105924i("MicroMsg.MMSightAACMediaCodecRecorder", "stop encoder");
                    this.f325193a.mo148223z();
                    this.f325193a.mo148214p();
                    this.f325193a = null;
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MMSightAACMediaCodecRecorder", "clear error: %s", e.getMessage());
            } catch (Throwable th) {
                this.f325193a = null;
                throw th;
            }
            this.f325193a = null;
        }
    }

    /* renamed from: j */
    public boolean mo159637j() {
        throw null;
    }

    /* renamed from: k */
    public void mo159638k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        throw null;
    }

    /* renamed from: l */
    public void mo159639l(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, int i2, int i3) {
        throw null;
    }

    /* renamed from: m */
    public final synchronized void mo159643m() {
        if (this.f325212t != null && !this.f325203k) {
            Log.m105924i("MicroMsg.MMSightAACMediaCodecRecorder", "stop pcm recorder");
            this.f325212t.mo161907l();
            this.f325212t = null;
        }
    }
}
