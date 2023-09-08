package com.tencent.p014mm.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.p014mm.obb.loader.ObbClassLoader;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.lang.reflect.Constructor;

/* renamed from: com.tencent.mm.app.GPApplication */
public class GPApplication extends Application {
    private static final String CLASSLOADER_INITIALIZER_CLASSNAME = "com.tencent.mm.plugin.expansions.ExpansionsClassLoaderInitializer";
    private static final String CLASSLOADER_INITIALIZER_METHODNAME = "initializeClassLoader";
    private static final String TAG = "MicroMsg.GPApplication";
    private static final String WECHAT_APPLICATION_LIKE_CLASSNAME = "com.tencent.mm.app.MMApplicationLike";
    private Handler mInlineFence = null;
    private final Intent mResultIntent = new Intent();

    private Handler createInlineFence(long j, long j2, ClassLoader classLoader) {
        try {
            Class<?> cls = Class.forName(WECHAT_APPLICATION_LIKE_CLASSNAME, false, classLoader);
            Class cls2 = Long.TYPE;
            Object newInstance = cls.getConstructor(new Class[]{Application.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, Intent.class}).newInstance(new Object[]{this, 0, Boolean.TRUE, Long.valueOf(j), Long.valueOf(j2), this.mResultIntent});
            Constructor<?> declaredConstructor = Class.forName("com.tencent.mm.app.GPAppInlineFence", false, classLoader).getDeclaredConstructor(new Class[]{Class.forName("com.tencent.tinker.entry.ApplicationLike", false, classLoader)});
            declaredConstructor.setAccessible(true);
            return (Handler) declaredConstructor.newInstance(new Object[]{newInstance});
        } catch (Throwable th) {
            throw new IllegalStateException("createInlineFence failed", th);
        }
    }

    private void replaceAndInitAppClassLoader() {
        try {
            ClassLoader injectOnDemand = ObbClassLoader.injectOnDemand(this);
            try {
                Class<?> cls = Class.forName(CLASSLOADER_INITIALIZER_CLASSNAME, false, injectOnDemand);
                cls.getDeclaredMethod(CLASSLOADER_INITIALIZER_METHODNAME, new Class[]{Application.class, ClassLoader.class}).invoke(cls.newInstance(), new Object[]{this, injectOnDemand});
                ShareIntentUtil.setIntentReturnCode(this.mResultIntent, -1);
            } catch (Throwable th) {
                ShareTinkerLog.printErrStackTrace(TAG, th, "[-] Error when init expansion classloader.", new Object[0]);
                ShareIntentUtil.setIntentReturnCode(this.mResultIntent, -27);
                this.mResultIntent.putExtra(ShareIntentUtil.INTENT_PATCH_EXCEPTION, th);
            }
        } catch (Throwable th4) {
            ShareTinkerLog.printErrStackTrace(TAG, th4, "[-] Error when inject expansion classloader.", new Object[0]);
            ShareIntentUtil.setIntentReturnCode(this.mResultIntent, -26);
            this.mResultIntent.putExtra(ShareIntentUtil.INTENT_PATCH_EXCEPTION, th4);
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        replaceAndInitAppClassLoader();
        Handler createInlineFence = createInlineFence(elapsedRealtime, currentTimeMillis, context.getClassLoader());
        this.mInlineFence = createInlineFence;
        createInlineFence.handleMessage(Message.obtain(createInlineFence, 1, context));
    }

    public AssetManager getAssets() {
        AssetManager assets = super.getAssets();
        Handler handler = this.mInlineFence;
        if (handler == null) {
            return assets;
        }
        Message obtain = Message.obtain(handler, 9, assets);
        handler.handleMessage(obtain);
        return (AssetManager) obtain.obj;
    }

    public Context getBaseContext() {
        Context baseContext = super.getBaseContext();
        Handler handler = this.mInlineFence;
        if (handler == null) {
            return baseContext;
        }
        Message obtain = Message.obtain(handler, 8, baseContext);
        handler.handleMessage(obtain);
        return (Context) obtain.obj;
    }

    public ClassLoader getClassLoader() {
        ClassLoader classLoader = super.getClassLoader();
        Handler handler = this.mInlineFence;
        if (handler == null) {
            return classLoader;
        }
        Message obtain = Message.obtain(handler, 7, classLoader);
        handler.handleMessage(obtain);
        return (ClassLoader) obtain.obj;
    }

    public Resources getResources() {
        Resources resources = super.getResources();
        Handler handler = this.mInlineFence;
        if (handler == null) {
            return resources;
        }
        Message obtain = Message.obtain(handler, 10, resources);
        handler.handleMessage(obtain);
        return (Resources) obtain.obj;
    }

    public Object getSystemService(String str) {
        Object systemService = super.getSystemService(str);
        Handler handler = this.mInlineFence;
        if (handler == null) {
            return systemService;
        }
        Message obtain = Message.obtain(handler, 11, new Object[]{str, systemService});
        handler.handleMessage(obtain);
        return obtain.obj;
    }

    public int mzNightModeUseOf() {
        Handler handler = this.mInlineFence;
        if (handler == null) {
            return 1;
        }
        Message obtain = Message.obtain(handler, 12);
        handler.handleMessage(obtain);
        return ((Integer) obtain.obj).intValue();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Handler handler = this.mInlineFence;
        if (handler != null) {
            handler.handleMessage(Message.obtain(handler, 3, configuration));
        }
    }

    public void onCreate() {
        super.onCreate();
        Handler handler = this.mInlineFence;
        if (handler != null) {
            handler.handleMessage(Message.obtain(handler, 2));
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        Handler handler = this.mInlineFence;
        if (handler != null) {
            handler.handleMessage(Message.obtain(handler, 5));
        }
    }

    public void onTerminate() {
        super.onTerminate();
        Handler handler = this.mInlineFence;
        if (handler != null) {
            handler.handleMessage(Message.obtain(handler, 6));
        }
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Handler handler = this.mInlineFence;
        if (handler != null) {
            handler.handleMessage(Message.obtain(handler, 4, Integer.valueOf(i)));
        }
    }
}
