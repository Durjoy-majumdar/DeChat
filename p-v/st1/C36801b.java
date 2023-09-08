package st1;

import com.tencent.p014mm.autogen.events.CloseFingerPrintEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ut1.C78279d;

/* renamed from: st1.b */
public class C36801b extends IStaticListener<CloseFingerPrintEvent> implements C11385n {

    /* renamed from: d */
    public CloseFingerPrintEvent f97726d;

    /* renamed from: e */
    public boolean f97727e = false;

    public boolean callback(IEvent iEvent) {
        CloseFingerPrintEvent closeFingerPrintEvent = (CloseFingerPrintEvent) iEvent;
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.CloseFingerPrintEventListener", "CloseFingerPrintEvent account is not ready");
            return false;
        }
        this.f97727e = false;
        if (!(closeFingerPrintEvent instanceof CloseFingerPrintEvent)) {
            return false;
        }
        this.f97726d = closeFingerPrintEvent;
        Log.m105924i("MicroMsg.CloseFingerPrintEventListener", "handle CloseFingerPrintEvent");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(385, this);
        C78279d dVar = new C78279d(closeFingerPrintEvent.f78759d.f78761a);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(dVar);
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C78279d) {
            CloseFingerPrintEvent.C28725b bVar = new CloseFingerPrintEvent.C28725b();
            Log.m105924i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene return errcode " + i2 + " errmsg" + str);
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene is success");
                bVar.f78762a = 0;
            } else {
                Log.m105924i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene is fail");
                bVar.f78762a = i2;
            }
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(385, this);
            CloseFingerPrintEvent closeFingerPrintEvent = this.f97726d;
            closeFingerPrintEvent.f78760e = bVar;
            this.f97727e = true;
            Runnable runnable = closeFingerPrintEvent.callback;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f97727e) {
                this.f97726d = null;
            }
        }
    }
}
