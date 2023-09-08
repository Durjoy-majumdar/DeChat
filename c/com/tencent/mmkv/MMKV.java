package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import j20.C117292a;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import k20.C9556a;
import tr3.C22545a;
import tr3.C22546b;
import tr3.C22547c;
import tr3.C22548d;
import tr3.C22549e;

public class MMKV implements SharedPreferences, SharedPreferences.Editor {
    private static final int ASHMEM_MODE = 8;
    private static final int BACKUP_MODE = 16;
    private static final int CONTEXT_MODE_MULTI_PROCESS = 4;
    public static final int MULTI_PROCESS_MODE = 2;
    public static final int SINGLE_PROCESS_MODE = 1;
    private static final Set<Long> checkedHandleSet = new HashSet();
    private static C22546b gCallbackHandler;
    private static C22545a gContentChangeNotify;
    private static boolean gWantLogReDirecting = false;
    private static final C22547c[] index2LogLevel;
    private static boolean isProcessModeCheckerEnabled = true;
    private static final EnumMap<C22547c, Integer> logLevel2Index;
    private static final HashMap<String, Parcelable.Creator<?>> mCreators = new HashMap<>();
    private static final EnumMap<C22548d, Integer> recoverIndex;
    private static String rootDir = null;
    private byte _hellAccFlag_;
    private final long nativeHandle;

    /* renamed from: com.tencent.mmkv.MMKV$a */
    public interface C19915a {
        void loadLibrary(String str);
    }

    static {
        EnumMap<C22548d, Integer> enumMap = new EnumMap<>(C22548d.class);
        recoverIndex = enumMap;
        enumMap.put(C22548d.OnErrorDiscard, 0);
        enumMap.put(C22548d.OnErrorRecover, 1);
        EnumMap<C22547c, Integer> enumMap2 = new EnumMap<>(C22547c.class);
        logLevel2Index = enumMap2;
        C22547c cVar = C22547c.LevelDebug;
        enumMap2.put(cVar, 0);
        C22547c cVar2 = C22547c.LevelInfo;
        enumMap2.put(cVar2, 1);
        C22547c cVar3 = C22547c.LevelWarning;
        enumMap2.put(cVar3, 2);
        C22547c cVar4 = C22547c.LevelError;
        enumMap2.put(cVar4, 3);
        C22547c cVar5 = C22547c.LevelNone;
        enumMap2.put(cVar5, 4);
        index2LogLevel = new C22547c[]{cVar, cVar2, cVar3, cVar4, cVar5};
    }

    private MMKV(long j) {
        this.nativeHandle = j;
    }

    private native long actualSize(long j);

    public static MMKV backedUpMMKVWithID(String str, int i, String str2, String str3) {
        if (rootDir != null) {
            int i2 = i | 16;
            return checkProcessMode(getMMKVWithID(str, i2, str2, str3), str, i2);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, String str3);

    private static MMKV checkProcessMode(long j, String str, int i) {
        String str2;
        if (j == 0) {
            throw new RuntimeException("Fail to create an MMKV instance [" + str + "] in JNI");
        } else if (!isProcessModeCheckerEnabled) {
            return new MMKV(j);
        } else {
            Set<Long> set = checkedHandleSet;
            synchronized (set) {
                if (!set.contains(Long.valueOf(j))) {
                    if (!checkProcessMode(j)) {
                        if (i == 1) {
                            str2 = "Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!";
                        } else {
                            str2 = ("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ") + "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!";
                        }
                        throw new IllegalArgumentException(str2);
                    }
                    set.add(Long.valueOf(j));
                }
            }
            return new MMKV(j);
        }
    }

    private static native boolean checkProcessMode(long j);

    private native boolean containsKey(long j, String str);

    private native long count(long j);

    private static native long createNB(int i);

    public static C22549e createNativeBuffer(int i) {
        long createNB = createNB(i);
        if (createNB <= 0) {
            return null;
        }
        return new C22549e(createNB, i);
    }

    private native boolean decodeBool(long j, String str, boolean z);

    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d);

    private native float decodeFloat(long j, String str, float f);

    private native int decodeInt(long j, String str, int i);

    private native long decodeLong(long j, String str, long j2);

    private native String decodeString(long j, String str, String str2);

    private native String[] decodeStringSet(long j, String str);

