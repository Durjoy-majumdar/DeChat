package com.tencent.xweb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebViewContextWrapper;
import com.tencent.xweb.util.WebViewExtensionListener;
import com.tencent.xweb.util.XWebLog;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.xwalk.core.XWalkEnvironment;

public abstract class XWebContextWrapper extends ContextWrapper implements IWebViewContextWrapper {
    private static final String TAG = "XWebContextWrapper";
    private static String sLastPackageInfoPath;
    private static PackageInfo sPackageInfo;
    private static Resources sResources;
    private static HashMap<Long, Integer> sResourcesKeyIdMap;
    public ApplicationInfo mApplicationInfo;
    private ClassLoader mClassLoader;
    public Context mContext;
    public boolean mHasAddFilterResources = false;
    public LayoutInflater mLayoutInflater;
    public Resources mResources;
    public Resources.Theme mTheme;

    public XWebContextWrapper(Context context) {
        super(context);
    }

    private boolean checkResApkExist(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    private ApplicationInfo getApplicationInfoFromApkPath(Context context, String str) {
        XWebLog.m21911i(TAG, "getApplicationInfoFromApkPath, path:" + str);
        PackageInfo packageInfo = getPackageInfo(context, str);
        if (packageInfo != null) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            this.mApplicationInfo = applicationInfo;
            if (applicationInfo != null) {
                applicationInfo.sourceDir = str;
                applicationInfo.publicSourceDir = str;
            }
        }
        return this.mApplicationInfo;
    }

