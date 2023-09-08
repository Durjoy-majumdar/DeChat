package bg0;

import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ep3.C97683a;
import f40.C86709a0;
import yf0.C79098e;
import yf0.C79099f;
import yf0.C79105l;
import yf0.C79106m;

/* renamed from: bg0.e */
public class C67229e extends C97683a {

    /* renamed from: q */
    public C79106m f193051q = new C79106m();

    /* renamed from: r */
    public C79099f f193052r = new C79099f();

    /* renamed from: d */
    public void mo67526d() {
        super.mo67526d();
        Log.m105924i("MicroMsg.LaunchAAInteractor", "LaunchAAInteractor, onCreate");
        C79105l lVar = this.f193051q.f232264a;
        lVar.getClass();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1624, lVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1655, lVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(2831, lVar);
        C79098e eVar = this.f193052r.f232252a;
        eVar.getClass();
        Log.m105924i("MicroMsg.AAOperationData", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1698, eVar);
    }

    /* renamed from: e */
    public void mo67531e() {
        super.mo67531e();
        Log.m105924i("MicroMsg.LaunchAAInteractor", "LaunchAAInteractor, onDestroy");
        C79105l lVar = this.f193051q.f232264a;
        lVar.getClass();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1624, lVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1655, lVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(2831, lVar);
        C79098e eVar = this.f193052r.f232252a;
        eVar.getClass();
        Log.m105924i("MicroMsg.AAOperationData", "uninit");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1698, eVar);
    }
}
