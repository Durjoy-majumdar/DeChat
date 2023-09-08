package com.tencent.midas.plugin;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.comm.APLogUtil;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import j20.C117292a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;

public class APPluginProxyActivity extends HellActivity {
    private static final String TAG = "APPluginProxyActivity";
    private static boolean cutOutEnable = false;
    private static String gPluginApkFilePath = null;
    public static String gPluginName = "MidasPay";
    public static boolean mAppForground = true;
    private static Field sMMapField;
    private static Method sUnparcelMethod;
    public String mCreateErrorInfo = null;
    private String mLaunchActivity = null;
    private IAPPluginActivity mPluginActivity = null;
    private String mPluginApkFilePath = null;
    private String mPluginName = null;
    public int mStopFlag = 0;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|(3:9|10|11)|12|13|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String initPlugin() {
        /*
            r9 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.content.pm.PackageInfo> r0 = com.tencent.midas.plugin.APPluginStatic.sPackageInfoMap
            java.lang.String r1 = r9.mPluginApkFilePath
            java.lang.Object r0 = r0.get(r1)
            android.content.pm.PackageInfo r0 = (android.content.pm.PackageInfo) r0
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = r9.mPluginApkFilePath
            r1 = 1
            android.content.pm.PackageInfo r0 = com.tencent.midas.plugin.APApkFileParser.getPackageInfo(r9, r0, r1)
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "Get Package Info Failed!"
            return r0
        L_0x0018:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0029
            boolean r1 = com.tencent.midas.plugin.APPluginUtils.isInNewProcess(r9)
            if (r1 == 0) goto L_0x0029
            java.lang.String r1 = "midaspay"
            android.webkit.WebView.setDataDirectorySuffix(r1)     // Catch:{ all -> 0x0029 }
        L_0x0029:
            android.webkit.WebView r1 = new android.webkit.WebView     // Catch:{ Exception -> 0x004c }
            r1.<init>(r9)     // Catch:{ Exception -> 0x004c }
            android.content.pm.ApplicationInfo r1 = r0.applicationInfo     // Catch:{ Exception -> 0x004c }
            android.content.pm.ApplicationInfo r2 = r9.getApplicationInfo()     // Catch:{ Exception -> 0x004c }
            java.lang.String[] r2 = r2.sharedLibraryFiles     // Catch:{ Exception -> 0x004c }
            r1.sharedLibraryFiles = r2     // Catch:{ Exception -> 0x004c }
            android.content.pm.ApplicationInfo r1 = r0.applicationInfo     // Catch:{ Exception -> 0x004c }
            android.content.pm.ApplicationInfo r2 = r9.getApplicationInfo()     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = r2.sourceDir     // Catch:{ Exception -> 0x004c }
            r1.sourceDir = r2     // Catch:{ Exception -> 0x004c }
            android.content.pm.ApplicationInfo r1 = r0.applicationInfo     // Catch:{ Exception -> 0x004c }
            android.content.pm.ApplicationInfo r2 = r9.getApplicationInfo()     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = r2.publicSourceDir     // Catch:{ Exception -> 0x004c }
            r1.publicSourceDir = r2     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.content.pm.PackageInfo> r1 = com.tencent.midas.plugin.APPluginStatic.sPackageInfoMap
            java.lang.String r2 = r9.mPluginApkFilePath
            r1.put(r2, r0)
        L_0x0053:
            r8 = r0
            java.lang.String r0 = r9.mLaunchActivity
            if (r0 == 0) goto L_0x005e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x006d
        L_0x005e:
            android.content.pm.ActivityInfo[] r0 = r8.activities
            if (r0 == 0) goto L_0x009e
            int r1 = r0.length
            if (r1 != 0) goto L_0x0066
            goto L_0x009e
        L_0x0066:
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.name
            r9.mLaunchActivity = r0
        L_0x006d:
            java.lang.String r0 = r9.mPluginName
            java.lang.String r1 = r9.mPluginApkFilePath
            dalvik.system.DexClassLoader r7 = com.tencent.midas.plugin.APPluginLoader.getOrCreateClassLoaderByPath(r9, r0, r1)
            android.content.Intent r0 = r9.getIntent()
            r0.setExtrasClassLoader(r7)
            java.lang.String r0 = r9.mLaunchActivity
            java.lang.Class r0 = r7.loadClass(r0)
            java.lang.Object r0 = r0.newInstance()
            r3 = r0
            com.tencent.midas.plugin.IAPPluginActivity r3 = (com.tencent.midas.plugin.IAPPluginActivity) r3
            r9.mPluginActivity = r3
            java.lang.String r4 = r9.mPluginName
            java.lang.String r5 = r9.mPluginApkFilePath
            r6 = r9
            r3.IInit(r4, r5, r6, r7, r8)
            com.tencent.midas.plugin.IAPPluginActivity r0 = r9.mPluginActivity
            android.content.Intent r1 = r9.getIntent()
            r0.ISetIntent(r1)
            r0 = 0
            return r0
        L_0x009e:
            java.lang.String r0 = "Activity Not Found!"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginProxyActivity.initPlugin():java.lang.String");
    }

    public static boolean isMoveTaskToBack(Context context, Intent intent) {
        return intent.getComponent() == null || !intent.getComponent().getPackageName().equals(context.getPackageName());
    }

    private boolean isStart3rdApp(Intent intent) {
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action) && action.equals("android.media.action.IMAGE_CAPTURE")) {
            return true;
        }
        if (!TextUtils.isEmpty(action) && action.equals("android.intent.action.GET_CONTENT")) {
            return true;
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        String packageName = component.getPackageName();
        if (!TextUtils.isEmpty(packageName) && packageName.equals("com.tencent.midas.pay")) {
            return true;
        }
        String className = component.getClassName();
        return !TextUtils.isEmpty(className) && className.equals("com.qzone");
    }

    private void logStartPluginErrInfo(String str) {
        if (str.contains("permission") || str.contains("filenotfoundexception")) {
            APLog.m161214i("logStartPluginErrInfo", "mPluginApkFilePath" + this.mPluginApkFilePath);
            ApplicationInfo applicationInfo = getApplicationInfo();
            if (applicationInfo != null) {
                int i = applicationInfo.flags;
                boolean z = false;
                boolean z2 = (i & 1) > 0;
                if ((i & 128) > 0) {
                    z = true;
                }
                APLog.m161210d("", "UID: " + applicationInfo.uid + ", IsSystemApp: " + z2 + ", IsUpdateSystemApp: " + z);
            }
        } else if (!str.contains("resources$notfoundexception") && !str.contains("resourcesnotfoundexception")) {
            str.contains("classnotfoundexception");
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0105 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void openActivityForResult(android.app.Activity r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, android.content.Intent r14, int r15) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "APPluginProxyActivity openActivityForResult pluginName："
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "APPLuginProxyActivity"
            com.tencent.midas.comm.APLog.m161214i(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "APPluginProxyActivity openActivityForResult contextActivity："
            r0.append(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.midas.comm.APLog.m161214i(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "APPluginProxyActivity openActivityForResult apkFilePath："
            r0.append(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.midas.comm.APLog.m161214i(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "APPluginProxyActivity openActivityForResult startIntent："
            r0.append(r2)
            java.lang.Class r3 = r14.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.midas.comm.APLog.m161214i(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.Class r3 = r14.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.midas.comm.APLog.m161214i(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.Class r2 = r14.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.midas.comm.APLog.m161214i(r1, r0)
            gPluginName = r11
            java.io.File r0 = com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPath(r10, r11)     // Catch:{ IOException -> 0x009a }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x009a }
            gPluginApkFilePath = r0     // Catch:{ IOException -> 0x009a }
        L_0x009a:
            java.lang.String r0 = "pluginsdk_pluginName"
            r14.putExtra(r0, r11)
            java.lang.String r11 = "pluginsdk_launchActivity"
            r14.putExtra(r11, r13)
            java.lang.String r11 = "pluginsdk_pluginpath"
            r14.putExtra(r11, r12)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "put is new process: "
            r11.append(r12)
            boolean r12 = com.tencent.midas.control.APMidasPayHelper.isNewProcess
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.midas.comm.APLog.m161212e(r1, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "put is log enable: "
            r11.append(r12)
            boolean r12 = com.tencent.midas.control.APMidasPayHelper.isLogEnable()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.midas.comm.APLog.m161212e(r1, r11)
            boolean r11 = com.tencent.midas.control.APMidasPayHelper.isNewProcess
            java.lang.String r12 = "pluginsdk_isNewProcess"
            r14.putExtra(r12, r11)
            boolean r11 = com.tencent.midas.control.APMidasPayHelper.isLogEnable()
            java.lang.String r12 = "pluginsdk_logEnable"
            r14.putExtra(r12, r11)
            java.lang.String r11 = com.tencent.midas.control.APMidasPayHelper.getLogCallbackClassName()
            java.lang.String r12 = "pluginsdk_logCallbackClassName"
            r14.putExtra(r12, r11)
            boolean r11 = com.tencent.midas.control.APMidasPayHelper.cutoutEnable
            java.lang.String r12 = "pluginsdk_cutOutEnable"
            r14.putExtra(r12, r11)
            java.lang.String r11 = "pluginsdk_openSDKEnable"
            boolean r12 = com.tencent.tauth.Tencent.isPermissionNotGranted()     // Catch:{ all -> 0x0105 }
            if (r12 != 0) goto L_0x0101
            r12 = 1
            goto L_0x0102
        L_0x0101:
            r12 = 0
        L_0x0102:
            r14.putExtra(r11, r12)     // Catch:{ all -> 0x0105 }
        L_0x0105:
            k20.a r11 = new k20.a     // Catch:{ all -> 0x0125 }
            r11.<init>()     // Catch:{ all -> 0x0125 }
            k20.C60958c.m71442b(r15, r11)     // Catch:{ all -> 0x0125 }
            r11.mo10233c(r14)     // Catch:{ all -> 0x0125 }
            java.lang.Object[] r3 = r11.mo10232b()     // Catch:{ all -> 0x0125 }
            java.lang.String r4 = "com/tencent/midas/plugin/APPluginProxyActivity"
            java.lang.String r5 = "openActivityForResult"
            java.lang.String r6 = "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;I)V"
            java.lang.String r7 = "android/app/Activity"
            java.lang.String r8 = "startActivityForResult"
            java.lang.String r9 = "(Landroid/content/Intent;I)V"
            r2 = r10
            j20.C117292a.m165364j(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0125 }
            goto L_0x013e
        L_0x0125:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "APPluginProxyActivity openActivityForResult Throwable:"
            r11.append(r12)
            java.lang.String r10 = r10.toString()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.midas.comm.APLog.m161214i(r1, r10)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginProxyActivity.openActivityForResult(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, android.content.Intent, int):void");
    }

    private static void setClassLoaderToEveryBundle(Bundle bundle, ClassLoader classLoader) {
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (sUnparcelMethod == null || sMMapField == null) {
                Class<?> cls = bundle.getClass();
                Method declaredMethod = cls.getDeclaredMethod("unparcel", new Class[0]);
                sUnparcelMethod = declaredMethod;
                declaredMethod.setAccessible(true);
                Field declaredField = cls.getDeclaredField("mMap");
                sMMapField = declaredField;
                declaredField.setAccessible(true);
            }
            sUnparcelMethod.invoke(bundle, new Object[0]);
            Map map = (Map) sMMapField.get(bundle);
            if (map != null) {
                for (Object next : map.values()) {
                    if (next instanceof Bundle) {
                        setClassLoaderToEveryBundle((Bundle) next, classLoader);
                    }
                }
            }
        }
    }

    private void startPluginActivityForResult(Activity activity, String str, Intent intent, int i) {
        APLog.m161214i("APPLuginProxyActivity", "APPluginProxyActivity startPluginActivityForResult.private");
        Intent intent2 = new Intent(activity, getProxyActivity(str));
        intent2.putExtra(APPluginStatic.PARAM_PLUGIN_NAME, this.mPluginName);
        intent2.putExtra(APPluginStatic.PARAM_PLUGIN_PATH, this.mPluginApkFilePath);
        intent2.putExtra(APPluginStatic.PARAM_LAUNCH_ACTIVITY, str);
        APLog.m161214i("APPLuginProxyActivity", "APPluginProxyActivity setExtrasClassLoader before");
        intent2.setExtrasClassLoader(intent.getExtras().getClassLoader());
        APLog.m161214i("APPLuginProxyActivity", "APPluginProxyActivity setExtrasClassLoader after");
        intent2.addFlags(intent.getFlags());
        intent2.putExtras(intent);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent2);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/midas/plugin/APPluginProxyActivity", "startPluginActivityForResult", "(Landroid/app/Activity;Ljava/lang/String;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        return iAPPluginActivity != null ? iAPPluginActivity.IDispatchTouchEvent(motionEvent) : super.dispatchTouchEvent(motionEvent);
    }

    public Class<? extends APPluginProxyActivity> getProxyActivity(String str) {
        return getClass();
    }

    public boolean isWrapContent() {
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            return iAPPluginActivity.IIsWrapContent();
        }
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        APLog.m161214i("APPLuginProxyActivity", "onActivityResult requestCode:" + i + " resultCode:" + i2 + " mPluginActivity:" + this.mPluginActivity);
        super.onActivityResult(i, i2, intent);
        if (this.mPluginActivity != null) {
            try {
                ClassLoader classLoader = APPluginLoader.getClassLoader(this.mPluginName, APPluginUtils.getMD5FromPath(APPluginInstallerAndUpdater.getInstallPath(this, this.mPluginName).getCanonicalPath()));
                if (!(classLoader == null || intent == null)) {
                    intent.setExtrasClassLoader(classLoader);
                }
                this.mPluginActivity.IOnActivityResult(i, i2, intent);
            } catch (Exception e) {
                APLog.m161222w("APPLuginProxyActivity onActivityResult", e.toString());
            }
        }
    }

    public void onAttachedToWindow() {
        ViewGroup viewGroup;
        super.onAttachedToWindow();
        if (cutOutEnable && Build.VERSION.SDK_INT >= 28) {
            try {
                DisplayCutout displayCutout = getWindow().getDecorView().getRootWindowInsets().getDisplayCutout();
                if (displayCutout != null && (viewGroup = (ViewGroup) ((ViewGroup) findViewById(16908290)).getChildAt(0)) != null) {
                    viewGroup.setPadding(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (IllegalStateException unused) {
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            try {
                iAPPluginActivity.IOnConfigurationChanged(configuration);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0187 A[SYNTHETIC, Splitter:B:40:0x0187] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0248 A[SYNTHETIC, Splitter:B:76:0x0248] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "APPluginProxyActivity onCreate gPluginName:"
            r0.append(r1)
            java.lang.String r1 = gPluginName
            r0.append(r1)
            java.lang.String r1 = " gPluginApkFilePath1:"
            r0.append(r1)
            java.lang.String r1 = gPluginApkFilePath
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "APPLuginProxyActivity"
            com.tencent.midas.comm.APLog.m161214i(r1, r0)
            java.lang.String r0 = gPluginName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0039
            super.onCreate(r10)
            java.lang.String r10 = "gPluginName is null"
            com.tencent.midas.comm.APLog.m161222w(r1, r10)
            r9.finish()
            com.tencent.midas.plugin.APPluginStatic.removeAll()
            return
        L_0x0039:
            java.lang.String r0 = gPluginName
            java.lang.String r0 = com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPathString(r9, r0)
            java.lang.String r0 = com.tencent.midas.plugin.APPluginUtils.getMD5FromPath(r0)
            java.lang.String r2 = gPluginName
            java.lang.ClassLoader r0 = com.tencent.midas.plugin.APPluginLoader.getClassLoader(r2, r0)
            if (r10 == 0) goto L_0x006c
            if (r0 == 0) goto L_0x006c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "APPluginProxyActivity onCreate savedInstanceState="
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = ", classLoader="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.midas.comm.APLog.m161214i(r1, r2)
            r10.setClassLoader(r0)
        L_0x006c:
            android.content.Intent r2 = r9.getIntent()
            if (r10 == 0) goto L_0x0074
            r0 = r10
            goto L_0x0081
        L_0x0074:
            if (r0 == 0) goto L_0x0079
            r2.setExtrasClassLoader(r0)
        L_0x0079:
            android.content.Intent r0 = r9.getIntent()
            android.os.Bundle r0 = r0.getExtras()
        L_0x0081:
            java.lang.String r2 = ""
            r3 = 0
            r4 = 1
            java.lang.String r5 = "pluginsdk_pluginName"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0131 }
            r9.mPluginName = r5     // Catch:{ Exception -> 0x0131 }
            java.lang.String r5 = "pluginsdk_launchActivity"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0131 }
            r9.mLaunchActivity = r5     // Catch:{ Exception -> 0x0131 }
            java.lang.String r5 = "pluginsdk_pluginpath"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0131 }
            r9.mPluginApkFilePath = r5     // Catch:{ Exception -> 0x0131 }
            java.lang.String r5 = "pluginsdk_isNewProcess"
            boolean r5 = r0.getBoolean(r5)     // Catch:{ Exception -> 0x0131 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012f }
            r6.<init>()     // Catch:{ Exception -> 0x012f }
            java.lang.String r7 = "is new process: "
            r6.append(r7)     // Catch:{ Exception -> 0x012f }
            r6.append(r5)     // Catch:{ Exception -> 0x012f }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x012f }
            com.tencent.midas.comm.APLog.m161210d(r1, r6)     // Catch:{ Exception -> 0x012f }
            java.lang.String r6 = "pluginsdk_logEnable"
            boolean r6 = r0.getBoolean(r6)     // Catch:{ Exception -> 0x012f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012d }
            r7.<init>()     // Catch:{ Exception -> 0x012d }
            java.lang.String r8 = "is log enable: "
            r7.append(r8)     // Catch:{ Exception -> 0x012d }
            r7.append(r6)     // Catch:{ Exception -> 0x012d }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x012d }
            com.tencent.midas.comm.APLog.m161210d(r1, r7)     // Catch:{ Exception -> 0x012d }
            java.lang.String r7 = "pluginsdk_logCallbackClassName"
            java.lang.String r2 = r0.getString(r7)     // Catch:{ Exception -> 0x012d }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012d }
            r7.<init>()     // Catch:{ Exception -> 0x012d }
            java.lang.String r8 = "logCallbackClassName: "
            r7.append(r8)     // Catch:{ Exception -> 0x012d }
            r7.append(r2)     // Catch:{ Exception -> 0x012d }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x012d }
            com.tencent.midas.comm.APLog.m161210d(r1, r7)     // Catch:{ Exception -> 0x012d }
            java.lang.String r7 = "com.tencent.midas.pay.APMidasDistributeActivity"
            java.lang.String r8 = r9.mLaunchActivity     // Catch:{ Exception -> 0x012d }
            boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x012d }
            if (r7 != 0) goto L_0x00ff
            java.lang.String r7 = "com.tencent.midas.pay.APMidasH5DistributeActivity"
            java.lang.String r8 = r9.mLaunchActivity     // Catch:{ Exception -> 0x012d }
            boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x012d }
            if (r7 == 0) goto L_0x0152
        L_0x00ff:
            java.lang.String r7 = "pluginsdk_cutOutEnable"
            boolean r7 = r0.getBoolean(r7)     // Catch:{ Exception -> 0x012d }
            cutOutEnable = r7     // Catch:{ Exception -> 0x012d }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012d }
            r7.<init>()     // Catch:{ Exception -> 0x012d }
            java.lang.String r8 = "is cutOut enable: "
            r7.append(r8)     // Catch:{ Exception -> 0x012d }
            boolean r8 = cutOutEnable     // Catch:{ Exception -> 0x012d }
            r7.append(r8)     // Catch:{ Exception -> 0x012d }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x012d }
            com.tencent.midas.comm.APLog.m161210d(r1, r7)     // Catch:{ Exception -> 0x012d }
            if (r5 == 0) goto L_0x0152
            java.lang.String r7 = "pluginsdk_openSDKEnable"
            boolean r0 = r0.getBoolean(r7)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0152
            com.tencent.tauth.Tencent.setIsPermissionGranted(r4)     // Catch:{ all -> 0x012b }
            goto L_0x0152
        L_0x012b:
            goto L_0x0152
        L_0x012d:
            r0 = move-exception
            goto L_0x0134
        L_0x012f:
            r0 = move-exception
            goto L_0x0133
        L_0x0131:
            r0 = move-exception
            r5 = 0
        L_0x0133:
            r6 = 1
        L_0x0134:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "bundle exception:"
            r7.append(r8)
            java.lang.String r0 = r0.toString()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.midas.comm.APLog.m161222w(r1, r0)
            r9.finish()
            com.tencent.midas.plugin.APPluginStatic.removeAll()
        L_0x0152:
            com.tencent.midas.comm.APLogUtil.initAPLogIfNewProcess(r9, r5, r6, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "APPluginProxyActivity onCreate mPluginName："
            r0.append(r2)
            java.lang.String r2 = r9.mPluginName
            r0.append(r2)
            java.lang.String r2 = ", mLaunchActivity："
            r0.append(r2)
            java.lang.String r2 = r9.mLaunchActivity
            r0.append(r2)
            java.lang.String r2 = ", mPluginApkFilePath："
            r0.append(r2)
            java.lang.String r2 = r9.mPluginApkFilePath
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.midas.comm.APLog.m161214i(r1, r0)
            java.lang.String r0 = r9.mPluginApkFilePath
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0195
            java.lang.String r0 = r9.mPluginName     // Catch:{ Exception -> 0x0194 }
            java.io.File r0 = com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPath(r9, r0)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ Exception -> 0x0194 }
            r9.mPluginApkFilePath = r0     // Catch:{ Exception -> 0x0194 }
            goto L_0x0195
        L_0x0194:
        L_0x0195:
            java.lang.String r0 = r9.mLaunchActivity
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "Midas"
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = "APPluginProxyActivity onCreate mLaunchActivity is null"
            com.tencent.midas.comm.APLog.m161212e(r1, r0)
            super.onCreate(r10)
            r9.finish()
            com.tencent.midas.plugin.APPluginStatic.removeAll()
            return
        L_0x01ae:
            java.lang.String r0 = r9.mPluginName
            if (r0 == 0) goto L_0x01fc
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01b9
            goto L_0x01fc
        L_0x01b9:
            java.lang.String r0 = r9.initPlugin()     // Catch:{ Exception -> 0x01de }
            if (r0 != 0) goto L_0x01fe
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01de }
            r5 = 30
            if (r2 >= r5) goto L_0x01d1
            android.view.LayoutInflater r2 = r9.getLayoutInflater()     // Catch:{ Exception -> 0x01de }
            com.tencent.midas.plugin.APLayoutInflaterFactory r5 = new com.tencent.midas.plugin.APLayoutInflaterFactory     // Catch:{ Exception -> 0x01de }
            r5.<init>()     // Catch:{ Exception -> 0x01de }
            r2.setFactory2(r5)     // Catch:{ Exception -> 0x01de }
        L_0x01d1:
            super.onCreate(r10)     // Catch:{ Exception -> 0x01de }
            com.tencent.midas.plugin.IAPPluginActivity r2 = r9.mPluginActivity     // Catch:{ Exception -> 0x01db }
            r2.IOnCreate(r10)     // Catch:{ Exception -> 0x01db }
            r3 = 1
            goto L_0x01fe
        L_0x01db:
            r0 = move-exception
            r3 = 1
            goto L_0x01df
        L_0x01de:
            r0 = move-exception
        L_0x01df:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "APPluginProxyActivity onCreate:"
            r2.append(r5)
            java.lang.String r5 = r0.toString()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.midas.comm.APLog.m161212e(r1, r2)
            java.lang.String r0 = com.tencent.midas.plugin.APPluginUtils.getExceptionInfo(r0)
            goto L_0x01fe
        L_0x01fc:
            java.lang.String r0 = "Param mPluingLocation missing!"
        L_0x01fe:
            if (r3 != 0) goto L_0x0203
            super.onCreate(r10)
        L_0x0203:
            if (r0 == 0) goto L_0x023e
            r9.mCreateErrorInfo = r0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "APPluginProxyActivity onCreate activity failed:"
            r10.append(r2)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.midas.comm.APLog.m161212e(r1, r10)
            java.lang.String r10 = r9.mCreateErrorInfo
            r9.logStartPluginErrInfo(r10)
            java.lang.String r10 = r9.mCreateErrorInfo
            boolean r10 = r9.shouldHandleStartPluginFailed(r10)
            if (r10 != 0) goto L_0x023e
            com.tencent.midas.data.APPluginReportManager r10 = com.tencent.midas.data.APPluginReportManager.getInstance()
            java.lang.String r1 = r9.mPluginName
            java.lang.String r2 = "timename.launchpay"
            java.lang.String r3 = "sdk.loadapk_fail"
            r10.insertData(r2, r3, r1, r0)
            com.tencent.midas.plugin.APPluginUtils.showLaunchPluginFail(r9, r0, r4)
            r9.finish()
            com.tencent.midas.plugin.APPluginStatic.removeAll()
        L_0x023e:
            boolean r10 = cutOutEnable
            if (r10 == 0) goto L_0x026b
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r10 < r0) goto L_0x026b
            android.view.Window r10 = r9.getWindow()     // Catch:{ Exception -> 0x026b }
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r10.addFlags(r0)     // Catch:{ Exception -> 0x026b }
            android.view.Window r10 = r9.getWindow()     // Catch:{ Exception -> 0x026b }
            r0 = 1024(0x400, float:1.435E-42)
            r10.addFlags(r0)     // Catch:{ Exception -> 0x026b }
            android.view.Window r10 = r9.getWindow()     // Catch:{ Exception -> 0x026b }
            android.view.WindowManager$LayoutParams r10 = r10.getAttributes()     // Catch:{ Exception -> 0x026b }
            r10.layoutInDisplayCutoutMode = r4     // Catch:{ Exception -> 0x026b }
            android.view.Window r0 = r9.getWindow()     // Catch:{ Exception -> 0x026b }
            r0.setAttributes(r10)     // Catch:{ Exception -> 0x026b }
        L_0x026b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginProxyActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        return iAPPluginActivity != null ? iAPPluginActivity.IOnCreateOptionsMenu(menu) : super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        APLog.m161214i(TAG, "onDestroy mPluginActivity:" + this.mPluginActivity);
        APLogUtil.flushIfNewProcess();
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            try {
                iAPPluginActivity.IOnDestroy();
            } catch (Exception unused) {
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        boolean IOnKeyDown = iAPPluginActivity != null ? iAPPluginActivity.IOnKeyDown(i, keyEvent) : false;
        return !IOnKeyDown ? super.onKeyDown(i, keyEvent) : IOnKeyDown;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        return iAPPluginActivity != null ? iAPPluginActivity.IOnMenuItemSelected(i, menuItem) : super.onMenuItemSelected(i, menuItem);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ClassLoader classLoader = APPluginLoader.getClassLoader(this.mPluginName, APPluginUtils.getMD5FromPath(APPluginInstallerAndUpdater.getInstallPathString(this, this.mPluginName)));
        APLog.m161214i("APPLuginProxyActivity", "APPluginProxyActivity onNewIntent mPluginName:" + this.mPluginName + " classLoader: " + classLoader);
        if (classLoader != null) {
            intent.setExtrasClassLoader(classLoader);
        }
        if (this.mPluginActivity != null && intent.getBooleanExtra(APPluginStatic.PARAM_CLEAR_TOP, false)) {
            this.mPluginActivity.IOnNewIntent(intent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        return iAPPluginActivity != null ? iAPPluginActivity.IOnOptionsItemSelected(menuItem) : super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnPause();
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        return iAPPluginActivity != null ? iAPPluginActivity.IOnPrepareOptionsMenu(menu) : super.onPrepareOptionsMenu(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        APLog.m161214i("APPLuginProxyActivity", "onRequestPermissionsResult requestCode:" + i + " permissions:" + strArr + " grantResults:" + iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.mPluginActivity != null) {
            try {
                APPluginLoader.getClassLoader(this.mPluginName, APPluginUtils.getMD5FromPath(APPluginInstallerAndUpdater.getInstallPath(this, this.mPluginName).getCanonicalPath()));
                this.mPluginActivity.IOnRequestPermissionsResult(i, strArr, iArr);
            } catch (Exception e) {
                APLog.m161222w("APPLuginProxyActivity onRequestPermissionsResult", e.toString());
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(2:2|3)|4|5|7|(2:9|10)(1:11)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRestoreInstanceState(android.os.Bundle r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.mPluginName
            java.lang.String r0 = com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPathString(r2, r0)
            java.lang.String r0 = com.tencent.midas.plugin.APPluginUtils.getMD5FromPath(r0)
            java.lang.String r1 = r2.mPluginName
            java.lang.ClassLoader r0 = com.tencent.midas.plugin.APPluginLoader.getClassLoader(r1, r0)
            if (r0 == 0) goto L_0x0015
            setClassLoaderToEveryBundle(r3, r0)     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            super.onRestoreInstanceState(r3)     // Catch:{ Exception -> 0x0019 }
            goto L_0x001a
        L_0x0019:
        L_0x001a:
            com.tencent.midas.plugin.IAPPluginActivity r0 = r2.mPluginActivity
            if (r0 == 0) goto L_0x0021
            r0.IOnRestoreInstanceState(r3)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginProxyActivity.onRestoreInstanceState(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnSaveInstanceState(bundle);
        }
        bundle.putString(APPluginStatic.PARAM_PLUGIN_NAME, this.mPluginName);
        bundle.putString(APPluginStatic.PARAM_PLUGIN_LOCATION, this.mPluginName);
        bundle.putString(APPluginStatic.PARAM_PLUGIN_PATH, this.mPluginApkFilePath);
        bundle.putString(APPluginStatic.PARAM_LAUNCH_ACTIVITY, this.mLaunchActivity);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnStart();
        }
    }

    public void onStop() {
        super.onStop();
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnStop();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        return iAPPluginActivity != null ? iAPPluginActivity.IOnTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public void onUserInteraction() {
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnUserInteraction();
        } else {
            super.onUserInteraction();
        }
    }

    public void onUserLeaveHint() {
        super.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAPPluginActivity iAPPluginActivity = this.mPluginActivity;
        if (iAPPluginActivity != null) {
            iAPPluginActivity.IOnWindowFocusChanged(z);
        }
    }

    public void setRequestedOrientation(int i) {
        APLog.m161214i(TAG, "setRequestedOrientation requestedOrientation:" + i);
        super.setRequestedOrientation(i);
    }

    public boolean shouldHandleStartPluginFailed(String str) {
        if (str.contains("permission") || str.contains("filenotfoundexception")) {
            showNeedUninstanllAndInstallDialog();
            return true;
        } else if (!str.contains("resources$notfoundexception") && !str.contains("resourcesnotfoundexception")) {
            return false;
        } else {
            showNeedUninstanllAndInstallDialog();
            return true;
        }
    }

    public void showNeedUninstanllAndInstallDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("温馨提示");
        builder.setMessage("系统繁忙" + this.mPluginName + "失败，请卸载重装~");
        builder.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                APPluginProxyActivity.this.finish();
            }
        });
        try {
            builder.create().show();
        } catch (Exception unused) {
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        if (intent.getBooleanExtra(APPluginStatic.PARAM_IS_IN_PLUGIN, false)) {
            String str = null;
            ComponentName component = intent.getComponent();
            if (component != null) {
                str = component.getClassName();
            }
            intent.putExtra(APPluginStatic.PARAM_IS_IN_PLUGIN, false);
            if (str != null && str.length() > 0) {
                startPluginActivityForResult(this, str, intent, i);
            }
        } else {
            super.startActivityForResult(intent, i);
        }
        this.mStopFlag = 2;
    }

    public void startActivityForResult(Intent intent, int i, int i2) {
        APLog.m161214i("APPLuginProxyActivity", "startActivityForResult.public");
        this.mStopFlag = 2;
        isStart3rdApp(intent);
        if (!isMoveTaskToBack(this, intent)) {
            intent.addFlags(262144);
        }
        super.startActivityForResult(intent, i);
    }
}
