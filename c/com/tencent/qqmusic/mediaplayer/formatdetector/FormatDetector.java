package com.tencent.qqmusic.mediaplayer.formatdetector;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.AudioRecognition;
import com.tencent.qqmusic.mediaplayer.NativeLibs;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public class FormatDetector {
    private static final String TAG = "FormatDetector";
    private static final FormatDetector mInstance = new FormatDetector();
    public static boolean sIsLoadSuccess;

    static {
        sIsLoadSuccess = false;
        sIsLoadSuccess = NativeLibs.loadAll(NativeLibs.audioCommon, NativeLibs.formatDetector);
    }

    public static AudioFormat.AudioType getAudioFormat(String str) {
        return getAudioFormat(str, true);
    }

    public static AudioFormat.AudioType getAudioType(String str) {
        AudioFormat.AudioType audioType = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (sIsLoadSuccess) {
            AudioFormat.AudioType audioFormat = getAudioFormat(str);
            if (AudioFormat.isAudioType(audioFormat)) {
                audioType = audioFormat;
            }
        }
        return !AudioFormat.isAudioType(audioType) ? getAudioTypeFromExtension(str.substring(str.lastIndexOf(46) + 1).toLowerCase()) : audioType;
    }

    public static AudioFormat.AudioType getAudioTypeFromExtension(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (AudioFormat.AudioType audioType : AudioFormat.AudioType.values()) {
            if (audioType.getExtension().equalsIgnoreCase(str)) {
                return audioType;
            }
        }
        return AudioFormat.AudioType.UNSUPPORT;
    }

    private native int getFormat(String str, boolean z);

    private native int getFormatFromDataSource(IDataSource iDataSource, boolean z);

    public static AudioFormat.AudioType getAudioFormat(String str, boolean z) {
        if (str != null) {
            try {
                return AudioFormat.getAudioType(mInstance.getFormat(str, z));
            } catch (UnsatisfiedLinkError e) {
                Logger.m21790e(TAG, (Throwable) e);
                return AudioRecognition.guessFormat(str);
            }
        } else {
            throw new IllegalArgumentException("filePath can't be null!");
        }
    }

    public static AudioFormat.AudioType getAudioFormat(IDataSource iDataSource, boolean z) {
        if (iDataSource != null) {
            AudioFormat.AudioType audioType = AudioFormat.AudioType.UNSUPPORT;
            try {
                return AudioFormat.getAudioType(mInstance.getFormatFromDataSource(iDataSource, z));
            } catch (UnsatisfiedLinkError e) {
                Logger.m21790e(TAG, (Throwable) e);
                return audioType;
            }
        } else {
            throw new IllegalArgumentException("dataSource can't be null!");
        }
    }

    public static AudioFormat.AudioType getAudioType(IDataSource iDataSource) {
        if (iDataSource != null) {
            AudioFormat.AudioType audioType = AudioFormat.AudioType.UNSUPPORT;
            if (!sIsLoadSuccess) {
                return audioType;
            }
            AudioFormat.AudioType audioFormat = getAudioFormat(iDataSource, false);
            return AudioFormat.isAudioType(audioFormat) ? audioFormat : audioType;
        }
        throw new IllegalArgumentException("dataSource can't be null!");
    }
}
