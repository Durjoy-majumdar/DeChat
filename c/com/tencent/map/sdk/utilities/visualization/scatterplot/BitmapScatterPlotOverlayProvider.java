package com.tencent.map.sdk.utilities.visualization.scatterplot;

import com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng;
import com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import java.util.List;

public final class BitmapScatterPlotOverlayProvider extends ScatterPlotOverlayProvider {
    private static final BitmapDescriptor[] DEFAULT_BITMAP_ICONS = new BitmapDescriptor[0];
    private int DEFAULT_HEIGHT = 30;
    private int DEFAULT_WIDTH = 30;
    private BitmapDescriptor[] mBitmaps = DEFAULT_BITMAP_ICONS;
    private int mHeight = 30;
    private int mWidth = 30;

    public BitmapScatterPlotOverlayProvider() {
        type(ScatterPlotOverlayProvider.ScatterPlotType.Bitmap);
    }

    public final BitmapScatterPlotOverlayProvider bitmaps(BitmapDescriptor[] bitmapDescriptorArr) {
        BitmapDescriptor[] bitmapDescriptorArr2 = this.mBitmaps;
        if (bitmapDescriptorArr2.length <= 0 && bitmapDescriptorArr2.length == 0 && bitmapDescriptorArr != null) {
            this.mBitmaps = bitmapDescriptorArr;
        }
        return this;
    }

    public final BitmapDescriptor[] getBitmaps() {
        return this.mBitmaps;
    }

    public final List<ScatterLatLng> getData() {
        return super.getData();
    }

    public final int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    public final int getHeight() {
        return this.mHeight;
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

    public final int getWidth() {
        return this.mWidth;
    }

    public final int getZIndex() {
        return super.getZIndex();
    }

    public final boolean isEnable3D() {
        return super.isEnable3D();
    }

    public final boolean isVisibility() {
        return super.isVisibility();
    }

    public final BitmapScatterPlotOverlayProvider scale(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.mWidth = i;
            this.mHeight = i2;
        }
        return this;
    }

    public final BitmapScatterPlotOverlayProvider data(List<ScatterLatLng> list) {
        super.data(list);
        return this;
    }

    public final BitmapScatterPlotOverlayProvider enable3D(boolean z) {
        super.enable3D(z);
        return this;
    }

    public final BitmapScatterPlotOverlayProvider zoomRange(int i, int i2) {
        super.zoomRange(i, i2);
        return this;
    }

    public final BitmapScatterPlotOverlayProvider displayLevel(int i) {
        super.displayLevel(i);
        return this;
    }

    public final BitmapScatterPlotOverlayProvider opacity(float f) {
        super.opacity(f);
        return this;
    }

    public final BitmapScatterPlotOverlayProvider visibility(boolean z) {
        super.visibility(z);
        return this;
    }

    public final BitmapScatterPlotOverlayProvider zIndex(int i) {
        super.zIndex(i);
        return this;
    }
}
