package com.tencent.p014mm.plugin.location_soso.api;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.GeoPoint;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.p014mm.plugin.location_soso.ViewManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tencentmap.mapsdk.map.CameraUpdate;
import com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.map.MapController;
import com.tencent.tencentmap.mapsdk.map.MapView;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.map.UiSettings;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import y22.C102798f;
import y22.C118911c;
import y22.C118913e;

/* renamed from: com.tencent.mm.plugin.location_soso.api.SoSoMapView */
public class SoSoMapView extends MapView implements C118913e {
    public static final String TAG = "MicroMsg.SoSoMapView";
    /* access modifiers changed from: private */
    public boolean firstanim = true;
    private C118911c iController;
    private ViewManager mViewManager;
    private HashMap<String, Object> tagsView = new HashMap<>();

    public SoSoMapView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.mViewManager = new ViewManager(getMap());
        getMap().set3DEnable(true);
        this.iController = new C118911c() {
            public void animateTo(double d, double d2, int i) {
                Log.m105918d(SoSoMapView.TAG, "animteTo slat:" + d + " slong:" + d2 + " zoom:" + i);
                if (SoSoMapView.this.firstanim) {
                    SoSoMapView.this.getMap().moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d, d2), (float) i));
                } else {
                    SoSoMapView.this.getMap().animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d, d2), (float) i));
                }
                boolean unused = SoSoMapView.this.firstanim = false;
            }

            public void offsetCenter(double d, double d2) {
                setCenter((((double) SoSoMapView.this.getMapCenterX()) / 1000000.0d) + d, (((double) SoSoMapView.this.getMapCenterY()) / 1000000.0d) + d2);
            }

            public void setCenter(double d, double d2) {
                SoSoMapView.this.getMap().moveCamera(CameraUpdateFactory.newLatLng(new LatLng(d, d2)));
            }

            public void setZoom(int i) {
                Log.m105919d(SoSoMapView.TAG, "set Zoom %d", Integer.valueOf(i));
                SoSoMapView.this.getMap().moveCamera(CameraUpdateFactory.zoomTo((float) i));
            }

            public void animateTo(double d, double d2) {
                Log.m105918d(SoSoMapView.TAG, "animteTo slat:" + d + " slong:" + d2);
                if (SoSoMapView.this.firstanim) {
                    SoSoMapView.this.getMap().moveCamera(CameraUpdateFactory.newLatLng(new LatLng(d, d2)));
                } else {
                    SoSoMapView.this.getMap().animateCamera(CameraUpdateFactory.newLatLng(new LatLng(d, d2)));
                }
                boolean unused = SoSoMapView.this.firstanim = false;
            }
        };
    }

    private void setEnableForeignMap(boolean z) {
        Class<MapView> cls = MapView.class;
        try {
            Method declaredMethod = cls.getDeclaredMethod("setForeignEnabled", new Class[]{Boolean.TYPE});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public void addAnimTrackView(View view, double d, double d2, String str) {
        this.tagsView.put(str, view);
        new GeoPoint((int) (d * 1000000.0d), (int) (d2 * 1000000.0d));
    }

    public void addLocationPin(View view) {
        addView(view, 0.0d, 0.0d);
    }

    public void addNullView(View view) {
        Log.m105918d(TAG, "addNullView ");
        addView(view);
    }

    public void addOverlay(Object obj) {
    }

    public void addPinView(View view, double d, double d2) {
        this.mViewManager.addPinView(view, d, d2);
    }

    public void addView(View view, double d, double d2) {
        this.mViewManager.addView(view, d, d2);
    }

    public void animateCamera(CameraUpdate cameraUpdate) {
        this.mViewManager.animateCamera(cameraUpdate);
    }

    public void clean() {
        this.tagsView.clear();
        this.mViewManager.destroy();
    }

    public void destroy() {
        this.mViewManager.destroy();
    }

    public void disableDarkMode() {
        this.mViewManager.disableDarkMode();
    }

    public Circle drawAccuracyCircle(double d, double d2, double d3) {
        return this.mViewManager.drawAccuracyCircle(d, d2, d3);
    }

    public void enableDarkMode() {
        this.mViewManager.enableDarkMode();
    }

    public void enableIndoorLevelPick(boolean z) {
        getUiSettings().setIndoorLevelPickerEnabled(z);
    }

    public Collection<Object> getChilds() {
        return this.tagsView.values();
    }

    public MapController getController() {
        return getMapController();
    }

    public C118911c getIController() {
        return this.iController;
    }

    public int getMapCenterX() {
        if (getMapCenter() != null) {
            return (int) (getMapCenter().getLatitude() * 1000000.0d);
        }
        return 0;
    }

    public int getMapCenterY() {
        if (getMapCenter() != null) {
            return (int) (getMapCenter().getLongitude() * 1000000.0d);
        }
        return 0;
    }

    public Point getPointByGeoPoint(double d, double d2) {
        Point point = new Point();
        getProjection().toPixels(new GeoPoint((int) (d * 1000000.0d), (int) (d2 * 1000000.0d)), point);
        return point;
    }

    public Set<String> getTags() {
        return this.tagsView.keySet();
    }

    public Object getViewByItag(String str) {
        if (this.tagsView.containsKey(str)) {
            return this.tagsView.get(str);
        }
        return null;
    }

    public C102798f getViewManager() {
        return this.mViewManager;
    }

    public int getZoom() {
        return getZoomLevel();
    }

    public int getZoomLevel() {
        TencentMap map = getMap();
        if (map == null) {
            return 16;
        }
        return map.getZoomLevel();
    }

    public float metersToEquatorPixels(double d) {
        return getProjection().metersToEquatorPixels((float) d);
    }

    public void removeView(View view) {
        this.mViewManager.removeView(view);
        for (String next : this.tagsView.keySet()) {
            if (this.tagsView.get(next).equals(view)) {
                this.tagsView.remove(next);
                return;
            }
        }
    }

    public Object removeViewByTag(String str) {
        Object obj = this.tagsView.get(str);
        if (obj instanceof View) {
            removeView((View) obj);
        }
        return obj;
    }

    public void requestMapFocus() {
        requestFocus();
    }

    public void setBuiltInZoomControls(boolean z) {
    }

    public void setCanRotate(boolean z) {
        UiSettings uiSettings = getUiSettings();
        if (uiSettings != null) {
            uiSettings.setRotateGesturesEnabled(z);
        }
    }

    public void setLogoMargin(int[] iArr) {
        UiSettings uiSettings = getUiSettings();
        uiSettings.setScaleViewPositionWithMargin(0, 0, 0, 0, 0);
        uiSettings.setLogoPosition(1, iArr);
    }

    public void setMapAnchor(float f, float f2) {
        getMap().setMapAnchor(f, f2);
    }

    public void setMapViewOnTouchListener(View.OnTouchListener onTouchListener) {
        setOnTouchListener(onTouchListener);
    }

    public void setMarkerClickListener(View view, TencentMap.OnMarkerClickListener onMarkerClickListener) {
        this.mViewManager.setMarkerClick(view, onMarkerClickListener);
    }

    public void updateAnimViewLayout(View view, double d, double d2) {
        new GeoPoint((int) (d * 1000000.0d), (int) (d2 * 1000000.0d));
    }

    public void updateLocaitonPinLayout(View view, double d, double d2) {
        Log.m105918d(TAG, "updateLocationPinLayout");
        updateLocaitonPinLayout(view, d, d2, false);
    }

    public void updateMarkerView(View view) {
        this.mViewManager.updateMarkerView(view);
    }

    public void updateViewLayout(View view, double d, double d2) {
        this.mViewManager.updateViewLayout(view, d, d2, false);
    }

    public void zoomToSpan(double d, double d2, double d3, double d4) {
        getIController().setCenter(d, d2);
        Log.m105918d(TAG, "zoomToSpan " + ((int) (d3 * 1000000.0d)) + " " + ((int) (d4 * 1000000.0d)) + "  " + (d * 1000000.0d) + " " + (d2 * 1000000.0d));
        if (d3 != 0.0d && d4 != 0.0d && getController() != null) {
            getController().zoomToSpan(d3, d4);
        }
    }

    public void addView(Object obj, double d, double d2, String str) {
        this.tagsView.put(str, obj);
    }

    public void updateViewLayout(View view, double d, double d2, int i) {
        new GeoPoint((int) (d * 1000000.0d), (int) (d2 * 1000000.0d));
    }

    public void addView(View view, double d, double d2, int i) {
        new GeoPoint((int) (d * 1000000.0d), (int) (1000000.0d * d2));
        if (i == -2) {
            addView(view, new MapView.LayoutParams(-2, -2, new LatLng(d, d2), 17));
        } else if (i == -1) {
            addView(view, new MapView.LayoutParams(-1, -1, new LatLng(d, d2), 17));
        } else {
            addView(view, new MapView.LayoutParams(i, i, new LatLng(d, d2), 17));
        }
    }

    public void updateLocaitonPinLayout(View view, double d, double d2, boolean z) {
        this.mViewManager.updateLocationPinLayout(view, d, d2, z);
    }

    public SoSoMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SoSoMapView(Context context, TencentMapOptions tencentMapOptions) {
        super(context, tencentMapOptions);
        init();
    }
}
