package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.map.lib.models.IndoorCellInfo;
import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.tencentmap.mapsdk.maps.CustomRender;
import com.tencent.tencentmap.mapsdk.maps.LocationSource;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapComponent;
import com.tencent.tencentmap.mapsdk.maps.model.Arc;
import com.tencent.tencentmap.mapsdk.maps.model.ArcOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapFontSize;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.Polygon;
import com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import com.tencent.tencentmap.mapsdk.maps.model.RestrictBoundsFitMode;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.bm */
public abstract class C113563bm implements C0937bu, TencentMap {
    /* renamed from: a */
    public void mo171700a(int i) {
        C113896kq.m157655a(C0950kp.f2277W, "setIndoorConfigType", (Object) Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo171701a(Bundle bundle) {
    }

    /* renamed from: a */
    public abstract void mo171702a(boolean z);

    /* renamed from: a */
    public abstract boolean mo171703a();

    public Arc addArc(ArcOptions arcOptions) {
        C113896kq.m157655a(C0950kp.f2277W, "addArc", (Object) arcOptions != null ? arcOptions.toString() : "");
        return null;
    }

    public Circle addCircle(CircleOptions circleOptions) {
        C113896kq.m157655a(C0950kp.f2277W, "addCircle", (Object) circleOptions != null ? circleOptions.toString() : "");
        return null;
    }

    public CustomLayer addCustomLayer(CustomLayerOptions customLayerOptions) {
        getMapContext().getContext();
        C113896kq.m157655a(C0950kp.f2277W, "addCustomLayer", (Object) C113896kq.m157649a(customLayerOptions != null ? customLayerOptions.getLayerId() : ""));
        return null;
    }

    public Marker addMarker(MarkerOptions markerOptions) {
        C113896kq.m157655a(C0950kp.f2277W, "addMarker", (Object) markerOptions != null ? markerOptions.toString() : "");
        return null;
    }

    public void addOnMapLoadedCallback(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        C113896kq.m157655a(C0950kp.f2277W, "addOnMapLoadedCallback", (Object) Boolean.valueOf(onMapLoadedCallback != null));
    }

    public Polygon addPolygon(PolygonOptions polygonOptions) {
        C113896kq.m157655a(C0950kp.f2277W, "addPolygon", (Object) polygonOptions != null ? polygonOptions.toString() : "");
        return null;
    }

    public Polyline addPolyline(PolylineOptions polylineOptions) {
        C113896kq.m157655a(C0950kp.f2277W, "addPolyline", (Object) polylineOptions != null ? polylineOptions.toString() : "");
        return null;
    }

    public void addTencentMapGestureListener(TencentMapGestureListener tencentMapGestureListener) {
        C113896kq.m157655a(C0950kp.f2277W, "addTencentMapGestureListener", (Object) Boolean.valueOf(tencentMapGestureListener != null));
    }

    public TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        C113896kq.m157655a(C0950kp.f2277W, "addTileOverlay", (Object) tileOverlayOptions != null ? tileOverlayOptions.toString() : "");
        return null;
    }

    /* renamed from: b */
    public abstract void mo171713b();

    /* renamed from: b */
    public final void mo922b(Bundle bundle) {
        C113896kq.m157663b(C0950kp.f2267M);
        mo171701a(bundle);
        C113896kq.m157671d(C0950kp.f2267M);
    }

    /* renamed from: c */
    public abstract void mo171714c();

    public void clear() {
        C113896kq.m157655a(C0950kp.f2277W, "clear", (Object) Integer.valueOf(C113896kq.m157673e(C0950kp.f2277W, "clear")));
    }

    public void clearAllOverlays() {
        C113896kq.m157655a(C0950kp.f2277W, "clearAllOverlays", (Object) Integer.valueOf(C113896kq.m157673e(C0950kp.f2277W, "clearAllOverlays")));
    }

    public void clearCache() {
        C113896kq.m157655a(C0950kp.f2277W, "clearCache", (Object) Integer.valueOf(C113896kq.m157673e(C0950kp.f2277W, "clearCache")));
    }

    /* renamed from: d */
    public abstract void mo171718d();

    /* renamed from: e */
    public abstract void mo171719e();

    public void enableAutoMaxSkew(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "enableAutoMaxSkew", (Object) Boolean.valueOf(z));
    }

