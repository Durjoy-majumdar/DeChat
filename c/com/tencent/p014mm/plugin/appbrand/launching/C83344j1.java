package com.tencent.p014mm.plugin.appbrand.launching;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81271j;
import com.tencent.p014mm.plugin.appbrand.appcache.C81278k;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.launching.C83397o1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import mp3.C88819d;
import or3.C89286a;
import org.json.JSONObject;
import p823sg.C77710q;
import q40.C12040d;
import q40.C89456b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C110823p;
import te3.C52246zc2;
import te3.C64294cr2;
import te3.C64310db;
import te3.C90404cb;
import te3.C90413gz1;
import te3.C90415hz1;
import te3.C90422jy;
import te3.C90424kt3;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.j1 */
public final class C83344j1 implements C83397o1 {

    /* renamed from: a */
    public static final C83344j1 f243546a = new C83344j1();

    /* renamed from: b */
    public static final ConcurrentHashMap<C83397o1.C83398a, C90415hz1[]> f243547b = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.j1$a */
    public interface C29580a {

        /* renamed from: a */
        public static final /* synthetic */ int f80507a = 0;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.j1$a$a */
        public static final class C29581a implements C29580a {

            /* renamed from: b */
            public static final /* synthetic */ C29581a f80508b = new C29581a();

