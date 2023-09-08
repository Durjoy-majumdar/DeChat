package p953d8;

import java.io.File;
import java.util.regex.Pattern;

/* renamed from: d8.m */
public final class C86217m extends C86209g {

    /* renamed from: j */
    public static final Pattern f250784j = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: n */
    public static final Pattern f250785n = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: o */
    public static final Pattern f250786o = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public C86217m(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        if (r1 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c9, code lost:
        if (r16.renameTo(r1) == false) goto L_0x00cb;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p953d8.C86217m m106813b(java.io.File r16, p953d8.C86213j r17) {
        /*
            r0 = r17
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r2 != 0) goto L_0x00d6
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = f250785n
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L_0x0088
            java.lang.String r1 = r2.group(r4)
            int r7 = p333e8.C20551y.f57835a
            int r7 = r1.length()
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x002f:
            if (r9 >= r7) goto L_0x003e
            char r11 = r1.charAt(r9)
            r12 = 37
            if (r11 != r12) goto L_0x003b
            int r10 = r10 + 1
        L_0x003b:
            int r9 = r9 + 1
            goto L_0x002f
        L_0x003e:
            if (r10 != 0) goto L_0x0041
            goto L_0x0085
        L_0x0041:
            int r9 = r10 * 2
            int r9 = r7 - r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r9)
            java.util.regex.Pattern r12 = p333e8.C20551y.f57840f
            java.util.regex.Matcher r12 = r12.matcher(r1)
        L_0x0050:
            if (r10 <= 0) goto L_0x0074
            boolean r13 = r12.find()
            if (r13 == 0) goto L_0x0074
            java.lang.String r13 = r12.group(r4)
            r14 = 16
            int r13 = java.lang.Integer.parseInt(r13, r14)
            char r13 = (char) r13
            int r14 = r12.start()
            r11.append(r1, r8, r14)
            r11.append(r13)
            int r8 = r12.end()
            int r10 = r10 + -1
            goto L_0x0050
        L_0x0074:
            if (r8 >= r7) goto L_0x0079
            r11.append(r1, r8, r7)
        L_0x0079:
            int r1 = r11.length()
            if (r1 == r9) goto L_0x0081
            r1 = r6
            goto L_0x0085
        L_0x0081:
            java.lang.String r1 = r11.toString()
        L_0x0085:
            if (r1 != 0) goto L_0x0099
            goto L_0x00cb
        L_0x0088:
            java.util.regex.Pattern r2 = f250784j
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 != 0) goto L_0x0095
            goto L_0x00cb
        L_0x0095:
            java.lang.String r1 = r2.group(r4)
        L_0x0099:
            java.io.File r7 = r16.getParentFile()
            java.util.HashMap<java.lang.String, d8.i> r8 = r0.f250764a
            java.lang.Object r8 = r8.get(r1)
            d8.i r8 = (p953d8.C86212i) r8
            if (r8 != 0) goto L_0x00ad
            r8 = -1
            d8.i r8 = r0.mo120638a(r1, r8)
        L_0x00ad:
            int r8 = r8.f250760a
            java.lang.String r1 = r2.group(r3)
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r5)
            long r11 = java.lang.Long.parseLong(r1)
            java.io.File r1 = m106814c(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L_0x00cc
        L_0x00cb:
            r1 = r6
        L_0x00cc:
            if (r1 != 0) goto L_0x00cf
            return r6
        L_0x00cf:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L_0x00d9
        L_0x00d6:
            r2 = r16
            r15 = r2
        L_0x00d9:
            java.util.regex.Pattern r2 = f250786o
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L_0x00e6
            return r6
        L_0x00e6:
            long r11 = r15.length()
            java.lang.String r2 = r1.group(r4)
            int r2 = java.lang.Integer.parseInt(r2)
            android.util.SparseArray<java.lang.String> r0 = r0.f250765b
            java.lang.Object r0 = r0.get(r2)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x00fe
            goto L_0x0114
        L_0x00fe:
            d8.m r6 = new d8.m
            java.lang.String r0 = r1.group(r3)
            long r9 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = r1.group(r5)
            long r13 = java.lang.Long.parseLong(r0)
            r7 = r6
            r7.<init>(r8, r9, r11, r13, r15)
        L_0x0114:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p953d8.C86217m.m106813b(java.io.File, d8.j):d8.m");
    }

    /* renamed from: c */
    public static File m106814c(File file, int i, long j, long j2) {
        return new File(file, i + "." + j + "." + j2 + ".v3.exo");
    }
}
