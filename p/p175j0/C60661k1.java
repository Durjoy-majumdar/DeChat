package p175j0;

import a14.C0002w;
import a14.C53867c2;
import a14.C53916l;
import a14.C53927n1;
import a14.C53973z1;
import d14.C58052j1;
import d14.C58056k1;
import d14.C58087u0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import p241t0.C110838b;
import p241t0.C110849h;
import p241t0.C110853i;
import p241t0.C110865n;
import p410k0.C60926c;
import p412o0.C25313b;
import p708u0.C111061a;
import p854l0.C61178e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64175a0;
import wx3.C66212f;

/* renamed from: j0.k1 */
public final class C60661k1 extends C24721r {

    /* renamed from: q */
    public static final C58087u0<C61178e<C60663b>> f172783q = C58056k1.m67214a(C25313b.f71815g);

    /* renamed from: a */
    public final C60648e f172784a;

    /* renamed from: b */
    public final C0002w f172785b;

    /* renamed from: c */
    public final C66212f f172786c;

    /* renamed from: d */
    public final Object f172787d = new Object();

    /* renamed from: e */
    public C53973z1 f172788e;

    /* renamed from: f */
    public Throwable f172789f;

    /* renamed from: g */
    public final List<C60689y> f172790g = new ArrayList();

    /* renamed from: h */
    public final List<Set<Object>> f172791h = new ArrayList();

    /* renamed from: i */
    public final List<C60689y> f172792i = new ArrayList();

    /* renamed from: j */
    public final List<C60689y> f172793j = new ArrayList();

    /* renamed from: k */
    public final List<C24727x0> f172794k = new ArrayList();

    /* renamed from: l */
    public final Map<C60687v0<Object>, List<C24727x0>> f172795l = new LinkedHashMap();

    /* renamed from: m */
    public final Map<C24727x0, C24726w0> f172796m = new LinkedHashMap();

    /* renamed from: n */
    public C53916l<? super C13598b0> f172797n;

    /* renamed from: o */
    public final C58087u0<C60664c> f172798o = C58056k1.m67214a(C60664c.Inactive);

    /* renamed from: p */
    public final C60663b f172799p = new C60663b(this);

    /* renamed from: j0.k1$a */
    public static final class C60662a {
        public C60662a(C8480h hVar) {
        }
    }

    /* renamed from: j0.k1$b */
    public final class C60663b {
        public C60663b(C60661k1 k1Var) {
        }
    }

    /* renamed from: j0.k1$c */
    public enum C60664c {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* renamed from: j0.k1$d */
    public static final class C60665d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60661k1 f172807d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60665d(C60661k1 k1Var) {
            super(0);
            this.f172807d = k1Var;
        }

