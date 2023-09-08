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
import com.tencent.tencentmap.mapsdk.maps.TextureMapView;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;

/* renamed from: yw3.j */
public class C119019j implements IMapView {

    /* renamed from: d */
    public TextureMapView f356481d;

    /* renamed from: e */
    public TencentMap f356482e;

    public C119019j(Context context, TencentMapOptions tencentMapOptions) {
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
        TextureMapView textureMapView = new TextureMapView(context, tencentMapOptions2);
        this.f356481d = textureMapView;
        this.f356482e = new C119009i(textureMapView.getMap());
        this.f356481d.getMap().getUiSettings().setZoomControlsEnabled(false);
    }

    public void addView(View view, MapView.LayoutParams layoutParams) {
        if (this.f356481d.getMap() != null) {
            this.f356481d.getMap().addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromView(view)).position(C119023n.m167772f(layoutParams.point)));
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TextureMapView textureMapView = this.f356481d;
        if (textureMapView == null) {
            return false;
        }
        return textureMapView.dispatchTouchEvent(motionEvent) || this.f356481d.onTouchEvent(motionEvent);
    }

    public TencentMap getMap() {
        return this.f356482e;
    }

    public MapController getMapController() {
        return this.f356482e;
    }

    public View getMapView() {
        return this.f356481d;
    }

    public Projection getProjection() {
        TencentMap tencentMap = this.f356482e;
        if (tencentMap != null) {
            return ((C119009i) tencentMap).getProjection();
        }
        return null;
    }

    public UiSettings getUiSettings() {
        if (this.f356481d.getMap() != null) {
            return new C27714o(this.f356481d.getMap().getUiSettings());
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
        this.f356481d.onDestroy();
    }

    public void onDestroyView() {
    }

    public void onLowMemory() {
    }

    public void onPause() {
        this.f356481d.onPause();
    }

    public void onRestart() {
        this.f356481d.onRestart();
    }

    public void onResume() {
        this.f356481d.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        TextureMapView textureMapView = this.f356481d;
        if (textureMapView != null) {
            textureMapView.onSizeChanged(i, i2, i3, i4);
        }
    }

    public void onStart() {
        this.f356481d.onStart();
    }

    public void onStop() {
        this.f356481d.onStop();
    }

    public void onSurfaceChanged(Object obj, int i, int i2) {
        TextureMapView textureMapView = this.f356481d;
        if (textureMapView != null) {
            textureMapView.onSurfaceChanged(obj, i, i2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() == 0;
    }

    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        TextureMapView textureMapView = this.f356481d;
        if (textureMapView != null) {
            textureMapView.updateViewLayout(view, layoutParams);
        }
    }
}
