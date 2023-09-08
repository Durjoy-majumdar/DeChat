package com.tencent.p014mm.pluginsdk.platformtools;

import java.util.Locale;

/* renamed from: com.tencent.mm.pluginsdk.platformtools.e */
public class C72714e {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m85106a(java.lang.CharSequence r17, android.text.format.Time r18) {
        /*
            r0 = r17
            r1 = r18
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r0)
            int r3 = r17.length()
            r4 = 0
            r5 = 0
        L_0x000f:
            if (r5 >= r3) goto L_0x01d0
            char r6 = r2.charAt(r5)
            r7 = 39
            r8 = 1
            if (r6 != r7) goto L_0x005b
            int r6 = r5 + 1
            if (r6 >= r3) goto L_0x0028
            char r9 = r2.charAt(r6)
            if (r9 != r7) goto L_0x0028
            r2.delete(r5, r6)
            goto L_0x0053
        L_0x0028:
            r2.delete(r5, r6)
            int r3 = r3 + -1
            r6 = r5
            r8 = 0
        L_0x002f:
            if (r6 >= r3) goto L_0x0053
            char r9 = r2.charAt(r6)
            if (r9 != r7) goto L_0x004e
            int r9 = r6 + 1
            if (r9 >= r3) goto L_0x004a
            char r10 = r2.charAt(r9)
            if (r10 != r7) goto L_0x004a
            r2.delete(r6, r9)
            int r3 = r3 + -1
            int r8 = r8 + 1
            r6 = r9
            goto L_0x002f
        L_0x004a:
            r2.delete(r6, r9)
            goto L_0x0053
        L_0x004e:
            int r6 = r6 + 1
            int r8 = r8 + 1
            goto L_0x002f
        L_0x0053:
            int r3 = r2.length()
            r4 = r5
            r10 = 0
            goto L_0x01cb
        L_0x005b:
            r7 = 1
        L_0x005c:
            int r9 = r5 + r7
            if (r9 >= r3) goto L_0x0069
            char r10 = r2.charAt(r9)
            if (r10 != r6) goto L_0x0069
            int r7 = r7 + 1
            goto L_0x005c
        L_0x0069:
            r10 = 65
            r11 = 12
            if (r6 == r10) goto L_0x01ae
            r10 = 69
            r12 = 20
            r13 = 10
            r14 = 4
            if (r6 == r10) goto L_0x019e
            r10 = 97
            if (r6 == r10) goto L_0x0191
            r10 = 100
            if (r6 == r10) goto L_0x0187
            r10 = 104(0x68, float:1.46E-43)
            if (r6 == r10) goto L_0x0168
            r10 = 107(0x6b, float:1.5E-43)
            if (r6 == r10) goto L_0x015e
            r10 = 109(0x6d, float:1.53E-43)
            if (r6 == r10) goto L_0x0154
            r10 = 115(0x73, float:1.61E-43)
            if (r6 == r10) goto L_0x0149
            r10 = 76
            if (r6 == r10) goto L_0x012e
            r10 = 77
            if (r6 == r10) goto L_0x012e
            r10 = 121(0x79, float:1.7E-43)
            r11 = 2
            if (r6 == r10) goto L_0x010a
            r10 = 122(0x7a, float:1.71E-43)
            if (r6 == r10) goto L_0x00a5
            r6 = 0
            r16 = r5
            goto L_0x0107
        L_0x00a5:
            java.util.TimeZone r6 = java.util.TimeZone.getDefault()
            java.util.Date r10 = new java.util.Date
            long r12 = r1.toMillis(r4)
            r10.<init>(r12)
            r6.inDaylightTime(r10)
            if (r7 >= r11) goto L_0x00f8
            int r6 = r6.getRawOffset()
            long r12 = (long) r6
            long r14 = r1.gmtoff
            long r12 = r12 + r14
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r14
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r14 = 0
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 >= 0) goto L_0x00d4
            java.lang.String r8 = "-"
            r6.insert(r4, r8)
            long r12 = -r12
            goto L_0x00d9
        L_0x00d4:
            java.lang.String r8 = "+"
            r6.insert(r4, r8)
        L_0x00d9:
            r14 = 3600(0xe10, double:1.7786E-320)
            r16 = r5
            long r4 = r12 / r14
            int r5 = (int) r4
            long r12 = r12 % r14
            r14 = 60
            long r12 = r12 / r14
            int r4 = (int) r12
            java.lang.String r5 = m85107b(r5, r11)
            r6.append(r5)
            java.lang.String r4 = m85107b(r4, r11)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            goto L_0x0116
        L_0x00f8:
            r16 = r5
            int r4 = r1.isDst
            if (r4 == 0) goto L_0x0100
            r4 = 0
            goto L_0x0102
        L_0x0100:
            r4 = 0
            r8 = 0
        L_0x0102:
            java.lang.String r5 = r6.getDisplayName(r8, r4)
            r6 = r5
        L_0x0107:
            r10 = 0
            goto L_0x01ba
        L_0x010a:
            r16 = r5
            int r4 = r1.year
            if (r7 > r11) goto L_0x0118
            int r4 = r4 % 100
            java.lang.String r4 = m85107b(r4, r11)
        L_0x0116:
            r6 = r4
            goto L_0x0107
        L_0x0118:
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r10 = 0
            r6[r10] = r4
            java.lang.String r4 = "%d"
            java.lang.String r4 = java.lang.String.format(r5, r4, r6)
        L_0x012b:
            r6 = r4
            goto L_0x01ba
        L_0x012e:
            r16 = r5
            r10 = 0
            int r4 = r1.month
            if (r7 < r14) goto L_0x013a
            java.lang.String r4 = android.text.format.DateUtils.getMonthString(r4, r13)
            goto L_0x012b
        L_0x013a:
            r5 = 3
            if (r7 != r5) goto L_0x0142
            java.lang.String r4 = android.text.format.DateUtils.getMonthString(r4, r12)
            goto L_0x012b
        L_0x0142:
            int r4 = r4 + 1
            java.lang.String r4 = m85107b(r4, r7)
            goto L_0x012b
        L_0x0149:
            r16 = r5
            r10 = 0
            int r4 = r1.second
            java.lang.String r6 = m85107b(r4, r7)
            goto L_0x01ba
        L_0x0154:
            r16 = r5
            r10 = 0
            int r4 = r1.minute
            java.lang.String r6 = m85107b(r4, r7)
            goto L_0x01ba
        L_0x015e:
            r16 = r5
            r10 = 0
            int r4 = r1.hour
            java.lang.String r6 = m85107b(r4, r7)
            goto L_0x01ba
        L_0x0168:
            r16 = r5
            r10 = 0
            int r4 = r1.hour
            if (r4 != 0) goto L_0x0171
            r4 = 12
        L_0x0171:
            if (r4 <= r11) goto L_0x0175
            int r4 = r4 + -12
        L_0x0175:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ""
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = r5.toString()
            goto L_0x01ba
        L_0x0187:
            r16 = r5
            r10 = 0
            int r4 = r1.monthDay
            java.lang.String r6 = m85107b(r4, r7)
            goto L_0x01ba
        L_0x0191:
            r16 = r5
            r10 = 0
            int r4 = r1.hour
            if (r4 >= r11) goto L_0x0199
            r8 = 0
        L_0x0199:
            java.lang.String r6 = android.text.format.DateUtils.getAMPMString(r8)
            goto L_0x01ba
        L_0x019e:
            r16 = r5
            r10 = 0
            int r4 = r1.weekDay
            int r4 = r4 + r8
            if (r7 >= r14) goto L_0x01a7
            goto L_0x01a9
        L_0x01a7:
            r12 = 10
        L_0x01a9:
            java.lang.String r6 = android.text.format.DateUtils.getDayOfWeekString(r4, r12)
            goto L_0x01ba
        L_0x01ae:
            r16 = r5
            r10 = 0
            int r4 = r1.hour
            if (r4 >= r11) goto L_0x01b6
            r8 = 0
        L_0x01b6:
            java.lang.String r6 = android.text.format.DateUtils.getAMPMString(r8)
        L_0x01ba:
            r4 = r16
            if (r6 == 0) goto L_0x01ca
            r2.replace(r4, r9, r6)
            int r8 = r6.length()
            int r3 = r2.length()
            goto L_0x01cb
        L_0x01ca:
            r8 = r7
        L_0x01cb:
            int r5 = r4 + r8
            r4 = 0
            goto L_0x000f
        L_0x01d0:
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x01da
            android.text.SpannedString r0 = new android.text.SpannedString
            r0.<init>(r2)
            return r0
        L_0x01da:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.platformtools.C72714e.m85106a(java.lang.CharSequence, android.text.format.Time):java.lang.CharSequence");
    }

    /* renamed from: b */
    public static String m85107b(int i, int i2) {
        if (i2 != 2) {
            Locale locale = Locale.getDefault();
            return String.format(locale, "%0" + i2 + "d", new Object[]{Integer.valueOf(i)});
        } else if (i < 10) {
            return "0" + i;
        } else {
            return i + "";
        }
    }
}
