package sp0;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import sl0.C22364a;
import sl0.C22367k;
import sl0.C22368l;
import sp0.C22381b0;
import zt3.C119157j;

/* renamed from: sp0.z */
public class C22385z implements NsdManager.DiscoveryListener {

    /* renamed from: a */
    public final /* synthetic */ C22381b0.C22383b f63468a;

    public C22385z(C22381b0 b0Var, C22381b0.C22383b bVar) {
        this.f63468a = bVar;
    }

    public void onDiscoveryStarted(String str) {
        C22368l.C22369a aVar = (C22368l.C22369a) this.f63468a;
        aVar.f63398a.mo109647a(aVar.f63399b.get(), C22368l.this.mo115109j("ok"));
        Log.m105924i("MicroMsg.JsApiOperateLocalServicesScan", "onDiscoveryStarted");
        Log.m105924i("MicroMsg.LocalServiceMgr", "onDiscoveryStarted " + str);
    }

    public void onDiscoveryStopped(String str) {
        C22368l.C22369a aVar = (C22368l.C22369a) this.f63468a;
        aVar.getClass();
        Log.m105924i("MicroMsg.JsApiOperateLocalServicesScan", "onDiscoveryStopped");
        aVar.f63398a.mo109647a(aVar.f63400c.get(), C22368l.this.mo115109j("ok"));
        C82381f fVar = aVar.f63398a;
        synchronized (C22364a.class) {
            C22364a.m26047p(fVar, (C22381b0.C22384c) null, "stopScan", 0);
        }
        Log.m105924i("MicroMsg.LocalServiceMgr", "onDiscoveryStopped " + str);
    }

    public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        C22381b0.C22384c cVar = new C22381b0.C22384c(nsdServiceInfo);
        C22368l.C22369a aVar = (C22368l.C22369a) this.f63468a;
        aVar.getClass();
        Log.m105924i("MicroMsg.JsApiOperateLocalServicesScan", "onServiceFound");
        C22381b0 b0Var = C22381b0.INSTANCE;
        C22367k kVar = new C22367k(aVar);
        b0Var.getClass();
        ((C119157j) C119157j.f356862d).mo183876g(new C22379a0(b0Var, cVar, kVar), "LocalServiceMgr#resolveService");
        Log.m105924i("MicroMsg.LocalServiceMgr", "onServicesFound " + nsdServiceInfo.getServiceType());
    }

    public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        C22381b0.C22383b bVar = this.f63468a;
        C22381b0.C22384c cVar = new C22381b0.C22384c(nsdServiceInfo);
        C82381f fVar = ((C22368l.C22369a) bVar).f63398a;
        synchronized (C22364a.class) {
            C22364a.m26047p(fVar, cVar, "lost", 0);
        }
        Log.m105924i("MicroMsg.LocalServiceMgr", "onServiceLost " + nsdServiceInfo.getServiceType());
    }

    public void onStartDiscoveryFailed(String str, int i) {
        C22368l.C22369a aVar = (C22368l.C22369a) this.f63468a;
        aVar.f63398a.mo109647a(aVar.f63399b.get(), C22368l.this.mo115109j("fail"));
        Log.m105924i("MicroMsg.JsApiOperateLocalServicesScan", "onStartDiscoveryFailed");
        Log.m105924i("MicroMsg.LocalServiceMgr", "onStartDiscoveryFailed " + str);
    }

    public void onStopDiscoveryFailed(String str, int i) {
        C22368l.C22369a aVar = (C22368l.C22369a) this.f63468a;
        aVar.f63398a.mo109647a(aVar.f63400c.get(), C22368l.this.mo115109j("fail"));
        Log.m105924i("MicroMsg.JsApiOperateLocalServicesScan", "onStopDiscoveryFailed");
        Log.m105924i("MicroMsg.LocalServiceMgr", "onStopDiscoveryFailed " + str);
    }
}
