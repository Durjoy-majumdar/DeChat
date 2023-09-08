package com.tencent.maas.model;

public class MJModelInfo {
    private String modelFilePath;
    private String modelName;
    private String modelVersion;

    public MJModelInfo(String str, String str2, String str3) {
        this.modelName = str;
        this.modelFilePath = str2;
        this.modelVersion = str3;
    }

    public String getModelFilePath() {
        return this.modelFilePath;
    }

    public String getModelName() {
        return this.modelName;
    }

    public String getModelVersion() {
        return this.modelVersion;
    }
}
