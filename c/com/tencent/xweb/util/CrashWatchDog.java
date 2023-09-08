package com.tencent.xweb.util;

import android.content.SharedPreferences;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.WebDebugCfg;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.util.WXWebReporter;
import java.util.Date;

public class CrashWatchDog {
    public static final String SCENE_CREATE_WEBVIEW = "CREATE_WEBVIEW";
    public static final String SCENE_LOAD_CORE = "LOAD_CORE";
    private static final String TAG = "CrashWatchDog";
    private static final String _INIT_END_TIME = "INIT_END_TIME";
    private static final String _INIT_SP_TAG = "INIT_SP_TAG_";
    private static final String _INIT_START_TIME = "INIT_START_TIME";
    private static final String _INIT_TRY_COUNT = "INIT_TRY_COUNT";
    private boolean mBHasLogged = false;
    private long mNCurCurTryCount;
    private long mNLastEndTime;
    private long mNLastStartTime;
    private SharedPreferences mSp;
    private String mStrEndTimeTag;
    private String mStrScene;
    private String mStrStartTimeTag;
    private String mStrTryCountTag;

    private CrashWatchDog(String str, WebView.WebViewKind webViewKind) {
        SharedPreferences spForInitLog = getSpForInitLog(str, webViewKind);
        this.mSp = spForInitLog;
        if (spForInitLog == null) {
            XWebLog.m21913w(TAG, "CrashWatchDog, scene:" + str + ", kind:" + webViewKind + ", invalid shared preference");
            return;
        }
        this.mStrStartTimeTag = _INIT_START_TIME + str;
        this.mStrEndTimeTag = _INIT_END_TIME + str;
        this.mStrTryCountTag = _INIT_TRY_COUNT + str;
        this.mStrScene = str;
        this.mNLastStartTime = this.mSp.getLong(this.mStrStartTimeTag, 0);
        this.mNLastEndTime = this.mSp.getLong(this.mStrEndTimeTag, 0);
        this.mNCurCurTryCount = this.mSp.getLong(this.mStrTryCountTag, 0);
        XWebLog.m21911i(TAG, "CrashWatchDog, scene:" + str + ", startTime:" + getHumanReadableTime(this.mNLastStartTime) + ", endTime:" + getHumanReadableTime(this.mNLastEndTime) + ", count:" + this.mNCurCurTryCount);
    }

    private static String createKey(String str, WebView.WebViewKind webViewKind) {
        return _INIT_SP_TAG + webViewKind.toString() + "_" + str;
    }

    private String getHumanReadableTime(long j) {
        return j <= 0 ? "0" : new Date(j).toLocaleString();
    }

    public static synchronized CrashWatchDog getInstance(String str, WebView.WebViewKind webViewKind) {
        CrashWatchDog crashWatchDog;
        synchronized (CrashWatchDog.class) {
            crashWatchDog = new CrashWatchDog(str, webViewKind);
        }
        return crashWatchDog;
    }

    public static synchronized CrashWatchDog getInstanceForCurModule(String str, WebView.WebViewKind webViewKind) {
        CrashWatchDog instanceForModule;
        synchronized (CrashWatchDog.class) {
            instanceForModule = getInstanceForModule(str, webViewKind, WebView.getModuleName());
        }
        return instanceForModule;
    }

    public static synchronized CrashWatchDog getInstanceForModule(String str, WebView.WebViewKind webViewKind, String str2) {
        CrashWatchDog instance;
        synchronized (CrashWatchDog.class) {
            instance = getInstance(str + "_" + str2, webViewKind);
        }
        return instance;
    }

    private static synchronized SharedPreferences getSpForInitLog(String str, WebView.WebViewKind webViewKind) {
        synchronized (CrashWatchDog.class) {
            if (webViewKind != WebView.WebViewKind.WV_KIND_PINUS) {
                return null;
            }
            SharedPreferences mMKVSharedPreferencesTransportOld = XWebSharedPreferenceUtil.getMMKVSharedPreferencesTransportOld(createKey(str, webViewKind));
            return mMKVSharedPreferencesTransportOld;
        }
    }

    private int getThresholdCount() {
        return CommandCfg.getInstance().getCmdAsInt(CommandDef.COMMAND_CRASH_WATCH_COUNT, WebView.getModuleName(), 4);
    }

    private int getThresholdTime() {
        return CommandCfg.getInstance().getCmdAsInt(CommandDef.COMMAND_CRASH_WATCH_TIME, WebView.getModuleName(), 180) * 60 * 1000;
    }

    public static synchronized boolean hasRecentCrash(WebView.WebViewKind webViewKind, String str) {
        synchronized (CrashWatchDog.class) {
            if (WebDebugCfg.getInst().getIgnoreCrash()) {
                return false;
            }
            if (getInstanceForModule(SCENE_LOAD_CORE, webViewKind, str).hasRecentCrashInternal()) {
                XWebLog.m21911i(TAG, "hasRecentCrash, SCENE_LOAD_CORE, module:" + str + ", kind:" + webViewKind);
                WXWebReporter.onUseCoreFailed(webViewKind, WXWebReporter.KVDef.KVXwebInitCoreFailed.ERRTYPE_LOADCORE);
                return true;
            } else if (!getInstanceForModule(SCENE_CREATE_WEBVIEW, webViewKind, str).hasRecentCrashInternal()) {
                return false;
            } else {
                XWebLog.m21911i(TAG, "hasRecentCrash, SCENE_CREATE_WEBVIEW, module:" + str + ", kind:" + webViewKind);
                WXWebReporter.onUseCoreFailed(webViewKind, WXWebReporter.KVDef.KVXwebInitCoreFailed.ERRTYPE_NEW_INSTANCE);
                return true;
            }
        }
    }

