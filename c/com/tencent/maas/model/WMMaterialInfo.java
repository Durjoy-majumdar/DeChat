package com.tencent.maas.model;

public class WMMaterialInfo {
    private final Object data;
    private final String downloadURL;
    private final String materialID;
    private final String materialName;
    private final WMMaterialType materialType;
    private final int thumbnailResId;
    private final String thumbnailURL;
    private final long version;

    public enum WMMaterialType {
        None(-1),
        Filter(0),
        Font(1),
        Sticker(2),
        TextStyle(3),
        TextColor(4);
        
        /* access modifiers changed from: private */
        public final int value;

        private WMMaterialType(int i) {
            this.value = i;
        }

        public static WMMaterialType fromInt(int i) {
            for (WMMaterialType wMMaterialType : values()) {
                if (wMMaterialType.getValue() == i) {
                    return wMMaterialType;
                }
            }
            return None;
        }

        public int getValue() {
            return this.value;
        }
    }

    public WMMaterialInfo(int i, String str, int i2) {
        this.materialType = WMMaterialType.fromInt(i);
        this.materialName = "";
        this.materialID = str;
        this.thumbnailURL = "";
        this.thumbnailResId = i2;
        this.downloadURL = "";
        this.data = null;
        this.version = 0;
    }

    public Object getData() {
        return this.data;
    }

    public String getDownloadURL() {
        return this.downloadURL;
    }

    public String getMaterialID() {
        return this.materialID;
    }

    public String getMaterialName() {
        return this.materialName;
    }

    public WMMaterialType getMaterialType() {
        return this.materialType;
    }

    public int getThumbnailResId() {
        return this.thumbnailResId;
    }

    public String getThumbnailURL() {
        return this.thumbnailURL;
    }

    public long getVersion() {
        return this.version;
    }

    public String toString() {
        return "MJMaterialInfo{materialType=" + this.materialType.value + ", materialName='" + this.materialName + '\'' + ", materialID='" + this.materialID + '\'' + ", thumbnailURL='" + this.thumbnailURL + '\'' + ", downloadURL='" + this.downloadURL + '\'' + ", version=" + this.version + '}';
    }

    public WMMaterialInfo(int i, String str, Object obj) {
        this.materialType = WMMaterialType.fromInt(i);
        this.materialName = "";
        this.materialID = str;
        this.thumbnailURL = "";
        this.thumbnailResId = -1;
        this.downloadURL = "";
        this.data = obj;
        this.version = 0;
    }

    public WMMaterialInfo(int i, String str, String str2, String str3) {
        this.materialType = WMMaterialType.fromInt(i);
        this.materialName = "";
        this.materialID = str;
        this.thumbnailURL = str2;
        this.thumbnailResId = -1;
        this.downloadURL = str3;
        this.data = null;
        this.version = 0;
    }

    public WMMaterialInfo(int i, String str, String str2, String str3, String str4, long j) {
        this.materialType = WMMaterialType.fromInt(i);
        this.materialName = str;
        this.materialID = str2;
        this.thumbnailURL = str3;
        this.thumbnailResId = -1;
        this.downloadURL = str4;
        this.data = null;
        this.version = j;
    }

    public WMMaterialInfo(WMMaterialType wMMaterialType, String str, String str2, String str3, int i, String str4, long j) {
        this.materialType = wMMaterialType;
        this.materialName = str;
        this.materialID = str2;
        this.thumbnailURL = str3;
        this.thumbnailResId = i;
        this.downloadURL = str4;
        this.data = null;
        this.version = j;
    }
}
