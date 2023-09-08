package r14;

import gy3.C8480h;
import gy3.C87412m;
import l14.C24950a;
import n14.C25217e;
import p14.C25420a0;
import q14.C110346e;
import q14.C25537a;
import q14.C25539c;
import q14.C25541i;
import q14.C25542j;
import q14.C25544m;
import s14.C26160b;

/* renamed from: r14.a */
public abstract class C26095a extends C25420a0 implements C25539c {

    /* renamed from: d */
    public final C26096c f72935d;

    /* renamed from: e */
    public final C25537a f72936e;

    public C26095a(C25537a aVar, C110346e eVar, C8480h hVar) {
        super((String) null, 1, (C8480h) null);
        this.f72936e = aVar;
        this.f72935d = aVar.f72231a;
    }

    /* renamed from: D */
    public abstract C110346e mo52948D(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = mo52948D(r0);
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q14.C110346e mo52949E() {
        /*
            r1 = this;
            java.util.ArrayList<Tag> r0 = r1.f72048a
            java.lang.Object r0 = sx3.C110818d0.m150925W(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0011
            q14.e r0 = r1.mo52948D(r0)
            if (r0 == 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            q14.e r0 = r1.mo52950F()
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r14.C26095a.mo52949E():q14.e");
    }

    /* renamed from: F */
    public abstract C110346e mo52950F();

    /* renamed from: G */
    public C25544m mo52951G(String str) {
        C87412m.m108594g(str, "tag");
        C110346e D = mo52948D(str);
        C25544m mVar = (C25544m) (!(D instanceof C25544m) ? null : D);
        if (mVar != null) {
            return mVar;
        }
        throw C25541i.m33035c(-1, "Expected JsonPrimitive at " + str + ", found " + D, mo52949E().toString());
    }

    /* renamed from: a */
    public void mo52508a(C25217e eVar) {
        C87412m.m108594g(eVar, "descriptor");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: r14.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: r14.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: r14.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: r14.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: r14.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: r14.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: r14.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o14.C25346c mo52515b(n14.C25217e r15) {
        /*
            r14 = this;
            java.lang.String r0 = "descriptor"
            gy3.C87412m.m108594g(r15, r0)
            q14.e r0 = r14.mo52949E()
            n14.i r1 = r15.mo52323f()
            n14.j$b r2 = n14.C25226j.C25228b.f71697a
            boolean r2 = gy3.C87412m.m108589b(r1, r2)
            java.lang.String r3 = ", but had "
            java.lang.String r4 = " as the serialized body of "
            java.lang.String r5 = "Expected "
            r6 = -1
            if (r2 == 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            boolean r2 = r1 instanceof n14.C25205c
            if (r2 == 0) goto L_0x0063
        L_0x0021:
            r14.h r1 = new r14.h
            q14.a r2 = r14.f72936e
            boolean r7 = r0 instanceof q14.C110345b
            if (r7 == 0) goto L_0x0030
            q14.b r0 = (q14.C110345b) r0
            r1.<init>(r2, r0)
            goto L_0x0125
        L_0x0030:
            q14.d r1 = new q14.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.Class<q14.b> r5 = q14.C110345b.class
            ny3.d r5 = gy3.C24560g0.m30725a(r5)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r15 = r15.mo52328j()
            r2.append(r15)
            r2.append(r3)
            java.lang.Class r15 = r0.getClass()
            ny3.d r15 = gy3.C24560g0.m30725a(r15)
            r2.append(r15)
            java.lang.String r15 = r2.toString()
            r1.<init>(r6, r15)
            throw r1
        L_0x0063:
            n14.j$c r2 = n14.C25226j.C25229c.f71698a
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 == 0) goto L_0x0111
            q14.a r1 = r14.f72936e
            r2 = 0
            n14.e r2 = r15.mo52330l(r2)
            n14.i r7 = r2.mo52323f()
            boolean r8 = r7 instanceof n14.C25207d
            if (r8 != 0) goto L_0x00d0
            n14.i$b r8 = n14.C25223i.C25225b.f71695a
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 == 0) goto L_0x0083
            goto L_0x00d0
        L_0x0083:
            r14.c r1 = r1.f72231a
            boolean r1 = r1.f72940d
            if (r1 == 0) goto L_0x00cb
            r14.h r1 = new r14.h
            q14.a r2 = r14.f72936e
            boolean r7 = r0 instanceof q14.C110345b
            if (r7 == 0) goto L_0x0098
            q14.b r0 = (q14.C110345b) r0
            r1.<init>(r2, r0)
            goto L_0x0125
        L_0x0098:
            q14.d r1 = new q14.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.Class<q14.b> r5 = q14.C110345b.class
            ny3.d r5 = gy3.C24560g0.m30725a(r5)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r15 = r15.mo52328j()
            r2.append(r15)
            r2.append(r3)
            java.lang.Class r15 = r0.getClass()
            ny3.d r15 = gy3.C24560g0.m30725a(r15)
            r2.append(r15)
            java.lang.String r15 = r2.toString()
            r1.<init>(r6, r15)
            throw r1
        L_0x00cb:
            q14.g r15 = q14.C25541i.m33034b(r2)
            throw r15
        L_0x00d0:
            r14.i r1 = new r14.i
            q14.a r2 = r14.f72936e
            boolean r7 = r0 instanceof q14.C110347l
            if (r7 == 0) goto L_0x00de
            q14.l r0 = (q14.C110347l) r0
            r1.<init>(r2, r0)
            goto L_0x0125
        L_0x00de:
            q14.d r1 = new q14.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.Class<q14.l> r5 = q14.C110347l.class
            ny3.d r5 = gy3.C24560g0.m30725a(r5)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r15 = r15.mo52328j()
            r2.append(r15)
            r2.append(r3)
            java.lang.Class r15 = r0.getClass()
            ny3.d r15 = gy3.C24560g0.m30725a(r15)
            r2.append(r15)
            java.lang.String r15 = r2.toString()
            r1.<init>(r6, r15)
            throw r1
        L_0x0111:
            r14.g r1 = new r14.g
            q14.a r8 = r14.f72936e
            boolean r2 = r0 instanceof q14.C110347l
            if (r2 == 0) goto L_0x0126
            r9 = r0
            q14.l r9 = (q14.C110347l) r9
            r10 = 0
            r11 = 0
            r12 = 12
            r13 = 0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0125:
            return r1
        L_0x0126:
            q14.d r1 = new q14.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.Class<q14.l> r5 = q14.C110347l.class
            ny3.d r5 = gy3.C24560g0.m30725a(r5)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r15 = r15.mo52328j()
            r2.append(r15)
            r2.append(r3)
            java.lang.Class r15 = r0.getClass()
            ny3.d r15 = gy3.C24560g0.m30725a(r15)
            r2.append(r15)
            java.lang.String r15 = r2.toString()
            r1.<init>(r6, r15)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r14.C26095a.mo52515b(n14.e):o14.c");
    }

    /* renamed from: c */
    public C26160b mo52509c() {
        return this.f72936e.f72231a.f72947k;
    }

    /* renamed from: h */
    public C110346e mo52777h() {
        return mo52949E();
    }

    /* renamed from: v */
    public <T> T mo52498v(C24950a<T> aVar) {
        C87412m.m108594g(aVar, "deserializer");
        return C26103j.m33474a(this, aVar);
    }

    /* renamed from: x */
    public C25537a mo52778x() {
        return this.f72936e;
    }

    /* renamed from: y */
    public int mo52675y(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "tag");
        try {
            return Integer.parseInt(mo52951G(str).mo52780f());
        } catch (Throwable unused) {
            throw C25541i.m33035c(-1, "Failed to parse 'int'", mo52949E().toString());
        }
    }

    /* renamed from: z */
    public String mo52676z(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "tag");
        C25544m G = mo52951G(str);
        if (this.f72936e.f72231a.f72939c || ((C25542j) G).f72233e) {
            return G.mo52780f();
        }
        throw C25541i.m33035c(-1, "String literal for key '" + str + "' should be quoted. Use 'JsonBuilder.isLenient = true' to accept non-compliant JSON", mo52949E().toString());
    }
}
