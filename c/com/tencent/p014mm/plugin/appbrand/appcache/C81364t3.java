package com.tencent.p014mm.plugin.appbrand.appcache;

import android.util.ArrayMap;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime$$h;
import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import rx3.C13598b0;
import s24.C90125c;
import sx3.C110818d0;
import sx3.C64186f0;
import wi0.C90987k;
import wi0.C90988l;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.t3 */
public final class C81364t3 implements C81298o0 {

    /* renamed from: j */
    public static final C81365a f238855j = new C81365a((C8480h) null);

    /* renamed from: a */
    public final C81366b f238856a;

    /* renamed from: b */
    public final String f238857b;

    /* renamed from: c */
    public final WxaPkgWrappingInfo f238858c;

    /* renamed from: d */
    public final C90987k f238859d;

    /* renamed from: e */
    public final ConcurrentHashMap<String, WxaPkg> f238860e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public final ConcurrentHashMap<String, C81298o0.C81299a> f238861f = new ConcurrentHashMap<>(100);

    /* renamed from: g */
    public boolean f238862g;

    /* renamed from: h */
    public volatile boolean f238863h;

    /* renamed from: i */
    public final ReentrantReadWriteLock f238864i;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t3$a */
    public static final class C81365a {
        public C81365a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo113652a(String str, WxaPluginPkgInfo wxaPluginPkgInfo) {
            C87412m.m108594g(str, "hostModule");
            C87412m.m108594g(wxaPluginPkgInfo, "plugin");
            if (C87412m.m108589b(str, ModulePkgInfo.MAIN_MODULE_NAME)) {
                return mo113653b(wxaPluginPkgInfo);
            }
            if (C112550d0.m153804x(str, XVFSFile.SEPARATOR_CHAR, false, 2, (Object) null)) {
                return str + mo113653b(wxaPluginPkgInfo);
            }
            return str + XVFSFile.SEPARATOR_CHAR + mo113653b(wxaPluginPkgInfo);
        }

