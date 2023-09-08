package wo0;

import com.tencent.p014mm.plugin.appbrand.appcache.C81285k2;
import com.tencent.p014mm.plugin.appbrand.appcache.k2$$b;
import com.tencent.p014mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import te3.C90414hj3;
import te3.C90444vm2;
import te3.C90446wm2;
import te3.u45;

/* renamed from: wo0.d */
public class C91045d implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ C90446wm2 f261191a;

    /* renamed from: b */
    public final /* synthetic */ CgiLaunchWxaApp f261192b;

    public C91045d(CgiLaunchWxaApp cgiLaunchWxaApp, C90446wm2 wm22) {
        this.f261192b = cgiLaunchWxaApp;
        this.f261191a = wm22;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        int i = ((C90444vm2) this.f261192b.f243440p.f127055a.f127080a).f259884h.f259849d;
        C90414hj3 hj32 = this.f261191a.f259925g;
        if (hj32 != null) {
            Object[] objArr = new Object[5];
            int i2 = 0;
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(hj32.f259553g);
            objArr[2] = Boolean.valueOf(hj32.f259554h > 0);
            objArr[3] = Boolean.valueOf(hj32.f259556j);
            objArr[4] = Boolean.valueOf(hj32.f259550d);
            Log.m105925i("MicroMsg.WxaCommLibVersionChecker", "updateByLaunchWxaApp, reqVersion:%d, respVersion:%d, force_update:%b, rely_update:%b, need_update:%b", objArr);
            C115669n.INSTANCE.mo175911u(1509, 21);
            u45 u45 = new u45();
            u45.f259842d = hj32.f259551e;
            u45.f259843e = hj32.f259552f;
            u45.f259844f = hj32.f259553g;
            u45.f259846h = hj32.f259554h;
            if (hj32.f259550d || hj32.f259556j) {
                i2 = 1;
            }
            u45.f259847i = i2;
            u45.f259848j = hj32.f259555i;
            C81285k2.m99658b(i, u45, k2$$b.Launch, (Runnable) null);
        }
        return null;
    }
}
