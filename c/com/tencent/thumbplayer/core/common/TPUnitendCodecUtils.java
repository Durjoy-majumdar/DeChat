package com.tencent.thumbplayer.core.common;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import java.util.HashMap;

public class TPUnitendCodecUtils {
    private static int DolbyVisionProfileDvavPen = 1;
    private static int DolbyVisionProfileDvavPer = 0;
    private static int DolbyVisionProfileDvavSe = 9;
    private static int DolbyVisionProfileDvheDen = 3;
    private static int DolbyVisionProfileDvheDer = 2;
    private static int DolbyVisionProfileDvheDtb = 7;
    private static int DolbyVisionProfileDvheDth = 6;
    private static int DolbyVisionProfileDvheDtr = 4;
    private static int DolbyVisionProfileDvheSt = 8;
    private static int DolbyVisionProfileDvheStn = 5;
    private static HashMap<String, String> mSecureDecoderNameMaps;

    public static int convertOmxProfileToDolbyVision(int i) {
        int i2 = i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? i != 64 ? i != 128 ? i != 256 ? i != 512 ? 0 : DolbyVisionProfileDvavSe : DolbyVisionProfileDvheSt : DolbyVisionProfileDvheDtb : DolbyVisionProfileDvheDth : DolbyVisionProfileDvheStn : DolbyVisionProfileDvheDtr : DolbyVisionProfileDvheDen : DolbyVisionProfileDvheDer : DolbyVisionProfileDvavPen : DolbyVisionProfileDvavPer;
        TPNativeLog.printLog(2, "TPUnitendCodecUtils", "convertOmxProfileToDolbyVision omxProfile:" + i + " dolbyVisionProfile:" + i2);
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00de, code lost:
        return r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String getDolbyVisionDecoderName(java.lang.String r16, int r17, int r18, boolean r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            java.lang.Class<com.tencent.thumbplayer.core.common.TPUnitendCodecUtils> r3 = com.tencent.thumbplayer.core.common.TPUnitendCodecUtils.class
            monitor-enter(r3)
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = android.text.TextUtils.equals(r4, r0)     // Catch:{ all -> 0x00df }
            r5 = 0
            if (r4 != 0) goto L_0x0015
            monitor-exit(r3)
            return r5
        L_0x0015:
            android.media.MediaCodecList r4 = new android.media.MediaCodecList     // Catch:{ all -> 0x00df }
            r6 = 1
            r4.<init>(r6)     // Catch:{ all -> 0x00df }
            android.media.MediaCodecInfo[] r4 = r4.getCodecInfos()     // Catch:{ all -> 0x00df }
            if (r4 != 0) goto L_0x0023
            monitor-exit(r3)
            return r5
        L_0x0023:
            int r6 = r4.length     // Catch:{ all -> 0x00df }
            r9 = r5
            r8 = 0
        L_0x0026:
            if (r8 >= r6) goto L_0x00dd
            r10 = r4[r8]     // Catch:{ all -> 0x00df }
            java.lang.String r11 = "TPUnitendCodecUtils"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r12.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r13 = "getDolbyVisionDecoderName name:"
            r12.append(r13)     // Catch:{ all -> 0x00df }
            java.lang.String r13 = r10.getName()     // Catch:{ all -> 0x00df }
            r12.append(r13)     // Catch:{ all -> 0x00df }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00df }
            r13 = 2
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r13, r11, r12)     // Catch:{ all -> 0x00df }
            boolean r11 = r10.isEncoder()     // Catch:{ all -> 0x00df }
            if (r11 == 0) goto L_0x004d
            goto L_0x00d8
        L_0x004d:
            android.media.MediaCodecInfo$CodecCapabilities r11 = r10.getCapabilitiesForType(r0)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0054
        L_0x0052:
            r11 = r5
        L_0x0054:
            if (r11 != 0) goto L_0x0058
            goto L_0x00d8
        L_0x0058:
            android.media.MediaCodecInfo$CodecProfileLevel[] r12 = r11.profileLevels     // Catch:{ all -> 0x00df }
            r14 = 0
        L_0x005b:
            int r15 = r12.length     // Catch:{ all -> 0x00df }
            if (r14 >= r15) goto L_0x00be
            r15 = r12[r14]     // Catch:{ all -> 0x00df }
            int r15 = r15.profile     // Catch:{ all -> 0x00df }
            int r15 = convertOmxProfileToDolbyVision(r15)     // Catch:{ all -> 0x00df }
            if (r15 != r1) goto L_0x00b9
            java.lang.String r5 = "TPUnitendCodecUtils"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r7.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r13 = "getDolbyVisionDecoderName i:"
            r7.append(r13)     // Catch:{ all -> 0x00df }
            r7.append(r14)     // Catch:{ all -> 0x00df }
            java.lang.String r13 = " profile:"
            r7.append(r13)     // Catch:{ all -> 0x00df }
            r7.append(r15)     // Catch:{ all -> 0x00df }
            java.lang.String r13 = " dvProfile:"
            r7.append(r13)     // Catch:{ all -> 0x00df }
            r7.append(r1)     // Catch:{ all -> 0x00df }
            java.lang.String r13 = " bSecure:"
            r7.append(r13)     // Catch:{ all -> 0x00df }
            r7.append(r2)     // Catch:{ all -> 0x00df }
            java.lang.String r13 = " name:"
            r7.append(r13)     // Catch:{ all -> 0x00df }
            java.lang.String r13 = r10.getName()     // Catch:{ all -> 0x00df }
            r7.append(r13)     // Catch:{ all -> 0x00df }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00df }
            r13 = 2
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r13, r5, r7)     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x00b3
            java.lang.String r5 = "secure-playback"
            boolean r5 = r11.isFeatureSupported(r5)     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x00b9
            java.lang.String r5 = r10.getName()     // Catch:{ all -> 0x00df }
            goto L_0x00b7
        L_0x00b3:
            java.lang.String r5 = r10.getName()     // Catch:{ all -> 0x00df }
        L_0x00b7:
            r9 = r5
            goto L_0x00be
        L_0x00b9:
            int r14 = r14 + 1
            r5 = 0
            r13 = 2
            goto L_0x005b
        L_0x00be:
            if (r9 == 0) goto L_0x00d8
            java.lang.String r0 = "TPUnitendCodecUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r1.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "getDolbyVisionDecoderName name:"
            r1.append(r2)     // Catch:{ all -> 0x00df }
            r1.append(r9)     // Catch:{ all -> 0x00df }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00df }
            r2 = 2
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r2, r0, r1)     // Catch:{ all -> 0x00df }
            goto L_0x00dd
        L_0x00d8:
            int r8 = r8 + 1
            r5 = 0
            goto L_0x0026
        L_0x00dd:
            monitor-exit(r3)
            return r9
        L_0x00df:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPUnitendCodecUtils.getDolbyVisionDecoderName(java.lang.String, int, int, boolean):java.lang.String");
    }

    public static synchronized String getSecureDecoderName(String str) {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        synchronized (TPUnitendCodecUtils.class) {
            String str2 = null;
            if (!TextUtils.equals("video/avc", str) && !TextUtils.equals("video/hevc", str) && !TextUtils.equals("video/dolby-vision", str)) {
                return null;
            }
            if (mSecureDecoderNameMaps == null) {
                mSecureDecoderNameMaps = new HashMap<>();
            }
            if (mSecureDecoderNameMaps.containsKey(str)) {
                String str3 = mSecureDecoderNameMaps.get(str);
                return str3;
            }
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            if (codecInfos == null) {
                return null;
            }
            int length = codecInfos.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                MediaCodecInfo mediaCodecInfo = codecInfos[i];
                if (!mediaCodecInfo.isEncoder()) {
                    try {
                        codecCapabilities = mediaCodecInfo.getCapabilitiesForType(str);
                    } catch (Exception unused) {
                        codecCapabilities = null;
                    }
                    if (codecCapabilities == null) {
                        continue;
                    } else if (codecCapabilities.isFeatureSupported("secure-playback")) {
                        str2 = mediaCodecInfo.getName();
                        break;
                    }
                }
                i++;
            }
            mSecureDecoderNameMaps.put(str, str2);
            return str2;
        }
    }
}
