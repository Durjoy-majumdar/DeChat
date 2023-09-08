package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.internal.compat.workaround.SurfaceSorter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class SessionConfig {
    private final List<CameraDevice.StateCallback> mDeviceStateCallbacks;
    private final List<ErrorListener> mErrorListeners;
    private InputConfiguration mInputConfiguration;
    private final CaptureConfig mRepeatingCaptureConfig;
    private final List<CameraCaptureSession.StateCallback> mSessionStateCallbacks;
    private final List<CameraCaptureCallback> mSingleCameraCaptureCallbacks;
    private final List<DeferrableSurface> mSurfaces;

    public static class BaseBuilder {
        public final CaptureConfig.Builder mCaptureConfigBuilder = new CaptureConfig.Builder();
        public final List<CameraDevice.StateCallback> mDeviceStateCallbacks = new ArrayList();
        public final List<ErrorListener> mErrorListeners = new ArrayList();
        public InputConfiguration mInputConfiguration;
        public final List<CameraCaptureSession.StateCallback> mSessionStateCallbacks = new ArrayList();
        public final List<CameraCaptureCallback> mSingleCameraCaptureCallbacks = new ArrayList();
        public final Set<DeferrableSurface> mSurfaces = new LinkedHashSet();
    }

    public static class Builder extends BaseBuilder {
        public static Builder createFrom(UseCaseConfig<?> useCaseConfig) {
            OptionUnpacker sessionOptionUnpacker = useCaseConfig.getSessionOptionUnpacker((OptionUnpacker) null);
            if (sessionOptionUnpacker != null) {
                Builder builder = new Builder();
                sessionOptionUnpacker.unpack(useCaseConfig, builder);
                return builder;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + useCaseConfig.getTargetName(useCaseConfig.toString()));
        }

        public void addAllCameraCaptureCallbacks(Collection<CameraCaptureCallback> collection) {
            for (CameraCaptureCallback next : collection) {
                this.mCaptureConfigBuilder.addCameraCaptureCallback(next);
                if (!this.mSingleCameraCaptureCallbacks.contains(next)) {
                    this.mSingleCameraCaptureCallbacks.add(next);
                }
            }
        }

        public void addAllDeviceStateCallbacks(Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback addDeviceStateCallback : collection) {
                addDeviceStateCallback(addDeviceStateCallback);
            }
        }

        public void addAllRepeatingCameraCaptureCallbacks(Collection<CameraCaptureCallback> collection) {
            this.mCaptureConfigBuilder.addAllCameraCaptureCallbacks(collection);
        }

        public void addAllSessionStateCallbacks(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback addSessionStateCallback : list) {
                addSessionStateCallback(addSessionStateCallback);
            }
        }

        public void addCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mCaptureConfigBuilder.addCameraCaptureCallback(cameraCaptureCallback);
            if (!this.mSingleCameraCaptureCallbacks.contains(cameraCaptureCallback)) {
                this.mSingleCameraCaptureCallbacks.add(cameraCaptureCallback);
            }
        }

        public void addDeviceStateCallback(CameraDevice.StateCallback stateCallback) {
            if (!this.mDeviceStateCallbacks.contains(stateCallback)) {
                this.mDeviceStateCallbacks.add(stateCallback);
            }
        }

        public void addErrorListener(ErrorListener errorListener) {
            this.mErrorListeners.add(errorListener);
        }

        public void addImplementationOptions(Config config) {
            this.mCaptureConfigBuilder.addImplementationOptions(config);
        }

        public void addNonRepeatingSurface(DeferrableSurface deferrableSurface) {
            this.mSurfaces.add(deferrableSurface);
        }

        public void addRepeatingCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mCaptureConfigBuilder.addCameraCaptureCallback(cameraCaptureCallback);
        }

        public void addSessionStateCallback(CameraCaptureSession.StateCallback stateCallback) {
            if (!this.mSessionStateCallbacks.contains(stateCallback)) {
                this.mSessionStateCallbacks.add(stateCallback);
            }
        }

        public void addSurface(DeferrableSurface deferrableSurface) {
            this.mSurfaces.add(deferrableSurface);
            this.mCaptureConfigBuilder.addSurface(deferrableSurface);
        }

        public void addTag(String str, Object obj) {
            this.mCaptureConfigBuilder.addTag(str, obj);
        }

        public SessionConfig build() {
            return new SessionConfig(new ArrayList(this.mSurfaces), this.mDeviceStateCallbacks, this.mSessionStateCallbacks, this.mSingleCameraCaptureCallbacks, this.mErrorListeners, this.mCaptureConfigBuilder.build(), this.mInputConfiguration);
        }

        public void clearSurfaces() {
            this.mSurfaces.clear();
            this.mCaptureConfigBuilder.clearSurfaces();
        }

        public List<CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
            return Collections.unmodifiableList(this.mSingleCameraCaptureCallbacks);
        }

        public boolean removeCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            return this.mCaptureConfigBuilder.removeCameraCaptureCallback(cameraCaptureCallback) || this.mSingleCameraCaptureCallbacks.remove(cameraCaptureCallback);
        }

        public void removeSurface(DeferrableSurface deferrableSurface) {
            this.mSurfaces.remove(deferrableSurface);
            this.mCaptureConfigBuilder.removeSurface(deferrableSurface);
        }

        public void setImplementationOptions(Config config) {
            this.mCaptureConfigBuilder.setImplementationOptions(config);
        }

        public void setInputConfiguration(InputConfiguration inputConfiguration) {
            this.mInputConfiguration = inputConfiguration;
        }

        public void setTemplateType(int i) {
            this.mCaptureConfigBuilder.setTemplateType(i);
        }
    }

    public interface ErrorListener {
        void onError(SessionConfig sessionConfig, SessionError sessionError);
    }

    public interface OptionUnpacker {
        void unpack(UseCaseConfig<?> useCaseConfig, Builder builder);
    }

    public enum SessionError {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class ValidatingBuilder extends BaseBuilder {
        private static final List<Integer> SUPPORTED_TEMPLATE_PRIORITY = Arrays.asList(new Integer[]{1, 3});
        private static final String TAG = "ValidatingBuilder";
        private final SurfaceSorter mSurfaceSorter = new SurfaceSorter();
        private boolean mTemplateSet = false;
        private boolean mValid = true;

        private int selectTemplateType(int i, int i2) {
            List<Integer> list = SUPPORTED_TEMPLATE_PRIORITY;
            return list.indexOf(Integer.valueOf(i)) >= list.indexOf(Integer.valueOf(i2)) ? i : i2;
        }

        public void add(SessionConfig sessionConfig) {
            CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getTemplateType() != -1) {
                this.mTemplateSet = true;
                this.mCaptureConfigBuilder.setTemplateType(selectTemplateType(repeatingCaptureConfig.getTemplateType(), this.mCaptureConfigBuilder.getTemplateType()));
            }
            this.mCaptureConfigBuilder.addAllTags(sessionConfig.getRepeatingCaptureConfig().getTagBundle());
            this.mDeviceStateCallbacks.addAll(sessionConfig.getDeviceStateCallbacks());
            this.mSessionStateCallbacks.addAll(sessionConfig.getSessionStateCallbacks());
            this.mCaptureConfigBuilder.addAllCameraCaptureCallbacks(sessionConfig.getRepeatingCameraCaptureCallbacks());
            this.mSingleCameraCaptureCallbacks.addAll(sessionConfig.getSingleCameraCaptureCallbacks());
            this.mErrorListeners.addAll(sessionConfig.getErrorListeners());
            if (sessionConfig.getInputConfiguration() != null) {
                this.mInputConfiguration = sessionConfig.getInputConfiguration();
            }
            this.mSurfaces.addAll(sessionConfig.getSurfaces());
            this.mCaptureConfigBuilder.getSurfaces().addAll(repeatingCaptureConfig.getSurfaces());
            if (!this.mSurfaces.containsAll(this.mCaptureConfigBuilder.getSurfaces())) {
                Logger.m15471d(TAG, "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.mValid = false;
            }
            this.mCaptureConfigBuilder.addImplementationOptions(repeatingCaptureConfig.getImplementationOptions());
        }

        public SessionConfig build() {
            if (this.mValid) {
                ArrayList arrayList = new ArrayList(this.mSurfaces);
                this.mSurfaceSorter.sort(arrayList);
                return new SessionConfig(arrayList, this.mDeviceStateCallbacks, this.mSessionStateCallbacks, this.mSingleCameraCaptureCallbacks, this.mErrorListeners, this.mCaptureConfigBuilder.build(), this.mInputConfiguration);
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        public void clearSurfaces() {
            this.mSurfaces.clear();
            this.mCaptureConfigBuilder.clearSurfaces();
        }

        public boolean isValid() {
            return this.mTemplateSet && this.mValid;
        }
    }

    public SessionConfig(List<DeferrableSurface> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<CameraCaptureCallback> list4, List<ErrorListener> list5, CaptureConfig captureConfig, InputConfiguration inputConfiguration) {
        this.mSurfaces = list;
        this.mDeviceStateCallbacks = Collections.unmodifiableList(list2);
        this.mSessionStateCallbacks = Collections.unmodifiableList(list3);
        this.mSingleCameraCaptureCallbacks = Collections.unmodifiableList(list4);
        this.mErrorListeners = Collections.unmodifiableList(list5);
        this.mRepeatingCaptureConfig = captureConfig;
        this.mInputConfiguration = inputConfiguration;
    }

    public static SessionConfig defaultEmptySessionConfig() {
        return new SessionConfig(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new CaptureConfig.Builder().build(), (InputConfiguration) null);
    }

    public List<CameraDevice.StateCallback> getDeviceStateCallbacks() {
        return this.mDeviceStateCallbacks;
    }

    public List<ErrorListener> getErrorListeners() {
        return this.mErrorListeners;
    }

    public Config getImplementationOptions() {
        return this.mRepeatingCaptureConfig.getImplementationOptions();
    }

    public InputConfiguration getInputConfiguration() {
        return this.mInputConfiguration;
    }

    public List<CameraCaptureCallback> getRepeatingCameraCaptureCallbacks() {
        return this.mRepeatingCaptureConfig.getCameraCaptureCallbacks();
    }

    public CaptureConfig getRepeatingCaptureConfig() {
        return this.mRepeatingCaptureConfig;
    }

    public List<CameraCaptureSession.StateCallback> getSessionStateCallbacks() {
        return this.mSessionStateCallbacks;
    }

    public List<CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
        return this.mSingleCameraCaptureCallbacks;
    }

    public List<DeferrableSurface> getSurfaces() {
        return Collections.unmodifiableList(this.mSurfaces);
    }

    public int getTemplateType() {
        return this.mRepeatingCaptureConfig.getTemplateType();
    }
}
