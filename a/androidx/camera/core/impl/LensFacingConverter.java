package androidx.camera.core.impl;

public class LensFacingConverter {
    private LensFacingConverter() {
    }

    public static String nameOf(int i) {
        if (i == 0) {
            return "FRONT";
        }
        if (i == 1) {
            return "BACK";
        }
        throw new IllegalArgumentException("Unknown lens facing " + i);
    }

    public static int valueOf(String str) {
        if (str == null) {
            throw new NullPointerException("name cannot be null");
        } else if (str.equals("BACK")) {
            return 1;
        } else {
            if (str.equals("FRONT")) {
                return 0;
            }
            throw new IllegalArgumentException("Unknown len facing name " + str);
        }
    }

    public static Integer[] values() {
        return new Integer[]{0, 1};
    }
}
