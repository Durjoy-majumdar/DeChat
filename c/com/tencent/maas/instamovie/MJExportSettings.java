package com.tencent.maas.instamovie;

import com.tencent.maas.instamovie.mediafoundation.AudioCodecId;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.maas.instamovie.mediafoundation.FrameRate;
import com.tencent.maas.instamovie.mediafoundation.MediaContainerType;
import com.tencent.maas.instamovie.mediafoundation.VideoCodecId;
import com.tencent.tav.decoder.EncoderWriter;

public class MJExportSettings {
    public static final String VIDEO_ENCODER_AMC_HARDWARE = "VideoEncoderAMCHardware";
    public static final String VIDEO_ENCODER_VCODEC = "VideoEncoderVCodec";
    private AudioCodecId audioCodecId;
    private int averageAudioBitRate;
    private String copyrightMetadata;
    private FrameRate frameRate;
    private int maxKeyframeInterval;
    private MediaContainerType mediaContainerType;
    private int videoBitsPerFrame;
    private VideoCodecId videoCodecId;
    private DimensionLevel videoDimensionLevel;
    private String videoEncoderName;

    public MJExportSettings(FrameRate frameRate2, int i, int i2, VideoCodecId videoCodecId2, AudioCodecId audioCodecId2, MediaContainerType mediaContainerType2, DimensionLevel dimensionLevel, int i3) {
        this.frameRate = frameRate2;
        this.videoBitsPerFrame = i;
        this.averageAudioBitRate = i2;
        this.videoCodecId = videoCodecId2;
        this.audioCodecId = audioCodecId2;
        this.mediaContainerType = mediaContainerType2;
        this.videoDimensionLevel = dimensionLevel;
        this.maxKeyframeInterval = i3;
        this.videoEncoderName = "";
        this.copyrightMetadata = null;
    }

    public static MJExportSettings getDefault1080pSettings() {
        return new MJExportSettings(FrameRate.FrameRate30, 300000, EncoderWriter.OUTPUT_AUDIO_BIT_RATE, VideoCodecId.H264, AudioCodecId.MPEG4AAC, MediaContainerType.MP4, DimensionLevel.DIMENSION_LEVEL_1080, 30);
    }

    public static MJExportSettings getHEVC1080pSettings() {
        return new MJExportSettings(FrameRate.FrameRate30, 300000, EncoderWriter.OUTPUT_AUDIO_BIT_RATE, VideoCodecId.HEVC, AudioCodecId.MPEG4AAC, MediaContainerType.MP4, DimensionLevel.DIMENSION_LEVEL_1080, 30);
    }

    public int getAudioCodecID() {
        return this.audioCodecId.getId();
    }

    public int getAverageAudioBitRate() {
        return this.averageAudioBitRate;
    }

    public String getCopyrightMetadata() {
        return this.copyrightMetadata;
    }

    public FrameRate getFrameRate() {
        return this.frameRate;
    }

    public int getMaxKeyframeInterval() {
        return this.maxKeyframeInterval;
    }

    public int getMediaContainerType() {
        return this.mediaContainerType.getType();
    }

    public int getVideoBitsPerFrame() {
        return this.videoBitsPerFrame;
    }

    public int getVideoCodecID() {
        return this.videoCodecId.getId();
    }

    public int getVideoDimensionLevel() {
        return this.videoDimensionLevel.getId();
    }

    public String getVideoEncoderName() {
        return this.videoEncoderName;
    }

    public void setAudioCodecId(AudioCodecId audioCodecId2) {
        this.audioCodecId = audioCodecId2;
    }

    public void setAverageAudioBitRate(int i) {
        this.averageAudioBitRate = i;
    }

    public void setCopyrightMetadata(String str) {
        this.copyrightMetadata = str;
    }

    public void setFrameRate(FrameRate frameRate2) {
        this.frameRate = frameRate2;
    }

    public void setMaxKeyframeInterval(int i) {
        this.maxKeyframeInterval = i;
    }

    public void setMediaContainerType(MediaContainerType mediaContainerType2) {
        this.mediaContainerType = mediaContainerType2;
    }

    public void setVideoBitsPerFrame(int i) {
        this.videoBitsPerFrame = i;
    }

    public void setVideoCodecId(VideoCodecId videoCodecId2) {
        this.videoCodecId = videoCodecId2;
    }

    public void setVideoDimensionLevel(DimensionLevel dimensionLevel) {
        this.videoDimensionLevel = dimensionLevel;
    }

    public void setVideoEncoderName(String str) {
        this.videoEncoderName = str;
    }

    public MJExportSettings(FrameRate frameRate2, int i, int i2, VideoCodecId videoCodecId2, AudioCodecId audioCodecId2, MediaContainerType mediaContainerType2, DimensionLevel dimensionLevel, int i3, String str) {
        this.frameRate = frameRate2;
        this.videoBitsPerFrame = i;
        this.averageAudioBitRate = i2;
        this.videoCodecId = videoCodecId2;
        this.audioCodecId = audioCodecId2;
        this.mediaContainerType = mediaContainerType2;
        this.videoDimensionLevel = dimensionLevel;
        this.maxKeyframeInterval = i3;
        this.videoEncoderName = str;
        this.copyrightMetadata = null;
    }

    public MJExportSettings(FrameRate frameRate2, int i, int i2, VideoCodecId videoCodecId2, AudioCodecId audioCodecId2, MediaContainerType mediaContainerType2, DimensionLevel dimensionLevel, int i3, String str, String str2) {
        this.frameRate = frameRate2;
        this.videoBitsPerFrame = i;
        this.averageAudioBitRate = i2;
        this.videoCodecId = videoCodecId2;
        this.audioCodecId = audioCodecId2;
        this.mediaContainerType = mediaContainerType2;
        this.videoDimensionLevel = dimensionLevel;
        this.maxKeyframeInterval = i3;
        this.videoEncoderName = str;
        this.copyrightMetadata = str2;
    }
}
