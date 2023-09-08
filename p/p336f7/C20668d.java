package p336f7;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import p294b7.C16741e;
import p294b7.C16742f;
import p294b7.C16743g;
import p294b7.C16750m;
import p333e8.C20537k;
import p333e8.C20541m;
import p333e8.C20549u;
import p333e8.C20551y;
import p336f7.C20659a;
import p396x6.C23015n;

/* renamed from: f7.d */
public final class C20668d implements C16741e {

    /* renamed from: E */
    public static final int f58296E = C20551y.m22316f("seig");

    /* renamed from: F */
    public static final byte[] f58297F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: A */
    public C16743g f58298A;

    /* renamed from: B */
    public C16750m f58299B;

    /* renamed from: C */
    public C16750m[] f58300C;

    /* renamed from: D */
    public boolean f58301D;

    /* renamed from: a */
    public final int f58302a;

    /* renamed from: b */
    public final SparseArray<C20670b> f58303b = new SparseArray<>();

    /* renamed from: c */
    public final C20541m f58304c = new C20541m(C20537k.f57788a);

    /* renamed from: d */
    public final C20541m f58305d = new C20541m(5);

    /* renamed from: e */
    public final C20541m f58306e = new C20541m();

    /* renamed from: f */
    public final C20541m f58307f = new C20541m(1);

    /* renamed from: g */
    public final C20541m f58308g = new C20541m();

    /* renamed from: h */
    public final C20549u f58309h;

    /* renamed from: i */
    public final C20541m f58310i = new C20541m(16);

    /* renamed from: j */
    public final byte[] f58311j = new byte[16];

    /* renamed from: k */
    public final Stack<C20659a.C20660a> f58312k = new Stack<>();

    /* renamed from: l */
    public final LinkedList<C20669a> f58313l = new LinkedList<>();

    /* renamed from: m */
    public int f58314m = 0;

    /* renamed from: n */
    public int f58315n;

    /* renamed from: o */
    public long f58316o;

    /* renamed from: p */
    public int f58317p = 0;

    /* renamed from: q */
    public C20541m f58318q;

    /* renamed from: r */
    public long f58319r;

    /* renamed from: s */
    public int f58320s;

    /* renamed from: t */
    public long f58321t = -9223372036854775807L;

    /* renamed from: u */
    public long f58322u = -9223372036854775807L;

    /* renamed from: v */
    public C20670b f58323v;

    /* renamed from: w */
    public int f58324w;

    /* renamed from: x */
    public int f58325x;

    /* renamed from: y */
    public int f58326y;

    /* renamed from: z */
    public boolean f58327z;

    /* renamed from: f7.d$a */
    public static final class C20669a {

        /* renamed from: a */
        public final long f58328a;

        /* renamed from: b */
        public final int f58329b;

        public C20669a(long j, int i) {
            this.f58328a = j;
            this.f58329b = i;
        }
    }

    /* renamed from: f7.d$b */
    public static final class C20670b {

        /* renamed from: a */
        public final C20677j f58330a = new C20677j();

        /* renamed from: b */
        public final C16750m f58331b;

        /* renamed from: c */
        public C20675h f58332c;

        /* renamed from: d */
        public C20667c f58333d;

        /* renamed from: e */
        public int f58334e;

        /* renamed from: f */
        public int f58335f;

        /* renamed from: g */
        public int f58336g;

        public C20670b(C16750m mVar) {
            this.f58331b = mVar;
        }

        /* renamed from: a */
        public void mo32364a(C20675h hVar, C20667c cVar) {
            hVar.getClass();
            this.f58332c = hVar;
            cVar.getClass();
            this.f58333d = cVar;
            this.f58331b.mo17741a(hVar.f58393f);
            mo32365b();
        }

        /* renamed from: b */
        public void mo32365b() {
            C20677j jVar = this.f58330a;
            jVar.f58406d = 0;
            jVar.f58420r = 0;
            jVar.f58414l = false;
            jVar.f58419q = false;
            jVar.f58416n = null;
            this.f58334e = 0;
            this.f58336g = 0;
            this.f58335f = 0;
        }
    }

