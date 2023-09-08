package t73;

import com.tencent.mapsdk.rastercore.tools.C40004IO;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import java.io.Closeable;

/* renamed from: t73.l */
public final class C48568l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C48558d f129940d;

    public C48568l(C48558d dVar) {
        this.f129940d = dVar;
    }

    public final void run() {
        C40427l0 G1 = this.f129940d.mo72996G1();
        C40004IO.safeClose(G1 instanceof Closeable ? (Closeable) G1 : null);
    }
}
