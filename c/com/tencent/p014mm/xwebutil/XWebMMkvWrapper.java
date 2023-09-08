package com.tencent.p014mm.xwebutil;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.xwebutil.C86027m;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.mm.xwebutil.XWebMMkvWrapper */
public class XWebMMkvWrapper implements SharedPreferences, SharedPreferences.Editor {
    private MultiProcessMMKV mSp;

    public XWebMMkvWrapper(MultiProcessMMKV multiProcessMMKV) {
        this.mSp = multiProcessMMKV;
    }

    public static SharedPreferences getMMKV(Context context, String str, int i, boolean z) {
        return ((C86027m.C86030d) C86027m.f250518d).getSharedPreference(context, str, i, z);
    }

    public void apply() {
        this.mSp.apply();
    }

    public SharedPreferences.Editor clear() {
        return this.mSp.clear();
    }

    public boolean commit() {
        return this.mSp.commit();
    }

    public boolean contains(String str) {
        return this.mSp.contains(str);
    }

    public SharedPreferences.Editor edit() {
        return this.mSp.edit();
    }

    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        String[] allKeys = this.mSp.allKeys();
        if (allKeys == null) {
            return hashMap;
        }
        for (String put : allKeys) {
            hashMap.put(put, "");
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        return this.mSp.getBoolean(str, z);
    }

    public float getFloat(String str, float f) {
        return this.mSp.getFloat(str, f);
    }

    public int getInt(String str, int i) {
        return this.mSp.getInt(str, i);
    }

    public long getLong(String str, long j) {
        return this.mSp.getLong(str, j);
    }

    public String getString(String str, String str2) {
        return this.mSp.getString(str, str2);
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return this.mSp.getStringSet(str, set);
    }

    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        return this.mSp.putBoolean(str, z);
    }

    public SharedPreferences.Editor putFloat(String str, float f) {
        return this.mSp.putFloat(str, f);
    }

    public SharedPreferences.Editor putInt(String str, int i) {
        return this.mSp.putInt(str, i);
    }

    public SharedPreferences.Editor putLong(String str, long j) {
        return this.mSp.putLong(str, j);
    }

    public SharedPreferences.Editor putString(String str, String str2) {
        return this.mSp.putString(str, str2);
    }

    public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        return this.mSp.putStringSet(str, set);
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mSp.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public SharedPreferences.Editor remove(String str) {
        return this.mSp.remove(str);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mSp.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
