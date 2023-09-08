package i34;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.wxmm.v2encoder;
import j34.C98903a;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: i34.a */
public class C98596a {
    /* renamed from: a */
    public final String mo137989a(String str, String str2) {
        char[] cArr;
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "HmacSHA1");
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(secretKeySpec);
        byte[] doFinal = instance.doFinal(str.getBytes("UTF-8"));
        char[] cArr2 = C98903a.f289928a;
        int i = 0;
        int length = doFinal != null ? doFinal.length : 0;
        if (length == 0) {
            cArr = new char[0];
        } else {
            int i2 = (length / 3) * 3;
            int i3 = length - 1;
            int i4 = ((i3 / 3) + 1) << 2;
            int i5 = i4 + (((i4 - 1) / 76) << 1);
            char[] cArr3 = new char[i5];
            int i6 = 0;
            int i7 = 0;
            loop0:
            while (true) {
                int i8 = 0;
                while (i6 < i2) {
                    int i9 = i6 + 1;
                    int i15 = i9 + 1;
                    byte b = ((doFinal[i6] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((doFinal[i9] & ExifInterface.MARKER) << 8);
                    int i16 = i15 + 1;
                    byte b2 = b | (doFinal[i15] & ExifInterface.MARKER);
                    int i17 = i7 + 1;
                    char[] cArr4 = C98903a.f289928a;
                    cArr3[i7] = cArr4[(b2 >>> 18) & 63];
                    int i18 = i17 + 1;
                    cArr3[i17] = cArr4[(b2 >>> 12) & 63];
                    int i19 = i18 + 1;
                    cArr3[i18] = cArr4[(b2 >>> 6) & 63];
                    i7 = i19 + 1;
                    cArr3[i19] = cArr4[b2 & 63];
                    i8++;
                    if (i8 != 19 || i7 >= i5 - 2) {
                        i6 = i16;
                    } else {
                        int i25 = i7 + 1;
                        cArr3[i7] = 13;
                        i7 = i25 + 1;
                        cArr3[i25] = 10;
                        i6 = i16;
                    }
                }
                break loop0;
            }
            int i26 = length - i2;
            if (i26 > 0) {
                int i27 = (doFinal[i2] & ExifInterface.MARKER) << 10;
                if (i26 == 2) {
                    i = (doFinal[i3] & ExifInterface.MARKER) << 2;
                }
                int i28 = i27 | i;
                char[] cArr5 = C98903a.f289928a;
                cArr3[i5 - 4] = cArr5[i28 >> 12];
                cArr3[i5 - 3] = cArr5[(i28 >>> 6) & 63];
                cArr3[i5 - 2] = i26 == 2 ? cArr5[i28 & 63] : '=';
                cArr3[i5 - 1] = '=';
            }
            cArr = cArr3;
        }
        return new String(cArr).replace(APLogFileUtil.SEPARATOR_LINE, "");
    }
}
