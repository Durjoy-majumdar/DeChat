package tc2;

import java.util.UUID;

/* renamed from: tc2.f */
public final class C77890f {
    /* renamed from: a */
    public static String m94019a(int i) {
        StringBuilder sb = new StringBuilder();
        if (i == 1) {
            sb.append("Register");
        } else if (i == 2) {
            sb.append("Login");
        } else if (i != 3) {
            sb.append("Unknown");
        } else {
            sb.append("VerifyUser");
        }
        sb.append("_");
        sb.append(UUID.randomUUID().toString());
        return sb.toString();
    }
}
