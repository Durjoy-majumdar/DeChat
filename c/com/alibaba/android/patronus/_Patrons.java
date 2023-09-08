package com.alibaba.android.patronus;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.alibaba.android.patronus.Patrons;
import com.alibaba.android.patronus.util.Log;
import j20.C117292a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import k20.C9556a;

public class _Patrons {
    private static final int ANDROID_VERSION_NOT_SUPPORT = 2001;
    private static final int ERROR_READ_VSS_FAILED = 1001;

    /* renamed from: GB */
    private static final long f45761GB = 1073741824;
    private static final int HEAP_SIZE_IS_NOT_BIG_ENOUGH = 2002;

    /* renamed from: KB */
    private static final long f45762KB = 1024;
    private static final int LOWER_LIMIT_IS_TOO_SMALL = 2003;
    private static final int MAX_CHECK_OF_STRICT_MODE = 5;

    /* renamed from: MB */
    private static final long f45763MB = 1048576;
    private static final boolean[] NATIVE_LIB_LOADED;

    /* renamed from: S */
    private static final long f45764S = 1000;
    public static final String TAG = "Patrons";
    private static final int VERSION_CODES_R = 30;
    private static final float VSS_MAX_IN_V7A = 4.2949673E9f;
    private static Timer autoCheckVssTimer = null;
    /* access modifiers changed from: private */
    public static Patrons.PatronsConfig config = new Patrons.PatronsConfig();
    /* access modifiers changed from: private */
    public static long currentRegionSpaces = 0;
    private static final Pattern numPattern = Pattern.compile(numRegEx);
    private static final String numRegEx = "[^0-9]";
    /* access modifiers changed from: private */
    public static final AtomicInteger strictCount = new AtomicInteger(0);
    private byte _hellAccFlag_;

    public static class AutoCheckerTask extends TimerTask {
        public void run() {
            if (_Patrons.strictCount.get() != 0 && _Patrons.strictCount.addAndGet(1) > 5) {
                _Patrons.strictCount.set(0);
                Log.m16627i(_Patrons.TAG, "exit strict mode after check 5 times");
                _Patrons._start(_Patrons.config.periodOfCheck);
            }
            long readVssSize = _Patrons.readVssSize();
            float currentMaxAvailableVmAddr = (float) (((double) readVssSize) / ((double) _Patrons.getCurrentMaxAvailableVmAddr()));
            if (_Patrons.currentRegionSpaces - ((long) _Patrons.config.shrinkStep) < ((long) _Patrons.config.lowerLimit)) {
                Log.m16623e(_Patrons.TAG, "vss has no space to resize, stop watching. current space = " + _Patrons.currentRegionSpaces);
                _Patrons.stop();
            } else if (currentMaxAvailableVmAddr > _Patrons.config.periodOfShrink) {
                Log.m16627i(_Patrons.TAG, "vss has over the period, current vss = " + (readVssSize / _Patrons.f45763MB) + "mb, period = " + currentMaxAvailableVmAddr);
                if (!_Patrons.shrinkRegionSpace((int) _Patrons.currentRegionSpaces = _Patrons.currentRegionSpaces - ((long) _Patrons.config.shrinkStep))) {
                    Log.m16623e(_Patrons.TAG, "vss resize failed, stop watching.");
                    _Patrons.stop();
                    return;
                }
                long readVssSize2 = _Patrons.readVssSize();
                Log.m16627i(_Patrons.TAG, "resize success, step = " + _Patrons.config.shrinkStep + "mb, current vss = " + (readVssSize2 / _Patrons.f45763MB) + "mb");
                Log.m16627i(_Patrons.TAG, "enter strict mode after resize");
                _Patrons.strictCount.set(1);
                _Patrons._start(_Patrons.config.periodOfCheck / 2);
            } else if (_Patrons.getCurrentRegionSpaceSize() / _Patrons.f45763MB < ((long) _Patrons.config.lowerLimit)) {
                Log.m16623e(_Patrons.TAG, "current heap size (" + (_Patrons.getCurrentRegionSpaceSize() / _Patrons.f45763MB) + ") less than lower limit (" + _Patrons.config.lowerLimit + ") stop watching.");
                _Patrons.stop();
            } else if (_Patrons.config.debuggable) {
                Log.m16627i(_Patrons.TAG, "[" + _Patrons.strictCount.get() + "] every thing is OK, vss = " + (readVssSize / _Patrons.f45763MB) + " mb, current period = " + currentMaxAvailableVmAddr + ", heap = " + (_Patrons.getCurrentRegionSpaceSize() / _Patrons.f45763MB) + " mb");
            }
        }
    }

