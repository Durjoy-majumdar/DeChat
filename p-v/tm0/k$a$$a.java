package tm0;

import com.tencent.p014mm.sdk.platformtools.Log;
import tm0.C90538k;

public final /* synthetic */ class k$a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90538k.C90539a f260173d;

    public /* synthetic */ k$a$$a(C90538k.C90539a aVar) {
        this.f260173d = aVar;
    }

    public final void run() {
        C90538k.C90539a aVar = this.f260173d;
        aVar.getClass();
        Log.m105924i("MicroMsg.JsApiGetNetworkType", "getMobileSignalStrength, timeout");
        aVar.mo124678b(Integer.MAX_VALUE);
    }
}
