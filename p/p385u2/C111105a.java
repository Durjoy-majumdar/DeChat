package p385u2;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import j20.C117292a;
import java.io.File;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import k20.C9556a;
import p1050v2.C111317c;
import p1050v2.C111325g;

/* renamed from: u2.a */
public class C111105a {

    /* renamed from: a */
    public static final Object f332697a = new Object();

    /* renamed from: b */
    public static final Object f332698b = new Object();

    /* renamed from: u2.a$a */
    public static class C90592a {
        /* renamed from: a */
        public static void m113490a(Context context, Intent[] intentArr, Bundle bundle) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(bundle);
            aVar.mo10233c(intentArr);
            C117292a.m165358d(context, aVar.mo10232b(), "androidx/core/content/ContextCompat$Api16Impl", "startActivities", "(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivities", "([Landroid/content/Intent;Landroid/os/Bundle;)V");
            context.startActivities((Intent[]) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
            C117292a.m165359e(context, "androidx/core/content/ContextCompat$Api16Impl", "startActivities", "(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivities", "([Landroid/content/Intent;Landroid/os/Bundle;)V");
        }

        /* renamed from: b */
        public static void m113491b(Context context, Intent intent, Bundle bundle) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(bundle);
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "androidx/core/content/ContextCompat$Api16Impl", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            context.startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
            C117292a.m165359e(context, "androidx/core/content/ContextCompat$Api16Impl", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        }
    }

    /* renamed from: u2.a$d */
    public static class C111106d {
        /* renamed from: a */
        public static int m151503a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        public static <T> T m151504b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: c */
        public static String m151505c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: u2.a$f */
    public static class C111107f {
        /* renamed from: a */
        public static ComponentName m151506a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: u2.a$h */
    public static final class C111108h {

        /* renamed from: a */
        public static final HashMap<Class<?>, String> f332699a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f332699a = hashMap;
            if (Build.VERSION.SDK_INT >= 22) {
                hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, SharePatchInfo.FINGER_PRINT);
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, FirebaseAnalytics.C113379b.LOCATION);
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    /* renamed from: u2.a$b */
    public static class C111109b {
        /* renamed from: a */
        public static File[] m151507a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        public static File[] m151508b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        public static File[] m151509c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: u2.a$c */
    public static class C111110c {
        /* renamed from: a */
        public static File m151510a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        public static Drawable m151511b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        public static File m151512c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: u2.a$e */
    public static class C111111e {
        /* renamed from: a */
        public static Context m151513a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        public static File m151514b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        public static boolean m151515c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: u2.a$g */
    public static class C111112g {
        /* renamed from: a */
        public static Executor m151516a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: a */
    public static int m151499a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* renamed from: b */
    public static int m151500b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? C111106d.m151503a(context, i) : context.getResources().getColor(i);
    }

    /* renamed from: c */
    public static ColorStateList m151501c(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C111325g.C111326b bVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C111325g.C111327c cVar = new C111325g.C111327c(resources, theme);
        synchronized (C111325g.f333303c) {
            SparseArray sparseArray = C111325g.f333302b.get(cVar);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (bVar = (C111325g.C111326b) sparseArray.get(i)) == null)) {
                if (bVar.f333305b.equals(resources.getConfiguration())) {
                    colorStateList2 = bVar.f333304a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = C111325g.f333301a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        if (!z) {
            try {
                colorStateList = C111317c.m151800a(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateList == null) {
            return Build.VERSION.SDK_INT >= 23 ? C111325g.C90738a.m113805a(resources, i, theme) : resources.getColorStateList(i);
        }
        synchronized (C111325g.f333303c) {
            WeakHashMap<C111325g.C111327c, SparseArray<C111325g.C111326b>> weakHashMap = C111325g.f333302b;
            SparseArray sparseArray2 = weakHashMap.get(cVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(cVar, sparseArray2);
            }
            sparseArray2.append(i, new C111325g.C111326b(colorStateList, cVar.f333306a.getConfiguration()));
        }
        return colorStateList;
    }

    /* renamed from: d */
    public static <T> T m151502d(Context context, Class<T> cls) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C111106d.m151504b(context, cls);
        }
        String c = i >= 23 ? C111106d.m151505c(context, cls) : C111108h.f332699a.get(cls);
        if (c != null) {
            return context.getSystemService(c);
        }
        return null;
    }
}
