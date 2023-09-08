package com.tencent.thumbplayer.tmediacodec.util;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.tencent.thumbplayer.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper;
import com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class TUtils {
    public static final String CSD_0 = "csd-0";
    public static final String CSD_1 = "csd-1";
    public static final String CSD_2 = "csd-2";
    public static final String[] CSD_INDEX_ARRAY = {CSD_0, CSD_1, CSD_2};
    public static final String TAG = "TUtils";
    private static final Set<String> sBlackDevices;
    private static boolean sDeviceNeedsSetOutputSurfaceWorkaround;
    private static boolean sEvaluatedDeviceNeedsSetOutputSurfaceWorkaround;

    static {
        HashSet hashSet = new HashSet();
        sBlackDevices = hashSet;
        hashSet.add("1601");
        hashSet.add("1713");
        hashSet.add("1714");
        hashSet.add("A10-70F");
        hashSet.add("A10-70L");
        hashSet.add("A1601");
        hashSet.add("A2016a40");
        hashSet.add("A7000-a");
        hashSet.add("A7000plus");
        hashSet.add("A7010a48");
        hashSet.add("A7020a48");
        hashSet.add("AquaPowerM");
        hashSet.add("ASUS_X00AD_2");
        hashSet.add("Aura_Note_2");
        hashSet.add("BLACK-1X");
        hashSet.add("BRAVIA_ATV2");
        hashSet.add("BRAVIA_ATV3_4K");
        hashSet.add("C1");
        hashSet.add("ComioS1");
        hashSet.add("CP8676_I02");
        hashSet.add("CPH1609");
        hashSet.add("CPY83_I00");
        hashSet.add("cv1");
        hashSet.add("cv3");
        hashSet.add("deb");
        hashSet.add("E5643");
        hashSet.add("ELUGA_A3_Pro");
        hashSet.add("ELUGA_Note");
        hashSet.add("ELUGA_Prim");
        hashSet.add("ELUGA_Ray_X");
        hashSet.add("EverStar_S");
        hashSet.add("F3111");
        hashSet.add("F3113");
        hashSet.add("F3116");
        hashSet.add("F3211");
        hashSet.add("F3213");
        hashSet.add("F3215");
        hashSet.add("F3311");
        hashSet.add("flo");
        hashSet.add("fugu");
        hashSet.add("GiONEE_CBL7513");
        hashSet.add("GiONEE_GBL7319");
        hashSet.add("GIONEE_GBL7360");
        hashSet.add("GIONEE_SWW1609");
        hashSet.add("GIONEE_SWW1627");
        hashSet.add("GIONEE_SWW1631");
        hashSet.add("GIONEE_WBL5708");
        hashSet.add("GIONEE_WBL7365");
        hashSet.add("GIONEE_WBL7519");
        hashSet.add("griffin");
        hashSet.add("htc_e56ml_dtul");
        hashSet.add("hwALE-H");
        hashSet.add("HWBLN-H");
        hashSet.add("HWCAM-H");
        hashSet.add("HWVNS-H");
        hashSet.add("HWWAS-H");
        hashSet.add("i9031");
        hashSet.add("iball8735_9806");
        hashSet.add("Infinix-X572");
        hashSet.add("iris60");
        hashSet.add("itel_S41");
        hashSet.add("j2xlteins");
        hashSet.add("JGZ");
        hashSet.add("K50a40");
        hashSet.add("kate");
        hashSet.add("l5460");
        hashSet.add("le_x6");
        hashSet.add("LS-5017");
        hashSet.add("M5c");
        hashSet.add("manning");
        hashSet.add("marino_f");
        hashSet.add("MEIZU_M5");
        hashSet.add("mh");
        hashSet.add("mido");
        hashSet.add("c");
        hashSet.add("namath");
        hashSet.add("nicklaus_f");
        hashSet.add("NX541J");
        hashSet.add("NX573J");
        hashSet.add("OnePlus5T");
        hashSet.add("p212");
        hashSet.add("P681");
        hashSet.add("P85");
        hashSet.add("panell_d");
        hashSet.add("panell_dl");
        hashSet.add("panell_ds");
        hashSet.add("panell_dt");
        hashSet.add("PB2-670M");
        hashSet.add("PGN528");
        hashSet.add("PGN610");
        hashSet.add("PGN611");
        hashSet.add("Phantom6");
        hashSet.add("Pixi4-7_3G");
        hashSet.add("Pixi5-10_4G");
        hashSet.add("PLE");
        hashSet.add("PRO7S");
        hashSet.add("Q350");
        hashSet.add("Q4260");
        hashSet.add("Q427");
        hashSet.add("Q4310");
        hashSet.add("Q5");
        hashSet.add("QM16XE_U");
        hashSet.add("QX1");
        hashSet.add("santoni");
        hashSet.add("Slate_Pro");
        hashSet.add("SVP-DTV15");
        hashSet.add("s905x018");
        hashSet.add("taido_row");
        hashSet.add("TB3-730F");
        hashSet.add("TB3-730X");
        hashSet.add("TB3-850F");
        hashSet.add("TB3-850M");
        hashSet.add("tcl_eu");
        hashSet.add("V1");
        hashSet.add("V23GB");
        hashSet.add("V5");
        hashSet.add("vernee_M5");
        hashSet.add("watson");
        hashSet.add("whyred");
        hashSet.add("woods_f");
        hashSet.add("woods_fn");
        hashSet.add("X3_HK");
        hashSet.add("XE2X");
        hashSet.add("XT1663");
        hashSet.add("Z12_PRO");
        hashSet.add("Z80");
    }

    public static int ceilDivide(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static boolean codecNeedsSetOutputSurfaceWorkaround() {
        synchronized (TUtils.class) {
            if (!sEvaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                String str = Build.DEVICE;
                if ("dangal".equals(str)) {
                    sDeviceNeedsSetOutputSurfaceWorkaround = true;
                } else {
                    int i = Build.VERSION.SDK_INT;
                    if (i <= 27 && "HWEML".equals(str)) {
                        sDeviceNeedsSetOutputSurfaceWorkaround = true;
                    } else if (i < 27) {
                        if (sBlackDevices.contains(str)) {
                            sDeviceNeedsSetOutputSurfaceWorkaround = true;
                        }
                        String deviceName = TPSystemInfo.getDeviceName();
                        char c = 65535;
                        int hashCode = deviceName.hashCode();
                        if (hashCode != -594534941) {
                            if (hashCode != 2006354) {
                                if (hashCode == 2006367) {
                                    if (deviceName.equals("AFTN")) {
                                        c = 1;
                                    }
                                }
                            } else if (deviceName.equals("AFTA")) {
                                c = 0;
                            }
                        } else if (deviceName.equals("JSN-L21")) {
                            c = 2;
                        }
                        if (c == 0 || c == 1 || c == 2) {
                            sDeviceNeedsSetOutputSurfaceWorkaround = true;
                        }
                    }
                }
                if (LogUtils.isLogEnable()) {
                    LogUtils.m21881d(TAG, "deviceNeedsSetOutputSurfaceWorkaround:" + sDeviceNeedsSetOutputSurfaceWorkaround);
                }
                sEvaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
            }
        }
        return sDeviceNeedsSetOutputSurfaceWorkaround;
    }

    public static String getCodeName(MediaCodec mediaCodec) {
        return mediaCodec.getName();
    }

    public static int getCodecMaxInputSize(String str, int i, int i2) {
        return getCodecMaxInputSize(str, i, i2, false);
    }

    public static ArrayList<byte[]> getCsdBuffers(MediaFormat mediaFormat) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            String[] strArr = CSD_INDEX_ARRAY;
            if (i >= strArr.length) {
                return arrayList;
            }
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(strArr[i]);
            if (byteBuffer != null) {
                arrayList.add(byteBuffer.array());
            }
            i++;
        }
    }

    public static int getMaxInputSize(ReuseCodecWrapper reuseCodecWrapper, FormatWrapper formatWrapper) {
        if (formatWrapper.maxInputSize == -1) {
            return getCodecMaxInputSize(formatWrapper.sampleMimeType, formatWrapper.width, formatWrapper.height, reuseCodecWrapper.mSecure);
        }
        int i = 0;
        for (int i2 = 0; i2 < formatWrapper.initializationData.size(); i2++) {
            i += formatWrapper.initializationData.get(i2).length;
        }
        return formatWrapper.maxInputSize + i;
    }

    public static String getSurfaceTextureName(Surface surface) {
        try {
            Field field = ReflectUtils.getField(Surface.class, "mName");
            field.setAccessible(true);
            return String.valueOf(field.get(surface));
        } catch (Throwable th) {
            LogUtils.m21883e(TAG, "getSurfaceTextureName failed", th);
            return "";
        }
    }

    public static boolean isAdaptive(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return isAdaptiveV19(codecCapabilities);
    }

    private static boolean isAdaptiveV19(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return isSecureV21(codecCapabilities);
    }

    private static boolean isSecureV21(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean isVideo(String str) {
        return str.contains("video");
    }

    public static void setCsdBuffers(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getCodecMaxInputSize(java.lang.String r5, int r6, int r7, boolean r8) {
        /*
            r0 = -1
            if (r6 == r0) goto L_0x00b2
            if (r7 != r0) goto L_0x0007
            goto L_0x00b2
        L_0x0007:
            r5.getClass()
            int r1 = r5.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1664118616: goto L_0x0052;
                case -1662541442: goto L_0x0046;
                case 1187890754: goto L_0x003a;
                case 1331836730: goto L_0x002e;
                case 1599127256: goto L_0x0022;
                case 1599127257: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r5 = -1
            goto L_0x005d
        L_0x0016:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0020
            goto L_0x0014
        L_0x0020:
            r5 = 5
            goto L_0x005d
        L_0x0022:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x002c
            goto L_0x0014
        L_0x002c:
            r5 = 4
            goto L_0x005d
        L_0x002e:
            java.lang.String r1 = "video/avc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0038
            goto L_0x0014
        L_0x0038:
            r5 = 3
            goto L_0x005d
        L_0x003a:
            java.lang.String r1 = "video/mp4v-es"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0044
            goto L_0x0014
        L_0x0044:
            r5 = 2
            goto L_0x005d
        L_0x0046:
            java.lang.String r1 = "video/hevc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0050
            goto L_0x0014
        L_0x0050:
            r5 = 1
            goto L_0x005d
        L_0x0052:
            java.lang.String r1 = "video/3gpp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x005c
            goto L_0x0014
        L_0x005c:
            r5 = 0
        L_0x005d:
            switch(r5) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x00a6;
                case 2: goto L_0x00a9;
                case 3: goto L_0x0061;
                case 4: goto L_0x00a9;
                case 5: goto L_0x00a6;
                default: goto L_0x0060;
            }
        L_0x0060:
            return r0
        L_0x0061:
            java.lang.String r5 = com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00a5
            java.lang.String r5 = com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceManufacturer()
            java.lang.String r1 = "Amazon"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0094
            java.lang.String r5 = com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()
            java.lang.String r1 = "KFSOWI"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00a5
            java.lang.String r5 = com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()
            java.lang.String r1 = "AFTS"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0094
            if (r8 == 0) goto L_0x0094
            goto L_0x00a5
        L_0x0094:
            r5 = 16
            int r6 = ceilDivide(r6, r5)
            int r7 = ceilDivide(r7, r5)
            int r6 = r6 * r7
            int r6 = r6 * 16
            int r6 = r6 * 16
            goto L_0x00ab
        L_0x00a5:
            return r0
        L_0x00a6:
            int r6 = r6 * r7
            goto L_0x00ac
        L_0x00a9:
            int r6 = r6 * r7
        L_0x00ab:
            r2 = 2
        L_0x00ac:
            int r6 = r6 * 3
            int r2 = r2 * 2
            int r6 = r6 / r2
            return r6
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tmediacodec.util.TUtils.getCodecMaxInputSize(java.lang.String, int, int, boolean):int");
    }

    public static boolean isVideo(MediaFormat mediaFormat) {
        return isVideo(mediaFormat.getString("mime"));
    }
}
