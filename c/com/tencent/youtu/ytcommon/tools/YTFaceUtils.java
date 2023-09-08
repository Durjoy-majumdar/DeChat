package com.tencent.youtu.ytcommon.tools;

import android.graphics.Rect;
import com.tencent.youtu.ytfacetrack.YTFaceTrack;

public class YTFaceUtils {
    private static final String TAG = "FaceUtils";

    public interface ShelterJudge {
        public static final int SHELTER_CHIN = 2;
        public static final int SHELTER_LEFTEYE = 7;
        public static final int SHELTER_LEFTFACE = 1;
        public static final int SHELTER_MOUTH = 3;
        public static final int SHELTER_NOSE = 5;
        public static final int SHELTER_PARAM_ERROR = -2;
        public static final int SHELTER_PARAM_NULL = -1;
        public static final int SHELTER_PASS = 0;
        public static final int SHELTER_RIGHTEYE = 6;
        public static final int SHELTER_RIGHTFACE = 4;
    }

    public static Rect getFaceScreen(YTFaceTrack.FaceStatus faceStatus) {
        float[] fArr = faceStatus.xys;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = f2;
        float f4 = f;
        float f5 = f4;
        int i = 0;
        while (i < 180) {
            float[] fArr2 = faceStatus.xys;
            float f6 = fArr2[i];
            if (f4 >= f6) {
                f4 = f6;
            }
            if (f5 <= f6) {
                f5 = f6;
            }
            int i2 = i + 1;
            float f7 = fArr2[i2];
            if (f2 >= f7) {
                f2 = f7;
            }
            if (f3 <= f7) {
                f3 = f7;
            }
            i = i2 + 1;
        }
        return new Rect((int) f4, (int) f2, (int) f5, (int) f3);
    }

    public static int shelterJudge(float[] fArr) {
        if (fArr == null) {
            YTLogger.m144668i(TAG, "[YTFaceTraceInterface.blockJudge] input pointsVis is null.");
            return -1;
        } else if (fArr.length != 90) {
            YTLogger.m144668i(TAG, "[YTFaceTraceInterface.blockJudge] input pointsVis.length != 90. current pointsVis.length: " + fArr.length);
            return -2;
        } else {
            int i = 0;
            for (int i2 = 33; i2 <= 45; i2++) {
                if (fArr[i2 - 1] < 0.7f) {
                    i++;
                }
            }
            if (i >= 4) {
                return 5;
            }
            int i3 = 0;
            for (int i4 = 46; i4 <= 67; i4++) {
                if (fArr[i4 - 1] < 0.7f) {
                    i3++;
                }
            }
            if (i3 >= 4) {
                return 3;
            }
            int i5 = 0;
            for (int i6 = 9; i6 <= 16; i6++) {
                if (fArr[i6 - 1] < 0.7f) {
                    i5++;
                }
            }
            for (int i7 = 25; i7 <= 32; i7++) {
                if (fArr[i7 - 1] < 0.7f) {
                    i5++;
                }
            }
            if (fArr[89] < 0.7f) {
                i5++;
            }
            if (i5 >= 4) {
                return 6;
            }
            int i8 = 0;
            for (int i9 = 1; i9 <= 8; i9++) {
                if (fArr[i9 - 1] < 0.7f) {
                    i8++;
                }
            }
            for (int i15 = 17; i15 <= 24; i15++) {
                if (fArr[i15 - 1] < 0.7f) {
                    i8++;
                }
            }
            if (fArr[88] < 0.7f) {
                i8++;
            }
            if (i8 >= 4) {
                return 7;
            }
            int i16 = 0;
            for (int i17 = 68; i17 < 74; i17++) {
                if (fArr[i17 - 1] < 0.7f) {
                    i16++;
                }
            }
            if (i16 >= 3) {
                return 1;
            }
            int i18 = 0;
            for (int i19 = 82; i19 <= 88; i19++) {
                if (fArr[i19 - 1] < 0.7f) {
                    i18++;
                }
            }
            if (i18 >= 3) {
                return 4;
            }
            int i25 = 0;
            for (int i26 = 75; i26 <= 81; i26++) {
                if (fArr[i26 - 1] < 0.7f) {
                    i25++;
                }
            }
            return i25 >= 3 ? 2 : 0;
        }
    }
}
