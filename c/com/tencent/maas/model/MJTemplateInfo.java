package com.tencent.maas.model;

public class MJTemplateInfo {
    private String adaptedCategoryID;
    private MJChannelEventConfig channelEventConfig;
    private String displayName;
    private boolean isUnrecommended;
    private long minimumAndroidSDKVersion;
    private long minimumiOSSDKVersion;
    private String templateDescURL;
    private long templateDescVersion;
    private String templateID;
    private String thumbnailURL;

    public MJTemplateInfo(String str, String str2, String str3, String str4, boolean z, MJChannelEventConfig mJChannelEventConfig, String str5, long j, long j2, long j3) {
        this.templateID = str;
        this.thumbnailURL = str2;
        this.displayName = str3;
        this.adaptedCategoryID = str4;
        this.isUnrecommended = z;
        this.channelEventConfig = mJChannelEventConfig;
        this.templateDescURL = str5;
        this.templateDescVersion = j;
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
        return this.templateID.equals(((MJTemplateInfo) obj).templateID);
    }

    public String getAdaptedCategoryID() {
        return this.adaptedCategoryID;
    }

    public MJChannelEventConfig getChannelEventConfig() {
        return this.channelEventConfig;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public long getMinimumAndroidSDKVersion() {
        return this.minimumAndroidSDKVersion;
    }

    public long getMinimumiOSSDKVersion() {
        return this.minimumiOSSDKVersion;
    }

    public String getTemplateDescURL() {
        return this.templateDescURL;
    }

    public long getTemplateDescVersion() {
        return this.templateDescVersion;
    }

    public String getTemplateID() {
        return this.templateID;
    }

    public String getThumbnailURL() {
        return this.thumbnailURL;
    }

    public int hashCode() {
        return this.templateID.hashCode();
    }

    public boolean isUnrecommended() {
        return this.isUnrecommended;
    }

    public String toString() {
        return "MJTemplateInfo{templateID='" + this.templateID + '\'' + ", displayName='" + this.displayName + '\'' + ", templateDescVersion=" + this.templateDescVersion + '}';
    }
}
