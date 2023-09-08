package p380r7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p294b7.C16738b;
import p294b7.C16741e;
import p294b7.C16742f;
import p300c8.C79946g;
import p300c8.C79950j;
import p332e7.C20522b;
import p333e8.C20541m;
import p333e8.C20549u;
import p345h7.C20894a;
import p345h7.C20896c;
import p365n7.C21605a;
import p373q7.C22076c;
import p381s7.C22300a;

/* renamed from: r7.f */
public final class C22208f extends C22076c {

    /* renamed from: G */
    public static final AtomicInteger f62868G = new AtomicInteger();

    /* renamed from: A */
    public int f62869A;

    /* renamed from: B */
    public int f62870B;

    /* renamed from: C */
    public boolean f62871C;

    /* renamed from: D */
    public C22212j f62872D;

    /* renamed from: E */
    public volatile boolean f62873E;

    /* renamed from: F */
    public volatile boolean f62874F;

    /* renamed from: j */
    public final int f62875j;

    /* renamed from: k */
    public final int f62876k;

    /* renamed from: l */
    public final C22300a.C22301a f62877l;

    /* renamed from: m */
    public final C79946g f62878m;

    /* renamed from: n */
    public final C79950j f62879n;

    /* renamed from: o */
    public final boolean f62880o;

    /* renamed from: p */
    public final boolean f62881p;

    /* renamed from: q */
    public final C20549u f62882q;

    /* renamed from: r */
    public final String f62883r;

    /* renamed from: s */
    public final C16741e f62884s;

    /* renamed from: t */
    public final boolean f62885t;

    /* renamed from: u */
    public final boolean f62886u;

    /* renamed from: v */
    public final List<Format> f62887v;

    /* renamed from: w */
    public final boolean f62888w;

    /* renamed from: x */
    public final C21605a f62889x;

    /* renamed from: y */
    public final C20541m f62890y;

