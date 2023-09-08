package p370p7;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import p294b7.C16738b;
import p294b7.C16741e;
import p294b7.C16742f;
import p294b7.C16743g;
import p294b7.C16747k;
import p294b7.C16748l;
import p294b7.C16750m;
import p295b8.C16772f;
import p300c8.C16870b;
import p300c8.C16876u;
import p300c8.C79946g;
import p333e8.C20528a;
import p333e8.C20532f;
import p333e8.C20551y;
import p370p7.C21941l;
import p370p7.C21947n;
import p370p7.C21954q;
import p396x6.C23010j;
import p404z6.C23455e;

/* renamed from: p7.j */
public final class C21933j implements C21947n, C16743g, C16876u.C16877a<C21936c>, C16876u.C16880d, C21954q.C21956b {

    /* renamed from: A */
    public boolean f62050A;

    /* renamed from: B */
    public boolean f62051B;

    /* renamed from: C */
    public boolean f62052C;

    /* renamed from: D */
    public int f62053D;

    /* renamed from: E */
    public C21962v f62054E;

    /* renamed from: F */
    public long f62055F;

    /* renamed from: G */
    public boolean[] f62056G;

    /* renamed from: H */
    public boolean[] f62057H;

    /* renamed from: I */
    public boolean f62058I;

    /* renamed from: J */
    public long f62059J;

    /* renamed from: K */
    public long f62060K;

    /* renamed from: L */
    public long f62061L;

    /* renamed from: M */
    public int f62062M;

    /* renamed from: N */
    public boolean f62063N;

    /* renamed from: P */
    public boolean f62064P;

    /* renamed from: d */
    public final Uri f62065d;

    /* renamed from: e */
    public final C79946g f62066e;

    /* renamed from: f */
    public final int f62067f;

    /* renamed from: g */
    public final Handler f62068g;

    /* renamed from: h */
    public final C21941l.C21942a f62069h;

    /* renamed from: i */
    public final C21938e f62070i;

    /* renamed from: j */
    public final C16870b f62071j;

    /* renamed from: n */
    public final String f62072n;

    /* renamed from: o */
    public final long f62073o;

    /* renamed from: p */
    public final C16876u f62074p = new C16876u("Loader:ExtractorMediaPeriod");

    /* renamed from: q */
    public final C21937d f62075q;

    /* renamed from: r */
    public final C20532f f62076r;

    /* renamed from: s */
    public final Runnable f62077s;

    /* renamed from: t */
    public final Runnable f62078t;

    /* renamed from: u */
    public final Handler f62079u;

    /* renamed from: v */
    public C21947n.C21948a f62080v;

    /* renamed from: w */
    public C16748l f62081w;

    /* renamed from: x */
    public C21954q[] f62082x;

    /* renamed from: y */
    public int[] f62083y;

    /* renamed from: z */
    public boolean f62084z;

