package sj2;

import a14.C0000n0;
import d14.C45252f;
import d14.C45253g;
import d14.C58095x0;
import fy3.C32227p;
import gy3.C8480h;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import pj2.C62324e;
import rx3.C13598b0;
import ux3.C65486b;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: sj2.f */
public abstract class C63924f implements C13683d {

    /* renamed from: b */
    public static final C63925a f181198b = new C63925a((C8480h) null);

    /* renamed from: c */
    public static final Map<Integer, C63924f> f181199c = new LinkedHashMap();

    /* renamed from: d */
    public static final Map<Integer, Integer> f181200d = new LinkedHashMap();

    /* renamed from: a */
    public final List<C62324e> f181201a = new ArrayList();

    /* renamed from: sj2.f$a */
    public static final class C63925a {
        public C63925a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C63924f mo88701a(int i) {
            if (i == 0) {
                return null;
            }
            Map<Integer, Integer> map = C63924f.f181200d;
            Integer num = (Integer) ((LinkedHashMap) map).get(Integer.valueOf(i));
            map.put(Integer.valueOf(i), Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            Map<Integer, C63924f> map2 = C63924f.f181199c;
            Integer valueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = i == 1 ? new C63935h() : new C63933g();
                linkedHashMap.put(valueOf, obj);
            }
            return (C63924f) obj;
        }
    }

    /* renamed from: sj2.f$b */
    public static final class C63926b<T> implements Comparator {

        /* renamed from: d */
        public final /* synthetic */ List f181202d;

        public C63926b(List list) {
            this.f181202d = list;
        }

        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(this.f181202d.indexOf((C62324e) t)), Integer.valueOf(this.f181202d.indexOf((C62324e) t2)));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.RingtoneDataLoader", mo125469f = "RingtoneDataLoader.kt", mo125470l = {73, 80}, mo125471m = "collectData")
    /* renamed from: sj2.f$c */
    public static final class C63927c extends C66704d {

        /* renamed from: d */
        public Object f181203d;

        /* renamed from: e */
        public Object f181204e;

        /* renamed from: f */
        public Object f181205f;

        /* renamed from: g */
        public /* synthetic */ Object f181206g;

        /* renamed from: h */
        public final /* synthetic */ C63924f f181207h;

