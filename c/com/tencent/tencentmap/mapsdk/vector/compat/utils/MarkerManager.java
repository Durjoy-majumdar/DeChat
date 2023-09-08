package com.tencent.tencentmap.mapsdk.vector.compat.utils;

import android.view.View;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MarkerManager implements TencentMap.InfoWindowAdapter, TencentMap.OnInfoWindowClickListener, TencentMap.OnMarkerClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TencentMap f349193a;

    /* renamed from: b */
    private final Map<String, Collection> f349194b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<Marker, Collection> f349195c = new HashMap();

    public class Collection {

        /* renamed from: b */
        private final Set<Marker> f349197b = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public TencentMap.OnInfoWindowClickListener f349198c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public TencentMap.OnMarkerClickListener f349199d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public TencentMap.InfoWindowAdapter f349200e;

        public Collection() {
        }

        public java.util.Collection<Marker> getMarkers() {
            return Collections.unmodifiableCollection(this.f349197b);
        }

        /* renamed from: a */
        public Marker mo178898a(MarkerOptions markerOptions) {
            Marker addMarker = MarkerManager.this.f349193a.addMarker(markerOptions);
            this.f349197b.add(addMarker);
            MarkerManager.this.f349195c.put(addMarker, this);
            return addMarker;
        }

        /* renamed from: a */
        public boolean mo178903a(Marker marker) {
            if (!this.f349197b.remove(marker)) {
                return false;
            }
            MarkerManager.this.f349195c.remove(marker);
            marker.remove();
            return true;
        }

        /* renamed from: a */
        public void mo178899a() {
            for (Marker next : this.f349197b) {
                next.remove();
                MarkerManager.this.f349195c.remove(next);
            }
            this.f349197b.clear();
        }

        /* renamed from: a */
        public void mo178901a(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
            this.f349198c = onInfoWindowClickListener;
        }

        /* renamed from: a */
        public void mo178902a(TencentMap.OnMarkerClickListener onMarkerClickListener) {
            this.f349199d = onMarkerClickListener;
        }

        /* renamed from: a */
        public void mo178900a(TencentMap.InfoWindowAdapter infoWindowAdapter) {
            this.f349200e = infoWindowAdapter;
        }
    }

    public MarkerManager(TencentMap tencentMap) {
        this.f349193a = tencentMap;
    }

    public View getInfoWindow(Marker marker) {
        Collection collection = this.f349195c.get(marker);
        if (collection == null || collection.f349200e == null) {
            return null;
        }
        return collection.f349200e.getInfoWindow(marker);
    }

    public void onInfoWindowClick(Marker marker) {
        Collection collection = this.f349195c.get(marker);
        if (collection != null && collection.f349198c != null) {
            collection.f349198c.onInfoWindowClick(marker);
        }
    }

    public void onInfoWindowDettached(Marker marker, View view) {
    }

    public boolean onMarkerClick(Marker marker) {
        Collection collection = this.f349195c.get(marker);
        if (collection == null || collection.f349199d == null) {
            return false;
        }
        return collection.f349199d.onMarkerClick(marker);
    }

    /* renamed from: a */
    public Collection mo178896a() {
        return new Collection();
    }

    /* renamed from: a */
    public boolean mo178897a(Marker marker) {
        Collection collection = this.f349195c.get(marker);
        return collection != null && collection.mo178903a(marker);
    }
}
