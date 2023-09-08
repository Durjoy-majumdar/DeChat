package p658q1;

import fy3.C32226l;
import gy3.C87412m;
import java.util.HashMap;
import p410k0.C108793e;
import p436a1.C103224b0;
import p436a1.C103234g;
import p436a1.C103241i0;
import p436a1.C103262s;
import p436a1.C103272w;
import p560i2.C108322d;
import p631o1.C109827a0;
import p631o1.C109847j0;
import p631o1.C109854n0;
import p631o1.C109895y;
import p631o1.C109899z;
import p631o1.C61911a;
import rx3.C13598b0;

/* renamed from: q1.h */
public final class C110297h extends C110311s implements C108322d {

    /* renamed from: I */
    public static final C103241i0 f329876I;

    /* renamed from: H */
    public final /* synthetic */ C109827a0 f329877H;

    static {
        C103234g gVar = new C103234g();
        int i = C103272w.f304516h;
        gVar.mo142989c(C103272w.f304512d);
        gVar.mo143008t(1.0f);
        gVar.mo143009u(1);
        f329876I = gVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110297h(C110301j jVar) {
        super(jVar);
        C87412m.m108594g(jVar, "layoutNode");
        this.f329877H = jVar.f329928w;
    }

    /* renamed from: F */
    public long mo143031F(float f) {
        return this.f329877H.mo143031F(f);
    }

    /* renamed from: G */
    public int mo161154G(int i) {
        C110299i iVar = this.f329972h.f329926u;
        C109895y a = iVar.mo161700a();
        C110301j jVar = iVar.f329879a;
        return a.mo142888e(jVar.f329928w, jVar.mo161721q(), i);
    }

    /* renamed from: H0 */
    public C109827a0 mo161696H0() {
        return this.f329972h.f329928w;
    }

    /* renamed from: K */
    public C109854n0 mo161155K(long j) {
        mo161171s0(j);
        C108793e<C110301j> u = this.f329972h.mo161726u();
        int i = u.f325786f;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = u.f325784d;
            do {
                C110301j jVar = (C110301j) tArr[i2];
                j$$i j__i = j$$i.NotUsed;
                jVar.getClass();
                jVar.f329891E = j__i;
                i2++;
            } while (i2 < i);
        }
        C110301j jVar2 = this.f329972h;
        C109899z d = jVar2.f329925t.mo142887d(jVar2.f329928w, jVar2.mo161721q(), j);
        C110301j jVar3 = this.f329972h;
        jVar3.getClass();
        C87412m.m108594g(d, "measureResult");
        jVar3.f329895I.mo161754W0(d);
        mo161751S0();
        return this;
    }

    /* renamed from: M */
    public int mo143032M(float f) {
        return this.f329877H.mo143032M(f);
    }

