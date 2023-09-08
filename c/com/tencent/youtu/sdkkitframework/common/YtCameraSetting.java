package com.tencent.youtu.sdkkitframework.common;

import android.content.Context;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.text.TextUtils;
import android.view.WindowManager;
import com.tencent.wxmm.v2helper;
import java.util.Iterator;
import java.util.List;

public class YtCameraSetting {
    private static final String TAG = "YtCameraSetting";
    public static int mCameraFacing = 1;
    public static int mDesiredPreviewHeight = 480;
    public static int mDesiredPreviewWidth = 640;
    public static int mRotate;

    private static int chooseFixedPreviewFps(Camera.Parameters parameters, int i) {
        int parseInt;
        Iterator<int[]> it = parameters.getSupportedPreviewFpsRange().iterator();
        while (true) {
            if (it.hasNext()) {
                int[] next = it.next();
                YtLogger.m106580i(TAG, "entry: " + next[0] + " - " + next[1]);
                int i2 = next[0];
                int i3 = next[1];
                if (i2 == i3 && i2 == i) {
                    parameters.setPreviewFpsRange(i2, i3);
                    YtLogger.m106580i(TAG, "use preview fps range: " + next[0] + " " + next[1]);
                    return next[0];
                }
            } else {
                int[] iArr = new int[2];
                parameters.getPreviewFpsRange(iArr);
                int i4 = iArr[0];
                int i5 = iArr[1];
                if (i4 != i5) {
                    if (i > i5) {
                        i = i5;
                    }
                    if (i >= i4) {
                        i4 = i;
                    }
                }
                String str = parameters.get("preview-frame-rate-values");
                if (!TextUtils.isEmpty(str)) {
                    if (!str.contains("" + (i4 / 1000))) {
                        String[] split = str.split(",");
                        for (String parseInt2 : split) {
                            int parseInt3 = Integer.parseInt(parseInt2) * 1000;
                            if (i4 < parseInt3) {
                                parameters.setPreviewFrameRate(parseInt3 / 1000);
                                return parseInt3;
                            }
                        }
                        if (split.length > 0 && i4 > (parseInt = Integer.parseInt(split[split.length - 1]) * 1000)) {
                            i4 = parseInt;
                        }
                    }
                }
                parameters.setPreviewFrameRate(i4 / 1000);
                return i4;
            }
        }
    }

    public static int getDesiredPreviewHeight() {
        return mDesiredPreviewHeight;
    }

    public static int getDesiredPreviewWidth() {
        return mDesiredPreviewWidth;
    }

    private static Camera.Size getOptimalPreviewSize(List<Camera.Size> list, int i, int i2) {
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        double d = ((double) max) / ((double) min);
        YtLogger.m106580i(TAG, "sizes size=" + list.size());
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        for (Camera.Size next : list) {
            if (Math.abs((((double) next.width) / ((double) next.height)) - d) <= 0.001d && ((double) Math.abs(next.height - min)) < d3) {
                d3 = (double) Math.abs(next.height - min);
                size = next;
            }
        }
        if (size == null) {
            YtLogger.m106580i(TAG, "No preview size match the aspect ratio");
            for (Camera.Size next2 : list) {
                if (((double) Math.abs(next2.height - min)) < d2) {
                    d2 = (double) Math.abs(next2.height - min);
                    size = next2;
                }
            }
        }
        return size;
    }

    public static int getRotate(Context context, int i, int i2) {
        return getRotateTag(getVideoRotate(context, i), i2);
    }

    public static int getRotateTag(int i, int i2) {
        int i3;
        if (i == 90) {
            i3 = 7;
        } else if (i == 180) {
            i3 = 3;
        } else if (i == 270) {
            i3 = 5;
        } else {
            YtLogger.m106580i(TAG, "camera rotate not 90degree or 180degree, input: " + i);
            i3 = 1;
        }
        return i2 == 1 ? i3 : transBackFacingCameraRatateTag(i3);
    }

