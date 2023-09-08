package o23;

import com.tencent.wxmm.v2encoder;

/* renamed from: o23.c */
public class C109933c {
    /* renamed from: a */
    public static byte[] m149452a(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = bArr;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        byte[] bArr3 = new byte[(bArr2.length + 44)];
        int length = bArr2.length;
        long j = (long) (length + 36);
        long j2 = (long) (((i5 * i4) * i6) / 8);
        int i7 = length;
        System.arraycopy(new byte[]{82, 73, 70, 70, (byte) ((int) (j & 255)), (byte) ((int) ((j >> 8) & 255)), (byte) ((int) ((j >> 16) & 255)), (byte) ((int) ((j >> 24) & 255)), 87, 65, 86, 69, 102, 109, 116, 32, v2encoder.enumCODEC_vcodec2, 0, 0, 0, 1, 0, (byte) i4, 0, (byte) (i5 & 255), (byte) ((i5 >> 8) & 255), (byte) ((i5 >> 16) & 255), (byte) ((i5 >> 24) & 255), (byte) ((int) (j2 & 255)), (byte) ((int) ((j2 >> 8) & 255)), (byte) ((int) ((j2 >> 16) & 255)), (byte) ((int) ((j2 >> 24) & 255)), (byte) ((i4 * i6) / 8), 0, (byte) i6, 0, 100, 97, 116, 97, (byte) (i7 & 255), (byte) ((i7 >> 8) & 255), (byte) ((i7 >> 16) & 255), (byte) ((i7 >> 24) & 255)}, 0, bArr3, 0, 44);
        System.arraycopy(bArr2, 0, bArr3, 44, bArr2.length);
        return bArr3;
    }
}
