package com.tencent.maas.model;

public class MJMaterialInfo {
    private final String downloadURL;
    private final String materialID;
    private final MJMaterialType materialType;
    private final long version;

    public enum MJMaterialType {
        None(-1),
        Filter(0),
        Beauty(1);
        
        /* access modifiers changed from: private */
        public final int value;

        private MJMaterialType(int i) {
            this.value = i;
        }

        public static MJMaterialType fromInt(int i) {
            for (MJMaterialType mJMaterialType : values()) {
                if (mJMaterialType.getValue() == i) {
                    return mJMaterialType;
                }
            }
            return None;
        }

        public int getValue() {
            return this.value;
        }
    }

    public MJMaterialInfo(MJMaterialType mJMaterialType, String str, long j, String str2) {
        this.materialType = mJMaterialType;
        this.materialID = str;
        this.version = j;
        this.downloadURL = str2;
    }

    public String getDownloadURL() {
        return this.downloadURL;
    }

    public String getMaterialID() {
        return this.materialID;
    }

    public MJMaterialType getMaterialType() {
        return this.materialType;
    }

    public int getMaterialTypeValue() {
        return this.materialType.getValue();
    }

    public long getVersion() {
        return this.version;
    }

    public String toString() {
        return "MJMaterialInfo{materialType=" + this.materialType.value + ", materialID='" + this.materialID + '\'' + ", downloadURL='" + this.downloadURL + '\'' + ", version=" + this.version + '}';
    }
}
