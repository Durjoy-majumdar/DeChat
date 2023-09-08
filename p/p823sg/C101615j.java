package p823sg;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: sg.j */
public class C101615j {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m133461a(byte[] r7, int r8, int r9, int r10) {
        /*
            r8 = r8 ^ r10
            int r0 = r10 >> 2
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1540483477(0x5bd1e995, float:1.18170193E17)
            if (r2 >= r0) goto L_0x0038
            int r4 = r2 << 2
            int r4 = r4 + r9
            int r5 = r4 + 3
            byte r5 = r7[r5]
            int r5 = r5 << 8
            int r6 = r4 + 2
            byte r6 = r7[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            int r5 = r5 << 8
            int r6 = r4 + 1
            byte r6 = r7[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            int r5 = r5 << 8
            int r4 = r4 + r1
            byte r4 = r7[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            int r4 = r4 * r3
            int r5 = r4 >>> 24
            r4 = r4 ^ r5
            int r4 = r4 * r3
            int r8 = r8 * r3
            r8 = r8 ^ r4
            int r2 = r2 + 1
            goto L_0x0005
        L_0x0038:
            r1 = 2
            int r0 = r0 << r1
            int r0 = r10 - r0
            if (r0 == 0) goto L_0x005d
            r2 = 3
            if (r0 < r2) goto L_0x0049
            int r4 = r9 + r10
            int r4 = r4 - r2
            byte r2 = r7[r4]
            int r2 = r2 << 16
            r8 = r8 ^ r2
        L_0x0049:
            if (r0 < r1) goto L_0x0053
            int r2 = r9 + r10
            int r2 = r2 - r1
            byte r1 = r7[r2]
            int r1 = r1 << 8
            r8 = r8 ^ r1
        L_0x0053:
            r1 = 1
            if (r0 < r1) goto L_0x005b
            int r9 = r9 + r10
            int r9 = r9 - r1
            byte r7 = r7[r9]
            r8 = r8 ^ r7
        L_0x005b:
            int r8 = r8 * r3
        L_0x005d:
            int r7 = r8 >>> 13
            r7 = r7 ^ r8
            int r7 = r7 * r3
            int r8 = r7 >>> 15
            r7 = r7 ^ r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p823sg.C101615j.m133461a(byte[], int, int, int):int");
    }

    /* renamed from: b */
    public static int m133462b(int i, int i2) {
        if (i2 < 0 || i2 >= Integer.MAX_VALUE) {
            return 0;
        }
        byte[] bArr = new byte[4];
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3] = (byte) ((i >> (i3 * 8)) & 255);
        }
        return (int) ((((long) m133461a(bArr, 0, 0, 4)) & Util.MAX_32BIT_VALUE) % ((long) i2));
    }
}
