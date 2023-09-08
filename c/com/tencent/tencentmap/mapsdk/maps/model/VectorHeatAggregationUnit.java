package com.tencent.tencentmap.mapsdk.maps.model;

import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;

public class VectorHeatAggregationUnit {
    private LatLng mCenter;
    private double mIntensity;
    private WeightedLatLng[] mNodes;

    private VectorHeatAggregationUnit() {
    }

    public LatLng getCenter() {
        return this.mCenter;
    }

    public double getIntensity() {
        return this.mIntensity;
    }

    public WeightedLatLng[] getNodes() {
        return this.mNodes;
    }

    private VectorHeatAggregationUnit(LatLng latLng, double d, WeightedLatLng[] weightedLatLngArr) {
        this.mCenter = latLng;
        this.mIntensity = d;
        this.mNodes = weightedLatLngArr;
    }
}
