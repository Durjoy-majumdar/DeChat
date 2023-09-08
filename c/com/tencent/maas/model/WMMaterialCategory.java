package com.tencent.maas.model;

import com.tencent.maas.model.WMMaterialInfo;

public class WMMaterialCategory {
    private final long categoryID;
    private final String categoryName;
    private final WMMaterialInfo.WMMaterialType materialType;
    private final String thumbnailURL;

    public WMMaterialCategory(int i, long j, String str, String str2) {
        this.materialType = WMMaterialInfo.WMMaterialType.fromInt(i);
        this.categoryID = j;
        this.categoryName = str;
        this.thumbnailURL = str2;
    }

    public long getCategoryID() {
        return this.categoryID;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public WMMaterialInfo.WMMaterialType getMaterialType() {
        return this.materialType;
    }

    public String getThumbnailURL() {
        return this.thumbnailURL;
    }

    public String toString() {
        return "MJMaterialCategory{materialType=" + this.materialType + ", categoryID='" + this.categoryID + '\'' + ", categoryName='" + this.categoryName + '\'' + ", thumbnailURL='" + this.thumbnailURL + '\'' + '}';
    }
}
