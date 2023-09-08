package y22;

import android.graphics.Point;
import android.view.View;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.tencentmap.mapsdk.map.CameraUpdate;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: y22.e */
public interface C118913e {
    void addPinView(View view, double d, double d2);

    void addView(Object obj, double d, double d2, String str);

    void animateCamera(CameraUpdate cameraUpdate);

    void clean();

    void destroy();

    Circle drawAccuracyCircle(double d, double d2, double d3);

    void enableIndoorLevelPick(boolean z);

    Collection<Object> getChilds();

    C118911c getIController();

    int getMapCenterX();

    int getMapCenterY();

    Point getPointByGeoPoint(double d, double d2);

    Set<String> getTags();

    Object getViewByItag(String str);

    C102798f getViewManager();

    int getZoom();

    int getZoomLevel();

    void invalidate();

    void removeView(View view);

    Object removeViewByTag(String str);

    void setBuiltInZoomControls(boolean z);

    void setCanRotate(boolean z);

    void setLogoMargin(int[] iArr);

    void setMapAnchor(float f, float f2);

    void setMapViewOnTouchListener(View.OnTouchListener onTouchListener);

    void setMarkerClickListener(View view, TencentMap.OnMarkerClickListener onMarkerClickListener);

    void updateLocaitonPinLayout(View view, double d, double d2);

    void updateMarkerView(View view);

    void zoomToSpan(double d, double d2, double d3, double d4);
}
