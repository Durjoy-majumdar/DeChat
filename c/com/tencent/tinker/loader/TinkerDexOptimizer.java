package com.tencent.tinker.loader;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.os.SystemClock;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareFileLockHelper;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import dalvik.system.DexFile;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class TinkerDexOptimizer {
    private static final String INTERPRET_LOCK_FILE_NAME = "interpret.lock";
    private static final int SHELL_COMMAND_TRANSACTION = 1598246212;
    private static final String TAG = "Tinker.ParallelDex";
    private static final ResultReceiver sEmptyResultReceiver;
    private static final Handler sHandler;
    private static final IBinder[] sPMSBinderProxy = {null};
    private static final int[] sPerformDexOptSecondaryTransactionCode = {-1};
    private static final PackageManager[] sSynchronizedPMCache = {null};

    public static class OptimizeWorker {
        private static ClassLoader patchClassLoaderStrongRef;
        private final ResultCallback callback;
        private final Context context;
        private final File dexFile;
        private final File optimizedDir;
        private final String targetISA;
        private final boolean useDLC;
        private final boolean useInterpretMode;

        public OptimizeWorker(Context context2, File file, File file2, boolean z, boolean z2, String str, ResultCallback resultCallback) {
            this.context = context2;
            this.dexFile = file;
            this.optimizedDir = file2;
            this.useInterpretMode = z;
            this.useDLC = z2;
            this.callback = resultCallback;
            this.targetISA = str;
        }

        /* JADX INFO: finally extract failed */
        public boolean run() {
            ResultCallback resultCallback;
            try {
                if (SharePatchFileUtil.isLegalFile(this.dexFile) || (resultCallback = this.callback) == null) {
                    ResultCallback resultCallback2 = this.callback;
                    if (resultCallback2 != null) {
                        resultCallback2.onStart(this.dexFile, this.optimizedDir);
                    }
                    String optimizedPathFor = SharePatchFileUtil.optimizedPathFor(this.dexFile, this.optimizedDir);
                    if (!ShareTinkerInternals.isArkHotRuning()) {
                        if (this.useInterpretMode) {
                            TinkerDexOptimizer.interpretDex2Oat(this.dexFile.getAbsolutePath(), optimizedPathFor, this.targetISA);
                        } else if (TinkerApplication.getInstance().isUseInterpretModeOnSupported32BitSystem() && ShareTinkerInternals.isVersionInRange(21, 25, true) && ShareTinkerInternals.is32BitEnv()) {
                            ShareTinkerLog.m106532i(TinkerDexOptimizer.TAG, "dexopt with interpret mode on 32bit supported system was enabled.", new Object[0]);
                            TinkerDexOptimizer.interpretDex2Oat(this.dexFile.getAbsolutePath(), optimizedPathFor, this.targetISA);
                            if (!SharePatchFileUtil.isLegalFile(new File(optimizedPathFor))) {
                                ShareTinkerLog.m106534w(TinkerDexOptimizer.TAG, "interpret dexopt failure, compensate with system method.", new Object[0]);
                                DexFile.loadDex(this.dexFile.getAbsolutePath(), optimizedPathFor, 0);
                            }
                        } else if (!ShareTinkerInternals.isNewerOrEqualThanVersion(26, true)) {
                            DexFile.loadDex(this.dexFile.getAbsolutePath(), optimizedPathFor, 0);
                        } else if (ShareTinkerInternals.isNewerOrEqualThanVersion(29, true)) {
                            TinkerDexOptimizer.createFakeODexPathStructureOnDemand(optimizedPathFor);
                            patchClassLoaderStrongRef = NewClassLoaderInjector.triggerDex2Oat(this.context, this.optimizedDir, this.useDLC, this.dexFile.getAbsolutePath());
                            try {
                                TinkerDexOptimizer.triggerPMDexOptOnDemand(this.context, this.dexFile.getAbsolutePath(), optimizedPathFor);
                                boolean unused = TinkerDexOptimizer.waitUntilFileGeneratedOrTimeout(this.context, optimizedPathFor.substring(0, optimizedPathFor.lastIndexOf(ShareConstants.ODEX_SUFFIX)) + ShareConstants.VDEX_SUFFIX, new Long[0]);
                            } catch (Throwable th) {
                                boolean unused2 = TinkerDexOptimizer.waitUntilFileGeneratedOrTimeout(this.context, optimizedPathFor.substring(0, optimizedPathFor.lastIndexOf(ShareConstants.ODEX_SUFFIX)) + ShareConstants.VDEX_SUFFIX, new Long[0]);
                                throw th;
                            }
                        } else {
                            patchClassLoaderStrongRef = NewClassLoaderInjector.triggerDex2Oat(this.context, this.optimizedDir, this.useDLC, this.dexFile.getAbsolutePath());
                        }
                    }
                    File file = new File(optimizedPathFor);
                    if (!SharePatchFileUtil.isLegalFile(file)) {
                        if (!SharePatchFileUtil.shouldAcceptEvenIfIllegal(file)) {
                            FileNotFoundException fileNotFoundException = new FileNotFoundException("Odex file: " + file.getAbsolutePath() + " does not exist.");
                            ResultCallback resultCallback3 = this.callback;
                            if (resultCallback3 != null) {
                                resultCallback3.onFailed(this.dexFile, this.optimizedDir, fileNotFoundException);
                            }
                            return false;
                        }
                    }
                    ResultCallback resultCallback4 = this.callback;
                    if (resultCallback4 != null) {
                        resultCallback4.onSuccess(this.dexFile, this.optimizedDir, file);
                    }
                    return true;
                }
                File file2 = this.dexFile;
                File file3 = this.optimizedDir;
                resultCallback.onFailed(file2, file3, new IOException("dex file " + this.dexFile.getAbsolutePath() + " is not exist!"));
                return false;
            } catch (Throwable th4) {
                ShareTinkerLog.m106531e(TinkerDexOptimizer.TAG, "Failed to optimize dex: " + this.dexFile.getAbsolutePath(), th4);
                ResultCallback resultCallback5 = this.callback;
                if (resultCallback5 != null) {
                    resultCallback5.onFailed(this.dexFile, this.optimizedDir, th4);
                }
                return false;
            }
        }
    }

    public interface ResultCallback {
        void onFailed(File file, File file2, Throwable th);

        void onStart(File file, File file2);

        void onSuccess(File file, File file2, File file3);
    }

    public static class StreamConsumer {
        public static final Executor STREAM_CONSUMER = Executors.newSingleThreadExecutor();

        private StreamConsumer() {
        }

        public static void consumeInputStream(final InputStream inputStream) {
            STREAM_CONSUMER.execute(new Runnable() {
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r2 = this;
                        java.io.InputStream r0 = r2
                        if (r0 != 0) goto L_0x0005
                        return
                    L_0x0005:
                        r0 = 256(0x100, float:3.59E-43)
                        byte[] r0 = new byte[r0]
                    L_0x0009:
                        java.io.InputStream r1 = r2     // Catch:{ IOException -> 0x0012, all -> 0x0018 }
                        int r1 = r1.read(r0)     // Catch:{ IOException -> 0x0012, all -> 0x0018 }
                        if (r1 <= 0) goto L_0x0012
                        goto L_0x0009
                    L_0x0012:
                        java.io.InputStream r0 = r2     // Catch:{ Exception -> 0x001f }
                        r0.close()     // Catch:{ Exception -> 0x001f }
                        goto L_0x001f
                    L_0x0018:
                        r0 = move-exception
                        java.io.InputStream r1 = r2     // Catch:{ Exception -> 0x001e }
                        r1.close()     // Catch:{ Exception -> 0x001e }
                    L_0x001e:
                        throw r0
                    L_0x001f:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.TinkerDexOptimizer.StreamConsumer.C860501.run():void");
                }
            });
        }
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        sHandler = handler;
        sEmptyResultReceiver = new ResultReceiver(handler);
    }

    /* access modifiers changed from: private */
    public static void createFakeODexPathStructureOnDemand(String str) {
        if (ShareTinkerInternals.isNewerOrEqualThanVersion(29, true)) {
            ShareTinkerLog.m106532i(TAG, "Creating fake odex path structure.", new Object[0]);
            File file = new File(str);
            if (!file.exists()) {
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                try {
                    file.createNewFile();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static void executePMSShellCommand(Context context, String[] strArr) {
        Parcel parcel;
        IBinder pMSBinderProxy = getPMSBinderProxy(context);
        long clearCallingIdentity = Binder.clearCallingIdentity();
        Parcel parcel2 = null;
        try {
            ShareTinkerLog.m106532i(TAG, "[+] Execute shell cmd, args: %s", Arrays.toString(strArr));
            Parcel obtain = Parcel.obtain();
            try {
                parcel = Parcel.obtain();
            } catch (Throwable th) {
                th = th;
                parcel = null;
                parcel2 = obtain;
                try {
                    throw new IllegalStateException("Failure on executing shell cmd.", th);
                } catch (Throwable th4) {
                    if (parcel != null) {
                        parcel.recycle();
                    }
                    if (parcel2 != null) {
                        parcel2.recycle();
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th4;
                }
            }
            try {
                obtain.writeFileDescriptor(FileDescriptor.in);
                obtain.writeFileDescriptor(FileDescriptor.out);
                obtain.writeFileDescriptor(FileDescriptor.err);
                obtain.writeStringArray(strArr);
                obtain.writeStrongBinder((IBinder) null);
                sEmptyResultReceiver.writeToParcel(obtain, 0);
                pMSBinderProxy.transact(SHELL_COMMAND_TRANSACTION, obtain, parcel, 0);
                parcel.readException();
                ShareTinkerLog.m106532i(TAG, "[+] Execute shell cmd done.", new Object[0]);
                parcel.recycle();
                obtain.recycle();
                Binder.restoreCallingIdentity(clearCallingIdentity);
            } catch (Throwable th5) {
                th = th5;
                parcel2 = obtain;
                throw new IllegalStateException("Failure on executing shell cmd.", th);
            }
        } catch (Throwable th6) {
            th = th6;
            parcel = null;
            throw new IllegalStateException("Failure on executing shell cmd.", th);
        }
    }

    private static IBinder getPMSBinderProxy(Context context) {
        IBinder[] iBinderArr = sPMSBinderProxy;
        synchronized (iBinderArr) {
            IBinder iBinder = iBinderArr[0];
            if (iBinder != null && iBinder.isBinderAlive()) {
                return iBinder;
            }
            try {
                IBinder iBinder2 = (IBinder) ShareReflectUtil.findMethod(Class.forName("android.os.ServiceManager"), "getService", (Class<?>[]) new Class[]{String.class}).invoke((Object) null, new Object[]{"package"});
                iBinderArr[0] = iBinder2;
                return iBinder2;
            } catch (Throwable th) {
                if (th instanceof InvocationTargetException) {
                    throw new IllegalStateException(th.getTargetException());
                }
                throw new IllegalStateException(th);
            }
        }
    }

    private static final PackageManager getSynchronizedPackageManager(Context context) {
        PackageManager[] packageManagerArr = sSynchronizedPMCache;
        synchronized (packageManagerArr) {
            try {
                if (packageManagerArr[0] != null) {
                    IBinder[] iBinderArr = sPMSBinderProxy;
                    synchronized (iBinderArr) {
                        IBinder iBinder = iBinderArr[0];
                        if (iBinder != null && iBinder.isBinderAlive()) {
                            PackageManager packageManager = packageManagerArr[0];
                            return packageManager;
                        }
                    }
                }
                final IBinder pMSBinderProxy = getPMSBinderProxy(context);
                Object invoke = ShareReflectUtil.findMethod(Class.forName("android.content.pm.IPackageManager$Stub"), "asInterface", (Class<?>[]) new Class[]{IBinder.class}).invoke((Object) null, new Object[]{(IBinder) Proxy.newProxyInstance(context.getClassLoader(), pMSBinderProxy.getClass().getInterfaces(), new InvocationHandler() {
                    public Object invoke(Object obj, Method method, Object[] objArr) {
                        if ("transact".equals(method.getName())) {
                            objArr[3] = 0;
                        }
                        return method.invoke(pMSBinderProxy, objArr);
                    }
                })});
                Class<?> cls = Class.forName("android.app.ApplicationPackageManager");
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                PackageManager packageManager2 = (PackageManager) ShareReflectUtil.findConstructor(cls, (Class<?>[]) new Class[]{context.getClass(), Class.forName("android.content.pm.IPackageManager")}).newInstance(new Object[]{context, invoke});
                packageManagerArr[0] = packageManager2;
                return packageManager2;
            } catch (InvocationTargetException e) {
                throw new IllegalStateException(e.getTargetException());
            } catch (Throwable th) {
                if (th instanceof IllegalStateException) {
                    throw th;
                }
                throw new IllegalStateException(th);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void interpretDex2Oat(String str, String str2, String str3) {
        File file = new File(str2);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        File file2 = new File(file.getParentFile(), INTERPRET_LOCK_FILE_NAME);
        ShareFileLockHelper shareFileLockHelper = null;
        try {
            shareFileLockHelper = ShareFileLockHelper.getFileLock(file2);
            ArrayList arrayList = new ArrayList();
            arrayList.add("dex2oat");
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                arrayList.add("--runtime-arg");
                arrayList.add("-classpath");
                arrayList.add("--runtime-arg");
                arrayList.add("&");
            }
            arrayList.add("--dex-file=" + str);
            arrayList.add("--oat-file=" + str2);
            arrayList.add("--instruction-set=" + str3);
            if (i > 25) {
                arrayList.add("--compiler-filter=quicken");
            } else {
                arrayList.add("--compiler-filter=interpret-only");
            }
            ProcessBuilder processBuilder = new ProcessBuilder(arrayList);
            processBuilder.redirectErrorStream(true);
            Process start = processBuilder.start();
            StreamConsumer.consumeInputStream(start.getInputStream());
            StreamConsumer.consumeInputStream(start.getErrorStream());
            int waitFor = start.waitFor();
            if (waitFor != 0) {
                throw new IOException("dex2oat works unsuccessfully, exit code: " + waitFor);
            } else if (shareFileLockHelper != null) {
                try {
                    shareFileLockHelper.close();
                } catch (IOException e) {
                    ShareTinkerLog.m106534w(TAG, "release interpret Lock error", e);
                }
            }
        } catch (InterruptedException e2) {
            throw new IOException("dex2oat is interrupted, msg: " + e2.getMessage(), e2);
        } catch (Throwable th) {
            if (shareFileLockHelper != null) {
                try {
                    shareFileLockHelper.close();
                } catch (IOException e3) {
                    ShareTinkerLog.m106534w(TAG, "release interpret Lock error", e3);
                }
            }
            throw th;
        }
    }

    public static boolean optimizeAll(Context context, Collection<File> collection, File file, boolean z, ResultCallback resultCallback) {
        return optimizeAll(context, collection, file, false, z, ShareTinkerInternals.getCurrentInstructionSet(), resultCallback);
    }

    private static void performBgDexOptJob(Context context) {
        executePMSShellCommand(context, new String[]{"bg-dexopt-job", context.getPackageName()});
    }

    private static void performDexOptSecondary(Context context) {
        String[] strArr = new String[6];
        strArr[0] = "compile";
        strArr[1] = "-f";
        strArr[2] = "--secondary-dex";
        strArr[3] = "-m";
        strArr[4] = ShareTinkerInternals.isNewerOrEqualThanVersion(31, true) ? "verify" : "speed-profile";
        strArr[5] = context.getPackageName();
        executePMSShellCommand(context, strArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void performDexOptSecondaryByTransactionCode(android.content.Context r8) {
        /*
            int[] r0 = sPerformDexOptSecondaryTransactionCode
            monitor-enter(r0)
            r1 = 0
            r2 = r0[r1]     // Catch:{ all -> 0x00d2 }
            r3 = -1
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x0047
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            java.lang.String r3 = "getDeclaredField"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x003e }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r1] = r7     // Catch:{ all -> 0x003e }
            java.lang.reflect.Method r2 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod((java.lang.Class<?>) r2, (java.lang.String) r3, (java.lang.Class<?>[]) r6)     // Catch:{ all -> 0x003e }
            r2.setAccessible(r5)     // Catch:{ all -> 0x003e }
            java.lang.String r3 = "android.content.pm.IPackageManager$Stub"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x003e }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x003e }
            java.lang.String r7 = "TRANSACTION_performDexOptSecondary"
            r6[r1] = r7     // Catch:{ all -> 0x003e }
            java.lang.Object r2 = r2.invoke(r3, r6)     // Catch:{ all -> 0x003e }
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch:{ all -> 0x003e }
            r2.setAccessible(r5)     // Catch:{ all -> 0x003e }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x003e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x003e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x003e }
            r0[r1] = r2     // Catch:{ all -> 0x003e }
            goto L_0x0047
        L_0x003e:
            r8 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = "Cannot query transaction code of performDexOptSecondary."
            r1.<init>(r2, r8)     // Catch:{ all -> 0x00d2 }
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = "Tinker.ParallelDex"
            java.lang.String r3 = "[+] performDexOptSecondaryByTransactionCode, code: %s"
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = r0[r1]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r1] = r7
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r2, r3, r6)
            android.os.IBinder r2 = getPMSBinderProxy(r8)
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch:{ all -> 0x00c5 }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ all -> 0x00c3 }
            java.lang.String r6 = r2.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x00bc }
            r3.writeInterfaceToken(r6)     // Catch:{ RemoteException -> 0x00bc }
            java.lang.String r8 = r8.getPackageName()     // Catch:{ RemoteException -> 0x00bc }
            r3.writeString(r8)     // Catch:{ RemoteException -> 0x00bc }
            r8 = 31
            boolean r8 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(r8, r5)     // Catch:{ RemoteException -> 0x00bc }
            if (r8 == 0) goto L_0x007f
            java.lang.String r8 = "verify"
            goto L_0x0082
        L_0x007f:
            java.lang.String r8 = "speed-profile"
        L_0x0082:
            r3.writeString(r8)     // Catch:{ RemoteException -> 0x00bc }
            r3.writeInt(r5)     // Catch:{ RemoteException -> 0x00bc }
            r8 = r0[r1]     // Catch:{ RemoteException -> 0x00bc }
            boolean r8 = r2.transact(r8, r3, r4, r1)     // Catch:{ RemoteException -> 0x00bc }
            if (r8 == 0) goto L_0x00b4
            r4.readException()     // Catch:{ all -> 0x00ad }
            int r8 = r4.readInt()     // Catch:{ all -> 0x00c3 }
            if (r8 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r5 = 0
        L_0x009b:
            if (r5 != 0) goto L_0x00a6
            java.lang.String r8 = "Tinker.ParallelDex"
            java.lang.String r0 = "[!] System API return false."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c3 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r8, r0, r1)     // Catch:{ all -> 0x00c3 }
        L_0x00a6:
            r4.recycle()
            r3.recycle()
            return
        L_0x00ad:
            r8 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c3 }
            r0.<init>(r8)     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00b4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00bc }
            java.lang.String r0 = "Binder transaction failure."
            r8.<init>(r0)     // Catch:{ RemoteException -> 0x00bc }
            throw r8     // Catch:{ RemoteException -> 0x00bc }
        L_0x00bc:
            r8 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c3 }
            r0.<init>(r8)     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r8 = move-exception
            goto L_0x00c7
        L_0x00c5:
            r8 = move-exception
            r3 = r4
        L_0x00c7:
            if (r4 == 0) goto L_0x00cc
            r4.recycle()
        L_0x00cc:
            if (r3 == 0) goto L_0x00d1
            r3.recycle()
        L_0x00d1:
            throw r8
        L_0x00d2:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.TinkerDexOptimizer.performDexOptSecondaryByTransactionCode(android.content.Context):void");
    }

    private static void registerDexModule(Context context, String str) {
        PackageManager synchronizedPackageManager = getSynchronizedPackageManager(context);
        try {
            ShareReflectUtil.findMethod((Object) synchronizedPackageManager, "registerDexModule", (Class<?>[]) new Class[]{String.class, Class.forName("android.content.pm.PackageManager$DexModuleRegisterCallback")}).invoke(synchronizedPackageManager, new Object[]{str, null});
        } catch (InvocationTargetException e) {
            throw new IllegalStateException(e.getTargetException());
        } catch (Throwable th) {
            if (th instanceof IllegalStateException) {
                throw th;
            }
            throw new IllegalStateException(th);
        }
    }

    /* access modifiers changed from: private */
    public static void triggerPMDexOptOnDemand(Context context, String str, String str2) {
        if (!ShareTinkerInternals.isNewerOrEqualThanVersion(29, true)) {
            ShareTinkerLog.m106534w(TAG, "[+] Not API 29, 30 and newer device, skip triggering dexopt.", new Object[0]);
            return;
        }
        ShareTinkerLog.m106532i(TAG, "[+] Hit target device, do dexopt logic now.", new Object[0]);
        File file = new File(str2);
        if (SharePatchFileUtil.isLegalFile(file)) {
            ShareTinkerLog.m106532i(TAG, "[+] Oat file %s should be valid, skip triggering dexopt.", str2);
            return;
        }
        File file2 = new File(str);
        int i = 0;
        while (i < 10) {
            if (!triggerSecondaryDexOpt(context, file2, file, true)) {
                i++;
            } else {
                return;
            }
        }
        if (!SharePatchFileUtil.isLegalFile(file)) {
            String str3 = Build.MANUFACTURER;
            if ("huawei".equalsIgnoreCase(str3) || "honor".equalsIgnoreCase(str3)) {
                int i2 = 0;
                while (i2 < 5) {
                    try {
                        registerDexModule(context, str);
                        if (SharePatchFileUtil.isLegalFile(file)) {
                            break;
                        }
                        SystemClock.sleep(3000);
                        i2++;
                    } catch (Throwable th) {
                        ShareTinkerLog.printErrStackTrace(TAG, th, "[-] Error.", new Object[0]);
                    }
                }
                if (!SharePatchFileUtil.isLegalFile(file)) {
                    throw new IllegalStateException("No odex file was generated after calling registerDexModule");
                }
                return;
            }
            throw new IllegalStateException("No odex file was generated after calling performDexOptSecondary");
        }
    }

    private static boolean triggerSecondaryDexOpt(Context context, File file, File file2, boolean z) {
        try {
            performDexOptSecondary(context);
            if (SharePatchFileUtil.isLegalFile(file2)) {
                return true;
            }
        } catch (Throwable th) {
            ShareTinkerLog.printErrStackTrace(TAG, th, "[-] Error.", new Object[0]);
        }
        try {
            performBgDexOptJob(context);
            if (SharePatchFileUtil.isLegalFile(file2)) {
                return true;
            }
        } catch (Throwable th4) {
            ShareTinkerLog.printErrStackTrace(TAG, th4, "[-] Error.", new Object[0]);
        }
        try {
            performDexOptSecondaryByTransactionCode(context);
            if (SharePatchFileUtil.isLegalFile(file2)) {
                return true;
            }
        } catch (Throwable th5) {
            ShareTinkerLog.printErrStackTrace(TAG, th5, "[-] Error.", new Object[0]);
        }
        if (!z) {
            return SharePatchFileUtil.isLegalFile(file2);
        }
        return waitUntilFileGeneratedOrTimeout(context, file2.getAbsolutePath(), 3000L);
    }

    /* access modifiers changed from: private */
    public static boolean waitUntilFileGeneratedOrTimeout(Context context, String str, Long... lArr) {
        File file = new File(str);
        if (lArr == null || lArr.length <= 0) {
            lArr = new Long[]{1000L, 2000L, 4000L, 8000L, 16000L, 32000L};
        }
        int i = 0;
        while (!SharePatchFileUtil.isLegalFile(file) && i < lArr.length) {
            int i2 = i + 1;
            SystemClock.sleep(lArr[i].longValue());
            ShareTinkerLog.m106534w(TAG, "[!] File %s does not exist after waiting %s time(s), wait again.", str, Integer.valueOf(i2));
            i = i2;
        }
        if (SharePatchFileUtil.isLegalFile(file)) {
            ShareTinkerLog.m106532i(TAG, "[+] File %s was found.", str);
            return true;
        }
        ShareTinkerLog.m106531e(TAG, "[-] File %s does not exist after waiting for %s times.", str, Integer.valueOf(lArr.length));
        return false;
    }

    public static boolean optimizeAll(Context context, Collection<File> collection, File file, boolean z, boolean z2, String str, ResultCallback resultCallback) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, new Comparator<File>() {
            public int compare(File file, File file2) {
                int i = (file.length() > file2.length() ? 1 : (file.length() == file2.length() ? 0 : -1));
                if (i < 0) {
                    return 1;
                }
                return i == 0 ? 0 : -1;
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!new OptimizeWorker(context, (File) it.next(), file, z, z2, str, resultCallback).run()) {
                return false;
            }
        }
        return true;
    }
}
