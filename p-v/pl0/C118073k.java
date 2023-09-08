package pl0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer;
import pl0.C118022a;

/* renamed from: pl0.k */
public class C118073k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f352964d;

    /* renamed from: e */
    public final /* synthetic */ int f352965e;

    /* renamed from: f */
    public final /* synthetic */ C118022a f352966f;

    /* renamed from: pl0.k$a */
    public class C118074a implements ClusterManager.OnClusterClickListener<C118022a.C118046l0> {
        public C118074a() {
        }

        public boolean onClusterClick(Cluster<C118022a.C118046l0> cluster) {
            C118073k.this.f352966f.mo182825V(cluster);
            return true;
        }
    }

    /* renamed from: pl0.k$b */
    public class C118075b implements ClusterManager.OnClusterItemClickListener<C118022a.C118046l0> {
        public C118075b(C118073k kVar) {
        }

        public /* bridge */ /* synthetic */ boolean onClusterItemClick(ClusterItem clusterItem) {
            C118022a.C118046l0 l0Var = (C118022a.C118046l0) clusterItem;
            return false;
        }
    }

    public C118073k(C118022a aVar, int i, int i2) {
        this.f352966f = aVar;
        this.f352964d = i;
        this.f352965e = i2;
    }

    public void run() {
        if (this.f352966f.f352870y == null) {
            C118022a aVar = this.f352966f;
            aVar.f352870y = new C118022a.C118040i0(aVar.f352846d, aVar.f352854h.getMap());
        }
        C118022a aVar2 = this.f352966f;
        DefaultClusterRenderer<C118022a.C118046l0> defaultClusterRenderer = aVar2.f352872z;
        if (defaultClusterRenderer == null) {
            C118022a aVar3 = this.f352966f;
            aVar2.f352872z = new C118022a.C118042j0(aVar3.f352846d, aVar3.f352854h.getMap(), this.f352966f.f352870y);
            this.f352966f.f352872z.setMinClusterSize(this.f352964d);
            NonHierarchicalDistanceBasedAlgorithm nonHierarchicalDistanceBasedAlgorithm = new NonHierarchicalDistanceBasedAlgorithm(this.f352966f.f352846d);
            nonHierarchicalDistanceBasedAlgorithm.setMaxDistanceAtZoom(this.f352965e);
            this.f352966f.f352870y.setAlgorithm(nonHierarchicalDistanceBasedAlgorithm);
        } else {
            defaultClusterRenderer.setMinClusterSize(this.f352964d);
            if (this.f352966f.f352870y.getAlgorithm() != null && (this.f352966f.f352870y.getAlgorithm() instanceof NonHierarchicalDistanceBasedAlgorithm)) {
                ((NonHierarchicalDistanceBasedAlgorithm) this.f352966f.f352870y.getAlgorithm()).setMaxDistanceAtZoom(this.f352965e);
            }
        }
        this.f352966f.f352870y.setOnClusterClickListener(new C118074a());
        this.f352966f.f352870y.setOnClusterItemClickListener(new C118075b(this));
        Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "init map marker cluster finish");
        this.f352966f.f352870y.setRenderer(this.f352966f.f352872z);
        this.f352966f.f352870y.setClusterEnabled(true);
        this.f352966f.f352854h.getMap().setOnMapCameraChangeListener(this.f352966f.f352870y);
        this.f352966f.f352808A = false;
    }
}
