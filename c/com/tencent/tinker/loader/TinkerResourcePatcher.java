package com.tencent.tinker.loader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.ArrayMap;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

class TinkerResourcePatcher {
    private static final String TAG = "Tinker.ResourcePatcher";
    private static final String TEST_ASSETS_VALUE = "only_use_to_test_tinker_resource.txt";
    private static Method addAssetPathAsSharedLibraryMethod;
    private static Method addAssetPathMethod;
    private static Field assetsFiled;
    private static Object currentActivityThread;
    private static Method ensureStringBlocksMethod;
    private static AssetManager newAssetManager;
    private static Constructor<?> newAssetManagerCtor;
    private static Field packagesFiled;
    private static Field publicSourceDirField;
    private static Collection<WeakReference<Resources>> references;
    private static Field resDir;
    private static Field resourcePackagesFiled;
    private static Field resourcesImplFiled;
    private static long storedPatchedResModifiedTime;
    private static Field stringBlocksField;

    public static final class ResourceInsuranceHandlerCallback implements Handler.Callback {
        private static final String LAUNCH_ACTIVITY_LIFECYCLE_ITEM_CLASSNAME = "android.app.servertransaction.LaunchActivityItem";
        private final int EXECUTE_TRANSACTION;
        private final int LAUNCH_ACTIVITY;
        private final int RELAUNCH_ACTIVITY;
        private final Context mContext;
        private Method mGetCallbacksMethod = null;
        private final Handler.Callback mOriginalCallback;
        private final String mPatchResApkPath;
        private boolean mSkipInterceptExecuteTransaction = false;

        public ResourceInsuranceHandlerCallback(Context context, String str, Handler.Callback callback, Class<?> cls) {
            Context applicationContext = context.getApplicationContext();
            this.mContext = applicationContext != null ? applicationContext : context;
            this.mPatchResApkPath = str;
            this.mOriginalCallback = callback;
            this.LAUNCH_ACTIVITY = fetchMessageId(cls, "LAUNCH_ACTIVITY", 100);
            this.RELAUNCH_ACTIVITY = fetchMessageId(cls, "RELAUNCH_ACTIVITY", 126);
            if (ShareTinkerInternals.isNewerOrEqualThanVersion(28, true)) {
                this.EXECUTE_TRANSACTION = fetchMessageId(cls, "EXECUTE_TRANSACTION ", 159);
            } else {
                this.EXECUTE_TRANSACTION = -1;
            }
        }

