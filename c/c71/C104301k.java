package c71;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import p206nj.C11171e;
import p914oj.C110052b;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: c71.k */
public final class C104301k extends C92380u {

    /* renamed from: c */
    public final Surface f308707c;

    /* renamed from: d */
    public final String f308708d = "MicroMsg.EmojiMixVideoDecoderAsync";

    /* renamed from: e */
    public C104619a f308709e;

    /* renamed from: f */
    public MediaFormat f308710f;

    /* renamed from: g */
    public C110052b f308711g = new C110052b();

    /* renamed from: h */
    public String f308712h = "";

    /* renamed from: i */
    public boolean f308713i;

    /* renamed from: j */
    public long f308714j;

    /* renamed from: k */
    public HandlerThread f308715k;

    /* renamed from: l */
    public final Object f308716l;

    /* renamed from: m */
    public final C104302a f308717m;

    /* renamed from: c71.k$a */
    public static final class C104302a extends MediaCodec.Callback {

        /* renamed from: a */
        public final /* synthetic */ C104301k f308718a;

        public C104302a(C104301k kVar) {
            this.f308718a = kVar;
        }

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(codecException, "e");
            String str = this.f308718a.f308708d;
            Log.m105920e(str, "onError, codec:" + mediaCodec + ", " + codecException.isRecoverable() + ' ' + codecException.isTransient() + ' ' + codecException.getDiagnosticInfo());
            if (!codecException.isRecoverable() && !codecException.isTransient()) {
                Log.m105924i(this.f308718a.f308708d, "sendDecoderEos");
                C104301k kVar = this.f308718a;
                Log.m105924i(kVar.f308708d, "release");
                try {
                    kVar.f308715k.quit();
                    C104619a aVar = kVar.f308709e;
                    if (aVar != null) {
                        aVar.mo148223z();
                    }
                    C104619a aVar2 = kVar.f308709e;
                    if (aVar2 != null) {
                        aVar2.mo148214p();
                    }
                } catch (Exception unused) {
                }
                C32224a<C13598b0> aVar3 = this.f308718a.f264357b;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0 A[Catch:{ Exception -> 0x00ac }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onInputBufferAvailable(android.media.MediaCodec r10, int r11) {
            /*
                r9 = this;
                java.lang.String r0 = "codec"
                gy3.C87412m.m108594g(r10, r0)
                c71.k r10 = r9.f308718a
                java.lang.String r10 = r10.f308708d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onInputBufferAvailable "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                if (r11 < 0) goto L_0x00b8
                r10 = 0
                c71.k r0 = r9.f308718a     // Catch:{ Exception -> 0x00ac }
                boolean r1 = r0.f308713i     // Catch:{ Exception -> 0x00ac }
                if (r1 != 0) goto L_0x00b8
                com.tencent.mm.compatible.deviceinfo.a r0 = r0.f308709e     // Catch:{ Exception -> 0x00ac }
                if (r0 == 0) goto L_0x002f
                java.nio.ByteBuffer r0 = r0.mo148207i(r11)     // Catch:{ Exception -> 0x00ac }
                goto L_0x0030
            L_0x002f:
                r0 = 0
            L_0x0030:
                if (r0 != 0) goto L_0x003c
                c71.k r11 = r9.f308718a     // Catch:{ Exception -> 0x00ac }
                java.lang.String r11 = r11.f308708d     // Catch:{ Exception -> 0x00ac }
                java.lang.String r0 = "inputBuffer is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)     // Catch:{ Exception -> 0x00ac }
                return
            L_0x003c:
                r0.clear()     // Catch:{ Exception -> 0x00ac }
                c71.k r1 = r9.f308718a     // Catch:{ Exception -> 0x00ac }
                oj.b r1 = r1.f308711g     // Catch:{ Exception -> 0x00ac }
                int r5 = r1.mo161387f(r0, r10)     // Catch:{ Exception -> 0x00ac }
                c71.k r1 = r9.f308718a     // Catch:{ Exception -> 0x00ac }
                oj.b r1 = r1.f308711g     // Catch:{ Exception -> 0x00ac }
                r1.mo161382a()     // Catch:{ Exception -> 0x00ac }
                r0.position(r10)     // Catch:{ Exception -> 0x00ac }
                c71.k r0 = r9.f308718a     // Catch:{ Exception -> 0x00ac }
                oj.b r0 = r0.f308711g     // Catch:{ Exception -> 0x00ac }
                long r6 = r0.mo161383b()     // Catch:{ Exception -> 0x00ac }
                c71.k r0 = r9.f308718a     // Catch:{ Exception -> 0x00ac }
                java.lang.String r0 = r0.f308708d     // Catch:{ Exception -> 0x00ac }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ac }
                r1.<init>()     // Catch:{ Exception -> 0x00ac }
                java.lang.String r2 = "sampleTime: "
                r1.append(r2)     // Catch:{ Exception -> 0x00ac }
                r1.append(r6)     // Catch:{ Exception -> 0x00ac }
                java.lang.String r2 = ", sampleSize: "
                r1.append(r2)     // Catch:{ Exception -> 0x00ac }
                r1.append(r5)     // Catch:{ Exception -> 0x00ac }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ac }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x00ac }
                c71.k r0 = r9.f308718a     // Catch:{ Exception -> 0x00ac }
                long r1 = r0.f308714j     // Catch:{ Exception -> 0x00ac }
                int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r3 <= 0) goto L_0x0084
                r0.f308714j = r6     // Catch:{ Exception -> 0x00ac }
            L_0x0084:
                if (r5 < 0) goto L_0x008f
                r1 = 0
                int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r3 >= 0) goto L_0x008d
                goto L_0x008f
            L_0x008d:
                r0 = 0
                goto L_0x0098
            L_0x008f:
                java.lang.String r0 = r0.f308708d     // Catch:{ Exception -> 0x00ac }
                java.lang.String r1 = "read sample end"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x00ac }
                r0 = 1
            L_0x0098:
                c71.k r1 = r9.f308718a     // Catch:{ Exception -> 0x00ac }
                r1.f308713i = r0     // Catch:{ Exception -> 0x00ac }
                com.tencent.mm.compatible.deviceinfo.a r2 = r1.f308709e     // Catch:{ Exception -> 0x00ac }
                if (r2 == 0) goto L_0x00b8
                r4 = 0
                if (r0 == 0) goto L_0x00a6
                r0 = 4
                r8 = 4
                goto L_0x00a7
            L_0x00a6:
                r8 = 0
            L_0x00a7:
                r3 = r11
                r2.mo148213o(r3, r4, r5, r6, r8)     // Catch:{ Exception -> 0x00ac }
                goto L_0x00b8
            L_0x00ac:
                r11 = move-exception
                c71.k r0 = r9.f308718a
                java.lang.String r0 = r0.f308708d
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.String r1 = "onInputBufferAvailable"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r11, r1, r10)
            L_0x00b8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c71.C104301k.C104302a.onInputBufferAvailable(android.media.MediaCodec, int):void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(15:5|(1:7)|8|(2:10|(1:15)(1:14))|17|(1:39)|19|20|21|(1:23)|24|(1:26)|27|28|(2:30|36)(1:37)) */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
            if (r3 != false) goto L_0x007f;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00b4 */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba A[Catch:{ Exception -> 0x00c8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:? A[Catch:{ Exception -> 0x00c8 }, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onOutputBufferAvailable(android.media.MediaCodec r7, int r8, android.media.MediaCodec.BufferInfo r9) {
            /*
                r6 = this;
                java.lang.String r0 = "codec"
                gy3.C87412m.m108594g(r7, r0)
                java.lang.String r7 = "info"
                gy3.C87412m.m108594g(r9, r7)
                c71.k r7 = r6.f308718a
                java.lang.String r7 = r7.f308708d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onOutputBufferAvailable "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r1 = ", flags "
                r0.append(r1)
                int r1 = r9.flags
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
                r7 = 0
                if (r8 < 0) goto L_0x00be
                int r0 = r9.size     // Catch:{ Exception -> 0x00c8 }
                if (r0 == 0) goto L_0x00be
                long r0 = r9.presentationTimeUs     // Catch:{ Exception -> 0x00c8 }
                c71.k r2 = r6.f308718a     // Catch:{ Exception -> 0x00c8 }
                java.lang.String r2 = r2.f308708d     // Catch:{ Exception -> 0x00c8 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c8 }
                r3.<init>()     // Catch:{ Exception -> 0x00c8 }
                java.lang.String r4 = "presentationTimeUs: "
                r3.append(r4)     // Catch:{ Exception -> 0x00c8 }
                r3.append(r0)     // Catch:{ Exception -> 0x00c8 }
                java.lang.String r4 = ", inputSampleTime: "
                r3.append(r4)     // Catch:{ Exception -> 0x00c8 }
                c71.k r4 = r6.f308718a     // Catch:{ Exception -> 0x00c8 }
                long r4 = r4.f308714j     // Catch:{ Exception -> 0x00c8 }
                r3.append(r4)     // Catch:{ Exception -> 0x00c8 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00c8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x00c8 }
                c71.k r2 = r6.f308718a     // Catch:{ Exception -> 0x00c8 }
                com.tencent.mm.compatible.deviceinfo.a r2 = r2.f308709e     // Catch:{ Exception -> 0x00c8 }
                r3 = 1
                if (r2 == 0) goto L_0x0064
                r2.mo148216r(r8, r3)     // Catch:{ Exception -> 0x00c8 }
            L_0x0064:
                c71.k r8 = r6.f308718a     // Catch:{ Exception -> 0x00c8 }
                c71.C104301k.m139260d(r8, r9)     // Catch:{ Exception -> 0x00c8 }
                c71.k r8 = r6.f308718a     // Catch:{ Exception -> 0x00c8 }
                boolean r2 = r8.f308713i     // Catch:{ Exception -> 0x00c8 }
                if (r2 == 0) goto L_0x007f
                r4 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 > 0) goto L_0x007c
                long r4 = r8.f308714j     // Catch:{ Exception -> 0x00c8 }
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x007c
                goto L_0x007d
            L_0x007c:
                r3 = 0
            L_0x007d:
                if (r3 == 0) goto L_0x0085
            L_0x007f:
                int r9 = r9.flags     // Catch:{ Exception -> 0x00c8 }
                r9 = r9 & 4
                if (r9 == 0) goto L_0x00d4
            L_0x0085:
                java.lang.String r8 = r8.f308708d     // Catch:{ Exception -> 0x00c8 }
                java.lang.String r9 = "receive eos!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ Exception -> 0x00c8 }
                c71.k r8 = r6.f308718a     // Catch:{ Exception -> 0x00c8 }
                java.lang.String r8 = r8.f308708d     // Catch:{ Exception -> 0x00c8 }
                java.lang.String r9 = "sendDecoderEos"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ Exception -> 0x00c8 }
                c71.k r8 = r6.f308718a     // Catch:{ Exception -> 0x00c8 }
                java.lang.String r9 = r8.f308708d     // Catch:{ Exception -> 0x00c8 }
                java.lang.String r0 = "release"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x00c8 }
                android.os.HandlerThread r9 = r8.f308715k     // Catch:{ Exception -> 0x00b4 }
                r9.quit()     // Catch:{ Exception -> 0x00b4 }
                com.tencent.mm.compatible.deviceinfo.a r9 = r8.f308709e     // Catch:{ Exception -> 0x00b4 }
                if (r9 == 0) goto L_0x00ad
                r9.mo148223z()     // Catch:{ Exception -> 0x00b4 }
            L_0x00ad:
                com.tencent.mm.compatible.deviceinfo.a r8 = r8.f308709e     // Catch:{ Exception -> 0x00b4 }
                if (r8 == 0) goto L_0x00b4
                r8.mo148214p()     // Catch:{ Exception -> 0x00b4 }
            L_0x00b4:
                c71.k r8 = r6.f308718a     // Catch:{ Exception -> 0x00c8 }
                fy3.a<rx3.b0> r8 = r8.f264357b     // Catch:{ Exception -> 0x00c8 }
                if (r8 == 0) goto L_0x00bd
                r8.invoke()     // Catch:{ Exception -> 0x00c8 }
            L_0x00bd:
                return
            L_0x00be:
                c71.k r9 = r6.f308718a     // Catch:{ Exception -> 0x00c8 }
                com.tencent.mm.compatible.deviceinfo.a r9 = r9.f308709e     // Catch:{ Exception -> 0x00c8 }
                if (r9 == 0) goto L_0x00d4
                r9.mo148216r(r8, r7)     // Catch:{ Exception -> 0x00c8 }
                goto L_0x00d4
            L_0x00c8:
                r8 = move-exception
                c71.k r9 = r6.f308718a
                java.lang.String r9 = r9.f308708d
                java.lang.Object[] r7 = new java.lang.Object[r7]
                java.lang.String r0 = "onOutputBufferAvailable"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r8, r0, r7)
            L_0x00d4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c71.C104301k.C104302a.onOutputBufferAvailable(android.media.MediaCodec, int, android.media.MediaCodec$BufferInfo):void");
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(mediaFormat, TPReportKeys.PlayerStep.PLAYER_FORMAT);
            String str = this.f308718a.f308708d;
            Log.m105924i(str, "onOutputFormatChanged " + mediaFormat);
            this.f308718a.f308710f = mediaFormat;
        }
    }

    public C104301k(String str, int i, Surface surface) {
        C87412m.m108594g(str, "videoPath");
        C87412m.m108594g(surface, "surface");
        this.f308707c = surface;
        int i2 = C58834h.f168432b;
        this.f308715k = C97749e.m126093a("EmojiMixVideoDecoderAsync_decodeThread", 5);
        this.f308716l = new Object();
        this.f308717m = new C104302a(this);
        try {
            Log.m105924i("MicroMsg.EmojiMixVideoDecoderAsync", "create decoder with path: " + str);
            this.f308711g.mo161392k(str);
            int d = this.f308711g.mo161385d();
            for (int i3 = 0; i3 < d; i3++) {
                MediaFormat e = this.f308711g.mo161386e(i3);
                C87412m.m108593f(e, "extractor.getTrackFormat(i)");
                String string = e.getString("mime");
                C87412m.m108591d(string);
                if (C112550d0.m153801u(string, "video", false)) {
                    String string2 = e.getString("mime");
                    C87412m.m108591d(string2);
                    this.f308712h = string2;
                    this.f308710f = e;
                    String str2 = this.f308708d;
                    Log.m105924i(str2, "find video format " + this.f308710f + ", mime: " + this.f308712h);
                    this.f308711g.mo161390i(i3);
                    return;
                }
            }
        } catch (Exception e2) {
            Log.printErrStackTrace(this.f308708d, e2, "init create extractor error", new Object[0]);
        }
    }

    /* renamed from: d */
    public static final void m139260d(C104301k kVar, MediaCodec.BufferInfo bufferInfo) {
        String str = kVar.f308708d;
        Log.m105924i(str, "processDecodeBuffer pts: " + bufferInfo.presentationTimeUs + ", size: " + bufferInfo.size);
        C32226l<? super Long, C13598b0> lVar = kVar.f264356a;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(bufferInfo.presentationTimeUs * ((long) 1000)));
        }
        synchronized (kVar.f308716l) {
            try {
                kVar.f308716l.wait(3000);
            } catch (Exception e) {
                Log.printErrStackTrace(kVar.f308708d, e, "", new Object[0]);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public int mo126339a() {
        if (this.f308710f == null || Util.isNullOrNil(this.f308712h)) {
            return -1;
        }
        try {
            C104619a c = C104619a.m140211c(this.f308712h);
            this.f308709e = c;
            c.mo148202a(this.f308710f, this.f308707c, (MediaCrypto) null, 0);
            if (C11171e.m11046c(23)) {
                this.f308715k.start();
                Handler handler = new Handler(this.f308715k.getLooper());
                C104619a aVar = this.f308709e;
                if (aVar != null) {
                    aVar.mo148218u(this.f308717m, handler);
                }
            } else {
                C104619a aVar2 = this.f308709e;
                if (aVar2 != null) {
                    aVar2.f310657a.setCallback(this.f308717m);
                }
            }
            return 0;
        } catch (Exception e) {
            String str = this.f308708d;
            Log.m105920e(str, "init decoder error " + e.getMessage());
            return -1;
        }
    }

    /* renamed from: b */
    public void mo126340b(boolean z) {
        if (!z) {
            synchronized (this.f308716l) {
                try {
                    this.f308716l.notifyAll();
                } catch (Exception e) {
                    Log.printErrStackTrace(this.f308708d, e, "", new Object[0]);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: c */
    public void mo126341c() {
        C104619a aVar = this.f308709e;
        if (aVar == null) {
            C32224a<C13598b0> aVar2 = this.f264357b;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (aVar != null) {
            aVar.mo148222y();
        }
    }
}
