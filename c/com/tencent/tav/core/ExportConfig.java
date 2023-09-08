package com.tencent.tav.core;

import android.media.MediaFormat;
import android.os.Build;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.decoder.CodecHelper;
import com.tencent.tav.decoder.EncoderWriter;
import com.tencent.tav.decoder.logger.Logger;
import java.nio.ByteBuffer;

public class ExportConfig implements Cloneable {
    private static final String TAG = "ExportConfig";
    private static final int UNKNOWN_PARAM_VALUE = 0;
    private int audioAacProfile = 2;
    private int audioBitRate = EncoderWriter.OUTPUT_AUDIO_BIT_RATE;
    private int audioChannelCount = 1;
    private boolean audioEncodeNeedCodecSpecificData = true;
    private MediaFormat audioFormat;
    private int audioSampleRateHz = 44100;
    private int colorRange = 0;
    private int colorStandard = 0;
    private int colorTransfer = 0;
    private boolean correctSizeByCodecCapabilities = true;
    private ByteBuffer hdrStaticInfo = null;
    private boolean highProfile = false;
    private boolean limitProfileLevel = false;
    private String outputFilePath;
    private int outputHeight;
    private int outputWidth;
    private int renderHeight;
    private int renderWidth;
    private int suggestParallelCount = -1;
    private int videoBitRate = 8000000;
    private MediaFormat videoFormat;
    private int videoFrameRate = 30;
    private int videoIFrameInterval = 1;
    private String videoMimeType = "video/avc";

    public ExportConfig(int i, int i2) {
        this.outputWidth = i;
        this.outputHeight = i2;
        this.renderWidth = i;
        this.renderHeight = i2;
    }

    private int findFormatValue(String str, int i, MediaFormat mediaFormat) {
        return (mediaFormat == null || !mediaFormat.containsKey(str)) ? i : mediaFormat.getInteger(str);
    }

    private int findVideoFormatValue(String str, int i) {
        return findFormatValue(str, i, this.videoFormat);
    }

    private void initAudioChannelCount() {
        setToAudioFormat("channel-count", this.audioChannelCount);
    }

    private void initAudioSampleRate() {
        setToAudioFormat("sample-rate", this.audioSampleRateHz);
    }

    private void initColorSpace() {
        if (Build.VERSION.SDK_INT >= 24) {
            int i = this.colorRange;
            if (i != 0) {
                setToVideoFormat("color-range", i);
            }
            int i2 = this.colorTransfer;
            if (i2 != 0) {
                setToVideoFormat("color-transfer", i2);
            }
            int i3 = this.colorStandard;
            if (i3 != 0) {
                setToVideoFormat("color-standard", i3);
            }
            ByteBuffer byteBuffer = this.hdrStaticInfo;
            if (byteBuffer != null) {
                setToVideoFormat("hdr-static-info", byteBuffer);
            }
        }
    }

    private void initFrameRate() {
        setToVideoFormat("frame-rate", this.videoFrameRate);
    }

    private void initHdrInfo() {
        ByteBuffer byteBuffer;
        if (Build.VERSION.SDK_INT >= 24 && (byteBuffer = this.hdrStaticInfo) != null) {
            setToVideoFormat("hdr-static-info", byteBuffer);
        }
    }

    private void initHighProfile() {
        if (this.highProfile && this.videoMimeType.equalsIgnoreCase("video/avc")) {
            CodecHelper.selectProfileAndLevel(this.videoFormat, this.limitProfileLevel);
        }
    }

    private void initIFrameInterval() {
        setToVideoFormat("i-frame-interval", this.videoIFrameInterval);
    }

    private void initOutputSize() {
        Logger.m144646i(TAG, "initOutputSize, correctSizeByCodecCapabilities:" + this.correctSizeByCodecCapabilities);
        if (this.correctSizeByCodecCapabilities) {
            CGSize correctSupportSize = CodecHelper.correctSupportSize(getOutputSize(), "video/avc");
            setToVideoFormat("width", (int) correctSupportSize.width);
            setToVideoFormat("height", (int) correctSupportSize.height);
            Logger.m144646i(TAG, "initOutputSize, width:" + correctSupportSize.width + " height:" + correctSupportSize.height);
            return;
        }
        setToVideoFormat("width", (int) getOutputSize().width);
        setToVideoFormat("height", (int) getOutputSize().height);
        Logger.m144646i(TAG, "initOutputSize, width:" + getOutputSize().width + " height:" + getOutputSize().height);
    }

