package p172io.clipworks.androidplus.media;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.clipworks.androidplus.media.MediaCodecUtil */
public class MediaCodecUtil {
    private static final int SDK_INT;
    private static final String TAG = "MediaCodecUtil";

    static {
        String str = Build.VERSION.CODENAME;
        SDK_INT = ExifInterface.LATITUDE_SOUTH.equals(str) ? 31 : "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
    }

    private MediaCodecUtil() {
    }

    private static synchronized List<MediaCodecInfo> getCodecInfos(String str, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        synchronized (MediaCodecUtil.class) {
            MediaCodecList mediaCodecList = new MediaCodecList(1);
            arrayList = new ArrayList();
            for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
                if (mediaCodecInfo.isEncoder() == z) {
                    try {
                        mediaCodecInfo.getCapabilitiesForType(str);
                        if (isHardwareAccelerated(mediaCodecInfo) == z2 && isSecureCodec(mediaCodecInfo) == z3) {
                            arrayList.add(mediaCodecInfo);
                            mediaCodecInfo.getName();
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    public static MediaCodecInfo getDecoderInfo(String str, boolean z, boolean z2) {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(str, z, z2);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<MediaCodecInfo> getDecoderInfos(String str, boolean z, boolean z2) {
        List<MediaCodecInfo> codecInfos;
        synchronized (MediaCodecUtil.class) {
            codecInfos = getCodecInfos(str, false, z, z2);
        }
        return codecInfos;
    }

    public static synchronized List<MediaCodecInfo> getEncoderInfos(String str, boolean z, boolean z2) {
        List<MediaCodecInfo> codecInfos;
        synchronized (MediaCodecUtil.class) {
            codecInfos = getCodecInfos(str, true, z, z2);
        }
        return codecInfos;
    }

    private static boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo) {
        return SDK_INT >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo);
    }

    private static boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean isSecureCodec(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.getName().endsWith(".secure");
    }

    private static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
        if (SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase();
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || (!lowerCase.startsWith("omx.") && !lowerCase.startsWith("c2."));
    }

    private static boolean isSoftwareOnlyV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean isVendor(MediaCodecInfo mediaCodecInfo) {
        if (SDK_INT >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase();
        return !lowerCase.startsWith("omx.google.") && !lowerCase.startsWith("c2.android.") && !lowerCase.startsWith("c2.google.");
    }

    private static boolean isVendorV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }
}
