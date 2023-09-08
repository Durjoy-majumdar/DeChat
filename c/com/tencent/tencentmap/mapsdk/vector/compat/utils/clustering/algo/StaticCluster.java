package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo;

import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StaticCluster<T extends ClusterItem> implements Cluster<T> {

    /* renamed from: a */
    private final LatLng f349268a;

    /* renamed from: b */
    private final List<T> f349269b = new ArrayList();

    public StaticCluster(LatLng latLng) {
        this.f349268a = latLng;
    }

    public boolean add(T t) {
        return this.f349269b.add(t);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StaticCluster)) {
            return false;
        }
        StaticCluster staticCluster = (StaticCluster) obj;
        return staticCluster.f349268a.equals(this.f349268a) && staticCluster.f349269b.equals(this.f349269b);
    }

    public Collection<T> getItems() {
        return this.f349269b;
    }

    public LatLng getPosition() {
        return this.f349268a;
    }

    public int getSize() {
        return this.f349269b.size();
    }

    public boolean remove(T t) {
        return this.f349269b.remove(t);
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.f349268a + ", mItems.size=" + this.f349269b.size() + '}';
    }
}
