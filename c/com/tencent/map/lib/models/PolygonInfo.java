package com.tencent.map.lib.models;

import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.Arrays;

public class PolygonInfo {
    public int borderColor;
    public int borderLineId;
    public float borderWidth;
    public int color;
    public int[] holeLineIds;
    public LatLng[][] holePoints;
    public int level = 2;
    public int maxScaleLevel = 30;
    public int minScaleLevel;
    public int[] pattern;
    public LatLng[] points;
    public int polygonId;
    public String textureName;
    public int textureSpacing;
    public float zIndex = 0.0f;

    public String toString() {
        return "PolygonInfo{color=" + this.color + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ", points=" + Arrays.toString(this.points) + ", polygonId=" + this.polygonId + ", borderLineId=" + this.borderLineId + ", zIndex=" + this.zIndex + ", level=" + this.level + ", minScaleLevel=" + this.minScaleLevel + ", maxScaleLevel=" + this.maxScaleLevel + ", pattern=" + Arrays.toString(this.pattern) + ", textureName='" + this.textureName + '\'' + ", textureSpacing=" + this.textureSpacing + ", holePoints=" + Arrays.toString(this.holePoints) + '}';
    }
}
