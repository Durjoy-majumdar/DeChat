package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.aa */
public final class C113495aa {

    /* renamed from: a */
    public static final int f339615a = 0;

    /* renamed from: b */
    public C113516aj f339616b = null;

    /* renamed from: c */
    public TencentMap.SnapshotReadyCallback f339617c = null;

    /* renamed from: d */
    public Handler f339618d = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            if (message != null && message.what == 0) {
                TencentMap.SnapshotReadyCallback snapshotReadyCallback = C113495aa.this.f339617c;
                if (snapshotReadyCallback != null) {
                    snapshotReadyCallback.onSnapshotReady((Bitmap) message.obj);
                }
                C113495aa.this.f339617c = null;
            }
        }
    };

    public C113495aa(C113516aj ajVar) {
        this.f339616b = ajVar;
    }

    /* renamed from: c */
    private void m155470c() {
        if (this.f339616b != null) {
            this.f339616b = null;
        }
    }

    /* renamed from: d */
    private float m155473d() {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return -1.0f;
        }
        return ajVar.mo171317b();
    }

    /* renamed from: e */
    private float m155476e() {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return -1.0f;
        }
        return ajVar.mo171327c();
    }

    /* renamed from: f */
    private void m155479f() {
    }

    /* renamed from: f */
    private void m155480f(int i) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171328c(i);
        }
    }

    /* renamed from: g */
    private void m155482g() {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171330d();
        }
    }

    /* renamed from: h */
    private int m155484h() {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return 1000;
        }
        return ajVar.mo171274A();
    }

    /* renamed from: i */
    private int m155486i() {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return -1;
        }
        return ajVar.mo171336f();
    }

    /* renamed from: j */
    private boolean m155487j() {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return false;
        }
        return ajVar.mo171342h();
    }

    /* renamed from: k */
    private void m155488k() {
    }

    /* renamed from: l */
    private void m155489l() {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171345j();
        }
    }

    /* renamed from: m */
    private void m155490m() {
    }

    /* renamed from: n */
    private void m155491n() {
    }

    /* renamed from: o */
    private void m155492o() {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171349n();
        }
    }

    /* renamed from: p */
    private void m155493p() {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171348m();
        }
    }

    /* renamed from: q */
    private String m155494q() {
        C113516aj ajVar = this.f339616b;
        return ajVar == null ? "" : ajVar.mo171350o();
    }

    /* renamed from: r */
    private Language m155495r() {
        C113516aj ajVar = this.f339616b;
        return ajVar != null ? ajVar.mo171351p() : Language.zh;
    }

    /* renamed from: s */
    private int m155496s() {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            return ajVar.mo171353r();
        }
        return -1;
    }

    /* renamed from: t */
    private String[] m155497t() {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            return ajVar.mo171354s();
        }
        return null;
    }

    /* renamed from: u */
    private boolean m155498u() {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return false;
        }
        return ajVar.mo171358w();
    }

    /* renamed from: v */
    private String m155499v() {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return null;
        }
        return ajVar.mo171361z();
    }

    /* renamed from: b */
    private void m155465b(int i) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171334e(i);
        }
    }

    /* renamed from: a */
    public final CameraPosition mo171184a() {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return null;
        }
        return ajVar.mo171282a();
    }

    /* renamed from: c */
    private void m155471c(int i) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171337f(i);
        }
    }

    /* renamed from: d */
    private void m155474d(int i) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171291a(i);
        }
    }

    /* renamed from: e */
    private void m155477e(int i) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171320b(i);
        }
    }

    /* renamed from: f */
    private void m155481f(boolean z) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171340g(z);
        }
    }

    /* renamed from: g */
    private void m155483g(boolean z) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171341h(z);
        }
    }

    /* renamed from: h */
    private void m155485h(boolean z) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171344i(z);
        }
    }

    /* renamed from: a */
    private void m155441a(int i) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171331d(i);
        }
    }

    /* renamed from: b */
    private void m155468b(TencentMapGestureListener tencentMapGestureListener) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171325b(tencentMapGestureListener);
        }
    }

    /* renamed from: c */
    private void m155472c(boolean z) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171329c(z);
        }
    }

    /* renamed from: d */
    private void m155475d(boolean z) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171335e(z);
        }
    }

    /* renamed from: e */
    private void m155478e(boolean z) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171338f(z);
        }
    }

    /* renamed from: b */
    private void m155469b(boolean z) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171326b(z);
        }
    }

    /* renamed from: a */
    public final int mo171182a(CameraUpdate cameraUpdate) {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return Integer.MIN_VALUE;
        }
        return ajVar.mo171280a(cameraUpdate);
    }

    /* renamed from: b */
    private void m155466b(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171323b(onMapLoadedCallback);
        }
    }

    /* renamed from: a */
    public final int mo171183a(CameraUpdate cameraUpdate, long j, TencentMap.CancelableCallback cancelableCallback) {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return Integer.MIN_VALUE;
        }
        return ajVar.mo171281a(cameraUpdate, j, cancelableCallback);
    }

    /* renamed from: a */
    private float m155434a(LatLng latLng, LatLng latLng2) {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return -1.0f;
        }
        return ajVar.mo171276a(latLng, latLng2);
    }

    @Deprecated
    /* renamed from: b */
    private String m155464b(LatLng latLng) {
        IndoorBuilding u;
        C113516aj ajVar = this.f339616b;
        if (ajVar == null || (u = ajVar.mo171356u()) == null) {
            return null;
        }
        if (!(u.getBuildingLatLng() == null || latLng == null)) {
            latLng.latitude = u.getBuildingLatLng().latitude;
            latLng.longitude = u.getBuildingLatLng().longitude;
        }
        return u.getBuildingName();
    }

    /* renamed from: a */
    private void m155461a(boolean z) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171316a(z);
        }
    }

    /* renamed from: a */
    private void m155448a(TencentMap.OnMapClickListener onMapClickListener) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171300a(onMapClickListener);
        }
    }

    /* renamed from: a */
    private void m155450a(TencentMap.OnMapLongClickListener onMapLongClickListener) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171302a(onMapLongClickListener);
        }
    }

    /* renamed from: b */
    public final boolean mo171185b() {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            return ajVar.mo171359x();
        }
        return false;
    }

    /* renamed from: a */
    private void m155444a(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171295a(onCameraChangeListener);
        }
    }

    /* renamed from: b */
    private void m155467b(Language language) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171324b(language);
        }
    }

    /* renamed from: a */
    private void m155453a(TencentMap.OnScaleViewChangedListener onScaleViewChangedListener) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171305a(onScaleViewChangedListener);
        }
    }

    /* renamed from: b */
    private int m155462b(String str) {
        if (this.f339616b == null || C40002he.m42805a(str)) {
            return -1;
        }
        return this.f339616b.mo171318b(str);
    }

    /* renamed from: a */
    private void m155443a(Handler handler, Bitmap.Config config, int i) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171293a(handler, config, i);
        }
    }

    /* renamed from: a */
    private void m155455a(TencentMap.SnapshotReadyCallback snapshotReadyCallback, Bitmap.Config config, int i) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null && snapshotReadyCallback != null) {
            this.f339617c = snapshotReadyCallback;
            Handler handler = this.f339618d;
            if (ajVar != null) {
                ajVar.mo171293a(handler, config, i);
            }
        }
    }

    /* renamed from: a */
    private String m155439a(LatLng latLng) {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return null;
        }
        return ajVar.mo171287a(latLng);
    }

    /* renamed from: a */
    private void m155458a(TencentMapGestureListener tencentMapGestureListener) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171312a(tencentMapGestureListener);
        }
    }

    /* renamed from: a */
    private void m155442a(int i, int i2) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171292a(i, i2);
        }
    }

    /* renamed from: a */
    private CameraPosition m155436a(List<C113709et> list, List<LatLng> list2, int i, int i2, int i3, int i4) {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return null;
        }
        return ajVar.mo171283a(list, list2, i, i2, i3, i4);
    }

    /* renamed from: a */
    private void m155440a(float f, float f2, boolean z) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171290a(f, f2, z);
        }
    }

    /* renamed from: a */
    private void m155445a(TencentMap.OnCompassClickedListener onCompassClickedListener) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171296a(onCompassClickedListener);
        }
    }

    /* renamed from: a */
    private void m155449a(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171301a(onMapLoadedCallback);
        }
    }

    /* renamed from: a */
    private void m155456a(Language language) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171307a(language);
        }
    }

    /* renamed from: a */
    private void m155452a(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171304a(onMarkerClickListener);
        }
    }

    /* renamed from: a */
    private void m155447a(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171299a(onInfoWindowClickListener);
        }
    }

    /* renamed from: a */
    private void m155446a(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171298a(onIndoorStateChangeListener);
        }
    }

    /* renamed from: a */
    private void m155451a(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171303a(onMapPoiClickListener);
        }
    }

    /* renamed from: a */
    private void m155459a(String str) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171313a(str);
        }
    }

    /* renamed from: a */
    private void m155460a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f339616b.mo171314a(str, str2);
        }
    }

    /* renamed from: a */
    private TileOverlay m155438a(TileOverlayOptions tileOverlayOptions) {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return null;
        }
        return ajVar.mo171286a(tileOverlayOptions);
    }

    /* renamed from: a */
    private CustomLayer m155437a(CustomLayerOptions customLayerOptions) {
        C113516aj ajVar = this.f339616b;
        if (ajVar == null) {
            return null;
        }
        return ajVar.mo171285a(customLayerOptions);
    }

    /* renamed from: a */
    private void m155457a(LatLngBounds latLngBounds, int i) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171311a(latLngBounds, i);
        }
    }

    /* renamed from: a */
    private void m155454a(TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        C113516aj ajVar = this.f339616b;
        if (ajVar != null) {
            ajVar.mo171306a(onTrafficEventClickListener);
        }
    }
}
