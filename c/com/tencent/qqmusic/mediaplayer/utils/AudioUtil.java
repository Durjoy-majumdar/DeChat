package com.tencent.qqmusic.mediaplayer.utils;

import android.media.AudioTrack;
import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.AudioRecognition;
import com.tencent.qqmusic.mediaplayer.audioplaylist.AudioPlayListItemInfo;
import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.codec.NativeDecoder;
import com.tencent.qqmusic.mediaplayer.seektable.NativeSeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public class AudioUtil {
    private static final int DEFAULT_DECODE_BUFFER_SIZE = 8192;
    private static final String TAG = "AudioUtil";

    public static int getDecodeBufferSize(NativeDecoder nativeDecoder) {
        AudioInformation audioInformation = nativeDecoder.getAudioInformation();
        int minBufferSize = (audioInformation == null || audioInformation.getAudioType() != AudioFormat.AudioType.FLAC) ? 0 : (int) nativeDecoder.getMinBufferSize();
        if (minBufferSize <= 0) {
            return 8192;
        }
        return minBufferSize;
    }

    public static int getDecodeBufferSizeForPlay(NativeDecoder nativeDecoder) {
        int decodeBufferSize = getDecodeBufferSize(nativeDecoder);
        AudioInformation audioInformation = nativeDecoder.getAudioInformation();
        if (audioInformation == null || audioInformation.getAudioType() == AudioFormat.AudioType.FLAC) {
            return decodeBufferSize;
        }
        int channels = audioInformation.getChannels();
        int i = 2;
        int i2 = 12;
        if (channels == 1) {
            i2 = 4;
        } else if (channels != 2) {
            if (channels == 6) {
                i2 = 252;
            } else if (channels == 8) {
                i2 = 1020;
            }
        }
        if (audioInformation.getBitDepth() == 1) {
            i = 3;
        }
        return Math.max(AudioTrack.getMinBufferSize((int) audioInformation.getSampleRate(), i2, i), decodeBufferSize);
    }

    public static NativeDecoder getDecoder(String str, boolean z, long j, long j2) {
        return z ? getDecoderFromTrack(str, j, j2) : AudioRecognition.getDecoderFormFile(str);
    }

    public static NativeDecoder getDecoderFromTrack(String str, long j, long j2) {
        if (TextUtils.isEmpty(str) || j >= j2) {
            return null;
        }
        NativeDecoder nativeDecoder = new NativeDecoder();
        TrackInfo trackInfo = new TrackInfo(AudioPlayListItemInfo.TYPE_CUE);
        trackInfo.setFilePath(str);
        trackInfo.setStartPosition(j);
        trackInfo.setEndPostion(j2);
        try {
            TrackDataSource trackDataSource = new TrackDataSource(trackInfo);
            if (nativeDecoder.init((IDataSource) trackDataSource) != 0) {
                Logger.m21787e(TAG, "init decoder from track failed!");
                return null;
            }
            long seek = new NativeSeekTable(nativeDecoder).seek(j2);
            if (seek <= 0) {
                Logger.m21787e(TAG, "endPos from track <= 0");
                return null;
            }
            trackDataSource.setEndBytePosition(seek);
            nativeDecoder.seekTo((int) j);
            return nativeDecoder;
        } catch (Exception e) {
            Logger.m21790e(TAG, (Throwable) e);
            return null;
        }
    }

    public static int getPlaybackHeadPositionSafely(AudioTrack audioTrack) {
        if (audioTrack != null) {
            try {
                return audioTrack.getPlaybackHeadPosition();
            } catch (Exception e) {
                Logger.m21788e(TAG, "getPlaybackHeadPositionSafely", (Throwable) e);
            }
        }
        return 0;
    }
}