            /* renamed from: a */
            public boolean mo56822a(boolean z, ICommLibReader iCommLibReader) {
                boolean z2;
                boolean z3;
                Class cls = C32735h.class;
                if (z) {
                    boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_android_wagame_encrypt_wxapkg, false);
                    Log.m105924i("MicroMsg.GetPkgDownloadUrlUnifiedCgiRouter.WECHAT_INSTANCE", "useEncryptPkg for game, retVal[" + wf + "] exptVal[" + wf + "] defVal[" + false + ']');
                    return wf;
                }
                boolean wf4 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_android_appbrand_encrypt_wxapkg, false);
                boolean z4 = true;
                if (iCommLibReader != null) {
                    String[] strArr = {"lazyCodeLoading", "lazyCodeLoading2"};
                    int i = 0;
                    while (true) {
                        if (i >= 2) {
                            z3 = false;
                            break;
                        }
                        String Yk0 = iCommLibReader.Yk0(strArr[i]);
                        if (!(Yk0 == null || Yk0.length() == 0)) {
                            z3 = true;
                            break;
                        }
                        i++;
                    }
                    if (!z3) {
                        z2 = true;
                        boolean z5 = !z2;
                        if (!wf4 || !z5) {
                            z4 = false;
                        }
                        Log.m105924i("MicroMsg.GetPkgDownloadUrlUnifiedCgiRouter.WECHAT_INSTANCE", "useEncryptPkg for app, retVal[" + z4 + "] exptVal[" + wf4 + "] defVal[" + false + "] supportLazyCodeLoading[" + z5 + ']');
                        return z4;
                    }
                }
                z2 = false;
                boolean z54 = !z2;
                z4 = false;
                Log.m105924i("MicroMsg.GetPkgDownloadUrlUnifiedCgiRouter.WECHAT_INSTANCE", "useEncryptPkg for app, retVal[" + z4 + "] exptVal[" + wf4 + "] defVal[" + false + "] supportLazyCodeLoading[" + z54 + ']');
                return z4;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.j1$b */
    public static final class C83345b extends C87413o implements C32226l<C90415hz1[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C64310db, C13598b0> f243548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83345b(C32226l<? super C64310db, C13598b0> lVar) {
            super(1);
            this.f243548d = lVar;
        }

        public Object invoke(Object obj) {
            C90415hz1[] hz1Arr = (C90415hz1[]) obj;
            C87412m.m108594g(hz1Arr, "items");
            C32226l<C64310db, C13598b0> lVar = this.f243548d;
            C64310db dbVar = new C64310db();
            for (C90415hz1 hz12 : hz1Arr) {
                if (hz12 != null) {
                    dbVar.f182660d.add(hz12);
                }
            }
            lVar.invoke(dbVar);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.launching.GetPkgDownloadUrlUnifiedCgiRouter$waitForBatchGetDownloadUrl$4", mo125469f = "GetPkgDownloadUrlUnifiedCgiRouter.kt", mo125470l = {383}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.j1$c */
    public static final class C83346c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f243549d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<C64310db, C13598b0> f243550e;

        /* renamed from: f */
        public final /* synthetic */ C32228q<Integer, Integer, String, C13598b0> f243551f;

        /* renamed from: g */
        public final /* synthetic */ LinkedList<C83397o1.C83398a> f243552g;

        /* renamed from: h */
        public final /* synthetic */ int f243553h;

        /* renamed from: i */
        public final /* synthetic */ C90422jy f243554i;

        /* renamed from: j */
        public final /* synthetic */ LinkedList<C90415hz1> f243555j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83346c(C32226l<? super C64310db, C13598b0> lVar, C32228q<? super Integer, ? super Integer, ? super String, C13598b0> qVar, LinkedList<C83397o1.C83398a> linkedList, int i, C90422jy jyVar, LinkedList<C90415hz1> linkedList2, C15601d<? super C83346c> dVar) {
            super(2, dVar);
            this.f243550e = lVar;
            this.f243551f = qVar;
            this.f243552g = linkedList;
            this.f243553h = i;
            this.f243554i = jyVar;
            this.f243555j = linkedList2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C83346c(this.f243550e, this.f243551f, this.f243552g, this.f243553h, this.f243554i, this.f243555j, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C83346c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f243549d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C90404cb cbVar = new C90404cb();
                LinkedList<C83397o1.C83398a> linkedList = this.f243552g;
                int i2 = this.f243553h;
                C90422jy jyVar = this.f243554i;
                for (C83397o1.C83398a b : linkedList) {
                    cbVar.f259441d.addAll(C83344j1.m102295b(C83344j1.f243546a, b));
                }
                cbVar.f259442e = i2;
                cbVar.f259443f = jyVar;
                C81271j jVar = new C81271j(cbVar);
                this.f243549d = 1;
                obj = C89456b.m111831a(jVar, 0, (C88819d) null, this, 3, (Object) null);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (C12040d e) {
                    this.f243551f.invoke(new Integer(e.f35057e), new Integer(e.f35058f), e.f35059g);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ((C64310db) obj).f182660d.addAll(this.f243555j);
            this.f243550e.invoke(obj);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.launching.GetPkgDownloadUrlUnifiedCgiRouter$waitForDownloadUrl$2", mo125469f = "GetPkgDownloadUrlUnifiedCgiRouter.kt", mo125470l = {209}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.j1$d */
    public static final class C83347d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f243556d;

        /* renamed from: e */
        public final /* synthetic */ C32228q<Integer, Integer, String, C13598b0> f243557e;

        /* renamed from: f */
        public final /* synthetic */ C83397o1.C83398a f243558f;

        /* renamed from: g */
        public final /* synthetic */ int f243559g;

        /* renamed from: h */
        public final /* synthetic */ C90422jy f243560h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<C90415hz1[], C13598b0> f243561i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83347d(C32228q<? super Integer, ? super Integer, ? super String, C13598b0> qVar, C83397o1.C83398a aVar, int i, C90422jy jyVar, C32226l<? super C90415hz1[], C13598b0> lVar, C15601d<? super C83347d> dVar) {
            super(2, dVar);
            this.f243557e = qVar;
            this.f243558f = aVar;
            this.f243559g = i;
            this.f243560h = jyVar;
            this.f243561i = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C83347d(this.f243557e, this.f243558f, this.f243559g, this.f243560h, this.f243561i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C83347d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f243556d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C90404cb cbVar = new C90404cb();
                C83397o1.C83398a aVar2 = this.f243558f;
                int i2 = this.f243559g;
                C90422jy jyVar = this.f243560h;
                cbVar.f259441d.addAll(C83344j1.m102295b(C83344j1.f243546a, aVar2));
                cbVar.f259442e = i2;
                cbVar.f259443f = jyVar;
                C81271j jVar = new C81271j(cbVar);
                this.f243556d = 1;
                obj = C89456b.m111831a(jVar, 0, (C88819d) null, this, 3, (Object) null);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (C12040d e) {
                    this.f243557e.invoke(new Integer(e.f35057e), new Integer(e.f35058f), e.f35059g);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32226l<C90415hz1[], C13598b0> lVar = this.f243561i;
            C90415hz1[] a = C83510w0.m102478a((C64310db) obj, this.f243558f);
            C87412m.m108591d(a);
            lVar.invoke(a);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public static final List m102295b(C83344j1 j1Var, C83397o1.C83398a aVar) {
        j1Var.getClass();
        LinkedList linkedList = new LinkedList();
        C90413gz1 c = m102296c(aVar, "gzip");
        c.f259533e = null;
        c.f259537i = false;
        linkedList.add(c);
        if (!C81289m.C81290a.m99663a(aVar.f243669g)) {
            C90413gz1 c2 = m102296c(aVar, "zstd");
            c2.f259533e = null;
            c2.f259537i = true;
            linkedList.add(c2);
            if (aVar.f243673n > 0) {
                C90413gz1 c3 = m102296c(aVar, "patch");
                C64294cr2 cr22 = new C64294cr2();
                c3.f259533e = cr22;
                cr22.f182558d = aVar.f243673n;
                cr22.f182559e = 0;
                c3.f259537i = false;
                linkedList.add(c3);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    public static final C90413gz1 m102296c(C83397o1.C83398a aVar, String str) {
        int i;
        C90413gz1 gz12 = new C90413gz1();
        gz12.f259532d = f243546a.mo115625d(aVar);
        gz12.f259534f = aVar.f243672j;
        boolean z = true;
        if (aVar.f243674o) {
            gz12.f259536h = true;
            gz12.f259535g = aVar.f243670h;
        } else {
            gz12.f259535g = aVar.f243670h;
        }
        String str2 = aVar.f243671i;
        if (!(str2 == null || str2.length() == 0)) {
            gz12.f259539n = aVar.f243671i;
        }
        String str3 = aVar.f243675p;
        if (!(str3 == null || str3.length() == 0)) {
            z = false;
        }
        if (!z) {
            gz12.f259541p = aVar.f243675p;
            gz12.f259536h = false;
        }
        String str4 = "";
        if (C81289m.C81290a.m99663a(gz12.f259532d.f259657h)) {
            try {
                if (gz12.f259532d.f259656g == 6) {
                    i = new C77710q(((C29583l3) C81161g2.Bx0(C29583l3.class)).mo56823Lo(gz12.f259532d.f259653d, gz12.f259539n)).f226490d;
                } else {
                    C90424kt3 kt32 = gz12.f259532d;
                    String jo = ((C29567d1) C81161g2.Bx0(C29567d1.class)).mo56815jo(kt32.f259653d, kt32.f259657h);
                    if (jo == null) {
                        jo = str4;
                    }
                    i = new C77710q(new JSONObject(jo).optLong("dev_key")).f226490d;
                }
                gz12.f259538j = i;
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.AppBrand.CommonPkgFetcherUtils", "GetDownloadUrlReqItem.fillDevUin(" + gz12.f259532d.f259653d + ", " + gz12.f259532d.f259657h + "), throwable=" + th);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("createNewProtocolReqItemList$buildBasicItem(");
        sb.append(str);
        sb.append(")appId:");
        sb.append(gz12.f259532d.f259653d);
        sb.append(", packageType:");
        sb.append(gz12.f259532d.f259656g);
        sb.append(", module:");
        String str5 = gz12.f259532d.f259655f;
        if (str5 == null) {
            str5 = str4;
        }
        sb.append(str5);
        sb.append(", version_desc:");
        String str6 = gz12.f259539n;
        if (str6 == null) {
            str6 = str4;
        }
        sb.append(str6);
        sb.append(", dev_uin:");
        sb.append(C77710q.m93738a(gz12.f259538j));
        sb.append(", need_latest_version:");
        sb.append(gz12.f259536h);
        sb.append(", semver:");
        String str7 = gz12.f259541p;
        if (str7 != null) {
            str4 = str7;
        }
        sb.append(str4);
        sb.append(", versionType:");
        sb.append(gz12.f259532d.f259657h);
        Log.m105924i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb.toString());
        return gz12;
    }

    /* renamed from: f */
    public static final String m102297f(C52246zc2 zc22) {
        return "GetWxaAppCDNDownloadUrlRequest(appId:" + zc22.f145806e + " version:" + zc22.f145807f + " moduleName:" + zc22.f145811j + " pacakgeType:" + zc22.f145809h + " scene:" + zc22.f145821w + ')';
    }

    /* renamed from: g */
    public static final C90413gz1 m102298g(C81278k kVar) {
        C90413gz1 gz12 = new C90413gz1();
        C90424kt3 kt32 = new C90424kt3();
        gz12.f259532d = kt32;
        kt32.f259653d = kVar.mo113564r().f145806e;
        gz12.f259535g = kVar.mo113564r().f145807f;
        gz12.f259532d.f259656g = kVar.mo113564r().f145809h;
        gz12.f259532d.f259655f = kVar.mo113564r().f145811j;
        gz12.f259534f = 0;
        return gz12;
    }

    /* renamed from: a */
    public void mo115538a(C83397o1.C83398a aVar, C32226l<? super C90415hz1[], C13598b0> lVar, C32228q<? super Integer, ? super Integer, ? super String, C13598b0> qVar, int i, C90422jy jyVar) {
        C83397o1.C83398a aVar2 = aVar;
        C32226l<? super C90415hz1[], C13598b0> lVar2 = lVar;
        C87412m.m108594g(aVar, "request");
        C87412m.m108594g(lVar, "onSuccess");
        C87412m.m108594g(qVar, "onError");
        C87412m.m108594g(jyVar, "cgiCommRequestSource");
        C90415hz1[] remove = f243547b.remove(aVar);
        if (remove != null) {
            Log.m105924i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "waitForDownloadUrl, intercepted by PreGet with " + aVar);
            if (C110823p.m150982H(remove, 0) != null) {
                lVar.invoke(remove);
                return;
            }
        }
        if (!aVar2.f243674o && C110823p.m151008x(C89286a.f257213b, aVar2.f243668f)) {
            int i2 = C29580a.f80507a;
        }
        Log.m105925i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "goNewCgi: %b,appId: %s", true, aVar2.f243666d);
        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C83347d(qVar, aVar, i, jyVar, lVar, (C15601d<? super C83347d>) null), 2, (Object) null);
    }

    /* renamed from: d */
    public final C90424kt3 mo115625d(C83397o1.C83398a aVar) {
        C90424kt3 kt32 = new C90424kt3();
        kt32.f259653d = aVar.f243666d;
        int i = aVar.f243668f;
        if (C110823p.m151008x(C89286a.f257215d, i)) {
            kt32.f259655f = null;
        } else if (C110823p.m151008x(C89286a.f257214c, i)) {
            kt32.f259655f = null;
        } else {
            kt32.f259655f = aVar.f243667e;
        }
        kt32.f259656g = aVar.f243668f;
        kt32.f259657h = aVar.f243669g;
        return kt32;
    }

    /* renamed from: e */
    public final void mo115626e(List<C83397o1.C83398a> list, C32226l<? super C64310db, C13598b0> lVar, C32228q<? super Integer, ? super Integer, ? super String, C13598b0> qVar, int i, C90422jy jyVar) {
        List<C83397o1.C83398a> list2 = list;
        C32226l<? super C64310db, C13598b0> lVar2 = lVar;
        C87412m.m108594g(list, "inRequestList");
        C87412m.m108594g(lVar2, "onSuccess");
        C87412m.m108594g(qVar, "onError");
        C87412m.m108594g(jyVar, "cgiCommRequestSource");
        if (list.size() == 1) {
            Log.m105924i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "waitForBatchGetDownloadUrl, use single routine instead, with " + C110818d0.m150914L(list));
            mo115538a(list.get(0), new C83345b(lVar2), qVar, i, jyVar);
            return;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList(list);
        Iterator it = linkedList2.iterator();
        C87412m.m108593f(it, "realRequestList.iterator()");
        while (it.hasNext()) {
            Object next = it.next();
            C87412m.m108593f(next, "iterator.next()");
            C83397o1.C83398a aVar = (C83397o1.C83398a) next;
            C90415hz1[] remove = f243547b.remove(aVar);
            if (!(remove == null || C110823p.m150982H(remove, 0) == null)) {
                Log.m105924i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "waitForBatchGetDownloadUrl, intercepted by PreGet with " + aVar);
                it.remove();
                for (C90415hz1 hz12 : remove) {
                    if (hz12 != null) {
                        linkedList.add(hz12);
                    }
                }
            }
        }
        Log.m105924i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "waitForBatchGetDownloadUrl, inRequestList.size=" + list.size() + ", realRequestList.size=" + linkedList2.size() + ", preGetRespItemList.size=" + linkedList.size());
        if (linkedList2.size() <= 0) {
            C64310db dbVar = new C64310db();
            dbVar.f182660d.addAll(linkedList);
            lVar2.invoke(dbVar);
            return;
        }
        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C83346c(lVar, qVar, linkedList2, i, jyVar, linkedList, (C15601d<? super C83346c>) null), 2, (Object) null);
    }
}
