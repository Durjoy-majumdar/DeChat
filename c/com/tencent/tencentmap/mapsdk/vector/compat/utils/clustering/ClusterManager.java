package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ClusterManager<T extends ClusterItem> implements TencentMap.InfoWindowAdapter, TencentMap.OnInfoWindowClickListener, TencentMap.OnMapCameraChangeListener, TencentMap.OnMarkerClickListener {

    /* renamed from: a */
    private final MarkerManager f349231a;

    /* renamed from: b */
    private final MarkerManager.Collection f349232b;

    /* renamed from: c */
    private final MarkerManager.Collection f349233c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Algorithm<T> f349234d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ReadWriteLock f349235e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ClusterRenderer<T> f349236f;

    /* renamed from: g */
    private TencentMap f349237g;

    /* renamed from: h */
    private CameraPosition f349238h;

    /* renamed from: i */
    private ClusterManager<T>.a f349239i;

    /* renamed from: j */
    private final ReadWriteLock f349240j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f349241k;

    /* renamed from: l */
    private OnClusterItemClickListener<T> f349242l;

    /* renamed from: m */
    private OnClusterInfoWindowClickListener<T> f349243m;

    /* renamed from: n */
    private ClusterInfoWindowAdapter<T> f349244n;

    /* renamed from: o */
    private OnClusterItemInfoWindowClickListener<T> f349245o;

    /* renamed from: p */
    private OnClusterClickListener<T> f349246p;

    /* renamed from: q */
    private ClusterItemInfoWindowAdapter<T> f349247q;

    public interface ClusterInfoWindowAdapter<T extends ClusterItem> {
        View getInfoContents(Cluster<T> cluster);

        View getInfoWindow(Cluster<T> cluster);

        View getInfoWindowPressState(Cluster<T> cluster);
    }

    public interface ClusterItemInfoWindowAdapter<T extends ClusterItem> {
        View getInfoContents(T t);

        View getInfoWindow(T t);

        View getInfoWindowPressState(T t);
    }

    public interface OnClusterClickListener<T extends ClusterItem> {
        boolean onClusterClick(Cluster<T> cluster);
    }

    public interface OnClusterInfoWindowClickListener<T extends ClusterItem> {
        void onClusterInfoWindowClick(Cluster<T> cluster);
    }

    public interface OnClusterItemClickListener<T extends ClusterItem> {
        boolean onClusterItemClick(T t);
    }

    public interface OnClusterItemInfoWindowClickListener<T extends ClusterItem> {
        void onClusterItemInfoWindowClick(T t);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager$b */
    public class C116386b implements Cluster<T> {

        /* renamed from: b */
        private T f349250b;

        /* renamed from: c */
        private Set<T> f349251c;

        public C116386b(T t) {
            this.f349250b = t;
            this.f349251c = Collections.singleton(t);
        }

        public Collection<T> getItems() {
            return this.f349251c;
        }

        public LatLng getPosition() {
            return this.f349250b.getPosition();
        }

        public int getSize() {
            return 1;
        }
    }

    public ClusterManager(Context context, TencentMap tencentMap) {
        this(context, tencentMap, new MarkerManager(tencentMap));
    }

    public void addItem(T t) {
        this.f349235e.writeLock().lock();
        try {
            this.f349234d.addItem(t);
        } finally {
            this.f349235e.writeLock().unlock();
        }
    }

    public void addItems(Collection<T> collection) {
        this.f349235e.writeLock().lock();
        try {
            this.f349234d.addItems(collection);
        } finally {
            this.f349235e.writeLock().unlock();
        }
    }

    public void cancel() {
        clearItems();
        if (!this.f349239i.cancel(true)) {
            this.f349236f.cancel();
        }
    }

    public void clearItems() {
        this.f349235e.writeLock().lock();
        try {
            this.f349234d.clearItems();
        } finally {
            this.f349235e.writeLock().unlock();
        }
    }

    public void cluster() {
        this.f349240j.writeLock().lock();
        try {
            this.f349239i.cancel(true);
            ClusterManager<T>.a aVar = new C116385a();
            this.f349239i = aVar;
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Float[]{Float.valueOf(this.f349237g.getCameraPosition().getZoom())});
        } finally {
            this.f349240j.writeLock().unlock();
        }
    }

    public Algorithm<T> getAlgorithm() {
        return this.f349234d;
    }

    public MarkerManager.Collection getClusterMarkerCollection() {
        return this.f349233c;
    }

    public View getInfoWindow(Marker marker) {
        return getMarkerManager().getInfoWindow(marker);
    }

    public MarkerManager.Collection getMarkerCollection() {
        return this.f349232b;
    }

    public MarkerManager getMarkerManager() {
        return this.f349231a;
    }

    public ClusterRenderer<T> getRenderer() {
        return this.f349236f;
    }

    public boolean isClusterEnabled() {
        return this.f349241k;
    }

    public void onCameraChange(CameraPosition cameraPosition) {
    }

    public void onCameraChangeFinish(CameraPosition cameraPosition) {
        if (this.f349241k) {
            ClusterRenderer<T> clusterRenderer = this.f349236f;
            if (clusterRenderer instanceof TencentMap.OnMapCameraChangeListener) {
                ((TencentMap.OnMapCameraChangeListener) clusterRenderer).onCameraChangeFinish(cameraPosition);
            }
            CameraPosition cameraPosition2 = this.f349237g.getCameraPosition();
            CameraPosition cameraPosition3 = this.f349238h;
            if (cameraPosition3 == null || cameraPosition3.getZoom() != cameraPosition2.getZoom()) {
                this.f349238h = this.f349237g.getCameraPosition();
                cluster();
            }
        }
    }

    public void onInfoWindowClick(Marker marker) {
        getMarkerManager().onInfoWindowClick(marker);
    }

    public void onInfoWindowDettached(Marker marker, View view) {
    }

    public boolean onMarkerClick(Marker marker) {
        return getMarkerManager().onMarkerClick(marker);
    }

    public void removeItem(T t) {
        this.f349235e.writeLock().lock();
        try {
            this.f349234d.removeItem(t);
        } finally {
            this.f349235e.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void setAlgorithm(Algorithm<T> algorithm) {
        this.f349235e.writeLock().lock();
        try {
            Algorithm<T> algorithm2 = this.f349234d;
            if (algorithm2 != null) {
                algorithm.addItems(algorithm2.getItems());
            }
            this.f349234d = new PreCachingAlgorithmDecorator(algorithm);
            this.f349235e.writeLock().unlock();
            cluster();
        } catch (Throwable th) {
            this.f349235e.writeLock().unlock();
            throw th;
        }
    }

    public void setClusterEnabled(boolean z) {
        if (this.f349241k ^ z) {
            this.f349241k = z;
            cluster();
        }
    }

    public void setClusterInfoWindowAdapter(ClusterInfoWindowAdapter<T> clusterInfoWindowAdapter) {
        this.f349244n = clusterInfoWindowAdapter;
        this.f349236f.setInfoWindowAdapter(clusterInfoWindowAdapter);
    }

    public void setClusterItemInfoWindowAdapter(ClusterItemInfoWindowAdapter<T> clusterItemInfoWindowAdapter) {
        this.f349247q = clusterItemInfoWindowAdapter;
        this.f349236f.setItemInfoWindowAdapter(clusterItemInfoWindowAdapter);
    }

    public void setOnClusterClickListener(OnClusterClickListener<T> onClusterClickListener) {
        this.f349246p = onClusterClickListener;
        this.f349236f.setOnClusterClickListener(onClusterClickListener);
    }

    public void setOnClusterInfoWindowClickListener(OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.f349243m = onClusterInfoWindowClickListener;
        this.f349236f.setOnClusterInfoWindowClickListener(onClusterInfoWindowClickListener);
    }

    public void setOnClusterItemClickListener(OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.f349242l = onClusterItemClickListener;
        this.f349236f.setOnClusterItemClickListener(onClusterItemClickListener);
    }

    public void setOnClusterItemInfoWindowClickListener(OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.f349245o = onClusterItemInfoWindowClickListener;
        this.f349236f.setOnClusterItemInfoWindowClickListener(onClusterItemInfoWindowClickListener);
    }

    public void setRenderer(ClusterRenderer<T> clusterRenderer) {
        this.f349236f.setOnClusterClickListener((OnClusterClickListener) null);
        this.f349236f.setOnClusterItemClickListener((OnClusterItemClickListener) null);
        this.f349233c.mo178899a();
        this.f349232b.mo178899a();
        this.f349236f.onRemove();
        this.f349236f = clusterRenderer;
        clusterRenderer.onAdd();
        this.f349236f.setOnClusterClickListener(this.f349246p);
        this.f349236f.setOnClusterInfoWindowClickListener(this.f349243m);
        this.f349236f.setOnClusterItemClickListener(this.f349242l);
        this.f349236f.setOnClusterItemInfoWindowClickListener(this.f349245o);
        cluster();
    }

    private ClusterManager(Context context, TencentMap tencentMap, MarkerManager markerManager) {
        this.f349235e = new ReentrantReadWriteLock();
        this.f349240j = new ReentrantReadWriteLock();
        this.f349241k = true;
        this.f349237g = tencentMap;
        this.f349231a = markerManager;
        this.f349233c = markerManager.mo178896a();
        this.f349232b = markerManager.mo178896a();
        this.f349236f = new DefaultClusterRenderer(context, tencentMap, this);
        this.f349234d = new PreCachingAlgorithmDecorator(new NonHierarchicalDistanceBasedAlgorithm(context));
        this.f349239i = new C116385a();
        this.f349236f.onAdd();
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager$a */
    public class C116385a extends AsyncTask<Float, Void, Set<? extends Cluster<T>>> {
        private C116385a() {
        }

        /* renamed from: a */
        public Set<? extends Cluster<T>> doInBackground(Float... fArr) {
            Set set;
            ClusterManager.this.f349235e.readLock().lock();
            try {
                if (ClusterManager.this.f349241k) {
                    if (fArr != null) {
                        set = ClusterManager.this.f349234d.getClusters((double) fArr[0].floatValue());
                        return set;
                    }
                }
                HashSet hashSet = new HashSet();
                for (ClusterItem bVar : ClusterManager.this.f349234d.getItems()) {
                    hashSet.add(new C116386b(bVar));
                }
                set = hashSet;
                return set;
            } finally {
                ClusterManager.this.f349235e.readLock().unlock();
            }
        }

        /* renamed from: a */
        public void onPostExecute(Set<? extends Cluster<T>> set) {
            ClusterManager.this.f349236f.onClustersChanged(set);
        }
    }
}
