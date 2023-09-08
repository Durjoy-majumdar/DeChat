package o24;

import gy3.C87412m;
import java.security.MessageDigest;
import p24.C21917c;
import sx3.C110821n;

/* renamed from: o24.a0 */
public final class C21752a0 extends C21769k {

    /* renamed from: i */
    public final transient byte[][] f61675i;

    /* renamed from: j */
    public final transient int[] f61676j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21752a0(byte[][] bArr, int[] iArr) {
        super(C21769k.f61696g.f61700f);
        C87412m.m108594g(bArr, "segments");
        C87412m.m108594g(iArr, "directory");
        this.f61675i = bArr;
        this.f61676j = iArr;
    }

    /* renamed from: a */
    public String mo34082a() {
        return new C21769k(mo34094p()).mo34082a();
    }

    /* renamed from: e */
    public C21769k mo34083e(String str) {
        C87412m.m108594g(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = this.f61675i.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f61676j;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            instance.update(this.f61675i[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        C87412m.m108593f(digest, "digestBytes");
        return new C21769k(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21769k) {
            C21769k kVar = (C21769k) obj;
            return kVar.mo34085f() == mo34085f() && mo34090k(0, kVar, 0, mo34085f());
        }
    }

    /* renamed from: f */
    public int mo34085f() {
        return this.f61676j[this.f61675i.length - 1];
    }

    /* renamed from: g */
    public String mo34086g() {
        return new C21769k(mo34094p()).mo34086g();
    }

    /* renamed from: h */
    public byte[] mo34087h() {
        return mo34094p();
    }

    public int hashCode() {
        int i = this.f61698d;
        if (i != 0) {
            return i;
        }
        int length = this.f61675i.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f61676j;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.f61675i[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f61698d = i3;
        return i3;
    }

    /* renamed from: i */
    public byte mo34089i(int i) {
        C21753b.m24816b((long) this.f61676j[this.f61675i.length - 1], (long) i, 1);
        int a = C21917c.m25179a(this, i);
        int i2 = a == 0 ? 0 : this.f61676j[a - 1];
        int[] iArr = this.f61676j;
        byte[][] bArr = this.f61675i;
        return bArr[a][(i - i2) + iArr[bArr.length + a]];
    }

    /* renamed from: k */
    public boolean mo34090k(int i, C21769k kVar, int i2, int i3) {
        C87412m.m108594g(kVar, "other");
        if (i < 0 || i > mo34085f() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int a = C21917c.m25179a(this, i);
        while (i < i4) {
            int i5 = a == 0 ? 0 : this.f61676j[a - 1];
            int[] iArr = this.f61676j;
            int i6 = iArr[this.f61675i.length + a];
            int min = Math.min(i4, (iArr[a] - i5) + i5) - i;
            if (!kVar.mo34091l(i2, this.f61675i[a], i6 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo34091l(int i, byte[] bArr, int i2, int i3) {
        C87412m.m108594g(bArr, "other");
        if (i < 0 || i > mo34085f() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int a = C21917c.m25179a(this, i);
        while (i < i4) {
            int i5 = a == 0 ? 0 : this.f61676j[a - 1];
            int[] iArr = this.f61676j;
            int i6 = iArr[this.f61675i.length + a];
            int min = Math.min(i4, (iArr[a] - i5) + i5) - i;
            if (!C21753b.m24815a(this.f61675i[a], i6 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    /* renamed from: m */
    public C21769k mo34092m() {
        return new C21769k(mo34094p()).mo34092m();
    }

    /* renamed from: o */
    public void mo34093o(C21766h hVar, int i, int i2) {
        C87412m.m108594g(hVar, "buffer");
        int i3 = i + i2;
        int a = C21917c.m25179a(this, i);
        while (i < i3) {
            int i4 = a == 0 ? 0 : this.f61676j[a - 1];
            int[] iArr = this.f61676j;
            int i5 = iArr[this.f61675i.length + a];
            int min = Math.min(i3, (iArr[a] - i4) + i4) - i;
            int i6 = i5 + (i - i4);
            C21784y yVar = new C21784y(this.f61675i[a], i6, i6 + min, true, false);
            C21784y yVar2 = hVar.f61694d;
            if (yVar2 == null) {
                yVar.f61737g = yVar;
                yVar.f61736f = yVar;
                hVar.f61694d = yVar;
            } else {
                C87412m.m108591d(yVar2);
                C21784y yVar3 = yVar2.f61737g;
                C87412m.m108591d(yVar3);
                yVar3.mo34187b(yVar);
            }
            i += min;
            a++;
        }
        hVar.f61695e += (long) i2;
    }

    /* renamed from: p */
    public byte[] mo34094p() {
        byte[] bArr = new byte[mo34085f()];
        int length = this.f61675i.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f61676j;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            C110821n.m150960g(this.f61675i[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public String toString() {
        return new C21769k(mo34094p()).toString();
    }
}
