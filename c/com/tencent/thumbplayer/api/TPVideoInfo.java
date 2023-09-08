package com.tencent.thumbplayer.api;

import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.utils.TPCommonUtils;
import java.util.ArrayList;
import java.util.Collection;

public class TPVideoInfo {
    private Builder builder;
    private String definition;
    private ArrayList<TPDownloadParamData> downloadParamList;
    private String fileID;
    private long height;
    @TPCommonEnum.TP_VIDEO_CODEC_TYPE
    private int videoCodecId;
    private long width;

    public static class Builder {
        /* access modifiers changed from: private */
        public String definition;
        /* access modifiers changed from: private */
        public ArrayList<TPDownloadParamData> downloadParamList;
        /* access modifiers changed from: private */
        public String fileID;
        /* access modifiers changed from: private */
        public long height;
        /* access modifiers changed from: private */
        @TPCommonEnum.TP_VIDEO_CODEC_TYPE
        public int videoCodecId;
        /* access modifiers changed from: private */
        public long width;

        public TPVideoInfo build() {
            return new TPVideoInfo(this);
        }

        public Builder definition(String str) {
            this.definition = str;
            return this;
        }

        public Builder downloadParam(TPDownloadParamData tPDownloadParamData) {
            if (TPCommonUtils.isEmpty((Collection<? extends Object>) this.downloadParamList)) {
                this.downloadParamList = new ArrayList<>();
            } else {
                this.downloadParamList.clear();
            }
            this.downloadParamList.add(tPDownloadParamData);
            return this;
        }

        public Builder downloadParamList(ArrayList<TPDownloadParamData> arrayList) {
            this.downloadParamList = arrayList;
            return this;
        }

        public Builder fileId(String str) {
            this.fileID = str;
            return this;
        }

        public Builder size(long j, long j2) {
            this.width = j;
            this.height = j2;
            return this;
        }

        public Builder videoCodecId(@TPCommonEnum.TP_VIDEO_CODEC_TYPE int i) {
            this.videoCodecId = i;
            return this;
        }
    }

    public Builder getBuilder() {
        return this.builder;
    }

    public String getDefinition() {
        return this.definition;
    }

    public ArrayList<TPDownloadParamData> getDownloadPraramList() {
        return this.downloadParamList;
    }

    public long getHeight() {
        return this.height;
    }

    public String getProxyFileID() {
        return this.fileID;
    }

    public int getVideoCodecId() {
        return this.videoCodecId;
    }

    public long getWidth() {
        return this.width;
    }

    private TPVideoInfo(Builder builder2) {
        this.downloadParamList = new ArrayList<>();
        this.width = builder2.width;
        this.height = builder2.height;
        this.videoCodecId = builder2.videoCodecId;
        this.fileID = builder2.fileID;
        this.definition = builder2.definition;
        this.downloadParamList = builder2.downloadParamList;
        this.builder = builder2;
    }
}
