package com.pay.http;

import android.text.TextUtils;
import android.util.Patterns;
import com.tencent.xweb.file.XVFSFile;
import java.util.regex.Pattern;

public class APToolNetwork {
    private static final int BASE_16 = 16;
    private static final int IPV6_MAX_HEX_DIGITS_PER_GROUP = 4;
    private static final int IPV6_MAX_HEX_GROUPS = 8;
    private static final int MAX_UNSIGNED_SHORT = 65535;
    private static final Pattern PATTERN = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    public static boolean isIPAddress(String str) {
        return validateIPV4(str) || validateIPV6(str);
    }

    public static String joinDomainPort(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (validateIPV4(str)) {
            return str + XVFSFile.PATH_SEPARATOR + str2;
        } else if (!validateIPV6(str)) {
            return str;
        } else {
            return "[" + str + "]:" + str2;
        }
    }

    public static boolean validateIPV4(String str) {
        return Patterns.IP_ADDRESS.matcher(str).matches();
    }

    /* JADX WARNING: type inference failed for: r9v7, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean validateIPV6(java.lang.String r9) {
        /*
            java.lang.String r0 = "::"
            boolean r1 = r9.contains(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            int r3 = r9.indexOf(r0)
            int r4 = r9.lastIndexOf(r0)
            if (r3 == r4) goto L_0x0014
            return r2
        L_0x0014:
            java.lang.String r3 = ":"
            boolean r4 = r9.startsWith(r3)
            if (r4 == 0) goto L_0x0022
            boolean r4 = r9.startsWith(r0)
            if (r4 == 0) goto L_0x002e
        L_0x0022:
            boolean r4 = r9.endsWith(r3)
            if (r4 == 0) goto L_0x002f
            boolean r4 = r9.endsWith(r0)
            if (r4 != 0) goto L_0x002f
        L_0x002e:
            return r2
        L_0x002f:
            java.lang.String[] r3 = r9.split(r3)
            if (r1 == 0) goto L_0x0066
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r3 = java.util.Arrays.asList(r3)
            r4.<init>(r3)
            boolean r3 = r9.endsWith(r0)
            if (r3 == 0) goto L_0x004a
            java.lang.String r9 = ""
            r4.add(r9)
            goto L_0x0059
        L_0x004a:
            boolean r9 = r9.startsWith(r0)
            if (r9 == 0) goto L_0x0059
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L_0x0059
            r4.remove(r2)
        L_0x0059:
            int r9 = r4.size()
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.Object[] r9 = r4.toArray(r9)
            r3 = r9
            java.lang.String[] r3 = (java.lang.String[]) r3
        L_0x0066:
            int r9 = r3.length
            r0 = 8
            if (r9 <= r0) goto L_0x006c
            return r2
        L_0x006c:
            r9 = 0
            r4 = 0
            r5 = 0
        L_0x006f:
            int r6 = r3.length
            r7 = 1
            if (r9 >= r6) goto L_0x00b9
            r6 = r3[r9]
            int r8 = r6.length()
            if (r8 != 0) goto L_0x007f
            int r5 = r5 + r7
            if (r5 <= r7) goto L_0x00b3
            return r2
        L_0x007f:
            int r5 = r3.length
            int r5 = r5 - r7
            if (r9 != r5) goto L_0x009c
            java.lang.String r5 = "."
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x009c
            java.util.regex.Pattern r5 = android.util.Patterns.IP_ADDRESS
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r5 = r5.matches()
            if (r5 != 0) goto L_0x0098
            return r2
        L_0x0098:
            int r4 = r4 + 2
            r5 = 0
            goto L_0x00b5
        L_0x009c:
            int r5 = r6.length()
            r7 = 4
            if (r5 <= r7) goto L_0x00a4
            return r2
        L_0x00a4:
            r5 = 16
            int r5 = java.lang.Integer.parseInt(r6, r5)     // Catch:{ NumberFormatException -> 0x00b8 }
            if (r5 < 0) goto L_0x00b8
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r5 <= r6) goto L_0x00b2
            goto L_0x00b8
        L_0x00b2:
            r5 = 0
        L_0x00b3:
            int r4 = r4 + 1
        L_0x00b5:
            int r9 = r9 + 1
            goto L_0x006f
        L_0x00b8:
            return r2
        L_0x00b9:
            if (r4 > r0) goto L_0x00c1
            if (r4 >= r0) goto L_0x00c0
            if (r1 != 0) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            return r7
        L_0x00c1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pay.http.APToolNetwork.validateIPV6(java.lang.String):boolean");
    }
}
