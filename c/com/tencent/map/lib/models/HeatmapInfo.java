package com.tencent.map.lib.models;

import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HeatmapInfo extends OverlayListenerInfo {
    private static final float DEFAULT_MAX_OPACITY = 1.0f;
    private static final int DEFAULT_MAX_ZOOM = 22;
    private static final float DEFAULT_MIN_OPACITY = 0.0f;
    private static final int DEFAULT_MIN_ZOOM = 3;
    public int activeIndex = 0;
    public int colorMapSize;
    public float[] colorPoints;
    public int[] colors;
    public boolean draw3D = false;
    public boolean intensityFlag = false;
    public int level = 1;
    public boolean mAnimate = false;
    public int mAnimateDuration = 5000;
    public float maxHeight = 1000.0f;
    public float maxIntensity = 0.0f;
    public int maxZoom;
    public float minIntensity = 0.0f;
    public int minZoom;
    public int[] nodeIndexes = new int[0];
    public WeightedLatLng[] notes = new WeightedLatLng[0];
    public float opacity;
    public int radius;
    public int sample = 4;
    public boolean visible;
    public int zIndex = 0;

    public boolean isAnimate() {
        return this.mAnimate;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setActiveIndex(int i) {
        this.activeIndex = i;
    }

    public void setAnimate(boolean z) {
        this.mAnimate = z;
    }

    public void setAnimateTime(int i) {
        this.mAnimateDuration = i;
    }

    public void setColorPoints(float[] fArr) {
        this.colorPoints = fArr;
    }

    public void setColors(int[] iArr) {
        this.colors = iArr;
    }

    public void setDataList(List<Collection<WeightedLatLng>> list) {
        if (list == null) {
            this.notes = new WeightedLatLng[0];
            this.nodeIndexes = new int[0];
            return;
        }
        this.nodeIndexes = new int[list.size()];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Collection collection = list.get(i);
            this.nodeIndexes[i] = collection.size();
            arrayList.addAll(collection);
        }
        this.notes = (WeightedLatLng[]) arrayList.toArray(new WeightedLatLng[0]);
    }

    public void setDraw3D(boolean z) {
        this.draw3D = z;
    }

    public void setLevel(int i) {
        if (i == 1 || i == 2) {
            this.level = i;
        }
    }

    public void setMaxHeight(float f) {
        this.maxHeight = f;
    }

    public void setMaxZoom(int i) {
        if (i <= 22) {
            this.maxZoom = i;
        } else {
            this.maxZoom = 22;
        }
    }

    public void setMinZoom(int i) {
        if (i >= 3) {
            this.minZoom = i;
        } else {
            this.minZoom = 3;
        }
    }

    public void setOpacity(float f) {
        if (f > 1.0f) {
            this.opacity = 1.0f;
        } else if (f < 0.0f) {
            this.opacity = 0.0f;
        } else {
            this.opacity = f;
        }
    }

    public void setRadius(int i) {
        this.radius = i;
    }

    public void setSample(int i) {
        this.sample = i;
    }

    public void setVisible(boolean z) {
        this.visible = z;
    }

    public void setZoomLevelRange(int i, int i2) {
        if (i <= i2) {
            setMinZoom(i);
            setMaxZoom(i2);
        }
    }

    public void setzIndex(int i) {
        this.zIndex = i;
    }
}
