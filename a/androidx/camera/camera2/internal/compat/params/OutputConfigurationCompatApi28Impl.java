package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import p329d3.C20434g;

class OutputConfigurationCompatApi28Impl extends OutputConfigurationCompatApi26Impl {
    public OutputConfigurationCompatApi28Impl(Surface surface) {
        super((Object) new OutputConfiguration(surface));
    }

    public static OutputConfigurationCompatApi28Impl wrap(OutputConfiguration outputConfiguration) {
        return new OutputConfigurationCompatApi28Impl((Object) outputConfiguration);
    }

    public int getMaxSharedSurfaceCount() {
        return ((OutputConfiguration) getOutputConfiguration()).getMaxSharedSurfaceCount();
    }

    public Object getOutputConfiguration() {
        C20434g.m22017a(this.mObject instanceof OutputConfiguration);
        return this.mObject;
    }

    public String getPhysicalCameraId() {
        return null;
    }

    public void removeSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).removeSurface(surface);
    }

    public void setPhysicalCameraId(String str) {
        ((OutputConfiguration) getOutputConfiguration()).setPhysicalCameraId(str);
    }

    public OutputConfigurationCompatApi28Impl(Object obj) {
        super(obj);
    }
}
