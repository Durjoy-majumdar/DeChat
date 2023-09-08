package p290a8;

import android.text.TextUtils;
import com.tencent.xweb.IXWebBroadcastListener;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p290a8.C16442e;
import p333e8.C20541m;

/* renamed from: a8.f */
public final class C16445f {

    /* renamed from: b */
    public static final Pattern f43894b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: c */
    public static final Pattern f43895c = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: a */
    public final StringBuilder f43896a = new StringBuilder();

    /* renamed from: a8.f$a */
    public static final class C16446a {

        /* renamed from: e */
        public static final String[] f43897e = new String[0];

        /* renamed from: a */
        public final String f43898a;

        /* renamed from: b */
        public final int f43899b;

        /* renamed from: c */
        public final String f43900c;

        /* renamed from: d */
        public final String[] f43901d;

        public C16446a(String str, int i, String str2, String[] strArr) {
            this.f43899b = i;
            this.f43898a = str;
            this.f43900c = str2;
            this.f43901d = strArr;
        }
    }

    /* renamed from: a8.f$b */
    public static final class C16447b implements Comparable<C16447b> {

        /* renamed from: d */
        public final int f43902d;

        /* renamed from: e */
        public final C16441d f43903e;

        public C16447b(int i, C16441d dVar) {
            this.f43902d = i;
            this.f43903e = dVar;
        }

