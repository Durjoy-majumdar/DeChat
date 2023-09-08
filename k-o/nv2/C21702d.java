package nv2;

import com.tencent.p014mm.sdk.platformtools.Log;
import nv2.C21696b;
import ot3.C21889m;
import pv2.C22024q;
import tt3.C22550a;

/* renamed from: nv2.d */
public class C21702d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C22550a f61421d;

    /* renamed from: e */
    public final /* synthetic */ C21696b.C21698b f61422e;

    public C21702d(C21696b.C21698b bVar, C22550a aVar) {
        this.f61422e = bVar;
        this.f61421d = aVar;
    }

    public void run() {
        C21889m mVar = (C21889m) this.f61421d.f64864c;
        C21696b bVar = C21696b.this;
        C22024q qVar = bVar.f61430b;
        qVar.f62342a = 0;
        qVar.f62343b = "OK";
        qVar.f62344c = 1;
        qVar.f62345d = mVar.f61899j;
        qVar.f62346e = mVar.f61900k;
        if (bVar.f61432d != null) {
            bVar.mo33976a();
            bVar.f61432d.obtainMessage(0, bVar.f61430b).sendToTarget();
            return;
        }
        Log.m105920e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }
}
