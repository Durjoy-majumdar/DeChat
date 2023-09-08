package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.WindowManager;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.ui.s4 */
public class C85930s4 {

    /* renamed from: a */
    public static Object f250297a;

    /* renamed from: b */
    public static Method f250298b;

    /* renamed from: a */
    public static int m106241a(int i) {
        if ((!C85875k4.m106171a0() && !C85875k4.m106169Z()) || f250298b == null) {
            return -1;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("@int:taskId", i);
            return ((Bundle) f250298b.invoke(f250297a, new Object[]{"com.tencent.mm", "getTaskPosition", jSONObject.toString(), null})).getInt("int");
        } catch (IllegalAccessException | InvocationTargetException | JSONException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m106242b(Context context) {
        Class<String> cls = String.class;
        if (!C85875k4.m106171a0() && !C85875k4.m106169Z()) {
            return false;
        }
        try {
            f250297a = (WindowManager) context.getSystemService("window");
            Method method = Class.forName("android.view.WindowManager").getMethod("invokeSync", new Class[]{cls, cls, cls, Bundle.class});
            f250298b = method;
            if (method == null) {
                return false;
            }
            return ((Bundle) method.invoke(f250297a, new Object[]{"com.tencent.mm", "isMultiLandsEnable", null, null})).getBoolean(DownloadSetting.TYPE_BOOLEAN);
        } catch (Exception e) {
            e.toString();
            try {
                f250297a = Class.forName("android.view.IWindowManager$Stub").getMethod("asInterface", new Class[]{IBinder.class}).invoke((Object) null, new Object[]{Class.forName("android.os.ServiceManager").getMethod("getService", new Class[]{cls}).invoke((Object) null, new Object[]{"window"})});
                Method method2 = Class.forName("android.view.IWindowManager$Stub$Proxy").getMethod("invokeSync", new Class[]{cls, cls, cls, Bundle.class});
                f250298b = method2;
                if (method2 == null) {
                    return false;
                }
                return ((Bundle) method2.invoke(f250297a, new Object[]{"com.tencent.mm", "isMultiLandsEnable", null, null})).getBoolean(DownloadSetting.TYPE_BOOLEAN);
            } catch (Exception e2) {
                e2.toString();
                return false;
            }
        }
    }

    /* renamed from: c */
    public static void m106243c(int i, int i2) {
        Method method;
        if ((C85875k4.m106171a0() || C85875k4.m106169Z()) && (method = f250298b) != null && method != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@int:taskId", i);
                jSONObject.put("@int:targetPosition", i2);
            } catch (JSONException e) {
                e.getMessage();
            }
            try {
                f250298b.invoke(f250297a, new Object[]{"com.tencent.mm", "setTaskPosition", jSONObject.toString(), null});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m106244d(int i) {
        try {
            if (f250298b == null) {
                return false;
            }
            Class<?> cls = Class.forName("android.app.Application");
            Method method = cls.getMethod("getApplicationInstance", new Class[0]);
            Method method2 = cls.getMethod("setWechatDarkModeStatus", new Class[]{Integer.TYPE});
            method.setAccessible(true);
            method2.setAccessible(true);
            method2.invoke(method.invoke((Object) null, new Object[0]), new Object[]{Integer.valueOf(i)});
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("@int:darkModeStatus", i);
            f250298b.invoke(f250297a, new Object[]{"com.tencent.mm", "setWechatDarkModeStatus", jSONObject.toString(), null});
            return true;
        } catch (Exception e) {
            e.toString();
            return false;
        }
    }
}
