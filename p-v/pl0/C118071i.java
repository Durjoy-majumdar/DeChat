package pl0;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import java.util.concurrent.ConcurrentHashMap;
import pl0.C118022a;
import pl0.C118080q;

/* renamed from: pl0.i */
public class C118071i implements TencentMap.OnMapClickListener {

    /* renamed from: a */
    public final /* synthetic */ C118022a f352962a;

    public C118071i(C118022a aVar) {
        this.f352962a = aVar;
    }

    public void onMapClick(LatLng latLng) {
        C118080q.C118108w.C118109a aVar;
        Marker marker;
        for (C118022a.C118051m0 m0Var : ((ConcurrentHashMap) this.f352962a.f352833V).values()) {
            C118080q.C118108w wVar = m0Var.f353057b;
            if (!(wVar == null || (aVar = wVar.f353075r) == null || aVar.f353085i != 0 || (marker = m0Var.f352933c) == null || !marker.isInfoWindowShown())) {
                m0Var.f352933c.hideInfoWindow();
            }
        }
        C118080q.C118099n nVar = this.f352962a.f352813F;
        if (nVar != null) {
            nVar.mo182589a(latLng.getLongitude(), latLng.getLatitude());
        }
    }
}
