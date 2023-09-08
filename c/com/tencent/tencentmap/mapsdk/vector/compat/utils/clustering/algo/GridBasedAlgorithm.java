package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo;

import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a.C116377b;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a.C116378c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p1042u.C111057f;

public class GridBasedAlgorithm<T extends ClusterItem> implements Algorithm<T> {

    /* renamed from: a */
    private final Set<T> f349252a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a */
    private static long m164064a(long j, double d, double d2) {
        return (long) ((((double) j) * Math.floor(d)) + Math.floor(d2));
    }

    public void addItem(T t) {
        this.f349252a.add(t);
    }

    public void addItems(Collection<T> collection) {
        this.f349252a.addAll(collection);
    }

    public void clearItems() {
        this.f349252a.clear();
    }

    public Set<? extends Cluster<T>> getClusters(double d) {
        long j;
        long ceil = (long) Math.ceil((Math.pow(2.0d, d) * 256.0d) / 100.0d);
        C116378c cVar = new C116378c((double) ceil);
        HashSet hashSet = new HashSet();
        C111057f fVar = new C111057f();
        synchronized (this.f349252a) {
            for (T t : this.f349252a) {
                C116377b a = cVar.mo178914a(t.getPosition());
                long a2 = m164064a(ceil, a.f349207a, a.f349208b);
                StaticCluster staticCluster = (StaticCluster) fVar.mo162755d(a2, null);
                if (staticCluster == null) {
                    j = ceil;
                    staticCluster = new StaticCluster(cVar.mo178913a(new C116377b(Math.floor(a.f349207a) + 0.5d, Math.floor(a.f349208b) + 0.5d)));
                    fVar.mo162756e(a2, staticCluster);
                    hashSet.add(staticCluster);
                } else {
                    j = ceil;
                }
                staticCluster.add(t);
                ceil = j;
            }
        }
        return hashSet;
    }

    public Collection<T> getItems() {
        return this.f349252a;
    }

    public void removeItem(T t) {
        this.f349252a.remove(t);
    }
}
