package com.tencent.midas.plugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.midas.comm.APLog;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import j20.C117292a;
import java.lang.reflect.Field;
import java.util.List;
import k20.C60958c;
import k20.C9556a;

public class APPluginActivity extends HellActivity implements IAPPluginActivity {
    private byte _hellAccFlag_;
    public Activity mActivity = null;
    public String mApkFilePath = "";
    public Context mContext = null;
    private ClassLoader mDexClassLoader = null;
    private boolean mFinished = false;
    public boolean mIsRunInPlugin = false;
    public PackageInfo mPackageInfo = null;
    public String mPluginName = "";
    public Activity mProxyActivity = null;
    public View mProxyContentView = null;

    public static final Bitmap getDrawableBitmap(Drawable drawable) {
        if (drawable != null && (drawable instanceof BitmapDrawable)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    public boolean IDispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return true;
        }
    }

    public void IFinish() {
        finish();
    }

    public View IGetContentView() {
        return this.mProxyContentView;
    }

    public Handler IGetInHandler() {
        return null;
    }

    public Resources IGetResource() {
        Context context = this.mContext;
        return context != null ? context.getResources() : this.mActivity.getResources();
    }

    public void IInit(String str, String str2, Activity activity, ClassLoader classLoader, PackageInfo packageInfo) {
        this.mIsRunInPlugin = true;
        this.mDexClassLoader = classLoader;
        this.mProxyActivity = activity;
        this.mPluginName = str;
        this.mApkFilePath = str2;
        this.mPackageInfo = packageInfo;
        APPluginContext aPPluginContext = new APPluginContext(activity, 0, str2, classLoader);
        this.mContext = aPPluginContext;
        attachBaseContext(aPPluginContext);
    }

    public boolean IIsWrapContent() {
        return true;
    }

    public void IOnActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    public void IOnConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public void IOnCreate(Bundle bundle) {
        onCreate(bundle);
    }

    public boolean IOnCreateOptionsMenu(Menu menu) {
        return onCreateOptionsMenu(menu);
    }

    public void IOnDestroy() {
        onDestroy();
    }

    public boolean IOnKeyDown(int i, KeyEvent keyEvent) {
        return onKeyDown(i, keyEvent);
    }

