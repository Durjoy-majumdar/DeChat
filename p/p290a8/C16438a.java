package p290a8;

import java.util.regex.Pattern;
import p333e8.C20541m;

/* renamed from: a8.a */
public final class C16438a {

    /* renamed from: c */
    public static final Pattern f43858c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a */
    public final C20541m f43859a = new C20541m();

    /* renamed from: b */
    public final StringBuilder f43860b = new StringBuilder();

    /* renamed from: a */
    public static String m15261a(C20541m mVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = mVar.f57810b;
        int i2 = mVar.f57811c;
        while (i < i2 && !z) {
            char c = (char) mVar.f57809a[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        mVar.mo32114y(i - mVar.f57810b);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m15262b(C20541m mVar, StringBuilder sb) {
        m15263c(mVar);
        if (mVar.f57811c - mVar.f57810b == 0) {
            return null;
        }
        String a = m15261a(mVar, sb);
        if (!"".equals(a)) {
            return a;
        }
        return "" + ((char) mVar.mo32103n());
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067 A[LOOP:1: B:2:0x0002->B:35:0x0067, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0001 A[EDGE_INSN: B:40:0x0001->B:36:0x0001 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15263c(p333e8.C20541m r8) {
        /*
            r0 = 1
        L_0x0001:
            r1 = 1
        L_0x0002:
            int r2 = r8.f57811c
            int r3 = r8.f57810b
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x0069
            if (r1 == 0) goto L_0x0069
            byte[] r1 = r8.f57809a
            byte r1 = r1[r3]
            char r1 = (char) r1
            r2 = 9
            r3 = 0
            if (r1 == r2) goto L_0x0027
            r2 = 10
            if (r1 == r2) goto L_0x0027
            r2 = 12
            if (r1 == r2) goto L_0x0027
            r2 = 13
            if (r1 == r2) goto L_0x0027
            r2 = 32
            if (r1 == r2) goto L_0x0027
            r1 = 0
            goto L_0x002b
        L_0x0027:
            r8.mo32114y(r0)
            r1 = 1
        L_0x002b:
            if (r1 != 0) goto L_0x0001
            int r1 = r8.f57810b
            int r2 = r8.f57811c
            byte[] r4 = r8.f57809a
            int r5 = r1 + 2
            if (r5 > r2) goto L_0x0063
            int r5 = r1 + 1
            byte r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L_0x0063
            int r1 = r5 + 1
            byte r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L_0x0063
        L_0x0047:
            int r5 = r1 + 1
            if (r5 >= r2) goto L_0x005b
            byte r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L_0x0059
            byte r1 = r4[r5]
            char r1 = (char) r1
            if (r1 != r6) goto L_0x0059
            int r2 = r5 + 1
            r1 = r2
            goto L_0x0047
        L_0x0059:
            r1 = r5
            goto L_0x0047
        L_0x005b:
            int r1 = r8.f57810b
            int r2 = r2 - r1
            r8.mo32114y(r2)
            r1 = 1
            goto L_0x0064
        L_0x0063:
            r1 = 0
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            goto L_0x0001
        L_0x0067:
            r1 = 0
            goto L_0x0002
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p290a8.C16438a.m15263c(e8.m):void");
    }
}
