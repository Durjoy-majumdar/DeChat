package p53;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import gy3.C87412m;

/* renamed from: p53.n */
public final class C11847n implements C54209k0.C54210b {

    /* renamed from: a */
    public final byte[] f34649a;

    /* renamed from: b */
    public final int f34650b;

    public C11847n(byte[] bArr, int i) {
        this.f34649a = bArr;
        this.f34650b = i;
    }

    public <T extends C39622i0> T create(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        return new C11844l(this.f34649a, this.f34650b);
    }
}
