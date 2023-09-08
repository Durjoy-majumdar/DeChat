package oo3;

import java.text.CharacterIterator;

/* renamed from: oo3.a */
public class C110056a implements CharacterIterator {

    /* renamed from: d */
    public final int f329340d;

    /* renamed from: e */
    public final int f329341e;

    /* renamed from: f */
    public int f329342f;

    /* renamed from: g */
    public final CharSequence f329343g;

    public C110056a(CharSequence charSequence, int i, int i2) {
        this.f329343g = charSequence;
        this.f329342f = i;
        this.f329340d = i;
        this.f329341e = i2;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public char current() {
        int i = this.f329342f;
        if (i == this.f329341e) {
            return 65535;
        }
        return this.f329343g.charAt(i);
    }

    public char first() {
        this.f329342f = this.f329340d;
        return current();
    }

    public int getBeginIndex() {
        return this.f329340d;
    }

    public int getEndIndex() {
        return this.f329341e;
    }

    public int getIndex() {
        return this.f329342f;
    }

    public char last() {
        int i = this.f329340d;
        int i2 = this.f329341e;
        if (i == i2) {
            this.f329342f = i2;
            return 65535;
        }
        int i3 = i2 - 1;
        this.f329342f = i3;
        return this.f329343g.charAt(i3);
    }

    public char next() {
        int i = this.f329342f + 1;
        this.f329342f = i;
        int i2 = this.f329341e;
        if (i < i2) {
            return this.f329343g.charAt(i);
        }
        this.f329342f = i2;
        return 65535;
    }

    public char previous() {
        int i = this.f329342f;
        if (i <= this.f329340d) {
            return 65535;
        }
        int i2 = i - 1;
        this.f329342f = i2;
        return this.f329343g.charAt(i2);
    }

    public char setIndex(int i) {
        if (this.f329340d > i || i > this.f329341e) {
            return current();
        }
        this.f329342f = i;
        return current();
    }
}
