package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;
import android.util.ArrayMap;
import com.tencent.mmkv.MMKV;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kj2.C117407d;
import p206nj.C88957l;
import p823sg.C101611g;
import p823sg.C101614i;
import tr3.C22546b;
import tr3.C22547c;
import tr3.C22548d;
import tr3.C22549e;

/* renamed from: com.tencent.mm.sdk.platformtools.MultiProcessMMKV */
public class MultiProcessMMKV implements SharedPreferences, SharedPreferences.Editor {
    private static final String DEFAULT_MULTI_NAME = "MULTIPROCESSMMKV_MULTI_DEFAULT";
    private static final String DEFAULT_SINGLE_NAME = "MULTIPROCESSMMKV_SINGLE_DEFAULT";
    private static final int ERROR_KV = 24632;
    private static final int ERROR_KV_KEY_CRC_FAILED = 1;
    private static final int ERROR_KV_KEY_FILE_TOO_BIG = 3;
    private static final int ERROR_KV_KEY_LEN_FAILED = 2;
    private static final int IDKEY_MMKV = 941;
    private static final int KVID_MMKV = 18378;
    private static final Set<String> LruCloseWhiteList;
    private static final int MAX_LRU_MAP_SIZE = 45;
    public static final int MULTI_PROCESS_MODE = 2;
    private static final String PERSERVED_NAME = "MULTIPROCESSMMKV_PERSERVED_NAME";
    public static final int SINGLE_PROCESS_MODE = 1;
    private static final String TAG = "MicroMsg.MultiProcessMMKV";
    private static final Map<String, MultiProcessMMKV> mmkvCache = new ConcurrentHashMap();
    private static final C101614i<String, MultiProcessMMKV> mmkvLruCache = new C101614i<>(45, new C101611g.C101612b<String, MultiProcessMMKV>() {
        public void preRemoveCallback(String str, MultiProcessMMKV multiProcessMMKV, MultiProcessMMKV multiProcessMMKV2) {
            if (multiProcessMMKV2 == null) {
                Log.m105924i(MultiProcessMMKV.TAG, "preRemoveCallback newValue == null, name = " + multiProcessMMKV.name);
                multiProcessMMKV.close();
            }
            Log.m105924i(MultiProcessMMKV.TAG, "preRemoveCallback done, name = " + multiProcessMMKV.name);
        }
    });
    private static final Map<String, ReentrantLock> sMMKVCreateLocks = new ArrayMap();
    private static final boolean stingyMode;
    private MMKV mmkv;
    private int mode;
    /* access modifiers changed from: private */
    public String name;
    private final ReentrantReadWriteLock.ReadLock readLock;
    private final ReentrantReadWriteLock readWriteLock;
    private final ReentrantReadWriteLock.WriteLock writeLock;

    /* renamed from: com.tencent.mm.sdk.platformtools.MultiProcessMMKV$NativeBuffer */
    public static final class NativeBuffer {
        public long pointer;
        public int size;

        public NativeBuffer(long j, int i) {
            this.pointer = j;
            this.size = i;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        LruCloseWhiteList = hashSet;
        C88957l.m111079o("mmkv", MMKV.class.getClassLoader());
        MMKV.initialize(MMApplicationContext.getContext());
        MMKV.disableProcessModeChecker();
        MMKV.registerHandler(new C22546b() {
            public void mmkvLog(C22547c cVar, String str, int i, String str2, String str3) {
                Log.m105925i("MMKV", "[%s][%d][%s] %s", str, Integer.valueOf(i), str2, str3);
            }

            public C22548d onMMKVCRCCheckFail(String str) {
                Log.m105925i(MultiProcessMMKV.TAG, "onMMKVCRCCheckFail:%s", str);
                C117407d dVar = C117407d.INSTANCE;
                dVar.idkeyStat(941, 3, 1, true);
                dVar.mo160131h(MultiProcessMMKV.ERROR_KV, str, 1, 0, 0);
                return C22548d.OnErrorDiscard;
            }

            public C22548d onMMKVFileLengthError(String str) {
                Log.m105925i(MultiProcessMMKV.TAG, "onMMKVFileLengthError:%s", str);
                C117407d dVar = C117407d.INSTANCE;
                dVar.idkeyStat(941, 4, 1, true);
                dVar.mo160131h(MultiProcessMMKV.ERROR_KV, str, 2, 0, 0);
                return C22548d.OnErrorDiscard;
            }

            public boolean wantLogRedirecting() {
                return true;
            }
        });
        MMKV defaultMMKV = MMKV.defaultMMKV(2, (String) null);
        int decodeInt = defaultMMKV.decodeInt(MMApplicationContext.getProcessName() + "_mFdLimit", -1);
        boolean z = decodeInt <= 1024 && decodeInt > 0;
        stingyMode = z;
        Log.m105925i(TAG, "mFdLimit = %d", Integer.valueOf(decodeInt));
        if (z) {
            hashSet.add(DEFAULT_SINGLE_NAME);
            hashSet.add(DEFAULT_MULTI_NAME);
            hashSet.add("_webview_web_prefetcher_info");
        }
    }

