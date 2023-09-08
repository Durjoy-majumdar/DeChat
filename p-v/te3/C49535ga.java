package te3;

import u14.C52418a;
import z14.C53733a;

/* renamed from: te3.ga */
public class C49535ga extends C101820nt3 {

    /* renamed from: d */
    public byte[] f133943d;

    public C49535ga(byte[] bArr) {
        this.f133943d = bArr;
    }

    /* renamed from: op */
    public int mo24180op(int i, Object... objArr) {
        return -1;
    }

    public byte[] toByteArray() {
        validate();
        int computeSize = this.BaseRequest.computeSize();
        int i = C52418a.m58682i(1, computeSize);
        byte[] bArr = new byte[i];
        C53733a aVar = new C53733a(bArr);
        aVar.mo74322i(1, computeSize);
        this.BaseRequest.writeFields(aVar);
        byte[] bArr2 = new byte[(this.f133943d.length + i)];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = this.f133943d;
        System.arraycopy(bArr3, 0, bArr2, i, bArr3.length);
        return bArr2;
    }
}
