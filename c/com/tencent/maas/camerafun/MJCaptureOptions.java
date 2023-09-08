package com.tencent.maas.camerafun;

import com.tencent.maas.model.time.MJTime;

public class MJCaptureOptions {
    private final boolean isAudioEnabled;
    private final boolean isChangeBackgroundImageEnabled;
    private final boolean isUseFrontCamera;
    private final MJTime maxRecordingDuration;

    public MJCaptureOptions(boolean z, boolean z2, boolean z3, MJTime mJTime) {
        this.isUseFrontCamera = z;
        this.isAudioEnabled = z2;
        this.isChangeBackgroundImageEnabled = z3;
        this.maxRecordingDuration = mJTime;
    }

    public MJTime getMaxRecordingDuration() {
        return this.maxRecordingDuration;
    }

    public boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public boolean isChangeBackgroundImageEnabled() {
        return this.isChangeBackgroundImageEnabled;
    }

    public boolean isUseFrontCamera() {
        return this.isUseFrontCamera;
    }
}
