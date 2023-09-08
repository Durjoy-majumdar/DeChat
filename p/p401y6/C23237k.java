package p401y6;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import p333e8.C20528a;
import p333e8.C20551y;
import p396x6.C22994b;
import p396x6.C23016o;
import p401y6.C23233i;
import p401y6.C23247n;

/* renamed from: y6.k */
public final class C23237k {

    /* renamed from: A */
    public long f66695A;

    /* renamed from: B */
    public long f66696B;

    /* renamed from: C */
    public boolean f66697C;

    /* renamed from: D */
    public long f66698D;

    /* renamed from: E */
    public Method f66699E;

    /* renamed from: F */
    public int f66700F;

    /* renamed from: G */
    public long f66701G;

    /* renamed from: H */
    public long f66702H;

    /* renamed from: I */
    public int f66703I;

    /* renamed from: J */
    public long f66704J;

    /* renamed from: K */
    public long f66705K;

    /* renamed from: L */
    public int f66706L;

    /* renamed from: M */
    public int f66707M;

    /* renamed from: N */
    public long f66708N;

    /* renamed from: O */
    public long f66709O;

    /* renamed from: P */
    public long f66710P;

    /* renamed from: Q */
    public float f66711Q;

    /* renamed from: R */
    public C23227d[] f66712R;

    /* renamed from: S */
    public ByteBuffer[] f66713S;

    /* renamed from: T */
    public ByteBuffer f66714T;

    /* renamed from: U */
    public ByteBuffer f66715U;

    /* renamed from: V */
    public byte[] f66716V;

    /* renamed from: W */
    public int f66717W;

    /* renamed from: X */
    public int f66718X;

    /* renamed from: Y */
    public boolean f66719Y;

    /* renamed from: Z */
    public boolean f66720Z;

    /* renamed from: a */
    public final C118940c f66721a;

    /* renamed from: a0 */
    public int f66722a0;

    /* renamed from: b */
    public final C118941l f66723b;

    /* renamed from: b0 */
    public boolean f66724b0;

    /* renamed from: c */
    public final C23251q f66725c;

    /* renamed from: c0 */
    public boolean f66726c0;

    /* renamed from: d */
    public final C23227d[] f66727d;

    /* renamed from: d0 */
    public long f66728d0;

    /* renamed from: e */
    public final C23244f f66729e;

    /* renamed from: f */
    public final ConditionVariable f66730f = new ConditionVariable(true);

    /* renamed from: g */
    public final long[] f66731g;

    /* renamed from: h */
    public final C23239b f66732h;

    /* renamed from: i */
    public final LinkedList<C23242g> f66733i;

    /* renamed from: j */
    public AudioTrack f66734j;

    /* renamed from: k */
    public int f66735k;

    /* renamed from: l */
    public int f66736l;

    /* renamed from: m */
    public int f66737m;

    /* renamed from: n */
    public int f66738n;

    /* renamed from: o */
    public C23225b f66739o;

    /* renamed from: p */
    public boolean f66740p;

    /* renamed from: q */
    public int f66741q;

    /* renamed from: r */
    public long f66742r;

    /* renamed from: s */
    public C23016o f66743s;

    /* renamed from: t */
    public C23016o f66744t;

    /* renamed from: u */
    public long f66745u;

    /* renamed from: v */
    public long f66746v;

    /* renamed from: w */
    public ByteBuffer f66747w;

    /* renamed from: x */
    public int f66748x;

    /* renamed from: y */
    public int f66749y;

    /* renamed from: z */
    public int f66750z;

    /* renamed from: y6.k$a */
    public class C23238a extends Thread {

        /* renamed from: d */
        public final /* synthetic */ AudioTrack f66751d;

        public C23238a(AudioTrack audioTrack) {
            this.f66751d = audioTrack;
        }

        public void run() {
            try {
                this.f66751d.flush();
                this.f66751d.release();
            } finally {
                C23237k.this.f66730f.open();
            }
        }
    }

    /* renamed from: y6.k$b */
    public static class C23239b {

        /* renamed from: a */
        public AudioTrack f66753a;

