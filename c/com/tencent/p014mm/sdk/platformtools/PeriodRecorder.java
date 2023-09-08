package com.tencent.p014mm.sdk.platformtools;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.sdk.platformtools.PeriodRecorder */
public final class PeriodRecorder {
    private static final String CLIENT_VERSION_KEY = "ik_last_client_version";
    private static final String EXTERNAL_KEY_PREFIX = "ek_";
    private static final String INTERNAL_KEY_PREFIX = "ik_";
    private static final String TAG = "MicroMsg.PeriodRecorder";
    private volatile boolean mIsPreloaded;
    private final Map<String, Long> mLastTimeCache;
    private long mPeriod;
    private byte[] mPreloadLock;
    private final boolean mResetOnUpgrade;
    private final boolean[] mResetOnUpgradeDoubleTriggerBlocker;
    private final String mScene;
    private SharedPreferences mStorage;
    private final String mStorageName;
    private final boolean mTriggerOnFirstTime;
    private final boolean mUseCalenderTime;

    public PeriodRecorder(String str, long j, boolean z) {
        this(str, j, z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void ensureInitialized() {
        /*
            r6 = this;
            monitor-enter(r6)
            android.content.SharedPreferences r0 = r6.mStorage     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r6)
            return
        L_0x0007:
            r0 = 0
            java.lang.String r1 = r6.mStorageName     // Catch:{ all -> 0x0011 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKVWithTransportByName(r1)     // Catch:{ all -> 0x0011 }
            r6.mStorage = r1     // Catch:{ all -> 0x0011 }
            goto L_0x0036
        L_0x0011:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.PeriodRecorder"
            java.lang.String r3 = "exception happened."
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x007f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r4)     // Catch:{ all -> 0x007f }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = r6.mStorageName     // Catch:{ all -> 0x0029 }
            r3 = 4
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x0029 }
            r6.mStorage = r1     // Catch:{ all -> 0x0029 }
            goto L_0x0036
        L_0x0029:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.PeriodRecorder"
            java.lang.String r3 = "fail to get sharedpreferences, disable PeriodRecorder."
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x007f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r4)     // Catch:{ all -> 0x007f }
            r1 = 0
            r6.mStorage = r1     // Catch:{ all -> 0x007f }
        L_0x0036:
            android.content.SharedPreferences r1 = r6.mStorage     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x007d
            boolean r2 = r6.mResetOnUpgrade     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x007d
            java.lang.String r2 = "ik_last_client_version"
            int r1 = r1.getInt(r2, r0)     // Catch:{ all -> 0x007f }
            int r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT     // Catch:{ all -> 0x007f }
            if (r1 == r2) goto L_0x007d
            java.lang.String r1 = "MicroMsg.PeriodRecorder"
            java.lang.String r2 = "Client version changed, reset all keys in '%s'"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x007f }
            java.lang.String r5 = r6.mStorageName     // Catch:{ all -> 0x007f }
            r4[r0] = r5     // Catch:{ all -> 0x007f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)     // Catch:{ all -> 0x007f }
            boolean[] r1 = r6.mResetOnUpgradeDoubleTriggerBlocker     // Catch:{ all -> 0x007f }
            monitor-enter(r1)     // Catch:{ all -> 0x007f }
            boolean[] r2 = r6.mResetOnUpgradeDoubleTriggerBlocker     // Catch:{ all -> 0x007a }
            boolean r2 = r2[r0]     // Catch:{ all -> 0x007a }
            if (r2 != 0) goto L_0x0078
            android.content.SharedPreferences r2 = r6.mStorage     // Catch:{ all -> 0x007a }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x007a }
            android.content.SharedPreferences$Editor r2 = r2.clear()     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "ik_last_client_version"
            int r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT     // Catch:{ all -> 0x007a }
            android.content.SharedPreferences$Editor r2 = r2.putInt(r4, r5)     // Catch:{ all -> 0x007a }
            r2.apply()     // Catch:{ all -> 0x007a }
            boolean[] r2 = r6.mResetOnUpgradeDoubleTriggerBlocker     // Catch:{ all -> 0x007a }
            r2[r0] = r3     // Catch:{ all -> 0x007a }
        L_0x0078:
            monitor-exit(r1)     // Catch:{ all -> 0x007a }
            goto L_0x007d
        L_0x007a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007a }
            throw r0     // Catch:{ all -> 0x007f }
        L_0x007d:
            monitor-exit(r6)
            return
        L_0x007f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.PeriodRecorder.ensureInitialized():void");
    }

    private String getDecoratedExternalKey(String str) {
        return EXTERNAL_KEY_PREFIX + str;
    }

    private long getNowTime() {
        return this.mUseCalenderTime ? System.currentTimeMillis() : SystemClock.elapsedRealtime();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0091, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void preloadOnDemand() {
        /*
            r11 = this;
            byte[] r0 = r11.mPreloadLock
            monitor-enter(r0)
            boolean r1 = r11.mIsPreloaded     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x0090
            android.content.SharedPreferences r1 = r11.mStorage     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x000d
            goto L_0x0090
        L_0x000d:
            boolean r2 = r1 instanceof com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x004f
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r1     // Catch:{ all -> 0x0092 }
            java.lang.String[] r1 = r1.allKeys()     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x001b
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            return
        L_0x001b:
            int r2 = r1.length     // Catch:{ all -> 0x0092 }
            r3 = 0
            r4 = 0
        L_0x001e:
            if (r4 >= r2) goto L_0x008b
            r5 = r1[r4]     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = "ek_"
            boolean r6 = r5.startsWith(r6)     // Catch:{ all -> 0x0092 }
            if (r6 != 0) goto L_0x002b
            goto L_0x004c
        L_0x002b:
            android.content.SharedPreferences r6 = r11.mStorage     // Catch:{ all -> 0x0042 }
            r7 = 0
            long r9 = r6.getLong(r5, r7)     // Catch:{ all -> 0x0042 }
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0038
            goto L_0x004c
        L_0x0038:
            java.util.Map<java.lang.String, java.lang.Long> r6 = r11.mLastTimeCache     // Catch:{ all -> 0x0042 }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0042 }
            r6.put(r5, r7)     // Catch:{ all -> 0x0042 }
            goto L_0x004c
        L_0x0042:
            r5 = move-exception
            java.lang.String r6 = "MicroMsg.PeriodRecorder"
            java.lang.String r7 = "exception occurred."
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ all -> 0x0092 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r5, r7, r8)     // Catch:{ all -> 0x0092 }
        L_0x004c:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x004f:
            java.util.Map r1 = r1.getAll()     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x0057
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            return
        L_0x0057:
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0092 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0092 }
        L_0x005f:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x008b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0092 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0092 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = "ek_"
            boolean r4 = r3.startsWith(r4)     // Catch:{ all -> 0x0092 }
            if (r4 != 0) goto L_0x007a
            goto L_0x005f
        L_0x007a:
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0092 }
            boolean r4 = r2 instanceof java.lang.Long     // Catch:{ all -> 0x0092 }
            if (r4 != 0) goto L_0x0083
            goto L_0x005f
        L_0x0083:
            java.util.Map<java.lang.String, java.lang.Long> r4 = r11.mLastTimeCache     // Catch:{ all -> 0x0092 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0092 }
            r4.put(r3, r2)     // Catch:{ all -> 0x0092 }
            goto L_0x005f
        L_0x008b:
            r1 = 1
            r11.mIsPreloaded = r1     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            return
        L_0x0090:
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            return
        L_0x0092:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.PeriodRecorder.preloadOnDemand():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (((r4 % r6) + r2) > r6) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isExpired(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r9.ensureInitialized()     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences r0 = r9.mStorage     // Catch:{ all -> 0x00a2 }
            r1 = 0
            if (r0 != 0) goto L_0x0012
            java.lang.String r10 = "MicroMsg.PeriodRecorder"
            java.lang.String r0 = "PeriodRecorder is disabled."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r9)
            return r1
        L_0x0012:
            if (r10 == 0) goto L_0x009a
            r9.preloadOnDemand()     // Catch:{ all -> 0x00a2 }
            long r2 = r9.getNowTime()     // Catch:{ all -> 0x00a2 }
            java.lang.String r10 = r9.getDecoratedExternalKey(r10)     // Catch:{ all -> 0x00a2 }
            java.util.Map<java.lang.String, java.lang.Long> r0 = r9.mLastTimeCache     // Catch:{ all -> 0x00a2 }
            boolean r0 = r0.containsKey(r10)     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x0041
            java.util.Map<java.lang.String, java.lang.Long> r0 = r9.mLastTimeCache     // Catch:{ all -> 0x00a2 }
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00a2 }
            r0.put(r10, r1)     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences r0 = r9.mStorage     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences$Editor r10 = r0.putLong(r10, r2)     // Catch:{ all -> 0x00a2 }
            r10.apply()     // Catch:{ all -> 0x00a2 }
            boolean r10 = r9.mTriggerOnFirstTime     // Catch:{ all -> 0x00a2 }
            monitor-exit(r9)
            return r10
        L_0x0041:
            java.util.Map<java.lang.String, java.lang.Long> r0 = r9.mLastTimeCache     // Catch:{ all -> 0x00a2 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x00a2 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00a2 }
            long r4 = r0.longValue()     // Catch:{ all -> 0x00a2 }
            r0 = 1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0077
            boolean r6 = r9.mUseCalenderTime     // Catch:{ all -> 0x00a2 }
            if (r6 == 0) goto L_0x006d
            java.util.Map<java.lang.String, java.lang.Long> r0 = r9.mLastTimeCache     // Catch:{ all -> 0x00a2 }
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00a2 }
            r0.put(r10, r4)     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences r0 = r9.mStorage     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r10, r2)     // Catch:{ all -> 0x00a2 }
            r0.apply()     // Catch:{ all -> 0x00a2 }
            goto L_0x0080
        L_0x006d:
            long r6 = r9.mPeriod     // Catch:{ all -> 0x00a2 }
            long r4 = r4 % r6
            long r4 = r4 + r2
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0080
        L_0x0075:
            r1 = 1
            goto L_0x0080
        L_0x0077:
            long r4 = r2 - r4
            long r6 = r9.mPeriod     // Catch:{ all -> 0x00a2 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0080
            goto L_0x0075
        L_0x0080:
            if (r1 == 0) goto L_0x0098
            java.util.Map<java.lang.String, java.lang.Long> r0 = r9.mLastTimeCache     // Catch:{ all -> 0x00a2 }
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00a2 }
            r0.put(r10, r4)     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences r0 = r9.mStorage     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x00a2 }
            android.content.SharedPreferences$Editor r10 = r0.putLong(r10, r2)     // Catch:{ all -> 0x00a2 }
            r10.apply()     // Catch:{ all -> 0x00a2 }
        L_0x0098:
            monitor-exit(r9)
            return r1
        L_0x009a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "key is null."
            r10.<init>(r0)     // Catch:{ all -> 0x00a2 }
            throw r10     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.PeriodRecorder.isExpired(java.lang.String):boolean");
    }

    public PeriodRecorder(String str, long j, boolean z, boolean z2) {
        this(str, j, z, z2, false);
    }

    public PeriodRecorder(String str, long j, boolean z, boolean z2, boolean z3) {
        this.mResetOnUpgradeDoubleTriggerBlocker = new boolean[]{false};
        this.mPeriod = 0;
        this.mPreloadLock = new byte[0];
        this.mIsPreloaded = false;
        if (str != null) {
            this.mScene = str;
            this.mUseCalenderTime = z;
            StringBuilder sb = new StringBuilder();
            sb.append("prm_");
            sb.append(str);
            sb.append("_");
            sb.append(j);
            sb.append(z ? "_c" : "");
            this.mStorageName = sb.toString();
            this.mLastTimeCache = new ConcurrentHashMap(20);
            this.mPeriod = j;
            this.mTriggerOnFirstTime = z2;
            this.mResetOnUpgrade = z3;
            return;
        }
        throw new IllegalArgumentException("scene is null.");
    }
}