    public static int getVideoRotate(Context context, int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        int i3 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i2) % v2helper.VOIP_ENC_HEIGHT_LV1)) % v2helper.VOIP_ENC_HEIGHT_LV1 : ((cameraInfo.orientation - i2) + v2helper.VOIP_ENC_HEIGHT_LV1) % v2helper.VOIP_ENC_HEIGHT_LV1;
        YtLogger.m106580i(TAG, "debug camera orientation is " + cameraInfo.orientation + " ui degrees is " + i2);
        return i3;
    }

    public static int initCamera(Context context, Camera camera, int i) {
        initCamera(context, camera, i, 4);
        return 0;
    }

    public static void setCameraFacing(int i) {
        mCameraFacing = i;
    }

    public static void setCameraRotate(int i) {
        mRotate = i;
    }

    public static void setVideoSize(Camera.Parameters parameters, CamcorderProfile camcorderProfile) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (parameters.getSupportedVideoSizes() == null) {
            YtLogger.m106580i(TAG, "video size from profile is : " + camcorderProfile.videoFrameWidth + " " + camcorderProfile.videoFrameHeight);
            if (getOptimalPreviewSize(supportedPreviewSizes, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) == null) {
                YtLogger.m106580i(TAG, "do not find proper preview size, use default");
                camcorderProfile.videoFrameWidth = 640;
                camcorderProfile.videoFrameHeight = 480;
            }
        }
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            boolean z = false;
            for (int i = 0; i < supportedVideoSizes.size(); i++) {
                Camera.Size size = supportedVideoSizes.get(i);
                if (size.width == camcorderProfile.videoFrameWidth && size.height == camcorderProfile.videoFrameHeight) {
                    z = true;
                }
            }
            if (!z) {
                camcorderProfile.videoFrameWidth = 640;
                camcorderProfile.videoFrameHeight = 480;
            }
        }
        YtLogger.m106580i(TAG, "select video size camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
    }

    public static int transBackFacingCameraRatateTag(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 8;
        }
        if (i == 6) {
            return 7;
        }
        if (i == 7) {
            return 6;
        }
        if (i == 8) {
            return 5;
        }
        YtLogger.m106582w(TAG, "[YtCameraSetting.transBackFacingCameraRatateTag] unsurported rotateTag: " + i);
        return 0;
    }

    public static int initCamera(Context context, Camera camera, int i, int i2) {
        CamcorderProfile camcorderProfile;
        try {
            Camera.Parameters parameters = camera.getParameters();
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            for (int i3 = 0; i3 < supportedFocusModes.size(); i3++) {
                YtLogger.m106580i(TAG, "suporrtedFocusModes " + i3 + " :" + supportedFocusModes.get(i3));
            }
            if (supportedFocusModes.indexOf("continuous-video") >= 0) {
                parameters.setFocusMode("continuous-video");
                YtLogger.m106580i(TAG, "set camera focus mode continuous video");
            } else if (supportedFocusModes.indexOf("auto") >= 0) {
                parameters.setFocusMode("auto");
                YtLogger.m106580i(TAG, "set camera focus mode auto");
            } else {
                YtLogger.m106580i(TAG, "NOT set camera focus mode");
            }
            try {
                camera.setParameters(parameters);
            } catch (Exception e) {
                YtLogger.m106579e(TAG, "Camera.setParameters.setPreviewSize failed!!: " + e.getLocalizedMessage());
            } catch (Throwable th) {
                camera.getParameters();
                throw th;
            }
            Camera.Parameters parameters2 = camera.getParameters();
            int videoRotate = getVideoRotate(context, i);
            camera.setDisplayOrientation(videoRotate);
            YtLogger.m106580i(TAG, "videoOrietation is" + videoRotate);
            if (CamcorderProfile.hasProfile(i, i2)) {
                camcorderProfile = CamcorderProfile.get(i, i2);
                YtLogger.m106580i(TAG, "custom camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
            } else if (CamcorderProfile.hasProfile(i, 4)) {
                camcorderProfile = CamcorderProfile.get(i, 4);
                YtLogger.m106580i(TAG, "480P camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
            } else if (CamcorderProfile.hasProfile(i, 5)) {
                camcorderProfile = CamcorderProfile.get(i, 5);
                YtLogger.m106580i(TAG, "720P camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
            } else {
                camcorderProfile = CamcorderProfile.get(i, 1);
                YtLogger.m106580i(TAG, "High camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
            }
            List<Camera.Size> supportedPictureSizes = camera.getParameters().getSupportedPictureSizes();
            List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
            for (int i4 = 0; i4 < supportedPictureSizes.size(); i4++) {
                Camera.Size size = supportedPictureSizes.get(i4);
                YtLogger.m106580i("pictureSize", size.width + " x " + size.height);
            }
            for (int i5 = 0; i5 < supportedPreviewSizes.size(); i5++) {
                Camera.Size size2 = supportedPreviewSizes.get(i5);
                YtLogger.m106580i("previewSize", size2.width + " x " + size2.height);
            }
            setVideoSize(parameters2, camcorderProfile);
            YtLogger.m106580i(TAG, "mDesiredPreviewWidth: " + mDesiredPreviewWidth + ", mDesiredPreviewHeight: " + mDesiredPreviewHeight);
            parameters2.setPreviewSize(mDesiredPreviewWidth, mDesiredPreviewHeight);
            parameters2.setPreviewFormat(17);
            try {
                camera.setParameters(parameters2);
            } catch (Exception e2) {
                YtLogger.m106579e(TAG, "Camera.setParameters.setPreviewSize failed!!: " + e2.getLocalizedMessage());
            }
            Camera.Parameters parameters3 = camera.getParameters();
            int chooseFixedPreviewFps = chooseFixedPreviewFps(parameters3, 30000);
            YtLogger.m106580i(TAG, "choose camera fps is : " + chooseFixedPreviewFps);
            try {
                camera.setParameters(parameters3);
            } catch (Exception e3) {
                YtLogger.m106579e(TAG, "Camera.setParameters.preview fps failed!!: " + e3.getLocalizedMessage());
            }
            Camera.Parameters parameters4 = camera.getParameters();
            int[] iArr = new int[2];
            parameters4.getPreviewFpsRange(iArr);
            int previewFrameRate = parameters4.getPreviewFrameRate();
            YtLogger.m106580i(TAG, "after set parameters getPreviewFpsRange=" + iArr[0] + "-" + iArr[1] + " ;after set parameter fps=" + previewFrameRate);
            Camera.Size previewSize = parameters4.getPreviewSize();
            StringBuilder sb = new StringBuilder();
            sb.append("camera preview size is ");
            sb.append(previewSize.width);
            sb.append(" ");
            sb.append(previewSize.height);
            YtLogger.m106580i(TAG, sb.toString());
            return 0;
        } catch (Exception unused) {
            YtLogger.m106579e(TAG, "get camera parameters failed. 1. Check Camera.getParameters() interface. 2. Get logs for more detail.");
            return 1;
        }
    }
}
