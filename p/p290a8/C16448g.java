package p290a8;

import java.util.ArrayList;
import java.util.List;
import p290a8.C16442e;
import p333e8.C20541m;
import p383t7.C22440b;

/* renamed from: a8.g */
public final class C16448g extends C22440b {

    /* renamed from: m */
    public final C16445f f43904m = new C16445f();

    /* renamed from: n */
    public final C20541m f43905n = new C20541m();

    /* renamed from: o */
    public final C16442e.C16443b f43906o = new C16442e.C16443b();

    /* renamed from: p */
    public final C16438a f43907p = new C16438a();

    /* renamed from: q */
    public final List<C16441d> f43908q = new ArrayList();

    public C16448g() {
        super("WebvttDecoder");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010f, code lost:
        if (r3 != null) goto L_0x0112;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x002e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x002e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018a  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p383t7.C22442d mo14895f(byte[] r18, int r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            e8.m r1 = r0.f43905n
            r2 = r18
            r3 = r19
            r1.mo32111v(r2, r3)
            a8.e$b r1 = r0.f43906o
            r1.mo14901b()
            java.util.List<a8.d> r1 = r0.f43908q
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            e8.m r1 = r0.f43905n
            p290a8.C16449h.m15280c(r1)
        L_0x001c:
            e8.m r1 = r0.f43905n
            java.lang.String r1 = r1.mo32093d()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0029
            goto L_0x001c
        L_0x0029:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x002e:
            e8.m r2 = r0.f43905n
            r3 = 2
            r4 = 3
            r5 = -1
            r6 = 0
            r7 = 1
            r8 = -1
            r9 = 0
        L_0x0037:
            if (r8 != r5) goto L_0x0059
            int r9 = r2.f57810b
            java.lang.String r8 = r2.mo32093d()
            if (r8 != 0) goto L_0x0043
            r8 = 0
            goto L_0x0037
        L_0x0043:
            java.lang.String r10 = "STYLE"
            boolean r10 = r10.equals(r8)
            if (r10 == 0) goto L_0x004d
            r8 = 2
            goto L_0x0037
        L_0x004d:
            java.lang.String r10 = "NOTE"
            boolean r8 = r10.startsWith(r8)
            if (r8 == 0) goto L_0x0057
            r8 = 1
            goto L_0x0037
        L_0x0057:
            r8 = 3
            goto L_0x0037
        L_0x0059:
            r2.mo32113x(r9)
            if (r8 == 0) goto L_0x0307
            if (r8 != r7) goto L_0x006d
            e8.m r2 = r0.f43905n
        L_0x0062:
            java.lang.String r3 = r2.mo32093d()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x002e
            goto L_0x0062
        L_0x006d:
            if (r8 != r3) goto L_0x02ae
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x02a6
            e8.m r2 = r0.f43905n
            r2.mo32093d()
            a8.a r2 = r0.f43907p
            e8.m r3 = r0.f43905n
            java.lang.StringBuilder r4 = r2.f43860b
            r4.setLength(r6)
            int r4 = r3.f57810b
        L_0x0085:
            java.lang.String r8 = r3.mo32093d()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x0085
            e8.m r8 = r2.f43859a
            byte[] r9 = r3.f57809a
            int r3 = r3.f57810b
            r8.mo32111v(r9, r3)
            e8.m r3 = r2.f43859a
            r3.mo32113x(r4)
            e8.m r3 = r2.f43859a
            java.lang.StringBuilder r4 = r2.f43860b
            p290a8.C16438a.m15263c(r3)
            int r8 = r3.f57811c
            int r9 = r3.f57810b
            int r8 = r8 - r9
            r9 = 5
            java.lang.String r10 = "{"
            java.lang.String r11 = ""
            if (r8 >= r9) goto L_0x00b2
            goto L_0x0111
        L_0x00b2:
            java.lang.String r8 = r3.mo32101l(r9)
            java.lang.String r9 = "::cue"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00bf
            goto L_0x0111
        L_0x00bf:
            int r8 = r3.f57810b
            java.lang.String r9 = p290a8.C16438a.m15262b(r3, r4)
            if (r9 != 0) goto L_0x00c8
            goto L_0x0111
        L_0x00c8:
            boolean r13 = r10.equals(r9)
            if (r13 == 0) goto L_0x00d3
            r3.mo32113x(r8)
            r8 = r11
            goto L_0x0112
        L_0x00d3:
            java.lang.String r8 = "("
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0102
            int r8 = r3.f57810b
            int r9 = r3.f57811c
            r13 = 0
        L_0x00e0:
            if (r8 >= r9) goto L_0x00f4
            if (r13 != 0) goto L_0x00f4
            byte[] r13 = r3.f57809a
            int r14 = r8 + 1
            byte r8 = r13[r8]
            char r8 = (char) r8
            r13 = 41
            if (r8 != r13) goto L_0x00f1
            r13 = 1
            goto L_0x00f2
        L_0x00f1:
            r13 = 0
        L_0x00f2:
            r8 = r14
            goto L_0x00e0
        L_0x00f4:
            int r8 = r8 + -1
            int r9 = r3.f57810b
            int r8 = r8 - r9
            java.lang.String r8 = r3.mo32101l(r8)
            java.lang.String r8 = r8.trim()
            goto L_0x0103
        L_0x0102:
            r8 = 0
        L_0x0103:
            java.lang.String r3 = p290a8.C16438a.m15262b(r3, r4)
            java.lang.String r4 = ")"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0111
            if (r3 != 0) goto L_0x0112
        L_0x0111:
            r8 = 0
        L_0x0112:
            if (r8 == 0) goto L_0x029a
            e8.m r3 = r2.f43859a
            java.lang.StringBuilder r4 = r2.f43860b
            java.lang.String r3 = p290a8.C16438a.m15262b(r3, r4)
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0124
            goto L_0x029a
        L_0x0124:
            a8.d r3 = new a8.d
            r3.<init>()
            boolean r4 = r11.equals(r8)
            if (r4 == 0) goto L_0x0130
            goto L_0x0183
        L_0x0130:
            r4 = 91
            int r4 = r8.indexOf(r4)
            if (r4 == r5) goto L_0x0152
            java.util.regex.Pattern r9 = p290a8.C16438a.f43858c
            java.lang.String r10 = r8.substring(r4)
            java.util.regex.Matcher r9 = r9.matcher(r10)
            boolean r10 = r9.matches()
            if (r10 == 0) goto L_0x014e
            java.lang.String r9 = r9.group(r7)
            r3.f43870d = r9
        L_0x014e:
            java.lang.String r8 = r8.substring(r6, r4)
        L_0x0152:
            java.lang.String r4 = "\\."
            java.lang.String[] r4 = r8.split(r4)
            r8 = r4[r6]
            r9 = 35
            int r9 = r8.indexOf(r9)
            if (r9 == r5) goto L_0x0171
            java.lang.String r5 = r8.substring(r6, r9)
            r3.f43868b = r5
            int r9 = r9 + 1
            java.lang.String r5 = r8.substring(r9)
            r3.f43867a = r5
            goto L_0x0173
        L_0x0171:
            r3.f43868b = r8
        L_0x0173:
            int r5 = r4.length
            if (r5 <= r7) goto L_0x0183
            int r5 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r4, r7, r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f43869c = r4
        L_0x0183:
            r4 = 0
            r5 = 0
        L_0x0185:
            java.lang.String r8 = "}"
            if (r4 != 0) goto L_0x0292
            e8.m r4 = r2.f43859a
            int r5 = r4.f57810b
            java.lang.StringBuilder r9 = r2.f43860b
            java.lang.String r4 = p290a8.C16438a.m15262b(r4, r9)
            if (r4 == 0) goto L_0x019f
            boolean r9 = r8.equals(r4)
            if (r9 == 0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            r9 = 0
            goto L_0x01a0
        L_0x019f:
            r9 = 1
        L_0x01a0:
            if (r9 != 0) goto L_0x028b
            e8.m r10 = r2.f43859a
            r10.mo32113x(r5)
            e8.m r5 = r2.f43859a
            java.lang.StringBuilder r10 = r2.f43860b
            p290a8.C16438a.m15263c(r5)
            java.lang.String r13 = p290a8.C16438a.m15261a(r5, r10)
            boolean r14 = r11.equals(r13)
            if (r14 == 0) goto L_0x01ba
            goto L_0x028b
        L_0x01ba:
            java.lang.String r14 = p290a8.C16438a.m15262b(r5, r10)
            java.lang.String r15 = ":"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x01c8
            goto L_0x028b
        L_0x01c8:
            p290a8.C16438a.m15263c(r5)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r15 = 0
        L_0x01d1:
            java.lang.String r6 = ";"
            if (r15 != 0) goto L_0x01f7
            int r12 = r5.f57810b
            java.lang.String r7 = p290a8.C16438a.m15262b(r5, r10)
            if (r7 != 0) goto L_0x01df
            r7 = 0
            goto L_0x01fb
        L_0x01df:
            boolean r16 = r8.equals(r7)
            if (r16 != 0) goto L_0x01f1
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01ec
            goto L_0x01f1
        L_0x01ec:
            r14.append(r7)
            r7 = 1
            goto L_0x01d1
        L_0x01f1:
            r5.mo32113x(r12)
            r7 = 1
            r15 = 1
            goto L_0x01d1
        L_0x01f7:
            java.lang.String r7 = r14.toString()
        L_0x01fb:
            if (r7 == 0) goto L_0x028b
            boolean r12 = r11.equals(r7)
            if (r12 == 0) goto L_0x0205
            goto L_0x028b
        L_0x0205:
            int r12 = r5.f57810b
            java.lang.String r10 = p290a8.C16438a.m15262b(r5, r10)
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x0212
            goto L_0x021b
        L_0x0212:
            boolean r6 = r8.equals(r10)
            if (r6 == 0) goto L_0x028b
            r5.mo32113x(r12)
        L_0x021b:
            java.lang.String r5 = "color"
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x022d
            r5 = 1
            int r6 = p333e8.C20531e.m22244a(r7, r5)
            r3.f43872f = r6
            r3.f43873g = r5
            goto L_0x028b
        L_0x022d:
            r5 = 1
            java.lang.String r6 = "background-color"
            boolean r6 = r6.equals(r13)
            if (r6 == 0) goto L_0x023f
            int r6 = p333e8.C20531e.m22244a(r7, r5)
            r3.f43874h = r6
            r3.f43875i = r5
            goto L_0x028b
        L_0x023f:
            java.lang.String r6 = "text-decoration"
            boolean r6 = r6.equals(r13)
            if (r6 == 0) goto L_0x0254
            java.lang.String r6 = "underline"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x028b
            r3.f43877k = r5
            goto L_0x028b
        L_0x0254:
            java.lang.String r5 = "font-family"
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x0263
            java.lang.String r5 = p333e8.C20551y.m22322l(r7)
            r3.f43871e = r5
            goto L_0x028b
        L_0x0263:
            java.lang.String r5 = "font-weight"
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x0277
            java.lang.String r5 = "bold"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x028b
            r6 = 1
            r3.f43878l = r6
            goto L_0x028c
        L_0x0277:
            r6 = 1
            java.lang.String r5 = "font-style"
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x028c
            java.lang.String r5 = "italic"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x028c
            r3.f43879m = r6
            goto L_0x028c
        L_0x028b:
            r6 = 1
        L_0x028c:
            r5 = r4
            r4 = r9
            r6 = 0
            r7 = 1
            goto L_0x0185
        L_0x0292:
            boolean r2 = r8.equals(r5)
            if (r2 == 0) goto L_0x029a
            r12 = r3
            goto L_0x029b
        L_0x029a:
            r12 = 0
        L_0x029b:
            if (r12 == 0) goto L_0x002e
            java.util.List<a8.d> r2 = r0.f43908q
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r12)
            goto L_0x002e
        L_0x02a6:
            t7.f r1 = new t7.f
            java.lang.String r2 = "A style block was found after the first cue."
            r1.<init>(r2)
            throw r1
        L_0x02ae:
            if (r8 != r4) goto L_0x002e
            a8.f r2 = r0.f43904m
            e8.m r5 = r0.f43905n
            a8.e$b r6 = r0.f43906o
            java.util.List<a8.d> r8 = r0.f43908q
            r2.getClass()
            java.lang.String r3 = r5.mo32093d()
            if (r3 != 0) goto L_0x02c2
            goto L_0x02f4
        L_0x02c2:
            java.util.regex.Pattern r4 = p290a8.C16445f.f43894b
            java.util.regex.Matcher r7 = r4.matcher(r3)
            boolean r9 = r7.matches()
            if (r9 == 0) goto L_0x02d8
            r3 = 0
            java.lang.StringBuilder r2 = r2.f43896a
            r4 = r7
            r7 = r2
            boolean r6 = p290a8.C16445f.m15273b(r3, r4, r5, r6, r7, r8)
            goto L_0x02f5
        L_0x02d8:
            java.lang.String r7 = r5.mo32093d()
            if (r7 != 0) goto L_0x02df
            goto L_0x02f4
        L_0x02df:
            java.util.regex.Matcher r4 = r4.matcher(r7)
            boolean r7 = r4.matches()
            if (r7 == 0) goto L_0x02f4
            java.lang.String r3 = r3.trim()
            java.lang.StringBuilder r7 = r2.f43896a
            boolean r6 = p290a8.C16445f.m15273b(r3, r4, r5, r6, r7, r8)
            goto L_0x02f5
        L_0x02f4:
            r6 = 0
        L_0x02f5:
            if (r6 == 0) goto L_0x002e
            a8.e$b r2 = r0.f43906o
            a8.e r2 = r2.mo14900a()
            r1.add(r2)
            a8.e$b r2 = r0.f43906o
            r2.mo14901b()
            goto L_0x002e
        L_0x0307:
            a8.i r2 = new a8.i
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p290a8.C16448g.mo14895f(byte[], int, boolean):t7.d");
    }
}
