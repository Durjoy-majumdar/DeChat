package com.tencent.midas.plugin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.tencent.midas.comm.APLog;
import java.lang.reflect.Method;
import java.util.ArrayList;

class APPluginContext extends ContextThemeWrapper {
    private AssetManager mAsset;
    private ClassLoader mClassLoader;
    private Resources mResources;
    private Resources.Theme mTheme;
    private int mThemeResId;

    public APPluginContext(Context context, int i, String str, ClassLoader classLoader) {
        this(context, i, str, classLoader, (Resources) null);
    }

    private static String getApplicationPackageName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 0).packageName : "";
        } catch (Exception e) {
            APLog.m161214i("APMidasCommMethod", "getApplicationPackageName error:" + e.toString());
            return "";
        }
    }

    private int getInnerRIdValue(String str) {
        int i = -1;
        try {
            String substring = str.substring(0, str.indexOf(".R.") + 2);
            int lastIndexOf = str.lastIndexOf(".");
            String substring2 = str.substring(lastIndexOf + 1, str.length());
            String substring3 = str.substring(0, lastIndexOf);
            String str2 = substring + "$" + substring3.substring(substring3.lastIndexOf(".") + 1, substring3.length());
            i = Class.forName(str2).getDeclaredField(substring2).getInt((Object) null);
            APLog.m161214i("APPluginContext", "getInnderR rStrnig:" + substring3 + ", className:" + str2 + ", fieldName:" + substring2);
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    private AssetManager getSelfAssets(Context context, String str) {
        boolean z;
        boolean z2;
        Class<String> cls = String.class;
        AssetManager assetManager = null;
        try {
            AssetManager newInstance = AssetManager.class.newInstance();
            try {
                Class.forName("com.tencent.theme.SkinEngine").getMethod("getInstances", new Class[0]);
                z = true;
            } catch (Exception e) {
                APLog.m161222w("APPluginContext", " is not has com.tencent.theme.SkinEngine e:" + e.toString());
                z = false;
            } catch (Throwable unused) {
                assetManager = newInstance;
                return assetManager;
            }
            if (!z) {
                try {
                    Class.forName("com.tencent.component.theme.SkinEngine").getMethod("getInstances", new Class[0]);
                    z = true;
                } catch (Exception e2) {
                    APLog.m161222w("APPluginContext", " is not has com.tencent.component.theme.SkinEngine e:" + e2.toString());
                    z = false;
                }
            }
            try {
                z2 = "com.tencent.weread".equals(getApplicationPackageName(context));
            } catch (Exception unused2) {
                z2 = false;
            }
            if (z || z2) {
                ArrayList<String> midasEmptyPaht = APPluginUtils.getMidasEmptyPaht(context);
                APLog.m161214i("APPluginContext", "loadEmptyResAPK emptyList.size:" + midasEmptyPaht.size());
                for (int i = 0; i < midasEmptyPaht.size(); i++) {
                    String str2 = midasEmptyPaht.get(i);
                    APLog.m161214i("APPluginContext", "loadEmptyResAPK emptyResFirstPath:" + str2);
                    if (!TextUtils.isEmpty(str2)) {
                        APLog.m161214i("APPluginContext", "loadEmptyResAPK id:" + ((Integer) AssetManager.class.getDeclaredMethod("addAssetPath", new Class[]{cls}).invoke(newInstance, new Object[]{str2})).intValue());
                    }
                }
            }
            AssetManager.class.getDeclaredMethod("addAssetPath", new Class[]{cls}).invoke(newInstance, new Object[]{str});
            try {
                for (String str3 : context.getApplicationInfo().sharedLibraryFiles) {
                    if (str3.endsWith(".apk")) {
                        AssetManager.class.getDeclaredMethod("addAssetPathAsSharedLibrary", new Class[]{cls}).invoke(newInstance, new Object[]{str3});
                    }
                }
                return newInstance;
            } catch (Exception unused3) {
                return newInstance;
            }
        } catch (Throwable unused4) {
            return assetManager;
        }
    }

    private Resources getSelfRes(Context context, AssetManager assetManager) {
        return new Resources(assetManager, context.getResources().getDisplayMetrics(), context.getResources().getConfiguration());
    }

    private Resources.Theme getSelfTheme(Context context, Resources resources) {
        Resources.Theme newTheme = resources.newTheme();
        int themeId = getThemeId(context);
        this.mThemeResId = themeId;
        newTheme.applyStyle(themeId, true);
        return newTheme;
    }

    private static int getThemeId(Context context) {
        try {
            Method method = ContextThemeWrapper.class.getMethod("getThemeResId", new Class[0]);
            method.setAccessible(true);
            return ((Integer) method.invoke(context, new Object[0])).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    public AssetManager getAssets() {
        return this.mAsset;
    }

    public ClassLoader getClassLoader() {
        ClassLoader classLoader = this.mClassLoader;
        return classLoader != null ? classLoader : super.getClassLoader();
    }

    public Resources getRes() {
        return this.mResources;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public Resources.Theme getTheme() {
        return this.mTheme;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.mClassLoader = classLoader;
    }

    public APPluginContext(Context context, int i, String str, ClassLoader classLoader, Resources resources) {
        super(context, i);
        this.mAsset = null;
        this.mResources = null;
        this.mTheme = null;
        this.mClassLoader = classLoader;
        APLog.m161214i("APPluginContext", "APPluginContext mClassLoader:" + this.mClassLoader + " apkPath:" + str);
        if (resources != null) {
            this.mAsset = resources.getAssets();
            APLog.m161214i("APPluginContext", "APPluginActivity APPluginContext 1 mAsset:" + this.mAsset);
            this.mResources = resources;
        } else {
            AssetManager selfAssets = getSelfAssets(context, str);
            this.mAsset = selfAssets;
            this.mResources = getSelfRes(context, selfAssets);
            APLog.m161214i("APPluginContext", "APPluginActivity APPluginContext 2 mAsset:" + this.mAsset + ", mResources:" + this.mResources);
        }
        this.mTheme = getSelfTheme(context, this.mResources);
    }
}
