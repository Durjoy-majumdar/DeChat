package g70;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.plugin.magicbrush.base.MBBootsPkgManagementBase;
import com.tencent.p014mm.plugin.magicbrush.base.MBBootsPkgManagementPublicService;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import d42.C86186n;
import d42.C86190s;
import di3.C7335d;
import di3.C86312j;
import e42.C86431j;
import e42.C86434m;
import e42.C86436p;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.HashSet;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: g70.m */
public final class C87166m extends C8239c {

    /* renamed from: a */
    public final Collection<C86431j<C8239c>> f252803a;

    /* renamed from: b */
    public C86190s f252804b;

    /* renamed from: c */
    public final C13601g f252805c = C36568h.m40985a(C32342b.f85837d);

    /* renamed from: d */
    public final C13601g f252806d = C36568h.m40985a(new C87167a(this));

    /* renamed from: g70.m$b */
    public static final class C32342b extends C87413o implements C32224a<MBBootsPkgManagementPublicService> {

        /* renamed from: d */
        public static final C32342b f85837d = new C32342b();

        public C32342b() {
            super(0);
        }

        public Object invoke() {
            C86186n Zl = ((C30211n0) C86312j.m106911c(C30211n0.class)).mo57230Zl(MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE);
            C87412m.m108592e(Zl, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBBootsPkgManagementPublicService");
            return (MBBootsPkgManagementPublicService) Zl;
        }
    }

    /* renamed from: g70.m$a */
    public static final class C87167a extends C87413o implements C32224a<C40427l0> {

        /* renamed from: d */
        public final /* synthetic */ C87166m f252807d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87167a(C87166m mVar) {
            super(0);
            this.f252807d = mVar;
        }

        public Object invoke() {
            C40427l0 l;
            MBBootsPkgManagementPublicService mBBootsPkgManagementPublicService = (MBBootsPkgManagementPublicService) ((C36570n) this.f252807d.f252805c).getValue();
            synchronized (mBBootsPkgManagementPublicService) {
                l = mBBootsPkgManagementPublicService.mo118398l();
            }
            return l;
        }
    }

    public C87166m(Collection<? extends C86431j<C8239c>> collection) {
        C87412m.m108594g(collection, "jsApiSet");
        this.f252803a = collection;
    }

    /* renamed from: G */
    public void mo5786G(C86190s sVar) {
        C87412m.m108594g(sVar, "dispatcher");
        this.f252804b = sVar;
    }

    /* renamed from: b */
    public void mo5788b() {
        Log.m105924i("MicroMsg.MagicSclServiceBoots", "onMainScriptInjected");
    }

    /* renamed from: f0 */
    public String mo9281f0(int i, String str) {
        C87412m.m108594g(str, "bizName");
        Log.m105924i("MicroMsg.MagicSclServiceBoots", "bindCanvasWithBiz " + i + ' ' + str);
        C86190s sVar = this.f252804b;
        if (sVar != null) {
            sVar.mo120595d(i, str);
        }
        C86190s sVar2 = this.f252804b;
        if (sVar2 != null) {
            return sVar2.mo120596f(str);
        }
        return null;
    }

    /* renamed from: g0 */
    public C40427l0 mo9282g0() {
        return (C40427l0) ((C36570n) this.f252806d).getValue();
    }

    /* renamed from: i */
    public void mo5789i(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        Log.m105920e("MicroMsg.MagicSclServiceBoots", "onJSException envId:" + str + ",msg:" + str2);
    }

    /* renamed from: k */
    public void mo5790k(int i) {
        Log.m105924i("MicroMsg.MagicSclServiceBoots", "onCanvasViewFirstFrameRender " + i);
    }

    public void onCreated() {
        Log.m105924i("MicroMsg.MagicSclServiceBoots", "onCreated");
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.MagicSclServiceBoots", "onDestroy");
        this.f252804b = null;
        ((MBBootsPkgManagementPublicService) ((C36570n) this.f252805c).getValue()).release();
    }

    /* renamed from: s */
    public MBBuildConfig<C8239c> mo5793s() {
        Log.m105924i("MicroMsg.MagicSclServiceBoots", "onProvideConfig");
        MBBuildConfig mBBuildConfig = new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
        mBBuildConfig.f248378q = this;
        mBBuildConfig.f248372h = WeChatEnvironment.hasDebugger();
        mBBuildConfig.mo118367a(this.f252803a);
        return mBBuildConfig;
    }

    /* renamed from: u */
    public C86434m mo8353u(String str) {
        MBBootsPkgManagementBase.C85247a n;
        C81410b0 b0Var;
        C81410b0 access;
        MBBootsPkgManagementBase.C85247a n2;
        C87412m.m108594g(str, ProviderConstants.API_COLNAME_FEATURE_VERSION);
        Log.m105924i("MicroMsg.MagicSclServiceBoots", "hy: on request provide plugin from scl service");
        synchronized (this) {
            MBBootsPkgManagementPublicService mBBootsPkgManagementPublicService = (MBBootsPkgManagementPublicService) ((C36570n) this.f252805c).getValue();
            synchronized (mBBootsPkgManagementPublicService) {
                n = mBBootsPkgManagementPublicService.mo118399n();
            }
            C81415h0 a = n.mo118402a();
            b0Var = null;
            access = a != null ? a.access(ModulePkgInfo.GAME_PLUGIN_SCRIPT) : null;
        }
        if (access != null) {
            if (access == C81410b0.OK) {
                b0Var = access;
            }
            if (b0Var != null) {
                MBBootsPkgManagementPublicService mBBootsPkgManagementPublicService2 = (MBBootsPkgManagementPublicService) ((C36570n) this.f252805c).getValue();
                synchronized (mBBootsPkgManagementPublicService2) {
                    n2 = mBBootsPkgManagementPublicService2.mo118399n();
                }
                return n2.mo118403b(ModulePkgInfo.GAME_PLUGIN_SCRIPT);
            }
        }
        Log.m105920e("MicroMsg.MagicSclServiceBoots", "plugin not found");
        C7335d c = C86312j.m106911c(IMagicBrushMonitor.class);
        C87412m.m108593f(c, "getService(IMagicBrushMonitor::class.java)");
        IMagicBrushMonitor.C85281a.m105255c((IMagicBrushMonitor) c, MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE, "plugin not found", "", (String) null, 8, (Object) null);
        return new C86436p("");
    }
}
