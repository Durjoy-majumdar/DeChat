package s62;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import p206nj.C11171e;

/* renamed from: s62.f */
public class C101554f {

    /* renamed from: a */
    public static long f297300a;

    /* renamed from: b */
    public static final String[] f297301b = {MediaCodecUtils.QCOM_PREFIX, MediaCodecUtils.EXYNOS_PREFIX, "OMX.hisi"};

    /* renamed from: a */
    public static boolean m133316a(String str) {
        String str2;
        try {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            int length = codecInfos.length;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                String[] supportedTypes = codecInfos[i].getSupportedTypes();
                int i2 = 0;
                while (true) {
                    if (i2 >= supportedTypes.length) {
                        str2 = "";
                        break;
                    }
                    str2 = supportedTypes[i2];
                    if (!Util.isNullOrNil(str2) && str2.contains(str)) {
                        break;
                    }
                    i2++;
                }
                if (!Util.isNullOrNil(str2)) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            return !arrayList.isEmpty();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecUtil", e, "isSupportHevc error", new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    public static String m133317b(MediaCodecInfo mediaCodecInfo) {
        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        for (String str : supportedTypes) {
            if (!Util.isNullOrNil(str) && str.contains("hevc")) {
                return str;
            }
        }
        return "";
    }

    /* renamed from: c */
    public static String m133318c() {
        Log.m105919d("MicroMsg.MediaCodecUtil", "check hevc info last rpt time[%d]", Long.valueOf(f297300a));
        try {
            f297300a = Util.nowMilliSecond();
            return C11171e.m11046c(21) ? m133319d() : m133320e();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecUtil", e, "report hevc info error %s", e.toString());
            return "";
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MediaCodecUtil", th, "report hevc info error %s", th.toString());
            return "";
        }
    }

    /* renamed from: d */
    public static String m133319d() {
        long j;
        ArrayList arrayList;
        long currentTicks = Util.currentTicks();
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        int length = codecInfos.length;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < length; i++) {
            String b = m133317b(codecInfos[i]);
            if (!Util.isNullOrNil(b)) {
                arrayList2.add(Integer.valueOf(i));
                arrayList3.add(b);
            }
        }
        if (arrayList2.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i15 = 0;
        while (i3 < arrayList2.size()) {
            int intValue = ((Integer) arrayList2.get(i3)).intValue();
            z2 = codecInfos[intValue].isEncoder();
            boolean z5 = !codecInfos[intValue].isEncoder();
            ArrayList arrayList4 = arrayList2;
            MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfos[intValue].getCapabilitiesForType((String) arrayList3.get(i3));
            if (capabilitiesForType != null) {
                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                if (videoCapabilities != null) {
                    int max = Math.max(videoCapabilities.getBitrateRange().getLower().intValue(), i4);
                    int max2 = Math.max(videoCapabilities.getBitrateRange().getUpper().intValue(), i5);
                    i2 = Math.max(videoCapabilities.getSupportedFrameRates().getLower().intValue(), i2);
                    arrayList = arrayList3;
                    int max3 = Math.max(videoCapabilities.getSupportedFrameRates().getUpper().intValue(), i6);
                    j = currentTicks;
                    int max4 = Math.max(videoCapabilities.getSupportedWidths().getLower().intValue(), i7);
                    int max5 = Math.max(videoCapabilities.getSupportedWidths().getUpper().intValue(), i8);
                    i7 = max4;
                    i9 = Math.max(videoCapabilities.getSupportedHeights().getLower().intValue(), i9);
                    i15 = Math.max(videoCapabilities.getSupportedHeights().getUpper().intValue(), i15);
                    i5 = max2;
                    i8 = max5;
                    i6 = max3;
                    i4 = max;
                } else {
                    j = currentTicks;
                    arrayList = arrayList3;
                    int i16 = i6;
                    int i17 = i7;
                    int i18 = i8;
                    int i19 = i9;
                    int i25 = i15;
                }
                sb.append(codecInfos[intValue].getName());
                sb.append("|");
                z3 = true;
            } else {
                j = currentTicks;
                arrayList = arrayList3;
                int i26 = i6;
                int i27 = i7;
                int i28 = i8;
                int i29 = i9;
                int i35 = i15;
                sb4.append(codecInfos[intValue].getName());
                sb4.append("|");
                z4 = true;
            }
            i3++;
            z = z5;
            arrayList2 = arrayList4;
            arrayList3 = arrayList;
            currentTicks = j;
        }
        long j2 = currentTicks;
        int i36 = i6;
        int i37 = i7;
        int i38 = i8;
        int i39 = i9;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(1);
        sb5.append(",");
        int i44 = i15;
        if (z && z2) {
            sb5.append(3);
            sb5.append(",");
        } else if (z2) {
            sb5.append(2);
            sb5.append(",");
        } else {
            sb5.append(1);
            sb5.append(",");
        }
        if (z3 && z4) {
            sb5.append(3);
            sb5.append(",");
        } else if (z4) {
            sb5.append(2);
            sb5.append(",");
        } else {
            sb5.append(1);
            sb5.append(",");
        }
        sb5.append(sb.toString());
        sb5.append(",");
        sb5.append(sb4.toString());
        sb5.append(",");
        sb5.append(i4);
        sb5.append(",");
        sb5.append(i5);
        sb5.append(",");
        sb5.append(i2);
        sb5.append(",");
        sb5.append(i36);
        sb5.append(",");
        sb5.append(i37);
        sb5.append(",");
        sb5.append(i38);
        sb5.append(",");
        sb5.append(i39);
        sb5.append(",");
        sb5.append(i44);
        String sb6 = sb5.toString();
        Log.m105925i("MicroMsg.MediaCodecUtil", "high api 21 cost[%d] hevc info %s", Long.valueOf(Util.ticksToNow(j2)), sb6);
        return sb6;
    }

    /* renamed from: e */
    public static String m133320e() {
        long currentTicks = Util.currentTicks();
        int codecCount = MediaCodecList.getCodecCount();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < codecCount; i++) {
            String b = m133317b(MediaCodecList.getCodecInfoAt(i));
            if (!Util.isNullOrNil(b)) {
                arrayList.add(Integer.valueOf(i));
                arrayList2.add(b);
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (i2 < arrayList.size()) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i2)).intValue());
            boolean isEncoder = codecInfoAt.isEncoder();
            boolean z5 = !codecInfoAt.isEncoder();
            if (codecInfoAt.getCapabilitiesForType((String) arrayList2.get(i2)) != null) {
                sb.append(codecInfoAt.getName());
                sb.append("|");
                z3 = true;
            } else {
                sb4.append(codecInfoAt.getName());
                sb4.append("|");
                z4 = true;
            }
            i2++;
            z2 = isEncoder;
            z = z5;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(1);
        sb5.append(",");
        if (z && z2) {
            sb5.append(3);
            sb5.append(",");
        } else if (z2) {
            sb5.append(2);
            sb5.append(",");
        } else {
            sb5.append(1);
            sb5.append(",");
        }
        if (z3 && z4) {
            sb5.append(3);
            sb5.append(",");
        } else if (z4) {
            sb5.append(2);
            sb5.append(",");
        } else {
            sb5.append(1);
            sb5.append(",");
        }
        sb5.append(sb.toString());
        sb5.append(",");
        sb5.append(sb4.toString());
        String sb6 = sb5.toString();
        Log.m105925i("MicroMsg.MediaCodecUtil", "below api 21 cost[%d] hevc info %s", Long.valueOf(Util.ticksToNow(currentTicks)), sb6);
        return sb6;
    }

    /* renamed from: f */
    public static boolean m133321f() {
        try {
            if (!C11171e.m11046c(21)) {
                return false;
            }
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            int length = codecInfos.length;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < length; i++) {
                MediaCodecInfo mediaCodecInfo = codecInfos[i];
                if (!mediaCodecInfo.isEncoder()) {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/dolby-vision");
                    String str = "";
                    if (capabilitiesForType != null) {
                        if (!capabilitiesForType.isFeatureRequired("secure-playback")) {
                            if (!capabilitiesForType.isFeatureRequired("tunneled-playback")) {
                                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= supportedTypes.length) {
                                        break;
                                    }
                                    String str2 = supportedTypes[i2];
                                    if (!Util.isNullOrNil(str2) && str2.contains("dolby")) {
                                        str = str2;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                    if (!Util.isNullOrNil(str)) {
                        arrayList.add(Integer.valueOf(i));
                        arrayList2.add(str);
                    }
                }
            }
            return !arrayList.isEmpty();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecUtil", e, "isSupportHevc error", new Object[0]);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m133322g() {
        try {
            if (!C11171e.m11046c(21)) {
                return false;
            }
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            int length = codecInfos.length;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < length; i++) {
                String b = m133317b(codecInfos[i]);
                if (!Util.isNullOrNil(b)) {
                    arrayList.add(Integer.valueOf(i));
                    arrayList2.add(b);
                }
            }
            return !arrayList.isEmpty();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecUtil", e, "isSupportHevc error", new Object[0]);
            return false;
        }
    }
}
