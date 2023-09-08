package yw3;

import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.tencentmap.mapsdk.map.CameraParameter;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yw3.n */
public class C119023n {

    /* renamed from: yw3.n$a */
    public static /* synthetic */ class C119024a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f356486a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tencent.mapsdk.raster.model.Language[] r0 = com.tencent.mapsdk.raster.model.Language.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f356486a = r0
                com.tencent.mapsdk.raster.model.Language r1 = com.tencent.mapsdk.raster.model.Language.zh     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f356486a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.mapsdk.raster.model.Language r1 = com.tencent.mapsdk.raster.model.Language.en     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yw3.C119023n.C119024a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static LatLng m167767a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new LatLng(latLng.latitude, latLng.longitude);
    }

    /* renamed from: b */
    public static List<LatLng> m167768b(List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        if (list == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr = (com.tencent.tencentmap.mapsdk.maps.model.LatLng[]) list.toArray(new com.tencent.tencentmap.mapsdk.maps.model.LatLng[list.size()]);
        ArrayList arrayList = new ArrayList();
        for (com.tencent.tencentmap.mapsdk.maps.model.LatLng a : latLngArr) {
            arrayList.add(m167767a(a));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static CameraPosition m167769c(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return null;
        }
        return new CameraPosition(m167767a(cameraPosition.target), cameraPosition.zoom, cameraPosition.tilt, cameraPosition.bearing);
    }

    /* renamed from: d */
    public static LatLngBounds m167770d(com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds) {
        if (latLngBounds == null || latLngBounds.getNortheast() == null || latLngBounds.getSouthwest() == null) {
            return null;
        }
        return new LatLngBounds(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLngBounds.getSouthwest().getLatitude(), latLngBounds.getSouthwest().getLongitude()), new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLngBounds.getNortheast().getLatitude(), latLngBounds.getNortheast().getLongitude()));
    }

    /* renamed from: e */
    public static CameraUpdate m167771e(com.tencent.tencentmap.mapsdk.map.CameraUpdate cameraUpdate, TencentMap tencentMap) {
        int i;
        int i2;
        int i3;
        int i4;
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition = null;
        if (cameraUpdate == null || cameraUpdate.getParams() == null) {
            return null;
        }
        CameraParameter params = cameraUpdate.getParams();
        switch (cameraUpdate.getParams().cameraUpdate_type) {
            case 0:
                return CameraUpdateFactory.zoomIn();
            case 1:
                return CameraUpdateFactory.zoomOut();
            case 2:
                return CameraUpdateFactory.scrollBy(params.scrollBy_xPixel, params.scrollBy_yPixel);
            case 3:
                return CameraUpdateFactory.zoomTo(params.zoomTo_zoom < tencentMap.getMinZoomLevel() ? tencentMap.getMinZoomLevel() : params.zoomTo_zoom > tencentMap.getMaxZoomLevel() ? tencentMap.getMaxZoomLevel() : params.zoomTo_zoom);
            case 4:
                return CameraUpdateFactory.zoomBy(params.zoomBy_amount);
            case 5:
                return CameraUpdateFactory.zoomBy(params.zoomBy_Point_amount, params.zoomBy_Point_focus);
            case 6:
                CameraPosition cameraPosition2 = params.newCameraPosition;
                if (cameraPosition2 != null) {
                    cameraPosition = new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition(m167772f(cameraPosition2.getTarget()), cameraPosition2.getZoom(), cameraPosition2.getSkew(), cameraPosition2.getBearing());
                }
                return CameraUpdateFactory.newCameraPosition(cameraPosition);
            case 7:
                return CameraUpdateFactory.newLatLng(m167772f(params.newLatLng));
            case 8:
                return CameraUpdateFactory.newLatLngZoom(m167772f(params.newLatLngZoom_latlng), params.newLatLngZoom_zoom);
            case 9:
                return CameraUpdateFactory.newLatLngBounds(m167770d(params.newLatLngBounds_bounds), params.newLatLngBounds_padding);
            case 10:
                int i5 = 0;
                if (tencentMap == null || tencentMap.getMapWidth() == 0 || tencentMap.getMapWidth() == 0) {
                    i = 0;
                    i3 = 0;
                } else {
                    if (params.newLatLngBounds_dimension_width < tencentMap.getMapWidth()) {
                        i3 = (tencentMap.getMapWidth() / 2) - ((params.newLatLngBounds_dimension_width / 2) - params.newLatLngBounds_dimension_padding);
                        i4 = i3;
                    } else {
                        i3 = 0;
                        i4 = 0;
                    }
                    if (params.newLatLngBounds_dimension_height < tencentMap.getMapHeight()) {
                        i = (tencentMap.getMapHeight() / 2) - ((params.newLatLngBounds_dimension_height / 2) - params.newLatLngBounds_dimension_padding);
                        i5 = i4;
                        i2 = i;
                        return CameraUpdateFactory.newLatLngBoundsRect(m167770d(params.newLatLngBounds_dimension_bounds), i5, i3, i, i2);
                    }
                    i5 = i4;
                    i = 0;
                }
                i2 = 0;
                return CameraUpdateFactory.newLatLngBoundsRect(m167770d(params.newLatLngBounds_dimension_bounds), i5, i3, i, i2);
            case 11:
                return CameraUpdateFactory.newLatLngBoundsWithMapCenter(m167770d(params.newLatLngBounds_bounds), m167772f(params.newLatLng), params.newLatLngBounds_padding);
            case 12:
                return CameraUpdateFactory.newLatLngBoundsRect(m167770d(params.newLatLngBounds_dimension_bounds), params.newLatLngBoundsRects_padLeft, params.newLatLngBoundsRects_padRight, params.newLatLngBoundsRects_padTop, params.newLatLngBoundsRects_padBom);
            default:
                return null;
        }
    }

    /* renamed from: f */
    public static com.tencent.tencentmap.mapsdk.maps.model.LatLng m167772f(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.getLatitude(), latLng.getLongitude());
    }

    /* renamed from: g */
    public static List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> m167773g(List<LatLng> list) {
        if (list == null) {
            return null;
        }
        LatLng[] latLngArr = (LatLng[]) list.toArray(new LatLng[list.size()]);
        ArrayList arrayList = new ArrayList();
        for (LatLng f : latLngArr) {
            arrayList.add(m167772f(f));
        }
        return arrayList;
    }
}
