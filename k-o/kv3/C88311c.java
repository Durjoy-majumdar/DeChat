package kv3;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.nio.ByteOrder;

/* renamed from: kv3.c */
public final class C88311c extends C88310b {

    /* renamed from: a */
    public final byte[] f255277a;

    /* renamed from: b */
    public final int f255278b;

    /* renamed from: c */
    public final ByteOrder f255279c;

    /* renamed from: d */
    public int f255280d;

    public C88311c(byte[] bArr, int i, int i2, ByteOrder byteOrder) {
        this.f255277a = bArr;
        this.f255278b = i;
        this.f255279c = byteOrder;
    }

    /* renamed from: a */
    public int mo122687a() {
        int i;
        int i2;
        byte[] bArr = this.f255277a;
        int i3 = this.f255278b;
        int i4 = this.f255280d;
        int i5 = i3 + i4;
        if (this.f255279c == ByteOrder.BIG_ENDIAN) {
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = ((bArr[i5] & ExifInterface.MARKER) << 24) | ((bArr[i6] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
            i = i8 | ((bArr[i7] & ExifInterface.MARKER) << 8);
            i2 = (bArr[i7 + 1] & ExifInterface.MARKER) << 0;
        } else {
            int i9 = i5 + 1;
            int i15 = i9 + 1;
            int i16 = ((bArr[i5] & ExifInterface.MARKER) << 0) | ((bArr[i9] & ExifInterface.MARKER) << 8);
            i = i16 | ((bArr[i15] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
            i2 = (bArr[i15 + 1] & ExifInterface.MARKER) << 24;
        }
        int i17 = i2 | i;
        this.f255280d = i4 + 4;
        return i17;
    }

    /* renamed from: b */
    public short mo122688b() {
        int i;
        byte b;
        byte[] bArr = this.f255277a;
        int i2 = this.f255278b;
        int i3 = this.f255280d;
        int i4 = i2 + i3;
        if (this.f255279c == ByteOrder.BIG_ENDIAN) {
            i = bArr[i4] << 8;
            b = bArr[i4 + 1];
        } else {
            i = bArr[i4 + 1] << 8;
            b = bArr[i4];
        }
        short s = (short) ((b & ExifInterface.MARKER) | i);
        this.f255280d = i3 + 2;
        return s;
    }
}
