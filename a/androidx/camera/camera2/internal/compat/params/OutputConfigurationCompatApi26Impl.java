package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.camera.core.Logger;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import p329d3.C20434g;

class OutputConfigurationCompatApi26Impl extends OutputConfigurationCompatApi24Impl {
    private static final String MAX_SHARED_SURFACES_COUNT_FIELD = "MAX_SURFACES_COUNT";
    private static final String SURFACES_FIELD = "mSurfaces";

    public static final class OutputConfigurationParamsApi26 {
        public final OutputConfiguration mOutputConfiguration;
        public String mPhysicalCameraId;

        public OutputConfigurationParamsApi26(OutputConfiguration outputConfiguration) {
            this.mOutputConfiguration = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi26)) {
                return false;
            }
            OutputConfigurationParamsApi26 outputConfigurationParamsApi26 = (OutputConfigurationParamsApi26) obj;
            return Objects.equals(this.mOutputConfiguration, outputConfigurationParamsApi26.mOutputConfiguration) && Objects.equals(this.mPhysicalCameraId, outputConfigurationParamsApi26.mPhysicalCameraId);
        }

        public int hashCode() {
            int hashCode = this.mOutputConfiguration.hashCode() ^ 31;
            int i = (hashCode << 5) - hashCode;
            String str = this.mPhysicalCameraId;
            return (str == null ? 0 : str.hashCode()) ^ i;
        }
    }

    public OutputConfigurationCompatApi26Impl(Surface surface) {
        this((Object) new OutputConfigurationParamsApi26(new OutputConfiguration(surface)));
    }

    private static int getMaxSharedSurfaceCountApi26() {
        Field declaredField = OutputConfiguration.class.getDeclaredField(MAX_SHARED_SURFACES_COUNT_FIELD);
        declaredField.setAccessible(true);
        return declaredField.getInt((Object) null);
    }

    private static List<Surface> getMutableSurfaceListApi26(OutputConfiguration outputConfiguration) {
        Field declaredField = OutputConfiguration.class.getDeclaredField(SURFACES_FIELD);
        declaredField.setAccessible(true);
        return (List) declaredField.get(outputConfiguration);
    }

    public static OutputConfigurationCompatApi26Impl wrap(OutputConfiguration outputConfiguration) {
        return new OutputConfigurationCompatApi26Impl((Object) new OutputConfigurationParamsApi26(outputConfiguration));
    }

    public void addSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).addSurface(surface);
    }

    public void enableSurfaceSharing() {
        ((OutputConfiguration) getOutputConfiguration()).enableSurfaceSharing();
    }

    public int getMaxSharedSurfaceCount() {
        try {
            return getMaxSharedSurfaceCountApi26();
        } catch (IllegalAccessException | NoSuchFieldException e) {
            Logger.m15474e(OutputConfigurationCompatBaseImpl.TAG, "Unable to retrieve max shared surface count.", e);
            return super.getMaxSharedSurfaceCount();
        }
    }

    public Object getOutputConfiguration() {
        C20434g.m22017a(this.mObject instanceof OutputConfigurationParamsApi26);
        return ((OutputConfigurationParamsApi26) this.mObject).mOutputConfiguration;
    }

    public String getPhysicalCameraId() {
        return ((OutputConfigurationParamsApi26) this.mObject).mPhysicalCameraId;
    }

    public List<Surface> getSurfaces() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaces();
    }

    public final boolean isSurfaceSharingEnabled() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    public void removeSurface(Surface surface) {
        if (getSurface() != surface) {
            try {
                if (!getMutableSurfaceListApi26((OutputConfiguration) getOutputConfiguration()).remove(surface)) {
                    throw new IllegalArgumentException("Surface is not part of this output configuration");
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
                Logger.m15474e(OutputConfigurationCompatBaseImpl.TAG, "Unable to remove surface from this output configuration.", e);
            }
        } else {
            throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
        }
    }

    public void setPhysicalCameraId(String str) {
        ((OutputConfigurationParamsApi26) this.mObject).mPhysicalCameraId = str;
    }

    public OutputConfigurationCompatApi26Impl(Object obj) {
        super(obj);
    }
}
