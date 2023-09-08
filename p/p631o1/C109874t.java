package p631o1;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C108509q;
import p175j0.C24721r;
import p175j0.C60690y0;
import p410k0.C108793e;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109827a0;
import p631o1.C109854n0;
import p631o1.C109897y0;
import p658q1.C110301j;
import p658q1.j$$g;
import p658q1.j$$i;
import rx3.C13598b0;

/* renamed from: o1.t */
public final class C109874t {

    /* renamed from: a */
    public final C110301j f328797a;

    /* renamed from: b */
    public C24721r f328798b;

    /* renamed from: c */
    public C109897y0 f328799c;

    /* renamed from: d */
    public int f328800d;

    /* renamed from: e */
    public final Map<C110301j, C109875a> f328801e = new LinkedHashMap();

    /* renamed from: f */
    public final Map<Object, C110301j> f328802f = new LinkedHashMap();

    /* renamed from: g */
    public final C109876b f328803g = new C109876b();

    /* renamed from: h */
    public final Map<Object, C110301j> f328804h = new LinkedHashMap();

    /* renamed from: i */
    public final C109897y0.C109898a f328805i = new C109897y0.C109898a((Set) null, 1, (C8480h) null);

    /* renamed from: j */
    public int f328806j;

    /* renamed from: k */
    public int f328807k;

    /* renamed from: l */
    public final String f328808l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* renamed from: o1.t$a */
    public static final class C109875a {

        /* renamed from: a */
        public Object f328809a;

        /* renamed from: b */
        public C32227p<? super C108504h, ? super Integer, C13598b0> f328810b;

        /* renamed from: c */
        public C108509q f328811c;

        /* renamed from: d */
        public boolean f328812d;

        /* renamed from: e */
        public final C60690y0 f328813e;

        public C109875a(Object obj, C32227p pVar, C108509q qVar, int i, C8480h hVar) {
            qVar = (i & 4) != 0 ? null : qVar;
            C87412m.m108594g(pVar, "content");
            this.f328809a = obj;
            this.f328810b = pVar;
            this.f328811c = qVar;
            this.f328813e = C108500f2.m146996c(Boolean.TRUE, (C108497e2) null, 2, (Object) null);
        }
    }

    /* renamed from: o1.t$b */
    public final class C109876b implements C109894x0 {

        /* renamed from: d */
        public C33183o f328814d = C33183o.Rtl;

        /* renamed from: e */
        public float f328815e;

        /* renamed from: f */
        public float f328816f;

        public C109876b() {
        }

        /* renamed from: F */
        public long mo143031F(float f) {
            return C108322d.C108323a.m146725g(this, f);
        }

        /* renamed from: M */
        public int mo143032M(float f) {
            return C108322d.C108323a.m146719a(this, f);
        }

        /* renamed from: O */
        public float mo143033O(long j) {
            return C108322d.C108323a.m146722d(this, j);
        }

        /* renamed from: T */
        public float mo143034T(float f) {
            return C108322d.C108323a.m146723e(this, f);
        }

        /* renamed from: d0 */
        public float mo143035d0(float f) {
            return f / getDensity();
        }

        /* renamed from: g0 */
        public long mo143036g0(long j) {
            return C108322d.C108323a.m146724f(this, j);
        }

        public float getDensity() {
            return this.f328815e;
        }

        public float getFontScale() {
            return this.f328816f;
        }

        public C33183o getLayoutDirection() {
            return this.f328814d;
        }

        /* renamed from: m */
        public float mo143039m(int i) {
            return C108322d.C108323a.m146720b(this, i);
        }

        /* renamed from: q */
        public long mo143040q(long j) {
            return C108322d.C108323a.m146721c(this, j);
        }

