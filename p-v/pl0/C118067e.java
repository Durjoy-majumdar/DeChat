package pl0;

import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster;
import java.util.Iterator;
import java.util.LinkedList;
import pl0.C118022a;
import pl0.C118080q;

/* renamed from: pl0.e */
public class C118067e implements TencentMap.OnMarkerClickListener {

    /* renamed from: a */
    public final /* synthetic */ C118022a f352958a;

    public C118067e(C118022a aVar) {
        this.f352958a = aVar;
    }

    public boolean onMarkerClick(Marker marker) {
        Marker marker2;
        if (marker == null) {
            return false;
        }
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s markerid:%s, onMarkerClick", this, marker.getTag());
        if (Util.isNullOrNil((String) marker.getTag()) && this.f352958a.f352870y != null && ((C118022a.C118042j0) this.f352958a.f352870y.getRenderer()).getCluster(marker) != null) {
            this.f352958a.mo182825V(((C118022a.C118042j0) this.f352958a.f352870y.getRenderer()).getCluster(marker));
            return true;
        } else if (Util.isNullOrNil((String) marker.getTag())) {
            Log.m105928w("MicroMsg.Map.DefaultTencentMapView", "realMarker.getTag is null, return");
            return false;
        } else if (((String) marker.getTag()).endsWith("AnchorPoint")) {
            C118022a aVar = this.f352958a;
            if (!(aVar.f352859p == null || aVar.f352841Z == null)) {
                Log.m105928w("MicroMsg.Map.DefaultTencentMapView", "click anchor point");
                C118022a aVar2 = this.f352958a;
                aVar2.f352859p.mo182586a(aVar2.f352841Z.getLatitude(), this.f352958a.f352841Z.getLongitude());
            }
            return true;
        } else {
            C118022a.C118051m0 H0 = this.f352958a.mo182804H0((String) marker.getTag());
            if (H0 == null) {
                Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "[onMarkerClickListener] map:%s appbrandMarker is null, return", this);
                return false;
            } else if (this.f352958a.f352857n == null) {
                Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "[onMarkerClickListener] map:%s mapCalloutClick is null, return", this);
                return false;
            } else {
                if (H0.f353057b != null) {
                    if (((String) marker.getTag()).endsWith("#label")) {
                        Log.m105928w("MicroMsg.Map.DefaultTencentMapView", "realMarker.getTag is label marker, do nothing");
                    } else {
                        C118080q.C118108w.C118109a aVar3 = H0.f353057b.f353075r;
                        Marker marker3 = H0.f352933c;
                        if (marker3 == null) {
                            marker3 = marker;
                        }
                        if (aVar3 == null || aVar3.f353085i != 0 || marker3 == null) {
                            if (!(aVar3 == null || marker3 == null)) {
                                this.f352958a.mo182818O0(marker3);
                            }
                        } else if (!marker3.isInfoWindowShown()) {
                            this.f352958a.mo182818O0(marker3);
                        } else {
                            marker3.hideInfoWindow();
                        }
                    }
                }
                Marker marker4 = H0.f352933c;
                if (marker4 != null) {
                    marker4.set2Top();
                }
                Marker marker5 = H0.f352934d;
                if (marker5 != null) {
                    marker5.set2Top();
                }
                C118115s sVar = this.f352958a.f352841Z;
                if (!(sVar == null || (marker2 = sVar.f353104e) == null)) {
                    marker2.set2Top();
                }
                int i = H0.f353057b.f353059b;
                if (i > 0) {
                    C118022a aVar4 = this.f352958a;
                    aVar4.getClass();
                    Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "clickClusterLabelMarker");
                    Cluster cluster = aVar4.f352838X0.get(Integer.valueOf(i));
                    if (cluster != null) {
                        Iterator it = cluster.getItems().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (((C118022a.C118046l0) it.next()).f352916c == i) {
                                C118080q.C118103r rVar = aVar4.f352828S0;
                                if (rVar != null) {
                                    rVar.mo182578a(aVar4.mo182798E0(cluster, false));
                                }
                            }
                        }
                        if (aVar4.f352843a1) {
                            LinkedList linkedList = new LinkedList();
                            for (C118022a.C118046l0 l0Var : cluster.getItems()) {
                                linkedList.add(l0Var.f352915b);
                            }
                            aVar4.mo182813M(linkedList, 0, 0, 0, 0);
                        }
                    }
                    return true;
                } else if (!((String) marker.getTag()).endsWith("#label")) {
                    return this.f352958a.f352857n.mo182588a(H0);
                } else {
                    Log.m105928w("MicroMsg.Map.DefaultTencentMapView", "realMarker.getTag is label marker, return");
                    return this.f352958a.f352858o.mo182590a(H0);
                }
            }
        }
    }
}
