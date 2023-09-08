package p354kh;

import java.lang.reflect.Array;
import p335eh.C20599b;

/* renamed from: kh.d */
public abstract class C21336d implements C21337e {

    /* renamed from: a */
    public short[][] f60320a = ((short[][]) Array.newInstance(Short.TYPE, new int[]{1, 1}));

    /* renamed from: b */
    public int f60321b = 1;

    /* renamed from: c */
    public int f60322c = 1;

    /* renamed from: d */
    public short[] f60323d = new short[1];

    /* renamed from: e */
    public int f60324e = 1;

    /* renamed from: f */
    public int f60325f = 32767;

    /* renamed from: g */
    public int f60326g = -32768;

    /* renamed from: h */
    public C20599b f60327h;

    /* renamed from: a */
    public byte[] mo33379a(int i, int i2) {
        C20599b bVar = this.f60327h;
        byte[] bArr = bVar != null ? bVar.f57998c : null;
        if (bArr == null || bArr.length != i) {
            bArr = new byte[i];
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 2;
            short s = this.f60323d[i3];
            bArr[i4] = (byte) (s & 255);
            bArr[i4 + 1] = (byte) ((s & 65280) >> 8);
        }
        return bArr;
    }

    /* renamed from: b */
    public abstract byte[] mo33380b(int i, int i2, int i3);

    /* renamed from: c */
    public short mo33381c(int i) {
        int i2 = this.f60325f;
        if (i > i2) {
            return (short) i2;
        }
        int i3 = this.f60326g;
        return i < i3 ? (short) i3 : (short) i;
    }
}
