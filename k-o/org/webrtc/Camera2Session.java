package org.webrtc;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.IXWebBroadcastListener;
import j20.C117292a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k20.C9556a;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;

class Camera2Session implements CameraSession {
    private static final String TAG = "Camera2Session";
    private static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    /* access modifiers changed from: private */
    public static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, 10000, 50);
    private final Context applicationContext;
    /* access modifiers changed from: private */
    public final CameraSession.CreateSessionCallback callback;
    /* access modifiers changed from: private */
    public CameraCharacteristics cameraCharacteristics;
    /* access modifiers changed from: private */
    public CameraDevice cameraDevice;
    private final String cameraId;
    private final CameraManager cameraManager;
    /* access modifiers changed from: private */
    public int cameraOrientation;
    /* access modifiers changed from: private */
    public final Handler cameraThreadHandler;
    /* access modifiers changed from: private */
    public CameraEnumerationAndroid.CaptureFormat captureFormat;
    /* access modifiers changed from: private */
    public CameraCaptureSession captureSession;
    /* access modifiers changed from: private */
    public final long constructionTimeNs;
    /* access modifiers changed from: private */
    public final CameraSession.Events events;
    /* access modifiers changed from: private */
    public boolean firstFrameReported;
    /* access modifiers changed from: private */
    public int fpsUnitFactor;
    private final int framerate;
    private final int height;
    /* access modifiers changed from: private */
    public boolean isCameraFrontFacing;
    /* access modifiers changed from: private */
    public SessionState state = SessionState.RUNNING;
    /* access modifiers changed from: private */
    public Surface surface;
    /* access modifiers changed from: private */
    public final SurfaceTextureHelper surfaceTextureHelper;
    private final int width;

    public static class CameraCaptureCallback extends CameraCaptureSession.CaptureCallback {
        private CameraCaptureCallback() {
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            Logging.m25022d(Camera2Session.TAG, "Capture failed: " + captureFailure);
        }
    }

    public class CameraStateCallback extends CameraDevice.StateCallback {
        private CameraStateCallback() {
        }

        private String getErrorDescription(int i) {
            if (i == 1) {
                return "Camera device is in use already.";
            }
            if (i == 2) {
                return "Camera device could not be opened because there are too many other open camera devices.";
            }
            if (i == 3) {
                return "Camera device could not be opened due to a device policy.";
            }
            if (i == 4) {
                return "Camera device has encountered a fatal error.";
            }
            if (i == 5) {
                return "Camera service has encountered a fatal error.";
            }
            return "Unknown camera error: " + i;
        }

        public void onClosed(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.m25022d(Camera2Session.TAG, "Camera device closed.");
            Camera2Session.this.events.onCameraClosed(Camera2Session.this);
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            boolean z = Camera2Session.this.captureSession == null && Camera2Session.this.state != SessionState.STOPPED;
            SessionState unused = Camera2Session.this.state = SessionState.STOPPED;
            Camera2Session.this.stopInternal();
            if (z) {
                Camera2Session.this.callback.onFailure(CameraSession.FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                Camera2Session.this.events.onCameraDisconnected(Camera2Session.this);
            }
        }

        public void onError(CameraDevice cameraDevice, int i) {
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.this.reportError(getErrorDescription(i));
        }

        public void onOpened(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.m25022d(Camera2Session.TAG, "Camera opened.");
            CameraDevice unused = Camera2Session.this.cameraDevice = cameraDevice;
            Camera2Session.this.surfaceTextureHelper.setTextureSize(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height);
            Surface unused2 = Camera2Session.this.surface = new Surface(Camera2Session.this.surfaceTextureHelper.getSurfaceTexture());
            try {
                cameraDevice.createCaptureSession(Arrays.asList(new Surface[]{Camera2Session.this.surface}), new CaptureSessionCallback(), Camera2Session.this.cameraThreadHandler);
            } catch (CameraAccessException e) {
                Camera2Session camera2Session = Camera2Session.this;
                camera2Session.reportError("Failed to create capture session. " + e);
            }
        }
    }

    public class CaptureSessionCallback extends CameraCaptureSession.StateCallback {
        private CaptureSessionCallback() {
        }

        private void chooseFocusMode(CaptureRequest.Builder builder) {
            for (int i : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) {
                if (i == 3) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    Logging.m25022d(Camera2Session.TAG, "Using continuous video auto-focus.");
                    return;
                }
            }
            Logging.m25022d(Camera2Session.TAG, "Auto-focus is not available.");
        }

        private void chooseStabilizationMode(CaptureRequest.Builder builder) {
            int[] iArr = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        Logging.m25022d(Camera2Session.TAG, "Using optical stabilization.");
                        return;
                    }
                }
            }
            int[] iArr2 = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            if (iArr2 != null) {
                for (int i2 : iArr2) {
                    if (i2 == 1) {
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                        Logging.m25022d(Camera2Session.TAG, "Using video stabilization.");
                        return;
                    }
                }
            }
            Logging.m25022d(Camera2Session.TAG, "Stabilization not available.");
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigured$0(VideoFrame videoFrame) {
            Camera2Session.this.checkIsOnCameraThread();
            if (Camera2Session.this.state != SessionState.RUNNING) {
                Logging.m25022d(Camera2Session.TAG, "Texture frame captured but camera is no longer running.");
                return;
            }
            if (!Camera2Session.this.firstFrameReported) {
                boolean unused = Camera2Session.this.firstFrameReported = true;
                Camera2Session.camera2StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera2Session.this.constructionTimeNs));
            }
            VideoFrame videoFrame2 = new VideoFrame(C21868a.m25059a((TextureBufferImpl) videoFrame.getBuffer(), Camera2Session.this.isCameraFrontFacing, -Camera2Session.this.cameraOrientation), Camera2Session.this.getFrameOrientation(), videoFrame.getTimestampNs());
            Camera2Session.this.events.onFrameCaptured(Camera2Session.this, videoFrame2);
            videoFrame2.release();
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            cameraCaptureSession.close();
            Camera2Session.this.reportError("Failed to configure capture session.");
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.m25022d(Camera2Session.TAG, "Camera capture session configured.");
            CameraCaptureSession unused = Camera2Session.this.captureSession = cameraCaptureSession;
            try {
                CaptureRequest.Builder createCaptureRequest = Camera2Session.this.cameraDevice.createCaptureRequest(3);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(Camera2Session.this.captureFormat.framerate.min / Camera2Session.this.fpsUnitFactor), Integer.valueOf(Camera2Session.this.captureFormat.framerate.max / Camera2Session.this.fpsUnitFactor)));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                chooseStabilizationMode(createCaptureRequest);
                chooseFocusMode(createCaptureRequest);
                createCaptureRequest.addTarget(Camera2Session.this.surface);
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), new CameraCaptureCallback(), Camera2Session.this.cameraThreadHandler);
                Camera2Session.this.surfaceTextureHelper.startListening(new Camera2Session$CaptureSessionCallback$$a(this));
                Logging.m25022d(Camera2Session.TAG, "Camera device successfully started.");
                Camera2Session.this.callback.onDone(Camera2Session.this);
            } catch (CameraAccessException e) {
                Camera2Session camera2Session = Camera2Session.this;
                camera2Session.reportError("Failed to start capture request. " + e);
            }
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera2Session(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events2, Context context, CameraManager cameraManager2, SurfaceTextureHelper surfaceTextureHelper2, String str, int i, int i2, int i3) {
        Logging.m25022d(TAG, "Create new camera2 session on camera " + str);
        this.constructionTimeNs = System.nanoTime();
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events2;
        this.applicationContext = context;
        this.cameraManager = cameraManager2;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.cameraId = str;
        this.width = i;
        this.height = i2;
        this.framerate = i3;
        start();
    }

    /* access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events2, Context context, CameraManager cameraManager2, SurfaceTextureHelper surfaceTextureHelper2, String str, int i, int i2, int i3) {
        new Camera2Session(createSessionCallback, events2, context, cameraManager2, surfaceTextureHelper2, str, i, i2, i3);
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread();
        Range[] rangeArr = (Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor2 = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor2;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor2);
        List<Size> supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        Logging.m25022d(TAG, "Available preview sizes: " + supportedSizes);
        Logging.m25022d(TAG, "Available fps ranges: " + convertFramerates);
        if (convertFramerates.isEmpty() || supportedSizes.isEmpty()) {
            reportError("No supported capture formats.");
            return;
        }
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, this.framerate);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
        CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
        this.captureFormat = new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
        Logging.m25022d(TAG, "Using capture format: " + this.captureFormat);
    }

    /* access modifiers changed from: private */
    public int getFrameOrientation() {
        int b = C21868a.m25060b(this.applicationContext);
        if (!this.isCameraFrontFacing) {
            b = 360 - b;
        }
        return (this.cameraOrientation + b) % v2helper.VOIP_ENC_HEIGHT_LV1;
    }

    private void openCamera() {
        checkIsOnCameraThread();
        Logging.m25022d(TAG, "Opening camera " + this.cameraId);
        this.events.onCameraOpening();
        try {
            CameraManager cameraManager2 = this.cameraManager;
            String str = this.cameraId;
            CameraStateCallback cameraStateCallback = new CameraStateCallback();
            Handler handler = this.cameraThreadHandler;
            C9556a aVar = new C9556a();
            aVar.mo10233c(handler);
            aVar.mo10233c(cameraStateCallback);
            aVar.mo10233c(str);
            C117292a.m165364j(cameraManager2, aVar.mo10232b(), "org/webrtc/Camera2Session", "openCamera", "()V", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
        } catch (CameraAccessException | IllegalArgumentException e) {
            reportError("Failed to open camera: " + e);
        }
    }

    /* access modifiers changed from: private */
    public void reportError(String str) {
        checkIsOnCameraThread();
        Logging.m25023e(TAG, "Error: " + str);
        boolean z = this.captureSession == null && this.state != SessionState.STOPPED;
        this.state = SessionState.STOPPED;
        stopInternal();
        if (z) {
            this.callback.onFailure(CameraSession.FailureType.ERROR, str);
        } else {
            this.events.onCameraError(this, str);
        }
    }

    private void start() {
        checkIsOnCameraThread();
        Logging.m25022d(TAG, IXWebBroadcastListener.STAGE_START);
        try {
            CameraCharacteristics cameraCharacteristics2 = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraCharacteristics = cameraCharacteristics2;
            this.cameraOrientation = ((Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.isCameraFrontFacing = ((Integer) this.cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
            findCaptureFormat();
            if (this.captureFormat != null) {
                openCamera();
            }
        } catch (CameraAccessException | IllegalArgumentException e) {
            reportError("getCameraCharacteristics(): " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void stopInternal() {
        Logging.m25022d(TAG, "Stop internal");
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        Surface surface2 = this.surface;
        if (surface2 != null) {
            surface2.release();
            this.surface = null;
        }
        CameraDevice cameraDevice2 = this.cameraDevice;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
            this.cameraDevice = null;
        }
        Logging.m25022d(TAG, "Stop done");
    }

    public void stop() {
        Logging.m25022d(TAG, "Stop camera2 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long nanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }
}
