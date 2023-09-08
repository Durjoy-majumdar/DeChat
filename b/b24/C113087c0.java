package b24;

import c24.C16848d;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40473o1;
import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.c0 */
public class C113087c0 extends C113107m0 {
    public C113087c0() {
        this.f338498e = C40473o1.CTRL_INDEX;
    }

    /* renamed from: i */
    public byte[] mo165618i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        int i;
        int i2;
        if (bArr != null) {
            i2 = bArr.length + 0;
            i = 1;
        } else {
            i2 = 0;
            i = 0;
        }
        if (bArr2 != null) {
            i2 += bArr2.length;
            i++;
        }
        if (bArr3 != null) {
            i2 += bArr3.length;
            i++;
        }
        if (bArr4 != null) {
            i2 += bArr4.length;
            i++;
        }
        int i3 = 2;
        int i4 = i2 + 2;
        byte[] bArr6 = new byte[i4];
        C117790util.m166193o(bArr6, 0, i);
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr6, 2, bArr.length);
            i3 = 2 + bArr.length;
        }
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr6, i3, bArr2.length);
            i3 += bArr2.length;
        }
        if (bArr3 != null) {
            System.arraycopy(bArr3, 0, bArr6, i3, bArr3.length);
            i3 += bArr3.length;
        }
        if (bArr4 != null) {
            System.arraycopy(bArr4, 0, bArr6, i3, bArr4.length);
        }
        byte[] b = C16848d.m16501b(bArr6, 0, i4, bArr5);
        int length = b.length;
        mo165627b(this.f338498e);
        mo165626a(b, b.length);
        mo165632g();
        return mo165628c();
    }
}
