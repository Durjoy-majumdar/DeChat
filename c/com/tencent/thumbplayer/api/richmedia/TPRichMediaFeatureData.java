package com.tencent.thumbplayer.api.richmedia;

import com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData;
import java.util.ArrayList;
import java.util.List;

public class TPRichMediaFeatureData {
    private final String mEnv;
    private final List<TPRichMediaFeatureContent> mFeatureContentList = new ArrayList();
    private final String mFeatureType;
    private final String mVersion;

    public static class TPRichMediaFeatureContent {
        private String mContent = "";
        private long mEndTimeMs = -1;
        private long mStartTimeMs = -1;

        public TPRichMediaFeatureContent(TPNativeRichMediaFeatureData.TPNativeRichMediaFeatureContent tPNativeRichMediaFeatureContent) {
            this.mStartTimeMs = tPNativeRichMediaFeatureContent.getStartTimeMs();
            this.mEndTimeMs = tPNativeRichMediaFeatureContent.getEndTimeMs();
            this.mContent = tPNativeRichMediaFeatureContent.getContent();
        }

        public String getContent() {
            return this.mContent;
        }

        public long getEndTimeMs() {
            return this.mEndTimeMs;
        }

        public long getStartTimeMs() {
            return this.mStartTimeMs;
        }
    }

    public TPRichMediaFeatureData(TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData) {
        this.mFeatureType = tPNativeRichMediaFeatureData.getFeatureType();
        this.mEnv = tPNativeRichMediaFeatureData.getEnv();
        this.mVersion = tPNativeRichMediaFeatureData.getVersion();
        if (tPNativeRichMediaFeatureData.getFeatureContents() != null) {
            for (TPNativeRichMediaFeatureData.TPNativeRichMediaFeatureContent tPRichMediaFeatureContent : tPNativeRichMediaFeatureData.getFeatureContents()) {
                this.mFeatureContentList.add(new TPRichMediaFeatureContent(tPRichMediaFeatureContent));
            }
        }
    }

    public String getEnv() {
        return this.mEnv;
    }

    public List<TPRichMediaFeatureContent> getFeatureContentList() {
        return this.mFeatureContentList;
    }

    public String getFeatureType() {
        return this.mFeatureType;
    }

    public String getVersion() {
        return this.mVersion;
    }
}