        /* renamed from: b */
        public final String mo113653b(WxaPluginPkgInfo wxaPluginPkgInfo) {
            String str = wxaPluginPkgInfo.prefixPath;
            if (!(str == null || str.length() == 0)) {
                String str2 = wxaPluginPkgInfo.prefixPath;
                C87412m.m108593f(str2, "{\n                this.prefixPath\n            }");
                return str2;
            }
            return WxaPluginPkgInfo.PREFIX_EXTENDED + wxaPluginPkgInfo.provider;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t3$b */
    public interface C81366b {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t3$c */
    public static final class C81367c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C81364t3 f238865d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81367c(C81364t3 t3Var) {
            super(0);
            this.f238865d = t3Var;
        }

        public Object invoke() {
            Set<Map.Entry<String, WxaPkg>> entrySet = this.f238865d.f238860e.entrySet();
            C87412m.m108593f(entrySet, "pkgsMap.entries");
            for (Map.Entry entry : entrySet) {
                C87412m.m108593f(entry, "(_, pkg)");
                ((WxaPkg) entry.getValue()).close();
            }
            this.f238865d.f238860e.clear();
            this.f238865d.f238861f.clear();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t3$d */
    public static final class C81368d extends C87413o implements C32224a<WxaPkg> {

        /* renamed from: d */
        public final /* synthetic */ C81364t3 f238866d;

        /* renamed from: e */
        public final /* synthetic */ String f238867e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81368d(C81364t3 t3Var, String str) {
            super(0);
            this.f238866d = t3Var;
            this.f238867e = str;
        }

        public Object invoke() {
            C81298o0.C81299a aVar = this.f238866d.f238861f.get(this.f238867e);
            WxaPkg wxaPkg = aVar != null ? aVar.f238719d : null;
            if (wxaPkg != null) {
                return wxaPkg;
            }
            ConcurrentHashMap<String, C81298o0.C81299a> concurrentHashMap = this.f238866d.f238861f;
            String str = this.f238867e;
            for (Map.Entry next : concurrentHashMap.entrySet()) {
                C81298o0.C81299a aVar2 = (C81298o0.C81299a) next.getValue();
                if (C112551y.m153820t((String) next.getKey(), str, false, 2, (Object) null)) {
                    return aVar2.f238719d;
                }
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t3$e */
    public static final class C81369e extends C87413o implements C32224a<LinkedList<String>> {

        /* renamed from: d */
        public final /* synthetic */ C81364t3 f238868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81369e(C81364t3 t3Var) {
            super(0);
            this.f238868d = t3Var;
        }

        public Object invoke() {
            LinkedList linkedList = new LinkedList();
            for (Map.Entry next : this.f238868d.f238861f.entrySet()) {
                String str = (String) next.getKey();
                if (((C81298o0.C81299a) next.getValue()).f238721f != null) {
                    linkedList.add(str);
                }
            }
            return linkedList;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t3$f */
    public static final class C81370f extends C87413o implements C32224a<C81298o0.C81299a> {

        /* renamed from: d */
        public final /* synthetic */ C81364t3 f238869d;

        /* renamed from: e */
        public final /* synthetic */ String f238870e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81370f(C81364t3 t3Var, String str) {
            super(0);
            this.f238869d = t3Var;
            this.f238870e = str;
        }

        public Object invoke() {
            C81298o0.C81299a aVar = this.f238869d.f238861f.get(this.f238870e);
            if (aVar != null) {
                return aVar;
            }
            String str = this.f238870e;
            C81364t3 t3Var = this.f238869d;
            C81298o0.C81299a aVar2 = null;
            String[] strArr = {C81412d0.m99868b(str, true), C81412d0.m99875i(str)};
            for (int i = 0; i < 2; i++) {
                String str2 = strArr[i];
                if (!C87412m.m108589b(str2, str) && (aVar2 = t3Var.f238861f.get(str2)) != null) {
                    break;
                }
            }
            return aVar2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.t3$g */
    public static final class C81371g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C81364t3 f238871d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81371g(C81364t3 t3Var) {
            super(0);
            this.f238871d = t3Var;
        }

        public Object invoke() {
            boolean z;
            boolean z2;
            ModulePkgInfo modulePkgInfo;
            List<WxaPluginPkgInfo> list;
            ModulePkgInfo modulePkgInfo2;
            C81364t3 t3Var = this.f238871d;
            t3Var.f238858c.mo113449m(t3Var.f238857b);
            WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = this.f238871d.f238858c.f238590i;
            if (wxaRuntimeModulePluginListMap != null) {
                wxaRuntimeModulePluginListMap.mo113468e();
            }
            C81364t3 t3Var2 = this.f238871d;
            ArrayMap arrayMap = new ArrayMap(this.f238871d.f238858c.f238588g.size() + 1);
            WxaPkgWrappingInfo wxaPkgWrappingInfo = this.f238871d.f238858c;
            wxaPkgWrappingInfo.getClass();
            boolean z3 = false;
            Iterator<ModulePkgInfo> it = null;
            boolean z4 = false;
            while (true) {
                if (!z4) {
                    z = true;
                } else {
                    if (it == null) {
                        it = wxaPkgWrappingInfo.f238588g.iterator();
                    }
                    z = it.hasNext();
                }
                if (!z) {
                    break;
                }
                if (!z4) {
                    modulePkgInfo2 = wxaPkgWrappingInfo;
                    z4 = true;
                } else {
                    modulePkgInfo2 = it.next();
                }
                arrayMap.put(modulePkgInfo2.name, modulePkgInfo2);
            }
            t3Var2.getClass();
            WxaPkgWrappingInfo wxaPkgWrappingInfo2 = this.f238871d.f238858c;
            wxaPkgWrappingInfo2.getClass();
            Iterator<ModulePkgInfo> it4 = null;
            while (true) {
                if (!z3) {
                    z2 = true;
                } else {
                    if (it4 == null) {
                        it4 = wxaPkgWrappingInfo2.f238588g.iterator();
                    }
                    z2 = it4.hasNext();
                }
                if (!z2) {
                    return C13598b0.f38549a;
                }
                if (!z3) {
                    modulePkgInfo = wxaPkgWrappingInfo2;
                    z3 = true;
                } else {
                    modulePkgInfo = it4.next();
                }
                if (C86013q1.m106450k(modulePkgInfo.pkgPath)) {
                    C81364t3.m99795j(this.f238871d, modulePkgInfo);
                    WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap2 = this.f238871d.f238858c.f238590i;
                    if (wxaRuntimeModulePluginListMap2 != null) {
                        String str = modulePkgInfo.name;
                        C87412m.m108593f(str, "module.name");
                        list = wxaRuntimeModulePluginListMap2.mo113464b(str);
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = C64186f0.f181907d;
                    }
                    for (WxaPluginPkgInfo k : list) {
                        C81364t3 t3Var3 = this.f238871d;
                        String str2 = modulePkgInfo.name;
                        C87412m.m108593f(str2, "module.name");
                        C81364t3.m99796k(t3Var3, str2, k);
                    }
                }
            }
        }
    }

    public C81364t3(AppBrandRuntime appBrandRuntime, C81366b bVar) {
        C87412m.m108594g(appBrandRuntime, "rt");
        this.f238856a = bVar;
        this.f238857b = appBrandRuntime.f238147j;
        C1727m O = appBrandRuntime.mo113021O(C90988l.class, false);
        C87412m.m108591d(O);
        WxaPkgWrappingInfo wxaPkgWrappingInfo = ((C90988l) O).f261072r;
        C87412m.m108591d(wxaPkgWrappingInfo);
        this.f238858c = wxaPkgWrappingInfo;
        Log.m105924i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "<init> appId:" + appBrandRuntime.f238147j + ", pkg:" + wxaPkgWrappingInfo + ", hash:" + hashCode());
        C90987k kVar = new C90987k();
        ((AppBrandRuntime$$h) appBrandRuntime.f238104B).add(kVar);
        this.f238859d = kVar;
        this.f238864i = new ReentrantReadWriteLock();
    }

    /* renamed from: j */
    public static final void m99795j(C81364t3 t3Var, ModulePkgInfo modulePkgInfo) {
        t3Var.getClass();
        String str = modulePkgInfo.name;
        C87412m.m108593f(str, "module.name");
        WxaPkg l = t3Var.mo113649l(str, new C81375v3(modulePkgInfo));
        C87412m.m108591d(l);
        C81373u3 u3Var = new C81373u3(t3Var, modulePkgInfo);
        ConcurrentHashMap<String, C81298o0.C81299a> concurrentHashMap = t3Var.f238861f;
        String str2 = modulePkgInfo.name;
        C87412m.m108593f(str2, "module.name");
        C81298o0.C81299a aVar = new C81298o0.C81299a();
        aVar.f238719d = l;
        aVar.f238720e = l.mo63190c();
        aVar.f238721f = modulePkgInfo.name;
        u3Var.invoke(aVar);
        concurrentHashMap.put(str2, aVar);
        for (WxaPkg.Info next : l.mo113434g()) {
            ConcurrentHashMap<String, C81298o0.C81299a> concurrentHashMap2 = t3Var.f238861f;
            String str3 = next.f238570e;
            C87412m.m108593f(str3, "info.fileName");
            C81298o0.C81299a aVar2 = new C81298o0.C81299a();
            aVar2.f238719d = l;
            aVar2.f238720e = l.mo63190c();
            aVar2.f238721f = next.f238570e;
            aVar2.f238722g = next.f238571f;
            aVar2.f238723h = next.f238572g;
            u3Var.invoke(aVar2);
            concurrentHashMap2.put(str3, aVar2);
        }
    }

    /* renamed from: k */
    public static final void m99796k(C81364t3 t3Var, String str, WxaPluginPkgInfo wxaPluginPkgInfo) {
        String str2;
        C81364t3 t3Var2 = t3Var;
        String str3 = str;
        WxaPluginPkgInfo wxaPluginPkgInfo2 = wxaPluginPkgInfo;
        t3Var.getClass();
        C81365a aVar = f238855j;
        String a = aVar.mo113652a(str3, wxaPluginPkgInfo2);
        if (t3Var2.f238861f.get(a) == null) {
            String str4 = wxaPluginPkgInfo2.provider;
            C87412m.m108593f(str4, "plugin.provider");
            WxaPkg l = t3Var2.mo113649l(str4, new C81391x3(wxaPluginPkgInfo2));
            C87412m.m108591d(l);
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || Log.getLogLevel() <= 1) {
                Log.m105924i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "guardedMergePlugin hostModule:" + str3 + ", accessPrefix:" + a + ", files:" + C110818d0.m150921S(new LinkedList(l.f238565h.keySet()), " , ", "{", "}", 0, (CharSequence) null, (C32226l) null, 56, (Object) null));
                StringBuilder sb = new StringBuilder();
                sb.append("guardedMergePlugin hostModule:");
                sb.append(str3);
                sb.append(", accessPrefix:");
                sb.append(a);
                sb.append(", json:");
                InputStream a2 = l.mo63188a("/plugin.json");
                sb.append(a2 == null ? null : C90125c.m112777d(a2, StandardCharsets.UTF_8));
                Log.m105924i("Luggage.FULL.WxaRuntimePkgMergeDirReader", sb.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("guardedMergePlugin hostModule:");
                sb4.append(str3);
                sb4.append(", accessPrefix:");
                sb4.append(a);
                sb4.append(", darkmode-json:");
                InputStream a3 = l.mo63188a("/plugin-darkmode.json");
                sb4.append(a3 == null ? null : C90125c.m112777d(a3, StandardCharsets.UTF_8));
                Log.m105924i("Luggage.FULL.WxaRuntimePkgMergeDirReader", sb4.toString());
                Log.m105924i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "guardedMergePlugin hostModule:" + str3 + ", accessPrefix:" + a + ", stack:" + android.util.Log.getStackTraceString(new Throwable()));
            }
            C81384w3 w3Var = new C81384w3(wxaPluginPkgInfo2);
            ConcurrentHashMap<String, C81298o0.C81299a> concurrentHashMap = t3Var2.f238861f;
            C81298o0.C81299a aVar2 = new C81298o0.C81299a();
            aVar2.f238719d = l;
            aVar2.f238720e = l.mo63190c();
            w3Var.invoke(aVar2);
            concurrentHashMap.put(a, aVar2);
            String str5 = wxaPluginPkgInfo2.prefixPath;
            if (str5 == null || str5.length() == 0) {
                str2 = a.substring(0, a.length() - aVar.mo113653b(wxaPluginPkgInfo2).length());
                C87412m.m108593f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str2 = a;
            }
            if (C112550d0.m153804x(str2, XVFSFile.SEPARATOR_CHAR, false, 2, (Object) null)) {
                str2 = str2.substring(0, str2.length() - 1);
                C87412m.m108593f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            for (WxaPkg.Info next : l.mo113434g()) {
                ConcurrentHashMap<String, C81298o0.C81299a> concurrentHashMap2 = t3Var2.f238861f;
                C81298o0.C81299a aVar3 = new C81298o0.C81299a();
                aVar3.f238719d = l;
                aVar3.f238720e = l.mo63190c();
                aVar3.f238721f = next.f238570e;
                aVar3.f238722g = next.f238571f;
                aVar3.f238723h = next.f238572g;
                w3Var.invoke(aVar3);
                concurrentHashMap2.put(str2 + C81412d0.m99868b(next.f238570e, false), aVar3);
            }
            C90987k kVar = t3Var2.f238859d;
            if (kVar != null) {
                C87412m.m108594g(a, "pluginAccessPrefix");
                synchronized (kVar.f261058d) {
                    kVar.f261058d.add(a);
                    C81634a aVar4 = kVar.f261059e;
                    if (aVar4 != null) {
                        C81298o0 o0Var = kVar.f261060f;
                        if (o0Var != null) {
                            C13598b0 b0Var = C13598b0.f38549a;
                            kVar.mo125061a(aVar4, o0Var, a);
                            return;
                        }
                        C87412m.m108603p("mPkgFileReader");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public List<ModulePkgInfo> mo113497a() {
        LinkedList<ModulePkgInfo> linkedList = this.f238858c.f238588g;
        C87412m.m108593f(linkedList, "pkgWrappingInfo.moduleList");
        return linkedList;
    }

    /* renamed from: b */
    public WxaPkg mo113498b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (WxaPkg) mo113650m(new C81368d(this, str));
    }

    /* renamed from: c */
    public boolean mo113499c(String str, boolean z) {
        boolean z2 = openReadPartialInfo(str) != null;
        if (z) {
            Log.m105924i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "canAccessFile appId:" + this.f238857b + ", url:" + str + ", ret:" + z2 + ", hash:" + hashCode());
        }
        return z2;
    }

    public void close() {
        Log.m105924i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "close, appId:" + this.f238857b + ", hash:" + hashCode());
        mo113651n(new C81367c(this));
        this.f238863h = true;
    }

    /* renamed from: d */
    public boolean mo113501d(String str) {
        return openReadPartialInfo(str) != null;
    }

    /* renamed from: e */
    public List<String> mo113502e() {
        return (List) mo113650m(new C81369e(this));
    }

    /* renamed from: g */
    public InputStream mo113504g(String str) {
        C81298o0.C81299a openReadPartialInfo = openReadPartialInfo(str);
        if (openReadPartialInfo != null) {
            return openReadPartialInfo.f238719d.mo63188a(openReadPartialInfo.f238721f);
        }
        return null;
    }

    /* renamed from: h */
    public void mo113505h() {
        if (!this.f238862g) {
            mo113651n(new C81371g(this));
            this.f238862g = true;
        }
    }

    /* renamed from: l */
    public final WxaPkg mo113649l(String str, C32224a<WxaPkg> aVar) {
        C81366b bVar;
        WxaPkg wxaPkg = this.f238860e.get(str);
        if (wxaPkg != null) {
            return wxaPkg;
        }
        WxaPkg invoke = aVar.invoke();
        if (invoke == null) {
            return null;
        }
        boolean b = invoke.mo63189b();
        Log.m105924i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "guardedObtainPkgInstance, appId:" + this.f238857b + ", name:" + str + ", pkgInnerVersion:" + invoke.mo113436j() + ", ok:" + b);
        if (!b && (bVar = this.f238856a) != null) {
            C81247g3 g3Var = (C81247g3) bVar;
            g3Var.f238651c.mo113017L0(!g3Var.f238653e, str, invoke);
        }
        this.f238860e.put(str, invoke);
        return invoke;
    }

    /* renamed from: m */
    public final <T> T mo113650m(C32224a<? extends T> aVar) {
        ReentrantReadWriteLock.ReadLock readLock = this.f238864i.readLock();
        readLock.lock();
        try {
            return aVar.invoke();
        } finally {
            readLock.unlock();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: n */
    public final <T> T mo113651n(fy3.C32224a<? extends T> r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.f238864i
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.lang.Object r6 = r6.invoke()     // Catch:{ all -> 0x0033 }
        L_0x0027:
            if (r3 >= r2) goto L_0x002f
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0027
        L_0x002f:
            r0.unlock()
            return r6
        L_0x0033:
            r6 = move-exception
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81364t3.mo113651n(fy3.a):java.lang.Object");
    }

    public C81298o0.C81299a openReadPartialInfo(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (C81298o0.C81299a) mo113650m(new C81370f(this, str));
    }
}