        /* renamed from: q0 */
        public List<C109893x> mo161192q0(Object obj, C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
            C87412m.m108594g(pVar, "content");
            C109874t tVar = C109874t.this;
            tVar.getClass();
            tVar.mo161189b();
            j$$g j__g = tVar.f328797a.f329920o;
            if (j__g == j$$g.Measuring || j__g == j$$g.LayingOut) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) tVar.f328802f;
                Object obj2 = linkedHashMap.get(obj);
                if (obj2 == null) {
                    obj2 = tVar.f328804h.remove(obj);
                    if (obj2 != null) {
                        int i = tVar.f328807k;
                        if (i > 0) {
                            tVar.f328807k = i - 1;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        obj2 = tVar.mo161191d(obj);
                        if (obj2 == null) {
                            int i2 = tVar.f328800d;
                            C110301j jVar = new C110301j(true);
                            C110301j jVar2 = tVar.f328797a;
                            jVar2.f329922q = true;
                            jVar2.mo161728w(i2, jVar);
                            jVar2.f329922q = false;
                            obj2 = jVar;
                        }
                    }
                    linkedHashMap.put(obj, obj2);
                }
                C110301j jVar3 = (C110301j) obj2;
                int indexOf = ((C108793e.C108794a) tVar.f328797a.mo161722r()).indexOf(jVar3);
                int i3 = tVar.f328800d;
                if (indexOf >= i3) {
                    if (i3 != indexOf) {
                        C110301j jVar4 = tVar.f328797a;
                        jVar4.f329922q = true;
                        jVar4.mo161705E(indexOf, i3, 1);
                        jVar4.f329922q = false;
                    }
                    tVar.f328800d++;
                    tVar.mo161190c(jVar3, obj, pVar);
                    return jVar3.mo161721q();
                }
                throw new IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }

        /* renamed from: t */
        public C109899z mo144573t(int i, int i2, Map<C61911a, Integer> map, C32226l<? super C109854n0.C109855a, C13598b0> lVar) {
            C87412m.m108594g(map, "alignmentLines");
            C87412m.m108594g(lVar, "placementBlock");
            return C109827a0.C109828a.m149246a(this, i, i2, map, lVar);
        }
    }

    public C109874t(C110301j jVar, C109897y0 y0Var) {
        C87412m.m108594g(jVar, "root");
        C87412m.m108594g(y0Var, "slotReusePolicy");
        this.f328797a = jVar;
        this.f328799c = y0Var;
    }

    /* renamed from: a */
    public final void mo161188a(int i) {
        this.f328806j = 0;
        int i2 = (((C108793e.C108794a) this.f328797a.mo161722r()).f325787d.f325786f - this.f328807k) - 1;
        if (i <= i2) {
            this.f328805i.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    C109897y0.C109898a aVar = this.f328805i;
                    Object obj = ((LinkedHashMap) this.f328801e).get((C110301j) ((C108793e.C108794a) this.f328797a.mo161722r()).get(i3));
                    C87412m.m108591d(obj);
                    aVar.f328844d.add(((C109875a) obj).f328809a);
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            this.f328799c.mo144569a(this.f328805i);
            while (i2 >= i) {
                C110301j jVar = (C110301j) ((C108793e.C108794a) this.f328797a.mo161722r()).get(i2);
                Object obj2 = ((LinkedHashMap) this.f328801e).get(jVar);
                C87412m.m108591d(obj2);
                C109875a aVar2 = (C109875a) obj2;
                Object obj3 = aVar2.f328809a;
                if (this.f328805i.contains(obj3)) {
                    j$$i j__i = j$$i.NotUsed;
                    jVar.getClass();
                    jVar.f329891E = j__i;
                    this.f328806j++;
                    ((C108494d2) aVar2.f328813e).setValue(Boolean.FALSE);
                } else {
                    C110301j jVar2 = this.f328797a;
                    jVar2.f329922q = true;
                    this.f328801e.remove(jVar);
                    C108509q qVar = aVar2.f328811c;
                    if (qVar != null) {
                        qVar.dispose();
                    }
                    this.f328797a.mo161709J(i2, 1);
                    jVar2.f329922q = false;
                }
                this.f328802f.remove(obj3);
                i2--;
            }
        }
        mo161189b();
    }