        /* renamed from: b */
        public boolean f66754b;

        /* renamed from: c */
        public int f66755c;

        /* renamed from: d */
        public long f66756d;

        /* renamed from: e */
        public long f66757e;

        /* renamed from: f */
        public long f66758f;

        /* renamed from: g */
        public long f66759g;

        /* renamed from: h */
        public long f66760h;

        /* renamed from: i */
        public long f66761i;

        public C23239b(C23238a aVar) {
        }

        /* renamed from: a */
        public long mo36709a() {
            if (this.f66759g != -9223372036854775807L) {
                return Math.min(this.f66761i, this.f66760h + ((((SystemClock.elapsedRealtime() * 1000) - this.f66759g) * ((long) this.f66755c)) / TimeUtil.SECOND_TO_US));
            }
            int playState = this.f66753a.getPlayState();
            if (playState == 1) {
                return 0;
            }
            long playbackHeadPosition = Util.MAX_32BIT_VALUE & ((long) this.f66753a.getPlaybackHeadPosition());
            if (this.f66754b) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f66758f = this.f66756d;
                }
                playbackHeadPosition += this.f66758f;
            }
            if (this.f66756d > playbackHeadPosition) {
                this.f66757e++;
            }
            this.f66756d = playbackHeadPosition;
            return playbackHeadPosition + (this.f66757e << 32);
        }

        /* renamed from: b */
        public long mo36710b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public long mo36711c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo36712d(AudioTrack audioTrack, boolean z) {
            this.f66753a = audioTrack;
            this.f66754b = z;
            this.f66759g = -9223372036854775807L;
            this.f66756d = 0;
            this.f66757e = 0;
            this.f66758f = 0;
            if (audioTrack != null) {
                this.f66755c = audioTrack.getSampleRate();
            }
        }

        /* renamed from: e */
        public boolean mo36713e() {
            return false;
        }
    }

    /* renamed from: y6.k$c */
    public static class C23240c extends C23239b {

        /* renamed from: j */
        public final AudioTimestamp f66762j = new AudioTimestamp();

        /* renamed from: k */
        public long f66763k;

        /* renamed from: l */
        public long f66764l;

        /* renamed from: m */
        public long f66765m;

        public C23240c() {
            super((C23238a) null);
        }

        /* renamed from: b */
        public long mo36710b() {
            return this.f66765m;
        }

        /* renamed from: c */
        public long mo36711c() {
            return this.f66762j.nanoTime;
        }

        /* renamed from: d */
        public void mo36712d(AudioTrack audioTrack, boolean z) {
            super.mo36712d(audioTrack, z);
            this.f66763k = 0;
            this.f66764l = 0;
            this.f66765m = 0;
        }

        /* renamed from: e */
        public boolean mo36713e() {
            boolean timestamp = this.f66753a.getTimestamp(this.f66762j);
            if (timestamp) {
                long j = this.f66762j.framePosition;
                if (this.f66764l > j) {
                    this.f66763k++;
                }
                this.f66764l = j;
                this.f66765m = j + (this.f66763k << 32);
            }
            return timestamp;
        }
    }

    /* renamed from: y6.k$d */
    public static final class C23241d extends Exception {
        public C23241d(Throwable th) {
            super(th);
        }

        public C23241d(String str) {
            super(str);
        }
    }

    /* renamed from: y6.k$g */
    public static final class C23242g {

        /* renamed from: a */
        public final C23016o f66766a;

        /* renamed from: b */
        public final long f66767b;

        /* renamed from: c */
        public final long f66768c;

        public C23242g(C23016o oVar, long j, long j2, C23238a aVar) {
            this.f66766a = oVar;
            this.f66767b = j;
            this.f66768c = j2;
        }
    }

    /* renamed from: y6.k$e */
    public static final class C23243e extends Exception {
        public C23243e(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
        }
    }

    /* renamed from: y6.k$f */
    public interface C23244f {
    }

    /* renamed from: y6.k$h */
    public static final class C23245h extends Exception {
        public C23245h(int i) {
            super("AudioTrack write failed: " + i);
        }
    }

    public C23237k(C118940c cVar, C23227d[] dVarArr, C23244f fVar) {
        this.f66721a = cVar;
        this.f66729e = fVar;
        if (C20551y.f57835a >= 18) {
            try {
                this.f66699E = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (C20551y.f57835a >= 19) {
            this.f66732h = new C23240c();
        } else {
            this.f66732h = new C23239b((C23238a) null);
        }
        C118941l lVar = new C118941l();
        this.f66723b = lVar;
        C23251q qVar = new C23251q();
        this.f66725c = qVar;
        C23227d[] dVarArr2 = new C23227d[(dVarArr.length + 3)];
        this.f66727d = dVarArr2;
        dVarArr2[0] = new C118942o();
        dVarArr2[1] = lVar;
        System.arraycopy(dVarArr, 0, dVarArr2, 2, dVarArr.length);
        dVarArr2[dVarArr.length + 2] = qVar;
        this.f66731g = new long[10];
        this.f66711Q = 1.0f;
        this.f66707M = 0;
        this.f66739o = C23225b.f66671e;
        this.f66722a0 = 0;
        this.f66744t = C23016o.f66185d;
        this.f66718X = -1;
        this.f66712R = new C23227d[0];
        this.f66713S = new ByteBuffer[0];
        this.f66733i = new LinkedList<>();
    }

    /* renamed from: c */
    public static int m27643c(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1095064472:
                if (str.equals(MimeTypes.AUDIO_DTS)) {
                    c = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c = 1;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c = 2;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals(MimeTypes.AUDIO_DTS_HD)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 7;
            case 1:
                return 5;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ce A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36695a(java.lang.String r10, int r11, int r12, int r13, int r14, int[] r15) {
        /*
            r9 = this;
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r10)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x000f
            int r10 = m27643c(r10)
            goto L_0x0010
        L_0x000f:
            r10 = r13
        L_0x0010:
            r2 = 0
            if (r0 != 0) goto L_0x0049
            int r13 = p333e8.C20551y.m22318h(r13, r11)
            r9.f66700F = r13
            y6.l r13 = r9.f66723b
            r13.f356251d = r15
            y6.d[] r13 = r9.f66727d
            int r15 = r13.length
            r3 = 0
            r4 = 0
        L_0x0022:
            if (r3 >= r15) goto L_0x0043
            r5 = r13[r3]
            boolean r6 = r5.mo36682e(r12, r11, r10)     // Catch:{ a -> 0x003c }
            r4 = r4 | r6
            boolean r6 = r5.mo36678a()
            if (r6 == 0) goto L_0x0039
            int r11 = r5.mo36680c()
            int r10 = r5.mo36685g()
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x003c:
            r10 = move-exception
            y6.k$d r11 = new y6.k$d
            r11.<init>((java.lang.Throwable) r10)
            throw r11
        L_0x0043:
            if (r4 == 0) goto L_0x004a
            r9.mo36704k()
            goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            r13 = 12
            r15 = 252(0xfc, float:3.53E-43)
            switch(r11) {
                case 1: goto L_0x007d;
                case 2: goto L_0x007a;
                case 3: goto L_0x0077;
                case 4: goto L_0x0074;
                case 5: goto L_0x0071;
                case 6: goto L_0x006e;
                case 7: goto L_0x006b;
                case 8: goto L_0x0068;
                default: goto L_0x0051;
            }
        L_0x0051:
            y6.k$d r10 = new y6.k$d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Unsupported channel count: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>((java.lang.String) r11)
            throw r10
        L_0x0068:
            int r3 = p396x6.C22994b.f66070a
            goto L_0x007e
        L_0x006b:
            r3 = 1276(0x4fc, float:1.788E-42)
            goto L_0x007e
        L_0x006e:
            r3 = 252(0xfc, float:3.53E-43)
            goto L_0x007e
        L_0x0071:
            r3 = 220(0xdc, float:3.08E-43)
            goto L_0x007e
        L_0x0074:
            r3 = 204(0xcc, float:2.86E-43)
            goto L_0x007e
        L_0x0077:
            r3 = 28
            goto L_0x007e
        L_0x007a:
            r3 = 12
            goto L_0x007e
        L_0x007d:
            r3 = 4
        L_0x007e:
            int r5 = p333e8.C20551y.f57835a
            r6 = 23
            r7 = 5
            if (r5 > r6) goto L_0x00a5
            java.lang.String r6 = p333e8.C20551y.f57836b
            java.lang.String r8 = "foster"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x00a5
            java.lang.String r6 = p333e8.C20551y.f57837c
            java.lang.String r8 = "NVIDIA"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x00a5
            r6 = 3
            if (r11 == r6) goto L_0x00a6
            if (r11 == r7) goto L_0x00a6
            r15 = 7
            if (r11 == r15) goto L_0x00a2
            goto L_0x00a5
        L_0x00a2:
            int r15 = p396x6.C22994b.f66070a
            goto L_0x00a6
        L_0x00a5:
            r15 = r3
        L_0x00a6:
            r3 = 25
            if (r5 > r3) goto L_0x00b9
            java.lang.String r3 = p333e8.C20551y.f57836b
            java.lang.String r5 = "fugu"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x00b9
            if (r0 == 0) goto L_0x00b9
            if (r11 != r1) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r13 = r15
        L_0x00ba:
            if (r4 != 0) goto L_0x00cf
            boolean r15 = r9.mo36700g()
            if (r15 == 0) goto L_0x00cf
            int r15 = r9.f66737m
            if (r15 != r10) goto L_0x00cf
            int r15 = r9.f66735k
            if (r15 != r12) goto L_0x00cf
            int r15 = r9.f66736l
            if (r15 != r13) goto L_0x00cf
            return
        L_0x00cf:
            r9.mo36703j()
            r9.f66737m = r10
            r9.f66740p = r0
            r9.f66735k = r12
            r9.f66736l = r13
            r15 = 2
            if (r0 == 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r10 = 2
        L_0x00df:
            r9.f66738n = r10
            int r10 = p333e8.C20551y.m22318h(r15, r11)
            r9.f66703I = r10
            r10 = 1000000(0xf4240, double:4.940656E-318)
            if (r14 == 0) goto L_0x00ef
            r9.f66741q = r14
            goto L_0x013b
        L_0x00ef:
            if (r0 == 0) goto L_0x0104
            int r12 = r9.f66738n
            if (r12 == r7) goto L_0x00ff
            r13 = 6
            if (r12 != r13) goto L_0x00f9
            goto L_0x00ff
        L_0x00f9:
            r12 = 49152(0xc000, float:6.8877E-41)
            r9.f66741q = r12
            goto L_0x013b
        L_0x00ff:
            r12 = 20480(0x5000, float:2.8699E-41)
            r9.f66741q = r12
            goto L_0x013b
        L_0x0104:
            int r14 = r9.f66738n
            int r12 = android.media.AudioTrack.getMinBufferSize(r12, r13, r14)
            r13 = -2
            if (r12 == r13) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r1 = 0
        L_0x010f:
            p333e8.C20528a.m22240d(r1)
            int r13 = r12 * 4
            r14 = 250000(0x3d090, double:1.235164E-318)
            int r1 = r9.f66735k
            long r2 = (long) r1
            long r14 = r14 * r2
            long r14 = r14 / r10
            int r15 = (int) r14
            int r14 = r9.f66703I
            int r15 = r15 * r14
            long r2 = (long) r12
            r4 = 750000(0xb71b0, double:3.70549E-318)
            long r6 = (long) r1
            long r4 = r4 * r6
            long r4 = r4 / r10
            long r6 = (long) r14
            long r4 = r4 * r6
            long r1 = java.lang.Math.max(r2, r4)
            int r12 = (int) r1
            if (r13 >= r15) goto L_0x0136
            r13 = r15
            goto L_0x0139
        L_0x0136:
            if (r13 <= r12) goto L_0x0139
            r13 = r12
        L_0x0139:
            r9.f66741q = r13
        L_0x013b:
            if (r0 == 0) goto L_0x0143
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0150
        L_0x0143:
            int r12 = r9.f66741q
            int r13 = r9.f66703I
            int r12 = r12 / r13
            long r12 = (long) r12
            long r12 = r12 * r10
            int r10 = r9.f66735k
            long r10 = (long) r10
            long r10 = r12 / r10
        L_0x0150:
            r9.f66742r = r10
            x6.o r10 = r9.f66744t
            r9.mo36705l(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p401y6.C23237k.mo36695a(java.lang.String, int, int, int, int, int[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36696b() {
        /*
            r9 = this;
            int r0 = r9.f66718X
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f66740p
            if (r0 == 0) goto L_0x000f
            y6.d[] r0 = r9.f66712R
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.f66718X = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.f66718X
            y6.d[] r5 = r9.f66712R
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.mo36686h()
        L_0x0028:
            r9.mo36702i(r7)
            boolean r0 = r4.mo36679b()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f66718X
            int r0 = r0 + r2
            r9.f66718X = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.f66715U
            if (r0 == 0) goto L_0x0044
            r9.mo36707n(r0, r7)
            java.nio.ByteBuffer r0 = r9.f66715U
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.f66718X = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p401y6.C23237k.mo36696b():boolean");
    }

    /* renamed from: d */
    public final long mo36697d() {
        return this.f66740p ? this.f66705K : this.f66704J / ((long) this.f66703I);
    }

    /* renamed from: e */
    public boolean mo36698e(ByteBuffer byteBuffer, long j) {
        int i;
        int i2;
        AudioTrack audioTrack;
        int i3;
        AudioAttributes audioAttributes;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.f66714T;
        C20528a.m22237a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!mo36700g()) {
            this.f66730f.block();
            if (C20551y.f57835a >= 21) {
                if (this.f66724b0) {
                    audioAttributes = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
                } else {
                    C23225b bVar = this.f66739o;
                    if (bVar.f66675d == null) {
                        bVar.f66675d = new AudioAttributes.Builder().setContentType(bVar.f66672a).setFlags(bVar.f66673b).setUsage(bVar.f66674c).build();
                    }
                    audioAttributes = bVar.f66675d;
                }
                AudioAttributes audioAttributes2 = audioAttributes;
                AudioFormat build = new AudioFormat.Builder().setChannelMask(this.f66736l).setEncoding(this.f66738n).setSampleRate(this.f66735k).build();
                int i4 = this.f66722a0;
                audioTrack = new AudioTrack(audioAttributes2, build, this.f66741q, 1, i4 != 0 ? i4 : 0);
            } else {
                int i5 = this.f66739o.f66674c;
                if (i5 != 13) {
                    switch (i5) {
                        case 2:
                            i3 = 0;
                            break;
                        case 3:
                            i3 = 8;
                            break;
                        case 4:
                            i3 = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i3 = 5;
                            break;
                        case 6:
                            i3 = 2;
                            break;
                        default:
                            i3 = 3;
                            break;
                    }
                } else {
                    i3 = 1;
                }
                audioTrack = this.f66722a0 == 0 ? new AudioTrack(i3, this.f66735k, this.f66736l, this.f66738n, this.f66741q, 1) : new AudioTrack(i3, this.f66735k, this.f66736l, this.f66738n, this.f66741q, 1, this.f66722a0);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                this.f66734j = audioTrack;
                int audioSessionId = audioTrack.getAudioSessionId();
                if (this.f66722a0 != audioSessionId) {
                    this.f66722a0 = audioSessionId;
                    C23247n.C23249b bVar2 = (C23247n.C23249b) this.f66729e;
                    C23233i.C23234a aVar = C23247n.this.f66777Z;
                    if (aVar.f66690b != null) {
                        aVar.f66689a.post(new C23236j(aVar, audioSessionId));
                    }
                    C23247n.this.getClass();
                }
                this.f66732h.mo36712d(this.f66734j, mo36701h());
                mo36706m();
                this.f66726c0 = false;
                if (this.f66720Z) {
                    this.f66720Z = true;
                    if (mo36700g()) {
                        this.f66709O = System.nanoTime() / 1000;
                        this.f66734j.play();
                    }
                }
            } else {
                try {
                    audioTrack.release();
                } catch (Exception unused) {
                }
                throw new C23243e(state, this.f66735k, this.f66736l, this.f66741q);
            }
        }
        if (mo36701h()) {
            if (this.f66734j.getPlayState() == 2) {
                this.f66726c0 = false;
                return false;
            } else if (this.f66734j.getPlayState() == 1 && this.f66732h.mo36709a() != 0) {
                return false;
            }
        }
        boolean z = this.f66726c0;
        boolean f = mo36699f();
        this.f66726c0 = f;
        if (z && !f && this.f66734j.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f66728d0;
            C23244f fVar = this.f66729e;
            int i6 = this.f66741q;
            long b = C22994b.m27204b(this.f66742r);
            C23247n.C23249b bVar3 = (C23247n.C23249b) fVar;
            C23233i.C23234a aVar2 = C23247n.this.f66777Z;
            if (aVar2.f66690b != null) {
                aVar2.f66689a.post(new C23232h(aVar2, i6, b, elapsedRealtime));
            }
            C23247n.this.getClass();
        }
        if (this.f66714T == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f66740p && this.f66706L == 0) {
                int i7 = this.f66738n;
                int i8 = 6;
                if (i7 == 7 || i7 == 8) {
                    int position = byteBuffer.position();
                    i2 = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i7 == 5) {
                    i2 = 1536;
                } else if (i7 == 6) {
                    if (((byteBuffer2.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                        i8 = C23224a.f66665a[(byteBuffer2.get(byteBuffer.position() + 4) & 48) >> 4];
                    }
                    i2 = i8 * 256;
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: " + i7);
                }
                this.f66706L = i2;
            }
            if (this.f66743s != null) {
                if (!mo36696b()) {
                    return false;
                }
                LinkedList<C23242g> linkedList = this.f66733i;
                C23242g gVar = r13;
                C23242g gVar2 = new C23242g(this.f66743s, Math.max(0, j2), (mo36697d() * TimeUtil.SECOND_TO_US) / ((long) this.f66735k), (C23238a) null);
                linkedList.add(gVar);
                this.f66743s = null;
                mo36704k();
            }
            int i9 = this.f66707M;
            if (i9 == 0) {
                this.f66708N = Math.max(0, j2);
                this.f66707M = 1;
            } else {
                long j3 = this.f66708N + (((this.f66740p ? this.f66702H : this.f66701G / ((long) this.f66700F)) * TimeUtil.SECOND_TO_US) / ((long) this.f66735k));
                if (i9 != 1 || Math.abs(j3 - j2) <= 200000) {
                    i = 2;
                } else {
                    i = 2;
                    this.f66707M = 2;
                }
                if (this.f66707M == i) {
                    this.f66708N += j2 - j3;
                    this.f66707M = 1;
                    C23247n.C23249b bVar4 = (C23247n.C23249b) this.f66729e;
                    C23247n.this.getClass();
                    C23247n.this.f66776U0 = true;
                }
            }
            if (this.f66740p) {
                this.f66702H += (long) this.f66706L;
            } else {
                this.f66701G += (long) byteBuffer.remaining();
            }
            this.f66714T = byteBuffer2;
        }
        if (this.f66740p) {
            mo36707n(this.f66714T, j2);
        } else {
            mo36702i(j2);
        }
        if (this.f66714T.hasRemaining()) {
            return false;
        }
        this.f66714T = null;
        return true;
    }

    /* renamed from: f */
    public boolean mo36699f() {
        if (mo36700g()) {
            if (mo36697d() > this.f66732h.mo36709a()) {
                return true;
            }
            if (mo36701h() && this.f66734j.getPlayState() == 2 && this.f66734j.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo36700g() {
        return this.f66734j != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f66738n;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36701h() {
        /*
            r2 = this;
            int r0 = p333e8.C20551y.f57835a
            r1 = 23
            if (r0 >= r1) goto L_0x0010
            int r0 = r2.f66738n
            r1 = 5
            if (r0 == r1) goto L_0x000e
            r1 = 6
            if (r0 != r1) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p401y6.C23237k.mo36701h():boolean");
    }

    /* renamed from: i */
    public final void mo36702i(long j) {
        ByteBuffer byteBuffer;
        int length = this.f66712R.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f66713S[i - 1];
            } else {
                byteBuffer = this.f66714T;
                if (byteBuffer == null) {
                    byteBuffer = C23227d.f66676a;
                }
            }
            if (i == length) {
                mo36707n(byteBuffer, j);
            } else {
                C23227d dVar = this.f66712R[i];
                dVar.mo36683f(byteBuffer);
                ByteBuffer d = dVar.mo36681d();
                this.f66713S[i] = d;
                if (d.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public void mo36703j() {
        if (mo36700g()) {
            this.f66701G = 0;
            this.f66702H = 0;
            this.f66704J = 0;
            this.f66705K = 0;
            this.f66706L = 0;
            C23016o oVar = this.f66743s;
            if (oVar != null) {
                this.f66744t = oVar;
                this.f66743s = null;
            } else if (!this.f66733i.isEmpty()) {
                this.f66744t = this.f66733i.getLast().f66766a;
            }
            this.f66733i.clear();
            this.f66745u = 0;
            this.f66746v = 0;
            this.f66714T = null;
            this.f66715U = null;
            int i = 0;
            while (true) {
                C23227d[] dVarArr = this.f66712R;
                if (i >= dVarArr.length) {
                    break;
                }
                C23227d dVar = dVarArr[i];
                dVar.flush();
                this.f66713S[i] = dVar.mo36681d();
                i++;
            }
            this.f66719Y = false;
            this.f66718X = -1;
            this.f66747w = null;
            this.f66748x = 0;
            this.f66707M = 0;
            this.f66710P = 0;
            this.f66695A = 0;
            this.f66750z = 0;
            this.f66749y = 0;
            this.f66696B = 0;
            this.f66697C = false;
            this.f66698D = 0;
            if (this.f66734j.getPlayState() == 3) {
                this.f66734j.pause();
            }
            AudioTrack audioTrack = this.f66734j;
            this.f66734j = null;
            this.f66732h.mo36712d((AudioTrack) null, false);
            this.f66730f.close();
            new C23238a(audioTrack).start();
        }
    }

    /* renamed from: k */
    public final void mo36704k() {
        ArrayList arrayList = new ArrayList();
        for (C23227d dVar : this.f66727d) {
            if (dVar.mo36678a()) {
                arrayList.add(dVar);
            } else {
                dVar.flush();
            }
        }
        int size = arrayList.size();
        this.f66712R = (C23227d[]) arrayList.toArray(new C23227d[size]);
        this.f66713S = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            C23227d dVar2 = this.f66712R[i];
            dVar2.flush();
            this.f66713S[i] = dVar2.mo36681d();
        }
    }

    /* renamed from: l */
    public C23016o mo36705l(C23016o oVar) {
        if (this.f66740p) {
            C23016o oVar2 = C23016o.f66185d;
            this.f66744t = oVar2;
            return oVar2;
        }
        C23251q qVar = this.f66725c;
        float f = oVar.f66186a;
        qVar.getClass();
        int i = C20551y.f57835a;
        float max = Math.max(0.1f, Math.min(f, 8.0f));
        qVar.f66809e = max;
        C23251q qVar2 = this.f66725c;
        float f2 = oVar.f66187b;
        qVar2.getClass();
        qVar2.f66810f = Math.max(0.1f, Math.min(f2, 8.0f));
        C23016o oVar3 = new C23016o(max, f2);
        C23016o oVar4 = this.f66743s;
        if (oVar4 == null) {
            oVar4 = !this.f66733i.isEmpty() ? this.f66733i.getLast().f66766a : this.f66744t;
        }
        if (!oVar3.equals(oVar4)) {
            if (mo36700g()) {
                this.f66743s = oVar3;
            } else {
                this.f66744t = oVar3;
            }
        }
        return this.f66744t;
    }

    /* renamed from: m */
    public final void mo36706m() {
        if (mo36700g()) {
            if (C20551y.f57835a >= 21) {
                this.f66734j.setVolume(this.f66711Q);
                return;
            }
            AudioTrack audioTrack = this.f66734j;
            float f = this.f66711Q;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        if (r11 < r10) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0113  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36707n(java.nio.ByteBuffer r9, long r10) {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.f66715U
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r9) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            p333e8.C20528a.m22237a(r0)
            goto L_0x003b
        L_0x0018:
            r8.f66715U = r9
            int r0 = p333e8.C20551y.f57835a
            if (r0 >= r2) goto L_0x003b
            int r0 = r9.remaining()
            byte[] r4 = r8.f66716V
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r8.f66716V = r4
        L_0x002d:
            int r4 = r9.position()
            byte[] r5 = r8.f66716V
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.f66717W = r3
        L_0x003b:
            int r0 = r9.remaining()
            int r4 = p333e8.C20551y.f57835a
            if (r4 >= r2) goto L_0x0079
            long r10 = r8.f66704J
            y6.k$b r2 = r8.f66732h
            long r4 = r2.mo36709a()
            int r2 = r8.f66703I
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r11 = (int) r10
            int r10 = r8.f66741q
            int r10 = r10 - r11
            if (r10 <= 0) goto L_0x0076
            int r10 = java.lang.Math.min(r0, r10)
            android.media.AudioTrack r11 = r8.f66734j
            byte[] r2 = r8.f66716V
            int r4 = r8.f66717W
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00f0
            int r11 = r8.f66717W
            int r11 = r11 + r10
            r8.f66717W = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00f0
        L_0x0076:
            r10 = 0
            goto L_0x00f0
        L_0x0079:
            boolean r2 = r8.f66724b0
            if (r2 == 0) goto L_0x00ea
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0088
            r2 = 1
            goto L_0x0089
        L_0x0088:
            r2 = 0
        L_0x0089:
            p333e8.C20528a.m22240d(r2)
            android.media.AudioTrack r2 = r8.f66734j
            java.nio.ByteBuffer r4 = r8.f66747w
            if (r4 != 0) goto L_0x00a7
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.f66747w = r4
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.f66747w
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00a7:
            int r4 = r8.f66748x
            if (r4 != 0) goto L_0x00c3
            java.nio.ByteBuffer r4 = r8.f66747w
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.f66747w
            r5 = 8
            r6 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r6
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.f66747w
            r10.position(r3)
            r8.f66748x = r0
        L_0x00c3:
            java.nio.ByteBuffer r10 = r8.f66747w
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00da
            java.nio.ByteBuffer r11 = r8.f66747w
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00d7
            r8.f66748x = r3
            r10 = r11
            goto L_0x00f0
        L_0x00d7:
            if (r11 >= r10) goto L_0x00da
            goto L_0x0076
        L_0x00da:
            int r9 = r2.write(r9, r0, r1)
            if (r9 >= 0) goto L_0x00e3
            r8.f66748x = r3
            goto L_0x00e8
        L_0x00e3:
            int r10 = r8.f66748x
            int r10 = r10 - r9
            r8.f66748x = r10
        L_0x00e8:
            r10 = r9
            goto L_0x00f0
        L_0x00ea:
            android.media.AudioTrack r10 = r8.f66734j
            int r10 = r10.write(r9, r0, r1)
        L_0x00f0:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.f66728d0 = r4
            if (r10 < 0) goto L_0x0113
            boolean r9 = r8.f66740p
            if (r9 != 0) goto L_0x0102
            long r4 = r8.f66704J
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.f66704J = r4
        L_0x0102:
            if (r10 != r0) goto L_0x0112
            if (r9 == 0) goto L_0x010e
            long r9 = r8.f66705K
            int r11 = r8.f66706L
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.f66705K = r9
        L_0x010e:
            r9 = 0
            r8.f66715U = r9
            return r1
        L_0x0112:
            return r3
        L_0x0113:
            y6.k$h r9 = new y6.k$h
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p401y6.C23237k.mo36707n(java.nio.ByteBuffer, long):boolean");
    }
}