    /* renamed from: O */
    public float mo143033O(long j) {
        return this.f329877H.mo143033O(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        r1 = r0.f329971B;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends p658q1.C110309q<T, M>, C, M extends p721v0.C65503j> void mo161697O0(p658q1.C110311s.C110316e<T, C, M> r19, long r20, p658q1.C62573f<C> r22, boolean r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            r8 = r19
            r9 = r20
            r11 = r22
            java.lang.String r1 = "hitTestSource"
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = "hitTestResult"
            gy3.C87412m.m108594g(r11, r1)
            q1.j r1 = r0.f329972h
            boolean r1 = r8.mo161766d(r1)
            r13 = 1
            if (r1 == 0) goto L_0x0058
            boolean r1 = p1166z0.C112540f.m153746b(r20)
            if (r1 != 0) goto L_0x0022
            goto L_0x0031
        L_0x0022:
            q1.b0 r1 = r0.f329971B
            if (r1 == 0) goto L_0x0033
            boolean r2 = r0.f329974j
            if (r2 == 0) goto L_0x0033
            boolean r1 = r1.mo144748b(r9)
            if (r1 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r1 = 0
            goto L_0x0034
        L_0x0033:
            r1 = 1
        L_0x0034:
            if (r1 == 0) goto L_0x003a
            r14 = r24
            r1 = 1
            goto L_0x005b
        L_0x003a:
            if (r23 == 0) goto L_0x0058
            long r1 = r18.mo161742I0()
            float r1 = r0.mo161735A0(r9, r1)
            boolean r2 = java.lang.Float.isInfinite(r1)
            if (r2 != 0) goto L_0x0052
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0052
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            if (r1 == 0) goto L_0x0058
            r1 = 1
            r14 = 0
            goto L_0x005b
        L_0x0058:
            r14 = r24
            r1 = 0
        L_0x005b:
            if (r1 == 0) goto L_0x00cb
            int r15 = r11.f177722f
            q1.j r1 = r0.f329972h
            k0.e r1 = r1.mo161724t()
            int r2 = r1.f325786f
            if (r2 <= 0) goto L_0x00c9
            int r2 = r2 - r13
            T[] r7 = r1.f325784d
            r16 = r2
        L_0x006e:
            r1 = r7[r16]
            r6 = r1
            q1.j r6 = (p658q1.C110301j) r6
            boolean r1 = r6.f329887A
            if (r1 == 0) goto L_0x00bc
            r1 = r19
            r2 = r6
            r3 = r20
            r5 = r22
            r12 = r6
            r6 = r23
            r17 = r7
            r7 = r14
            r1.mo161763a(r2, r3, r5, r6, r7)
            long r1 = r22.mo87582f()
            r3 = 32
            long r3 = r1 >> r3
            int r4 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r4)
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a1
            boolean r1 = p658q1.C62572c.m73543b(r1)
            if (r1 == 0) goto L_0x00a1
            r1 = 1
            goto L_0x00a2
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            if (r1 != 0) goto L_0x00a5
            goto L_0x00b5
        L_0x00a5:
            q1.a0 r1 = r12.f329896J
            q1.s r1 = r1.f329845i
            boolean r1 = r1.mo161755X0()
            if (r1 == 0) goto L_0x00b7
            int r1 = r11.f177723g
            int r1 = r1 + -1
            r11.f177722f = r1
        L_0x00b5:
            r1 = 1
            goto L_0x00b8
        L_0x00b7:
            r1 = 0
        L_0x00b8:
            if (r1 != 0) goto L_0x00be
            r1 = 1
            goto L_0x00bf
        L_0x00bc:
            r17 = r7
        L_0x00be:
            r1 = 0
        L_0x00bf:
            if (r1 != 0) goto L_0x00c9
            int r16 = r16 + -1
            if (r16 >= 0) goto L_0x00c6
            goto L_0x00c9
        L_0x00c6:
            r7 = r17
            goto L_0x006e
        L_0x00c9:
            r11.f177722f = r15
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p658q1.C110297h.mo161697O0(q1.s$e, long, q1.f, boolean, boolean):void");
    }

    /* renamed from: S */
    public int mo161156S(int i) {
        C110299i iVar = this.f329972h.f329926u;
        C109895y a = iVar.mo161700a();
        C110301j jVar = iVar.f329879a;
        return a.mo142886c(jVar.f329928w, jVar.mo161721q(), i);
    }

    /* renamed from: T */
    public float mo143034T(float f) {
        return this.f329877H.mo143034T(f);
    }

    /* renamed from: U0 */
    public void mo161698U0(C103262s sVar) {
        C87412m.m108594g(sVar, "canvas");
        C110282c0 a = C110310r.m150081a(this.f329972h);
        C108793e<C110301j> t = this.f329972h.mo161724t();
        int i = t.f325786f;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = t.f325784d;
            do {
                C110301j jVar = (C110301j) tArr[i2];
                if (jVar.f329887A) {
                    jVar.mo161720p(sVar);
                }
                i2++;
            } while (i2 < i);
        }
        if (a.getShowLayoutBounds()) {
            mo161737C0(sVar, f329876I);
        }
    }

    /* renamed from: V */
    public int mo161157V(int i) {
        C110299i iVar = this.f329972h.f329926u;
        C109895y a = iVar.mo161700a();
        C110301j jVar = iVar.f329879a;
        return a.mo142884a(jVar.f329928w, jVar.mo161721q(), i);
    }

    /* renamed from: Y */
    public int mo161158Y(int i) {
        C110299i iVar = this.f329972h.f329926u;
        C109895y a = iVar.mo161700a();
        C110301j jVar = iVar.f329879a;
        return a.mo142885b(jVar.f329928w, jVar.mo161721q(), i);
    }

    /* renamed from: d0 */
    public float mo143035d0(float f) {
        return this.f329877H.mo143035d0(f);
    }

    /* renamed from: g0 */
    public long mo143036g0(long j) {
        return this.f329877H.mo143036g0(j);
    }

    public float getDensity() {
        return this.f329877H.getDensity();
    }

    public float getFontScale() {
        return this.f329877H.getFontScale();
    }

    /* renamed from: j0 */
    public void mo161160j0(long j, float f, C32226l<? super C103224b0, C13598b0> lVar) {
        super.mo161160j0(j, f, lVar);
        C110311s sVar = this.f329973i;
        boolean z = false;
        if (!(sVar != null && sVar.f329984w)) {
            for (T t = this.f329986y[4]; t != null; t = t.f329963f) {
                ((C109847j0) ((C110302j0) t).f329962e).mo145809y(this);
            }
            C110301j jVar = this.f329972h;
            C110301j s = jVar.mo161723s();
            C110311s sVar2 = jVar.f329895I;
            float f2 = sVar2.f329983v;
            C110311s sVar3 = jVar.f329896J.f329845i;
            while (!C87412m.m108589b(sVar3, sVar2)) {
                C110324v vVar = (C110324v) sVar3;
                f2 += vVar.f329983v;
                sVar3 = vVar.f330026H;
            }
            if (!(f2 == jVar.f329897K)) {
                jVar.f329897K = f2;
                if (s != null) {
                    s.mo161707H();
                }
                if (s != null) {
                    s.mo161729x();
                }
            }
            if (!jVar.f329887A) {
                if (s != null) {
                    s.mo161729x();
                }
                jVar.mo161703C();
            }
            if (s == null) {
                jVar.f329888B = 0;
            } else if (!jVar.f329908W && s.f329920o == j$$g.LayingOut) {
                if (jVar.f329888B == Integer.MAX_VALUE) {
                    z = true;
                }
                if (z) {
                    int i = s.f329890D;
                    jVar.f329888B = i;
                    s.f329890D = i + 1;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
            jVar.mo161702B();
        }
    }

    /* renamed from: m */
    public float mo143039m(int i) {
        return this.f329877H.mo143039m(i);
    }

    /* renamed from: q */
    public long mo143040q(long j) {
        return this.f329877H.mo143040q(j);
    }

    /* renamed from: w0 */
    public int mo161699w0(C61911a aVar) {
        C87412m.m108594g(aVar, "alignmentLine");
        C110301j jVar = this.f329972h;
        jVar.f329896J.getClass();
        if (jVar.f329920o == j$$g.Measuring) {
            C110307o oVar = jVar.f329931z;
            oVar.f329955f = true;
            if (oVar.f329951b) {
                jVar.f329910Y = true;
            }
        } else {
            jVar.f329931z.f329956g = true;
        }
        jVar.mo161702B();
        Integer num = (Integer) ((HashMap) jVar.f329931z.f329958i).get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
