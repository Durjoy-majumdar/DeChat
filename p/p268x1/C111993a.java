package p268x1;

import java.text.CharacterIterator;

/* renamed from: x1.a */
public class C111993a implements CharacterIterator {

    /* renamed from: d */
    public final int f335250d;

    /* renamed from: e */
    public final int f335251e;

    /* renamed from: f */
    public int f335252f;

    /* renamed from: g */
    public final CharSequence f335253g;

    public C111993a(CharSequence charSequence, int i, int i2) {
        this.f335253g = charSequence;
        this.f335252f = i;
        this.f335250d = i;
        this.f335251e = i2;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public char current() {
        int i = this.f335252f;
        if (i == this.f335251e) {
            return 65535;
        }
        return this.f335253g.charAt(i);
    }

    public char first() {
        this.f335252f = this.f335250d;
        return current();
    }

    public int getBeginIndex() {
        return this.f335250d;
    }

    public int getEndIndex() {
        return this.f335251e;
    }

    public int getIndex() {
        return this.f335252f;
    }

    public char last() {
        int i = this.f335250d;
        int i2 = this.f335251e;
        if (i == i2) {
            this.f335252f = i2;
            return 65535;
        }
        int i3 = i2 - 1;
        this.f335252f = i3;
        return this.f335253g.charAt(i3);
    }

    public char next() {
        int i = this.f335252f + 1;
        this.f335252f = i;
        int i2 = this.f335251e;
        if (i < i2) {
            return this.f335253g.charAt(i);
        }
        this.f335252f = i2;
        return 65535;
    }

    public char previous() {
        int i = this.f335252f;
        if (i <= this.f335250d) {
            return 65535;
        }
        int i2 = i - 1;
        this.f335252f = i2;
        return this.f335253g.charAt(i2);
    }

    public char setIndex(int i) {
        if (this.f335250d > i || i > this.f335251e) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f335252f = i;
        return current();
    }
}
