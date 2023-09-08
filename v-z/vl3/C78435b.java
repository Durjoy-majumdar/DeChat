package vl3;

import android.text.Spannable;
import gy3.C87412m;

/* renamed from: vl3.b */
public final class C78435b {

    /* renamed from: a */
    public final Spannable f229807a;

    /* renamed from: b */
    public final int f229808b;

    public C78435b() {
        this((Spannable) null, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78435b)) {
            return false;
        }
        C78435b bVar = (C78435b) obj;
        return C87412m.m108589b(this.f229807a, bVar.f229807a) && this.f229808b == bVar.f229808b;
    }

    public int hashCode() {
        Spannable spannable = this.f229807a;
        return ((spannable == null ? 0 : spannable.hashCode()) * 31) + this.f229808b;
    }

    public String toString() {
        return "EmojiProcessResult(resultSpannableString=" + this.f229807a + ", allTypeEmojiCount=" + this.f229808b + ')';
    }

    public C78435b(Spannable spannable, int i) {
        this.f229807a = spannable;
        this.f229808b = i;
    }
}
