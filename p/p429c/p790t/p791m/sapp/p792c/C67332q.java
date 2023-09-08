package p429c.p790t.p791m.sapp.p792c;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: c.t.m.sapp.c.q */
public class C67332q {

    /* renamed from: a */
    public static volatile SharedPreferences f193173a;

    /* renamed from: b */
    public static Context f193174b;

    /* renamed from: a */
    public static synchronized SharedPreferences m79666a() {
        SharedPreferences sharedPreferences;
        synchronized (C67332q.class) {
            if (f193173a == null) {
                f193173a = f193174b.getSharedPreferences("TLocationSDK", 0);
            }
            sharedPreferences = f193173a;
        }
        return sharedPreferences;
    }

    /* renamed from: b */
    public static void m79671b(String str, String str2, Object obj) {
        m79670b(m79667a(str), str2, obj);
    }

    /* renamed from: b */
    public static void m79670b(SharedPreferences sharedPreferences, String str, Object obj) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Long) obj).longValue());
        } else {
            edit.putString(str, obj.toString());
        }
        edit.apply();
    }

    /* renamed from: a */
    public static SharedPreferences m79667a(String str) {
        if ("TLocationSDK".equals(str)) {
            return m79666a();
        }
        int i = 0;
        if ("com.tencent.mobileqq".equals(f193174b.getPackageName())) {
            i = 4;
        }
        return f193174b.getSharedPreferences(str, i);
    }

    /* renamed from: a */
    public static Object m79669a(String str, String str2, Object obj) {
        return m79668a(m79667a(str), str2, obj);
    }

    /* renamed from: a */
    public static Object m79668a(SharedPreferences sharedPreferences, String str, Object obj) {
        if (obj instanceof String) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        return null;
    }
}
