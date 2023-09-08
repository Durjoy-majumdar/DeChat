package pl0;

import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import pl0.C118022a;
import pl0.C118080q;

/* renamed from: pl0.b */
public class C118064b implements TencentMap.OnInfoWindowClickListener {

    /* renamed from: a */
    public final /* synthetic */ C118022a f352949a;

    public C118064b(C118022a aVar) {
        this.f352949a = aVar;
    }

    public void onInfoWindowClick(Marker marker) {
        if (marker != null) {
            C118022a.C118051m0 H0 = this.f352949a.mo182804H0((String) marker.getTag());
            if (H0 == null) {
                Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "[onInfoWindowClick] map:%s appbrandMarker is null, return", this);
                return;
            }
            C118080q.C118098m mVar = this.f352949a.f352856j;
            if (mVar == null) {
                Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "[onInfoWindowClick] map:%s mapCalloutClick is null, return", this);
                return;
            }
            mVar.mo182587a(H0);
        }
    }
}
