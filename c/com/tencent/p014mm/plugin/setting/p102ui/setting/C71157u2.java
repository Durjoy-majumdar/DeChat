package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import eb0.C75583h3;
import nd3.C88931f;
import p645pj.C77091b;
import p645pj.C77095h;
import qo3.C47883u;
import vc3.C78382a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.u2 */
public class C71157u2 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ SettingsNotificationUI f205955a;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.u2$a */
    public class C71158a implements C88931f {
        public C71158a() {
        }

        /* renamed from: a */
        public void mo62503a(int i, int i2, Intent intent) {
            if (!C77091b.m93036r()) {
                C71157u2.this.f205955a.initView();
                return;
            }
            C77095h.m93069m(true);
            C71157u2.this.f205955a.initView();
            C115669n.INSTANCE.idkeyStat(500, 0, 1, false);
            C75583h3.m90715b(true, false);
        }
    }

    public C71157u2(SettingsNotificationUI settingsNotificationUI) {
        this.f205955a = settingsNotificationUI;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        if (z) {
            SettingsNotificationUI settingsNotificationUI = this.f205955a;
            C71158a aVar = new C71158a();
            String b = C78382a.m94650b();
            int i = SettingsNotificationUI.f205758g;
            settingsNotificationUI.mo97755I7(aVar, b);
            return;
        }
        this.f205955a.initView();
    }
}
