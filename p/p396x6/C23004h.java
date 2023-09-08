package p396x6;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import p295b8.C16772f;
import p295b8.C16774g;
import p295b8.C16775h;
import p295b8.C16776i;
import p333e8.C20528a;
import p333e8.C20535i;
import p333e8.C20547s;
import p370p7.C21928g;
import p370p7.C21947n;
import p370p7.C21949o;
import p370p7.C21957r;
import p370p7.C21958s;
import p396x6.C22998f;
import p396x6.C23013m;
import p396x6.C23027v;

/* renamed from: x6.h */
public final class C23004h implements Handler.Callback, C21947n.C21948a, C21949o.C21950a {

    /* renamed from: A */
    public boolean f66108A;

    /* renamed from: B */
    public boolean f66109B;

    /* renamed from: C */
    public int f66110C = 1;

    /* renamed from: D */
    public int f66111D;

    /* renamed from: E */
    public int f66112E;

    /* renamed from: F */
    public int f66113F;

    /* renamed from: G */
    public long f66114G;

    /* renamed from: H */
    public int f66115H;

    /* renamed from: I */
    public C23007c f66116I;

    /* renamed from: J */
    public long f66117J;

    /* renamed from: K */
    public C23005a f66118K;

    /* renamed from: L */
    public C23005a f66119L;

    /* renamed from: M */
    public C23005a f66120M;

    /* renamed from: N */
    public C23027v f66121N;

    /* renamed from: d */
    public final C23019q[] f66122d;

    /* renamed from: e */
    public final C23020r[] f66123e;

    /* renamed from: f */
    public final C16775h f66124f;

    /* renamed from: g */
    public final C23012l f66125g;

    /* renamed from: h */
    public final C20547s f66126h;

    /* renamed from: i */
    public final Handler f66127i;

    /* renamed from: j */
    public final HandlerThread f66128j;

    /* renamed from: n */
    public final Handler f66129n;

    /* renamed from: o */
    public final C22998f f66130o;

    /* renamed from: p */
    public final C23027v.C23030c f66131p;

    /* renamed from: q */
    public final C23027v.C23029b f66132q;

    /* renamed from: r */
    public final C23013m f66133r;

    /* renamed from: s */
    public C23006b f66134s;

    /* renamed from: t */
    public C23016o f66135t;

    /* renamed from: u */
    public C23019q f66136u;

    /* renamed from: v */
    public C20535i f66137v;

    /* renamed from: w */
    public C21949o f66138w;

    /* renamed from: x */
    public C23019q[] f66139x;

    /* renamed from: y */
    public boolean f66140y;

    /* renamed from: z */
    public boolean f66141z;

    /* renamed from: x6.h$a */
    public static final class C23005a {

        /* renamed from: a */
        public final C21947n f66142a;

        /* renamed from: b */
        public final Object f66143b;

        /* renamed from: c */
        public final int f66144c;

        /* renamed from: d */
        public final C21957r[] f66145d;

        /* renamed from: e */
        public final boolean[] f66146e;

        /* renamed from: f */
        public final long f66147f;

        /* renamed from: g */
        public C23013m.C23014a f66148g;

        /* renamed from: h */
        public boolean f66149h;

        /* renamed from: i */
        public boolean f66150i;

        /* renamed from: j */
        public C23005a f66151j;

        /* renamed from: k */
        public C16776i f66152k;

        /* renamed from: l */
        public final C23019q[] f66153l;

        /* renamed from: m */
        public final C23020r[] f66154m;

        /* renamed from: n */
        public final C16775h f66155n;

        /* renamed from: o */
        public final C23012l f66156o;

        /* renamed from: p */
        public final C21949o f66157p;

        /* renamed from: q */
        public C16776i f66158q;

        public C23005a(C23019q[] qVarArr, C23020r[] rVarArr, long j, C16775h hVar, C23012l lVar, C21949o oVar, Object obj, int i, C23013m.C23014a aVar) {
            this.f66153l = qVarArr;
            this.f66154m = rVarArr;
            this.f66147f = j;
            this.f66155n = hVar;
            this.f66156o = lVar;
            this.f66157p = oVar;
            obj.getClass();
            this.f66143b = obj;
            this.f66144c = i;
            this.f66148g = aVar;
            this.f66145d = new C21957r[qVarArr.length];
            this.f66146e = new boolean[qVarArr.length];
            C21947n d = oVar.mo35002d(aVar.f66178a, lVar.mo36253c());
            long j2 = aVar.f66180c;
            if (j2 != Long.MIN_VALUE) {
                C21928g gVar = new C21928g(d, true);
                gVar.f62029f = 0;
                gVar.f62030g = j2;
                d = gVar;
            }
            this.f66142a = d;
        }

        /* renamed from: a */
        public long mo36308a() {
            return this.f66144c == 0 ? this.f66147f : this.f66147f - this.f66148g.f66179b;
        }

        /* renamed from: b */
        public void mo36309b() {
            try {
                if (this.f66148g.f66180c != Long.MIN_VALUE) {
                    this.f66157p.mo34999a(((C21928g) this.f66142a).f62027d);
                } else {
                    this.f66157p.mo34999a(this.f66142a);
                }
            } catch (RuntimeException unused) {
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo36310c() {
            /*
                r6 = this;
                b8.h r0 = r6.f66155n
                x6.r[] r1 = r6.f66154m
                p7.n r2 = r6.f66142a
                p7.v r2 = r2.mo34992n()
                b8.i r0 = r0.mo17805b(r1, r2)
                b8.i r1 = r6.f66158q
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L_0x0019
                r0.getClass()
            L_0x0017:
                r1 = 0
                goto L_0x002b
            L_0x0019:
                r4 = 0
            L_0x001a:
                b8.g r5 = r0.f45338b
                int r5 = r5.f45334a
                if (r4 >= r5) goto L_0x002a
                boolean r5 = r0.mo17808a(r1, r4)
                if (r5 != 0) goto L_0x0027
                goto L_0x0017
            L_0x0027:
                int r4 = r4 + 1
                goto L_0x001a
            L_0x002a:
                r1 = 1
            L_0x002b:
                if (r1 == 0) goto L_0x002e
                return r3
            L_0x002e:
                r6.f66152k = r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p396x6.C23004h.C23005a.mo36310c():boolean");
        }

        /* renamed from: d */
        public long mo36311d(long j, boolean z, boolean[] zArr) {
            C16774g gVar = this.f66152k.f45338b;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= gVar.f45334a) {
                    break;
                }
                boolean[] zArr2 = this.f66146e;
                if (z || !this.f66152k.mo17808a(this.f66158q, i)) {
                    z2 = false;
                }
                zArr2[i] = z2;
                i++;
            }
            long k = this.f66142a.mo34990k((C16772f[]) gVar.f45335b.clone(), this.f66146e, this.f66145d, zArr, j);
            this.f66158q = this.f66152k;
            this.f66150i = false;
            int i2 = 0;
            while (true) {
                C21957r[] rVarArr = this.f66145d;
                if (i2 < rVarArr.length) {
                    if (rVarArr[i2] != null) {
                        C20528a.m22240d(gVar.f45335b[i2] != null);
                        this.f66150i = true;
                    } else {
                        C20528a.m22240d(gVar.f45335b[i2] == null);
                    }
                    i2++;
                } else {
                    this.f66156o.mo36255e(this.f66153l, this.f66152k.f45337a, gVar);
                    return k;
                }
            }
        }
    }

    /* renamed from: x6.h$c */
    public static final class C23007c {

        /* renamed from: a */
        public final C23027v f66164a;

        /* renamed from: b */
        public final int f66165b;

        /* renamed from: c */
        public final long f66166c;

        public C23007c(C23027v vVar, int i, long j) {
            this.f66164a = vVar;
            this.f66165b = i;
            this.f66166c = j;
        }
    }

    /* renamed from: x6.h$d */
    public static final class C23008d {

        /* renamed from: a */
        public final C23027v f66167a;

        /* renamed from: b */
        public final Object f66168b;

        /* renamed from: c */
        public final C23006b f66169c;

        /* renamed from: d */
        public final int f66170d;

        public C23008d(C23027v vVar, Object obj, C23006b bVar, int i) {
            this.f66167a = vVar;
            this.f66168b = obj;
            this.f66169c = bVar;
            this.f66170d = i;
        }
    }

