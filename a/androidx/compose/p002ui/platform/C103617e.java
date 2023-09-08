package androidx.compose.p002ui.platform;

import gy3.C8480h;

/* renamed from: androidx.compose.ui.platform.e */
public final class C103617e extends C103605a {

    /* renamed from: c */
    public static C103617e f306071c;

    public C103617e(C8480h hVar) {
    }

    /* renamed from: a */
    public int[] mo144709a(int i) {
        int length = mo144708d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && mo144708d().charAt(i) == 10 && !mo144719f(i)) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !mo144718e(i2)) {
            i2++;
        }
        return mo144707c(i, i2);
    }

    /* renamed from: b */
    public int[] mo144710b(int i) {
        int length = mo144708d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && mo144708d().charAt(i - 1) == 10 && !mo144718e(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && !mo144719f(i2)) {
            i2--;
        }
        return mo144707c(i2, i);
    }

    /* renamed from: e */
    public final boolean mo144718e(int i) {
        return i > 0 && mo144708d().charAt(i + -1) != 10 && (i == mo144708d().length() || mo144708d().charAt(i) == 10);
    }

    /* renamed from: f */
    public final boolean mo144719f(int i) {
        return mo144708d().charAt(i) != 10 && (i == 0 || mo144708d().charAt(i - 1) == 10);
    }
}
