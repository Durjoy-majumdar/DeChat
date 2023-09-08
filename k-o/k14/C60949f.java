package k14;

import f14.C58872c0;

/* renamed from: k14.f */
public final class C60949f {

    /* renamed from: a */
    public static final C58872c0 f173584a = new C58872c0("UNLOCK_FAIL");

    /* renamed from: b */
    public static final C58872c0 f173585b;

    /* renamed from: c */
    public static final C58872c0 f173586c;

    /* renamed from: d */
    public static final C33813b f173587d;

    /* renamed from: e */
    public static final C33813b f173588e;

    static {
        C58872c0 c0Var = new C58872c0("LOCKED");
        f173585b = c0Var;
        C58872c0 c0Var2 = new C58872c0("UNLOCKED");
        f173586c = c0Var2;
        f173587d = new C33813b(c0Var);
        f173588e = new C33813b(c0Var2);
    }

    /* renamed from: a */
    public static C99088c m71437a(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return new C60942d(z);
    }
}