    public C23004h(C23019q[] qVarArr, C16775h hVar, C23012l lVar, boolean z, int i, Handler handler, C23006b bVar, C22998f fVar) {
        this.f66122d = qVarArr;
        this.f66124f = hVar;
        this.f66125g = lVar;
        this.f66141z = z;
        this.f66111D = i;
        this.f66129n = handler;
        this.f66134s = bVar;
        this.f66130o = fVar;
        this.f66123e = new C23020r[qVarArr.length];
        for (int i2 = 0; i2 < qVarArr.length; i2++) {
            qVarArr[i2].setIndex(i2);
            this.f66123e[i2] = qVarArr[i2].mo36240k();
        }
        this.f66126h = new C20547s();
        this.f66139x = new C23019q[0];
        this.f66131p = new C23027v.C23030c();
        this.f66132q = new C23027v.C23029b();
        this.f66133r = new C23013m();
        hVar.getClass();
        this.f66135t = C23016o.f66185d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f66128j = handlerThread;
        handlerThread.start();
        this.f66127i = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: A */
    public final void mo36277A(C23005a aVar) {
        if (this.f66120M != aVar) {
            boolean[] zArr = new boolean[this.f66122d.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                C23019q[] qVarArr = this.f66122d;
                if (i < qVarArr.length) {
                    C23019q qVar = qVarArr[i];
                    boolean z = qVar.getState() != 0;
                    zArr[i] = z;
                    C16772f fVar = aVar.f66152k.f45338b.f45335b[i];
                    if (fVar != null) {
                        i2++;
                    }
                    if (z && (fVar == null || (qVar.mo36242n() && qVar.mo36243o() == this.f66120M.f66145d[i]))) {
                        if (qVar == this.f66136u) {
                            C20547s sVar = this.f66126h;
                            C20535i iVar = this.f66137v;
                            sVar.getClass();
                            sVar.mo32129a(iVar.mo32083r());
                            sVar.f57831g = iVar.mo32082d();
                            this.f66137v = null;
                            this.f66136u = null;
                        }
                        if (qVar.getState() == 2) {
                            qVar.stop();
                        }
                        qVar.disable();
                    }
                    i++;
                } else {
                    this.f66120M = aVar;
                    this.f66129n.obtainMessage(3, aVar.f66152k).sendToTarget();
                    mo36285b(zArr, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: B */
    public final void mo36278B(int i) {
        C23005a aVar;
        C23005a aVar2;
        this.f66111D = i;
        this.f66133r.f66177d = i;
        C23005a aVar3 = this.f66120M;
        if (aVar3 == null) {
            aVar3 = this.f66118K;
        }
        if (aVar3 != null) {
            while (true) {
                int b = this.f66121N.mo36341b(aVar3.f66148g.f66178a.f62123a, this.f66132q, this.f66131p, i);
                while (true) {
                    aVar = aVar3.f66151j;
                    if (aVar != null && !aVar3.f66148g.f66183f) {
                        aVar3 = aVar;
                    }
                }
                if (b == -1 || aVar == null || aVar.f66148g.f66178a.f62123a != b) {
                    int i2 = this.f66118K.f66144c;
                    C23005a aVar4 = this.f66119L;
                } else {
                    aVar3 = aVar;
                }
            }
            int i25 = this.f66118K.f66144c;
            C23005a aVar42 = this.f66119L;
            int i3 = aVar42 != null ? aVar42.f66144c : -1;
            if (aVar != null) {
                while (aVar != null) {
                    aVar.mo36309b();
                    aVar = aVar.f66151j;
                }
                aVar3.f66151j = null;
            }
            C23013m mVar = this.f66133r;
            C23013m.C23014a aVar5 = aVar3.f66148g;
            mVar.getClass();
            aVar3.f66148g = mVar.mo36315d(aVar5, aVar5.f66178a);
            int i4 = aVar3.f66144c;
            boolean z = false;
            if (!(i25 <= i4)) {
                this.f66118K = aVar3;
            }
            if (i3 != -1 && i3 <= i4) {
                z = true;
            }
            if (!z && (aVar2 = this.f66120M) != null) {
                C21949o.C21951b bVar = aVar2.f66148g.f66178a;
                this.f66134s = new C23006b(bVar, mo36303v(bVar, this.f66134s.f66162d), this.f66134s.f66161c);
            }
        }
    }

    /* renamed from: C */
    public final void mo36279C(int i) {
        if (this.f66110C != i) {
            this.f66110C = i;
            this.f66129n.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: D */
    public final void mo36280D() {
        this.f66108A = false;
        C20547s sVar = this.f66126h;
        if (!sVar.f57828d) {
            sVar.f57830f = SystemClock.elapsedRealtime();
            sVar.f57828d = true;
        }
        for (C23019q start : this.f66139x) {
            start.start();
        }
    }

    /* renamed from: E */
    public final void mo36281E() {
        mo36297p(true);
        this.f66125g.mo36254d();
        mo36279C(1);
    }

    /* renamed from: F */
    public final void mo36282F() {
        C20547s sVar = this.f66126h;
        if (sVar.f57828d) {
            sVar.mo32129a(sVar.mo32083r());
            sVar.f57828d = false;
        }
        for (C23019q qVar : this.f66139x) {
            if (qVar.getState() == 2) {
                qVar.stop();
            }
        }
    }

    /* renamed from: G */
    public final void mo36283G() {
        C23005a aVar = this.f66120M;
        if (aVar != null) {
            long m = aVar.f66142a.mo34991m();
            if (m != -9223372036854775807L) {
                mo36298q(m);
            } else {
                C23019q qVar = this.f66136u;
                if (qVar == null || qVar.mo33310b()) {
                    this.f66117J = this.f66126h.mo32083r();
                } else {
                    long r = this.f66137v.mo32083r();
                    this.f66117J = r;
                    this.f66126h.mo32129a(r);
                }
                m = this.f66117J - this.f66120M.mo36308a();
            }
            this.f66134s.f66162d = m;
            this.f66114G = SystemClock.elapsedRealtime() * 1000;
            long a = this.f66139x.length == 0 ? Long.MIN_VALUE : this.f66120M.f66142a.mo34983a();
            C23006b bVar = this.f66134s;
            if (a == Long.MIN_VALUE) {
                a = this.f66120M.f66148g.f66182e;
            }
            bVar.f66163e = a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0245 A[LOOP:0: B:111:0x0245->B:115:0x0255, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0216  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36284a() {
        /*
            r30 = this;
            r0 = r30
            long r1 = android.os.SystemClock.elapsedRealtime()
            x6.v r3 = r0.f66121N
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -9223372036854775808
            r8 = 0
            if (r3 != 0) goto L_0x001c
            p7.o r3 = r0.f66138w
            if (r3 == 0) goto L_0x001c
            r3.mo35000b()
            r9 = 1
            goto L_0x0345
        L_0x001c:
            x6.h$a r3 = r0.f66118K
            if (r3 != 0) goto L_0x0033
            x6.m r10 = r0.f66133r
            x6.h$b r3 = r0.f66134s
            r10.getClass()
            p7.o$b r11 = r3.f66159a
            long r12 = r3.f66161c
            long r14 = r3.f66160b
            x6.m$a r3 = r10.mo36312a(r11, r12, r14)
            goto L_0x01a5
        L_0x0033:
            x6.m$a r10 = r3.f66148g
            boolean r10 = r10.f66184g
            if (r10 != 0) goto L_0x0211
            boolean r10 = r3.f66149h
            if (r10 == 0) goto L_0x004d
            boolean r10 = r3.f66150i
            if (r10 == 0) goto L_0x004b
            p7.n r3 = r3.f66142a
            long r10 = r3.mo34983a()
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x004d
        L_0x004b:
            r3 = 1
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 == 0) goto L_0x0211
            x6.h$a r3 = r0.f66118K
            x6.m$a r10 = r3.f66148g
            long r11 = r10.f66182e
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x005c
            goto L_0x0211
        L_0x005c:
            x6.h$a r11 = r0.f66120M
            if (r11 == 0) goto L_0x006b
            int r12 = r3.f66144c
            int r11 = r11.f66144c
            int r12 = r12 - r11
            r11 = 100
            if (r12 != r11) goto L_0x006b
            goto L_0x0211
        L_0x006b:
            x6.m r13 = r0.f66133r
            long r11 = r3.mo36308a()
            long r14 = r0.f66117J
            r13.getClass()
            boolean r3 = r10.f66183f
            r4 = -1
            if (r3 == 0) goto L_0x00ea
            x6.v r3 = r13.f66176c
            p7.o$b r5 = r10.f66178a
            int r5 = r5.f62123a
            x6.v$b r6 = r13.f66174a
            x6.v$c r7 = r13.f66175b
            int r9 = r13.f66177d
            int r3 = r3.mo36341b(r5, r6, r7, r9)
            if (r3 != r4) goto L_0x008f
            goto L_0x01a4
        L_0x008f:
            x6.v r4 = r13.f66176c
            x6.v$b r5 = r13.f66174a
            x6.v$b r4 = r4.mo34969e(r3, r5, r8)
            int r4 = r4.f66208c
            x6.v r5 = r13.f66176c
            x6.v$c r6 = r13.f66175b
            x6.v$c r5 = r5.mo36344h(r4, r6, r8)
            int r5 = r5.f66222f
            r6 = 0
            if (r5 != r3) goto L_0x00dc
            long r9 = r10.f66182e
            long r11 = r11 + r9
            long r11 = r11 - r14
            x6.v r3 = r13.f66176c
            x6.v$c r5 = r13.f66175b
            x6.v$b r9 = r13.f66174a
            r23 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r25 = java.lang.Math.max(r6, r11)
            r19 = r3
            r20 = r5
            r21 = r9
            r22 = r4
            android.util.Pair r3 = r19.mo36343g(r20, r21, r22, r23, r25)
            if (r3 != 0) goto L_0x00ca
            goto L_0x01a4
        L_0x00ca:
            java.lang.Object r4 = r3.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            r3 = r4
            goto L_0x00dd
        L_0x00dc:
            r5 = r6
        L_0x00dd:
            p7.o$b r14 = r13.mo36318g(r3, r5)
            r15 = r5
            r17 = r5
            x6.m$a r3 = r13.mo36312a(r14, r15, r17)
            goto L_0x01a5
        L_0x00ea:
            p7.o$b r3 = r10.f66178a
            boolean r5 = r3.mo35017a()
            if (r5 == 0) goto L_0x0145
            int r15 = r3.f62124b
            x6.v r5 = r13.f66176c
            int r6 = r3.f62123a
            x6.v$b r7 = r13.f66174a
            r5.mo36342d(r6, r7)
            x6.v$b r5 = r13.f66174a
            int[] r6 = r5.f66212g
            r6 = r6[r15]
            if (r6 != r4) goto L_0x0107
            goto L_0x01a4
        L_0x0107:
            int r7 = r3.f62125c
            r9 = 1
            int r7 = r7 + r9
            if (r7 >= r6) goto L_0x0128
            int[] r4 = r5.f66213h
            r4 = r4[r15]
            if (r7 >= r4) goto L_0x0115
            r4 = 1
            goto L_0x0116
        L_0x0115:
            r4 = 0
        L_0x0116:
            if (r4 != 0) goto L_0x011a
            goto L_0x01a4
        L_0x011a:
            int r14 = r3.f62123a
            long r3 = r10.f66181d
            r16 = r7
            r17 = r3
            x6.m$a r3 = r13.mo36313b(r14, r15, r16, r17)
            goto L_0x01a5
        L_0x0128:
            long r6 = r10.f66181d
            int r5 = r5.mo36346a(r6)
            if (r5 != r4) goto L_0x0133
            r17 = -9223372036854775808
            goto L_0x013b
        L_0x0133:
            x6.v$b r4 = r13.f66174a
            long[] r4 = r4.f66211f
            r5 = r4[r5]
            r17 = r5
        L_0x013b:
            int r14 = r3.f62123a
            long r3 = r10.f66181d
            r15 = r3
            x6.m$a r3 = r13.mo36314c(r14, r15, r17)
            goto L_0x01a5
        L_0x0145:
            long r5 = r10.f66180c
            r11 = -9223372036854775808
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x016e
            x6.v$b r4 = r13.f66174a
            int r15 = r4.mo36347b(r5)
            x6.v$b r4 = r13.f66174a
            int[] r4 = r4.f66213h
            r4 = r4[r15]
            if (r4 <= 0) goto L_0x015d
            r4 = 1
            goto L_0x015e
        L_0x015d:
            r4 = 0
        L_0x015e:
            if (r4 != 0) goto L_0x0161
            goto L_0x01a4
        L_0x0161:
            int r14 = r3.f62123a
            r16 = 0
            long r3 = r10.f66180c
            r17 = r3
            x6.m$a r3 = r13.mo36313b(r14, r15, r16, r17)
            goto L_0x01a5
        L_0x016e:
            x6.v$b r5 = r13.f66174a
            long[] r6 = r5.f66211f
            if (r6 != 0) goto L_0x0176
            r7 = 0
            goto L_0x0177
        L_0x0176:
            int r7 = r6.length
        L_0x0177:
            if (r7 == 0) goto L_0x01a4
            int r15 = r7 + -1
            r9 = r6[r15]
            r6 = -9223372036854775808
            int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01a4
            boolean r4 = r5.mo36348c(r15)
            if (r4 != 0) goto L_0x01a4
            x6.v$b r4 = r13.f66174a
            int[] r5 = r4.f66213h
            r5 = r5[r15]
            if (r5 <= 0) goto L_0x0193
            r5 = 1
            goto L_0x0194
        L_0x0193:
            r5 = 0
        L_0x0194:
            if (r5 != 0) goto L_0x0197
            goto L_0x01a4
        L_0x0197:
            long r4 = r4.f66209d
            int r14 = r3.f62123a
            r16 = 0
            r17 = r4
            x6.m$a r3 = r13.mo36313b(r14, r15, r16, r17)
            goto L_0x01a5
        L_0x01a4:
            r3 = 0
        L_0x01a5:
            if (r3 != 0) goto L_0x01ad
            p7.o r3 = r0.f66138w
            r3.mo35000b()
            goto L_0x0211
        L_0x01ad:
            x6.h$a r4 = r0.f66118K
            if (r4 != 0) goto L_0x01b5
            r4 = 60000000(0x3938700, double:2.96439388E-316)
            goto L_0x01c0
        L_0x01b5:
            long r4 = r4.mo36308a()
            x6.h$a r6 = r0.f66118K
            x6.m$a r6 = r6.f66148g
            long r6 = r6.f66182e
            long r4 = r4 + r6
        L_0x01c0:
            r22 = r4
            x6.h$a r4 = r0.f66118K
            if (r4 != 0) goto L_0x01ca
            r5 = 1
            r28 = 0
            goto L_0x01d0
        L_0x01ca:
            int r4 = r4.f66144c
            r5 = 1
            int r4 = r4 + r5
            r28 = r4
        L_0x01d0:
            x6.v r4 = r0.f66121N
            p7.o$b r6 = r3.f66178a
            int r6 = r6.f62123a
            x6.v$b r7 = r0.f66132q
            x6.v$b r4 = r4.mo34969e(r6, r7, r5)
            java.lang.Object r4 = r4.f66207b
            x6.h$a r5 = new x6.h$a
            x6.q[] r6 = r0.f66122d
            x6.r[] r7 = r0.f66123e
            b8.h r9 = r0.f66124f
            x6.l r10 = r0.f66125g
            p7.o r11 = r0.f66138w
            r19 = r5
            r20 = r6
            r21 = r7
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r4
            r29 = r3
            r19.<init>(r20, r21, r22, r24, r25, r26, r27, r28, r29)
            x6.h$a r4 = r0.f66118K
            if (r4 == 0) goto L_0x0203
            r4.f66151j = r5
        L_0x0203:
            r0.f66118K = r5
            p7.n r4 = r5.f66142a
            long r5 = r3.f66179b
            r4.mo34989h(r0, r5)
            r9 = 1
            r0.mo36305x(r9)
            goto L_0x0212
        L_0x0211:
            r9 = 1
        L_0x0212:
            x6.h$a r3 = r0.f66118K
            if (r3 == 0) goto L_0x023c
            boolean r4 = r3.f66149h
            if (r4 == 0) goto L_0x022c
            boolean r4 = r3.f66150i
            if (r4 == 0) goto L_0x022a
            p7.n r3 = r3.f66142a
            long r3 = r3.mo34983a()
            r5 = -9223372036854775808
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x022c
        L_0x022a:
            r3 = 1
            goto L_0x022d
        L_0x022c:
            r3 = 0
        L_0x022d:
            if (r3 == 0) goto L_0x0230
            goto L_0x023c
        L_0x0230:
            x6.h$a r3 = r0.f66118K
            if (r3 == 0) goto L_0x023f
            boolean r3 = r0.f66109B
            if (r3 != 0) goto L_0x023f
            r30.mo36291j()
            goto L_0x023f
        L_0x023c:
            r0.mo36305x(r8)
        L_0x023f:
            x6.h$a r3 = r0.f66120M
            if (r3 != 0) goto L_0x0245
            goto L_0x0345
        L_0x0245:
            x6.h$a r3 = r0.f66120M
            x6.h$a r4 = r0.f66119L
            if (r3 == r4) goto L_0x0281
            long r5 = r0.f66117J
            x6.h$a r7 = r3.f66151j
            long r10 = r7.f66147f
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x0281
            r3.mo36309b()
            x6.h$a r3 = r0.f66120M
            x6.h$a r3 = r3.f66151j
            r0.mo36277A(r3)
            x6.h$b r3 = new x6.h$b
            x6.h$a r4 = r0.f66120M
            x6.m$a r4 = r4.f66148g
            p7.o$b r11 = r4.f66178a
            long r12 = r4.f66179b
            long r14 = r4.f66181d
            r10 = r3
            r10.<init>(r11, r12, r14)
            r0.f66134s = r3
            r30.mo36283G()
            android.os.Handler r3 = r0.f66129n
            r4 = 5
            x6.h$b r5 = r0.f66134s
            android.os.Message r3 = r3.obtainMessage(r4, r5)
            r3.sendToTarget()
            goto L_0x0245
        L_0x0281:
            x6.m$a r3 = r4.f66148g
            boolean r3 = r3.f66184g
            if (r3 == 0) goto L_0x02a9
            r3 = 0
        L_0x0288:
            x6.q[] r4 = r0.f66122d
            int r5 = r4.length
            if (r3 >= r5) goto L_0x0345
            r4 = r4[r3]
            x6.h$a r5 = r0.f66119L
            p7.r[] r5 = r5.f66145d
            r5 = r5[r3]
            if (r5 == 0) goto L_0x02a6
            p7.r r6 = r4.mo36243o()
            if (r6 != r5) goto L_0x02a6
            boolean r5 = r4.mo36241m()
            if (r5 == 0) goto L_0x02a6
            r4.mo36237h()
        L_0x02a6:
            int r3 = r3 + 1
            goto L_0x0288
        L_0x02a9:
            r3 = 0
        L_0x02aa:
            x6.q[] r4 = r0.f66122d
            int r5 = r4.length
            if (r3 >= r5) goto L_0x02ca
            r4 = r4[r3]
            x6.h$a r5 = r0.f66119L
            p7.r[] r5 = r5.f66145d
            r5 = r5[r3]
            p7.r r6 = r4.mo36243o()
            if (r6 != r5) goto L_0x0345
            if (r5 == 0) goto L_0x02c7
            boolean r4 = r4.mo36241m()
            if (r4 != 0) goto L_0x02c7
            goto L_0x0345
        L_0x02c7:
            int r3 = r3 + 1
            goto L_0x02aa
        L_0x02ca:
            x6.h$a r3 = r0.f66119L
            x6.h$a r4 = r3.f66151j
            if (r4 == 0) goto L_0x0345
            boolean r5 = r4.f66149h
            if (r5 == 0) goto L_0x0345
            b8.i r3 = r3.f66152k
            r0.f66119L = r4
            b8.i r5 = r4.f66152k
            p7.n r4 = r4.f66142a
            long r6 = r4.mo34991m()
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x02eb
            r4 = 1
            goto L_0x02ec
        L_0x02eb:
            r4 = 0
        L_0x02ec:
            r6 = 0
        L_0x02ed:
            x6.q[] r7 = r0.f66122d
            int r10 = r7.length
            if (r6 >= r10) goto L_0x0345
            r7 = r7[r6]
            b8.g r10 = r3.f45338b
            b8.f[] r10 = r10.f45335b
            r10 = r10[r6]
            if (r10 != 0) goto L_0x02fd
            goto L_0x0342
        L_0x02fd:
            if (r4 == 0) goto L_0x0303
            r7.mo36237h()
            goto L_0x0342
        L_0x0303:
            boolean r10 = r7.mo36242n()
            if (r10 != 0) goto L_0x0342
            b8.g r10 = r5.f45338b
            b8.f[] r10 = r10.f45335b
            r10 = r10[r6]
            x6.s[] r11 = r3.f45340d
            r11 = r11[r6]
            x6.s[] r12 = r5.f45340d
            r12 = r12[r6]
            if (r10 == 0) goto L_0x033f
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x033f
            int r11 = r10.length()
            com.google.android.exoplayer2.Format[] r12 = new com.google.android.exoplayer2.Format[r11]
            r13 = 0
        L_0x0326:
            if (r13 >= r11) goto L_0x0331
            com.google.android.exoplayer2.Format r14 = r10.mo17791d(r13)
            r12[r13] = r14
            int r13 = r13 + 1
            goto L_0x0326
        L_0x0331:
            x6.h$a r10 = r0.f66119L
            p7.r[] r11 = r10.f66145d
            r11 = r11[r6]
            long r13 = r10.mo36308a()
            r7.mo36246s(r12, r11, r13)
            goto L_0x0342
        L_0x033f:
            r7.mo36237h()
        L_0x0342:
            int r6 = r6 + 1
            goto L_0x02ed
        L_0x0345:
            x6.h$a r3 = r0.f66120M
            r4 = 10
            if (r3 != 0) goto L_0x0352
            r30.mo36292k()
            r0.mo36301t(r1, r4)
            return
        L_0x0352:
            java.lang.String r3 = "doSomeWork"
            p333e8.C20550v.m22309a(r3)
            r30.mo36283G()
            x6.h$a r3 = r0.f66120M
            p7.n r3 = r3.f66142a
            x6.h$b r6 = r0.f66134s
            long r6 = r6.f66162d
            r3.mo34994r(r6)
            x6.q[] r3 = r0.f66139x
            int r6 = r3.length
            r7 = 1
            r10 = 1
            r11 = 0
        L_0x036b:
            if (r11 >= r6) goto L_0x03a2
            r12 = r3[r11]
            long r13 = r0.f66117J
            long r8 = r0.f66114G
            r12.mo33311g(r13, r8)
            if (r10 == 0) goto L_0x0380
            boolean r8 = r12.mo33310b()
            if (r8 == 0) goto L_0x0380
            r10 = 1
            goto L_0x0381
        L_0x0380:
            r10 = 0
        L_0x0381:
            boolean r8 = r12.isReady()
            if (r8 != 0) goto L_0x0390
            boolean r8 = r12.mo33310b()
            if (r8 == 0) goto L_0x038e
            goto L_0x0390
        L_0x038e:
            r9 = 0
            goto L_0x0391
        L_0x0390:
            r9 = 1
        L_0x0391:
            if (r9 != 0) goto L_0x0396
            r12.mo36238i()
        L_0x0396:
            if (r7 == 0) goto L_0x039c
            if (r9 == 0) goto L_0x039c
            r7 = 1
            goto L_0x039d
        L_0x039c:
            r7 = 0
        L_0x039d:
            int r11 = r11 + 1
            r8 = 0
            r9 = 1
            goto L_0x036b
        L_0x03a2:
            if (r7 != 0) goto L_0x03a7
            r30.mo36292k()
        L_0x03a7:
            e8.i r3 = r0.f66137v
            if (r3 == 0) goto L_0x03d7
            x6.o r3 = r3.mo32082d()
            x6.o r6 = r0.f66135t
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x03d7
            r0.f66135t = r3
            e8.s r6 = r0.f66126h
            e8.i r8 = r0.f66137v
            r6.getClass()
            long r11 = r8.mo32083r()
            r6.mo32129a(r11)
            x6.o r8 = r8.mo32082d()
            r6.f57831g = r8
            android.os.Handler r6 = r0.f66129n
            r8 = 7
            android.os.Message r3 = r6.obtainMessage(r8, r3)
            r3.sendToTarget()
        L_0x03d7:
            x6.h$a r3 = r0.f66120M
            x6.m$a r3 = r3.f66148g
            long r8 = r3.f66182e
            r3 = 4
            r6 = 3
            r11 = 2
            if (r10 == 0) goto L_0x0403
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x03f3
            x6.h$b r10 = r0.f66134s
            long r12 = r10.f66162d
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x0403
        L_0x03f3:
            x6.h$a r10 = r0.f66120M
            x6.m$a r10 = r10.f66148g
            boolean r10 = r10.f66184g
            if (r10 == 0) goto L_0x0403
            r0.mo36279C(r3)
            r30.mo36282F()
            goto L_0x046f
        L_0x0403:
            int r10 = r0.f66110C
            if (r10 != r11) goto L_0x0457
            x6.q[] r10 = r0.f66139x
            int r10 = r10.length
            if (r10 <= 0) goto L_0x0446
            if (r7 == 0) goto L_0x0444
            x6.h$a r7 = r0.f66118K
            boolean r8 = r0.f66108A
            long r9 = r0.f66117J
            boolean r12 = r7.f66149h
            if (r12 != 0) goto L_0x041d
            x6.m$a r12 = r7.f66148g
            long r12 = r12.f66179b
            goto L_0x0423
        L_0x041d:
            p7.n r12 = r7.f66142a
            long r12 = r12.mo34983a()
        L_0x0423:
            r16 = -9223372036854775808
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x0433
            x6.m$a r12 = r7.f66148g
            boolean r13 = r12.f66184g
            if (r13 == 0) goto L_0x0431
            r9 = 1
            goto L_0x0440
        L_0x0431:
            long r12 = r12.f66182e
        L_0x0433:
            x6.l r14 = r7.f66156o
            long r16 = r7.mo36308a()
            long r9 = r9 - r16
            long r12 = r12 - r9
            boolean r9 = r14.mo36252b(r12, r8)
        L_0x0440:
            if (r9 == 0) goto L_0x0444
            r9 = 1
            goto L_0x044a
        L_0x0444:
            r9 = 0
            goto L_0x044a
        L_0x0446:
            boolean r9 = r0.mo36290i(r8)
        L_0x044a:
            if (r9 == 0) goto L_0x046f
            r0.mo36279C(r6)
            boolean r7 = r0.f66141z
            if (r7 == 0) goto L_0x046f
            r30.mo36280D()
            goto L_0x046f
        L_0x0457:
            if (r10 != r6) goto L_0x046f
            x6.q[] r10 = r0.f66139x
            int r10 = r10.length
            if (r10 <= 0) goto L_0x045f
            goto L_0x0463
        L_0x045f:
            boolean r7 = r0.mo36290i(r8)
        L_0x0463:
            if (r7 != 0) goto L_0x046f
            boolean r7 = r0.f66141z
            r0.f66108A = r7
            r0.mo36279C(r11)
            r30.mo36282F()
        L_0x046f:
            int r7 = r0.f66110C
            if (r7 != r11) goto L_0x0481
            x6.q[] r7 = r0.f66139x
            int r8 = r7.length
            r15 = 0
        L_0x0477:
            if (r15 >= r8) goto L_0x0481
            r9 = r7[r15]
            r9.mo36238i()
            int r15 = r15 + 1
            goto L_0x0477
        L_0x0481:
            boolean r7 = r0.f66141z
            if (r7 == 0) goto L_0x0489
            int r7 = r0.f66110C
            if (r7 == r6) goto L_0x048d
        L_0x0489:
            int r6 = r0.f66110C
            if (r6 != r11) goto L_0x0491
        L_0x048d:
            r0.mo36301t(r1, r4)
            goto L_0x04a3
        L_0x0491:
            x6.q[] r4 = r0.f66139x
            int r4 = r4.length
            if (r4 == 0) goto L_0x049e
            if (r6 == r3) goto L_0x049e
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.mo36301t(r1, r3)
            goto L_0x04a3
        L_0x049e:
            android.os.Handler r1 = r0.f66127i
            r1.removeMessages(r11)
        L_0x04a3:
            p333e8.C20550v.m22310b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p396x6.C23004h.mo36284a():void");
    }

    /* renamed from: b */
    public final void mo36285b(boolean[] zArr, int i) {
        this.f66139x = new C23019q[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C23019q[] qVarArr = this.f66122d;
            if (i2 < qVarArr.length) {
                C23019q qVar = qVarArr[i2];
                C16772f fVar = this.f66120M.f66152k.f45338b.f45335b[i2];
                if (fVar != null) {
                    int i4 = i3 + 1;
                    this.f66139x[i3] = qVar;
                    if (qVar.getState() == 0) {
                        C23021s sVar = this.f66120M.f66152k.f45340d[i2];
                        boolean z = this.f66141z && this.f66110C == 3;
                        boolean z2 = !zArr[i2] && z;
                        int length = fVar.length();
                        Format[] formatArr = new Format[length];
                        for (int i5 = 0; i5 < length; i5++) {
                            formatArr[i5] = fVar.mo17791d(i5);
                        }
                        C23005a aVar = this.f66120M;
                        qVar.mo36235f(sVar, formatArr, aVar.f66145d[i2], this.f66117J, z2, aVar.mo36308a());
                        C20535i q = qVar.mo36245q();
                        if (q != null) {
                            if (this.f66137v == null) {
                                this.f66137v = q;
                                this.f66136u = qVar;
                                q.mo32081c(this.f66135t);
                            } else {
                                throw new C22997e(2, (String) null, new IllegalStateException("Multiple renderer media clocks enabled."), -1);
                            }
                        }
                        if (z) {
                            qVar.start();
                        }
                    }
                    i3 = i4;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo35001c(C23027v vVar, Object obj) {
        this.f66127i.obtainMessage(7, Pair.create(vVar, obj)).sendToTarget();
    }

    /* renamed from: d */
    public final void mo36286d(C21947n nVar) {
        C23005a aVar = this.f66118K;
        if (aVar != null && aVar.f66142a == nVar) {
            aVar.f66149h = true;
            aVar.mo36310c();
            long d = aVar.mo36311d(aVar.f66148g.f66179b, false, new boolean[aVar.f66153l.length]);
            C23013m.C23014a aVar2 = aVar.f66148g;
            aVar.f66148g = new C23013m.C23014a(aVar2.f66178a, d, aVar2.f66180c, aVar2.f66181d, aVar2.f66182e, aVar2.f66183f, aVar2.f66184g);
            if (this.f66120M == null) {
                C23005a aVar3 = this.f66118K;
                this.f66119L = aVar3;
                mo36298q(aVar3.f66148g.f66179b);
                mo36277A(this.f66119L);
            }
            mo36291j();
        }
    }

    /* renamed from: e */
    public final void mo36287e(Object obj, int i) {
        this.f66134s = new C23006b(0, 0);
        mo36293l(obj, i);
        this.f66134s = new C23006b(0, -9223372036854775807L);
        mo36279C(4);
        mo36297p(false);
    }

    /* renamed from: f */
    public void mo34987f(C21947n nVar) {
        this.f66127i.obtainMessage(8, nVar).sendToTarget();
    }

    /* renamed from: g */
    public void mo34988g(C21958s sVar) {
        this.f66127i.obtainMessage(9, (C21947n) sVar).sendToTarget();
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02be  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36288h(android.util.Pair<p396x6.C23027v, java.lang.Object> r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            x6.v r2 = r0.f66121N
            java.lang.Object r3 = r1.first
            x6.v r3 = (p396x6.C23027v) r3
            r0.f66121N = r3
            x6.m r4 = r0.f66133r
            r4.f66176c = r3
            java.lang.Object r1 = r1.second
            r4 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            if (r2 != 0) goto L_0x00b2
            int r2 = r0.f66115H
            r8 = 0
            if (r2 <= 0) goto L_0x005f
            x6.h$c r2 = r0.f66116I
            android.util.Pair r2 = r0.mo36299r(r2)
            int r3 = r0.f66115H
            r0.f66115H = r4
            r0.f66116I = r7
            if (r2 != 0) goto L_0x0034
            r0.mo36287e(r1, r3)
            goto L_0x00b1
        L_0x0034:
            java.lang.Object r4 = r2.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r14 = r2.longValue()
            x6.m r2 = r0.f66133r
            p7.o$b r11 = r2.mo36318g(r4, r14)
            x6.h$b r2 = new x6.h$b
            boolean r4 = r11.mo35017a()
            if (r4 == 0) goto L_0x0054
            r12 = r8
            goto L_0x0055
        L_0x0054:
            r12 = r14
        L_0x0055:
            r10 = r2
            r10.<init>(r11, r12, r14)
            r0.f66134s = r2
            r0.mo36293l(r1, r3)
            goto L_0x00b1
        L_0x005f:
            x6.h$b r2 = r0.f66134s
            long r10 = r2.f66160b
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00ae
            boolean r2 = r3.mo36345k()
            if (r2 == 0) goto L_0x0071
            r0.mo36287e(r1, r4)
            goto L_0x00b1
        L_0x0071:
            x6.v r10 = r0.f66121N
            x6.v$c r11 = r0.f66131p
            x6.v$b r12 = r0.f66132q
            r16 = 0
            r13 = 0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            android.util.Pair r2 = r10.mo36343g(r11, r12, r13, r14, r16)
            java.lang.Object r3 = r2.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r14 = r2.longValue()
            x6.m r2 = r0.f66133r
            p7.o$b r11 = r2.mo36318g(r3, r14)
            x6.h$b r2 = new x6.h$b
            boolean r3 = r11.mo35017a()
            if (r3 == 0) goto L_0x00a3
            r12 = r8
            goto L_0x00a4
        L_0x00a3:
            r12 = r14
        L_0x00a4:
            r10 = r2
            r10.<init>(r11, r12, r14)
            r0.f66134s = r2
            r0.mo36293l(r1, r4)
            goto L_0x00b1
        L_0x00ae:
            r0.mo36293l(r1, r4)
        L_0x00b1:
            return
        L_0x00b2:
            x6.h$b r3 = r0.f66134s
            p7.o$b r3 = r3.f66159a
            int r3 = r3.f62123a
            x6.h$a r8 = r0.f66120M
            if (r8 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            x6.h$a r8 = r0.f66118K
        L_0x00bf:
            if (r8 != 0) goto L_0x00cb
            int r9 = r2.mo35005f()
            if (r3 < r9) goto L_0x00cb
            r0.mo36293l(r1, r4)
            return
        L_0x00cb:
            r9 = 1
            if (r8 != 0) goto L_0x00d7
            x6.v$b r10 = r0.f66132q
            x6.v$b r10 = r2.mo34969e(r3, r10, r9)
            java.lang.Object r10 = r10.f66207b
            goto L_0x00d9
        L_0x00d7:
            java.lang.Object r10 = r8.f66143b
        L_0x00d9:
            x6.v r11 = r0.f66121N
            int r10 = r11.mo34967a(r10)
            r11 = -1
            if (r10 != r11) goto L_0x01e5
            x6.v r5 = r0.f66121N
            int r2 = r0.mo36300s(r3, r2, r5)
            if (r2 != r11) goto L_0x00ee
            r0.mo36287e(r1, r4)
            return
        L_0x00ee:
            x6.v r3 = r0.f66121N
            x6.v$b r5 = r0.f66132q
            x6.v$b r2 = r3.mo34969e(r2, r5, r4)
            int r15 = r2.f66208c
            x6.v r12 = r0.f66121N
            x6.v$c r13 = r0.f66131p
            x6.v$b r14 = r0.f66132q
            r18 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            android.util.Pair r2 = r12.mo36343g(r13, r14, r15, r16, r18)
            java.lang.Object r3 = r2.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            x6.v r2 = r0.f66121N
            x6.v$b r7 = r0.f66132q
            r2.mo34969e(r3, r7, r9)
            if (r8 == 0) goto L_0x01c7
            x6.v$b r2 = r0.f66132q
            java.lang.Object r2 = r2.f66207b
            x6.m$a r7 = r8.f66148g
            x6.m$a r9 = new x6.m$a
            p7.o$b r10 = r7.f66178a
            int r12 = r10.f62123a
            if (r12 != r11) goto L_0x0132
            r13 = r10
            goto L_0x013c
        L_0x0132:
            p7.o$b r12 = new p7.o$b
            int r13 = r10.f62124b
            int r10 = r10.f62125c
            r12.<init>(r11, r13, r10)
            r13 = r12
        L_0x013c:
            long r14 = r7.f66179b
            r24 = r5
            long r4 = r7.f66180c
            long r11 = r7.f66181d
            r16 = r11
            long r10 = r7.f66182e
            boolean r6 = r7.f66183f
            boolean r7 = r7.f66184g
            r18 = r16
            r12 = r9
            r16 = r4
            r20 = r10
            r22 = r6
            r23 = r7
            r12.<init>(r13, r14, r16, r18, r20, r22, r23)
            r8.f66148g = r9
        L_0x015c:
            x6.h$a r8 = r8.f66151j
            if (r8 == 0) goto L_0x01c4
            java.lang.Object r4 = r8.f66143b
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x018b
            x6.m r4 = r0.f66133r
            x6.m$a r5 = r8.f66148g
            r4.getClass()
            p7.o$b r6 = r5.f66178a
            int r7 = r6.f62123a
            if (r7 != r3) goto L_0x0176
            goto L_0x0180
        L_0x0176:
            p7.o$b r7 = new p7.o$b
            int r9 = r6.f62124b
            int r6 = r6.f62125c
            r7.<init>(r3, r9, r6)
            r6 = r7
        L_0x0180:
            x6.m$a r4 = r4.mo36315d(r5, r6)
            r8.f66148g = r4
            r21 = r1
            r22 = r2
            goto L_0x01bf
        L_0x018b:
            x6.m$a r4 = r8.f66148g
            x6.m$a r5 = new x6.m$a
            p7.o$b r6 = r4.f66178a
            int r7 = r6.f62123a
            r9 = -1
            if (r7 != r9) goto L_0x0198
            r10 = r6
            goto L_0x01a2
        L_0x0198:
            p7.o$b r7 = new p7.o$b
            int r10 = r6.f62124b
            int r6 = r6.f62125c
            r7.<init>(r9, r10, r6)
            r10 = r7
        L_0x01a2:
            long r11 = r4.f66179b
            long r13 = r4.f66180c
            long r6 = r4.f66181d
            r21 = r1
            r22 = r2
            long r1 = r4.f66182e
            boolean r15 = r4.f66183f
            boolean r4 = r4.f66184g
            r9 = r5
            r19 = r15
            r15 = r6
            r17 = r1
            r20 = r4
            r9.<init>(r10, r11, r13, r15, r17, r19, r20)
            r8.f66148g = r5
        L_0x01bf:
            r1 = r21
            r2 = r22
            goto L_0x015c
        L_0x01c4:
            r21 = r1
            goto L_0x01cb
        L_0x01c7:
            r21 = r1
            r24 = r5
        L_0x01cb:
            p7.o$b r1 = new p7.o$b
            r2 = -1
            r1.<init>(r3, r2, r2)
            r2 = r24
            long r2 = r0.mo36303v(r1, r2)
            x6.h$b r4 = new x6.h$b
            r4.<init>((p370p7.C21949o.C21951b) r1, (long) r2)
            r0.f66134s = r4
            r1 = r21
            r2 = 0
            r0.mo36293l(r1, r2)
            return
        L_0x01e5:
            if (r10 == r3) goto L_0x0210
            x6.h$b r2 = r0.f66134s
            x6.h$b r3 = new x6.h$b
            p7.o$b r4 = r2.f66159a
            int r11 = r4.f62123a
            if (r11 != r10) goto L_0x01f3
            r12 = r4
            goto L_0x01fd
        L_0x01f3:
            p7.o$b r11 = new p7.o$b
            int r12 = r4.f62124b
            int r4 = r4.f62125c
            r11.<init>(r10, r12, r4)
            r12 = r11
        L_0x01fd:
            long r13 = r2.f66160b
            long r5 = r2.f66161c
            r11 = r3
            r15 = r5
            r11.<init>(r12, r13, r15)
            long r4 = r2.f66162d
            r3.f66162d = r4
            long r4 = r2.f66163e
            r3.f66163e = r4
            r0.f66134s = r3
        L_0x0210:
            x6.h$b r2 = r0.f66134s
            p7.o$b r2 = r2.f66159a
            boolean r2 = r2.mo35017a()
            if (r2 == 0) goto L_0x025a
            x6.m r2 = r0.f66133r
            x6.h$b r3 = r0.f66134s
            long r3 = r3.f66161c
            p7.o$b r12 = r2.mo36318g(r10, r3)
            boolean r2 = r12.mo35017a()
            if (r2 == 0) goto L_0x0234
            int r2 = r12.f62125c
            x6.h$b r3 = r0.f66134s
            p7.o$b r3 = r3.f66159a
            int r3 = r3.f62125c
            if (r2 == r3) goto L_0x025a
        L_0x0234:
            x6.h$b r2 = r0.f66134s
            long r2 = r2.f66161c
            long r13 = r0.mo36303v(r12, r2)
            boolean r2 = r12.mo35017a()
            if (r2 == 0) goto L_0x0248
            x6.h$b r2 = r0.f66134s
            long r5 = r2.f66161c
            r15 = r5
            goto L_0x024d
        L_0x0248:
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x024d:
            x6.h$b r2 = new x6.h$b
            r11 = r2
            r11.<init>(r12, r13, r15)
            r0.f66134s = r2
            r2 = 0
            r0.mo36293l(r1, r2)
            return
        L_0x025a:
            r2 = 0
            if (r8 != 0) goto L_0x0261
            r0.mo36293l(r1, r2)
            return
        L_0x0261:
            x6.m r2 = r0.f66133r
            x6.m$a r3 = r8.f66148g
            r2.getClass()
            p7.o$b r4 = r3.f66178a
            int r5 = r4.f62123a
            if (r5 != r10) goto L_0x026f
            goto L_0x0279
        L_0x026f:
            p7.o$b r5 = new p7.o$b
            int r6 = r4.f62124b
            int r4 = r4.f62125c
            r5.<init>(r10, r6, r4)
            r4 = r5
        L_0x0279:
            x6.m$a r2 = r2.mo36315d(r3, r4)
            r8.f66148g = r2
            boolean r2 = r2.f66183f
            if (r2 != 0) goto L_0x028a
            x6.h$a r2 = r8.f66151j
            if (r2 != 0) goto L_0x0288
            goto L_0x028a
        L_0x0288:
            r8 = r2
            goto L_0x0261
        L_0x028a:
            x6.h$a r2 = r8.f66151j
            if (r2 == 0) goto L_0x0312
            x6.v r3 = r0.f66121N
            x6.v$b r4 = r0.f66132q
            x6.v$c r5 = r0.f66131p
            int r6 = r0.f66111D
            int r10 = r3.mo36341b(r10, r4, r5, r6)
            r3 = -1
            if (r10 == r3) goto L_0x02d7
            java.lang.Object r4 = r2.f66143b
            x6.v r5 = r0.f66121N
            x6.v$b r6 = r0.f66132q
            x6.v$b r5 = r5.mo34969e(r10, r6, r9)
            java.lang.Object r5 = r5.f66207b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x02d7
        L_0x02af:
            r8 = r2
            x6.m r2 = r0.f66133r
            x6.m$a r4 = r8.f66148g
            r2.getClass()
            p7.o$b r5 = r4.f66178a
            int r6 = r5.f62123a
            if (r6 != r10) goto L_0x02be
            goto L_0x02c8
        L_0x02be:
            p7.o$b r6 = new p7.o$b
            int r11 = r5.f62124b
            int r5 = r5.f62125c
            r6.<init>(r10, r11, r5)
            r5 = r6
        L_0x02c8:
            x6.m$a r2 = r2.mo36315d(r4, r5)
            r8.f66148g = r2
            boolean r2 = r2.f66183f
            if (r2 != 0) goto L_0x028a
            x6.h$a r2 = r8.f66151j
            if (r2 != 0) goto L_0x02af
            goto L_0x028a
        L_0x02d7:
            x6.h$a r3 = r0.f66119L
            if (r3 == 0) goto L_0x02e2
            int r3 = r3.f66144c
            int r4 = r2.f66144c
            if (r3 >= r4) goto L_0x02e2
            goto L_0x02e3
        L_0x02e2:
            r9 = 0
        L_0x02e3:
            if (r9 != 0) goto L_0x0306
            x6.h$a r2 = r0.f66120M
            x6.m$a r2 = r2.f66148g
            p7.o$b r2 = r2.f66178a
            x6.h$b r3 = r0.f66134s
            long r3 = r3.f66162d
            long r7 = r0.mo36303v(r2, r3)
            x6.h$b r2 = new x6.h$b
            x6.h$a r3 = r0.f66120M
            x6.m$a r3 = r3.f66148g
            p7.o$b r6 = r3.f66178a
            x6.h$b r3 = r0.f66134s
            long r9 = r3.f66161c
            r5 = r2
            r5.<init>(r6, r7, r9)
            r0.f66134s = r2
            goto L_0x0312
        L_0x0306:
            r0.f66118K = r8
            r8.f66151j = r7
        L_0x030a:
            if (r2 == 0) goto L_0x0312
            r2.mo36309b()
            x6.h$a r2 = r2.f66151j
            goto L_0x030a
        L_0x0312:
            r2 = 0
            r0.mo36293l(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p396x6.C23004h.mo36288h(android.util.Pair):void");
    }

    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    mo36294m((C21949o) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    mo36306y(message.arg1 != 0);
                    return true;
                case 2:
                    mo36284a();
                    return true;
                case 3:
                    mo36302u((C23007c) message.obj);
                    return true;
                case 4:
                    mo36307z((C23016o) message.obj);
                    return true;
                case 5:
                    mo36281E();
                    return true;
                case 6:
                    mo36295n();
                    return true;
                case 7:
                    mo36288h((Pair) message.obj);
                    return true;
                case 8:
                    mo36286d((C21947n) message.obj);
                    return true;
                case 9:
                    C21947n nVar = (C21947n) message.obj;
                    C23005a aVar = this.f66118K;
                    if (aVar != null) {
                        if (aVar.f66142a == nVar) {
                            mo36291j();
                        }
                    }
                    return true;
                case 10:
                    mo36296o();
                    return true;
                case 11:
                    mo36304w((C22998f.C23001c[]) message.obj);
                    return true;
                case 12:
                    mo36278B(message.arg1);
                    return true;
                default:
                    return false;
            }
        } catch (C22997e e) {
            this.f66129n.obtainMessage(8, e).sendToTarget();
            mo36281E();
            return true;
        } catch (IOException e2) {
            this.f66129n.obtainMessage(8, new C22997e(0, (String) null, e2, -1)).sendToTarget();
            mo36281E();
            return true;
        } catch (RuntimeException e3) {
            this.f66129n.obtainMessage(8, new C22997e(2, (String) null, e3, -1)).sendToTarget();
            mo36281E();
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r4 = r3.f66120M.f66151j;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36290i(long r4) {
        /*
            r3 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0028
            x6.h$b r0 = r3.f66134s
            long r0 = r0.f66162d
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0028
            x6.h$a r4 = r3.f66120M
            x6.h$a r4 = r4.f66151j
            if (r4 == 0) goto L_0x0026
            boolean r5 = r4.f66149h
            if (r5 != 0) goto L_0x0028
            x6.m$a r4 = r4.f66148g
            p7.o$b r4 = r4.f66178a
            boolean r4 = r4.mo35017a()
            if (r4 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r4 = 0
            goto L_0x0029
        L_0x0028:
            r4 = 1
        L_0x0029:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p396x6.C23004h.mo36290i(long):boolean");
    }

    /* renamed from: j */
    public final void mo36291j() {
        C23005a aVar = this.f66118K;
        long j = this.f66117J;
        long c = !aVar.f66149h ? 0 : aVar.f66142a.mo34985c();
        boolean a = c == Long.MIN_VALUE ? false : aVar.f66156o.mo36251a(c - (j - aVar.mo36308a()));
        mo36305x(a);
        if (a) {
            C23005a aVar2 = this.f66118K;
            aVar2.f66142a.mo34984b(this.f66117J - aVar2.mo36308a());
        }
    }

    /* renamed from: k */
    public final void mo36292k() {
        C23005a aVar = this.f66118K;
        if (aVar != null && !aVar.f66149h) {
            C23005a aVar2 = this.f66119L;
            if (aVar2 == null || aVar2.f66151j == aVar) {
                C23019q[] qVarArr = this.f66139x;
                int length = qVarArr.length;
                int i = 0;
                while (i < length) {
                    if (qVarArr[i].mo36241m()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f66118K.f66142a.mo34993q();
            }
        }
    }

    /* renamed from: l */
    public final void mo36293l(Object obj, int i) {
        this.f66129n.obtainMessage(6, new C23008d(this.f66121N, obj, this.f66134s, i)).sendToTarget();
    }

    /* renamed from: m */
    public final void mo36294m(C21949o oVar, boolean z) {
        this.f66129n.sendEmptyMessage(0);
        mo36297p(true);
        this.f66125g.onPrepared();
        if (z) {
            this.f66134s = new C23006b(0, -9223372036854775807L);
        } else {
            C23006b bVar = this.f66134s;
            this.f66134s = new C23006b(bVar.f66159a, bVar.f66162d, this.f66134s.f66161c);
        }
        this.f66138w = oVar;
        if (oVar != null) {
            oVar.mo35003e(this.f66130o, true, this);
        }
        mo36279C(2);
        this.f66127i.sendEmptyMessage(2);
    }

    /* renamed from: n */
    public final void mo36295n() {
        mo36297p(true);
        this.f66125g.onReleased();
        mo36279C(1);
        synchronized (this) {
            this.f66140y = true;
            notifyAll();
        }
    }

    /* renamed from: o */
    public final void mo36296o() {
        C23005a aVar = this.f66120M;
        if (aVar != null) {
            boolean z = true;
            while (aVar != null && aVar.f66149h) {
                if (aVar.mo36310c()) {
                    if (z) {
                        C23005a aVar2 = this.f66119L;
                        C23005a aVar3 = this.f66120M;
                        boolean z2 = aVar2 != aVar3;
                        for (C23005a aVar4 = aVar3.f66151j; aVar4 != null; aVar4 = aVar4.f66151j) {
                            aVar4.mo36309b();
                        }
                        C23005a aVar5 = this.f66120M;
                        aVar5.f66151j = null;
                        this.f66118K = aVar5;
                        this.f66119L = aVar5;
                        boolean[] zArr = new boolean[this.f66122d.length];
                        long d = aVar5.mo36311d(this.f66134s.f66162d, z2, zArr);
                        if (d != this.f66134s.f66162d) {
                            this.f66134s.f66162d = d;
                            mo36298q(d);
                        }
                        boolean[] zArr2 = new boolean[this.f66122d.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            C23019q[] qVarArr = this.f66122d;
                            if (i >= qVarArr.length) {
                                break;
                            }
                            C23019q qVar = qVarArr[i];
                            boolean z3 = qVar.getState() != 0;
                            zArr2[i] = z3;
                            C21957r rVar = this.f66120M.f66145d[i];
                            if (rVar != null) {
                                i2++;
                            }
                            if (z3) {
                                if (rVar != qVar.mo36243o()) {
                                    if (qVar == this.f66136u) {
                                        if (rVar == null) {
                                            C20547s sVar = this.f66126h;
                                            C20535i iVar = this.f66137v;
                                            sVar.getClass();
                                            sVar.mo32129a(iVar.mo32083r());
                                            sVar.f57831g = iVar.mo32082d();
                                        }
                                        this.f66137v = null;
                                        this.f66136u = null;
                                    }
                                    if (qVar.getState() == 2) {
                                        qVar.stop();
                                    }
                                    qVar.disable();
                                } else if (zArr[i]) {
                                    qVar.mo36244p(this.f66117J);
                                }
                            }
                            i++;
                        }
                        this.f66129n.obtainMessage(3, aVar.f66152k).sendToTarget();
                        mo36285b(zArr2, i2);
                    } else {
                        this.f66118K = aVar;
                        for (C23005a aVar6 = aVar.f66151j; aVar6 != null; aVar6 = aVar6.f66151j) {
                            aVar6.mo36309b();
                        }
                        C23005a aVar7 = this.f66118K;
                        aVar7.f66151j = null;
                        if (aVar7.f66149h) {
                            long max = Math.max(aVar7.f66148g.f66179b, this.f66117J - aVar7.mo36308a());
                            C23005a aVar8 = this.f66118K;
                            aVar8.mo36311d(max, false, new boolean[aVar8.f66153l.length]);
                        }
                    }
                    mo36291j();
                    mo36283G();
                    this.f66127i.sendEmptyMessage(2);
                    return;
                }
                if (aVar == this.f66119L) {
                    z = false;
                }
                aVar = aVar.f66151j;
            }
        }
    }

    /* renamed from: p */
    public final void mo36297p(boolean z) {
        this.f66127i.removeMessages(2);
        this.f66108A = false;
        C20547s sVar = this.f66126h;
        if (sVar.f57828d) {
            sVar.mo32129a(sVar.mo32083r());
            sVar.f57828d = false;
        }
        this.f66137v = null;
        this.f66136u = null;
        this.f66117J = 60000000;
        for (C23019q qVar : this.f66139x) {
            try {
                if (qVar.getState() == 2) {
                    qVar.stop();
                }
                qVar.disable();
            } catch (RuntimeException | C22997e unused) {
            }
        }
        this.f66139x = new C23019q[0];
        C23005a aVar = this.f66120M;
        if (aVar == null) {
            aVar = this.f66118K;
        }
        while (aVar != null) {
            aVar.mo36309b();
            aVar = aVar.f66151j;
        }
        this.f66118K = null;
        this.f66119L = null;
        this.f66120M = null;
        mo36305x(false);
        if (z) {
            C21949o oVar = this.f66138w;
            if (oVar != null) {
                oVar.mo35004f();
                this.f66138w = null;
            }
            this.f66133r.f66176c = null;
            this.f66121N = null;
        }
    }

    /* renamed from: q */
    public final void mo36298q(long j) {
        C23005a aVar = this.f66120M;
        long a = j + (aVar == null ? 60000000 : aVar.mo36308a());
        this.f66117J = a;
        this.f66126h.mo32129a(a);
        for (C23019q p : this.f66139x) {
            p.mo36244p(this.f66117J);
        }
    }

    /* renamed from: r */
    public final Pair<Integer, Long> mo36299r(C23007c cVar) {
        C23027v vVar = cVar.f66164a;
        if (vVar.mo36345k()) {
            vVar = this.f66121N;
        }
        try {
            Pair<Integer, Long> g = vVar.mo36343g(this.f66131p, this.f66132q, cVar.f66165b, cVar.f66166c, 0);
            C23027v vVar2 = this.f66121N;
            if (vVar2 == vVar) {
                return g;
            }
            int a = vVar2.mo34967a(vVar.mo34969e(((Integer) g.first).intValue(), this.f66132q, true).f66207b);
            if (a != -1) {
                return Pair.create(Integer.valueOf(a), g.second);
            }
            int s = mo36300s(((Integer) g.first).intValue(), vVar, this.f66121N);
            if (s == -1) {
                return null;
            }
            return this.f66121N.mo36343g(this.f66131p, this.f66132q, this.f66121N.mo34969e(s, this.f66132q, false).f66208c, -9223372036854775807L, 0);
        } catch (IndexOutOfBoundsException unused) {
            throw new C23011k(this.f66121N, cVar.f66165b, cVar.f66166c);
        }
    }

    /* renamed from: s */
    public final int mo36300s(int i, C23027v vVar, C23027v vVar2) {
        int f = vVar.mo35005f();
        int i2 = -1;
        for (int i3 = 0; i3 < f && i2 == -1; i3++) {
            i = vVar.mo36341b(i, this.f66132q, this.f66131p, this.f66111D);
            if (i == -1) {
                break;
            }
            i2 = vVar2.mo34967a(vVar.mo34969e(i, this.f66132q, true).f66207b);
        }
        return i2;
    }

    /* renamed from: t */
    public final void mo36301t(long j, long j2) {
        this.f66127i.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f66127i.sendEmptyMessage(2);
        } else {
            this.f66127i.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: u */
    public final void mo36302u(C23007c cVar) {
        long j;
        int i;
        C23007c cVar2 = cVar;
        int i2 = 1;
        if (this.f66121N == null) {
            this.f66115H++;
            this.f66116I = cVar2;
            return;
        }
        Pair<Integer, Long> r = mo36299r(cVar);
        if (r == null) {
            C23006b bVar = new C23006b(0, 0);
            this.f66134s = bVar;
            this.f66129n.obtainMessage(4, 1, 0, bVar).sendToTarget();
            this.f66134s = new C23006b(0, -9223372036854775807L);
            mo36279C(4);
            mo36297p(false);
            return;
        }
        int i3 = cVar2.f66166c == -9223372036854775807L ? 1 : 0;
        int intValue = ((Integer) r.first).intValue();
        long longValue = ((Long) r.second).longValue();
        C21949o.C21951b g = this.f66133r.mo36318g(intValue, longValue);
        if (g.mo35017a()) {
            j = 0;
            i = 1;
        } else {
            i = i3;
            j = longValue;
        }
        try {
            if (!g.equals(this.f66134s.f66159a) || j / 1000 != this.f66134s.f66162d / 1000) {
                long v = mo36303v(g, j);
                if (j == v) {
                    i2 = 0;
                }
                C23006b bVar2 = new C23006b(g, v, longValue);
                this.f66134s = bVar2;
                this.f66129n.obtainMessage(4, i | i2, 0, bVar2).sendToTarget();
            }
        } finally {
            C23006b bVar3 = new C23006b(g, j, longValue);
            this.f66134s = bVar3;
            this.f66129n.obtainMessage(4, i, 0, bVar3).sendToTarget();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo36303v(p370p7.C21949o.C21951b r11, long r12) {
        /*
            r10 = this;
            r10.mo36282F()
            r0 = 0
            r10.f66108A = r0
            r1 = 2
            r10.mo36279C(r1)
            x6.h$a r2 = r10.f66120M
            r3 = 0
            if (r2 != 0) goto L_0x0018
            x6.h$a r11 = r10.f66118K
            if (r11 == 0) goto L_0x0016
            r11.mo36309b()
        L_0x0016:
            r4 = r3
            goto L_0x005c
        L_0x0018:
            r4 = r3
        L_0x0019:
            if (r2 == 0) goto L_0x005c
            if (r4 != 0) goto L_0x0056
            x6.m$a r5 = r2.f66148g
            p7.o$b r5 = r5.f66178a
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0051
            boolean r5 = r2.f66149h
            if (r5 == 0) goto L_0x0051
            x6.v r5 = r10.f66121N
            x6.m$a r6 = r2.f66148g
            p7.o$b r6 = r6.f66178a
            int r6 = r6.f62123a
            x6.v$b r7 = r10.f66132q
            r5.mo36342d(r6, r7)
            x6.v$b r5 = r10.f66132q
            int r5 = r5.mo36346a(r12)
            r6 = -1
            if (r5 == r6) goto L_0x004f
            x6.v$b r6 = r10.f66132q
            long[] r6 = r6.f66211f
            r5 = r6[r5]
            x6.m$a r7 = r2.f66148g
            long r7 = r7.f66180c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0051
        L_0x004f:
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            if (r5 == 0) goto L_0x0056
            r4 = r2
            goto L_0x0059
        L_0x0056:
            r2.mo36309b()
        L_0x0059:
            x6.h$a r2 = r2.f66151j
            goto L_0x0019
        L_0x005c:
            x6.h$a r11 = r10.f66120M
            if (r11 != r4) goto L_0x0064
            x6.h$a r2 = r10.f66119L
            if (r11 == r2) goto L_0x007c
        L_0x0064:
            x6.q[] r11 = r10.f66139x
            int r2 = r11.length
            r5 = 0
        L_0x0068:
            if (r5 >= r2) goto L_0x0072
            r6 = r11[r5]
            r6.disable()
            int r5 = r5 + 1
            goto L_0x0068
        L_0x0072:
            x6.q[] r11 = new p396x6.C23019q[r0]
            r10.f66139x = r11
            r10.f66137v = r3
            r10.f66136u = r3
            r10.f66120M = r3
        L_0x007c:
            if (r4 == 0) goto L_0x009b
            r4.f66151j = r3
            r10.f66118K = r4
            r10.f66119L = r4
            r10.mo36277A(r4)
            x6.h$a r11 = r10.f66120M
            boolean r0 = r11.f66150i
            if (r0 == 0) goto L_0x0094
            p7.n r11 = r11.f66142a
            long r11 = r11.mo34986e(r12)
            r12 = r11
        L_0x0094:
            r10.mo36298q(r12)
            r10.mo36291j()
            goto L_0x00a4
        L_0x009b:
            r10.f66118K = r3
            r10.f66119L = r3
            r10.f66120M = r3
            r10.mo36298q(r12)
        L_0x00a4:
            android.os.Handler r11 = r10.f66127i
            r11.sendEmptyMessage(r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p396x6.C23004h.mo36303v(p7.o$b, long):long");
    }

    /* renamed from: w */
    public final void mo36304w(C22998f.C23001c[] cVarArr) {
        try {
            for (C22998f.C23001c cVar : cVarArr) {
                cVar.f66081a.mo32384e(cVar.f66082b, cVar.f66083c);
            }
            int i = this.f66110C;
            if (i == 3 || i == 2) {
                this.f66127i.sendEmptyMessage(2);
            }
            synchronized (this) {
                this.f66113F++;
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f66113F++;
                notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: x */
    public final void mo36305x(boolean z) {
        if (this.f66109B != z) {
            this.f66109B = z;
            this.f66129n.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: y */
    public final void mo36306y(boolean z) {
        this.f66108A = false;
        this.f66141z = z;
        if (!z) {
            mo36282F();
            mo36283G();
            return;
        }
        int i = this.f66110C;
        if (i == 3) {
            mo36280D();
            this.f66127i.sendEmptyMessage(2);
        } else if (i == 2) {
            this.f66127i.sendEmptyMessage(2);
        }
    }

    /* renamed from: z */
    public final void mo36307z(C23016o oVar) {
        C20535i iVar = this.f66137v;
        if (iVar != null) {
            oVar = iVar.mo32081c(oVar);
        } else {
            this.f66126h.mo32081c(oVar);
        }
        this.f66135t = oVar;
        this.f66129n.obtainMessage(7, oVar).sendToTarget();
    }

    /* renamed from: x6.h$b */
    public static final class C23006b {

        /* renamed from: a */
        public final C21949o.C21951b f66159a;

        /* renamed from: b */
        public final long f66160b;

        /* renamed from: c */
        public final long f66161c;

        /* renamed from: d */
        public volatile long f66162d;

        /* renamed from: e */
        public volatile long f66163e;

        public C23006b(int i, long j) {
            this(new C21949o.C21951b(i, -1, -1), j);
        }

        public C23006b(C21949o.C21951b bVar, long j) {
            this(bVar, j, -9223372036854775807L);
        }

        public C23006b(C21949o.C21951b bVar, long j, long j2) {
            this.f66159a = bVar;
            this.f66160b = j;
            this.f66161c = j2;
            this.f66162d = j;
            this.f66163e = j;
        }
    }
}
