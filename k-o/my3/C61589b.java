package my3;

import gy3.C87412m;
import java.util.NoSuchElementException;
import sx3.C64194s;

/* renamed from: my3.b */
public final class C61589b extends C64194s {

    /* renamed from: d */
    public final int f175170d;

    /* renamed from: e */
    public final int f175171e;

    /* renamed from: f */
    public boolean f175172f;

    /* renamed from: g */
    public int f175173g;

    public C61589b(char c, char c2, int i) {
        this.f175170d = i;
        this.f175171e = c2;
        boolean z = true;
        if (i <= 0 ? C87412m.m108596i(c, c2) < 0 : C87412m.m108596i(c, c2) > 0) {
            z = false;
        }
        this.f175172f = z;
        this.f175173g = !z ? c2 : c;
    }

    /* renamed from: a */
    public char mo86521a() {
        int i = this.f175173g;
        if (i != this.f175171e) {
            this.f175173g = this.f175170d + i;
        } else if (this.f175172f) {
            this.f175172f = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i;
    }

    public boolean hasNext() {
        return this.f175172f;
    }
}
