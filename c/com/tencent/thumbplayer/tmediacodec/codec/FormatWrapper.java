package com.tencent.thumbplayer.tmediacodec.codec;

import android.media.MediaFormat;
import com.tencent.thumbplayer.tmediacodec.util.LogUtils;
import com.tencent.thumbplayer.tmediacodec.util.TUtils;
import java.util.ArrayList;

public final class FormatWrapper {
    public static final int NO_VALUE = -1;
    public static final String TAG = "FormatWrapper";
    public int channelCount;
    public int height = -1;
    public ArrayList<byte[]> initializationData = new ArrayList<>();
    private boolean isVideo;
    private boolean isVideoFieldInit;
    public int maxHeight = -1;
    public int maxInputSize = -1;
    public int maxWidth = -1;
    public int rotationDegrees;
    public final String sampleMimeType;
    public int sampleRate;
    public int width = -1;

    public FormatWrapper(String str) {
        this.sampleMimeType = str;
    }

    private static String configCsdArray(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(", length:");
        sb.append(bArr.length);
        sb.append("  [");
        for (int i = 0; i < Math.min(bArr.length, 20); i++) {
            if (i != 0) {
                sb.append(" ,");
            }
            sb.append(bArr[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public static FormatWrapper create(MediaFormat mediaFormat) {
        FormatWrapper formatWrapper = new FormatWrapper(mediaFormat.getString("mime"));
        try {
            formatWrapper.sampleRate = getInteger(mediaFormat, "sample-rate");
            formatWrapper.maxInputSize = getInteger(mediaFormat, "max-input-size");
            formatWrapper.initializationData = TUtils.getCsdBuffers(mediaFormat);
            if (formatWrapper.isVideo()) {
                formatWrapper.rotationDegrees = getInteger(mediaFormat, "rotation-degrees");
                formatWrapper.width = getInteger(mediaFormat, "width");
                formatWrapper.height = getInteger(mediaFormat, "height");
                formatWrapper.maxWidth = getInteger(mediaFormat, "max-width");
                formatWrapper.maxHeight = getInteger(mediaFormat, "max-height");
            } else {
                formatWrapper.channelCount = getInteger(mediaFormat, "channel-count");
            }
        } catch (Throwable th) {
            LogUtils.m21883e(TAG, "create format error", th);
        }
        return formatWrapper;
    }

    public static void dumpCsdArray(ArrayList<byte[]> arrayList) {
        if (arrayList != null && LogUtils.isLogEnable()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append(configCsdArray(TUtils.CSD_INDEX_ARRAY[i], arrayList.get(i)));
                sb.append("\n");
            }
            LogUtils.m21881d(TAG, "csdData size:" + arrayList.size() + "    " + sb.toString());
        }
    }

    public static int getInteger(MediaFormat mediaFormat, String str) {
        return getInteger(mediaFormat, str, -1);
    }

    public final boolean initializationDataEquals(FormatWrapper formatWrapper) {
        if (this.initializationData.size() != formatWrapper.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < this.initializationData.size(); i++) {
            if (!this.initializationData.get(i).equals(formatWrapper.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean isVideo() {
        if (!this.isVideoFieldInit) {
            this.isVideoFieldInit = true;
            this.isVideo = TUtils.isVideo(this.sampleMimeType);
        }
        return this.isVideo;
    }

    public static int getInteger(MediaFormat mediaFormat, String str, int i) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i;
    }
}
