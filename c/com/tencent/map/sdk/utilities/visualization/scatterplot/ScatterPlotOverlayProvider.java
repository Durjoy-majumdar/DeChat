package com.tencent.map.sdk.utilities.visualization.scatterplot;

import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng;
import java.util.ArrayList;
import java.util.List;

public abstract class ScatterPlotOverlayProvider extends BaseOverlayProvider {
    private List<ScatterLatLng> dataList = new ArrayList();
    private boolean mDraw3D = false;
    private int mType = 0;

    public enum ScatterPlotType {
        Dot,
        Bitmap
    }

    public ScatterPlotOverlayProvider data(List<ScatterLatLng> list) {
        if (list != null) {
            this.dataList = list;
        }
        return this;
    }

    public ScatterPlotOverlayProvider enable3D(boolean z) {
        this.mDraw3D = z;
        return this;
    }

    public List<ScatterLatLng> getData() {
        return this.dataList;
    }

    public int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    public int getMaxZoom() {
        return super.getMaxZoom();
    }

    public int getMinZoom() {
        return super.getMinZoom();
    }

    public float getOpacity() {
        return super.getOpacity();
    }

    public int getType() {
        return ScatterPlotType.values()[this.mType].ordinal();
    }

    public int getZIndex() {
        return super.getZIndex();
    }

    public boolean isEnable3D() {
        return this.mDraw3D;
    }

    public boolean isVisibility() {
        return super.isVisibility();
    }

    public ScatterPlotOverlayProvider type(ScatterPlotType scatterPlotType) {
        this.mType = scatterPlotType.ordinal();
        return this;
    }

    public ScatterPlotOverlayProvider zoomRange(int i, int i2) {
        if (i <= i2) {
            super.minZoom(i);
            super.maxZoom(i2);
        }
        return this;
    }

    public ScatterPlotOverlayProvider displayLevel(int i) {
        super.displayLevel(i);
        return this;
    }

    public ScatterPlotOverlayProvider opacity(float f) {
        super.opacity(f);
        return this;
    }

    public ScatterPlotOverlayProvider visibility(boolean z) {
        super.visibility(z);
        return this;
    }

    public ScatterPlotOverlayProvider zIndex(int i) {
        super.zIndex(i);
        return this;
    }
}
