package p172io.flutter.util;

/* renamed from: io.flutter.util.Preconditions */
public final class Preconditions {
    private Preconditions() {
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