        /* renamed from: i */
        public int f181208i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63927c(C63924f fVar, C15601d<? super C63927c> dVar) {
            super(dVar);
            this.f181207h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f181206g = obj;
            this.f181208i |= Integer.MIN_VALUE;
            return this.f181207h.mo88699b((List<C62324e>) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.RingtoneDataLoader$collectData$2", mo125469f = "RingtoneDataLoader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sj2.f$d */
    public static final class C63928d extends C91594j implements C32227p<C62324e, C15601d<? super C45252f<? extends C62324e>>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f181209d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.RingtoneDataLoader$collectData$2$1", mo125469f = "RingtoneDataLoader.kt", mo125470l = {51, 51}, mo125471m = "invokeSuspend")
        /* renamed from: sj2.f$d$a */
        public static final class C63929a extends C91594j implements C32227p<C45253g<? super C62324e>, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f181210d;

            /* renamed from: e */
            public /* synthetic */ Object f181211e;

            /* renamed from: f */
            public final /* synthetic */ C62324e f181212f;

            @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.RingtoneDataLoader$collectData$2$1$1", mo125469f = "RingtoneDataLoader.kt", mo125470l = {64}, mo125471m = "invokeSuspend")
            /* renamed from: sj2.f$d$a$a */
            public static final class C63930a extends C91594j implements C32227p<C0000n0, C15601d<? super C62324e>, Object> {

                /* renamed from: d */
                public int f181213d;

                /* renamed from: e */
                public final /* synthetic */ C62324e f181214e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C63930a(C62324e eVar, C15601d<? super C63930a> dVar) {
                    super(2, dVar);
                    this.f181214e = eVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C63930a(this.f181214e, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C63930a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                /* JADX WARNING: Removed duplicated region for block: B:36:0x007c A[RETURN] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r1 = r8.f181213d
                        r2 = 0
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L_0x0018
                        if (r1 != r4) goto L_0x0010
                        kotlin.ResultKt.throwOnFailure(r9)
                        goto L_0x007d
                    L_0x0010:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L_0x0018:
                        kotlin.ResultKt.throwOnFailure(r9)
                        pj2.e r9 = r8.f181214e
                        ve3.n0 r9 = r9.f177154d
                        boolean r1 = r9.f189024h
                        if (r1 != 0) goto L_0x00a1
                        int r1 = r9.f189023g
                        if (r1 != 0) goto L_0x00a1
                        int r1 = r9.f189020d
                        r5 = 2
                        if (r1 == r5) goto L_0x002e
                        goto L_0x00a1
                    L_0x002e:
                        ve3.g r1 = r9.f189022f
                        if (r1 != 0) goto L_0x0033
                        return r3
                    L_0x0033:
                        wj2.h$a r6 = wj2.C66135h.f190107E
                        wj2.f r1 = r6.mo90189e(r1, r9)
                        r1.f190083f = r9
                        java.lang.Class<ht1.t1> r9 = ht1.C60200t1.class
                        di3.d r9 = di3.C86312j.m106911c(r9)
                        ht1.t1 r9 = (ht1.C60200t1) r9
                        java.lang.String r6 = r1.f190088k
                        java.lang.String r7 = r1.mo90174e()
                        r9.aa0(r6, r3, r7)
                        rj2.b r9 = rj2.C63449b.f179967a
                        r8.f181213d = r4
                        ve3.n0 r6 = r1.f190083f
                        if (r6 == 0) goto L_0x005a
                        int r7 = r6.f189020d
                        if (r7 != r5) goto L_0x005a
                        r5 = 1
                        goto L_0x005b
                    L_0x005a:
                        r5 = 0
                    L_0x005b:
                        if (r5 == 0) goto L_0x006c
                        com.tencent.mm.protocal.protobuf.FinderObject r5 = r1.f190081d
                        if (r5 != 0) goto L_0x0079
                        java.lang.Object r9 = r9.mo88315b(r1, r8)
                        if (r9 != r0) goto L_0x0068
                        goto L_0x007a
                    L_0x0068:
                        r1 = r9
                        wj2.f r1 = (wj2.C66132f) r1
                        goto L_0x0079
                    L_0x006c:
                        if (r6 == 0) goto L_0x0074
                        int r9 = r6.f189020d
                        if (r9 != r4) goto L_0x0074
                        r9 = 1
                        goto L_0x0075
                    L_0x0074:
                        r9 = 0
                    L_0x0075:
                        if (r9 == 0) goto L_0x0078
                        goto L_0x0079
                    L_0x0078:
                        r1 = r3
                    L_0x0079:
                        r9 = r1
                    L_0x007a:
                        if (r9 != r0) goto L_0x007d
                        return r0
                    L_0x007d:
                        wj2.f r9 = (wj2.C66132f) r9
                        if (r9 == 0) goto L_0x009b
                        com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.f190081d
                        if (r9 == 0) goto L_0x009b
                        com.tencent.mm.protocal.protobuf.FinderObjectDesc r9 = r9.objectDesc
                        if (r9 == 0) goto L_0x009b
                        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r9 = r9.media
                        if (r9 == 0) goto L_0x009b
                        java.lang.Object r9 = sx3.C110818d0.m150916N(r9)
                        com.tencent.mm.protocal.protobuf.FinderMedia r9 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r9
                        if (r9 == 0) goto L_0x009b
                        int r9 = r9.mediaType
                        r0 = 4
                        if (r9 != r0) goto L_0x009b
                        r2 = 1
                    L_0x009b:
                        if (r2 != 0) goto L_0x009e
                        return r3
                    L_0x009e:
                        pj2.e r9 = r8.f181214e
                        return r9
                    L_0x00a1:
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: sj2.C63924f.C63928d.C63929a.C63930a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63929a(C62324e eVar, C15601d<? super C63929a> dVar) {
                super(2, dVar);
                this.f181212f = eVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C63929a aVar = new C63929a(this.f181212f, dVar);
                aVar.f181211e = obj;
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C63929a) create((C45253g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: d14.g} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r8.f181210d
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L_0x0021
                    if (r1 == r4) goto L_0x0019
                    if (r1 != r3) goto L_0x0011
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L_0x0048
                L_0x0011:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L_0x0019:
                    java.lang.Object r1 = r8.f181211e
                    d14.g r1 = (d14.C45253g) r1
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L_0x003d
                L_0x0021:
                    kotlin.ResultKt.throwOnFailure(r9)
                    java.lang.Object r9 = r8.f181211e
                    r1 = r9
                    d14.g r1 = (d14.C45253g) r1
                    r5 = 5000(0x1388, double:2.4703E-320)
                    sj2.f$d$a$a r9 = new sj2.f$d$a$a
                    pj2.e r7 = r8.f181212f
                    r9.<init>(r7, r2)
                    r8.f181211e = r1
                    r8.f181210d = r4
                    java.lang.Object r9 = a14.C53860b3.m60375c(r5, r9, r8)
                    if (r9 != r0) goto L_0x003d
                    return r0
                L_0x003d:
                    r8.f181211e = r2
                    r8.f181210d = r3
                    java.lang.Object r9 = r1.emit(r9, r8)
                    if (r9 != r0) goto L_0x0048
                    return r0
                L_0x0048:
                    rx3.b0 r9 = rx3.C13598b0.f38549a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: sj2.C63924f.C63928d.C63929a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C63928d(C15601d<? super C63928d> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C63928d dVar2 = new C63928d(dVar);
            dVar2.f181209d = obj;
            return dVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63928d) create((C62324e) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return new C58095x0(new C63929a((C62324e) this.f181209d, (C15601d<? super C63929a>) null));
        }
    }

    /* renamed from: sj2.f$e */
    public static final class C63931e<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ List<C62324e> f181215d;

        public C63931e(List<C62324e> list) {
            this.f181215d = list;
        }

        public Object emit(Object obj, C15601d dVar) {
            C62324e eVar = (C62324e) obj;
            if (eVar != null) {
                this.f181215d.add(eVar);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.RingtoneDataLoader$collectData$5", mo125469f = "RingtoneDataLoader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sj2.f$f */
    public static final class C63932f extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C63924f f181216d;

        /* renamed from: e */
        public final /* synthetic */ List<C62324e> f181217e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63932f(C63924f fVar, List<C62324e> list, C15601d<? super C63932f> dVar) {
            super(2, dVar);
            this.f181216d = fVar;
            this.f181217e = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63932f(this.f181216d, this.f181217e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63932f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return Boolean.valueOf(((ArrayList) this.f181216d.f181201a).addAll(this.f181217e));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo88699b(java.util.List<pj2.C62324e> r9, wx3.C15601d<? super java.util.List<pj2.C62324e>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof sj2.C63924f.C63927c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            sj2.f$c r0 = (sj2.C63924f.C63927c) r0
            int r1 = r0.f181208i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f181208i = r1
            goto L_0x0018
        L_0x0013:
            sj2.f$c r0 = new sj2.f$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f181206g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f181208i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r9 = r0.f181203d
            java.util.List r9 = (java.util.List) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x009b
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            java.lang.Object r9 = r0.f181205f
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.f181204e
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r0.f181203d
            sj2.f r6 = (sj2.C63924f) r6
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0075
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            d14.i r2 = new d14.i
            r2.<init>(r9)
            r6 = 0
            sj2.f$d r7 = new sj2.f$d
            r7.<init>(r5)
            d14.f r2 = d14.C58042h.m67200i(r2, r6, r7, r4, r5)
            sj2.f$e r6 = new sj2.f$e
            r6.<init>(r10)
            r0.f181203d = r8
            r0.f181204e = r9
            r0.f181205f = r10
            r0.f181208i = r4
            java.lang.Object r2 = r2.mo31880a(r6, r0)
            if (r2 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r6 = r8
            r2 = r9
            r9 = r10
        L_0x0075:
            int r10 = r9.size()
            if (r10 <= r4) goto L_0x0083
            sj2.f$b r10 = new sj2.f$b
            r10.<init>(r2)
            sx3.C77813z.m93909o(r9, r10)
        L_0x0083:
            a14.h0 r10 = a14.C53872d1.f151117a
            a14.k2 r10 = f14.C58901s.f168555a
            sj2.f$f r2 = new sj2.f$f
            r2.<init>(r6, r9, r5)
            r0.f181203d = r9
            r0.f181204e = r5
            r0.f181205f = r5
            r0.f181208i = r3
            java.lang.Object r10 = a14.C53895h.m60469g(r10, r2, r0)
            if (r10 != r1) goto L_0x009b
            return r1
        L_0x009b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sj2.C63924f.mo88699b(java.util.List, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo88700c(int i) {
        Map<Integer, Integer> map = f181200d;
        Integer num = (Integer) ((LinkedHashMap) map).get(Integer.valueOf(i));
        int intValue = (num != null ? num.intValue() : 0) - 1;
        if (intValue == 0) {
            f181199c.remove(Integer.valueOf(i));
        }
        map.put(Integer.valueOf(i), Integer.valueOf(intValue));
    }
}
