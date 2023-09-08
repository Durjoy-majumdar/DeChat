package com.tencent.xweb;

import com.tencent.xweb.util.XWebLog;
import java.util.ArrayList;
import java.util.List;

public class XWebPreferences {
    public static final String TAG = "XWebPreferences";
    private static final List<XWebPreferencesListener> sListeners = new ArrayList();
    private static IXWebPreferences sWebPreferences;

    public interface XWebPreferencesListener {
        void onWebPreferencesReady();
    }

    public static boolean getBooleanValue(String str) {
        IXWebPreferences iXWebPreferences = sWebPreferences;
        if (iXWebPreferences != null) {
            return iXWebPreferences.getBooleanValue(str);
        }
        XWebLog.m21913w(TAG, "getBooleanValue, web preferences not set, key:" + str);
        return false;
    }

    public static int getIntegerValue(String str) {
        IXWebPreferences iXWebPreferences = sWebPreferences;
        if (iXWebPreferences != null) {
            return iXWebPreferences.getIntegerValue(str);
        }
        XWebLog.m21913w(TAG, "getIntegerValue, web preferences not set, key:" + str);
        return 0;
    }

    public static String getStringValue(String str) {
        IXWebPreferences iXWebPreferences = sWebPreferences;
        if (iXWebPreferences != null) {
            return iXWebPreferences.getStringValue(str);
        }
        XWebLog.m21913w(TAG, "getStringValue, web preferences not set, key:" + str);
        return null;
    }

    public static boolean getValue(String str) {
        IXWebPreferences iXWebPreferences = sWebPreferences;
        if (iXWebPreferences != null) {
            return iXWebPreferences.getValue(str);
        }
        XWebLog.m21913w(TAG, "getValue, web preferences not set, key:" + str);
        return false;
    }

    public static boolean isReady() {
        return sWebPreferences != null;
    }

    public static void registerWebPreferencesListener(XWebPreferencesListener xWebPreferencesListener) {
        if (xWebPreferencesListener != null) {
            sListeners.add(xWebPreferencesListener);
        }
    }

    public static void setValue(String str, boolean z) {
        IXWebPreferences iXWebPreferences = sWebPreferences;
        if (iXWebPreferences != null) {
            iXWebPreferences.setValue(str, z);
            return;
        }
        XWebLog.m21913w(TAG, "setValue, web preferences not set, key:" + str);
    }

    public static void setWebPreferences(IXWebPreferences iXWebPreferences) {
        XWebLog.m21911i(TAG, "setWebPreferences:" + iXWebPreferences);
        sWebPreferences = iXWebPreferences;
        List<XWebPreferencesListener> list = sListeners;
        if (!list.isEmpty()) {
            for (XWebPreferencesListener onWebPreferencesReady : list) {
                onWebPreferencesReady.onWebPreferencesReady();
            }
        }
    }

    public static void unregisterWebPreferencesListener(XWebPreferencesListener xWebPreferencesListener) {
        if (xWebPreferencesListener != null) {
            sListeners.remove(xWebPreferencesListener);
        }
    }

    public static void setValue(String str, int i) {
        IXWebPreferences iXWebPreferences = sWebPreferences;
        if (iXWebPreferences != null) {
            iXWebPreferences.setValue(str, i);
            return;
        }
        XWebLog.m21913w(TAG, "setValue, web preferences not set, key:" + str);
    }

    public static void setValue(String str, String str2) {
        IXWebPreferences iXWebPreferences = sWebPreferences;
        if (iXWebPreferences != null) {
            iXWebPreferences.setValue(str, str2);
            return;
        }
        XWebLog.m21913w(TAG, "setValue, web preferences not set, key:" + str);
    }
}
