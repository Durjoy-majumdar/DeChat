package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.plugin.appbrand.launching.C83397o1;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64186f0;
import te3.C64310db;
import te3.C90415hz1;
import te3.C90422jy;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor */
public final class BatchGetCodePkgExecutor {

    /* renamed from: a */
    public static final BatchGetCodePkgExecutor f243304a = new BatchGetCodePkgExecutor();

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$a */
    public interface C83262a extends C83368m1.C83373c {
        /* renamed from: b */
        void mo115536b();

        /* renamed from: c */
        void mo115537c(C83368m1.C83374d dVar);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$b */
    public static final class C83263b implements C83397o1 {

        /* renamed from: a */
        public final String f243305a;

        /* renamed from: b */
        public final C90422jy f243306b;

        /* renamed from: c */
        public final LinkedList<C83368m1.C83374d> f243307c;

        /* renamed from: d */
        public final HashMap<C83397o1.C83398a, C13604l<C32226l<C90415hz1[], C13598b0>, C32228q<Integer, Integer, String, C13598b0>>> f243308d = new HashMap<>();

        /* renamed from: e */
        public int f243309e;

        /* renamed from: f */
        public boolean f243310f;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$b$a */
        public static final class C29559a extends C87413o implements C32226l<C64310db, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C83263b f80477d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C29559a(C83263b bVar) {
                super(1);
                this.f80477d = bVar;
            }

            public Object invoke(Object obj) {
                C64310db dbVar = (C64310db) obj;
                C87412m.m108594g(dbVar, "batchResp");
                Set<Map.Entry<C83397o1.C83398a, C13604l<C32226l<C90415hz1[], C13598b0>, C32228q<Integer, Integer, String, C13598b0>>>> entrySet = this.f80477d.f243308d.entrySet();
                C87412m.m108593f(entrySet, "requestCallbacks.entries");
                for (Map.Entry entry : entrySet) {
                    C87412m.m108593f(entry, "e");
                    C83397o1.C83398a aVar = (C83397o1.C83398a) entry.getKey();
                    C87412m.m108593f(aVar, "req");
                    C90415hz1[] a = C83510w0.m102478a(dbVar, aVar);
                    C87412m.m108591d(a);
                    ((C32226l) ((C13604l) entry.getValue()).f38555d).invoke(a);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$b$b */
        public static final class C29560b extends C87413o implements C32228q<Integer, Integer, String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C83263b f80478d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C29560b(C83263b bVar) {
                super(3);
                this.f80478d = bVar;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                String str = (String) obj3;
                Collection<C13604l<C32226l<C90415hz1[], C13598b0>, C32228q<Integer, Integer, String, C13598b0>>> values = this.f80478d.f243308d.values();
                C87412m.m108593f(values, "requestCallbacks.values");
                for (C13604l lVar : values) {
                    ((C32228q) lVar.f38556e).invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), str);
                }
                return C13598b0.f38549a;
            }
        }

        public C83263b(String str, Collection<C83368m1.C83374d> collection, C90422jy jyVar) {
            C87412m.m108594g(str, "session");
            C87412m.m108594g(collection, "requestPkgInfoList");
            C87412m.m108594g(jyVar, "cgiCommRequestSource");
            this.f243305a = str;
            this.f243306b = jyVar;
            this.f243307c = new LinkedList<>(collection);
        }

        /* renamed from: a */
        public synchronized void mo115538a(C83397o1.C83398a aVar, C32226l<? super C90415hz1[], C13598b0> lVar, C32228q<? super Integer, ? super Integer, ? super String, C13598b0> qVar, int i, C90422jy jyVar) {
            C87412m.m108594g(aVar, "request");
            C87412m.m108594g(lVar, "onSuccess");
            C87412m.m108594g(qVar, "onError");
            C87412m.m108594g(jyVar, "cgiCommRequestSource");
            Iterator<C83368m1.C83374d> it = this.f243307c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C83368m1.C83374d next = it.next();
                C87412m.m108593f(next, "waitingRequest");
                if (mo115539b(next, aVar) == 0) {
                    it.remove();
                    this.f243309e = i;
                    this.f243308d.put(aVar, new C13604l(lVar, qVar));
                    mo115540c();
                    break;
                }
            }
        }

