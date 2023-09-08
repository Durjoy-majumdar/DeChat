package com.tencent.youtu.ytposedetect;

import android.content.Context;
import android.hardware.Camera;
import com.tencent.youtu.ytcommon.tools.YTCameraSetting;
import com.tencent.youtu.ytcommon.tools.YTException;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager;

public class YTPoseDetectInterface {
    private static final String TAG = "YoutuFaceDetect";
    public static final String VERSION = "3.5.6.4";
    private static PoseDetectResult mCheckResult;
    private static int mInitModel;
    private static boolean mIsStarted;
    public static int mModelRetainCount;
    private static PoseDetectProcessManager mPoseDetectProcessManager;

    public interface PoseDetectGetBestImage {
        void onGetBestImage(byte[] bArr, int i, int i2);
    }

    public interface PoseDetectOnFrame {
        public static final int DETECT_AUTH_FAILED = 1;
        public static final int DETECT_NOT_CALL_START = 3;
        public static final int DETECT_NOT_INIT_MODEL = 2;
        public static final int DETECT_SUCCESS = 0;

        void onCanReflect();

        void onFailed(int i, String str, String str2);

        void onRecordingDone(byte[][] bArr, int i, int i2);

        void onSuccess(int i);
    }

    public interface PoseDetectResult {
        public static final int ERROR_AUTH_FAILED = 1;
        public static final int ERROR_NOT_INIT_MODEL = 2;
        public static final int SUCCESS = 0;

        void onFailed(int i, String str, String str2);

        void onSuccess();
    }

    public interface PoseDetectSafetyLevel {
        public static final int SAFETY_COUNT = 3;
        public static final int SAFETY_HIGH = 2;
        public static final int SAFETY_LOW = 1;
        public static final int SAFETY_RECOMMAND = 0;
    }

    public interface PoseDetectGetImage {
        void onGetImage(byte[] bArr, int i, int i2);
    }

    public interface PoseDetectLiveType {
        public static final int LIVETYPE_BLINK_EYE = 1;
        public static final int LIVETYPE_NOD_HEAD = 3;
        public static final int LIVETYPE_OPEN_MOUTH = 2;
        public static final int LIVETYPE_SHAKE_HEAD = 4;
        public static final int LIVETYPE_SILENCE = 5;
    }

    public class PoseImage {
        public byte[] data;
        public int height;
        public int width;

        public PoseImage() {
        }
    }

    public static YTActRefData getActReflectData() {
        return YTPoseDetectJNIInterface.getActionReflectData(YTCameraSetting.getRotateTag(mPoseDetectProcessManager.mCameraRotate, 1));
    }

