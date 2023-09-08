package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationListener;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ao */
public interface C113520ao extends C113521ap, Marker {
    /* renamed from: a */
    int mo171367a();

    /* renamed from: a */
    void mo171368a(Bitmap bitmap);

    /* renamed from: a */
    void mo171369a(TencentMap.OnMarkerClickListener onMarkerClickListener);

    /* renamed from: a */
    void mo171370a(AnimationListener animationListener);

    /* renamed from: a */
    void mo171371a(BitmapDescriptor bitmapDescriptor, BitmapDescriptor bitmapDescriptor2);

    /* renamed from: a */
    void mo171372a(LatLng latLng);

    @Deprecated
    /* renamed from: a */
    void mo171373a(boolean z);

    /* renamed from: b */
    void mo171374b(boolean z);

    /* renamed from: b */
    boolean mo171375b();

    /* renamed from: c */
    Point mo171376c();

    /* renamed from: d */
    TencentMap.OnMarkerClickListener mo171377d();

    /* renamed from: e */
    List<LatLng> mo171378e();

    /* renamed from: f */
    List<Boundable<C113707es>> mo171379f();

    /* renamed from: g */
    TencentMap.InfoWindowAdapter mo171380g();

    /* renamed from: h */
    C113705eq mo171381h();

    /* renamed from: i */
    Rect mo171382i();
}
