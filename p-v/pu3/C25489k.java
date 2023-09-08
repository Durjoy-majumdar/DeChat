package pu3;

import ru3.C26116a;

/* renamed from: pu3.k */
public class C25489k implements C26116a {

    /* renamed from: a */
    public int f72137a = 0;

    /* renamed from: b */
    public final /* synthetic */ C25490l f72138b;

    public C25489k(C25490l lVar) {
        this.f72138b = lVar;
    }

    public byte readByte() {
        byte[] bArr = this.f72138b.f72139e;
        int i = this.f72137a;
        this.f72137a = i + 1;
        return bArr[i];
    }
}
