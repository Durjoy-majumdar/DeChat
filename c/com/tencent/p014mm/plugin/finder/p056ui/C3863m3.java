package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.content.Intent;
import bd1.C39759i;
import bd1.C54446b;
import bd1.C54447c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import fe1.C58969q;
import gy3.C87412m;
import ht1.C8794p5;
import it1.C9247b;
import nj3.C76912y0;
import rx3.C13598b0;
import te3.C50542nh0;
import te3.C64553md1;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.ui.m3 */
public final class C3863m3 implements C8794p5<C64553md1> {

    /* renamed from: d */
    public final /* synthetic */ FinderSettingInfoUI f17407d;

    public C3863m3(FinderSettingInfoUI finderSettingInfoUI) {
        this.f17407d = finderSettingInfoUI;
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C64553md1 md12 = (C64553md1) obj;
        C87412m.m108594g(md12, "req");
        C87412m.m108594g(nh02, "ret");
        String str = this.f17407d.f17081d;
        Log.m105924i(str, "modifyMpIdentity onModifyResult: ret = " + nh02.f138603e);
        int i = 0;
        if (nh02.f138603e != 0) {
            Preference a = this.f17407d.getPreferenceScreen().mo72519a("settings_mp_identity_switch");
            C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
            ((CheckBoxPreference) a).mo6805K(C58784w3.f168295a.mo83902T0());
            FinderSettingInfoUI finderSettingInfoUI = this.f17407d;
            C76912y0.makeText((Context) finderSettingInfoUI, (CharSequence) finderSettingInfoUI.getString(C0966R.string.et6), 0).show();
        } else {
            C66785b bVar = C66785b.f191882e;
            C58969q qVar = this.f17407d.f17083f;
            String str2 = null;
            String str3 = qVar != null ? qVar.field_username : null;
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            C54446b a2 = C66783a.C66784a.m78798a(bVar, str3, false, 2, (Object) null);
            if (a2 != null) {
                i = a2.field_extFlag;
            }
            int i2 = md12.f184291B == 1 ? 16777216 | i : -16777217 & i;
            C58969q qVar2 = this.f17407d.f17083f;
            if (qVar2 != null) {
                str2 = qVar2.field_username;
            }
            if (str2 != null) {
                str4 = str2;
            }
            C54447c cVar = new C54447c(str4);
            cVar.field_extFlag = i2;
            bVar.mo90672m1(cVar, C39759i.MODIFY_USER);
            FinderSettingInfoUI finderSettingInfoUI2 = this.f17407d;
            Intent intent = new Intent();
            FinderSettingInfoUI finderSettingInfoUI3 = this.f17407d;
            intent.putExtra("NEED_REFRESH_CONTACT", true);
            intent.putExtra("ACCOUNT_USERNAME", finderSettingInfoUI3.f17082e);
            C13598b0 b0Var = C13598b0.f38549a;
            finderSettingInfoUI2.setResult(-1, intent);
        }
        C9247b bVar2 = this.f17407d.f17086i;
        if (bVar2 != null) {
            bVar2.mo8913b();
        }
    }
}