        public Object invoke() {
            C53916l<C13598b0> v;
            C60661k1 k1Var = this.f172807d;
            synchronized (k1Var.f172787d) {
                v = k1Var.mo85597v();
                if (((C60664c) ((C58052j1) k1Var.f172798o).getValue()).compareTo(C60664c.ShuttingDown) <= 0) {
                    throw C53927n1.m60552a("Recomposer shutdown; frame clock awaiter will never resume", k1Var.f172789f);
                }
            }
            if (v != null) {
                Result.Companion companion = Result.Companion;
                v.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j0.k1$e */
    public static final class C60666e extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60661k1 f172808d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60666e(C60661k1 k1Var) {
            super(1);
            this.f172808d = k1Var;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            CancellationException a = C53927n1.m60552a("Recomposer effect job completed", th);
            C60661k1 k1Var = this.f172808d;
            synchronized (k1Var.f172787d) {
                C53973z1 z1Var = k1Var.f172788e;
                if (z1Var != null) {
                    ((C58052j1) k1Var.f172798o).setValue(C60664c.ShuttingDown);
                    z1Var.mo74528b(a);
                    k1Var.f172797n = null;
                    z1Var.mo74515E(new C60669l1(k1Var, th));
                } else {
                    k1Var.f172789f = a;
                    ((C58052j1) k1Var.f172798o).setValue(C60664c.ShutDown);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            return C13598b0.f38549a;
        }
    }

    static {
        new C60662a((C8480h) null);
    }

    public C60661k1(C66212f fVar) {
        C87412m.m108594g(fVar, "effectCoroutineContext");
        C60648e eVar = new C60648e(new C60665d(this));
        this.f172784a = eVar;
        int i = C53973z1.f151221b0;
        C53867c2 c2Var = new C53867c2((C53973z1) fVar.get(C53973z1.C0004b.f3d));
        c2Var.mo74515E(new C60666e(this));
        this.f172785b = c2Var;
        this.f172786c = fVar.plus(eVar).plus(c2Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: sx3.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m70938q(p175j0.C60661k1 r9) {
        /*
            java.lang.Object r0 = r9.f172787d
            monitor-enter(r0)
            java.util.Map<j0.v0<java.lang.Object>, java.util.List<j0.x0>> r1 = r9.f172795l     // Catch:{ all -> 0x0076 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0076 }
            r1 = r1 ^ 1
            r2 = 0
            if (r1 == 0) goto L_0x0054
            java.util.Map<j0.v0<java.lang.Object>, java.util.List<j0.x0>> r1 = r9.f172795l     // Catch:{ all -> 0x0076 }
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch:{ all -> 0x0076 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0076 }
            java.util.List r1 = sx3.C36907w.m41091m(r1)     // Catch:{ all -> 0x0076 }
            java.util.Map<j0.v0<java.lang.Object>, java.util.List<j0.x0>> r3 = r9.f172795l     // Catch:{ all -> 0x0076 }
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch:{ all -> 0x0076 }
            r3.clear()     // Catch:{ all -> 0x0076 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0076 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0076 }
            int r4 = r1.size()     // Catch:{ all -> 0x0076 }
            r3.<init>(r4)     // Catch:{ all -> 0x0076 }
            int r4 = r1.size()     // Catch:{ all -> 0x0076 }
            r5 = 0
        L_0x0031:
            if (r5 >= r4) goto L_0x004c
            java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x0076 }
            j0.x0 r6 = (p175j0.C24727x0) r6     // Catch:{ all -> 0x0076 }
            java.util.Map<j0.x0, j0.w0> r7 = r9.f172796m     // Catch:{ all -> 0x0076 }
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7     // Catch:{ all -> 0x0076 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0076 }
            rx3.l r8 = new rx3.l     // Catch:{ all -> 0x0076 }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x0076 }
            r3.add(r8)     // Catch:{ all -> 0x0076 }
            int r5 = r5 + 1
            goto L_0x0031
        L_0x004c:
            java.util.Map<j0.x0, j0.w0> r9 = r9.f172796m     // Catch:{ all -> 0x0076 }
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9     // Catch:{ all -> 0x0076 }
            r9.clear()     // Catch:{ all -> 0x0076 }
            goto L_0x0056
        L_0x0054:
            sx3.f0 r3 = sx3.C64186f0.f181907d     // Catch:{ all -> 0x0076 }
        L_0x0056:
            monitor-exit(r0)
            int r9 = r3.size()
        L_0x005b:
            if (r2 >= r9) goto L_0x0075
            java.lang.Object r0 = r3.get(r2)
            rx3.l r0 = (rx3.C13604l) r0
            A r1 = r0.f38555d
            j0.x0 r1 = (p175j0.C24727x0) r1
            B r0 = r0.f38556e
            j0.w0 r0 = (p175j0.C24726w0) r0
            if (r0 == 0) goto L_0x0072
            j0.y r1 = r1.f70537c
            r1.mo51656a(r0)
        L_0x0072:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x0075:
            return
        L_0x0076:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p175j0.C60661k1.m70938q(j0.k1):void");
    }

    /* renamed from: r */
    public static final C60689y m70939r(C60661k1 k1Var, C60689y yVar, C60926c cVar) {
        C110838b y;
        C110849h i;
        k1Var.getClass();
        if (yVar.mo51672p() || yVar.mo51665i()) {
            return null;
        }
        C60672o1 o1Var = new C60672o1(yVar);
        C60681r1 r1Var = new C60681r1(yVar, cVar);
        C110849h i2 = C110865n.m151146i();
        C110838b bVar = i2 instanceof C110838b ? (C110838b) i2 : null;
        if (bVar == null || (y = bVar.mo162430y(o1Var, r1Var)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        try {
            i = y.mo162465i();
            boolean z = false;
            if (cVar != null) {
                if (cVar.f173545d > 0) {
                    z = true;
                }
            }
            if (z) {
                yVar.mo51668l(new C60671n1(cVar, yVar));
            }
            boolean d = yVar.mo51659d();
            y.mo162466o(i);
            k1Var.mo85595t(y);
            if (!d) {
                yVar = null;
            }
            return yVar;
        } catch (Throwable th) {
            k1Var.mo85595t(y);
            throw th;
        }
    }

    /* renamed from: s */
    public static final void m70940s(C60661k1 k1Var) {
        if (!((ArrayList) k1Var.f172791h).isEmpty()) {
            ArrayList arrayList = (ArrayList) k1Var.f172791h;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Set set = (Set) arrayList.get(i);
                ArrayList arrayList2 = (ArrayList) k1Var.f172790g;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C60689y) arrayList2.get(i2)).mo51671o(set);
                }
            }
            ((ArrayList) k1Var.f172791h).clear();
            if (k1Var.mo85597v() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    /* renamed from: x */
    public static final void m70941x(List<C24727x0> list, C60661k1 k1Var, C60689y yVar) {
        list.clear();
        synchronized (k1Var.f172787d) {
            Iterator it = ((ArrayList) k1Var.f172794k).iterator();
            while (it.hasNext()) {
                C24727x0 x0Var = (C24727x0) it.next();
                if (C87412m.m108589b(x0Var.f70537c, yVar)) {
                    list.add(x0Var);
                    it.remove();
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo51628a(C60689y yVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
        C110838b y;
        C110849h i;
        C87412m.m108594g(yVar, "composition");
        C87412m.m108594g(pVar, "content");
        boolean p = yVar.mo51672p();
        C60672o1 o1Var = new C60672o1(yVar);
        C60681r1 r1Var = new C60681r1(yVar, (C60926c<Object>) null);
        C110849h i2 = C110865n.m151146i();
        C110838b bVar = i2 instanceof C110838b ? (C110838b) i2 : null;
        if (bVar == null || (y = bVar.mo162430y(o1Var, r1Var)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        try {
            i = y.mo162465i();
            yVar.mo51658c(pVar);
            C13598b0 b0Var = C13598b0.f38549a;
            y.mo162466o(i);
            mo85595t(y);
            if (!p) {
                C110865n.m151146i().mo162427l();
            }
            synchronized (this.f172787d) {
                if (((C60664c) ((C58052j1) this.f172798o).getValue()).compareTo(C60664c.ShuttingDown) > 0 && !((ArrayList) this.f172790g).contains(yVar)) {
                    this.f172790g.add(yVar);
                }
            }
            synchronized (this.f172787d) {
                ArrayList arrayList = (ArrayList) this.f172794k;
                int size = arrayList.size();
                boolean z = false;
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (C87412m.m108589b(((C24727x0) arrayList.get(i3)).f70537c, yVar)) {
                        z = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z) {
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    ArrayList arrayList2 = new ArrayList();
                    m70941x(arrayList2, this, yVar);
                    while (!arrayList2.isEmpty()) {
                        mo85599y(arrayList2, (C60926c<Object>) null);
                        m70941x(arrayList2, this, yVar);
                    }
                }
            }
            yVar.mo51663g();
            yVar.mo51669m();
            if (!p) {
                C110865n.m151146i().mo162427l();
            }
        } catch (Throwable th) {
            mo85595t(y);
            throw th;
        }
    }

    /* renamed from: b */
    public void mo51629b(C24727x0 x0Var) {
        C87412m.m108594g(x0Var, "reference");
        synchronized (this.f172787d) {
            Map<C60687v0<Object>, List<C24727x0>> map = this.f172795l;
            C60687v0<Object> v0Var = x0Var.f70535a;
            C87412m.m108594g(map, "<this>");
            List<C24727x0> list = map.get(v0Var);
            if (list == null) {
                list = new ArrayList<>();
                map.put(v0Var, list);
            }
            list.add(x0Var);
        }
    }

    /* renamed from: d */
    public boolean mo51631d() {
        return false;
    }

    /* renamed from: f */
    public int mo51633f() {
        return 1000;
    }

    /* renamed from: g */
    public C66212f mo51634g() {
        return this.f172786c;
    }

    /* renamed from: h */
    public void mo51635h(C24727x0 x0Var) {
        C53916l<C13598b0> v;
        C87412m.m108594g(x0Var, "reference");
        synchronized (this.f172787d) {
            this.f172794k.add(x0Var);
            v = mo85597v();
        }
        if (v != null) {
            Result.Companion companion = Result.Companion;
            v.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
    }

    /* renamed from: i */
    public void mo51636i(C60689y yVar) {
        C53916l<C13598b0> lVar;
        C87412m.m108594g(yVar, "composition");
        synchronized (this.f172787d) {
            if (!this.f172792i.contains(yVar)) {
                this.f172792i.add(yVar);
                lVar = mo85597v();
            } else {
                lVar = null;
            }
        }
        if (lVar != null) {
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
    }

    /* renamed from: j */
    public void mo51637j(C24727x0 x0Var, C24726w0 w0Var) {
        C87412m.m108594g(x0Var, "reference");
        C87412m.m108594g(w0Var, "data");
        synchronized (this.f172787d) {
            this.f172796m.put(x0Var, w0Var);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: k */
    public C24726w0 mo51638k(C24727x0 x0Var) {
        C24726w0 remove;
        C87412m.m108594g(x0Var, "reference");
        synchronized (this.f172787d) {
            remove = this.f172796m.remove(x0Var);
        }
        return remove;
    }

    /* renamed from: l */
    public void mo51639l(Set<C111061a> set) {
        C87412m.m108594g(set, "table");
    }

    /* renamed from: p */
    public void mo51643p(C60689y yVar) {
        C87412m.m108594g(yVar, "composition");
        synchronized (this.f172787d) {
            this.f172790g.remove(yVar);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: t */
    public final void mo85595t(C110838b bVar) {
        try {
            if (bVar.mo162429t() instanceof C110853i.C110854a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            bVar.mo162424c();
        }
    }

    /* renamed from: u */
    public final void mo85596u() {
        synchronized (this.f172787d) {
            if (((C60664c) ((C58052j1) this.f172798o).getValue()).compareTo(C60664c.Idle) >= 0) {
                ((C58052j1) this.f172798o).setValue(C60664c.ShuttingDown);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        C53973z1.C53974a.m60623a(this.f172785b, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: v */
    public final C53916l<C13598b0> mo85597v() {
        C60664c cVar;
        C60664c cVar2 = C60664c.PendingWork;
        if (this.f172798o.getValue().compareTo(C60664c.ShuttingDown) <= 0) {
            this.f172790g.clear();
            this.f172791h.clear();
            this.f172792i.clear();
            this.f172793j.clear();
            this.f172794k.clear();
            C53916l<? super C13598b0> lVar = this.f172797n;
            if (lVar != null) {
                C53916l.C53917a.m60514a(lVar, (Throwable) null, 1, (Object) null);
            }
            this.f172797n = null;
            return null;
        }
        if (this.f172788e == null) {
            this.f172791h.clear();
            this.f172792i.clear();
            cVar = this.f172784a.mo85592e() ? C60664c.InactivePendingWork : C60664c.Inactive;
        } else {
            cVar = ((this.f172792i.isEmpty() ^ true) || (this.f172791h.isEmpty() ^ true) || (this.f172793j.isEmpty() ^ true) || (this.f172794k.isEmpty() ^ true) || this.f172784a.mo85592e()) ? cVar2 : C60664c.Idle;
        }
        this.f172798o.setValue(cVar);
        if (cVar != cVar2) {
            return null;
        }
        C53916l<? super C13598b0> lVar2 = this.f172797n;
        this.f172797n = null;
        return lVar2;
    }

    /* renamed from: w */
    public final boolean mo85598w() {
        boolean z;
        synchronized (this.f172787d) {
            z = true;
            if (!(!this.f172791h.isEmpty()) && !(!this.f172792i.isEmpty()) && !this.f172784a.mo85592e()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: y */
    public final List<C60689y> mo85599y(List<C24727x0> list, C60926c<Object> cVar) {
        C110838b y;
        ArrayList arrayList;
        Object obj;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C24727x0 x0Var = list.get(i);
            C60689y yVar = x0Var.f70537c;
            Object obj2 = hashMap.get(yVar);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(yVar, obj2);
            }
            ((ArrayList) obj2).add(x0Var);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C60689y yVar2 = (C60689y) entry.getKey();
            List list2 = (List) entry.getValue();
            C24715p.m31030f(!yVar2.mo51672p());
            C60672o1 o1Var = new C60672o1(yVar2);
            C60681r1 r1Var = new C60681r1(yVar2, cVar);
            C110849h i2 = C110865n.m151146i();
            C110838b bVar = i2 instanceof C110838b ? (C110838b) i2 : null;
            if (bVar == null || (y = bVar.mo162430y(o1Var, r1Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            try {
                C110849h i3 = y.mo162465i();
                try {
                    synchronized (this.f172787d) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            C24727x0 x0Var2 = (C24727x0) list2.get(i4);
                            Map<C60687v0<Object>, List<C24727x0>> map = this.f172795l;
                            C60687v0<Object> v0Var = x0Var2.f70535a;
                            C87412m.m108594g(map, "<this>");
                            List list3 = (List) ((LinkedHashMap) map).get(v0Var);
                            if (list3 != null) {
                                Object u = C64175a0.m75513u(list3);
                                if (list3.isEmpty()) {
                                    map.remove(v0Var);
                                }
                                obj = u;
                            } else {
                                obj = null;
                            }
                            arrayList.add(new C13604l(x0Var2, obj));
                        }
                    }
                    yVar2.mo51670n(arrayList);
                    C13598b0 b0Var = C13598b0.f38549a;
                    y.mo162466o(i3);
                } catch (Throwable th) {
                    y.mo162466o(i3);
                    throw th;
                }
            } finally {
                mo85595t(y);
            }
        }
        return C110818d0.m150953y0(hashMap.keySet());
    }
}
