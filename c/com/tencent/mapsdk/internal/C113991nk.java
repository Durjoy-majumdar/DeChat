package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.HeatmapInfo;
import com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider;
import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.nk */
public class C113991nk extends HeatmapInfo implements C113973mu {

    /* renamed from: a */
    public GradientVectorOverlayProvider f340980a;

    public C113991nk(GradientVectorOverlayProvider gradientVectorOverlayProvider) {
        this.f340980a = gradientVectorOverlayProvider;
        ArrayList arrayList = new ArrayList();
        arrayList.add(gradientVectorOverlayProvider.getData());
        setDataList(arrayList);
        this.radius = gradientVectorOverlayProvider.getRadius();
        this.colors = gradientVectorOverlayProvider.getColors();
        this.colorPoints = gradientVectorOverlayProvider.getColorPoints();
        this.colorMapSize = gradientVectorOverlayProvider.getColorMapSize();
        this.visible = gradientVectorOverlayProvider.isVisibility();
        this.opacity = gradientVectorOverlayProvider.getOpacity();
        this.maxZoom = gradientVectorOverlayProvider.getMaxZoom();
        this.minZoom = gradientVectorOverlayProvider.getMinZoom();
        this.maxHeight = gradientVectorOverlayProvider.getMaxHeight();
        this.draw3D = gradientVectorOverlayProvider.isEnable3D();
        this.maxIntensity = gradientVectorOverlayProvider.getMaxIntensity();
        this.minIntensity = gradientVectorOverlayProvider.getMinIntensity();
        this.intensityFlag = gradientVectorOverlayProvider.isIntensityFlag();
        this.mAnimate = gradientVectorOverlayProvider.isAnimate();
        this.mAnimateDuration = gradientVectorOverlayProvider.getAnimateDuration();
        this.level = gradientVectorOverlayProvider.getDisplayLevel();
        this.zIndex = gradientVectorOverlayProvider.getZIndex();
        int length = this.colors.length;
        for (int i : this.colors) {
        }
        int length2 = this.colorPoints.length;
        int length3 = this.notes.length;
        int length4 = this.nodeIndexes.length;
    }

    /* renamed from: a */
    private GradientVectorOverlayProvider m158365a() {
        return this.f340980a;
    }
}
