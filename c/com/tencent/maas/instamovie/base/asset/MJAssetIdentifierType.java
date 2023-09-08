package com.tencent.maas.instamovie.base.asset;

public enum MJAssetIdentifierType {
    Unknown(-1),
    Filepath(0),
    FileIdentifier(1);
    
    private final int value;

    private MJAssetIdentifierType(int i) {
        this.value = i;
    }

    public static MJAssetIdentifierType fromInt(int i) {
        for (MJAssetIdentifierType mJAssetIdentifierType : values()) {
            if (mJAssetIdentifierType.getValue() == i) {
                return mJAssetIdentifierType;
            }
        }
        return Unknown;
    }

    public int getValue() {
        return this.value;
    }
}
