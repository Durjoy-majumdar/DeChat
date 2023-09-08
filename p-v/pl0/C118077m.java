package pl0;

import com.tencent.mapsdk.raster.model.IndoorMapPoi;
import com.tencent.mapsdk.raster.model.MapPoi;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import pl0.C118080q;

/* renamed from: pl0.m */
public class C118077m implements TencentMap.OnMapPoiClickListener {

    /* renamed from: a */
    public final /* synthetic */ C118022a f352969a;

    public C118077m(C118022a aVar) {
        this.f352969a = aVar;
    }

    public void onClicked(MapPoi mapPoi) {
        if (this.f352969a.f352814G != null) {
            C118080q.C118106u uVar = new C118080q.C118106u();
            uVar.f353051a = mapPoi.getPosition().getLatitude();
            uVar.f353052b = mapPoi.getPosition().getLongitude();
            uVar.f353053c = mapPoi.getName();
            if (mapPoi instanceof IndoorMapPoi) {
                IndoorMapPoi indoorMapPoi = (IndoorMapPoi) mapPoi;
                if (!Util.isNullOrNil(indoorMapPoi.getBuildingId())) {
                    uVar.f353054d = indoorMapPoi.getBuildingId();
                    uVar.f353055e = indoorMapPoi.getFloorName();
                }
            }
            this.f352969a.f352814G.mo182591a(uVar);
        }
    }
}