    public static MMKV defaultMMKV() {
        if (rootDir != null) {
            return checkProcessMode(getDefaultMMKV(1, (String) null), "DefaultMMKV", 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private static native void destroyNB(long j, int i);

    public static void destroyNativeBuffer(C22549e eVar) {
        destroyNB(eVar.f64862a, eVar.f64863b);
    }

    public static void disableProcessModeChecker() {
        synchronized (checkedHandleSet) {
            isProcessModeCheckerEnabled = false;
        }
    }

    private static String doInitialize(String str, String str2, C19915a aVar, C22547c cVar) {
        if (aVar != null) {
            aVar.loadLibrary("mmkv");
        } else {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c("mmkv");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar2.mo10232b(), "com/tencent/mmkv/MMKV", "doInitialize", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mmkv/MMKV$LibLoader;Lcom/tencent/mmkv/MMKVLogLevel;)Ljava/lang/String;", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar2.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mmkv/MMKV", "doInitialize", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mmkv/MMKV$LibLoader;Lcom/tencent/mmkv/MMKVLogLevel;)Ljava/lang/String;", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        jniInitialize(str, str2, logLevel2Int(cVar));
        rootDir = str;
        return str;
    }

    public static void enableProcessModeChecker() {
        synchronized (checkedHandleSet) {
            isProcessModeCheckerEnabled = true;
        }
    }

    private native boolean encodeBool(long j, String str, boolean z);

    private native boolean encodeBytes(long j, String str, byte[] bArr);

    private native boolean encodeDouble(long j, String str, double d);

    private native boolean encodeFloat(long j, String str, float f);

    private native boolean encodeInt(long j, String str, int i);

    private native boolean encodeLong(long j, String str, long j2);

    private native boolean encodeSet(long j, String str, String[] strArr);

    private native boolean encodeString(long j, String str, String str2);

    private static native long getDefaultMMKV(int i, String str);

    private static native long getMMKVWithAshmemFD(String str, int i, int i2, String str2);

    private static native long getMMKVWithID(String str, int i, String str2, String str3);

    private static native long getMMKVWithIDAndSize(String str, int i, int i2, String str2);

    public static String getRootDir() {
        return rootDir;
    }

    public static String initialize(Context context) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", (C19915a) null, C22547c.LevelInfo);
    }

    public static boolean isFileValid(String str) {
        return isFileValid(str, (String) null);
    }

    public static native boolean isFileValid(String str, String str2);

    private static native void jniInitialize(String str, String str2, int i);

    private static int logLevel2Int(C22547c cVar) {
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 2) {
            return 2;
        }
        if (ordinal != 3) {
            return ordinal != 4 ? 1 : 4;
        }
        return 3;
    }

    private static void mmkvLogImp(int i, String str, int i2, String str2, String str3) {
        C22546b bVar = gCallbackHandler;
        if (bVar == null || !gWantLogReDirecting) {
            index2LogLevel[i].ordinal();
        } else {
            bVar.mmkvLog(index2LogLevel[i], str, i2, str2, str3);
        }
    }

