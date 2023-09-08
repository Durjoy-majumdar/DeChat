package vy3;

import e04.C20506e;
import gy3.C87412m;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import sx3.C64197v;
import ty3.C22554c;
import ty3.C22558j;
import ty3.C26343l;
import uy3.C26371c;
import vz3.C22826c;
import vz3.C22827d;
import vz3.C22829e;
import vz3.C22830f;
import vz3.C26408b;
import vz3.C26409h;
import vz3.C26410i;
import z04.C112550d0;
import z04.C66731x;

/* renamed from: vy3.c */
public final class C26384c {

    /* renamed from: a */
    public static final C26384c f73585a;

    /* renamed from: b */
    public static final String f73586b;

    /* renamed from: c */
    public static final String f73587c;

    /* renamed from: d */
    public static final String f73588d;

    /* renamed from: e */
    public static final String f73589e;

    /* renamed from: f */
    public static final C26408b f73590f;

    /* renamed from: g */
    public static final C22826c f73591g;

    /* renamed from: h */
    public static final C26408b f73592h = C26410i.f73668o;

    /* renamed from: i */
    public static final HashMap<C22827d, C26408b> f73593i = new HashMap<>();

    /* renamed from: j */
    public static final HashMap<C22827d, C26408b> f73594j = new HashMap<>();

    /* renamed from: k */
    public static final HashMap<C22827d, C22826c> f73595k = new HashMap<>();

    /* renamed from: l */
    public static final HashMap<C22827d, C22826c> f73596l = new HashMap<>();

    /* renamed from: m */
    public static final HashMap<C26408b, C26408b> f73597m = new HashMap<>();

    /* renamed from: n */
    public static final HashMap<C26408b, C26408b> f73598n = new HashMap<>();

    /* renamed from: o */
    public static final List<C26385a> f73599o;

    /* renamed from: vy3.c$a */
    public static final class C26385a {

        /* renamed from: a */
        public final C26408b f73600a;

        /* renamed from: b */
        public final C26408b f73601b;

        /* renamed from: c */
        public final C26408b f73602c;

