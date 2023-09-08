package com.tencent.map.sdk.utilities.visualization;

import android.graphics.Color;
import java.util.HashMap;

public class Gradient {
    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    public final int mColorMapSize;
    public int[] mColors;
    public float[] mStartPoints;

    /* renamed from: com.tencent.map.sdk.utilities.visualization.Gradient$a */
    public class C113482a {

        /* renamed from: a */
        public final int f339555a;

        /* renamed from: b */
        public final int f339556b;

        /* renamed from: c */
        public final float f339557c;

        public /* synthetic */ C113482a(Gradient gradient, int i, int i2, float f, byte b) {
            this(i, i2, f);
        }

        private C113482a(int i, int i2, float f) {
            this.f339555a = i;
            this.f339556b = i2;
            this.f339557c = f;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    private HashMap<Integer, C113482a> generateColorIntervals() {
        HashMap<Integer, C113482a> hashMap = new HashMap<>();
        if (this.mStartPoints[0] != 0.0f) {
            hashMap.put(0, new C113482a(this, Color.argb(0, Color.red(this.mColors[0]), Color.green(this.mColors[0]), Color.blue(this.mColors[0])), this.mColors[0], ((float) this.mColorMapSize) * this.mStartPoints[0], (byte) 0));
        }
        for (int i = 1; i < this.mColors.length; i++) {
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf((int) (((float) this.mColorMapSize) * this.mStartPoints[i2]));
            int[] iArr = this.mColors;
            int i3 = iArr[i2];
            int i4 = iArr[i];
            float[] fArr = this.mStartPoints;
            hashMap.put(valueOf, new C113482a(this, i3, i4, (fArr[i] - fArr[i2]) * ((float) this.mColorMapSize), (byte) 0));
        }
        float[] fArr2 = this.mStartPoints;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer valueOf2 = Integer.valueOf((int) (((float) this.mColorMapSize) * fArr2[length]));
            int i5 = this.mColors[length];
            hashMap.put(valueOf2, new C113482a(this, i5, i5, ((float) this.mColorMapSize) * (1.0f - this.mStartPoints[length]), (byte) 0));
        }
        return hashMap;
    }

    public static int interpolateColor(int i, int i2, float f) {
        int alpha = (int) ((((float) (Color.alpha(i2) - Color.alpha(i))) * f) + ((float) Color.alpha(i)));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i2), Color.green(i2), Color.blue(i2), fArr2);
        float f2 = fArr[0];
        float f3 = fArr2[0];
        if (f2 - f3 > 180.0f) {
            fArr2[0] = f3 + 360.0f;
        } else if (f3 - f2 > 180.0f) {
            fArr[0] = f2 + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            float f4 = fArr2[i3];
            float f5 = fArr[i3];
            fArr3[i3] = ((f4 - f5) * f) + f5;
        }
        return Color.HSVToColor(alpha, fArr3);
    }

    public final int[] generateColorMap(double d) {
        HashMap<Integer, C113482a> generateColorIntervals = generateColorIntervals();
        int[] iArr = new int[this.mColorMapSize];
        C113482a aVar = generateColorIntervals.get(0);
        int i = 0;
        for (int i2 = 0; i2 < this.mColorMapSize; i2++) {
            if (generateColorIntervals.containsKey(Integer.valueOf(i2))) {
                aVar = generateColorIntervals.get(Integer.valueOf(i2));
                i = i2;
            }
            iArr[i2] = interpolateColor(aVar.f339555a, aVar.f339556b, ((float) (i2 - i)) / aVar.f339557c);
        }
        if (d != 1.0d) {
            for (int i3 = 0; i3 < this.mColorMapSize; i3++) {
                int i4 = iArr[i3];
                iArr[i3] = Color.argb((int) (((double) Color.alpha(i4)) * d), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
        return iArr;
    }

    public Gradient(int[] iArr, float[] fArr, int i) {
        if (iArr.length != fArr.length) {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        } else if (iArr.length != 0) {
            int i2 = 1;
            while (i2 < fArr.length) {
                if (fArr[i2] > fArr[i2 - 1]) {
                    i2++;
                } else {
                    throw new IllegalArgumentException("startPoints should be in increasing order");
                }
            }
            this.mColorMapSize = i;
            int[] iArr2 = new int[iArr.length];
            this.mColors = iArr2;
            this.mStartPoints = new float[fArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            System.arraycopy(fArr, 0, this.mStartPoints, 0, fArr.length);
        } else {
            throw new IllegalArgumentException("No colors have been defined");
        }
    }
}
