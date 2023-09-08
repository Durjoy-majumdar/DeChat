package com.tencent.youtu.ytagreflectlivecheck;

import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import android.hardware.Camera;
import com.tencent.youtu.ytagreflectlivecheck.jni.JNIUtils;
import com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawYuvData;
import com.tencent.youtu.ytagreflectlivecheck.notice.YTReflectNotice;
import com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester;
import com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleResponse;
import com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker;
import com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class YTAGReflectLiveCheckInterface {
    private static int ERRCODE_GET_ACTREFLECTDATA_FAILED = 4;
    private static int ERRCODE_JNI_DETECT_FAILED = 3;
    private static int ERRCODE_JSON_DECODE_FAILED = 2;
    private static int ERRCODE_NET_RETURN_PARSE_NULL = 0;
    private static int ERRCODE_UPLOAD_VIDEO_FAILED = 1;
    private static final String TAG = "YoutuLightLiveCheck";
    public static final String VERSION = "3.6.9.2";
    /* access modifiers changed from: private */
    public static GetLiveStyleResult getLiveStyleResultHandler = null;
    private static Lock initLock = new ReentrantLock();
    public static YTAGReflectSettings mAGSettings = new YTAGReflectSettings();
    public static String mAppId = "";
    private static Camera mCamera;
    private static int mCameraRotatedTag;
    private static LightLiveCheckResult mCheckResult;
    private static String mColorSeq;
    /* access modifiers changed from: private */
    public static TimerWorker mGetValueTimer;
    private static int mInitModel = 0;
    /* access modifiers changed from: private */
    public static int mOnGetValueCount;
    private static int mOverlayAlpha = 0;
    private static IYTReflectListener mReflectListener;
    public static YTReflectNotice mReflectNotice;
    private static int mState;

    public interface GetLiveStyleResult {
        void onFailed(int i, String str, String str2);

        void onSuccess(LiveStyleRequester.YTLiveStyleReq yTLiveStyleReq, LiveStyleResponse liveStyleResponse);
    }

    public interface IYTReflectListener {
        float onGetAppBrightness();

        void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f);

        void onReflectStart(long j);
    }

    public interface LightLiveCheckResult {
        public static final int AUTH_FAILED = 1;
        public static final int FINISH_ERRORBASE = 300;
        public static final int INIT_ERRORBASE = 100;
        public static final int NOT_INIT_MODEL = 2;
        public static final int NOT_SET_RGBREQUEST = 4;
        public static final int NOT_SET_UPLOADREQUEST = 5;
        public static final int REFLECT_ERRORBASE = 200;
        public static final int SUCCESS = 0;
        public static final int USER_CANCEL = 3;

        void onFailed(int i, String str, String str2);

        void onSuccess(FullPack fullPack);
    }

    public interface LightLiveProcessState {
        public static final int GET_RGBCONFIG = 1;
        public static final int HANGUP = 0;
        public static final int REFLECTING = 2;
        public static final int UPLOAD = 3;
    }

    public interface YTSAFETYLEVEL {
        public static final int SAFETY_HIGH = 2;
        public static final int SAFETY_LOW = 1;
        public static final int SAFETY_RECOMMEND = 0;
    }

    public static /* synthetic */ int access$008() {
        int i = mOnGetValueCount;
        mOnGetValueCount = i + 1;
        return i;
    }

    public static void cancel() {
        YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.cancel] --- ");
        YTAGReflectLiveCheckJNIInterface.getInstance().FRRelease();
    }

    public static YTAGReflectSettings getAGSettings() {
        return mAGSettings;
    }

    public static int getLiveCheckType(Context context, GetLiveStyleResult getLiveStyleResult) {
        YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType] --- start");
        int i = 1;
        if (getLiveStyleResult != null) {
            if (context == null) {
                getLiveStyleResult.onFailed(1, "Input context is null.", "You can try to input getActivity().getApplicationContext() and test again.");
                i = 2;
            } else {
                if (getLiveStyleResultHandler != null) {
                    YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType] repeated calls. this may cause the previous call lost callback.");
                }
                getLiveStyleResultHandler = getLiveStyleResult;
                mOnGetValueCount = 0;
                int start = SensorManagerWorker.getInstance().start(context, new SensorManagerWorker.OnGetValue() {
                    public void onGetValue(float f) {
                        YTAGReflectLiveCheckInterface.access$008();
                        YTAGReflectLiveCheckJNIInterface.nativeLog(YTAGReflectLiveCheckInterface.TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType.onGetValue] get value: " + f + " mOnGetValueCount: " + YTAGReflectLiveCheckInterface.mOnGetValueCount);
                        if (YTAGReflectLiveCheckInterface.mOnGetValueCount > 1) {
                            YTAGReflectLiveCheckJNIInterface.nativeLog(YTAGReflectLiveCheckInterface.TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType.onGetValue] get value: " + f);
                            if (YTAGReflectLiveCheckInterface.mGetValueTimer != null) {
                                YTAGReflectLiveCheckInterface.mGetValueTimer.cancel();
                                TimerWorker unused = YTAGReflectLiveCheckInterface.mGetValueTimer = null;
                            }
                            if (YTAGReflectLiveCheckInterface.getLiveStyleResultHandler != null) {
                                YTAGReflectLiveCheckInterface.getLiveStyleResultHandler.onSuccess(new LiveStyleRequester.YTLiveStyleReq(f, YTAGReflectLiveCheckInterface.mAppId), new LiveStyleResponse());
                                GetLiveStyleResult unused2 = YTAGReflectLiveCheckInterface.getLiveStyleResultHandler = null;
                            }
                            SensorManagerWorker.getInstance().stop();
                        }
                    }
                });
                if (start == 1) {
                    YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType] Can't find light sensor.");
                    GetLiveStyleResult getLiveStyleResult2 = getLiveStyleResultHandler;
                    if (getLiveStyleResult2 != null) {
                        getLiveStyleResult2.onSuccess(new LiveStyleRequester.YTLiveStyleReq(-1.0f, mAppId), new LiveStyleResponse());
                        getLiveStyleResultHandler = null;
                    }
                } else if (start != 0) {
                    GetLiveStyleResult getLiveStyleResult3 = getLiveStyleResultHandler;
                    if (getLiveStyleResult3 != null) {
                        getLiveStyleResult3.onSuccess(new LiveStyleRequester.YTLiveStyleReq(SensorManagerWorker.getInstance().getLux(), mAppId), new LiveStyleResponse());
                        getLiveStyleResultHandler = null;
                    }
                } else {
                    C203502 r5 = new TimerWorker(3000, 3000) {
                        public void onFinish() {
                            YTAGReflectLiveCheckJNIInterface.nativeLog(YTAGReflectLiveCheckInterface.TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType.onFinish] ");
                            if (YTAGReflectLiveCheckInterface.getLiveStyleResultHandler != null) {
                                YTAGReflectLiveCheckInterface.getLiveStyleResultHandler.onSuccess(new LiveStyleRequester.YTLiveStyleReq(-2.0f, YTAGReflectLiveCheckInterface.mAppId), new LiveStyleResponse());
                                GetLiveStyleResult unused = YTAGReflectLiveCheckInterface.getLiveStyleResultHandler = null;
                            }
                        }

                        public void onTick(long j) {
                            YTAGReflectLiveCheckJNIInterface.nativeLog(YTAGReflectLiveCheckInterface.TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType.onTick] onTick");
                        }
                    };
                    mGetValueTimer = r5;
                    r5.start();
                }
                i = 0;
            }
        }
        YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType] --- finish. ret: " + i);
        return i;
    }

    public static RawYuvData[] getRawYuvDatas() {
        return YTAGReflectLiveCheckJNIInterface.getInstance().FRGetRawYuvDatas();
    }

    public static IYTReflectListener getReflectListener() {
        return mReflectListener;
    }

    public static synchronized int initModel(String str, String str2) {
        int i;
        synchronized (YTAGReflectLiveCheckInterface.class) {
            try {
                initLock.lock();
                if (mInitModel > 0) {
                    YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "initModel repeated calls.");
                } else {
                    mAppId = str;
                    if (str == null) {
                        mAppId = "";
                    }
                }
                mInitModel++;
                initLock.unlock();
                i = 0;
            } catch (Exception e) {
                try {
                    YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "initModel failed. message: " + e.getMessage());
                    i = -1;
                    initLock.unlock();
                } catch (Throwable th) {
                    initLock.unlock();
                    throw th;
                }
            }
            YTAGReflectLiveCheckJNIInterface.SetPipelineVersion(str2);
        }
        return i;
    }

    public static void onCameraChanged(int i) {
        try {
            Camera.Parameters parameters = mCamera.getParameters();
            parameters.setExposureCompensation(i);
            mCamera.setParameters(parameters);
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
    }

    public static int[] onFetchCameraInfo() {
        int i;
        int i2;
        int i3;
        try {
            Camera.Parameters parameters = mCamera.getParameters();
            i2 = parameters.getExposureCompensation();
            try {
                i2 = Integer.parseInt(parameters.get("iso"));
            } catch (Exception e) {
                try {
                    e.getLocalizedMessage();
                } catch (Exception e2) {
                    e = e2;
                    i = 0;
                    e.getLocalizedMessage();
                    i3 = 0;
                    return new int[]{i2, i, i3};
                }
            }
            i = parameters.getMinExposureCompensation();
            try {
                i3 = parameters.getMaxExposureCompensation();
            } catch (Exception e3) {
                e = e3;
                e.getLocalizedMessage();
                i3 = 0;
                return new int[]{i2, i, i3};
            }
        } catch (Exception e4) {
            e = e4;
            i2 = 0;
            i = 0;
            e.getLocalizedMessage();
            i3 = 0;
            return new int[]{i2, i, i3};
        }
        return new int[]{i2, i, i3};
    }

    public static void onFinish() {
        YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "on finished");
        int FRDoDetectionYuvs = YTAGReflectLiveCheckJNIInterface.getInstance().FRDoDetectionYuvs(false, mCameraRotatedTag);
        YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "on finished " + FRDoDetectionYuvs);
        if (FRDoDetectionYuvs == 0) {
            mCheckResult.onSuccess(YTAGReflectLiveCheckJNIInterface.getInstance().FRGetAGin());
            return;
        }
        mCheckResult.onFailed(-1, "JNI return failed.[" + FRDoDetectionYuvs + "]", "Please make sure you have called the YTAGReflectLiveCheckInterface.onPreviewFrame during the hole reflecting process. Check log for more information. code: " + FRDoDetectionYuvs);
    }

    public static void onScreenChanged(int i, int i2, int i3, int i4, float f) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(mOverlayAlpha != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, (float) i6, 0.0f, 0.0f, 0.0f, 0.0f, (float) i7, 0.0f, 0.0f, 0.0f, 0.0f, (float) i8, 0.0f, 0.0f, 0.0f, (float) i5, 0.0f} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, (float) i6, 0.0f, 0.0f, 0.0f, 0.0f, (float) i7, 0.0f, 0.0f, 0.0f, 0.0f, (float) i8, 0.0f, 0.0f, 0.0f, 0.0f, (float) i5});
        IYTReflectListener iYTReflectListener = mReflectListener;
        if (iYTReflectListener == null) {
            YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "On reflection screen change failed:mReflectListener is null");
        } else {
            iYTReflectListener.onReflectEvent(colorMatrixColorFilter, f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        onFinish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "on state changed failed:" + r3.getLocalizedMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x0007, B:18:0x003b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void onStateChanged(int r3) {
        /*
            mState = r3
            java.lang.String r0 = "YoutuLightLiveCheck"
            r1 = 1
            if (r3 != 0) goto L_0x0018
            android.hardware.Camera r3 = mCamera     // Catch:{ Exception -> 0x0016 }
            android.hardware.Camera$Parameters r3 = r3.getParameters()     // Catch:{ Exception -> 0x0016 }
            r3.setAutoWhiteBalanceLock(r1)     // Catch:{ Exception -> 0x0016 }
            android.hardware.Camera r1 = mCamera     // Catch:{ Exception -> 0x0016 }
            r1.setParameters(r3)     // Catch:{ Exception -> 0x0016 }
            goto L_0x0070
        L_0x0016:
            r3 = move-exception
            goto L_0x0058
        L_0x0018:
            if (r3 != r1) goto L_0x0022
            com.tencent.youtu.ytagreflectlivecheck.notice.YTReflectNotice r3 = mReflectNotice     // Catch:{ Exception -> 0x0016 }
            if (r3 == 0) goto L_0x0070
            r3.onDelayCalc()     // Catch:{ Exception -> 0x0016 }
            goto L_0x0070
        L_0x0022:
            r1 = 2
            if (r3 != r1) goto L_0x0070
            android.hardware.Camera r3 = mCamera     // Catch:{ Exception -> 0x003a }
            android.hardware.Camera$Parameters r3 = r3.getParameters()     // Catch:{ Exception -> 0x003a }
            r1 = 0
            r3.setAutoWhiteBalanceLock(r1)     // Catch:{ Exception -> 0x003a }
            android.hardware.Camera r1 = mCamera     // Catch:{ Exception -> 0x003a }
            r1.setParameters(r3)     // Catch:{ Exception -> 0x003a }
        L_0x0034:
            onFinish()     // Catch:{ Exception -> 0x0016 }
            goto L_0x0070
        L_0x0038:
            r3 = move-exception
            goto L_0x0054
        L_0x003a:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            r1.<init>()     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "on finish get param failed:"
            r1.append(r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = r3.getLocalizedMessage()     // Catch:{ all -> 0x0038 }
            r1.append(r3)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0038 }
            com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ all -> 0x0038 }
            goto L_0x0034
        L_0x0054:
            onFinish()     // Catch:{ Exception -> 0x0016 }
            throw r3     // Catch:{ Exception -> 0x0016 }
        L_0x0058:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "on state changed failed:"
            r1.append(r2)
            java.lang.String r3 = r3.getLocalizedMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog((java.lang.String) r0, (java.lang.String) r3)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.onStateChanged(int):void");
    }

    public static void pushImageData(byte[] bArr, int i, int i2, long j, int i3, float[] fArr, float f, float f2, float f3) {
        int i4 = mState;
        if (i4 == 0) {
            int FRGetConfigBegin = YTAGReflectLiveCheckJNIInterface.getInstance().FRGetConfigBegin() - 2;
            int FRGetConfigEnd = YTAGReflectLiveCheckJNIInterface.getInstance().FRGetConfigEnd() + 4;
            int FRGetTriggerTime = YTAGReflectLiveCheckJNIInterface.getInstance().FRGetTriggerTime();
            YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "onPreviewFrameReceived. beginFrame: " + FRGetConfigBegin + " endFrame: " + FRGetConfigEnd + " currentFrame: " + FRGetTriggerTime);
            if (FRGetTriggerTime > FRGetConfigBegin && FRGetTriggerTime < FRGetConfigEnd) {
                System.currentTimeMillis();
                YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "onPreviewFrameReceived. insertYuv and time");
                YTAGReflectLiveCheckJNIInterface.getInstance().FRPushYuv(bArr, i, i2, j, i3, fArr);
                YTAGReflectLiveCheckJNIInterface.getInstance().FRPushCaptureTime(JNIUtils.getTimeval(j));
            }
        } else if (i4 == 1) {
            YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[ReflectController.onPreviewFrameReceived] record ios");
            byte[] bArr2 = bArr;
            int i5 = i;
            int i6 = i2;
            YTAGReflectLiveCheckJNIInterface.getInstance().FRPushISOImgYuv(bArr, i, i2);
            YTAGReflectLiveCheckJNIInterface.getInstance().FRPushISOCaptureTime(JNIUtils.getTimeval(j));
        }
    }

    public static synchronized void releaseModel() {
        synchronized (YTAGReflectLiveCheckInterface.class) {
            try {
                initLock.lock();
                int i = mInitModel - 1;
                mInitModel = i;
                if (i <= 0) {
                    mInitModel = 0;
                    mReflectNotice = null;
                    mReflectListener = null;
                    TimerWorker timerWorker = mGetValueTimer;
                    if (timerWorker != null) {
                        timerWorker.cancel();
                        mGetValueTimer = null;
                    }
                    getLiveStyleResultHandler = null;
                    mCamera = null;
                }
                initLock.unlock();
                YTAGReflectLiveCheckJNIInterface.clearInstance();
            } catch (Throwable th) {
                initLock.unlock();
                throw th;
            }
        }
    }

    public static void setAGSettings(YTAGReflectSettings yTAGReflectSettings) {
        mAGSettings = yTAGReflectSettings;
    }

    public static void setReflectListener(IYTReflectListener iYTReflectListener) {
        mReflectListener = iYTReflectListener;
    }

    public static void setReflectNotice(YTReflectNotice yTReflectNotice) {
        mReflectNotice = yTReflectNotice;
    }

    public static void setSafetyLevel(int i) {
        YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.setSafetyLevel] --- level: " + i);
        mAGSettings.safetylevel = i;
    }

    public static void setupConfig(String str, String str2) {
        if (str == "overlay_alpha") {
            try {
                mOverlayAlpha = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                mOverlayAlpha = 0;
            }
        }
    }

    public static void start(Context context, Camera camera, int i, String str, LightLiveCheckResult lightLiveCheckResult) {
        YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.start] ---");
        if (lightLiveCheckResult == null) {
            YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "On reflection start failed:checkResult is null");
            return;
        }
        mCheckResult = lightLiveCheckResult;
        if (mInitModel <= 0) {
            lightLiveCheckResult.onFailed(2, "Not init model.", "Call YTAGReflectLiveCheckInterface.initModel() before.");
            return;
        }
        mCameraRotatedTag = i;
        mColorSeq = str;
        mCamera = camera;
        long[] jArr = new long[2];
        if (mReflectListener == null) {
            YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "On reflection start failed:mReflectListener is null");
        }
        IYTReflectListener iYTReflectListener = mReflectListener;
        YTAGReflectLiveCheckJNIInterface.getInstance().FRInit(false, str, mAGSettings.safetylevel, jArr, iYTReflectListener != null ? iYTReflectListener.onGetAppBrightness() : -1.0f);
        YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "output duration ms" + jArr[0] + " " + jArr[1]);
        IYTReflectListener iYTReflectListener2 = mReflectListener;
        if (iYTReflectListener2 != null) {
            iYTReflectListener2.onReflectStart(jArr[0]);
        }
    }
}
