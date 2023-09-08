package com.tencent.maas.camerafun;

public class MJWeEffectBeautifyAssetsInfo {
    private final String cheekShrinkagePath;
    private final String darkCircleAndSmileFoldReductionPath;
    private final String eyeEnhancementPath;
    private final String faceBlushPath;
    private final String faceSlimnessPath;
    private final String headShrinkagePath;
    private final String jawShrinkagePath;
    private final String lipStickPath;
    private final String noseShrinkagePath;
    private final String pictureClarityPath;
    private final String stereoFacePath;

    public MJWeEffectBeautifyAssetsInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.faceSlimnessPath = str;
        this.eyeEnhancementPath = str2;
        this.headShrinkagePath = str3;
        this.cheekShrinkagePath = str4;
        this.jawShrinkagePath = str5;
        this.noseShrinkagePath = str6;
        this.darkCircleAndSmileFoldReductionPath = str7;
        this.pictureClarityPath = str8;
        this.lipStickPath = str9;
        this.faceBlushPath = str10;
        this.stereoFacePath = str11;
    }

    public String getCheekShrinkagePath() {
        return this.cheekShrinkagePath;
    }

    public String getDarkCircleAndSmileFoldReductionPath() {
        return this.darkCircleAndSmileFoldReductionPath;
    }

    public String getEyeEnhancementPath() {
        return this.eyeEnhancementPath;
    }

    public String getFaceBlushPath() {
        return this.faceBlushPath;
    }

    public String getFaceSlimnessPath() {
        return this.faceSlimnessPath;
    }

    public String getHeadShrinkagePath() {
        return this.headShrinkagePath;
    }

    public String getJawShrinkagePath() {
        return this.jawShrinkagePath;
    }

    public String getLipStickPath() {
        return this.lipStickPath;
    }

    public String getNoseShrinkagePath() {
        return this.noseShrinkagePath;
    }

    public String getPictureClarityPath() {
        return this.pictureClarityPath;
    }

    public String getStereoFacePath() {
        return this.stereoFacePath;
    }
}
