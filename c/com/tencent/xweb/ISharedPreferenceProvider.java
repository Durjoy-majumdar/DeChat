package com.tencent.xweb;

import android.content.Context;
import android.content.SharedPreferences;

public interface ISharedPreferenceProvider {
    SharedPreferences getSharedPreference(Context context, String str, int i, boolean z);
}
