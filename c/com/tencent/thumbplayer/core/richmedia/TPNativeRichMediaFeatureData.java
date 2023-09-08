package com.tencent.thumbplayer.core.richmedia;

public class TPNativeRichMediaFeatureData {
    private String mEnv;
    private TPNativeRichMediaFeatureContent[] mFeatureContents = new TPNativeRichMediaFeatureContent[0];
    private String mFeatureType;
    private String mVersion;

    public static class TPNativeRichMediaFeatureContent {
        private String mContent = "";
        private long mEndTimeMs = -1;
        private long mStartTimeMs = -1;

        public String getContent() {
            return this.mContent;
        }

        public long getEndTimeMs() {
            return this.mEndTimeMs;
        }

        public long getStartTimeMs() {
            return this.mStartTimeMs;
        }

        public void setContent(String str) {
            this.mContent = str;
        }

        public void setEndTimeMs(long j) {
            this.mEndTimeMs = j;
        }

        public void setStartTimeMs(long j) {
            this.mStartTimeMs = j;
        }
    }

    public String getEnv() {
        return this.mEnv;
    }

    public TPNativeRichMediaFeatureContent[] getFeatureContents() {
        return this.mFeatureContents;
    }

    public String getFeatureType() {
        return this.mFeatureType;
    }

    public String getVersion() {
        return this.mVersion;
    }

    public void setEnv(String str) {
        this.mEnv = str;
    }

    public void setFeatureContents(TPNativeRichMediaFeatureContent[] tPNativeRichMediaFeatureContentArr) {
        this.mFeatureContents = tPNativeRichMediaFeatureContentArr;
    }

    public void setFeatureType(String str) {
        this.mFeatureType = str;
    }

    public void setVersion(String str) {
        this.mVersion = str;
    }
}