    static {
        boolean[] zArr = {false};
        NATIVE_LIB_LOADED = zArr;
        if (isSupport()) {
            synchronized (zArr) {
                C9556a aVar = new C9556a();
                aVar.mo10233c("patrons");
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/alibaba/android/patronus/_Patrons", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                System.loadLibrary((String) aVar.mo10231a(0));
                C117292a.m165359e(obj, "com/alibaba/android/patronus/_Patrons", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                zArr[0] = true;
            }
        }
    }

    private _Patrons() {
    }

    public static synchronized int __init() {
        synchronized (_Patrons.class) {
            if (!isSupport()) {
                Log.m16623e(TAG, "patrons init failed, android version or abi not match !");
                return 2001;
            }
            Patrons.PatronsConfig patronsConfig = config;
            int __init = __init(true, patronsConfig.debuggable, patronsConfig.fixHuaweiBinderAbort);
            if (__init != 0) {
                Log.m16623e(TAG, "patrons native init failed !");
                return __init;
            }
            long currentRegionSpaceSize = getCurrentRegionSpaceSize() / f45763MB;
            currentRegionSpaces = currentRegionSpaceSize;
            if (currentRegionSpaceSize > 0) {
                if (currentRegionSpaceSize <= 1024) {
                    Patrons.PatronsConfig patronsConfig2 = config;
                    if (currentRegionSpaceSize < ((long) patronsConfig2.lowerLimit)) {
                        return 2003;
                    }
                    if (patronsConfig2.auto) {
                        if (readVssSize() < 0) {
                            Log.m16623e(TAG, "patrons read vss failed !");
                            return 1001;
                        }
                        toForeground();
                    }
                    Log.m16627i(TAG, "patrons init finish, vss = " + (readVssSize() / f45763MB) + " mb, heap = " + currentRegionSpaces + " mb");
                    return 0;
                }
            }
            return 2002;
        }
    }

    private static native int __init(boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: private */
    public static void _start(int i) {
        if (config.auto) {
            Timer timer = autoCheckVssTimer;
            if (timer != null) {
                timer.cancel();
                autoCheckVssTimer = null;
            }
            Timer timer2 = new Timer();
            autoCheckVssTimer = timer2;
            long j = 1000 * ((long) i);
            timer2.schedule(new AutoCheckerTask(), j, j);
        }
    }

    private static void asyncWriteInitResultToFile(final Context context, final int i) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    String str = context.getDir("patrons", 0).getAbsolutePath() + File.separator;
                    _Patrons.stringToFile(String.valueOf(i), str + "code.txt");
                    if (i != 0) {
                        _Patrons.stringToFile(_Patrons.dumpNativeLogs(), str + "msg.txt");
                    }
                } catch (Exception e) {
                    Log.m16624e(_Patrons.TAG, "record init result failed, code = " + i, e);
                }
            }
        }).start();
    }

    public static native String dumpLogs();

    public static String dumpNativeLogs() {
        return isNativeLibLoaded() ? dumpLogs() : "can not dump logs without native libs";
    }

    public static native long getCurrentMaxAvailableVmAddr();

    public static native long getCurrentRegionSpaceSize();

    public static void inBackground() {
        Timer timer;
        if (config.auto && (timer = autoCheckVssTimer) != null) {
            timer.cancel();
            autoCheckVssTimer = null;
        }
    }

    public static synchronized int init(Context context, Patrons.PatronsConfig patronsConfig) {
        int __init;
        synchronized (_Patrons.class) {
            if (patronsConfig != null) {
                config = patronsConfig;
            }
            Log.m16627i(TAG, "patrons start init, config = " + config.toString());
            __init = __init();
            if (config.recordInitResult) {
                asyncWriteInitResultToFile(context, __init);
            }
        }
        return __init;
    }

    public static boolean isNativeLibLoaded() {
        boolean z;
        boolean[] zArr = NATIVE_LIB_LOADED;
        synchronized (zArr) {
            z = zArr[0];
        }
        return z;
    }

    private static boolean isSupport() {
        int i = Build.VERSION.SDK_INT;
        return i >= 26 && i <= 30 && !Process.is64Bit();
    }

    public static long readVssSize() {
        long j = -1;
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/status");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String lowerCase = readLine.toLowerCase();
                if (lowerCase.contains("vmsize")) {
                    j = ((long) Integer.parseInt(numPattern.matcher(lowerCase).replaceAll("").trim())) * 1024;
                    break;
                }
            }
            fileInputStream.close();
            bufferedReader.close();
        } catch (Exception unused) {
            Log.m16623e(TAG, "read current status failed.");
        }
        return j;
    }

    public static native boolean shrinkRegionSpace(int i);

    /* access modifiers changed from: private */
    public static void stop() {
        inBackground();
        config.auto = false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r1 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void stringToFile(java.lang.String r2, java.lang.String r3) {
        /*
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0032 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0032 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0032 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r1.<init>()     // Catch:{ all -> 0x0026 }
            r1.append(r2)     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "\n\n"
            r1.append(r2)     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0026 }
            byte[] r2 = r2.getBytes()     // Catch:{ all -> 0x0026 }
            r0.write(r2)     // Catch:{ all -> 0x0026 }
            r0.close()     // Catch:{ Exception -> 0x0032 }
            goto L_0x0055
        L_0x0026:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x002d }
            goto L_0x0031
        L_0x002d:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ Exception -> 0x0032 }
        L_0x0031:
            throw r1     // Catch:{ Exception -> 0x0032 }
        L_0x0032:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "write content to file: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " failed."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "Patrons"
            com.alibaba.android.patronus.util.Log.m16624e((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object[]) r0)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.patronus._Patrons.stringToFile(java.lang.String, java.lang.String):void");
    }

    public static void toForeground() {
        strictCount.set(0);
        _start(config.periodOfCheck);
    }
}