        public C26385a(C26408b bVar, C26408b bVar2, C26408b bVar3) {
            C87412m.m108594g(bVar, "javaClass");
            C87412m.m108594g(bVar2, "kotlinReadOnly");
            C87412m.m108594g(bVar3, "kotlinMutable");
            this.f73600a = bVar;
            this.f73601b = bVar2;
            this.f73602c = bVar3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26385a)) {
                return false;
            }
            C26385a aVar = (C26385a) obj;
            return C87412m.m108589b(this.f73600a, aVar.f73600a) && C87412m.m108589b(this.f73601b, aVar.f73601b) && C87412m.m108589b(this.f73602c, aVar.f73602c);
        }

        public int hashCode() {
            return (((this.f73600a.hashCode() * 31) + this.f73601b.hashCode()) * 31) + this.f73602c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f73600a + ", kotlinReadOnly=" + this.f73601b + ", kotlinMutable=" + this.f73602c + ')';
        }
    }

    static {
        C26384c cVar = new C26384c();
        f73585a = cVar;
        StringBuilder sb = new StringBuilder();
        C26371c cVar2 = C26371c.Function;
        sb.append(cVar2.f73571d.toString());
        sb.append('.');
        sb.append(cVar2.f73572e);
        f73586b = sb.toString();
        StringBuilder sb4 = new StringBuilder();
        C26371c cVar3 = C26371c.KFunction;
        sb4.append(cVar3.f73571d.toString());
        sb4.append('.');
        sb4.append(cVar3.f73572e);
        f73587c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        C26371c cVar4 = C26371c.SuspendFunction;
        sb5.append(cVar4.f73571d.toString());
        sb5.append('.');
        sb5.append(cVar4.f73572e);
        f73588d = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        C26371c cVar5 = C26371c.KSuspendFunction;
        sb6.append(cVar5.f73571d.toString());
        sb6.append('.');
        sb6.append(cVar5.f73572e);
        f73589e = sb6.toString();
        C26408b l = C26408b.m33992l(new C22826c("kotlin.jvm.functions.FunctionN"));
        f73590f = l;
        C22826c b = l.mo53387b();
        C87412m.m108593f(b, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f73591g = b;
        cVar.mo53371d(Class.class);
        C26408b l2 = C26408b.m33992l(C26343l.C26344a.f73382B);
        C22826c cVar6 = C26343l.C26344a.f73390J;
        C22826c h = l2.mo53392h();
        C22826c h2 = l2.mo53392h();
        C87412m.m108593f(h2, "kotlinReadOnly.packageFqName");
        C22826c a = C22829e.m26791a(cVar6, h2);
        C26408b bVar = new C26408b(h, a, false);
        C26408b l3 = C26408b.m33992l(C26343l.C26344a.f73381A);
        C22826c cVar7 = C26343l.C26344a.f73389I;
        C22826c h3 = l3.mo53392h();
        C22826c h4 = l3.mo53392h();
        C87412m.m108593f(h4, "kotlinReadOnly.packageFqName");
        C26408b bVar2 = new C26408b(h3, C22829e.m26791a(cVar7, h4), false);
        C26408b l4 = C26408b.m33992l(C26343l.C26344a.f73383C);
        C22826c cVar8 = C26343l.C26344a.f73391K;
        C22826c h5 = l4.mo53392h();
        C22826c h6 = l4.mo53392h();
        C87412m.m108593f(h6, "kotlinReadOnly.packageFqName");
        C26408b bVar3 = new C26408b(h5, C22829e.m26791a(cVar8, h6), false);
        C26408b l5 = C26408b.m33992l(C26343l.C26344a.f73384D);
        C22826c cVar9 = C26343l.C26344a.f73392L;
        C22826c h7 = l5.mo53392h();
        C22826c h8 = l5.mo53392h();
        C87412m.m108593f(h8, "kotlinReadOnly.packageFqName");
        C26408b bVar4 = new C26408b(h7, C22829e.m26791a(cVar9, h8), false);
        C26408b l6 = C26408b.m33992l(C26343l.C26344a.f73386F);
        C22826c cVar10 = C26343l.C26344a.f73394N;
        C22826c h9 = l6.mo53392h();
        C22826c h15 = l6.mo53392h();
        C87412m.m108593f(h15, "kotlinReadOnly.packageFqName");
        C26408b bVar5 = new C26408b(h9, C22829e.m26791a(cVar10, h15), false);
        C26408b l7 = C26408b.m33992l(C26343l.C26344a.f73385E);
        C22826c cVar11 = C26343l.C26344a.f73393M;
        C22826c h16 = l7.mo53392h();
        C22826c h17 = l7.mo53392h();
        C87412m.m108593f(h17, "kotlinReadOnly.packageFqName");
        C26408b bVar6 = new C26408b(h16, C22829e.m26791a(cVar11, h17), false);
        C22826c cVar12 = C26343l.C26344a.f73387G;
        C26408b l8 = C26408b.m33992l(cVar12);
        C22826c cVar13 = C26343l.C26344a.f73395O;
        C22826c h18 = l8.mo53392h();
        C22826c h19 = l8.mo53392h();
        C87412m.m108593f(h19, "kotlinReadOnly.packageFqName");
        C26408b bVar7 = new C26408b(h18, C22829e.m26791a(cVar13, h19), false);
        C26408b d = C26408b.m33992l(cVar12).mo53389d(C26343l.C26344a.f73388H.mo35978f());
        C22826c cVar14 = C26343l.C26344a.f73396P;
        C22826c h25 = d.mo53392h();
        C22826c h26 = d.mo53392h();
        C87412m.m108593f(h26, "kotlinReadOnly.packageFqName");
        List<C26385a> f = C64197v.m75537f(new C26385a(cVar.mo53371d(Iterable.class), l2, bVar), new C26385a(cVar.mo53371d(Iterator.class), l3, bVar2), new C26385a(cVar.mo53371d(Collection.class), l4, bVar3), new C26385a(cVar.mo53371d(List.class), l5, bVar4), new C26385a(cVar.mo53371d(Set.class), l6, bVar5), new C26385a(cVar.mo53371d(ListIterator.class), l7, bVar6), new C26385a(cVar.mo53371d(Map.class), l8, bVar7), new C26385a(cVar.mo53371d(Map.Entry.class), d, new C26408b(h25, C22829e.m26791a(cVar14, h26), false)));
        f73599o = f;
        cVar.mo53370c(Object.class, C26343l.C26344a.f73409b);
        cVar.mo53370c(String.class, C26343l.C26344a.f73417g);
        cVar.mo53370c(CharSequence.class, C26343l.C26344a.f73416f);
        cVar.mo53368a(cVar.mo53371d(Throwable.class), C26408b.m33992l(C26343l.C26344a.f73422l));
        cVar.mo53370c(Cloneable.class, C26343l.C26344a.f73413d);
        cVar.mo53370c(Number.class, C26343l.C26344a.f73420j);
        cVar.mo53368a(cVar.mo53371d(Comparable.class), C26408b.m33992l(C26343l.C26344a.f73423m));
        cVar.mo53370c(Enum.class, C26343l.C26344a.f73421k);
        cVar.mo53368a(cVar.mo53371d(Annotation.class), C26408b.m33992l(C26343l.C26344a.f73430t));
        for (C26385a next : f) {
            C26384c cVar15 = f73585a;
            C26408b bVar8 = next.f73600a;
            C26408b bVar9 = next.f73601b;
            C26408b bVar10 = next.f73602c;
            cVar15.mo53368a(bVar8, bVar9);
            C22826c b2 = bVar10.mo53387b();
            C87412m.m108593f(b2, "mutableClassId.asSingleFqName()");
            cVar15.mo53369b(b2, bVar8);
            f73597m.put(bVar10, bVar9);
            f73598n.put(bVar9, bVar10);
            C22826c b3 = bVar9.mo53387b();
            C87412m.m108593f(b3, "readOnlyClassId.asSingleFqName()");
            C22826c b4 = bVar10.mo53387b();
            C87412m.m108593f(b4, "mutableClassId.asSingleFqName()");
            HashMap<C22827d, C22826c> hashMap = f73595k;
            C22827d i = bVar10.mo53387b().mo35982i();
            C87412m.m108593f(i, "mutableClassId.asSingleFqName().toUnsafe()");
            hashMap.put(i, b3);
            HashMap<C22827d, C22826c> hashMap2 = f73596l;
            C22827d i2 = b3.mo35982i();
            C87412m.m108593f(i2, "readOnlyFqName.toUnsafe()");
            hashMap2.put(i2, b4);
        }
        for (C20506e eVar : C20506e.values()) {
            C26384c cVar16 = f73585a;
            C26408b l9 = C26408b.m33992l(eVar.mo32071f());
            C22558j e = eVar.mo32070e();
            C87412m.m108593f(e, "jvmType.primitiveType");
            cVar16.mo53368a(l9, C26408b.m33992l(C26343l.f73376j.mo35974c(e.f64883d)));
        }
        for (C26408b next2 : C22554c.f64866b) {
            f73585a.mo53368a(C26408b.m33992l(new C22826c("kotlin.jvm.internal." + next2.mo53395j().mo35995b() + "CompanionObject")), next2.mo53389d(C26409h.f73648b));
        }
        for (int i3 = 0; i3 < 23; i3++) {
            C26384c cVar17 = f73585a;
            cVar17.mo53368a(C26408b.m33992l(new C22826c("kotlin.jvm.functions.Function" + i3)), new C26408b(C26343l.f73376j, C22830f.m26794f("Function" + i3)));
            cVar17.mo53369b(new C22826c(f73587c + i3), f73592h);
        }
        for (int i4 = 0; i4 < 22; i4++) {
            C26371c cVar18 = C26371c.KSuspendFunction;
            f73585a.mo53369b(new C22826c((cVar18.f73571d.toString() + '.' + cVar18.f73572e) + i4), f73592h);
        }
        C26384c cVar19 = f73585a;
        C22826c i5 = C26343l.C26344a.f73411c.mo35993i();
        C87412m.m108593f(i5, "nothing.toSafe()");
        cVar19.mo53369b(i5, cVar19.mo53371d(Void.class));
    }

    /* renamed from: a */
    public final void mo53368a(C26408b bVar, C26408b bVar2) {
        HashMap<C22827d, C26408b> hashMap = f73593i;
        C22827d i = bVar.mo53387b().mo35982i();
        C87412m.m108593f(i, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(i, bVar2);
        C22826c b = bVar2.mo53387b();
        C87412m.m108593f(b, "kotlinClassId.asSingleFqName()");
        mo53369b(b, bVar);
    }

    /* renamed from: b */
    public final void mo53369b(C22826c cVar, C26408b bVar) {
        HashMap<C22827d, C26408b> hashMap = f73594j;
        C22827d i = cVar.mo35982i();
        C87412m.m108593f(i, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(i, bVar);
    }

    /* renamed from: c */
    public final void mo53370c(Class<?> cls, C22827d dVar) {
        C22826c i = dVar.mo35993i();
        C87412m.m108593f(i, "kotlinFqName.toSafe()");
        mo53368a(mo53371d(cls), C26408b.m33992l(i));
    }

    /* renamed from: d */
    public final C26408b mo53371d(Class<?> cls) {
        if (!cls.isPrimitive()) {
            boolean isArray = cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? C26408b.m33992l(new C22826c(cls.getCanonicalName())) : mo53371d(declaringClass).mo53389d(C22830f.m26794f(cls.getSimpleName()));
    }

    /* renamed from: e */
    public final boolean mo53372e(C22827d dVar, String str) {
        Integer e;
        String b = dVar.mo35984b();
        C87412m.m108593f(b, "kotlinFqName.asString()");
        String a0 = C112550d0.m153791a0(b, str, "");
        return (a0.length() > 0) && !C112550d0.m153787W(a0, '0', false, 2, (Object) null) && (e = C66731x.m78731e(a0)) != null && e.intValue() >= 23;
    }

    /* renamed from: f */
    public final C26408b mo53373f(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        return f73593i.get(cVar.mo35982i());
    }

    /* renamed from: g */
    public final C26408b mo53374g(C22827d dVar) {
        C87412m.m108594g(dVar, "kotlinFqName");
        return mo53372e(dVar, f73586b) ? f73590f : mo53372e(dVar, f73588d) ? f73590f : mo53372e(dVar, f73587c) ? f73592h : mo53372e(dVar, f73589e) ? f73592h : f73594j.get(dVar);
    }
}
