package p1163y1;

import gy3.C8480h;
import gy3.C87412m;
import java.text.BreakIterator;
import java.util.Locale;
import p268x1.C111993a;

/* renamed from: y1.b */
public final class C112356b {

    /* renamed from: e */
    public static final C112357a f336380e = new C112357a((C8480h) null);

    /* renamed from: a */
    public final CharSequence f336381a;

    /* renamed from: b */
    public final int f336382b;

    /* renamed from: c */
    public final int f336383c;

    /* renamed from: d */
    public final BreakIterator f336384d;

    /* renamed from: y1.b$a */
    public static final class C112357a {
        public C112357a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo164077a(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public C112356b(CharSequence charSequence, int i, int i2, Locale locale) {
        C87412m.m108594g(charSequence, "charSequence");
        this.f336381a = charSequence;
        boolean z = true;
        if (i >= 0 && i <= charSequence.length()) {
            if ((i2 < 0 || i2 > charSequence.length()) ? false : z) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                C87412m.m108593f(wordInstance, "getWordInstance(locale)");
                this.f336384d = wordInstance;
                this.f336382b = Math.max(0, i - 50);
                this.f336383c = Math.min(charSequence.length(), i2 + 50);
                wordInstance.setText(new C111993a(charSequence, i, i2));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    /* renamed from: a */
    public final void mo164072a(int i) {
        int i2 = this.f336382b;
        boolean z = false;
        if (i <= this.f336383c && i2 <= i) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("Invalid offset: " + i + ". Valid range is [" + this.f336382b + " , " + this.f336383c + ']').toString());
        }
    }

    /* renamed from: b */
    public final boolean mo164073b(int i) {
        return (i <= this.f336383c && this.f336382b + 1 <= i) && Character.isLetterOrDigit(Character.codePointBefore(this.f336381a, i));
    }

    /* renamed from: c */
    public final boolean mo164074c(int i) {
        boolean z = true;
        int i2 = this.f336382b + 1;
        if (i > this.f336383c || i2 > i) {
            z = false;
        }
        if (!z) {
            return false;
        }
        return f336380e.mo164077a(Character.codePointBefore(this.f336381a, i));
    }

    /* renamed from: d */
    public final boolean mo164075d(int i) {
        return (i < this.f336383c && this.f336382b <= i) && Character.isLetterOrDigit(Character.codePointAt(this.f336381a, i));
    }

    /* renamed from: e */
    public final boolean mo164076e(int i) {
        if (!(i < this.f336383c && this.f336382b <= i)) {
            return false;
        }
        return f336380e.mo164077a(Character.codePointAt(this.f336381a, i));
    }
}
