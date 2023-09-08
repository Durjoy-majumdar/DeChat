package p353k7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p289a7.C16433b;
import p289a7.C16435d;
import p333e8.C20528a;
import p333e8.C20551y;
import p353k7.C21308d;
import p396x6.C22993a;
import p396x6.C22997e;
import p396x6.C23010j;
import p404z6.C23455e;
import p404z6.C91618d;

/* renamed from: k7.b */
public abstract class C21304b extends C22993a {

    /* renamed from: Y */
    public static final byte[] f60166Y;

    /* renamed from: A */
    public boolean f60167A;

    /* renamed from: B */
    public boolean f60168B;

    /* renamed from: C */
    public boolean f60169C;

    /* renamed from: D */
    public boolean f60170D;

    /* renamed from: E */
    public boolean f60171E;

    /* renamed from: F */
    public boolean f60172F;

    /* renamed from: G */
    public boolean f60173G;

    /* renamed from: H */
    public ByteBuffer[] f60174H;

    /* renamed from: I */
    public ByteBuffer[] f60175I;

    /* renamed from: J */
    public long f60176J;

    /* renamed from: K */
    public int f60177K;

    /* renamed from: L */
    public int f60178L;

    /* renamed from: M */
    public boolean f60179M;

    /* renamed from: N */
    public boolean f60180N;

    /* renamed from: P */
    public int f60181P;

    /* renamed from: Q */
    public int f60182Q;

    /* renamed from: R */
    public boolean f60183R;

    /* renamed from: S */
    public boolean f60184S;

    /* renamed from: T */
    public boolean f60185T;

    /* renamed from: U */
    public boolean f60186U;

    /* renamed from: V */
    public boolean f60187V;

    /* renamed from: W */
    public boolean f60188W;

    /* renamed from: X */
    public C91618d f60189X;

    /* renamed from: o */
    public final C21306c f60190o;

    /* renamed from: p */
    public final boolean f60191p;

    /* renamed from: q */
    public final C23455e f60192q;

    /* renamed from: r */
    public final C23455e f60193r;

    /* renamed from: s */
    public final C23010j f60194s;

    /* renamed from: t */
    public final List<Long> f60195t;

    /* renamed from: u */
    public final MediaCodec.BufferInfo f60196u;

    /* renamed from: v */
    public Format f60197v;

    /* renamed from: w */
    public MediaCodec f60198w;

    /* renamed from: x */
    public C21303a f60199x;

    /* renamed from: y */
    public int f60200y;

    /* renamed from: z */
    public boolean f60201z;

