package com.tencent.map.sdk.utilities.heatmap;

public class Gradient extends com.tencent.map.sdk.utilities.visualization.Gradient {
    public Gradient(int[] iArr, float[] fArr) {
        super(iArr, fArr);
    }

    public Gradient(int[] iArr, float[] fArr, int i) {
        super(iArr, fArr, i);
    }

    public Gradient(com.tencent.map.sdk.utilities.visualization.Gradient gradient) {
        super(gradient.mColors, gradient.mStartPoints, gradient.mColorMapSize);
    }
}
