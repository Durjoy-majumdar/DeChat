package com.tencent.mapsdk.internal;

import android.content.SharedPreferences;

/* renamed from: com.tencent.mapsdk.internal.mh */
public abstract class C113955mh {

    /* renamed from: b */
    private static final String f340835b = "%s-%s-%s,%s-%s-%s,%s-%s-%s";

    /* renamed from: a */
    public SharedPreferences f340836a = null;

    /* renamed from: d */
    private long m157933d(String str) {
        SharedPreferences sharedPreferences = this.f340836a;
        if (sharedPreferences == null) {
            return -1;
        }
        return sharedPreferences.getLong(str, -1);
    }

    /* renamed from: a */
    public final boolean mo172395a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f340836a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().putString(str, str2).commit();
    }

    /* renamed from: b */
    public final String mo172399b(String str, String str2) {
        SharedPreferences sharedPreferences = this.f340836a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(str, str2);
    }

    /* renamed from: c */
    public final boolean mo172400c(String str) {
        SharedPreferences sharedPreferences = this.f340836a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean(str, false);
    }

    /* renamed from: a */
    public final String mo172391a(String str) {
        return mo172399b(str, (String) null);
    }

    /* renamed from: b */
    public final int mo172397b(String str) {
        SharedPreferences sharedPreferences = this.f340836a;
        if (sharedPreferences == null) {
            return -1;
        }
        return sharedPreferences.getInt(str, -1);
    }

    /* renamed from: a */
    public final boolean mo172393a(String str, int i) {
        SharedPreferences sharedPreferences = this.f340836a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().putInt(str, i).commit();
    }

    /* renamed from: b */
    public final int mo172398b(String str, int i) {
        SharedPreferences sharedPreferences = this.f340836a;
        if (sharedPreferences == null) {
            return i;
        }
        return sharedPreferences.getInt(str, i);
    }

    /* renamed from: a */
    public final boolean mo172394a(String str, long j) {
        SharedPreferences sharedPreferences = this.f340836a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().putLong(str, j).commit();
    }

    /* renamed from: b */
    private String m157932b() {
        return String.format(f340835b, new Object[]{C0938ej.f2154i, Integer.valueOf(mo172397b(C0939el.f2171a)), mo172399b((String) C0939el.f2190t, (String) null), C0938ej.f2157l, Integer.valueOf(mo172397b("indoormap_style_version")), mo172399b("indoormap_style_md5", (String) null), C0938ej.f2158m, Integer.valueOf(mo172397b("indoormap_style_night_version")), mo172399b("indoormap_style_night_md5", (String) null)});
    }

    /* renamed from: a */
    private boolean m157931a(String str, boolean z) {
        SharedPreferences sharedPreferences = this.f340836a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.edit().putBoolean(str, z).commit();
    }

    /* renamed from: a */
    public final boolean mo172396a(String[] strArr) {
        SharedPreferences sharedPreferences = this.f340836a;
        if (sharedPreferences == null) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : strArr) {
            edit.remove(remove);
        }
        return edit.commit();
    }

    /* renamed from: a */
    public final boolean mo172392a() {
        return mo172396a(new String[]{C0939el.f2171a, C0939el.f2173c, C0939el.f2174d, C0939el.f2187q, C0939el.f2188r, C0939el.f2189s, C0939el.f2190t, C0939el.f2191u, C0939el.f2192v, C0939el.f2193w, C0939el.f2194x, C0939el.f2195y});
    }
}
