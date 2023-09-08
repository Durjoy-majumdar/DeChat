package p903ij;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.lang.reflect.Method;
import k20.C9556a;

@Deprecated
/* renamed from: ij.b */
public class C76359b {

    /* renamed from: a */
    public static Boolean f223629a;

    /* renamed from: a */
    public static boolean m91784a(int i) {
        if (i == 0) {
            return true;
        }
        Object systemService = MMApplicationContext.getContext().getSystemService("appops");
        Method method = null;
        if (systemService != null) {
            try {
                Class<?> cls = Class.forName("android.app.AppOpsManager");
                Class cls2 = Integer.TYPE;
                method = cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class});
            } catch (NoSuchMethodException e) {
                Log.m105921e("MicroMsg.PermissionUtil", "onVoiceRcdStartRequest meizu NoSuchMethodException method:checkOpNoThrow! Error:%s", e.getMessage());
            } catch (ClassNotFoundException e2) {
                Log.m105921e("MicroMsg.PermissionUtil", "ClassNotFoundException class:android.app.AppOpsManager! Error:%s", e2.getMessage());
            }
        }
        if (method != null) {
            int i2 = -1;
            try {
                i2 = ((Integer) method.invoke(systemService, new Object[]{Integer.valueOf(i), Integer.valueOf(MMApplicationContext.getContext().getApplicationInfo().uid), MMApplicationContext.getPackageName()})).intValue();
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.PermissionUtil", "invoke checkOpNoThrow Exception! Error:%s", e3.getMessage());
            }
            if (i2 != 0) {
                Log.m105921e("MicroMsg.PermissionUtil", "ret:%d showAlert to ask for record permission for wechat!", Integer.valueOf(i2));
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m91785b() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
            return true;
        }
        return m91784a(26);
    }

    /* renamed from: c */
    public static boolean m91786c(Context context) {
        if (f223629a == null) {
            if (context != null) {
                try {
                    context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
                } catch (Throwable th) {
                    f223629a = Boolean.FALSE;
                    throw th;
                }
            }
            f223629a = Boolean.FALSE;
        }
        return f223629a.booleanValue();
    }

    /* renamed from: d */
    public static boolean m91787d(Context context) {
        Method method = null;
        boolean z = false;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                boolean booleanValue = ((Boolean) Settings.class.getDeclaredMethod("canDrawOverlays", new Class[]{Context.class}).invoke((Object) null, new Object[]{context})).booleanValue();
                Log.m105924i("MicroMsg.PermissionUtil", "isFloatWindowOpAllowed allowed: " + booleanValue);
                return booleanValue;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.PermissionUtil", "getDeclaredMethod:canDrawOverlays! Error:%s, etype:%s", e.getMessage(), e.getClass().getCanonicalName());
                return true;
            }
        } else {
            Object systemService = MMApplicationContext.getContext().getSystemService("appops");
            try {
                Class<?> cls = Class.forName("android.app.AppOpsManager");
                Class cls2 = Integer.TYPE;
                method = cls.getMethod("checkOp", new Class[]{cls2, cls2, String.class});
            } catch (NoSuchMethodException e2) {
                Log.m105921e("MicroMsg.PermissionUtil", "NoSuchMethodException method:checkOp! Error:%s", e2.getMessage());
            } catch (ClassNotFoundException e3) {
                Log.m105921e("MicroMsg.PermissionUtil", "ClassNotFoundException class:android.app.AppOpsManager! Error:%s", e3.getMessage());
            }
            if (method != null) {
                try {
                    if (((Integer) method.invoke(systemService, new Object[]{24, Integer.valueOf(MMApplicationContext.getContext().getApplicationInfo().uid), MMApplicationContext.getPackageName()})).intValue() == 0) {
                        z = true;
                    }
                    z2 = z;
                } catch (Exception e4) {
                    Log.m105921e("MicroMsg.PermissionUtil", "call checkOp failed: %s etype:%s", e4.getMessage(), e4.getClass().getCanonicalName());
                }
            }
            Log.m105924i("MicroMsg.PermissionUtil", "isFloatWindowOpAllowed allowed: " + z2);
            return z2;
        }
    }

    /* renamed from: e */
    public static void m91788e(Context context) {
        if (Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
            try {
                Intent intent = new Intent();
                intent.setClassName("com.android.settings", "com.android.settings.applications.AppsCheckReadPermission");
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/compatible/permission/PermissionUtil", "showPermissionSettingsOfMeizu", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/compatible/permission/PermissionUtil", "showPermissionSettingsOfMeizu", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.PermissionUtil", "unable start activity AppsCheckReadPermission");
                try {
                    Intent intent2 = new Intent("android.settings.APP_OPS_SETTINGS");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/compatible/permission/PermissionUtil", "showPermissionSettingsOfMeizu", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/compatible/permission/PermissionUtil", "showPermissionSettingsOfMeizu", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception unused2) {
                    Log.m105920e("MicroMsg.PermissionUtil", "unable start activity APP_OPS_SETTINGS");
                    try {
                        Intent intent3 = new Intent();
                        intent3.setClassName("com.android.settings", "com.android.settings.Settings$AppControlSettingsActivity");
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(intent3);
                        C117292a.m165358d(context, aVar3.mo10232b(), "com/tencent/mm/compatible/permission/PermissionUtil", "showPermissionSettingsOfMeizu", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar3.mo10231a(0));
                        C117292a.m165359e(context, "com/tencent/mm/compatible/permission/PermissionUtil", "showPermissionSettingsOfMeizu", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (Exception unused3) {
                        Log.m105920e("MicroMsg.PermissionUtil", "unable start activity AppControlSettingsActivity");
                    }
                }
            }
        }
    }
}