    private MultiProcessMMKV(String str, int i, MMKV mmkv2) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.readWriteLock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
        this.mmkv = mmkv2;
        this.name = str;
        this.mode = i;
    }

    private int ashmemFD() {
        if (!isStingyMode()) {
            return this.mmkv.ashmemFD();
        }
        this.readLock.lock();
        int ashmemFD = this.mmkv.ashmemFD();
        this.readLock.unlock();
        return ashmemFD;
    }

    private int ashmemMetaFD() {
        if (!isStingyMode()) {
            return this.mmkv.ashmemMetaFD();
        }
        this.readLock.lock();
        int ashmemMetaFD = this.mmkv.ashmemMetaFD();
        this.readLock.unlock();
        return ashmemMetaFD;
    }

    private void checkReopen(String str) {
        if (!LruCloseWhiteList.contains(str)) {
            C101614i<String, MultiProcessMMKV> iVar = mmkvLruCache;
            iVar.checkAndUpTime(str);
            if (isClosed()) {
                this.readLock.unlock();
                this.writeLock.lock();
                if (isClosed()) {
                    Log.m105921e(TAG, "MMKV : %s has bean closed, reopen now, my hashcode = %d, core mmkv hashcode = %d ", str, Integer.valueOf(hashCode()), Integer.valueOf(this.mmkv.hashCode()));
                    this.mmkv = getCoreMMKV(this.name, this.mode);
                    Log.m105921e(TAG, "MMKV : %s has bean closed, reopen done", str);
                    iVar.put(str, this);
                    Log.m105921e(TAG, "MMKV : %s checkReopen done", str);
                }
                this.readLock.lock();
                this.writeLock.unlock();
            }
        }
    }

    /* access modifiers changed from: private */
    public void close() {
        if (!isStingyMode()) {
            this.mmkv.close();
            this.mmkv = null;
            return;
        }
        this.writeLock.lock();
        Log.m105925i(TAG, "preRemoveCallback MMKV : %s, will be closed, my hashcode = %d, coreMMKV hashcode = %d", this.name, Integer.valueOf(hashCode()), Integer.valueOf(this.mmkv.hashCode()));
        this.mmkv.close();
        this.writeLock.unlock();
    }

    public static NativeBuffer createNativeBuffer(int i) {
        C22549e createNativeBuffer = MMKV.createNativeBuffer(i);
        return new NativeBuffer(createNativeBuffer.f64862a, createNativeBuffer.f64863b);
    }

    public static void destroyNativeBuffer(NativeBuffer nativeBuffer) {
        MMKV.destroyNativeBuffer(new C22549e(nativeBuffer.pointer, nativeBuffer.size));
    }

    private static void ensureSoLoaded() {
        C88957l.m111079o("mmkv", MMKV.class.getClassLoader());
    }

    private MMKV getCoreMMKV() {
        return this.mmkv;
    }

    public static MultiProcessMMKV getCryptMMKV(String str, String str2) {
        return getCryptMMKVReal(str, 2, str2);
    }

    public static MultiProcessMMKV getCryptMMKVReal(String str, int i, String str2) {
        return new MultiProcessMMKV(str, i, MMKV.mmkvWithID(str, i, str2));
    }

    public static MultiProcessMMKV getDefault() {
        return getMMKV(DEFAULT_MULTI_NAME, 2, MMKV.defaultMMKV(2, (String) null));
    }

    public static MultiProcessMMKV getMMKV(String str) {
        return getMMKV(str, 2, (MMKV) null);
    }

