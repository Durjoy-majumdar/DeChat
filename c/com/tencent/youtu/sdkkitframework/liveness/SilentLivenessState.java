package com.tencent.youtu.sdkkitframework.liveness;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.FileUtils;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.TimeoutCounter;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.ytcommon.tools.YTFaceUtils;
import com.tencent.youtu.ytfacetrack.YTFaceTrack;
import com.tencent.youtu.ytfacetrack.param.YTFaceAlignParam;
import com.tencent.youtu.ytfacetrack.param.YTFaceDetectParam;
import com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class SilentLivenessState extends YtFSMBaseState {
    private static final int CONTINUOUS_DETECT_COUNT = 3;
    private static int FIX_EYE_MOUTH = 5;
    private static int REFINE_CONFIG_OFF = 8197;
    private static final String TAG = "SilentLivenessState";
    private float bigFaceThresholdBuffer = 0.05f;
    private float bigfaceThreshold = 1.0f;
    private float blurDetectThreshold = 0.3f;
    private int cameraRotateState;
    private int continueCloseEyeCount = 0;
    private int continueNoValidFaceCount = 0;
    private int continueNovalidFaceCountThreshold = 5;
    private int continueShelterJudgeCount = 0;
    private TimeoutCounter countdowner = new TimeoutCounter("Liveness timeout counter");
    private FacePreviewingAdvise currentAdviseTip = FacePreviewingAdvise.ADVISE_PASS;
    private int currentShelterJudge = -1;
    private int detectAvailableCount = 0;
    private int detectIntervalCount = 5;
    private String extraTips = "";
    private float eyeOpenThreshold = 0.22f;
    private int frameNum = 0;
    private float inRectThreshold = 0.7f;
    public float intersectRatio = -1.0E10f;
    private int invalidPointCount;
    private boolean isFirstStablePass = false;
    private boolean isLoadResourceOnline = false;
    private float maskHeightRatio;
    private float maskWidthRatio;
    private float maxEyeScore = -1.0E10f;
    private float maxInRectRatio = -1.0E10f;
    private float maxMouthScore = -1.0E10f;
    private float maxShelterScore = -1.0E10f;
    private float minEyeScore = 1.0E10f;
    private float minMouthScore = 1.0E10f;
    private boolean needBigFaceMode = true;
    private boolean needCheckEyeOpen = false;
    private boolean needCheckMultiFaces = false;
    private boolean needCheckPose = false;
    private boolean needCheckShelter = true;
    private boolean needManualTrigger = false;
    private boolean needTimeoutTimer = false;
    private int pitchThreshold = 30;
    private float poseThresholdBuffer = 0.05f;
    private TimeoutCounter predetectCountdowner = new TimeoutCounter("Predetect timeout counter");
    private FacePreviewingAdvise prevAdvise = FacePreviewingAdvise.ADVISE_NAN;
    private int prevJudge = -1;
    private int previewHeight;
    private int previewWidth;
    private Rect previousFaceRect = null;
    private int previousShelterJudge = 0;
    private String resourceDownloadPath = "";
    private int rollThreshold = 25;
    private int sameFaceTipCount = 0;
    private float smallFaceThresholdBuffer = 0.05f;
    private float smallfaceThreshold = 0.5f;
    private int stableCountNum = 5;
    private int stableFaceCount = 0;
    private float stableRoiThreshold = 0.9f;
    private boolean tipFilterFlag = true;
    private boolean triggerLiveBeginEventFlag = false;
    private int unstableCount = 0;
    private int yawThreshold = 25;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$3 */
    public static /* synthetic */ class C203483 {

        /* renamed from: $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode */
        public static final /* synthetic */ int[] f57038x75f35c10;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode[] r0 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57038x75f35c10 = r0
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57038x75f35c10     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f57038x75f35c10     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f57038x75f35c10     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f57038x75f35c10     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.C203483.<clinit>():void");
        }
    }

    public enum FacePreviewingAdvise {
        ADVISE_PASS,
        ADVISE_NO_FACE,
        ADVISE_TOO_FAR,
        ADVISE_TOO_CLOSE,
        ADVISE_NOT_IN_RECT,
        ADVISE_INCORRECT_POSTURE,
        ADVISE_EYE_CLOSE,
        ADVISE_TOO_MANY_FACE,
        ADVISE_INCOMPLETE_FACE,
        ADVISE_INBUFFER_PASS,
        ADVISE_NAN
    }

    private void checkBestImage(YTFaceTrack.FaceStatus faceStatus, YuvImage yuvImage, float f) {
        float calcEyeScore = YtSDKKitCommon.ProcessHelper.calcEyeScore(faceStatus.xys);
        float calcMouthScore = YtSDKKitCommon.ProcessHelper.calcMouthScore(faceStatus.xys);
        float f2 = 0.0f;
        int i = 0;
        while (true) {
            float[] fArr = faceStatus.pointsVis;
            if (i >= fArr.length) {
                break;
            }
            f2 += fArr[i];
            i++;
        }
        if (this.stableFaceCount < this.stableCountNum) {
            String str = TAG;
            YtLogger.m106579e(str, "stable count " + this.stableFaceCount);
            return;
        }
        float f3 = this.intersectRatio;
        if (((double) f3) >= ((double) this.maxInRectRatio) - 0.05d) {
            this.maxInRectRatio = f3;
            if (this.needCheckShelter) {
                if (this.maxShelterScore <= f2) {
                    this.maxShelterScore = f2;
                } else {
                    String str2 = TAG;
                    YtLogger.m106580i(str2, "test1 shelter score " + f2 + " inRectThreshold " + this.intersectRatio + " eye " + calcEyeScore + " mouth " + calcMouthScore);
                    return;
                }
            }
            String str3 = TAG;
            YtLogger.m106580i(str3, "test2 shelter score " + f2 + " inRectThreshold " + this.intersectRatio + " eye " + calcEyeScore + " mouth " + calcMouthScore);
            if (((double) calcEyeScore) >= ((double) this.maxEyeScore) - 0.05d && calcMouthScore <= Math.max(this.minMouthScore, 15.0f)) {
                YtLogger.m106580i(str3, "best shelter score " + f2 + " inRectThreshold " + this.intersectRatio);
                this.maxEyeScore = calcEyeScore;
                this.minMouthScore = calcMouthScore;
                this.stateData.put("best_image", yuvImage);
                this.stateData.put("best_shape", faceStatus.xys);
                this.stateData.put("best_face_status", faceStatus);
            }
            if (calcEyeScore < this.minEyeScore) {
                this.minEyeScore = calcEyeScore;
                this.stateData.put("closeeye_image", yuvImage);
                this.stateData.put("closeeye_shape", faceStatus.xys);
                this.stateData.put("closeeye_face_status", faceStatus);
            }
            if (calcMouthScore > this.maxMouthScore) {
                this.maxMouthScore = calcMouthScore;
                this.stateData.put("openmouth_image", yuvImage);
                this.stateData.put("openmouth_shape", faceStatus.xys);
                this.stateData.put("openmouth_face_status", faceStatus);
                return;
            }
            return;
        }
        String str4 = TAG;
        YtLogger.m106580i(str4, "test3 shelter score " + f2 + " inRectThreshold " + this.intersectRatio + " (" + this.maxInRectRatio + ") eye " + calcEyeScore + " mouth " + calcMouthScore);
    }

    public static String convertAdvise(FacePreviewingAdvise facePreviewingAdvise) {
        return (facePreviewingAdvise == FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise == FacePreviewingAdvise.ADVISE_INBUFFER_PASS) ? StringCode.FL_POSE_KEEP : facePreviewingAdvise == FacePreviewingAdvise.ADVISE_NOT_IN_RECT ? StringCode.FL_POSE_NOT_IN_RECT : facePreviewingAdvise == FacePreviewingAdvise.ADVISE_TOO_FAR ? StringCode.FL_POSE_CLOSER : facePreviewingAdvise == FacePreviewingAdvise.ADVISE_TOO_CLOSE ? StringCode.FL_POSE_FARER : facePreviewingAdvise == FacePreviewingAdvise.ADVISE_INCORRECT_POSTURE ? StringCode.FL_POSE_INCORRECT : facePreviewingAdvise == FacePreviewingAdvise.ADVISE_NO_FACE ? StringCode.FL_NO_FACE : facePreviewingAdvise == FacePreviewingAdvise.ADVISE_EYE_CLOSE ? StringCode.FL_POSE_OPEN_EYE : facePreviewingAdvise == FacePreviewingAdvise.ADVISE_INCOMPLETE_FACE ? StringCode.FL_INCOMPLETE_FACE : StringCode.FL_ACT_SILENCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x014f, code lost:
        r2 = ((java.lang.Integer) (r2 = r2.getStateDataBy("current_action_type"))).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01b1, code lost:
        if (r10 <= (r8.bigfaceThreshold + r8.bigFaceThresholdBuffer)) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01fa, code lost:
        if (r10 >= (r8.smallfaceThreshold - r8.smallFaceThresholdBuffer)) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0284, code lost:
        if (java.lang.Math.abs(r11.roll) <= (((float) r8.rollThreshold) + r8.poseThresholdBuffer)) goto L_0x02ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise getFacePreviewAdvise(android.graphics.Rect r9, android.graphics.Rect r10, com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus r11) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            if (r11 != 0) goto L_0x0009
            com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise r9 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NO_FACE
        L_0x0006:
            r0 = 0
            goto L_0x02ec
        L_0x0009:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r1, r1, r1, r1)
            java.lang.String r3 = TAG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "camera"
            r4.append(r5)
            int r5 = r8.previewWidth
            r4.append(r5)
            java.lang.String r5 = "x"
            r4.append(r5)
            int r6 = r8.previewHeight
            r4.append(r6)
            java.lang.String r6 = " ratio "
            r4.append(r6)
            float r6 = r8.maskWidthRatio
            r4.append(r6)
            r4.append(r5)
            float r5 = r8.maskHeightRatio
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106580i(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "detectrect :"
            r4.append(r5)
            int r5 = r9.left
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            int r6 = r9.top
            r4.append(r6)
            r4.append(r5)
            int r6 = r9.right
            r4.append(r6)
            r4.append(r5)
            int r6 = r9.bottom
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106580i(r3, r4)
            int r3 = r10.left
            float r3 = (float) r3
            float r4 = r8.maskWidthRatio
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.left = r3
            int r3 = r10.right
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.right = r3
            int r3 = r10.top
            float r3 = (float) r3
            float r4 = r8.maskHeightRatio
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.top = r3
            int r3 = r10.bottom
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.bottom = r3
            r8.invalidPointCount = r1
            r3 = 0
        L_0x009a:
            float[] r4 = r11.xys
            int r6 = r4.length
            int r6 = r6 / 2
            if (r3 >= r6) goto L_0x00c7
            int r6 = r3 * 2
            r7 = r4[r6]
            int r6 = r6 + r0
            r4 = r4[r6]
            int r6 = r8.previewWidth
            float r6 = (float) r6
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x00bf
            r6 = 0
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 < 0) goto L_0x00bf
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x00bf
            int r6 = r8.previewHeight
            float r6 = (float) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c4
        L_0x00bf:
            int r4 = r8.invalidPointCount
            int r4 = r4 + r0
            r8.invalidPointCount = r4
        L_0x00c4:
            int r3 = r3 + 1
            goto L_0x009a
        L_0x00c7:
            android.graphics.Rect r9 = r8.getIntersectionRect(r9, r2)
            int r3 = r9.width()
            float r3 = (float) r3
            int r9 = r9.height()
            float r9 = (float) r9
            float r3 = r3 * r9
            int r9 = r2.width()
            float r9 = (float) r9
            float r3 = r3 / r9
            int r9 = r2.height()
            float r9 = (float) r9
            float r3 = r3 / r9
            float r9 = java.lang.Math.abs(r3)
            r8.intersectRatio = r9
            java.lang.String r9 = TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "faceInMask : "
            r3.append(r4)
            int r4 = r2.left
            r3.append(r4)
            r3.append(r5)
            int r4 = r2.top
            r3.append(r4)
            r3.append(r5)
            int r4 = r2.right
            r3.append(r4)
            r3.append(r5)
            int r2 = r2.bottom
            r3.append(r2)
            java.lang.String r2 = " in rect ratio"
            r3.append(r2)
            float r2 = r8.intersectRatio
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106580i(r9, r2)
            int r2 = r10.right
            int r10 = r10.left
            int r2 = r2 - r10
            float r10 = (float) r2
            int r2 = r8.previewWidth
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r3
            float r10 = r10 / r2
            float r10 = java.lang.Math.abs(r10)
            com.tencent.youtu.sdkkitframework.framework.YtFSM r2 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance()
            com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon$StateNameHelper$StateClassName r3 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE
            java.lang.String r3 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(r3)
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState r2 = r2.getStateByName(r3)
            r3 = 4
            r4 = 3
            if (r2 == 0) goto L_0x015b
            java.lang.String r5 = "current_action_type"
            java.lang.Object r2 = r2.getStateDataBy(r5)
            if (r2 == 0) goto L_0x015b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 == r4) goto L_0x0159
            if (r2 != r3) goto L_0x015b
        L_0x0159:
            r2 = 0
            goto L_0x015c
        L_0x015b:
            r2 = 1
        L_0x015c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "face area ratio:"
            r5.append(r6)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106580i(r9, r5)
            int r5 = r8.invalidPointCount
            if (r5 < r4) goto L_0x018e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "face incomplete invalid point count:"
            r10.append(r11)
            int r11 = r8.invalidPointCount
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106582w(r9, r10)
            com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise r9 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INCOMPLETE_FACE
            goto L_0x0006
        L_0x018e:
            float r4 = r8.bigfaceThreshold
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x01b5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "face too big:"
            r11.append(r2)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106582w(r9, r11)
            com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise r9 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_TOO_CLOSE
            float r11 = r8.bigfaceThreshold
            float r2 = r8.bigFaceThresholdBuffer
            float r11 = r11 + r2
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x0006
            goto L_0x02ec
        L_0x01b5:
            float r4 = r8.intersectRatio
            float r5 = r8.inRectThreshold
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x01d7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "face not in rect ratio:"
            r10.append(r11)
            float r11 = r8.intersectRatio
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106582w(r9, r10)
            com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise r9 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NOT_IN_RECT
            goto L_0x0006
        L_0x01d7:
            float r4 = r8.smallfaceThreshold
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x01fe
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "face too small:"
            r11.append(r2)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106582w(r9, r11)
            com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise r9 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_TOO_FAR
            float r11 = r8.smallfaceThreshold
            float r2 = r8.smallFaceThresholdBuffer
            float r11 = r11 - r2
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 < 0) goto L_0x0006
            goto L_0x02ec
        L_0x01fe:
            if (r2 == 0) goto L_0x0287
            float r10 = r11.pitch
            float r10 = java.lang.Math.abs(r10)
            int r2 = r8.pitchThreshold
            float r2 = (float) r2
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x0227
            float r10 = r11.yaw
            float r10 = java.lang.Math.abs(r10)
            int r2 = r8.yawThreshold
            float r2 = (float) r2
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x0227
            float r10 = r11.roll
            float r10 = java.lang.Math.abs(r10)
            int r2 = r8.rollThreshold
            float r2 = (float) r2
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x0287
        L_0x0227:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "face pose not right ("
            r10.append(r2)
            float r2 = r11.pitch
            r10.append(r2)
            java.lang.String r2 = ","
            r10.append(r2)
            float r3 = r11.yaw
            r10.append(r3)
            r10.append(r2)
            float r2 = r11.roll
            r10.append(r2)
            java.lang.String r2 = ")"
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106582w(r9, r10)
            com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise r9 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INCORRECT_POSTURE
            float r10 = r11.pitch
            float r10 = java.lang.Math.abs(r10)
            int r2 = r8.pitchThreshold
            float r2 = (float) r2
            float r3 = r8.poseThresholdBuffer
            float r2 = r2 + r3
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x0006
            float r10 = r11.yaw
            float r10 = java.lang.Math.abs(r10)
            int r2 = r8.yawThreshold
            float r2 = (float) r2
            float r3 = r8.poseThresholdBuffer
            float r2 = r2 + r3
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x0006
            float r10 = r11.roll
            float r10 = java.lang.Math.abs(r10)
            int r11 = r8.rollThreshold
            float r11 = (float) r11
            float r2 = r8.poseThresholdBuffer
            float r11 = r11 + r2
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x0006
            goto L_0x02ec
        L_0x0287:
            boolean r10 = r8.needCheckEyeOpen
            if (r10 == 0) goto L_0x02e8
            boolean r10 = r8.isActionStage()
            if (r10 != 0) goto L_0x02e8
            float[] r10 = r11.xys
            float r10 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.ProcessHelper.preCheckCloseEyeScore(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "eye score:"
            r11.append(r2)
            r11.append(r10)
            java.lang.String r2 = " cnt:"
            r11.append(r2)
            int r2 = r8.continueCloseEyeCount
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106580i(r9, r11)
            float r9 = r8.eyeOpenThreshold
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x02ca
            int r9 = r8.continueCloseEyeCount
            int r9 = r9 + r0
            r8.continueCloseEyeCount = r9
            int r9 = r8.detectAvailableCount
            int r9 = r9 - r0
            r8.detectAvailableCount = r9
            if (r9 >= 0) goto L_0x02cc
            r8.detectAvailableCount = r1
            goto L_0x02cc
        L_0x02ca:
            r8.continueCloseEyeCount = r1
        L_0x02cc:
            com.tencent.youtu.sdkkitframework.framework.YtFSM r9 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance()
            com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r9 = r9.getWorkMode()
            com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r10 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE
            if (r9 == r10) goto L_0x02da
            r3 = 10
        L_0x02da:
            int r9 = r8.continueCloseEyeCount
            if (r9 < r3) goto L_0x02e4
            com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise r9 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_EYE_CLOSE
            r8.continueCloseEyeCount = r1
            goto L_0x0006
        L_0x02e4:
            com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise r9 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS
            goto L_0x0006
        L_0x02e8:
            com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise r9 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS
            goto L_0x0006
        L_0x02ec:
            r8.currentAdviseTip = r9
            if (r0 == 0) goto L_0x02f2
            com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise r9 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS
        L_0x02f2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.getFacePreviewAdvise(android.graphics.Rect, android.graphics.Rect, com.tencent.youtu.ytfacetrack.YTFaceTrack$FaceStatus):com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise");
    }

    private Rect getFaceRect(YTFaceTrack.FaceStatus faceStatus) {
        float[] fArr = faceStatus.xys;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = f2;
        float f4 = f;
        float f5 = f4;
        int i = 0;
        while (i < 180) {
            f4 = Math.min(f4, faceStatus.xys[i]);
            f5 = Math.max(f5, faceStatus.xys[i]);
            int i2 = i + 1;
            f2 = Math.min(f2, faceStatus.xys[i2]);
            f3 = Math.max(f3, faceStatus.xys[i2]);
            i = i2 + 1;
        }
        int i3 = this.previewWidth;
        float f6 = ((float) (i3 - 1)) - f4;
        float f7 = ((float) (i3 - 1)) - f5;
        float f8 = (float) (((double) f7) - ((((double) (f6 - f7)) * 0.1d) / 2.0d));
        float f9 = (float) (((double) f6) + ((((double) (f6 - f8)) * 0.1d) / 2.0d));
        float f15 = (float) (((double) f2) - ((((double) (f3 - f2)) * 0.1d) / 2.0d));
        float f16 = (float) (((double) f3) + ((((double) (f3 - f15)) * 0.1d) / 2.0d));
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f8 > ((float) (i3 - 1))) {
            f8 = (float) (i3 - 1);
        }
        if (f9 > ((float) (i3 - 1))) {
            f9 = (float) (i3 - 1);
        }
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        int i4 = this.previewHeight;
        if (f15 > ((float) (i4 - 1))) {
            f15 = (float) (i4 - 1);
        }
        if (f16 > ((float) (i4 - 1))) {
            f16 = (float) (i4 - 1);
        }
        Rect rect = new Rect();
        rect.left = (int) f8;
        rect.top = (int) f15;
        rect.right = (int) f9;
        rect.bottom = (int) f16;
        return rect;
    }

    private FacePreviewingAdvise getPoseJudge(YTFaceTrack.FaceStatus[] faceStatusArr) {
        YTFaceTrack.FaceStatus faceStatus = faceStatusArr[0];
        Rect faceRect = getFaceRect(faceStatus);
        Rect rect = this.previousFaceRect;
        if (rect == null) {
            this.previousFaceRect = faceRect;
            this.stableFaceCount = 0;
        } else {
            Rect intersectionRect = getIntersectionRect(faceRect, rect);
            if (!(faceRect.height() == 0 || faceRect.width() == 0)) {
                float abs = Math.abs(((((float) intersectionRect.width()) * ((float) intersectionRect.height())) / ((float) faceRect.height())) / ((float) faceRect.width()));
                YtLogger.m106580i(TAG, "pose ratio " + abs);
                if (abs < this.stableRoiThreshold) {
                    this.extraTips = StringCode.FL_ACT_SCREEN_SHAKING;
                    this.stableFaceCount = 0;
                } else {
                    this.extraTips = "";
                    this.stableFaceCount++;
                }
            }
            this.previousFaceRect = faceRect;
        }
        YtLogger.m106580i(TAG, "rect is: " + faceRect.left + ", " + faceRect.top + ", " + faceRect.right + ", " + faceRect.bottom);
        return getFacePreviewAdvise(YtSDKKitFramework.getInstance().getDetectRect(), faceRect, faceStatus);
    }

    private int getShelterJudge(YTFaceTrack.FaceStatus[] faceStatusArr) {
        int shelterJudge = YTFaceUtils.shelterJudge(faceStatusArr[0].pointsVis);
        if (this.currentShelterJudge != shelterJudge) {
            this.continueShelterJudgeCount = 0;
            this.currentShelterJudge = shelterJudge;
        } else {
            this.continueShelterJudgeCount++;
        }
        if (this.frameNum >= 7 && this.continueShelterJudgeCount < 7) {
            return this.previousShelterJudge;
        }
        this.previousShelterJudge = this.currentShelterJudge;
        return shelterJudge;
    }

    private void initYoutuInstance() {
        YTFaceTrack.setLoggerListener(new YTFaceTrack.IYtLoggerListener() {
            public void log(String str, String str2) {
                YtLogger.m106580i(str, str2);
            }
        });
        Context context = YtFSM.getInstance().getContext().currentAppContext;
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (this.isLoadResourceOnline) {
            absolutePath = this.resourceDownloadPath;
            YtLogger.m106580i(TAG, "Use online path:" + absolutePath);
        } else {
            YtLogger.m106580i(TAG, "Use local path:" + absolutePath);
        }
        String[] strArr = {"net1_18.rpnmodel", "net1_18_bin.rpnproto", "net2_36.rpnmodel", "net2_36_bin.rpnproto"};
        if (!this.isLoadResourceOnline) {
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                AssetManager assets = context.getAssets();
                FileUtils.copyAsset(assets, "FaceTrackModels/detector/" + str, absolutePath + "/" + str);
            }
        }
        String[] strArr2 = {"align.rpdm", "align.stb", "align_bin.rpdc", "eye.rpdm", "eye_bin.rpdc"};
        if (!this.isLoadResourceOnline) {
            for (int i2 = 0; i2 < 5; i2++) {
                String str2 = strArr2[i2];
                AssetManager assets2 = context.getAssets();
                FileUtils.copyAsset(assets2, "FaceTrackModels/ufa/" + str2, absolutePath + "/" + str2);
            }
        }
        String[] strArr3 = {"rotBasis.bin"};
        if (!this.isLoadResourceOnline) {
            for (int i3 = 0; i3 < 1; i3++) {
                String str3 = strArr3[i3];
                AssetManager assets3 = context.getAssets();
                FileUtils.copyAsset(assets3, "FaceTrackModels/poseest/" + str3, absolutePath + "/" + str3);
            }
        }
        int GlobalInit = YTFaceTrack.GlobalInit(absolutePath + "/");
        if (GlobalInit != 0) {
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_MODEL_INIT_FAIL, "模式初始化失败");
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(GlobalInit) {
                public final /* synthetic */ int val$r;

                {
                    this.val$r = r4;
                    put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                    put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
                    put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with " + r4));
                }
            });
            return;
        }
        YTFaceAlignParam GetFaceAlignParam = YTFaceTrack.getInstance().GetFaceAlignParam();
        GetFaceAlignParam.net_fix_config = FIX_EYE_MOUTH;
        GetFaceAlignParam.refine_config = REFINE_CONFIG_OFF;
        YTFaceTrack.getInstance().SetFaceAlignParam(GetFaceAlignParam);
        YTFaceDetectParam GetFaceDetectParam = YTFaceTrack.getInstance().GetFaceDetectParam();
        String str4 = TAG;
        YtLogger.m106580i(str4, "big face mode" + this.needBigFaceMode);
        GetFaceDetectParam.bigger_face_mode = this.needBigFaceMode;
        GetFaceDetectParam.min_face_size = Math.max(Math.min(this.previewWidth, this.previewHeight) / 5, 40);
        YTFaceTrack.getInstance().SetFaceDetectParam(GetFaceDetectParam);
        YTFaceTrackParam GetFaceTrackParam = YTFaceTrack.getInstance().GetFaceTrackParam();
        GetFaceTrackParam.need_pose_estimate = true;
        GetFaceTrackParam.detect_interval = this.detectIntervalCount;
        YTFaceTrack.getInstance().SetFaceTrackParam(GetFaceTrackParam);
        YtLogger.m106580i(str4, "Detect version:" + YTFaceTrack.Version);
    }

    private boolean isActionStage() {
        return YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE || YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
    }

    private void sendFSMEvent(HashMap<String, Object> hashMap) {
        YtFSM.getInstance().sendFSMEvent(hashMap);
    }

    private void sendFaceStatusUITips(FacePreviewingAdvise facePreviewingAdvise, int i) {
        int i2;
        HashMap hashMap = new HashMap();
        FacePreviewingAdvise facePreviewingAdvise2 = FacePreviewingAdvise.ADVISE_PASS;
        if ((facePreviewingAdvise == facePreviewingAdvise2 || facePreviewingAdvise == FacePreviewingAdvise.ADVISE_INBUFFER_PASS) && i == 0) {
            this.detectAvailableCount++;
        } else {
            hashMap.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
            this.detectAvailableCount = 0;
        }
        if (facePreviewingAdvise == this.prevAdvise && i == this.prevJudge) {
            this.sameFaceTipCount++;
        } else {
            this.sameFaceTipCount = 0;
        }
        if (!this.tipFilterFlag || this.sameFaceTipCount <= 3 || this.currentAdviseTip != facePreviewingAdvise) {
            this.prevAdvise = facePreviewingAdvise;
            this.prevJudge = i;
            YtLogger.m106580i(TAG, " tips:" + convertAdvise(this.currentAdviseTip));
            FacePreviewingAdvise facePreviewingAdvise3 = this.currentAdviseTip;
            if (facePreviewingAdvise3 != facePreviewingAdvise2 && facePreviewingAdvise3 != FacePreviewingAdvise.ADVISE_INBUFFER_PASS) {
                hashMap.put(StateEvent.Name.UI_TIPS, convertAdvise(facePreviewingAdvise3));
            } else if (i == 1) {
                hashMap.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_LEFT_FACE);
            } else if (i == 2) {
                hashMap.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_CHIN);
            } else if (i == 3) {
                hashMap.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_MOUTH);
            } else if (i == 4) {
                hashMap.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_RIGHT_FACE);
            } else if (i == 5) {
                hashMap.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_NOSE);
            } else if (i == 6) {
                hashMap.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_RIGHT_EYE);
            } else if (i == 7) {
                hashMap.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_LEFT_EYE);
            } else if (i == 0 && (i2 = this.sameFaceTipCount) > 2 && i2 < 5) {
                hashMap.put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_KEEP);
                hashMap.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_PASS);
            }
            String str = this.extraTips;
            if (str != "") {
                hashMap.put(StateEvent.Name.UI_EXTRA_TIPS, str);
            }
            sendFSMEvent(hashMap);
        }
    }

    private void sendUITipEvent(YTFaceTrack.FaceStatus[] faceStatusArr) {
        HashMap hashMap = new HashMap();
        if (faceStatusArr == null) {
            hashMap.put(StateEvent.Name.UI_TIPS, StringCode.FL_NO_FACE);
            hashMap.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
            this.detectAvailableCount = 0;
            FacePreviewingAdvise facePreviewingAdvise = FacePreviewingAdvise.ADVISE_NO_FACE;
            this.prevAdvise = facePreviewingAdvise;
            this.currentAdviseTip = facePreviewingAdvise;
        } else if (faceStatusArr.length > 1) {
            hashMap.put(StateEvent.Name.UI_TIPS, StringCode.FL_TOO_MANY_FACES);
            hashMap.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
            hashMap.put("ui_error", "Failed");
            if (this.needCheckMultiFaces) {
                this.detectAvailableCount = 0;
                this.prevAdvise = FacePreviewingAdvise.ADVISE_TOO_MANY_FACE;
            }
            this.currentAdviseTip = FacePreviewingAdvise.ADVISE_TOO_MANY_FACE;
        } else {
            FacePreviewingAdvise poseJudge = getPoseJudge(faceStatusArr);
            String str = TAG;
            YtLogger.m106580i(str, "advise " + poseJudge);
            sendFaceStatusUITips(poseJudge, getShelterJudge(faceStatusArr));
        }
        if (hashMap.size() > 0) {
            sendFSMEvent(hashMap);
        }
    }

    public void enter() {
        super.enter();
    }

    public void enterFirst() {
        if (!this.needManualTrigger) {
            this.countdowner.start();
        } else {
            this.predetectCountdowner.start();
        }
    }

    public void exit() {
        super.exit();
    }

    public Rect getIntersectionRect(Rect rect, Rect rect2) {
        return new Rect(Math.max(rect.left, rect2.left), Math.max(rect.top, rect2.top), Math.min(rect.right, rect2.right), Math.min(rect.bottom, rect2.bottom));
    }

    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (!this.needManualTrigger) {
            return;
        }
        if (ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS) {
            this.detectAvailableCount = 0;
            this.triggerLiveBeginEventFlag = true;
            resetTimeout();
        } else if (ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            this.detectAvailableCount = 0;
            this.triggerLiveBeginEventFlag = false;
            this.countdowner.cancel();
            this.predetectCountdowner.reset();
        }
    }

    public void handleStateAction(String str, Object obj) {
        super.handleStateAction(str, obj);
        if (str.equals("reset_timeout")) {
            String str2 = TAG;
            YtLogger.m106580i(str2, "predetect status:" + this.predetectCountdowner.isRunning());
            if (!this.predetectCountdowner.isRunning()) {
                resetTimeout();
            }
        } else if (str.equals("reset_manual_trigger")) {
            this.triggerLiveBeginEventFlag = false;
            this.countdowner.cancel();
        }
    }

    public void loadStateWith(String str, JSONObject jSONObject) {
        super.loadStateWith(str, jSONObject);
        try {
            if (jSONObject.has("resource_online")) {
                this.isLoadResourceOnline = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                this.resourceDownloadPath = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("timeout_countdown_ms")) {
                this.countdowner.init((long) Math.max(0, Math.min(30000, jSONObject.getInt("timeout_countdown_ms"))), true);
            }
            if (jSONObject.has("predetect_countdown_ms")) {
                this.predetectCountdowner.init((long) jSONObject.getInt("predetect_countdown_ms"), true);
            } else {
                this.predetectCountdowner.init(25000, true);
            }
            if (jSONObject.has("same_tips_filter")) {
                this.tipFilterFlag = jSONObject.getBoolean("same_tips_filter");
            }
            if (jSONObject.has("manual_trigger")) {
                this.needManualTrigger = jSONObject.getBoolean("manual_trigger");
            }
            this.needCheckMultiFaces = jSONObject.optBoolean("need_check_multiface", false);
            updateSDKSetting(jSONObject);
        } catch (JSONException e) {
            String str2 = TAG;
            YtLogger.m106579e(str2, "Failed to parse json:" + e.getLocalizedMessage());
        }
        if (!this.isLoadResourceOnline) {
            FileUtils.loadLibrary("YTFaceTrackPro2");
        }
        Camera.Size previewSize = YtFSM.getInstance().getContext().currentCamera.getParameters().getPreviewSize();
        int i = YtFSM.getInstance().getContext().currentRotateState;
        this.cameraRotateState = i;
        if (i >= 5) {
            this.previewWidth = previewSize.height;
            this.previewHeight = previewSize.width;
        } else {
            this.previewWidth = previewSize.width;
            this.previewHeight = previewSize.height;
        }
        this.maskWidthRatio = ((float) YtSDKKitFramework.getInstance().getPreviewRect().width()) / ((float) this.previewWidth);
        this.maskHeightRatio = ((float) YtSDKKitFramework.getInstance().getPreviewRect().height()) / ((float) this.previewHeight);
        initYoutuInstance();
        reset();
    }

    public void moveToNextState() {
        FacePreviewingAdvise facePreviewingAdvise;
        FacePreviewingAdvise facePreviewingAdvise2;
        super.moveToNextState();
        boolean z = this.needManualTrigger;
        if (!z || ((!this.needCheckPose || (facePreviewingAdvise2 = this.prevAdvise) == FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise2 == FacePreviewingAdvise.ADVISE_INBUFFER_PASS) && !((this.needCheckMultiFaces && this.prevAdvise == FacePreviewingAdvise.ADVISE_TOO_MANY_FACE) || (facePreviewingAdvise = this.prevAdvise) == FacePreviewingAdvise.ADVISE_INCOMPLETE_FACE || facePreviewingAdvise == FacePreviewingAdvise.ADVISE_NO_FACE))) {
            this.continueNoValidFaceCount = 0;
        } else {
            int i = this.continueNoValidFaceCount + 1;
            this.continueNoValidFaceCount = i;
            if (i > this.continueNovalidFaceCountThreshold) {
                String convertAdvise = convertAdvise(this.prevAdvise);
                String makeMessageJson = CommonUtils.makeMessageJson(4194304, convertAdvise, "action check failed");
                YtSDKStats.getInstance().reportError(4194304, convertAdvise);
                HashMap hashMap = new HashMap();
                hashMap.put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                hashMap.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                hashMap.put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                hashMap.put(StateEvent.Name.ERROR_CODE, 4194304);
                hashMap.put(StateEvent.Name.ERROR_REASON_CODE, 4194304);
                hashMap.put(StateEvent.Name.MESSAGE, makeMessageJson);
                YtFSM.getInstance().sendFSMEvent(hashMap);
                YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                return;
            }
        }
        if (z && this.predetectCountdowner.checkTimeout()) {
            String str = TAG;
            YtLogger.m106580i(str, "predectcountdowner.checkTimeout(): " + this.predetectCountdowner.checkTimeout());
            this.predetectCountdowner.cancel();
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_TIMEOUT, "yt_verify_step_timeout");
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
        } else if (this.countdowner.checkTimeout()) {
            this.countdowner.cancel();
            YtLogger.m106580i(TAG, "liveness timeout");
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_TIMEOUT, "yt_verify_step_timeout");
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
        } else if (this.needManualTrigger || this.isFirstStablePass || this.detectAvailableCount > this.stableCountNum) {
            this.isFirstStablePass = true;
            this.predetectCountdowner.cancel();
            int i2 = C203483.f57038x75f35c10[YtFSM.getInstance().getWorkMode().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            } else if (i2 == 4) {
                YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
            } else if (i2 == 5) {
                YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.LIPREAD_STATE));
            }
        }
    }

    public void reset() {
        this.prevAdvise = FacePreviewingAdvise.ADVISE_NAN;
        this.detectAvailableCount = 0;
        this.continueCloseEyeCount = 0;
        this.frameNum = 0;
        this.triggerLiveBeginEventFlag = false;
        this.sameFaceTipCount = 0;
        this.maxEyeScore = -1.0E10f;
        this.minMouthScore = 1.0E10f;
        this.minEyeScore = 1.0E10f;
        this.maxMouthScore = -1.0E10f;
        this.maxShelterScore = -1.0E10f;
        this.isFirstStablePass = false;
        this.continueNoValidFaceCount = 0;
        this.invalidPointCount = 0;
        this.unstableCount = 0;
        this.maxInRectRatio = -1.0E10f;
        this.countdowner.cancel();
        this.predetectCountdowner.cancel();
        this.stableFaceCount = 0;
        this.currentShelterJudge = -1;
        this.previousFaceRect = null;
        if (!this.needManualTrigger) {
            this.countdowner.reset();
        } else {
            this.predetectCountdowner.reset();
        }
        super.reset();
    }

    public void resetTimeout() {
        this.countdowner.reset();
    }

    public void unload() {
        super.unload();
        try {
            YTFaceTrack.GlobalRelease();
        } catch (Exception unused) {
            YtLogger.m106579e(TAG, "SDK inner bug");
        }
    }

    public void update(byte[] bArr, int i, int i2, int i3, long j) {
        super.update(bArr, i, i2, i3, j);
        if (this.countdowner.checkTimeout() || (this.needManualTrigger && this.predetectCountdowner.checkTimeout())) {
            moveToNextState();
            return;
        }
        YTFaceTrack instance = YTFaceTrack.getInstance();
        if (instance == null) {
            YtLogger.m106579e(TAG, "Tracker is null, please check facetrack init result");
            return;
        }
        this.frameNum++;
        YTFaceTrack.YTImage yTImage = new YTFaceTrack.YTImage();
        yTImage.width = i;
        yTImage.height = i2;
        float[] fArr = new float[1];
        CommonUtils.benchMarkBegin("detect");
        YTFaceTrack.FaceStatus[] DoDetectionProcessYUVWithBlur = instance.DoDetectionProcessYUVWithBlur(bArr, i, i2, this.cameraRotateState, true, fArr, yTImage);
        CommonUtils.benchMarkEnd("detect");
        String str = TAG;
        YtLogger.m106580i(str, CommonUtils.getBenchMarkTime("detect"));
        YtLogger.m106580i(str, "Blur score:" + Arrays.toString(fArr));
        if (DoDetectionProcessYUVWithBlur != null) {
            YtLogger.m106580i(str, "face status count " + DoDetectionProcessYUVWithBlur.length);
            if (DoDetectionProcessYUVWithBlur.length > 1) {
                int i4 = Integer.MIN_VALUE;
                int i5 = 0;
                for (int i6 = 0; i6 < DoDetectionProcessYUVWithBlur.length; i6++) {
                    Rect faceRect = getFaceRect(DoDetectionProcessYUVWithBlur[i6]);
                    int width = faceRect.width() * faceRect.height();
                    if (width >= i4) {
                        i5 = i6;
                        i4 = width;
                    }
                }
                if (i5 != 0) {
                    YtLogger.m106580i(TAG, "Found max face id:" + i5);
                    DoDetectionProcessYUVWithBlur[0] = DoDetectionProcessYUVWithBlur[i5];
                }
            }
        } else {
            YtLogger.m106580i(str, "face status is null");
        }
        sendUITipEvent(DoDetectionProcessYUVWithBlur);
        this.stateData.put("pose_state", this.prevAdvise);
        this.stateData.put("shelter_state", Integer.valueOf(this.prevJudge));
        this.stateData.put("face_status", DoDetectionProcessYUVWithBlur);
        this.stateData.put("continuous_detect_count", Integer.valueOf(this.detectAvailableCount));
        YuvImage yuvImage = new YuvImage(yTImage.data, 17, i2, i, (int[]) null);
        this.stateData.put("last_face_status", DoDetectionProcessYUVWithBlur);
        this.stateData.put("last_frame", yuvImage);
        FacePreviewingAdvise facePreviewingAdvise = this.prevAdvise;
        if (facePreviewingAdvise == FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise == FacePreviewingAdvise.ADVISE_INBUFFER_PASS) {
            checkBestImage(DoDetectionProcessYUVWithBlur[0], yuvImage, fArr[0]);
        }
        if (this.stateData.get("best_image") != null) {
            boolean z = this.needManualTrigger;
            if (!z || (z && this.triggerLiveBeginEventFlag)) {
                moveToNextState();
            }
        }
    }

    public void updateSDKSetting(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str = "need_check_shelter";
        String str2 = "in_rect_ratio_threshold";
        String str3 = "novalid_face_count";
        try {
            if (jSONObject2.has("check_eye_open")) {
                this.needCheckEyeOpen = jSONObject2.getBoolean("check_eye_open");
            }
            if (jSONObject2.has("open_eye_threshold")) {
                this.eyeOpenThreshold = (float) jSONObject2.getDouble("open_eye_threshold");
            }
            if (jSONObject2.has("pitch_threshold")) {
                this.pitchThreshold = jSONObject2.getInt("pitch_threshold");
            }
            if (jSONObject2.has("yaw_threshold")) {
                this.yawThreshold = jSONObject2.getInt("yaw_threshold");
            }
            if (jSONObject2.has("roll_threshold")) {
                this.rollThreshold = jSONObject2.getInt("roll_threshold");
            }
            if (jSONObject2.has("smallface_ratio_threshold")) {
                this.smallfaceThreshold = (float) jSONObject2.getDouble("smallface_ratio_threshold");
            }
            if (jSONObject2.has("bigface_ratio_threshold")) {
                this.bigfaceThreshold = (float) jSONObject2.getDouble("bigface_ratio_threshold");
            }
            if (jSONObject2.has("blur_detect_threshold")) {
                this.blurDetectThreshold = (float) jSONObject2.getDouble("blur_detect_threshold");
            }
            if (jSONObject2.has("need_big_face_mode")) {
                this.needBigFaceMode = jSONObject2.getBoolean("need_big_face_mode");
            }
            if (jSONObject2.has("detect_interval")) {
                this.detectIntervalCount = jSONObject2.getInt("detect_interval");
            }
            if (jSONObject2.has("stable_frame_num")) {
                this.stableCountNum = jSONObject2.getInt("stable_frame_num");
            }
            if (jSONObject2.has("net_request_timeout_ms")) {
                YtSDKKitFramework.getInstance().setNetworkRequestTimeoutMS(jSONObject2.getInt("net_request_timeout_ms"));
            }
            if (jSONObject2.has("force_pose_check")) {
                this.needCheckPose = jSONObject2.getBoolean("force_pose_check");
            }
            String str4 = str3;
            if (jSONObject2.has(str4)) {
                this.continueNovalidFaceCountThreshold = jSONObject2.getInt(str4);
            }
            String str5 = str2;
            if (jSONObject2.has(str5)) {
                this.inRectThreshold = (float) jSONObject2.getDouble(str5);
            }
            String str6 = str;
            if (jSONObject2.has(str6)) {
                this.needCheckShelter = jSONObject2.getBoolean(str6);
            }
            if (jSONObject2.has("stable_roi_threshold")) {
                this.stableRoiThreshold = (float) jSONObject2.getDouble("stable_roi_threshold");
            }
            this.bigFaceThresholdBuffer = (float) jSONObject2.optDouble("bigface_ratio_buffer", (double) this.bigFaceThresholdBuffer);
            this.smallFaceThresholdBuffer = (float) jSONObject2.optDouble("smallface_ratio_buffer", (double) this.smallFaceThresholdBuffer);
            this.poseThresholdBuffer = (float) jSONObject2.optDouble("pose_ratio_buffer", (double) this.poseThresholdBuffer);
            this.stableRoiThreshold = (float) jSONObject2.optDouble("stable_roi_threshold", (double) this.stableRoiThreshold);
        } catch (JSONException e) {
            String str7 = TAG;
            YtLogger.m106579e(str7, "Failed to parse json:" + e.getLocalizedMessage());
        }
    }
}
