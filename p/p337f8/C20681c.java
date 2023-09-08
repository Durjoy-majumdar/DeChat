package p337f8;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.DummySurface;
import com.tencent.tavkit.component.TAVPlayer;
import lm0.C88592k;
import p289a7.C16433b;
import p289a7.C16435d;
import p333e8.C20528a;
import p333e8.C20550v;
import p333e8.C20551y;
import p337f8.C20694l;
import p353k7.C21303a;
import p353k7.C21304b;
import p353k7.C21306c;
import p353k7.C21308d;
import p404z6.C23455e;
import p404z6.C91618d;

/* renamed from: f8.c */
public class C20681c extends C21304b {

    /* renamed from: t1 */
    public static final int[] f58434t1 = {1920, 1600, 1440, 1280, 960, C88592k.CTRL_INDEX, 640, TAVPlayer.VIDEO_PLAYER_WIDTH, 480};

    /* renamed from: Q0 */
    public final int f58435Q0;

    /* renamed from: R0 */
    public final boolean f58436R0;

    /* renamed from: S0 */
    public final long[] f58437S0;

    /* renamed from: T0 */
    public Format[] f58438T0;

    /* renamed from: U0 */
    public C20682b f58439U0;

    /* renamed from: V0 */
    public boolean f58440V0;

    /* renamed from: W0 */
    public Surface f58441W0;

    /* renamed from: X0 */
    public Surface f58442X0;

    /* renamed from: Y0 */
    public int f58443Y0;

    /* renamed from: Z */
    public final Context f58444Z;

    /* renamed from: Z0 */
    public boolean f58445Z0;

    /* renamed from: a1 */
    public long f58446a1;

    /* renamed from: b1 */
    public long f58447b1;

    /* renamed from: c1 */
    public int f58448c1;

    /* renamed from: d1 */
    public int f58449d1;

    /* renamed from: e1 */
    public int f58450e1;

    /* renamed from: f1 */
    public float f58451f1;

    /* renamed from: g1 */
    public int f58452g1;

    /* renamed from: h1 */
    public int f58453h1;

    /* renamed from: i1 */
    public int f58454i1;

    /* renamed from: j1 */
    public float f58455j1;

    /* renamed from: k1 */
    public int f58456k1;

    /* renamed from: l1 */
    public int f58457l1;

    /* renamed from: m1 */
    public int f58458m1;

    /* renamed from: n1 */
    public float f58459n1;

    /* renamed from: o1 */
    public boolean f58460o1;

    /* renamed from: p0 */
    public final C20685d f58461p0;

    /* renamed from: p1 */
    public int f58462p1;

    /* renamed from: q1 */
    public C20684c f58463q1;

    /* renamed from: r1 */
    public long f58464r1;

    /* renamed from: s1 */
    public int f58465s1;

    /* renamed from: x0 */
    public final C20694l.C20695a f58466x0;

    /* renamed from: y0 */
    public final long f58467y0;

    /* renamed from: f8.c$b */
    public static final class C20682b {

        /* renamed from: a */
        public final int f58468a;

        /* renamed from: b */
        public final int f58469b;

        /* renamed from: c */
        public final int f58470c;

        public C20682b(int i, int i2, int i3) {
            this.f58468a = i;
            this.f58469b = i2;
            this.f58470c = i3;
        }
    }

