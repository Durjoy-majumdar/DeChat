package com.tencent.mapsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: com.tencent.mapsdk.internal.kh */
public final class C113887kh {
    /* renamed from: a */
    public static SharedPreferences m157525a(Context context, String str) {
        if (context != null) {
            return context.getSharedPreferences("TMS_".concat(String.valueOf(str)), 0);
        }
        return null;
    }

    /* renamed from: com.tencent.mapsdk.internal.kh$a */
    public static class C113888a {

        /* renamed from: a */
        private SharedPreferences.Editor f340716a;

        public C113888a(SharedPreferences.Editor editor) {
            this.f340716a = editor;
        }

        /* renamed from: a */
        private void m157528a(String str, int i) {
            this.f340716a.putInt(str, i);
            this.f340716a.commit();
        }

        /* renamed from: a */
        private void m157531a(String str, boolean z) {
            this.f340716a.putBoolean(str, z);
            this.f340716a.commit();
        }

        /* renamed from: a */
        private void m157527a(String str, float f) {
            this.f340716a.putFloat(str, f);
            this.f340716a.commit();
        }

        /* renamed from: a */
        private void m157529a(String str, long j) {
            this.f340716a.putLong(str, j);
            this.f340716a.commit();
        }

        /* renamed from: a */
        public final void mo172293a(String str, String str2) {
            this.f340716a.putString(str, str2);
            this.f340716a.commit();
        }

        /* renamed from: a */
        private void m157530a(String str, Set<String> set) {
            this.f340716a.putStringSet(str, set);
            this.f340716a.commit();
        }
    }

    /* renamed from: a */
    public static C113888a m157526a(SharedPreferences sharedPreferences) {
        return new C113888a(sharedPreferences.edit());
    }
}
