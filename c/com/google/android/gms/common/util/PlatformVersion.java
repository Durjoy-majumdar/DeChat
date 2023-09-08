package com.google.android.gms.common.util;

import android.os.Build;

public final class PlatformVersion {
    private PlatformVersion() {
    }

    public static boolean isAtLeastFroyo() {
        return true;
    }

    public static boolean isAtLeastGingerbread() {
        return true;
    }

    public static boolean isAtLeastGingerbreadMR1() {
        return true;
    }

    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    public static boolean isAtLeastHoneycombMR2() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    public static boolean isAtLeastJellyBean() {
        return true;
    }

    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @Deprecated
    public static boolean isAtLeastKeyLimePie() {
        return isAtLeastKitKat();
    }

    public static boolean isAtLeastKitKat() {
        return true;
    }

    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @Deprecated
    public static boolean isAtLeastL() {
        return isAtLeastLollipop();
    }

    public static boolean isAtLeastLollipop() {
        return true;
    }

    public static boolean isAtLeastLollipopMR1() {
        return Build.VERSION.SDK_INT >= 22;
    }

    public static boolean isAtLeastM() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean isAtLeastN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean isAtLeastNMR1() {
        return Build.VERSION.SDK_INT >= 25;
    }

    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
