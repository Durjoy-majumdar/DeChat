package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.LruCache;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import org.xmlpull.v1.XmlPullParserException;
import zt3.C119157j;

@Deprecated
/* renamed from: com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences */
public class MultiProcSharedPreferences implements SharedPreferences {
    private static final String TAG = "MicroMsg.MultiProcSharedPreferences";
    private static final Object mContent = new Object();
    /* access modifiers changed from: private */
    public static MMHandler mMainThreadHandler;
    private static final LruCache<String, MultiProcSharedPreferences> mSPCache = new LruCache<>(5);
    /* access modifiers changed from: private */
    public File mBackupFile;
    /* access modifiers changed from: private */
    public int mDiskWritesInFlight;
    /* access modifiers changed from: private */
    public File mFile;
    /* access modifiers changed from: private */
    public FLock mFileLock;
    /* access modifiers changed from: private */
    public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> mListeners;
    private boolean mLoaded;
    /* access modifiers changed from: private */
    public Map<String, Object> mMap;
    /* access modifiers changed from: private */
    public int mMode;
    /* access modifiers changed from: private */
    public boolean mShouldLockFile;
    /* access modifiers changed from: private */
    public long mStatSize;
    /* access modifiers changed from: private */
    public long mStatTimestamp;
    /* access modifiers changed from: private */
    public final Object mWritingToDiskLock;

    /* renamed from: com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences$DynamicConfigStorage */
    public static class DynamicConfigStorage {
        public static String PREF_KEY_IS_DISABLED_MULTIPROC_SP_MANUALLY = "pref_key_is_disabled_MultiProcSP_manually";
        public static String PREF_KEY_IS_ENABLE_MULTIPROC_SP = "pref_key_is_enable_MultiProcSP";
        private static final String PREF_NAME = "pref_MultiProcSP_dyncfg";
        private static SharedPreferences mPref = MMApplicationContext.getContext().getSharedPreferences(PREF_NAME, 4);

        private static boolean getValue(String str, boolean z) {
            reload();
            SharedPreferences sharedPreferences = mPref;
            if (sharedPreferences == null) {
                Log.m105928w(MultiProcSharedPreferences.TAG, "SharedPreferences in DynamicConfigStorage initialize failed.");
                return z;
            }
            boolean z2 = sharedPreferences.getBoolean(str, z);
            Log.m105919d(MultiProcSharedPreferences.TAG, "DynamicConfigStorage, getValue:%b", Boolean.valueOf(z2));
            return z2;
        }

        private static boolean isDisabledManually() {
            return getValue(PREF_KEY_IS_DISABLED_MULTIPROC_SP_MANUALLY, false);
        }

        public static boolean isEnabledMultiProcSP() {
            return !isDisabledManually() && getValue(PREF_KEY_IS_ENABLE_MULTIPROC_SP, false);
        }

        private static void reload() {
            mPref = MMApplicationContext.getContext().getSharedPreferences(PREF_NAME, 4);
        }

        public static void setDisabledFlagManually(boolean z) {
            setValue(PREF_KEY_IS_DISABLED_MULTIPROC_SP_MANUALLY, z);
        }

