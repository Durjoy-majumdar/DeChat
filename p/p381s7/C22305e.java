package p381s7;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import p300c8.C16876u;
import p300c8.C79964v;
import p333e8.C86466w;
import p370p7.C21920c;
import p370p7.C21926e;
import p380r7.C22201b;
import p380r7.C22206d;
import p381s7.C22300a;
import p396x6.C23015n;

/* renamed from: s7.e */
public final class C22305e implements C16876u.C16877a<C79964v<C22304c>> {

    /* renamed from: d */
    public final C22206d f63242d;

    /* renamed from: e */
    public final C79964v.C79965a<C22304c> f63243e;

    /* renamed from: f */
    public final int f63244f;

    /* renamed from: g */
    public final IdentityHashMap<C22300a.C22301a, C22307b> f63245g = new IdentityHashMap<>();

    /* renamed from: h */
    public final Handler f63246h = new Handler();

    /* renamed from: i */
    public final C22311f f63247i;

    /* renamed from: j */
    public final List<C22308c> f63248j = new ArrayList();

    /* renamed from: n */
    public final C16876u f63249n = new C16876u("HlsPlaylistTracker:MasterPlaylist");

    /* renamed from: o */
    public final C21920c.C21921a f63250o;

    /* renamed from: p */
    public C22300a f63251p;

    /* renamed from: q */
    public C22300a.C22301a f63252q;

    /* renamed from: r */
    public C22302b f63253r;

    /* renamed from: s */
    public boolean f63254s;

    /* renamed from: s7.e$b */
    public final class C22307b implements C16876u.C16877a<C79964v<C22304c>>, Runnable {

        /* renamed from: d */
        public final C22300a.C22301a f63255d;

        /* renamed from: e */
        public final C16876u f63256e = new C16876u("HlsPlaylistTracker:MediaPlaylist");

        /* renamed from: f */
        public final C79964v<C22304c> f63257f;

        /* renamed from: g */
        public C22302b f63258g;

        /* renamed from: h */
        public long f63259h;

        /* renamed from: i */
        public long f63260i;

        /* renamed from: j */
        public long f63261j;

        /* renamed from: n */
        public long f63262n;

        /* renamed from: o */
        public boolean f63263o;

        /* renamed from: p */
        public IOException f63264p;

        public C22307b(C22300a.C22301a aVar) {
            this.f63255d = aVar;
            this.f63257f = new C79964v<>(((C22201b) C22305e.this.f63242d).f62844a.createDataSource(), C86466w.m107141c(C22305e.this.f63251p.f63240a, aVar.f63215a), 4, C22305e.this.f63243e);
        }

