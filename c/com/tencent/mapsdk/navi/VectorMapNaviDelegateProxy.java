package com.tencent.mapsdk.navi;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.tencent.mapsdk.core.MapDelegate;
import com.tencent.mapsdk.internal.C113572bv;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C114200se;
import com.tencent.mapsdk.internal.C114201sf;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;

public class VectorMapNaviDelegateProxy implements MapDelegate<C113961mq, C114200se, C113572bv> {
    private C114201sf mMapDelegate;

    public VectorMapNaviDelegateProxy(Context context, TencentMapOptions tencentMapOptions, ViewGroup viewGroup) {
        this.mMapDelegate = new C114201sf(context, tencentMapOptions, viewGroup);
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
        this.mMapDelegate.onCreated();
    }

    public void onDestroy() {
        this.mMapDelegate.onDestroy();
    }

    public void onPause() {
        this.mMapDelegate.onPause();
    }

    public void onRestart() {
        this.mMapDelegate.onRestart();
    }

    public void onResume() {
        this.mMapDelegate.onResume();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.mMapDelegate.onSizeChanged(i, i2, i3, i4);
    }

    public void onStart() {
        this.mMapDelegate.onStart();
    }

    public void onStop() {
        this.mMapDelegate.onStop();
    }

    public void onSurfaceChanged(Object obj, int i, int i2) {
        this.mMapDelegate.onSurfaceChanged(obj, i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mMapDelegate.onTouchEvent(motionEvent);
    }

    public void onUpdateOptions(TencentMapOptions tencentMapOptions) {
        this.mMapDelegate.onUpdateOptions(tencentMapOptions);
    }

    public void setOnTop(boolean z) {
        this.mMapDelegate.setOnTop(z);
    }

    public void setOpaque(boolean z) {
        this.mMapDelegate.setOpaque(z);
    }

    public C114200se createMap(C113961mq mqVar) {
        return (C114200se) this.mMapDelegate.mo171823a(mqVar);
    }

    public C113572bv createMapView(C113961mq mqVar, ViewGroup viewGroup) {
        return this.mMapDelegate.mo171825a(mqVar, viewGroup);
    }

    public C113961mq getMapContext() {
        return (C113961mq) this.mMapDelegate.f339876d_;
    }
}
