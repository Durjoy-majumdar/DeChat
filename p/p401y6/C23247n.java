package p401y6;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import p289a7.C16433b;
import p289a7.C16435d;
import p333e8.C20528a;
import p333e8.C20535i;
import p333e8.C20551y;
import p353k7.C21304b;
import p353k7.C21306c;
import p396x6.C22997e;
import p396x6.C23016o;
import p401y6.C23233i;
import p401y6.C23237k;
import p404z6.C91618d;

/* renamed from: y6.n */
public class C23247n extends C21304b implements C20535i {

    /* renamed from: Q0 */
    public MediaFormat f66772Q0;

    /* renamed from: R0 */
    public int f66773R0;

    /* renamed from: S0 */
    public int f66774S0;

    /* renamed from: T0 */
    public long f66775T0;

    /* renamed from: U0 */
    public boolean f66776U0;

    /* renamed from: Z */
    public final C23233i.C23234a f66777Z;

    /* renamed from: p0 */
    public final C23237k f66778p0;

    /* renamed from: x0 */
    public boolean f66779x0;

    /* renamed from: y0 */
    public boolean f66780y0;

    /* renamed from: y6.n$b */
    public final class C23249b implements C23237k.C23244f {
        public C23249b(C23248a aVar) {
        }
    }

    public C23247n(C21306c cVar, C16433b<C16435d> bVar, boolean z, Handler handler, C23233i iVar, C118940c cVar2, C23227d... dVarArr) {
        super(1, cVar, bVar, z);
        this.f66778p0 = new C23237k(cVar2, dVarArr, new C23249b((C23248a) null));
        this.f66777Z = new C23233i.C23234a(handler, iVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32368B(p353k7.C21303a r5, android.media.MediaCodec r6, com.google.android.exoplayer2.Format r7, android.media.MediaCrypto r8) {
        /*
            r4 = this;
            java.lang.String r5 = r5.f60160a
            int r0 = p333e8.C20551y.f57835a
            r1 = 24
            r2 = 0
            if (r0 >= r1) goto L_0x0039
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0039
            java.lang.String r5 = p333e8.C20551y.f57837c
            java.lang.String r0 = "samsung"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0039
            java.lang.String r5 = p333e8.C20551y.f57836b
            java.lang.String r0 = "zeroflte"
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "herolte"
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "heroqlte"
            boolean r5 = r5.startsWith(r0)
            if (r5 == 0) goto L_0x0039
        L_0x0037:
            r5 = 1
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            r4.f66780y0 = r5
            boolean r5 = r4.f66779x0
            r0 = 0
            if (r5 == 0) goto L_0x005b
            android.media.MediaFormat r5 = r7.mo18398o()
            r4.f66772Q0 = r5
            java.lang.String r1 = "mime"
            java.lang.String r3 = "audio/raw"
            r5.setString(r1, r3)
            android.media.MediaFormat r5 = r4.f66772Q0
            r6.configure(r5, r0, r8, r2)
            android.media.MediaFormat r5 = r4.f66772Q0
            java.lang.String r6 = r7.f45777i
            r5.setString(r1, r6)
            goto L_0x0064
        L_0x005b:
            android.media.MediaFormat r5 = r7.mo18398o()
            r6.configure(r5, r0, r8, r2)
            r4.f66772Q0 = r0
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p401y6.C23247n.mo32368B(k7.a, android.media.MediaCodec, com.google.android.exoplayer2.Format, android.media.MediaCrypto):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p353k7.C21303a mo33305C(p353k7.C21306c r5, com.google.android.exoplayer2.Format r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = r6.f45777i
            y6.k r1 = r4.f66778p0
            y6.c r1 = r1.f66721a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001d
            int r0 = p401y6.C23237k.m27643c(r0)
            int[] r1 = r1.f356247a
            int r0 = java.util.Arrays.binarySearch(r1, r0)
            if (r0 < 0) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x001d
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 == 0) goto L_0x0029
            k7.a r0 = r5.mo33314b()
            if (r0 == 0) goto L_0x0029
            r4.f66779x0 = r2
            return r0
        L_0x0029:
            r4.f66779x0 = r3
            java.lang.String r6 = r6.f45777i
            k7.a r5 = r5.mo33313a(r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p401y6.C23247n.mo33305C(k7.c, com.google.android.exoplayer2.Format, boolean):k7.a");
    }

    /* renamed from: E */
    public void mo32369E(String str, long j, long j2) {
        C23233i.C23234a aVar = this.f66777Z;
        if (aVar.f66690b != null) {
            aVar.f66689a.post(new C23230f(aVar, str, j, j2));
        }
    }

    /* renamed from: F */
    public void mo32370F(Format format) {
        super.mo32370F(format);
        C23233i.C23234a aVar = this.f66777Z;
        if (aVar.f66690b != null) {
            aVar.f66689a.post(new C23231g(aVar, format));
        }
        this.f66773R0 = MimeTypes.AUDIO_RAW.equals(format.f45777i) ? format.f45791z : 2;
        this.f66774S0 = format.f45789x;
    }

    /* renamed from: G */
    public void mo32371G(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int[] iArr;
        int i;
        MediaFormat mediaFormat2 = this.f66772Q0;
        boolean z = mediaFormat2 != null;
        String string = z ? mediaFormat2.getString("mime") : MimeTypes.AUDIO_RAW;
        if (z) {
            mediaFormat = this.f66772Q0;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f66780y0 || integer != 6 || (i = this.f66774S0) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.f66774S0; i2++) {
                iArr[i2] = i2;
            }
        }
        try {
            this.f66778p0.mo36695a(string, integer, integer2, this.f66773R0, 0, iArr);
        } catch (C23237k.C23241d e) {
            throw C22997e.m27212a(e, this.f66064f);
        }
    }

    /* renamed from: J */
    public boolean mo32373J(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (this.f66779x0 && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f60189X.f262472e++;
            C23237k kVar = this.f66778p0;
            if (kVar.f66707M == 1) {
                kVar.f66707M = 2;
            }
            return true;
        } else {
            try {
                if (!this.f66778p0.mo36698e(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.f60189X.f262471d++;
                return true;
            } catch (C23237k.C23243e | C23237k.C23245h e) {
                throw C22997e.m27212a(e, this.f66064f);
            }
        }
    }

    /* renamed from: L */
    public void mo33308L() {
        try {
            C23237k kVar = this.f66778p0;
            if (kVar.f66719Y) {
                return;
            }
            if (kVar.mo36700g()) {
                if (kVar.mo36696b()) {
                    C23237k.C23239b bVar = kVar.f66732h;
                    long d = kVar.mo36697d();
                    bVar.f66760h = bVar.mo36709a();
                    bVar.f66759g = SystemClock.elapsedRealtime() * 1000;
                    bVar.f66761i = d;
                    bVar.f66753a.stop();
                    kVar.f66748x = 0;
                    kVar.f66719Y = true;
                }
            }
        } catch (C23237k.C23245h e) {
            throw C22997e.m27212a(e, this.f66064f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005f, code lost:
        if (((r5 == null || (r5 = r5.getAudioCapabilities()) == null || !r5.isSampleRateSupported(r0)) ? false : true) != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f8, code lost:
        if (r9 == false) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo32376N(p353k7.C21306c r9, com.google.android.exoplayer2.Format r10) {
        /*
            r8 = this;
            java.lang.String r0 = r10.f45777i
            boolean r1 = p333e8.C20536j.m22252d(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = p333e8.C20551y.f57835a
            r3 = 21
            if (r1 < r3) goto L_0x0013
            r4 = 32
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            y6.k r5 = r8.f66778p0
            y6.c r5 = r5.f66721a
            r6 = 1
            if (r5 == 0) goto L_0x002e
            int r7 = p401y6.C23237k.m27643c(r0)
            int[] r5 = r5.f356247a
            int r5 = java.util.Arrays.binarySearch(r5, r7)
            if (r5 < 0) goto L_0x0029
            r5 = 1
            goto L_0x002a
        L_0x0029:
            r5 = 0
        L_0x002a:
            if (r5 == 0) goto L_0x002e
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            r7 = 4
            if (r5 == 0) goto L_0x003c
            k7.a r5 = r9.mo33314b()
            if (r5 == 0) goto L_0x003c
            r9 = r4 | 8
            r9 = r9 | r7
            return r9
        L_0x003c:
            k7.a r9 = r9.mo33313a(r0, r2)
            if (r9 != 0) goto L_0x0043
            return r6
        L_0x0043:
            if (r1 < r3) goto L_0x00fa
            int r0 = r10.f45790y
            r3 = -1
            if (r0 == r3) goto L_0x0061
            android.media.MediaCodecInfo$CodecCapabilities r5 = r9.f60165f
            if (r5 != 0) goto L_0x004f
            goto L_0x005c
        L_0x004f:
            android.media.MediaCodecInfo$AudioCapabilities r5 = r5.getAudioCapabilities()
            if (r5 != 0) goto L_0x0056
            goto L_0x005c
        L_0x0056:
            boolean r0 = r5.isSampleRateSupported(r0)
            if (r0 != 0) goto L_0x005e
        L_0x005c:
            r0 = 0
            goto L_0x005f
        L_0x005e:
            r0 = 1
        L_0x005f:
            if (r0 == 0) goto L_0x00fb
        L_0x0061:
            int r10 = r10.f45789x
            if (r10 == r3) goto L_0x00fa
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.f60165f
            if (r0 != 0) goto L_0x006b
            goto L_0x00f5
        L_0x006b:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()
            if (r0 != 0) goto L_0x0073
            goto L_0x00f5
        L_0x0073:
            java.lang.String r9 = r9.f60164e
            int r0 = r0.getMaxInputChannelCount()
            if (r0 > r6) goto L_0x00f3
            r3 = 26
            if (r1 < r3) goto L_0x0083
            if (r0 <= 0) goto L_0x0083
            goto L_0x00f3
        L_0x0083:
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = "audio/3gpp"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = "audio/amr-wb"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = "audio/vorbis"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = "audio/opus"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = "audio/raw"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = "audio/flac"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = "audio/g711-alaw"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = "audio/gsm"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00dc
            goto L_0x00f3
        L_0x00dc:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00e6
            r0 = 6
            goto L_0x00f3
        L_0x00e6:
            java.lang.String r0 = "audio/eac3"
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x00f1
            r0 = 16
            goto L_0x00f3
        L_0x00f1:
            r0 = 30
        L_0x00f3:
            if (r0 >= r10) goto L_0x00f7
        L_0x00f5:
            r9 = 0
            goto L_0x00f8
        L_0x00f7:
            r9 = 1
        L_0x00f8:
            if (r9 == 0) goto L_0x00fb
        L_0x00fa:
            r2 = 1
        L_0x00fb:
            if (r2 == 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            r7 = 3
        L_0x00ff:
            r9 = r4 | 8
            r9 = r9 | r7
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p401y6.C23247n.mo32376N(k7.c, com.google.android.exoplayer2.Format):int");
    }

    /* renamed from: b */
    public boolean mo33310b() {
        if (this.f60186U) {
            C23237k kVar = this.f66778p0;
            if (!kVar.mo36700g() || (kVar.f66719Y && !kVar.mo36699f())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public C23016o mo32081c(C23016o oVar) {
        return this.f66778p0.mo36705l(oVar);
    }

    /* renamed from: d */
    public C23016o mo32082d() {
        return this.f66778p0.f66744t;
    }

    /* renamed from: e */
    public void mo32384e(int i, Object obj) {
        if (i == 2) {
            C23237k kVar = this.f66778p0;
            float floatValue = ((Float) obj).floatValue();
            if (kVar.f66711Q != floatValue) {
                kVar.f66711Q = floatValue;
                kVar.mo36706m();
            }
        } else if (i == 3) {
            C23225b bVar = (C23225b) obj;
            C23237k kVar2 = this.f66778p0;
            if (!kVar2.f66739o.equals(bVar)) {
                kVar2.f66739o = bVar;
                if (!kVar2.f66724b0) {
                    kVar2.mo36703j();
                    kVar2.f66722a0 = 0;
                }
            }
        }
    }

    public boolean isReady() {
        return this.f66778p0.mo36699f() || super.isReady();
    }

    /* renamed from: q */
    public C20535i mo36245q() {
        return this;
    }

    /* renamed from: r */
    public long mo32083r() {
        long j;
        long j2;
        long j3;
        long j4;
        C23237k kVar = this.f66778p0;
        boolean b = mo33310b();
        if (!(kVar.mo36700g() && kVar.f66707M != 0)) {
            j3 = Long.MIN_VALUE;
        } else {
            if (kVar.f66734j.getPlayState() == 3) {
                C23237k.C23239b bVar = kVar.f66732h;
                long a = (bVar.mo36709a() * TimeUtil.SECOND_TO_US) / ((long) bVar.f66755c);
                if (a != 0) {
                    long nanoTime = System.nanoTime() / 1000;
                    if (nanoTime - kVar.f66696B >= 30000) {
                        long[] jArr = kVar.f66731g;
                        int i = kVar.f66749y;
                        jArr[i] = a - nanoTime;
                        kVar.f66749y = (i + 1) % 10;
                        int i2 = kVar.f66750z;
                        if (i2 < 10) {
                            kVar.f66750z = i2 + 1;
                        }
                        kVar.f66696B = nanoTime;
                        kVar.f66695A = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = kVar.f66750z;
                            if (i3 >= i4) {
                                break;
                            }
                            kVar.f66695A += kVar.f66731g[i3] / ((long) i4);
                            i3++;
                        }
                    }
                    if (!kVar.mo36701h() && nanoTime - kVar.f66698D >= 500000) {
                        boolean e = kVar.f66732h.mo36713e();
                        kVar.f66697C = e;
                        if (e) {
                            long c = kVar.f66732h.mo36711c() / 1000;
                            long b2 = kVar.f66732h.mo36710b();
                            if (c < kVar.f66709O) {
                                kVar.f66697C = false;
                            } else if (Math.abs(c - nanoTime) > 5000000) {
                                if (!kVar.f66740p) {
                                    long j5 = kVar.f66701G / ((long) kVar.f66700F);
                                }
                                kVar.mo36697d();
                                kVar.f66697C = false;
                            } else if (Math.abs(((b2 * TimeUtil.SECOND_TO_US) / ((long) kVar.f66735k)) - a) > 5000000) {
                                if (!kVar.f66740p) {
                                    long j6 = kVar.f66701G / ((long) kVar.f66700F);
                                }
                                kVar.mo36697d();
                                kVar.f66697C = false;
                            }
                        }
                        Method method = kVar.f66699E;
                        if (method != null && !kVar.f66740p) {
                            try {
                                long intValue = (((long) ((Integer) method.invoke(kVar.f66734j, (Object[]) null)).intValue()) * 1000) - kVar.f66742r;
                                kVar.f66710P = intValue;
                                long max = Math.max(intValue, 0);
                                kVar.f66710P = max;
                                if (max > 5000000) {
                                    kVar.f66710P = 0;
                                }
                            } catch (Exception unused) {
                                kVar.f66699E = null;
                            }
                        }
                        kVar.f66698D = nanoTime;
                    }
                }
            }
            long nanoTime2 = System.nanoTime() / 1000;
            if (kVar.f66697C) {
                j = ((kVar.f66732h.mo36710b() + (((nanoTime2 - (kVar.f66732h.mo36711c() / 1000)) * ((long) kVar.f66735k)) / TimeUtil.SECOND_TO_US)) * TimeUtil.SECOND_TO_US) / ((long) kVar.f66735k);
            } else {
                if (kVar.f66750z == 0) {
                    C23237k.C23239b bVar2 = kVar.f66732h;
                    j4 = (bVar2.mo36709a() * TimeUtil.SECOND_TO_US) / ((long) bVar2.f66755c);
                } else {
                    j4 = nanoTime2 + kVar.f66695A;
                }
                j = j4;
                if (!b) {
                    j -= kVar.f66710P;
                }
            }
            long j7 = kVar.f66708N;
            while (!kVar.f66733i.isEmpty() && j >= kVar.f66733i.getFirst().f66768c) {
                C23237k.C23242g remove = kVar.f66733i.remove();
                kVar.f66744t = remove.f66766a;
                kVar.f66746v = remove.f66768c;
                kVar.f66745u = remove.f66767b - kVar.f66708N;
            }
            if (kVar.f66744t.f66186a == 1.0f) {
                j2 = (j + kVar.f66745u) - kVar.f66746v;
            } else {
                if (kVar.f66733i.isEmpty()) {
                    C23251q qVar = kVar.f66725c;
                    long j8 = qVar.f66815k;
                    if (j8 >= 1024) {
                        j2 = kVar.f66745u + C20551y.m22320j(j - kVar.f66746v, qVar.f66814j, j8);
                    }
                }
                j2 = ((long) (((double) kVar.f66744t.f66186a) * ((double) (j - kVar.f66746v)))) + kVar.f66745u;
            }
            j3 = j7 + j2;
        }
        if (j3 != Long.MIN_VALUE) {
            if (!this.f66776U0) {
                j3 = Math.max(this.f66775T0, j3);
            }
            this.f66775T0 = j3;
            this.f66776U0 = false;
        }
        return this.f66775T0;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: t */
    public void mo32386t() {
        try {
            C23237k kVar = this.f66778p0;
            kVar.mo36703j();
            for (C23227d reset : kVar.f66727d) {
                reset.reset();
            }
            kVar.f66722a0 = 0;
            kVar.f66720Z = false;
            try {
                super.mo32386t();
                synchronized (this.f60189X) {
                }
                this.f66777Z.mo36692a(this.f60189X);
            } catch (Throwable th) {
                synchronized (this.f60189X) {
                    this.f66777Z.mo36692a(this.f60189X);
                    throw th;
                }
            }
        } catch (Throwable th4) {
            synchronized (this.f60189X) {
                this.f66777Z.mo36692a(this.f60189X);
                throw th4;
            }
        }
    }

    /* renamed from: u */
    public void mo32387u(boolean z) {
        C91618d dVar = new C91618d();
        this.f60189X = dVar;
        C23233i.C23234a aVar = this.f66777Z;
        if (aVar.f66690b != null) {
            aVar.f66689a.post(new C23229e(aVar, dVar));
        }
        int i = this.f66063e.f66190a;
        boolean z2 = false;
        if (i != 0) {
            C23237k kVar = this.f66778p0;
            kVar.getClass();
            if (C20551y.f57835a >= 21) {
                z2 = true;
            }
            C20528a.m22240d(z2);
            if (!kVar.f66724b0 || kVar.f66722a0 != i) {
                kVar.f66724b0 = true;
                kVar.f66722a0 = i;
                kVar.mo36703j();
                return;
            }
            return;
        }
        C23237k kVar2 = this.f66778p0;
        if (kVar2.f66724b0) {
            kVar2.f66724b0 = false;
            kVar2.f66722a0 = 0;
            kVar2.mo36703j();
        }
    }

    /* renamed from: v */
    public void mo32388v(long j, boolean z) {
        super.mo32388v(j, z);
        this.f66778p0.mo36703j();
        this.f66775T0 = j;
        this.f66776U0 = true;
    }

    /* renamed from: w */
    public void mo32389w() {
        C23237k kVar = this.f66778p0;
        kVar.f66720Z = true;
        if (kVar.mo36700g()) {
            kVar.f66709O = System.nanoTime() / 1000;
            kVar.f66734j.play();
        }
    }

    /* renamed from: x */
    public void mo32390x() {
        C23237k kVar = this.f66778p0;
        kVar.f66720Z = false;
        if (kVar.mo36700g()) {
            kVar.f66695A = 0;
            kVar.f66750z = 0;
            kVar.f66749y = 0;
            kVar.f66696B = 0;
            kVar.f66697C = false;
            kVar.f66698D = 0;
            C23237k.C23239b bVar = kVar.f66732h;
            if (bVar.f66759g == -9223372036854775807L) {
                bVar.f66753a.pause();
            }
        }
    }
}
