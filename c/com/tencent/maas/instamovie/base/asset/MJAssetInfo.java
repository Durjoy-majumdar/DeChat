package com.tencent.maas.instamovie.base.asset;

public class MJAssetInfo {
    private String Identifier;
    private MJAssetIdentifierType identifierType;
    private MJAssetMediaType mediaType;

    public MJAssetInfo(MJAssetIdentifierType mJAssetIdentifierType, String str, MJAssetMediaType mJAssetMediaType) {
        this.identifierType = mJAssetIdentifierType;
        this.Identifier = str;
        this.mediaType = mJAssetMediaType;
    }

    public String getIdentifier() {
        return this.Identifier;
    }

    public MJAssetIdentifierType getIdentifierType() {
        return this.identifierType;
    }

    public int getMJAssetIdentifierType() {
        return this.identifierType.getValue();
    }

    public int getMJAssetMediaType() {
        return this.mediaType.getValue();
    }

    public MJAssetMediaType getMediaType() {
        return this.mediaType;
    }

    public String toString() {
        return "MJAssetInfo{identifierType=" + this.identifierType + ", Identifier='" + this.Identifier + '\'' + ", mediaType=" + this.mediaType + '}';
    }

    public MJAssetInfo(int i, String str, int i2) {
        this.identifierType = MJAssetIdentifierType.fromInt(i);
        this.Identifier = str;
        this.mediaType = MJAssetMediaType.fromInt(i2);
    }
}
