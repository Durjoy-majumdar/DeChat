package com.tencent.xweb.pinus;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.xweb.LibraryLoader;
import com.tencent.xweb.XWebChildProcessMonitor;
import com.tencent.xweb.XWebClassLoaderWrapper;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.pinus.sdk.JNIUtils;
import com.tencent.xweb.pinus.sdk.library_loader.Linker;
import com.tencent.xweb.report.KVReportForChildProcessException;
import com.tencent.xweb.report.KVReportForChildProcessService;
import com.tencent.xweb.report.KVReportForMultiProcessDowngrade;
import com.tencent.xweb.util.NumberUtil;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebLog;
import dalvik.system.InMemoryDexClassLoader;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.xwalk.core.XWalkEnvironment;

public class ChildProcessServiceWrapper {
    public static final String EXTRA_APK_VERSION = "org.chromium.base.process_launcher.extra.apk_version";
    public static final String EXTRA_PROCESS_NAME = "org.chromium.base.process_launcher.extra.process_name";
    private static final int PRE_CONNECTION_CODE_CHILD_PROCESS_DEX_FD = 4;
    private static final int PRE_CONNECTION_CODE_CRASH_DUMP_FD = 2;
    private static final int PRE_CONNECTION_CODE_CUSTOM_FONT_FD = 3;
    private static final int PRE_CONNECTION_CODE_DEX_FD = 0;
    private static final int PRE_CONNECTION_CODE_SO_FD = 1;
    public static final String PROCESS_TYPE_GPU = "gpu";
    public static final String PROCESS_TYPE_RENDER = "render";
    private static final String TAG = "ChildProcessServiceWrapper";
    private final String mApkVersion;
    private final String mBrowserProcessName;
    private Object mChildProcessService;
    private Class<?> mChildProcessServiceClass;
    private ClassLoader mClassLoader;
    private boolean mIsIsolatedProcess;
    private final String mServiceName;
    private boolean mSupportChildProcessApk;

