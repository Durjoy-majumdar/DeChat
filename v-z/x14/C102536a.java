package x14;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.util.LinkedList;

/* renamed from: x14.a */
public final class C102536a {

    /* renamed from: a */
    public byte[] f301906a;

    /* renamed from: b */
    public int f301907b;

    /* renamed from: c */
    public int f301908c;

    /* renamed from: d */
    public int f301909d = 0;

    public C102536a(byte[] bArr, int i, int i2) {
        this.f301906a = bArr;
        this.f301907b = i2 + i;
        this.f301908c = i;
    }

    /* renamed from: a */
    public double mo142148a() {
        byte d = mo142151d();
        byte d2 = mo142151d();
        return Double.longBitsToDouble(((((long) d2) & 255) << 8) | (((long) d) & 255) | ((((long) mo142151d()) & 255) << 16) | ((((long) mo142151d()) & 255) << 24) | ((((long) mo142151d()) & 255) << 32) | ((((long) mo142151d()) & 255) << 40) | ((((long) mo142151d()) & 255) << 48) | ((((long) mo142151d()) & 255) << 56));
    }

    /* renamed from: b */
    public float mo142149b() {
        return Float.intBitsToFloat((mo142151d() & ExifInterface.MARKER) | ((mo142151d() & ExifInterface.MARKER) << 8) | ((mo142151d() & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((mo142151d() & ExifInterface.MARKER) << 24));
    }

    /* renamed from: c */
    public final int[] mo142150c(int i) {
        int i2;
        int i3;
        int i4;
        byte[] bArr = this.f301906a;
        byte b = bArr[i];
        int i5 = i + 1;
        if (b >= 0) {
            return new int[]{b, i5};
        }
        int i6 = b & 127;
        byte b2 = bArr[i5];
        if (b2 >= 0) {
            i2 = i5 + 1;
            i4 = b2 << 7;
        } else {
            int i7 = b2 & 127;
            i6 |= i7 << 7;
            if (b2 >= 0) {
                i2 = i5 + 1;
                i4 = b2 << 14;
            } else {
                i6 |= i7 << 14;
                if (b2 >= 0) {
                    i2 = i5 + 1;
                    i4 = b2 << 21;
                } else {
                    int i8 = i6 | (i7 << 21) | (b2 << 28);
                    i2 = i5 + 1;
                    if (b2 < 0) {
                        for (int i9 = 0; i9 < 5; i9++) {
                            if (this.f301906a[i2] >= 0) {
                                return new int[]{b2, i2 + 1};
                            }
                        }
                        throw new C102537b("CodedInputStream encountered a malformed varint.");
                    }
                    i3 = i8;
                    return new int[]{i3, i2};
                }
            }
        }
        i3 = i4 | i6;
        return new int[]{i3, i2};
    }

    /* renamed from: d */
    public final byte mo142151d() {
        if (this.f301908c == this.f301907b) {
            mo142156i(true);
        }
        byte[] bArr = this.f301906a;
        int i = this.f301908c;
        this.f301908c = i + 1;
        return bArr[i];
    }

    /* renamed from: e */
    public final byte[] mo142152e(int i) {
        if (i >= 0) {
            int i2 = this.f301909d;
            int i3 = this.f301908c;
            if (i2 + i3 + i <= Integer.MAX_VALUE) {
                int i4 = this.f301907b;
                int i5 = i4 - i3;
                if (i <= i5) {
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f301906a, i3, bArr, 0, i);
                    this.f301908c += i;
                    return bArr;
                } else if (i < 2048) {
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(this.f301906a, i3, bArr2, 0, i5);
                    this.f301908c = this.f301907b;
                    mo142156i(true);
                    while (true) {
                        int i6 = i - i5;
                        int i7 = this.f301907b;
                        if (i6 > i7) {
                            System.arraycopy(this.f301906a, 0, bArr2, i5, i7);
                            int i8 = this.f301907b;
                            i5 += i8;
                            this.f301908c = i8;
                            mo142156i(true);
                        } else {
                            System.arraycopy(this.f301906a, 0, bArr2, i5, i6);
                            this.f301908c = i6;
                            return bArr2;
                        }
                    }
                } else {
                    this.f301909d = i2 + i4;
                    this.f301908c = 0;
                    this.f301907b = 0;
                    int i9 = i - i5;
                    LinkedList linkedList = new LinkedList();
                    while (i9 > 0) {
                        int min = Math.min(i9, 2048);
                        byte[] bArr3 = new byte[min];
                        if (min <= 0) {
                            i9 -= min;
                            linkedList.add(bArr3);
                        } else {
                            throw C102537b.m135381a();
                        }
                    }
                    byte[] bArr4 = new byte[i];
                    System.arraycopy(this.f301906a, i3, bArr4, 0, i5);
                    for (int i15 = 0; i15 < linkedList.size(); i15++) {
                        byte[] bArr5 = (byte[]) linkedList.get(i15);
                        System.arraycopy(bArr5, 0, bArr4, i5, bArr5.length);
                        i5 += bArr5.length;
                    }
                    return bArr4;
                }
            } else {
                mo142157j((Integer.MAX_VALUE - i2) - i3);
                throw C102537b.m135381a();
            }
        } else {
            throw new C102537b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    /* renamed from: f */
    public final int mo142153f() {
        int i;
        byte d = mo142151d();
        if (d >= 0) {
            return d;
        }
        byte b = d & Byte.MAX_VALUE;
        byte d2 = mo142151d();
        if (d2 >= 0) {
            i = d2 << 7;
        } else {
            b |= (d2 & Byte.MAX_VALUE) << 7;
            byte d3 = mo142151d();
            if (d3 >= 0) {
                i = d3 << 14;
            } else {
                b |= (d3 & Byte.MAX_VALUE) << 14;
                byte d4 = mo142151d();
                if (d4 >= 0) {
                    i = d4 << 21;
                } else {
                    byte b2 = b | ((d4 & Byte.MAX_VALUE) << 21);
                    byte d5 = mo142151d();
                    byte b3 = b2 | (d5 << 28);
                    if (d5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (mo142151d() >= 0) {
                            return b3;
                        }
                    }
                    throw new C102537b("CodedInputStream encountered a malformed varint.");
                }
            }
        }
        return b | i;
    }

    /* renamed from: g */
    public long mo142154g() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte d = mo142151d();
            j |= ((long) (d & Byte.MAX_VALUE)) << i;
            if ((d & 128) == 0) {
                return j;
            }
        }
        throw new C102537b("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: h */
    public String mo142155h() {
        int f = mo142153f();
        int i = this.f301907b;
        int i2 = this.f301908c;
        if (f >= i - i2 || f <= 0) {
            return new String(mo142152e(f), "UTF-8");
        }
        String str = new String(this.f301906a, i2, f, "UTF-8");
        this.f301908c += f;
        return str;
    }

    /* renamed from: i */
    public final boolean mo142156i(boolean z) {
        int i = this.f301908c;
        int i2 = this.f301907b;
        if (i >= i2) {
            int i3 = this.f301909d;
            if (i3 + i2 != Integer.MAX_VALUE) {
                this.f301909d = i3 + i2;
                this.f301908c = 0;
                this.f301907b = -1;
                this.f301907b = 0;
                if (!z) {
                    return false;
                }
                throw C102537b.m135381a();
            } else if (!z) {
                return false;
            } else {
                throw C102537b.m135381a();
            }
        } else {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
    }

    /* renamed from: j */
    public final void mo142157j(int i) {
        if (i >= 0) {
            int i2 = this.f301909d;
            int i3 = this.f301908c;
            if (i2 + i3 + i <= Integer.MAX_VALUE) {
                int i4 = this.f301907b - i3;
                if (i < i4) {
                    this.f301908c = i3 + i;
                    return;
                }
                this.f301909d = i2 + i4;
                this.f301908c = 0;
                this.f301907b = 0;
                if (i4 < i) {
                    throw C102537b.m135381a();
                }
                return;
            }
            mo142157j((Integer.MAX_VALUE - i2) - i3);
            throw C102537b.m135381a();
        }
        throw new C102537b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
