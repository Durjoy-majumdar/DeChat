package yw3;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mapsdk.rastercore.LogHelper;
import com.tencent.mapsdk.rastercore.MapProvider;
import com.tencent.tencentmap.mapsdk.map.IMapView;
import com.tencent.tencentmap.mapsdk.map.MapController;
import com.tencent.tencentmap.mapsdk.map.MapView;
import com.tencent.tencentmap.mapsdk.map.Projection;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.map.UiSettings;
import com.tencent.tencentmap.mapsdk.maps.MapRenderLayer;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;

/* renamed from: yw3.a */
public class C119001a implements IMapView {

    /* renamed from: d */
    public MapRenderLayer f356439d;

    /* renamed from: e */
    public TencentMap f356440e;

    public C119001a(Context context, TencentMapOptions tencentMapOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions2;
        LogHelper.m160679v("VecotrMapRenderLayer construct function start");
        if (tencentMapOptions != null) {
            tencentMapOptions2 = new com.tencent.tencentmap.mapsdk.maps.TencentMapOptions();
            tencentMapOptions2.setCustomCacheRootPath(MapProvider.getMapSdkPath());
            if (tencentMapOptions.getExtSurface() != null) {
                tencentMapOptions2.setExtSurface(tencentMapOptions.getExtSurface());
                tencentMapOptions2.setExtSurfaceDimension(tencentMapOptions.getExtSurfaceWidth(), tencentMapOptions.getExtSurfaceHeight());
            }
            tencentMapOptions2.setHandDrawMapEnable(tencentMapOptions.isHandDrawMapEnable());
            tencentMapOptions2.setSubInfo(tencentMapOptions.getSubKey(), tencentMapOptions.getSubId());
            tencentMapOptions2.setMultipleInfoWindowEnable(tencentMapOptions.isMutipleInfowindowEnabled());
            tencentMapOptions2.enableMSAA(tencentMapOptions.enableMSAA());
            if (tencentMapOptions.getProtocolDataDesc() != null) {
                tencentMapOptions2.setServiceProtocol(tencentMapOptions.getProtocolFrom(), tencentMapOptions.getProtocolDataDesc());
            }
        } else {
            tencentMapOptions2 = new com.tencent.tencentmap.mapsdk.maps.TencentMapOptions();
            tencentMapOptions2.setCustomCacheRootPath(MapProvider.getMapSdkPath());
        }
        MapRenderLayer mapRenderLayer = new MapRenderLayer(context, tencentMapOptions2);
        this.f356439d = mapRenderLayer;
        this.f356440e = new C119009i(mapRenderLayer.getMap());
        this.f356439d.getMap().getUiSettings().setZoomControlsEnabled(false);
    }

    public void addView(View view, MapView.LayoutParams layoutParams) {
        if (this.f356439d.getMap() != null) {
            this.f356439d.getMap().addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromView(view)).position(C119023n.m167772f(layoutParams.point)));
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MapRenderLayer mapRenderLayer = this.f356439d;
        if (mapRenderLayer == null) {
            return false;
        }
        return mapRenderLayer.dispatchTouchEvent(motionEvent) || this.f356439d.onTouchEvent(motionEvent);
    }

    public TencentMap getMap() {
        return this.f356440e;
    }

    public MapController getMapController() {
        return this.f356440e;
    }

    public View getMapView() {
        return this.f356439d;
    }

    public Projection getProjection() {
        TencentMap tencentMap = this.f356440e;
        if (tencentMap != null) {
            return ((C119009i) tencentMap).getProjection();
        }
        return null;
    }

    public UiSettings getUiSettings() {
        if (this.f356439d.getMap() != null) {
            return new C27714o(this.f356439d.getMap().getUiSettings());
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
        this.f356439d.onDestroy();
    }

    public void onDestroyView() {
    }

    public void onLowMemory() {
    }

    public void onPause() {
        this.f356439d.onPause();
    }

    public void onRestart() {
        this.f356439d.onRestart();
    }

    public void onResume() {
        this.f356439d.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        MapRenderLayer mapRenderLayer = this.f356439d;
        if (mapRenderLayer != null) {
            mapRenderLayer.onSizeChanged(i, i2, i3, i4);
        }
    }

    public void onStart() {
        this.f356439d.onStart();
    }

    public void onStop() {
        this.f356439d.onStop();
    }

    public void onSurfaceChanged(Object obj, int i, int i2) {
        MapRenderLayer mapRenderLayer = this.f356439d;
        if (mapRenderLayer != null) {
            mapRenderLayer.onSurfaceChanged(obj, i, i2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f356439d.onTouchEvent(motionEvent);
    }

    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        MapRenderLayer mapRenderLayer = this.f356439d;
        if (mapRenderLayer != null) {
            mapRenderLayer.updateViewLayout(view, layoutParams);
        }
    }
}
