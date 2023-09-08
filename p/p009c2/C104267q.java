package p009c2;

/* renamed from: c2.q */
public final class C104267q {
    /* renamed from: a */
    public static String m139164a(int i) {
        boolean z = false;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Characters";
        }
        if (i == 2) {
            return "Words";
        }
        if (i == 3) {
            z = true;
        }
        return z ? "Sentences" : "Invalid";
    }
}
