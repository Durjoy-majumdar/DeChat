package ka0;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import r24.C26109a;

/* renamed from: ka0.a */
public class C88123a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m109719a(byte[] r6, int r7) {
        /*
            int r7 = r7 + 7
            byte r0 = r6[r7]
            r1 = r0 & 127(0x7f, float:1.78E-43)
            long r1 = (long) r1
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r3 = 6
        L_0x000f:
            if (r3 < 0) goto L_0x0024
            r4 = 256(0x100, double:1.265E-321)
            long r1 = r1 * r4
            int r7 = r7 + -1
            byte r4 = r6[r7]
            if (r4 < 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            int r4 = r4 + 256
        L_0x001e:
            short r4 = (short) r4
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + -1
            goto L_0x000f
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            long r1 = -r1
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ka0.C88123a.m109719a(byte[], int):long");
    }

    /* renamed from: b */
    public static InputStream m109720b(byte[] bArr, long j, long j2) {
        if (j2 == -1) {
            j2 = ((long) bArr.length) - j;
        }
        return new C26109a(new ByteArrayInputStream(bArr, (int) j, (int) j2));
    }

    /* renamed from: c */
    public static final boolean m109721c(InputStream inputStream, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                return false;
            }
            i3 += read;
        }
        return true;
    }
}
