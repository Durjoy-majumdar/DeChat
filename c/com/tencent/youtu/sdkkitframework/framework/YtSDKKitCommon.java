package com.tencent.youtu.sdkkitframework.framework;

import com.tencent.youtu.sdkkitframework.common.YtLogger;
import java.util.HashMap;
import java.util.Map;

public class YtSDKKitCommon {

    public static class ProcessHelper {
        public static float calcEyeScore(float[] fArr) {
            float f = fArr[32] - fArr[40];
            float f2 = fArr[33] - fArr[41];
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            float f3 = fArr[44];
            float f4 = fArr[40];
            float f5 = fArr[45];
            float f6 = fArr[41];
            float abs = (Math.abs(crossProduct(f, f2, f3 - f4, f5 - f6)) + Math.abs(crossProduct(f, f2, fArr[36] - f4, fArr[37] - f6))) / (sqrt * sqrt);
            float f7 = fArr[56] - fArr[48];
            float f8 = fArr[57] - fArr[49];
            float sqrt2 = (float) Math.sqrt((double) ((f7 * f7) + (f8 * f8)));
            float f9 = fArr[60];
            float f15 = fArr[56];
            float f16 = fArr[61];
            float f17 = fArr[57];
            return abs + ((Math.abs(crossProduct(f7, f8, f9 - f15, f16 - f17)) + Math.abs(crossProduct(f7, f8, fArr[52] - f15, fArr[53] - f17))) / (sqrt2 * sqrt2));
        }

        public static float calcMouthScore(float[] fArr) {
            return Math.abs(((fArr[129] + fArr[109]) / 2.0f) - ((fArr[119] + fArr[97]) / 2.0f)) / Math.abs(fArr[90] - fArr[102]);
        }

        public static float[] convert90PTo5P(float[] fArr) {
            YtLogger.m106580i("ProcessHelper", "90 to 5 convert size:" + fArr.length);
            return new float[]{fArr[176], fArr[177], fArr[178], fArr[179], fArr[64], fArr[65], fArr[90], fArr[91], fArr[102], fArr[103]};
        }

        private static float crossProduct(float f, float f2, float f3, float f4) {
            return (f * f4) - (f3 * f2);
        }

        public static float preCheckCloseEyeScore(float[] fArr) {
            float f = fArr[32] - fArr[40];
            float f2 = fArr[33] - fArr[41];
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            float f3 = fArr[44];
            float f4 = fArr[40];
            float f5 = fArr[45];
            float f6 = fArr[41];
            float abs = (Math.abs(crossProduct(f, f2, f3 - f4, f5 - f6)) + Math.abs(crossProduct(f, f2, fArr[36] - f4, fArr[37] - f6))) / (sqrt * sqrt);
            float f7 = fArr[56] - fArr[48];
            float f8 = fArr[57] - fArr[49];
            float sqrt2 = (float) Math.sqrt((double) ((f7 * f7) + (f8 * f8)));
            float f9 = fArr[60];
            float f15 = fArr[56];
            float f16 = fArr[61];
            float f17 = fArr[57];
            float abs2 = (Math.abs(crossProduct(f7, f8, f9 - f15, f16 - f17)) + Math.abs(crossProduct(f7, f8, fArr[52] - f15, fArr[53] - f17))) / (sqrt2 * sqrt2);
            return abs > abs2 ? abs2 : abs;
        }
    }

    public static class StateNameHelper {
        private static HashMap<StateClassName, String> _stateNameMap = new HashMap<StateClassName, String>() {
            {
                put(StateClassName.UNKNOWN_STATE, "com.tencent.youtu.sdkkitframework.liveness.Unknown");
                put(StateClassName.TIMEOUT_STATE, "com.tencent.youtu.sdkkitframework.framework.TimeoutState");
                put(StateClassName.IDLE_STATE, "com.tencent.youtu.sdkkitframework.framework.IdleState");
                put(StateClassName.SILENT_STATE, "com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState");
                put(StateClassName.ACTION_STATE, "com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState");
                put(StateClassName.REFLECT_STATE, "com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState");
                put(StateClassName.OCR_AUTO_DETECT_STATE, "com.tencent.youtu.sdkkitframework.ocr.OcrCardAutoDetectState");
                put(StateClassName.OCR_MANUAL_DETECT_STATE, "com.tencent.youtu.sdkkitframework.ocr.OcrCardManualDetectState");
                put(StateClassName.NET_FETCH_STATE, "com.tencent.youtu.sdkkitframework.liveness.NetFetchState");
                put(StateClassName.NET_LIVENESS_REQ_RESULT_STATE, "com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState");
                put(StateClassName.NET_OCR_REQ_RESULT_STATE, "com.tencent.youtu.sdkkitframework.ocr.NetOcrReqResultState");
                put(StateClassName.LIPREAD_STATE, "com.tencent.youtu.sdkkitframework.liveness.LipReadLivenessState");
                put(StateClassName.DETECTONLY_STATE, "com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState");
                put(StateClassName.OCR_VIID_STATE, "com.tencent.youtu.sdkkitframework.ocr.OcrVideoIdentState");
            }
        };

        public enum StateClassName {
            UNKNOWN_STATE,
            TIMEOUT_STATE,
            IDLE_STATE,
            SILENT_STATE,
            ACTION_STATE,
            REFLECT_STATE,
            OCR_AUTO_DETECT_STATE,
            OCR_MANUAL_DETECT_STATE,
            NET_FETCH_STATE,
            NET_LIVENESS_REQ_RESULT_STATE,
            NET_OCR_REQ_RESULT_STATE,
            LIPREAD_STATE,
            DETECTONLY_STATE,
            OCR_VIID_STATE,
            STATE_COUNT
        }

        public static String classNameOfState(StateClassName stateClassName) {
            return _stateNameMap.get(stateClassName);
        }

        public static StateClassName typeOfClassName(String str) {
            for (Map.Entry next : _stateNameMap.entrySet()) {
                if (((String) next.getValue()).equals(str)) {
                    return (StateClassName) next.getKey();
                }
            }
            return StateClassName.UNKNOWN_STATE;
        }
    }
}
