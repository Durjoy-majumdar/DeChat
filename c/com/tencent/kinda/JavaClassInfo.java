package com.tencent.kinda;

public class JavaClassInfo {
    public static String TAG = "JavaClassInfo";

    public static String getClassName(Object obj) {
        if (obj == null) {
            return "";
        }
        return "simple " + obj.toString();
    }

    public static String getFullClassName(Object obj) {
        return obj == null ? "" : obj.toString();
    }
}
