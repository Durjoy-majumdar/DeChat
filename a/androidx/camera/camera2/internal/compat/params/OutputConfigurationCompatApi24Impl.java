package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p329d3.C20434g;

class OutputConfigurationCompatApi24Impl extends OutputConfigurationCompatBaseImpl {

    public static final class OutputConfigurationParamsApi24 {
        public boolean mIsShared;
        public final OutputConfiguration mOutputConfiguration;
        public String mPhysicalCameraId;

        public OutputConfigurationParamsApi24(OutputConfiguration outputConfiguration) {
            this.mOutputConfiguration = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi24)) {
                return false;
            }
            OutputConfigurationParamsApi24 outputConfigurationParamsApi24 = (OutputConfigurationParamsApi24) obj;
            return Objects.equals(this.mOutputConfiguration, outputConfigurationParamsApi24.mOutputConfiguration) && this.mIsShared == outputConfigurationParamsApi24.mIsShared && Objects.equals(this.mPhysicalCameraId, outputConfigurationParamsApi24.mPhysicalCameraId);
        }

        public int hashCode() {
            int hashCode = this.mOutputConfiguration.hashCode() ^ 31;
            boolean z = this.mIsShared ^ ((hashCode << 5) - hashCode);
            int i = ((z ? 1 : 0) << true) - z;
            String str = this.mPhysicalCameraId;
            return (str == null ? 0 : str.hashCode()) ^ i;
        }
    }

    public OutputConfigurationCompatApi24Impl(Surface surface) {
        this((Object) new OutputConfigurationParamsApi24(new OutputConfiguration(surface)));
    }

    public static OutputConfigurationCompatApi24Impl wrap(OutputConfiguration outputConfiguration) {
        return new OutputConfigurationCompatApi24Impl((Object) new OutputConfigurationParamsApi24(outputConfiguration));
    }

    public void enableSurfaceSharing() {
        ((OutputConfigurationParamsApi24) this.mObject).mIsShared = true;
    }

    public Object getOutputConfiguration() {
        C20434g.m22017a(this.mObject instanceof OutputConfigurationParamsApi24);
        return ((OutputConfigurationParamsApi24) this.mObject).mOutputConfiguration;
    }

    public String getPhysicalCameraId() {
        return ((OutputConfigurationParamsApi24) this.mObject).mPhysicalCameraId;
    }

    public Surface getSurface() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurface();
    }

    public int getSurfaceGroupId() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaceGroupId();
    }

    public List<Surface> getSurfaces() {
        return Collections.singletonList(getSurface());
    }

    public boolean isSurfaceSharingEnabled() {
        return ((OutputConfigurationParamsApi24) this.mObject).mIsShared;
    }

    public void setPhysicalCameraId(String str) {
        ((OutputConfigurationParamsApi24) this.mObject).mPhysicalCameraId = str;
    }

    public OutputConfigurationCompatApi24Impl(Object obj) {
        super(obj);
    }
}
