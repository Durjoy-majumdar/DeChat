package xz3;

import com.tencent.wxmm.v2encoder;

/* renamed from: xz3.x */
public final class C23179x {
    /* renamed from: a */
    public static int m27554a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                byte b2 = bArr[i];
                if (b > -12 || b2 > -65) {
                    return -1;
                }
                return b ^ (b2 << 8);
            } else if (i3 == 2) {
                byte b3 = bArr[i];
                byte b4 = bArr[i + 1];
                if (b > -12 || b3 > -65 || b4 > -65) {
                    return -1;
                }
                return ((b3 << 8) ^ b) ^ (b4 << v2encoder.enumCODEC_vcodec2);
            } else {
                throw new AssertionError();
            }
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }

    /* renamed from: b */
    public static int m27555b(byte[] bArr, int i, int i2) {
        while (r8 < i2 && bArr[r8] >= 0) {
            i = r8 + 1;
        }
        if (r8 >= i2) {
            return 0;
        }
        while (r8 < i2) {
            int i3 = r8 + 1;
            byte b = bArr[r8];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        r8 = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return m27554a(bArr, i3, i2);
                    }
                    int i4 = i3 + 1;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        r8 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                } else if (i3 >= i2 - 2) {
                    return m27554a(bArr, i3, i2);
                } else {
                    int i5 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i3 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            r8 = i3;
        }
        return 0;
    }
}
