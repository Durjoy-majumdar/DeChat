package com.tencent.thumbplayer.utils;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.xweb.file.XVFSFile;
import java.io.StringReader;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.InputSource;

public class TPCommonUtils {
    private static final String TAG = "TPCommonUtils";

    public static void assertTrue(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String getMd5(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(40);
            for (byte b : digest) {
                byte b2 = b & ExifInterface.MARKER;
                if ((b2 >> 4) == 0) {
                    sb.append("0");
                    sb.append(Integer.toHexString(b2));
                } else {
                    sb.append(Integer.toHexString(b2));
                }
            }
            return sb.toString();
        } catch (Exception e) {
            TPLogUtil.m21894e(TAG, e.toString());
            return null;
        }
    }

    public static boolean isEmpty(Collection<? extends Object> collection) {
        return collection == null || collection.size() <= 0;
    }

    public static boolean isNumeric(String str) {
        try {
            return Pattern.compile("-?[0-9]+(\\.[0-9]+)?").matcher(new BigDecimal(str).toString()).matches();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return str.split(XVFSFile.PATH_SEPARATOR)[0].matches("^((https|http|ftp|rtsp|mms)?)");
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static boolean isXmlDocument(String str) {
        try {
            if (TextUtils.isEmpty(str) || !str.contains("<?xml")) {
                return false;
            }
            DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(str)));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static double optDouble(String str, double d) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Double.parseDouble(str);
            } catch (NumberFormatException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
        return d;
    }

    public static float optFloat(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
        return (float) i;
    }

    public static int optInt(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
        return i;
    }

    public static long optLong(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
        return j;
    }

    public static void requireNotNull(Object obj, String str) {
        if (obj == null) {
            if (TextUtils.isEmpty(str)) {
                str = "this argument should not be null!";
            }
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean isEmpty(Map<? extends Object, ? extends Object> map) {
        return map == null || map.size() <= 0;
    }
}
