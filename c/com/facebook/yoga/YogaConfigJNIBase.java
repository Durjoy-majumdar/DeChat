package com.facebook.yoga;

public abstract class YogaConfigJNIBase extends YogaConfig {
    private YogaLogger mLogger;
    public long mNativePointer;

    private YogaConfigJNIBase(long j) {
        if (j != 0) {
            this.mNativePointer = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    public YogaLogger getLogger() {
        return this.mLogger;
    }

    public long getNativePointer() {
        return this.mNativePointer;
    }

    public void setExperimentalFeatureEnabled(YogaExperimentalFeature yogaExperimentalFeature, boolean z) {
        YogaNative.jni_YGConfigSetExperimentalFeatureEnabledJNI(this.mNativePointer, yogaExperimentalFeature.intValue(), z);
    }

    public void setLogger(YogaLogger yogaLogger) {
        this.mLogger = yogaLogger;
        YogaNative.jni_YGConfigSetLoggerJNI(this.mNativePointer, yogaLogger);
    }

    public void setPointScaleFactor(float f) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.mNativePointer, f);
    }

    public void setPrintTreeFlag(boolean z) {
        YogaNative.jni_YGConfigSetPrintTreeFlagJNI(this.mNativePointer, z);
    }

    public void setShouldDiffLayoutWithoutLegacyStretchBehaviour(boolean z) {
        YogaNative.jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviourJNI(this.mNativePointer, z);
    }

    public void setUseLegacyStretchBehaviour(boolean z) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviourJNI(this.mNativePointer, z);
    }

    public void setUseWebDefaults(boolean z) {
        YogaNative.jni_YGConfigSetUseWebDefaultsJNI(this.mNativePointer, z);
    }

    public YogaConfigJNIBase() {
        this(YogaNative.jni_YGConfigNewJNI());
    }

    public YogaConfigJNIBase(boolean z) {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
