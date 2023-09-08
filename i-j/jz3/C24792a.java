package jz3;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mz3.C25055g;
import mz3.C25062n;
import mz3.C25064p;
import mz3.C25065q;
import mz3.C25070v;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C90363p0;
import vz3.C22830f;
import y04.C112354s;
import y04.C15925h;
import y04.C26620e;

/* renamed from: jz3.a */
public class C24792a implements C24794b {

    /* renamed from: a */
    public final C25055g f70704a;

    /* renamed from: b */
    public final C32226l<C25064p, Boolean> f70705b;

    /* renamed from: c */
    public final C32226l<C25065q, Boolean> f70706c;

    /* renamed from: d */
    public final Map<C22830f, List<C25065q>> f70707d;

    /* renamed from: e */
    public final Map<C22830f, C25062n> f70708e;

    /* renamed from: f */
    public final Map<C22830f, C25070v> f70709f;

    /* renamed from: jz3.a$a */
    public static final class C24793a extends C87413o implements C32226l<C25065q, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C24792a f70710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24793a(C24792a aVar) {
            super(1);
            this.f70710d = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
            if (r0.equals("hashCode") == false) goto L_0x009d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
            if (r0.equals("toString") != false) goto L_0x0094;
         */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00a5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                mz3.q r6 = (mz3.C25065q) r6
                java.lang.String r0 = "m"
                gy3.C87412m.m108594g(r6, r0)
                jz3.a r0 = r5.f70710d
                fy3.l<mz3.p, java.lang.Boolean> r0 = r0.f70705b
                java.lang.Object r0 = r0.invoke(r6)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x00a6
                mz3.g r0 = r6.mo51019F()
                boolean r0 = r0.mo51094w()
                if (r0 == 0) goto L_0x00a2
                vz3.f r0 = r6.getName()
                java.lang.String r0 = r0.mo35995b()
                int r3 = r0.hashCode()
                r4 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
                if (r3 == r4) goto L_0x008c
                r4 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
                if (r3 == r4) goto L_0x0048
                r4 = 147696667(0x8cdac1b, float:1.23784505E-33)
                if (r3 == r4) goto L_0x003f
                goto L_0x009d
            L_0x003f:
                java.lang.String r3 = "hashCode"
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x0094
                goto L_0x009d
            L_0x0048:
                java.lang.String r3 = "equals"
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x0051
                goto L_0x009d
            L_0x0051:
                java.util.List r6 = r6.mo51039h()
                java.lang.Object r6 = sx3.C110818d0.m150940l0(r6)
                mz3.z r6 = (mz3.C25074z) r6
                r0 = 0
                if (r6 == 0) goto L_0x0063
                mz3.w r6 = r6.getType()
                goto L_0x0064
            L_0x0063:
                r6 = r0
            L_0x0064:
                boolean r3 = r6 instanceof mz3.C25058j
                if (r3 == 0) goto L_0x006b
                r0 = r6
                mz3.j r0 = (mz3.C25058j) r0
            L_0x006b:
                if (r0 != 0) goto L_0x006e
                goto L_0x009d
            L_0x006e:
                mz3.i r6 = r0.mo51101j()
                boolean r0 = r6 instanceof mz3.C25055g
                if (r0 == 0) goto L_0x009d
                mz3.g r6 = (mz3.C25055g) r6
                vz3.c r6 = r6.mo51084d()
                if (r6 == 0) goto L_0x009d
                java.lang.String r6 = r6.mo35973b()
                java.lang.String r0 = "java.lang.Object"
                boolean r6 = gy3.C87412m.m108589b(r6, r0)
                if (r6 == 0) goto L_0x009d
                r6 = 1
                goto L_0x009e
            L_0x008c:
                java.lang.String r3 = "toString"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x009d
            L_0x0094:
                java.util.List r6 = r6.mo51039h()
                boolean r6 = r6.isEmpty()
                goto L_0x009e
            L_0x009d:
                r6 = 0
            L_0x009e:
                if (r6 == 0) goto L_0x00a2
                r6 = 1
                goto L_0x00a3
            L_0x00a2:
                r6 = 0
            L_0x00a3:
                if (r6 != 0) goto L_0x00a6
                r1 = 1
            L_0x00a6:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jz3.C24792a.C24793a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C24792a(C25055g gVar, C32226l<? super C25064p, Boolean> lVar) {
        C87412m.m108594g(gVar, "jClass");
        C87412m.m108594g(lVar, "memberFilter");
        this.f70704a = gVar;
        this.f70705b = lVar;
        C24793a aVar = new C24793a(this);
        this.f70706c = aVar;
        C15925h<T> h = C112354s.m153285h(C110818d0.m150897A(gVar.mo51090t()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C26620e.C26621a aVar2 = new C26620e.C26621a((C26620e) h);
        while (aVar2.hasNext()) {
            Object next = aVar2.next();
            C22830f name = ((C25065q) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f70707d = linkedHashMap;
        C15925h<T> h2 = C112354s.m153285h(C110818d0.m150897A(this.f70704a.mo51082K()), this.f70705b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C26620e.C26621a aVar3 = new C26620e.C26621a((C26620e) h2);
        while (aVar3.hasNext()) {
            Object next2 = aVar3.next();
            linkedHashMap2.put(((C25062n) next2).getName(), next2);
        }
        this.f70708e = linkedHashMap2;
        Collection<C25070v> G = this.f70704a.mo51079G();
        C32226l<C25064p, Boolean> lVar2 = this.f70705b;
        ArrayList arrayList = new ArrayList();
        for (T next3 : G) {
            if (lVar2.invoke(next3).booleanValue()) {
                arrayList.add(next3);
            }
        }
        int a = C90363p0.m113142a(C36907w.m41090l(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(a < 16 ? 16 : a);
        for (Object next4 : arrayList) {
            linkedHashMap3.put(((C25070v) next4).getName(), next4);
        }
        this.f70709f = linkedHashMap3;
    }

    /* renamed from: a */
    public Set<C22830f> mo51776a() {
        C15925h<T> h = C112354s.m153285h(C110818d0.m150897A(this.f70704a.mo51090t()), this.f70706c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C26620e.C26621a aVar = new C26620e.C26621a((C26620e) h);
        while (aVar.hasNext()) {
            linkedHashSet.add(((C25065q) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public C25062n mo51777b(C22830f fVar) {
        C87412m.m108594g(fVar, "name");
        return (C25062n) ((LinkedHashMap) this.f70708e).get(fVar);
    }

    /* renamed from: c */
    public Collection<C25065q> mo51778c(C22830f fVar) {
        C87412m.m108594g(fVar, "name");
        List list = (List) ((LinkedHashMap) this.f70707d).get(fVar);
        return list != null ? list : C64186f0.f181907d;
    }

    /* renamed from: d */
    public Set<C22830f> mo51779d() {
        return ((LinkedHashMap) this.f70709f).keySet();
    }

    /* renamed from: e */
    public Set<C22830f> mo51780e() {
        C15925h<T> h = C112354s.m153285h(C110818d0.m150897A(this.f70704a.mo51082K()), this.f70705b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C26620e.C26621a aVar = new C26620e.C26621a((C26620e) h);
        while (aVar.hasNext()) {
            linkedHashSet.add(((C25062n) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    /* renamed from: f */
    public C25070v mo51781f(C22830f fVar) {
        C87412m.m108594g(fVar, "name");
        return (C25070v) ((LinkedHashMap) this.f70709f).get(fVar);
    }
}
