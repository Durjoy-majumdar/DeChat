package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo;

import android.content.Context;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a.C116376a;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a.C116377b;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a.C116378c;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a.C116379d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> implements Algorithm<T> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C116378c f349253f = new C116378c(1.0d);

    /* renamed from: a */
    private Context f349254a;

    /* renamed from: b */
    private int f349255b = 35;

    /* renamed from: c */
    private int f349256c;

    /* renamed from: d */
    private final Collection<QuadItem<T>> f349257d = new ArrayList();

    /* renamed from: e */
    private final C116379d<QuadItem<T>> f349258e = new C116379d(0.0d, 1.0d, 0.0d, 1.0d);

    public static class QuadItem<T extends ClusterItem> implements C116379d.C116380a, Cluster<T> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final T f349259a;

        /* renamed from: b */
        private final C116377b f349260b;

        /* renamed from: c */
        private final LatLng f349261c;

        /* renamed from: d */
        private Set<T> f349262d;

        public boolean equals(Object obj) {
            if (!(obj instanceof QuadItem)) {
                return false;
            }
            return ((QuadItem) obj).f349259a.equals(this.f349259a);
        }

        public C116377b getPoint() {
            return this.f349260b;
        }

        public LatLng getPosition() {
            return this.f349261c;
        }

        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.f349259a.hashCode();
        }

        private QuadItem(T t) {
            this.f349259a = t;
            LatLng position = t.getPosition();
            this.f349261c = position;
            this.f349260b = NonHierarchicalDistanceBasedAlgorithm.f349253f.mo178914a(position);
            this.f349262d = Collections.singleton(t);
        }

        public Set<T> getItems() {
            return this.f349262d;
        }
    }

    public NonHierarchicalDistanceBasedAlgorithm(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f349254a = applicationContext;
        this.f349256c = (int) ((applicationContext.getResources().getDisplayMetrics().density * ((float) this.f349255b)) + 0.5f);
    }

    public void addItem(T t) {
        QuadItem quadItem = new QuadItem(t);
        synchronized (this.f349258e) {
            this.f349257d.add(quadItem);
            this.f349258e.mo178917a(quadItem);
        }
    }

    public void addItems(Collection<T> collection) {
        for (T addItem : collection) {
            addItem(addItem);
        }
    }

    public void clearItems() {
        synchronized (this.f349258e) {
            this.f349257d.clear();
            this.f349258e.mo178916a();
        }
    }

    public Set<? extends Cluster<T>> getClusters(double d) {
        int i = 1;
        double pow = (((double) this.f349256c) / Math.pow(2.0d, (double) (((int) d) + 1))) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (this.f349258e) {
            for (QuadItem next : this.f349257d) {
                if (!hashSet.contains(next)) {
                    Collection<QuadItem<T>> a = this.f349258e.mo178915a(m164066a(next.getPoint(), pow));
                    if (a.size() == i) {
                        hashSet2.add(next);
                        hashSet.add(next);
                        hashMap.put(next, Double.valueOf(0.0d));
                    } else {
                        StaticCluster staticCluster = new StaticCluster(next.f349259a.getPosition());
                        hashSet2.add(staticCluster);
                        for (QuadItem next2 : a) {
                            Double d2 = (Double) hashMap.get(next2);
                            double d3 = pow;
                            double a2 = m164065a(next2.getPoint(), next.getPoint());
                            if (d2 != null) {
                                if (d2.doubleValue() < a2) {
                                    pow = d3;
                                } else {
                                    ((StaticCluster) hashMap2.get(next2)).remove(next2.f349259a);
                                }
                            }
                            hashMap.put(next2, Double.valueOf(a2));
                            staticCluster.add(next2.f349259a);
                            hashMap2.put(next2, staticCluster);
                            pow = d3;
                        }
                        hashSet.addAll(a);
                        pow = pow;
                        i = 1;
                    }
                }
            }
        }
        return hashSet2;
    }

    public Collection<T> getItems() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f349258e) {
            for (QuadItem<T> a : this.f349257d) {
                arrayList.add(a.f349259a);
            }
        }
        return arrayList;
    }

    public int getMaxDistanceAtZoom() {
        return this.f349255b;
    }

    public void removeItem(T t) {
        QuadItem quadItem = new QuadItem(t);
        synchronized (this.f349258e) {
            this.f349257d.remove(quadItem);
            this.f349258e.mo178918b(quadItem);
        }
    }

    public void setMaxDistanceAtZoom(int i) {
        this.f349255b = i;
        this.f349256c = (int) ((this.f349254a.getResources().getDisplayMetrics().density * ((float) this.f349255b)) + 0.5f);
    }

    /* renamed from: a */
    private double m164065a(C116377b bVar, C116377b bVar2) {
        double d = bVar.f349207a;
        double d2 = bVar2.f349207a;
        double d3 = (d - d2) * (d - d2);
        double d4 = bVar.f349208b;
        double d5 = bVar2.f349208b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }

    /* renamed from: a */
    private C116376a m164066a(C116377b bVar, double d) {
        double d2 = d / 2.0d;
        double d3 = bVar.f349207a;
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        double d6 = bVar.f349208b;
        return new C116376a(d4, d5, d6 - d2, d6 + d2);
    }
}
