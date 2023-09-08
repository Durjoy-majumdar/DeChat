package com.tencent.tinker.loader.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import com.tencent.tinker.loader.TinkerLoader;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.TinkerUncaughtHandler;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.lang.reflect.Constructor;

public abstract class TinkerApplication extends Application {
    private static final String INTENT_PATCH_EXCEPTION = "intent_patch_exception";
    private static final TinkerApplication[] SELF_HOLDER = {null};
    private static final String TINKER_LOADER_METHOD = "tryLoad";
    private final String delegateClassName;
    private final String loaderClassName;
    public ClassLoader mCurrentClassLoader;
    private Handler mInlineFence;
    private final int tinkerFlags;
    private final boolean tinkerLoadVerifyFlag;
    public Intent tinkerResultIntent;
    private final boolean useDelegateLastClassLoader;
    private final boolean useInterpretModeOnSupported32BitSystem;
    private boolean useSafeMode;

    public TinkerApplication(int i) {
        this(i, "com.tencent.tinker.entry.DefaultApplicationLike");
    }

    private Handler createInlineFence(Application application, int i, String str, boolean z, long j, long j2, Intent intent) {
        try {
            String str2 = str;
            Class<?> cls = Class.forName(str, false, this.mCurrentClassLoader);
            Class cls2 = Long.TYPE;
            Object newInstance = cls.getConstructor(new Class[]{Application.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, Intent.class}).newInstance(new Object[]{application, Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2), intent});
            Constructor<?> constructor = Class.forName("com.tencent.tinker.entry.TinkerApplicationInlineFence", false, this.mCurrentClassLoader).getConstructor(new Class[]{Class.forName("com.tencent.tinker.entry.ApplicationLike", false, this.mCurrentClassLoader)});
            constructor.setAccessible(true);
            return (Handler) constructor.newInstance(new Object[]{newInstance});
        } catch (Throwable th) {
            throw new TinkerRuntimeException("createInlineFence failed", th);
        }
    }

    public static TinkerApplication getInstance() {
        TinkerApplication tinkerApplication;
        TinkerApplication[] tinkerApplicationArr = SELF_HOLDER;
        synchronized (tinkerApplicationArr) {
            tinkerApplication = tinkerApplicationArr[0];
            if (tinkerApplication == null) {
                throw new IllegalStateException("TinkerApplication is not initialized.");
            }
        }
        return tinkerApplication;
    }

    private void loadTinker() {
        try {
            Class<?> cls = Class.forName(this.loaderClassName, false, TinkerApplication.class.getClassLoader());
            this.tinkerResultIntent = (Intent) cls.getMethod(TINKER_LOADER_METHOD, new Class[]{TinkerApplication.class}).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[]{this});
        } catch (Throwable th) {
            Intent intent = new Intent();
            this.tinkerResultIntent = intent;
            ShareIntentUtil.setIntentReturnCode(intent, -20);
            this.tinkerResultIntent.putExtra("intent_patch_exception", th);
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        Thread.setDefaultUncaughtExceptionHandler(new TinkerUncaughtHandler(this));
        onBaseContextAttached(context, elapsedRealtime, currentTimeMillis);
    }

    public AssetManager getAssets() {
        AssetManager assets = super.getAssets();
        Handler handler = this.mInlineFence;
        return handler == null ? assets : TinkerInlineFenceAction.callGetAssets(handler, assets);
    }

    public Context getBaseContext() {
        Context baseContext = super.getBaseContext();
        Handler handler = this.mInlineFence;
        return handler == null ? baseContext : TinkerInlineFenceAction.callGetBaseContext(handler, baseContext);
    }

    public ClassLoader getClassLoader() {
        ClassLoader classLoader = super.getClassLoader();
        Handler handler = this.mInlineFence;
        return handler == null ? classLoader : TinkerInlineFenceAction.callGetClassLoader(handler, classLoader);
    }

    public Resources getResources() {
        Resources resources = super.getResources();
        Handler handler = this.mInlineFence;
        return handler == null ? resources : TinkerInlineFenceAction.callGetResources(handler, resources);
    }

    public Object getSystemService(String str) {
        Object systemService = super.getSystemService(str);
        Handler handler = this.mInlineFence;
        return handler == null ? systemService : TinkerInlineFenceAction.callGetSystemService(handler, str, systemService);
    }

    public int getTinkerFlags() {
        return this.tinkerFlags;
    }

    public boolean isTinkerLoadVerifyFlag() {
        return this.tinkerLoadVerifyFlag;
    }

    public boolean isUseDelegateLastClassLoader() {
        return this.useDelegateLastClassLoader;
    }

    public boolean isUseInterpretModeOnSupported32BitSystem() {
        return this.useInterpretModeOnSupported32BitSystem;
    }

    public int mzNightModeUseOf() {
        Handler handler = this.mInlineFence;
        if (handler == null) {
            return 1;
        }
        return TinkerInlineFenceAction.callMZNightModeUseOf(handler);
    }

    public void onBaseContextAttached(Context context, long j, long j2) {
        try {
            loadTinker();
            this.mCurrentClassLoader = context.getClassLoader();
            Handler createInlineFence = createInlineFence(this, this.tinkerFlags, this.delegateClassName, this.tinkerLoadVerifyFlag, j, j2, this.tinkerResultIntent);
            this.mInlineFence = createInlineFence;
            Context context2 = context;
            TinkerInlineFenceAction.callOnBaseContextAttached(createInlineFence, context);
            if (this.useSafeMode) {
                ShareTinkerInternals.setSafeModeCount(this, 0);
            }
        } catch (TinkerRuntimeException e) {
            throw e;
        } catch (Throwable th) {
            throw new TinkerRuntimeException(th.getMessage(), th);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Handler handler = this.mInlineFence;
        if (handler != null) {
            TinkerInlineFenceAction.callOnConfigurationChanged(handler, configuration);
        }
    }

    public void onCreate() {
        super.onCreate();
        Handler handler = this.mInlineFence;
        if (handler != null) {
            TinkerInlineFenceAction.callOnCreate(handler);
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        Handler handler = this.mInlineFence;
        if (handler != null) {
            TinkerInlineFenceAction.callOnLowMemory(handler);
        }
    }

    public void onTerminate() {
        super.onTerminate();
        Handler handler = this.mInlineFence;
        if (handler != null) {
            TinkerInlineFenceAction.callOnTerminate(handler);
        }
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Handler handler = this.mInlineFence;
        if (handler != null) {
            TinkerInlineFenceAction.callOnTrimMemory(handler, i);
        }
    }

    public void setUseSafeMode(boolean z) {
        this.useSafeMode = z;
    }

    public TinkerApplication(int i, String str) {
        this(i, str, TinkerLoader.class.getName(), false);
    }

    public TinkerApplication(int i, String str, String str2, boolean z) {
        this(i, str, str2, z, true, false);
    }

    public TinkerApplication(int i, String str, String str2, boolean z, boolean z2) {
        this(i, str, str2, z, z2, false);
    }

    public TinkerApplication(int i, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.mCurrentClassLoader = null;
        this.mInlineFence = null;
        TinkerApplication[] tinkerApplicationArr = SELF_HOLDER;
        synchronized (tinkerApplicationArr) {
            tinkerApplicationArr[0] = this;
        }
        this.tinkerFlags = i;
        this.delegateClassName = str;
        this.loaderClassName = str2;
        this.tinkerLoadVerifyFlag = z;
        this.useDelegateLastClassLoader = z2;
        this.useInterpretModeOnSupported32BitSystem = z3;
    }
}
