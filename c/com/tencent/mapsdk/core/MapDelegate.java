package com.tencent.mapsdk.core;

import android.view.ViewGroup;
import com.tencent.mapsdk.internal.C113572bv;
import com.tencent.tencentmap.mapsdk.maps.BaseMapView;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;

public interface MapDelegate<C extends TencentMapContext, M extends TencentMap, V extends C113572bv> extends BaseMapView.MapViewProxy {
    M createMap(C c);

    V createMapView(C c, ViewGroup viewGroup);

    C getMapContext();

    V getMapRenderView();
}
