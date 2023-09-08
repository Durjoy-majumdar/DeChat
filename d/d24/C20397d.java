package d24;

import java.util.concurrent.TimeUnit;

/* renamed from: d24.d */
public final class C20397d {

    /* renamed from: n */
    public static final C20397d f57180n;

    /* renamed from: o */
    public static final C20397d f57181o;

    /* renamed from: a */
    public final boolean f57182a;

    /* renamed from: b */
    public final boolean f57183b;

    /* renamed from: c */
    public final int f57184c;

    /* renamed from: d */
    public final int f57185d;

    /* renamed from: e */
    public final boolean f57186e;

    /* renamed from: f */
    public final boolean f57187f;

    /* renamed from: g */
    public final boolean f57188g;

    /* renamed from: h */
    public final int f57189h;

    /* renamed from: i */
    public final int f57190i;

    /* renamed from: j */
    public final boolean f57191j;

    /* renamed from: k */
    public final boolean f57192k;

    /* renamed from: l */
    public final boolean f57193l;

    /* renamed from: m */
    public String f57194m;

    /* renamed from: d24.d$a */
    public static final class C20398a {

        /* renamed from: a */
        public boolean f57195a;

        /* renamed from: b */
        public boolean f57196b;

        /* renamed from: c */
        public int f57197c = -1;

        /* renamed from: d */
        public boolean f57198d;
    }

    static {
        C20398a aVar = new C20398a();
        aVar.f57195a = true;
        f57180n = new C20397d(aVar);
        C20398a aVar2 = new C20398a();
        aVar2.f57198d = true;
        int i = Integer.MAX_VALUE;
        long seconds = TimeUnit.SECONDS.toSeconds((long) Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i = (int) seconds;
        }
        aVar2.f57197c = i;
        f57181o = new C20397d(aVar2);
    }

    public C20397d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f57182a = z;
        this.f57183b = z2;
        this.f57184c = i;
        this.f57185d = i2;
        this.f57186e = z3;
        this.f57187f = z4;
        this.f57188g = z5;
        this.f57189h = i3;
        this.f57190i = i4;
        this.f57191j = z6;
        this.f57192k = z7;
        this.f57193l = z8;
        this.f57194m = str;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 191 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static d24.C20397d m21952a(d24.C20419r r22) {
        /*
            r0 = r22
            java.lang.String[] r1 = r0.f57262a
            int r1 = r1.length
            int r1 = r1 / 2
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001b:
            if (r6 >= r1) goto L_0x0151
            java.lang.String r2 = r0.mo31927d(r6)
            java.lang.String r4 = r0.mo31930f(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0032
            if (r8 == 0) goto L_0x0030
            goto L_0x003a
        L_0x0030:
            r8 = r4
            goto L_0x003b
        L_0x0032:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x014a
        L_0x003a:
            r7 = 0
        L_0x003b:
            r2 = 0
        L_0x003c:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x014a
            java.lang.String r3 = "=,;"
            int r3 = h24.C20887e.m22969e(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x00aa
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x00aa
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x007a
            goto L_0x00aa
        L_0x0067:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x007d
            char r0 = r4.charAt(r3)
            r5 = 32
            if (r0 == r5) goto L_0x007a
            r5 = 9
            if (r0 == r5) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            int r3 = r3 + 1
            goto L_0x0067
        L_0x007d:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x009a
            char r0 = r4.charAt(r3)
            r5 = 34
            if (r0 != r5) goto L_0x009a
            int r3 = r3 + 1
            java.lang.String r0 = "\""
            int r0 = h24.C20887e.m22969e(r4, r3, r0)
            java.lang.String r3 = r4.substring(r3, r0)
            r5 = 1
            int r0 = r0 + r5
            goto L_0x00af
        L_0x009a:
            r5 = 1
            java.lang.String r0 = ",;"
            int r0 = h24.C20887e.m22969e(r4, r3, r0)
            java.lang.String r3 = r4.substring(r3, r0)
            java.lang.String r3 = r3.trim()
            goto L_0x00af
        L_0x00aa:
            r5 = 1
            int r3 = r3 + 1
            r0 = r3
            r3 = 0
        L_0x00af:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00bb
            r5 = -1
            r9 = 1
            goto L_0x0145
        L_0x00bb:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c7
            r5 = -1
            r10 = 1
            goto L_0x0145
        L_0x00c7:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d6
            r5 = -1
            int r11 = h24.C20887e.m22967c(r3, r5)
            goto L_0x0145
        L_0x00d6:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e4
            r5 = -1
            int r12 = h24.C20887e.m22967c(r3, r5)
            goto L_0x0145
        L_0x00e4:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00ef
            r5 = -1
            r13 = 1
            goto L_0x0145
        L_0x00ef:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00fa
            r5 = -1
            r14 = 1
            goto L_0x0145
        L_0x00fa:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0105
            r5 = -1
            r15 = 1
            goto L_0x0145
        L_0x0105:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0116
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = h24.C20887e.m22967c(r3, r2)
            r5 = -1
            goto L_0x0145
        L_0x0116:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0124
            r5 = -1
            int r17 = h24.C20887e.m22967c(r3, r5)
            goto L_0x0145
        L_0x0124:
            r5 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0130
            r18 = 1
            goto L_0x0145
        L_0x0130:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x013b
            r19 = 1
            goto L_0x0145
        L_0x013b:
            java.lang.String r3 = "immutable"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0145
            r20 = 1
        L_0x0145:
            r2 = r0
            r0 = r22
            goto L_0x003c
        L_0x014a:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001b
        L_0x0151:
            if (r7 != 0) goto L_0x0156
            r21 = 0
            goto L_0x0158
        L_0x0156:
            r21 = r8
        L_0x0158:
            d24.d r0 = new d24.d
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d24.C20397d.m21952a(d24.r):d24.d");
    }

    public String toString() {
        String str = this.f57194m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f57182a) {
                sb.append("no-cache, ");
            }
            if (this.f57183b) {
                sb.append("no-store, ");
            }
            if (this.f57184c != -1) {
                sb.append("max-age=");
                sb.append(this.f57184c);
                sb.append(", ");
            }
            if (this.f57185d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f57185d);
                sb.append(", ");
            }
            if (this.f57186e) {
                sb.append("private, ");
            }
            if (this.f57187f) {
                sb.append("public, ");
            }
            if (this.f57188g) {
                sb.append("must-revalidate, ");
            }
            if (this.f57189h != -1) {
                sb.append("max-stale=");
                sb.append(this.f57189h);
                sb.append(", ");
            }
            if (this.f57190i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f57190i);
                sb.append(", ");
            }
            if (this.f57191j) {
                sb.append("only-if-cached, ");
            }
            if (this.f57192k) {
                sb.append("no-transform, ");
            }
            if (this.f57193l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f57194m = str;
        }
        return str;
    }

    public C20397d(C20398a aVar) {
        this.f57182a = aVar.f57195a;
        this.f57183b = aVar.f57196b;
        this.f57184c = -1;
        this.f57185d = -1;
        this.f57186e = false;
        this.f57187f = false;
        this.f57188g = false;
        this.f57189h = aVar.f57197c;
        this.f57190i = -1;
        this.f57191j = aVar.f57198d;
        this.f57192k = false;
        this.f57193l = false;
    }
}
