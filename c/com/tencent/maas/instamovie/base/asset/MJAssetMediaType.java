package com.tencent.maas.instamovie.base.asset;

public enum MJAssetMediaType {
    Unknown(-1),
    Image(0),
    Video(1);
    
    private final int value;

    private MJAssetMediaType(int i) {
        this.value = i;
    }

    public static MJAssetMediaType fromInt(int i) {
        for (MJAssetMediaType mJAssetMediaType : values()) {
            if (mJAssetMediaType.getValue() == i) {
                return mJAssetMediaType;
            }
        }
        return Unknown;
    }

    public int getValue() {
        return this.value;
    }
}
