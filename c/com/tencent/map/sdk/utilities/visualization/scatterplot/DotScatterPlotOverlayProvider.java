package com.tencent.map.sdk.utilities.visualization.scatterplot;

import android.graphics.Color;
import com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng;
import com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider;
import java.util.List;

public final class DotScatterPlotOverlayProvider extends ScatterPlotOverlayProvider {
    private static final int[] DEFAULT_SCATTER_COLORS = {Color.argb(255, 255, 202, 31), Color.argb(229, 204, 24, 93), Color.argb(127, 148, 28, 230)};
    private final int DEFAULT_RADIUS = 6;
    private boolean mAnimate = false;
    private int[] mColors = DEFAULT_SCATTER_COLORS;
    private int mRadius = 6;

    public DotScatterPlotOverlayProvider() {
        type(ScatterPlotOverlayProvider.ScatterPlotType.Dot);
    }

    public final DotScatterPlotOverlayProvider animate(boolean z) {
        this.mAnimate = z;
        return this;
    }

    public final DotScatterPlotOverlayProvider colors(int[] iArr) {
        if (iArr != null) {
            this.mColors = iArr;
        }
        return this;
    }

    public final int[] getColors() {
        return this.mColors;
    }

    public final List<ScatterLatLng> getData() {
        return super.getData();
    }

    public final int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    public final int getMaxZoom() {
        return super.getMaxZoom();
    }

    public final int getMinZoom() {
        return super.getMinZoom();
    }

    public final float getOpacity() {
        return super.getOpacity();
    }

    public final int getRadius() {
        return this.mRadius;
    }

    public final int getZIndex() {
        return super.getZIndex();
    }

    public final boolean isAnimate() {
        return this.mAnimate;
    }

    public final boolean isEnable3D() {
        return super.isEnable3D();
    }

    public final boolean isVisibility() {
        return super.isVisibility();
    }

    public final DotScatterPlotOverlayProvider radius(int i) {
        if (i > 0) {
            this.mRadius = i;
        }
        return this;
    }

    public final DotScatterPlotOverlayProvider data(List<ScatterLatLng> list) {
        super.data(list);
        return this;
    }

    public final DotScatterPlotOverlayProvider enable3D(boolean z) {
        super.enable3D(z);
        return this;
    }

    public final DotScatterPlotOverlayProvider zoomRange(int i, int i2) {
        super.zoomRange(i, i2);
        return this;
    }

    public final DotScatterPlotOverlayProvider displayLevel(int i) {
        super.displayLevel(i);
        return this;
    }

    public final DotScatterPlotOverlayProvider opacity(float f) {
        super.opacity(f);
        return this;
    }

    public final DotScatterPlotOverlayProvider visibility(boolean z) {
        super.visibility(z);
        return this;
    }

    public final DotScatterPlotOverlayProvider zIndex(int i) {
        super.zIndex(i);
        return this;
    }
}
