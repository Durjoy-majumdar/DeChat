package com.tencent.p014mm.pluginsdk.platformtools;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.util.FrequentLimiter;

/* renamed from: com.tencent.mm.pluginsdk.platformtools.g */
public class C30689g {

    /* renamed from: a */
    public static final long[] f82581a = {0, 259200000, FrequentLimiter.WEEK_MILLS};

    /* renamed from: a */
    public static void m39152a() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4);
        sharedPreferences.edit().putLong("tinker-boots-last-show", System.currentTimeMillis()).apply();
        sharedPreferences.edit().putInt("tinker-boots-show-time", sharedPreferences.getInt("tinker-boots-show-time", 0) + 1).apply();
    }
}
