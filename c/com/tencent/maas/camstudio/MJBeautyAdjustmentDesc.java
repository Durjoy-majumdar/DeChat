package com.tencent.maas.camstudio;

public class MJBeautyAdjustmentDesc {
    private float browDistance;
    private float browPeak;
    private float browThickness;
    private float cheekShrinkage;
    private float clarity;
    private float contouringRate;
    private float darkCircleReduction;
    private float eyeBrightness;
    private float eyeDistanceFactor;
    private float eyeEnhancement;
    private float eyelidDownStrength;
    private float faceSlimness;
    private float headShrinkage;
    private boolean isBeautyEnabled = false;
    private float jawShrinkage;
    private float lipShape;
    private float nasalRoot;
    private float noseShrinkage;
    private float noseTip;
    private float noseWing;
    private String presetID;
    private float redLip;
    private float skinSmoothness;
    private float smileFoldReduction;
    private float teethWhiteness;
    private float twowayBrightRate;

    public static MJBeautyAdjustmentDesc getClassicBeautyAdjustmentDesc() {
        return nativeGetBuiltinBeautyAdjustmentDesc("Classic");
    }

    public static MJBeautyAdjustmentDesc getGodBeautyAdjustmentDesc() {
        return nativeGetBuiltinBeautyAdjustmentDesc("God");
    }

    public static MJBeautyAdjustmentDesc getGoddessBeautyAdjustmentDesc() {
        return nativeGetBuiltinBeautyAdjustmentDesc("Goddess");
    }

    public static MJBeautyAdjustmentDesc getNaturalBeautyAdjustmentDesc() {
        return nativeGetBuiltinBeautyAdjustmentDesc("Natural");
    }

    private static native MJBeautyAdjustmentDesc nativeGetBuiltinBeautyAdjustmentDesc(String str);

    public float getBrowDistance() {
        return this.browDistance;
    }

    public float getBrowPeak() {
        return this.browPeak;
    }

    public float getBrowThickness() {
        return this.browThickness;
    }

    public float getCheekShrinkage() {
        return this.cheekShrinkage;
    }

    public float getClarity() {
        return this.clarity;
    }

    public float getContouringRate() {
        return this.contouringRate;
    }

    public float getDarkCircleReduction() {
        return this.darkCircleReduction;
    }

    public float getEyeBrightness() {
        return this.eyeBrightness;
    }

    public float getEyeDistanceFactor() {
        return this.eyeDistanceFactor;
    }

    public float getEyeEnhancement() {
        return this.eyeEnhancement;
    }

    public float getEyelidDownStrength() {
        return this.eyelidDownStrength;
    }

    public float getFaceSlimness() {
        return this.faceSlimness;
    }

    public float getHeadShrinkage() {
        return this.headShrinkage;
    }

    public float getJawShrinkage() {
        return this.jawShrinkage;
    }

    public float getLipShape() {
        return this.lipShape;
    }

    public float getNasalRoot() {
        return this.nasalRoot;
    }

    public float getNoseShrinkage() {
        return this.noseShrinkage;
    }

    public float getNoseTip() {
        return this.noseTip;
    }

    public float getNoseWing() {
        return this.noseWing;
    }

    public String getPresetID() {
        return this.presetID;
    }

    public float getRedLip() {
        return this.redLip;
    }

    public float getSkinSmoothness() {
        return this.skinSmoothness;
    }

    public float getSmileFoldReduction() {
        return this.smileFoldReduction;
    }

    public float getTeethWhiteness() {
        return this.teethWhiteness;
    }

    public float getTwowayBrightRate() {
        return this.twowayBrightRate;
    }

    public boolean isBeautyEnabled() {
        return this.isBeautyEnabled;
    }

    public void setBeautyEnabled(boolean z) {
        this.isBeautyEnabled = z;
    }

    public void setBrowDistance(float f) {
        this.browDistance = f;
    }

    public void setBrowPeak(float f) {
        this.browPeak = f;
    }

    public void setBrowThickness(float f) {
        this.browThickness = f;
    }

    public void setCheekShrinkage(float f) {
        this.cheekShrinkage = f;
    }

    public void setClarity(float f) {
        this.clarity = f;
    }

    public void setContouringRate(float f) {
        this.contouringRate = f;
    }

    public void setDarkCircleReduction(float f) {
        this.darkCircleReduction = f;
    }

    public void setEyeBrightness(float f) {
        this.eyeBrightness = f;
    }

    public void setEyeDistanceFactor(float f) {
        this.eyeDistanceFactor = f;
    }

    public void setEyeEnhancement(float f) {
        this.eyeEnhancement = f;
    }

    public void setEyelidDownStrength(float f) {
        this.eyelidDownStrength = f;
    }

    public void setFaceSlimness(float f) {
        this.faceSlimness = f;
    }

    public void setHeadShrinkage(float f) {
        this.headShrinkage = f;
    }

    public void setJawShrinkage(float f) {
        this.jawShrinkage = f;
    }

    public void setLipShape(float f) {
        this.lipShape = f;
    }

    public void setNasalRoot(float f) {
        this.nasalRoot = f;
    }

    public void setNoseShrinkage(float f) {
        this.noseShrinkage = f;
    }

    public void setNoseTip(float f) {
        this.noseTip = f;
    }

    public void setNoseWing(float f) {
        this.noseWing = f;
    }

    public void setPresetID(String str) {
        this.presetID = str;
    }

    public void setRedLip(float f) {
        this.redLip = f;
    }

    public void setSkinSmoothness(float f) {
        this.skinSmoothness = f;
    }

    public void setSmileFoldReduction(float f) {
        this.smileFoldReduction = f;
    }

    public void setTeethWhiteness(float f) {
        this.teethWhiteness = f;
    }

    public void setTwowayBrightRate(float f) {
        this.twowayBrightRate = f;
    }
}
