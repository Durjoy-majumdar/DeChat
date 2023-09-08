package qa0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.util.ArrayMap;
import com.tencent.maas.model.MJTemplateInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C48973c92;
import te3.pr4;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qa0.b */
public final class C62586b {

    /* renamed from: a */
    public static final C62586b f177739a = new C62586b();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, pr4> f177740b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<String, C35816a> f177741c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final HashSet<String> f177742d = new HashSet<>();

    /* renamed from: e */
    public static final C0000n0 f177743e = C53930o0.m60554a(C53872d1.f151119c.plus(C53959v2.m60598a((C53973z1) null, 1, (Object) null)));

    /* renamed from: f */
    public static final C0000n0 f177744f = C53930o0.m60555b();

    /* renamed from: g */
    public static final ArrayMap<String, C53973z1> f177745g = new ArrayMap<>();

    /* renamed from: h */
    public static C35816a f177746h;

    /* renamed from: i */
    public static C53973z1 f177747i;

    /* renamed from: j */
    public static final ArrayMap<String, MJTemplateInfo> f177748j = new ArrayMap<>();

    /* renamed from: qa0.b$a */
    public static final class C35816a {

        /* renamed from: a */
        public final long f95627a;

        /* renamed from: b */
        public final List<pr4> f95628b;