        /* renamed from: b */
        public final int mo115539b(C83368m1.C83374d dVar, C83397o1.C83398a aVar) {
            if (!C87412m.m108589b(dVar.f243616d, aVar.f243666d) || dVar.f243618f != aVar.f243668f || dVar.f243619g != aVar.f243669g) {
                return -1;
            }
            String str = dVar.f243617e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = aVar.f243667e;
            if (str3 != null) {
                str2 = str3;
            }
            if (!C87412m.m108589b(str, str2)) {
                if (!C87412m.m108589b(ModulePkgInfo.MAIN_MODULE_NAME, dVar.f243617e)) {
                    return 1;
                }
                String str4 = aVar.f243667e;
                return str4 == null || str4.length() == 0 ? 0 : 1;
            }
        }

        /* renamed from: c */
        public final void mo115540c() {
            if (!(!this.f243307c.isEmpty())) {
                if (this.f243308d.size() <= 0) {
                    Log.m105928w("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "session(" + this.f243305a + ")fireAllRequestsIfNeed requestCallbacks.size <= 0");
                } else if (this.f243310f) {
                    Log.m105928w("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "session(" + this.f243305a + ")fireAllRequestsIfNeed cgi reentry!");
                } else {
                    try {
                        LinkedList linkedList = new LinkedList(this.f243308d.keySet());
                        Log.m105924i("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "session(" + this.f243305a + ")fireAllRequestsIfNeed real call CgiRouter with requests(" + C110818d0.m150921S(linkedList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + ')');
                        C83344j1.f243546a.mo115626e(linkedList, new C29559a(this), new C29560b(this), this.f243309e, this.f243306b);
                    } finally {
                        this.f243310f = true;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$c */
    public static final class C83264c {

        /* renamed from: a */
        public final C32226l<WxaPkgLoadProgress, C13598b0> f243311a;

        /* renamed from: b */
        public final LinkedList<C83368m1.C83374d> f243312b;

        /* renamed from: c */
        public final HashMap<C83368m1.C83374d, WxaPkgLoadProgress> f243313c = new HashMap<>();

        public C83264c(String str, Collection<C83368m1.C83374d> collection, C32226l<? super WxaPkgLoadProgress, C13598b0> lVar) {
            C87412m.m108594g(str, "session");
            C87412m.m108594g(collection, "requestPkgInfoList");
            C87412m.m108594g(lVar, "onProgress");
            this.f243311a = lVar;
            this.f243312b = new LinkedList<>(collection);
        }

        /* renamed from: a */
        public final void mo115541a(C83368m1.C83374d dVar, WxaPkgLoadProgress wxaPkgLoadProgress) {
            WxaPkgLoadProgress wxaPkgLoadProgress2;
            C87412m.m108594g(dVar, "request");
            C87412m.m108594g(wxaPkgLoadProgress, "progress");
            if (this.f243312b.size() == 1) {
                this.f243311a.invoke(wxaPkgLoadProgress);
                return;
            }
            synchronized (this.f243313c) {
                this.f243313c.put(dVar, wxaPkgLoadProgress);
                Collection<WxaPkgLoadProgress> values = this.f243313c.values();
                C87412m.m108593f(values, "progressMap.values");
                Iterator<T> it = values.iterator();
                long j = 0;
                long j2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        WxaPkgLoadProgress wxaPkgLoadProgress3 = (WxaPkgLoadProgress) it.next();
                        if (wxaPkgLoadProgress3 == null) {
                            wxaPkgLoadProgress2 = null;
                            break;
                        } else {
                            j += Math.max(wxaPkgLoadProgress3.f238583e, 0);
                            j2 += Math.max(wxaPkgLoadProgress3.f238584f, 0);
                        }
                    } else {
                        wxaPkgLoadProgress2 = new WxaPkgLoadProgress(j2 <= 0 ? 0 : C60641c.m70921b((((float) j) / ((float) j2)) * 100.0f), j, j2);
                    }
                }
            }
            if (wxaPkgLoadProgress2 != null) {
                this.f243311a.invoke(wxaPkgLoadProgress2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$d */
    public static final class C83265d extends C87413o implements C32227p<Integer, String, C13598b0> {

        /* renamed from: d */
        public static final C83265d f243314d = new C83265d();

        public C83265d() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            String str = (String) obj2;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$e */
    public static final class C83266e extends C87413o implements C32226l<C83368m1.C83377e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ConcurrentSkipListSet<IPkgInfo> f243315d;

        /* renamed from: e */
        public final /* synthetic */ C83368m1.C83374d f243316e;

        /* renamed from: f */
        public final /* synthetic */ C83264c f243317f;

        /* renamed from: g */
        public final /* synthetic */ HashSet<C83368m1.C83374d> f243318g;

        /* renamed from: h */
        public final /* synthetic */ AtomicBoolean f243319h;

        /* renamed from: i */
        public final /* synthetic */ BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1 f243320i;

        /* renamed from: j */
        public final /* synthetic */ String f243321j;

        /* renamed from: n */
        public final /* synthetic */ C32226l<List<? extends IPkgInfo>, C13598b0> f243322n;

        /* renamed from: o */
        public final /* synthetic */ C83262a f243323o;

        /* renamed from: p */
        public final /* synthetic */ C83263b f243324p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83266e(ConcurrentSkipListSet<IPkgInfo> concurrentSkipListSet, C83368m1.C83374d dVar, C83264c cVar, HashSet<C83368m1.C83374d> hashSet, AtomicBoolean atomicBoolean, BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1 batchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1, String str, C32226l<? super List<? extends IPkgInfo>, C13598b0> lVar, C83262a aVar, C83263b bVar) {
            super(1);
            this.f243315d = concurrentSkipListSet;
            this.f243316e = dVar;
            this.f243317f = cVar;
            this.f243318g = hashSet;
            this.f243319h = atomicBoolean;
            this.f243320i = batchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1;
            this.f243321j = str;
            this.f243322n = lVar;
            this.f243323o = aVar;
            this.f243324p = bVar;
        }

        public Object invoke(Object obj) {
            C83368m1.C83377e eVar = (C83368m1.C83377e) obj;
            C87412m.m108594g(eVar, "response");
            boolean add = this.f243315d.add(eVar.f243626a);
            Log.m105924i("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "waitForPkg " + this.f243316e + " onSuccess(" + eVar.f243626a.pkgVersion() + '|' + eVar.f243627b + ") added(" + add + ')');
            if (add) {
                C83264c cVar = this.f243317f;
                C83368m1.C83374d dVar = this.f243316e;
                C87412m.m108593f(dVar, "request");
                cVar.getClass();
                String pkgPath = eVar.f243626a.pkgPath();
                C87412m.m108591d(pkgPath);
                if (cVar.f243312b.size() == 1) {
                    if (C87412m.m108589b(eVar.f243627b, C83368m1.C83378f.C83380b.f243629a)) {
                        long l = C86013q1.m106451l(pkgPath);
                        cVar.f243311a.invoke(new WxaPkgLoadProgress(100, l, l));
                    }
                } else if (cVar.f243313c.size() > 0) {
                    long l2 = C86013q1.m106451l(pkgPath);
                    cVar.mo115541a(dVar, new WxaPkgLoadProgress(100, l2, l2));
                }
                if (this.f243315d.size() != this.f243318g.size()) {
                    if (eVar.f243627b instanceof C83368m1.C83378f.C83379a) {
                        C83263b bVar = this.f243324p;
                        C83368m1.C83374d dVar2 = this.f243316e;
                        C87412m.m108593f(dVar2, "request");
                        synchronized (bVar) {
                            Iterator<C83368m1.C83374d> it = bVar.f243307c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C83368m1.C83374d next = it.next();
                                next.getClass();
                                if (next.toString().compareTo(dVar2.toString()) == 0) {
                                    it.remove();
                                    bVar.mo115540c();
                                    break;
                                }
                            }
                        }
                    }
                } else if (!this.f243319h.getAndSet(true)) {
                    this.f243320i.dead();
                    Log.m105924i("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "session(" + this.f243321j + ") waitForPkg all completed");
                    this.f243322n.invoke(C110818d0.m150953y0(this.f243315d));
                    C83262a aVar = this.f243323o;
                    if (aVar != null) {
                        aVar.mo115536b();
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$f */
    public static final class C83267f extends C87413o implements C32227p<C83368m1.C83369a, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1 f243325d;

        /* renamed from: e */
        public final /* synthetic */ C83368m1.C83374d f243326e;

        /* renamed from: f */
        public final /* synthetic */ AtomicBoolean f243327f;

        /* renamed from: g */
        public final /* synthetic */ C32227p<Integer, String, C13598b0> f243328g;

        /* renamed from: h */
        public final /* synthetic */ C83262a f243329h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83267f(BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1 batchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1, C83368m1.C83374d dVar, AtomicBoolean atomicBoolean, C32227p<? super Integer, ? super String, C13598b0> pVar, C83262a aVar) {
            super(2);
            this.f243325d = batchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1;
            this.f243326e = dVar;
            this.f243327f = atomicBoolean;
            this.f243328g = pVar;
            this.f243329h = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C83368m1.C83369a aVar = (C83368m1.C83369a) obj;
            String str = (String) obj2;
            C87412m.m108594g(aVar, "err");
            this.f243325d.dead();
            Log.m105920e("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "waitForPkg " + this.f243326e + " onError(" + aVar + ' ' + str + "), stack=" + android.util.Log.getStackTraceString(new Throwable()));
            if (!this.f243327f.getAndSet(true)) {
                this.f243328g.invoke(Integer.valueOf(aVar.f243607d), str);
                this.f243327f.set(true);
            }
            C83262a aVar2 = this.f243329h;
            if (aVar2 != null) {
                C83368m1.C83374d dVar = this.f243326e;
                C87412m.m108593f(dVar, "request");
                aVar2.mo115537c(dVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$g */
    public static final class C83268g extends C87413o implements C32226l<WxaPkgLoadProgress, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C83264c f243330d;

        /* renamed from: e */
        public final /* synthetic */ C83368m1.C83374d f243331e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83268g(C83264c cVar, C83368m1.C83374d dVar) {
            super(1);
            this.f243330d = cVar;
            this.f243331e = dVar;
        }

        public Object invoke(Object obj) {
            WxaPkgLoadProgress wxaPkgLoadProgress = (WxaPkgLoadProgress) obj;
            C87412m.m108594g(wxaPkgLoadProgress, "progress");
            C83264c cVar = this.f243330d;
            C83368m1.C83374d dVar = this.f243331e;
            C87412m.m108593f(dVar, "request");
            cVar.mo115541a(dVar, wxaPkgLoadProgress);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.BatchGetCodePkgExecutor$h */
    public static final class C83269h<T> implements Comparator {

        /* renamed from: d */
        public static final C83269h<T> f243332d = new C83269h<>();

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r6, java.lang.Object r7) {
            /*
                r5 = this;
                com.tencent.mm.plugin.appbrand.appcache.IPkgInfo r6 = (com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo) r6
                com.tencent.mm.plugin.appbrand.appcache.IPkgInfo r7 = (com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo) r7
                java.lang.Class r0 = r6.getClass()
                java.lang.Class r1 = r7.getClass()
                boolean r0 = gy3.C87412m.m108589b(r0, r1)
                r1 = 0
                if (r0 != 0) goto L_0x0014
                goto L_0x003f
            L_0x0014:
                boolean r0 = r6 instanceof com.tencent.p014mm.plugin.appbrand.appcache.WxaPluginPkgInfo
                if (r0 == 0) goto L_0x0030
                r0 = r7
                com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo r0 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPluginPkgInfo) r0
                r2 = r6
                com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo r2 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPluginPkgInfo) r2
                java.lang.String r3 = r2.provider
                java.lang.String r4 = r0.provider
                boolean r3 = gy3.C87412m.m108589b(r3, r4)
                if (r3 == 0) goto L_0x003f
                int r2 = r2.version
                int r0 = r0.version
                if (r2 != r0) goto L_0x003f
                r0 = 1
                goto L_0x0040
            L_0x0030:
                boolean r0 = r6 instanceof com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo
                if (r0 == 0) goto L_0x003f
                r0 = r7
                com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo r0 = (com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo) r0
                r2 = r6
                com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo r2 = (com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo) r2
                boolean r0 = r2.isAssignable(r0)
                goto L_0x0040
            L_0x003f:
                r0 = 0
            L_0x0040:
                if (r0 == 0) goto L_0x0043
                goto L_0x004d
            L_0x0043:
                int r6 = r6.hashCode()
                int r7 = r7.hashCode()
                int r1 = r6 - r7
            L_0x004d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.BatchGetCodePkgExecutor.C83269h.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m102215b(BatchGetCodePkgExecutor batchGetCodePkgExecutor, String str, WxaAttributes.WxaVersionInfo wxaVersionInfo, int i, List list, Map map, QualitySession qualitySession, C32226l lVar, C32226l lVar2, C32227p pVar, boolean z, C90422jy jyVar, C83262a aVar, Map map2, Executor executor, int i2, Object obj) {
        int i3 = i2;
        batchGetCodePkgExecutor.mo115535a(str, wxaVersionInfo, i, list, map, qualitySession, lVar, lVar2, (i3 & 256) != 0 ? C83265d.f243314d : pVar, z, jyVar, (i3 & 2048) != 0 ? null : aVar, (i3 & 4096) != 0 ? null : map2, (i3 & 8192) != 0 ? null : executor);
    }

    /* renamed from: a */
    public final void mo115535a(String str, WxaAttributes.WxaVersionInfo wxaVersionInfo, int i, List<String> list, Map<String, ? extends WxaAttributes.WxaWidgetInfo> map, QualitySession qualitySession, C32226l<? super List<? extends IPkgInfo>, C13598b0> lVar, C32226l<? super WxaPkgLoadProgress, C13598b0> lVar2, C32227p<? super Integer, ? super String, C13598b0> pVar, boolean z, C90422jy jyVar, C83262a aVar, Map<String, Integer> map2, Executor executor) {
        int i2;
        C83368m1.C83381g.C83384c cVar;
        C83368m1.C83374d dVar;
        String str2 = str;
        WxaAttributes.WxaVersionInfo wxaVersionInfo2 = wxaVersionInfo;
        Map<String, ? extends WxaAttributes.WxaWidgetInfo> map3 = map;
        QualitySession qualitySession2 = qualitySession;
        C32226l<? super WxaPkgLoadProgress, C13598b0> lVar3 = lVar2;
        C90422jy jyVar2 = jyVar;
        Map<String, Integer> map4 = map2;
        Class cls = C29583l3.class;
        C87412m.m108594g(str2, "appId");
        C87412m.m108594g(wxaVersionInfo2, "wxaVersionInfo");
        C87412m.m108594g(list, "requestedModuleNames");
        C87412m.m108594g(map3, "pickedModuleInfoList");
        C87412m.m108594g(qualitySession2, "reportQualitySession");
        C87412m.m108594g(lVar, "onSuccess");
        C87412m.m108594g(lVar3, "onProgress");
        C87412m.m108594g(pVar, "onError");
        C87412m.m108594g(jyVar2, "cgiCommRequestSource");
        int i3 = wxaVersionInfo2.f239452d;
        String str3 = "instanceId:" + qualitySession2.f245832d + ", appId:" + str2 + ", modules:(" + C110818d0.m150921S(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + ')';
        int i4 = i3;
        BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1 batchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1 = new BatchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1(str, i3, i, qualitySession2, C40008f.f107254d);
        batchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1.alive();
        HashSet hashSet = new HashSet();
        for (String next : list) {
            WxaAttributes.WxaWidgetInfo wxaWidgetInfo = (WxaAttributes.WxaWidgetInfo) map3.get(next);
            if (wxaWidgetInfo != null) {
                int i5 = wxaWidgetInfo.f239482d;
                if (C81289m.C81290a.m99664b(i)) {
                    i2 = i4;
                    cVar = new C83368m1.C83381g.C83384c(i2, wxaVersionInfo2.f239449B);
                } else {
                    i2 = i4;
                    cVar = new C83368m1.C83381g.C83384c(0, 0, 2, (C8480h) null);
                }
                C83368m1.C83374d dVar2 = r0;
                WxaAttributes.WxaWidgetInfo wxaWidgetInfo2 = wxaWidgetInfo;
                i4 = i2;
                HashSet hashSet2 = hashSet;
                C83368m1.C83374d dVar3 = new C83368m1.C83374d(str, next, i5, i, cVar, z);
                if (C81289m.C81290a.m99664b(i)) {
                    C81161g2.requireAccountInitializedOnDemand();
                    C81258h3 h3Var = C81161g2.f238471g;
                    String j1Var = dVar2.mo115637a().toString();
                    dVar = dVar2;
                    C83368m1.C83381g gVar = dVar.f243620h;
                    C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.launching.ICommonPkgFetcher.VERSION.SPECIFIED");
                    h3Var.mo113527k(j1Var, i, ((C83368m1.C83381g.C83384c) gVar).f243634a, wxaWidgetInfo2.f239483e, (String) null);
                } else {
                    dVar = dVar2;
                }
                hashSet2.add(dVar);
                List<WxaAttributes.WxaPluginCodeInfo> list2 = wxaWidgetInfo2.f239484f;
                if (list2 == null) {
                    list2 = C64186f0.f181907d;
                }
                for (WxaAttributes.WxaPluginCodeInfo wxaPluginCodeInfo : list2) {
                    if (wxaPluginCodeInfo.f239443j > 0) {
                        String str4 = wxaPluginCodeInfo.f239444n;
                        if (!(str4 == null || str4.length() == 0) && 0 == ((C29583l3) C81161g2.Bx0(cls)).mo56823Lo(wxaPluginCodeInfo.f239437d, wxaPluginCodeInfo.f239444n)) {
                            ((C29583l3) C81161g2.Bx0(cls)).mo56825qq(wxaPluginCodeInfo.f239437d, wxaPluginCodeInfo.f239444n, wxaPluginCodeInfo.f239443j);
                        }
                    }
                    int i6 = -1;
                    if (map4 != null) {
                        String str5 = wxaPluginCodeInfo.f239437d;
                        C87412m.m108593f(str5, "plugin.provider");
                        int i7 = map4.get(str5);
                        if (i7 == null) {
                            i7 = -1;
                        }
                        i6 = i7.intValue();
                    }
                    hashSet2.add(C83510w0.m102479b(wxaPluginCodeInfo, i6));
                }
                String str6 = str;
                wxaVersionInfo2 = wxaVersionInfo;
                hashSet = hashSet2;
            } else {
                throw new IllegalStateException(("Invalid ModuleName(" + next + ')').toString());
            }
        }
        HashSet hashSet3 = hashSet;
        if (hashSet3.size() > 0) {
            C83263b bVar = new C83263b(str3, hashSet3, jyVar2);
            C83264c cVar2 = new C83264c(str3, hashSet3, lVar3);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet(C83269h.f243332d);
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                C83368m1.C83374d dVar4 = (C83368m1.C83374d) it.next();
                C83368m1.C83370b bVar2 = C83368m1.f243597a;
                C87412m.m108593f(dVar4, "request");
                C83368m1.C83374d dVar5 = dVar4;
                AtomicBoolean atomicBoolean3 = atomicBoolean;
                C83368m1.C83374d dVar6 = dVar5;
                C83368m1.C83370b.m102315a(bVar2, dVar6, new C83266e(concurrentSkipListSet, dVar4, cVar2, hashSet3, atomicBoolean2, batchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1, str3, lVar, aVar, bVar), new C83267f(batchGetCodePkgExecutor$waitForPkgList$qualityReportListener$1, dVar5, atomicBoolean3, pVar, aVar), new C83268g(cVar2, dVar6), bVar, 0, jyVar, aVar, executor, 32, (Object) null);
                concurrentSkipListSet = concurrentSkipListSet;
                atomicBoolean2 = atomicBoolean2;
                atomicBoolean = atomicBoolean3;
                cVar2 = cVar2;
            }
            return;
        }
        throw new IllegalStateException("RequestPkgInfoList.size==0".toString());
    }
}
