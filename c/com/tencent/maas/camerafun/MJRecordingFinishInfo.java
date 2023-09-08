package com.tencent.maas.camerafun;

import com.tencent.maas.model.time.MJTime;

public class MJRecordingFinishInfo {
    private final String originalImageSeqDirPath;
    private final String outputFilePath;
    private final MJTime recordingDuration;

    public MJRecordingFinishInfo(String str, MJTime mJTime, String str2) {
        this.outputFilePath = str;
        this.recordingDuration = mJTime;
        this.originalImageSeqDirPath = str2;
    }

    public String getOriginalImageSeqDirPath() {
        return this.originalImageSeqDirPath;
    }

    public String getOutputFilePath() {
        return this.outputFilePath;
    }

    public MJTime getRecordingDuration() {
        return this.recordingDuration;
    }

    public String toString() {
        return "MJRecordingFinishInfo{outputFilePath='" + this.outputFilePath + '\'' + ", recordingDuration=" + this.recordingDuration.toSeconds() + "s, originalImageSeqDirPath='" + this.originalImageSeqDirPath + '\'' + '}';
    }
}
