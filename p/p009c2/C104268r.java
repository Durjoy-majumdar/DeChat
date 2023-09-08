package p009c2;

/* renamed from: c2.r */
public final class C104268r {
    /* renamed from: a */
    public static String m139165a(int i) {
        boolean z = false;
        if (i == 1) {
            return "Text";
        }
        if (i == 2) {
            return "Ascii";
        }
        if (i == 3) {
            return "Number";
        }
        if (i == 4) {
            return "Phone";
        }
        if (i == 5) {
            return "Uri";
        }
        if (i == 6) {
            return "Email";
        }
        if (i == 7) {
            return "Password";
        }
        if (i == 8) {
            return "NumberPassword";
        }
        if (i == 9) {
            z = true;
        }
        return z ? "Decimal" : "Invalid";
    }
}
