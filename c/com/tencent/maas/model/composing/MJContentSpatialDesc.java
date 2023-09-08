package com.tencent.maas.model.composing;

import com.tencent.maas.model.composing.MJComposingDefines;

public class MJContentSpatialDesc {
    private final MJComposingDefines.MJContentFlipMode flipMode;
    private final MJComposingDefines.MJRotationMode rotationMode;
    private final MJComposingDefines.MJContentScaleMode scaleMode;

    public MJContentSpatialDesc(MJComposingDefines.MJContentScaleMode mJContentScaleMode, MJComposingDefines.MJRotationMode mJRotationMode, MJComposingDefines.MJContentFlipMode mJContentFlipMode) {
        this.scaleMode = mJContentScaleMode;
        this.rotationMode = mJRotationMode;
        this.flipMode = mJContentFlipMode;
    }

    public MJComposingDefines.MJContentFlipMode getFlipMode() {
        return this.flipMode;
    }

    public MJComposingDefines.MJRotationMode getRotationMode() {
        return this.rotationMode;
    }

    public MJComposingDefines.MJContentScaleMode getScaleMode() {
        return this.scaleMode;
    }
}