    public void enableMultipleInfowindow(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "enableMultipleInfowindow", (Object) Boolean.valueOf(z));
    }

    /* renamed from: f */
    public abstract void mo171722f();

    /* renamed from: g */
    public void mo171723g() {
    }

    public <T extends TencentMapComponent.Component> T getMapComponent(Class<T> cls) {
        return getMapContext().getMapComponent(cls);
    }

    /* renamed from: h */
    public final void mo923h() {
        C113896kq.m157663b(C0950kp.f2268N);
        mo171713b();
        C113896kq.m157671d(C0950kp.f2268N);
    }

    /* renamed from: i */
    public final void mo924i() {
        C113896kq.m157663b(C0950kp.f2269O);
        mo171714c();
        C113896kq.m157671d(C0950kp.f2269O);
    }

    /* renamed from: j */
    public final void mo925j() {
        C113896kq.m157663b(C0950kp.f2271Q);
        mo171718d();
        C113896kq.m157671d(C0950kp.f2271Q);
    }

    /* renamed from: k */
    public final void mo926k() {
        C113896kq.m157663b(C0950kp.f2270P);
        C113896kq.m157671d(C0950kp.f2270P);
    }

    /* renamed from: l */
    public final void mo927l() {
        C113896kq.m157663b(C0950kp.f2272R);
        mo171722f();
        C113896kq.m157671d(C0950kp.f2272R);
    }

    public void loadKMLFile(String str) {
        C113896kq.m157655a(C0950kp.f2277W, "loadKMLFile", (Object) str);
    }

    /* renamed from: m */
    public final void mo928m() {
        C113896kq.m157663b(C0950kp.f2273S);
        mo171723g();
        C113896kq.m157671d(C0950kp.f2273S);
    }

    public void removeOnMapLoadedCallback(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        C113896kq.m157655a(C0950kp.f2277W, "removeOnMapLoadedCallback", (Object) Boolean.valueOf(onMapLoadedCallback != null));
    }

    public void removeTencentMapGestureListener(TencentMapGestureListener tencentMapGestureListener) {
        C113896kq.m157655a(C0950kp.f2277W, "removeTencentMapGestureListener", (Object) Boolean.valueOf(tencentMapGestureListener != null));
    }

    public void resetIndoorCellInfo() {
        C113896kq.m157655a(C0950kp.f2277W, "resetIndoorParkSpaceColors", (Object) "");
    }

    public void setBlockRouteEnabled(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setBlockRouteEnabled", (Object) Boolean.valueOf(z));
    }

    public void setBuilding3dEffectEnable(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setBuilding3dEffectEnable", (Object) Boolean.valueOf(z));
    }

    public void setBuildingBlackList(List<LatLngBounds> list) {
        C113896kq.m157655a(C0950kp.f2277W, "setBuildingBlackList", (Object) list != null ? list.toString() : "");
    }

    public void setBuildingEnable(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setBuildingEnable", (Object) Boolean.valueOf(z));
    }

    public void setCameraCenterProportion(float f, float f2) {
        C113896kq.m157655a(C0950kp.f2277W, "setCameraCenterProportion", (Object) f + "#" + f2);
    }

    public void setCustomRender(CustomRender customRender) {
        C113896kq.m157655a(C0950kp.f2277W, "setCustomRender", (Object) customRender);
    }

    public void setDrawPillarWith2DStyle(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setDrawPillarWith2DStyle", (Object) Boolean.valueOf(z));
    }

    public void setForeignLanguage(Language language) {
        C113896kq.m157655a(C0950kp.f2277W, "setForeignLanguage", (Object) language);
    }

    public void setHandDrawMapEnable(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setHandDrawMapEnable", (Object) Boolean.valueOf(z));
    }

    public void setIndoorCellInfo(List<IndoorCellInfo> list) {
        C113896kq.m157655a(C0950kp.f2277W, "setIndoorParkSpaceColors", (Object) list != null ? list.toString() : "");
    }

    public void setIndoorEnabled(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setIndoorEnabled", (Object) Boolean.valueOf(z));
    }

    public void setIndoorFloor(int i) {
        C113896kq.m157655a(C0950kp.f2277W, "setIndoorFloor", (Object) Integer.valueOf(i));
    }

    public void setIndoorMaskColor(int i) {
        C113896kq.m157655a(C0950kp.f2277W, "setIndoorMaskColor", (Object) Integer.valueOf(i));
    }

    public void setInfoWindowAdapter(TencentMap.InfoWindowAdapter infoWindowAdapter) {
        C113896kq.m157655a(C0950kp.f2277W, "setInfoWindowAdapter", (Object) Boolean.valueOf(infoWindowAdapter != null));
    }

    public void setLocationCompassHidden(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setLocationCompassEnabled", (Object) Boolean.valueOf(z));
    }

    public void setLocationNavigationGravityLineHidden(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setLocationNavigationGravityLineEnabled", (Object) Boolean.valueOf(z));
    }

    public void setLocationSource(LocationSource locationSource) {
        if (locationSource != null) {
            C113896kq.m157655a(C0950kp.f2277W, "setLocationSource", (Object) locationSource.getClass().getSimpleName());
        }
    }

    public void setMapCenterAndScale(float f, float f2, float f3) {
        C113896kq.m157655a(C0950kp.f2277W, "setMapCenterAndScale", (Object) f + "#" + f2 + "#" + f3);
    }

    public void setMapFontSize(MapFontSize mapFontSize) {
        C113896kq.m157655a(C0950kp.f2277W, "setMapFontSize", (Object) mapFontSize);
    }

    public void setMapFrameRate(float f) {
        C113896kq.m157655a(C0950kp.f2277W, "setMapFrameRate", (Object) Float.valueOf(f));
    }

    public void setMapStyle(int i) {
        C113896kq.m157655a(C0950kp.f2277W, "setMapStyle", (Object) Integer.valueOf(i));
    }

    public void setMapType(int i) {
        C113896kq.m157655a(C0950kp.f2277W, "setMapType", (Object) Integer.valueOf(i));
    }

    public void setMaxZoomLevel(int i) {
        C113896kq.m157655a(C0950kp.f2277W, "setMaxZoomLevel", (Object) Integer.valueOf(i));
    }

    public void setMinZoomLevel(int i) {
        C113896kq.m157655a(C0950kp.f2277W, "setMinZoomLevel", (Object) Integer.valueOf(i));
    }

    public void setMyLocationClickListener(TencentMap.OnMyLocationClickListener onMyLocationClickListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setMyLocationClickListener", (Object) Boolean.valueOf(onMyLocationClickListener != null));
    }

    public void setMyLocationEnabled(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setMyLocationEnabled", (Object) Boolean.valueOf(z));
    }

    public void setMyLocationStyle(MyLocationStyle myLocationStyle) {
        C113896kq.m157655a(C0950kp.f2277W, "setMyLocationStyle", (Object) myLocationStyle != null ? myLocationStyle.toString() : "");
    }

    public void setOnCameraChangeListener(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnCameraChangeListener", (Object) Boolean.valueOf(onCameraChangeListener != null));
    }

    public void setOnCompassClickedListener(TencentMap.OnCompassClickedListener onCompassClickedListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnCompassClickedListener", (Object) Boolean.valueOf(onCompassClickedListener != null));
    }

    public void setOnIndoorStateChangeListener(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnIndoorStateChangeListener", (Object) Boolean.valueOf(onIndoorStateChangeListener != null));
    }

    public void setOnInfoWindowClickListener(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        C113896kq.m157655a(C0950kp.f2277W, "OnInfoWindowClickListener", (Object) Boolean.valueOf(onInfoWindowClickListener != null));
    }

    public void setOnMapClickListener(TencentMap.OnMapClickListener onMapClickListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnMapClickListener", (Object) Boolean.valueOf(onMapClickListener != null));
    }

    public void setOnMapLoadedCallback(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        addOnMapLoadedCallback(onMapLoadedCallback);
    }

    public void setOnMapLongClickListener(TencentMap.OnMapLongClickListener onMapLongClickListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnMapLongClickListener", (Object) Boolean.valueOf(onMapLongClickListener != null));
    }

    public void setOnMapPoiClickListener(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnMapPoiClickListener", (Object) Boolean.valueOf(onMapPoiClickListener != null));
    }

    public void setOnMarkerClickListener(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnMarkerClickListener", (Object) Boolean.valueOf(onMarkerClickListener != null));
    }

    public void setOnMarkerDragListener(TencentMap.OnMarkerDragListener onMarkerDragListener) {
        C113896kq.m157655a(C0950kp.f2277W, "OnMarkerDragListener", (Object) Boolean.valueOf(onMarkerDragListener != null));
    }

    public void setOnMyLocationChangeListener(TencentMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnMyLocationChangeListener", (Object) Boolean.valueOf(onMyLocationChangeListener != null));
    }

    public void setOnPolygonClickListener(TencentMap.OnPolygonClickListener onPolygonClickListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnPolygonClickListener", (Object) Boolean.valueOf(onPolygonClickListener != null));
    }

    public void setOnPolylineClickListener(TencentMap.OnPolylineClickListener onPolylineClickListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnPolylineClickListener", (Object) Boolean.valueOf(onPolylineClickListener != null));
    }

    public void setOnScaleViewChangedListener(TencentMap.OnScaleViewChangedListener onScaleViewChangedListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnScaleViewChangedListener", (Object) Boolean.valueOf(onScaleViewChangedListener != null));
    }

    public void setOnTapMapViewInfoWindowHidden(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnTapMapViewInfoWindowHidden", (Object) Boolean.valueOf(z));
    }

    public void setOnTrafficEventClickListener(TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnTrafficEventClickListener", (Object) Boolean.valueOf(onTrafficEventClickListener != null));
    }

    public void setOnVectorOverlayClickListener(TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setOnVectorOverlayClickListener", (Object) Boolean.valueOf(onVectorOverlayClickListener != null));
    }

    public void setOverSeaEnable(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "enableOverSea", (Object) Boolean.valueOf(z));
    }

    public void setOverSeaTileProvider(OverSeaTileProvider overSeaTileProvider) {
        C113896kq.m157655a(C0950kp.f2277W, "setOverSeaTileProvider", (Object) overSeaTileProvider);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        C113896kq.m157655a(C0950kp.f2277W, "setPadding", (Object) i + "#" + i2 + "#" + i3 + "#" + i4);
    }

    public void setPointToCenter(int i, int i2) {
        C113896kq.m157655a(C0950kp.f2277W, "setPointToCenter", (Object) i + "#" + i2);
    }

    public void setPoisEnabled(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setPoisEnabled", (Object) Boolean.valueOf(z));
    }

    public void setRestrictBounds(LatLngBounds latLngBounds, RestrictBoundsFitMode restrictBoundsFitMode) {
        String str;
        if (latLngBounds == null) {
            str = "null restrictBounds";
        } else {
            str = latLngBounds.toString() + "#" + restrictBoundsFitMode;
        }
        C113896kq.m157655a(C0950kp.f2277W, "setRestrictBounds", (Object) str);
    }

    public void setSatelliteEnabled(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setSatelliteEnabled", (Object) Boolean.valueOf(z));
    }

    public void setTencentMapGestureListener(TencentMapGestureListener tencentMapGestureListener) {
        C113896kq.m157655a(C0950kp.f2277W, "setTencentMapGestureListener", (Object) Boolean.valueOf(tencentMapGestureListener != null));
    }

    public void setTrafficEnabled(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setTrafficEnabled", (Object) Boolean.valueOf(z));
    }

    public void setTrafficMode(int i, int i2) {
        C113896kq.m157655a(C0950kp.f2277W, "setTrafficMode", (Object) i + "#" + i2);
    }

    public void showBuilding(boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "showBuilding", (Object) Boolean.valueOf(z));
    }

    public void snapshot(TencentMap.SnapshotReadyCallback snapshotReadyCallback, Bitmap.Config config, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(snapshotReadyCallback != null);
        sb.append("#");
        sb.append(config);
        sb.append("#");
        sb.append(i);
        C113896kq.m157655a(C0950kp.f2277W, AppBrandFileCleaner.f238098c, (Object) sb.toString());
    }

    public void stopAnimation() {
        C113896kq.m157655a(C0950kp.f2277W, "stopAnimation", (Object) Integer.valueOf(C113896kq.m157673e(C0950kp.f2277W, "stopAnimation")));
    }

    public void setCameraCenterProportion(float f, float f2, boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setCameraCenterProportion", (Object) f + "#" + f2 + "#" + z);
    }

    public void setIndoorFloor(String str, String str2) {
        C113896kq.m157655a(C0950kp.f2277W, "setIndoorFloor", (Object) str + "#" + str2);
    }

    public void setPadding(int i, int i2, int i3, int i4, boolean z) {
        C113896kq.m157655a(C0950kp.f2277W, "setPadding", (Object) i + "#" + i2 + "#" + i3 + "#" + i4 + "#" + z);
    }

    public void snapshot(TencentMap.SnapshotReadyCallback snapshotReadyCallback, Bitmap.Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append(snapshotReadyCallback != null);
        sb.append("#");
        sb.append(config);
        C113896kq.m157655a(C0950kp.f2277W, AppBrandFileCleaner.f238098c, (Object) sb.toString());
    }

    public void snapshot(TencentMap.SnapshotReadyCallback snapshotReadyCallback) {
        C113896kq.m157655a(C0950kp.f2277W, AppBrandFileCleaner.f238098c, (Object) Boolean.valueOf(snapshotReadyCallback != null));
    }
}