    /* renamed from: z */
    public C16741e f62891z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22208f(p300c8.C79946g r17, p300c8.C79950j r18, p300c8.C79950j r19, p381s7.C22300a.C22301a r20, java.util.List<com.google.android.exoplayer2.Format> r21, int r22, java.lang.Object r23, long r24, long r26, int r28, int r29, boolean r30, p333e8.C20549u r31, p380r7.C22208f r32, byte[] r33, byte[] r34) {
        /*
            r16 = this;
            r11 = r16
            r12 = r17
            r13 = r20
            r14 = r29
            r15 = r32
            r0 = r33
            r1 = r34
            if (r0 == 0) goto L_0x001a
            if (r1 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            r7.a r2 = new r7.a
            r2.<init>(r12, r0, r1)
            r10 = r2
            goto L_0x001b
        L_0x001a:
            r10 = r12
        L_0x001b:
            com.google.android.exoplayer2.Format r3 = r13.f63216b
            r0 = r16
            r1 = r10
            r2 = r18
            r4 = r22
            r5 = r23
            r6 = r24
            r8 = r26
            r12 = r10
            r10 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10)
            r11.f62876k = r14
            r0 = r19
            r11.f62879n = r0
            r11.f62877l = r13
            r0 = r21
            r11.f62887v = r0
            r0 = r30
            r11.f62881p = r0
            r0 = r31
            r11.f62882q = r0
            boolean r0 = r12 instanceof p380r7.C89882a
            r11.f62880o = r0
            r0 = r18
            android.net.Uri r0 = r0.f234181a
            java.lang.String r0 = r0.getLastPathSegment()
            r11.f62883r = r0
            java.lang.String r1 = ".aac"
            boolean r1 = r0.endsWith(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0077
            java.lang.String r1 = ".ac3"
            boolean r1 = r0.endsWith(r1)
            if (r1 != 0) goto L_0x0077
            java.lang.String r1 = ".ec3"
            boolean r1 = r0.endsWith(r1)
            if (r1 != 0) goto L_0x0077
            java.lang.String r1 = ".mp3"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r0 = 0
            goto L_0x0078
        L_0x0077:
            r0 = 1
        L_0x0078:
            r11.f62888w = r0
            if (r15 == 0) goto L_0x009b
            n7.a r0 = r15.f62889x
            r11.f62889x = r0
            e8.m r0 = r15.f62890y
            r11.f62890y = r0
            b7.e r0 = r15.f62891z
            r11.f62884s = r0
            s7.a$a r0 = r15.f62877l
            if (r0 == r13) goto L_0x008e
            r0 = 1
            goto L_0x008f
        L_0x008e:
            r0 = 0
        L_0x008f:
            r11.f62885t = r0
            int r1 = r15.f62876k
            if (r1 != r14) goto L_0x0097
            if (r0 == 0) goto L_0x0098
        L_0x0097:
            r2 = 1
        L_0x0098:
            r11.f62886u = r2
            goto L_0x00ba
        L_0x009b:
            r1 = 0
            if (r0 == 0) goto L_0x00a4
            n7.a r4 = new n7.a
            r4.<init>(r1)
            goto L_0x00a5
        L_0x00a4:
            r4 = r1
        L_0x00a5:
            r11.f62889x = r4
            if (r0 == 0) goto L_0x00b1
            e8.m r0 = new e8.m
            r4 = 10
            r0.<init>((int) r4)
            goto L_0x00b2
        L_0x00b1:
            r0 = r1
        L_0x00b2:
            r11.f62890y = r0
            r11.f62884s = r1
            r11.f62885t = r2
            r11.f62886u = r3
        L_0x00ba:
            r0 = r17
            r11.f62878m = r0
            java.util.concurrent.atomic.AtomicInteger r0 = f62868G
            int r0 = r0.getAndIncrement()
            r11.f62875j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p380r7.C22208f.<init>(c8.g, c8.j, c8.j, s7.a$a, java.util.List, int, java.lang.Object, long, long, int, int, boolean, e8.u, r7.f, byte[], byte[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ac A[Catch:{ all -> 0x01d7, all -> 0x01f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01c5 A[Catch:{ all -> 0x01d7, all -> 0x01f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01cc A[SYNTHETIC, Splitter:B:125:0x01cc] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0165  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17945a() {
        /*
            r14 = this;
            b7.e r0 = r14.f62891z
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x00eb
            boolean r0 = r14.f62888w
            if (r0 != 0) goto L_0x00eb
            s7.a$a r0 = r14.f62877l
            com.google.android.exoplayer2.Format r0 = r0.f63216b
            java.lang.String r0 = r0.f45777i
            java.lang.String r4 = "text/vtt"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00d6
            java.lang.String r0 = r14.f62883r
            java.lang.String r4 = ".webvtt"
            boolean r0 = r0.endsWith(r4)
            if (r0 != 0) goto L_0x00d6
            java.lang.String r0 = r14.f62883r
            java.lang.String r4 = ".vtt"
            boolean r0 = r0.endsWith(r4)
            if (r0 == 0) goto L_0x0030
            goto L_0x00d6
        L_0x0030:
            boolean r0 = r14.f62886u
            if (r0 != 0) goto L_0x0039
            b7.e r0 = r14.f62884s
            r4 = 0
            goto L_0x00e2
        L_0x0039:
            java.lang.String r0 = r14.f62883r
            java.lang.String r4 = ".mp4"
            boolean r0 = r0.endsWith(r4)
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = r14.f62883r
            int r4 = r0.length()
            int r4 = r4 + -4
            java.lang.String r5 = ".m4"
            boolean r0 = r0.startsWith(r5, r4)
            if (r0 == 0) goto L_0x0055
            goto L_0x00ce
        L_0x0055:
            r0 = 16
            java.util.List<com.google.android.exoplayer2.Format> r4 = r14.f62887v
            if (r4 == 0) goto L_0x005e
            r0 = 48
            goto L_0x0062
        L_0x005e:
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0062:
            com.google.android.exoplayer2.Format r5 = r14.f62456c
            java.lang.String r5 = r5.f45774f
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x00bf
            java.lang.String r6 = ","
            if (r5 != 0) goto L_0x0071
            goto L_0x008b
        L_0x0071:
            java.lang.String[] r7 = r5.split(r6)
            int r8 = r7.length
            r9 = 0
        L_0x0077:
            if (r9 >= r8) goto L_0x008b
            r10 = r7[r9]
            java.lang.String r10 = p333e8.C20536j.m22249a(r10)
            if (r10 == 0) goto L_0x0088
            boolean r11 = p333e8.C20536j.m22252d(r10)
            if (r11 == 0) goto L_0x0088
            goto L_0x008c
        L_0x0088:
            int r9 = r9 + 1
            goto L_0x0077
        L_0x008b:
            r10 = r3
        L_0x008c:
            java.lang.String r7 = "audio/mp4a-latm"
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x0096
            r0 = r0 | 2
        L_0x0096:
            if (r5 != 0) goto L_0x0099
            goto L_0x00b3
        L_0x0099:
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            r7 = 0
        L_0x009f:
            if (r7 >= r6) goto L_0x00b3
            r8 = r5[r7]
            java.lang.String r8 = p333e8.C20536j.m22249a(r8)
            if (r8 == 0) goto L_0x00b0
            boolean r9 = p333e8.C20536j.m22253e(r8)
            if (r9 == 0) goto L_0x00b0
            goto L_0x00b4
        L_0x00b0:
            int r7 = r7 + 1
            goto L_0x009f
        L_0x00b3:
            r8 = r3
        L_0x00b4:
            java.lang.String r5 = "video/avc"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x00bf
            r0 = r0 | 4
        L_0x00bf:
            h7.u r5 = new h7.u
            e8.u r6 = r14.f62882q
            h7.e r7 = new h7.e
            r7.<init>(r0, r4)
            r0 = 2
            r5.<init>(r0, r6, r7)
            r0 = r5
            goto L_0x00e1
        L_0x00ce:
            f7.d r0 = new f7.d
            e8.u r4 = r14.f62882q
            r0.<init>(r2, r4)
            goto L_0x00e1
        L_0x00d6:
            r7.l r0 = new r7.l
            com.google.android.exoplayer2.Format r4 = r14.f62456c
            java.lang.String r4 = r4.f45769E
            e8.u r5 = r14.f62882q
            r0.<init>(r4, r5)
        L_0x00e1:
            r4 = 1
        L_0x00e2:
            if (r4 == 0) goto L_0x00e9
            r7.j r4 = r14.f62872D
            r0.mo17748e(r4)
        L_0x00e9:
            r14.f62891z = r0
        L_0x00eb:
            b7.e r0 = r14.f62884s
            b7.e r4 = r14.f62891z
            if (r0 == r4) goto L_0x0142
            boolean r0 = r14.f62871C
            if (r0 != 0) goto L_0x0142
            c8.j r0 = r14.f62879n
            if (r0 != 0) goto L_0x00fa
            goto L_0x0142
        L_0x00fa:
            int r4 = r14.f62869A
            long r4 = (long) r4
            c8.j r0 = r0.mo110137a(r4)
            b7.b r10 = new b7.b     // Catch:{ all -> 0x013b }
            c8.g r5 = r14.f62878m     // Catch:{ all -> 0x013b }
            long r6 = r0.f234183c     // Catch:{ all -> 0x013b }
            long r8 = r5.mo110126b(r0)     // Catch:{ all -> 0x013b }
            r4 = r10
            r4.<init>(r5, r6, r8)     // Catch:{ all -> 0x013b }
            r0 = 0
        L_0x0110:
            if (r0 != 0) goto L_0x0129
            boolean r0 = r14.f62873E     // Catch:{ all -> 0x011d }
            if (r0 != 0) goto L_0x0129
            b7.e r0 = r14.f62891z     // Catch:{ all -> 0x011d }
            int r0 = r0.mo17745a(r10, r3)     // Catch:{ all -> 0x011d }
            goto L_0x0110
        L_0x011d:
            r0 = move-exception
            long r1 = r10.f45242c     // Catch:{ all -> 0x013b }
            c8.j r3 = r14.f62879n     // Catch:{ all -> 0x013b }
            long r3 = r3.f234183c     // Catch:{ all -> 0x013b }
            long r1 = r1 - r3
            int r2 = (int) r1     // Catch:{ all -> 0x013b }
            r14.f62869A = r2     // Catch:{ all -> 0x013b }
            throw r0     // Catch:{ all -> 0x013b }
        L_0x0129:
            long r4 = r10.f45242c     // Catch:{ all -> 0x013b }
            c8.j r0 = r14.f62879n     // Catch:{ all -> 0x013b }
            long r6 = r0.f234183c     // Catch:{ all -> 0x013b }
            long r4 = r4 - r6
            int r0 = (int) r4     // Catch:{ all -> 0x013b }
            r14.f62869A = r0     // Catch:{ all -> 0x013b }
            c8.g r0 = r14.f62461h
            p333e8.C20551y.m22314d(r0)
            r14.f62871C = r1
            goto L_0x0142
        L_0x013b:
            r0 = move-exception
            c8.g r1 = r14.f62461h
            p333e8.C20551y.m22314d(r1)
            throw r0
        L_0x0142:
            boolean r0 = r14.f62873E
            if (r0 != 0) goto L_0x01fc
            boolean r0 = r14.f62880o
            if (r0 == 0) goto L_0x0152
            c8.j r0 = r14.f62454a
            int r4 = r14.f62870B
            if (r4 == 0) goto L_0x015b
            r4 = 1
            goto L_0x015c
        L_0x0152:
            c8.j r0 = r14.f62454a
            int r4 = r14.f62870B
            long r4 = (long) r4
            c8.j r0 = r0.mo110137a(r4)
        L_0x015b:
            r4 = 0
        L_0x015c:
            boolean r5 = r14.f62881p
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 != 0) goto L_0x0177
            e8.u r5 = r14.f62882q
            monitor-enter(r5)
        L_0x0168:
            long r8 = r5.f57834c     // Catch:{ all -> 0x0174 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0172
            r5.wait()     // Catch:{ all -> 0x0174 }
            goto L_0x0168
        L_0x0172:
            monitor-exit(r5)
            goto L_0x019a
        L_0x0174:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0177:
            e8.u r5 = r14.f62882q
            long r8 = r5.f57832a
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x019a
            long r8 = r14.f62459f
            monitor-enter(r5)
            long r10 = r5.f57834c     // Catch:{ all -> 0x0197 }
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x018f
            r10 = 1
            goto L_0x0190
        L_0x018f:
            r10 = 0
        L_0x0190:
            p333e8.C20528a.m22240d(r10)     // Catch:{ all -> 0x0197 }
            r5.f57832a = r8     // Catch:{ all -> 0x0197 }
            monitor-exit(r5)
            goto L_0x019a
        L_0x0197:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x019a:
            b7.b r5 = new b7.b     // Catch:{ all -> 0x01f5 }
            c8.g r9 = r14.f62461h     // Catch:{ all -> 0x01f5 }
            long r10 = r0.f234183c     // Catch:{ all -> 0x01f5 }
            long r12 = r9.mo110126b(r0)     // Catch:{ all -> 0x01f5 }
            r8 = r5
            r8.<init>(r9, r10, r12)     // Catch:{ all -> 0x01f5 }
            b7.e r0 = r14.f62891z     // Catch:{ all -> 0x01f5 }
            if (r0 != 0) goto L_0x01c3
            long r8 = r14.mo35338f(r5)     // Catch:{ all -> 0x01f5 }
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01bb
            e8.u r0 = r14.f62882q     // Catch:{ all -> 0x01f5 }
            long r6 = r0.mo32131b(r8)     // Catch:{ all -> 0x01f5 }
            goto L_0x01bd
        L_0x01bb:
            long r6 = r14.f62459f     // Catch:{ all -> 0x01f5 }
        L_0x01bd:
            b7.e r0 = r14.mo35337e(r6)     // Catch:{ all -> 0x01f5 }
            r14.f62891z = r0     // Catch:{ all -> 0x01f5 }
        L_0x01c3:
            if (r4 == 0) goto L_0x01ca
            int r0 = r14.f62870B     // Catch:{ all -> 0x01f5 }
            r5.mo17738f(r0)     // Catch:{ all -> 0x01f5 }
        L_0x01ca:
            if (r2 != 0) goto L_0x01e3
            boolean r0 = r14.f62873E     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x01e3
            b7.e r0 = r14.f62891z     // Catch:{ all -> 0x01d7 }
            int r2 = r0.mo17745a(r5, r3)     // Catch:{ all -> 0x01d7 }
            goto L_0x01ca
        L_0x01d7:
            r0 = move-exception
            long r1 = r5.f45242c     // Catch:{ all -> 0x01f5 }
            c8.j r3 = r14.f62454a     // Catch:{ all -> 0x01f5 }
            long r3 = r3.f234183c     // Catch:{ all -> 0x01f5 }
            long r1 = r1 - r3
            int r2 = (int) r1     // Catch:{ all -> 0x01f5 }
            r14.f62870B = r2     // Catch:{ all -> 0x01f5 }
            throw r0     // Catch:{ all -> 0x01f5 }
        L_0x01e3:
            long r2 = r5.f45242c     // Catch:{ all -> 0x01f5 }
            c8.j r0 = r14.f62454a     // Catch:{ all -> 0x01f5 }
            long r4 = r0.f234183c     // Catch:{ all -> 0x01f5 }
            long r2 = r2 - r4
            int r0 = (int) r2     // Catch:{ all -> 0x01f5 }
            r14.f62870B = r0     // Catch:{ all -> 0x01f5 }
            c8.g r0 = r14.f62461h
            p333e8.C20551y.m22314d(r0)
            r14.f62874F = r1
            goto L_0x01fc
        L_0x01f5:
            r0 = move-exception
            c8.g r1 = r14.f62461h
            p333e8.C20551y.m22314d(r1)
            throw r0
        L_0x01fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p380r7.C22208f.mo17945a():void");
    }

    /* renamed from: b */
    public void mo17946b() {
        this.f62873E = true;
    }

    /* renamed from: c */
    public boolean mo17947c() {
        return this.f62873E;
    }

    /* renamed from: d */
    public long mo35171d() {
        return (long) this.f62870B;
    }

    /* renamed from: e */
    public final C16741e mo35337e(long j) {
        C16741e eVar;
        if (this.f62883r.endsWith(".aac")) {
            eVar = new C20896c(j);
        } else if (this.f62883r.endsWith(".ac3") || this.f62883r.endsWith(".ec3")) {
            eVar = new C20894a(j);
        } else if (this.f62883r.endsWith(".mp3")) {
            eVar = new C20522b(0, j);
        } else {
            throw new IllegalArgumentException("Unknown extension for audio file: " + this.f62883r);
        }
        eVar.mo17748e(this.f62872D);
        return eVar;
    }

    /* renamed from: f */
    public final long mo35338f(C16742f fVar) {
        Metadata b;
        ((C16738b) fVar).f45244e = 0;
        C16738b bVar = (C16738b) fVar;
        if (!bVar.mo17734b(this.f62890y.f57809a, 0, 10, true)) {
            return -9223372036854775807L;
        }
        this.f62890y.mo32110u(10);
        if (this.f62890y.mo32105p() != C21605a.f61178a) {
            return -9223372036854775807L;
        }
        this.f62890y.mo32114y(3);
        int m = this.f62890y.mo32102m();
        int i = m + 10;
        if (i > this.f62890y.mo32090a()) {
            C20541m mVar = this.f62890y;
            byte[] bArr = mVar.f57809a;
            mVar.mo32110u(i);
            System.arraycopy(bArr, 0, this.f62890y.f57809a, 0, 10);
        }
        if (!bVar.mo17734b(this.f62890y.f57809a, 10, m, true) || (b = this.f62889x.mo33860b(this.f62890y.f57809a, m)) == null) {
            return -9223372036854775807L;
        }
        for (Metadata.Entry entry : b.f45801d) {
            if (entry instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) entry;
                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f45821e)) {
                    System.arraycopy(privFrame.f45822f, 0, this.f62890y.f57809a, 0, 8);
                    this.f62890y.mo32110u(8);
                    return this.f62890y.mo32098i();
                }
            }
        }
        return -9223372036854775807L;
    }
}