    /* renamed from: b */
    public final void mo161189b() {
        boolean z = true;
        if (this.f328801e.size() == this.f328797a.mo161722r().size()) {
            if ((this.f328797a.mo161722r().size() - this.f328806j) - this.f328807k >= 0) {
                if (this.f328804h.size() != this.f328807k) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f328807k + ". Map size " + this.f328804h.size()).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Total children " + this.f328797a.mo161722r().size() + ". Reusable children " + this.f328806j + ". Precomposed children " + this.f328807k).toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f328801e.size() + ") and the children count on the SubcomposeLayout (" + this.f328797a.mo161722r().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: o1.t$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: o1.t$a} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo161190c(p658q1.C110301j r9, java.lang.Object r10, fy3.C32227p<? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r11) {
        /*
            r8 = this;
            java.util.Map<q1.j, o1.t$a> r0 = r8.f328801e
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r1 = r0.get(r9)
            if (r1 != 0) goto L_0x001b
            o1.t$a r1 = new o1.t$a
            fy3.p<j0.h, java.lang.Integer, rx3.b0> r2 = p631o1.C61915e.f176023a
            fy3.p<j0.h, java.lang.Integer, rx3.b0> r4 = p631o1.C61915e.f176023a
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r1
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r0.put(r9, r1)
        L_0x001b:
            o1.t$a r1 = (p631o1.C109874t.C109875a) r1
            j0.q r10 = r1.f328811c
            r0 = 1
            if (r10 == 0) goto L_0x0027
            boolean r10 = r10.mo51674r()
            goto L_0x0028
        L_0x0027:
            r10 = 1
        L_0x0028:
            fy3.p<? super j0.h, ? super java.lang.Integer, rx3.b0> r2 = r1.f328810b
            if (r2 != r11) goto L_0x0032
            if (r10 != 0) goto L_0x0032
            boolean r10 = r1.f328812d
            if (r10 == 0) goto L_0x008c
        L_0x0032:
            java.lang.String r10 = "<set-?>"
            gy3.C87412m.m108594g(r11, r10)
            r1.f328810b = r11
            j0.i2<t0.h> r10 = p241t0.C110865n.f331650b
            java.lang.Object r10 = r10.mo159371a()
            t0.h r10 = (p241t0.C110849h) r10
            r11 = 0
            t0.h r10 = p241t0.C110865n.m151144g(r10, r11)
            t0.h r11 = r10.mo162465i()     // Catch:{ all -> 0x009e }
            q1.j r2 = r8.f328797a     // Catch:{ all -> 0x0099 }
            r2.f329922q = r0     // Catch:{ all -> 0x0099 }
            fy3.p<? super j0.h, ? super java.lang.Integer, rx3.b0> r3 = r1.f328810b     // Catch:{ all -> 0x0099 }
            j0.q r4 = r1.f328811c     // Catch:{ all -> 0x0099 }
            j0.r r5 = r8.f328798b     // Catch:{ all -> 0x0099 }
            if (r5 == 0) goto L_0x008d
            r6 = -34810602(0xfffffffffdecd516, float:-3.9350527E37)
            o1.w r7 = new o1.w     // Catch:{ all -> 0x0099 }
            r7.<init>(r1, r3)     // Catch:{ all -> 0x0099 }
            q0.a r0 = p415q0.C110261c.m149879c(r6, r0, r7)     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x006a
            boolean r3 = r4.mo51665i()     // Catch:{ all -> 0x0099 }
            if (r3 == 0) goto L_0x007a
        L_0x006a:
            android.view.ViewGroup$LayoutParams r3 = androidx.compose.p002ui.platform.C103620e3.f306076a     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "container"
            gy3.C87412m.m108594g(r9, r3)     // Catch:{ all -> 0x0099 }
            q1.l0 r3 = new q1.l0     // Catch:{ all -> 0x0099 }
            r3.<init>(r9)     // Catch:{ all -> 0x0099 }
            j0.q r4 = p175j0.C108512u.m147055a(r3, r5)     // Catch:{ all -> 0x0099 }
        L_0x007a:
            r4.mo51662f(r0)     // Catch:{ all -> 0x0099 }
            r1.f328811c = r4     // Catch:{ all -> 0x0099 }
            r9 = 0
            r2.f329922q = r9     // Catch:{ all -> 0x0099 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0099 }
            r10.mo162466o(r11)     // Catch:{ all -> 0x009e }
            r10.mo162424c()
            r1.f328812d = r9
        L_0x008c:
            return
        L_0x008d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "parent composition reference not set"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0099 }
            r9.<init>(r0)     // Catch:{ all -> 0x0099 }
            throw r9     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r9 = move-exception
            r10.mo162466o(r11)     // Catch:{ all -> 0x009e }
            throw r9     // Catch:{ all -> 0x009e }
        L_0x009e:
            r9 = move-exception
            r10.mo162424c()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p631o1.C109874t.mo161190c(q1.j, java.lang.Object, fy3.p):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: q1.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p658q1.C110301j mo161191d(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f328806j
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            q1.j r0 = r9.f328797a
            java.util.List r0 = r0.mo161722r()
            k0.e$a r0 = (p410k0.C108793e.C108794a) r0
            k0.e<T> r0 = r0.f325787d
            int r0 = r0.f325786f
            int r2 = r9.f328807k
            int r0 = r0 - r2
            int r2 = r9.f328806j
            int r2 = r0 - r2
            r3 = 1
            int r0 = r0 - r3
            r4 = r0
        L_0x001c:
            r5 = -1
            if (r4 < r2) goto L_0x0047
            q1.j r6 = r9.f328797a
            java.util.List r6 = r6.mo161722r()
            k0.e$a r6 = (p410k0.C108793e.C108794a) r6
            java.lang.Object r6 = r6.get(r4)
            q1.j r6 = (p658q1.C110301j) r6
            java.util.Map<q1.j, o1.t$a> r7 = r9.f328801e
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r6 = r7.get(r6)
            gy3.C87412m.m108591d(r6)
            o1.t$a r6 = (p631o1.C109874t.C109875a) r6
            java.lang.Object r6 = r6.f328809a
            boolean r6 = gy3.C87412m.m108589b(r6, r10)
            if (r6 == 0) goto L_0x0044
            r6 = r4
            goto L_0x0048
        L_0x0044:
            int r4 = r4 + -1
            goto L_0x001c
        L_0x0047:
            r6 = -1
        L_0x0048:
            if (r6 != r5) goto L_0x007a
        L_0x004a:
            if (r0 < r2) goto L_0x0079
            q1.j r4 = r9.f328797a
            java.util.List r4 = r4.mo161722r()
            k0.e$a r4 = (p410k0.C108793e.C108794a) r4
            java.lang.Object r4 = r4.get(r0)
            q1.j r4 = (p658q1.C110301j) r4
            java.util.Map<q1.j, o1.t$a> r7 = r9.f328801e
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r4 = r7.get(r4)
            gy3.C87412m.m108591d(r4)
            o1.t$a r4 = (p631o1.C109874t.C109875a) r4
            o1.y0 r7 = r9.f328799c
            java.lang.Object r8 = r4.f328809a
            boolean r7 = r7.mo144570b(r10, r8)
            if (r7 == 0) goto L_0x0076
            r4.f328809a = r10
            r4 = r0
            r6 = r4
            goto L_0x007a
        L_0x0076:
            int r0 = r0 + -1
            goto L_0x004a
        L_0x0079:
            r4 = r0
        L_0x007a:
            if (r6 != r5) goto L_0x007d
            goto L_0x00d1
        L_0x007d:
            r10 = 0
            if (r4 == r2) goto L_0x0089
            q1.j r0 = r9.f328797a
            r0.f329922q = r3
            r0.mo161705E(r4, r2, r3)
            r0.f329922q = r10
        L_0x0089:
            int r0 = r9.f328806j
            int r0 = r0 + r5
            r9.f328806j = r0
            q1.j r0 = r9.f328797a
            java.util.List r0 = r0.mo161722r()
            k0.e$a r0 = (p410k0.C108793e.C108794a) r0
            java.lang.Object r0 = r0.get(r2)
            r1 = r0
            q1.j r1 = (p658q1.C110301j) r1
            java.util.Map<q1.j, o1.t$a> r0 = r9.f328801e
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            gy3.C87412m.m108591d(r0)
            o1.t$a r0 = (p631o1.C109874t.C109875a) r0
            j0.y0 r0 = r0.f328813e
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            j0.d2 r0 = (p175j0.C108494d2) r0
            r0.setValue(r2)
            java.lang.Object r0 = p241t0.C110865n.f331651c
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<t0.a> r2 = p241t0.C110865n.f331657i     // Catch:{ all -> 0x00d2 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00d2 }
            t0.a r2 = (p241t0.C110834a) r2     // Catch:{ all -> 0x00d2 }
            java.util.Set<t0.h0> r2 = r2.f331588h     // Catch:{ all -> 0x00d2 }
            if (r2 == 0) goto L_0x00ca
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00d2 }
            r2 = r2 ^ r3
            if (r2 != r3) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r3 = 0
        L_0x00cb:
            monitor-exit(r0)
            if (r3 == 0) goto L_0x00d1
            p241t0.C110865n.m151138a()
        L_0x00d1:
            return r1
        L_0x00d2:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p631o1.C109874t.mo161191d(java.lang.Object):q1.j");
    }
}