    private void initVideoBitrate() {
        setToVideoFormat(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.videoBitRate);
    }

    private void setToAudioFormat(String str, int i) {
        if (this.audioFormat == null) {
            getAudioFormat();
        }
        setToFormat(str, i, this.audioFormat);
    }

    private void setToFormat(String str, int i, MediaFormat mediaFormat) {
        if (mediaFormat != null) {
            mediaFormat.setInteger(str, i);
        }
    }

    private void setToVideoFormat(String str, int i) {
        if (this.videoFormat == null) {
            getVideoFormat();
        }
        setToFormat(str, i, this.videoFormat);
    }

    public boolean available() {
        return getOutputWidth() > 0 && getOutputHeight() > 0;
    }

    public int getAudioChannelCount() {
        return findFormatValue("channel-count", this.audioChannelCount, this.audioFormat);
    }

    public MediaFormat getAudioFormat() {
        if (this.audioFormat == null) {
            MediaFormat mediaFormat = new MediaFormat();
            this.audioFormat = mediaFormat;
            mediaFormat.setString("mime", "audio/mp4a-latm");
            this.audioFormat.setInteger("sample-rate", this.audioSampleRateHz);
            initAudioChannelCount();
            this.audioFormat.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.audioBitRate);
            this.audioFormat.setInteger("aac-profile", this.audioAacProfile);
        }
        Logger.m144646i(TAG, "getAudioFormat:" + this.audioFormat);
        return this.audioFormat;
    }

    public int getAudioSampleRateHz() {
        return findFormatValue("sample-rate", this.audioSampleRateHz, this.audioFormat);
    }

    public String getOutputFilePath() {
        return this.outputFilePath;
    }

    public int getOutputHeight() {
        return findVideoFormatValue("height", this.outputHeight);
    }

    public CGSize getOutputSize() {
        return new CGSize((float) getOutputWidth(), (float) getOutputHeight());
    }

    public int getOutputWidth() {
        return findVideoFormatValue("width", this.outputWidth);
    }

    public int getRenderHeight() {
        return this.renderHeight;
    }

    public int getRenderWidth() {
        return this.renderWidth;
    }

    public int getSuggestParallelCount() {
        return this.suggestParallelCount;
    }

    public int getVideoBitRate() {
        return findVideoFormatValue(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.videoBitRate);
    }

    public MediaFormat getVideoFormat() {
        if (this.videoFormat == null) {
            MediaFormat mediaFormat = new MediaFormat();
            this.videoFormat = mediaFormat;
            mediaFormat.setString("mime", this.videoMimeType);
            this.videoFormat.setInteger("color-format", EncoderWriter.OUTPUT_VIDEO_COLOR_FORMAT);
            initOutputSize();
            initVideoBitrate();
            initFrameRate();
            initIFrameInterval();
            initHighProfile();
            initColorSpace();
            initHdrInfo();
        }
        return this.videoFormat;
    }

    public int getVideoFrameRate() {
        return findVideoFormatValue("frame-rate", this.videoFrameRate);
    }

    public boolean isAudioEncodeNeedCodecSpecificData() {
        return this.audioEncodeNeedCodecSpecificData;
    }

    public void setAudioBitRate(int i) {
        this.audioBitRate = i;
    }

    public void setAudioChannelCount(int i) {
        this.audioChannelCount = i;
        initAudioChannelCount();
    }

    public void setAudioEncodeNeedCodecSpecificData(boolean z) {
        Logger.m144646i(TAG, "setAudioEncodeNeedCodecSpecificData:" + z);
        this.audioEncodeNeedCodecSpecificData = z;
    }

    public void setAudioSampleRateHz(int i) {
        this.audioSampleRateHz = i;
        initAudioSampleRate();
    }

    public void setColorSpace(int i, int i2, int i3) {
        this.colorRange = i;
        this.colorStandard = i2;
        this.colorTransfer = i3;
        initColorSpace();
    }

    public void setEncodeHevc(boolean z) {
        if (z) {
            this.videoMimeType = "video/hevc";
        } else {
            this.videoMimeType = "video/avc";
        }
    }

    public void setHdrStaticInfo(ByteBuffer byteBuffer) {
        this.hdrStaticInfo = byteBuffer;
        initHdrInfo();
    }

    public void setHighProfile(boolean z) {
        this.highProfile = z;
        initHighProfile();
    }

    public void setLimitProfileLevel(boolean z) {
        this.limitProfileLevel = z;
    }

    public void setNeedCorrectSizeByCodecCapabilities(boolean z) {
        Logger.m144646i(TAG, "setNeedCorrectSizeByCodecCapabilities:" + z);
        this.correctSizeByCodecCapabilities = z;
    }

    public void setOutputFilePath(String str) {
        this.outputFilePath = str;
    }

    public void setOutputSize(int i, int i2) {
        this.outputWidth = i;
        this.outputHeight = i2;
        initOutputSize();
    }

    public void setSuggestParallelCount(int i) {
        this.suggestParallelCount = i;
    }

    public void setVideoBitRate(int i) {
        this.videoBitRate = i;
        initVideoBitrate();
    }

    public void setVideoFrameRate(int i) {
        this.videoFrameRate = i;
        initFrameRate();
    }

    public void setVideoIFrameInterval(int i) {
        this.videoIFrameInterval = i;
        initIFrameInterval();
    }

    private void setToFormat(String str, ByteBuffer byteBuffer, MediaFormat mediaFormat) {
        if (mediaFormat != null) {
            mediaFormat.setByteBuffer(str, byteBuffer);
        }
    }

    public ExportConfig clone() {
        ExportConfig exportConfig = new ExportConfig(this.outputWidth, this.outputHeight);
        exportConfig.videoBitRate = this.videoBitRate;
        exportConfig.videoFrameRate = this.videoFrameRate;
        exportConfig.videoIFrameInterval = this.videoIFrameInterval;
        exportConfig.outputWidth = this.outputWidth;
        exportConfig.outputHeight = this.outputHeight;
        exportConfig.renderWidth = this.renderWidth;
        exportConfig.renderHeight = this.renderHeight;
        exportConfig.highProfile = this.highProfile;
        exportConfig.videoMimeType = this.videoMimeType;
        exportConfig.audioBitRate = this.audioBitRate;
        exportConfig.audioAacProfile = this.audioAacProfile;
        exportConfig.audioChannelCount = this.audioChannelCount;
        exportConfig.audioSampleRateHz = this.audioSampleRateHz;
        exportConfig.audioEncodeNeedCodecSpecificData = this.audioEncodeNeedCodecSpecificData;
        exportConfig.colorRange = this.colorRange;
        exportConfig.colorStandard = this.colorStandard;
        exportConfig.colorTransfer = this.colorTransfer;
        exportConfig.hdrStaticInfo = this.hdrStaticInfo;
        exportConfig.correctSizeByCodecCapabilities = this.correctSizeByCodecCapabilities;
        exportConfig.suggestParallelCount = this.suggestParallelCount;
        return exportConfig;
    }

    private void setToVideoFormat(String str, ByteBuffer byteBuffer) {
        if (this.videoFormat == null) {
            getVideoFormat();
        }
        setToFormat(str, byteBuffer, this.videoFormat);
    }

    public ExportConfig(int i, int i2, int i3, int i4) {
        this.outputWidth = i;
        this.outputHeight = i2;
        this.renderWidth = i3;
        this.renderHeight = i4;
    }

    @Deprecated
    public ExportConfig(EncoderWriter.OutputConfig outputConfig) {
        this.outputWidth = outputConfig.VIDEO_TARGET_WIDTH;
        this.outputHeight = outputConfig.VIDEO_TARGET_HEIGHT;
        this.videoIFrameInterval = outputConfig.VIDEO_IFRAME_INTERVAL;
        this.videoBitRate = outputConfig.VIDEO_BIT_RATE;
        this.videoFrameRate = outputConfig.VIDEO_FRAME_RATE;
        this.highProfile = outputConfig.HIGH_PROFILE;
        this.audioChannelCount = outputConfig.AUDIO_CHANNEL_COUNT;
        this.audioBitRate = outputConfig.AUDIO_BIT_RATE;
        this.audioAacProfile = outputConfig.AUDIO_AAC_PROFILE;
    }
}
