package op0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import js0.C88021l;
import js0.C9514m;
import op0.C89251a;
import p210o.C11323a;
import p963fc.C86812g;
import sx3.C26236u;

/* renamed from: op0.l */
public final class C89269l implements C89251a {

    /* renamed from: d */
    public static final Executor f257179d = C11703d.f34268b;

    /* renamed from: a */
    public final Set<String> f257180a = new HashSet();

    /* renamed from: b */
    public final C88021l<String, C89275e> f257181b = new C88021l<>();

    /* renamed from: c */
    public final C86812g f257182c;

    /* renamed from: op0.l$a */
    public class C89270a implements C89251a.C89253b {

        /* renamed from: a */
        public final /* synthetic */ boolean f257183a;

        /* renamed from: b */
        public final /* synthetic */ ModulePkgInfo f257184b;

        /* renamed from: c */
        public final /* synthetic */ C89251a.C89253b f257185c;

        public C89270a(boolean z, ModulePkgInfo modulePkgInfo, C89251a.C89253b bVar) {
            this.f257183a = z;
            this.f257184b = modulePkgInfo;
            this.f257185c = bVar;
        }

        /* renamed from: a */
        public /* synthetic */ void mo114320a(List list) {
        }

        /* renamed from: b */
        public void mo114321b(C89251a.C89255d dVar) {
            if (C89251a.C89255d.OK == dVar && this.f257183a) {
                if (!this.f257184b.independent) {
                    C89269l.this.mo123583i(ModulePkgInfo.MAIN_MODULE_NAME, "options.injectModuleJS");
                }
                C89269l.this.mo123583i(this.f257184b.name, "options.injectModuleJS");
            }
            C89251a.C89253b bVar = this.f257185c;
            if (bVar != null) {
                bVar.mo114321b(dVar);
            }
        }
    }

    /* renamed from: op0.l$b */
    public class C89271b implements C89251a.C89253b {

        /* renamed from: a */
        public final /* synthetic */ C35256b f257187a;

        public C89271b(C89269l lVar, C35256b bVar) {
            this.f257187a = bVar;
        }

        /* renamed from: a */
        public /* synthetic */ void mo114320a(List list) {
        }

        /* renamed from: b */
        public void mo114321b(C89251a.C89255d dVar) {
            this.f257187a.mo59925a((Runnable) null);
        }
    }

    /* renamed from: op0.l$c */
    public class C89272c implements C89260f {

        /* renamed from: a */
        public final /* synthetic */ String f257188a;

        /* renamed from: b */
        public final /* synthetic */ C35256b f257189b;

        /* renamed from: op0.l$c$a */
        public class C89273a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C11323a f257191d;

            public C89273a(C11323a aVar) {
                this.f257191d = aVar;
            }