    public static MMKV mmkvWithAshmemFD(String str, int i, int i2, String str2) {
        long mMKVWithAshmemFD = getMMKVWithAshmemFD(str, i, i2, str2);
        if (mMKVWithAshmemFD != 0) {
            return new MMKV(mMKVWithAshmemFD);
        }
        throw new RuntimeException("Fail to create an ashmem MMKV instance [" + str + "] in JNI");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.mmkv.MMKV mmkvWithAshmemID(android.content.Context r6, java.lang.String r7, int r8, int r9, java.lang.String r10) {
        /*
            tr3.c r0 = tr3.C22547c.LevelInfo
            tr3.c r1 = tr3.C22547c.LevelError
            java.lang.String r2 = rootDir
            if (r2 == 0) goto L_0x013c
            int r2 = android.os.Process.myPid()
            android.net.Uri r3 = com.tencent.mmkv.MMKVContentProvider.f349137d
            java.lang.String r3 = "activity"
            java.lang.Object r3 = r6.getSystemService(r3)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            if (r3 == 0) goto L_0x0033
            java.util.List r3 = r3.getRunningAppProcesses()
            java.util.Iterator r3 = r3.iterator()
        L_0x0020:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0033
            java.lang.Object r4 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r5 = r4.pid
            if (r5 != r2) goto L_0x0020
            java.lang.String r2 = r4.processName
            goto L_0x0035
        L_0x0033:
            java.lang.String r2 = ""
        L_0x0035:
            if (r2 == 0) goto L_0x0131
            int r3 = r2.length()
            if (r3 == 0) goto L_0x0131
            java.lang.String r3 = ":"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x00fe
            android.net.Uri r2 = com.tencent.mmkv.MMKVContentProvider.f349137d
            r3 = 0
            if (r2 == 0) goto L_0x004b
            goto L_0x006a
        L_0x004b:
            java.lang.String r2 = com.tencent.mmkv.MMKVContentProvider.m163962a(r6)
            if (r2 != 0) goto L_0x0053
            r2 = r3
            goto L_0x006a
        L_0x0053:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "content://"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            com.tencent.mmkv.MMKVContentProvider.f349137d = r2
        L_0x006a:
            if (r2 == 0) goto L_0x00f3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "getting parcelable mmkv in process, Uri = "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            simpleLog(r0, r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r4 = "KEY_SIZE"
            r1.putInt(r4, r8)
            java.lang.String r4 = "KEY_MODE"
            r1.putInt(r4, r9)
            if (r10 == 0) goto L_0x0096
            java.lang.String r4 = "KEY_CRYPT"
            r1.putString(r4, r10)
        L_0x0096:
            android.content.ContentResolver r6 = r6.getContentResolver()
            java.lang.String r4 = "mmkvFromAshmemID"
            android.os.Bundle r6 = r6.call(r2, r4, r7, r1)
            if (r6 == 0) goto L_0x00fe
            java.lang.Class<com.tencent.mmkv.ParcelableMMKV> r1 = com.tencent.mmkv.ParcelableMMKV.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r6.setClassLoader(r1)
            java.lang.String r1 = "KEY"
            android.os.Parcelable r6 = r6.getParcelable(r1)
            com.tencent.mmkv.ParcelableMMKV r6 = (com.tencent.mmkv.ParcelableMMKV) r6
            if (r6 == 0) goto L_0x00fe
            int r1 = r6.f349139e
            if (r1 < 0) goto L_0x00c5
            int r2 = r6.f349140f
            if (r2 < 0) goto L_0x00c5
            java.lang.String r3 = r6.f349138d
            java.lang.String r6 = r6.f349141g
            com.tencent.mmkv.MMKV r3 = mmkvWithAshmemFD(r3, r1, r2, r6)
        L_0x00c5:
            if (r3 == 0) goto L_0x00fe
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r3.mmapID()
            r6.append(r7)
            java.lang.String r7 = " fd = "
            r6.append(r7)
            int r7 = r3.ashmemFD()
            r6.append(r7)
            java.lang.String r7 = ", meta fd = "
            r6.append(r7)
            int r7 = r3.ashmemMetaFD()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            simpleLog(r0, r6)
            return r3
        L_0x00f3:
            java.lang.String r6 = "MMKVContentProvider has invalid authority"
            simpleLog(r1, r6)
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r6)
            throw r7
        L_0x00fe:
            java.lang.String r6 = "getting mmkv in main process"
            simpleLog(r0, r6)
            r6 = r9 | 8
            long r8 = getMMKVWithIDAndSize(r7, r8, r6, r10)
            r0 = 0
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x0115
            com.tencent.mmkv.MMKV r6 = new com.tencent.mmkv.MMKV
            r6.<init>(r8)
            return r6
        L_0x0115:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Fail to create an Ashmem MMKV instance ["
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = "]"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L_0x0131:
            java.lang.String r6 = "process name detect fail, try again later"
            simpleLog(r1, r6)
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r6)
            throw r7
        L_0x013c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "You should Call MMKV.initialize() first."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mmkv.MMKV.mmkvWithAshmemID(android.content.Context, java.lang.String, int, int, java.lang.String):com.tencent.mmkv.MMKV");
    }

    public static MMKV mmkvWithID(String str) {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, 1, (String) null, (String) null), str, 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private static void onContentChangedByOuterProcess(String str) {
        C22545a aVar = gContentChangeNotify;
        if (aVar != null) {
            aVar.mo35643a(str);
        }
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        C22548d dVar = C22548d.OnErrorDiscard;
        C22546b bVar = gCallbackHandler;
        if (bVar != null) {
            dVar = bVar.onMMKVCRCCheckFail(str);
        }
        C22547c cVar = C22547c.LevelInfo;
        simpleLog(cVar, "Recover strategic for " + str + " is " + dVar);
        Integer num = recoverIndex.get(dVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        C22548d dVar = C22548d.OnErrorDiscard;
        C22546b bVar = gCallbackHandler;
        if (bVar != null) {
            dVar = bVar.onMMKVFileLengthError(str);
        }
        C22547c cVar = C22547c.LevelInfo;
        simpleLog(cVar, "Recover strategic for " + str + " is " + dVar);
        Integer num = recoverIndex.get(dVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static native int pageSize();

    public static void registerContentChangeNotify(C22545a aVar) {
        gContentChangeNotify = aVar;
        setWantsContentChangeNotify(aVar != null);
    }

    public static void registerHandler(C22546b bVar) {
        gCallbackHandler = bVar;
        if (bVar.wantLogRedirecting()) {
            setCallbackHandler(true, true);
            gWantLogReDirecting = true;
            return;
        }
        setCallbackHandler(false, true);
        gWantLogReDirecting = false;
    }

    private native void removeValueForKey(long j, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, String str3);

    private static native void setCallbackHandler(boolean z, boolean z2);

    private static native void setLogLevel(int i);

    public static void setLogLevel(C22547c cVar) {
        setLogLevel(logLevel2Int(cVar));
    }

    private static native void setWantsContentChangeNotify(boolean z);

    private static void simpleLog(C22547c cVar, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[stackTrace.length - 1];
        Integer num = logLevel2Index.get(cVar);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    private native void sync(boolean z);

    private native long totalSize(long j);

    public static void unregisterContentChangeNotify() {
        gContentChangeNotify = null;
        setWantsContentChangeNotify(false);
    }

    public static void unregisterHandler() {
        gCallbackHandler = null;
        setCallbackHandler(false, false);
        gWantLogReDirecting = false;
    }

    private native int valueSize(long j, String str, boolean z);

    public static native String version();

    private native int writeValueToNB(long j, String str, long j2, int i);

    public long actualSize() {
        return actualSize(this.nativeHandle);
    }

    public native String[] allKeys();

    @Deprecated
    public void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public void async() {
        sync(false);
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(String str);

    public SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearMemoryCache();

    public native void close();

    @Deprecated
    public boolean commit() {
        sync(true);
        return true;
    }

    public boolean contains(String str) {
        return containsKey(str);
    }

    public boolean containsKey(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public long count() {
        return count(this.nativeHandle);
    }

    public native String cryptKey();

    public boolean decodeBool(String str) {
        return decodeBool(this.nativeHandle, str, false);
    }

    public byte[] decodeBytes(String str) {
        return decodeBytes(str, (byte[]) null);
    }

    public double decodeDouble(String str) {
        return decodeDouble(this.nativeHandle, str, 0.0d);
    }

    public float decodeFloat(String str) {
        return decodeFloat(this.nativeHandle, str, 0.0f);
    }

    public int decodeInt(String str) {
        return decodeInt(this.nativeHandle, str, 0);
    }

    public long decodeLong(String str) {
        return decodeLong(this.nativeHandle, str, 0);
    }

    public <T extends Parcelable> T decodeParcelable(String str, Class<T> cls) {
        return decodeParcelable(str, cls, (Parcelable) null);
    }

    public String decodeString(String str) {
        return decodeString(this.nativeHandle, str, (String) null);
    }

    public Set<String> decodeStringSet(String str) {
        return decodeStringSet(str, (Set<String>) null);
    }

    public SharedPreferences.Editor edit() {
        return this;
    }

    public boolean encode(String str, boolean z) {
        return encodeBool(this.nativeHandle, str, z);
    }

    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    public boolean getBoolean(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    public byte[] getBytes(String str, byte[] bArr) {
        return decodeBytes(str, bArr);
    }

    public float getFloat(String str, float f) {
        return decodeFloat(this.nativeHandle, str, f);
    }

    public int getInt(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    public long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    public String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return decodeStringSet(str, set);
    }

    public int getValueActualSize(String str) {
        return valueSize(this.nativeHandle, str, true);
    }

    public int getValueSize(String str) {
        return valueSize(this.nativeHandle, str, false);
    }

    public int importFromSharedPreferences(SharedPreferences sharedPreferences) {
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.size() <= 0) {
            return 0;
        }
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (!(str == null || value == null)) {
                if (value instanceof Boolean) {
                    encodeBool(this.nativeHandle, str, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    encodeInt(this.nativeHandle, str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    encodeLong(this.nativeHandle, str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    encodeFloat(this.nativeHandle, str, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    encodeDouble(this.nativeHandle, str, ((Double) value).doubleValue());
                } else if (value instanceof String) {
                    encodeString(this.nativeHandle, str, (String) value);
                } else if (value instanceof Set) {
                    encode(str, (Set<String>) (Set) value);
                } else {
                    C22547c cVar = C22547c.LevelError;
                    simpleLog(cVar, "unknown type: " + value.getClass());
                }
            }
        }
        return all.size();
    }

    public native void lock();

    public native String mmapID();

    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        encodeBool(this.nativeHandle, str, z);
        return this;
    }

    public SharedPreferences.Editor putBytes(String str, byte[] bArr) {
        encode(str, bArr);
        return this;
    }

    public SharedPreferences.Editor putFloat(String str, float f) {
        encodeFloat(this.nativeHandle, str, f);
        return this;
    }

    public SharedPreferences.Editor putInt(String str, int i) {
        encodeInt(this.nativeHandle, str, i);
        return this;
    }

    public SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }

    public SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        encode(str, set);
        return this;
    }

    public native boolean reKey(String str);

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    public SharedPreferences.Editor remove(String str) {
        removeValueForKey(str);
        return this;
    }

    public void removeValueForKey(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    public native void removeValuesForKeys(String[] strArr);

    public void sync() {
        sync(true);
    }

    public long totalSize() {
        return totalSize(this.nativeHandle);
    }

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    public int writeValueToNativeBuffer(String str, C22549e eVar) {
        return writeValueToNB(this.nativeHandle, str, eVar.f64862a, eVar.f64863b);
    }

    public boolean decodeBool(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    public byte[] decodeBytes(String str, byte[] bArr) {
        byte[] decodeBytes = decodeBytes(this.nativeHandle, str);
        return decodeBytes != null ? decodeBytes : bArr;
    }

    public double decodeDouble(String str, double d) {
        return decodeDouble(this.nativeHandle, str, d);
    }

    public float decodeFloat(String str, float f) {
        return decodeFloat(this.nativeHandle, str, f);
    }

    public int decodeInt(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    public long decodeLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.os.Parcelable$Creator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends android.os.Parcelable> T decodeParcelable(java.lang.String r4, java.lang.Class<T> r5, T r6) {
        /*
            r3 = this;
            if (r5 != 0) goto L_0x0003
            return r6
        L_0x0003:
            long r0 = r3.nativeHandle
            byte[] r4 = r3.decodeBytes((long) r0, (java.lang.String) r4)
            if (r4 != 0) goto L_0x000c
            return r6
        L_0x000c:
            android.os.Parcel r0 = android.os.Parcel.obtain()
            int r1 = r4.length
            r2 = 0
            r0.unmarshall(r4, r2, r1)
            r0.setDataPosition(r2)
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0063 }
            java.util.HashMap<java.lang.String, android.os.Parcelable$Creator<?>> r1 = mCreators     // Catch:{ Exception -> 0x0063 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r2 = r1.get(r4)     // Catch:{ all -> 0x005e }
            android.os.Parcelable$Creator r2 = (android.os.Parcelable.Creator) r2     // Catch:{ all -> 0x005e }
            if (r2 != 0) goto L_0x003a
            java.lang.String r2 = "CREATOR"
            java.lang.reflect.Field r5 = r5.getField(r2)     // Catch:{ all -> 0x005e }
            r2 = 0
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x005e }
            r2 = r5
            android.os.Parcelable$Creator r2 = (android.os.Parcelable.Creator) r2     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x003a
            r1.put(r4, r2)     // Catch:{ all -> 0x005e }
        L_0x003a:
            monitor-exit(r1)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x0047
            java.lang.Object r4 = r2.createFromParcel(r0)     // Catch:{ Exception -> 0x0063 }
            android.os.Parcelable r4 = (android.os.Parcelable) r4     // Catch:{ Exception -> 0x0063 }
            r0.recycle()
            return r4
        L_0x0047:
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x0063 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0063 }
            r1.<init>()     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = "Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class "
            r1.append(r2)     // Catch:{ Exception -> 0x0063 }
            r1.append(r4)     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0063 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0063 }
            throw r5     // Catch:{ Exception -> 0x0063 }
        L_0x005e:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005e }
            throw r4     // Catch:{ Exception -> 0x0063 }
        L_0x0061:
            r4 = move-exception
            goto L_0x0071
        L_0x0063:
            r4 = move-exception
            tr3.c r5 = tr3.C22547c.LevelError     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0061 }
            simpleLog(r5, r4)     // Catch:{ all -> 0x0061 }
            r0.recycle()
            return r6
        L_0x0071:
            r0.recycle()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mmkv.MMKV.decodeParcelable(java.lang.String, java.lang.Class, android.os.Parcelable):android.os.Parcelable");
    }

    public String decodeString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    public Set<String> decodeStringSet(String str, Set<String> set) {
        return decodeStringSet(str, set, HashSet.class);
    }

    public boolean encode(String str, int i) {
        return encodeInt(this.nativeHandle, str, i);
    }

    public Set<String> decodeStringSet(String str, Set<String> set, Class<? extends Set> cls) {
        String[] decodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (decodeStringSet == null) {
            return set;
        }
        try {
            Set<String> set2 = (Set) cls.newInstance();
            set2.addAll(Arrays.asList(decodeStringSet));
            return set2;
        } catch (IllegalAccessException | InstantiationException unused) {
            return set;
        }
    }

    public boolean encode(String str, long j) {
        return encodeLong(this.nativeHandle, str, j);
    }

    public static String initialize(Context context, C22547c cVar) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", (C19915a) null, cVar);
    }

    public boolean encode(String str, float f) {
        return encodeFloat(this.nativeHandle, str, f);
    }

    public static MMKV defaultMMKV(int i, String str) {
        if (rootDir != null) {
            return checkProcessMode(getDefaultMMKV(i, str), "DefaultMMKV", i);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static MMKV mmkvWithID(String str, int i) {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, i, (String) null, (String) null), str, i);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public boolean encode(String str, double d) {
        return encodeDouble(this.nativeHandle, str, d);
    }

    public static String initialize(Context context, C19915a aVar) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", aVar, C22547c.LevelInfo);
    }

    public boolean encode(String str, String str2) {
        return encodeString(this.nativeHandle, str, str2);
    }

    public boolean encode(String str, Set<String> set) {
        return encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
    }

    public boolean encode(String str, byte[] bArr) {
        return encodeBytes(this.nativeHandle, str, bArr);
    }

    public static String initialize(Context context, C19915a aVar, C22547c cVar) {
        return initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", aVar, cVar);
    }

    public static MMKV mmkvWithID(String str, int i, String str2) {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, i, str2, (String) null), str, i);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public boolean encode(String str, Parcelable parcelable) {
        if (parcelable == null) {
            return encodeBytes(this.nativeHandle, str, (byte[]) null);
        }
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return encodeBytes(this.nativeHandle, str, marshall);
    }

    public static String initialize(Context context, String str) {
        return initialize(context, str, (C19915a) null, C22547c.LevelInfo);
    }

    public static String initialize(Context context, String str, C22547c cVar) {
        return initialize(context, str, (C19915a) null, cVar);
    }

    public static MMKV mmkvWithID(String str, String str2) {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, 1, (String) null, str2), str, 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static String initialize(Context context, String str, C19915a aVar) {
        return initialize(context, str, aVar, C22547c.LevelInfo);
    }

    public static String initialize(Context context, String str, C19915a aVar, C22547c cVar) {
        if ((context.getApplicationInfo().flags & 2) == 0) {
            disableProcessModeChecker();
        } else {
            enableProcessModeChecker();
        }
        return doInitialize(str, context.getCacheDir().getAbsolutePath(), aVar, cVar);
    }

    public static MMKV mmkvWithID(String str, int i, String str2, String str3) {
        if (rootDir != null) {
            return checkProcessMode(getMMKVWithID(str, i, str2, str3), str, i);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    @Deprecated
    public static String initialize(String str) {
        C22547c cVar = C22547c.LevelInfo;
        return doInitialize(str, str + "/.tmp", (C19915a) null, cVar);
    }

    @Deprecated
    public static String initialize(String str, C22547c cVar) {
        return doInitialize(str, str + "/.tmp", (C19915a) null, cVar);
    }

    @Deprecated
    public static String initialize(String str, C19915a aVar) {
        C22547c cVar = C22547c.LevelInfo;
        return doInitialize(str, str + "/.tmp", aVar, cVar);
    }

    @Deprecated
    public static String initialize(String str, C19915a aVar, C22547c cVar) {
        return doInitialize(str, str + "/.tmp", aVar, cVar);
    }
}