        public static void setValue(String str, boolean z) {
            SharedPreferences sharedPreferences = mPref;
            if (sharedPreferences == null) {
                Log.m105928w(MultiProcSharedPreferences.TAG, "SharedPreferences in DynamicConfigStorage initialize failed.");
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(str, z);
            edit.commit();
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences$EditorImpl */
    public final class EditorImpl implements SharedPreferences.Editor {
        private boolean mClear;
        private final Map<String, Object> mModified;

        private EditorImpl() {
            this.mModified = new HashMap();
            this.mClear = false;
        }

        private MemoryCommitResult commitToMemory() {
            Object obj;
            MemoryCommitResult memoryCommitResult = new MemoryCommitResult();
            synchronized (MultiProcSharedPreferences.this) {
                if (MultiProcSharedPreferences.this.mDiskWritesInFlight > 0) {
                    Map unused = MultiProcSharedPreferences.this.mMap = new HashMap(MultiProcSharedPreferences.this.mMap);
                }
                memoryCommitResult.mapToWriteToDisk = MultiProcSharedPreferences.this.mMap;
                MultiProcSharedPreferences.access$308(MultiProcSharedPreferences.this);
                boolean z = MultiProcSharedPreferences.this.mListeners.size() > 0;
                if (z) {
                    memoryCommitResult.keysModified = new ArrayList();
                    memoryCommitResult.listeners = new HashSet(MultiProcSharedPreferences.this.mListeners.keySet());
                }
                synchronized (this) {
                    if (this.mClear) {
                        if (!MultiProcSharedPreferences.this.mMap.isEmpty()) {
                            memoryCommitResult.changesMade = true;
                            MultiProcSharedPreferences.this.mMap.clear();
                        }
                        this.mClear = false;
                    }
                    for (Map.Entry next : this.mModified.entrySet()) {
                        String str = (String) next.getKey();
                        Object value = next.getValue();
                        if (value == this) {
                            if (MultiProcSharedPreferences.this.mMap.containsKey(str)) {
                                MultiProcSharedPreferences.this.mMap.remove(str);
                            }
                        } else if (!MultiProcSharedPreferences.this.mMap.containsKey(str) || (obj = MultiProcSharedPreferences.this.mMap.get(str)) == null || !obj.equals(value)) {
                            MultiProcSharedPreferences.this.mMap.put(str, value);
                        }
                        memoryCommitResult.changesMade = true;
                        if (z) {
                            memoryCommitResult.keysModified.add(str);
                        }
                    }
                    this.mModified.clear();
                }
            }
            return memoryCommitResult;
        }

        private FileOutputStream createFileOutputStream(File file) {
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                File parentFile = file.getParentFile();
                if (!parentFile.mkdir()) {
                    Log.m105920e(MultiProcSharedPreferences.TAG, "Couldn't create directory for SharedPreferences file " + file);
                    return null;
                }
                MultiProcSharedPreferences.setFilePermissionsFromMode(parentFile, MultiProcSharedPreferences.this.mMode);
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (FileNotFoundException e) {
                    Log.m105921e(MultiProcSharedPreferences.TAG, "Couldn't create SharedPreferences file " + file, e);
                    return null;
                }
            }
            return fileOutputStream;
        }

        private void enqueueDiskWrite(final MemoryCommitResult memoryCommitResult, final Runnable runnable) {
            C1159773 r0 = new Runnable() {
                public void run() {
                    synchronized (MultiProcSharedPreferences.this.mWritingToDiskLock) {
                        EditorImpl.this.writeToFile(memoryCommitResult);
                    }
                    synchronized (MultiProcSharedPreferences.this) {
                        MultiProcSharedPreferences.access$310(MultiProcSharedPreferences.this);
                    }
                    Runnable runnable = runnable;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            };
            boolean z = false;
            if (runnable == null) {
                synchronized (MultiProcSharedPreferences.this) {
                    if (MultiProcSharedPreferences.this.mDiskWritesInFlight == 1) {
                        z = true;
                    }
                }
                if (z) {
                    r0.run();
                    return;
                }
            }
            QueuedWork.singleThreadExecutor().execute(r0);
        }

        /* access modifiers changed from: private */
        public void notifyListeners(final MemoryCommitResult memoryCommitResult) {
            List<String> list;
            if (memoryCommitResult.listeners != null && (list = memoryCommitResult.keysModified) != null && list.size() != 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    for (int size = memoryCommitResult.keysModified.size() - 1; size >= 0; size--) {
                        String str = memoryCommitResult.keysModified.get(size);
                        for (SharedPreferences.OnSharedPreferenceChangeListener next : memoryCommitResult.listeners) {
                            if (next != null) {
                                next.onSharedPreferenceChanged(MultiProcSharedPreferences.this, str);
                            }
                        }
                    }
                    return;
                }
                MultiProcSharedPreferences.mMainThreadHandler.post(new Runnable() {
                    public void run() {
                        EditorImpl.this.notifyListeners(memoryCommitResult);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
            if (com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.access$1000(r5.this$0) == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.access$1100(r5.this$0).unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
            if (com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.access$1300(r5.this$0).exists() != false) goto L_0x00a3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
            if (com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.access$1200(r5.this$0).renameTo(com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.access$1300(r5.this$0)) != false) goto L_0x00b0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.TAG, "Couldn't rename file " + com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.access$1200(r5.this$0) + " to backup file " + com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.access$1300(r5.this$0));
            r6.setDiskWriteResult(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
            if (com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.access$1000(r5.this$0) == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.access$1100(r5.this$0).unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.access$1200(r5.this$0).delete();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void writeToFile(com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.MemoryCommitResult r6) {
            /*
                r5 = this;
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this
                boolean r0 = r0.mShouldLockFile
                r1 = 0
                if (r0 == 0) goto L_0x001d
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ Exception -> 0x0013 }
                com.tencent.mm.sdk.platformtools.FLock r0 = r0.mFileLock     // Catch:{ Exception -> 0x0013 }
                r0.lockWrite()     // Catch:{ Exception -> 0x0013 }
                goto L_0x001d
            L_0x0013:
                r0 = move-exception
                java.lang.String r2 = "MicroMsg.MultiProcSharedPreferences"
                java.lang.String r3 = ""
                java.lang.Object[] r4 = new java.lang.Object[r1]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
            L_0x001d:
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ all -> 0x018e }
                java.io.File r0 = r0.mFile     // Catch:{ all -> 0x018e }
                boolean r0 = r0.exists()     // Catch:{ all -> 0x018e }
                r2 = 1
                if (r0 == 0) goto L_0x00b0
                monitor-enter(r5)     // Catch:{ all -> 0x018e }
                boolean r0 = r6.changesMade     // Catch:{ all -> 0x00ad }
                if (r0 != 0) goto L_0x0045
                r6.setDiskWriteResult(r2)     // Catch:{ all -> 0x00ad }
                monitor-exit(r5)     // Catch:{ all -> 0x00ad }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r6 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this
                boolean r6 = r6.mShouldLockFile
                if (r6 == 0) goto L_0x0044
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r6 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ Exception -> 0x0044 }
                com.tencent.mm.sdk.platformtools.FLock r6 = r6.mFileLock     // Catch:{ Exception -> 0x0044 }
                r6.unlock()     // Catch:{ Exception -> 0x0044 }
            L_0x0044:
                return
            L_0x0045:
                monitor-exit(r5)     // Catch:{ all -> 0x00ad }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ all -> 0x018e }
                java.io.File r0 = r0.mBackupFile     // Catch:{ all -> 0x018e }
                boolean r0 = r0.exists()     // Catch:{ all -> 0x018e }
                if (r0 != 0) goto L_0x00a3
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ all -> 0x018e }
                java.io.File r0 = r0.mFile     // Catch:{ all -> 0x018e }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r3 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ all -> 0x018e }
                java.io.File r3 = r3.mBackupFile     // Catch:{ all -> 0x018e }
                boolean r0 = r0.renameTo(r3)     // Catch:{ all -> 0x018e }
                if (r0 != 0) goto L_0x00b0
                java.lang.String r0 = "MicroMsg.MultiProcSharedPreferences"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x018e }
                r2.<init>()     // Catch:{ all -> 0x018e }
                java.lang.String r3 = "Couldn't rename file "
                r2.append(r3)     // Catch:{ all -> 0x018e }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r3 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ all -> 0x018e }
                java.io.File r3 = r3.mFile     // Catch:{ all -> 0x018e }
                r2.append(r3)     // Catch:{ all -> 0x018e }
                java.lang.String r3 = " to backup file "
                r2.append(r3)     // Catch:{ all -> 0x018e }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r3 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ all -> 0x018e }
                java.io.File r3 = r3.mBackupFile     // Catch:{ all -> 0x018e }
                r2.append(r3)     // Catch:{ all -> 0x018e }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x018e }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ all -> 0x018e }
                r6.setDiskWriteResult(r1)     // Catch:{ all -> 0x018e }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r6 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this
                boolean r6 = r6.mShouldLockFile
                if (r6 == 0) goto L_0x00a2
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r6 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ Exception -> 0x00a2 }
                com.tencent.mm.sdk.platformtools.FLock r6 = r6.mFileLock     // Catch:{ Exception -> 0x00a2 }
                r6.unlock()     // Catch:{ Exception -> 0x00a2 }
            L_0x00a2:
                return
            L_0x00a3:
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ all -> 0x018e }
                java.io.File r0 = r0.mFile     // Catch:{ all -> 0x018e }
                r0.delete()     // Catch:{ all -> 0x018e }
                goto L_0x00b0
            L_0x00ad:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x00ad }
                throw r6     // Catch:{ all -> 0x018e }
            L_0x00b0:
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                java.io.File r0 = r0.mFile     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                java.io.FileOutputStream r0 = r5.createFileOutputStream(r0)     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                if (r0 != 0) goto L_0x00d1
                r6.setDiskWriteResult(r1)     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r6 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this
                boolean r6 = r6.mShouldLockFile
                if (r6 == 0) goto L_0x00d0
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r6 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ Exception -> 0x00d0 }
                com.tencent.mm.sdk.platformtools.FLock r6 = r6.mFileLock     // Catch:{ Exception -> 0x00d0 }
                r6.unlock()     // Catch:{ Exception -> 0x00d0 }
            L_0x00d0:
                return
            L_0x00d1:
                java.util.Map<java.lang.String, java.lang.Object> r3 = r6.mapToWriteToDisk     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                com.tencent.p014mm.sdk.platformtools.XmlUtils.writeMapXml(r3, r0)     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                r3.sync()     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                r0.close()     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                java.io.File r0 = r0.mFile     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r3 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                int r3 = r3.mMode     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.setFilePermissionsFromMode(r0, r3)     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                monitor-enter(r5)     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ all -> 0x0129 }
                java.io.File r3 = r0.mFile     // Catch:{ all -> 0x0129 }
                long r3 = r3.lastModified()     // Catch:{ all -> 0x0129 }
                long unused = r0.mStatTimestamp = r3     // Catch:{ all -> 0x0129 }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ all -> 0x0129 }
                java.io.File r3 = r0.mFile     // Catch:{ all -> 0x0129 }
                long r3 = r3.length()     // Catch:{ all -> 0x0129 }
                long unused = r0.mStatSize = r3     // Catch:{ all -> 0x0129 }
                monitor-exit(r5)     // Catch:{ all -> 0x0129 }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                java.io.File r0 = r0.mBackupFile     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                r0.delete()     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                r6.setDiskWriteResult(r2)     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r6 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this
                boolean r6 = r6.mShouldLockFile
                if (r6 == 0) goto L_0x0128
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r6 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ Exception -> 0x0128 }
                com.tencent.mm.sdk.platformtools.FLock r6 = r6.mFileLock     // Catch:{ Exception -> 0x0128 }
                r6.unlock()     // Catch:{ Exception -> 0x0128 }
            L_0x0128:
                return
            L_0x0129:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0129 }
                throw r0     // Catch:{ XmlPullParserException -> 0x0139, IOException -> 0x012c }
            L_0x012c:
                r0 = move-exception
                java.lang.String r3 = "MicroMsg.MultiProcSharedPreferences"
                java.lang.String r4 = "writeToFile: Got exception:"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x018e }
                r2[r1] = r0     // Catch:{ all -> 0x018e }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r4, r2)     // Catch:{ all -> 0x018e }
                goto L_0x0145
            L_0x0139:
                r0 = move-exception
                java.lang.String r3 = "MicroMsg.MultiProcSharedPreferences"
                java.lang.String r4 = "writeToFile: Got exception:"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x018e }
                r2[r1] = r0     // Catch:{ all -> 0x018e }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r4, r2)     // Catch:{ all -> 0x018e }
            L_0x0145:
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ all -> 0x018e }
                java.io.File r0 = r0.mFile     // Catch:{ all -> 0x018e }
                boolean r0 = r0.exists()     // Catch:{ all -> 0x018e }
                if (r0 == 0) goto L_0x0179
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ all -> 0x018e }
                java.io.File r0 = r0.mFile     // Catch:{ all -> 0x018e }
                boolean r0 = r0.delete()     // Catch:{ all -> 0x018e }
                if (r0 != 0) goto L_0x0179
                java.lang.String r0 = "MicroMsg.MultiProcSharedPreferences"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x018e }
                r2.<init>()     // Catch:{ all -> 0x018e }
                java.lang.String r3 = "Couldn't clean up partially-written file "
                r2.append(r3)     // Catch:{ all -> 0x018e }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r3 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ all -> 0x018e }
                java.io.File r3 = r3.mFile     // Catch:{ all -> 0x018e }
                r2.append(r3)     // Catch:{ all -> 0x018e }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x018e }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ all -> 0x018e }
            L_0x0179:
                r6.setDiskWriteResult(r1)     // Catch:{ all -> 0x018e }
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r6 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this
                boolean r6 = r6.mShouldLockFile
                if (r6 == 0) goto L_0x018d
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r6 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ Exception -> 0x018d }
                com.tencent.mm.sdk.platformtools.FLock r6 = r6.mFileLock     // Catch:{ Exception -> 0x018d }
                r6.unlock()     // Catch:{ Exception -> 0x018d }
            L_0x018d:
                return
            L_0x018e:
                r6 = move-exception
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this
                boolean r0 = r0.mShouldLockFile
                if (r0 == 0) goto L_0x01a0
                com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.this     // Catch:{ Exception -> 0x01a0 }
                com.tencent.mm.sdk.platformtools.FLock r0 = r0.mFileLock     // Catch:{ Exception -> 0x01a0 }
                r0.unlock()     // Catch:{ Exception -> 0x01a0 }
            L_0x01a0:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.EditorImpl.writeToFile(com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences$MemoryCommitResult):void");
        }

        public void apply() {
            final MemoryCommitResult commitToMemory = commitToMemory();
            final C1159751 r1 = new Runnable() {
                public void run() {
                    try {
                        commitToMemory.writtenToDiskLatch.await();
                    } catch (InterruptedException unused) {
                    }
                }
            };
            QueuedWork.add(r1);
            enqueueDiskWrite(commitToMemory, new Runnable() {
                public void run() {
                    r1.run();
                    QueuedWork.remove(r1);
                }
            });
            notifyListeners(commitToMemory);
        }

        public SharedPreferences.Editor clear() {
            synchronized (this) {
                this.mClear = true;
            }
            return this;
        }

        public boolean commit() {
            MemoryCommitResult commitToMemory = commitToMemory();
            enqueueDiskWrite(commitToMemory, (Runnable) null);
            try {
                commitToMemory.writtenToDiskLatch.await();
                notifyListeners(commitToMemory);
                return commitToMemory.writeToDiskResult;
            } catch (InterruptedException unused) {
                return false;
            }
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            synchronized (this) {
                this.mModified.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            synchronized (this) {
                this.mModified.put(str, Float.valueOf(f));
            }
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            synchronized (this) {
                this.mModified.put(str, Integer.valueOf(i));
            }
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            synchronized (this) {
                this.mModified.put(str, Long.valueOf(j));
            }
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            synchronized (this) {
                this.mModified.put(str, str2);
            }
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            synchronized (this) {
                this.mModified.put(str, set);
            }
            return this;
        }

        public SharedPreferences.Editor remove(String str) {
            synchronized (this) {
                this.mModified.put(str, this);
            }
            return this;
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MultiProcSharedPreferences$MemoryCommitResult */
    public static class MemoryCommitResult {
        public boolean changesMade;
        public List<String> keysModified;
        public Set<SharedPreferences.OnSharedPreferenceChangeListener> listeners;
        public Map<String, Object> mapToWriteToDisk;
        public volatile boolean writeToDiskResult;
        public final CountDownLatch writtenToDiskLatch;

        private MemoryCommitResult() {
            this.changesMade = false;
            this.keysModified = null;
            this.listeners = null;
            this.mapToWriteToDisk = null;
            this.writtenToDiskLatch = new CountDownLatch(1);
            this.writeToDiskResult = false;
        }

        public void setDiskWriteResult(boolean z) {
            this.writeToDiskResult = z;
            this.writtenToDiskLatch.countDown();
        }
    }

    private MultiProcSharedPreferences() {
        this.mFileLock = null;
        this.mFile = null;
        this.mBackupFile = null;
        this.mMode = 0;
        this.mShouldLockFile = false;
        this.mMap = null;
        this.mDiskWritesInFlight = 0;
        this.mLoaded = false;
        this.mStatTimestamp = 0;
        this.mStatSize = 0;
        this.mWritingToDiskLock = new Object();
        this.mListeners = new WeakHashMap<>();
        throw new RuntimeException("Not supported.");
    }

    public static /* synthetic */ int access$308(MultiProcSharedPreferences multiProcSharedPreferences) {
        int i = multiProcSharedPreferences.mDiskWritesInFlight;
        multiProcSharedPreferences.mDiskWritesInFlight = i + 1;
        return i;
    }

    public static /* synthetic */ int access$310(MultiProcSharedPreferences multiProcSharedPreferences) {
        int i = multiProcSharedPreferences.mDiskWritesInFlight;
        multiProcSharedPreferences.mDiskWritesInFlight = i - 1;
        return i;
    }

    private void awaitLoadedLocked() {
        while (!this.mLoaded) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public static SharedPreferences getSharedPreferences(Context context, String str, int i, boolean z) {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(str);
        if (DynamicConfigStorage.isEnabledMultiProcSP()) {
            Log.m105925i(TAG, "sp: %s, use Flock version MultiProcessSP.", str);
            LruCache<String, MultiProcSharedPreferences> lruCache = mSPCache;
            MultiProcSharedPreferences multiProcSharedPreferences = lruCache.get(str);
            if (multiProcSharedPreferences == null) {
                multiProcSharedPreferences = new MultiProcSharedPreferences(context, str, i);
                lruCache.put(str, multiProcSharedPreferences);
            } else if ((i & 4) != 0) {
                if (z) {
                    multiProcSharedPreferences.startLoadFromDisk();
                } else {
                    multiProcSharedPreferences.startReloadIfChangedUnexpectedly();
                }
            }
            MultiProcessMMKV.transport2MMKV(multiProcSharedPreferences, mmkv);
            return mmkv;
        }
        Log.m105925i(TAG, "sp: %s, use system sp.", str);
        return context.getSharedPreferences(str, i);
    }

    private File getSharedPrefsDir(Context context) {
        String str = context.getApplicationInfo().dataDir;
        if (str == null || str.length() == 0) {
            Log.m105928w(TAG, "Failed to retrive data path by ApplicationInfo.dataDir, use prefix hardcoded version instead.");
            str = context.getCacheDir().getParent();
        }
        Log.m105924i(TAG, "Path to store sp data: " + str);
        File file = new File(str, "shared_prefs");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.canRead() || !file.canWrite()) {
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
        return file;
    }

    private boolean hasFileChangedUnexpectedly() {
        if (this.mDiskWritesInFlight > 0) {
            return false;
        }
        return (this.mStatTimestamp == this.mFile.lastModified() && this.mStatSize == this.mFile.length()) ? false : true;
    }

    /* access modifiers changed from: private */
    public void loadFromDiskLocked() {
        if (this.mShouldLockFile) {
            try {
                this.mFileLock.lockRead();
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        try {
            if (!this.mLoaded) {
                if (this.mBackupFile.exists()) {
                    this.mFile.delete();
                    this.mBackupFile.renameTo(this.mFile);
                }
                if (this.mFile.exists() && !this.mFile.canRead()) {
                    Log.m105928w(TAG, "Attempt to read preferences file " + this.mFile + " without permission");
                }
                HashMap<String, Object> hashMap = null;
                if (this.mFile.canRead()) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.mFile), 16384);
                    hashMap = XmlUtils.readMapXml(bufferedInputStream);
                    bufferedInputStream.close();
                }
                this.mLoaded = true;
                if (hashMap != null) {
                    this.mMap = hashMap;
                    this.mStatTimestamp = this.mFile.lastModified();
                    this.mStatSize = this.mFile.length();
                } else {
                    this.mMap = new HashMap();
                }
                notifyAll();
                if (this.mShouldLockFile) {
                    try {
                        this.mFileLock.unlock();
                    } catch (Exception unused) {
                    }
                }
            } else if (this.mShouldLockFile) {
                try {
                    this.mFileLock.unlock();
                } catch (Exception unused2) {
                }
            }
        } catch (XmlPullParserException e2) {
            Log.m105929w(TAG, "getSharedPreferences", e2);
        } catch (FileNotFoundException e3) {
            Log.m105929w(TAG, "getSharedPreferences", e3);
        } catch (IOException e4) {
            Log.m105929w(TAG, "getSharedPreferences", e4);
        } catch (Throwable th) {
            if (this.mShouldLockFile) {
                try {
                    this.mFileLock.unlock();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    private File makeBackupFile(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* access modifiers changed from: private */
    public static void setFilePermissionsFromMode(File file, int i) {
        boolean z = false;
        file.setReadable(true, (i & 1) == 0);
        if ((i & 2) == 0) {
            z = true;
        }
        file.setWritable(true, z);
    }

    private void startLoadFromDisk() {
        synchronized (this) {
            this.mLoaded = false;
        }
        ((C119157j) C119157j.f356862d).mo183884o(new Runnable() {
            public void run() {
                synchronized (MultiProcSharedPreferences.this) {
                    MultiProcSharedPreferences.this.loadFromDiskLocked();
                }
            }
        });
    }

    public boolean contains(String str) {
        boolean containsKey;
        synchronized (this) {
            awaitLoadedLocked();
            containsKey = this.mMap.containsKey(str);
        }
        return containsKey;
    }

    public SharedPreferences.Editor edit() {
        synchronized (this) {
            awaitLoadedLocked();
        }
        return new EditorImpl();
    }

    public Map<String, ?> getAll() {
        HashMap hashMap;
        synchronized (this) {
            awaitLoadedLocked();
            hashMap = new HashMap(this.mMap);
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        synchronized (this) {
            awaitLoadedLocked();
            Boolean bool = (Boolean) this.mMap.get(str);
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }

    public float getFloat(String str, float f) {
        synchronized (this) {
            awaitLoadedLocked();
            Float f2 = (Float) this.mMap.get(str);
            if (f2 != null) {
                f = f2.floatValue();
            }
        }
        return f;
    }

    public int getInt(String str, int i) {
        synchronized (this) {
            awaitLoadedLocked();
            Integer num = (Integer) this.mMap.get(str);
            if (num != null) {
                i = num.intValue();
            }
        }
        return i;
    }

    public long getLong(String str, long j) {
        synchronized (this) {
            awaitLoadedLocked();
            Long l = (Long) this.mMap.get(str);
            if (l != null) {
                j = l.longValue();
            }
        }
        return j;
    }

    public String getString(String str, String str2) {
        synchronized (this) {
            awaitLoadedLocked();
            String str3 = (String) this.mMap.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        synchronized (this) {
            awaitLoadedLocked();
            Set<String> set2 = (Set) this.mMap.get(str);
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            this.mListeners.put(onSharedPreferenceChangeListener, mContent);
        }
    }

    public void startReloadIfChangedUnexpectedly() {
        synchronized (this) {
            if (hasFileChangedUnexpectedly()) {
                startLoadFromDisk();
            }
        }
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            this.mListeners.remove(onSharedPreferenceChangeListener);
        }
    }

    private MultiProcSharedPreferences(Context context, String str, int i) {
        this.mFileLock = null;
        this.mFile = null;
        this.mBackupFile = null;
        boolean z = false;
        this.mMode = 0;
        this.mShouldLockFile = false;
        this.mMap = null;
        this.mDiskWritesInFlight = 0;
        this.mLoaded = false;
        this.mStatTimestamp = 0;
        this.mStatSize = 0;
        this.mWritingToDiskLock = new Object();
        this.mListeners = new WeakHashMap<>();
        Context applicationContext = context.getApplicationContext();
        if (mMainThreadHandler == null) {
            mMainThreadHandler = new MMHandler(Looper.getMainLooper());
        }
        File sharedPrefsDir = getSharedPrefsDir(applicationContext);
        File file = new File(sharedPrefsDir, str + ".xml");
        this.mFile = file;
        this.mBackupFile = makeBackupFile(file);
        this.mMode = i;
        z = (i & 4) != 0 ? true : z;
        this.mShouldLockFile = z;
        if (z) {
            this.mFileLock = new FLock(this.mFile.getPath() + ".lock", true);
        }
        startLoadFromDisk();
    }
}
