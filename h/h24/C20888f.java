package h24;

/* renamed from: h24.f */
public final class C20888f {
    /* renamed from: a */
    public static boolean m22971a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m22972b(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }
}
