package com.tencent.mapsdk.internal;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.map.lib.models.AccessibleTouchItem;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mapsdk.internal.he */
public final class C40002he {

    /* renamed from: a */
    private static SimpleDateFormat f107235a = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

    /* renamed from: a */
    public static boolean m42805a(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: b */
    private static boolean m42808b(String str, String str2) {
        return (str2 == null || str == null || str2.indexOf(str) != 0) ? false : true;
    }

    /* renamed from: c */
    public static String m42809c(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: c */
    private static boolean m42810c(String str, String str2) {
        if (str2 == null || str == null) {
            return false;
        }
        return str2.contains(str);
    }

    /* renamed from: d */
    private static String m42812d(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    private static String m42813e(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: f */
    private static String m42814f(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "gbk");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: g */
    private static boolean m42815g(String str) {
        if (m42805a(str)) {
            return false;
        }
        return str.equals(AccessibleTouchItem.MY_LOCATION_PREFIX) || str.equals("当前位置") || str.equals("我在哪") || str.equals("我在哪儿") || str.equals("我在的位置") || str.equals("我的位置在哪") || str.equals("我的位置在哪儿");
    }

    /* renamed from: h */
    private static boolean m42816h(String str) {
        try {
            return Pattern.compile("[0-9]*").matcher(str).matches();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    private static String m42817i(String str) {
        if (m42805a(str)) {
            return str;
        }
        try {
            URI uri = new URI(str);
            String[] split = uri.getQuery().split("&");
            Arrays.sort(split);
            StringBuilder sb = new StringBuilder();
            for (String append : split) {
                sb.append(append);
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), sb.toString(), uri.getFragment()).toString();
        } catch (URISyntaxException unused) {
            return str;
        }
    }

    /* renamed from: j */
    private static int m42818j(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i + 1;
            i2 = str.substring(i, i3).matches("[一-龥]") ? i2 + 1 : (int) (((double) i2) + 0.5d);
            i = i3;
        }
        return i2;
    }

    /* renamed from: a */
    private static CharSequence m42800a(String[] strArr, int[] iArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strArr[i]);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(iArr[i]), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append(spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r2.lastIndexOf(".");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m42807b(java.lang.String r2) {
        /*
            boolean r0 = m42805a((java.lang.String) r2)
            if (r0 == 0) goto L_0x0007
            return r2
        L_0x0007:
            java.lang.String r0 = "."
            int r0 = r2.lastIndexOf(r0)
            if (r0 <= 0) goto L_0x0014
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C40002he.m42807b(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    private static int m42811d(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (true) {
            if (i < (split.length > split2.length ? split2.length : split.length)) {
                int intValue = Integer.valueOf(split[i]).intValue() - Integer.valueOf(split2[i]).intValue();
                if (intValue != 0) {
                    return intValue;
                }
                i++;
            } else if (split.length != split2.length) {
                return split.length - split2.length;
            } else {
                return 0;
            }
        }
    }

    /* renamed from: a */
    public static String m42804a(byte[] bArr, String str) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m42803a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(256);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m42801a(long j) {
        return f107235a.format(Long.valueOf(j));
    }

    /* renamed from: a */
    public static boolean m42806a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return str2.equals(str);
        }
        return false;
    }

    /* renamed from: a */
    private static String m42802a(Collection<String> collection, String str) {
        if (collection == null || collection.isEmpty() || str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String next : collection) {
            if (i == collection.size() - 1) {
                sb.append(next);
            } else {
                sb.append(next);
                sb.append(str);
            }
            i++;
        }
        return sb.toString();
    }
}
