package pl0;

import com.tencent.mapsdk.raster.model.Marker;
import pl0.C118080q;

/* renamed from: pl0.h */
public class C118070h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Marker f352960d;

    /* renamed from: e */
    public final /* synthetic */ C118080q.C118108w f352961e;

    public C118070h(C118022a aVar, Marker marker, C118080q.C118108w wVar) {
        this.f352960d = marker;
        this.f352961e = wVar;
    }

    public void run() {
        Marker marker = this.f352960d;
        C118080q.C118108w.C118109a aVar = this.f352961e.f353075r;
        marker.setInfoWindowOffset(aVar.f353087k, aVar.f353088l);
    }
}