    private static ReentrantLock getMMKVCreateLock(String str) {
        ReentrantLock reentrantLock;
        Map<String, ReentrantLock> map = sMMKVCreateLocks;
        synchronized (map) {
            reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock(true);
                map.put(str, reentrantLock);
            }
        }
        return reentrantLock;
    }

    private static MultiProcessMMKV getMMKVReal(String str, int i, MMKV mmkv2) {
        String str2 = str;
        int i2 = i;
        MMKV mmkv3 = mmkv2;
        MultiProcessMMKV mMKVRealFromCache = getMMKVRealFromCache(str, i);
        if (mMKVRealFromCache != null) {
            return mMKVRealFromCache;
        }
        ReentrantLock mMKVCreateLock = getMMKVCreateLock(str);
        try {
            mMKVCreateLock.lock();
            MultiProcessMMKV mMKVRealFromCache2 = getMMKVRealFromCache(str, i);
            if (mMKVRealFromCache2 != null) {
                return mMKVRealFromCache2;
            }
            MultiProcessMMKV multiProcessMMKV = mmkv3 == null ? new MultiProcessMMKV(str2, i2, getCoreMMKV(str, i)) : new MultiProcessMMKV(str2, i2, mmkv3);
            long j = multiProcessMMKV.totalSize();
            if (j > 1048576) {
                Log.m105921e(TAG, "MMKV file is too big, name : %s, size : %d, please contact with leafjia", str2, Long.valueOf(j));
                reportTotalSize(j, str2);
                if (j > 5242880) {
                    C117407d dVar = C117407d.INSTANCE;
                    dVar.idkeyStat(941, 100, 1, true);
                    Log.m105925i(TAG, "start to trim, before size : %d", Long.valueOf(j));
                    multiProcessMMKV.trim();
                    Log.m105925i(TAG, "trim is over, after size : %d", Long.valueOf(multiProcessMMKV.totalSize()));
                    if (j > 52428800) {
                        dVar.mo160131h(ERROR_KV, str2, 3, Long.valueOf(j), Long.valueOf(multiProcessMMKV.totalSize()));
                    }
                }
            }
            if (useLru(str)) {
                mmkvLruCache.put(str2, multiProcessMMKV);
                mmkvCache.put(str2, multiProcessMMKV);
            } else {
                mmkvCache.put(str2, multiProcessMMKV);
            }
            mMKVCreateLock.unlock();
            return multiProcessMMKV;
        } finally {
            mMKVCreateLock.unlock();
        }
    }

    private static MultiProcessMMKV getMMKVRealFromCache(String str, int i) {
        if (!useLru(str)) {
            return mmkvCache.get(str);
        }
        C101614i<String, MultiProcessMMKV> iVar = mmkvLruCache;
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) iVar.get(str);
        if (multiProcessMMKV != null) {
            return multiProcessMMKV;
        }
        MultiProcessMMKV multiProcessMMKV2 = mmkvCache.get(str);
        if (multiProcessMMKV2 == null) {
            return multiProcessMMKV2;
        }
        multiProcessMMKV2.readLock.lock();
        multiProcessMMKV2.checkReopen(str);
        iVar.put(str, multiProcessMMKV2);
        multiProcessMMKV2.readLock.unlock();
        return multiProcessMMKV2;
    }

    public static MultiProcessMMKV getMMKVWithAshmemFD(Context context, String str, int i, int i2, String str2) {
        return getMMKV(str, i2, MMKV.mmkvWithAshmemID(context, str, i, i2, str2));
    }

    public static MultiProcessMMKV getMMKVWithTransportByName(String str) {
        MultiProcessMMKV mmkv2 = getMMKV(str);
        transport2MMKV(MMApplicationContext.getContext().getSharedPreferences(str, 4), mmkv2);
        return mmkv2;
    }

    private int getMode() {
        return this.mode;
    }

    public static MultiProcessMMKV getMultiDefault() {
        return getDefault();
    }

    private String getName() {
        return this.name;
    }

    public static ObservableMMKV getObservableMMKV(String str) {
        return new ObservableMMKV(getMMKV(str, 1));
    }

    private static MultiProcessMMKV getPerservedMMKV() {
        return getMMKVReal(PERSERVED_NAME, 2, (MMKV) null);
    }

    public static MultiProcessMMKV getSingleCryptMMKV(String str, String str2) {
        return getCryptMMKVReal(str, 1, str2);
    }

    public static MultiProcessMMKV getSingleDefault() {
        return getDefault();
    }

    public static MultiProcessMMKV getSingleMMKV(String str) {
        return getMMKV(str, 1, (MMKV) null);
    }

    public static void init() {
    }

    private boolean isClosed() {
        return mmapID() == null;
    }

    private boolean isLegal(String str, Object obj) {
        return !Util.isNullOrNil(str) && obj != null && !Util.isNullOrNil(getName());
    }

    public static boolean isTransported(String str) {
        try {
            return getPerservedMMKV().decodeBool(str, false);
        } catch (Throwable unused) {
            ensureSoLoaded();
            return getPerservedMMKV().decodeBool(str, false);
        }
    }

    private String mmapID() {
        if (!isStingyMode()) {
            return this.mmkv.mmapID();
        }
        this.readLock.lock();
        String mmapID = this.mmkv.mmapID();
        this.readLock.unlock();
        return mmapID;
    }

    private static void reportTotalSize(long j, String str) {
        if (j <= 5242880) {
            C117407d.INSTANCE.idkeyStat(941, 10, 1, true);
        } else if (j <= 10485760) {
            C117407d.INSTANCE.idkeyStat(941, 11, 1, true);
        } else if (j <= DownloadHelper.SAVE_LENGTH) {
            C117407d.INSTANCE.idkeyStat(941, 12, 1, true);
        } else {
            C117407d.INSTANCE.idkeyStat(941, 13, 1, true);
        }
        C117407d.INSTANCE.mo160131h(KVID_MMKV, str, Long.valueOf(j));
    }

    public static int transport2MMKV(SharedPreferences sharedPreferences, MultiProcessMMKV multiProcessMMKV) {
        if (sharedPreferences == null || multiProcessMMKV == null) {
            return 0;
        }
        String name2 = multiProcessMMKV.getName();
        if (Util.isNullOrNil(name2)) {
            return 0;
        }
        Log.m105925i(TAG, "transport2MMKV, name : %s", name2);
        if (isTransported(name2)) {
            Log.m105925i(TAG, "%s transport2MMKV has Done, return", name2);
            return 0;
        }
        getPerservedMMKV().encode(name2, true);
        return transport2MMKVByForce(sharedPreferences, multiProcessMMKV);
    }

    public static int transport2MMKVByForce(SharedPreferences sharedPreferences, MultiProcessMMKV multiProcessMMKV) {
        C117407d.INSTANCE.idkeyStat(941, 2, 1, true);
        return multiProcessMMKV.importFromSharedPreferences(sharedPreferences);
    }

    public static boolean useLru(String str) {
        return stingyMode && mmkvLruCache != null && !LruCloseWhiteList.contains(str);
    }

    public String[] allKeys() {
        if (!isStingyMode()) {
            return this.mmkv.allKeys();
        }
        this.readLock.lock();
        checkReopen(getName());
        String[] allKeys = this.mmkv.allKeys();
        this.readLock.unlock();
        return allKeys;
    }

    public void apply() {
    }

    public SharedPreferences.Editor clear() {
        if (!isStingyMode()) {
            this.mmkv.clear();
        } else {
            this.readLock.lock();
            checkReopen(getName());
            this.mmkv.clear();
            this.readLock.unlock();
        }
        return this;
    }

    public void clearAll() {
        if (!isStingyMode()) {
            this.mmkv.clearAll();
            return;
        }
        this.readLock.lock();
        checkReopen(getName());
        this.mmkv.clearAll();
        this.readLock.unlock();
    }

    public void clearMemoryCache() {
        if (!isStingyMode()) {
            this.mmkv.clearMemoryCache();
            return;
        }
        this.readLock.lock();
        checkReopen(getName());
        this.mmkv.clearMemoryCache();
        this.readLock.unlock();
    }

    public boolean commit() {
        return true;
    }

    public boolean contains(String str) {
        if (!isStingyMode()) {
            return this.mmkv.contains(str);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean contains = this.mmkv.contains(str);
        this.readLock.unlock();
        return contains;
    }

    public boolean containsKey(String str) {
        if (!isStingyMode()) {
            return this.mmkv.containsKey(str);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean containsKey = this.mmkv.containsKey(str);
        this.readLock.unlock();
        return containsKey;
    }

    public long count() {
        if (!isStingyMode()) {
            return this.mmkv.count();
        }
        this.readLock.lock();
        checkReopen(getName());
        long count = this.mmkv.count();
        this.readLock.unlock();
        return count;
    }

    public boolean decodeBool(String str) {
        if (!isStingyMode()) {
            return this.mmkv.decodeBool(str);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean decodeBool = this.mmkv.decodeBool(str);
        this.readLock.unlock();
        return decodeBool;
    }

    public byte[] decodeBytes(String str) {
        if (!isStingyMode()) {
            return this.mmkv.decodeBytes(str);
        }
        this.readLock.lock();
        checkReopen(getName());
        byte[] decodeBytes = this.mmkv.decodeBytes(str);
        this.readLock.unlock();
        return decodeBytes;
    }

    public double decodeDouble(String str) {
        if (!isStingyMode()) {
            return this.mmkv.decodeDouble(str);
        }
        this.readLock.lock();
        checkReopen(getName());
        double decodeDouble = this.mmkv.decodeDouble(str);
        this.readLock.unlock();
        return decodeDouble;
    }

    public float decodeFloat(String str) {
        if (!isStingyMode()) {
            return this.mmkv.decodeFloat(str);
        }
        this.readLock.lock();
        checkReopen(getName());
        float decodeFloat = this.mmkv.decodeFloat(str);
        this.readLock.unlock();
        return decodeFloat;
    }

    public int decodeInt(String str) {
        if (!isStingyMode()) {
            return this.mmkv.decodeInt(str);
        }
        this.readLock.lock();
        checkReopen(getName());
        int decodeInt = this.mmkv.decodeInt(str);
        this.readLock.unlock();
        return decodeInt;
    }

    public long decodeLong(String str) {
        if (!isStingyMode()) {
            return this.mmkv.decodeLong(str);
        }
        this.readLock.lock();
        checkReopen(getName());
        long decodeLong = this.mmkv.decodeLong(str);
        this.readLock.unlock();
        return decodeLong;
    }

    public <T extends Parcelable> T decodeParcelable(String str, Class<T> cls) {
        if (!isStingyMode()) {
            return this.mmkv.decodeParcelable(str, cls);
        }
        this.readLock.lock();
        checkReopen(getName());
        T decodeParcelable = this.mmkv.decodeParcelable(str, cls);
        this.readLock.unlock();
        return decodeParcelable;
    }

    public String decodeString(String str) {
        if (!isStingyMode()) {
            return this.mmkv.decodeString(str);
        }
        this.readLock.lock();
        checkReopen(getName());
        String decodeString = this.mmkv.decodeString(str);
        this.readLock.unlock();
        return decodeString;
    }

    public Set<String> decodeStringSet(String str) {
        if (!isStingyMode()) {
            return this.mmkv.decodeStringSet(str);
        }
        this.readLock.lock();
        checkReopen(getName());
        Set<String> decodeStringSet = this.mmkv.decodeStringSet(str);
        this.readLock.unlock();
        return decodeStringSet;
    }

    public SharedPreferences.Editor edit() {
        return this;
    }

    public boolean encode(String str, String str2) {
        if (!isLegal(str, str2)) {
            return false;
        }
        if (!isStingyMode()) {
            return this.mmkv.encode(str, str2);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean encode = this.mmkv.encode(str, str2);
        this.readLock.unlock();
        return encode;
    }

    public void finalize() {
        if (!stingyMode) {
            close();
            super.finalize();
        }
    }

    public Map<String, ?> getAll() {
        if (!isStingyMode()) {
            return this.mmkv.getAll();
        }
        this.readLock.lock();
        checkReopen(getName());
        Map<String, ?> all = this.mmkv.getAll();
        this.readLock.unlock();
        return all;
    }

    public boolean getBoolean(String str, boolean z) {
        if (!isStingyMode()) {
            return this.mmkv.getBoolean(str, z);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean z2 = this.mmkv.getBoolean(str, z);
        this.readLock.unlock();
        return z2;
    }

    public float getFloat(String str, float f) {
        if (!isStingyMode()) {
            return this.mmkv.getFloat(str, f);
        }
        this.readLock.lock();
        checkReopen(getName());
        float f2 = this.mmkv.getFloat(str, f);
        this.readLock.unlock();
        return f2;
    }

    public int getInt(String str, int i) {
        if (!isStingyMode()) {
            return this.mmkv.getInt(str, i);
        }
        this.readLock.lock();
        checkReopen(getName());
        int i2 = this.mmkv.getInt(str, i);
        this.readLock.unlock();
        return i2;
    }

    public long getLong(String str, long j) {
        if (!isStingyMode()) {
            return this.mmkv.getLong(str, j);
        }
        this.readLock.lock();
        checkReopen(getName());
        long j2 = this.mmkv.getLong(str, j);
        this.readLock.unlock();
        return j2;
    }

    public String getString(String str, String str2) {
        if (!isStingyMode()) {
            return this.mmkv.getString(str, str2);
        }
        this.readLock.lock();
        checkReopen(getName());
        String string = this.mmkv.getString(str, str2);
        this.readLock.unlock();
        return string;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        if (!isStingyMode()) {
            return this.mmkv.getStringSet(str, set);
        }
        this.readLock.lock();
        checkReopen(getName());
        Set<String> stringSet = this.mmkv.getStringSet(str, set);
        this.readLock.unlock();
        return stringSet;
    }

    public int getValueActualSize(String str) {
        if (!isStingyMode()) {
            return this.mmkv.getValueActualSize(str);
        }
        this.readLock.lock();
        checkReopen(getName());
        int valueActualSize = this.mmkv.getValueActualSize(str);
        this.readLock.unlock();
        return valueActualSize;
    }

    public int importFromSharedPreferences(SharedPreferences sharedPreferences) {
        if (!isStingyMode()) {
            return this.mmkv.importFromSharedPreferences(sharedPreferences);
        }
        this.readLock.lock();
        checkReopen(getName());
        int importFromSharedPreferences = this.mmkv.importFromSharedPreferences(sharedPreferences);
        this.readLock.unlock();
        return importFromSharedPreferences;
    }

    public boolean isStingyMode() {
        return stingyMode && mmkvLruCache != null;
    }

    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        if (!isLegal(str, Boolean.valueOf(z))) {
            return edit();
        }
        if (!isStingyMode()) {
            this.mmkv.putBoolean(str, z);
        } else {
            this.readLock.lock();
            checkReopen(getName());
            this.mmkv.putBoolean(str, z);
            this.readLock.unlock();
        }
        return this;
    }

    public SharedPreferences.Editor putFloat(String str, float f) {
        if (!isLegal(str, Float.valueOf(f))) {
            return edit();
        }
        if (!isStingyMode()) {
            this.mmkv.putFloat(str, f);
        } else {
            this.readLock.lock();
            checkReopen(getName());
            this.mmkv.putFloat(str, f);
            this.readLock.unlock();
        }
        return this;
    }

    public SharedPreferences.Editor putInt(String str, int i) {
        if (!isLegal(str, Integer.valueOf(i))) {
            return edit();
        }
        if (!isStingyMode()) {
            this.mmkv.putInt(str, i);
        } else {
            this.readLock.lock();
            checkReopen(getName());
            this.mmkv.putInt(str, i);
            this.readLock.unlock();
        }
        return this;
    }

    public SharedPreferences.Editor putLong(String str, long j) {
        if (!isLegal(str, Long.valueOf(j))) {
            return edit();
        }
        if (!isStingyMode()) {
            this.mmkv.putLong(str, j);
        } else {
            this.readLock.lock();
            checkReopen(getName());
            this.mmkv.putLong(str, j);
            this.readLock.unlock();
        }
        return this;
    }

    public SharedPreferences.Editor putString(String str, String str2) {
        if (!isLegal(str, str2)) {
            return edit();
        }
        if (!isStingyMode()) {
            this.mmkv.putString(str, str2);
        } else {
            this.readLock.lock();
            checkReopen(getName());
            this.mmkv.putString(str, str2);
            this.readLock.unlock();
        }
        return this;
    }

    public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        if (!isLegal(str, set)) {
            return edit();
        }
        if (!isStingyMode()) {
            this.mmkv.putStringSet(str, set);
        } else {
            this.readLock.lock();
            checkReopen(getName());
            this.mmkv.putStringSet(str, set);
            this.readLock.unlock();
        }
        return this;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public SharedPreferences.Editor remove(String str) {
        if (!isStingyMode()) {
            this.mmkv.remove(str);
        } else {
            this.readLock.lock();
            checkReopen(getName());
            this.mmkv.remove(str);
            this.readLock.unlock();
        }
        return this;
    }

    public void removeValueForKey(String str) {
        if (!isStingyMode()) {
            this.mmkv.removeValueForKey(str);
            return;
        }
        this.readLock.lock();
        checkReopen(getName());
        this.mmkv.removeValueForKey(str);
        this.readLock.unlock();
    }

    public void removeValuesForKeys(String[] strArr) {
        if (!isStingyMode()) {
            this.mmkv.removeValuesForKeys(strArr);
            return;
        }
        this.readLock.lock();
        checkReopen(getName());
        this.mmkv.removeValuesForKeys(strArr);
        this.readLock.unlock();
    }

    public long totalSize() {
        if (!isStingyMode()) {
            return this.mmkv.totalSize();
        }
        this.readLock.lock();
        checkReopen(getName());
        long j = this.mmkv.totalSize();
        this.readLock.unlock();
        return j;
    }

    public void trim() {
        if (!isStingyMode()) {
            this.mmkv.trim();
            return;
        }
        this.readLock.lock();
        checkReopen(getName());
        this.mmkv.trim();
        this.readLock.unlock();
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public int writeValueToNativeBuffer(String str, NativeBuffer nativeBuffer) {
        C22549e eVar = new C22549e(nativeBuffer.pointer, nativeBuffer.size);
        if (!isStingyMode()) {
            return this.mmkv.writeValueToNativeBuffer(str, eVar);
        }
        this.readLock.lock();
        checkReopen(getName());
        int writeValueToNativeBuffer = this.mmkv.writeValueToNativeBuffer(str, eVar);
        this.readLock.unlock();
        return writeValueToNativeBuffer;
    }

    private static MMKV getCoreMMKV(String str, int i) {
        try {
            return MMKV.mmkvWithID(str, i);
        } catch (IllegalArgumentException unused) {
            Log.m105921e(TAG, "getCoreMMKV mode error name : %s ,mode : %d", str, Integer.valueOf(i));
            C117407d.INSTANCE.idkeyStat(941, 150, 1, true);
            if (i == 2) {
                return MMKV.mmkvWithID(str, 1);
            }
            return MMKV.mmkvWithID(str, i);
        }
    }

    public static MultiProcessMMKV getMMKV(String str, int i, String str2, String str3) {
        return new MultiProcessMMKV(str, i, MMKV.mmkvWithID(str, i, str2, str3));
    }

    public static MultiProcessMMKV getMMKV(String str, int i) {
        return getMMKV(str, i, (MMKV) null);
    }

    public static MultiProcessMMKV getMMKVWithAshmemFD(String str, int i, int i2, String str2) {
        return getMMKV(str, -1, MMKV.mmkvWithAshmemFD(str, i, i2, str2));
    }

    private static MultiProcessMMKV getMMKV(String str, int i, MMKV mmkv2) {
        if (!Util.isNullOrNil(str) && !Util.isEqual(str, PERSERVED_NAME)) {
            return getMMKVReal(str, i, mmkv2);
        }
        Log.m105924i(TAG, "getMMKV name is illegal");
        return null;
    }

    public boolean decodeBool(String str, boolean z) {
        if (!isStingyMode()) {
            return this.mmkv.decodeBool(str, z);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean decodeBool = this.mmkv.decodeBool(str, z);
        this.readLock.unlock();
        return decodeBool;
    }

    public double decodeDouble(String str, double d) {
        if (!isStingyMode()) {
            return this.mmkv.decodeDouble(str, d);
        }
        this.readLock.lock();
        checkReopen(getName());
        double decodeDouble = this.mmkv.decodeDouble(str, d);
        this.readLock.unlock();
        return decodeDouble;
    }

    public float decodeFloat(String str, float f) {
        if (!isStingyMode()) {
            return this.mmkv.decodeFloat(str, f);
        }
        this.readLock.lock();
        checkReopen(getName());
        float decodeFloat = this.mmkv.decodeFloat(str, f);
        this.readLock.unlock();
        return decodeFloat;
    }

    public int decodeInt(String str, int i) {
        if (!isStingyMode()) {
            return this.mmkv.decodeInt(str, i);
        }
        this.readLock.lock();
        checkReopen(getName());
        int decodeInt = this.mmkv.decodeInt(str, i);
        this.readLock.unlock();
        return decodeInt;
    }

    public long decodeLong(String str, long j) {
        if (!isStingyMode()) {
            return this.mmkv.decodeLong(str, j);
        }
        this.readLock.lock();
        checkReopen(getName());
        long decodeLong = this.mmkv.decodeLong(str, j);
        this.readLock.unlock();
        return decodeLong;
    }

    public <T extends Parcelable> T decodeParcelable(String str, Class<T> cls, T t) {
        if (!isStingyMode()) {
            return this.mmkv.decodeParcelable(str, cls, t);
        }
        this.readLock.lock();
        checkReopen(getName());
        T decodeParcelable = this.mmkv.decodeParcelable(str, cls, t);
        this.readLock.unlock();
        return decodeParcelable;
    }

    public String decodeString(String str, String str2) {
        if (!isStingyMode()) {
            return this.mmkv.decodeString(str, str2);
        }
        this.readLock.lock();
        checkReopen(getName());
        String decodeString = this.mmkv.decodeString(str, str2);
        this.readLock.unlock();
        return decodeString;
    }

    public Set<String> decodeStringSet(String str, Set<String> set) {
        if (!isStingyMode()) {
            return this.mmkv.decodeStringSet(str, set);
        }
        this.readLock.lock();
        checkReopen(getName());
        Set<String> decodeStringSet = this.mmkv.decodeStringSet(str, set);
        this.readLock.unlock();
        return decodeStringSet;
    }

    private MultiProcessMMKV(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.readWriteLock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
        this.name = str;
    }

    public boolean encode(String str, int i) {
        if (!isLegal(str, Integer.valueOf(i))) {
            return false;
        }
        if (!isStingyMode()) {
            return this.mmkv.encode(str, i);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean encode = this.mmkv.encode(str, i);
        this.readLock.unlock();
        return encode;
    }

    public boolean encode(String str, long j) {
        if (!isLegal(str, Long.valueOf(j))) {
            return false;
        }
        if (!isStingyMode()) {
            return this.mmkv.encode(str, j);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean encode = this.mmkv.encode(str, j);
        this.readLock.unlock();
        return encode;
    }

    public boolean encode(String str, float f) {
        if (!isLegal(str, Float.valueOf(f))) {
            return false;
        }
        if (!isStingyMode()) {
            return this.mmkv.encode(str, f);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean encode = this.mmkv.encode(str, f);
        this.readLock.unlock();
        return encode;
    }

    public boolean encode(String str, double d) {
        if (!isLegal(str, Double.valueOf(d))) {
            return false;
        }
        if (!isStingyMode()) {
            return this.mmkv.encode(str, d);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean encode = this.mmkv.encode(str, d);
        this.readLock.unlock();
        return encode;
    }

    public boolean encode(String str, boolean z) {
        if (!isLegal(str, Boolean.valueOf(z))) {
            return false;
        }
        if (!isStingyMode()) {
            return this.mmkv.encode(str, z);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean encode = this.mmkv.encode(str, z);
        this.readLock.unlock();
        return encode;
    }

    public boolean encode(String str, Set<String> set) {
        if (!isLegal(str, set)) {
            return false;
        }
        if (!isStingyMode()) {
            return this.mmkv.encode(str, set);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean encode = this.mmkv.encode(str, set);
        this.readLock.unlock();
        return encode;
    }

    public boolean encode(String str, byte[] bArr) {
        if (!isLegal(str, bArr)) {
            return false;
        }
        if (!isStingyMode()) {
            return this.mmkv.encode(str, bArr);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean encode = this.mmkv.encode(str, bArr);
        this.readLock.unlock();
        return encode;
    }

    public boolean encode(String str, Parcelable parcelable) {
        if (!isLegal(str, parcelable)) {
            return false;
        }
        if (!isStingyMode()) {
            return this.mmkv.encode(str, parcelable);
        }
        this.readLock.lock();
        checkReopen(getName());
        boolean encode = this.mmkv.encode(str, parcelable);
        this.readLock.unlock();
        return encode;
    }
}
