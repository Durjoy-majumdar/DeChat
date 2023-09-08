package com.tencent.mapsdk.vector;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.tencent.mapsdk.core.MapDelegate;
import com.tencent.mapsdk.internal.C0950kp;
import com.tencent.mapsdk.internal.C113572bv;
import com.tencent.mapsdk.internal.C113896kq;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C114322sx;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;

public class VectorMapDelegateProxy implements MapDelegate<C113961mq, VectorMap, C113572bv> {
    private C114322sx mMapDelegate;

    public VectorMapDelegateProxy(Context context, TencentMapOptions tencentMapOptions, ViewGroup viewGroup) {
        this.mMapDelegate = new C114322sx(context, tencentMapOptions, viewGroup);
    }

    public TencentMap getMap() {
        return this.mMapDelegate.f339878e_;
    }

    public C113572bv getMapRenderView() {
        return this.mMapDelegate.getMapRenderView();
    }

    public boolean isOpaque() {
        return this.mMapDelegate.isOpaque();
    }

    public boolean isTouchable() {
        return this.mMapDelegate.isTouchable();
    }

    public void onCreated() {
        C113896kq.m157663b(C0950kp.f2280z);
        this.mMapDelegate.onCreated();
        C113896kq.m157671d(C0950kp.f2280z);
    }

    public void onDestroy() {
        C113896kq.m157663b(C0950kp.f2260F);
        this.mMapDelegate.onDestroy();
        C113896kq.m157671d(C0950kp.f2260F);
        C113896kq.m157671d(C0950kp.f2277W);
        C113896kq.m157650a();
    }

    public void onPause() {
        C113896kq.m157663b(C0950kp.f2257C);
        this.mMapDelegate.onPause();
        C113896kq.m157671d(C0950kp.f2257C);
    }

    public void onRestart() {
        C113896kq.m157663b(C0950kp.f2258D);
        this.mMapDelegate.onRestart();
        C113896kq.m157671d(C0950kp.f2258D);
    }

    public void onResume() {
        C113896kq.m157663b(C0950kp.f2256B);
        this.mMapDelegate.onResume();
        C113896kq.m157671d(C0950kp.f2256B);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        C113896kq.m157663b(C0950kp.f2262H);
        this.mMapDelegate.onSizeChanged(i, i2, i3, i4);
        C113896kq.m157671d(C0950kp.f2262H);
    }

    public void onStart() {
        C113896kq.m157663b(C0950kp.f2255A);
        this.mMapDelegate.onStart();
        C113896kq.m157671d(C0950kp.f2255A);
    }

    public void onStop() {
        C113896kq.m157663b(C0950kp.f2259E);
        this.mMapDelegate.onStop();
        C113896kq.m157671d(C0950kp.f2259E);
    }

    public void onSurfaceChanged(Object obj, int i, int i2) {
        C113896kq.m157663b(C0950kp.f2263I);
        C113896kq.m157655a(C0950kp.f2263I, "width", (Object) Integer.valueOf(i));
        C113896kq.m157655a(C0950kp.f2263I, "height", (Object) Integer.valueOf(i2));
        this.mMapDelegate.onSurfaceChanged(obj, i, i2);
        C113896kq.m157671d(C0950kp.f2263I);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mMapDelegate.onTouchEvent(motionEvent);
    }

    public void onUpdateOptions(TencentMapOptions tencentMapOptions) {
        C113896kq.m157663b(C0950kp.f2261G);
        this.mMapDelegate.onUpdateOptions(tencentMapOptions);
        C113896kq.m157671d(C0950kp.f2261G);
    }

    public void setOnTop(boolean z) {
        this.mMapDelegate.setOnTop(z);
    }

    public void setOpaque(boolean z) {
        this.mMapDelegate.setOpaque(z);
    }

    public VectorMap createMap(C113961mq mqVar) {
        return (VectorMap) this.mMapDelegate.mo171823a(mqVar);
    }

    public C113572bv createMapView(C113961mq mqVar, ViewGroup viewGroup) {
        return this.mMapDelegate.mo171825a(mqVar, viewGroup);
    }

    public C113961mq getMapContext() {
        return (C113961mq) this.mMapDelegate.f339876d_;
    }
}
