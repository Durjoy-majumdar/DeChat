package com.tencent.skyline;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006J$\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0018\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006J$\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0018\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0018\u0010\u0010\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/skyline/SkylineLog;", "", "Lcom/tencent/skyline/ISkylineLog;", "cb", "Lrx3/b0;", "initLogCallBack", "", "tag", "msg", "f", "", "tr", "e", "w", "i", "d", "v", "mLogCallback", "Lcom/tencent/skyline/ISkylineLog;", "<init>", "()V", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class SkylineLog {
    public static final SkylineLog INSTANCE = new SkylineLog();
    private static ISkylineLog mLogCallback;

    private SkylineLog() {
    }

    /* renamed from: d */
    public final void mo120222d(String str, String str2) {
        C87412m.m108594g(str2, "msg");
        ISkylineLog iSkylineLog = mLogCallback;
        if (iSkylineLog != null) {
            C87412m.m108591d(iSkylineLog);
            iSkylineLog.mo56459d(str, str2);
        }
    }

    /* renamed from: e */
    public final void mo120224e(String str, String str2, Throwable th) {
        ISkylineLog iSkylineLog = mLogCallback;
        if (iSkylineLog != null) {
            C87412m.m108591d(iSkylineLog);
            iSkylineLog.mo56460e(str, str2);
        }
    }

    /* renamed from: f */
    public final void mo120225f(String str, String str2) {
        C87412m.m108594g(str2, "msg");
        ISkylineLog iSkylineLog = mLogCallback;
        if (iSkylineLog != null) {
            C87412m.m108591d(iSkylineLog);
            iSkylineLog.mo56460e(str, str2);
        }
    }

    /* renamed from: i */
    public final void mo120226i(String str, String str2) {
        C87412m.m108594g(str2, "msg");
        ISkylineLog iSkylineLog = mLogCallback;
        if (iSkylineLog != null) {
            C87412m.m108591d(iSkylineLog);
            iSkylineLog.mo56461i(str, str2);
        }
    }

    public final void initLogCallBack(ISkylineLog iSkylineLog) {
        mLogCallback = iSkylineLog;
    }

    /* renamed from: v */
    public final void mo120228v(String str, String str2) {
        C87412m.m108594g(str2, "msg");
        ISkylineLog iSkylineLog = mLogCallback;
        if (iSkylineLog != null) {
            C87412m.m108591d(iSkylineLog);
            iSkylineLog.mo56462v(str, str2);
        }
    }

    /* renamed from: w */
    public final void mo120229w(String str, String str2) {
        C87412m.m108594g(str2, "msg");
        ISkylineLog iSkylineLog = mLogCallback;
        if (iSkylineLog != null) {
            C87412m.m108591d(iSkylineLog);
            iSkylineLog.mo56463w(str, str2);
        }
    }

    /* renamed from: e */
    public final void mo120223e(String str, String str2) {
        C87412m.m108594g(str2, "msg");
        ISkylineLog iSkylineLog = mLogCallback;
        if (iSkylineLog != null) {
            C87412m.m108591d(iSkylineLog);
            iSkylineLog.mo56460e(str, str2);
        }
    }

    /* renamed from: w */
    public final void mo120230w(String str, String str2, Throwable th) {
        ISkylineLog iSkylineLog = mLogCallback;
        if (iSkylineLog != null) {
            C87412m.m108591d(iSkylineLog);
            iSkylineLog.mo56463w(str, str2);
        }
    }
}
