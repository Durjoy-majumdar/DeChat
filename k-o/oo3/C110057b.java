package oo3;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: oo3.b */
public class C110057b {

    /* renamed from: a */
    public int f329344a;

    /* renamed from: b */
    public int f329345b;

    /* renamed from: c */
    public CharSequence f329346c;

    /* renamed from: d */
    public final BreakIterator f329347d;

    public C110057b(Locale locale) {
        this.f329347d = BreakIterator.getWordInstance(locale);
    }

    /* renamed from: h */
    public static boolean m149576h(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* renamed from: a */
    public final void mo161410a(int i) {
        if (this.f329344a > i || i > this.f329345b) {
            throw new IllegalArgumentException("Invalid offset: " + i + ". Valid range is [" + this.f329344a + ", " + this.f329345b + "]");
        }
    }

    /* renamed from: b */
    public final int mo161411b(int i, boolean z) {
        mo161410a(i);
        try {
            if (mo161415f(i)) {
                return (!this.f329347d.isBoundary(i) || (mo161413d(i) && z)) ? this.f329347d.preceding(i) : i;
            }
            if (mo161413d(i)) {
                return this.f329347d.preceding(i);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public final int mo161412c(int i, boolean z) {
        mo161410a(i);
        if (mo161413d(i)) {
            return (!this.f329347d.isBoundary(i) || (mo161415f(i) && z)) ? this.f329347d.following(i) : i;
        }
        if (mo161415f(i)) {
            return this.f329347d.following(i);
        }
        return -1;
    }

    /* renamed from: d */
    public final boolean mo161413d(int i) {
        return this.f329344a < i && i <= this.f329345b && Character.isLetterOrDigit(Character.codePointBefore(this.f329346c, i));
    }

    /* renamed from: e */
    public boolean mo161414e(int i) {
        if (this.f329344a >= i || i > this.f329345b) {
            return false;
        }
        return m149576h(Character.codePointBefore(this.f329346c, i));
    }

    /* renamed from: f */
    public final boolean mo161415f(int i) {
        return this.f329344a <= i && i < this.f329345b && Character.isLetterOrDigit(Character.codePointAt(this.f329346c, i));
    }

    /* renamed from: g */
    public boolean mo161416g(int i) {
        if (this.f329344a > i || i >= this.f329345b) {
            return false;
        }
        return m149576h(Character.codePointAt(this.f329346c, i));
    }

    /* renamed from: i */
    public void mo161417i(CharSequence charSequence, int i, int i2) {
        if (i < 0 || i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException("input indexes are outside the CharSequence");
        }
        this.f329346c = charSequence;
        this.f329344a = Math.max(0, i - 50);
        int min = Math.min(charSequence.length(), i2 + 50);
        this.f329345b = min;
        this.f329347d.setText(new C110056a(charSequence, this.f329344a, min));
    }
}