    private Intent getRealIntent(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            intent.setComponent(new ComponentName(getBaseContext(), component.getClassName()));
        }
        return intent;
    }

    private Resources getResourcesWithReflect(Context context, String str) {
        try {
            AssetManager newInstance = AssetManager.class.newInstance();
            newInstance.getClass().getMethod("addAssetPath", new Class[]{String.class}).invoke(newInstance, new Object[]{str});
            Resources resources = super.getResources();
            return new Resources(newInstance, resources.getDisplayMetrics(), resources.getConfiguration());
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getResourcesWithReflect error", th);
            return null;
        }
    }

    public boolean addFilterResources(Resources resources, Map<Long, Integer> map) {
        WebViewExtensionListener webViewExtensionListener = XWalkEnvironment.getWebViewExtensionListener();
        if (webViewExtensionListener != null) {
            Object onMiscCallBack = webViewExtensionListener.onMiscCallBack(ConstValue.EXTENSION_ADD_FILTER_RESOURCES, resources, map);
            if (onMiscCallBack instanceof Boolean) {
                return ((Boolean) onMiscCallBack).booleanValue();
            }
        }
        return false;
    }

    public Context getApplicationContext() {
        return XWalkEnvironment.convertContextToApplication(this.mContext);
    }

    public AssetManager getAssets() {
        Resources resources = getResources();
        return resources != null ? resources.getAssets() : super.getAssets();
    }

    public Context getBaseContext() {
        return this.mContext;
    }

    public ClassLoader getClassLoader() {
        if (this.mClassLoader != null) {
            XWebLog.m21911i(TAG, "getClassLoader, customized class loader:" + this.mClassLoader);
            return this.mClassLoader;
        }
        ClassLoader webViewCoreClassLoader = getWebViewCoreClassLoader();
        if (webViewCoreClassLoader != null) {
            XWebLog.m21911i(TAG, "getClassLoader, webview core class loader:" + webViewCoreClassLoader);
            return webViewCoreClassLoader;
        }
        XWebLog.m21911i(TAG, "getClassLoader, super class loader");
        return super.getClassLoader();
    }

    public LayoutInflater getLayoutInflater() {
        return this.mLayoutInflater;
    }

    public synchronized PackageInfo getPackageInfo(Context context, String str) {
        if (str == null) {
            return null;
        }
        if (str.equals(sLastPackageInfoPath)) {
            return sPackageInfo;
        }
        sLastPackageInfoPath = str;
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 0);
        sPackageInfo = packageArchiveInfo;
        return packageArchiveInfo;
    }

    public String getPackageName() {
        return this.mContext.getPackageName();
    }

    public Resources getResources(Context context, String str) {
        if (sResources != null) {
            getApplicationInfoFromApkPath(context, str);
            return sResources;
        }
        if (checkResApkExist(str)) {
            ApplicationInfo applicationInfoFromApkPath = getApplicationInfoFromApkPath(context, str);
            this.mApplicationInfo = applicationInfoFromApkPath;
            if (applicationInfoFromApkPath != null) {
                applicationInfoFromApkPath.sourceDir = str;
                applicationInfoFromApkPath.publicSourceDir = str;
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(this.mApplicationInfo);
                    if (resourcesForApplication != null) {
                        sResources = resourcesForApplication;
                        XWebLog.m21911i(TAG, "getResources, use application resources");
                        return sResources;
                    }
                } catch (Throwable th) {
                    XWebLog.m21909e(TAG, "getResources, error:" + th.getMessage());
                }
            }
            XWebLog.m21911i(TAG, "getResources failed, try getResourcesWithReflect");
            sResources = getResourcesWithReflect(context, str);
        }
        XWebLog.m21911i(TAG, "getResources, resources:" + sResources);
        return sResources;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0152, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0153, code lost:
        com.tencent.xweb.util.XWebLog.m21910e(TAG, "getResourcesKeyIdMap error", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0159, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010f A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0152 A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x0044] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap<java.lang.Long, java.lang.Integer> getResourcesKeyIdMap(android.content.res.Resources r18) {
        /*
            r17 = this;
            java.lang.String r1 = " is not found, error"
            java.util.HashMap<java.lang.Long, java.lang.Integer> r0 = sResourcesKeyIdMap
            if (r0 == 0) goto L_0x000e
            java.util.HashMap r0 = new java.util.HashMap
            java.util.HashMap<java.lang.Long, java.lang.Integer> r1 = sResourcesKeyIdMap
            r0.<init>(r1)
            return r0
        L_0x000e:
            java.lang.String r2 = "XWebContextWrapper"
            java.lang.String r0 = "getResourcesKeyIdMap start"
            com.tencent.xweb.util.XWebLog.m21911i(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.pm.PackageInfo r3 = sPackageInfo
            java.lang.String r3 = r3.packageName
            r0.append(r3)
            java.lang.String r3 = ".R"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "getResourcesKeyIdMap, clazzR:"
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.xweb.util.XWebLog.m21911i(r2, r0)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r5 = 0
            java.lang.ClassLoader r0 = r17.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
            java.lang.Class r0 = r0.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
            java.lang.Class[] r6 = r0.getClasses()     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
            int r7 = r6.length     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
            r9 = 0
        L_0x0052:
            if (r9 >= r7) goto L_0x012a
            r0 = r6[r9]     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
            java.lang.String r10 = r0.getSimpleName()     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
            java.lang.String r11 = "drawable"
            boolean r10 = r10.equals(r11)     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
            if (r10 == 0) goto L_0x0120
            java.lang.reflect.Field[] r10 = r0.getFields()     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
            int r11 = r10.length     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
            r12 = 0
        L_0x0068:
            if (r12 >= r11) goto L_0x0120
            r13 = r10[r12]     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
            int r0 = r13.getModifiers()     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
            r14 = 1
            if (r0 == 0) goto L_0x007a
            r13.setAccessible(r14)     // Catch:{ ClassNotFoundException -> 0x015a, all -> 0x0152 }
        L_0x007a:
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ IllegalAccessException -> 0x00e9, IllegalArgumentException -> 0x00cc, NotFoundException -> 0x00b1 }
            r0.<init>()     // Catch:{ IllegalAccessException -> 0x00e9, IllegalArgumentException -> 0x00cc, NotFoundException -> 0x00b1 }
            int r15 = r13.getInt(r5)     // Catch:{ IllegalAccessException -> 0x00e9, IllegalArgumentException -> 0x00cc, NotFoundException -> 0x00b1 }
            r5 = r18
            r5.getValue(r15, r0, r14)     // Catch:{ ClassNotFoundException -> 0x011d, all -> 0x0152 }
            int r14 = r0.assetCookie     // Catch:{ ClassNotFoundException -> 0x011d, all -> 0x0152 }
            r16 = r9
            long r8 = (long) r14
            r14 = 32
            long r8 = r8 << r14
            int r0 = r0.data     // Catch:{ IllegalAccessException -> 0x00ae, IllegalArgumentException -> 0x00ab, NotFoundException -> 0x00a8 }
            r14 = r6
            long r5 = (long) r0
            long r5 = r5 | r8
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ IllegalAccessException -> 0x00a6, IllegalArgumentException -> 0x00a4, NotFoundException -> 0x00a2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)     // Catch:{ IllegalAccessException -> 0x00a6, IllegalArgumentException -> 0x00a4, NotFoundException -> 0x00a2 }
            r4.put(r0, r5)     // Catch:{ IllegalAccessException -> 0x00a6, IllegalArgumentException -> 0x00a4, NotFoundException -> 0x00a2 }
            goto L_0x0105
        L_0x00a2:
            r0 = move-exception
            goto L_0x00b5
        L_0x00a4:
            r0 = move-exception
            goto L_0x00d0
        L_0x00a6:
            r0 = move-exception
            goto L_0x00ed
        L_0x00a8:
            r0 = move-exception
            r14 = r6
            goto L_0x00b5
        L_0x00ab:
            r0 = move-exception
            r14 = r6
            goto L_0x00d0
        L_0x00ae:
            r0 = move-exception
            r14 = r6
            goto L_0x00ed
        L_0x00b1:
            r0 = move-exception
            r14 = r6
            r16 = r9
        L_0x00b5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{  }
            r5.<init>()     // Catch:{  }
            java.lang.String r6 = r13.getName()     // Catch:{  }
            r5.append(r6)     // Catch:{  }
            r5.append(r1)     // Catch:{  }
            java.lang.String r5 = r5.toString()     // Catch:{  }
            com.tencent.xweb.util.XWebLog.m21910e(r2, r5, r0)     // Catch:{  }
            goto L_0x0105
        L_0x00cc:
            r0 = move-exception
            r14 = r6
            r16 = r9
        L_0x00d0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{  }
            r5.<init>()     // Catch:{  }
            java.lang.String r6 = r13.getName()     // Catch:{  }
            r5.append(r6)     // Catch:{  }
            java.lang.String r6 = " is not int, error"
            r5.append(r6)     // Catch:{  }
            java.lang.String r5 = r5.toString()     // Catch:{  }
            com.tencent.xweb.util.XWebLog.m21910e(r2, r5, r0)     // Catch:{  }
            goto L_0x0105
        L_0x00e9:
            r0 = move-exception
            r14 = r6
            r16 = r9
        L_0x00ed:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{  }
            r5.<init>()     // Catch:{  }
            java.lang.String r6 = r13.getName()     // Catch:{  }
            r5.append(r6)     // Catch:{  }
            java.lang.String r6 = " is not accessible, error"
            r5.append(r6)     // Catch:{  }
            java.lang.String r5 = r5.toString()     // Catch:{  }
            com.tencent.xweb.util.XWebLog.m21910e(r2, r5, r0)     // Catch:{  }
        L_0x0105:
            int r0 = r13.getModifiers()     // Catch:{  }
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x0114
            r5 = 0
            r13.setAccessible(r5)     // Catch:{  }
            goto L_0x0115
        L_0x0114:
            r5 = 0
        L_0x0115:
            int r12 = r12 + 1
            r6 = r14
            r9 = r16
            r5 = 0
            goto L_0x0068
        L_0x011d:
            r0 = move-exception
            r4 = 0
            goto L_0x015c
        L_0x0120:
            r14 = r6
            r16 = r9
            r5 = 0
            int r9 = r16 + 1
            r6 = r14
            r5 = 0
            goto L_0x0052
        L_0x012a:
            sResourcesKeyIdMap = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getResourcesKeyIdMap end, size:"
            r0.append(r1)
            java.util.HashMap<java.lang.Long, java.lang.Integer> r1 = sResourcesKeyIdMap
            java.util.Set r1 = r1.keySet()
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.xweb.util.XWebLog.m21911i(r2, r0)
            java.util.HashMap r0 = new java.util.HashMap
            java.util.HashMap<java.lang.Long, java.lang.Integer> r1 = sResourcesKeyIdMap
            r0.<init>(r1)
            return r0
        L_0x0152:
            r0 = move-exception
            java.lang.String r1 = "getResourcesKeyIdMap error"
            com.tencent.xweb.util.XWebLog.m21910e(r2, r1, r0)
            r4 = 0
            return r4
        L_0x015a:
            r0 = move-exception
            r4 = r5
        L_0x015c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.tencent.xweb.util.XWebLog.m21910e(r2, r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.XWebContextWrapper.getResourcesKeyIdMap(android.content.res.Resources):java.util.HashMap");
    }

    public Object getSystemService(String str) {
        if (str.equals("layout_inflater")) {
            XWebLog.m21911i(TAG, "getSystemService, layoutInflater:" + getLayoutInflater());
            return getLayoutInflater();
        }
        try {
            XWebLog.m21911i(TAG, "getSystemService, context:" + this.mContext + ", activity? " + (this.mContext instanceof Activity));
            return this.mContext.getSystemService(str);
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getSystemService error", th);
            return null;
        }
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.mTheme;
        return theme != null ? theme : super.getTheme();
    }

    public ClassLoader getWebViewCoreClassLoader() {
        return null;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.mClassLoader = classLoader;
    }

    public void setTheme(int i) {
        if (this.mContext.getTheme() != null) {
            this.mContext.getTheme().applyStyle(i, true);
        } else {
            super.setTheme(i);
        }
    }

    public void startActivity(Intent intent) {
        super.startActivity(getRealIntent(intent));
    }

    public ComponentName startService(Intent intent) {
        return super.startService(getRealIntent(intent));
    }

    public void updateResourceLocale(Locale locale) {
        try {
            Resources resources = this.mResources;
            if (resources == null) {
                XWebLog.m21909e(TAG, "updateResourceLocale, resources is null");
                return;
            }
            Configuration configuration = resources.getConfiguration();
            XWebLog.m21911i(TAG, "updateResourceLocale, resources:" + resources + ", new locale:" + locale + ", old locale:" + configuration.locale);
            configuration.setLocale(locale);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "updateResourceLocale, error", th);
        }
    }

    public Resources getResources() {
        if (!this.mHasAddFilterResources) {
            HashMap<Long, Integer> resourcesKeyIdMap = getResourcesKeyIdMap(this.mResources);
            if (resourcesKeyIdMap != null && addFilterResources(this.mResources, resourcesKeyIdMap)) {
                this.mHasAddFilterResources = true;
            } else if (!XWalkEnvironment.getBuildConfigThirdPartyRelease()) {
                XWebLog.m21913w(TAG, "getResources, resourceKeyIdMap is empty");
            }
        }
        Resources resources = this.mResources;
        if (resources != null) {
            return resources;
        }
        return super.getResources();
    }
}
