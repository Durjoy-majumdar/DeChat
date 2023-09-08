package com.tencent.maas.model;

public class MJTemplateMetadata {
    private String descDownloadURL;
    private long descVersion;
    private long minimumAndroidSDKVersion;
    private long minimumiOSSDKVersion;
    private String templateID;

    public MJTemplateMetadata(String str, long j, String str2, long j2, long j3) {
        this.templateID = str;
        this.descVersion = j;
        this.descDownloadURL = str2;
        this.minimumiOSSDKVersion = j2;
        this.minimumAndroidSDKVersion = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.templateID.equals(((MJTemplateMetadata) obj).templateID);
    }

    public String getDescDownloadURL() {
        return this.descDownloadURL;
    }

    public long getDescVersion() {
        return this.descVersion;
    }

    public long getMinimumAndroidSDKVersion() {
        return this.minimumAndroidSDKVersion;
    }

    public long getMinimumiOSSDKVersion() {
        return this.minimumiOSSDKVersion;
    }

    public String getTemplateID() {
        return this.templateID;
    }

    public int hashCode() {
        return this.templateID.hashCode();
    }

    public String toString() {
        return "MJTemplateMetadata{templateID='" + this.templateID + '\'' + ", descVersion=" + this.descVersion + '}';
    }
}
