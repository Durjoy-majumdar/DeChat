package androidx.camera.core.impl;

import android.media.CamcorderProfile;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;

public abstract class CamcorderProfileProxy {
    public static int CODEC_PROFILE_NONE = -1;

    public static CamcorderProfileProxy create(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16, int i17) {
        return new AutoValue_CamcorderProfileProxy(i, i2, i3, i4, i5, i6, i7, i8, i9, i15, i16, i17);
    }

    public static CamcorderProfileProxy fromCamcorderProfile(CamcorderProfile camcorderProfile) {
        return new AutoValue_CamcorderProfileProxy(camcorderProfile.duration, camcorderProfile.quality, camcorderProfile.fileFormat, camcorderProfile.videoCodec, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, camcorderProfile.audioCodec, camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels);
    }

    public abstract int getAudioBitRate();

    public abstract int getAudioChannels();

    public abstract int getAudioCodec();

    public String getAudioCodecMimeType() {
        switch (getAudioCodec()) {
            case 1:
                return MimeTypes.AUDIO_AMR_NB;
            case 2:
                return MimeTypes.AUDIO_AMR_WB;
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return MimeTypes.AUDIO_VORBIS;
            case 7:
                return MimeTypes.AUDIO_OPUS;
            default:
                return null;
        }
    }

    public abstract int getAudioSampleRate();

    public abstract int getDuration();

    public abstract int getFileFormat();

    public abstract int getQuality();

    public int getRequiredAudioProfile() {
        int audioCodec = getAudioCodec();
        if (audioCodec == 3) {
            return 2;
        }
        if (audioCodec == 4) {
            return 5;
        }
        if (audioCodec != 5) {
            return CODEC_PROFILE_NONE;
        }
        return 39;
    }

    public abstract int getVideoBitRate();

    public abstract int getVideoCodec();

    public String getVideoCodecMimeType() {
        int videoCodec = getVideoCodec();
        if (videoCodec == 1) {
            return MimeTypes.VIDEO_H263;
        }
        if (videoCodec == 2) {
            return "video/avc";
        }
        if (videoCodec == 3) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (videoCodec == 4) {
            return "video/x-vnd.on2.vp8";
        }
        if (videoCodec != 5) {
            return null;
        }
        return "video/hevc";
    }

    public abstract int getVideoFrameHeight();

    public abstract int getVideoFrameRate();

    public abstract int getVideoFrameWidth();
}
