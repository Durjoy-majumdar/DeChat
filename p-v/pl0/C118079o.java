package pl0;

import android.text.TextUtils;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Collision;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem;
import java.util.concurrent.ConcurrentHashMap;
import pl0.C118022a;
import pl0.C118080q;

/* renamed from: pl0.o */
public class C118079o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118022a.C118046l0 f352971d;

    /* renamed from: e */
    public final /* synthetic */ C118080q.C118108w f352972e;

    /* renamed from: f */
    public final /* synthetic */ MarkerOptions f352973f;

    /* renamed from: g */
    public final /* synthetic */ C118022a.C118042j0 f352974g;

    public C118079o(C118022a.C118042j0 j0Var, C118022a.C118046l0 l0Var, C118080q.C118108w wVar, MarkerOptions markerOptions) {
        this.f352974g = j0Var;
        this.f352971d = l0Var;
        this.f352972e = wVar;
        this.f352973f = markerOptions;
    }

    public void run() {
        C118080q.C118108w wVar;
        C118080q.C118108w.C118109a aVar;
        Marker marker = this.f352974g.getMarker(this.f352971d);
        C118022a.C118051m0 m0Var = (C118022a.C118051m0) ((ConcurrentHashMap) C118022a.this.f352833V).get(this.f352971d.f352914a);
        if (!(m0Var == null || m0Var.f352933c != null || marker == null)) {
            m0Var.f352933c = marker;
        }
        C118022a.C118046l0 l0Var = this.f352971d;
        if (l0Var.f352916c == 0 && m0Var != null) {
            C118022a.this.mo182890y0(l0Var.f352914a, this.f352972e, m0Var);
            C118080q.C118108w wVar2 = this.f352972e;
            if (!(wVar2 == null || (aVar = wVar2.f353075r) == null || aVar.f353085i != 1)) {
                C118022a.this.mo182818O0(marker);
            }
        }
        if (!(marker == null || (wVar = this.f352972e) == null)) {
            if (TextUtils.isEmpty(wVar.f353074q) || !this.f352972e.f353074q.equals("withLabel")) {
                marker.setCollisions((Collision[]) null);
            } else {
                marker.setCollisions(MarkerCollisionItem.POI);
            }
        }
        C118022a.m166458v0(C118022a.this, this.f352971d.f352914a, this.f352973f, this.f352972e, marker);
    }
}
