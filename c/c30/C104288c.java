package c30;

import java.util.Iterator;

/* renamed from: c30.c */
public interface C104288c {
    /* renamed from: a */
    C104288c mo110093a(String str);

    /* renamed from: b */
    C104288c mo110094b(String str, Object obj);

    /* renamed from: c */
    C104288c mo110095c(String str);

    /* renamed from: d */
    C104288c mo110096d(String str, boolean z);

    /* renamed from: e */
    C104288c mo110097e(String str, double d);

    /* renamed from: f */
    C26826a mo110098f(String str);

    /* renamed from: g */
    String mo110099g(String str);

    Object get(String str);

    boolean getBoolean(String str);

    double getDouble(String str);

    int getInt(String str);

    long getLong(String str);

    String getString(String str);

    /* renamed from: h */
    C104288c mo110106h(String str, Object obj);

    boolean has(String str);

    /* renamed from: i */
    C26826a mo110108i(String str);

    boolean isNull(String str);

    Iterator<String> keys();

    int length();

    Object opt(String str);

    boolean optBoolean(String str, boolean z);

    double optDouble(String str, double d);

    int optInt(String str, int i);

    long optLong(String str, long j);

    String optString(String str);

    String optString(String str, String str2);

    C104288c put(String str, int i);

    C104288c put(String str, long j);

    Object remove(String str);
}
