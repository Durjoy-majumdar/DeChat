package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IAlphaAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet;
import com.tencent.tencentmap.mapsdk.maps.model.IEmergeAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IRotateAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IScaleAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.ITranslateAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

/* renamed from: com.tencent.mapsdk.internal.bs */
public abstract class C113570bs extends C113565bo {
    public C113570bs(Context context, TencentMapOptions tencentMapOptions, C113568bp bpVar) {
        super(context, tencentMapOptions, bpVar);
    }

    public IAlphaAnimation createAlphaAnimation(float f, float f2) {
        return new C113804hh(f, f2);
    }

    public IAnimationSet createAnimationSet(boolean z) {
        return new C113809hj(z);
    }

    public IEmergeAnimation createEmergeAnimation(LatLng latLng) {
        return new C113810hk(latLng);
    }

    public HeatMapTileProvider createHeatMapTileProvider(HeatMapTileProvider.Builder builder) {
        return new C113573bw(builder);
    }

    public IRotateAnimation createRotateAnimation(float f, float f2, float f3, float f4, float f5) {
        return new C113811hl(f, f2, f3, f4, f5);
    }

    public IScaleAnimation createScaleAnimation(float f, float f2, float f3, float f4) {
        return new C113812hm(f, f2, f3, f4);
    }

    public ITranslateAnimation createTranslateAnimation(LatLng latLng) {
        return new C113813hn(latLng);
    }

    /* renamed from: r */
    public final void mo171806r() {
    }

    /* renamed from: z */
    public final String mo171813z() {
        return "4.5.12.4.6";
    }
}
