package com.tencent.mapsdk.core;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.mapsdk.internal.C113800hd;
import com.tencent.mapsdk.internal.C114195s;
import com.tencent.mapsdk.internal.C114361u;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;

public class MapDelegateFactoryImpl implements C114195s {
    public MapDelegate createDelegate(Context context, TencentMapOptions tencentMapOptions, ViewGroup viewGroup) {
        MapDelegate mapDelegate;
        Class<MapDelegate> cls = MapDelegate.class;
        TencentMapOptions.IMapKernel mapKernel = tencentMapOptions.getMapKernel();
        Class<?> a = C113800hd.m157127a("com.tencent.mapsdk.navi.MapKernelNavi", mapKernel.getClass().getClassLoader());
        Class<?> a2 = C113800hd.m157127a("com.tencent.mapsdk.compat.MapKernelCompat", mapKernel.getClass().getClassLoader());
        if (a2 != null && a2 == mapKernel.getClass()) {
            mapDelegate = (MapDelegate) C113800hd.m157128a(C113800hd.m157126a("com.tencent.mapsdk.compat.VectorMapCompatDelegateProxy", cls, C114361u.m160481a().mo172873b()), context, tencentMapOptions, viewGroup);
        } else if (a == null || a != mapKernel.getClass()) {
            mapDelegate = (MapDelegate) C113800hd.m157128a(C113800hd.m157126a("com.tencent.mapsdk.vector.VectorMapDelegateProxy", cls, C114361u.m160481a().mo172873b()), context, tencentMapOptions, viewGroup);
        } else {
            mapDelegate = (MapDelegate) C113800hd.m157128a(C113800hd.m157126a("com.tencent.mapsdk.navi.VectorMapNaviDelegateProxy", cls, C114361u.m160481a().mo172873b()), context, tencentMapOptions, viewGroup);
        }
        if (mapDelegate != null) {
            mapDelegate.onCreated();
        }
        return mapDelegate;
    }
}
