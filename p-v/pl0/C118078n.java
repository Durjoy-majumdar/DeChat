package pl0;

import com.tencent.mapsdk.raster.model.IndoorBuilding;
import com.tencent.mapsdk.raster.model.IndoorLevel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import java.util.LinkedList;
import pl0.C118080q;

/* renamed from: pl0.n */
public class C118078n implements TencentMap.OnIndoorStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C118022a f352970a;

    public C118078n(C118022a aVar) {
        this.f352970a = aVar;
    }

    public boolean onIndoorBuildingDeactivated() {
        Log.m105926v("MicroMsg.Map.DefaultTencentMapView", "[onIndoorBuildingDeactivated]");
        if (this.f352970a.f352818K == null) {
            return true;
        }
        C118080q.C118090g gVar = new C118080q.C118090g();
        gVar.f353011a = "";
        gVar.f353012b = "";
        gVar.f353013c = new LinkedList();
        gVar.f353014d = -1;
        C118022a aVar = this.f352970a;
        aVar.f352819L = gVar;
        aVar.f352818K.mo182585a(gVar);
        return true;
    }

    public boolean onIndoorBuildingFocused() {
        Log.m105926v("MicroMsg.Map.DefaultTencentMapView", "[onIndoorBuildingFocused]");
        return true;
    }

    public boolean onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
        Log.m105927v("MicroMsg.Map.DefaultTencentMapView", "[onIndoorLevelActivated]indoorBuilding:%s", indoorBuilding);
        if (this.f352970a.f352818K != null) {
            C118080q.C118090g gVar = new C118080q.C118090g();
            gVar.f353011a = indoorBuilding.getBuidlingId();
            gVar.f353012b = indoorBuilding.getBuildingName();
            gVar.f353013c = new LinkedList();
            for (IndoorLevel name : indoorBuilding.getLevels()) {
                C118080q.C118091h hVar = new C118080q.C118091h();
                hVar.f353015a = name.getName();
                gVar.f353013c.add(hVar);
            }
            gVar.f353014d = indoorBuilding.getActiveLevelIndex();
            C118022a aVar = this.f352970a;
            aVar.f352819L = gVar;
            aVar.f352818K.mo182585a(gVar);
        }
        return true;
    }
}
