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
import com.tencent.tencentmap.mapsdk.maps.MapView;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import java.util.LinkedList;
import java.util.List;

/* renamed from: yw3.d */
public class C119004d implements IMapView {

    /* renamed from: d */
    public MapView f356443d;

    /* renamed from: e */
    public TencentMap f356444e;

    public C119004d(Context context, TencentMapOptions tencentMapOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions2;
        LogHelper.m160679v("vector MapView construct function start");
        if (tencentMapOptions != null) {
            tencentMapOptions2 = new com.tencent.tencentmap.mapsdk.maps.TencentMapOptions();
            tencentMapOptions2.setCustomCacheRootPath(MapProvider.getMapSdkPath());
            if (tencentMapOptions.getExtSurface() != null) {
                tencentMapOptions2.setExtSurface(tencentMapOptions.getExtSurface());
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
        MapView mapView = new MapView(context, tencentMapOptions2);
        this.f356443d = mapView;
        this.f356444e = new C119009i(mapView.getMap());
        this.f356443d.getMap().getUiSettings().setZoomControlsEnabled(false);
    }

    public void addView(View view, MapView.LayoutParams layoutParams) {
        if (this.f356443d.getMap() != null) {
            this.f356443d.getMap().addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromView(view)).position(C119023n.m167772f(layoutParams.point)));
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.tencent.tencentmap.mapsdk.maps.MapView mapView = this.f356443d;
        if (mapView == null) {
            return false;
        }
        return mapView.dispatchTouchEvent(motionEvent) || this.f356443d.onTouchEvent(motionEvent);
    }

    public TencentMap getMap() {
        return this.f356444e;
    }

    public MapController getMapController() {
        return this.f356444e;
    }

    public View getMapView() {
        return this.f356443d;
    }

    public Projection getProjection() {
        TencentMap tencentMap = this.f356444e;
        if (tencentMap != null) {
            return ((C119009i) tencentMap).getProjection();
        }
        return null;
    }

    public UiSettings getUiSettings() {
        if (this.f356443d.getMap() != null) {
            return new C27714o(this.f356443d.getMap().getUiSettings());
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
        this.f356443d.onDestroy();
        TencentMap tencentMap = this.f356444e;
        if (tencentMap instanceof C119009i) {
            C119009i iVar = (C119009i) tencentMap;
            List<TencentMap.InfoWindowAdapter> list = iVar.f356458j;
            if (list != null) {
                ((LinkedList) list).clear();
            }
            List<TencentMap.OnMarkerDraggedListener> list2 = iVar.f356460o;
            if (list2 != null) {
                ((LinkedList) list2).clear();
            }
            List<TencentMap.OnMapLoadedListener> list3 = iVar.f356462q;
            if (list3 != null) {
                ((LinkedList) list3).clear();
            }
            List<TencentMap.OnInfoWindowClickListener> list4 = iVar.f356464s;
            if (list4 != null) {
                ((LinkedList) list4).clear();
            }
            List<TencentMap.OnMarkerClickListener> list5 = iVar.f356466u;
            if (list5 != null) {
                ((LinkedList) list5).clear();
            }
            List<TencentMap.OnMapCameraChangeListener> list6 = iVar.f356468w;
            if (list6 != null) {
                ((LinkedList) list6).clear();
            }
            List<TencentMap.OnMapClickListener> list7 = iVar.f356470y;
            if (list7 != null) {
                ((LinkedList) list7).clear();
            }
            List<TencentMap.OnMapLongClickListener> list8 = iVar.f356451A;
            if (list8 != null) {
                ((LinkedList) list8).clear();
            }
        }
    }

    public void onDestroyView() {
    }

    public void onLowMemory() {
    }

    public void onPause() {
        this.f356443d.onPause();
    }

    public void onRestart() {
        this.f356443d.onRestart();
    }

    public void onResume() {
        this.f356443d.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        com.tencent.tencentmap.mapsdk.maps.MapView mapView = this.f356443d;
        if (mapView != null) {
            mapView.onSizeChanged(i, i2, i3, i4);
        }
    }

    public void onStart() {
        this.f356443d.onStart();
    }

    public void onStop() {
        this.f356443d.onStop();
    }

    public void onSurfaceChanged(Object obj, int i, int i2) {
        com.tencent.tencentmap.mapsdk.maps.MapView mapView = this.f356443d;
        if (mapView != null) {
            mapView.onSurfaceChanged(obj, i, i2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() == 0;
    }

    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        com.tencent.tencentmap.mapsdk.maps.MapView mapView = this.f356443d;
        if (mapView != null) {
            mapView.updateViewLayout(view, layoutParams);
        }
    }
}
