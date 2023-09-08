package com.tencent.p014mm.booter.notification;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import cw0.C116541b;
import eb0.C45629t0;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONObject;
import p645pj.C77095h;
import p789bi.C67244b;
import p875ci.C67378t;

/* renamed from: com.tencent.mm.booter.notification.i */
public class C67843i {

    /* renamed from: a */
    public static boolean f194745a = true;

    /* renamed from: b */
    public static boolean f194746b = true;

    /* renamed from: c */
    public static boolean f194747c = false;

    /* renamed from: d */
    public static boolean f194748d = true;

    /* renamed from: e */
    public static boolean f194749e = true;

    /* renamed from: f */
    public static boolean f194750f = false;

    /* renamed from: g */
    public static int f194751g = -1;

    /* renamed from: h */
    public static boolean f194752h = true;

    /* renamed from: i */
    public static Uri f194753i = Uri.parse("content://com.android.badge/badge");

    /* renamed from: a */
    public static int m80204a(Notification notification, C67378t tVar) {
        if (notification == null || !f194745a) {
            return 0;
        }
        int b = tVar == null ? 0 : tVar.mo91520b() - C67244b.C67246b.f193087a.mo91394h();
        try {
            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            declaredField.set(newInstance, Integer.valueOf(b));
            notification.getClass().getField("extraNotification").set(notification, newInstance);
            Log.m105925i("MicroMsg.BusinessNotification", "miuiNotification: %d", Integer.valueOf(b));
        } catch (NoSuchFieldException unused) {
            f194745a = false;
        } catch (IllegalArgumentException unused2) {
            f194745a = false;
        } catch (IllegalAccessException unused3) {
            f194745a = false;
        } catch (ClassNotFoundException unused4) {
            f194745a = false;
        } catch (InstantiationException unused5) {
            f194745a = false;
        } catch (Exception unused6) {
            f194745a = false;
        }
        return b;
    }

    /* renamed from: b */
    public static void m80205b(String str, int i) {
        if (MMApplicationContext.getContext() == null) {
            Log.printErrStackTrace("MicroMsg.BusinessNotification", (Throwable) null, "normal badge context is null", new Object[0]);
            return;
        }
        Context context = MMApplicationContext.getContext();
        if (i < 0) {
            i = C77095h.m93059b();
        }
        ThreadPool.post((Runnable) new C67842h(context, str, i), "normalNotification", false);
    }

    /* renamed from: c */
    public static void m80206c(boolean z) {
        Context context;
        ContentResolver contentResolver;
        if (f194752h && (context = MMApplicationContext.getContext()) != null && (contentResolver = context.getContentResolver()) != null) {
            try {
                Log.m105924i("MicroMsg.BusinessNotification", "sync all user badge");
                Bundle call = contentResolver.call(f194753i, "getShortcutList", (String) null, (Bundle) null);
                if (call == null) {
                    Log.m105924i("MicroMsg.BusinessNotification", "getShortcutList return null");
                    return;
                }
                String string = call.getString("shortcut_list");
                if (string != null) {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string2 = ((JSONObject) jSONArray.get(i)).getString("app_shortcut_custom_id");
                        if (string2 != null && !string2.equalsIgnoreCase("null")) {
                            String f = C116541b.m164356f(string2);
                            m80208e(f, z ? 0 : C45629t0.m50817d(f, (String[]) null));
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BusinessNotification", e, "sync all user badge: no support getShortcutList", new Object[0]);
            }
        }
    }

    /* renamed from: d */
    public static void m80207d(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        Class<LauncherUI> cls = LauncherUI.class;
        if (MMApplicationContext.getContext() != null) {
            if (f194750f) {
                z2 = f194749e;
            } else {
                f194750f = true;
                if (!Build.BRAND.equals("samsung")) {
                    f194749e = false;
                    z2 = false;
                } else {
                    f194749e = true;
                    z2 = true;
                }
            }
            if (z2) {
                Context context = MMApplicationContext.getContext();
                int b = i == -1 ? C77095h.m93059b() : i;
                if (context != null) {
                    if (f194750f) {
                        z3 = f194749e;
                    } else {
                        f194750f = true;
                        if (!Build.BRAND.equals("samsung")) {
                            f194749e = false;
                            z3 = false;
                        } else {
                            f194749e = true;
                            z3 = true;
                        }
                    }
                    if (z3 && f194751g != b) {
                        f194751g = b;
                        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
                        intent.putExtra("badge_count", b);
                        intent.putExtra("badge_count_package_name", MMApplicationContext.getPackageName());
                        intent.putExtra("badge_count_class_name", cls.getName());
                        Log.m105925i("MicroMsg.BusinessNotification", "samsungNotification: %d, %s", Integer.valueOf(b), Build.BRAND);
                        context.sendBroadcast(intent);
                    }
                }
            }
        }
        if (f194748d && -1 != i) {
            ThreadPool.post(new C28875g(i), "huaweiNotification");
        }
        if (f194747c) {
            z = f194746b;
        } else {
            f194747c = true;
            String str = Build.BRAND;
            if (str.equals("vivo") || str.equals("iQOO")) {
                f194746b = true;
                z = true;
            } else {
                f194746b = false;
                z = false;
            }
        }
        if (z && -1 != i) {
            try {
                Intent intent2 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                intent2.putExtra("packageName", MMApplicationContext.getPackageName());
                intent2.putExtra("className", cls.getName());
                intent2.putExtra("notificationNum", i);
                MMApplicationContext.getContext().sendBroadcast(intent2);
                Log.m105925i("MicroMsg.BusinessNotification", "vivo badge: %d", Integer.valueOf(i));
            } catch (Exception e) {
                f194746b = false;
                Log.printErrStackTrace("MicroMsg.BusinessNotification", e, "", new Object[0]);
            }
        }
        m80205b((String) null, i);
    }

    /* renamed from: e */
    public static void m80208e(String str, int i) {
        if (Util.isNullOrNil(str)) {
            Log.printErrStackTrace("MicroMsg.BusinessNotification", (Throwable) null, "syncUserBadge username is null", new Object[0]);
            return;
        }
        String d = C116541b.m164354d(str);
        if (!Util.isNullOrNil(d)) {
            m80205b(d, i);
        }
    }
}
