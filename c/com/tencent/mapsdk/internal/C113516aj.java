package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.aj */
public interface C113516aj {
    /* renamed from: A */
    int mo171274A();

    /* renamed from: a */
    float mo171275a(int i, int i2, int i3, int i4, LatLng latLng, LatLng latLng2, LatLng latLng3);

    /* renamed from: a */
    float mo171276a(LatLng latLng, LatLng latLng2);

    /* renamed from: a */
    float mo171277a(LatLng latLng, LatLng latLng2, float f, int i, int i2, int i3, int i4, boolean z);

    /* renamed from: a */
    float mo171278a(LatLng latLng, LatLng latLng2, float f, int i, boolean z);

    /* renamed from: a */
    float mo171279a(LatLngBounds latLngBounds, float f, int i, boolean z);

    /* renamed from: a */
    int mo171280a(CameraUpdate cameraUpdate);

    /* renamed from: a */
    int mo171281a(CameraUpdate cameraUpdate, long j, TencentMap.CancelableCallback cancelableCallback);

    /* renamed from: a */
    CameraPosition mo171282a();

    /* renamed from: a */
    CameraPosition mo171283a(List<C113709et> list, List<LatLng> list2, int i, int i2, int i3, int i4);

    /* renamed from: a */
    CameraPosition mo171284a(List<C113709et> list, List<LatLng> list2, int i, int i2, int i3, int i4, TencentMap.AsyncOperateCallback<CameraPosition> asyncOperateCallback);

    /* renamed from: a */
    CustomLayer mo171285a(CustomLayerOptions customLayerOptions);

    /* renamed from: a */
    TileOverlay mo171286a(TileOverlayOptions tileOverlayOptions);

    /* renamed from: a */
    String mo171287a(LatLng latLng);

    /* renamed from: a */
    List<Rect> mo171288a(List<String> list);

    /* renamed from: a */
    void mo171289a(float f, float f2);

    /* renamed from: a */
    void mo171290a(float f, float f2, boolean z);

    /* renamed from: a */
    void mo171291a(int i);

    /* renamed from: a */
    void mo171292a(int i, int i2);

    /* renamed from: a */
    void mo171293a(Handler handler, Bitmap.Config config, int i);

    /* renamed from: a */
    void mo171294a(C113718fc fcVar);

    /* renamed from: a */
    void mo171295a(TencentMap.OnCameraChangeListener onCameraChangeListener);

    /* renamed from: a */
    void mo171296a(TencentMap.OnCompassClickedListener onCompassClickedListener);

    /* renamed from: a */
    void mo171297a(TencentMap.OnDismissCallback onDismissCallback);

    /* renamed from: a */
    void mo171298a(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener);

    /* renamed from: a */
    void mo171299a(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener);

    /* renamed from: a */
    void mo171300a(TencentMap.OnMapClickListener onMapClickListener);

    /* renamed from: a */
    void mo171301a(TencentMap.OnMapLoadedCallback onMapLoadedCallback);

    /* renamed from: a */
    void mo171302a(TencentMap.OnMapLongClickListener onMapLongClickListener);

    /* renamed from: a */
    void mo171303a(TencentMap.OnMapPoiClickListener onMapPoiClickListener);

    /* renamed from: a */
    void mo171304a(TencentMap.OnMarkerClickListener onMarkerClickListener);

    /* renamed from: a */
    void mo171305a(TencentMap.OnScaleViewChangedListener onScaleViewChangedListener);

    /* renamed from: a */
    void mo171306a(TencentMap.OnTrafficEventClickListener onTrafficEventClickListener);

    /* renamed from: a */
    void mo171307a(Language language);

    /* renamed from: a */
    void mo171308a(LatLng latLng, float f, float f2);

    /* renamed from: a */
    void mo171309a(LatLng latLng, float f, float f2, float f3);

    /* renamed from: a */
    void mo171310a(LatLng latLng, float f, float f2, float f3, boolean z);

    /* renamed from: a */
    void mo171311a(LatLngBounds latLngBounds, int i);

    /* renamed from: a */
    void mo171312a(TencentMapGestureListener tencentMapGestureListener);

    /* renamed from: a */
    void mo171313a(String str);

    /* renamed from: a */
    void mo171314a(String str, String str2);

    /* renamed from: a */
    void mo171315a(List<MapRouteSection> list, List<LatLng> list2);

    /* renamed from: a */
    void mo171316a(boolean z);

    /* renamed from: b */
    float mo171317b();

    /* renamed from: b */
    int mo171318b(String str);

    /* renamed from: b */
    void mo171319b(float f, float f2);

    /* renamed from: b */
    void mo171320b(int i);

    /* renamed from: b */
    void mo171321b(C113718fc fcVar);

    /* renamed from: b */
    void mo171322b(TencentMap.OnCameraChangeListener onCameraChangeListener);

    /* renamed from: b */
    void mo171323b(TencentMap.OnMapLoadedCallback onMapLoadedCallback);

    /* renamed from: b */
    void mo171324b(Language language);

    /* renamed from: b */
    void mo171325b(TencentMapGestureListener tencentMapGestureListener);

    /* renamed from: b */
    void mo171326b(boolean z);

    /* renamed from: c */
    float mo171327c();

    /* renamed from: c */
    void mo171328c(int i);

    /* renamed from: c */
    void mo171329c(boolean z);

    /* renamed from: d */
    void mo171330d();

    /* renamed from: d */
    void mo171331d(int i);

    /* renamed from: d */
    void mo171332d(boolean z);

    /* renamed from: e */
    void mo171333e();

    /* renamed from: e */
    void mo171334e(int i);

    /* renamed from: e */
    void mo171335e(boolean z);

    /* renamed from: f */
    int mo171336f();

    /* renamed from: f */
    void mo171337f(int i);

    /* renamed from: f */
    void mo171338f(boolean z);

    /* renamed from: g */
    int mo171339g();

    /* renamed from: g */
    void mo171340g(boolean z);

    /* renamed from: h */
    void mo171341h(boolean z);

    /* renamed from: h */
    boolean mo171342h();

    /* renamed from: i */
    void mo171343i();

    /* renamed from: i */
    void mo171344i(boolean z);

    /* renamed from: j */
    void mo171345j();

    /* renamed from: k */
    void mo171346k();

    /* renamed from: l */
    void mo171347l();

    /* renamed from: m */
    void mo171348m();

    /* renamed from: n */
    void mo171349n();

    /* renamed from: o */
    String mo171350o();

    /* renamed from: p */
    Language mo171351p();

    /* renamed from: q */
    void mo171352q();

    /* renamed from: r */
    int mo171353r();

    /* renamed from: s */
    String[] mo171354s();

    /* renamed from: t */
    String mo171355t();

    /* renamed from: u */
    IndoorBuilding mo171356u();

    /* renamed from: v */
    String mo171357v();

    /* renamed from: w */
    boolean mo171358w();

    /* renamed from: x */
    boolean mo171359x();

    /* renamed from: y */
    ArrayList<MapPoi> mo171360y();

    /* renamed from: z */
    String mo171361z();
}