    /* renamed from: f8.c$c */
    public final class C20684c implements MediaCodec.OnFrameRenderedListener {
        public C20684c(MediaCodec mediaCodec, C20683a aVar) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            C20681c cVar = C20681c.this;
            if (this == cVar.f58463q1) {
                cVar.mo32379T();
            }
        }
    }

    public C20681c(Context context, C21306c cVar, long j, C16433b<C16435d> bVar, boolean z, Handler handler, C20694l lVar, int i) {
        super(2, cVar, bVar, z);
        this.f58467y0 = j;
        this.f58435Q0 = i;
        this.f58444Z = context.getApplicationContext();
        this.f58461p0 = new C20685d(context);
        this.f58466x0 = new C20694l.C20695a(handler, lVar);
        this.f58436R0 = C20551y.f57835a <= 22 && "foster".equals(C20551y.f57836b) && "NVIDIA".equals(C20551y.f57837c);
        this.f58437S0 = new long[10];
        this.f58464r1 = -9223372036854775807L;
        this.f58446a1 = -9223372036854775807L;
        this.f58452g1 = -1;
        this.f58453h1 = -1;
        this.f58455j1 = -1.0f;
        this.f58451f1 = -1.0f;
        this.f58443Y0 = 1;
        this.f58456k1 = -1;
        this.f58457l1 = -1;
        this.f58459n1 = -1.0f;
        this.f58458m1 = -1;
    }

    /* renamed from: O */
    public static boolean m22615O(boolean z, Format format, Format format2) {
        if (!format.f45777i.equals(format2.f45777i)) {
            return false;
        }
        int i = format.f45784s;
        if (i == -1) {
            i = 0;
        }
        int i2 = format2.f45784s;
        if (i2 == -1) {
            i2 = 0;
        }
        if (i == i2) {
            return z || (format.f45781p == format2.f45781p && format.f45782q == format2.f45782q);
        }
        return false;
    }

    /* renamed from: Q */
    public static int m22616Q(Format format) {
        if (format.f45778j == -1) {
            return m22617R(format.f45777i, format.f45781p, format.f45782q);
        }
        int size = format.f45779n.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += format.f45779n.get(i2).length;
        }
        return format.f45778j + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m22617R(java.lang.String r5, int r6, int r7) {
        /*
            r0 = -1
            if (r6 == r0) goto L_0x0089
            if (r7 != r0) goto L_0x0007
            goto L_0x0089
        L_0x0007:
            r5.getClass()
            int r1 = r5.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1664118616: goto L_0x0052;
                case -1662541442: goto L_0x0046;
                case 1187890754: goto L_0x003a;
                case 1331836730: goto L_0x002e;
                case 1599127256: goto L_0x0022;
                case 1599127257: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r5 = -1
            goto L_0x005d
        L_0x0016:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0020
            goto L_0x0014
        L_0x0020:
            r5 = 5
            goto L_0x005d
        L_0x0022:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x002c
            goto L_0x0014
        L_0x002c:
            r5 = 4
            goto L_0x005d
        L_0x002e:
            java.lang.String r1 = "video/avc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0038
            goto L_0x0014
        L_0x0038:
            r5 = 3
            goto L_0x005d
        L_0x003a:
            java.lang.String r1 = "video/mp4v-es"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0044
            goto L_0x0014
        L_0x0044:
            r5 = 2
            goto L_0x005d
        L_0x0046:
            java.lang.String r1 = "video/hevc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0050
            goto L_0x0014
        L_0x0050:
            r5 = 1
            goto L_0x005d
        L_0x0052:
            java.lang.String r1 = "video/3gpp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x005c
            goto L_0x0014
        L_0x005c:
            r5 = 0
        L_0x005d:
            switch(r5) {
                case 0: goto L_0x0080;
                case 1: goto L_0x007d;
                case 2: goto L_0x0080;
                case 3: goto L_0x0061;
                case 4: goto L_0x0080;
                case 5: goto L_0x007d;
                default: goto L_0x0060;
            }
        L_0x0060:
            return r0
        L_0x0061:
            java.lang.String r5 = p333e8.C20551y.f57838d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x006c
            return r0
        L_0x006c:
            int r6 = r6 + 16
            int r6 = r6 + r0
            int r6 = r6 / 16
            int r7 = r7 + 16
            int r7 = r7 + r0
            int r7 = r7 / 16
            int r6 = r6 * r7
            int r6 = r6 * 16
            int r6 = r6 * 16
            goto L_0x0082
        L_0x007d:
            int r6 = r6 * r7
            goto L_0x0083
        L_0x0080:
            int r6 = r6 * r7
        L_0x0082:
            r2 = 2
        L_0x0083:
            int r6 = r6 * 3
            int r2 = r2 * 2
            int r6 = r6 / r2
            return r6
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p337f8.C20681c.m22617R(java.lang.String, int, int):int");
    }

    /* renamed from: A */
    public boolean mo32367A(MediaCodec mediaCodec, boolean z, Format format, Format format2) {
        if (m22615O(z, format, format2)) {
            int i = format2.f45781p;
            C20682b bVar = this.f58439U0;
            return i <= bVar.f58468a && format2.f45782q <= bVar.f58469b && m22616Q(format2) <= this.f58439U0.f58470c;
        }
    }

    /* renamed from: B */
    public void mo32368B(C21303a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        C20682b bVar;
        int i;
        Point point;
        float f;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        C21303a aVar2 = aVar;
        MediaCodec mediaCodec2 = mediaCodec;
        Format format2 = format;
        Format[] formatArr = this.f58438T0;
        int i2 = format2.f45781p;
        int i3 = format2.f45782q;
        int Q = m22616Q(format);
        if (formatArr.length == 1) {
            bVar = new C20682b(i2, i3, Q);
        } else {
            boolean z = false;
            for (Format format3 : formatArr) {
                if (m22615O(aVar2.f60161b, format2, format3)) {
                    int i4 = format3.f45781p;
                    z |= i4 == -1 || format3.f45782q == -1;
                    i2 = Math.max(i2, i4);
                    i3 = Math.max(i3, format3.f45782q);
                    Q = Math.max(Q, m22616Q(format3));
                }
            }
            if (z) {
                int i5 = format2.f45782q;
                int i6 = format2.f45781p;
                boolean z2 = i5 > i6;
                int i7 = z2 ? i5 : i6;
                if (z2) {
                    i5 = i6;
                }
                float f2 = ((float) i5) / ((float) i7);
                int[] iArr = f58434t1;
                int i8 = 0;
                while (true) {
                    if (i8 >= 9) {
                        break;
                    }
                    int i9 = iArr[i8];
                    int i15 = (int) (((float) i9) * f2);
                    if (i9 <= i7 || i15 <= i5) {
                        break;
                    }
                    int i16 = i5;
                    if (C20551y.f57835a >= 21) {
                        int i17 = z2 ? i15 : i9;
                        if (!z2) {
                            i9 = i15;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = aVar2.f60165f;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f = f2;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f = f2;
                            point2 = new Point((((i17 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i9 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        i = Q;
                        Point point3 = point2;
                        if (aVar2.mo33304a(point2.x, point2.y, (double) format2.f45783r)) {
                            point = point3;
                            break;
                        }
                    } else {
                        i = Q;
                        f = f2;
                        int i18 = (((i9 + 16) - 1) / 16) * 16;
                        int i19 = (((i15 + 16) - 1) / 16) * 16;
                        if (i18 * i19 <= C21308d.m23880e()) {
                            int i25 = z2 ? i19 : i18;
                            if (!z2) {
                                i18 = i19;
                            }
                            point = new Point(i25, i18);
                        }
                    }
                    i8++;
                    i5 = i16;
                    f2 = f;
                    Q = i;
                }
                i = Q;
                point = null;
                if (point != null) {
                    i2 = Math.max(i2, point.x);
                    i3 = Math.max(i3, point.y);
                    Q = Math.max(i, m22617R(format2.f45777i, i2, i3));
                } else {
                    Q = i;
                }
            }
            bVar = new C20682b(i2, i3, Q);
        }
        this.f58439U0 = bVar;
        boolean z3 = this.f58436R0;
        int i26 = this.f58462p1;
        MediaFormat o = format.mo18398o();
        o.setInteger("max-width", bVar.f58468a);
        o.setInteger("max-height", bVar.f58469b);
        int i27 = bVar.f58470c;
        if (i27 != -1) {
            o.setInteger("max-input-size", i27);
        }
        if (z3) {
            o.setInteger("auto-frc", 0);
        }
        if (i26 != 0) {
            o.setFeatureEnabled("tunneled-playback", true);
            o.setInteger("audio-session-id", i26);
        }
        if (this.f58441W0 == null) {
            C20528a.m22240d(mo32383X(aVar2.f60163d));
            if (this.f58442X0 == null) {
                this.f58442X0 = DummySurface.m139413b(this.f58444Z, aVar2.f60163d);
            }
            this.f58441W0 = this.f58442X0;
        }
        mediaCodec2.configure(o, this.f58441W0, mediaCrypto, 0);
        if (C20551y.f57835a >= 23 && this.f58460o1) {
            this.f58463q1 = new C20684c(mediaCodec2, (C20683a) null);
        }
    }

    /* renamed from: E */
    public void mo32369E(String str, long j, long j2) {
        C20694l.C20695a aVar = this.f58466x0;
        if (aVar.f58509b != null) {
            aVar.f58508a.post(new C20688f(aVar, str, j, j2));
        }
        String str2 = C20551y.f57836b;
        this.f58440V0 = (("deb".equals(str2) || "flo".equals(str2)) && "OMX.qcom.video.decoder.avc".equals(str)) || ("tcl_eu".equals(str2) && "OMX.MTK.VIDEO.DECODER.AVC".equals(str));
    }

    /* renamed from: F */
    public void mo32370F(Format format) {
        super.mo32370F(format);
        C20694l.C20695a aVar = this.f58466x0;
        if (aVar.f58509b != null) {
            aVar.f58508a.post(new C20689g(aVar, format));
        }
        float f = format.f45785t;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f58451f1 = f;
        int i = format.f45784s;
        if (i == -1) {
            i = 0;
        }
        this.f58450e1 = i;
    }

    /* renamed from: G */
    public void mo32371G(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.f58452g1 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f58453h1 = integer;
        float f = this.f58451f1;
        this.f58455j1 = f;
        if (C20551y.f57835a >= 21) {
            int i = this.f58450e1;
            if (i == 90 || i == 270) {
                int i2 = this.f58452g1;
                this.f58452g1 = integer;
                this.f58453h1 = i2;
                this.f58455j1 = 1.0f / f;
            }
        } else {
            this.f58454i1 = this.f58450e1;
        }
        mediaCodec.setVideoScalingMode(this.f58443Y0);
    }

    /* renamed from: H */
    public void mo32372H(C23455e eVar) {
        if (C20551y.f57835a < 23 && this.f58460o1) {
            mo32379T();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019a  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo32373J(long r29, long r31, android.media.MediaCodec r33, java.nio.ByteBuffer r34, int r35, int r36, long r37, boolean r39) {
        /*
            r28 = this;
            r7 = r28
            r1 = r33
            r2 = r35
            r3 = r37
        L_0x0008:
            int r0 = r7.f58465s1
            r5 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0020
            long[] r6 = r7.f58437S0
            r9 = r6[r5]
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0020
            r7.f58464r1 = r9
            int r0 = r0 + -1
            r7.f58465s1 = r0
            java.lang.System.arraycopy(r6, r8, r6, r5, r0)
            goto L_0x0008
        L_0x0020:
            long r9 = r7.f58464r1
            long r9 = r3 - r9
            java.lang.String r0 = "skipVideoBuffer"
            if (r39 == 0) goto L_0x003a
            p333e8.C20550v.m22309a(r0)
            r1.releaseOutputBuffer(r2, r5)
            p333e8.C20550v.m22310b()
            z6.d r0 = r7.f60189X
            int r1 = r0.f262472e
            int r1 = r1 + r8
            r0.f262472e = r1
            return r8
        L_0x003a:
            long r11 = r3 - r29
            android.view.Surface r6 = r7.f58441W0
            android.view.Surface r13 = r7.f58442X0
            r14 = -30000(0xffffffffffff8ad0, double:NaN)
            if (r6 != r13) goto L_0x005f
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x004a
            r3 = 1
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 == 0) goto L_0x005e
            p333e8.C20550v.m22309a(r0)
            r1.releaseOutputBuffer(r2, r5)
            p333e8.C20550v.m22310b()
            z6.d r0 = r7.f60189X
            int r1 = r0.f262472e
            int r1 = r1 + r8
            r0.f262472e = r1
            return r8
        L_0x005e:
            return r5
        L_0x005f:
            boolean r0 = r7.f58445Z0
            r6 = 21
            if (r0 != 0) goto L_0x007c
            int r0 = p333e8.C20551y.f57835a
            if (r0 < r6) goto L_0x0078
            long r5 = java.lang.System.nanoTime()
            r0 = r28
            r1 = r33
            r2 = r35
            r3 = r9
            r0.mo32382W(r1, r2, r3, r5)
            goto L_0x007b
        L_0x0078:
            r7.mo32381V(r1, r2, r9)
        L_0x007b:
            return r8
        L_0x007c:
            int r0 = r7.f66065g
            r13 = 2
            if (r0 == r13) goto L_0x0082
            return r5
        L_0x0082:
            long r16 = android.os.SystemClock.elapsedRealtime()
            r18 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 * r18
            long r16 = r16 - r31
            long r11 = r11 - r16
            long r16 = java.lang.System.nanoTime()
            long r11 = r11 * r18
            long r11 = r11 + r16
            f8.d r0 = r7.f58461p0
            long r6 = r3 * r18
            boolean r13 = r0.f58479h
            if (r13 == 0) goto L_0x010c
            long r14 = r0.f58476e
            int r13 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r13 == 0) goto L_0x00b0
            long r13 = r0.f58482k
            r20 = 1
            long r13 = r13 + r20
            r0.f58482k = r13
            long r13 = r0.f58478g
            r0.f58477f = r13
        L_0x00b0:
            long r13 = r0.f58482k
            r20 = 6
            r22 = 20000000(0x1312d00, double:9.881313E-317)
            int r15 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r15 < 0) goto L_0x00ec
            r20 = r9
            long r8 = r0.f58481j
            long r24 = r6 - r8
            long r24 = r24 / r13
            long r13 = r0.f58477f
            long r13 = r13 + r24
            long r8 = r13 - r8
            r30 = r6
            long r5 = r0.f58480i
            long r5 = r11 - r5
            long r5 = r5 - r8
            long r5 = java.lang.Math.abs(r5)
            int r7 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r7 <= 0) goto L_0x00da
            r5 = 1
            goto L_0x00db
        L_0x00da:
            r5 = 0
        L_0x00db:
            if (r5 == 0) goto L_0x00e3
            r5 = 0
            r0.f58479h = r5
            r7 = r30
            goto L_0x010f
        L_0x00e3:
            long r5 = r0.f58480i
            long r5 = r5 + r13
            long r7 = r0.f58481j
            long r5 = r5 - r7
            r7 = r30
            goto L_0x0111
        L_0x00ec:
            r30 = r6
            r20 = r9
            long r5 = r0.f58481j
            r7 = r30
            long r5 = r7 - r5
            long r9 = r0.f58480i
            long r9 = r11 - r9
            long r9 = r9 - r5
            long r5 = java.lang.Math.abs(r9)
            int r9 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r9 <= 0) goto L_0x0105
            r5 = 1
            goto L_0x0106
        L_0x0105:
            r5 = 0
        L_0x0106:
            if (r5 == 0) goto L_0x010f
            r5 = 0
            r0.f58479h = r5
            goto L_0x010f
        L_0x010c:
            r7 = r6
            r20 = r9
        L_0x010f:
            r13 = r7
            r5 = r11
        L_0x0111:
            boolean r9 = r0.f58479h
            r1 = 0
            if (r9 != 0) goto L_0x0120
            r0.f58481j = r7
            r0.f58480i = r11
            r0.f58482k = r1
            r7 = 1
            r0.f58479h = r7
        L_0x0120:
            r0.f58476e = r3
            r0.f58478g = r13
            f8.d$a r3 = r0.f58472a
            if (r3 == 0) goto L_0x0155
            long r3 = r3.f58484d
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x012f
            goto L_0x0155
        L_0x012f:
            f8.d$a r1 = r0.f58472a
            long r1 = r1.f58484d
            long r3 = r0.f58474c
            long r7 = r5 - r1
            long r7 = r7 / r3
            long r7 = r7 * r3
            long r1 = r1 + r7
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 > 0) goto L_0x0142
            long r3 = r1 - r3
            goto L_0x0148
        L_0x0142:
            long r3 = r3 + r1
            r26 = r1
            r1 = r3
            r3 = r26
        L_0x0148:
            long r7 = r1 - r5
            long r5 = r5 - r3
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0150
            goto L_0x0151
        L_0x0150:
            r1 = r3
        L_0x0151:
            long r3 = r0.f58475d
            long r1 = r1 - r3
            r5 = r1
        L_0x0155:
            long r0 = r5 - r16
            long r0 = r0 / r18
            r2 = -30000(0xffffffffffff8ad0, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0161
            r2 = 1
            goto L_0x0162
        L_0x0161:
            r2 = 0
        L_0x0162:
            if (r2 == 0) goto L_0x019a
            java.lang.String r0 = "dropVideoBuffer"
            p333e8.C20550v.m22309a(r0)
            r2 = r33
            r3 = r35
            r0 = 0
            r2.releaseOutputBuffer(r3, r0)
            p333e8.C20550v.m22310b()
            r7 = r28
            z6.d r0 = r7.f60189X
            int r1 = r0.f262473f
            r2 = 1
            int r1 = r1 + r2
            r0.f262473f = r1
            int r1 = r7.f58448c1
            int r1 = r1 + r2
            r7.f58448c1 = r1
            int r1 = r7.f58449d1
            int r1 = r1 + r2
            r7.f58449d1 = r1
            int r3 = r0.f262474g
            int r1 = java.lang.Math.max(r1, r3)
            r0.f262474g = r1
            int r0 = r7.f58448c1
            int r1 = r7.f58435Q0
            if (r0 != r1) goto L_0x0199
            r28.mo32378S()
        L_0x0199:
            return r2
        L_0x019a:
            r7 = r28
            r2 = r33
            r3 = r35
            int r4 = p333e8.C20551y.f57835a
            r8 = 21
            if (r4 < r8) goto L_0x01ba
            r8 = 50000(0xc350, double:2.47033E-319)
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x01dd
            r0 = r28
            r1 = r33
            r2 = r35
            r3 = r20
            r0.mo32382W(r1, r2, r3, r5)
        L_0x01b8:
            r0 = 1
            goto L_0x01dc
        L_0x01ba:
            r4 = 30000(0x7530, double:1.4822E-319)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x01dd
            r4 = 11000(0x2af8, double:5.4347E-320)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x01d6
            r4 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 - r4
            long r0 = r0 / r18
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x01cf }
            goto L_0x01d6
        L_0x01cf:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x01d6:
            r0 = r20
            r7.mo32381V(r2, r3, r0)
            goto L_0x01b8
        L_0x01dc:
            return r0
        L_0x01dd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p337f8.C20681c.mo32373J(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    /* renamed from: K */
    public void mo32374K() {
        try {
            super.mo32374K();
            Surface surface = this.f58442X0;
            if (surface != null) {
                if (this.f58441W0 == surface) {
                    this.f58441W0 = null;
                }
                surface.release();
                this.f58442X0 = null;
            }
        } catch (Throwable th) {
            if (this.f58442X0 != null) {
                Surface surface2 = this.f58441W0;
                Surface surface3 = this.f58442X0;
                if (surface2 == surface3) {
                    this.f58441W0 = null;
                }
                surface3.release();
                this.f58442X0 = null;
            }
            throw th;
        }
    }

    /* renamed from: M */
    public boolean mo32375M(C21303a aVar) {
        return this.f58441W0 != null || mo32383X(aVar.f60163d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
        if ("2".equals(r8) != false) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a5  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo32376N(p353k7.C21306c r13, com.google.android.exoplayer2.Format r14) {
        /*
            r12 = this;
            java.lang.String r0 = r14.f45777i
            boolean r1 = p333e8.C20536j.m22253e(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.exoplayer2.drm.DrmInitData r1 = r14.f45780o
            if (r1 == 0) goto L_0x001e
            r3 = 0
            r4 = 0
        L_0x0010:
            int r5 = r1.f45794f
            if (r3 >= r5) goto L_0x001f
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r5 = r1.f45792d
            r5 = r5[r3]
            boolean r5 = r5.f45800i
            r4 = r4 | r5
            int r3 = r3 + 1
            goto L_0x0010
        L_0x001e:
            r4 = 0
        L_0x001f:
            k7.a r13 = r13.mo33313a(r0, r4)
            r0 = 1
            if (r13 != 0) goto L_0x0027
            return r0
        L_0x0027:
            java.lang.String r1 = r14.f45774f
            r3 = 16
            r4 = 4
            r5 = 3
            if (r1 == 0) goto L_0x0176
            java.lang.String r6 = r13.f60164e
            if (r6 != 0) goto L_0x0035
            goto L_0x0176
        L_0x0035:
            java.lang.String r6 = p333e8.C20536j.m22249a(r1)
            if (r6 != 0) goto L_0x003d
            goto L_0x0176
        L_0x003d:
            java.lang.String r7 = r13.f60164e
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x0049
            int r1 = p333e8.C20551y.f57835a
            goto L_0x0174
        L_0x0049:
            k7.a r6 = p353k7.C21308d.f60207a
            r6 = 0
            java.lang.String r7 = "\\."
            java.lang.String[] r1 = r1.split(r7)
            r7 = r1[r2]
            r7.getClass()
            r8 = -1
            int r9 = r7.hashCode()
            r10 = 2
            switch(r9) {
                case 3006243: goto L_0x0082;
                case 3006244: goto L_0x0077;
                case 3199032: goto L_0x006c;
                case 3214780: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x008c
        L_0x0061:
            java.lang.String r9 = "hvc1"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x006a
            goto L_0x008c
        L_0x006a:
            r8 = 3
            goto L_0x008c
        L_0x006c:
            java.lang.String r9 = "hev1"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0075
            goto L_0x008c
        L_0x0075:
            r8 = 2
            goto L_0x008c
        L_0x0077:
            java.lang.String r9 = "avc2"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0080
            goto L_0x008c
        L_0x0080:
            r8 = 1
            goto L_0x008c
        L_0x0082:
            java.lang.String r9 = "avc1"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r8 = 0
        L_0x008c:
            switch(r8) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x00d9;
                case 2: goto L_0x0091;
                case 3: goto L_0x0091;
                default: goto L_0x008f;
            }
        L_0x008f:
            goto L_0x0143
        L_0x0091:
            int r7 = r1.length
            if (r7 >= r4) goto L_0x0096
            goto L_0x0143
        L_0x0096:
            java.util.regex.Pattern r7 = p353k7.C21308d.f60208b
            r8 = r1[r0]
            java.util.regex.Matcher r7 = r7.matcher(r8)
            boolean r8 = r7.matches()
            if (r8 != 0) goto L_0x00a6
            goto L_0x0143
        L_0x00a6:
            java.lang.String r8 = r7.group(r0)
            java.lang.String r9 = "1"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x00b4
            r10 = 1
            goto L_0x00bc
        L_0x00b4:
            java.lang.String r9 = "2"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0143
        L_0x00bc:
            java.util.Map<java.lang.String, java.lang.Integer> r8 = p353k7.C21308d.f60212f
            r1 = r1[r5]
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r1 = r8.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x00cf
            r7.group(r0)
            goto L_0x0143
        L_0x00cf:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r6.<init>(r7, r1)
            goto L_0x0143
        L_0x00d9:
            int r7 = r1.length
            if (r7 >= r10) goto L_0x00dd
            goto L_0x0143
        L_0x00dd:
            r7 = r1[r0]     // Catch:{ NumberFormatException -> 0x0142 }
            int r7 = r7.length()     // Catch:{ NumberFormatException -> 0x0142 }
            r8 = 6
            if (r7 != r8) goto L_0x0103
            r7 = r1[r0]     // Catch:{ NumberFormatException -> 0x0142 }
            java.lang.String r7 = r7.substring(r2, r10)     // Catch:{ NumberFormatException -> 0x0142 }
            int r7 = java.lang.Integer.parseInt(r7, r3)     // Catch:{ NumberFormatException -> 0x0142 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0142 }
            r1 = r1[r0]     // Catch:{ NumberFormatException -> 0x0142 }
            java.lang.String r1 = r1.substring(r4)     // Catch:{ NumberFormatException -> 0x0142 }
            int r1 = java.lang.Integer.parseInt(r1, r3)     // Catch:{ NumberFormatException -> 0x0142 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0142 }
            goto L_0x011a
        L_0x0103:
            int r7 = r1.length     // Catch:{ NumberFormatException -> 0x0142 }
            if (r7 < r5) goto L_0x0143
            r7 = r1[r0]     // Catch:{ NumberFormatException -> 0x0142 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0142 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0142 }
            r1 = r1[r10]     // Catch:{ NumberFormatException -> 0x0142 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0142 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0142 }
        L_0x011a:
            android.util.SparseIntArray r8 = p353k7.C21308d.f60210d
            int r7 = r7.intValue()
            int r7 = r8.get(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            if (r7 != 0) goto L_0x012b
            goto L_0x0143
        L_0x012b:
            android.util.SparseIntArray r8 = p353k7.C21308d.f60211e
            int r1 = r1.intValue()
            int r1 = r8.get(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 != 0) goto L_0x013c
            goto L_0x0143
        L_0x013c:
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r7, r1)
            goto L_0x0143
        L_0x0142:
        L_0x0143:
            if (r6 != 0) goto L_0x0146
            goto L_0x0176
        L_0x0146:
            android.media.MediaCodecInfo$CodecCapabilities r1 = r13.f60165f
            if (r1 == 0) goto L_0x014e
            android.media.MediaCodecInfo$CodecProfileLevel[] r1 = r1.profileLevels
            if (r1 != 0) goto L_0x0150
        L_0x014e:
            android.media.MediaCodecInfo$CodecProfileLevel[] r1 = new android.media.MediaCodecInfo.CodecProfileLevel[r2]
        L_0x0150:
            int r7 = r1.length
            r8 = 0
        L_0x0152:
            if (r8 >= r7) goto L_0x0172
            r9 = r1[r8]
            int r10 = r9.profile
            java.lang.Object r11 = r6.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x016f
            int r9 = r9.level
            java.lang.Object r10 = r6.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 < r10) goto L_0x016f
            goto L_0x0176
        L_0x016f:
            int r8 = r8 + 1
            goto L_0x0152
        L_0x0172:
            int r1 = p333e8.C20551y.f57835a
        L_0x0174:
            r1 = 0
            goto L_0x0177
        L_0x0176:
            r1 = 1
        L_0x0177:
            if (r1 == 0) goto L_0x019a
            int r6 = r14.f45781p
            if (r6 <= 0) goto L_0x019a
            int r7 = r14.f45782q
            if (r7 <= 0) goto L_0x019a
            int r1 = p333e8.C20551y.f57835a
            r8 = 21
            if (r1 < r8) goto L_0x018f
            float r14 = r14.f45783r
            double r0 = (double) r14
            boolean r1 = r13.mo33304a(r6, r7, r0)
            goto L_0x019a
        L_0x018f:
            int r6 = r6 * r7
            int r14 = p353k7.C21308d.m23880e()
            if (r6 > r14) goto L_0x0198
            goto L_0x0199
        L_0x0198:
            r0 = 0
        L_0x0199:
            r1 = r0
        L_0x019a:
            boolean r14 = r13.f60161b
            if (r14 == 0) goto L_0x019f
            goto L_0x01a1
        L_0x019f:
            r3 = 8
        L_0x01a1:
            boolean r13 = r13.f60162c
            if (r13 == 0) goto L_0x01a7
            r2 = 32
        L_0x01a7:
            if (r1 == 0) goto L_0x01aa
            goto L_0x01ab
        L_0x01aa:
            r4 = 3
        L_0x01ab:
            r13 = r3 | r2
            r13 = r13 | r4
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p337f8.C20681c.mo32376N(k7.c, com.google.android.exoplayer2.Format):int");
    }

    /* renamed from: P */
    public final void mo32377P() {
        MediaCodec mediaCodec;
        this.f58445Z0 = false;
        if (C20551y.f57835a >= 23 && this.f58460o1 && (mediaCodec = this.f60198w) != null) {
            this.f58463q1 = new C20684c(mediaCodec, (C20683a) null);
        }
    }

    /* renamed from: S */
    public final void mo32378S() {
        if (this.f58448c1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f58447b1;
            C20694l.C20695a aVar = this.f58466x0;
            int i = this.f58448c1;
            if (aVar.f58509b != null) {
                aVar.f58508a.post(new C20690h(aVar, i, j));
            }
            this.f58448c1 = 0;
            this.f58447b1 = elapsedRealtime;
        }
    }

    /* renamed from: T */
    public void mo32379T() {
        if (!this.f58445Z0) {
            this.f58445Z0 = true;
            C20694l.C20695a aVar = this.f58466x0;
            Surface surface = this.f58441W0;
            if (aVar.f58509b != null) {
                aVar.f58508a.post(new C20692j(aVar, surface));
            }
        }
    }

    /* renamed from: U */
    public final void mo32380U() {
        int i = this.f58452g1;
        if (i != -1 || this.f58453h1 != -1) {
            if (this.f58456k1 != i || this.f58457l1 != this.f58453h1 || this.f58458m1 != this.f58454i1 || this.f58459n1 != this.f58455j1) {
                C20694l.C20695a aVar = this.f58466x0;
                int i2 = this.f58453h1;
                int i3 = this.f58454i1;
                float f = this.f58455j1;
                if (aVar.f58509b != null) {
                    aVar.f58508a.post(new C20691i(aVar, i, i2, i3, f));
                }
                this.f58456k1 = this.f58452g1;
                this.f58457l1 = this.f58453h1;
                this.f58458m1 = this.f58454i1;
                this.f58459n1 = this.f58455j1;
            }
        }
    }

    /* renamed from: V */
    public void mo32381V(MediaCodec mediaCodec, int i, long j) {
        mo32380U();
        C20550v.m22309a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C20550v.m22310b();
        this.f60189X.f262471d++;
        this.f58449d1 = 0;
        mo32379T();
    }

    /* renamed from: W */
    public void mo32382W(MediaCodec mediaCodec, int i, long j, long j2) {
        mo32380U();
        C20550v.m22309a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        C20550v.m22310b();
        this.f60189X.f262471d++;
        this.f58449d1 = 0;
        mo32379T();
    }

    /* renamed from: X */
    public final boolean mo32383X(boolean z) {
        return C20551y.f57835a >= 23 && !this.f58460o1 && (!z || DummySurface.m139412a(this.f58444Z));
    }

    /* renamed from: e */
    public void mo32384e(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f58442X0;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    C21303a aVar = this.f60199x;
                    if (aVar != null && mo32383X(aVar.f60163d)) {
                        surface = DummySurface.m139413b(this.f58444Z, aVar.f60163d);
                        this.f58442X0 = surface;
                    }
                }
            }
            if (this.f58441W0 != surface) {
                this.f58441W0 = surface;
                int i2 = this.f66065g;
                if (i2 == 1 || i2 == 2) {
                    MediaCodec mediaCodec = this.f60198w;
                    if (C20551y.f57835a < 23 || mediaCodec == null || surface == null || this.f58440V0) {
                        mo32374K();
                        mo33306D();
                    } else {
                        mediaCodec.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f58442X0) {
                    this.f58456k1 = -1;
                    this.f58457l1 = -1;
                    this.f58459n1 = -1.0f;
                    this.f58458m1 = -1;
                    mo32377P();
                    return;
                }
                int i3 = this.f58456k1;
                if (!(i3 == -1 && this.f58457l1 == -1)) {
                    C20694l.C20695a aVar2 = this.f58466x0;
                    int i4 = this.f58457l1;
                    int i5 = this.f58458m1;
                    float f = this.f58459n1;
                    if (aVar2.f58509b != null) {
                        aVar2.f58508a.post(new C20691i(aVar2, i3, i4, i5, f));
                    }
                }
                mo32377P();
                if (i2 == 2) {
                    this.f58446a1 = this.f58467y0 > 0 ? SystemClock.elapsedRealtime() + this.f58467y0 : -9223372036854775807L;
                }
            } else if (surface != null && surface != this.f58442X0) {
                int i6 = this.f58456k1;
                if (!(i6 == -1 && this.f58457l1 == -1)) {
                    C20694l.C20695a aVar3 = this.f58466x0;
                    int i7 = this.f58457l1;
                    int i8 = this.f58458m1;
                    float f2 = this.f58459n1;
                    if (aVar3.f58509b != null) {
                        aVar3.f58508a.post(new C20691i(aVar3, i6, i7, i8, f2));
                    }
                }
                if (this.f58445Z0) {
                    C20694l.C20695a aVar4 = this.f58466x0;
                    Surface surface3 = this.f58441W0;
                    if (aVar4.f58509b != null) {
                        aVar4.f58508a.post(new C20692j(aVar4, surface3));
                    }
                }
            }
        } else if (i == 4) {
            int intValue = ((Integer) obj).intValue();
            this.f58443Y0 = intValue;
            MediaCodec mediaCodec2 = this.f60198w;
            if (mediaCodec2 != null) {
                mediaCodec2.setVideoScalingMode(intValue);
            }
        }
    }

    public boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.f58445Z0 || (((surface = this.f58442X0) != null && this.f58441W0 == surface) || this.f60198w == null || this.f58460o1))) {
            this.f58446a1 = -9223372036854775807L;
            return true;
        } else if (this.f58446a1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f58446a1) {
                return true;
            }
            this.f58446a1 = -9223372036854775807L;
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: t */
    public void mo32386t() {
        this.f58452g1 = -1;
        this.f58453h1 = -1;
        this.f58455j1 = -1.0f;
        this.f58451f1 = -1.0f;
        this.f58464r1 = -9223372036854775807L;
        this.f58465s1 = 0;
        this.f58456k1 = -1;
        this.f58457l1 = -1;
        this.f58459n1 = -1.0f;
        this.f58458m1 = -1;
        mo32377P();
        C20685d dVar = this.f58461p0;
        if (dVar.f58473b) {
            dVar.f58472a.f58485e.sendEmptyMessage(2);
        }
        this.f58463q1 = null;
        this.f58460o1 = false;
        try {
            super.mo32386t();
            synchronized (this.f60189X) {
            }
            C20694l.C20695a aVar = this.f58466x0;
            C91618d dVar2 = this.f60189X;
            if (aVar.f58509b != null) {
                aVar.f58508a.post(new C20693k(aVar, dVar2));
            }
        } catch (Throwable th) {
            synchronized (this.f60189X) {
                C20694l.C20695a aVar2 = this.f58466x0;
                C91618d dVar3 = this.f60189X;
                if (aVar2.f58509b != null) {
                    aVar2.f58508a.post(new C20693k(aVar2, dVar3));
                }
                throw th;
            }
        }
    }

    /* renamed from: u */
    public void mo32387u(boolean z) {
        C91618d dVar = new C91618d();
        this.f60189X = dVar;
        int i = this.f66063e.f66190a;
        this.f58462p1 = i;
        this.f58460o1 = i != 0;
        C20694l.C20695a aVar = this.f58466x0;
        if (aVar.f58509b != null) {
            aVar.f58508a.post(new C20687e(aVar, dVar));
        }
        C20685d dVar2 = this.f58461p0;
        dVar2.f58479h = false;
        if (dVar2.f58473b) {
            dVar2.f58472a.f58485e.sendEmptyMessage(1);
        }
    }

    /* renamed from: v */
    public void mo32388v(long j, boolean z) {
        super.mo32388v(j, z);
        mo32377P();
        this.f58449d1 = 0;
        int i = this.f58465s1;
        if (i != 0) {
            this.f58464r1 = this.f58437S0[i - 1];
            this.f58465s1 = 0;
        }
        long j2 = -9223372036854775807L;
        if (z) {
            if (this.f58467y0 > 0) {
                j2 = SystemClock.elapsedRealtime() + this.f58467y0;
            }
            this.f58446a1 = j2;
            return;
        }
        this.f58446a1 = -9223372036854775807L;
    }

    /* renamed from: w */
    public void mo32389w() {
        this.f58448c1 = 0;
        this.f58447b1 = SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    public void mo32390x() {
        this.f58446a1 = -9223372036854775807L;
        mo32378S();
    }

    /* renamed from: y */
    public void mo32391y(Format[] formatArr, long j) {
        this.f58438T0 = formatArr;
        if (this.f58464r1 == -9223372036854775807L) {
            this.f58464r1 = j;
            return;
        }
        int i = this.f58465s1;
        if (i == this.f58437S0.length) {
            long j2 = this.f58437S0[this.f58465s1 - 1];
        } else {
            this.f58465s1 = i + 1;
        }
        this.f58437S0[this.f58465s1 - 1] = j;
    }
}
