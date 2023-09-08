package pu3;

import ru3.C26117b;

/* renamed from: pu3.p */
public final class C25494p {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m32916a(ru3.C26116a r6) {
        /*
            r0 = 0
            r1 = -1
            r1 = 0
            r2 = -1
        L_0x0004:
            byte r3 = r6.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r1 * 7
            int r4 = r4 << r5
            r0 = r0 | r4
            int r2 = r2 << 7
            int r1 = r1 + 1
            r4 = 128(0x80, float:1.794E-43)
            r3 = r3 & r4
            if (r3 != r4) goto L_0x001c
            r5 = 5
            if (r1 < r5) goto L_0x0004
        L_0x001c:
            if (r3 == r4) goto L_0x0025
            int r6 = r2 >> 1
            r6 = r6 & r0
            if (r6 == 0) goto L_0x0024
            r0 = r0 | r2
        L_0x0024:
            return r0
        L_0x0025:
            pu3.j r6 = new pu3.j
            java.lang.String r0 = "invalid LEB128 sequence"
            r6.<init>((java.lang.String) r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pu3.C25494p.m32916a(ru3.a):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m32917b(ru3.C26116a r5) {
        /*
            r0 = 0
            r1 = 0
        L_0x0002:
            byte r2 = r5.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r1 * 7
            int r3 = r3 << r4
            r0 = r0 | r3
            int r1 = r1 + 1
            r3 = 128(0x80, float:1.794E-43)
            r2 = r2 & r3
            if (r2 != r3) goto L_0x0018
            r4 = 5
            if (r1 < r4) goto L_0x0002
        L_0x0018:
            if (r2 == r3) goto L_0x001b
            return r0
        L_0x001b:
            pu3.j r5 = new pu3.j
            java.lang.String r0 = "invalid LEB128 sequence"
            r5.<init>((java.lang.String) r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pu3.C25494p.m32917b(ru3.a):int");
    }

    /* renamed from: c */
    public static int m32918c(C26117b bVar, int i) {
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        boolean z = true;
        int i4 = 0;
        while (true) {
            int i5 = i2;
            int i6 = i;
            i = i5;
            if (!z) {
                return i4;
            }
            z = (i == i3 && (i & 1) == ((i6 >> 6) & 1)) ? false : true;
            bVar.mo52789o((byte) ((i6 & 127) | (z ? 128 : 0)));
            i4++;
            i2 = i >> 7;
        }
    }

    /* renamed from: d */
    public static int m32919d(C26117b bVar, int i) {
        int i2 = i >>> 7;
        int i3 = 0;
        while (true) {
            int i4 = i2;
            int i5 = i;
            i = i4;
            if (i != 0) {
                bVar.mo52789o((byte) ((i5 & 127) | 128));
                i3++;
                i2 = i >>> 7;
            } else {
                bVar.mo52789o((byte) (i5 & 127));
                return i3 + 1;
            }
        }
    }
}