        public C35816a(long j, List<? extends pr4> list) {
            C87412m.m108594g(list, "dataList");
            this.f95627a = j;
            this.f95628b = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35816a)) {
                return false;
            }
            C35816a aVar = (C35816a) obj;
            return this.f95627a == aVar.f95627a && C87412m.m108589b(this.f95628b, aVar.f95628b);
        }

        public int hashCode() {
            long j = this.f95627a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f95628b.hashCode();
        }

        public String toString() {
            return "CachedTemplateListInfo(expireTime=" + this.f95627a + ", dataList=" + this.f95628b + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.svr_model.TemplateInfoHolder$reqImpl$2", mo125469f = "TemplateInfoHolder.kt", mo125470l = {222}, mo125471m = "invokeSuspend")
    /* renamed from: qa0.b$h */
    public static final class C47797h extends C91594j implements C32227p<C0000n0, C15601d<? super pr4>, Object> {

        /* renamed from: d */
        public int f128342d;

        /* renamed from: e */
        public final /* synthetic */ String f128343e;

        /* renamed from: f */
        public final /* synthetic */ int f128344f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47797h(String str, int i, C15601d<? super C47797h> dVar) {
            super(2, dVar);
            this.f128343e = str;
            this.f128344f = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C47797h(this.f128343e, this.f128344f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C47797h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f128342d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C47792a aVar2 = C47792a.f128329a;
                String str = this.f128343e;
                int i2 = this.f128344f;
                this.f128342d = 1;
                obj = aVar2.mo72571d(str, i2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C48973c92 c922 = (C48973c92) obj;
            if (c922 != null) {
                return c922.f131578d;
            }
            return null;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.svr_model.TemplateInfoHolder", mo125469f = "TemplateInfoHolder.kt", mo125470l = {135}, mo125471m = "awaitCameraTemplateList")
    /* renamed from: qa0.b$b */
    public static final class C62587b extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f177749d;

        /* renamed from: e */
        public final /* synthetic */ C62586b f177750e;

        /* renamed from: f */
        public int f177751f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62587b(C62586b bVar, C15601d<? super C62587b> dVar) {
            super(dVar);
            this.f177750e = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f177749d = obj;
            this.f177751f |= Integer.MIN_VALUE;
            return this.f177750e.mo87643c(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.svr_model.TemplateInfoHolder", mo125469f = "TemplateInfoHolder.kt", mo125470l = {111, 113}, mo125471m = "awaitInfo")
    /* renamed from: qa0.b$c */
    public static final class C62588c extends C66704d {

        /* renamed from: d */
        public Object f177752d;

        /* renamed from: e */
        public Object f177753e;

        /* renamed from: f */
        public int f177754f;

        /* renamed from: g */
        public /* synthetic */ Object f177755g;

        /* renamed from: h */
        public final /* synthetic */ C62586b f177756h;

        /* renamed from: i */
        public int f177757i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62588c(C62586b bVar, C15601d<? super C62588c> dVar) {
            super(dVar);
            this.f177756h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f177755g = obj;
            this.f177757i |= Integer.MIN_VALUE;
            return this.f177756h.mo87644d((String) null, 0, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.svr_model.TemplateInfoHolder", mo125469f = "TemplateInfoHolder.kt", mo125470l = {124}, mo125471m = "awaitRecommendTemplate")
    /* renamed from: qa0.b$d */
    public static final class C62589d extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f177758d;

        /* renamed from: e */
        public final /* synthetic */ C62586b f177759e;

        /* renamed from: f */
        public int f177760f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62589d(C62586b bVar, C15601d<? super C62589d> dVar) {
            super(dVar);
            this.f177759e = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f177758d = obj;
            this.f177760f |= Integer.MIN_VALUE;
            return this.f177759e.mo87645e(0, (String) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.svr_model.TemplateInfoHolder$loadInfo$1", mo125469f = "TemplateInfoHolder.kt", mo125470l = {61}, mo125471m = "invokeSuspend")
    /* renamed from: qa0.b$e */
    public static final class C62590e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f177761d;

        /* renamed from: e */
        public final /* synthetic */ String f177762e;

        /* renamed from: f */
        public final /* synthetic */ int f177763f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62590e(String str, int i, C15601d<? super C62590e> dVar) {
            super(2, dVar);
            this.f177762e = str;
            this.f177763f = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62590e(this.f177762e, this.f177763f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62590e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f177761d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashSet<String> hashSet = C62586b.f177742d;
                if (!hashSet.contains(this.f177762e)) {
                    Log.m105924i("MicroMsg.Maas.CreationSameInfoHolder", "add " + this.f177762e + " to pool");
                    hashSet.add(this.f177762e);
                    C62586b bVar = C62586b.f177739a;
                    String str = this.f177762e;
                    int i2 = this.f177763f;
                    this.f177761d = 1;
                    if (bVar.mo87649i(str, i2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    Log.m105924i("MicroMsg.Maas.CreationSameInfoHolder", this.f177762e + " was added");
                    return C13598b0.f38549a;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C62586b.f177745g.remove(this.f177762e);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.svr_model.TemplateInfoHolder$preloadCategoryTemplateList$1", mo125469f = "TemplateInfoHolder.kt", mo125470l = {79}, mo125471m = "invokeSuspend")
    /* renamed from: qa0.b$f */
    public static final class C62591f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f177764d;

        /* renamed from: e */
        public final /* synthetic */ int f177765e;

        /* renamed from: f */
        public final /* synthetic */ String f177766f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62591f(int i, String str, C15601d<? super C62591f> dVar) {
            super(2, dVar);
            this.f177765e = i;
            this.f177766f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62591f(this.f177765e, this.f177766f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62591f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f177764d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C62586b bVar = C62586b.f177739a;
                int i2 = this.f177765e;
                String str = this.f177766f;
                this.f177764d = 1;
                if (C62586b.m73553b(bVar, i2, str, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.svr_model.TemplateInfoHolder", mo125469f = "TemplateInfoHolder.kt", mo125470l = {221}, mo125471m = "reqImpl")
    /* renamed from: qa0.b$g */
    public static final class C62592g extends C66704d {

        /* renamed from: d */
        public Object f177767d;

        /* renamed from: e */
        public /* synthetic */ Object f177768e;

        /* renamed from: f */
        public final /* synthetic */ C62586b f177769f;

        /* renamed from: g */
        public int f177770g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62592g(C62586b bVar, C15601d<? super C62592g> dVar) {
            super(dVar);
            this.f177769f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f177768e = obj;
            this.f177770g |= Integer.MIN_VALUE;
            C62586b bVar = this.f177769f;
            C62586b bVar2 = C62586b.f177739a;
            return bVar.mo87649i((String) null, 0, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m73552a(qa0.C62586b r4, wx3.C15601d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof qa0.C62593c
            if (r0 == 0) goto L_0x0016
            r0 = r5
            qa0.c r0 = (qa0.C62593c) r0
            int r1 = r0.f177773f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f177773f = r1
            goto L_0x001b
        L_0x0016:
            qa0.c r0 = new qa0.c
            r0.<init>(r4, r5)
        L_0x001b:
            java.lang.Object r4 = r0.f177771d
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r0.f177773f
            java.lang.String r2 = "MicroMsg.Maas.CreationSameInfoHolder"
            r3 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r3) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x0048
        L_0x002c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.String r4 = "cacheCameraListImpl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            qa0.a r4 = qa0.C47792a.f128329a
            r0.f177773f = r3
            java.lang.Object r4 = r4.mo72568a(r0)
            if (r4 != r5) goto L_0x0048
            goto L_0x00c1
        L_0x0048:
            te3.rw1 r4 = (te3.C51166rw1) r4
            if (r4 == 0) goto L_0x00bf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "cacheCameraListImpl rsp, max_age: "
            r5.append(r0)
            int r0 = r4.f141185f
            r5.append(r0)
            java.lang.String r0 = ", listSize: "
            r5.append(r0)
            java.util.LinkedList<te3.pr4> r0 = r4.f141183d
            if (r0 == 0) goto L_0x006e
            int r0 = r0.size()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            qa0.b$a r5 = new qa0.b$a
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = r4.f141185f
            int r2 = r2 * 1000
            long r2 = (long) r2
            long r0 = r0 + r2
            java.util.LinkedList<te3.pr4> r2 = r4.f141183d
            if (r2 != 0) goto L_0x008b
            sx3.f0 r2 = sx3.C64186f0.f181907d
        L_0x008b:
            r5.<init>(r0, r2)
            f177746h = r5
            java.util.concurrent.ConcurrentHashMap<java.lang.String, qa0.b$a> r0 = f177741c
            java.lang.String r1 = "cache_key_finder_record"
            r0.put(r1, r5)
            java.util.LinkedList<te3.pr4> r4 = r4.f141183d
            if (r4 == 0) goto L_0x00bf
            java.util.Iterator r4 = r4.iterator()
        L_0x009f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00bf
            java.lang.Object r5 = r4.next()
            te3.pr4 r5 = (te3.pr4) r5
            java.util.HashSet<java.lang.String> r0 = f177742d
            java.lang.String r1 = r5.f139919d
            r0.add(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.pr4> r0 = f177740b
            java.lang.String r1 = r5.f139919d
            java.lang.String r2 = "it.id"
            gy3.C87412m.m108593f(r1, r2)
            r0.put(r1, r5)
            goto L_0x009f
        L_0x00bf:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x00c1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qa0.C62586b.m73552a(qa0.b, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m73553b(qa0.C62586b r4, int r5, java.lang.String r6, wx3.C15601d r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof qa0.C62594d
            if (r0 == 0) goto L_0x0016
            r0 = r7
            qa0.d r0 = (qa0.C62594d) r0
            int r1 = r0.f177778h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f177778h = r1
            goto L_0x001b
        L_0x0016:
            qa0.d r0 = new qa0.d
            r0.<init>(r4, r7)
        L_0x001b:
            java.lang.Object r4 = r0.f177776f
            xx3.a r7 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r0.f177778h
            java.lang.String r2 = "MicroMsg.Maas.CreationSameInfoHolder"
            r3 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r3) goto L_0x0032
            int r5 = r0.f177774d
            java.lang.Object r6 = r0.f177775e
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x0061
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "cacheCategoryListImpl "
            r4.append(r1)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            qa0.a r4 = qa0.C47792a.f128329a
            r0.f177775e = r6
            r0.f177774d = r5
            r0.f177778h = r3
            java.lang.Object r4 = r4.mo72569b(r5, r0)
            if (r4 != r7) goto L_0x0061
            goto L_0x00e0
        L_0x0061:
            te3.y92 r4 = (te3.C52088y92) r4
            if (r4 == 0) goto L_0x00de
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "cacheCategoryListImpl rsp "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = ", max_age: "
            r7.append(r5)
            int r5 = r4.f145191g
            r7.append(r5)
            java.lang.String r5 = ", listSize: "
            r7.append(r5)
            java.util.LinkedList<te3.pr4> r5 = r4.f145188d
            if (r5 == 0) goto L_0x008f
            int r5 = r5.size()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            r7.append(r0)
            java.lang.String r5 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            qa0.b$a r5 = new qa0.b$a
            long r0 = java.lang.System.currentTimeMillis()
            int r7 = r4.f145191g
            int r7 = r7 * 1000
            long r2 = (long) r7
            long r0 = r0 + r2
            java.util.LinkedList<te3.pr4> r7 = r4.f145188d
            if (r7 != 0) goto L_0x00ac
            sx3.f0 r7 = sx3.C64186f0.f181907d
        L_0x00ac:
            r5.<init>(r0, r7)
            f177746h = r5
            java.util.concurrent.ConcurrentHashMap<java.lang.String, qa0.b$a> r7 = f177741c
            r7.put(r6, r5)
            java.util.LinkedList<te3.pr4> r4 = r4.f145188d
            if (r4 == 0) goto L_0x00de
            java.util.Iterator r4 = r4.iterator()
        L_0x00be:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00de
            java.lang.Object r5 = r4.next()
            te3.pr4 r5 = (te3.pr4) r5
            java.util.HashSet<java.lang.String> r6 = f177742d
            java.lang.String r7 = r5.f139919d
            r6.add(r7)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.pr4> r6 = f177740b
            java.lang.String r7 = r5.f139919d
            java.lang.String r0 = "it.id"
            gy3.C87412m.m108593f(r7, r0)
            r6.put(r7, r5)
            goto L_0x00be
        L_0x00de:
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x00e0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qa0.C62586b.m73553b(qa0.b, int, java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo87643c(wx3.C15601d<? super java.util.List<? extends te3.pr4>> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof qa0.C62586b.C62587b
            if (r0 == 0) goto L_0x0013
            r0 = r14
            qa0.b$b r0 = (qa0.C62586b.C62587b) r0
            int r1 = r0.f177751f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f177751f = r1
            goto L_0x0018
        L_0x0013:
            qa0.b$b r0 = new qa0.b$b
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f177749d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f177751f
            r3 = 32
            java.lang.String r4 = "MicroMsg.Maas.CreationSameInfoHolder"
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0035
            if (r2 != r5) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00e3
        L_0x002d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.String r14 = "awaitCameraTemplateList"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, qa0.b$a> r14 = f177741c
            java.lang.String r2 = "cache_key_finder_record"
            java.lang.Object r14 = r14.get(r2)
            qa0.b$a r14 = (qa0.C62586b.C35816a) r14
            long r7 = java.lang.System.currentTimeMillis()
            if (r14 == 0) goto L_0x0050
            long r9 = r14.f95627a
            goto L_0x0052
        L_0x0050:
            r9 = 0
        L_0x0052:
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0099
            a14.z1 r2 = f177747i
            if (r2 == 0) goto L_0x0064
            a14.a r2 = (a14.C53851a) r2
            boolean r2 = r2.mo74466a()
            if (r2 != r5) goto L_0x0064
            r2 = 1
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            if (r2 != 0) goto L_0x0099
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "preloadTemplateList cached list expire "
            r2.append(r7)
            if (r14 == 0) goto L_0x007a
            long r7 = r14.f95627a
            java.lang.Long r14 = java.lang.Long.valueOf(r7)
            goto L_0x007b
        L_0x007a:
            r14 = r6
        L_0x007b:
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            f177746h = r6
            a14.n0 r7 = f177743e
            r8 = 0
            r9 = 0
            qa0.f r10 = new qa0.f
            r10.<init>(r6)
            r11 = 3
            r12 = 0
            a14.z1 r14 = a14.C53895h.m60466d(r7, r8, r9, r10, r11, r12)
            f177747i = r14
            goto L_0x00d4
        L_0x0099:
            f177746h = r14
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "preloadTemplateList not expired "
            r2.append(r7)
            if (r14 == 0) goto L_0x00ae
            long r7 = r14.f95627a
            java.lang.Long r14 = java.lang.Long.valueOf(r7)
            goto L_0x00af
        L_0x00ae:
            r14 = r6
        L_0x00af:
            r2.append(r14)
            java.lang.String r14 = ", loading: "
            r2.append(r14)
            a14.z1 r14 = f177747i
            if (r14 == 0) goto L_0x00c6
            a14.a r14 = (a14.C53851a) r14
            boolean r14 = r14.mo74466a()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            goto L_0x00c7
        L_0x00c6:
            r14 = r6
        L_0x00c7:
            r2.append(r14)
            r2.append(r3)
            java.lang.String r14 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
        L_0x00d4:
            a14.z1 r14 = f177747i
            if (r14 == 0) goto L_0x00e3
            r0.f177751f = r5
            a14.f2 r14 = (a14.C53884f2) r14
            java.lang.Object r14 = r14.mo74521O(r0)
            if (r14 != r1) goto L_0x00e3
            return r1
        L_0x00e3:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "template list size "
            r14.append(r0)
            qa0.b$a r0 = f177746h
            if (r0 == 0) goto L_0x0100
            java.util.List<te3.pr4> r0 = r0.f95628b
            if (r0 == 0) goto L_0x0100
            int r0 = r0.size()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            goto L_0x0101
        L_0x0100:
            r1 = r6
        L_0x0101:
            r14.append(r1)
            java.lang.String r0 = " expire time: "
            r14.append(r0)
            qa0.b$a r0 = f177746h
            if (r0 == 0) goto L_0x0115
            long r0 = r0.f95627a
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            goto L_0x0116
        L_0x0115:
            r2 = r6
        L_0x0116:
            r14.append(r2)
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            qa0.b$a r14 = f177746h
            if (r14 == 0) goto L_0x0129
            java.util.List<te3.pr4> r6 = r14.f95628b
        L_0x0129:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qa0.C62586b.mo87643c(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo87644d(java.lang.String r9, int r10, wx3.C15601d<? super te3.pr4> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof qa0.C62586b.C62588c
            if (r0 == 0) goto L_0x0013
            r0 = r11
            qa0.b$c r0 = (qa0.C62586b.C62588c) r0
            int r1 = r0.f177757i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f177757i = r1
            goto L_0x0018
        L_0x0013:
            qa0.b$c r0 = new qa0.b$c
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f177755g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f177757i
            r3 = 0
            r4 = 2
            r5 = 1
            java.lang.String r6 = "MicroMsg.Maas.CreationSameInfoHolder"
            if (r2 == 0) goto L_0x004f
            if (r2 == r5) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            java.lang.Object r9 = r0.f177753e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f177752d
            qa0.b r10 = (qa0.C62586b) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00ba
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            int r9 = r0.f177754f
            java.lang.Object r10 = r0.f177753e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.f177752d
            qa0.b r2 = (qa0.C62586b) r2
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x0097
        L_0x004f:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "await info "
            r11.append(r2)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.pr4> r11 = f177740b
            boolean r11 = r11.contains(r9)
            if (r11 != 0) goto L_0x00b4
            java.lang.String r11 = "awaitInfo no cache, need await"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            android.util.ArrayMap<java.lang.String, a14.z1> r11 = f177745g
            java.lang.Object r11 = r11.get(r9)
            a14.z1 r11 = (a14.C53973z1) r11
            if (r11 == 0) goto L_0x009c
            boolean r2 = r11.mo74466a()
            if (r2 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r11 = r3
        L_0x0085:
            if (r11 == 0) goto L_0x009c
            r0.f177752d = r8
            r0.f177753e = r9
            r0.f177754f = r10
            r0.f177757i = r5
            java.lang.Object r11 = r11.mo74521O(r0)
            if (r11 != r1) goto L_0x0096
            return r1
        L_0x0096:
            r2 = r8
        L_0x0097:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r11 = r10
            r10 = r2
            goto L_0x009e
        L_0x009c:
            r11 = r10
            r10 = r8
        L_0x009e:
            if (r3 != 0) goto L_0x00ba
            java.lang.String r2 = "awaitInfo template not been preloaded"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r2)
            qa0.b r2 = f177739a
            r0.f177752d = r10
            r0.f177753e = r9
            r0.f177757i = r4
            java.lang.Object r11 = r2.mo87649i(r9, r11, r0)
            if (r11 != r1) goto L_0x00ba
            return r1
        L_0x00b4:
            java.lang.String r10 = "awaitInfo load template from cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
            r10 = r8
        L_0x00ba:
            te3.pr4 r9 = r10.mo87646f(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qa0.C62586b.mo87644d(java.lang.String, int, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        r7 = r7.f95628b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bc A[LOOP:0: B:32:0x00b6->B:34:0x00bc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo87645e(int r6, java.lang.String r7, wx3.C15601d<? super java.util.List<? extends te3.pr4>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof qa0.C62586b.C62589d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            qa0.b$d r0 = (qa0.C62586b.C62589d) r0
            int r1 = r0.f177760f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f177760f = r1
            goto L_0x0018
        L_0x0013:
            qa0.b$d r0 = new qa0.b$d
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f177758d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f177760f
            java.lang.String r3 = "MicroMsg.Maas.CreationSameInfoHolder"
            r4 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r4) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x005a
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "await category list "
            r8.append(r2)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
            r5.mo87648h(r6, r7)
            a14.z1 r6 = f177747i
            if (r6 == 0) goto L_0x005a
            r0.f177760f = r4
            a14.f2 r6 = (a14.C53884f2) r6
            java.lang.Object r6 = r6.mo74521O(r0)
            if (r6 != r1) goto L_0x005a
            return r1
        L_0x005a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "template list size "
            r6.append(r7)
            qa0.b$a r7 = f177746h
            r8 = 0
            if (r7 == 0) goto L_0x0078
            java.util.List<te3.pr4> r7 = r7.f95628b
            if (r7 == 0) goto L_0x0078
            int r7 = r7.size()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            goto L_0x0079
        L_0x0078:
            r0 = r8
        L_0x0079:
            r6.append(r0)
            java.lang.String r7 = " expire time: "
            r6.append(r7)
            qa0.b$a r7 = f177746h
            if (r7 == 0) goto L_0x008d
            long r0 = r7.f95627a
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r0)
            goto L_0x008e
        L_0x008d:
            r7 = r8
        L_0x008e:
            r6.append(r7)
            r7 = 32
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            qa0.b$a r6 = f177746h
            if (r6 == 0) goto L_0x00d6
            java.util.List<te3.pr4> r6 = r6.f95628b
            if (r6 == 0) goto L_0x00d6
            ja0.f r7 = ja0.C24789f.f70694a
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = sx3.C36907w.m41090l(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x00b6:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x00c8
            java.lang.Object r1 = r6.next()
            te3.pr4 r1 = (te3.pr4) r1
            java.lang.String r1 = r1.f139919d
            r0.add(r1)
            goto L_0x00b6
        L_0x00c8:
            com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct r6 = ja0.C24789f.f70695b
            java.lang.String r7 = r7.mo51772d(r0)
            java.lang.String r0 = "recids"
            java.lang.String r7 = r6.mo86045b(r0, r7, r4)
            r6.f69528i = r7
        L_0x00d6:
            qa0.b$a r6 = f177746h
            if (r6 == 0) goto L_0x00dc
            java.util.List<te3.pr4> r8 = r6.f95628b
        L_0x00dc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qa0.C62586b.mo87645e(int, java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: f */
    public final pr4 mo87646f(String str) {
        C87412m.m108594g(str, "templateId");
        pr4 pr4 = f177740b.get(str);
        StringBuilder sb = new StringBuilder();
        sb.append("get ");
        sb.append(str);
        sb.append(" info ");
        sb.append(pr4 != null);
        Log.m105924i("MicroMsg.Maas.CreationSameInfoHolder", sb.toString());
        return pr4;
    }

    /* renamed from: g */
    public final void mo87647g(String str, int i) {
        C87412m.m108594g(str, "templateId");
        if (str.length() == 0) {
            Log.m105928w("MicroMsg.Maas.CreationSameInfoHolder", "template id is empty");
        } else {
            f177745g.put(str, C53895h.m60466d(f177744f, (C66212f) null, (C53934p0) null, new C62590e(str, i, (C15601d<? super C62590e>) null), 3, (Object) null));
        }
    }

    /* renamed from: h */
    public final void mo87648h(int i, String str) {
        C87412m.m108594g(str, "cacheKey");
        C35816a aVar = f177741c.get(str);
        Boolean bool = null;
        if (System.currentTimeMillis() > (aVar != null ? aVar.f95627a : 0)) {
            C53973z1 z1Var = f177747i;
            boolean z = true;
            if (z1Var == null || !z1Var.mo74466a()) {
                z = false;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("preloadTemplateList cached list expire ");
                sb.append(aVar != null ? Long.valueOf(aVar.f95627a) : null);
                Log.m105924i("MicroMsg.Maas.CreationSameInfoHolder", sb.toString());
                f177746h = null;
                f177747i = C53895h.m60466d(f177743e, (C66212f) null, (C53934p0) null, new C62591f(i, str, (C15601d<? super C62591f>) null), 3, (Object) null);
                return;
            }
        }
        f177746h = aVar;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("preloadTemplateList not expired ");
        sb4.append(aVar != null ? Long.valueOf(aVar.f95627a) : null);
        sb4.append(", loading: ");
        C53973z1 z1Var2 = f177747i;
        if (z1Var2 != null) {
            bool = Boolean.valueOf(z1Var2.mo74466a());
        }
        sb4.append(bool);
        sb4.append(' ');
        Log.m105924i("MicroMsg.Maas.CreationSameInfoHolder", sb4.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo87649i(java.lang.String r6, int r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof qa0.C62586b.C62592g
            if (r0 == 0) goto L_0x0013
            r0 = r8
            qa0.b$g r0 = (qa0.C62586b.C62592g) r0
            int r1 = r0.f177770g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f177770g = r1
            goto L_0x0018
        L_0x0013:
            qa0.b$g r0 = new qa0.b$g
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f177768e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f177770g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r6 = r0.f177767d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0067
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "reqImpl templateId: "
            r8.append(r2)
            r8.append(r6)
            java.lang.String r2 = ", scene: "
            r8.append(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.Maas.CreationSameInfoHolder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            a14.h0 r8 = a14.C53872d1.f151119c
            qa0.b$h r2 = new qa0.b$h
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f177767d = r6
            r0.f177770g = r3
            java.lang.Object r8 = a14.C53895h.m60469g(r8, r2, r0)
            if (r8 != r1) goto L_0x0067
            return r1
        L_0x0067:
            te3.pr4 r8 = (te3.pr4) r8
            if (r8 == 0) goto L_0x0071
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.pr4> r7 = f177740b
            r7.put(r6, r8)
            goto L_0x0076
        L_0x0071:
            java.util.HashSet<java.lang.String> r7 = f177742d
            r7.remove(r6)
        L_0x0076:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qa0.C62586b.mo87649i(java.lang.String, int, wx3.d):java.lang.Object");
    }
}
