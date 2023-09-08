package com.tencent.tencentmap.mapsdk.map;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.rastercore.MapProvider;
import com.tencent.mapsdk.rastercore.core.MapContext;

public class MapView extends FrameLayout implements IMapView {
    private MapProvider mMapProvider;
    private int mMapType;
    private Projection mProjection;
    private UiSettings mUiSettings;
    private IMapView mapView;

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public static final int BOTTOM_CENTER = 81;
        public static final int CENTER = 17;
        public int alignment;
        public int height;
        public LatLng point;
        public int width;

        public LayoutParams(int i, int i2, LatLng latLng, int i3) {
            super(i, i2);
            this.width = i;
            this.height = i2;
            this.point = latLng;
            this.alignment = i3;
        }
    }

    public MapView(Context context) {
        this(context, (TencentMapOptions) null);
    }

    private void init(TencentMapOptions tencentMapOptions) {
        Context context = getContext();
        this.mMapProvider = new MapProvider();
        MapContext.setContext(context.getApplicationContext());
        IMapView mapView2 = this.mMapProvider.getMapView(context.getApplicationContext(), tencentMapOptions);
        this.mapView = mapView2;
        if (mapView2 != null) {
            addView(this.mapView.getMapView(), new ViewGroup.LayoutParams(-1, -1));
        }
        if (context instanceof MapActivity) {
            ((MapActivity) context).setMapView(this);
        }
    }

    public void addView(View view, LayoutParams layoutParams) {
        IMapView iMapView = this.mapView;
        if (iMapView != null && layoutParams != null) {
            iMapView.addView(view, layoutParams);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.mapView.dispatchTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public TencentMap getMap() {
        IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return null;
        }
        return iMapView.getMap();
    }

    @Deprecated
    public LatLng getMapCenter() {
        IMapView iMapView = this.mapView;
        if (iMapView == null || iMapView.getMap() == null) {
            return null;
        }
        return this.mapView.getMap().getMapCenter();
    }

    public MapController getMapController() {
        IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return null;
        }
        return iMapView.getMapController();
    }

    public View getMapView() {
        return this;
    }

    public Projection getProjection() {
        IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return null;
        }
        return iMapView.getMap().getProjection();
    }

    public UiSettings getUiSettings() {
        IMapView iMapView = this.mapView;
        if (iMapView == null) {
            return null;
        }
        return iMapView.getUiSettings();
    }

    public void onCreate(Bundle bundle) {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onCreate(bundle);
        }
    }

    public void onDestroy() {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onDestroy();
        }
    }

    public void onDestroyView() {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onDestroyView();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onLowMemory() {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onLowMemory();
        }
    }

    public void onPause() {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onPause();
        }
    }

    public void onRestart() {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onRestart();
        }
    }

    public void onResume() {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onSaveInstanceState(bundle);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onSizeChanged(i, i2, i3, i4);
        }
    }

    public void onStart() {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onStart();
        }
    }

    public void onStop() {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onStop();
        }
    }

    public void onSurfaceChanged(Object obj, int i, int i2) {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.onSurfaceChanged(obj, i, i2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        IMapView iMapView = this.mapView;
        return iMapView != null ? iMapView.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.updateViewLayout(view, layoutParams);
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMapType = 1;
        init((TencentMapOptions) null);
    }

    public MapView(Context context, TencentMapOptions tencentMapOptions) {
        super(context);
        this.mMapType = 1;
        init(tencentMapOptions);
    }
}
