package bl1;

import al1.C39612t;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p565ir.C60606n;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import te3.C49153dj;
import te3.C49712hj1;
import te3.C49727hn0;
import te3.C50195kz0;
import te3.C50317lw0;
import te3.C51977xi;
import te3.C52013xs0;
import ux3.C65486b;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: bl1.k */
public final class C39786k {

    /* renamed from: i */
    public static final C39788b f106760i = new C39788b((C8480h) null);

    /* renamed from: j */
    public static final List<Integer> f106761j = C64197v.m75537f(20057, 20034, 20035, 20002);

    /* renamed from: a */
    public final C45795b f106762a;

    /* renamed from: b */
    public final C39779f f106763b;

    /* renamed from: c */
    public C54219z<ConcurrentHashMap<String, C39807u>> f106764c = new C54219z<>(new ConcurrentHashMap());

    /* renamed from: d */
    public final ConcurrentHashMap<String, C39787a> f106765d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public C54219z<ConcurrentHashMap<String, C28333v>> f106766e = new C54219z<>(new ConcurrentHashMap());

    /* renamed from: f */
    public boolean f106767f = true;

    /* renamed from: g */
    public C39612t f106768g;

    /* renamed from: h */
    public C39612t f106769h;

    /* renamed from: bl1.k$a */
    public interface C39787a {
        /* renamed from: a */
        void mo62417a(C39790d dVar);

        /* renamed from: b */
        void mo62418b(C39790d dVar);

        /* renamed from: c */
        void mo62419c(C39790d dVar);
    }

    /* renamed from: bl1.k$b */
    public static final class C39788b {
        public C39788b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C39807u mo62420a(C51977xi xiVar) {
            Collection collection;
            String str;
            C87412m.m108594g(xiVar, "<this>");
            ArrayList arrayList = new ArrayList();
            LinkedList<C49153dj> linkedList = xiVar.f144667g;
            if (linkedList != null) {
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C49153dj djVar : linkedList) {
                    C39788b bVar = C39786k.f106760i;
                    C87412m.m108593f(djVar, LocaleUtil.ITALIAN);
                    C52013xs0 xs02 = djVar.f132361d;
                    C39775b b = xs02 != null ? bVar.mo62421b(xs02) : null;
                    if (b != null) {
                        b.f106733d = djVar.f132362e;
                    }
                    if (b != null) {
                        b.f106735f = djVar.f132363f;
                    }
                    if (b != null) {
                        b.f106736g = djVar.f132364g;
                    }
                    if (b != null) {
                        b.f106737h = djVar.f132365h;
                    }
                    arrayList2.add(b);
                }
                collection = C110818d0.m150912J(arrayList2);
            } else {
                collection = C64186f0.f181907d;
            }
            arrayList.addAll(collection);
            C50317lw0 lw02 = xiVar.f144664d;
            if (lw02 == null || (str = lw02.f137677e) == null) {
                str = "";
            }
            return new C39807u(str, arrayList, xiVar.f144668h, xiVar);
        }

