package pe3;

import java.io.UnsupportedEncodingException;

/* renamed from: pe3.b */
public final class C89349b {

    /* renamed from: a */
    public byte[] f257327a;

    public C89349b() {
    }

    /* renamed from: a */
    public static C89349b m111674a(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new C89349b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static C89349b m111675b(String str) {
        try {
            C89349b bVar = new C89349b();
            bVar.f257327a = str.getBytes("UTF-8");
            return bVar;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: c */
    public void mo123700c(byte[] bArr, int i) {
        byte[] bArr2 = this.f257327a;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
    }

    /* renamed from: d */
    public C89349b mo123701d(int i) {
        byte[] bArr = new byte[i];
        byte[] bArr2 = this.f257327a;
        if (bArr2.length >= i) {
            System.arraycopy(bArr2, 0, bArr, 0, i - 1);
            this.f257327a = bArr;
        } else {
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f257327a = bArr;
        }
        return this;
    }

    /* renamed from: e */
    public int mo123702e() {
        return this.f257327a.length;
    }

    /* renamed from: f */
    public byte[] mo123703f() {
        byte[] bArr = this.f257327a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: g */
    public String mo123704g(String str) {
        return new String(this.f257327a, str);
    }

    /* renamed from: h */
    public String mo123705h() {
        byte[] bArr;
        int i = 0;
        while (true) {
            try {
                bArr = this.f257327a;
                if (i >= bArr.length) {
                    break;
                } else if (bArr[i] == 0) {
                    break;
                } else {
                    i++;
                }
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException("UTF-8 not supported?");
            }
        }
        return new String(bArr, 0, i, "UTF-8");
    }

    public C89349b(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C89349b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f257327a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
