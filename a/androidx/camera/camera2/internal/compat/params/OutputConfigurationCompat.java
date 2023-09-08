package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.List;

public final class OutputConfigurationCompat {
    public static final int SURFACE_GROUP_ID_NONE = -1;
    private final OutputConfigurationCompatImpl mImpl;

    public interface OutputConfigurationCompatImpl {
        void addSurface(Surface surface);

        void enableSurfaceSharing();

        int getMaxSharedSurfaceCount();

        Object getOutputConfiguration();

        String getPhysicalCameraId();

        Surface getSurface();

        int getSurfaceGroupId();

        List<Surface> getSurfaces();

        void removeSurface(Surface surface);

        void setPhysicalCameraId(String str);
    }

    public OutputConfigurationCompat(Surface surface) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.mImpl = new OutputConfigurationCompatApi28Impl(surface);
        } else if (i >= 26) {
            this.mImpl = new OutputConfigurationCompatApi26Impl(surface);
        } else if (i >= 24) {
            this.mImpl = new OutputConfigurationCompatApi24Impl(surface);
        } else {
            this.mImpl = new OutputConfigurationCompatBaseImpl(surface);
        }
    }

    public static OutputConfigurationCompat wrap(Object obj) {
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        OutputConfigurationCompatImpl wrap = i >= 28 ? OutputConfigurationCompatApi28Impl.wrap((OutputConfiguration) obj) : i >= 26 ? OutputConfigurationCompatApi26Impl.wrap((OutputConfiguration) obj) : i >= 24 ? OutputConfigurationCompatApi24Impl.wrap((OutputConfiguration) obj) : null;
        if (wrap == null) {
            return null;
        }
        return new OutputConfigurationCompat(wrap);
    }

    public void addSurface(Surface surface) {
        this.mImpl.addSurface(surface);
    }

    public void enableSurfaceSharing() {
        this.mImpl.enableSurfaceSharing();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OutputConfigurationCompat)) {
            return false;
        }
        return this.mImpl.equals(((OutputConfigurationCompat) obj).mImpl);
    }

    public int getMaxSharedSurfaceCount() {
        return this.mImpl.getMaxSharedSurfaceCount();
    }

    public String getPhysicalCameraId() {
        return this.mImpl.getPhysicalCameraId();
    }

    public Surface getSurface() {
        return this.mImpl.getSurface();
    }

    public int getSurfaceGroupId() {
        return this.mImpl.getSurfaceGroupId();
    }

    public List<Surface> getSurfaces() {
        return this.mImpl.getSurfaces();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public void removeSurface(Surface surface) {
        this.mImpl.removeSurface(surface);
    }

    public void setPhysicalCameraId(String str) {
        this.mImpl.setPhysicalCameraId(str);
    }

    public Object unwrap() {
        return this.mImpl.getOutputConfiguration();
    }

    public <T> OutputConfigurationCompat(Size size, Class<T> cls) {
        OutputConfiguration newOutputConfiguration = ApiCompat.Api26Impl.newOutputConfiguration(size, cls);
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = OutputConfigurationCompatApi28Impl.wrap(newOutputConfiguration);
        } else {
            this.mImpl = OutputConfigurationCompatApi26Impl.wrap(newOutputConfiguration);
        }
    }

    private OutputConfigurationCompat(OutputConfigurationCompatImpl outputConfigurationCompatImpl) {
        this.mImpl = outputConfigurationCompatImpl;
    }
}
