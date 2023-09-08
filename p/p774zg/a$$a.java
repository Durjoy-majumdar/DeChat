package p774zg;

import com.tencent.p014mm.appbrand.p942v8.C80649a;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zg.a$$a */
public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80649a f262675d;

    public /* synthetic */ a$$a(C80649a aVar) {
        this.f262675d = aVar;
    }

    public final void run() {
        C80649a aVar = this.f262675d;
        aVar.getClass();
        Log.m105924i("MicroMsg.AbstractJSRuntime", "blockJsThread");
        synchronized (aVar.f236013v) {
            aVar.f236013v[0] = true;
            while (true) {
                boolean[] zArr = aVar.f236013v;
                if (zArr[0]) {
                    try {
                        zArr.wait();
                    } catch (InterruptedException e) {
                        Log.printErrStackTrace("MicroMsg.AbstractJSRuntime", e, "blockJsThread, interrupted", new Object[0]);
                    }
                }
            }
        }
    }
}
