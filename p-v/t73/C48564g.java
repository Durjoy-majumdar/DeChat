package t73;

import com.tencent.mapsdk.rastercore.tools.C40004IO;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.Closeable;
import java.util.Map;
import rx3.C13598b0;
import t73.C48558d;

/* renamed from: t73.g */
public final class C48564g implements Runnable {

    /* renamed from: d */
    public static final C48564g f129928d = new C48564g();

    public final void run() {
        C48558d.C48560b bVar = C48558d.f129896H;
        Log.m105926v("MicroMsg.WebPrefetcherJsEngine", "pendingReleasePkgCache");
        synchronized (C48558d.f129907T) {
            for (Map.Entry<String, C40427l0> value : C48558d.f129907T.entrySet()) {
                C40427l0 l0Var = (C40427l0) value.getValue();
                if (l0Var instanceof Closeable) {
                    C40004IO.safeClose((Closeable) l0Var);
                }
            }
            C48558d.f129907T.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
