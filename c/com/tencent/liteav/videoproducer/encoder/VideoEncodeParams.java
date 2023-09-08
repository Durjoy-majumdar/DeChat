package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;

@JNINamespace("liteav::video")
public final class VideoEncodeParams implements Cloneable {
    public boolean annexb = true;
    public long baseFrameIndex = 0;
    public long baseGopIndex = 0;
    public int bitrate = 0;
    public VideoEncoderDef.BitrateMode bitrateMode = VideoEncoderDef.BitrateMode.CBR;
    public CodecType codecType = CodecType.H264;
    public boolean enableBFrame = false;
    public VideoEncoderDef.EncoderProfile encoderProfile = null;
    public int fps = 20;
    public boolean fullIFrame = false;
    public int gop = 3;
    public int height = 0;
    public boolean isTranscodingMode = false;
    public JSONArray mediaCodecDeviceRelatedParams = null;
    public VideoEncoderDef.ReferenceStrategy referenceStrategy = VideoEncoderDef.ReferenceStrategy.FIX_GOP;
    public int width = 0;

    public VideoEncodeParams() {
    }

    private int checkFieldDiffCounts(Object obj, Object obj2) {
        int i = 0;
        for (Field field : VideoEncodeParams.class.getDeclaredFields()) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                if (!CommonUtil.equals(field.get(obj), field.get(obj2))) {
                    i++;
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return i;
    }

    public static VideoEncoderDef.BitrateMode createEncoderBitrateMode(int i) {
        return VideoEncoderDef.BitrateMode.m17550a(i);
    }

    public static VideoEncoderDef.EncoderProfile createEncoderProfileType(int i) {
        return VideoEncoderDef.EncoderProfile.m17552a(i);
    }

    public static CodecType createEncoderVideoCodec(int i) {
        return CodecType.m17046a(i);
    }

    public static VideoEncoderDef.ReferenceStrategy createReferenceStrategy(int i) {
        return VideoEncoderDef.ReferenceStrategy.m17553a(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof VideoEncodeParams) && checkFieldDiffCounts(this, obj) == 0;
    }

    public final long getBaseFrameIndex() {
        return this.baseFrameIndex;
    }

    public final long getBaseGopIndex() {
        return this.baseGopIndex;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getBitrateMode() {
        return this.bitrateMode.mValue;
    }

    public final int getCodecType() {
        return this.codecType.mValue;
    }

    public final int getEncoderProfile() {
        return this.encoderProfile.mValue;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getGop() {
        return this.gop;
    }

    public final int getHeight() {
        return this.height;
    }

    public final JSONArray getMediaCodecDeviceRelatedParams() {
        return this.mediaCodecDeviceRelatedParams;
    }

    public final VideoEncoderDef.ReferenceStrategy getReferenceStrategy() {
        return this.referenceStrategy;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAnnexb() {
        return this.annexb;
    }

    public final boolean isEnablesBframe() {
        return this.enableBFrame;
    }

    public final boolean isEnablesRps() {
        return this.referenceStrategy == VideoEncoderDef.ReferenceStrategy.RPS;
    }

    public final boolean isFullIFrame() {
        return this.fullIFrame;
    }

    public final boolean isTranscodingMode() {
        return this.isTranscodingMode;
    }

    public final void setAnnexb(boolean z) {
        this.annexb = z;
    }

    public final void setBFrameEnabled(boolean z) {
        this.enableBFrame = z;
    }

    public final void setBaseFrameIndex(long j) {
        this.baseFrameIndex = j;
    }

    public final void setBaseGopIndex(long j) {
        this.baseGopIndex = j;
    }

    public final void setBitrate(int i) {
        this.bitrate = i;
    }

    public final void setBitrateMode(VideoEncoderDef.BitrateMode bitrateMode2) {
        this.bitrateMode = bitrateMode2;
    }

    public final void setCodecType(CodecType codecType2) {
        this.codecType = codecType2;
    }

    public final void setEncoderProfile(VideoEncoderDef.EncoderProfile encoderProfile2) {
        this.encoderProfile = encoderProfile2;
    }

    public final void setFps(int i) {
        this.fps = i;
    }

    public final void setFullIFrame(boolean z) {
        this.fullIFrame = z;
    }

    public final void setGop(int i) {
        this.gop = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setMediaCodecDeviceRelatedParams(JSONArray jSONArray) {
        this.mediaCodecDeviceRelatedParams = jSONArray;
    }

    public final void setReferenceStrategy(VideoEncoderDef.ReferenceStrategy referenceStrategy2) {
        this.referenceStrategy = referenceStrategy2;
    }

    public final void setTranscodingModeEnabled(boolean z) {
        this.isTranscodingMode = z;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final String toString() {
        return "width=" + this.width + ", height=" + this.height + ", fps=" + this.fps + ", gop=" + this.gop + ", bitrate=" + this.bitrate + ", annexb=" + this.annexb + ", encoderProfile=" + this.encoderProfile + ", bitrateMode=" + this.bitrateMode + ", baseFrameIndex=" + this.baseFrameIndex + ", baseGopIndex=" + this.baseGopIndex + ", fullIFrame=" + this.fullIFrame + ", enableBFrame=" + this.enableBFrame + ", referenceStrategy=" + this.referenceStrategy + ", codecType=" + this.codecType + ", isTransCodingMode=" + this.isTranscodingMode + ", mediaCodecDeviceRelatedParams=" + this.mediaCodecDeviceRelatedParams;
    }

    public VideoEncodeParams(VideoEncodeParams videoEncodeParams) {
        if (videoEncodeParams != null) {
            this.width = videoEncodeParams.width;
            this.height = videoEncodeParams.height;
            this.fps = videoEncodeParams.fps;
            this.gop = videoEncodeParams.gop;
            this.bitrate = videoEncodeParams.bitrate;
            this.annexb = videoEncodeParams.annexb;
            this.encoderProfile = videoEncodeParams.encoderProfile;
            this.bitrateMode = videoEncodeParams.bitrateMode;
            this.baseFrameIndex = videoEncodeParams.baseFrameIndex;
            this.baseGopIndex = videoEncodeParams.baseGopIndex;
            this.fullIFrame = videoEncodeParams.fullIFrame;
            this.enableBFrame = videoEncodeParams.enableBFrame;
            this.codecType = videoEncodeParams.codecType;
            this.referenceStrategy = videoEncodeParams.referenceStrategy;
            this.isTranscodingMode = videoEncodeParams.isTranscodingMode;
            if (videoEncodeParams.mediaCodecDeviceRelatedParams != null) {
                try {
                    this.mediaCodecDeviceRelatedParams = new JSONArray(videoEncodeParams.mediaCodecDeviceRelatedParams.toString());
                } catch (JSONException unused) {
                }
            }
        }
    }
}
