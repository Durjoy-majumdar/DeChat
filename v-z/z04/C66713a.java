package z04;

import my3.C61594j;

/* renamed from: z04.a */
public class C66713a {
    /* renamed from: a */
    public static final int m78712a(int i) {
        if (new C61594j(2, 36).mo86532k(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C61594j(2, 36));
    }

    /* renamed from: b */
    public static final boolean m78713b(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
