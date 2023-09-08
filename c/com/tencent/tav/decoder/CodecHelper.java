package com.tencent.tav.decoder;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.Range;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.extractor.AssetExtractor;
import java.util.ArrayList;
import java.util.List;

public class CodecHelper {
    public static int HARD_CODE_PARALLEL_COUNT = -1;
    public static final int MAX_BIT_RATE = 8000000;
    private static final String TAG = "CodecHelper";

    public static boolean checkAudioOutSupported(int i, int i2, int i3, String str) {
        boolean z;
        List<MediaCodecInfo> encoderCodecInfo = encoderCodecInfo(str);
        if (encoderCodecInfo.size() > 0) {
            for (MediaCodecInfo capabilitiesForType : encoderCodecInfo) {
                MediaCodecInfo.AudioCapabilities audioCapabilities = capabilitiesForType.getCapabilitiesForType(str).getAudioCapabilities();
                boolean contains = audioCapabilities.getBitrateRange().contains(Integer.valueOf(i));
                boolean z2 = audioCapabilities.getMaxInputChannelCount() >= i2;
                Range[] supportedSampleRateRanges = audioCapabilities.getSupportedSampleRateRanges();
                int length = supportedSampleRateRanges.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        z = false;
                        break;
                    } else if (supportedSampleRateRanges[i4].contains(Integer.valueOf(i3))) {
                        z = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (contains && z2 && z) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkVideoOutSupported(int i, int i2, int i3, int i4, String str) {
        List<MediaCodecInfo> encoderCodecInfo = encoderCodecInfo(str);
        if (encoderCodecInfo.size() <= 0) {
            return false;
        }
        for (MediaCodecInfo capabilitiesForType : encoderCodecInfo) {
            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getCapabilitiesForType(str).getVideoCapabilities();
            boolean contains = videoCapabilities.getBitrateRange().contains(Integer.valueOf(i4));
            boolean contains2 = videoCapabilities.getSupportedFrameRates().contains(Integer.valueOf(i3));
            boolean isSizeSupported = videoCapabilities.isSizeSupported(i, i2);
            if (contains && contains2 && isSizeSupported) {
                return true;
            }
        }
        return false;
    }

    public static int clampHeight(MediaCodecInfo mediaCodecInfo, String str, int i) {
        return mediaCodecInfo == null ? i : mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getSupportedHeights().clamp(Integer.valueOf(i)).intValue();
    }

    public static int clampWidth(MediaCodecInfo mediaCodecInfo, String str, int i) {
        return mediaCodecInfo == null ? i : mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getSupportedWidths().clamp(Integer.valueOf(i)).intValue();
    }

    public static CGSize correctSupportSize(CGSize cGSize, String str) {
        int i = (int) cGSize.width;
        int i2 = (int) cGSize.height;
        int codecCount = MediaCodecList.getCodecCount();
        MediaCodecInfo mediaCodecInfo = null;
        for (int i3 = 0; i3 < codecCount && mediaCodecInfo == null; i3++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                boolean z = false;
                for (int i4 = 0; i4 < supportedTypes.length && !z; i4++) {
                    if (supportedTypes[i4].equals(str)) {
                        z = true;
                    }
                }
                if (z) {
                    mediaCodecInfo = codecInfoAt;
                }
            }
        }
        int widthAlignment = getWidthAlignment(mediaCodecInfo, str);
        int heightAlignment = getHeightAlignment(mediaCodecInfo, str);
        float f = (float) i;
        int ceil = (int) (Math.ceil((double) ((f * 1.0f) / ((float) widthAlignment))) * ((double) widthAlignment));
        float f2 = (float) i2;
        int ceil2 = (int) (Math.ceil((double) ((f2 * 1.0f) / ((float) heightAlignment))) * ((double) heightAlignment));
        String str2 = TAG;
        Logger.m144641d(str2, "correctSupportSize 1: target = [" + ceil + ", " + ceil2 + "]");
        int clampWidth = clampWidth(mediaCodecInfo, str, i);
        if (ceil != clampWidth) {
            ceil2 = (int) (((float) ceil2) * ((((float) clampWidth) * 1.0f) / ((float) ceil)));
            ceil = clampWidth;
        }
        Logger.m144641d(str2, "correctSupportSize 2: target = [" + ceil + ", " + ceil2 + "]");
        int clampHeight = clampHeight(mediaCodecInfo, str, i2);
        if (ceil2 != clampHeight) {
            ceil = (int) (((float) ceil) * ((((float) clampHeight) * 1.0f) / ((float) ceil2)));
            ceil2 = clampHeight;
        }
        Logger.m144641d(str2, "correctSupportSize 3: target = [" + ceil + ", " + ceil2 + "]");
        if (!isSupported(mediaCodecInfo, str, ceil, ceil2)) {
            ceil = (int) (Math.ceil((double) (f / 16.0f)) * 16.0d);
            ceil2 = (int) (Math.ceil((double) (f2 / 16.0f)) * 16.0d);
        }
        Logger.m144646i(str2, "correctSupportSize return: target = [" + ceil + ", " + ceil2 + "]");
        return new CGSize((float) ceil, (float) ceil2);
    }

    private static List<MediaCodecInfo> decoderCodecInfo(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (supportedTypes[i2].equals(str)) {
                        arrayList.add(codecInfoAt);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<MediaCodecInfo> encoderCodecInfo(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (supportedTypes[i2].equals(str)) {
                        arrayList.add(codecInfoAt);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    private static int getHeightAlignment(MediaCodecInfo mediaCodecInfo, String str) {
        if (mediaCodecInfo != null) {
            return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getHeightAlignment();
        }
        return 16;
    }

    public static int getSupportMaxParallelCount(String str) {
        int i = HARD_CODE_PARALLEL_COUNT;
        if (i >= 0) {
            Logger.m144647i(TAG, "hardcode parallel count %d", Integer.valueOf(i));
            return HARD_CODE_PARALLEL_COUNT;
        }
        AssetExtractor assetExtractor = new AssetExtractor();
        assetExtractor.setDataSource(str);
        int firstTrackIndex = DecoderUtils.getFirstTrackIndex(assetExtractor, "video/");
        if (firstTrackIndex < 0) {
            return 0;
        }
        assetExtractor.selectTrack(firstTrackIndex);
        MediaFormat trackFormat = assetExtractor.getTrackFormat(firstTrackIndex);
        int integer = trackFormat.containsKey("width") ? trackFormat.getInteger("width") : 0;
        int integer2 = trackFormat.containsKey("height") ? trackFormat.getInteger("height") : 0;
        int integer3 = trackFormat.containsKey("frame-rate") ? trackFormat.getInteger("frame-rate") : 30;
        long integer4 = trackFormat.containsKey(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) ? (long) trackFormat.getInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) : 0;
        String string = trackFormat.getString("mime");
        assetExtractor.dispose();
        return getSupportMaxParallelCount(integer, integer2, integer3, integer4, string);
    }

    private static int getWidthAlignment(MediaCodecInfo mediaCodecInfo, String str) {
        if (mediaCodecInfo != null) {
            return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getWidthAlignment();
        }
        return 16;
    }

    private static boolean isSupported(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        return mediaCodecInfo != null && mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().isSizeSupported(i, i2);
    }

    public static MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void selectProfileAndLevel(MediaFormat mediaFormat) {
        selectProfileAndLevel(mediaFormat, false);
    }

    public static void selectProfileAndLevel(MediaFormat mediaFormat, boolean z) {
        int i;
        int i2;
        MediaCodecInfo selectCodec = selectCodec("video/avc");
        if (selectCodec != null) {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = selectCodec.getCapabilitiesForType("video/avc");
            int i3 = -1;
            if (capabilitiesForType.profileLevels != null) {
                i = -1;
                int i4 = 0;
                while (true) {
                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                    if (i4 >= codecProfileLevelArr.length) {
                        break;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i4];
                    int i5 = codecProfileLevel.profile;
                    if (i5 <= 8) {
                        if (i5 > i3) {
                            i = codecProfileLevel.level;
                            i3 = i5;
                        } else if (i5 == i3 && (i2 = codecProfileLevel.level) > i) {
                            i = i2;
                        }
                    }
                    i4++;
                }
            } else {
                i = -1;
            }
            if (i3 == 8) {
                if (z && i >= 65536) {
                    i = 65536;
                }
                mediaFormat.setInteger(Scopes.PROFILE, i3);
                mediaFormat.setInteger(FirebaseAnalytics.C113379b.LEVEL, i);
                Logger.m144646i(TAG, String.format("selectProfileAndLevel: 0x%x, 0x%x", new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}));
            }
        }
    }

    public static int getSupportMaxParallelCount(int i, int i2, int i3, long j, String str) {
        int i4;
        int i5;
        String str2 = TAG;
        boolean z = false;
        Logger.m144647i(str2, "getSupportMaxParallelCount print width:%d height:%d frameRate:%d bitRate:%d bitRate:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j), str);
        int i6 = HARD_CODE_PARALLEL_COUNT;
        if (i6 >= 0) {
            Logger.m144647i(str2, "hardcode parallel count %d", Integer.valueOf(i6));
            return HARD_CODE_PARALLEL_COUNT;
        }
        MediaCodecInfo selectCodec = selectCodec(str);
        if (selectCodec == null) {
            Logger.m144643e(str2, "CodecHelper.selectCodec null");
            return 0;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = selectCodec.getCapabilitiesForType(str).getVideoCapabilities();
        Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
        Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
        if (supportedWidths == null || supportedHeights == null) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(supportedWidths == null);
            if (supportedHeights == null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            Logger.m144645e(str2, "getSupportMaxParallelCount size range error.width null[%b] height null[%b]", objArr);
            return 1;
        }
        Logger.m144647i(str2, "getSupportMaxParallelCount widthRange:%s heightRange:%s", supportedWidths, supportedHeights);
        if (!videoCapabilities.isSizeSupported(i, i2)) {
            Logger.m144643e(str2, "isSizeSupported false1");
            i += (videoCapabilities.getWidthAlignment() + i) % videoCapabilities.getWidthAlignment();
            i2 += (videoCapabilities.getHeightAlignment() + i2) % videoCapabilities.getHeightAlignment();
        }
        if (!videoCapabilities.isSizeSupported(i, i2)) {
            Logger.m144643e(str2, "isSizeSupported false2");
            return -1;
        }
        Range<Double> supportedFrameRatesFor = videoCapabilities.getSupportedFrameRatesFor(i, i2);
        Logger.m144647i(str2, "getSupportMaxParallelCount frameRange:%s", supportedFrameRatesFor);
        if (i3 <= 0) {
            i4 = 0;
        } else {
            i4 = (int) (supportedFrameRatesFor.getUpper().doubleValue() / ((double) i3));
        }
        Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
        Logger.m144647i(str2, "getSupportMaxParallelCount BitrateRange:%s", bitrateRange);
        if (j <= 0) {
            i5 = i4;
        } else {
            i5 = (int) (((long) bitrateRange.getUpper().intValue()) / j);
        }
        Logger.m144647i(str2, "getSupportMaxParallelCount frameMaxCount:%d bitrateMaxCount:%d", Integer.valueOf(i4), Integer.valueOf(i5));
        return i4 / 2;
    }
}
