package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.quirk.CameraQuirks;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraState;
import androidx.camera.core.ExposureState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.C16533d;
import androidx.camera.core.impl.CamcorderProfileProvider;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C103769x;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class Camera2CameraInfoImpl implements CameraInfoInternal {
    private static final String TAG = "Camera2CameraInfo";
    private final CamcorderProfileProvider mCamera2CamcorderProfileProvider;
    private Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final Camera2CameraInfo mCamera2CameraInfo;
    private List<Pair<CameraCaptureCallback, Executor>> mCameraCaptureCallbacks = null;
    private final CameraCharacteristicsCompat mCameraCharacteristicsCompat;
    private final String mCameraId;
    private final CameraManagerCompat mCameraManager;
    private final Quirks mCameraQuirks;
    private final RedirectableLiveData<CameraState> mCameraStateLiveData;
    private final Object mLock = new Object();
    private RedirectableLiveData<Integer> mRedirectTorchStateLiveData = null;
    private RedirectableLiveData<ZoomState> mRedirectZoomStateLiveData = null;

    public static class RedirectableLiveData<T> extends C103769x<T> {
        private T mInitialValue;
        private LiveData<T> mLiveDataSource;

        public RedirectableLiveData(T t) {
            this.mInitialValue = t;
        }

        public <S> void addSource(LiveData<S> liveData, C0120a0<? super S> a0Var) {
            throw new UnsupportedOperationException();
        }

        public T getValue() {
            LiveData<T> liveData = this.mLiveDataSource;
            return liveData == null ? this.mInitialValue : liveData.getValue();
        }

        public void redirectTo(LiveData<T> liveData) {
            LiveData<T> liveData2 = this.mLiveDataSource;
            if (liveData2 != null) {
                super.removeSource(liveData2);
            }
            this.mLiveDataSource = liveData;
            super.addSource(liveData, new Camera2CameraInfoImpl$RedirectableLiveData$$a(this));
        }
    }

    public Camera2CameraInfoImpl(String str, CameraManagerCompat cameraManagerCompat) {
        str.getClass();
        this.mCameraId = str;
        this.mCameraManager = cameraManagerCompat;
        CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
        this.mCameraCharacteristicsCompat = cameraCharacteristicsCompat;
        this.mCamera2CameraInfo = new Camera2CameraInfo(this);
        this.mCameraQuirks = CameraQuirks.get(str, cameraCharacteristicsCompat);
        this.mCamera2CamcorderProfileProvider = new Camera2CamcorderProfileProvider(str, cameraCharacteristicsCompat);
        this.mCameraStateLiveData = new RedirectableLiveData<>(CameraState.create(CameraState.Type.CLOSED));
    }

    private void logDeviceInfo() {
        logDeviceLevel();
    }

    private void logDeviceLevel() {
        String str;
        int supportedHardwareLevel = getSupportedHardwareLevel();
        if (supportedHardwareLevel == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (supportedHardwareLevel == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (supportedHardwareLevel == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (supportedHardwareLevel == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (supportedHardwareLevel != 4) {
            str = "Unknown value: " + supportedHardwareLevel;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        Logger.m15475i(TAG, "Device Level: " + str);
    }

    public void addSessionCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                if (this.mCameraCaptureCallbacks == null) {
                    this.mCameraCaptureCallbacks = new ArrayList();
                }
                this.mCameraCaptureCallbacks.add(new Pair(cameraCaptureCallback, executor));
                return;
            }
            camera2CameraControlImpl.addSessionCameraCaptureCallback(executor, cameraCaptureCallback);
        }
    }

    public CamcorderProfileProvider getCamcorderProfileProvider() {
        return this.mCamera2CamcorderProfileProvider;
    }

    public Camera2CameraInfo getCamera2CameraInfo() {
        return this.mCamera2CameraInfo;
    }

    public CameraCharacteristicsCompat getCameraCharacteristicsCompat() {
        return this.mCameraCharacteristicsCompat;
    }

    public Map<String, CameraCharacteristics> getCameraCharacteristicsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.mCameraId, this.mCameraCharacteristicsCompat.toCameraCharacteristics());
        for (String next : this.mCameraCharacteristicsCompat.getPhysicalCameraIds()) {
            if (!Objects.equals(next, this.mCameraId)) {
                try {
                    linkedHashMap.put(next, this.mCameraManager.getCameraCharacteristicsCompat(next).toCameraCharacteristics());
                } catch (CameraAccessExceptionCompat e) {
                    Logger.m15474e(TAG, "Failed to get CameraCharacteristics for cameraId " + next, e);
                }
            }
        }
        return linkedHashMap;
    }

    public String getCameraId() {
        return this.mCameraId;
    }

    public Quirks getCameraQuirks() {
        return this.mCameraQuirks;
    }

    public /* synthetic */ CameraSelector getCameraSelector() {
        return C16533d.m15544a(this);
    }

    public LiveData<CameraState> getCameraState() {
        return this.mCameraStateLiveData;
    }

    public ExposureState getExposureState() {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                ExposureState defaultExposureState = ExposureControl.getDefaultExposureState(this.mCameraCharacteristicsCompat);
                return defaultExposureState;
            }
            ExposureState exposureState = camera2CameraControlImpl.getExposureControl().getExposureState();
            return exposureState;
        }
    }

    public String getImplementationType() {
        return getSupportedHardwareLevel() == 2 ? CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY : CameraInfo.IMPLEMENTATION_TYPE_CAMERA2;
    }

    public Integer getLensFacing() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING);
        num.getClass();
        int intValue = num.intValue();
        if (intValue != 0) {
            return intValue != 1 ? null : 1;
        }
        return 0;
    }

    public int getSensorOrientation() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return num.intValue();
    }

    public int getSensorRotationDegrees(int i) {
        Integer valueOf = Integer.valueOf(getSensorOrientation());
        int surfaceRotationToDegrees = CameraOrientationUtil.surfaceRotationToDegrees(i);
        Integer lensFacing = getLensFacing();
        boolean z = true;
        if (lensFacing == null || 1 != lensFacing.intValue()) {
            z = false;
        }
        return CameraOrientationUtil.getRelativeImageRotation(surfaceRotationToDegrees, valueOf.intValue(), z);
    }

    public int getSupportedHardwareLevel() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue();
    }

    public LiveData<Integer> getTorchState() {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                if (this.mRedirectTorchStateLiveData == null) {
                    this.mRedirectTorchStateLiveData = new RedirectableLiveData<>(0);
                }
                RedirectableLiveData<Integer> redirectableLiveData = this.mRedirectTorchStateLiveData;
                return redirectableLiveData;
            }
            RedirectableLiveData<Integer> redirectableLiveData2 = this.mRedirectTorchStateLiveData;
            if (redirectableLiveData2 != null) {
                return redirectableLiveData2;
            }
            LiveData<Integer> torchState = camera2CameraControlImpl.getTorchControl().getTorchState();
            return torchState;
        }
    }

    public LiveData<ZoomState> getZoomState() {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                if (this.mRedirectZoomStateLiveData == null) {
                    this.mRedirectZoomStateLiveData = new RedirectableLiveData<>(ZoomControl.getDefaultZoomState(this.mCameraCharacteristicsCompat));
                }
                RedirectableLiveData<ZoomState> redirectableLiveData = this.mRedirectZoomStateLiveData;
                return redirectableLiveData;
            }
            RedirectableLiveData<ZoomState> redirectableLiveData2 = this.mRedirectZoomStateLiveData;
            if (redirectableLiveData2 != null) {
                return redirectableLiveData2;
            }
            LiveData<ZoomState> zoomState = camera2CameraControlImpl.getZoomControl().getZoomState();
            return zoomState;
        }
    }

    public boolean hasFlashUnit() {
        return FlashAvailabilityChecker.isFlashAvailable(this.mCameraCharacteristicsCompat);
    }

    public boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction) {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                return false;
            }
            boolean isFocusMeteringSupported = camera2CameraControlImpl.getFocusMeteringControl().isFocusMeteringSupported(focusMeteringAction);
            return isFocusMeteringSupported;
        }
    }

    public boolean isPrivateReprocessingSupported() {
        return ZslUtil.isCapabilitySupported(this.mCameraCharacteristicsCompat, 4);
    }

    public boolean isYuvReprocessingSupported() {
        return ZslUtil.isCapabilitySupported(this.mCameraCharacteristicsCompat, 7);
    }

    public void linkWithCameraControl(Camera2CameraControlImpl camera2CameraControlImpl) {
        synchronized (this.mLock) {
            this.mCamera2CameraControlImpl = camera2CameraControlImpl;
            RedirectableLiveData<ZoomState> redirectableLiveData = this.mRedirectZoomStateLiveData;
            if (redirectableLiveData != null) {
                redirectableLiveData.redirectTo(camera2CameraControlImpl.getZoomControl().getZoomState());
            }
            RedirectableLiveData<Integer> redirectableLiveData2 = this.mRedirectTorchStateLiveData;
            if (redirectableLiveData2 != null) {
                redirectableLiveData2.redirectTo(this.mCamera2CameraControlImpl.getTorchControl().getTorchState());
            }
            List<Pair<CameraCaptureCallback, Executor>> list = this.mCameraCaptureCallbacks;
            if (list != null) {
                for (Pair next : list) {
                    this.mCamera2CameraControlImpl.addSessionCameraCaptureCallback((Executor) next.second, (CameraCaptureCallback) next.first);
                }
                this.mCameraCaptureCallbacks = null;
            }
        }
        logDeviceInfo();
    }

    public void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.mLock) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                List<Pair<CameraCaptureCallback, Executor>> list = this.mCameraCaptureCallbacks;
                if (list != null) {
                    Iterator<Pair<CameraCaptureCallback, Executor>> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().first == cameraCaptureCallback) {
                            it.remove();
                        }
                    }
                    return;
                }
                return;
            }
            camera2CameraControlImpl.removeSessionCameraCaptureCallback(cameraCaptureCallback);
        }
    }

    public void setCameraStateSource(LiveData<CameraState> liveData) {
        this.mCameraStateLiveData.redirectTo(liveData);
    }

    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
