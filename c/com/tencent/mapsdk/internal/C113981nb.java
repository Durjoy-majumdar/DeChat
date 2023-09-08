package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.ArcLineOverlayInfo;
import com.tencent.map.sdk.utilities.visualization.p1182od.ArcLineOverlayProvider;
import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.nb */
public class C113981nb extends ArcLineOverlayInfo implements C113973mu {

    /* renamed from: a */
    public ArcLineOverlayProvider f340973a;

    public C113981nb(ArcLineOverlayProvider arcLineOverlayProvider) {
        this.f340973a = arcLineOverlayProvider;
        ArrayList arrayList = new ArrayList();
        arrayList.add(arcLineOverlayProvider.getData());
        setDataList(arrayList);
        this.mType = 0;
        this.mOpacity = arcLineOverlayProvider.getOpacity();
        this.mVisibility = arcLineOverlayProvider.isVisibility();
        this.mMinZoom = arcLineOverlayProvider.getMinZoom();
        this.mMaxZoom = arcLineOverlayProvider.getMaxZoom();
        this.mWidth = arcLineOverlayProvider.getWidth();
        this.mZIndex = arcLineOverlayProvider.getZIndex();
        this.mDraw3D = arcLineOverlayProvider.isEnable3D();
        this.mAnimate = arcLineOverlayProvider.isAnimate();
        this.mAnimateDuration = arcLineOverlayProvider.getAnimateDuration();
        this.mHighLightDuration = arcLineOverlayProvider.getHighLightDuration();
        this.mAnimateColor = arcLineOverlayProvider.getAnimateColor();
        this.mColors = arcLineOverlayProvider.getColors();
        this.mColorPoints = arcLineOverlayProvider.getColorPoints();
        this.mColorMapSize = arcLineOverlayProvider.getColorMapSize();
        this.mDisplayLevel = arcLineOverlayProvider.getDisplayLevel();
    }

    /* renamed from: a */
    private ArcLineOverlayProvider m158316a() {
        return this.f340973a;
    }
}
