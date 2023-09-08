package tk0;

import java.util.UUID;

/* renamed from: tk0.a */
public final class C90508a {
    /* renamed from: a */
    public static UUID m113330a(String str) {
        int length = str.length();
        if (length == 4) {
            str = "0000" + str + "-0000-1000-8000-00805F9B34FB";
        } else if (length == 8) {
            str = str + "-0000-1000-8000-00805F9B34FB";
        } else if (length != 36) {
            throw new IllegalArgumentException("Invalid UUID name: " + str);
        }
        return UUID.fromString(str);
    }
}
