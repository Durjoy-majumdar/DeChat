package b24;

import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.m0 */
public class C113107m0 {

    /* renamed from: a */
    public int f338494a = 128;

    /* renamed from: b */
    public int f338495b = 0;

    /* renamed from: c */
    public int f338496c = 0;

    /* renamed from: d */
    public byte[] f338497d = new byte[128];

    /* renamed from: e */
    public int f338498e = 0;

    /* renamed from: a */
    public void mo165626a(byte[] bArr, int i) {
        if (i > this.f338494a - 4) {
            int i2 = i + 4 + 64;
            this.f338494a = i2;
            byte[] bArr2 = new byte[i2];
            System.arraycopy(this.f338497d, 0, bArr2, 0, this.f338495b);
            this.f338497d = bArr2;
        }
        this.f338496c = i;
        System.arraycopy(bArr, 0, this.f338497d, this.f338495b, i);
        this.f338495b += i;
    }

    /* renamed from: b */
    public void mo165627b(int i) {
        C117790util.m166193o(this.f338497d, this.f338495b, i);
        int i2 = this.f338495b + 2;
        this.f338495b = i2;
        C117790util.m166193o(this.f338497d, i2, 0);
        this.f338495b += 2;
    }

    /* renamed from: c */
    public byte[] mo165628c() {
        int i = this.f338495b;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f338497d, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: d */
    public byte[] mo165629d() {
        int i = this.f338496c;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f338497d, 4, bArr, 0, i);
        return bArr;
    }

    /* renamed from: e */
    public int mo165630e(byte[] bArr, int i, int i2) {
        int i3;
        int f = mo165631f(bArr, i, i2, this.f338498e);
        if (f < 0 || 4 >= (i3 = i2 - (f - i))) {
            return -1;
        }
        int f2 = C117790util.m166184f(bArr, f + 2);
        this.f338496c = f2;
        if (4 + f2 > i3) {
            return -1;
        }
        int i4 = f2 + 4;
        if (i4 > this.f338494a) {
            int i5 = i4 + 128;
            this.f338494a = i5;
            this.f338497d = new byte[i5];
        }
        this.f338495b = i4;
        System.arraycopy(bArr, f, this.f338497d, 0, i4);
        this.f338498e = C117790util.m166184f(bArr, f);
        this.f338496c = i4 - 4;
        if (!mo165621h().booleanValue()) {
            return -1005;
        }
        return f + 4 + this.f338496c;
    }

    /* renamed from: f */
    public int mo165631f(byte[] bArr, int i, int i2, int i3) {
        int length = bArr.length;
        while (i < length) {
            int i4 = i + 2;
            if (i4 > length) {
                break;
            } else if (C117790util.m166184f(bArr, i) == i3) {
                return i;
            } else {
                if (i4 + 2 > length) {
                    break;
                }
                i = C117790util.m166184f(bArr, i4) + 2 + i4;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public void mo165632g() {
        C117790util.m166193o(this.f338497d, 2, this.f338495b - 4);
    }

    /* renamed from: h */
    public Boolean mo165621h() {
        return Boolean.TRUE;
    }
}