    /* renamed from: p7.j$a */
    public class C21934a implements Runnable {
        public C21934a() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r5v0 ?, r5v1 ?, r5v3 ?]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
            */
        public void run() {
            /*
                r9 = this;
                p7.j r0 = p370p7.C21933j.this
                boolean r1 = r0.f62064P
                if (r1 != 0) goto L_0x0097
                boolean r1 = r0.f62050A
                if (r1 != 0) goto L_0x0097
                b7.l r1 = r0.f62081w
                if (r1 == 0) goto L_0x0097
                boolean r1 = r0.f62084z
                if (r1 != 0) goto L_0x0014
                goto L_0x0097
            L_0x0014:
                p7.q[] r1 = r0.f62082x
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0019:
                if (r4 >= r2) goto L_0x0028
                r5 = r1[r4]
                com.google.android.exoplayer2.Format r5 = r5.mo35030i()
                if (r5 != 0) goto L_0x0025
                goto L_0x0097
            L_0x0025:
                int r4 = r4 + 1
                goto L_0x0019
            L_0x0028:
                e8.f r1 = r0.f62076r
                monitor-enter(r1)
                r1.f57781a = r3     // Catch:{ all -> 0x0094 }
                monitor-exit(r1)
                p7.q[] r1 = r0.f62082x
                int r1 = r1.length
                p7.u[] r2 = new p370p7.C21961u[r1]
                boolean[] r4 = new boolean[r1]
                r0.f62057H = r4
                boolean[] r4 = new boolean[r1]
                r0.f62056G = r4
                b7.l r4 = r0.f62081w
                long r4 = r4.mo17732h()
                r0.f62055F = r4
                r4 = 0
            L_0x0044:
                r5 = 1
                if (r4 >= r1) goto L_0x0076
                p7.q[] r6 = r0.f62082x
                r6 = r6[r4]
                com.google.android.exoplayer2.Format r6 = r6.mo35030i()
                p7.u r7 = new p7.u
                com.google.android.exoplayer2.Format[] r8 = new com.google.android.exoplayer2.Format[r5]
                r8[r3] = r6
                r7.<init>(r8)
                r2[r4] = r7
                java.lang.String r6 = r6.f45777i
                boolean r7 = p333e8.C20536j.m22253e(r6)
                if (r7 != 0) goto L_0x006a
                boolean r6 = p333e8.C20536j.m22252d(r6)
                if (r6 == 0) goto L_0x0069
                goto L_0x006a
            L_0x0069:
                r5 = 0
            L_0x006a:
                boolean[] r6 = r0.f62057H
                r6[r4] = r5
                boolean r6 = r0.f62058I
                r5 = r5 | r6
                r0.f62058I = r5
                int r4 = r4 + 1
                goto L_0x0044
            L_0x0076:
                p7.v r1 = new p7.v
                r1.<init>(r2)
                r0.f62054E = r1
                r0.f62050A = r5
                p7.j$e r1 = r0.f62070i
                long r2 = r0.f62055F
                b7.l r4 = r0.f62081w
                boolean r4 = r4.mo17730f()
                p7.l r1 = (p370p7.C21941l) r1
                r1.mo35016g(r2, r4)
                p7.n$a r1 = r0.f62080v
                r1.mo34987f(r0)
                goto L_0x0097
            L_0x0094:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L_0x0097:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p370p7.C21933j.C21934a.run():void");
        }
    }

    /* renamed from: p7.j$b */
    public class C21935b implements Runnable {
        public C21935b() {
        }

        public void run() {
            C21933j jVar = C21933j.this;
            if (!jVar.f62064P) {
                jVar.f62080v.mo34988g(jVar);
            }
        }
    }

    /* renamed from: p7.j$c */
    public final class C21936c implements C16876u.C16879c {

        /* renamed from: a */
        public final Uri f62087a;

        /* renamed from: b */
        public final C79946g f62088b;

        /* renamed from: c */
        public final C21937d f62089c;

        /* renamed from: d */
        public final C20532f f62090d;

        /* renamed from: e */
        public final C16747k f62091e = new C16747k();

        /* renamed from: f */
        public volatile boolean f62092f;

        /* renamed from: g */
        public boolean f62093g = true;

        /* renamed from: h */
        public long f62094h;

        /* renamed from: i */
        public long f62095i = -1;

        public C21936c(Uri uri, C79946g gVar, C21937d dVar, C20532f fVar) {
            uri.getClass();
            this.f62087a = uri;
            gVar.getClass();
            this.f62088b = gVar;
            dVar.getClass();
            this.f62089c = dVar;
            this.f62090d = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x009b, code lost:
            r2 = r5;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17945a() {
            /*
                r15 = this;
                r0 = 0
                r1 = 0
            L_0x0002:
                if (r1 != 0) goto L_0x00ae
                boolean r2 = r15.f62092f
                if (r2 != 0) goto L_0x00ae
                r2 = 0
                r3 = 1
                b7.k r4 = r15.f62091e     // Catch:{ all -> 0x009d }
                long r12 = r4.f45264a     // Catch:{ all -> 0x009d }
                c8.g r4 = r15.f62088b     // Catch:{ all -> 0x009d }
                c8.j r14 = new c8.j     // Catch:{ all -> 0x009d }
                android.net.Uri r6 = r15.f62087a     // Catch:{ all -> 0x009d }
                r9 = -1
                p7.j r5 = p370p7.C21933j.this     // Catch:{ all -> 0x009d }
                java.lang.String r11 = r5.f62072n     // Catch:{ all -> 0x009d }
                r5 = r14
                r7 = r12
                r5.<init>(r6, r7, r9, r11)     // Catch:{ all -> 0x009d }
                long r4 = r4.mo110126b(r14)     // Catch:{ all -> 0x009d }
                r15.f62095i = r4     // Catch:{ all -> 0x009d }
                r6 = -1
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 == 0) goto L_0x002e
                long r4 = r4 + r12
                r15.f62095i = r4     // Catch:{ all -> 0x009d }
            L_0x002e:
                b7.b r4 = new b7.b     // Catch:{ all -> 0x009d }
                c8.g r11 = r15.f62088b     // Catch:{ all -> 0x009d }
                long r9 = r15.f62095i     // Catch:{ all -> 0x009d }
                r5 = r4
                r6 = r11
                r7 = r12
                r5.<init>(r6, r7, r9)     // Catch:{ all -> 0x009d }
                p7.j$d r2 = r15.f62089c     // Catch:{ all -> 0x009a }
                android.net.Uri r5 = r11.getUri()     // Catch:{ all -> 0x009a }
                b7.e r2 = r2.mo35013a(r4, r5)     // Catch:{ all -> 0x009a }
                boolean r5 = r15.f62093g     // Catch:{ all -> 0x009a }
                if (r5 == 0) goto L_0x004f
                long r5 = r15.f62094h     // Catch:{ all -> 0x009a }
                r2.mo17746b(r12, r5)     // Catch:{ all -> 0x009a }
                r15.f62093g = r0     // Catch:{ all -> 0x009a }
            L_0x004f:
                if (r1 != 0) goto L_0x0089
                boolean r5 = r15.f62092f     // Catch:{ all -> 0x009a }
                if (r5 != 0) goto L_0x0089
                e8.f r5 = r15.f62090d     // Catch:{ all -> 0x009a }
                monitor-enter(r5)     // Catch:{ all -> 0x009a }
            L_0x0058:
                boolean r6 = r5.f57781a     // Catch:{ all -> 0x0086 }
                if (r6 != 0) goto L_0x0060
                r5.wait()     // Catch:{ all -> 0x0086 }
                goto L_0x0058
            L_0x0060:
                monitor-exit(r5)     // Catch:{ all -> 0x009a }
                b7.k r5 = r15.f62091e     // Catch:{ all -> 0x009a }
                int r1 = r2.mo17745a(r4, r5)     // Catch:{ all -> 0x009a }
                long r5 = r4.f45242c     // Catch:{ all -> 0x009a }
                p7.j r7 = p370p7.C21933j.this     // Catch:{ all -> 0x009a }
                long r7 = r7.f62073o     // Catch:{ all -> 0x009a }
                long r7 = r7 + r12
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 <= 0) goto L_0x004f
                e8.f r7 = r15.f62090d     // Catch:{ all -> 0x009a }
                monitor-enter(r7)     // Catch:{ all -> 0x009a }
                r7.f57781a = r0     // Catch:{ all -> 0x0083 }
                monitor-exit(r7)     // Catch:{ all -> 0x009a }
                p7.j r7 = p370p7.C21933j.this     // Catch:{ all -> 0x009a }
                android.os.Handler r8 = r7.f62079u     // Catch:{ all -> 0x009a }
                java.lang.Runnable r7 = r7.f62078t     // Catch:{ all -> 0x009a }
                r8.post(r7)     // Catch:{ all -> 0x009a }
                r12 = r5
                goto L_0x004f
            L_0x0083:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x009a }
                throw r0     // Catch:{ all -> 0x009a }
            L_0x0086:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x009a }
                throw r0     // Catch:{ all -> 0x009a }
            L_0x0089:
                if (r1 != r3) goto L_0x008d
                r1 = 0
                goto L_0x0093
            L_0x008d:
                b7.k r2 = r15.f62091e
                long r3 = r4.f45242c
                r2.f45264a = r3
            L_0x0093:
                c8.g r2 = r15.f62088b
                p333e8.C20551y.m22314d(r2)
                goto L_0x0002
            L_0x009a:
                r0 = move-exception
                r2 = r4
                goto L_0x009e
            L_0x009d:
                r0 = move-exception
            L_0x009e:
                if (r1 == r3) goto L_0x00a8
                if (r2 == 0) goto L_0x00a8
                b7.k r1 = r15.f62091e
                long r2 = r2.f45242c
                r1.f45264a = r2
            L_0x00a8:
                c8.g r1 = r15.f62088b
                p333e8.C20551y.m22314d(r1)
                throw r0
            L_0x00ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p370p7.C21933j.C21936c.mo17945a():void");
        }

        /* renamed from: b */
        public void mo17946b() {
            this.f62092f = true;
        }

        /* renamed from: c */
        public boolean mo17947c() {
            return this.f62092f;
        }
    }

    /* renamed from: p7.j$d */
    public static final class C21937d {

        /* renamed from: a */
        public final C16741e[] f62097a;

        /* renamed from: b */
        public final C16743g f62098b;

        /* renamed from: c */
        public C16741e f62099c;

        public C21937d(C16741e[] eVarArr, C16743g gVar) {
            this.f62097a = eVarArr;
            this.f62098b = gVar;
        }

        /* renamed from: a */
        public C16741e mo35013a(C16742f fVar, Uri uri) {
            C16741e eVar = this.f62099c;
            if (eVar != null) {
                return eVar;
            }
            C16741e[] eVarArr = this.f62097a;
            int length = eVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C16741e eVar2 = eVarArr[i];
                try {
                    if (eVar2.mo17747c(fVar)) {
                        this.f62099c = eVar2;
                        ((C16738b) fVar).f45244e = 0;
                        break;
                    }
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    ((C16738b) fVar).f45244e = 0;
                    throw th;
                }
                ((C16738b) fVar).f45244e = 0;
                i++;
            }
            C16741e eVar3 = this.f62099c;
            if (eVar3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("None of the available extractors (");
                C16741e[] eVarArr2 = this.f62097a;
                int i2 = C20551y.f57835a;
                StringBuilder sb4 = new StringBuilder();
                for (int i3 = 0; i3 < eVarArr2.length; i3++) {
                    sb4.append(eVarArr2[i3].getClass().getSimpleName());
                    if (i3 < eVarArr2.length - 1) {
                        sb4.append(", ");
                    }
                }
                sb.append(sb4.toString());
                sb.append(") could read the stream.");
                throw new C117991w(sb.toString(), uri);
            }
            eVar3.mo17748e(this.f62098b);
            return this.f62099c;
        }
    }

    /* renamed from: p7.j$e */
    public interface C21938e {
    }

    /* renamed from: p7.j$f */
    public final class C21939f implements C21957r {

        /* renamed from: a */
        public final int f62100a;

        public C21939f(int i) {
            this.f62100a = i;
        }

        /* renamed from: a */
        public int mo34995a(C23010j jVar, C23455e eVar, boolean z) {
            C21933j jVar2 = C21933j.this;
            int i = this.f62100a;
            if (jVar2.f62052C || jVar2.mo35009t()) {
                return -3;
            }
            return jVar2.f62082x[i].mo35032k(jVar, eVar, z, jVar2.f62063N, jVar2.f62060K);
        }

        /* renamed from: b */
        public void mo34996b(long j) {
            long j2;
            C21933j jVar = C21933j.this;
            C21954q qVar = jVar.f62082x[this.f62100a];
            if (jVar.f62063N) {
                C21952p pVar = qVar.f62149c;
                synchronized (pVar) {
                    j2 = pVar.f62139n;
                }
                if (j > j2) {
                    C21952p pVar2 = qVar.f62149c;
                    synchronized (pVar2) {
                        if (pVar2.mo35025f()) {
                            pVar2.f62137l = pVar2.f62134i;
                            return;
                        }
                        return;
                    }
                }
            }
            qVar.mo35026e(j, true, true);
        }

        /* renamed from: c */
        public void mo34997c() {
            C21933j.this.f62074p.mo17935b();
        }

        public boolean isReady() {
            C21933j jVar = C21933j.this;
            return jVar.f62063N || (!jVar.mo35009t() && jVar.f62082x[this.f62100a].f62149c.mo35025f());
        }
    }

    public C21933j(Uri uri, C79946g gVar, C16741e[] eVarArr, int i, Handler handler, C21941l.C21942a aVar, C21938e eVar, C16870b bVar, String str, int i2) {
        this.f62065d = uri;
        this.f62066e = gVar;
        this.f62067f = i;
        this.f62068g = handler;
        this.f62069h = aVar;
        this.f62070i = eVar;
        this.f62071j = bVar;
        this.f62072n = str;
        this.f62073o = (long) i2;
        this.f62075q = new C21937d(eVarArr, this);
        this.f62076r = new C20532f();
        this.f62077s = new C21934a();
        this.f62078t = new C21935b();
        this.f62079u = new Handler();
        this.f62083y = new int[0];
        this.f62082x = new C21954q[0];
        this.f62061L = -9223372036854775807L;
        this.f62059J = -1;
    }

    /* renamed from: a */
    public long mo34983a() {
        long j;
        long j2;
        long j3;
        if (this.f62063N) {
            return Long.MIN_VALUE;
        }
        if (mo35009t()) {
            return this.f62061L;
        }
        int i = 0;
        if (this.f62058I) {
            j = MAlarmHandler.NEXT_FIRE_INTERVAL;
            int length = this.f62082x.length;
            while (i < length) {
                if (this.f62057H[i]) {
                    C21952p pVar = this.f62082x[i].f62149c;
                    synchronized (pVar) {
                        j3 = pVar.f62139n;
                    }
                    j = Math.min(j, j3);
                }
                i++;
            }
        } else {
            C21954q[] qVarArr = this.f62082x;
            int length2 = qVarArr.length;
            long j4 = Long.MIN_VALUE;
            while (i < length2) {
                C21952p pVar2 = qVarArr[i].f62149c;
                synchronized (pVar2) {
                    j2 = pVar2.f62139n;
                }
                j4 = Math.max(j4, j2);
                i++;
            }
            j = j4;
        }
        return j == Long.MIN_VALUE ? this.f62060K : j;
    }

    /* renamed from: b */
    public boolean mo34984b(long j) {
        boolean z = false;
        if (this.f62063N || (this.f62050A && this.f62053D == 0)) {
            return false;
        }
        C20532f fVar = this.f62076r;
        synchronized (fVar) {
            if (!fVar.f57781a) {
                fVar.f57781a = true;
                fVar.notifyAll();
                z = true;
            }
        }
        if (this.f62074p.mo17934a()) {
            return z;
        }
        mo35010u();
        return true;
    }

    /* renamed from: c */
    public long mo34985c() {
        if (this.f62053D == 0) {
            return Long.MIN_VALUE;
        }
        return mo34983a();
    }

    /* renamed from: d */
    public void mo35007d(Format format) {
        this.f62079u.post(this.f62077s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r3 = false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo34986e(long r8) {
        /*
            r7 = this;
            b7.l r0 = r7.f62081w
            boolean r0 = r0.mo17730f()
            if (r0 == 0) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r8 = 0
        L_0x000b:
            r7.f62060K = r8
            r0 = 0
            r7.f62052C = r0
            boolean r1 = r7.mo35009t()
            if (r1 != 0) goto L_0x0052
            p7.q[] r1 = r7.f62082x
            int r1 = r1.length
            r2 = 0
        L_0x001a:
            r3 = 1
            if (r2 >= r1) goto L_0x004f
            p7.q[] r4 = r7.f62082x
            r4 = r4[r2]
            r4.mo35035n()
            boolean r3 = r4.mo35026e(r8, r3, r0)
            if (r3 != 0) goto L_0x0036
            boolean[] r3 = r7.f62057H
            boolean r3 = r3[r2]
            if (r3 != 0) goto L_0x0034
            boolean r3 = r7.f62058I
            if (r3 != 0) goto L_0x0036
        L_0x0034:
            r3 = 0
            goto L_0x004f
        L_0x0036:
            p7.p r3 = r4.f62149c
            monitor-enter(r3)
            int r5 = r3.f62137l     // Catch:{ all -> 0x004c }
            if (r5 != 0) goto L_0x0041
            r5 = -1
            monitor-exit(r3)
            goto L_0x0046
        L_0x0041:
            long r5 = r3.mo35020a(r5)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
        L_0x0046:
            r4.mo35027f(r5)
            int r2 = r2 + 1
            goto L_0x001a
        L_0x004c:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        L_0x004f:
            if (r3 == 0) goto L_0x0052
            return r8
        L_0x0052:
            r7.f62061L = r8
            r7.f62063N = r0
            c8.u r1 = r7.f62074p
            boolean r1 = r1.mo17934a()
            if (r1 == 0) goto L_0x0066
            c8.u r1 = r7.f62074p
            c8.u$b<? extends c8.u$c> r1 = r1.f45618b
            r1.mo17941a(r0)
            goto L_0x0074
        L_0x0066:
            p7.q[] r1 = r7.f62082x
            int r2 = r1.length
            r3 = 0
        L_0x006a:
            if (r3 >= r2) goto L_0x0074
            r4 = r1[r3]
            r4.mo35034m(r0)
            int r3 = r3 + 1
            goto L_0x006a
        L_0x0074:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p370p7.C21933j.mo34986e(long):long");
    }

    /* renamed from: f */
    public void mo17948f() {
        C21937d dVar = this.f62075q;
        C16741e eVar = dVar.f62099c;
        if (eVar != null) {
            eVar.release();
            dVar.f62099c = null;
        }
        for (C21954q m : this.f62082x) {
            m.mo35034m(false);
        }
    }

    /* renamed from: g */
    public void mo17750g(C16748l lVar) {
        this.f62081w = lVar;
        this.f62079u.post(this.f62077s);
    }

    /* renamed from: h */
    public void mo34989h(C21947n.C21948a aVar, long j) {
        this.f62080v = aVar;
        C20532f fVar = this.f62076r;
        synchronized (fVar) {
            if (!fVar.f57781a) {
                fVar.f57781a = true;
                fVar.notifyAll();
            }
        }
        mo35010u();
    }

    /* renamed from: i */
    public void mo17751i() {
        this.f62084z = true;
        this.f62079u.post(this.f62077s);
    }

    /* renamed from: j */
    public void mo17938j(C16876u.C16879c cVar, long j, long j2) {
        long j3;
        C21936c cVar2 = (C21936c) cVar;
        if (this.f62059J == -1) {
            this.f62059J = cVar2.f62095i;
        }
        this.f62063N = true;
        if (this.f62055F == -9223372036854775807L) {
            long j4 = Long.MIN_VALUE;
            for (C21954q qVar : this.f62082x) {
                C21952p pVar = qVar.f62149c;
                synchronized (pVar) {
                    j3 = pVar.f62139n;
                }
                j4 = Math.max(j4, j3);
            }
            long j5 = j4 == Long.MIN_VALUE ? 0 : 10000 + j4;
            this.f62055F = j5;
            ((C21941l) this.f62070i).mo35016g(j5, this.f62081w.mo17730f());
        }
        this.f62080v.mo34988g(this);
    }

    /* renamed from: k */
    public long mo34990k(C16772f[] fVarArr, boolean[] zArr, C21957r[] rVarArr, boolean[] zArr2, long j) {
        C16772f fVar;
        C20528a.m22240d(this.f62050A);
        int i = this.f62053D;
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            C21939f fVar2 = rVarArr[i2];
            if (fVar2 != null && (fVarArr[i2] == null || !zArr[i2])) {
                int i3 = fVar2.f62100a;
                C20528a.m22240d(this.f62056G[i3]);
                this.f62053D--;
                this.f62056G[i3] = false;
                rVarArr[i2] = null;
            }
        }
        boolean z = !this.f62051B ? j != 0 : i == 0;
        for (int i4 = 0; i4 < fVarArr.length; i4++) {
            if (rVarArr[i4] == null && (fVar = fVarArr[i4]) != null) {
                C20528a.m22240d(fVar.length() == 1);
                C20528a.m22240d(fVar.mo17788a(0) == 0);
                int a = this.f62054E.mo35039a(fVar.mo17794f());
                C20528a.m22240d(!this.f62056G[a]);
                this.f62053D++;
                this.f62056G[a] = true;
                rVarArr[i4] = new C21939f(a);
                zArr2[i4] = true;
                if (!z) {
                    C21954q qVar = this.f62082x[a];
                    qVar.mo35035n();
                    if (!qVar.mo35026e(j, true, true)) {
                        C21952p pVar = qVar.f62149c;
                        if (pVar.f62135j + pVar.f62137l != 0) {
                            z = true;
                        }
                    }
                    z = false;
                }
            }
        }
        if (this.f62053D == 0) {
            this.f62052C = false;
            if (this.f62074p.mo17934a()) {
                for (C21954q h : this.f62082x) {
                    h.mo35029h();
                }
                this.f62074p.f45618b.mo17941a(false);
            } else {
                for (C21954q m : this.f62082x) {
                    m.mo35034m(false);
                }
            }
        } else if (z) {
            j = mo34986e(j);
            for (int i5 = 0; i5 < rVarArr.length; i5++) {
                if (rVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f62051B = true;
        return j;
    }

    /* renamed from: l */
    public void mo17939l(C16876u.C16879c cVar, long j, long j2, boolean z) {
        C21936c cVar2 = (C21936c) cVar;
        if (!z) {
            if (this.f62059J == -1) {
                this.f62059J = cVar2.f62095i;
            }
            for (C21954q m : this.f62082x) {
                m.mo35034m(false);
            }
            if (this.f62053D > 0) {
                this.f62080v.mo34988g(this);
            }
        }
    }

    /* renamed from: m */
    public long mo34991m() {
        if (!this.f62052C) {
            return -9223372036854775807L;
        }
        this.f62052C = false;
        return this.f62060K;
    }

    /* renamed from: n */
    public C21962v mo34992n() {
        return this.f62054E;
    }

    /* renamed from: o */
    public C16750m mo17752o(int i, int i2) {
        int length = this.f62082x.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f62083y[i3] == i) {
                return this.f62082x[i3];
            }
        }
        C21954q qVar = new C21954q(this.f62071j);
        qVar.f62158l = this;
        int i4 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f62083y, i4);
        this.f62083y = copyOf;
        copyOf[length] = i;
        C21954q[] qVarArr = (C21954q[]) Arrays.copyOf(this.f62082x, i4);
        this.f62082x = qVarArr;
        qVarArr[length] = qVar;
        return qVar;
    }

    /* renamed from: p */
    public int mo17940p(C16876u.C16879c cVar, long j, long j2, IOException iOException) {
        C16748l lVar;
        C21936c cVar2 = (C21936c) cVar;
        if (this.f62059J == -1) {
            this.f62059J = cVar2.f62095i;
        }
        Handler handler = this.f62068g;
        if (!(handler == null || this.f62069h == null)) {
            handler.post(new C21940k(this, iOException));
        }
        if (iOException instanceof C117991w) {
            return 3;
        }
        int i = mo35008s() > this.f62062M ? 1 : 0;
        if (this.f62059J == -1 && ((lVar = this.f62081w) == null || lVar.mo17732h() == -9223372036854775807L)) {
            this.f62060K = 0;
            this.f62052C = this.f62050A;
            for (C21954q m : this.f62082x) {
                m.mo35034m(false);
            }
            cVar2.f62091e.f45264a = 0;
            cVar2.f62094h = 0;
            cVar2.f62093g = true;
        }
        this.f62062M = mo35008s();
        return i;
    }

    /* renamed from: q */
    public void mo34993q() {
        this.f62074p.mo17935b();
    }

    /* renamed from: r */
    public void mo34994r(long j) {
        int length = this.f62082x.length;
        for (int i = 0; i < length; i++) {
            this.f62082x[i].mo35028g(j, false, this.f62056G[i]);
        }
    }

    /* renamed from: s */
    public final int mo35008s() {
        int i = 0;
        for (C21954q qVar : this.f62082x) {
            C21952p pVar = qVar.f62149c;
            i += pVar.f62135j + pVar.f62134i;
        }
        return i;
    }

    /* renamed from: t */
    public final boolean mo35009t() {
        return this.f62061L != -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r0 = r9.f62081w;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35010u() {
        /*
            r9 = this;
            p7.j$c r6 = new p7.j$c
            android.net.Uri r2 = r9.f62065d
            c8.g r3 = r9.f62066e
            p7.j$d r4 = r9.f62075q
            e8.f r5 = r9.f62076r
            r0 = r6
            r1 = r9
            r0.<init>(r2, r3, r4, r5)
            boolean r0 = r9.f62050A
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r9.mo35009t()
            p333e8.C20528a.m22240d(r0)
            long r3 = r9.f62055F
            r0 = 1
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0031
            long r7 = r9.f62061L
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0031
            r9.f62063N = r0
            r9.f62061L = r1
            return
        L_0x0031:
            b7.l r3 = r9.f62081w
            long r4 = r9.f62061L
            long r3 = r3.mo17731g(r4)
            long r7 = r9.f62061L
            b7.k r5 = r6.f62091e
            r5.f45264a = r3
            r6.f62094h = r7
            r6.f62093g = r0
            r9.f62061L = r1
        L_0x0045:
            int r0 = r9.mo35008s()
            r9.f62062M = r0
            int r0 = r9.f62067f
            r3 = -1
            if (r0 != r3) goto L_0x006c
            boolean r0 = r9.f62050A
            if (r0 == 0) goto L_0x006b
            long r3 = r9.f62059J
            r7 = -1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x006b
            b7.l r0 = r9.f62081w
            if (r0 == 0) goto L_0x0069
            long r3 = r0.mo17732h()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r0 = 6
            goto L_0x006c
        L_0x006b:
            r0 = 3
        L_0x006c:
            c8.u r1 = r9.f62074p
            r1.mo17937d(r6, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p370p7.C21933j.mo35010u():void");
    }
}
