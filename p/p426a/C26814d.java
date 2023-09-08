package p426a;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import d42.C86190s;
import di3.C7335d;
import di3.C86312j;
import e42.C86431j;
import e42.C86434m;
import e42.C86436p;
import g70.C8239c;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Collection;
import java.util.HashSet;
import k70.C88119c;
import q52.C89480u;

/* renamed from: a.d */
public final class C26814d extends C8239c {

    /* renamed from: J */
    public final Class<? extends C88119c> f74556J;

    /* renamed from: K */
    public final Collection<C86431j<C8239c>> f74557K;

    /* renamed from: L */
    public C88119c f74558L;

    /* renamed from: M */
    public C86190s f74559M;

    public C26814d(Class<? extends C88119c> cls, Collection<? extends C86431j<C8239c>> collection) {
        C87412m.m108594g(cls, "pkgSelectorClass");
        C87412m.m108594g(collection, "jsApiSet");
        this.f74556J = cls;
        this.f74557K = collection;
        Object newInstance = cls.newInstance();
        C87412m.m108593f(newInstance, "pkgSelectorClass.newInstance()");
        this.f74558L = (C88119c) newInstance;
    }

    /* renamed from: G */
    public void mo5786G(C86190s sVar) {
        C87412m.m108594g(sVar, "dispatcher");
        this.f74559M = sVar;
    }

    /* renamed from: b */
    public void mo5788b() {
        Log.m105924i("MicroMsg.MagicSclServiceLegacy", "onMainScriptInjected");
    }

    /* renamed from: f0 */
    public String mo9281f0(int i, String str) {
        C87412m.m108594g(str, "bizName");
        Log.m105924i("MicroMsg.MagicSclServiceLegacy", "bindCanvasWithBiz " + i + ' ' + str);
        C86190s sVar = this.f74559M;
        if (sVar != null) {
            sVar.mo120595d(i, str);
        }
        C86190s sVar2 = this.f74559M;
        if (sVar2 != null) {
            return sVar2.mo120596f(str);
        }
        return null;
    }

    /* renamed from: g0 */
    public C40427l0 mo9282g0() {
        return this.f74558L.mo120823c("wx2f3fb5db9f226462");
    }

    /* renamed from: i */
    public void mo5789i(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        Log.m105920e("MicroMsg.MagicSclServiceLegacy", "onJSException envId:" + str + ",msg:" + str2);
    }

    /* renamed from: k */
    public void mo5790k(int i) {
        Log.m105924i("MicroMsg.MagicSclServiceLegacy", "onCanvasViewFirstFrameRender " + i);
    }

    public void onCreated() {
        Log.m105924i("MicroMsg.MagicSclServiceLegacy", "onCreated");
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.MagicSclServiceLegacy", "onDestroy");
        this.f74559M = null;
    }

    /* renamed from: s */
    public MBBuildConfig<C8239c> mo5793s() {
        Log.m105924i("MicroMsg.MagicSclServiceLegacy", "onProvideConfig");
        Object newInstance = this.f74556J.newInstance();
        C87412m.m108593f(newInstance, "pkgSelectorClass.newInstance()");
        this.f74558L = (C88119c) newInstance;
        MBBuildConfig mBBuildConfig = new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
        mBBuildConfig.f248378q = this;
        mBBuildConfig.f248372h = WeChatEnvironment.hasDebugger();
        mBBuildConfig.mo118367a(this.f74557K);
        return mBBuildConfig;
    }

    /* renamed from: u */
    public C86434m mo8353u(String str) {
        C87412m.m108594g(str, ProviderConstants.API_COLNAME_FEATURE_VERSION);
        Log.m105924i("MicroMsg.MagicSclServiceLegacy", "onProvideConfig version:" + str);
        C88119c.C88122d d = this.f74558L.mo122513d("plugin.js");
        if (d != null) {
            return C89480u.m111876e(d.f254881c, ModulePkgInfo.GAME_PLUGIN_SCRIPT);
        }
        Log.m105920e("MicroMsg.MagicSclServiceLegacy", "plugin.js not found");
        C7335d c = C86312j.m106911c(IMagicBrushMonitor.class);
        C87412m.m108593f(c, "getService(IMagicBrushMonitor::class.java)");
        IMagicBrushMonitor.C85281a.m105255c((IMagicBrushMonitor) c, "wx2f3fb5db9f226462", "plugin.js not found", "", (String) null, 8, (Object) null);
        return new C86436p("");
    }
}