        public int compareTo(Object obj) {
            return this.f43902d - ((C16447b) obj).f43902d;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0132  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15272a(java.lang.String r17, p290a8.C16445f.C16446a r18, android.text.SpannableStringBuilder r19, java.util.List<p290a8.C16441d> r20, java.util.List<p290a8.C16445f.C16447b> r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            int r3 = r0.f43899b
            int r4 = r19.length()
            java.lang.String r5 = r0.f43898a
            r5.getClass()
            int r6 = r5.hashCode()
            r10 = 2
            r11 = 0
            r12 = 1
            if (r6 == 0) goto L_0x0078
            r13 = 105(0x69, float:1.47E-43)
            if (r6 == r13) goto L_0x006d
            r13 = 3314158(0x3291ee, float:4.644125E-39)
            if (r6 == r13) goto L_0x0062
            r13 = 98
            if (r6 == r13) goto L_0x0057
            r13 = 99
            if (r6 == r13) goto L_0x004c
            r13 = 117(0x75, float:1.64E-43)
            if (r6 == r13) goto L_0x0040
            r13 = 118(0x76, float:1.65E-43)
            if (r6 == r13) goto L_0x0034
            goto L_0x0080
        L_0x0034:
            java.lang.String r6 = "v"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x003e
            goto L_0x0080
        L_0x003e:
            r5 = 5
            goto L_0x0083
        L_0x0040:
            java.lang.String r6 = "u"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x004a
            goto L_0x0080
        L_0x004a:
            r5 = 4
            goto L_0x0083
        L_0x004c:
            java.lang.String r6 = "c"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0055
            goto L_0x0080
        L_0x0055:
            r5 = 2
            goto L_0x0083
        L_0x0057:
            java.lang.String r6 = "b"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0060
            goto L_0x0080
        L_0x0060:
            r5 = 1
            goto L_0x0083
        L_0x0062:
            java.lang.String r6 = "lang"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x006b
            goto L_0x0080
        L_0x006b:
            r5 = 6
            goto L_0x0083
        L_0x006d:
            java.lang.String r6 = "i"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            r5 = 3
            goto L_0x0083
        L_0x0078:
            java.lang.String r6 = ""
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0082
        L_0x0080:
            r5 = -1
            goto L_0x0083
        L_0x0082:
            r5 = 0
        L_0x0083:
            r6 = 33
            switch(r5) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x009b;
                case 2: goto L_0x00a3;
                case 3: goto L_0x0092;
                case 4: goto L_0x0089;
                case 5: goto L_0x00a3;
                case 6: goto L_0x00a3;
                default: goto L_0x0088;
            }
        L_0x0088:
            return
        L_0x0089:
            android.text.style.UnderlineSpan r5 = new android.text.style.UnderlineSpan
            r5.<init>()
            r1.setSpan(r5, r3, r4, r6)
            goto L_0x00a3
        L_0x0092:
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r10)
            r1.setSpan(r5, r3, r4, r6)
            goto L_0x00a3
        L_0x009b:
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r12)
            r1.setSpan(r5, r3, r4, r6)
        L_0x00a3:
            r21.clear()
            int r5 = r20.size()
            r13 = 0
        L_0x00ab:
            if (r13 >= r5) goto L_0x0128
            r14 = r20
            java.lang.Object r15 = r14.get(r13)
            a8.d r15 = (p290a8.C16441d) r15
            java.lang.String r7 = r0.f43898a
            java.lang.String[] r6 = r0.f43901d
            java.lang.String r12 = r0.f43900c
            java.lang.String r9 = r15.f43867a
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00e3
            java.lang.String r9 = r15.f43868b
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00e3
            java.util.List<java.lang.String> r9 = r15.f43869c
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00e3
            java.lang.String r9 = r15.f43870d
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00e3
            boolean r6 = r7.isEmpty()
            r10 = r17
            r9 = 4
            goto L_0x0116
        L_0x00e3:
            java.lang.String r9 = r15.f43867a
            r8 = 1073741824(0x40000000, float:2.0)
            r10 = r17
            int r8 = p290a8.C16441d.m15269a(r11, r9, r10, r8)
            java.lang.String r9 = r15.f43868b
            r11 = 2
            int r7 = p290a8.C16441d.m15269a(r8, r9, r7, r11)
            java.lang.String r8 = r15.f43870d
            r9 = 4
            int r7 = p290a8.C16441d.m15269a(r7, r8, r12, r9)
            r8 = -1
            if (r7 == r8) goto L_0x0115
            java.util.List r6 = java.util.Arrays.asList(r6)
            java.util.List<java.lang.String> r8 = r15.f43869c
            boolean r6 = r6.containsAll(r8)
            if (r6 != 0) goto L_0x010b
            goto L_0x0115
        L_0x010b:
            java.util.List<java.lang.String> r6 = r15.f43869c
            int r6 = r6.size()
            int r6 = r6 * 4
            int r6 = r6 + r7
            goto L_0x0116
        L_0x0115:
            r6 = 0
        L_0x0116:
            if (r6 <= 0) goto L_0x0120
            a8.f$b r7 = new a8.f$b
            r7.<init>(r6, r15)
            r2.add(r7)
        L_0x0120:
            int r13 = r13 + 1
            r6 = 33
            r10 = 2
            r11 = 0
            r12 = 1
            goto L_0x00ab
        L_0x0128:
            java.util.Collections.sort(r21)
            int r0 = r21.size()
            r5 = 0
        L_0x0130:
            if (r5 >= r0) goto L_0x0226
            java.lang.Object r6 = r2.get(r5)
            a8.f$b r6 = (p290a8.C16445f.C16447b) r6
            a8.d r6 = r6.f43903e
            if (r6 != 0) goto L_0x0143
            r7 = -1
            r9 = 33
            r10 = 2
            r11 = 3
            goto L_0x0214
        L_0x0143:
            int r7 = r6.f43878l
            r8 = -1
            if (r7 != r8) goto L_0x014e
            int r9 = r6.f43879m
            if (r9 != r8) goto L_0x014e
            r8 = -1
            goto L_0x015d
        L_0x014e:
            r8 = 1
            if (r7 != r8) goto L_0x0153
            r7 = 1
            goto L_0x0154
        L_0x0153:
            r7 = 0
        L_0x0154:
            int r9 = r6.f43879m
            if (r9 != r8) goto L_0x015a
            r11 = 2
            goto L_0x015b
        L_0x015a:
            r11 = 0
        L_0x015b:
            r8 = r7 | r11
        L_0x015d:
            r7 = -1
            if (r8 == r7) goto L_0x0183
            android.text.style.StyleSpan r8 = new android.text.style.StyleSpan
            int r9 = r6.f43878l
            if (r9 != r7) goto L_0x016c
            int r10 = r6.f43879m
            if (r10 != r7) goto L_0x016c
            r9 = -1
            goto L_0x017a
        L_0x016c:
            r10 = 1
            if (r9 != r10) goto L_0x0171
            r9 = 1
            goto L_0x0172
        L_0x0171:
            r9 = 0
        L_0x0172:
            int r11 = r6.f43879m
            if (r11 != r10) goto L_0x0178
            r11 = 2
            goto L_0x0179
        L_0x0178:
            r11 = 0
        L_0x0179:
            r9 = r9 | r11
        L_0x017a:
            r8.<init>(r9)
            r9 = 33
            r1.setSpan(r8, r3, r4, r9)
            goto L_0x0185
        L_0x0183:
            r9 = 33
        L_0x0185:
            int r8 = r6.f43876j
            r10 = 1
            if (r8 != r10) goto L_0x018d
            r16 = 1
            goto L_0x018f
        L_0x018d:
            r16 = 0
        L_0x018f:
            if (r16 == 0) goto L_0x0199
            android.text.style.StrikethroughSpan r8 = new android.text.style.StrikethroughSpan
            r8.<init>()
            r1.setSpan(r8, r3, r4, r9)
        L_0x0199:
            int r8 = r6.f43877k
            if (r8 != r10) goto L_0x019f
            r8 = 1
            goto L_0x01a0
        L_0x019f:
            r8 = 0
        L_0x01a0:
            if (r8 == 0) goto L_0x01aa
            android.text.style.UnderlineSpan r8 = new android.text.style.UnderlineSpan
            r8.<init>()
            r1.setSpan(r8, r3, r4, r9)
        L_0x01aa:
            boolean r8 = r6.f43873g
            if (r8 == 0) goto L_0x01c5
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            boolean r10 = r6.f43873g
            if (r10 == 0) goto L_0x01bd
            int r10 = r6.f43872f
            r8.<init>(r10)
            r1.setSpan(r8, r3, r4, r9)
            goto L_0x01c5
        L_0x01bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color not defined"
            r0.<init>(r1)
            throw r0
        L_0x01c5:
            boolean r8 = r6.f43875i
            if (r8 == 0) goto L_0x01e2
            android.text.style.BackgroundColorSpan r8 = new android.text.style.BackgroundColorSpan
            boolean r9 = r6.f43875i
            if (r9 == 0) goto L_0x01da
            int r9 = r6.f43874h
            r8.<init>(r9)
            r9 = 33
            r1.setSpan(r8, r3, r4, r9)
            goto L_0x01e2
        L_0x01da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color not defined."
            r0.<init>(r1)
            throw r0
        L_0x01e2:
            java.lang.String r8 = r6.f43871e
            if (r8 == 0) goto L_0x01f3
            android.text.style.TypefaceSpan r8 = new android.text.style.TypefaceSpan
            java.lang.String r9 = r6.f43871e
            r8.<init>(r9)
            r9 = 33
            r1.setSpan(r8, r3, r4, r9)
            goto L_0x01f5
        L_0x01f3:
            r9 = 33
        L_0x01f5:
            int r6 = r6.f43880n
            r8 = 0
            r10 = 1
            if (r6 == r10) goto L_0x0216
            r10 = 2
            if (r6 == r10) goto L_0x020b
            r11 = 3
            if (r6 == r11) goto L_0x0202
            goto L_0x0214
        L_0x0202:
            android.text.style.RelativeSizeSpan r6 = new android.text.style.RelativeSizeSpan
            r6.<init>(r8)
            r1.setSpan(r6, r3, r4, r9)
            goto L_0x0214
        L_0x020b:
            r11 = 3
            android.text.style.RelativeSizeSpan r6 = new android.text.style.RelativeSizeSpan
            r6.<init>(r8)
            r1.setSpan(r6, r3, r4, r9)
        L_0x0214:
            r12 = 1
            goto L_0x0222
        L_0x0216:
            r10 = 2
            r11 = 3
            android.text.style.AbsoluteSizeSpan r6 = new android.text.style.AbsoluteSizeSpan
            int r8 = (int) r8
            r12 = 1
            r6.<init>(r8, r12)
            r1.setSpan(r6, r3, r4, r9)
        L_0x0222:
            int r5 = r5 + 1
            goto L_0x0130
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p290a8.C16445f.m15272a(java.lang.String, a8.f$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    /* renamed from: b */
    public static boolean m15273b(String str, Matcher matcher, C20541m mVar, C16442e.C16443b bVar, StringBuilder sb, List<C16441d> list) {
        try {
            bVar.f43883a = C16449h.m15279b(matcher.group(1));
            bVar.f43884b = C16449h.m15279b(matcher.group(2));
            m15274c(matcher.group(3), bVar);
            sb.setLength(0);
            while (true) {
                String d = mVar.mo32093d();
                if (!TextUtils.isEmpty(d)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(d.trim());
                } else {
                    m15275d(str, sb.toString(), bVar, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            matcher.group();
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        if (r3.equals("middle") == false) goto L_0x006e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15274c(java.lang.String r9, p290a8.C16442e.C16443b r10) {
        /*
            java.util.regex.Pattern r0 = f43895c
            java.util.regex.Matcher r9 = r0.matcher(r9)
        L_0x0006:
            boolean r0 = r9.find()
            if (r0 == 0) goto L_0x0100
            r0 = 1
            java.lang.String r1 = r9.group(r0)
            r2 = 2
            java.lang.String r3 = r9.group(r2)
            java.lang.String r4 = "line"
            boolean r4 = r4.equals(r1)     // Catch:{ NumberFormatException -> 0x00fb }
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 44
            r7 = 0
            r8 = -1
            if (r4 == 0) goto L_0x005c
            int r1 = r3.indexOf(r6)     // Catch:{ NumberFormatException -> 0x00fb }
            if (r1 == r8) goto L_0x003b
            int r2 = r1 + 1
            java.lang.String r2 = r3.substring(r2)     // Catch:{ NumberFormatException -> 0x00fb }
            int r2 = m15276e(r2)     // Catch:{ NumberFormatException -> 0x00fb }
            r10.f43889g = r2     // Catch:{ NumberFormatException -> 0x00fb }
            java.lang.String r3 = r3.substring(r7, r1)     // Catch:{ NumberFormatException -> 0x00fb }
            goto L_0x003d
        L_0x003b:
            r10.f43889g = r5     // Catch:{ NumberFormatException -> 0x00fb }
        L_0x003d:
            java.lang.String r1 = "%"
            boolean r1 = r3.endsWith(r1)     // Catch:{ NumberFormatException -> 0x00fb }
            if (r1 == 0) goto L_0x004e
            float r0 = p290a8.C16449h.m15278a(r3)     // Catch:{ NumberFormatException -> 0x00fb }
            r10.f43887e = r0     // Catch:{ NumberFormatException -> 0x00fb }
            r10.f43888f = r7     // Catch:{ NumberFormatException -> 0x00fb }
            goto L_0x0006
        L_0x004e:
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x00fb }
            if (r1 >= 0) goto L_0x0056
            int r1 = r1 + -1
        L_0x0056:
            float r1 = (float) r1     // Catch:{ NumberFormatException -> 0x00fb }
            r10.f43887e = r1     // Catch:{ NumberFormatException -> 0x00fb }
            r10.f43888f = r0     // Catch:{ NumberFormatException -> 0x00fb }
            goto L_0x0006
        L_0x005c:
            java.lang.String r4 = "align"
            boolean r4 = r4.equals(r1)     // Catch:{ NumberFormatException -> 0x00fb }
            if (r4 == 0) goto L_0x00c1
            r3.getClass()     // Catch:{ NumberFormatException -> 0x00fb }
            int r1 = r3.hashCode()
            switch(r1) {
                case -1364013995: goto L_0x00a6;
                case -1074341483: goto L_0x009d;
                case 100571: goto L_0x0092;
                case 3317767: goto L_0x0087;
                case 108511772: goto L_0x007c;
                case 109757538: goto L_0x0070;
                default: goto L_0x006e;
            }
        L_0x006e:
            r0 = -1
            goto L_0x00b0
        L_0x0070:
            java.lang.String r0 = "start"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x007a
            goto L_0x006e
        L_0x007a:
            r0 = 5
            goto L_0x00b0
        L_0x007c:
            java.lang.String r0 = "right"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0085
            goto L_0x006e
        L_0x0085:
            r0 = 4
            goto L_0x00b0
        L_0x0087:
            java.lang.String r0 = "left"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0090
            goto L_0x006e
        L_0x0090:
            r0 = 3
            goto L_0x00b0
        L_0x0092:
            java.lang.String r0 = "end"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x009b
            goto L_0x006e
        L_0x009b:
            r0 = 2
            goto L_0x00b0
        L_0x009d:
            java.lang.String r1 = "middle"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x00b0
            goto L_0x006e
        L_0x00a6:
            java.lang.String r0 = "center"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00af
            goto L_0x006e
        L_0x00af:
            r0 = 0
        L_0x00b0:
            switch(r0) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x00bb;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00b5;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00b5;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            r0 = 0
            goto L_0x00bd
        L_0x00b5:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NumberFormatException -> 0x00fb }
            goto L_0x00bd
        L_0x00b8:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NumberFormatException -> 0x00fb }
            goto L_0x00bd
        L_0x00bb:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NumberFormatException -> 0x00fb }
        L_0x00bd:
            r10.f43886d = r0     // Catch:{ NumberFormatException -> 0x00fb }
            goto L_0x0006
        L_0x00c1:
            java.lang.String r0 = "position"
            boolean r0 = r0.equals(r1)     // Catch:{ NumberFormatException -> 0x00fb }
            if (r0 == 0) goto L_0x00ea
            int r0 = r3.indexOf(r6)     // Catch:{ NumberFormatException -> 0x00fb }
            if (r0 == r8) goto L_0x00e0
            int r1 = r0 + 1
            java.lang.String r1 = r3.substring(r1)     // Catch:{ NumberFormatException -> 0x00fb }
            int r1 = m15276e(r1)     // Catch:{ NumberFormatException -> 0x00fb }
            r10.f43891i = r1     // Catch:{ NumberFormatException -> 0x00fb }
            java.lang.String r3 = r3.substring(r7, r0)     // Catch:{ NumberFormatException -> 0x00fb }
            goto L_0x00e2
        L_0x00e0:
            r10.f43891i = r5     // Catch:{ NumberFormatException -> 0x00fb }
        L_0x00e2:
            float r0 = p290a8.C16449h.m15278a(r3)     // Catch:{ NumberFormatException -> 0x00fb }
            r10.f43890h = r0     // Catch:{ NumberFormatException -> 0x00fb }
            goto L_0x0006
        L_0x00ea:
            java.lang.String r0 = "size"
            boolean r0 = r0.equals(r1)     // Catch:{ NumberFormatException -> 0x00fb }
            if (r0 == 0) goto L_0x0006
            float r0 = p290a8.C16449h.m15278a(r3)     // Catch:{ NumberFormatException -> 0x00fb }
            r10.f43892j = r0     // Catch:{ NumberFormatException -> 0x00fb }
            goto L_0x0006
        L_0x00fb:
            r9.group()
            goto L_0x0006
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p290a8.C16445f.m15274c(java.lang.String, a8.e$b):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15275d(java.lang.String r17, java.lang.String r18, p290a8.C16442e.C16443b r19, java.util.List<p290a8.C16441d> r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.Stack r4 = new java.util.Stack
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = 0
        L_0x0017:
            int r8 = r18.length()
            java.lang.String r9 = ""
            if (r7 >= r8) goto L_0x01c0
            char r8 = r1.charAt(r7)
            java.lang.String r10 = " "
            r11 = 62
            r13 = 60
            r14 = 38
            r12 = -1
            if (r8 == r14) goto L_0x0148
            if (r8 == r13) goto L_0x0037
            r3.append(r8)
            int r7 = r7 + 1
            goto L_0x01bd
        L_0x0037:
            int r8 = r7 + 1
            int r13 = r18.length()
            if (r8 < r13) goto L_0x0042
        L_0x003f:
            r7 = r8
            goto L_0x01bd
        L_0x0042:
            char r13 = r1.charAt(r8)
            r14 = 47
            if (r13 != r14) goto L_0x004c
            r13 = 1
            goto L_0x004d
        L_0x004c:
            r13 = 0
        L_0x004d:
            int r8 = r1.indexOf(r11, r8)
            if (r8 != r12) goto L_0x0058
            int r8 = r18.length()
            goto L_0x005a
        L_0x0058:
            int r8 = r8 + 1
        L_0x005a:
            int r11 = r8 + -2
            char r15 = r1.charAt(r11)
            if (r15 != r14) goto L_0x0064
            r14 = 1
            goto L_0x0065
        L_0x0064:
            r14 = 0
        L_0x0065:
            if (r13 == 0) goto L_0x0069
            r15 = 2
            goto L_0x006a
        L_0x0069:
            r15 = 1
        L_0x006a:
            int r7 = r7 + r15
            if (r14 == 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            int r11 = r8 + -1
        L_0x0070:
            java.lang.String r7 = r1.substring(r7, r11)
            java.lang.String r11 = r7.trim()
            boolean r15 = r11.isEmpty()
            r16 = 0
            if (r15 == 0) goto L_0x0083
            r11 = r16
            goto L_0x008b
        L_0x0083:
            java.lang.String r15 = "[ \\.]"
            java.lang.String[] r11 = r11.split(r15)
            r11 = r11[r6]
        L_0x008b:
            if (r11 == 0) goto L_0x0145
            int r15 = r11.hashCode()
            switch(r15) {
                case 98: goto L_0x00cf;
                case 99: goto L_0x00c4;
                case 105: goto L_0x00b9;
                case 117: goto L_0x00ad;
                case 118: goto L_0x00a1;
                case 3314158: goto L_0x0096;
                default: goto L_0x0094;
            }
        L_0x0094:
            r15 = -1
            goto L_0x00d9
        L_0x0096:
            java.lang.String r15 = "lang"
            boolean r15 = r11.equals(r15)
            if (r15 != 0) goto L_0x009f
            goto L_0x0094
        L_0x009f:
            r15 = 5
            goto L_0x00d9
        L_0x00a1:
            java.lang.String r15 = "v"
            boolean r15 = r11.equals(r15)
            if (r15 != 0) goto L_0x00ab
            goto L_0x0094
        L_0x00ab:
            r15 = 4
            goto L_0x00d9
        L_0x00ad:
            java.lang.String r15 = "u"
            boolean r15 = r11.equals(r15)
            if (r15 != 0) goto L_0x00b7
            goto L_0x0094
        L_0x00b7:
            r15 = 3
            goto L_0x00d9
        L_0x00b9:
            java.lang.String r15 = "i"
            boolean r15 = r11.equals(r15)
            if (r15 != 0) goto L_0x00c2
            goto L_0x0094
        L_0x00c2:
            r15 = 2
            goto L_0x00d9
        L_0x00c4:
            java.lang.String r15 = "c"
            boolean r15 = r11.equals(r15)
            if (r15 != 0) goto L_0x00cd
            goto L_0x0094
        L_0x00cd:
            r15 = 1
            goto L_0x00d9
        L_0x00cf:
            java.lang.String r15 = "b"
            boolean r15 = r11.equals(r15)
            if (r15 != 0) goto L_0x00d8
            goto L_0x0094
        L_0x00d8:
            r15 = 0
        L_0x00d9:
            switch(r15) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00de;
                case 2: goto L_0x00de;
                case 3: goto L_0x00de;
                case 4: goto L_0x00de;
                case 5: goto L_0x00de;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            r15 = 0
            goto L_0x00df
        L_0x00de:
            r15 = 1
        L_0x00df:
            if (r15 != 0) goto L_0x00e2
            goto L_0x0145
        L_0x00e2:
            if (r13 == 0) goto L_0x00ff
        L_0x00e4:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x00ec
            goto L_0x003f
        L_0x00ec:
            java.lang.Object r7 = r4.pop()
            a8.f$a r7 = (p290a8.C16445f.C16446a) r7
            m15272a(r0, r7, r3, r2, r5)
            java.lang.String r7 = r7.f43898a
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x00e4
            goto L_0x003f
        L_0x00ff:
            if (r14 != 0) goto L_0x003f
            int r11 = r3.length()
            java.lang.String r7 = r7.trim()
            boolean r13 = r7.isEmpty()
            if (r13 == 0) goto L_0x0112
            r12 = r16
            goto L_0x0140
        L_0x0112:
            int r10 = r7.indexOf(r10)
            if (r10 != r12) goto L_0x0119
            goto L_0x0125
        L_0x0119:
            java.lang.String r9 = r7.substring(r10)
            java.lang.String r9 = r9.trim()
            java.lang.String r7 = r7.substring(r6, r10)
        L_0x0125:
            java.lang.String r10 = "\\."
            java.lang.String[] r7 = r7.split(r10)
            r10 = r7[r6]
            int r12 = r7.length
            r15 = 1
            if (r12 <= r15) goto L_0x0139
            int r12 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOfRange(r7, r15, r12)
            java.lang.String[] r7 = (java.lang.String[]) r7
            goto L_0x013b
        L_0x0139:
            java.lang.String[] r7 = p290a8.C16445f.C16446a.f43897e
        L_0x013b:
            a8.f$a r12 = new a8.f$a
            r12.<init>(r10, r11, r9, r7)
        L_0x0140:
            r4.push(r12)
            goto L_0x003f
        L_0x0145:
            r7 = r8
            goto L_0x0017
        L_0x0148:
            r15 = 1
            r9 = 59
            int r7 = r7 + 1
            int r9 = r1.indexOf(r9, r7)
            r15 = 32
            int r6 = r1.indexOf(r15, r7)
            if (r9 != r12) goto L_0x015b
            r9 = r6
            goto L_0x0162
        L_0x015b:
            if (r6 != r12) goto L_0x015e
            goto L_0x0162
        L_0x015e:
            int r9 = java.lang.Math.min(r9, r6)
        L_0x0162:
            if (r9 == r12) goto L_0x01ba
            java.lang.String r7 = r1.substring(r7, r9)
            r7.getClass()
            int r8 = r7.hashCode()
            switch(r8) {
                case 3309: goto L_0x0194;
                case 3464: goto L_0x0189;
                case 96708: goto L_0x017e;
                case 3374865: goto L_0x0173;
                default: goto L_0x0172;
            }
        L_0x0172:
            goto L_0x019e
        L_0x0173:
            java.lang.String r8 = "nbsp"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x017c
            goto L_0x019e
        L_0x017c:
            r12 = 3
            goto L_0x019e
        L_0x017e:
            java.lang.String r8 = "amp"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0187
            goto L_0x019e
        L_0x0187:
            r12 = 2
            goto L_0x019e
        L_0x0189:
            java.lang.String r8 = "lt"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0192
            goto L_0x019e
        L_0x0192:
            r12 = 1
            goto L_0x019e
        L_0x0194:
            java.lang.String r8 = "gt"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x019d
            goto L_0x019e
        L_0x019d:
            r12 = 0
        L_0x019e:
            switch(r12) {
                case 0: goto L_0x01ae;
                case 1: goto L_0x01aa;
                case 2: goto L_0x01a6;
                case 3: goto L_0x01a2;
                default: goto L_0x01a1;
            }
        L_0x01a1:
            goto L_0x01b1
        L_0x01a2:
            r3.append(r15)
            goto L_0x01b1
        L_0x01a6:
            r3.append(r14)
            goto L_0x01b1
        L_0x01aa:
            r3.append(r13)
            goto L_0x01b1
        L_0x01ae:
            r3.append(r11)
        L_0x01b1:
            if (r9 != r6) goto L_0x01b6
            r3.append(r10)
        L_0x01b6:
            int r9 = r9 + 1
            r7 = r9
            goto L_0x01bd
        L_0x01ba:
            r3.append(r8)
        L_0x01bd:
            r6 = 0
            goto L_0x0017
        L_0x01c0:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x01d0
            java.lang.Object r1 = r4.pop()
            a8.f$a r1 = (p290a8.C16445f.C16446a) r1
            m15272a(r0, r1, r3, r2, r5)
            goto L_0x01c0
        L_0x01d0:
            a8.f$a r1 = new a8.f$a
            r4 = 0
            java.lang.String[] r6 = new java.lang.String[r4]
            r1.<init>(r9, r4, r9, r6)
            m15272a(r0, r1, r3, r2, r5)
            r0 = r19
            r0.f43885c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p290a8.C16445f.m15275d(java.lang.String, java.lang.String, a8.e$b, java.util.List):void");
    }

    /* renamed from: e */
    public static int m15276e(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(IXWebBroadcastListener.STAGE_START)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                return Integer.MIN_VALUE;
        }
    }
}
