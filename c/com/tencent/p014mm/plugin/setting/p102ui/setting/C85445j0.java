package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import lb0.C88394b;
import p166hy.C98567o0;
import p646pn.C110234e;
import qo3.C47883u;
import tm2.C14049d;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.j0 */
public class C85445j0 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ SettingDarkMode f249033a;

    public C85445j0(SettingDarkMode settingDarkMode) {
        this.f249033a = settingDarkMode;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        Class cls = C110234e.class;
        if (z) {
            MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("dark_mode_follow_system", this.f249033a.f248961q);
            C85875k4.m106201p0();
            MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean(XWalkReaderBasePlugin.PARAM_KEY_DARK_MODE, this.f249033a.f248960p);
            this.f249033a.mo118771J7();
            this.f249033a.mo118770I7();
            SettingDarkMode settingDarkMode = this.f249033a;
            if (!settingDarkMode.f248961q) {
                XWebSdk.setForceDarkMode(settingDarkMode.f248960p);
                MMWebView.m49943Y(this.f249033a.f248960p);
            }
            ((C98567o0) C86312j.m106911c(C98567o0.class)).x50();
            String str2 = C88394b.f255384g;
            ((C88394b.C88401f) C88394b.C88418q.f255427a.f255390e).mo122809a();
            if (((C110234e) C86312j.m106911c(cls)).mo161399pY() != null) {
                ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149131l();
                ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149146v();
            }
            Intent intent = new Intent();
            intent.putExtra("Intro_Need_Clear_Top ", true);
            intent.addFlags(67108864);
            intent.addFlags(536870912);
            ((C67654r1) C14049d.m13403b()).mo93170c(intent, this.f249033a.getContext());
        }
    }
}