    public ChildProcessServiceWrapper(Intent intent, Service service, Context context) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        IBinder iBinder;
        String str;
        Service service2 = service;
        Context context2 = context;
        long currentTimeMillis = System.currentTimeMillis();
        String simpleName = service.getClass().getSimpleName();
        this.mServiceName = simpleName;
        Bundle extras = intent.getExtras();
        String string = extras.getString(EXTRA_APK_VERSION, "");
        this.mApkVersion = string;
        String string2 = extras.getString(EXTRA_PROCESS_NAME, context.getPackageName());
        this.mBrowserProcessName = string2;
        IBinder binder = extras.getBinder("preConnection");
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            this.mIsIsolatedProcess = isIsolatedProcess();
            XWebLog.m21911i(TAG, "create, isIsolatedProcess:" + this.mIsIsolatedProcess + ", browserProcess:" + string2 + ", serviceName:" + simpleName);
            long j6 = currentTimeMillis;
            String str2 = string;
            String str3 = string2;
            String str4 = "InvalidClassLoader";
            if (this.mIsIsolatedProcess) {
                long currentTimeMillis2 = System.currentTimeMillis();
                binder.transact(2, obtain, obtain2, 0);
                if (obtain2.readInt() == 1) {
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obtain2.readParcelable(getClass().getClassLoader());
                    ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) obtain2.readParcelable(getClass().getClassLoader());
                    if (XWebChildProcessHelper.getCrashDumpFileCallback() != null) {
                        XWebChildProcessHelper.getCrashDumpFileCallback().setupIsolatedProcessCrashDumpFiles(parcelFileDescriptor, parcelFileDescriptor2);
                    } else {
                        XWebLog.m21913w(TAG, "create, crash dump callback is null");
                    }
                }
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                long currentTimeMillis4 = System.currentTimeMillis();
                binder.transact(4, obtain, obtain2, 0);
                boolean z = true;
                if (obtain2.readInt() != 1) {
                    z = false;
                }
                this.mSupportChildProcessApk = z;
                XWebLog.m21913w(TAG, "create, supportChildProcessApk:" + this.mSupportChildProcessApk);
                if (!this.mSupportChildProcessApk) {
                    binder.transact(0, obtain, obtain2, 0);
                }
                ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor) obtain2.readParcelable(getClass().getClassLoader());
                IBinder iBinder2 = binder;
                Os.lseek(parcelFileDescriptor3.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                ByteBuffer[] readDexFileFromApk = readDexFileFromApk(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor3));
                StringBuilder sb = new StringBuilder();
                sb.append("create, Build.VERSION.SDK_INT:");
                int i = Build.VERSION.SDK_INT;
                sb.append(i);
                XWebLog.m21913w(TAG, sb.toString());
                if (i >= 27) {
                    this.mClassLoader = new InMemoryDexClassLoader(readDexFileFromApk, ClassLoader.getSystemClassLoader());
                } else if (i == 26) {
                    this.mClassLoader = ClassLoader.getSystemClassLoader();
                    int length = readDexFileFromApk.length;
                    int i2 = 0;
                    while (i2 < length) {
                        this.mClassLoader = new InMemoryDexClassLoader(readDexFileFromApk[i2], this.mClassLoader);
                        i2++;
                        readDexFileFromApk = readDexFileFromApk;
                    }
                }
                if (this.mClassLoader != null) {
                    XWebLog.m21911i(TAG, "create, dexClassLoader:" + this.mClassLoader);
                    long currentTimeMillis5 = System.currentTimeMillis() - currentTimeMillis4;
                    XWebLog.m21911i(TAG, "create, class loader costTime:" + currentTimeMillis5);
                    long currentTimeMillis6 = System.currentTimeMillis();
                    createChildProcessService(service2, context2);
                    long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis6;
                    XWebLog.m21911i(TAG, "create, child process service costTime:" + currentTimeMillis7);
                    long currentTimeMillis8 = System.currentTimeMillis();
                    IBinder iBinder3 = iBinder2;
                    loadXWebLibraryInIsolatedProcess(context2, iBinder3, obtain, obtain2);
                    long currentTimeMillis9 = System.currentTimeMillis() - currentTimeMillis8;
                    XWebLog.m21911i(TAG, "create, load native library costTime:" + currentTimeMillis9);
                    long currentTimeMillis10 = System.currentTimeMillis();
                    setCustomFont(iBinder3, obtain, obtain2);
                    j5 = currentTimeMillis5;
                    j = currentTimeMillis7;
                    j2 = System.currentTimeMillis() - currentTimeMillis10;
                    j4 = currentTimeMillis9;
                    j3 = currentTimeMillis3;
                } else {
                    XWebLog.m21909e(TAG, "create, class loader is null");
                    throw new IllegalStateException(str4);
                }
            } else {
                String str5 = str4;
                XWalkEnvironment.init(context);
                String processType = getProcessType();
                long currentTimeMillis11 = System.currentTimeMillis();
                String str6 = str5;
                if (XWebChildProcessHelper.getCrashDumpFileCallback() == null) {
                    str = "create, class loader is null";
                    iBinder = binder;
                    XWebLog.m21913w(TAG, "create, crash dump callback is null");
                } else if (PROCESS_TYPE_RENDER.equals(processType)) {
                    str = "create, class loader is null";
                    iBinder = binder;
                    XWebChildProcessHelper.getCrashDumpFileCallback().setupChildProcessCrashDumpFiles(str3, XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX_FOR_RENDER_UNSANDBOX);
                } else {
                    str = "create, class loader is null";
                    iBinder = binder;
                    String str7 = str3;
                    if (PROCESS_TYPE_GPU.equalsIgnoreCase(processType)) {
                        XWebChildProcessHelper.getCrashDumpFileCallback().setupChildProcessCrashDumpFiles(str7, XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX_FOR_GPU);
                    }
                }
                long currentTimeMillis12 = System.currentTimeMillis() - currentTimeMillis11;
                long currentTimeMillis13 = System.currentTimeMillis();
                ClassLoader childProcessDexClassLoader = XWebClassLoaderWrapper.getChildProcessDexClassLoader(Integer.parseInt(str2));
                this.mClassLoader = childProcessDexClassLoader;
                this.mSupportChildProcessApk = childProcessDexClassLoader != null;
                XWebLog.m21913w(TAG, "create, supportChildProcessApk:" + this.mSupportChildProcessApk);
                if (!this.mSupportChildProcessApk) {
                    this.mClassLoader = XWebClassLoaderWrapper.getXWebClassLoader(Integer.parseInt(str2));
                }
                if (this.mClassLoader != null) {
                    XWebLog.m21911i(TAG, "create, dexClassLoader:" + this.mClassLoader);
                    long currentTimeMillis14 = System.currentTimeMillis() - currentTimeMillis13;
                    XWebLog.m21911i(TAG, "create, class loader costTime:" + currentTimeMillis14);
                    long currentTimeMillis15 = System.currentTimeMillis();
                    createChildProcessService(service2, context2);
                    long currentTimeMillis16 = System.currentTimeMillis() - currentTimeMillis15;
                    XWebLog.m21911i(TAG, "create, child process service costTime:" + currentTimeMillis16);
                    long currentTimeMillis17 = System.currentTimeMillis();
                    loadXWebLibraryInNonIsolatedProcess(XWebFileUtil.getExtractedCoreDir(Integer.parseInt(str2)) + File.separator + XWalkEnvironment.PINUS_SO_NAME);
                    long currentTimeMillis18 = System.currentTimeMillis() - currentTimeMillis17;
                    XWebLog.m21911i(TAG, "create, load native library costTime:" + currentTimeMillis18);
                    long currentTimeMillis19 = System.currentTimeMillis();
                    if (PROCESS_TYPE_RENDER.equals(processType)) {
                        setCustomFont(iBinder, obtain, obtain2);
                    }
                    j5 = currentTimeMillis14;
                    j = currentTimeMillis16;
                    j2 = System.currentTimeMillis() - currentTimeMillis19;
                    j4 = currentTimeMillis18;
                    j3 = currentTimeMillis12;
                } else {
                    XWebLog.m21909e(TAG, str);
                    throw new IllegalStateException(str6);
                }
            }
            long currentTimeMillis20 = System.currentTimeMillis() - j6;
            long applicationStartTime = j6 - XWebSdk.getApplicationStartTime();
            KVReportForChildProcessService.report(getApkVersion(), this.mIsIsolatedProcess, this.mBrowserProcessName, getProcessType(), applicationStartTime, currentTimeMillis20, j5, j4, ((((currentTimeMillis20 - j5) - j4) - j3) - j2) - j, j3, j2, j);
            XWebLog.m21911i(TAG, "create, create service wrapper costTime:" + currentTimeMillis20 + ", applicationToServiceGap:" + applicationStartTime);
        } catch (Throwable th) {
            String stackTraceString = Log.getStackTraceString(th);
            XWebLog.m21910e(TAG, "create, error", th);
            KVReportForChildProcessException.report(getApkVersion(), this.mIsIsolatedProcess, this.mBrowserProcessName, 4, getProcessType(), stackTraceString);
            setMultiProcessDowngradeByException(stackTraceString);
        }
    }

    private void createChildProcessService(Service service, Context context) {
        if (!createChildProcessServiceByCustom(service, context)) {
            createChildProcessServiceByChromium(service, context);
        }
    }

    private void createChildProcessServiceByChromium(Service service, Context context) {
        XWebLog.m21911i(TAG, "createChildProcessServiceByChromium, start");
        this.mChildProcessService = this.mClassLoader.loadClass("org.chromium.content_public.app.ChildProcessServiceFactory").getMethod("create", new Class[]{Service.class, Context.class}).invoke((Object) null, new Object[]{service, context});
    }

    private boolean createChildProcessServiceByCustom(Service service, Context context) {
        try {
            XWebLog.m21911i(TAG, "createChildProcessServiceByCustom, start");
            this.mChildProcessService = this.mClassLoader.loadClass("com.tencent.xweb.pinus.PSViewDelegate").getMethod("createChildProcessService", new Class[]{Service.class, Context.class}).invoke((Object) null, new Object[]{service, context});
            return true;
        } catch (Exception e) {
            XWebLog.m21913w(TAG, "createChildProcessServiceByCustom, error:" + e);
            return false;
        }
    }

    private int getApkVersion() {
        NumberUtil.ParseResult safeParseInt = NumberUtil.safeParseInt(this.mApkVersion);
        if (safeParseInt.parseSuc) {
            return safeParseInt.intValue();
        }
        return -1;
    }

    private Class<?> getChildProcessServiceClass() {
        Class<?> cls = this.mChildProcessServiceClass;
        if (cls != null) {
            return cls;
        }
        ClassLoader classLoader = this.mClassLoader;
        if (classLoader == null) {
            return null;
        }
        try {
            Class<?> loadClass = classLoader.loadClass("org.chromium.base.process_launcher.ChildProcessService");
            this.mChildProcessServiceClass = loadClass;
            return loadClass;
        } catch (Throwable th) {
            XWebLog.m21909e(TAG, "getChildProcessServiceClass error:" + Log.getStackTraceString(th));
            return null;
        }
    }

    private String getProcessType() {
        String str = this.mServiceName;
        return str != null ? str.contains("SandboxedProcessService") ? PROCESS_TYPE_RENDER : this.mServiceName.contains("PrivilegedProcessService") ? PROCESS_TYPE_GPU : "" : "";
    }

    public static boolean isIsolatedProcess() {
        try {
            return Build.VERSION.SDK_INT >= 28 ? Process.isIsolated() : ((Boolean) Process.class.getMethod("isIsolated", new Class[0]).invoke((Object) null, new Object[0])).booleanValue();
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "isIsolatedProcess, error:", th);
            throw new RuntimeException(th);
        }
    }

    private void loadXWebLibraryInIsolatedProcess(Context context, IBinder iBinder, Parcel parcel, Parcel parcel2) {
        Class<String> cls = String.class;
        String findLibrary = LibraryLoader.findLibrary(context, Linker.LINKER_JNI_LIBRARY);
        iBinder.transact(1, parcel, parcel2, 0);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcel2.readParcelable(getClass().getClassLoader());
        Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0, OsConstants.SEEK_SET);
        String str = "app_xwalk_" + this.mApkVersion + "/extracted_xwalkcore/libxwebcore.so";
        if (PinusStandAloneChannel.getInstance().supportLoadXWebLibraryInRuntime(this.mClassLoader)) {
            XWebLog.m21911i(TAG, "loadXWebLibraryInIsolatedProcess, from runtime, libPath:" + str + ", linkerPath:" + findLibrary);
            Class<?> loadClass = this.mClassLoader.loadClass("com.tencent.xweb.pinus.PSViewDelegate");
            Class cls2 = Boolean.TYPE;
            XWebLog.m21911i(TAG, "loadXWebLibraryInIsolatedProcess, result:" + loadClass.getMethod("loadXWebLibraryInIsolatedProcess", new Class[]{cls, cls2, Integer.TYPE, cls2, cls}).invoke((Object) null, new Object[]{str, Boolean.FALSE, Integer.valueOf(parcelFileDescriptor.detachFd()), Boolean.TRUE, findLibrary}));
            return;
        }
        JNIUtils.setClassLoader(this.mClassLoader);
        if (this.mSupportChildProcessApk) {
            JNIUtils.enableSelectiveJniRegistration();
        }
        XWebLog.m21911i(TAG, "loadXWebLibraryInIsolatedProcess, from sdk, libPath:" + str);
        Linker.getInstance().loadLibraryByFd(str, false, parcelFileDescriptor.detachFd(), true);
    }

    private void loadXWebLibraryInNonIsolatedProcess(String str) {
        if (PinusStandAloneChannel.getInstance().supportLoadXWebLibraryInRuntime(this.mClassLoader)) {
            XWebLog.m21911i(TAG, "loadXWebLibraryInNonIsolatedProcess, from runtime, libPath:" + str);
            Object invoke = this.mClassLoader.loadClass("com.tencent.xweb.pinus.PSViewDelegate").getMethod("loadXWebLibraryInNonIsolatedProcess", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
            XWebLog.m21911i(TAG, "loadXWebLibraryInNonIsolatedProcess, result:" + invoke);
            return;
        }
        JNIUtils.setClassLoader(this.mClassLoader);
        if (this.mSupportChildProcessApk) {
            JNIUtils.enableSelectiveJniRegistration();
        }
        XWebLog.m21911i(TAG, "loadXWebLibraryInNonIsolatedProcess, from sdk, libPath:" + str);
        System.load(str);
    }

    public static ByteBuffer[] readDexFileFromApk(FileInputStream fileInputStream) {
        ArrayList arrayList = new ArrayList();
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(fileInputStream));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipInputStream.close();
                zipInputStream.close();
                ByteBuffer[] byteBufferArr = new ByteBuffer[arrayList.size()];
                arrayList.toArray(byteBufferArr);
                return byteBufferArr;
            }
            if (nextEntry.getName().endsWith(ShareConstants.DEX_SUFFIX)) {
                XWebLog.m21911i(TAG, "readDexFileFromApk, dexFile:" + nextEntry.getName());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = zipInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                arrayList.add(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
            }
            zipInputStream.closeEntry();
        }
    }

    private void setCustomFont(IBinder iBinder, Parcel parcel, Parcel parcel2) {
        iBinder.transact(3, parcel, parcel2, 0);
        boolean z = parcel2.readInt() == 1;
        XWebLog.m21911i(TAG, "setCustomFont, custom font exist:" + z);
        if (z) {
            this.mClassLoader.loadClass("com.tencent.xweb.XWebCommJni").getMethod("SetCustomFontFD", new Class[]{Integer.TYPE}).invoke((Object) null, new Object[]{Integer.valueOf(((ParcelFileDescriptor) parcel2.readParcelable(getClass().getClassLoader())).detachFd())});
        }
    }

    private void setMultiProcessDowngradeByException(String str) {
        if (str.startsWith("android.os.DeadObjectException") && str.contains("setCustomFont")) {
            XWebChildProcessMonitor.setShouldSwitchToSys(true, KVReportForMultiProcessDowngrade.CRASH_TYPE_SET_CUSTOM_FONT_ERROR);
        } else if (str.startsWith("java.lang.reflect.InvocationTargetException") && str.contains("loadXWebLibraryInNonIsolatedProcess")) {
            XWebChildProcessMonitor.setShouldSwitchToSys(true, KVReportForMultiProcessDowngrade.CRASH_TYPE_LOAD_LIBRARY_ERROR);
        } else if (!str.startsWith("java.lang.IllegalStateException") || !str.contains("InvalidClassLoader")) {
            XWebChildProcessMonitor.setShouldSwitchToSys(true, KVReportForMultiProcessDowngrade.CRASH_TYPE_SDK_UNKNOWN_ERROR);
        } else {
            XWebChildProcessMonitor.setShouldSwitchToSys(true, KVReportForMultiProcessDowngrade.CRASH_TYPE_INVALID_CLASSLOADER_ERROR);
        }
    }

    public IBinder onBind(Intent intent) {
        try {
            XWebLog.m21911i(TAG, "onBind, call");
            return (IBinder) getChildProcessServiceClass().getMethod("onBind", new Class[]{Intent.class}).invoke(this.mChildProcessService, new Object[]{intent});
        } catch (Throwable th) {
            String stackTraceString = Log.getStackTraceString(th);
            XWebLog.m21910e(TAG, "onBind, error", th);
            KVReportForChildProcessException.report(getApkVersion(), this.mIsIsolatedProcess, this.mBrowserProcessName, 2, getProcessType(), stackTraceString);
            return null;
        }
    }

    public void onCreate() {
        try {
            XWebLog.m21911i(TAG, "onCreate, call");
            getChildProcessServiceClass().getMethod("onCreate", new Class[0]).invoke(this.mChildProcessService, new Object[0]);
        } catch (Throwable th) {
            String stackTraceString = Log.getStackTraceString(th);
            XWebLog.m21910e(TAG, "onCreate, error", th);
            KVReportForChildProcessException.report(getApkVersion(), this.mIsIsolatedProcess, this.mBrowserProcessName, 1, getProcessType(), stackTraceString);
        }
    }

    public void onDestroy() {
        try {
            XWebLog.m21911i(TAG, "onDestroy, call");
            getChildProcessServiceClass().getMethod("onDestroy", new Class[0]).invoke(this.mChildProcessService, new Object[0]);
        } catch (Throwable th) {
            String stackTraceString = Log.getStackTraceString(th);
            XWebLog.m21910e(TAG, "onDestroy, error", th);
            KVReportForChildProcessException.report(getApkVersion(), this.mIsIsolatedProcess, this.mBrowserProcessName, 3, getProcessType(), stackTraceString);
        }
    }
}
