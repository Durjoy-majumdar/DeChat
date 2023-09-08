package a24;

import b24.C113088d;
import b24.C113090e;
import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: a24.e */
public class C112738e extends C112737d {
    public C112738e(C112739f fVar) {
        this.f337567e = 2064;
        this.f337568f = 2;
        this.f337569g = fVar;
    }

    /* renamed from: g */
    public byte[] mo164496g(byte[] bArr) {
        int i;
        int i2;
        C112739f fVar = this.f337569g;
        int i3 = fVar.f337579i;
        byte[] d = fVar.f337574d.mo165629d();
        C113090e eVar = this.f337569g.f337575e;
        int i4 = eVar.f338488g;
        byte[] bArr2 = new byte[i4];
        if (i4 > 0) {
            System.arraycopy(eVar.f338497d, eVar.f338490i, bArr2, 0, i4);
        }
        byte[] bArr3 = new byte[128];
        byte[] i5 = new C113088d().mo165619i(d);
        int length = bArr.length + 6 + i4;
        byte[] bArr4 = new byte[length];
        C117790util.m166193o(bArr4, 0, 0);
        C117790util.m166193o(bArr4, 2, bArr.length);
        System.arraycopy(bArr, 0, bArr4, 4, bArr.length);
        int length2 = bArr.length + 4;
        C117790util.m166193o(bArr4, length2, i4);
        System.arraycopy(bArr2, 0, bArr4, length2 + 2, i4);
        C117790util.m166193o(bArr3, 0, 2);
        C117790util.m166193o(bArr3, 2, 0);
        if (length > 124) {
            byte[] bArr5 = new byte[(length + 4 + 64)];
            System.arraycopy(bArr3, 0, bArr5, 0, 4);
            bArr3 = bArr5;
        }
        System.arraycopy(bArr4, 0, bArr3, 4, length);
        int i6 = 4 + length;
        C117790util.m166193o(bArr3, 2, i6 - 4);
        byte[] bArr6 = new byte[i6];
        System.arraycopy(bArr3, 0, bArr6, 0, i6);
        byte[] bArr7 = new byte[(i5.length + i6)];
        if (d.length > 0) {
            System.arraycopy(i5, 0, bArr7, 0, i5.length);
            i2 = i5.length + 0;
            i = 1;
        } else {
            i2 = 0;
            i = 0;
        }
        System.arraycopy(bArr6, 0, bArr7, i2, i6);
        byte[] b = mo164491b(bArr7, this.f337568f, i + 1);
        mo164493d(8001, this.f337567e, C112737d.f337562h, this.f337569g.f337576f, 0, 0, i3, 0, b);
        int i7 = this.f337564b;
        byte[] bArr8 = new byte[i7];
        System.arraycopy(this.f337566d, 0, bArr8, 0, i7);
        return bArr8;
    }
}
