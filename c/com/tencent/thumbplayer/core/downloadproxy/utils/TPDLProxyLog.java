package com.tencent.thumbplayer.core.downloadproxy.utils;

import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;

public class TPDLProxyLog {
    private static ITPDLProxyLogListener mLogListener;
    private static int mServiceType;

    /* renamed from: d */
    public static void m21864d(String str, int i, String str2, String str3) {
        ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.mo28881d(str, i, str2, str3);
        }
    }

    /* renamed from: e */
    public static void m21865e(String str, int i, String str2, String str3) {
        ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.mo28882e(str, i, str2, str3);
        }
    }

    /* renamed from: i */
    public static void m21866i(String str, int i, String str2, String str3) {
        ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.mo28883i(str, i, str2, str3);
        }
    }

    public static void setLogListener(int i, ITPDLProxyLogListener iTPDLProxyLogListener) {
        mServiceType = i;
        mLogListener = iTPDLProxyLogListener;
    }

    /* renamed from: w */
    public static void m21867w(String str, int i, String str2, String str3) {
        ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.mo28884w(str, i, str2, str3);
        }
    }
}
