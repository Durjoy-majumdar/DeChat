package ys3;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: ys3.d */
public class C118992d {

    /* renamed from: ys3.d$a */
    public static class C118993a {

        /* renamed from: a */
        public int f356424a;

        /* renamed from: b */
        public int f356425b;

        /* renamed from: c */
        public int f356426c;

        /* renamed from: d */
        public String f356427d;

        /* renamed from: e */
        public String f356428e;

        public C118993a(int i, int i2, String str, int i3, String str2) {
            this.f356424a = i;
            this.f356425b = i2;
            this.f356427d = str;
            this.f356426c = i3;
            this.f356428e = str2;
        }

        public String toString() {
            return "PID=" + this.f356424a + " PPID=" + this.f356425b + " NAME=" + this.f356427d + " UID=" + this.f356426c + " CONTEXT=" + this.f356428e;
        }
    }

    /* renamed from: a */
    public static int m167755a(byte[] bArr, int i, char c) {
        int i2;
        int i3 = i - 1;
        while (true) {
            i2 = i3 + 1;
            if (i3 >= bArr.length) {
                return 0;
            }
            if (i2 == bArr.length || bArr[i2] == c) {
                return i2;
            }
            i3 = i2;
        }
        return i2;
    }

    /* renamed from: b */
    public static String m167756b(int i) {
        try {
            Locale locale = Locale.ENGLISH;
            byte[] c = C118989a.m167753c(String.format(locale, "/proc/%d/cmdline", new Object[]{Integer.valueOf(i)}), 100);
            String str = c != null ? new String(c, 0, m167755a(c, 0, 0)) : "";
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            byte[] c2 = C118989a.m167753c(String.format(locale, "/proc/%d/status", new Object[]{Integer.valueOf(i)}), 150);
            if (c2 == null) {
                return str;
            }
            int a = m167755a(c2, 7, 10);
            return a == 0 ? "" : new String(c2, 6, a - 6);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ys3.C118992d.C118993a m167757c(int r15) {
        /*
            r0 = 0
            r1 = 0
            r2 = -1
            r3 = 1
            java.lang.String r4 = m167756b(r15)     // Catch:{ Exception -> 0x0075 }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0076 }
            java.lang.String r6 = "/proc/%d/status"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0076 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0076 }
            r7[r0] = r8     // Catch:{ Exception -> 0x0076 }
            java.lang.String r5 = java.lang.String.format(r5, r6, r7)     // Catch:{ Exception -> 0x0076 }
            r6 = 150(0x96, float:2.1E-43)
            byte[] r5 = ys3.C118989a.m167753c(r5, r6)     // Catch:{ Exception -> 0x0076 }
            if (r5 == 0) goto L_0x006f
            r6 = 7
            r7 = 10
            int r6 = m167755a(r5, r6, r7)     // Catch:{ Exception -> 0x0076 }
            if (r6 != 0) goto L_0x002a
            goto L_0x006f
        L_0x002a:
            int r6 = r6 + r3
            int r6 = m167755a(r5, r6, r7)     // Catch:{ Exception -> 0x0076 }
            int r6 = r6 + r3
            int r6 = m167755a(r5, r6, r7)     // Catch:{ Exception -> 0x0076 }
            int r6 = r6 + r3
            int r6 = m167755a(r5, r6, r7)     // Catch:{ Exception -> 0x0076 }
            if (r6 != 0) goto L_0x003c
            goto L_0x0045
        L_0x003c:
            int r8 = r6 + 7
            int r6 = r6 + r3
            int r6 = m167755a(r5, r6, r7)     // Catch:{ Exception -> 0x0076 }
            if (r6 != 0) goto L_0x0046
        L_0x0045:
            goto L_0x006f
        L_0x0046:
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x0076 }
            int r10 = r6 - r8
            r9.<init>(r5, r8, r10)     // Catch:{ Exception -> 0x0076 }
            int r8 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x0076 }
            int r6 = r6 + r3
            int r6 = m167755a(r5, r6, r7)     // Catch:{ Exception -> 0x0077 }
            if (r6 != 0) goto L_0x005a
            r5 = -1
            goto L_0x0071
        L_0x005a:
            int r6 = r6 + 6
            int r7 = r6 + 1
            r9 = 9
            int r7 = m167755a(r5, r7, r9)     // Catch:{ Exception -> 0x0077 }
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x0077 }
            int r7 = r7 - r6
            r9.<init>(r5, r6, r7)     // Catch:{ Exception -> 0x0077 }
            int r5 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0071
        L_0x006f:
            r5 = -1
            r8 = -1
        L_0x0071:
            r12 = r4
            r13 = r5
            r11 = r8
            goto L_0x007a
        L_0x0075:
            r4 = r1
        L_0x0076:
            r8 = -1
        L_0x0077:
            r12 = r4
            r11 = r8
            r13 = -1
        L_0x007a:
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0099 }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = "/proc/%d/attr/current"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0099 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0099 }
            r3[r0] = r7     // Catch:{ Exception -> 0x0099 }
            java.lang.String r0 = java.lang.String.format(r5, r6, r3)     // Catch:{ Exception -> 0x0099 }
            byte[] r0 = ys3.C118989a.m167752b(r0)     // Catch:{ Exception -> 0x0099 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r0 = r4.trim()     // Catch:{ Exception -> 0x0099 }
            r14 = r0
            goto L_0x009b
        L_0x0099:
            r14 = r1
        L_0x009b:
            if (r12 == 0) goto L_0x00aa
            if (r11 == r2) goto L_0x00aa
            if (r13 != r2) goto L_0x00a2
            goto L_0x00aa
        L_0x00a2:
            ys3.d$a r0 = new ys3.d$a
            r9 = r0
            r10 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ys3.C118992d.m167757c(int):ys3.d$a");
    }
}
