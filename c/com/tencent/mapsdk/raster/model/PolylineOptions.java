package com.tencent.mapsdk.raster.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pl0.C118080q;

public final class PolylineOptions {
    public static final int LINE_TYPE_DOTTEDLINE = 2;
    public static final int LINE_TYPE_MULTICOLORLINE = 0;
    private float arrowGap = 90.0f;
    private BitmapDescriptor arrowTexture;
    private int color = -16777216;
    private BitmapDescriptor colorTexture = null;
    private int edgeColor = -983041;
    private float edgeWidth = 0.0f;
    private boolean enableGradient;
    private int eraseColor = -7829368;
    private int[] iColors = null;
    private int[] iIndexs = null;
    private int iLevel = OverlayLevel.OverlayLevelAboveRoads;
    private boolean isDottedLine = false;
    private boolean isGeodesic = false;
    private boolean isVisible = true;
    private boolean lineCap = false;
    private int lineType = 0;
    private IndoorInfo mIndoorInfo;
    private final List<LatLng> points = new ArrayList();
    private BitmapDescriptor reviseArrowTexture;
    private List<C118080q.C118095l.C118096a> segmentTexts;
    private C118080q.C118095l.C118097b textStyle;
    private float width = 10.0f;
    private float zIndex = 0.0f;

    public static final class Colors {
        public static final int DARK_BLUE = 6;
        public static final int GRAYBLUE = 8;
        public static final int GREEN = 4;
        public static final int GREY = 0;
        public static final int LIGHT_BLUE = 1;
        public static final int LIVER_RED = 9;
        public static final int MID_BLUE = 5;
        public static final int RED = 2;
        public static final int TRANSPARENT = 7;
        public static final int YELLOW = 3;
    }

    public PolylineOptions add(LatLng latLng) {
        if (latLng == null) {
            return this;
        }
        this.points.add(latLng);
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> iterable) {
        if (iterable == null) {
            return this;
        }
        for (LatLng add : iterable) {
            this.points.add(add);
        }
        return this;
    }

    public PolylineOptions arrowGap(float f) {
        if (f > 0.0f) {
            this.arrowGap = f;
        }
        return this;
    }

    public PolylineOptions arrowTexture(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            this.arrowTexture = bitmapDescriptor;
        }
        return this;
    }

    public PolylineOptions color(int i) {
        this.color = i;
        return this;
    }

    public PolylineOptions colorTexture(BitmapDescriptor bitmapDescriptor) {
        this.colorTexture = bitmapDescriptor;
        return this;
    }

    public PolylineOptions colors(int[] iArr, int[] iArr2) {
        this.iColors = iArr;
        this.iIndexs = iArr2;
        return this;
    }

    public PolylineOptions edgeColor(int i) {
        this.edgeColor = i;
        return this;
    }

    public PolylineOptions edgeWidth(float f) {
        if (f > 0.0f) {
            this.edgeWidth = f;
        }
        return this;
    }

    public PolylineOptions eraseColor(int i) {
        this.eraseColor = i;
        return this;
    }

    public PolylineOptions geodesic(boolean z) {
        this.isGeodesic = z;
        return this;
    }

    public float getArrowGap() {
        return this.arrowGap;
    }

    public BitmapDescriptor getArrowTexture() {
        return this.arrowTexture;
    }

    public int getColor() {
        return this.color;
    }

    public BitmapDescriptor getColorTexture() {
        return this.colorTexture;
    }

    public int[][] getColors() {
        int[] iArr;
        int[] iArr2 = this.iColors;
        if (iArr2 == null || (iArr = this.iIndexs) == null || iArr2.length != iArr.length) {
            return null;
        }
        int[] iArr3 = new int[2];
        iArr3[1] = iArr2.length;
        iArr3[0] = 2;
        int[][] iArr4 = (int[][]) Array.newInstance(Integer.TYPE, iArr3);
        iArr4[0] = this.iColors;
        iArr4[1] = this.iIndexs;
        return iArr4;
    }

    public int getEdgeColor() {
        return this.edgeColor;
    }

    public float getEdgeWidth() {
        return this.edgeWidth;
    }

    public int getEraseColor() {
        return this.eraseColor;
    }

    public IndoorInfo getIndoorInfo() {
        return this.mIndoorInfo;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public int getLineType() {
        return this.lineType;
    }

    public List<LatLng> getPoints() {
        return this.points;
    }

    public BitmapDescriptor getReviseArrowTexture() {
        return this.reviseArrowTexture;
    }

    public List<C118080q.C118095l.C118096a> getSegmentTexts() {
        return this.segmentTexts;
    }

    public C118080q.C118095l.C118097b getTextStyle() {
        return this.textStyle;
    }

    public float getWidth() {
        return this.width;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public PolylineOptions indoorInfo(IndoorInfo indoorInfo) {
        this.mIndoorInfo = indoorInfo;
        return this;
    }

    public boolean isDottedLine() {
        return this.isDottedLine;
    }

    public boolean isGeodesic() {
        return this.isGeodesic;
    }

    public boolean isGradientEnable() {
        return this.enableGradient;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public PolylineOptions level(int i) {
        if (i >= OverlayLevel.OverlayLevelAboveRoads && i <= OverlayLevel.OverlayLevelAboveLabels) {
            this.iLevel = i;
        }
        return this;
    }

    public void lineCap(boolean z) {
        this.lineCap = z;
    }

    public PolylineOptions lineType(int i) {
        this.lineType = i;
        return this;
    }

    public PolylineOptions reviseArrowTexture(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            this.reviseArrowTexture = bitmapDescriptor;
        }
        return this;
    }

    public PolylineOptions setDottedLine(boolean z) {
        this.isDottedLine = z;
        return this;
    }

    public void setEnableGradient(boolean z) {
        this.enableGradient = z;
    }

    public PolylineOptions setSegmentTexts(List<C118080q.C118095l.C118096a> list) {
        this.segmentTexts = list;
        return this;
    }

    public PolylineOptions setTextStyle(C118080q.C118095l.C118097b bVar) {
        this.textStyle = bVar;
        return this;
    }

    public PolylineOptions visible(boolean z) {
        this.isVisible = z;
        return this;
    }

    public PolylineOptions width(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.width = f;
        return this;
    }

    public PolylineOptions zIndex(float f) {
        this.zIndex = f;
        return this;
    }

    public PolylineOptions add(LatLng... latLngArr) {
        if (latLngArr == null) {
            return this;
        }
        this.points.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public boolean lineCap() {
        return this.lineCap;
    }
}
