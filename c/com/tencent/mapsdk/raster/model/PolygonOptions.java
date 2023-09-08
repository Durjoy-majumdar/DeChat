package com.tencent.mapsdk.raster.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolygonOptions {
    private int fillColor = -16777216;
    private int iLevel = OverlayLevel.OverlayLevelAboveLabels;
    private boolean isVisible = true;
    private List<Integer> pattern;
    private final List<LatLng> points = new ArrayList();
    private int strokeColor = -16777216;
    private float strokeWidth = 10.0f;
    private float zIndex = 0.0f;

    public PolygonOptions add(LatLng latLng) {
        if (latLng == null) {
            return this;
        }
        this.points.add(latLng);
        return this;
    }

    public PolygonOptions addAll(Iterable<LatLng> iterable) {
        if (iterable == null) {
            return this;
        }
        for (LatLng add : iterable) {
            this.points.add(add);
        }
        return this;
    }

    public PolygonOptions fillColor(int i) {
        this.fillColor = i;
        return this;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public List<Integer> getPattern() {
        return this.pattern;
    }

    public List<LatLng> getPoints() {
        return this.points;
    }

    public int getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public PolygonOptions level(int i) {
        if (i >= OverlayLevel.OverlayLevelAboveRoads && i <= OverlayLevel.OverlayLevelAboveLabels) {
            this.iLevel = i;
        }
        return this;
    }

    public PolygonOptions pattern(List<Integer> list) {
        this.pattern = list;
        return this;
    }

    public PolygonOptions strokeColor(int i) {
        this.strokeColor = i;
        return this;
    }

    public PolygonOptions strokeWidth(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.strokeWidth = f;
        return this;
    }

    public PolygonOptions visible(boolean z) {
        this.isVisible = z;
        return this;
    }

    public PolygonOptions zIndex(float f) {
        this.zIndex = f;
        return this;
    }

    public PolygonOptions add(LatLng... latLngArr) {
        if (latLngArr == null) {
            return this;
        }
        this.points.addAll(Arrays.asList(latLngArr));
        return this;
    }
}