        private int fetchMessageId(Class<?> cls, String str, int i) {
            try {
                return ShareReflectUtil.findField(cls, str).getInt((Object) null);
            } catch (Throwable unused) {
                return i;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
            if (r6.getClass().getName().equals(LAUNCH_ACTIVITY_LIFECYCLE_ITEM_CLASSNAME) != false) goto L_0x007d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0080 A[SYNTHETIC, Splitter:B:36:0x0080] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean hackMessage(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.String r0 = r5.mPatchResApkPath
                boolean r0 = com.tencent.tinker.loader.TinkerResourcePatcher.isPatchedResModifiedAfterLastLoad(r0)
                java.lang.String r1 = "Tinker.ResourcePatcher"
                r2 = 1
                r3 = 0
                if (r0 != 0) goto L_0x000f
            L_0x000c:
                r6 = 0
                goto L_0x007e
            L_0x000f:
                int r0 = r6.what
                int r4 = r5.LAUNCH_ACTIVITY
                if (r0 == r4) goto L_0x007d
                int r4 = r5.RELAUNCH_ACTIVITY
                if (r0 != r4) goto L_0x001a
                goto L_0x007d
            L_0x001a:
                int r4 = r5.EXECUTE_TRANSACTION
                if (r0 != r4) goto L_0x000c
                boolean r0 = r5.mSkipInterceptExecuteTransaction
                if (r0 == 0) goto L_0x0023
                goto L_0x000c
            L_0x0023:
                java.lang.Object r6 = r6.obj
                if (r6 != 0) goto L_0x0030
                java.lang.Object[] r6 = new java.lang.Object[r3]
                java.lang.String r0 = "transaction is null, skip rest insurance logic."
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r1, r0, r6)
                goto L_0x000c
            L_0x0030:
                java.lang.reflect.Method r0 = r5.mGetCallbacksMethod
                if (r0 != 0) goto L_0x0040
                java.lang.String r0 = "getCallbacks"
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x003f }
                java.lang.reflect.Method r0 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod((java.lang.Object) r6, (java.lang.String) r0, (java.lang.Class<?>[]) r4)     // Catch:{ all -> 0x003f }
                r5.mGetCallbacksMethod = r0     // Catch:{ all -> 0x003f }
                goto L_0x0040
            L_0x003f:
            L_0x0040:
                java.lang.reflect.Method r0 = r5.mGetCallbacksMethod
                if (r0 != 0) goto L_0x004e
                java.lang.Object[] r6 = new java.lang.Object[r3]
                java.lang.String r0 = "fail to find getLifecycleStateRequest method, skip rest insurance logic."
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r1, r0, r6)
                r5.mSkipInterceptExecuteTransaction = r2
                goto L_0x000c
            L_0x004e:
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0075 }
                java.lang.Object r6 = r0.invoke(r6, r4)     // Catch:{ all -> 0x0075 }
                java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0075 }
                if (r6 == 0) goto L_0x000c
                int r0 = r6.size()     // Catch:{ all -> 0x0075 }
                if (r0 <= 0) goto L_0x000c
                java.lang.Object r6 = r6.get(r3)     // Catch:{ all -> 0x0075 }
                if (r6 == 0) goto L_0x000c
                java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x0075 }
                java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0075 }
                java.lang.String r0 = "android.app.servertransaction.LaunchActivityItem"
                boolean r6 = r6.equals(r0)     // Catch:{ all -> 0x0075 }
                if (r6 == 0) goto L_0x000c
                goto L_0x007d
            L_0x0075:
                java.lang.Object[] r6 = new java.lang.Object[r3]
                java.lang.String r0 = "fail to call getLifecycleStateRequest method, skip rest insurance logic."
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r1, r0, r6)
                goto L_0x000c
            L_0x007d:
                r6 = 1
            L_0x007e:
                if (r6 == 0) goto L_0x0090
                android.content.Context r6 = r5.mContext     // Catch:{ all -> 0x0088 }
                java.lang.String r0 = r5.mPatchResApkPath     // Catch:{ all -> 0x0088 }
                com.tencent.tinker.loader.TinkerResourcePatcher.monkeyPatchExistingResources(r6, r0, r2)     // Catch:{ all -> 0x0088 }
                goto L_0x0090
            L_0x0088:
                r6 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r2 = "fail to ensure patched resources available after it's modified."
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(r1, r6, r2, r0)
            L_0x0090:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.TinkerResourcePatcher.ResourceInsuranceHandlerCallback.hackMessage(android.os.Message):boolean");
        }

        public boolean handleMessage(Message message) {
            if (hackMessage(message)) {
                return true;
            }
            Handler.Callback callback = this.mOriginalCallback;
            if (callback != null) {
                return callback.handleMessage(message);
            }
            return false;
        }
    }

    private static boolean checkResUpdate(Context context) {
        try {
            SharePatchFileUtil.closeQuietly(context.getAssets().open(TEST_ASSETS_VALUE));
            ShareTinkerLog.m106532i(TAG, "checkResUpdate success, found test resource assets file only_use_to_test_tinker_resource.txt", new Object[0]);
            return true;
        } catch (Throwable th) {
            SharePatchFileUtil.closeQuietly((Object) null);
            throw th;
        }
    }

    private static void clearPreloadTypedArrayIssue(Resources resources) {
        ShareTinkerLog.m106534w(TAG, "try to clear typedArray cache!", new Object[0]);
        try {
            Object obj = ShareReflectUtil.findField((Class<?>) Resources.class, "mTypedArrayPool").get(resources);
            do {
            } while (ShareReflectUtil.findMethod(obj, "acquire", (Class<?>[]) new Class[0]).invoke(obj, new Object[0]) != null);
        } catch (Throwable th) {
            ShareTinkerLog.m106531e(TAG, "clearPreloadTypedArrayIssue failed, ignore error: " + th, new Object[0]);
        }
    }

    private static void installResourceInsuranceHacks(Context context, String str) {
        try {
            Object activityThread = ShareReflectUtil.getActivityThread(context, (Class<?>) null);
            Handler handler = (Handler) ShareReflectUtil.findField(activityThread, "mH").get(activityThread);
            Field findField = ShareReflectUtil.findField((Class<?>) Handler.class, "mCallback");
            Handler.Callback callback = (Handler.Callback) findField.get(handler);
            if (!(callback instanceof ResourceInsuranceHandlerCallback)) {
                findField.set(handler, new ResourceInsuranceHandlerCallback(context, str, callback, handler.getClass()));
            } else {
                ShareTinkerLog.m106534w(TAG, "installResourceInsuranceHacks: already installed, skip rest logic.", new Object[0]);
            }
        } catch (Throwable th) {
            ShareTinkerLog.printErrStackTrace(TAG, th, "failed to install resource insurance hack.", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public static boolean isPatchedResModifiedAfterLastLoad(String str) {
        long j;
        try {
            j = new File(str).lastModified();
        } catch (Throwable th) {
            ShareTinkerLog.printErrStackTrace(TAG, th, "Fail to get patched res modified time.", new Object[0]);
            j = 0;
        }
        return (j == 0 || j == storedPatchedResModifiedTime) ? false : true;
    }

    public static void isResourceCanPatch(Context context) {
        Class<?> cls;
        Class<String> cls2 = String.class;
        Class<?> cls3 = Class.forName("android.app.ActivityThread");
        currentActivityThread = ShareReflectUtil.getActivityThread(context, cls3);
        try {
            cls = Class.forName("android.app.LoadedApk");
        } catch (ClassNotFoundException unused) {
            cls = Class.forName("android.app.ActivityThread$PackageInfo");
        }
        resDir = ShareReflectUtil.findField(cls, "mResDir");
        packagesFiled = ShareReflectUtil.findField(cls3, "mPackages");
        if (Build.VERSION.SDK_INT < 27) {
            resourcePackagesFiled = ShareReflectUtil.findField(cls3, "mResourcePackages");
        }
        AssetManager assets = context.getAssets();
        addAssetPathMethod = ShareReflectUtil.findMethod((Object) assets, "addAssetPath", (Class<?>[]) new Class[]{cls2});
        if (shouldAddSharedLibraryAssets(context.getApplicationInfo())) {
            addAssetPathAsSharedLibraryMethod = ShareReflectUtil.findMethod((Object) assets, "addAssetPathAsSharedLibrary", (Class<?>[]) new Class[]{cls2});
        }
        try {
            stringBlocksField = ShareReflectUtil.findField((Object) assets, "mStringBlocks");
            ensureStringBlocksMethod = ShareReflectUtil.findMethod((Object) assets, "ensureStringBlocks", (Class<?>[]) new Class[0]);
        } catch (Throwable unused2) {
        }
        newAssetManagerCtor = ShareReflectUtil.findConstructor((Object) assets, (Class<?>[]) new Class[0]);
        Class<?> cls4 = Class.forName("android.app.ResourcesManager");
        Object invoke = ShareReflectUtil.findMethod(cls4, "getInstance", (Class<?>[]) new Class[0]).invoke((Object) null, new Object[0]);
        try {
            references = ((ArrayMap) ShareReflectUtil.findField(cls4, "mActiveResources").get(invoke)).values();
        } catch (NoSuchFieldException unused3) {
            references = (Collection) ShareReflectUtil.findField(cls4, "mResourceReferences").get(invoke);
        }
        if (references != null) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    resourcesImplFiled = ShareReflectUtil.findField((Object) resources, "mResourcesImpl");
                } catch (Throwable unused4) {
                    assetsFiled = ShareReflectUtil.findField((Object) resources, "mAssets");
                }
            } else {
                assetsFiled = ShareReflectUtil.findField((Object) resources, "mAssets");
            }
            try {
                publicSourceDirField = ShareReflectUtil.findField((Class<?>) ApplicationInfo.class, "publicSourceDir");
            } catch (NoSuchFieldException unused5) {
            }
        } else {
            throw new IllegalStateException("resource references is null");
        }
    }

    public static void monkeyPatchExistingResources(Context context, String str, boolean z) {
        if (str != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            for (Field field : Build.VERSION.SDK_INT < 27 ? new Field[]{packagesFiled, resourcePackagesFiled} : new Field[]{packagesFiled}) {
                for (Map.Entry value : ((Map) field.get(currentActivityThread)).entrySet()) {
                    Object obj = ((WeakReference) value.getValue()).get();
                    if (obj != null) {
                        if (applicationInfo.sourceDir.equals((String) resDir.get(obj))) {
                            resDir.set(obj, str);
                        }
                    }
                }
            }
            if (z) {
                ShareTinkerLog.m106532i(TAG, "Re-injecting, skip rest logic.", new Object[0]);
                recordCurrentPatchedResModifiedTime(str);
                return;
            }
            AssetManager assetManager = (AssetManager) newAssetManagerCtor.newInstance(new Object[0]);
            newAssetManager = assetManager;
            if (((Integer) addAssetPathMethod.invoke(assetManager, new Object[]{str})).intValue() != 0) {
                recordCurrentPatchedResModifiedTime(str);
                if (shouldAddSharedLibraryAssets(applicationInfo)) {
                    for (String str2 : applicationInfo.sharedLibraryFiles) {
                        if (str2.endsWith(".apk")) {
                            if (((Integer) addAssetPathAsSharedLibraryMethod.invoke(newAssetManager, new Object[]{str2})).intValue() != 0) {
                                ShareTinkerLog.m106532i(TAG, "addAssetPathAsSharedLibrary " + str2, new Object[0]);
                            } else {
                                throw new IllegalStateException("AssetManager add SharedLibrary Fail");
                            }
                        }
                    }
                }
                Field field2 = stringBlocksField;
                if (!(field2 == null || ensureStringBlocksMethod == null)) {
                    field2.set(newAssetManager, (Object) null);
                    ensureStringBlocksMethod.invoke(newAssetManager, new Object[0]);
                }
                for (WeakReference<Resources> weakReference : references) {
                    Resources resources = (Resources) weakReference.get();
                    if (resources != null) {
                        try {
                            assetsFiled.set(resources, newAssetManager);
                        } catch (Throwable unused) {
                            Object obj2 = resourcesImplFiled.get(resources);
                            ShareReflectUtil.findField(obj2, "mAssets").set(obj2, newAssetManager);
                        }
                        clearPreloadTypedArrayIssue(resources);
                        resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
                    }
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        Field field3 = publicSourceDirField;
                        if (field3 != null) {
                            field3.set(context.getApplicationInfo(), str);
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (checkResUpdate(context)) {
                    installResourceInsuranceHacks(context, str);
                    return;
                }
                throw new TinkerRuntimeException(ShareConstants.CHECK_RES_INSTALL_FAIL);
            }
            throw new IllegalStateException("Could not create new AssetManager");
        }
    }

    private static void recordCurrentPatchedResModifiedTime(String str) {
        try {
            storedPatchedResModifiedTime = new File(str).lastModified();
        } catch (Throwable th) {
            ShareTinkerLog.printErrStackTrace(TAG, th, "Fail to store patched res modified time.", new Object[0]);
            storedPatchedResModifiedTime = 0;
        }
    }

    private static boolean shouldAddSharedLibraryAssets(ApplicationInfo applicationInfo) {
        return (Build.VERSION.SDK_INT < 24 || applicationInfo == null || applicationInfo.sharedLibraryFiles == null) ? false : true;
    }
}
