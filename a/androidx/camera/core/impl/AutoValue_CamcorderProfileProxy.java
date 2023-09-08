package androidx.camera.core.impl;

final class AutoValue_CamcorderProfileProxy extends CamcorderProfileProxy {
    private final int audioBitRate;
    private final int audioChannels;
    private final int audioCodec;
    private final int audioSampleRate;
    private final int duration;
    private final int fileFormat;
    private final int quality;
    private final int videoBitRate;
    private final int videoCodec;
    private final int videoFrameHeight;
    private final int videoFrameRate;
    private final int videoFrameWidth;

    public AutoValue_CamcorderProfileProxy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16, int i17) {
        this.duration = i;
        this.quality = i2;
        this.fileFormat = i3;
        this.videoCodec = i4;
        this.videoBitRate = i5;
        this.videoFrameRate = i6;
        this.videoFrameWidth = i7;
        this.videoFrameHeight = i8;
        this.audioCodec = i9;
        this.audioBitRate = i15;
        this.audioSampleRate = i16;
        this.audioChannels = i17;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CamcorderProfileProxy)) {
            return false;
        }
        CamcorderProfileProxy camcorderProfileProxy = (CamcorderProfileProxy) obj;
        return this.duration == camcorderProfileProxy.getDuration() && this.quality == camcorderProfileProxy.getQuality() && this.fileFormat == camcorderProfileProxy.getFileFormat() && this.videoCodec == camcorderProfileProxy.getVideoCodec() && this.videoBitRate == camcorderProfileProxy.getVideoBitRate() && this.videoFrameRate == camcorderProfileProxy.getVideoFrameRate() && this.videoFrameWidth == camcorderProfileProxy.getVideoFrameWidth() && this.videoFrameHeight == camcorderProfileProxy.getVideoFrameHeight() && this.audioCodec == camcorderProfileProxy.getAudioCodec() && this.audioBitRate == camcorderProfileProxy.getAudioBitRate() && this.audioSampleRate == camcorderProfileProxy.getAudioSampleRate() && this.audioChannels == camcorderProfileProxy.getAudioChannels();
    }

    public int getAudioBitRate() {
        return this.audioBitRate;
    }

    public int getAudioChannels() {
        return this.audioChannels;
    }

    public int getAudioCodec() {
        return this.audioCodec;
    }

    public int getAudioSampleRate() {
        return this.audioSampleRate;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getFileFormat() {
        return this.fileFormat;
    }

    public int getQuality() {
        return this.quality;
    }

    public int getVideoBitRate() {
        return this.videoBitRate;
    }

    public int getVideoCodec() {
        return this.videoCodec;
    }

    public int getVideoFrameHeight() {
        return this.videoFrameHeight;
    }

    public int getVideoFrameRate() {
        return this.videoFrameRate;
    }

    public int getVideoFrameWidth() {
        return this.videoFrameWidth;
    }

    public int hashCode() {
        return ((((((((((((((((((((((this.duration ^ 1000003) * 1000003) ^ this.quality) * 1000003) ^ this.fileFormat) * 1000003) ^ this.videoCodec) * 1000003) ^ this.videoBitRate) * 1000003) ^ this.videoFrameRate) * 1000003) ^ this.videoFrameWidth) * 1000003) ^ this.videoFrameHeight) * 1000003) ^ this.audioCodec) * 1000003) ^ this.audioBitRate) * 1000003) ^ this.audioSampleRate) * 1000003) ^ this.audioChannels;
    }

    public String toString() {
        return "CamcorderProfileProxy{duration=" + this.duration + ", quality=" + this.quality + ", fileFormat=" + this.fileFormat + ", videoCodec=" + this.videoCodec + ", videoBitRate=" + this.videoBitRate + ", videoFrameRate=" + this.videoFrameRate + ", videoFrameWidth=" + this.videoFrameWidth + ", videoFrameHeight=" + this.videoFrameHeight + ", audioCodec=" + this.audioCodec + ", audioBitRate=" + this.audioBitRate + ", audioSampleRate=" + this.audioSampleRate + ", audioChannels=" + this.audioChannels + "}";
    }
}