    public static void getBestImage(PoseDetectGetBestImage poseDetectGetBestImage, boolean z) {
        int i = 1;
        if (z) {
            i = YTCameraSetting.getRotateTag(mPoseDetectProcessManager.mCameraRotate, 1);
        }
        byte[] bestImage = YTPoseDetectJNIInterface.getBestImage(i);
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
            poseDetectGetBestImage.onGetBestImage(bestImage, poseDetectProcessManager.mDesiredPreviewHeight, poseDetectProcessManager.mDesiredPreviewWidth);
            return;
        }
        PoseDetectProcessManager poseDetectProcessManager2 = mPoseDetectProcessManager;
        poseDetectGetBestImage.onGetBestImage(bestImage, poseDetectProcessManager2.mDesiredPreviewWidth, poseDetectProcessManager2.mDesiredPreviewHeight);
    }

    public static YTPoseImage getEyeImage(int i) {
        YTPoseImage yTPoseImage = new YTPoseImage();
        yTPoseImage.yuvRotateData = YTPoseDetectJNIInterface.getEyeImage(i);
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
            yTPoseImage.width = poseDetectProcessManager.mDesiredPreviewHeight;
            yTPoseImage.height = poseDetectProcessManager.mDesiredPreviewWidth;
        } else {
            PoseDetectProcessManager poseDetectProcessManager2 = mPoseDetectProcessManager;
            yTPoseImage.width = poseDetectProcessManager2.mDesiredPreviewWidth;
            yTPoseImage.height = poseDetectProcessManager2.mDesiredPreviewHeight;
        }
        return yTPoseImage;
    }

    public static YTPoseImage getMouthImage(int i) {
        YTPoseImage yTPoseImage = new YTPoseImage();
        yTPoseImage.yuvRotateData = YTPoseDetectJNIInterface.getMouthImage(i);
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
            yTPoseImage.width = poseDetectProcessManager.mDesiredPreviewHeight;
            yTPoseImage.height = poseDetectProcessManager.mDesiredPreviewWidth;
        } else {
            PoseDetectProcessManager poseDetectProcessManager2 = mPoseDetectProcessManager;
            yTPoseImage.width = poseDetectProcessManager2.mDesiredPreviewWidth;
            yTPoseImage.height = poseDetectProcessManager2.mDesiredPreviewHeight;
        }
        return yTPoseImage;
    }

    public static String getVersion() {
        return "jar3.5.6.4_native" + YTPoseDetectJNIInterface.getVersion();
    }

    public static int initModel() {
        try {
            YTPoseDetectJNIInterface.nativeLog(TAG, "[YTFacePreviewInterface.initModel] ---");
            if (mInitModel > 0) {
                YTPoseDetectJNIInterface.nativeLog(TAG, "[YTFacePreviewInterface.initModel] has already inited.");
                mInitModel++;
                return 0;
            }
            int initModel = YTPoseDetectJNIInterface.initModel("");
            if (initModel != 0) {
                return initModel;
            }
            PoseDetectProcessManager poseDetectProcessManager = new PoseDetectProcessManager();
            mPoseDetectProcessManager = poseDetectProcessManager;
            poseDetectProcessManager.initAll();
            mInitModel++;
            return 0;
        } catch (Exception e) {
            YTPoseDetectJNIInterface.nativeLog(TAG, "initModel failed. message: " + e.getMessage());
            YTException.report(e);
            return 10;
        }
    }

    public static boolean isDetecting() {
        PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
        return poseDetectProcessManager != null && poseDetectProcessManager.mIsDetecting;
    }

    /* access modifiers changed from: private */
    public static void noticeFailed(int i, String str, String str2) {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.noticeFailed] resultCode: " + i + " \r\nmessage: " + str + " \r\ntips: " + str2);
        mPoseDetectProcessManager.restoreCamera();
        mCheckResult.onFailed(i, str, str2);
        mCheckResult = null;
        mIsStarted = false;
    }

    /* access modifiers changed from: private */
    public static void noticeSuccess() {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.noticeSuccess] ---");
        mCheckResult.onSuccess();
        mCheckResult = null;
        mIsStarted = true;
    }

    public static void poseDetect(float[] fArr, float[] fArr2, int i, byte[] bArr, Camera camera, float f, float f2, float f3, PoseDetectOnFrame poseDetectOnFrame, int i2) {
        PoseDetectOnFrame poseDetectOnFrame2 = poseDetectOnFrame;
        if (mInitModel <= 0) {
            poseDetectOnFrame2.onFailed(2, "Not init model on poseDetect.", "Call YTPoseDetectInterface.initModel() before.");
        } else if (!mIsStarted) {
            poseDetectOnFrame2.onFailed(3, "Not call start() interface before.", "Call YTPoseDetectInterface.start() before.");
        } else {
            poseDetectOnFrame2.onSuccess(mPoseDetectProcessManager.poseDetect(fArr, fArr2, i, bArr, f, f2, f3, i2));
            if (YTPoseDetectJNIInterface.canReflect()) {
                poseDetectOnFrame.onCanReflect();
            }
            if (YTPoseDetectJNIInterface.isRecordingDone()) {
                byte[][] frameList = YTPoseDetectJNIInterface.getFrameList();
                int rotateTag = YTCameraSetting.getRotateTag(mPoseDetectProcessManager.mCameraRotate, 1);
                YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.poseDetect] list num: " + frameList.length);
                PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
                int i3 = poseDetectProcessManager.mDesiredPreviewWidth;
                int i4 = poseDetectProcessManager.mDesiredPreviewHeight;
                if (i2 == 1 && (rotateTag == 5 || rotateTag == 6 || rotateTag == 7 || rotateTag == 8)) {
                    int i5 = i3;
                    i3 = i4;
                    i4 = i5;
                }
                poseDetectOnFrame2.onRecordingDone(frameList, i3, i4);
            }
        }
    }

    public static void releaseModel() {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTFacePreviewInterface.finalize] ---");
        int i = mInitModel - 1;
        mInitModel = i;
        if (i <= 0) {
            PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
            if (poseDetectProcessManager != null) {
                poseDetectProcessManager.clearAll();
            }
            YTPoseDetectJNIInterface.releaseAll();
            mInitModel = 0;
        }
    }

    public static void reset() {
        YTPoseDetectJNIInterface.resetDetect();
    }

    public static void setSafetyLevel(int i) {
        if (i >= 0 && i < 3) {
            YTPoseDetectJNIInterface.setSafetyLevel(i);
        }
    }

    public static int start(Context context, Camera camera, int i, PoseDetectResult poseDetectResult) {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.start] ---");
        if (poseDetectResult == null) {
            return -1;
        }
        mCheckResult = poseDetectResult;
        if (mInitModel > 0) {
            mPoseDetectProcessManager.start(context, camera, i, new PoseDetectResult() {
                public void onFailed(int i, String str, String str2) {
                    YTPoseDetectInterface.noticeFailed(i, str, str2);
                }

                public void onSuccess() {
                    YTPoseDetectInterface.noticeSuccess();
                }
            });
            return 0;
        }
        noticeFailed(2, "Not init model.", "Call YTPoseDetectInterface.initModel() before.");
        return 0;
    }

    public static void stop() {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.stop] ---");
        PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
        if (poseDetectProcessManager != null) {
            poseDetectProcessManager.stop();
        }
        mIsStarted = false;
    }

    public static YTPoseImage getBestImage(int i) {
        YTPoseImage yTPoseImage = new YTPoseImage();
        yTPoseImage.yuvRotateData = YTPoseDetectJNIInterface.getBestImage(i);
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
            yTPoseImage.width = poseDetectProcessManager.mDesiredPreviewHeight;
            yTPoseImage.height = poseDetectProcessManager.mDesiredPreviewWidth;
        } else {
            PoseDetectProcessManager poseDetectProcessManager2 = mPoseDetectProcessManager;
            yTPoseImage.width = poseDetectProcessManager2.mDesiredPreviewWidth;
            yTPoseImage.height = poseDetectProcessManager2.mDesiredPreviewHeight;
        }
        return yTPoseImage;
    }
}
