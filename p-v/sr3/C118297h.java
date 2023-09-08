package sr3;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.xweb.file.XVFSFile;
import java.util.HashMap;

/* renamed from: sr3.h */
public class C118297h {

    /* renamed from: a */
    public static final Character f353550a = '&';

    /* renamed from: b */
    public static final Character f353551b = '\'';

    /* renamed from: c */
    public static final Character f353552c = '!';

    /* renamed from: d */
    public static final Character f353553d = '=';

    /* renamed from: e */
    public static final Character f353554e = '>';

    /* renamed from: f */
    public static final Character f353555f = '<';

    /* renamed from: g */
    public static final Character f353556g = '?';

    /* renamed from: h */
    public static final Character f353557h = '\"';

    /* renamed from: i */
    public static final Character f353558i = Character.valueOf(XVFSFile.SEPARATOR_CHAR);

    /* renamed from: a */
    public static String m166883a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i = 0;
        while (true) {
            boolean z = true;
            if (!(i < length)) {
                return sb.toString();
            }
            int codePointAt = str.codePointAt(i);
            i += Character.charCount(codePointAt);
            int intValue = Integer.valueOf(codePointAt).intValue();
            if (intValue == 34) {
                sb.append("&quot;");
            } else if (intValue == 60) {
                sb.append("&lt;");
            } else if (intValue == 62) {
                sb.append("&gt;");
            } else if (intValue == 38) {
                sb.append("&amp;");
            } else if (intValue != 39) {
                if ((!Character.isISOControl(intValue) || intValue == 9 || intValue == 10 || intValue == 13) && ((intValue >= 32 && intValue <= 55295) || ((intValue >= 57344 && intValue <= 65533) || (intValue >= 65536 && intValue <= 1114111)))) {
                    z = false;
                }
                if (z) {
                    sb.append("&#x");
                    sb.append(Integer.toHexString(intValue));
                    sb.append(';');
                } else {
                    sb.appendCodePoint(intValue);
                }
            } else {
                sb.append("&apos;");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:214:0x0103 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m166884b(sr3.C118299j r12, sr3.C118290c r13, java.lang.String r14, sr3.C118298i r15) {
        /*
            java.lang.Object r0 = r12.mo183087h()
            java.lang.Character r1 = f353552c
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0116
            char r14 = r12.mo183080c()
            r0 = 45
            if (r14 != r0) goto L_0x0022
            char r13 = r12.mo183080c()
            if (r13 != r0) goto L_0x001e
            java.lang.String r13 = "-->"
            r12.mo183088i(r13)
            return r2
        L_0x001e:
            r12.mo183078a()
            goto L_0x008d
        L_0x0022:
            r0 = 91
            if (r14 != r0) goto L_0x008d
            java.lang.Object r14 = r12.mo183087h()
            java.lang.String r1 = "CDATA"
            boolean r14 = r1.equals(r14)
            if (r14 == 0) goto L_0x0086
            char r14 = r12.mo183080c()
            if (r14 != r0) goto L_0x0086
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
        L_0x003d:
            boolean r0 = r12.mo183079b()
            if (r0 == 0) goto L_0x007f
            char r0 = r12.mo183080c()
            r14.append(r0)
            int r0 = r14.length()
            int r0 = r0 + -3
            if (r0 < 0) goto L_0x003d
            char r1 = r14.charAt(r0)
            r3 = 93
            if (r1 != r3) goto L_0x003d
            int r1 = r0 + 1
            char r1 = r14.charAt(r1)
            if (r1 != r3) goto L_0x003d
            int r1 = r0 + 2
            char r1 = r14.charAt(r1)
            r3 = 62
            if (r1 != r3) goto L_0x003d
            r14.setLength(r0)
            java.lang.String r12 = r14.toString()
            int r14 = r12.length()
            if (r14 <= 0) goto L_0x007e
            java.lang.String r14 = r15.f353561b
            r13.mo183067a(r14, r12)
        L_0x007e:
            return r2
        L_0x007f:
            java.lang.String r13 = "Unclosed CDATA"
            sr3.b r12 = r12.mo183083f(r13)
            throw r12
        L_0x0086:
            java.lang.String r13 = "Expected 'CDATA['"
            sr3.b r12 = r12.mo183083f(r13)
            throw r12
        L_0x008d:
            char r13 = r12.mo183080c()
            boolean r14 = java.lang.Character.isWhitespace(r13)
            if (r14 != 0) goto L_0x008d
            if (r13 == 0) goto L_0x010f
            java.lang.String r14 = "Unterminated string"
            r15 = 39
            if (r13 == r15) goto L_0x00e7
            r0 = 47
            if (r13 == r0) goto L_0x00e4
            r1 = 33
            if (r13 == r1) goto L_0x00e1
            r4 = 34
            if (r13 == r4) goto L_0x00e7
            switch(r13) {
                case 60: goto L_0x00b8;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00b2;
                case 63: goto L_0x00af;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x00bb
        L_0x00af:
            java.lang.Character r13 = f353556g
            goto L_0x00f1
        L_0x00b2:
            java.lang.Character r13 = f353554e
            goto L_0x00f1
        L_0x00b5:
            java.lang.Character r13 = f353553d
            goto L_0x00f1
        L_0x00b8:
            java.lang.Character r13 = f353555f
            goto L_0x00f1
        L_0x00bb:
            char r13 = r12.mo183080c()
            boolean r5 = java.lang.Character.isWhitespace(r13)
            if (r5 == 0) goto L_0x00c8
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            goto L_0x00f1
        L_0x00c8:
            if (r13 == 0) goto L_0x00dc
            if (r13 == r15) goto L_0x00d6
            if (r13 == r0) goto L_0x00d6
            if (r13 == r1) goto L_0x00d6
            if (r13 == r4) goto L_0x00d6
            switch(r13) {
                case 60: goto L_0x00d6;
                case 61: goto L_0x00d6;
                case 62: goto L_0x00d6;
                case 63: goto L_0x00d6;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            goto L_0x00bb
        L_0x00d6:
            r12.mo183078a()
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            goto L_0x00f1
        L_0x00dc:
            sr3.b r12 = r12.mo183083f(r14)
            throw r12
        L_0x00e1:
            java.lang.Character r13 = f353552c
            goto L_0x00f1
        L_0x00e4:
            java.lang.Character r13 = f353558i
            goto L_0x00f1
        L_0x00e7:
            char r15 = r12.mo183080c()
            if (r15 == 0) goto L_0x010a
            if (r15 != r13) goto L_0x00e7
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
        L_0x00f1:
            if (r13 == 0) goto L_0x0103
            java.lang.Character r14 = f353555f
            if (r13 != r14) goto L_0x00fa
            int r3 = r3 + 1
            goto L_0x0100
        L_0x00fa:
            java.lang.Character r14 = f353554e
            if (r13 != r14) goto L_0x0100
            int r3 = r3 + -1
        L_0x0100:
            if (r3 > 0) goto L_0x008d
            return r2
        L_0x0103:
            java.lang.String r13 = "Missing '>' after '<!'."
            sr3.b r12 = r12.mo183083f(r13)
            throw r12
        L_0x010a:
            sr3.b r12 = r12.mo183083f(r14)
            throw r12
        L_0x010f:
            java.lang.String r13 = "Misshaped meta tag"
            sr3.b r12 = r12.mo183083f(r13)
            throw r12
        L_0x0116:
            java.lang.Character r1 = f353556g
            if (r0 != r1) goto L_0x0120
            java.lang.String r13 = "?>"
            r12.mo183088i(r13)
            return r2
        L_0x0120:
            java.lang.Character r1 = f353558i
            if (r0 != r1) goto L_0x0174
            java.lang.Object r13 = r12.mo183087h()
            if (r14 == 0) goto L_0x015e
            boolean r15 = r13.equals(r14)
            if (r15 == 0) goto L_0x0140
            java.lang.Object r13 = r12.mo183087h()
            java.lang.Character r14 = f353554e
            if (r13 != r14) goto L_0x0139
            return r3
        L_0x0139:
            java.lang.String r13 = "Misshaped close tag"
            sr3.b r12 = r12.mo183083f(r13)
            throw r12
        L_0x0140:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Mismatched "
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = " and "
            r15.append(r14)
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            sr3.b r12 = r12.mo183083f(r13)
            throw r12
        L_0x015e:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Mismatched close tag "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            sr3.b r12 = r12.mo183083f(r13)
            throw r12
        L_0x0174:
            boolean r14 = r0 instanceof java.lang.Character
            java.lang.String r1 = "Misshaped tag"
            if (r14 != 0) goto L_0x030c
            java.lang.String r0 = (java.lang.String) r0
            sr3.c r14 = new sr3.c
            r14.<init>()
            r4 = 0
            r5 = r4
            r7 = r5
            r6 = 0
        L_0x0185:
            if (r5 != 0) goto L_0x018b
            java.lang.Object r5 = r12.mo183087h()
        L_0x018b:
            boolean r8 = r5 instanceof java.lang.String
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x0217
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r12.mo183087h()
            java.lang.Character r10 = f353553d
            java.lang.String r11 = "__attr__"
            if (r8 != r10) goto L_0x0202
            java.lang.Object r8 = r12.mo183087h()
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L_0x01fb
            boolean r9 = r15.f353562c
            if (r9 == 0) goto L_0x01bc
            java.lang.String r9 = "xsi:nil"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L_0x01bc
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = java.lang.Boolean.parseBoolean(r9)
            if (r9 == 0) goto L_0x01bc
            r6 = 1
            goto L_0x01f9
        L_0x01bc:
            java.util.Map<java.lang.String, sr3.k<?>> r9 = r15.f353563d
            if (r9 == 0) goto L_0x01d8
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x01d8
            java.lang.String r9 = "xsi:type"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L_0x01d8
            java.util.Map<java.lang.String, sr3.k<?>> r5 = r15.f353563d
            java.lang.Object r5 = r5.get(r8)
            r7 = r5
            sr3.k r7 = (sr3.C118300k) r7
            goto L_0x01f9
        L_0x01d8:
            if (r6 != 0) goto L_0x01f9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            boolean r9 = r15.f353560a
            if (r9 == 0) goto L_0x01f0
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x01f6
        L_0x01f0:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = m166886d(r8)
        L_0x01f6:
            r14.mo183067a(r5, r8)
        L_0x01f9:
            r5 = r4
            goto L_0x0185
        L_0x01fb:
            java.lang.String r13 = "Missing value"
            sr3.b r12 = r12.mo183083f(r13)
            throw r12
        L_0x0202:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            r14.mo183067a(r5, r9)
            r5 = r8
            goto L_0x0185
        L_0x0217:
            java.lang.Character r8 = f353558i
            if (r5 != r8) goto L_0x0242
            java.lang.Object r15 = r12.mo183087h()
            java.lang.Character r3 = f353554e
            if (r15 != r3) goto L_0x023d
            if (r6 == 0) goto L_0x022b
            java.lang.Object r12 = sr3.C118290c.f353540c
            r13.mo183067a(r0, r12)
            goto L_0x023c
        L_0x022b:
            java.util.Map<java.lang.String, java.lang.Object> r12 = r14.f353541a
            java.util.HashMap r12 = (java.util.HashMap) r12
            int r12 = r12.size()
            if (r12 <= 0) goto L_0x0239
            r13.mo183067a(r0, r14)
            goto L_0x023c
        L_0x0239:
            r13.mo183067a(r0, r9)
        L_0x023c:
            return r2
        L_0x023d:
            sr3.b r12 = r12.mo183083f(r1)
            throw r12
        L_0x0242:
            java.lang.Character r6 = f353554e
            if (r5 != r6) goto L_0x0307
        L_0x0246:
            char r1 = r12.mo183080c()
            boolean r5 = java.lang.Character.isWhitespace(r1)
            if (r5 != 0) goto L_0x0246
            if (r1 != 0) goto L_0x0254
            r1 = r4
            goto L_0x0278
        L_0x0254:
            r5 = 60
            if (r1 != r5) goto L_0x025b
            java.lang.Character r1 = f353555f
            goto L_0x0278
        L_0x025b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
        L_0x0260:
            if (r1 != 0) goto L_0x026b
            java.lang.String r1 = r6.toString()
            java.lang.String r1 = r1.trim()
            goto L_0x0278
        L_0x026b:
            if (r1 != r5) goto L_0x02f2
            r12.mo183078a()
            java.lang.String r1 = r6.toString()
            java.lang.String r1 = r1.trim()
        L_0x0278:
            if (r1 != 0) goto L_0x0293
            if (r0 != 0) goto L_0x027d
            return r2
        L_0x027d:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Unclosed tag "
            r13.append(r14)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            sr3.b r12 = r12.mo183083f(r13)
            throw r12
        L_0x0293:
            boolean r5 = r1 instanceof java.lang.String
            if (r5 == 0) goto L_0x02ba
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            if (r5 <= 0) goto L_0x0246
            if (r7 == 0) goto L_0x02ab
            java.lang.String r5 = r15.f353561b
            java.lang.Object r1 = r7.mo183089a(r1)
            r14.mo183067a(r5, r1)
            goto L_0x0246
        L_0x02ab:
            java.lang.String r5 = r15.f353561b
            boolean r6 = r15.f353560a
            if (r6 == 0) goto L_0x02b2
            goto L_0x02b6
        L_0x02b2:
            java.lang.Object r1 = m166886d(r1)
        L_0x02b6:
            r14.mo183067a(r5, r1)
            goto L_0x0246
        L_0x02ba:
            java.lang.Character r5 = f353555f
            if (r1 != r5) goto L_0x0246
            boolean r1 = m166884b(r12, r14, r0, r15)
            if (r1 == 0) goto L_0x0246
            java.util.Map<java.lang.String, java.lang.Object> r12 = r14.f353541a
            java.util.HashMap r12 = (java.util.HashMap) r12
            int r12 = r12.size()
            if (r12 != 0) goto L_0x02d2
            r13.mo183067a(r0, r9)
            goto L_0x02f1
        L_0x02d2:
            java.util.Map<java.lang.String, java.lang.Object> r12 = r14.f353541a
            java.util.HashMap r12 = (java.util.HashMap) r12
            int r12 = r12.size()
            if (r12 != r3) goto L_0x02ee
            java.lang.String r12 = r15.f353561b
            java.lang.Object r12 = r14.mo183068d(r12)
            if (r12 == 0) goto L_0x02ee
            java.lang.String r12 = r15.f353561b
            java.lang.Object r12 = r14.mo183068d(r12)
            r13.mo183067a(r0, r12)
            goto L_0x02f1
        L_0x02ee:
            r13.mo183067a(r0, r14)
        L_0x02f1:
            return r2
        L_0x02f2:
            r8 = 38
            if (r1 != r8) goto L_0x02fe
            java.lang.Object r1 = r12.mo183086g(r1)
            r6.append(r1)
            goto L_0x0301
        L_0x02fe:
            r6.append(r1)
        L_0x0301:
            char r1 = r12.mo183080c()
            goto L_0x0260
        L_0x0307:
            sr3.b r12 = r12.mo183083f(r1)
            throw r12
        L_0x030c:
            sr3.b r12 = r12.mo183083f(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: sr3.C118297h.m166884b(sr3.j, sr3.c, java.lang.String, sr3.i):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|(2:28|29)(1:27)) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = java.lang.Double.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r0.isNaN() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        throw new java.lang.NumberFormatException("val [" + r10 + "] is not a valid number.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        throw new java.lang.NumberFormatException("val [" + r10 + "] is not a valid number.");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0051 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Number m166885c(java.lang.String r10) {
        /*
            r0 = 0
            char r1 = r10.charAt(r0)
            r2 = 57
            r3 = 45
            java.lang.String r4 = "] is not a valid number."
            java.lang.String r5 = "val ["
            r6 = 48
            if (r1 < r6) goto L_0x0013
            if (r1 <= r2) goto L_0x0015
        L_0x0013:
            if (r1 != r3) goto L_0x0113
        L_0x0015:
            r7 = 46
            int r7 = r10.indexOf(r7)
            r8 = -1
            r9 = 1
            if (r7 > r8) goto L_0x0037
            r7 = 101(0x65, float:1.42E-43)
            int r7 = r10.indexOf(r7)
            if (r7 > r8) goto L_0x0037
            r7 = 69
            int r7 = r10.indexOf(r7)
            if (r7 > r8) goto L_0x0037
            java.lang.String r7 = "-0"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            if (r0 == 0) goto L_0x0092
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0051 }
            r0.<init>(r10)     // Catch:{ NumberFormatException -> 0x0051 }
            if (r1 != r3) goto L_0x0050
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO     // Catch:{ NumberFormatException -> 0x0051 }
            int r1 = r1.compareTo(r0)     // Catch:{ NumberFormatException -> 0x0051 }
            if (r1 != 0) goto L_0x0050
            r0 = -9223372036854775808
            java.lang.Double r10 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0051 }
            return r10
        L_0x0050:
            return r0
        L_0x0051:
            java.lang.Double r0 = java.lang.Double.valueOf(r10)     // Catch:{ NumberFormatException -> 0x007a }
            boolean r1 = r0.isNaN()     // Catch:{ NumberFormatException -> 0x007a }
            if (r1 != 0) goto L_0x0062
            boolean r1 = r0.isInfinite()     // Catch:{ NumberFormatException -> 0x007a }
            if (r1 != 0) goto L_0x0062
            return r0
        L_0x0062:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x007a }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x007a }
            r1.append(r5)     // Catch:{ NumberFormatException -> 0x007a }
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x007a }
            r1.append(r4)     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x007a }
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x007a }
            throw r0     // Catch:{ NumberFormatException -> 0x007a }
        L_0x007a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x0092:
            if (r1 != r6) goto L_0x00bb
            int r0 = r10.length()
            if (r0 <= r9) goto L_0x00bb
            char r0 = r10.charAt(r9)
            if (r0 < r6) goto L_0x00eb
            if (r0 <= r2) goto L_0x00a3
            goto L_0x00eb
        L_0x00a3:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x00bb:
            if (r1 != r3) goto L_0x00eb
            int r0 = r10.length()
            r1 = 2
            if (r0 <= r1) goto L_0x00eb
            char r0 = r10.charAt(r9)
            char r1 = r10.charAt(r1)
            if (r0 != r6) goto L_0x00eb
            if (r1 < r6) goto L_0x00eb
            if (r1 <= r2) goto L_0x00d3
            goto L_0x00eb
        L_0x00d3:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x00eb:
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r10)
            int r10 = r0.bitLength()
            r1 = 31
            if (r10 > r1) goto L_0x0101
            int r10 = r0.intValue()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
        L_0x0101:
            int r10 = r0.bitLength()
            r1 = 63
            if (r10 > r1) goto L_0x0112
            long r0 = r0.longValue()
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            return r10
        L_0x0112:
            return r0
        L_0x0113:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r10)
            r1.append(r4)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sr3.C118297h.m166885c(java.lang.String):java.lang.Number");
    }

    /* renamed from: d */
    public static Object m166886d(String str) {
        if ("".equals(str)) {
            return str;
        }
        if ("true".equalsIgnoreCase(str)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(str)) {
            return Boolean.FALSE;
        }
        if ("null".equalsIgnoreCase(str)) {
            return C118290c.f353540c;
        }
        char charAt = str.charAt(0);
        if ((charAt < '0' || charAt > '9') && charAt != '-') {
            return str;
        }
        try {
            return m166885c(str);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: e */
    public static String m166887e(Object obj, String str, C118298i iVar) {
        Object obj2 = obj;
        String str2 = str;
        C118298i iVar2 = iVar;
        StringBuilder sb = new StringBuilder();
        if (obj2 instanceof C118290c) {
            C118290c cVar = (C118290c) obj2;
            char c = '<';
            if (str2 != null) {
                sb.append('<');
                sb.append(str2);
                for (String str3 : ((HashMap) cVar.f353541a).keySet()) {
                    if (str3.startsWith("__attr__")) {
                        String substring = str3.substring(8);
                        Object d = cVar.mo183068d(str3);
                        if (d == null) {
                            d = "";
                        }
                        sb.append(" ");
                        sb.append(substring);
                        sb.append(f353553d);
                        sb.append(" \"");
                        sb.append(m166883a(d.toString()));
                        sb.append(FastJsonResponse.QUOTE);
                    }
                }
                sb.append('>');
            }
            for (String str4 : ((HashMap) cVar.f353541a).keySet()) {
                if (!str4.startsWith("__attr__")) {
                    Object d2 = cVar.mo183068d(str4);
                    if (d2 == null) {
                        d2 = "";
                    } else if (d2.getClass().isArray()) {
                        d2 = new C118288a(d2);
                    }
                    if (str4.equals(iVar2.f353561b)) {
                        if (d2 instanceof C118288a) {
                            C118288a aVar = (C118288a) d2;
                            int size = aVar.f353538d.size();
                            for (int i = 0; i < size; i++) {
                                if (i > 0) {
                                    sb.append(10);
                                }
                                sb.append(m166883a(aVar.mo183062h(i).toString()));
                            }
                        } else {
                            sb.append(m166883a(d2.toString()));
                        }
                    } else if (d2 instanceof C118288a) {
                        C118288a aVar2 = (C118288a) d2;
                        int size2 = aVar2.f353538d.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object h = aVar2.mo183062h(i2);
                            if (h instanceof C118288a) {
                                sb.append(c);
                                sb.append(str4);
                                sb.append('>');
                                sb.append(m166887e(h, (String) null, iVar2));
                                sb.append("</");
                                sb.append(str4);
                                sb.append('>');
                            } else {
                                sb.append(m166887e(h, str4, iVar2));
                            }
                            i2++;
                            c = '<';
                        }
                    } else {
                        if ("".equals(d2)) {
                            sb.append('<');
                            sb.append(str4);
                            sb.append("/>");
                        } else {
                            sb.append(m166887e(d2, str4, iVar2));
                        }
                        c = '<';
                    }
                    c = '<';
                }
            }
            if (str2 != null) {
                sb.append("</");
                sb.append(str2);
                sb.append('>');
            }
            return sb.toString();
        } else if (obj2 == null || (!(obj2 instanceof C118288a) && !obj.getClass().isArray())) {
            String a = obj2 == null ? "null" : m166883a(obj.toString());
            if (str2 == null) {
                return FastJsonResponse.QUOTE + a + FastJsonResponse.QUOTE;
            } else if (a.length() == 0) {
                return "<" + str2 + "/>";
            } else {
                return "<" + str2 + ">" + a + "</" + str2 + ">";
            }
        } else {
            C118288a aVar3 = obj.getClass().isArray() ? new C118288a(obj2) : (C118288a) obj2;
            int size3 = aVar3.f353538d.size();
            for (int i3 = 0; i3 < size3; i3++) {
                sb.append(m166887e(aVar3.mo183062h(i3), str2 == null ? "__array__" : str2, iVar2));
            }
            return sb.toString();
        }
    }
}
