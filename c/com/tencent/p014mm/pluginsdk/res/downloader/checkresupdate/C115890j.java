package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import a70.C112760b;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2encoder;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import java.util.Locale;
import rd3.C48020a;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.j */
public final class C115890j {

    /* renamed from: a */
    public static final byte[] f347721a = {48, -126, 1, 75, 48, -126, 1, 3, 6, 7, ExifInterface.START_CODE, -122, 72, -50, 61, 2, 1, 48, -127, -9, 2, 1, 1, 48, 44, 6, 7, ExifInterface.START_CODE, -122, 72, -50, 61, 1, 1, 2, 33, 0, -1, -1, -1, -1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, 91, 4, 32, -1, -1, -1, -1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -4, 4, 32, 90, -58, 53, -40, -86, 58, -109, -25, -77, -21, -67, 85, 118, -104, -122, -68, 101, 29, 6, -80, -52, 83, -80, -10, 59, -50, 60, 62, 39, -46, 96, 75, 3, 21, 0, -60, -99, 54, 8, -122, -25, 4, -109, 106, 102, 120, ExifInterface.MARKER_APP1, 19, -99, 38, -73, -127, -97, 126, -112, 4, 65, 4, 107, 23, -47, -14, ExifInterface.MARKER_APP1, 44, 66, 71, -8, -68, -26, -27, 99, -92, 64, -14, 119, 3, 125, -127, 45, -21, 51, -96, -12, -95, 57, 69, -40, -104, -62, -106, 79, -29, 66, -30, -2, 26, Byte.MAX_VALUE, -101, -114, -25, -21, 74, 124, 15, -98, 22, 43, -50, 51, 87, 107, 49, 94, -50, -53, -74, 64, 104, 55, -65, 81, -11, 2, 33, 0, -1, -1, -1, -1, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -68, -26, -6, -83, -89, 23, -98, -124, -13, -71, -54, -62, -4, 99, 37, 81, 2, 1, 1, 3, 66, 0, 4, 52, 4, -14, 45, -10, -68, -118, -59, 62, 64, -101, 93, 6, -54, -27, 79, 94, 126, -9, -80, -61, -63, -38, 115, -53, 70, -63, v2encoder.enumCODEC_vcodec2, -20, -32, -80, -80, 38, 102, v2encoder.enumCODEC_vcodec2, 27, 28, 61, -60, -33, 65, 93, -25, 30, 83, 66, -24, 28, 39, 24, 69, -104, 55, -63, 108, 5, 56, -63, -4, -5, 88, -49, -126, 85};

    /* renamed from: b */
    public static final String f347722b = (C112760b.m154195C() + "CheckResUpdate/");

    /* renamed from: c */
    public static final String f347723c = (C112760b.m154231g() + "CheckResUpdate/");

    /* renamed from: d */
    public static final String f347724d = (C112760b.m154225d() + "CheckResUpdate/");

    /* renamed from: e */
    public static final int[] f347725e;

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.j$a */
    public enum C30692a {
        ;

        /* access modifiers changed from: public */
        C30692a(int i) {
        }

        /* renamed from: a */
        public static int m39153a(String str) {
            if (XWalkPlugin.PRIVATE_CACHE_DIR_NAME.equals(str)) {
                return 1;
            }
            if ("delete".equals(str)) {
                return 4;
            }
            return "decrypt".equals(str) ? 2 : 0;
        }
    }

    static {
        int[] iArr = new int[31];
        iArr[0] = 27;
        iArr[1] = 35;
        iArr[2] = 29;
        iArr[3] = 38;
        iArr[4] = 40;
        iArr[5] = 33;
        iArr[6] = 37;
        iArr[7] = 39;
        iArr[8] = 49;
        iArr[9] = 46;
        iArr[10] = 47;
        iArr[11] = 56;
        iArr[12] = 59;
        iArr[13] = 62;
        iArr[14] = 66;
        iArr[15] = 55;
        iArr[16] = 63;
        iArr[17] = 73;
        iArr[18] = 79;
        iArr[19] = 58;
        iArr[20] = 104;
        iArr[21] = 85;
        iArr[22] = 87;
        iArr[23] = 86;
        iArr[24] = 89;
        iArr[25] = 88;
        iArr[26] = 97;
        iArr[27] = 96;
        iArr[28] = 95;
        iArr[29] = 145;
        iArr[30] = BuildInfo.IS_ARM64 ? 109 : 108;
        f347725e = iArr;
    }

    /* renamed from: a */
    public static boolean m163007a(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        String b = m163008b(str);
        boolean a = C48020a.m53384a(b) & true & C48020a.m53384a(b + ".decompressed");
        return C48020a.m53384a(b + ".decrypted") & a;
    }

    /* renamed from: b */
    public static String m163008b(String str) {
        String str2;
        if (!str.startsWith(String.valueOf(38) + ".")) {
            if (!str.startsWith(String.valueOf(56) + ".")) {
                if (str.startsWith("37.")) {
                    str2 = f347724d;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(145));
                    sb.append(".");
                    str2 = str.startsWith(sb.toString()) ? f347724d : f347722b;
                }
                FilePathGenerator.checkMkdir(str2);
                return str2 + str;
            }
        }
        str2 = f347723c;
        FilePathGenerator.checkMkdir(str2);
        return str2 + str;
    }

    /* renamed from: c */
    public static String m163009c(int i, int i2) {
        return String.format(Locale.US, "%d.%d.data", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
    }
}
