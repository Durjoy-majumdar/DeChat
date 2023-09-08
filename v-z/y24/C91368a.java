package y24;

import u24.C90599h;
import x24.C91135a;

/* renamed from: y24.a */
public class C91368a {

    /* renamed from: y24.a$a */
    public static class C91369a {

        /* renamed from: a */
        public Object f262051a;

        /* renamed from: b */
        public int f262052b = 1;

        public C91369a(Object obj) {
            this.f262051a = obj;
        }

        /* renamed from: a */
        public static boolean m114617a(C91369a[] aVarArr, Object obj) {
            for (C91369a aVar : aVarArr) {
                if (aVar.f262051a == obj) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C91369a)) {
                return false;
            }
            C91369a aVar = (C91369a) obj;
            if (this.f262051a.getClass() != aVar.f262051a.getClass() || this.f262052b != aVar.f262052b) {
                return false;
            }
            Object obj2 = this.f262051a;
            return obj2 instanceof StringBuffer ? obj2.toString().equals(aVar.f262051a.toString()) : obj2 instanceof Number ? obj2.equals(aVar.f262051a) : obj2 == aVar.f262051a;
        }

        public int hashCode() {
            return this.f262051a.hashCode();
        }

        public String toString() {
            String obj = this.f262051a.toString();
            int i = this.f262052b;
            if (obj == null) {
                return null;
            }
            if (i <= 0) {
                return "";
            }
            int length = obj.length();
            if (i == 1 || length == 0) {
                return obj;
            }
            if (length == 1 && i <= 8192) {
                return C90599h.m113517j(i, obj.charAt(0));
            }
            int i2 = length * i;
            if (length == 1) {
                char charAt = obj.charAt(0);
                char[] cArr = new char[i2];
                for (int i3 = i - 1; i3 >= 0; i3--) {
                    cArr[i3] = charAt;
                }
                return new String(cArr);
            } else if (length != 2) {
                C91135a aVar = new C91135a(i2);
                for (int i4 = 0; i4 < i; i4++) {
                    aVar.mo125201a(obj);
                }
                return aVar.toString();
            } else {
                char charAt2 = obj.charAt(0);
                char charAt3 = obj.charAt(1);
                char[] cArr2 = new char[i2];
                for (int i5 = (i * 2) - 2; i5 >= 0; i5 = (i5 - 1) - 1) {
                    cArr2[i5] = charAt2;
                    cArr2[i5 + 1] = charAt3;
                }
                return new String(cArr2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x0099 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m114616a(long r18, java.lang.String r20, boolean r21) {
        /*
            char[] r0 = r20.toCharArray()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000f:
            java.lang.String r9 = "y"
            java.lang.String r10 = "M"
            java.lang.String r11 = "s"
            java.lang.String r12 = "m"
            java.lang.String r13 = "d"
            java.lang.String r14 = "S"
            java.lang.String r15 = "H"
            if (r5 >= r2) goto L_0x009d
            char r4 = r0[r5]
            r3 = 39
            if (r6 == 0) goto L_0x002e
            if (r4 == r3) goto L_0x002e
            r7.append(r4)
            goto L_0x0099
        L_0x002e:
            if (r4 == r3) goto L_0x006c
            r3 = 72
            if (r4 == r3) goto L_0x006a
            r3 = 77
            if (r4 == r3) goto L_0x0068
            r3 = 83
            if (r4 == r3) goto L_0x0066
            r3 = 100
            if (r4 == r3) goto L_0x0064
            r3 = 109(0x6d, float:1.53E-43)
            if (r4 == r3) goto L_0x0062
            r3 = 115(0x73, float:1.61E-43)
            if (r4 == r3) goto L_0x0060
            r3 = 121(0x79, float:1.7E-43)
            if (r4 == r3) goto L_0x0080
            if (r7 != 0) goto L_0x005c
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            y24.a$a r7 = new y24.a$a
            r7.<init>(r3)
            r1.add(r7)
            r7 = r3
        L_0x005c:
            r7.append(r4)
            goto L_0x007f
        L_0x0060:
            r9 = r11
            goto L_0x0080
        L_0x0062:
            r9 = r12
            goto L_0x0080
        L_0x0064:
            r9 = r13
            goto L_0x0080
        L_0x0066:
            r9 = r14
            goto L_0x0080
        L_0x0068:
            r9 = r10
            goto L_0x0080
        L_0x006a:
            r9 = r15
            goto L_0x0080
        L_0x006c:
            if (r6 == 0) goto L_0x0071
            r6 = 0
            r7 = 0
            goto L_0x007f
        L_0x0071:
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            y24.a$a r3 = new y24.a$a
            r3.<init>(r7)
            r1.add(r3)
            r6 = 1
        L_0x007f:
            r9 = 0
        L_0x0080:
            if (r9 == 0) goto L_0x0099
            if (r8 == 0) goto L_0x008f
            java.lang.Object r3 = r8.f262051a
            if (r3 != r9) goto L_0x008f
            int r3 = r8.f262052b
            r4 = 1
            int r3 = r3 + r4
            r8.f262052b = r3
            goto L_0x0098
        L_0x008f:
            y24.a$a r3 = new y24.a$a
            r3.<init>(r9)
            r1.add(r3)
            r8 = r3
        L_0x0098:
            r7 = 0
        L_0x0099:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x009d:
            int r0 = r1.size()
            y24.a$a[] r0 = new y24.C91368a.C91369a[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            y24.a$a[] r0 = (y24.C91368a.C91369a[]) r0
            boolean r1 = y24.C91368a.C91369a.m114617a(r0, r13)
            if (r1 == 0) goto L_0x00bb
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r18 / r1
            int r4 = (int) r3
            long r5 = (long) r4
            long r5 = r5 * r1
            long r1 = r18 - r5
            goto L_0x00be
        L_0x00bb:
            r4 = 0
            r1 = r18
        L_0x00be:
            boolean r3 = y24.C91368a.C91369a.m114617a(r0, r15)
            if (r3 == 0) goto L_0x00cf
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r1 / r5
            int r3 = (int) r7
            long r7 = (long) r3
            long r7 = r7 * r5
            long r1 = r1 - r7
            goto L_0x00d0
        L_0x00cf:
            r3 = 0
        L_0x00d0:
            boolean r5 = y24.C91368a.C91369a.m114617a(r0, r12)
            if (r5 == 0) goto L_0x00e5
            r5 = 60000(0xea60, double:2.9644E-319)
            long r7 = r1 / r5
            int r8 = (int) r7
            r19 = r3
            r18 = r4
            long r3 = (long) r8
            long r3 = r3 * r5
            long r1 = r1 - r3
            goto L_0x00ea
        L_0x00e5:
            r19 = r3
            r18 = r4
            r8 = 0
        L_0x00ea:
            boolean r3 = y24.C91368a.C91369a.m114617a(r0, r11)
            if (r3 == 0) goto L_0x00fc
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r1 / r3
            int r6 = (int) r5
            r20 = r8
            long r7 = (long) r6
            long r7 = r7 * r3
            long r1 = r1 - r7
            goto L_0x00ff
        L_0x00fc:
            r20 = r8
            r6 = 0
        L_0x00ff:
            boolean r3 = y24.C91368a.C91369a.m114617a(r0, r14)
            if (r3 == 0) goto L_0x0107
            int r2 = (int) r1
            goto L_0x0108
        L_0x0107:
            r2 = 0
        L_0x0108:
            x24.a r1 = new x24.a
            r1.<init>()
            int r3 = r0.length
            r4 = 0
            r5 = 0
        L_0x0110:
            if (r5 >= r3) goto L_0x01c2
            r7 = r0[r5]
            java.lang.Object r8 = r7.f262051a
            int r7 = r7.f262052b
            r17 = r0
            boolean r0 = r8 instanceof java.lang.StringBuffer
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = r8.toString()
            r1.mo125201a(r0)
            r8 = 1
            r16 = 0
            goto L_0x01bc
        L_0x012a:
            r0 = 48
            if (r8 != r9) goto L_0x0140
            r16 = 0
            java.lang.String r4 = java.lang.Integer.toString(r16)
            if (r21 == 0) goto L_0x013a
            java.lang.String r4 = u24.C90599h.m113516i(r4, r7, r0)
        L_0x013a:
            r1.mo125201a(r4)
        L_0x013d:
            r8 = 1
            goto L_0x01bb
        L_0x0140:
            r16 = 0
            if (r8 != r10) goto L_0x0152
            java.lang.String r4 = java.lang.Integer.toString(r16)
            if (r21 == 0) goto L_0x014e
            java.lang.String r4 = u24.C90599h.m113516i(r4, r7, r0)
        L_0x014e:
            r1.mo125201a(r4)
            goto L_0x013d
        L_0x0152:
            if (r8 != r13) goto L_0x0162
            java.lang.String r4 = java.lang.Integer.toString(r18)
            if (r21 == 0) goto L_0x015e
            java.lang.String r4 = u24.C90599h.m113516i(r4, r7, r0)
        L_0x015e:
            r1.mo125201a(r4)
            goto L_0x013d
        L_0x0162:
            if (r8 != r15) goto L_0x0172
            java.lang.String r4 = java.lang.Integer.toString(r19)
            if (r21 == 0) goto L_0x016e
            java.lang.String r4 = u24.C90599h.m113516i(r4, r7, r0)
        L_0x016e:
            r1.mo125201a(r4)
            goto L_0x013d
        L_0x0172:
            if (r8 != r12) goto L_0x0182
            java.lang.String r4 = java.lang.Integer.toString(r20)
            if (r21 == 0) goto L_0x017e
            java.lang.String r4 = u24.C90599h.m113516i(r4, r7, r0)
        L_0x017e:
            r1.mo125201a(r4)
            goto L_0x013d
        L_0x0182:
            if (r8 != r11) goto L_0x0194
            java.lang.String r4 = java.lang.Integer.toString(r6)
            if (r21 == 0) goto L_0x018e
            java.lang.String r4 = u24.C90599h.m113516i(r4, r7, r0)
        L_0x018e:
            r1.mo125201a(r4)
            r4 = 1
        L_0x0192:
            r8 = 1
            goto L_0x01bc
        L_0x0194:
            if (r8 != r14) goto L_0x0192
            if (r4 == 0) goto L_0x01ad
            int r2 = r2 + 1000
            java.lang.String r4 = java.lang.Integer.toString(r2)
            if (r21 == 0) goto L_0x01a4
            java.lang.String r4 = u24.C90599h.m113516i(r4, r7, r0)
        L_0x01a4:
            r8 = 1
            java.lang.String r0 = r4.substring(r8)
            r1.mo125201a(r0)
            goto L_0x01bb
        L_0x01ad:
            r8 = 1
            java.lang.String r4 = java.lang.Integer.toString(r2)
            if (r21 == 0) goto L_0x01b8
            java.lang.String r4 = u24.C90599h.m113516i(r4, r7, r0)
        L_0x01b8:
            r1.mo125201a(r4)
        L_0x01bb:
            r4 = 0
        L_0x01bc:
            int r5 = r5 + 1
            r0 = r17
            goto L_0x0110
        L_0x01c2:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y24.C91368a.m114616a(long, java.lang.String, boolean):java.lang.String");
    }
}