        /* renamed from: a */
        public final boolean mo35461a() {
            boolean z;
            this.f63262n = SystemClock.elapsedRealtime() + 60000;
            C22305e eVar = C22305e.this;
            C22300a.C22301a aVar = this.f63255d;
            int size = ((ArrayList) eVar.f63248j).size();
            for (int i = 0; i < size; i++) {
                ((C22308c) ((ArrayList) eVar.f63248j).get(i)).mo35339d(aVar, 60000);
            }
            C22305e eVar2 = C22305e.this;
            if (eVar2.f63252q != this.f63255d) {
                return false;
            }
            List<C22300a.C22301a> list = eVar2.f63251p.f63210c;
            int size2 = list.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                }
                C22307b bVar = eVar2.f63245g.get(list.get(i2));
                if (elapsedRealtime > bVar.f63262n) {
                    eVar2.f63252q = bVar.f63255d;
                    bVar.mo35462b();
                    z = true;
                    break;
                }
                i2++;
            }
            return !z;
        }

        /* renamed from: b */
        public void mo35462b() {
            this.f63262n = 0;
            if (!this.f63263o && !this.f63256e.mo17934a()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.f63261j;
                if (elapsedRealtime < j) {
                    this.f63263o = true;
                    C22305e.this.f63246h.postDelayed(this, j - elapsedRealtime);
                    return;
                }
                this.f63256e.mo17937d(this.f63257f, this, C22305e.this.f63244f);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:107:0x028b  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x02a4  */
        /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x023d  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo35463c(p381s7.C22302b r34) {
            /*
                r33 = this;
                r0 = r33
                r1 = r34
                s7.b r2 = r0.f63258g
                long r3 = android.os.SystemClock.elapsedRealtime()
                r0.f63259h = r3
                s7.e r5 = p381s7.C22305e.this
                r5.getClass()
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L_0x003a
                int r8 = r1.f63222h
                int r9 = r2.f63222h
                if (r8 <= r9) goto L_0x001c
                goto L_0x003d
            L_0x001c:
                if (r8 >= r9) goto L_0x001f
                goto L_0x0038
            L_0x001f:
                java.util.List<s7.b$a> r8 = r1.f63229o
                int r8 = r8.size()
                java.util.List<s7.b$a> r9 = r2.f63229o
                int r9 = r9.size()
                if (r8 > r9) goto L_0x003d
                if (r8 != r9) goto L_0x0038
                boolean r8 = r1.f63226l
                if (r8 == 0) goto L_0x0038
                boolean r8 = r2.f63226l
                if (r8 != 0) goto L_0x0038
                goto L_0x003d
            L_0x0038:
                r8 = 0
                goto L_0x003e
            L_0x003a:
                r34.getClass()
            L_0x003d:
                r8 = 1
            L_0x003e:
                r9 = 0
                if (r8 != 0) goto L_0x0089
                boolean r5 = r1.f63226l
                if (r5 == 0) goto L_0x0086
                boolean r5 = r2.f63226l
                if (r5 == 0) goto L_0x004a
                goto L_0x0086
            L_0x004a:
                s7.b r5 = new s7.b
                r12 = r5
                int r13 = r2.f63217c
                java.lang.String r14 = r2.f63240a
                java.util.List<java.lang.String> r15 = r2.f63241b
                long r10 = r2.f63218d
                r16 = r10
                long r10 = r2.f63219e
                r18 = r10
                boolean r8 = r2.f63220f
                r20 = r8
                int r8 = r2.f63221g
                r21 = r8
                int r8 = r2.f63222h
                r22 = r8
                int r8 = r2.f63223i
                r23 = r8
                long r10 = r2.f63224j
                r24 = r10
                boolean r8 = r2.f63225k
                r26 = r8
                r27 = 1
                boolean r8 = r2.f63227m
                r28 = r8
                s7.b$a r8 = r2.f63228n
                r29 = r8
                java.util.List<s7.b$a> r8 = r2.f63229o
                r30 = r8
                r12.<init>(r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30)
                goto L_0x013b
            L_0x0086:
                r5 = r2
                goto L_0x013b
            L_0x0089:
                boolean r8 = r1.f63227m
                if (r8 == 0) goto L_0x0092
                long r10 = r1.f63219e
            L_0x008f:
                r18 = r10
                goto L_0x00cd
            L_0x0092:
                s7.b r8 = r5.f63253r
                if (r8 == 0) goto L_0x0099
                long r10 = r8.f63219e
                goto L_0x009b
            L_0x0099:
                r10 = 0
            L_0x009b:
                if (r2 != 0) goto L_0x009e
                goto L_0x008f
            L_0x009e:
                java.util.List<s7.b$a> r8 = r2.f63229o
                int r8 = r8.size()
                int r12 = r1.f63222h
                int r13 = r2.f63222h
                int r12 = r12 - r13
                java.util.List<s7.b$a> r13 = r2.f63229o
                int r14 = r13.size()
                if (r12 >= r14) goto L_0x00b8
                java.lang.Object r12 = r13.get(r12)
                s7.b$a r12 = (p381s7.C22302b.C22303a) r12
                goto L_0x00b9
            L_0x00b8:
                r12 = r9
            L_0x00b9:
                if (r12 == 0) goto L_0x00c0
                long r10 = r2.f63219e
                long r12 = r12.f63234g
                goto L_0x00cb
            L_0x00c0:
                int r12 = r1.f63222h
                int r13 = r2.f63222h
                int r12 = r12 - r13
                if (r8 != r12) goto L_0x008f
                long r10 = r2.f63219e
                long r12 = r2.f63230p
            L_0x00cb:
                long r10 = r10 + r12
                goto L_0x008f
            L_0x00cd:
                boolean r8 = r1.f63220f
                if (r8 == 0) goto L_0x00d6
                int r5 = r1.f63221g
            L_0x00d3:
                r21 = r5
                goto L_0x0109
            L_0x00d6:
                s7.b r5 = r5.f63253r
                if (r5 == 0) goto L_0x00dd
                int r5 = r5.f63221g
                goto L_0x00de
            L_0x00dd:
                r5 = 0
            L_0x00de:
                if (r2 != 0) goto L_0x00e1
                goto L_0x00d3
            L_0x00e1:
                int r8 = r1.f63222h
                int r10 = r2.f63222h
                int r8 = r8 - r10
                java.util.List<s7.b$a> r10 = r2.f63229o
                int r11 = r10.size()
                if (r8 >= r11) goto L_0x00f5
                java.lang.Object r8 = r10.get(r8)
                s7.b$a r8 = (p381s7.C22302b.C22303a) r8
                goto L_0x00f6
            L_0x00f5:
                r8 = r9
            L_0x00f6:
                if (r8 == 0) goto L_0x00d3
                int r5 = r2.f63221g
                int r8 = r8.f63233f
                int r5 = r5 + r8
                java.util.List<s7.b$a> r8 = r1.f63229o
                java.lang.Object r8 = r8.get(r7)
                s7.b$a r8 = (p381s7.C22302b.C22303a) r8
                int r8 = r8.f63233f
                int r5 = r5 - r8
                goto L_0x00d3
            L_0x0109:
                s7.b r5 = new s7.b
                r12 = r5
                int r13 = r1.f63217c
                java.lang.String r14 = r1.f63240a
                java.util.List<java.lang.String> r15 = r1.f63241b
                long r10 = r1.f63218d
                r16 = r10
                int r8 = r1.f63222h
                r22 = r8
                int r8 = r1.f63223i
                r23 = r8
                long r10 = r1.f63224j
                r24 = r10
                boolean r8 = r1.f63225k
                r26 = r8
                boolean r8 = r1.f63226l
                r27 = r8
                boolean r8 = r1.f63227m
                r28 = r8
                s7.b$a r8 = r1.f63228n
                r29 = r8
                java.util.List<s7.b$a> r8 = r1.f63229o
                r30 = r8
                r20 = 1
                r12.<init>(r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30)
            L_0x013b:
                r0.f63258g = r5
                if (r5 == r2) goto L_0x023d
                r0.f63264p = r9
                r0.f63260i = r3
                s7.e r1 = p381s7.C22305e.this
                s7.a$a r8 = r0.f63255d
                s7.a$a r9 = r1.f63252q
                if (r8 != r9) goto L_0x021d
                s7.b r8 = r1.f63253r
                if (r8 != 0) goto L_0x0154
                boolean r8 = r5.f63226l
                r8 = r8 ^ r6
                r1.f63254s = r8
            L_0x0154:
                r1.f63253r = r5
                s7.e$f r8 = r1.f63247i
                r7.h r8 = (p380r7.C22210h) r8
                r8.getClass()
                boolean r9 = r5.f63227m
                if (r9 == 0) goto L_0x0164
                r13 = 0
                goto L_0x0169
            L_0x0164:
                r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L_0x0169:
                if (r9 == 0) goto L_0x0173
                long r6 = r5.f63219e
                long r6 = p396x6.C22994b.m27204b(r6)
                r15 = r6
                goto L_0x0178
            L_0x0173:
                r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L_0x0178:
                long r6 = r5.f63218d
                s7.e r9 = r8.f62911i
                boolean r9 = r9.f63254s
                if (r9 == 0) goto L_0x01e1
                boolean r9 = r5.f63226l
                r17 = r13
                if (r9 == 0) goto L_0x018d
                long r12 = r5.f63219e
                long r10 = r5.f63230p
                long r12 = r12 + r10
                r9 = r12
                goto L_0x0192
            L_0x018d:
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L_0x0192:
                java.util.List<s7.b$a> r11 = r5.f63229o
                r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
                if (r14 != 0) goto L_0x01bf
                boolean r6 = r11.isEmpty()
                if (r6 == 0) goto L_0x01a7
                r13 = 0
                r31 = 0
                goto L_0x01bc
            L_0x01a7:
                int r6 = r11.size()
                int r6 = r6 + -3
                r13 = 0
                int r6 = java.lang.Math.max(r13, r6)
                java.lang.Object r6 = r11.get(r6)
                s7.b$a r6 = (p381s7.C22302b.C22303a) r6
                long r6 = r6.f63234g
                r31 = r6
            L_0x01bc:
                r23 = r31
                goto L_0x01c2
            L_0x01bf:
                r13 = 0
                r23 = r6
            L_0x01c2:
                p7.t r6 = new p7.t
                long r11 = r5.f63230p
                r27 = r2
                r28 = r3
                long r2 = r5.f63219e
                r25 = 1
                boolean r4 = r5.f63226l
                r7 = 1
                r26 = r4 ^ 1
                r19 = r11
                r12 = r6
                r4 = 0
                r13 = r17
                r17 = r9
                r21 = r2
                r12.<init>(r13, r15, r17, r19, r21, r23, r25, r26)
                goto L_0x020e
            L_0x01e1:
                r27 = r2
                r28 = r3
                r17 = r13
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r4 = 0
                int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r9 != 0) goto L_0x01f4
                r23 = 0
                goto L_0x01f6
            L_0x01f4:
                r23 = r6
            L_0x01f6:
                p7.t r6 = new p7.t
                long r2 = r5.f63219e
                long r9 = r5.f63230p
                long r19 = r2 + r9
                r25 = 1
                r26 = 0
                r12 = r6
                r13 = r17
                r17 = r19
                r19 = r9
                r21 = r2
                r12.<init>(r13, r15, r17, r19, r21, r23, r25, r26)
            L_0x020e:
                p7.o$a r2 = r8.f62912j
                r7.e r3 = new r7.e
                s7.e r7 = r8.f62911i
                s7.a r7 = r7.f63251p
                r3.<init>(r7, r5)
                r2.mo35001c(r6, r3)
                goto L_0x0222
            L_0x021d:
                r27 = r2
                r28 = r3
                r4 = 0
            L_0x0222:
                java.util.List<s7.e$c> r2 = r1.f63248j
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                int r2 = r2.size()
                r7 = 0
            L_0x022b:
                if (r7 >= r2) goto L_0x0282
                java.util.List<s7.e$c> r3 = r1.f63248j
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r3 = r3.get(r7)
                s7.e$c r3 = (p381s7.C22305e.C22308c) r3
                r3.onPlaylistChanged()
                int r7 = r7 + 1
                goto L_0x022b
            L_0x023d:
                r27 = r2
                r28 = r3
                boolean r2 = r5.f63226l
                if (r2 != 0) goto L_0x0282
                int r2 = r1.f63222h
                java.util.List<s7.b$a> r1 = r1.f63229o
                int r1 = r1.size()
                int r2 = r2 + r1
                s7.b r1 = r0.f63258g
                int r3 = r1.f63222h
                if (r2 >= r3) goto L_0x0260
                s7.e$d r1 = new s7.e$d
                s7.a$a r2 = r0.f63255d
                java.lang.String r2 = r2.f63215a
                r1.<init>(r2, r9)
                r0.f63264p = r1
                goto L_0x0282
            L_0x0260:
                long r2 = r0.f63260i
                long r3 = r28 - r2
                double r2 = (double) r3
                long r4 = r1.f63224j
                long r4 = p396x6.C22994b.m27204b(r4)
                double r4 = (double) r4
                r6 = 4615063718147915776(0x400c000000000000, double:3.5)
                double r4 = r4 * r6
                int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r1 <= 0) goto L_0x0282
                s7.e$e r1 = new s7.e$e
                s7.a$a r2 = r0.f63255d
                java.lang.String r2 = r2.f63215a
                r1.<init>(r2, r9)
                r0.f63264p = r1
                r33.mo35461a()
            L_0x0282:
                s7.b r1 = r0.f63258g
                long r2 = r1.f63224j
                r4 = r27
                if (r1 == r4) goto L_0x028b
                goto L_0x028e
            L_0x028b:
                r4 = 2
                long r2 = r2 / r4
            L_0x028e:
                long r1 = p396x6.C22994b.m27204b(r2)
                long r3 = r28 + r1
                r0.f63261j = r3
                s7.a$a r1 = r0.f63255d
                s7.e r2 = p381s7.C22305e.this
                s7.a$a r2 = r2.f63252q
                if (r1 != r2) goto L_0x02a7
                s7.b r1 = r0.f63258g
                boolean r1 = r1.f63226l
                if (r1 != 0) goto L_0x02a7
                r33.mo35462b()
            L_0x02a7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p381s7.C22305e.C22307b.mo35463c(s7.b):void");
        }

        /* renamed from: j */
        public void mo17938j(C16876u.C16879c cVar, long j, long j2) {
            C79964v vVar = (C79964v) cVar;
            C22304c cVar2 = (C22304c) vVar.f234234d;
            if (cVar2 instanceof C22302b) {
                C22302b bVar = (C22302b) cVar2;
                mo35463c(bVar);
                if (bVar.f63226l) {
                    C21920c.C21921a aVar = C22305e.this.f63250o;
                    aVar.f61980a.post(new C21926e(aVar));
                }
                C22305e.this.f63250o.mo34975e(vVar.f234231a, 4, j, j2, vVar.f234236f);
                return;
            }
            this.f63264p = new C23015n("Loaded playlist has unexpected type.");
        }

        /* renamed from: l */
        public void mo17939l(C16876u.C16879c cVar, long j, long j2, boolean z) {
            C79964v vVar = (C79964v) cVar;
            C22305e.this.f63250o.mo34973c(vVar.f234231a, 4, j, j2, vVar.f234236f);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
            r1 = ((p300c8.C79958t.C79962d) r11).f234227d;
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo17940p(p300c8.C16876u.C16879c r15, long r16, long r18, java.io.IOException r20) {
            /*
                r14 = this;
                r11 = r20
                r0 = r15
                c8.v r0 = (p300c8.C79964v) r0
                boolean r12 = r11 instanceof p396x6.C23015n
                r13 = r14
                s7.e r1 = p381s7.C22305e.this
                p7.c$a r1 = r1.f63250o
                c8.j r2 = r0.f234231a
                long r7 = r0.f234236f
                r3 = 4
                r0 = r1
                r1 = r2
                r2 = r3
                r3 = r16
                r5 = r18
                r9 = r20
                r10 = r12
                r0.mo34977g(r1, r2, r3, r5, r7, r9, r10)
                r0 = 0
                if (r12 == 0) goto L_0x0023
                r0 = 3
                goto L_0x0042
            L_0x0023:
                boolean r1 = r11 instanceof p300c8.C79958t.C79962d
                r2 = 1
                if (r1 == 0) goto L_0x0037
                r1 = r11
                c8.t$d r1 = (p300c8.C79958t.C79962d) r1
                int r1 = r1.f234227d
                r3 = 404(0x194, float:5.66E-43)
                if (r1 == r3) goto L_0x0035
                r3 = 410(0x19a, float:5.75E-43)
                if (r1 != r3) goto L_0x0037
            L_0x0035:
                r1 = 1
                goto L_0x0038
            L_0x0037:
                r1 = 0
            L_0x0038:
                if (r1 == 0) goto L_0x003e
                boolean r2 = r14.mo35461a()
            L_0x003e:
                if (r2 == 0) goto L_0x0041
                goto L_0x0042
            L_0x0041:
                r0 = 2
            L_0x0042:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p381s7.C22305e.C22307b.mo17940p(c8.u$c, long, long, java.io.IOException):int");
        }

        public void run() {
            this.f63263o = false;
            this.f63256e.mo17937d(this.f63257f, this, C22305e.this.f63244f);
        }
    }

    /* renamed from: s7.e$c */
    public interface C22308c {
        /* renamed from: d */
        void mo35339d(C22300a.C22301a aVar, long j);

        void onPlaylistChanged();
    }

    /* renamed from: s7.e$d */
    public static final class C22309d extends IOException {
        public C22309d(String str, C22306a aVar) {
        }
    }

    /* renamed from: s7.e$e */
    public static final class C22310e extends IOException {
        public C22310e(String str, C22306a aVar) {
        }
    }

    /* renamed from: s7.e$f */
    public interface C22311f {
    }

    public C22305e(Uri uri, C22206d dVar, C21920c.C21921a aVar, int i, C22311f fVar, C79964v.C79965a<C22304c> aVar2) {
        this.f63242d = dVar;
        this.f63250o = aVar;
        this.f63244f = i;
        this.f63247i = fVar;
        this.f63243e = aVar2;
    }

    /* renamed from: a */
    public C22302b mo35460a(C22300a.C22301a aVar) {
        C22302b bVar;
        C22302b bVar2 = this.f63245g.get(aVar).f63258g;
        if (bVar2 != null && aVar != this.f63252q && this.f63251p.f63210c.contains(aVar) && ((bVar = this.f63253r) == null || !bVar.f63226l)) {
            this.f63252q = aVar;
            this.f63245g.get(aVar).mo35462b();
        }
        return bVar2;
    }

    /* renamed from: j */
    public void mo17938j(C16876u.C16879c cVar, long j, long j2) {
        C79964v vVar;
        C22300a aVar;
        C79964v vVar2 = (C79964v) cVar;
        C22304c cVar2 = (C22304c) vVar2.f234234d;
        boolean z = cVar2 instanceof C22302b;
        if (z) {
            if (((C22302b) cVar2).f63226l) {
                C21920c.C21921a aVar2 = this.f63250o;
                aVar2.f61980a.post(new C21926e(aVar2));
            }
            String str = cVar2.f63240a;
            vVar = vVar2;
            Format format = r5;
            Format format2 = new Format("0", MimeTypes.APPLICATION_M3U8, (String) null, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, 0, (String) null, -1, MAlarmHandler.NEXT_FIRE_INTERVAL, (List<byte[]>) null, (DrmInitData) null, (Metadata) null);
            List singletonList = Collections.singletonList(new C22300a.C22301a(str, format));
            List emptyList = Collections.emptyList();
            aVar = new C22300a((String) null, Collections.emptyList(), singletonList, emptyList, emptyList, (Format) null, (List<Format>) null);
        } else {
            vVar = vVar2;
            aVar = (C22300a) cVar2;
        }
        this.f63251p = aVar;
        this.f63252q = aVar.f63210c.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.f63210c);
        arrayList.addAll(aVar.f63211d);
        arrayList.addAll(aVar.f63212e);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C22300a.C22301a aVar3 = (C22300a.C22301a) arrayList.get(i);
            this.f63245g.put(aVar3, new C22307b(aVar3));
        }
        C22307b bVar = this.f63245g.get(this.f63252q);
        if (z) {
            bVar.mo35463c((C22302b) cVar2);
        } else {
            bVar.mo35462b();
        }
        C79964v vVar3 = vVar;
        this.f63250o.mo34975e(vVar3.f234231a, 4, j, j2, vVar3.f234236f);
    }

    /* renamed from: l */
    public void mo17939l(C16876u.C16879c cVar, long j, long j2, boolean z) {
        C79964v vVar = (C79964v) cVar;
        this.f63250o.mo34973c(vVar.f234231a, 4, j, j2, vVar.f234236f);
    }

    /* renamed from: p */
    public int mo17940p(C16876u.C16879c cVar, long j, long j2, IOException iOException) {
        C79964v vVar = (C79964v) cVar;
        boolean z = iOException instanceof C23015n;
        this.f63250o.mo34977g(vVar.f234231a, 4, j, j2, vVar.f234236f, iOException, z);
        return z ? 3 : 0;
    }
}
