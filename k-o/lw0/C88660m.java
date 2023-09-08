package lw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import d81.C86218a;

/* renamed from: lw0.m */
public abstract class C88660m {

    /* renamed from: a */
    public int f255977a = -1;

    /* renamed from: b */
    public byte[] f255978b = null;

    /* renamed from: a */
    public boolean mo123100a(C86218a aVar) {
        if (aVar == null || aVar.mo120650a() == 0) {
            Log.m105928w("MicroMsg.exdevice.TLVBase", "autoBuffer is null or nil");
            return false;
        }
        byte[] bArr = new byte[1];
        aVar.mo120651b(bArr, 0, 1);
        byte b = bArr[0];
        if (b + 1 > aVar.mo120650a()) {
            Log.m105929w("MicroMsg.exdevice.TLVBase", "lengthInt(%d) + 1 > autoBuffer.getSize()(%d)", Integer.valueOf(b), Integer.valueOf(aVar.mo120650a()));
            return false;
        } else if (b <= 1) {
            Log.m105929w("MicroMsg.exdevice.TLVBase", "length(%d) <= 1", Integer.valueOf(b));
            return false;
        } else {
            this.f255977a = b;
            aVar.mo120651b(bArr, 0, 1);
            byte[] bArr2 = new byte[(this.f255977a - 1)];
            this.f255978b = bArr2;
            aVar.mo120651b(bArr2, 0, bArr2.length);
            return mo123099b(this.f255978b);
        }
    }

    /* renamed from: b */
    public abstract boolean mo123099b(byte[] bArr);
}
