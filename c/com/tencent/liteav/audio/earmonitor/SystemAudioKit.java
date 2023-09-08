package com.tencent.liteav.audio.earmonitor;

import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;

@JNINamespace("liteav::audio")
public abstract class SystemAudioKit {
    private final long mNativeSystemAudioKit;

    public SystemAudioKit(long j) {
        this.mNativeSystemAudioKit = j;
    }

    public static SystemAudioKit create(long j) {
        if (LiteavSystemInfo.getManufacturer().equalsIgnoreCase("huawei")) {
            return new C113435a(j, ContextUtils.getApplicationContext());
        }
        return null;
    }

    private static native void nativeNotifyEarMonitoringInitialized(long j, SystemAudioKit systemAudioKit, boolean z);

    private static native void nativeNotifySystemError(long j, SystemAudioKit systemAudioKit);

    public abstract void initialize();

    public void notifyEarMonitoringInitialized(SystemAudioKit systemAudioKit, boolean z) {
        nativeNotifyEarMonitoringInitialized(this.mNativeSystemAudioKit, systemAudioKit, z);
    }

    public void notifySystemError(SystemAudioKit systemAudioKit) {
        nativeNotifySystemError(this.mNativeSystemAudioKit, systemAudioKit);
    }

    public abstract void setEarMonitoringVolume(int i);

    public abstract void startEarMonitoring();

    public abstract void stopEarMonitoring();

    public abstract void terminate();
}