    public C20668d(int i, C20549u uVar) {
        this.f58302a = i | 0;
        this.f58309h = uVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.drm.DrmInitData m22590d(java.util.List<p336f7.C20659a.C20661b> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            if (r3 >= r0) goto L_0x0099
            java.lang.Object r5 = r14.get(r3)
            f7.a$b r5 = (p336f7.C20659a.C20661b) r5
            int r6 = r5.f58263a
            int r7 = p336f7.C20659a.f58207V
            if (r6 != r7) goto L_0x0095
            if (r4 != 0) goto L_0x001d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001d:
            e8.m r5 = r5.f58267P0
            byte[] r5 = r5.f57809a
            e8.m r6 = new e8.m
            r6.<init>((byte[]) r5)
            int r8 = r6.f57811c
            r9 = 32
            if (r8 >= r9) goto L_0x002d
            goto L_0x0074
        L_0x002d:
            r6.mo32113x(r1)
            int r8 = r6.mo32092c()
            int r9 = r6.f57811c
            int r10 = r6.f57810b
            int r9 = r9 - r10
            int r9 = r9 + 4
            if (r8 == r9) goto L_0x003e
            goto L_0x0074
        L_0x003e:
            int r8 = r6.mo32092c()
            if (r8 == r7) goto L_0x0045
            goto L_0x0074
        L_0x0045:
            int r7 = r6.mo32092c()
            int r7 = r7 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            if (r7 <= r8) goto L_0x0051
            goto L_0x0074
        L_0x0051:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.mo32098i()
            long r12 = r6.mo32098i()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x0069
            int r7 = r6.mo32106q()
            int r7 = r7 * 16
            r6.mo32114y(r7)
        L_0x0069:
            int r7 = r6.mo32106q()
            int r8 = r6.f57811c
            int r10 = r6.f57810b
            int r8 = r8 - r10
            if (r7 == r8) goto L_0x0076
        L_0x0074:
            r6 = r2
            goto L_0x007f
        L_0x0076:
            byte[] r8 = new byte[r7]
            r6.mo32091b(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L_0x007f:
            if (r6 != 0) goto L_0x0083
            r6 = r2
            goto L_0x0087
        L_0x0083:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L_0x0087:
            if (r6 != 0) goto L_0x008a
            goto L_0x0095
        L_0x008a:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r7 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        L_0x0095:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x0099:
            if (r4 != 0) goto L_0x009c
            goto L_0x00ad
        L_0x009c:
            com.google.android.exoplayer2.drm.DrmInitData r2 = new com.google.android.exoplayer2.drm.DrmInitData
            int r14 = r4.size()
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r14 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r14]
            java.lang.Object[] r14 = r4.toArray(r14)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r14 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r14
            r2.<init>(r1, r14)
        L_0x00ad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p336f7.C20668d.m22590d(java.util.List):com.google.android.exoplayer2.drm.DrmInitData");
    }

    /* renamed from: g */
    public static void m22591g(C20541m mVar, int i, C20677j jVar) {
        mVar.mo32113x(i + 8);
        int c = mVar.mo32092c();
        int i2 = C20659a.f58213b;
        int i3 = c & 16777215;
        if ((i3 & 1) == 0) {
            boolean z = (i3 & 2) != 0;
            int q = mVar.mo32106q();
            if (q == jVar.f58407e) {
                Arrays.fill(jVar.f58415m, 0, q, z);
                int i4 = mVar.f57811c - mVar.f57810b;
                C20541m mVar2 = jVar.f58418p;
                if (mVar2 == null || mVar2.f57811c < i4) {
                    jVar.f58418p = new C20541m(i4);
                }
                jVar.f58417o = i4;
                jVar.f58414l = true;
                jVar.f58419q = true;
                mVar.mo32091b(jVar.f58418p.f57809a, 0, i4);
                jVar.f58418p.mo32113x(0);
                jVar.f58419q = false;
                return;
            }
            throw new C23015n("Length mismatch: " + q + ", " + jVar.f58407e);
        }
        throw new C23015n("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:276:0x0621 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x02a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0002 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0004 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo17745a(p294b7.C16742f r26, p294b7.C16747k r27) {
        /*
            r25 = this;
            r0 = r25
        L_0x0002:
            r1 = r26
        L_0x0004:
            int r2 = r0.f58314m
            r3 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x045d
            if (r2 == r7) goto L_0x02fc
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 3
            if (r2 == r3) goto L_0x02a2
            r12 = 6
            if (r2 != r11) goto L_0x010f
            f7.d$b r2 = r0.f58323v
            if (r2 != 0) goto L_0x007c
            android.util.SparseArray<f7.d$b> r2 = r0.f58303b
            int r13 = r2.size()
            r14 = 0
            r15 = 0
        L_0x0024:
            if (r14 >= r13) goto L_0x0046
            java.lang.Object r16 = r2.valueAt(r14)
            r11 = r16
            f7.d$b r11 = (p336f7.C20668d.C20670b) r11
            int r5 = r11.f58336g
            f7.j r8 = r11.f58330a
            int r4 = r8.f58406d
            if (r5 != r4) goto L_0x0037
            goto L_0x0042
        L_0x0037:
            long[] r4 = r8.f58408f
            r19 = r4[r5]
            int r4 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0042
            r15 = r11
            r9 = r19
        L_0x0042:
            int r14 = r14 + 1
            r11 = 3
            goto L_0x0024
        L_0x0046:
            if (r15 != 0) goto L_0x0065
            long r2 = r0.f58319r
            r4 = r1
            b7.b r4 = (p294b7.C16738b) r4
            long r7 = r4.f45242c
            long r2 = r2 - r7
            int r3 = (int) r2
            if (r3 < 0) goto L_0x005d
            r4.mo17738f(r3)
            r0.f58314m = r6
            r0.f58317p = r6
            r7 = 0
            goto L_0x029f
        L_0x005d:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0065:
            f7.j r2 = r15.f58330a
            long[] r2 = r2.f58408f
            int r4 = r15.f58336g
            r4 = r2[r4]
            r2 = r1
            b7.b r2 = (p294b7.C16738b) r2
            long r8 = r2.f45242c
            long r4 = r4 - r8
            int r5 = (int) r4
            if (r5 >= 0) goto L_0x0077
            r5 = 0
        L_0x0077:
            r2.mo17738f(r5)
            r0.f58323v = r15
        L_0x007c:
            f7.d$b r2 = r0.f58323v
            f7.j r4 = r2.f58330a
            int[] r5 = r4.f58410h
            int r8 = r2.f58334e
            r5 = r5[r8]
            r0.f58324w = r5
            boolean r5 = r4.f58414l
            if (r5 == 0) goto L_0x00f3
            f7.c r5 = r4.f58403a
            int r5 = r5.f58292a
            f7.i r8 = r4.f58416n
            if (r8 == 0) goto L_0x0095
            goto L_0x00a0
        L_0x0095:
            f7.h r8 = r2.f58332c
            f7.i[] r8 = r8.f58398k
            if (r8 != 0) goto L_0x009d
            r5 = 0
            goto L_0x009f
        L_0x009d:
            r5 = r8[r5]
        L_0x009f:
            r8 = r5
        L_0x00a0:
            int r5 = r8.f58401c
            if (r5 == 0) goto L_0x00a7
            e8.m r8 = r4.f58418p
            goto L_0x00b2
        L_0x00a7:
            byte[] r5 = r8.f58402d
            e8.m r8 = r0.f58308g
            int r9 = r5.length
            r8.mo32111v(r5, r9)
            e8.m r8 = r0.f58308g
            int r5 = r5.length
        L_0x00b2:
            boolean[] r9 = r4.f58415m
            int r10 = r2.f58334e
            boolean r9 = r9[r10]
            e8.m r10 = r0.f58307f
            byte[] r11 = r10.f57809a
            if (r9 == 0) goto L_0x00c1
            r13 = 128(0x80, float:1.794E-43)
            goto L_0x00c2
        L_0x00c1:
            r13 = 0
        L_0x00c2:
            r13 = r13 | r5
            byte r13 = (byte) r13
            r11[r6] = r13
            r10.mo32113x(r6)
            b7.m r2 = r2.f58331b
            e8.m r10 = r0.f58307f
            r2.mo17742b(r10, r7)
            r2.mo17742b(r8, r5)
            if (r9 != 0) goto L_0x00d8
            int r5 = r5 + 1
            goto L_0x00eb
        L_0x00d8:
            e8.m r4 = r4.f58418p
            int r8 = r4.mo32108s()
            r9 = -2
            r4.mo32114y(r9)
            int r8 = r8 * 6
            int r8 = r8 + r3
            r2.mo17742b(r4, r8)
            int r5 = r5 + 1
            int r5 = r5 + r8
        L_0x00eb:
            r0.f58325x = r5
            int r2 = r0.f58324w
            int r2 = r2 + r5
            r0.f58324w = r2
            goto L_0x00f5
        L_0x00f3:
            r0.f58325x = r6
        L_0x00f5:
            f7.d$b r2 = r0.f58323v
            f7.h r2 = r2.f58332c
            int r2 = r2.f58394g
            if (r2 != r7) goto L_0x010a
            int r2 = r0.f58324w
            r4 = 8
            int r2 = r2 - r4
            r0.f58324w = r2
            r2 = r1
            b7.b r2 = (p294b7.C16738b) r2
            r2.mo17738f(r4)
        L_0x010a:
            r2 = 4
            r0.f58314m = r2
            r0.f58326y = r6
        L_0x010f:
            f7.d$b r2 = r0.f58323v
            f7.j r4 = r2.f58330a
            f7.h r5 = r2.f58332c
            b7.m r8 = r2.f58331b
            int r2 = r2.f58334e
            int r9 = r5.f58397j
            if (r9 == 0) goto L_0x01f9
            e8.m r13 = r0.f58305d
            byte[] r13 = r13.f57809a
            r13[r6] = r6
            r13[r7] = r6
            r13[r3] = r6
            int r3 = r9 + 1
            int r9 = 4 - r9
        L_0x012b:
            int r14 = r0.f58325x
            int r15 = r0.f58324w
            if (r14 >= r15) goto L_0x020a
            int r14 = r0.f58326y
            java.lang.String r15 = "video/hevc"
            if (r14 != 0) goto L_0x0198
            r14 = r1
            b7.b r14 = (p294b7.C16738b) r14
            r14.mo17737e(r13, r9, r3, r6)
            e8.m r14 = r0.f58305d
            r14.mo32113x(r6)
            e8.m r14 = r0.f58305d
            int r14 = r14.mo32106q()
            int r14 = r14 - r7
            r0.f58326y = r14
            e8.m r14 = r0.f58304c
            r14.mo32113x(r6)
            e8.m r14 = r0.f58304c
            r10 = 4
            r8.mo17742b(r14, r10)
            e8.m r11 = r0.f58305d
            r8.mo17742b(r11, r7)
            b7.m[] r11 = r0.f58300C
            if (r11 == 0) goto L_0x0189
            com.google.android.exoplayer2.Format r11 = r5.f58393f
            java.lang.String r11 = r11.f45777i
            byte r14 = r13[r10]
            byte[] r10 = p333e8.C20537k.f57788a
            java.lang.String r10 = "video/avc"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0175
            r10 = r14 & 31
            if (r10 == r12) goto L_0x0182
        L_0x0175:
            boolean r10 = r15.equals(r11)
            if (r10 == 0) goto L_0x0184
            r10 = r14 & 126(0x7e, float:1.77E-43)
            int r10 = r10 >> r7
            r11 = 39
            if (r10 != r11) goto L_0x0184
        L_0x0182:
            r10 = 1
            goto L_0x0185
        L_0x0184:
            r10 = 0
        L_0x0185:
            if (r10 == 0) goto L_0x0189
            r10 = 1
            goto L_0x018a
        L_0x0189:
            r10 = 0
        L_0x018a:
            r0.f58327z = r10
            int r10 = r0.f58325x
            int r10 = r10 + 5
            r0.f58325x = r10
            int r10 = r0.f58324w
            int r10 = r10 + r9
            r0.f58324w = r10
            goto L_0x012b
        L_0x0198:
            boolean r10 = r0.f58327z
            if (r10 == 0) goto L_0x01e8
            e8.m r10 = r0.f58306e
            r10.mo32110u(r14)
            e8.m r10 = r0.f58306e
            byte[] r10 = r10.f57809a
            int r11 = r0.f58326y
            r14 = r1
            b7.b r14 = (p294b7.C16738b) r14
            r14.mo17737e(r10, r6, r11, r6)
            e8.m r10 = r0.f58306e
            int r11 = r0.f58326y
            r8.mo17742b(r10, r11)
            int r10 = r0.f58326y
            e8.m r11 = r0.f58306e
            byte[] r14 = r11.f57809a
            int r11 = r11.f57811c
            int r11 = p333e8.C20537k.m22258e(r14, r11)
            e8.m r14 = r0.f58306e
            com.google.android.exoplayer2.Format r12 = r5.f58393f
            java.lang.String r12 = r12.f45777i
            boolean r12 = r15.equals(r12)
            r14.mo32113x(r12)
            e8.m r12 = r0.f58306e
            r12.mo32112w(r11)
            long[] r11 = r4.f58412j
            r14 = r11[r2]
            int[] r11 = r4.f58411i
            r11 = r11[r2]
            long r11 = (long) r11
            long r14 = r14 + r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r11
            e8.m r11 = r0.f58306e
            b7.m[] r12 = r0.f58300C
            p386u7.C22610g.m26471a(r14, r11, r12)
            goto L_0x01ec
        L_0x01e8:
            int r10 = r8.mo17743c(r1, r14, r6)
        L_0x01ec:
            int r11 = r0.f58325x
            int r11 = r11 + r10
            r0.f58325x = r11
            int r11 = r0.f58326y
            int r11 = r11 - r10
            r0.f58326y = r11
            r12 = 6
            goto L_0x012b
        L_0x01f9:
            int r3 = r0.f58325x
            int r9 = r0.f58324w
            if (r3 >= r9) goto L_0x020a
            int r9 = r9 - r3
            int r3 = r8.mo17743c(r1, r9, r6)
            int r9 = r0.f58325x
            int r9 = r9 + r3
            r0.f58325x = r9
            goto L_0x01f9
        L_0x020a:
            long[] r3 = r4.f58412j
            r9 = r3[r2]
            int[] r3 = r4.f58411i
            r3 = r3[r2]
            long r11 = (long) r3
            long r9 = r9 + r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            e8.u r3 = r0.f58309h
            if (r3 == 0) goto L_0x0220
            long r9 = r3.mo32130a(r9)
        L_0x0220:
            boolean[] r3 = r4.f58413k
            boolean r2 = r3[r2]
            boolean r3 = r4.f58414l
            if (r3 == 0) goto L_0x0243
            r3 = 1073741824(0x40000000, float:2.0)
            r2 = r2 | r3
            f7.i r3 = r4.f58416n
            if (r3 == 0) goto L_0x0230
            goto L_0x023c
        L_0x0230:
            f7.c r3 = r4.f58403a
            int r3 = r3.f58292a
            f7.i[] r5 = r5.f58398k
            if (r5 != 0) goto L_0x023a
            r3 = 0
            goto L_0x023c
        L_0x023a:
            r3 = r5[r3]
        L_0x023c:
            b7.m$a r3 = r3.f58400b
            r21 = r2
            r24 = r3
            goto L_0x0247
        L_0x0243:
            r21 = r2
            r24 = 0
        L_0x0247:
            int r2 = r0.f58324w
            r23 = 0
            r18 = r8
            r19 = r9
            r22 = r2
            r18.mo17744d(r19, r21, r22, r23, r24)
        L_0x0254:
            java.util.LinkedList<f7.d$a> r2 = r0.f58313l
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x027f
            java.util.LinkedList<f7.d$a> r2 = r0.f58313l
            java.lang.Object r2 = r2.removeFirst()
            f7.d$a r2 = (p336f7.C20668d.C20669a) r2
            int r3 = r0.f58320s
            int r5 = r2.f58329b
            int r3 = r3 - r5
            r0.f58320s = r3
            b7.m r8 = r0.f58299B
            long r11 = r2.f58328a
            long r18 = r9 + r11
            r20 = 1
            r23 = 0
            r17 = r8
            r21 = r5
            r22 = r3
            r17.mo17744d(r18, r20, r21, r22, r23)
            goto L_0x0254
        L_0x027f:
            f7.d$b r2 = r0.f58323v
            int r3 = r2.f58334e
            int r3 = r3 + r7
            r2.f58334e = r3
            int r3 = r2.f58335f
            int r3 = r3 + r7
            r2.f58335f = r3
            int[] r4 = r4.f58409g
            int r5 = r2.f58336g
            r4 = r4[r5]
            if (r3 != r4) goto L_0x029c
            int r5 = r5 + 1
            r2.f58336g = r5
            r2.f58335f = r6
            r2 = 0
            r0.f58323v = r2
        L_0x029c:
            r2 = 3
            r0.f58314m = r2
        L_0x029f:
            if (r7 == 0) goto L_0x0004
            return r6
        L_0x02a2:
            android.util.SparseArray<f7.d$b> r2 = r0.f58303b
            int r2 = r2.size()
            r3 = 0
            r5 = 0
        L_0x02aa:
            if (r3 >= r2) goto L_0x02cd
            android.util.SparseArray<f7.d$b> r4 = r0.f58303b
            java.lang.Object r4 = r4.valueAt(r3)
            f7.d$b r4 = (p336f7.C20668d.C20670b) r4
            f7.j r4 = r4.f58330a
            boolean r7 = r4.f58419q
            if (r7 == 0) goto L_0x02ca
            long r7 = r4.f58405c
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x02ca
            android.util.SparseArray<f7.d$b> r4 = r0.f58303b
            java.lang.Object r4 = r4.valueAt(r3)
            f7.d$b r4 = (p336f7.C20668d.C20670b) r4
            r5 = r4
            r9 = r7
        L_0x02ca:
            int r3 = r3 + 1
            goto L_0x02aa
        L_0x02cd:
            if (r5 != 0) goto L_0x02d4
            r2 = 3
            r0.f58314m = r2
            goto L_0x0004
        L_0x02d4:
            r2 = r1
            b7.b r2 = (p294b7.C16738b) r2
            long r3 = r2.f45242c
            long r9 = r9 - r3
            int r3 = (int) r9
            if (r3 < 0) goto L_0x02f4
            r2.mo17738f(r3)
            f7.j r3 = r5.f58330a
            e8.m r4 = r3.f58418p
            byte[] r4 = r4.f57809a
            int r5 = r3.f58417o
            r2.mo17737e(r4, r6, r5, r6)
            e8.m r2 = r3.f58418p
            r2.mo32113x(r6)
            r3.f58419q = r6
            goto L_0x0004
        L_0x02f4:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x02fc:
            long r4 = r0.f58316o
            int r2 = (int) r4
            int r4 = r0.f58317p
            int r2 = r2 - r4
            e8.m r4 = r0.f58318q
            if (r4 == 0) goto L_0x044b
            byte[] r4 = r4.f57809a
            r5 = r1
            b7.b r5 = (p294b7.C16738b) r5
            r8 = 8
            r5.mo17737e(r4, r8, r2, r6)
            f7.a$b r2 = new f7.a$b
            int r4 = r0.f58315n
            e8.m r8 = r0.f58318q
            r2.<init>(r4, r8)
            long r9 = r5.f45242c
            java.util.Stack<f7.a$a> r5 = r0.f58312k
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0334
            java.util.Stack<f7.a$a> r3 = r0.f58312k
            java.lang.Object r3 = r3.peek()
            f7.a$a r3 = (p336f7.C20659a.C20660a) r3
            java.util.List<f7.a$b> r3 = r3.f58265Q0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r2)
            goto L_0x0452
        L_0x0334:
            int r2 = p336f7.C20659a.f58173B
            if (r4 != r2) goto L_0x03f4
            r2 = 8
            r8.mo32113x(r2)
            int r2 = r8.mo32092c()
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            r4 = 4
            r8.mo32114y(r4)
            long r4 = r8.mo32104o()
            if (r2 != 0) goto L_0x0358
            long r11 = r8.mo32104o()
            long r13 = r8.mo32104o()
            goto L_0x0360
        L_0x0358:
            long r11 = r8.mo32107r()
            long r13 = r8.mo32107r()
        L_0x0360:
            r18 = r11
            long r9 = r9 + r13
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r18
            r15 = r4
            long r20 = p333e8.C20551y.m22320j(r11, r13, r15)
            r8.mo32114y(r3)
            int r2 = r8.mo32108s()
            int[] r3 = new int[r2]
            long[] r15 = new long[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r11 = r20
        L_0x037e:
            if (r6 >= r2) goto L_0x03cd
            int r16 = r8.mo32092c()
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = r16 & r22
            if (r22 != 0) goto L_0x03c5
            long r22 = r8.mo32104o()
            r24 = 2147483647(0x7fffffff, float:NaN)
            r16 = r16 & r24
            r3[r6] = r16
            r15[r6] = r9
            r14[r6] = r11
            long r18 = r18 + r22
            r22 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r18
            r24 = r2
            r7 = r13
            r2 = r14
            r13 = r22
            r1 = r15
            r15 = r4
            long r11 = p333e8.C20551y.m22320j(r11, r13, r15)
            r13 = r2[r6]
            long r13 = r11 - r13
            r7[r6] = r13
            r13 = 4
            r8.mo32114y(r13)
            r14 = r3[r6]
            long r14 = (long) r14
            long r9 = r9 + r14
            int r6 = r6 + 1
            r15 = r1
            r14 = r2
            r13 = r7
            r2 = r24
            r7 = 1
            r1 = r26
            goto L_0x037e
        L_0x03c5:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x03cd:
            r7 = r13
            r2 = r14
            r1 = r15
            java.lang.Long r4 = java.lang.Long.valueOf(r20)
            b7.a r5 = new b7.a
            r5.<init>(r3, r1, r7, r2)
            android.util.Pair r1 = android.util.Pair.create(r4, r5)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.f58322u = r2
            b7.g r2 = r0.f58298A
            java.lang.Object r1 = r1.second
            b7.l r1 = (p294b7.C16748l) r1
            r2.mo17750g(r1)
            r1 = 1
            r0.f58301D = r1
            goto L_0x0452
        L_0x03f4:
            int r1 = p336f7.C20659a.f58184G0
            if (r4 != r1) goto L_0x0452
            b7.m r1 = r0.f58299B
            if (r1 != 0) goto L_0x03fd
            goto L_0x0452
        L_0x03fd:
            r1 = 12
            r8.mo32113x(r1)
            r8.mo32099j()
            r8.mo32099j()
            long r6 = r8.mo32104o()
            long r2 = r8.mo32104o()
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = p333e8.C20551y.m22320j(r2, r4, r6)
            r8.mo32113x(r1)
            int r1 = r8.f57811c
            int r4 = r8.f57810b
            int r13 = r1 - r4
            b7.m r1 = r0.f58299B
            r1.mo17742b(r8, r13)
            long r4 = r0.f58322u
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x043b
            b7.m r9 = r0.f58299B
            long r10 = r4 + r2
            r12 = 1
            r14 = 0
            r15 = 0
            r9.mo17744d(r10, r12, r13, r14, r15)
            goto L_0x0452
        L_0x043b:
            java.util.LinkedList<f7.d$a> r1 = r0.f58313l
            f7.d$a r4 = new f7.d$a
            r4.<init>(r2, r13)
            r1.addLast(r4)
            int r1 = r0.f58320s
            int r1 = r1 + r13
            r0.f58320s = r1
            goto L_0x0452
        L_0x044b:
            r1 = r26
            b7.b r1 = (p294b7.C16738b) r1
            r1.mo17738f(r2)
        L_0x0452:
            r1 = r26
            b7.b r1 = (p294b7.C16738b) r1
            long r1 = r1.f45242c
            r0.mo32363h(r1)
            goto L_0x0002
        L_0x045d:
            int r1 = r0.f58317p
            if (r1 != 0) goto L_0x048b
            e8.m r1 = r0.f58310i
            byte[] r1 = r1.f57809a
            r2 = r26
            b7.b r2 = (p294b7.C16738b) r2
            r4 = 8
            r5 = 1
            boolean r1 = r2.mo17737e(r1, r6, r4, r5)
            if (r1 != 0) goto L_0x0474
            goto L_0x061f
        L_0x0474:
            r0.f58317p = r4
            e8.m r1 = r0.f58310i
            r1.mo32113x(r6)
            e8.m r1 = r0.f58310i
            long r1 = r1.mo32104o()
            r0.f58316o = r1
            e8.m r1 = r0.f58310i
            int r1 = r1.mo32092c()
            r0.f58315n = r1
        L_0x048b:
            long r1 = r0.f58316o
            r4 = 1
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x04ae
            e8.m r1 = r0.f58310i
            byte[] r1 = r1.f57809a
            r2 = r26
            b7.b r2 = (p294b7.C16738b) r2
            r4 = 8
            r2.mo17737e(r1, r4, r4, r6)
            int r1 = r0.f58317p
            int r1 = r1 + r4
            r0.f58317p = r1
            e8.m r1 = r0.f58310i
            long r1 = r1.mo32107r()
            r0.f58316o = r1
            goto L_0x04df
        L_0x04ae:
            r4 = 0
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x04df
            r1 = r26
            b7.b r1 = (p294b7.C16738b) r1
            long r4 = r1.f45241b
            r7 = -1
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x04d2
            java.util.Stack<f7.a$a> r2 = r0.f58312k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x04d2
            java.util.Stack<f7.a$a> r2 = r0.f58312k
            java.lang.Object r2 = r2.peek()
            f7.a$a r2 = (p336f7.C20659a.C20660a) r2
            long r4 = r2.f58264P0
        L_0x04d2:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x04df
            long r1 = r1.f45242c
            long r4 = r4 - r1
            int r1 = r0.f58317p
            long r1 = (long) r1
            long r4 = r4 + r1
            r0.f58316o = r4
        L_0x04df:
            long r1 = r0.f58316o
            int r4 = r0.f58317p
            long r4 = (long) r4
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x062b
            r1 = r26
            b7.b r1 = (p294b7.C16738b) r1
            long r7 = r1.f45242c
            long r7 = r7 - r4
            int r2 = r0.f58315n
            int r4 = p336f7.C20659a.f58193L
            if (r2 != r4) goto L_0x0512
            android.util.SparseArray<f7.d$b> r2 = r0.f58303b
            int r2 = r2.size()
            r4 = 0
        L_0x04fc:
            if (r4 >= r2) goto L_0x0512
            android.util.SparseArray<f7.d$b> r5 = r0.f58303b
            java.lang.Object r5 = r5.valueAt(r4)
            f7.d$b r5 = (p336f7.C20668d.C20670b) r5
            f7.j r5 = r5.f58330a
            r5.getClass()
            r5.f58405c = r7
            r5.f58404b = r7
            int r4 = r4 + 1
            goto L_0x04fc
        L_0x0512:
            int r2 = r0.f58315n
            int r4 = p336f7.C20659a.f58227i
            if (r2 != r4) goto L_0x0538
            r4 = 0
            r0.f58323v = r4
            long r1 = r0.f58316o
            long r7 = r7 + r1
            r0.f58319r = r7
            boolean r1 = r0.f58301D
            if (r1 != 0) goto L_0x0533
            b7.g r1 = r0.f58298A
            b7.l$a r2 = new b7.l$a
            long r4 = r0.f58321t
            r2.<init>(r4)
            r1.mo17750g(r2)
            r1 = 1
            r0.f58301D = r1
        L_0x0533:
            r0.f58314m = r3
        L_0x0535:
            r1 = 1
            goto L_0x061e
        L_0x0538:
            int r3 = p336f7.C20659a.f58175C
            if (r2 == r3) goto L_0x055f
            int r3 = p336f7.C20659a.f58179E
            if (r2 == r3) goto L_0x055f
            int r3 = p336f7.C20659a.f58181F
            if (r2 == r3) goto L_0x055f
            int r3 = p336f7.C20659a.f58183G
            if (r2 == r3) goto L_0x055f
            int r3 = p336f7.C20659a.f58185H
            if (r2 == r3) goto L_0x055f
            int r3 = p336f7.C20659a.f58193L
            if (r2 == r3) goto L_0x055f
            int r3 = p336f7.C20659a.f58195M
            if (r2 == r3) goto L_0x055f
            int r3 = p336f7.C20659a.f58197N
            if (r2 == r3) goto L_0x055f
            int r3 = p336f7.C20659a.f58202Q
            if (r2 != r3) goto L_0x055d
            goto L_0x055f
        L_0x055d:
            r3 = 0
            goto L_0x0560
        L_0x055f:
            r3 = 1
        L_0x0560:
            if (r3 == 0) goto L_0x0588
            long r1 = r1.f45242c
            long r3 = r0.f58316o
            long r1 = r1 + r3
            r3 = 8
            long r1 = r1 - r3
            java.util.Stack<f7.a$a> r3 = r0.f58312k
            f7.a$a r4 = new f7.a$a
            int r5 = r0.f58315n
            r4.<init>(r5, r1)
            r3.add(r4)
            long r3 = r0.f58316o
            int r5 = r0.f58317p
            long r7 = (long) r5
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0583
            r0.mo32363h(r1)
            goto L_0x0535
        L_0x0583:
            r0.f58314m = r6
            r0.f58317p = r6
            goto L_0x0535
        L_0x0588:
            int r1 = p336f7.C20659a.f58205T
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58204S
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58177D
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58173B
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58206U
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58257x
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58259y
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58201P
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58261z
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58171A
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58207V
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58218d0
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58220e0
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58228i0
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58226h0
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58222f0
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58224g0
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58203R
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58199O
            if (r2 == r1) goto L_0x05db
            int r1 = p336f7.C20659a.f58184G0
            if (r2 != r1) goto L_0x05d9
            goto L_0x05db
        L_0x05d9:
            r1 = 0
            goto L_0x05dc
        L_0x05db:
            r1 = 1
        L_0x05dc:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x0612
            int r1 = r0.f58317p
            r4 = 8
            if (r1 != r4) goto L_0x060a
            long r7 = r0.f58316o
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0602
            e8.m r1 = new e8.m
            int r2 = (int) r7
            r1.<init>((int) r2)
            r0.f58318q = r1
            e8.m r2 = r0.f58310i
            byte[] r2 = r2.f57809a
            byte[] r1 = r1.f57809a
            java.lang.System.arraycopy(r2, r6, r1, r6, r4)
            r1 = 1
            r0.f58314m = r1
            goto L_0x061e
        L_0x0602:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x060a:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0612:
            long r4 = r0.f58316o
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0623
            r1 = 0
            r0.f58318q = r1
            r1 = 1
            r0.f58314m = r1
        L_0x061e:
            r6 = 1
        L_0x061f:
            if (r6 != 0) goto L_0x0002
            r1 = -1
            return r1
        L_0x0623:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x062b:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p336f7.C20668d.mo17745a(b7.f, b7.k):int");
    }

    /* renamed from: b */
    public void mo17746b(long j, long j2) {
        int size = this.f58303b.size();
        for (int i = 0; i < size; i++) {
            this.f58303b.valueAt(i).mo32365b();
        }
        this.f58313l.clear();
        this.f58320s = 0;
        this.f58312k.clear();
        this.f58314m = 0;
        this.f58317p = 0;
    }

    /* renamed from: c */
    public boolean mo17747c(C16742f fVar) {
        return C20674g.m22612a(fVar, true);
    }

    /* renamed from: e */
    public void mo17748e(C16743g gVar) {
        this.f58298A = gVar;
    }

    /* renamed from: f */
    public final void mo32362f() {
        if ((this.f58302a & 4) != 0 && this.f58299B == null) {
            C16750m o = this.f58298A.mo17752o(this.f58303b.size(), 4);
            this.f58299B = o;
            o.mo17741a(Format.m16644e((String) null, MimeTypes.APPLICATION_EMSG, MAlarmHandler.NEXT_FIRE_INTERVAL));
        }
        if ((this.f58302a & 8) != 0 && this.f58300C == null) {
            C16750m o2 = this.f58298A.mo17752o(this.f58303b.size() + 1, 3);
            o2.mo17741a(Format.m16647h((String) null, MimeTypes.APPLICATION_CEA608, 0, (String) null, (DrmInitData) null));
            this.f58300C = new C16750m[]{o2};
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x063a  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32363h(long r57) {
        /*
            r56 = this;
            r0 = r56
            r1 = r0
        L_0x0003:
            java.util.Stack<f7.a$a> r2 = r1.f58312k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0761
            java.util.Stack<f7.a$a> r2 = r1.f58312k
            java.lang.Object r2 = r2.peek()
            f7.a$a r2 = (p336f7.C20659a.C20660a) r2
            long r4 = r2.f58264P0
            int r2 = (r4 > r57 ? 1 : (r4 == r57 ? 0 : -1))
            if (r2 != 0) goto L_0x0761
            java.util.Stack<f7.a$a> r2 = r1.f58312k
            java.lang.Object r2 = r2.pop()
            f7.a$a r2 = (p336f7.C20659a.C20660a) r2
            int r4 = r2.f58263a
            int r5 = p336f7.C20659a.f58175C
            r6 = 12
            r7 = 8
            if (r4 != r5) goto L_0x017d
            java.util.List<f7.a$b> r4 = r2.f58265Q0
            com.google.android.exoplayer2.drm.DrmInitData r4 = m22590d(r4)
            int r5 = p336f7.C20659a.f58197N
            f7.a$a r5 = r2.mo32356b(r5)
            android.util.SparseArray r15 = new android.util.SparseArray
            r15.<init>()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<f7.a$b> r11 = r5.f58265Q0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            r16 = r9
            r9 = 0
        L_0x004c:
            if (r9 >= r11) goto L_0x00b7
            java.util.List<f7.a$b> r10 = r5.f58265Q0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r10 = r10.get(r9)
            f7.a$b r10 = (p336f7.C20659a.C20661b) r10
            int r12 = r10.f58263a
            int r13 = p336f7.C20659a.f58261z
            if (r12 != r13) goto L_0x0094
            e8.m r10 = r10.f58267P0
            r10.mo32113x(r6)
            int r12 = r10.mo32092c()
            int r13 = r10.mo32106q()
            int r13 = r13 + -1
            int r14 = r10.mo32106q()
            int r3 = r10.mo32106q()
            int r10 = r10.mo32092c()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            f7.c r6 = new f7.c
            r6.<init>(r13, r14, r3, r10)
            android.util.Pair r3 = android.util.Pair.create(r12, r6)
            java.lang.Object r6 = r3.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r3 = r3.second
            r15.put(r6, r3)
            goto L_0x00b2
        L_0x0094:
            int r3 = p336f7.C20659a.f58199O
            if (r12 != r3) goto L_0x00b2
            e8.m r3 = r10.f58267P0
            r3.mo32113x(r7)
            int r6 = r3.mo32092c()
            int r6 = r6 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 != 0) goto L_0x00ac
            long r12 = r3.mo32104o()
            goto L_0x00b0
        L_0x00ac:
            long r12 = r3.mo32107r()
        L_0x00b0:
            r16 = r12
        L_0x00b2:
            int r9 = r9 + 1
            r6 = 12
            goto L_0x004c
        L_0x00b7:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.List<f7.a$a> r5 = r2.f58266R0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r6 = 0
        L_0x00c5:
            if (r6 >= r5) goto L_0x00fe
            java.util.List<f7.a$a> r7 = r2.f58266R0
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = r7.get(r6)
            r9 = r7
            f7.a$a r9 = (p336f7.C20659a.C20660a) r9
            int r7 = r9.f58263a
            int r10 = p336f7.C20659a.f58179E
            if (r7 != r10) goto L_0x00f9
            int r7 = p336f7.C20659a.f58177D
            f7.a$b r10 = r2.mo32357c(r7)
            int r7 = r1.f58302a
            r7 = r7 & 32
            if (r7 == 0) goto L_0x00e6
            r14 = 1
            goto L_0x00e7
        L_0x00e6:
            r14 = 0
        L_0x00e7:
            r7 = 0
            r11 = r16
            r13 = r4
            r8 = r15
            r15 = r7
            f7.h r7 = p336f7.C20662b.m22579d(r9, r10, r11, r13, r14, r15)
            if (r7 == 0) goto L_0x00fa
            int r9 = r7.f58388a
            r3.put(r9, r7)
            goto L_0x00fa
        L_0x00f9:
            r8 = r15
        L_0x00fa:
            int r6 = r6 + 1
            r15 = r8
            goto L_0x00c5
        L_0x00fe:
            r8 = r15
            int r2 = r3.size()
            android.util.SparseArray<f7.d$b> r4 = r1.f58303b
            int r4 = r4.size()
            if (r4 != 0) goto L_0x0149
            r4 = 0
        L_0x010c:
            if (r4 >= r2) goto L_0x0140
            java.lang.Object r5 = r3.valueAt(r4)
            f7.h r5 = (p336f7.C20675h) r5
            f7.d$b r6 = new f7.d$b
            b7.g r7 = r1.f58298A
            int r9 = r5.f58389b
            b7.m r7 = r7.mo17752o(r4, r9)
            r6.<init>(r7)
            int r7 = r5.f58388a
            java.lang.Object r7 = r8.get(r7)
            f7.c r7 = (p336f7.C20667c) r7
            r6.mo32364a(r5, r7)
            android.util.SparseArray<f7.d$b> r7 = r1.f58303b
            int r9 = r5.f58388a
            r7.put(r9, r6)
            long r6 = r1.f58321t
            long r9 = r5.f58392e
            long r5 = java.lang.Math.max(r6, r9)
            r1.f58321t = r5
            int r4 = r4 + 1
            goto L_0x010c
        L_0x0140:
            r56.mo32362f()
            b7.g r2 = r1.f58298A
            r2.mo17751i()
            goto L_0x017a
        L_0x0149:
            android.util.SparseArray<f7.d$b> r4 = r1.f58303b
            int r4 = r4.size()
            if (r4 != r2) goto L_0x0154
            r20 = 1
            goto L_0x0156
        L_0x0154:
            r20 = 0
        L_0x0156:
            p333e8.C20528a.m22240d(r20)
            r4 = 0
        L_0x015a:
            if (r4 >= r2) goto L_0x017a
            java.lang.Object r5 = r3.valueAt(r4)
            f7.h r5 = (p336f7.C20675h) r5
            android.util.SparseArray<f7.d$b> r6 = r1.f58303b
            int r7 = r5.f58388a
            java.lang.Object r6 = r6.get(r7)
            f7.d$b r6 = (p336f7.C20668d.C20670b) r6
            int r7 = r5.f58388a
            java.lang.Object r7 = r8.get(r7)
            f7.c r7 = (p336f7.C20667c) r7
            r6.mo32364a(r5, r7)
            int r4 = r4 + 1
            goto L_0x015a
        L_0x017a:
            r3 = r0
            goto L_0x075e
        L_0x017d:
            int r3 = p336f7.C20659a.f58193L
            if (r4 != r3) goto L_0x0746
            android.util.SparseArray<f7.d$b> r3 = r1.f58303b
            int r4 = r1.f58302a
            byte[] r1 = r1.f58311j
            java.util.List<f7.a$a> r5 = r2.f58266R0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r6 = 0
        L_0x0190:
            if (r6 >= r5) goto L_0x0699
            java.util.List<f7.a$a> r9 = r2.f58266R0
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r9 = r9.get(r6)
            f7.a$a r9 = (p336f7.C20659a.C20660a) r9
            int r10 = r9.f58263a
            int r11 = p336f7.C20659a.f58195M
            if (r10 != r11) goto L_0x0676
            int r10 = p336f7.C20659a.f58259y
            f7.a$b r10 = r9.mo32357c(r10)
            e8.m r10 = r10.f58267P0
            r10.mo32113x(r7)
            int r11 = r10.mo32092c()
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r12
            int r13 = r10.mo32092c()
            r14 = r4 & 16
            if (r14 != 0) goto L_0x01be
            goto L_0x01bf
        L_0x01be:
            r13 = 0
        L_0x01bf:
            java.lang.Object r13 = r3.get(r13)
            f7.d$b r13 = (p336f7.C20668d.C20670b) r13
            if (r13 != 0) goto L_0x01c9
            r13 = 0
            goto L_0x0212
        L_0x01c9:
            r14 = r11 & 1
            if (r14 == 0) goto L_0x01d7
            long r14 = r10.mo32107r()
            f7.j r8 = r13.f58330a
            r8.f58404b = r14
            r8.f58405c = r14
        L_0x01d7:
            f7.c r8 = r13.f58333d
            r14 = r11 & 2
            if (r14 == 0) goto L_0x01e4
            int r14 = r10.mo32106q()
            int r14 = r14 + -1
            goto L_0x01e6
        L_0x01e4:
            int r14 = r8.f58292a
        L_0x01e6:
            r15 = r11 & 8
            if (r15 == 0) goto L_0x01ef
            int r15 = r10.mo32106q()
            goto L_0x01f1
        L_0x01ef:
            int r15 = r8.f58293b
        L_0x01f1:
            r17 = r11 & 16
            if (r17 == 0) goto L_0x01fc
            int r17 = r10.mo32106q()
            r12 = r17
            goto L_0x01fe
        L_0x01fc:
            int r12 = r8.f58294c
        L_0x01fe:
            r11 = r11 & 32
            if (r11 == 0) goto L_0x0207
            int r8 = r10.mo32106q()
            goto L_0x0209
        L_0x0207:
            int r8 = r8.f58295d
        L_0x0209:
            f7.j r10 = r13.f58330a
            f7.c r11 = new f7.c
            r11.<init>(r14, r15, r12, r8)
            r10.f58403a = r11
        L_0x0212:
            if (r13 != 0) goto L_0x0216
            goto L_0x0676
        L_0x0216:
            f7.j r8 = r13.f58330a
            long r10 = r8.f58420r
            r13.mo32365b()
            int r12 = p336f7.C20659a.f58257x
            f7.a$b r14 = r9.mo32357c(r12)
            if (r14 == 0) goto L_0x0246
            r14 = r4 & 2
            if (r14 != 0) goto L_0x0246
            f7.a$b r10 = r9.mo32357c(r12)
            e8.m r10 = r10.f58267P0
            r10.mo32113x(r7)
            int r11 = r10.mo32092c()
            int r11 = r11 >> 24
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 1
            if (r11 != r12) goto L_0x0242
            long r10 = r10.mo32107r()
            goto L_0x0246
        L_0x0242:
            long r10 = r10.mo32104o()
        L_0x0246:
            java.util.List<f7.a$b> r12 = r9.f58265Q0
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r14 = r12.size()
            r22 = r3
            r3 = 0
            r7 = 0
            r15 = 0
        L_0x0253:
            if (r15 >= r14) goto L_0x0281
            java.lang.Object r23 = r12.get(r15)
            r24 = r5
            r5 = r23
            f7.a$b r5 = (p336f7.C20659a.C20661b) r5
            r25 = r10
            int r10 = r5.f58263a
            int r11 = p336f7.C20659a.f58171A
            if (r10 != r11) goto L_0x0278
            e8.m r5 = r5.f58267P0
            r10 = 12
            r5.mo32113x(r10)
            int r5 = r5.mo32106q()
            if (r5 <= 0) goto L_0x027a
            int r3 = r3 + r5
            int r7 = r7 + 1
            goto L_0x027a
        L_0x0278:
            r10 = 12
        L_0x027a:
            int r15 = r15 + 1
            r5 = r24
            r10 = r25
            goto L_0x0253
        L_0x0281:
            r24 = r5
            r25 = r10
            r5 = 0
            r10 = 12
            r13.f58336g = r5
            r13.f58335f = r5
            r13.f58334e = r5
            f7.j r5 = r13.f58330a
            r5.f58406d = r7
            r5.f58407e = r3
            int[] r11 = r5.f58409g
            if (r11 == 0) goto L_0x029b
            int r11 = r11.length
            if (r11 >= r7) goto L_0x02a3
        L_0x029b:
            long[] r11 = new long[r7]
            r5.f58408f = r11
            int[] r7 = new int[r7]
            r5.f58409g = r7
        L_0x02a3:
            int[] r7 = r5.f58410h
            if (r7 == 0) goto L_0x02aa
            int r7 = r7.length
            if (r7 >= r3) goto L_0x02c2
        L_0x02aa:
            int r3 = r3 * 125
            int r3 = r3 / 100
            int[] r7 = new int[r3]
            r5.f58410h = r7
            int[] r7 = new int[r3]
            r5.f58411i = r7
            long[] r7 = new long[r3]
            r5.f58412j = r7
            boolean[] r7 = new boolean[r3]
            r5.f58413k = r7
            boolean[] r3 = new boolean[r3]
            r5.f58415m = r3
        L_0x02c2:
            r3 = 0
            r5 = 0
            r7 = 0
        L_0x02c5:
            r27 = 0
            if (r3 >= r14) goto L_0x0453
            java.lang.Object r19 = r12.get(r3)
            r10 = r19
            f7.a$b r10 = (p336f7.C20659a.C20661b) r10
            int r15 = r10.f58263a
            int r11 = p336f7.C20659a.f58171A
            if (r15 != r11) goto L_0x0423
            int r11 = r7 + 1
            e8.m r10 = r10.f58267P0
            r15 = 8
            r10.mo32113x(r15)
            int r15 = r10.mo32092c()
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r15 = r15 & r17
            r30 = r11
            f7.h r11 = r13.f58332c
            r31 = r12
            f7.j r12 = r13.f58330a
            r32 = r14
            f7.c r14 = r12.f58403a
            int[] r0 = r12.f58409g
            int r33 = r10.mo32106q()
            r0[r7] = r33
            long[] r0 = r12.f58408f
            r34 = r1
            r33 = r2
            long r1 = r12.f58404b
            r0[r7] = r1
            r35 = r15 & 1
            if (r35 == 0) goto L_0x031a
            r35 = r6
            int r6 = r10.mo32092c()
            r37 = r8
            r36 = r9
            long r8 = (long) r6
            long r1 = r1 + r8
            r0[r7] = r1
            goto L_0x0320
        L_0x031a:
            r35 = r6
            r37 = r8
            r36 = r9
        L_0x0320:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x0326
            r0 = 1
            goto L_0x0327
        L_0x0326:
            r0 = 0
        L_0x0327:
            int r1 = r14.f58295d
            if (r0 == 0) goto L_0x032f
            int r1 = r10.mo32106q()
        L_0x032f:
            r2 = r15 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0335
            r2 = 1
            goto L_0x0336
        L_0x0335:
            r2 = 0
        L_0x0336:
            r6 = r15 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x033c
            r6 = 1
            goto L_0x033d
        L_0x033c:
            r6 = 0
        L_0x033d:
            r8 = r15 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x0343
            r8 = 1
            goto L_0x0344
        L_0x0343:
            r8 = 0
        L_0x0344:
            r9 = r15 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x034a
            r9 = 1
            goto L_0x034b
        L_0x034a:
            r9 = 0
        L_0x034b:
            long[] r15 = r11.f58395h
            if (r15 == 0) goto L_0x0371
            r38 = r1
            int r1 = r15.length
            r39 = r13
            r13 = 1
            if (r1 != r13) goto L_0x036f
            r1 = 0
            r40 = r15[r1]
            int r13 = (r40 > r27 ? 1 : (r40 == r27 ? 0 : -1))
            if (r13 != 0) goto L_0x036f
            long[] r13 = r11.f58396i
            r40 = r13[r1]
            r42 = 1000(0x3e8, double:4.94E-321)
            r1 = r8
            r13 = r9
            long r8 = r11.f58390c
            r44 = r8
            long r27 = p333e8.C20551y.m22320j(r40, r42, r44)
            goto L_0x0377
        L_0x036f:
            r1 = r8
            goto L_0x0376
        L_0x0371:
            r38 = r1
            r1 = r8
            r39 = r13
        L_0x0376:
            r13 = r9
        L_0x0377:
            int[] r8 = r12.f58410h
            int[] r9 = r12.f58411i
            long[] r15 = r12.f58412j
            r40 = r3
            boolean[] r3 = r12.f58413k
            r41 = r3
            int r3 = r11.f58389b
            r42 = r8
            r8 = 2
            if (r3 != r8) goto L_0x0390
            r3 = r4 & 1
            if (r3 == 0) goto L_0x0390
            r3 = 1
            goto L_0x0391
        L_0x0390:
            r3 = 0
        L_0x0391:
            int[] r8 = r12.f58409g
            r8 = r8[r7]
            int r8 = r8 + r5
            r49 = r4
            r29 = r5
            long r4 = r11.f58390c
            if (r7 <= 0) goto L_0x03a4
            r11 = r3
            r50 = r4
            long r3 = r12.f58420r
            goto L_0x03a9
        L_0x03a4:
            r11 = r3
            r50 = r4
            r3 = r25
        L_0x03a9:
            r5 = r29
        L_0x03ab:
            if (r5 >= r8) goto L_0x041d
            if (r2 == 0) goto L_0x03b4
            int r7 = r10.mo32106q()
            goto L_0x03b6
        L_0x03b4:
            int r7 = r14.f58293b
        L_0x03b6:
            if (r6 == 0) goto L_0x03bf
            int r29 = r10.mo32106q()
            r52 = r2
            goto L_0x03c5
        L_0x03bf:
            r52 = r2
            int r2 = r14.f58294c
            r29 = r2
        L_0x03c5:
            if (r5 != 0) goto L_0x03cc
            if (r0 == 0) goto L_0x03cc
            r2 = r38
            goto L_0x03d5
        L_0x03cc:
            if (r1 == 0) goto L_0x03d3
            int r2 = r10.mo32092c()
            goto L_0x03d5
        L_0x03d3:
            int r2 = r14.f58295d
        L_0x03d5:
            if (r13 == 0) goto L_0x03ea
            r53 = r0
            int r0 = r10.mo32092c()
            r54 = r1
            long r0 = (long) r0
            r43 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r43
            long r0 = r0 / r50
            int r1 = (int) r0
            r9[r5] = r1
            goto L_0x03f1
        L_0x03ea:
            r53 = r0
            r54 = r1
            r0 = 0
            r9[r5] = r0
        L_0x03f1:
            r45 = 1000(0x3e8, double:4.94E-321)
            r43 = r3
            r47 = r50
            long r0 = p333e8.C20551y.m22320j(r43, r45, r47)
            long r0 = r0 - r27
            r15[r5] = r0
            r42[r5] = r29
            r0 = 16
            int r1 = r2 >> 16
            r0 = 1
            r1 = r1 & r0
            if (r1 != 0) goto L_0x040f
            if (r11 == 0) goto L_0x040d
            if (r5 != 0) goto L_0x040f
        L_0x040d:
            r0 = 1
            goto L_0x0410
        L_0x040f:
            r0 = 0
        L_0x0410:
            r41[r5] = r0
            long r0 = (long) r7
            long r3 = r3 + r0
            int r5 = r5 + 1
            r2 = r52
            r0 = r53
            r1 = r54
            goto L_0x03ab
        L_0x041d:
            r12.f58420r = r3
            r5 = r8
            r7 = r30
            goto L_0x0439
        L_0x0423:
            r34 = r1
            r33 = r2
            r40 = r3
            r49 = r4
            r29 = r5
            r35 = r6
            r37 = r8
            r36 = r9
            r31 = r12
            r39 = r13
            r32 = r14
        L_0x0439:
            int r3 = r40 + 1
            r0 = r56
            r12 = r31
            r14 = r32
            r2 = r33
            r1 = r34
            r6 = r35
            r9 = r36
            r8 = r37
            r13 = r39
            r4 = r49
            r10 = 12
            goto L_0x02c5
        L_0x0453:
            r34 = r1
            r33 = r2
            r49 = r4
            r35 = r6
            r37 = r8
            r36 = r9
            f7.h r0 = r13.f58332c
            r1 = r37
            f7.c r2 = r1.f58403a
            int r2 = r2.f58292a
            f7.i[] r0 = r0.f58398k
            if (r0 != 0) goto L_0x046d
            r0 = 0
            goto L_0x046f
        L_0x046d:
            r0 = r0[r2]
        L_0x046f:
            int r2 = p336f7.C20659a.f58218d0
            r9 = r36
            f7.a$b r2 = r9.mo32357c(r2)
            if (r2 == 0) goto L_0x04fb
            e8.m r2 = r2.f58267P0
            int r3 = r0.f58401c
            r4 = 8
            r2.mo32113x(r4)
            int r5 = r2.mo32092c()
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r6
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0491
            r2.mo32114y(r4)
        L_0x0491:
            int r4 = r2.mo32103n()
            int r5 = r2.mo32106q()
            int r6 = r1.f58407e
            if (r5 != r6) goto L_0x04da
            if (r4 != 0) goto L_0x04b4
            boolean[] r4 = r1.f58415m
            r6 = 0
            r7 = 0
        L_0x04a3:
            if (r6 >= r5) goto L_0x04c3
            int r8 = r2.mo32103n()
            int r7 = r7 + r8
            if (r8 <= r3) goto L_0x04ae
            r8 = 1
            goto L_0x04af
        L_0x04ae:
            r8 = 0
        L_0x04af:
            r4[r6] = r8
            int r6 = r6 + 1
            goto L_0x04a3
        L_0x04b4:
            if (r4 <= r3) goto L_0x04b8
            r2 = 1
            goto L_0x04b9
        L_0x04b8:
            r2 = 0
        L_0x04b9:
            int r4 = r4 * r5
            r3 = 0
            int r7 = r4 + 0
            boolean[] r4 = r1.f58415m
            java.util.Arrays.fill(r4, r3, r5, r2)
        L_0x04c3:
            e8.m r2 = r1.f58418p
            if (r2 == 0) goto L_0x04cb
            int r2 = r2.f57811c
            if (r2 >= r7) goto L_0x04d2
        L_0x04cb:
            e8.m r2 = new e8.m
            r2.<init>((int) r7)
            r1.f58418p = r2
        L_0x04d2:
            r1.f58417o = r7
            r2 = 1
            r1.f58414l = r2
            r1.f58419q = r2
            goto L_0x04fb
        L_0x04da:
            x6.n r0 = new x6.n
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Length mismatch: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ", "
            r2.append(r3)
            int r1 = r1.f58407e
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04fb:
            int r2 = p336f7.C20659a.f58220e0
            f7.a$b r2 = r9.mo32357c(r2)
            if (r2 == 0) goto L_0x054b
            e8.m r2 = r2.f58267P0
            r3 = 8
            r2.mo32113x(r3)
            int r4 = r2.mo32092c()
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0519
            r2.mo32114y(r3)
        L_0x0519:
            int r3 = r2.mo32106q()
            if (r3 != r6) goto L_0x0534
            int r3 = r4 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r4 = r1.f58405c
            if (r3 != 0) goto L_0x052c
            long r2 = r2.mo32104o()
            goto L_0x0530
        L_0x052c:
            long r2 = r2.mo32107r()
        L_0x0530:
            long r4 = r4 + r2
            r1.f58405c = r4
            goto L_0x054b
        L_0x0534:
            x6.n r0 = new x6.n
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected saio entry count: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x054b:
            int r2 = p336f7.C20659a.f58228i0
            f7.a$b r2 = r9.mo32357c(r2)
            if (r2 == 0) goto L_0x0559
            e8.m r2 = r2.f58267P0
            r3 = 0
            m22591g(r2, r3, r1)
        L_0x0559:
            int r2 = p336f7.C20659a.f58222f0
            f7.a$b r2 = r9.mo32357c(r2)
            int r3 = p336f7.C20659a.f58224g0
            f7.a$b r3 = r9.mo32357c(r3)
            if (r2 == 0) goto L_0x062e
            if (r3 == 0) goto L_0x062e
            e8.m r2 = r2.f58267P0
            e8.m r3 = r3.f58267P0
            if (r0 == 0) goto L_0x0576
            java.lang.String r0 = r0.f58399a
            r38 = r0
            r0 = 8
            goto L_0x057a
        L_0x0576:
            r0 = 8
            r38 = 0
        L_0x057a:
            r2.mo32113x(r0)
            int r0 = r2.mo32092c()
            int r4 = r2.mo32092c()
            int r5 = f58296E
            if (r4 == r5) goto L_0x058b
            goto L_0x062e
        L_0x058b:
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = 4
            r6 = 1
            if (r0 != r6) goto L_0x0596
            r2.mo32114y(r4)
        L_0x0596:
            int r0 = r2.mo32092c()
            if (r0 != r6) goto L_0x0626
            r0 = 8
            r3.mo32113x(r0)
            int r0 = r3.mo32092c()
            int r2 = r3.mo32092c()
            if (r2 == r5) goto L_0x05ad
            goto L_0x062e
        L_0x05ad:
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r6) goto L_0x05c4
            long r5 = r3.mo32104o()
            int r0 = (r5 > r27 ? 1 : (r5 == r27 ? 0 : -1))
            if (r0 == 0) goto L_0x05bc
            goto L_0x05ca
        L_0x05bc:
            x6.n r0 = new x6.n
            java.lang.String r1 = "Variable length description in sgpd found (unsupported)"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05c4:
            r2 = 2
            if (r0 < r2) goto L_0x05ca
            r3.mo32114y(r4)
        L_0x05ca:
            long r5 = r3.mo32104o()
            r7 = 1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x061e
            r0 = 1
            r3.mo32114y(r0)
            int r2 = r3.mo32103n()
            r5 = r2 & 240(0xf0, float:3.36E-43)
            int r41 = r5 >> 4
            r42 = r2 & 15
            int r2 = r3.mo32103n()
            if (r2 != r0) goto L_0x05eb
            r37 = 1
            goto L_0x05ed
        L_0x05eb:
            r37 = 0
        L_0x05ed:
            if (r37 != 0) goto L_0x05f0
            goto L_0x062e
        L_0x05f0:
            int r39 = r3.mo32103n()
            r0 = 16
            byte[] r2 = new byte[r0]
            r4 = 0
            r3.mo32091b(r2, r4, r0)
            if (r37 == 0) goto L_0x060d
            if (r39 != 0) goto L_0x060d
            int r0 = r3.mo32103n()
            byte[] r8 = new byte[r0]
            r3.mo32091b(r8, r4, r0)
            r43 = r8
            r0 = 1
            goto L_0x0610
        L_0x060d:
            r0 = 1
            r43 = 0
        L_0x0610:
            r1.f58414l = r0
            f7.i r3 = new f7.i
            r36 = r3
            r40 = r2
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)
            r1.f58416n = r3
            goto L_0x062f
        L_0x061e:
            x6.n r0 = new x6.n
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0626:
            x6.n r0 = new x6.n
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x062e:
            r0 = 1
        L_0x062f:
            java.util.List<f7.a$b> r2 = r9.f58265Q0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r5 = 0
        L_0x0638:
            if (r5 >= r2) goto L_0x0671
            java.util.List<f7.a$b> r3 = r9.f58265Q0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r3 = r3.get(r5)
            f7.a$b r3 = (p336f7.C20659a.C20661b) r3
            int r4 = r3.f58263a
            int r6 = p336f7.C20659a.f58226h0
            if (r4 != r6) goto L_0x0666
            e8.m r3 = r3.f58267P0
            r4 = 8
            r3.mo32113x(r4)
            r6 = r34
            r7 = 16
            r8 = 0
            r3.mo32091b(r6, r8, r7)
            byte[] r8 = f58297F
            boolean r8 = java.util.Arrays.equals(r6, r8)
            if (r8 != 0) goto L_0x0662
            goto L_0x066c
        L_0x0662:
            m22591g(r3, r7, r1)
            goto L_0x066c
        L_0x0666:
            r6 = r34
            r4 = 8
            r7 = 16
        L_0x066c:
            int r5 = r5 + 1
            r34 = r6
            goto L_0x0638
        L_0x0671:
            r6 = r34
            r4 = 8
            goto L_0x0684
        L_0x0676:
            r33 = r2
            r22 = r3
            r49 = r4
            r24 = r5
            r35 = r6
            r0 = 1
            r4 = 8
            r6 = r1
        L_0x0684:
            int r1 = r35 + 1
            r0 = r56
            r3 = r22
            r5 = r24
            r2 = r33
            r4 = r49
            r7 = 8
            r55 = r6
            r6 = r1
            r1 = r55
            goto L_0x0190
        L_0x0699:
            java.util.List<f7.a$b> r0 = r2.f58265Q0
            com.google.android.exoplayer2.drm.DrmInitData r0 = m22590d(r0)
            r3 = r56
            if (r0 == 0) goto L_0x0744
            android.util.SparseArray<f7.d$b> r1 = r3.f58303b
            int r1 = r1.size()
            r2 = 0
        L_0x06aa:
            if (r2 >= r1) goto L_0x0744
            android.util.SparseArray<f7.d$b> r4 = r3.f58303b
            java.lang.Object r4 = r4.valueAt(r2)
            f7.d$b r4 = (p336f7.C20668d.C20670b) r4
            f7.h r5 = r4.f58332c
            f7.j r6 = r4.f58330a
            f7.c r6 = r6.f58403a
            int r6 = r6.f58292a
            f7.i[] r7 = r5.f58398k
            if (r7 != 0) goto L_0x06c2
            r6 = 0
            goto L_0x06c4
        L_0x06c2:
            r6 = r7[r6]
        L_0x06c4:
            if (r6 == 0) goto L_0x06c9
            java.lang.String r6 = r6.f58399a
            goto L_0x06ca
        L_0x06c9:
            r6 = 0
        L_0x06ca:
            b7.m r4 = r4.f58331b
            com.google.android.exoplayer2.Format r5 = r5.f58393f
            com.google.android.exoplayer2.drm.DrmInitData r43 = r0.mo18404a(r6)
            com.google.android.exoplayer2.Format r6 = new com.google.android.exoplayer2.Format
            r17 = r6
            java.lang.String r7 = r5.f45772d
            r18 = r7
            java.lang.String r7 = r5.f45776h
            r19 = r7
            java.lang.String r7 = r5.f45777i
            r20 = r7
            java.lang.String r7 = r5.f45774f
            r21 = r7
            int r7 = r5.f45773e
            r22 = r7
            int r7 = r5.f45778j
            r23 = r7
            int r7 = r5.f45781p
            r24 = r7
            int r7 = r5.f45782q
            r25 = r7
            float r7 = r5.f45783r
            r26 = r7
            int r7 = r5.f45784s
            r27 = r7
            float r7 = r5.f45785t
            r28 = r7
            byte[] r7 = r5.f45787v
            r29 = r7
            int r7 = r5.f45786u
            r30 = r7
            com.google.android.exoplayer2.video.ColorInfo r7 = r5.f45788w
            r31 = r7
            int r7 = r5.f45789x
            r32 = r7
            int r7 = r5.f45790y
            r33 = r7
            int r7 = r5.f45791z
            r34 = r7
            int r7 = r5.f45765A
            r35 = r7
            int r7 = r5.f45766B
            r36 = r7
            int r7 = r5.f45768D
            r37 = r7
            java.lang.String r7 = r5.f45769E
            r38 = r7
            int r7 = r5.f45770F
            r39 = r7
            long r7 = r5.f45767C
            r40 = r7
            java.util.List<byte[]> r7 = r5.f45779n
            r42 = r7
            com.google.android.exoplayer2.metadata.Metadata r5 = r5.f45775g
            r44 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44)
            r4.mo17741a(r6)
            int r2 = r2 + 1
            goto L_0x06aa
        L_0x0744:
            r1 = r3
            goto L_0x075e
        L_0x0746:
            r3 = r0
            java.util.Stack<f7.a$a> r0 = r1.f58312k
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x075e
            java.util.Stack<f7.a$a> r0 = r1.f58312k
            java.lang.Object r0 = r0.peek()
            f7.a$a r0 = (p336f7.C20659a.C20660a) r0
            java.util.List<f7.a$a> r0 = r0.f58266R0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
        L_0x075e:
            r0 = r3
            goto L_0x0003
        L_0x0761:
            r3 = r0
            r0 = 0
            r3.f58314m = r0
            r3.f58317p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p336f7.C20668d.mo32363h(long):void");
    }

    public void release() {
    }
}
