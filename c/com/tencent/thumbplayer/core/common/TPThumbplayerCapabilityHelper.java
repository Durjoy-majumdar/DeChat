package com.tencent.thumbplayer.core.common;

import android.content.Context;
import android.os.Build;
import com.tencent.thumbplayer.core.common.TPCodecCapability;
import java.util.HashMap;

public class TPThumbplayerCapabilityHelper {
    public static boolean addACodecBlacklist(int i, int i2, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) {
        return TPPlayerDecoderCapability.addACodecBlacklist(i, i2, tPACodecPropertyRange);
    }

    public static boolean addACodecWhitelist(int i, int i2, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) {
        return TPPlayerDecoderCapability.addACodecWhitelist(i, i2, tPACodecPropertyRange);
    }

    public static boolean addDRMLevel1Blacklist(int i) {
        return TPPlayerDecoderCapability.addDRMLevel1Blacklist(i);
    }

    public static boolean addHDRBlackList(int i, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPPlayerDecoderCapability.addHDRBlackList(i, tPHdrSupportVersionRange);
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i, int i2, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPPlayerDecoderCapability.addHDRVideoDecoderTypeWhiteList(i, i2, tPHdrSupportVersionRange);
    }

    public static boolean addHDRWhiteList(int i, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPPlayerDecoderCapability.addHDRWhiteList(i, tPHdrSupportVersionRange);
    }

    public static boolean addVCodecBlacklist(int i, int i2, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) {
        return TPPlayerDecoderCapability.addVCodecBlacklist(i, i2, tPVCodecPropertyRange);
    }

    public static boolean addVCodecWhitelist(int i, int i2, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) {
        return TPPlayerDecoderCapability.addVCodecWhitelist(i, i2, tPVCodecPropertyRange);
    }

    public static int[] getDRMCapabilities() {
        return TPDrm.getDRMCapabilities();
    }

    public static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVCodecDecoderMaxCapabilityMap(int i) {
        return TPPlayerDecoderCapability.getVCodecDecoderMaxCapabilityMap(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r4 = r2.get(java.lang.Integer.valueOf(r4));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability getVCodecMaxCapability(int r4) {
        /*
            com.tencent.thumbplayer.core.common.TPCodecCapability$TPCodecMaxCapability r0 = new com.tencent.thumbplayer.core.common.TPCodecCapability$TPCodecMaxCapability
            r1 = 0
            r2 = 30
            r0.<init>(r1, r1, r1, r2)
            r1 = 102(0x66, float:1.43E-43)
            java.util.HashMap r1 = com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.getVCodecDecoderMaxCapabilityMap(r1)
            r2 = 101(0x65, float:1.42E-43)
            java.util.HashMap r2 = com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.getVCodecDecoderMaxCapabilityMap(r2)
            if (r1 == 0) goto L_0x0023
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r1.get(r3)
            com.tencent.thumbplayer.core.common.TPCodecCapability$TPCodecMaxCapability r1 = (com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability) r1
            if (r1 == 0) goto L_0x0023
            r0 = r1
        L_0x0023:
            if (r2 == 0) goto L_0x0038
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r2.get(r4)
            com.tencent.thumbplayer.core.common.TPCodecCapability$TPCodecMaxCapability r4 = (com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability) r4
            if (r4 == 0) goto L_0x0038
            int r1 = r4.maxLumaSamples
            int r2 = r0.maxLumaSamples
            if (r1 <= r2) goto L_0x0038
            r0 = r4
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.getVCodecMaxCapability(int):com.tencent.thumbplayer.core.common.TPCodecCapability$TPCodecMaxCapability");
    }

    public static synchronized void init(Context context, boolean z) {
        synchronized (TPThumbplayerCapabilityHelper.class) {
            TPPlayerDecoderCapability.init(context, z);
        }
    }

    public static boolean isACodecCapabilityCanSupport(int i, int i2, int i3, int i4, int i5, int i6) {
        if (isACodecCapabilitySupport(1, i, i2, i3, i4, i5, i6)) {
            return true;
        }
        return isACodecCapabilitySupport(102, i, i2, i3, i4, i5, i6);
    }

    public static boolean isACodecCapabilitySupport(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return TPPlayerDecoderCapability.isACodecCapabilitySupport(i, i2, i3, i4, i5, i6, i7);
    }

    public static boolean isDDPlusSupported() {
        return TPPlayerDecoderCapability.isDDPlusSupported();
    }

    public static boolean isDDSupported() {
        return TPPlayerDecoderCapability.isDDPlusSupported();
    }

    public static boolean isDRMsupport(int i) {
        int[] dRMCapabilities = getDRMCapabilities();
        if (dRMCapabilities.length == 0) {
            return false;
        }
        for (int i2 : dRMCapabilities) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDolbyDSSupported() {
        return TPPlayerDecoderCapability.isDolbyDSSupported();
    }

    public static boolean isFeatureSupport(int i) {
        return TPFeatureCapability.isFeatureSupport(i);
    }

    public static boolean isHDRsupport(int i, int i2, int i3) {
        return TPPlayerDecoderCapability.isHDRsupport(i, i2, i3);
    }

    public static boolean isSupportMediaCodecRotateInternal() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean isSupportNativeMediaCodec() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean isSupportSetOutputSurfaceApi() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @Deprecated
    public static boolean isVCodecCapabilityCanSupport(int i, int i2, int i3, int i4, int i5) {
        return isVCodecCapabilityCanSupport(i, i2, i3, i4, i5, 30);
    }

    @Deprecated
    public static boolean isVCodecCapabilitySupport(int i, int i2, int i3, int i4, int i5, int i6) {
        return isVCodecCapabilitySupport(i, i2, i3, i4, i5, i6, 30);
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z) {
        TPPlayerDecoderCapability.setMediaCodecPreferredSoftwareComponent(z);
    }

    public static boolean isVCodecCapabilityCanSupport(int i, int i2, int i3, int i4, int i5, int i6) {
        if (isVCodecCapabilitySupport(101, i, i2, i3, i4, i5, i6)) {
            return true;
        }
        return isVCodecCapabilitySupport(102, i, i2, i3, i4, i5, i6);
    }

    public static boolean isVCodecCapabilitySupport(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return TPPlayerDecoderCapability.isVCodecCapabilitySupport(i, i2, i3, i4, i5, i6, i7);
    }
}