    static {
        int i = C20551y.f57835a;
        byte[] bArr = new byte[38];
        for (int i2 = 0; i2 < 38; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3 + 1), 16));
        }
        f60166Y = bArr;
    }

    public C21304b(int i, C21306c cVar, C16433b<C16435d> bVar, boolean z) {
        super(i);
        C20528a.m22240d(C20551y.f57835a >= 16);
        cVar.getClass();
        this.f60190o = cVar;
        this.f60191p = z;
        this.f60192q = new C23455e(0);
        this.f60193r = new C23455e(0);
        this.f60194s = new C23010j();
        this.f60195t = new ArrayList();
        this.f60196u = new MediaCodec.BufferInfo();
        this.f60181P = 0;
        this.f60182Q = 0;
    }

    /* renamed from: A */
    public boolean mo32367A(MediaCodec mediaCodec, boolean z, Format format, Format format2) {
        return false;
    }

    /* renamed from: B */
    public abstract void mo32368B(C21303a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto);

    /* renamed from: C */
    public C21303a mo33305C(C21306c cVar, Format format, boolean z) {
        return cVar.mo33313a(format.f45777i, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0163  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33306D() {
        /*
            r12 = this;
            android.media.MediaCodec r0 = r12.f60198w
            if (r0 != 0) goto L_0x01f2
            com.google.android.exoplayer2.Format r0 = r12.f60197v
            if (r0 != 0) goto L_0x000a
            goto L_0x01f2
        L_0x000a:
            r1 = 0
            k7.a r2 = r12.f60199x
            r3 = 0
            if (r2 != 0) goto L_0x003e
            k7.c r2 = r12.f60190o     // Catch:{ c -> 0x002c }
            k7.a r0 = r12.mo33305C(r2, r0, r3)     // Catch:{ c -> 0x002c }
            r12.f60199x = r0     // Catch:{ c -> 0x002c }
            if (r0 == 0) goto L_0x001b
            goto L_0x003e
        L_0x001b:
            k7.b$a r0 = new k7.b$a
            com.google.android.exoplayer2.Format r2 = r12.f60197v
            r4 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>((com.google.android.exoplayer2.Format) r2, (java.lang.Throwable) r1, (boolean) r3, (int) r4)
            int r1 = r12.f66064f
            x6.e r0 = p396x6.C22997e.m27212a(r0, r1)
            throw r0
        L_0x002c:
            r0 = move-exception
            k7.b$a r1 = new k7.b$a
            com.google.android.exoplayer2.Format r2 = r12.f60197v
            r4 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.android.exoplayer2.Format) r2, (java.lang.Throwable) r0, (boolean) r3, (int) r4)
            int r0 = r12.f66064f
            x6.e r0 = p396x6.C22997e.m27212a(r1, r0)
            throw r0
        L_0x003e:
            k7.a r0 = r12.f60199x
            boolean r0 = r12.mo32375M(r0)
            if (r0 != 0) goto L_0x0047
            return
        L_0x0047:
            k7.a r0 = r12.f60199x
            java.lang.String r0 = r0.f60160a
            int r2 = p333e8.C20551y.f57835a
            r4 = 24
            java.lang.String r5 = "OMX.Exynos.avc.dec.secure"
            r10 = 2
            r11 = 1
            if (r2 > r4) goto L_0x006f
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L_0x006f
            java.lang.String r6 = p333e8.C20551y.f57838d
            java.lang.String r7 = "SM-T585"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x006d
            java.lang.String r7 = "SM-A520"
            boolean r6 = r6.startsWith(r7)
            if (r6 == 0) goto L_0x006f
        L_0x006d:
            r4 = 2
            goto L_0x00a7
        L_0x006f:
            if (r2 >= r4) goto L_0x00a6
            java.lang.String r4 = "OMX.Nvidia.h264.decode"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0081
            java.lang.String r4 = "OMX.Nvidia.h264.decode.secure"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00a6
        L_0x0081:
            java.lang.String r4 = p333e8.C20551y.f57836b
            java.lang.String r6 = "flounder"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x00a4
            java.lang.String r6 = "flounder_lte"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x00a4
            java.lang.String r6 = "grouper"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x00a4
            java.lang.String r6 = "tilapia"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x00a6
        L_0x00a4:
            r4 = 1
            goto L_0x00a7
        L_0x00a6:
            r4 = 0
        L_0x00a7:
            r12.f60200y = r4
            com.google.android.exoplayer2.Format r4 = r12.f60197v
            r6 = 21
            if (r2 >= r6) goto L_0x00c1
            java.util.List<byte[]> r4 = r4.f45779n
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00c1
            java.lang.String r4 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00c1
            r4 = 1
            goto L_0x00c2
        L_0x00c1:
            r4 = 0
        L_0x00c2:
            r12.f60201z = r4
            r4 = 19
            r7 = 18
            if (r2 < r7) goto L_0x00f9
            if (r2 != r7) goto L_0x00dc
            java.lang.String r8 = "OMX.SEC.avc.dec"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00f9
            java.lang.String r8 = "OMX.SEC.avc.dec.secure"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00f9
        L_0x00dc:
            if (r2 != r4) goto L_0x00f7
            java.lang.String r8 = p333e8.C20551y.f57838d
            java.lang.String r9 = "SM-G800"
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L_0x00f7
            java.lang.String r8 = "OMX.Exynos.avc.dec"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00f9
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00f7
            goto L_0x00f9
        L_0x00f7:
            r5 = 0
            goto L_0x00fa
        L_0x00f9:
            r5 = 1
        L_0x00fa:
            r12.f60167A = r5
            r5 = 17
            if (r2 > r5) goto L_0x0112
            java.lang.String r5 = "OMX.rk.video_decoder.avc"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0110
            java.lang.String r5 = "OMX.allwinner.video.decoder.avc"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0112
        L_0x0110:
            r5 = 1
            goto L_0x0113
        L_0x0112:
            r5 = 0
        L_0x0113:
            r12.f60168B = r5
            r5 = 23
            if (r2 > r5) goto L_0x0121
            java.lang.String r5 = "OMX.google.vorbis.decoder"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x013d
        L_0x0121:
            if (r2 > r4) goto L_0x013f
            java.lang.String r4 = p333e8.C20551y.f57836b
            java.lang.String r5 = "hb2000"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x013f
            java.lang.String r4 = "OMX.amlogic.avc.decoder.awesome"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x013d
            java.lang.String r4 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x013f
        L_0x013d:
            r4 = 1
            goto L_0x0140
        L_0x013f:
            r4 = 0
        L_0x0140:
            r12.f60169C = r4
            if (r2 != r6) goto L_0x014e
            java.lang.String r4 = "OMX.google.aac.decoder"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x014e
            r4 = 1
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            r12.f60170D = r4
            com.google.android.exoplayer2.Format r4 = r12.f60197v
            if (r2 > r7) goto L_0x0163
            int r2 = r4.f45789x
            if (r2 != r11) goto L_0x0163
            java.lang.String r2 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0163
            r2 = 1
            goto L_0x0164
        L_0x0163:
            r2 = 0
        L_0x0164:
            r12.f60171E = r2
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01e3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e3 }
            r2.<init>()     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r6 = "createCodec:"
            r2.append(r6)     // Catch:{ Exception -> 0x01e3 }
            r2.append(r0)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01e3 }
            p333e8.C20550v.m22309a(r2)     // Catch:{ Exception -> 0x01e3 }
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x01e3 }
            r12.f60198w = r2     // Catch:{ Exception -> 0x01e3 }
            p333e8.C20550v.m22310b()     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r2 = "configureCodec"
            p333e8.C20550v.m22309a(r2)     // Catch:{ Exception -> 0x01e3 }
            k7.a r2 = r12.f60199x     // Catch:{ Exception -> 0x01e3 }
            android.media.MediaCodec r6 = r12.f60198w     // Catch:{ Exception -> 0x01e3 }
            com.google.android.exoplayer2.Format r7 = r12.f60197v     // Catch:{ Exception -> 0x01e3 }
            r12.mo32368B(r2, r6, r7, r1)     // Catch:{ Exception -> 0x01e3 }
            p333e8.C20550v.m22310b()     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r1 = "startCodec"
            p333e8.C20550v.m22309a(r1)     // Catch:{ Exception -> 0x01e3 }
            android.media.MediaCodec r1 = r12.f60198w     // Catch:{ Exception -> 0x01e3 }
            r1.start()     // Catch:{ Exception -> 0x01e3 }
            p333e8.C20550v.m22310b()     // Catch:{ Exception -> 0x01e3 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01e3 }
            long r8 = r6 - r4
            r4 = r12
            r5 = r0
            r4.mo32369E(r5, r6, r8)     // Catch:{ Exception -> 0x01e3 }
            android.media.MediaCodec r1 = r12.f60198w     // Catch:{ Exception -> 0x01e3 }
            java.nio.ByteBuffer[] r1 = r1.getInputBuffers()     // Catch:{ Exception -> 0x01e3 }
            r12.f60174H = r1     // Catch:{ Exception -> 0x01e3 }
            android.media.MediaCodec r1 = r12.f60198w     // Catch:{ Exception -> 0x01e3 }
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x01e3 }
            r12.f60175I = r1     // Catch:{ Exception -> 0x01e3 }
            int r0 = r12.f66065g
            if (r0 != r10) goto L_0x01cd
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x01d2
        L_0x01cd:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01d2:
            r12.f60176J = r0
            r0 = -1
            r12.f60177K = r0
            r12.f60178L = r0
            r12.f60188W = r11
            z6.d r0 = r12.f60189X
            int r1 = r0.f262468a
            int r1 = r1 + r11
            r0.f262468a = r1
            return
        L_0x01e3:
            r1 = move-exception
            k7.b$a r2 = new k7.b$a
            com.google.android.exoplayer2.Format r4 = r12.f60197v
            r2.<init>((com.google.android.exoplayer2.Format) r4, (java.lang.Throwable) r1, (boolean) r3, (java.lang.String) r0)
            int r0 = r12.f66064f
            x6.e r0 = p396x6.C22997e.m27212a(r2, r0)
            throw r0
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p353k7.C21304b.mo33306D():void");
    }

    /* renamed from: E */
    public abstract void mo32369E(String str, long j, long j2);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r5.f45782q == r0.f45782q) goto L_0x0054;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32370F(com.google.android.exoplayer2.Format r5) {
        /*
            r4 = this;
            com.google.android.exoplayer2.Format r0 = r4.f60197v
            r4.f60197v = r5
            com.google.android.exoplayer2.drm.DrmInitData r5 = r5.f45780o
            r1 = 0
            if (r0 != 0) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            com.google.android.exoplayer2.drm.DrmInitData r1 = r0.f45780o
        L_0x000c:
            boolean r5 = p333e8.C20551y.m22311a(r5, r1)
            r1 = 1
            r5 = r5 ^ r1
            if (r5 == 0) goto L_0x0029
            com.google.android.exoplayer2.Format r5 = r4.f60197v
            com.google.android.exoplayer2.drm.DrmInitData r5 = r5.f45780o
            if (r5 != 0) goto L_0x001b
            goto L_0x0029
        L_0x001b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.f66064f
            x6.e r5 = p396x6.C22997e.m27212a(r5, r0)
            throw r5
        L_0x0029:
            android.media.MediaCodec r5 = r4.f60198w
            if (r5 == 0) goto L_0x0057
            k7.a r2 = r4.f60199x
            boolean r2 = r2.f60161b
            com.google.android.exoplayer2.Format r3 = r4.f60197v
            boolean r5 = r4.mo32367A(r5, r2, r0, r3)
            if (r5 == 0) goto L_0x0057
            r4.f60180N = r1
            r4.f60181P = r1
            int r5 = r4.f60200y
            r2 = 2
            if (r5 == r2) goto L_0x0054
            if (r5 != r1) goto L_0x0053
            com.google.android.exoplayer2.Format r5 = r4.f60197v
            int r2 = r5.f45781p
            int r3 = r0.f45781p
            if (r2 != r3) goto L_0x0053
            int r5 = r5.f45782q
            int r0 = r0.f45782q
            if (r5 != r0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            r4.f60172F = r1
            goto L_0x0064
        L_0x0057:
            boolean r5 = r4.f60183R
            if (r5 == 0) goto L_0x005e
            r4.f60182Q = r1
            goto L_0x0064
        L_0x005e:
            r4.mo32374K()
            r4.mo33306D()
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p353k7.C21304b.mo32370F(com.google.android.exoplayer2.Format):void");
    }

    /* renamed from: G */
    public abstract void mo32371G(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* renamed from: H */
    public void mo32372H(C23455e eVar) {
    }

    /* renamed from: I */
    public final void mo33307I() {
        if (this.f60182Q == 2) {
            mo32374K();
            mo33306D();
            return;
        }
        this.f60186U = true;
        mo33308L();
    }

    /* renamed from: J */
    public abstract boolean mo32373J(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    /* renamed from: K */
    public void mo32374K() {
        this.f60176J = -9223372036854775807L;
        this.f60177K = -1;
        this.f60178L = -1;
        this.f60187V = false;
        this.f60179M = false;
        ((ArrayList) this.f60195t).clear();
        this.f60174H = null;
        this.f60175I = null;
        this.f60199x = null;
        this.f60180N = false;
        this.f60183R = false;
        this.f60201z = false;
        this.f60167A = false;
        this.f60200y = 0;
        this.f60168B = false;
        this.f60169C = false;
        this.f60171E = false;
        this.f60172F = false;
        this.f60173G = false;
        this.f60184S = false;
        this.f60181P = 0;
        this.f60182Q = 0;
        this.f60192q.f67260f = null;
        MediaCodec mediaCodec = this.f60198w;
        if (mediaCodec != null) {
            this.f60189X.f262469b++;
            try {
                mediaCodec.stop();
                try {
                    this.f60198w.release();
                } finally {
                    this.f60198w = null;
                }
            } catch (Throwable th) {
                this.f60198w.release();
                throw th;
            } finally {
                this.f60198w = null;
            }
        }
    }

    /* renamed from: L */
    public void mo33308L() {
    }

    /* renamed from: M */
    public boolean mo32375M(C21303a aVar) {
        return true;
    }

    /* renamed from: N */
    public abstract int mo32376N(C21306c cVar, Format format);

    /* renamed from: a */
    public final int mo33309a(Format format) {
        try {
            int N = mo32376N(this.f60190o, format);
            if ((N & 7) <= 2) {
                return N;
            }
            return !(format.f45780o == null) ? (N & -8) | 2 : N;
        } catch (C21308d.C21311c e) {
            throw C22997e.m27212a(e, this.f66064f);
        }
    }

    /* renamed from: b */
    public boolean mo33310b() {
        return this.f60186U;
    }

    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r3v7, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0399 A[LOOP:2: B:95:0x01a1->B:199:0x0399, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x01a1 A[EDGE_INSN: B:211:0x01a1->B:95:0x01a1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x039c A[EDGE_INSN: B:214:0x039c->B:200:0x039c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x019c A[LOOP:0: B:14:0x0047->B:94:0x019c, LOOP_END] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33311g(long r22, long r24) {
        /*
            r21 = this;
            r13 = r21
            boolean r0 = r13.f60186U
            if (r0 == 0) goto L_0x000a
            r21.mo33308L()
            return
        L_0x000a:
            com.google.android.exoplayer2.Format r0 = r13.f60197v
            r1 = -5
            r2 = -4
            r3 = 4
            r4 = 1
            if (r0 != 0) goto L_0x003a
            z6.e r0 = r13.f60193r
            r0.mo35592f()
            x6.j r0 = r13.f60194s
            z6.e r5 = r13.f60193r
            int r0 = r13.mo36250z(r0, r5, r4)
            if (r0 != r1) goto L_0x0029
            x6.j r0 = r13.f60194s
            com.google.android.exoplayer2.Format r0 = r0.f66173a
            r13.mo32370F(r0)
            goto L_0x003a
        L_0x0029:
            if (r0 != r2) goto L_0x0039
            z6.e r0 = r13.f60193r
            boolean r0 = r0.mo36910g(r3)
            p333e8.C20528a.m22240d(r0)
            r13.f60185T = r4
            r21.mo33307I()
        L_0x0039:
            return
        L_0x003a:
            r21.mo33306D()
            android.media.MediaCodec r0 = r13.f60198w
            r1 = 0
            if (r0 == 0) goto L_0x03a0
            java.lang.String r0 = "drainAndFeed"
            p333e8.C20550v.m22309a(r0)
        L_0x0047:
            int r0 = r13.f60178L
            r5 = 0
            r2 = 2
            r7 = -1
            r8 = -3
            if (r0 >= 0) goto L_0x0134
            boolean r0 = r13.f60170D
            if (r0 == 0) goto L_0x0070
            boolean r0 = r13.f60184S
            if (r0 == 0) goto L_0x0070
            android.media.MediaCodec r0 = r13.f60198w     // Catch:{ IllegalStateException -> 0x0063 }
            android.media.MediaCodec$BufferInfo r9 = r13.f60196u     // Catch:{ IllegalStateException -> 0x0063 }
            int r0 = r0.dequeueOutputBuffer(r9, r5)     // Catch:{ IllegalStateException -> 0x0063 }
            r13.f60178L = r0     // Catch:{ IllegalStateException -> 0x0063 }
            goto L_0x007a
        L_0x0063:
            r21.mo33307I()
            boolean r0 = r13.f60186U
            if (r0 == 0) goto L_0x012e
            r21.mo32374K()
            goto L_0x012e
        L_0x0070:
            android.media.MediaCodec r0 = r13.f60198w
            android.media.MediaCodec$BufferInfo r9 = r13.f60196u
            int r0 = r0.dequeueOutputBuffer(r9, r5)
            r13.f60178L = r0
        L_0x007a:
            int r0 = r13.f60178L
            if (r0 < 0) goto L_0x00e1
            boolean r2 = r13.f60173G
            if (r2 == 0) goto L_0x008d
            r13.f60173G = r1
            android.media.MediaCodec r2 = r13.f60198w
            r2.releaseOutputBuffer(r0, r1)
            r13.f60178L = r7
            goto L_0x011d
        L_0x008d:
            android.media.MediaCodec$BufferInfo r1 = r13.f60196u
            int r2 = r1.flags
            r2 = r2 & r3
            if (r2 == 0) goto L_0x009b
            r21.mo33307I()
            r13.f60178L = r7
            goto L_0x012e
        L_0x009b:
            java.nio.ByteBuffer[] r2 = r13.f60175I
            r0 = r2[r0]
            if (r0 == 0) goto L_0x00b0
            int r1 = r1.offset
            r0.position(r1)
            android.media.MediaCodec$BufferInfo r1 = r13.f60196u
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x00b0:
            android.media.MediaCodec$BufferInfo r0 = r13.f60196u
            long r0 = r0.presentationTimeUs
            java.util.List<java.lang.Long> r2 = r13.f60195t
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r3 = 0
        L_0x00bd:
            if (r3 >= r2) goto L_0x00dd
            java.util.List<java.lang.Long> r4 = r13.f60195t
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r4 = r4.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00da
            java.util.List<java.lang.Long> r0 = r13.f60195t
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.remove(r3)
            r0 = 1
            goto L_0x00de
        L_0x00da:
            int r3 = r3 + 1
            goto L_0x00bd
        L_0x00dd:
            r0 = 0
        L_0x00de:
            r13.f60179M = r0
            goto L_0x0134
        L_0x00e1:
            r1 = -2
            if (r0 != r1) goto L_0x0113
            android.media.MediaCodec r0 = r13.f60198w
            android.media.MediaFormat r0 = r0.getOutputFormat()
            int r1 = r13.f60200y
            if (r1 == 0) goto L_0x0104
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x0104
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x0104
            r13.f60173G = r4
            goto L_0x011d
        L_0x0104:
            boolean r1 = r13.f60171E
            if (r1 == 0) goto L_0x010d
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r4)
        L_0x010d:
            android.media.MediaCodec r1 = r13.f60198w
            r13.mo32371G(r1, r0)
            goto L_0x011d
        L_0x0113:
            if (r0 != r8) goto L_0x011f
            android.media.MediaCodec r0 = r13.f60198w
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()
            r13.f60175I = r0
        L_0x011d:
            r0 = 1
            goto L_0x012f
        L_0x011f:
            boolean r0 = r13.f60168B
            if (r0 == 0) goto L_0x012e
            boolean r0 = r13.f60185T
            if (r0 != 0) goto L_0x012b
            int r0 = r13.f60182Q
            if (r0 != r2) goto L_0x012e
        L_0x012b:
            r21.mo33307I()
        L_0x012e:
            r0 = 0
        L_0x012f:
            r1 = 2
            r2 = -1
            r3 = 1
            goto L_0x019a
        L_0x0134:
            boolean r0 = r13.f60170D
            if (r0 == 0) goto L_0x016d
            boolean r0 = r13.f60184S
            if (r0 == 0) goto L_0x016d
            android.media.MediaCodec r6 = r13.f60198w     // Catch:{ IllegalStateException -> 0x015c }
            java.nio.ByteBuffer[] r0 = r13.f60175I     // Catch:{ IllegalStateException -> 0x015c }
            int r8 = r13.f60178L     // Catch:{ IllegalStateException -> 0x015c }
            r7 = r0[r8]     // Catch:{ IllegalStateException -> 0x015c }
            android.media.MediaCodec$BufferInfo r0 = r13.f60196u     // Catch:{ IllegalStateException -> 0x015c }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x015c }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x015c }
            boolean r12 = r13.f60179M     // Catch:{ IllegalStateException -> 0x015c }
            r0 = -1
            r14 = 2
            r15 = 1
            r1 = r21
            r2 = r22
            r4 = r24
            boolean r1 = r1.mo32373J(r2, r4, r6, r7, r8, r9, r10, r12)     // Catch:{ IllegalStateException -> 0x015f }
            r2 = -1
            r3 = 1
            goto L_0x018d
        L_0x015c:
            r14 = 2
            r0 = -1
            r15 = 1
        L_0x015f:
            r21.mo33307I()
            boolean r1 = r13.f60186U
            if (r1 == 0) goto L_0x0169
            r21.mo32374K()
        L_0x0169:
            r2 = r0
            r1 = r14
            r3 = r15
            goto L_0x0199
        L_0x016d:
            r0 = 2
            r14 = -1
            r15 = 1
            android.media.MediaCodec r6 = r13.f60198w
            java.nio.ByteBuffer[] r1 = r13.f60175I
            int r8 = r13.f60178L
            r7 = r1[r8]
            android.media.MediaCodec$BufferInfo r1 = r13.f60196u
            int r9 = r1.flags
            long r10 = r1.presentationTimeUs
            boolean r12 = r13.f60179M
            r1 = r21
            r2 = r22
            r4 = r24
            boolean r1 = r1.mo32373J(r2, r4, r6, r7, r8, r9, r10, r12)
            r2 = -1
            r3 = 1
            r14 = 2
        L_0x018d:
            if (r1 == 0) goto L_0x0198
            android.media.MediaCodec$BufferInfo r0 = r13.f60196u
            long r0 = r0.presentationTimeUs
            r13.f60178L = r2
            r0 = 1
            r1 = r14
            goto L_0x019a
        L_0x0198:
            r1 = r14
        L_0x0199:
            r0 = 0
        L_0x019a:
            if (r0 == 0) goto L_0x01a1
            r4 = 1
            r1 = 0
            r3 = 4
            goto L_0x0047
        L_0x01a1:
            android.media.MediaCodec r0 = r13.f60198w
            if (r0 == 0) goto L_0x0396
            int r4 = r13.f60182Q
            if (r4 == r1) goto L_0x0396
            boolean r4 = r13.f60185T
            if (r4 == 0) goto L_0x01af
            goto L_0x0396
        L_0x01af:
            int r4 = r13.f60177K
            if (r4 >= 0) goto L_0x01ca
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r13.f60177K = r0
            if (r0 >= 0) goto L_0x01bf
            goto L_0x0396
        L_0x01bf:
            z6.e r4 = r13.f60192q
            java.nio.ByteBuffer[] r5 = r13.f60174H
            r0 = r5[r0]
            r4.f67260f = r0
            r4.mo35592f()
        L_0x01ca:
            int r0 = r13.f60182Q
            if (r0 != r3) goto L_0x01e7
            boolean r0 = r13.f60168B
            if (r0 == 0) goto L_0x01d3
            goto L_0x01e3
        L_0x01d3:
            r13.f60184S = r3
            android.media.MediaCodec r4 = r13.f60198w
            int r5 = r13.f60177K
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 4
            r4.queueInputBuffer(r5, r6, r7, r8, r10)
            r13.f60177K = r2
        L_0x01e3:
            r13.f60182Q = r1
            goto L_0x0396
        L_0x01e7:
            boolean r0 = r13.f60172F
            if (r0 == 0) goto L_0x0209
            r0 = 0
            r13.f60172F = r0
            z6.e r0 = r13.f60192q
            java.nio.ByteBuffer r0 = r0.f67260f
            byte[] r1 = f60166Y
            r0.put(r1)
            android.media.MediaCodec r4 = r13.f60198w
            int r5 = r13.f60177K
            r6 = 0
            int r7 = r1.length
            r8 = 0
            r10 = 0
            r4.queueInputBuffer(r5, r6, r7, r8, r10)
            r13.f60177K = r2
            r13.f60183R = r3
            goto L_0x038c
        L_0x0209:
            r0 = 0
            boolean r4 = r13.f60187V
            if (r4 == 0) goto L_0x0212
            r4 = -4
            r5 = -3
            r6 = 0
            goto L_0x0248
        L_0x0212:
            int r4 = r13.f60181P
            if (r4 != r3) goto L_0x0237
            r4 = 0
        L_0x0217:
            com.google.android.exoplayer2.Format r5 = r13.f60197v
            java.util.List<byte[]> r5 = r5.f45779n
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0235
            com.google.android.exoplayer2.Format r5 = r13.f60197v
            java.util.List<byte[]> r5 = r5.f45779n
            java.lang.Object r5 = r5.get(r4)
            byte[] r5 = (byte[]) r5
            z6.e r6 = r13.f60192q
            java.nio.ByteBuffer r6 = r6.f67260f
            r6.put(r5)
            int r4 = r4 + 1
            goto L_0x0217
        L_0x0235:
            r13.f60181P = r1
        L_0x0237:
            z6.e r4 = r13.f60192q
            java.nio.ByteBuffer r4 = r4.f67260f
            int r6 = r4.position()
            x6.j r4 = r13.f60194s
            z6.e r5 = r13.f60192q
            int r4 = r13.mo36250z(r4, r5, r0)
            r5 = -3
        L_0x0248:
            if (r4 != r5) goto L_0x024c
            goto L_0x0396
        L_0x024c:
            r5 = -5
            if (r4 != r5) goto L_0x0263
            int r0 = r13.f60181P
            if (r0 != r1) goto L_0x025a
            z6.e r0 = r13.f60192q
            r0.mo35592f()
            r13.f60181P = r3
        L_0x025a:
            x6.j r0 = r13.f60194s
            com.google.android.exoplayer2.Format r0 = r0.f66173a
            r13.mo32370F(r0)
            goto L_0x038c
        L_0x0263:
            z6.e r4 = r13.f60192q
            r5 = 4
            boolean r4 = r4.mo36910g(r5)
            if (r4 == 0) goto L_0x02a2
            int r0 = r13.f60181P
            if (r0 != r1) goto L_0x0277
            z6.e r0 = r13.f60192q
            r0.mo35592f()
            r13.f60181P = r3
        L_0x0277:
            r13.f60185T = r3
            boolean r0 = r13.f60183R
            if (r0 != 0) goto L_0x0282
            r21.mo33307I()
            goto L_0x0396
        L_0x0282:
            boolean r0 = r13.f60168B     // Catch:{ CryptoException -> 0x029a }
            if (r0 == 0) goto L_0x0288
            goto L_0x0396
        L_0x0288:
            r13.f60184S = r3     // Catch:{ CryptoException -> 0x029a }
            android.media.MediaCodec r4 = r13.f60198w     // Catch:{ CryptoException -> 0x029a }
            int r5 = r13.f60177K     // Catch:{ CryptoException -> 0x029a }
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 4
            r4.queueInputBuffer(r5, r6, r7, r8, r10)     // Catch:{ CryptoException -> 0x029a }
            r13.f60177K = r2     // Catch:{ CryptoException -> 0x029a }
            goto L_0x0396
        L_0x029a:
            r0 = move-exception
            int r1 = r13.f66064f
            x6.e r0 = p396x6.C22997e.m27212a(r0, r1)
            throw r0
        L_0x02a2:
            boolean r4 = r13.f60188W
            if (r4 == 0) goto L_0x02bb
            z6.e r4 = r13.f60192q
            boolean r4 = r4.mo36910g(r3)
            if (r4 != 0) goto L_0x02bb
            z6.e r0 = r13.f60192q
            r0.mo35592f()
            int r0 = r13.f60181P
            if (r0 != r1) goto L_0x038c
            r13.f60181P = r3
            goto L_0x038c
        L_0x02bb:
            r13.f60188W = r0
            z6.e r1 = r13.f60192q
            r4 = 1073741824(0x40000000, float:2.0)
            boolean r1 = r1.mo36910g(r4)
            r4 = 0
            r13.f60187V = r4
            boolean r4 = r13.f60201z
            if (r4 == 0) goto L_0x031f
            if (r1 != 0) goto L_0x031f
            z6.e r4 = r13.f60192q
            java.nio.ByteBuffer r4 = r4.f67260f
            byte[] r5 = p333e8.C20537k.f57788a
            int r5 = r4.position()
            r7 = 0
            r8 = 0
        L_0x02da:
            int r9 = r7 + 1
            if (r9 >= r5) goto L_0x030f
            byte r10 = r4.get(r7)
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 3
            if (r8 != r11) goto L_0x0305
            if (r10 != r3) goto L_0x0309
            byte r11 = r4.get(r9)
            r11 = r11 & 31
            r12 = 7
            if (r11 != r12) goto L_0x0309
            java.nio.ByteBuffer r8 = r4.duplicate()
            int r7 = r7 + -3
            r8.position(r7)
            r8.limit(r5)
            r4.position(r0)
            r4.put(r8)
            goto L_0x0312
        L_0x0305:
            if (r10 != 0) goto L_0x0309
            int r8 = r8 + 1
        L_0x0309:
            if (r10 == 0) goto L_0x030d
            r7 = 0
            r8 = 0
        L_0x030d:
            r7 = r9
            goto L_0x02da
        L_0x030f:
            r4.clear()
        L_0x0312:
            z6.e r4 = r13.f60192q
            java.nio.ByteBuffer r4 = r4.f67260f
            int r4 = r4.position()
            if (r4 != 0) goto L_0x031d
            goto L_0x038c
        L_0x031d:
            r13.f60201z = r0
        L_0x031f:
            z6.e r4 = r13.f60192q     // Catch:{ CryptoException -> 0x038e }
            long r7 = r4.f67261g     // Catch:{ CryptoException -> 0x038e }
            boolean r4 = r4.mo36911h()     // Catch:{ CryptoException -> 0x038e }
            if (r4 == 0) goto L_0x0334
            java.util.List<java.lang.Long> r4 = r13.f60195t     // Catch:{ CryptoException -> 0x038e }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ CryptoException -> 0x038e }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ CryptoException -> 0x038e }
            r4.add(r5)     // Catch:{ CryptoException -> 0x038e }
        L_0x0334:
            z6.e r4 = r13.f60192q     // Catch:{ CryptoException -> 0x038e }
            java.nio.ByteBuffer r4 = r4.f67260f     // Catch:{ CryptoException -> 0x038e }
            r4.flip()     // Catch:{ CryptoException -> 0x038e }
            z6.e r4 = r13.f60192q     // Catch:{ CryptoException -> 0x038e }
            r13.mo32372H(r4)     // Catch:{ CryptoException -> 0x038e }
            if (r1 == 0) goto L_0x036a
            z6.e r1 = r13.f60192q     // Catch:{ CryptoException -> 0x038e }
            z6.b r1 = r1.f67259e     // Catch:{ CryptoException -> 0x038e }
            android.media.MediaCodec$CryptoInfo r1 = r1.f67255d     // Catch:{ CryptoException -> 0x038e }
            if (r6 != 0) goto L_0x034b
            goto L_0x035a
        L_0x034b:
            int[] r4 = r1.numBytesOfClearData     // Catch:{ CryptoException -> 0x038e }
            if (r4 != 0) goto L_0x0353
            int[] r4 = new int[r3]     // Catch:{ CryptoException -> 0x038e }
            r1.numBytesOfClearData = r4     // Catch:{ CryptoException -> 0x038e }
        L_0x0353:
            int[] r4 = r1.numBytesOfClearData     // Catch:{ CryptoException -> 0x038e }
            r5 = r4[r0]     // Catch:{ CryptoException -> 0x038e }
            int r5 = r5 + r6
            r4[r0] = r5     // Catch:{ CryptoException -> 0x038e }
        L_0x035a:
            android.media.MediaCodec r14 = r13.f60198w     // Catch:{ CryptoException -> 0x038e }
            int r15 = r13.f60177K     // Catch:{ CryptoException -> 0x038e }
            r16 = 0
            r20 = 0
            r17 = r1
            r18 = r7
            r14.queueSecureInputBuffer(r15, r16, r17, r18, r20)     // Catch:{ CryptoException -> 0x038e }
            goto L_0x037f
        L_0x036a:
            android.media.MediaCodec r14 = r13.f60198w     // Catch:{ CryptoException -> 0x038e }
            int r15 = r13.f60177K     // Catch:{ CryptoException -> 0x038e }
            r16 = 0
            z6.e r1 = r13.f60192q     // Catch:{ CryptoException -> 0x038e }
            java.nio.ByteBuffer r1 = r1.f67260f     // Catch:{ CryptoException -> 0x038e }
            int r17 = r1.limit()     // Catch:{ CryptoException -> 0x038e }
            r20 = 0
            r18 = r7
            r14.queueInputBuffer(r15, r16, r17, r18, r20)     // Catch:{ CryptoException -> 0x038e }
        L_0x037f:
            r13.f60177K = r2     // Catch:{ CryptoException -> 0x038e }
            r13.f60183R = r3     // Catch:{ CryptoException -> 0x038e }
            r13.f60181P = r0     // Catch:{ CryptoException -> 0x038e }
            z6.d r0 = r13.f60189X     // Catch:{ CryptoException -> 0x038e }
            int r1 = r0.f262470c     // Catch:{ CryptoException -> 0x038e }
            int r1 = r1 + r3
            r0.f262470c = r1     // Catch:{ CryptoException -> 0x038e }
        L_0x038c:
            r0 = 1
            goto L_0x0397
        L_0x038e:
            r0 = move-exception
            int r1 = r13.f66064f
            x6.e r0 = p396x6.C22997e.m27212a(r0, r1)
            throw r0
        L_0x0396:
            r0 = 0
        L_0x0397:
            if (r0 == 0) goto L_0x039c
            r1 = 2
            goto L_0x01a1
        L_0x039c:
            p333e8.C20550v.m22310b()
            goto L_0x03d5
        L_0x03a0:
            r0 = 0
            r1 = 4
            r2 = 1
            p7.r r3 = r13.f66066h
            long r4 = r13.f66067i
            long r4 = r22 - r4
            r3.mo34996b(r4)
            z6.e r3 = r13.f60193r
            r3.mo35592f()
            x6.j r3 = r13.f60194s
            z6.e r4 = r13.f60193r
            int r0 = r13.mo36250z(r3, r4, r0)
            r3 = -5
            if (r0 != r3) goto L_0x03c4
            x6.j r0 = r13.f60194s
            com.google.android.exoplayer2.Format r0 = r0.f66173a
            r13.mo32370F(r0)
            goto L_0x03d5
        L_0x03c4:
            r3 = -4
            if (r0 != r3) goto L_0x03d5
            z6.e r0 = r13.f60193r
            boolean r0 = r0.mo36910g(r1)
            p333e8.C20528a.m22240d(r0)
            r13.f60185T = r2
            r21.mo33307I()
        L_0x03d5:
            z6.d r0 = r13.f60189X
            monitor-enter(r0)
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p353k7.C21304b.mo33311g(long, long):void");
    }

    public boolean isReady() {
        if (this.f60197v != null && !this.f60187V) {
            if ((this.f66068j ? this.f66069n : this.f66066h.isReady()) || this.f60178L >= 0 || (this.f60176J != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f60176J)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final int mo33312l() {
        return 8;
    }

    /* renamed from: t */
    public void mo32386t() {
        this.f60197v = null;
        mo32374K();
    }

    /* renamed from: v */
    public void mo32388v(long j, boolean z) {
        this.f60185T = false;
        this.f60186U = false;
        if (this.f60198w != null) {
            this.f60176J = -9223372036854775807L;
            this.f60177K = -1;
            this.f60178L = -1;
            this.f60188W = true;
            this.f60187V = false;
            this.f60179M = false;
            ((ArrayList) this.f60195t).clear();
            this.f60172F = false;
            this.f60173G = false;
            if (this.f60167A || (this.f60169C && this.f60184S)) {
                mo32374K();
                mo33306D();
            } else if (this.f60182Q != 0) {
                mo32374K();
                mo33306D();
            } else {
                this.f60198w.flush();
                this.f60183R = false;
            }
            if (this.f60180N && this.f60197v != null) {
                this.f60181P = 1;
            }
        }
    }

    /* renamed from: k7.b$a */
    public static class C21305a extends Exception {

        /* renamed from: d */
        public final String f60202d;

        /* renamed from: e */
        public final boolean f60203e;

        /* renamed from: f */
        public final String f60204f;

        /* renamed from: g */
        public final String f60205g;

        public C21305a(Format format, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + format, th);
            this.f60202d = format.f45777i;
            this.f60203e = z;
            this.f60204f = null;
            String str = i < 0 ? "neg_" : "";
            this.f60205g = "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i);
        }

        public C21305a(Format format, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + format, th);
            this.f60202d = format.f45777i;
            this.f60203e = z;
            this.f60204f = str;
            String str2 = null;
            if (C20551y.f57835a >= 21 && (th instanceof MediaCodec.CodecException)) {
                str2 = ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            this.f60205g = str2;
        }
    }
}
