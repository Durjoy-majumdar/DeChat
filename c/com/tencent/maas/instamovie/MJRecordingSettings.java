package com.tencent.maas.instamovie;

import com.tencent.maas.instamovie.mediafoundation.AudioCodecId;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.maas.instamovie.mediafoundation.MediaContainerType;
import com.tencent.maas.instamovie.mediafoundation.VideoCodecId;
import com.tencent.maas.model.time.MJTime;
import com.tencent.tav.decoder.EncoderWriter;
import java.util.Map;

public class MJRecordingSettings {
    private AudioCodecId audioCodecId;
    private int averageAudioBitRate;
    private MJCamOSTMode camOSTMode = MJCamOSTMode.FollowTemplate;
    private int maxKeyframeInterval;
    private MJTime maxRecordingDuration = MJTime.PositiveInfinityTime;
    private MediaContainerType mediaContainerType;
    private Map<String, String> metaData;
    private boolean outputMixedWithBGM = true;
    private boolean useMetadataTags;
    private int videoBitsPerFrame;
    private int videoCWAngle;
    private VideoCodecId videoCodecId;
    private DimensionLevel videoDimensionLevel;

    public enum MJCamOSTMode {
        FollowTemplate(0),
        Enabled(1),
        Disabled(2);
        
        private final int value;

        private MJCamOSTMode(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public MJRecordingSettings(VideoCodecId videoCodecId2, AudioCodecId audioCodecId2, MediaContainerType mediaContainerType2, DimensionLevel dimensionLevel, int i, int i2, int i3) {
        this.videoCodecId = videoCodecId2;
        this.audioCodecId = audioCodecId2;
        this.mediaContainerType = mediaContainerType2;
        this.videoDimensionLevel = dimensionLevel;
        this.videoBitsPerFrame = i;
        this.averageAudioBitRate = i2;
        this.maxKeyframeInterval = i3;
    }

    public static MJRecordingSettings getDefault1080pSettings() {
        return new MJRecordingSettings(VideoCodecId.H264, AudioCodecId.MPEG4AAC, MediaContainerType.MP4, DimensionLevel.DIMENSION_LEVEL_1080, 300000, EncoderWriter.OUTPUT_AUDIO_BIT_RATE, 30);
    }

    public int getAudioCodecID() {
        return this.audioCodecId.getId();
    }

    public int getAverageAudioBitRate() {
        return this.averageAudioBitRate;
    }

    public MJCamOSTMode getCamOSTMode() {
        return this.camOSTMode;
    }

    public int getCamOSTModeValue() {
        return this.camOSTMode.getValue();
    }

    public int getMaxKeyframeInterval() {
        return this.maxKeyframeInterval;
    }

    public MJTime getMaxRecordingDuration() {
        return this.maxRecordingDuration;
    }

    public int getMediaContainerType() {
        return this.mediaContainerType.getType();
    }

    public Map<String, String> getMetaData() {
        return this.metaData;
    }

    public int getVideoBitsPerFrame() {
        return this.videoBitsPerFrame;
    }

    public int getVideoCWAngle() {
        return this.videoCWAngle;
    }

    public int getVideoCodecID() {
        return this.videoCodecId.getId();
    }

    public int getVideoDimensionLevel() {
        return this.videoDimensionLevel.getId();
    }

    public boolean isOutputMixedWithBGM() {
        return this.outputMixedWithBGM;
    }

    public boolean isUseMetadataTags() {
        return this.useMetadataTags;
    }

    public void setAudioCodecId(AudioCodecId audioCodecId2) {
        this.audioCodecId = audioCodecId2;
    }

    public void setAverageAudioBitRate(int i) {
        this.averageAudioBitRate = i;
    }

    public void setCamOSTMode(MJCamOSTMode mJCamOSTMode) {
        this.camOSTMode = mJCamOSTMode;
    }

    public void setMaxKeyframeInterval(int i) {
        this.maxKeyframeInterval = i;
    }

    public void setMaxRecordingDuration(MJTime mJTime) {
        this.maxRecordingDuration = mJTime;
    }

    public void setMediaContainerType(MediaContainerType mediaContainerType2) {
        this.mediaContainerType = mediaContainerType2;
    }

    public void setMetaData(Map<String, String> map) {
        this.metaData = map;
    }

    public void setOutputMixedWithBGM(boolean z) {
        this.outputMixedWithBGM = z;
    }

    public void setUseMetadataTags(boolean z) {
        this.useMetadataTags = z;
    }

    public void setVideoBitsPerFrame(int i) {
        this.videoBitsPerFrame = i;
    }

    public void setVideoCWAngle(int i) {
        this.videoCWAngle = i;
    }

    public void setVideoCodecId(VideoCodecId videoCodecId2) {
        this.videoCodecId = videoCodecId2;
    }

    public void setVideoDimensionLevel(DimensionLevel dimensionLevel) {
        this.videoDimensionLevel = dimensionLevel;
    }

    public MJRecordingSettings(VideoCodecId videoCodecId2, AudioCodecId audioCodecId2, MediaContainerType mediaContainerType2, DimensionLevel dimensionLevel, int i, int i2, int i3, MJTime mJTime) {
        this.videoCodecId = videoCodecId2;
        this.audioCodecId = audioCodecId2;
        this.mediaContainerType = mediaContainerType2;
        this.videoDimensionLevel = dimensionLevel;
        this.videoBitsPerFrame = i;
        this.averageAudioBitRate = i2;
        this.maxKeyframeInterval = i3;
        this.maxRecordingDuration = mJTime;
    }
}
