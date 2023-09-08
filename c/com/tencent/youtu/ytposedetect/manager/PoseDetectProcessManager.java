package com.tencent.youtu.ytposedetect.manager;

import android.content.Context;
import android.hardware.Camera;
import com.tencent.youtu.ytcommon.tools.YTCameraSetting;
import com.tencent.youtu.ytcommon.tools.YTException;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;

public class PoseDetectProcessManager {
    private static final String TAG = "FaceDetectProcess";
    private Camera mCamera = null;
    private Camera.Parameters mCameraParameters = null;
    public int mCameraRotate;
    public int mDesiredPreviewHeight = 480;
    public int mDesiredPreviewWidth = 640;
    public boolean mIsDetecting = false;

    private int setCamera(Context context, Camera camera, int i) {
        this.mCamera = camera;
        int i2 = 3;
        int i3 = 0;
        while (i2 > 0) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                this.mCameraParameters = parameters;
                this.mDesiredPreviewHeight = parameters.getPreviewSize().height;
                this.mDesiredPreviewWidth = this.mCameraParameters.getPreviewSize().width;
                YTPoseDetectJNIInterface.nativeLog(TAG, "[PoseDetectProcessManager.setCamera] mDesiredPreviewWidth: " + this.mDesiredPreviewWidth + " mDesiredPreviewHeight: " + this.mDesiredPreviewHeight);
                i2 = 0;
            } catch (Exception e) {
                YTPoseDetectJNIInterface.nativeLog(TAG, "[PoseDetectProcessManager.setCamera] failed:" + e + " retry " + i2);
                i2 += -1;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e2) {
                    YTPoseDetectJNIInterface.nativeLog(TAG, "[PoseDetectProcessManager.setCamera] sleep failed:" + e2);
                }
                if (i2 == 0) {
                    i3 = 3;
                }
            }
        }
        return i3;
    }

    public void clearAll() {
        restoreCamera();
    }

    public void finalize() {
        super.finalize();
    }

    public void initAll() {
    }

    public int poseDetect(float[] fArr, float[] fArr2, int i, byte[] bArr, float f, float f2, float f3, int i2) {
        return YTPoseDetectJNIInterface.poseDetect(fArr, fArr2, i, bArr, this.mDesiredPreviewWidth, this.mDesiredPreviewHeight, YTCameraSetting.getRotateTag(this.mCameraRotate, 1), f, f2, f3, i2);
    }

    public void restoreCamera() {
        Camera.Parameters parameters;
        Camera camera = this.mCamera;
        if (camera != null && (parameters = this.mCameraParameters) != null) {
            try {
                camera.setParameters(parameters);
            } catch (Exception e) {
                YTPoseDetectJNIInterface.nativeLog(TAG, "restoreCamera failed. ");
                YTException.report(e);
            } catch (Throwable th) {
                this.mCamera = null;
                this.mCameraParameters = null;
                throw th;
            }
            this.mCamera = null;
            this.mCameraParameters = null;
        }
    }

    public void start(Context context, Camera camera, int i, YTPoseDetectInterface.PoseDetectResult poseDetectResult) {
        if (this.mIsDetecting) {
            YTPoseDetectJNIInterface.nativeLog(TAG, "Restart FaceDetect process. YTPoseDetectInterface.stop() should be called before the next start, or maybe camera's parameter may be setting wrong.");
        }
        int camera2 = setCamera(context, camera, i);
        if (camera2 != 0) {
            poseDetectResult.onFailed(camera2, "set camera failed", "reset again");
            return;
        }
        this.mCameraRotate = YTCameraSetting.getVideoRotate(context, i);
        this.mIsDetecting = true;
        poseDetectResult.onSuccess();
    }

    public void stop() {
        if (this.mIsDetecting) {
            this.mIsDetecting = false;
            restoreCamera();
            YTPoseDetectJNIInterface.resetDetect();
        }
    }
}