        /* renamed from: b */
        public final C39775b mo62421b(C52013xs0 xs02) {
            C39775b bVar;
            C87412m.m108594g(xs02, "<this>");
            int i = xs02.f144903e;
            if (i != 20002) {
                if (i != 20032) {
                    if (i == 20057) {
                        bVar = new C39811z(false, xs02);
                    } else if (i != 20034) {
                        if (i != 20035) {
                            return null;
                        }
                        bVar = new C39808w(false, xs02);
                    }
                }
                bVar = new C39773a(false, xs02);
            } else {
                bVar = new C39809x(false, xs02);
            }
            return bVar;
        }
    }

    /* renamed from: bl1.k$c */
    public final class C39789c extends C39612t.C39615b<C49727hn0> {

        /* renamed from: a */
        public final C50317lw0 f106770a;

        /* renamed from: b */
        public final C51977xi f106771b;

        /* renamed from: c */
        public final C49712hj1 f106772c;

        /* renamed from: d */
        public final /* synthetic */ C39786k f106773d;

        public C39789c(C39786k kVar, C50317lw0 lw02, C51977xi xiVar, C49712hj1 hj12) {
            C87412m.m108594g(lw02, "boxId");
            C87412m.m108594g(xiVar, "boxContext");
            this.f106773d = kVar;
            this.f106770a = lw02;
            this.f106771b = xiVar;
            this.f106772c = hj12;
        }
    }

    /* renamed from: bl1.k$d */
    public static final class C39790d {

        /* renamed from: a */
        public final int f106774a;

        /* renamed from: b */
        public final int f106775b;

        /* renamed from: c */
        public final Object f106776c;

        public C39790d(String str, int i, int i2, Object obj) {
            C87412m.m108594g(str, "boxId");
            this.f106774a = i;
            this.f106775b = i2;
            this.f106776c = obj;
        }

        public String toString() {
            return "start:" + this.f106774a + ", count:" + this.f106775b + ", payload:" + this.f106776c;
        }
    }

    /* renamed from: bl1.k$e */
    public final class C39791e extends C39612t.C39613a<C50195kz0> {

        /* renamed from: a */
        public final C51977xi f106777a;

        /* renamed from: b */
        public final C49712hj1 f106778b;

        /* renamed from: c */
        public final /* synthetic */ C39786k f106779c;

        public C39791e(C39786k kVar, C51977xi xiVar, C49712hj1 hj12) {
            C87412m.m108594g(xiVar, "boxContext");
            this.f106779c = kVar;
            this.f106777a = xiVar;
            this.f106778b = hj12;
        }
    }

    /* renamed from: bl1.k$f */
    public static final class C39792f<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((C51977xi) t2).f144668h), Long.valueOf(((C51977xi) t).f144668h));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.box.BoxDataStore", mo125469f = "BoxDataStore.kt", mo125470l = {151}, mo125471m = "prepare")
    /* renamed from: bl1.k$g */
    public static final class C39793g extends C66704d {

        /* renamed from: d */
        public Object f106780d;

        /* renamed from: e */
        public /* synthetic */ Object f106781e;

        /* renamed from: f */
        public final /* synthetic */ C39786k f106782f;

        /* renamed from: g */
        public int f106783g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39793g(C39786k kVar, C15601d<? super C39793g> dVar) {
            super(dVar);
            this.f106782f = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f106781e = obj;
            this.f106783g |= Integer.MIN_VALUE;
            return this.f106782f.mo62414e((String) null, false, this);
        }
    }

    /* renamed from: bl1.k$h */
    public static final class C39794h extends C87413o implements C32226l<ConcurrentHashMap<String, C39807u>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C51977xi f106784d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39794h(C51977xi xiVar) {
            super(1);
            this.f106784d = xiVar;
        }

        public Object invoke(Object obj) {
            String str;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
            C87412m.m108594g(concurrentHashMap, "$this$safeSetValue");
            C50317lw0 lw02 = this.f106784d.f144664d;
            if (lw02 == null || (str = lw02.f137677e) == null) {
                str = "";
            }
            if ((str.length() > 0) && !((C60606n) C86312j.m106911c(C60606n.class)).mo85025Qf(str)) {
                concurrentHashMap.put(str, C39786k.f106760i.mo62420a(this.f106784d));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bl1.k$i */
    public static final class C39795i extends C87413o implements C32226l<ConcurrentHashMap<String, C39807u>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C51977xi f106785d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39795i(C51977xi xiVar) {
            super(1);
            this.f106785d = xiVar;
        }

        public Object invoke(Object obj) {
            String str;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
            C87412m.m108594g(concurrentHashMap, "$this$safeSetValue");
            C50317lw0 lw02 = this.f106785d.f144664d;
            if (lw02 == null || (str = lw02.f137677e) == null) {
                str = "";
            }
            if ((str.length() > 0) && !((C60606n) C86312j.m106911c(C60606n.class)).mo85025Qf(str)) {
                concurrentHashMap.put(str, C39786k.f106760i.mo62420a(this.f106785d));
            }
            return C13598b0.f38549a;
        }
    }

    public C39786k(C45795b bVar, C39779f fVar) {
        C87412m.m108594g(bVar, "liveBuContext");
        C87412m.m108594g(fVar, "bulletStore");
        this.f106762a = bVar;
        this.f106763b = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002b, code lost:
        r5 = r11.f144667g;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m42575a(bl1.C39786k r32, java.lang.String r33, java.util.List r34, te3.C51977xi r35, bl1.C39807u r36, bl1.C39786k.C39787a r37) {
        /*
            r0 = r32
            r1 = r33
            r2 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            r32.getClass()
            boolean r3 = r34.isEmpty()
            if (r3 == 0) goto L_0x0017
            goto L_0x01f9
        L_0x0017:
            java.util.ArrayList<bl1.b> r3 = r12.f106815b
            int r3 = r3.size()
            java.util.ArrayList<bl1.b> r4 = r12.f106815b
            r4.addAll(r2)
            java.util.ArrayList<bl1.b> r4 = r12.f106815b
            int r4 = r4.size()
            r14 = 0
            if (r11 == 0) goto L_0x0038
            java.util.LinkedList<te3.dj> r5 = r11.f144667g
            if (r5 == 0) goto L_0x0038
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0039
        L_0x0038:
            r5 = r14
        L_0x0039:
            if (r11 == 0) goto L_0x007b
            java.util.LinkedList<te3.dj> r6 = r11.f144667g
            if (r6 == 0) goto L_0x007b
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r2, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r34.iterator()
        L_0x004e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0078
            java.lang.Object r9 = r8.next()
            bl1.b r9 = (bl1.C39775b) r9
            java.lang.String r10 = "<this>"
            gy3.C87412m.m108594g(r9, r10)
            te3.dj r10 = new te3.dj
            r10.<init>()
            te3.xs0 r15 = r9.f106734e
            r10.f132361d = r15
            boolean r15 = r9.f106733d
            r10.f132362e = r15
            int r15 = r9.f106735f
            r10.f132363f = r15
            boolean r9 = r9.f106736g
            r10.f132364g = r9
            r7.add(r10)
            goto L_0x004e
        L_0x0078:
            r6.addAll(r7)
        L_0x007b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "addMsg beforeMemSize:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r15 = ", afterMemSize:"
            r6.append(r15)
            if (r11 == 0) goto L_0x009c
            java.util.LinkedList<te3.dj> r5 = r11.f144667g
            if (r5 == 0) goto L_0x009c
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x009d
        L_0x009c:
            r5 = r14
        L_0x009d:
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r10 = "str"
            gy3.C87412m.m108594g(r5, r10)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "memDataLog "
            r6.append(r9)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r8 = "Finder.BoxDataStore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            if (r13 == 0) goto L_0x00ce
            bl1.k$d r5 = new bl1.k$d
            java.lang.String r6 = r12.f106814a
            int r7 = r4 - r3
            r5.<init>(r6, r3, r7, r14)
            r13.mo62419c(r5)
        L_0x00ce:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r5 = "notifier add, "
            r7.append(r5)
            r7.append(r1)
            java.lang.String r5 = ", beforeSize:"
            r7.append(r5)
            r7.append(r3)
            java.lang.String r3 = ", afterSize:"
            r7.append(r3)
            r7.append(r4)
            java.lang.String r3 = ", \n"
            r7.append(r3)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r16 = 0
            bl1.o r17 = bl1.C39801o.f106807d
            r18 = 31
            r19 = 0
            r2 = r34
            r14 = r7
            r7 = r16
            r20 = r8
            r8 = r17
            r21 = r9
            r9 = r18
            r22 = r10
            r10 = r19
            java.lang.String r2 = sx3.C110818d0.m150921S(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.append(r2)
            java.lang.String r2 = r14.toString()
            r0.mo62411b(r2)
            java.util.ArrayList<bl1.b> r2 = r12.f106815b
            int r2 = r2.size()
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99238N1
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x01f9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r11 == 0) goto L_0x0149
            java.util.LinkedList<te3.dj> r4 = r11.f144667g
            if (r4 == 0) goto L_0x0149
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x014a
        L_0x0149:
            r4 = 0
        L_0x014a:
            r5 = 0
            r6 = 0
        L_0x014c:
            if (r6 >= r2) goto L_0x016a
            java.util.ArrayList<bl1.b> r7 = r12.f106815b
            java.lang.Object r7 = sx3.C64175a0.m75514v(r7)
            bl1.b r7 = (bl1.C39775b) r7
            if (r7 == 0) goto L_0x015b
            r3.add(r7)
        L_0x015b:
            if (r11 == 0) goto L_0x0167
            java.util.LinkedList<te3.dj> r7 = r11.f144667g
            if (r7 == 0) goto L_0x0167
            java.lang.Object r7 = sx3.C64175a0.m75514v(r7)
            te3.dj r7 = (te3.C49153dj) r7
        L_0x0167:
            int r6 = r6 + 1
            goto L_0x014c
        L_0x016a:
            if (r13 == 0) goto L_0x0178
            bl1.k$d r6 = new bl1.k$d
            java.lang.String r7 = r12.f106814a
            r8 = 0
            r6.<init>(r7, r5, r2, r8)
            r13.mo62417a(r6)
            goto L_0x0179
        L_0x0178:
            r8 = 0
        L_0x0179:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "notifier remove, "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = ", remove size:"
            r2.append(r1)
            int r1 = r3.size()
            r2.append(r1)
            java.lang.String r1 = ", \n "
            r2.append(r1)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            bl1.p r29 = bl1.C39802p.f106808d
            r30 = 31
            r31 = 0
            r23 = r3
            java.lang.String r1 = sx3.C110818d0.m150921S(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.mo62411b(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "addMsg removeBeforeMemSize:"
            r0.append(r1)
            r0.append(r4)
            r0.append(r15)
            if (r11 == 0) goto L_0x01d6
            java.util.LinkedList<te3.dj> r1 = r11.f144667g
            if (r1 == 0) goto L_0x01d6
            int r1 = r1.size()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            goto L_0x01d7
        L_0x01d6:
            r14 = r8
        L_0x01d7:
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r1 = r22
            gy3.C87412m.m108594g(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r21
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x01f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bl1.C39786k.m42575a(bl1.k, java.lang.String, java.util.List, te3.xi, bl1.u, bl1.k$a):void");
    }

    /* renamed from: b */
    public final void mo62411b(String str) {
        Log.m105924i("Finder.BoxDataStore", "boxDebugLog, " + str);
    }

    /* renamed from: c */
    public final C39807u mo62412c() {
        ConcurrentHashMap value = this.f106764c.getValue();
        if (value == null) {
            return null;
        }
        Iterator it = value.entrySet().iterator();
        if (it.hasNext()) {
            return (C39807u) ((Map.Entry) it.next()).getValue();
        }
        return null;
    }

    /* renamed from: d */
    public final C39807u mo62413d(String str) {
        C87412m.m108594g(str, "boxId");
        ConcurrentHashMap value = this.f106764c.getValue();
        if (value != null) {
            return (C39807u) value.get(str);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        r11 = new java.util.ArrayList<>();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62414e(java.lang.String r9, boolean r10, wx3.C15601d<? super rx3.C13598b0> r11) {
        /*
            r8 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            boolean r1 = r11 instanceof bl1.C39786k.C39793g
            if (r1 == 0) goto L_0x0015
            r1 = r11
            bl1.k$g r1 = (bl1.C39786k.C39793g) r1
            int r2 = r1.f106783g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f106783g = r2
            goto L_0x001a
        L_0x0015:
            bl1.k$g r1 = new bl1.k$g
            r1.<init>(r8, r11)
        L_0x001a:
            r7 = r1
            java.lang.Object r11 = r7.f106781e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r7.f106783g
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r9 = r7.f106780d
            bl1.k r9 = (bl1.C39786k) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0106
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r11)
            androidx.lifecycle.z<java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.u>> r11 = r8.f106764c
            java.lang.Object r11 = r11.getValue()
            java.util.concurrent.ConcurrentHashMap r11 = (java.util.concurrent.ConcurrentHashMap) r11
            if (r11 == 0) goto L_0x0047
            r11.clear()
        L_0x0047:
            r11 = 0
            if (r9 == 0) goto L_0x0053
            int r2 = r9.length()
            if (r2 != 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r2 = 0
            goto L_0x0054
        L_0x0053:
            r2 = 1
        L_0x0054:
            if (r2 == 0) goto L_0x00de
            if (r10 == 0) goto L_0x00de
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            bl1.h r10 = bl1.C39780h.f106743a
            fj1.b r10 = r8.f106762a
            androidx.lifecycle.i0 r10 = r10.mo71262a(r0)
            cl1.u r10 = (cl1.C55001u) r10
            te3.c21 r10 = r10.f154420q
            long r10 = r10.f182392d
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.ArrayList<te3.xi>> r1 = bl1.C39780h.f106745c
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r11 = r1.get(r10)
            if (r11 != 0) goto L_0x0084
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.Object r10 = r1.putIfAbsent(r10, r11)
            if (r10 != 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r11 = r10
        L_0x0084:
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r9.addAll(r11)
            int r10 = r9.size()
            if (r10 <= r3) goto L_0x0097
            bl1.k$f r10 = new bl1.k$f
            r10.<init>()
            sx3.C77813z.m93909o(r9, r10)
        L_0x0097:
            java.lang.Object r9 = sx3.C110818d0.m150916N(r9)
            te3.xi r9 = (te3.C51977xi) r9
            if (r9 == 0) goto L_0x00b7
            androidx.lifecycle.z<java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.u>> r10 = r8.f106764c
            bl1.k$h r11 = new bl1.k$h
            r11.<init>(r9)
            if (r10 == 0) goto L_0x00b4
            java.lang.Object r9 = r10.getValue()
            if (r9 == 0) goto L_0x00b4
            r11.invoke(r9)
            r10.setValue(r9)
        L_0x00b4:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        L_0x00b7:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "prepare no exist recent box for liveId:"
            r9.append(r10)
            fj1.b r10 = r8.f106762a
            androidx.lifecycle.i0 r10 = r10.mo71262a(r0)
            cl1.u r10 = (cl1.C55001u) r10
            te3.c21 r10 = r10.f154420q
            long r10 = r10.f182392d
            java.lang.String r10 = o40.C61926c.m72691p(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "Finder.BoxDataStore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            goto L_0x0120
        L_0x00de:
            if (r9 == 0) goto L_0x00e6
            int r10 = r9.length()
            if (r10 != 0) goto L_0x00e7
        L_0x00e6:
            r11 = 1
        L_0x00e7:
            if (r11 != 0) goto L_0x0120
            bl1.h r2 = bl1.C39780h.f106743a
            fj1.b r10 = r8.f106762a
            androidx.lifecycle.i0 r10 = r10.mo71262a(r0)
            cl1.u r10 = (cl1.C55001u) r10
            te3.c21 r10 = r10.f154420q
            long r4 = r10.f182392d
            r7.f106780d = r8
            r7.f106783g = r3
            java.lang.String r3 = "prepare"
            r6 = r9
            java.lang.Object r11 = r2.mo62410a(r3, r4, r6, r7)
            if (r11 != r1) goto L_0x0105
            return r1
        L_0x0105:
            r9 = r8
        L_0x0106:
            te3.xi r11 = (te3.C51977xi) r11
            androidx.lifecycle.z<java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.u>> r9 = r9.f106764c
            bl1.k$i r10 = new bl1.k$i
            r10.<init>(r11)
            if (r9 == 0) goto L_0x011d
            java.lang.Object r11 = r9.getValue()
            if (r11 == 0) goto L_0x011d
            r10.invoke(r11)
            r9.setValue(r11)
        L_0x011d:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        L_0x0120:
            androidx.lifecycle.z<java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.u>> r9 = r8.f106764c
            if (r9 == 0) goto L_0x012d
            java.lang.Object r10 = r9.getValue()
            if (r10 == 0) goto L_0x012d
            r9.setValue(r10)
        L_0x012d:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bl1.C39786k.mo62414e(java.lang.String, boolean, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo62415f(java.lang.String r19, te3.C51977xi r20, bl1.C39807u r21, te3.C52013xs0 r22, bl1.C39786k.C39787a r23, boolean r24) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r24
            te3.iu0 r0 = new te3.iu0
            r0.<init>()
            r7 = r22
            pe3.b r7 = r7.f144906h
            if (r7 == 0) goto L_0x001c
            byte[] r7 = r7.mo123703f()
            goto L_0x001d
        L_0x001c:
            r7 = 0
        L_0x001d:
            r9 = 0
            r10 = 1
            if (r7 != 0) goto L_0x0023
        L_0x0021:
            r0 = 0
            goto L_0x0035
        L_0x0023:
            r0.parseFrom(r7)     // Catch:{ Exception -> 0x0027 }
            goto L_0x0035
        L_0x0027:
            r0 = move-exception
            r7 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            java.lang.String r7 = "safeParser"
            java.lang.String r11 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r11, r0)
            goto L_0x0021
        L_0x0035:
            if (r0 == 0) goto L_0x0285
            java.util.ArrayList<bl1.b> r7 = r4.f106815b
            java.util.Iterator r7 = r7.iterator()
            r11 = 0
        L_0x003e:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x005d
            java.lang.Object r12 = r7.next()
            bl1.b r12 = (bl1.C39775b) r12
            te3.xs0 r12 = r12.f106734e
            long r12 = r12.f144913r
            long r14 = r0.f135665d
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x0056
            r12 = 1
            goto L_0x0057
        L_0x0056:
            r12 = 0
        L_0x0057:
            if (r12 == 0) goto L_0x005a
            goto L_0x005e
        L_0x005a:
            int r11 = r11 + 1
            goto L_0x003e
        L_0x005d:
            r11 = -1
        L_0x005e:
            if (r11 < 0) goto L_0x0285
            java.util.ArrayList<bl1.b> r7 = r4.f106815b
            java.lang.Object r7 = sx3.C110818d0.m150917O(r7, r11)
            bl1.b r7 = (bl1.C39775b) r7
            if (r7 == 0) goto L_0x0285
            java.lang.String r12 = ", selfLike:"
            java.lang.String r13 = "update seq:"
            java.lang.String r14 = "localLikeLog "
            java.lang.String r15 = "str"
            java.lang.String r8 = "Finder.BoxDataStore"
            if (r6 == 0) goto L_0x00f7
            int r9 = r0.f135667f
            int r17 = ks3.C46739p.f125819a
            if (r9 != r10) goto L_0x0080
            r9 = 1
            goto L_0x0081
        L_0x0080:
            r9 = 0
        L_0x0081:
            r7.f106737h = r6
            boolean r10 = r7.f106736g
            if (r10 == r9) goto L_0x00c8
            r7.f106736g = r9
            int r10 = r0.f135668g
            r7.f106735f = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r13)
            te3.xs0 r13 = r7.f106734e
            long r4 = r13.f144913r
            r10.append(r4)
            r10.append(r12)
            r10.append(r9)
            java.lang.String r4 = ", likeCount:"
            r10.append(r4)
            int r4 = r7.f106735f
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            gy3.C87412m.m108594g(r4, r15)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r14)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            r4 = 0
            goto L_0x0182
        L_0x00c8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            te3.xs0 r2 = r7.f106734e
            long r2 = r2.f144913r
            r0.append(r2)
            java.lang.String r2 = ", duplicate"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            gy3.C87412m.m108594g(r0, r15)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r4 = 0
            return r4
        L_0x00f7:
            r4 = 0
            boolean r5 = r7.f106737h
            if (r5 == 0) goto L_0x0140
            boolean r5 = r7.f106736g
            boolean r9 = r0.f135670i
            if (r5 != r9) goto L_0x0103
            goto L_0x0140
        L_0x0103:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "ignore svr, because selfOp:"
            r5.append(r9)
            boolean r9 = r7.f106737h
            r5.append(r9)
            java.lang.String r9 = ", baseBoxMsg.selfLike:"
            r5.append(r9)
            boolean r9 = r7.f106736g
            r5.append(r9)
            java.lang.String r9 = ", payload.is_self_like:"
            r5.append(r9)
            boolean r9 = r0.f135670i
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            gy3.C87412m.m108594g(r5, r15)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r14)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            goto L_0x0182
        L_0x0140:
            int r5 = r0.f135668g
            r7.f106735f = r5
            boolean r5 = r0.f135670i
            r7.f106736g = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            te3.xs0 r9 = r7.f106734e
            long r9 = r9.f144913r
            r5.append(r9)
            java.lang.String r9 = ", svr, likeCount:"
            r5.append(r9)
            int r9 = r7.f106735f
            r5.append(r9)
            r5.append(r12)
            boolean r9 = r0.f135670i
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            gy3.C87412m.m108594g(r5, r15)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r14)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
        L_0x0182:
            boolean r5 = r7.f106736g
            if (r5 == 0) goto L_0x018d
            int r5 = r7.f106735f
            r9 = 1
            if (r5 >= r9) goto L_0x018d
            r7.f106735f = r9
        L_0x018d:
            if (r3 == 0) goto L_0x021b
            java.util.LinkedList<te3.dj> r3 = r3.f144667g
            if (r3 == 0) goto L_0x021b
            java.util.Iterator r3 = r3.iterator()
        L_0x0197:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01b8
            java.lang.Object r5 = r3.next()
            r9 = r5
            te3.dj r9 = (te3.C49153dj) r9
            te3.xs0 r9 = r9.f132361d
            if (r9 == 0) goto L_0x01b4
            te3.xs0 r10 = r7.f106734e
            long r13 = r10.f144913r
            long r9 = r9.f144913r
            int r16 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r16 != 0) goto L_0x01b4
            r9 = 1
            goto L_0x01b5
        L_0x01b4:
            r9 = 0
        L_0x01b5:
            if (r9 == 0) goto L_0x0197
            goto L_0x01b9
        L_0x01b8:
            r5 = 0
        L_0x01b9:
            te3.dj r5 = (te3.C49153dj) r5
            if (r5 == 0) goto L_0x021b
            int r3 = r7.f106735f
            r5.f132363f = r3
            boolean r3 = r7.f106736g
            r5.f132364g = r3
            if (r6 == 0) goto L_0x01ca
            r3 = 1
            r5.f132365h = r3
        L_0x01ca:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "updateLikeMsg seq:"
            r3.append(r4)
            te3.xs0 r4 = r5.f132361d
            if (r4 == 0) goto L_0x01e0
            long r9 = r4.f144913r
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            goto L_0x01e1
        L_0x01e0:
            r4 = 0
        L_0x01e1:
            r3.append(r4)
            java.lang.String r4 = " likeCount:"
            r3.append(r4)
            int r4 = r7.f106735f
            r3.append(r4)
            r3.append(r12)
            boolean r4 = r7.f106736g
            r3.append(r4)
            java.lang.String r4 = ", selfOp:"
            r3.append(r4)
            boolean r4 = r5.f132365h
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            gy3.C87412m.m108594g(r3, r15)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "memDataLog "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
        L_0x021b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r4 = ", boxCommentLikeTrack update likeCount:"
            r3.append(r4)
            int r4 = r0.f135668g
            r3.append(r4)
            java.lang.String r4 = ", show:"
            r3.append(r4)
            boolean r0 = r0.f135669h
            r3.append(r0)
            java.lang.String r0 = ", for "
            r3.append(r0)
            java.lang.String r0 = r7.mo62406i()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.mo62411b(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ", notifier update index:"
            r0.append(r2)
            r0.append(r11)
            java.lang.String r2 = ", msg:"
            r0.append(r2)
            java.lang.String r2 = r7.mo62406i()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.mo62411b(r0)
            r2 = r23
            if (r2 == 0) goto L_0x0285
            bl1.k$d r0 = new bl1.k$d
            r3 = r21
            java.lang.String r3 = r3.f106814a
            r4 = 101(0x65, float:1.42E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r0.<init>(r3, r11, r5, r4)
            r2.mo62418b(r0)
            goto L_0x0286
        L_0x0285:
            r5 = 1
        L_0x0286:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bl1.C39786k.mo62415f(java.lang.String, te3.xi, bl1.u, te3.xs0, bl1.k$a, boolean):boolean");
    }

    /* renamed from: g */
    public final boolean mo62416g(C52013xs0 xs02) {
        C39807u d;
        C87412m.m108594g(xs02, "updateInfo");
        C50317lw0 lw02 = xs02.f144910o;
        String str = lw02 != null ? lw02.f137677e : null;
        if ((str == null || str.length() == 0) || (d = mo62413d(str)) == null) {
            return false;
        }
        return mo62415f("selfLike", d.f106817d, d, xs02, this.f106765d.get(str), true);
    }
}
