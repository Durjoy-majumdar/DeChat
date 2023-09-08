package sp0;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import sl0.C22364a;
import sl0.C22367k;
import sp0.C22381b0;

/* renamed from: sp0.a0 */
public class C22379a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C22381b0.C22384c f63455d;

    /* renamed from: e */
    public final /* synthetic */ C22381b0.C22382a f63456e;

    /* renamed from: f */
    public final /* synthetic */ C22381b0 f63457f;

    /* renamed from: sp0.a0$a */
    public class C22380a implements NsdManager.ResolveListener {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f63458a;

        public C22380a(CountDownLatch countDownLatch) {
            this.f63458a = countDownLatch;
        }

        public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
            C22381b0.C22382a aVar = C22379a0.this.f63456e;
            C22381b0.C22384c cVar = new C22381b0.C22384c(nsdServiceInfo);
            C22367k kVar = (C22367k) aVar;
            kVar.getClass();
            Log.m105924i("MicroMsg.JsApiOperateLocalServicesScan", "onResolveFailed");
            C22364a.m26047p(kVar.f63395a.f63398a, cVar, "resolveFail", i);
            this.f63458a.countDown();
        }

        public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
            C22381b0.C22382a aVar = C22379a0.this.f63456e;
            C22381b0.C22384c cVar = new C22381b0.C22384c(nsdServiceInfo);
            C22367k kVar = (C22367k) aVar;
            kVar.getClass();
            Log.m105924i("MicroMsg.JsApiOperateLocalServicesScan", "onServiceResolved");
            C82381f fVar = kVar.f63395a.f63398a;
            synchronized (C22364a.class) {
                C22364a.m26047p(fVar, cVar, "found", 0);
            }
            this.f63458a.countDown();
        }
    }

    public C22379a0(C22381b0 b0Var, C22381b0.C22384c cVar, C22381b0.C22382a aVar) {
        this.f63457f = b0Var;
        this.f63455d = cVar;
        this.f63456e = aVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.LocalServiceMgr", "start reslove " + this.f63455d.f63464b);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceName(this.f63455d.f63464b);
        nsdServiceInfo.setServiceType(this.f63455d.f63465c);
        this.f63457f.getClass();
        ((NsdManager) MMApplicationContext.getContext().getSystemService("servicediscovery")).resolveService(nsdServiceInfo, new C22380a(countDownLatch));
        try {
            countDownLatch.await(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Log.printErrStackTrace("LocalServiceMgr", e, "", new Object[0]);
        }
        Log.m105924i("MicroMsg.LocalServiceMgr", "finish reslove " + this.f63455d.f63464b + " trhead id=" + Thread.currentThread().getId());
    }
}
