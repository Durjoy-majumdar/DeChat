package qe3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C89631w;
import te3.xk4;

/* renamed from: qe3.t */
public abstract class C118193t extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public xk4 f353315a = new xk4();

    /* renamed from: b */
    public String f353316b;

    /* renamed from: c */
    public byte[] f353317c;

    /* renamed from: d */
    public byte[] f353318d;

    /* renamed from: e */
    public byte[] f353319e;

    /* renamed from: f */
    public byte[] f353320f;

    /* renamed from: g */
    public int f353321g = 0;

    /* renamed from: a */
    public byte[] mo182988a(int i) {
        byte[] bArr = new byte[0];
        if (i == 1) {
            bArr = this.f353318d;
        } else if (i == 2) {
            bArr = this.f353319e;
        } else if (i == 3) {
            bArr = this.f353320f;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(bArr == null ? -1 : bArr.length);
        Log.m105925i("MicroMsg.MMAuth", "summerauths getSession seesionKeyType[%s] [%s]", objArr);
        return bArr;
    }

    /* renamed from: b */
    public void mo182989b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f353318d = bArr;
        this.f353319e = bArr2;
        this.f353320f = bArr3;
        Log.m105925i("MicroMsg.MMAuth", "summerauths setSession [%s] [%s], [%s]", Util.secPrint(Util.dumpHex(bArr)), Util.secPrint(Util.dumpHex(this.f353319e)), Util.secPrint(Util.dumpHex(this.f353320f)));
    }

    public byte[] getAuthResponse() {
        try {
            return this.f353315a.toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }
}
