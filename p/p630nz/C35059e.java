package p630nz;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C31896o0;
import gy3.C87412m;

/* renamed from: nz.e */
public class C35059e implements C31896o0.C31897a {
    /* renamed from: aJ */
    public void mo58416aJ(int i) {
        if (BuildInfo.CLIENT_VERSION_INT != i) {
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            C87412m.m108593f(sharedPreferences, "getContext().getSharedPr…me, Context.MODE_PRIVATE)");
            sharedPreferences.edit().putInt("RedDotCheckUpdateTab", 0).putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
        }
    }
}
