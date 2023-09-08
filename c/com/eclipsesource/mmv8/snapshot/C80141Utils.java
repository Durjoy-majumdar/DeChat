package com.eclipsesource.mmv8.snapshot;

/* renamed from: com.eclipsesource.mmv8.snapshot.Utils */
public class C80141Utils {
    private C80141Utils() {
    }

    public static boolean isInvalidFd(int i) {
        return i < 0;
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