            public void run() {
                boolean k0 = C89269l.this.f257182c.mo113064k0();
                boolean z = C89269l.this.f257182c.f238117P;
                boolean booleanValue = (k0 || z) ? false : ((Boolean) this.f257191d.apply(C89269l.this.f257182c)).booleanValue();
                Log.m105925i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "onLoad onResultCustomAction, runtime(%s), moduleName(%s) destroyed(%b) isFinishing(%b) loaded(%b)", C89269l.this.f257182c.toString(), C89272c.this.f257188a, Boolean.valueOf(k0), Boolean.valueOf(z), Boolean.valueOf(booleanValue));
                if (!k0 && !z) {
                    if (booleanValue && !C89269l.this.f257182c.mo113008F().f239613s.booleanValue()) {
                        C89269l.this.f257182c.mo113218v1();
                    }
                    C89272c cVar = C89272c.this;
                    C89269l.m111568e(C89269l.this, cVar.f257188a, booleanValue ? C89251a.C89255d.OK : C89251a.C89255d.FAIL);
                }
            }
        }

        public C89272c(String str, boolean z, C35256b bVar) {
            this.f257188a = str;
            this.f257189b = bVar;
        }

        /* renamed from: a */
        public void mo114282a(C11323a<AppBrandRuntime, Boolean> aVar) {
            this.f257189b.mo59925a(new C89273a(aVar));
        }

        /* renamed from: b */
        public void mo114283b(WxaPkgLoadProgress wxaPkgLoadProgress) {
            Log.m105925i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "hy: on load module progress %s", wxaPkgLoadProgress);
            C89269l lVar = C89269l.this;
            Set<C89275e> d = lVar.f257181b.mo122463d(this.f257188a);
            if (d != null) {
                for (C89275e eVar : d) {
                    C89251a.C89252a aVar = eVar.f257197b;
                    if (aVar != null) {
                        aVar.mo123572a(wxaPkgLoadProgress);
                    }
                }
            }
        }
    }

    /* renamed from: op0.l$d */
    public static final class C89274d {

        /* renamed from: a */
        public boolean f257193a = false;

        /* renamed from: b */
        public boolean f257194b = true;

        /* renamed from: c */
        public Executor f257195c;

        public C89274d(C89263i iVar) {
            Executor executor = C89269l.f257179d;
            this.f257195c = C11703d.f34268b;
        }

        public String toString() {
            return "LoadModuleOptions{showPrompt=" + this.f257193a + ", injectModuleJS=" + this.f257194b + ", executor=" + this.f257195c + '}';
        }
    }

    /* renamed from: op0.l$e */
    public static class C89275e {

        /* renamed from: a */
        public final C89251a.C89253b f257196a;

        /* renamed from: b */
        public final C89251a.C89252a f257197b;

        public C89275e(C89251a.C89253b bVar, C89251a.C89252a aVar) {
            this.f257196a = bVar;
            this.f257197b = aVar;
        }
    }

    public C89269l(C86812g gVar) {
        this.f257182c = gVar;
    }

    /* renamed from: e */
    public static void m111568e(C89269l lVar, String str, C89251a.C89255d dVar) {
        synchronized (lVar.f257180a) {
            ((HashSet) lVar.f257180a).remove(str);
        }
        Set<C89275e> g = lVar.f257181b.mo122466g(str);
        if (g == null) {
            Log.m105921e("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "markLoadingFinished %s, result %s, get null callbackSet, maybe canceled by user before", str, dVar.name());
            return;
        }
        for (C89275e eVar : g) {
            C89251a.C89253b bVar = eVar.f257196a;
            if (bVar != null) {
                bVar.mo114321b(dVar);
            }
        }
    }

    /* renamed from: a */
    public void mo109805a(String str, C89251a.C89253b bVar) {
        C89274d dVar = new C89274d((C89263i) null);
        dVar.f257193a = true;
        dVar.f257194b = true;
        dVar.f257195c = C11703d.f34267a;
        if (this.f257182c.mo113064k0()) {
            Log.m105921e("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule with path(%s), but runtime(%s) finished", str, this.f257182c.f238147j);
            if (bVar != null) {
                bVar.mo114321b(C89251a.C89255d.FAIL);
                return;
            }
            return;
        }
        C9514m mVar = new C9514m();
        T h = Util.isNullOrNil(str) ? this.f257182c.mo113051d0().f261072r : mo123582h(str);
        mVar.f29691a = h;
        if (mo123581g(h)) {
            Log.m105925i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule appId:%s path:%s, module:%s, options:%b, [loaded]", this.f257182c.f238147j, str, ((ModulePkgInfo) mVar.f29691a).name, dVar);
            if (bVar != null) {
                if (dVar.f257194b) {
                    mo123583i(((ModulePkgInfo) mVar.f29691a).name, "options.injectModuleJS");
                }
                bVar.mo114321b(C89251a.C89255d.OK);
                return;
            }
        }
        C9514m mVar2 = new C9514m();
        PBool pBool = new PBool();
        if (dVar.f257193a) {
            this.f257182c.mo113024P0(new C89263i(this, pBool, mVar, mVar2));
        }
        Log.m105925i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule, appId:%s path:%s, module:%s, options:%b [do loadOrAddPendingCallback]", this.f257182c.f238147j, str, ((ModulePkgInfo) mVar.f29691a).name, dVar);
        mo123584j((ModulePkgInfo) mVar.f29691a, new C89266j(this, bVar, pBool, dVar, mVar, mVar2), true, new C89268k(this, mVar, (C89251a.C89252a) null, mVar2), dVar.f257195c);
    }

    /* renamed from: b */
    public void mo123569b(String str, C89251a.C89253b bVar, C89251a.C89252a aVar, boolean z) {
        ModulePkgInfo modulePkgInfo;
        if (TextUtils.isEmpty(str)) {
            modulePkgInfo = null;
        } else {
            WxaPkgWrappingInfo wxaPkgWrappingInfo = this.f257182c.mo113051d0().f261072r;
            C87412m.m108594g(str, "pathOrModuleName");
            boolean b = C87412m.m108589b(C89277n.m111584a(C26236u.m33719b(wxaPkgWrappingInfo), str, "findModuleInfoByModuleName", false, 4, (Object) null), wxaPkgWrappingInfo);
            modulePkgInfo = wxaPkgWrappingInfo;
            if (!b) {
                String b2 = ModulePkgInfo.MAIN_MODULE_NAME.equals(str) ? str : C81412d0.m99868b(str, false);
                C81247g3.m99555k(this.f257182c, false).mo113505h();
                LinkedList<ModulePkgInfo> linkedList = wxaPkgWrappingInfo.f238588g;
                C87412m.m108594g(linkedList, "<this>");
                C87412m.m108594g(b2, "pathOrModule");
                modulePkgInfo = (ModulePkgInfo) C89277n.m111584a(linkedList, b2, "findModuleInfoByModuleName", false, 4, (Object) null);
            }
        }
        ModulePkgInfo modulePkgInfo2 = modulePkgInfo;
        if (modulePkgInfo2 == null) {
            Log.m105925i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModuleByName, appId:%s, name:%s, injectModuleJS:%b, [not found]", this.f257182c.f238147j, str, Boolean.valueOf(z));
            if (bVar != null) {
                bVar.mo114321b(C89251a.C89255d.MODULE_NOT_FOUND);
            }
        } else if (mo123581g(modulePkgInfo2)) {
            Log.m105925i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModuleByName, appId:%s, name:%s, injectModuleJS:%b, [loaded]", this.f257182c.f238147j, str, Boolean.valueOf(z));
            if (z) {
                mo123583i(modulePkgInfo2.name, "options.injectModuleJS");
            }
            if (bVar != null) {
                bVar.mo114321b(C89251a.C89255d.OK);
            }
        } else {
            Log.m105925i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModuleByName, appId:%s, name:%s, injectModuleJS:%b, [do loadOrAddPendingCallback]", this.f257182c.f238147j, str, Boolean.valueOf(z));
            mo123584j(modulePkgInfo2, new C89270a(z, modulePkgInfo2, bVar), true, aVar, C11703d.f34268b);
        }
    }

    /* renamed from: c */
    public String mo123570c(String str) {
        return mo123582h(str).name;
    }

    /* renamed from: d */
    public boolean mo123571d() {
        return true;
    }

    /* renamed from: f */
    public final void mo123580f(String str, C89251a.C89253b bVar, C89251a.C89252a aVar) {
        boolean contains;
        if (bVar != null || aVar != null) {
            synchronized (this.f257180a) {
                contains = ((HashSet) this.f257180a).contains(str);
            }
            if (!contains) {
                if (mo123581g(Util.isNullOrNil(str) ? this.f257182c.mo113051d0().f261072r : mo123582h(str))) {
                    if (bVar != null) {
                        bVar.mo114321b(C89251a.C89255d.OK);
                        return;
                    }
                    return;
                }
            }
            this.f257181b.mo122464e(str, new C89275e(bVar, aVar));
        }
    }

    /* renamed from: g */
    public final boolean mo123581g(ModulePkgInfo modulePkgInfo) {
        boolean z = !Util.isNullOrNil(modulePkgInfo.pkgPath) && C86013q1.m106450k(modulePkgInfo.pkgPath);
        if (z) {
            if (!modulePkgInfo.independent) {
                mo123583i(ModulePkgInfo.MAIN_MODULE_NAME, "checkModuleLoaded");
            }
            mo123583i(modulePkgInfo.name, "checkModuleLoaded");
        }
        return z;
    }

    /* renamed from: h */
    public ModulePkgInfo mo123582h(String str) {
        WxaPkgWrappingInfo wxaPkgWrappingInfo = this.f257182c.mo113051d0().f261072r;
        if (!Util.isNullOrNil(str) && !ModulePkgInfo.MAIN_MODULE_NAME.equals(str)) {
            C81247g3.m99555k(this.f257182c, false).mo113505h();
            LinkedList<ModulePkgInfo> linkedList = wxaPkgWrappingInfo.f238588g;
            C87412m.m108594g(linkedList, "<this>");
            C87412m.m108594g(str, "pathOrModule");
            ModulePkgInfo modulePkgInfo = (ModulePkgInfo) C89277n.m111584a(linkedList, str, "findModuleInfoByResourcePath", false, 4, (Object) null);
            if (modulePkgInfo != null) {
                return modulePkgInfo;
            }
        }
        return wxaPkgWrappingInfo;
    }

    /* renamed from: i */
    public final void mo123583i(String str, String str2) {
        Log.m105925i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "injectServiceScriptSafe appId:%s, module:%s, reason:%s ret:%b", this.f257182c.f238147j, str, str2, Boolean.valueOf(((C89262h) this.f257182c.mo113047b0()).mo114094g(str)));
    }

    /* renamed from: j */
    public final void mo123584j(ModulePkgInfo modulePkgInfo, C89251a.C89253b bVar, boolean z, C89251a.C89252a aVar, Executor executor) {
        boolean contains;
        String str = modulePkgInfo.name;
        boolean z2 = !ModulePkgInfo.MAIN_MODULE_NAME.equals(str) && !modulePkgInfo.independent && !mo123581g(this.f257182c.mo113051d0().f261072r);
        if (z && bVar != null) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            if (z2) {
                linkedList.add(ModulePkgInfo.MAIN_MODULE_NAME);
            }
            bVar.mo114320a(linkedList);
        }
        if (z2) {
            mo123584j(this.f257182c.mo113051d0().f261072r, (C89251a.C89253b) null, false, (C89251a.C89252a) null, executor);
        }
        Log.m105925i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "loadModule, name %s, independent %b, should ensure __APP__ %b", modulePkgInfo.name, Boolean.valueOf(modulePkgInfo.independent), Boolean.valueOf(z2));
        mo123580f(str, bVar, aVar);
        synchronized (this.f257180a) {
            contains = ((HashSet) this.f257180a).contains(str);
            if (!contains) {
                ((HashSet) this.f257180a).add(str);
            }
        }
        if (!contains) {
            C35256b bVar2 = new C35256b(2);
            if (z2) {
                mo123580f(ModulePkgInfo.MAIN_MODULE_NAME, new C89271b(this, bVar2), (C89251a.C89252a) null);
            } else {
                bVar2.mo59925a((Runnable) null);
            }
            String h = this.f257182c.mo113051d0().f261072r.mo113447h(this.f257182c.f238147j, str);
            C89261g gVar = C89261g.f257161a;
            C86812g gVar2 = this.f257182c;
            ((ModularizingPkgRetrieverSeparatedPluginsCompatible.C83278a) gVar).getClass();
            C87412m.m108594g(gVar2, "runtime");
            C87412m.m108594g(h, "requestModuleName");
            ModularizingPkgRetrieverSeparatedPluginsCompatible modularizingPkgRetrieverSeparatedPluginsCompatible = new ModularizingPkgRetrieverSeparatedPluginsCompatible(gVar2, h);
            modularizingPkgRetrieverSeparatedPluginsCompatible.mo115564a(new C89272c(str, z2, bVar2));
            modularizingPkgRetrieverSeparatedPluginsCompatible.mo115566c(executor);
        }
    }
}