    public boolean IOnKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return onKeyMultiple(i, i2, keyEvent);
    }

    public boolean IOnKeyUp(int i, KeyEvent keyEvent) {
        return onKeyUp(i, keyEvent);
    }

    public boolean IOnMenuItemSelected(int i, MenuItem menuItem) {
        return onMenuItemSelected(i, menuItem);
    }

    public void IOnNewIntent(Intent intent) {
        onNewIntent(intent);
    }

    public boolean IOnOptionsItemSelected(MenuItem menuItem) {
        return onOptionsItemSelected(menuItem);
    }

    public void IOnPause() {
        onPause();
    }

    public boolean IOnPrepareOptionsMenu(Menu menu) {
        return onPrepareOptionsMenu(menu);
    }

    public void IOnRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onRequestPermissionsResult(i, strArr, iArr);
    }

    public void IOnRestart() {
        onRestart();
    }

    public void IOnRestoreInstanceState(Bundle bundle) {
    }

    public void IOnResume() {
        onResume();
    }

    public void IOnSaveInstanceState(Bundle bundle) {
    }

    public void IOnStart() {
        onStart();
    }

    public void IOnStop() {
        onStop();
    }

    public boolean IOnTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    public void IOnUserInteraction() {
        onUserInteraction();
    }

    public void IOnWindowFocusChanged(boolean z) {
        onWindowFocusChanged(z);
    }

    public void IRequestPermissions(String[] strArr, int i) {
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(strArr);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/midas/plugin/APPluginActivity", "IRequestPermissions", "([Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        requestPermissions((String[]) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(this, "com/tencent/midas/plugin/APPluginActivity", "IRequestPermissions", "([Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        APLog.m161214i("APPluginActivity", "IRequestPermissions() permissions=" + strArr + ", requestCode=" + i);
        if (!this.mIsRunInPlugin) {
            super.requestPermissions(strArr, i);
        }
    }

    public void ISetIntent(Intent intent) {
        setIntent(intent);
    }

    public void ISetOutHandler(Handler handler) {
    }

    public View findViewById(int i) {
        View view;
        if (!this.mIsRunInPlugin || (view = this.mProxyContentView) == null) {
            return super.findViewById(i);
        }
        View findViewById = view.findViewById(i);
        return findViewById == null ? super.findViewById(i) : findViewById;
    }

    public void finish() {
        Class<Activity> cls = Activity.class;
        APLog.m161214i("APPluginActivity", "APPluginActivity finish");
        if (this.mIsRunInPlugin) {
            int i = 0;
            Intent intent = null;
            synchronized (this) {
                try {
                    Field declaredField = cls.getDeclaredField("mResultCode");
                    declaredField.setAccessible(true);
                    i = ((Integer) declaredField.get(this)).intValue();
                    Field declaredField2 = cls.getDeclaredField("mResultData");
                    declaredField2.setAccessible(true);
                    intent = (Intent) declaredField2.get(this);
                } catch (Exception e) {
                    e.toString();
                }
            }
            this.mProxyActivity.setResult(i, intent);
            this.mProxyActivity.finish();
            this.mFinished = true;
            return;
        }
        super.finish();
    }

    public Context getApplicationContext() {
        APLog.m161214i("APPluginActivity", "APPluginActivity getApplicationContext mProxyActivity:" + this.mProxyActivity);
        return this.mIsRunInPlugin ? this.mProxyActivity.getApplicationContext() : super.getApplicationContext();
    }

    public ApplicationInfo getApplicationInfo() {
        return this.mIsRunInPlugin ? this.mPackageInfo.applicationInfo : super.getApplicationInfo();
    }

    public int getChangingConfigurations() {
        return this.mIsRunInPlugin ? this.mProxyActivity.getChangingConfigurations() : super.getChangingConfigurations();
    }

    public Resources getHostResources() {
        return this.mProxyActivity.getResources();
    }

    public LayoutInflater getLayoutInflater() {
        Context context = this.mContext;
        return context != null ? LayoutInflater.from(context) : LayoutInflater.from(this.mActivity);
    }

    public Activity getOutActivity() {
        return this.mProxyActivity;
    }

    public Resources getOutResources() {
        return this.mIsRunInPlugin ? this.mProxyActivity.getResources() : this.mActivity.getResources();
    }

    public PackageInfo getPackageInfo() {
        if (this.mIsRunInPlugin) {
            return this.mPackageInfo;
        }
        return null;
    }

    public String getPackageName() {
        return this.mIsRunInPlugin ? this.mPackageInfo.packageName : super.getPackageName();
    }

    public Object getSystemService(String str) {
        if ("window".equals(str) || "search".equals(str)) {
            return this.mIsRunInPlugin ? this.mProxyActivity.getSystemService(str) : super.getSystemService(str);
        }
        Context context = this.mContext;
        return context != null ? context.getSystemService(str) : super.getSystemService(str);
    }

    public Window getWindow() {
        return this.mIsRunInPlugin ? this.mProxyActivity.getWindow() : super.getWindow();
    }

    public WindowManager getWindowManager() {
        return this.mIsRunInPlugin ? this.mProxyActivity.getWindowManager() : super.getWindowManager();
    }

    public boolean isFinishing() {
        return this.mIsRunInPlugin ? this.mFinished : super.isFinishing();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        APLog.m161214i("APPluginActivity", "APPluginActivity onActivityResult");
        if (!this.mIsRunInPlugin) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        if (this.mIsRunInPlugin) {
            this.mActivity = this.mProxyActivity;
            APPluginStatic.add(this);
            return;
        }
        super.onCreate(bundle);
        this.mActivity = this;
    }

    public void onDestroy() {
        APLog.m161214i("APPluginActivity", "onDestroy mIsRunInPlugin:" + this.mIsRunInPlugin);
        if (this.mIsRunInPlugin) {
            this.mDexClassLoader = null;
            APPluginStatic.remove(this);
            return;
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mIsRunInPlugin) {
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        if (this.mIsRunInPlugin) {
            return false;
        }
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.mIsRunInPlugin) {
            return false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onPause() {
        if (!this.mIsRunInPlugin) {
            super.onPause();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        APLog.m161214i("APPluginActivity", "onRequestPermissionsResult() requestCode=" + i);
        if (!this.mIsRunInPlugin) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onRestart() {
        if (!this.mIsRunInPlugin) {
            super.onRestart();
        }
    }

    public void onResume() {
        if (!this.mIsRunInPlugin) {
            super.onResume();
        }
    }

    public void onStart() {
        if (!this.mIsRunInPlugin) {
            super.onStart();
        }
    }

    public void onStop() {
        if (!this.mIsRunInPlugin) {
            super.onStop();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mIsRunInPlugin) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onWindowFocusChanged(boolean z) {
        if (!this.mIsRunInPlugin) {
            super.onWindowFocusChanged(z);
        }
    }

    public void openOptionsMenu() {
        if (this.mIsRunInPlugin) {
            this.mProxyActivity.openOptionsMenu();
        } else {
            super.openOptionsMenu();
        }
    }

    public void overridePendingTransition(int i, int i2) {
        if (this.mIsRunInPlugin) {
            this.mActivity.overridePendingTransition(i, i2);
        } else {
            super.overridePendingTransition(i, i2);
        }
    }

    public void setContentView(int i) {
        if (this.mIsRunInPlugin) {
            View inflate = LayoutInflater.from(this).inflate(i, (ViewGroup) null);
            this.mProxyContentView = inflate;
            this.mActivity.setContentView(inflate);
            return;
        }
        super.setContentView(i);
    }

    public void setRequestedOrientation(int i) {
        super.setRequestedOrientation(i);
    }

    public void setTheme(int i) {
        if (this.mIsRunInPlugin) {
            this.mProxyActivity.setTheme(i);
        } else {
            super.setTheme(i);
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        boolean z;
        if (this.mIsRunInPlugin) {
            boolean z2 = false;
            if (intent.hasExtra(APPluginStatic.PARAM_PLUGIN_INTERNAL_ACTIVITIES_ONLY)) {
                z = intent.getBooleanExtra(APPluginStatic.PARAM_PLUGIN_INTERNAL_ACTIVITIES_ONLY, false);
            } else {
                List<ResolveInfo> queryIntentActivities = this.mActivity.getPackageManager().queryIntentActivities(intent, 65536);
                if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                    z2 = true;
                }
                z = z2;
            }
            if (!z) {
                Activity activity = this.mActivity;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                aVar.mo10233c(intent);
                C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/midas/plugin/APPluginActivity", "startActivityForResult", "(Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return;
            }
            intent.putExtra(APPluginStatic.PARAM_IS_IN_PLUGIN, true);
            Activity activity2 = this.mActivity;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i));
            aVar2.mo10233c(intent);
            C117292a.m165364j(activity2, aVar2.mo10232b(), "com/tencent/midas/plugin/APPluginActivity", "startActivityForResult", "(Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        super.startActivityForResult(intent, i);
    }

    public void setContentView(View view) {
        if (this.mIsRunInPlugin) {
            this.mProxyContentView = view;
            this.mActivity.setContentView(view);
            return;
        }
        super.setContentView(view);
    }
}