    private synchronized boolean hasRecentCrashInternal() {
        if (this.mSp == null) {
            XWebLog.m21913w(TAG, "hasRecentCrashInternal, invalid shared preference");
            return false;
        } else if (!startButNoEnd(new Date().getTime())) {
            XWebLog.m21911i(TAG, "hasRecentCrashInternal, startButNoEnd returns false");
            return false;
        } else if (this.mNCurCurTryCount > ((long) getThresholdCount())) {
            XWebLog.addInitializeLog(TAG, "scene:" + this.mStrScene + ", crashedTime:" + getHumanReadableTime(this.mNLastStartTime) + ", count:" + this.mNCurCurTryCount);
            return true;
        } else {
            XWebLog.m21911i(TAG, "hasRecentCrashInternal, return false, count:" + this.mNCurCurTryCount);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean startButNoEnd(long r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "CrashWatchDog"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "startButNoEnd, startTime:"
            r1.append(r2)     // Catch:{ all -> 0x0066 }
            long r2 = r8.mNLastStartTime     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = r8.getHumanReadableTime(r2)     // Catch:{ all -> 0x0066 }
            r1.append(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = ", endTime:"
            r1.append(r2)     // Catch:{ all -> 0x0066 }
            long r2 = r8.mNLastEndTime     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = r8.getHumanReadableTime(r2)     // Catch:{ all -> 0x0066 }
            r1.append(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = ", currentTime:"
            r1.append(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = r8.getHumanReadableTime(r9)     // Catch:{ all -> 0x0066 }
            r1.append(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0066 }
            com.tencent.xweb.util.XWebLog.m21911i(r0, r1)     // Catch:{ all -> 0x0066 }
            long r0 = r8.mNLastStartTime     // Catch:{ all -> 0x0066 }
            r2 = 0
            r4 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0043
            monitor-exit(r8)
            return r4
        L_0x0043:
            long r5 = r8.mNLastEndTime     // Catch:{ all -> 0x0066 }
            long r5 = r5 - r0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0064
            long r9 = r9 - r0
            long r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0066 }
            int r0 = r8.getThresholdTime()     // Catch:{ all -> 0x0066 }
            long r0 = (long) r0     // Catch:{ all -> 0x0066 }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0059
            goto L_0x0064
        L_0x0059:
            long r9 = r8.mNLastEndTime     // Catch:{ all -> 0x0066 }
            long r0 = r8.mNLastStartTime     // Catch:{ all -> 0x0066 }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0062
            r4 = 1
        L_0x0062:
            monitor-exit(r8)
            return r4
        L_0x0064:
            monitor-exit(r8)
            return r4
        L_0x0066:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.CrashWatchDog.startButNoEnd(long):boolean");
    }

    public long getRetryCount() {
        return this.mNCurCurTryCount;
    }

    public synchronized void logFinished() {
        if (this.mSp == null) {
            XWebLog.m21913w(TAG, "logFinished, invalid shared preference");
            return;
        }
        long time = new Date().getTime();
        XWebLog.m21911i(TAG, "logFinished, endTime:" + getHumanReadableTime(time));
        SharedPreferences.Editor edit = this.mSp.edit();
        edit.putLong(this.mStrEndTimeTag, time);
        edit.putLong(this.mStrTryCountTag, 0);
        edit.commit();
        this.mSp = null;
    }

    public synchronized void logStart() {
        SharedPreferences sharedPreferences = this.mSp;
        if (sharedPreferences == null) {
            XWebLog.m21913w(TAG, "logStart, invalid shared preference");
        } else if (this.mBHasLogged) {
            XWebLog.m21913w(TAG, "logStart, already start");
        } else {
            this.mBHasLogged = true;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            long j = this.mNCurCurTryCount + 1;
            edit.putLong(this.mStrTryCountTag, j);
            long time = new Date().getTime();
            if (startButNoEnd(time)) {
                XWebLog.m21911i(TAG, "logStart, startButNoEnd returns true, currentTime:" + getHumanReadableTime(time) + ", count:" + j);
                edit.commit();
                return;
            }
            XWebLog.m21911i(TAG, "logStart, startTime:" + getHumanReadableTime(time) + ", count:" + j);
            edit.putLong(this.mStrStartTimeTag, time);
            edit.commit();
        }
    }

    public static synchronized boolean hasRecentCrash(WebView.WebViewKind webViewKind) {
        synchronized (CrashWatchDog.class) {
            if (WebDebugCfg.getInst().getIgnoreCrash()) {
                return false;
            }
            if (getInstanceForCurModule(SCENE_LOAD_CORE, webViewKind).hasRecentCrashInternal()) {
                XWebLog.m21911i(TAG, "hasRecentCrash, SCENE_LOAD_CORE, module:" + WebView.getModuleName() + ", kind:" + webViewKind);
                WXWebReporter.onUseCoreFailed(webViewKind, WXWebReporter.KVDef.KVXwebInitCoreFailed.ERRTYPE_LOADCORE);
                return true;
            } else if (!getInstanceForCurModule(SCENE_CREATE_WEBVIEW, webViewKind).hasRecentCrashInternal()) {
                return false;
            } else {
                XWebLog.m21911i(TAG, "hasRecentCrash, SCENE_CREATE_WEBVIEW, module:" + WebView.getModuleName() + ", kind:" + webViewKind);
                WXWebReporter.onUseCoreFailed(webViewKind, WXWebReporter.KVDef.KVXwebInitCoreFailed.ERRTYPE_NEW_INSTANCE);
                return true;
            }
        }
    }
}
