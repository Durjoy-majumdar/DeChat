package com.tencent.p014mm.plugin.location_soso;

import android.graphics.Color;
import android.view.View;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.map.CameraUpdate;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import java.util.HashMap;
import java.util.Map;
import y22.C102798f;

/* renamed from: com.tencent.mm.plugin.location_soso.ViewManager */
public class ViewManager implements C102798f {
    /* access modifiers changed from: private */
    public Map<Marker, TencentMap.OnInfoWindowClickListener> mInfoWindowClickMap = new HashMap();
    /* access modifiers changed from: private */
    public Map<Marker, TencentMap.OnMarkerClickListener> mMarkerClickMap = new HashMap();
    private Map<View, Marker> mMarkerMap = new HashMap();
    private TencentMap mTencentMap;

    public ViewManager(TencentMap tencentMap) {
        this.mTencentMap = tencentMap;
        this.mTencentMap.setOnMarkerClickListener(new TencentMap.OnMarkerClickListener() {
            public boolean onMarkerClick(Marker marker) {
                TencentMap.OnMarkerClickListener onMarkerClickListener = (TencentMap.OnMarkerClickListener) ViewManager.this.mMarkerClickMap.get(marker);
                if (onMarkerClickListener != null) {
                    return onMarkerClickListener.onMarkerClick(marker);
                }
                return false;
            }
        });
        this.mTencentMap.setOnInfoWindowClickListener(new TencentMap.OnInfoWindowClickListener() {
            public void onInfoWindowClick(Marker marker) {
                TencentMap.OnInfoWindowClickListener onInfoWindowClickListener = (TencentMap.OnInfoWindowClickListener) ViewManager.this.mInfoWindowClickMap.get(marker);
                if (onInfoWindowClickListener != null) {
                    onInfoWindowClickListener.onInfoWindowClick(marker);
                }
            }
        });
    }

    public void addPinView(View view, double d, double d2) {
        TencentMap tencentMap = this.mTencentMap;
        if (tencentMap != null) {
            this.mMarkerMap.put(view, tencentMap.addMarker(new MarkerOptions().position(new LatLng(d, d2)).anchor(0.5f, 0.5f).markerView(view)));
        }
    }

    public void addView(View view, double d, double d2) {
        TencentMap tencentMap = this.mTencentMap;
        if (tencentMap != null) {
            this.mMarkerMap.put(view, tencentMap.addMarker(new MarkerOptions().position(new LatLng(d, d2)).markerView(view)));
        }
    }

    public void animateCamera(CameraUpdate cameraUpdate) {
        TencentMap tencentMap = this.mTencentMap;
        if (tencentMap != null) {
            tencentMap.animateCamera(cameraUpdate);
        }
    }

    public void destroy() {
        Map<View, Marker> map = this.mMarkerMap;
        if (map != null) {
            map.clear();
            this.mMarkerClickMap.clear();
            this.mInfoWindowClickMap.clear();
        }
    }

    public void disableDarkMode() {
        TencentMap tencentMap = this.mTencentMap;
        if (tencentMap != null) {
            tencentMap.setMapType(1000);
        }
    }

    public Circle drawAccuracyCircle(double d, double d2, double d3) {
        if (this.mTencentMap == null) {
            return null;
        }
        CircleOptions circleOptions = new CircleOptions();
        circleOptions.center(new LatLng(d, d2));
        circleOptions.radius(d3);
        circleOptions.strokeColor(Color.parseColor("#00FFFFFF"));
        circleOptions.strokeWidth(0.0f);
        circleOptions.fillColor(Color.parseColor("#4D1485EE"));
        return this.mTencentMap.addCircle(circleOptions);
    }

    public void enableDarkMode() {
        TencentMap tencentMap = this.mTencentMap;
        if (tencentMap != null) {
            tencentMap.setMapType(1008);
        }
    }

    public TencentMap getTencentMap() {
        return this.mTencentMap;
    }

    public void removeView(View view) {
        Marker marker;
        if (this.mTencentMap != null && (marker = this.mMarkerMap.get(view)) != null) {
            marker.remove();
            this.mMarkerClickMap.remove(marker);
            this.mInfoWindowClickMap.remove(marker);
        }
    }

    public void setInfoWindowAdapter(TencentMap.InfoWindowAdapter infoWindowAdapter) {
        this.mTencentMap.setInfoWindowAdapter(infoWindowAdapter);
    }

    public void setInfoWindowClick(View view, TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        Marker marker;
        if (this.mTencentMap != null && (marker = this.mMarkerMap.get(view)) != null) {
            this.mInfoWindowClickMap.put(marker, onInfoWindowClickListener);
        }
    }

    public void setMarker2Top(View view) {
        if (this.mTencentMap != null) {
            this.mMarkerMap.get(view).set2Top();
        }
    }

    public void setMarkerClick(View view, TencentMap.OnMarkerClickListener onMarkerClickListener) {
        Marker marker;
        if (this.mTencentMap != null && (marker = this.mMarkerMap.get(view)) != null) {
            this.mMarkerClickMap.put(marker, onMarkerClickListener);
        }
    }

    public void setMarkerTag(View view, String str) {
        if (this.mTencentMap != null) {
            this.mMarkerMap.get(view).setTag(str);
        }
    }

    public void showInfoWindowByView(View view) {
        if (this.mTencentMap != null) {
            this.mMarkerMap.get(view).showInfoWindow();
        }
    }

    public void toggleViewVisible(View view) {
        if (this.mTencentMap != null) {
            this.mMarkerMap.get(view).setVisible(view.getVisibility() == 0);
        }
    }

    public void updateLocationPinLayout(View view, double d, double d2, boolean z) {
        Marker marker;
        if (this.mTencentMap != null && (marker = this.mMarkerMap.get(view)) != null) {
            marker.setVisible(view.getVisibility() == 0);
            marker.setPosition(new LatLng(d, d2));
            if (z) {
                marker.setMarkerView(view);
            }
            marker.setAnchor(0.5f, 0.5f);
        }
    }

    public void updateMarkerView(View view) {
        Marker marker;
        if (this.mTencentMap != null && (marker = this.mMarkerMap.get(view)) != null) {
            marker.setMarkerView(view);
        }
    }

    public void updateRotation(View view, float f) {
        if (this.mTencentMap != null) {
            this.mMarkerMap.get(view).setRotation(f);
        }
    }

    public void updateViewLayout(View view, double d, double d2, boolean z) {
        if (this.mTencentMap != null) {
            Marker marker = this.mMarkerMap.get(view);
            marker.setVisible(view.getVisibility() == 0);
            marker.setPosition(new LatLng(d, d2));
            if (z) {
                marker.setMarkerView(view);
            }
            marker.setAnchor(0.5f, 1.0f);
        }
    }
}
