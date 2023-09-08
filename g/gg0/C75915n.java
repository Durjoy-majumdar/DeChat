package gg0;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMobileStatusUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMobileUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMobileVerifyUI;
import ig0.C76343k;

/* renamed from: gg0.n */
public class C75915n implements C76343k.C76347d {

    /* renamed from: a */
    public final /* synthetic */ String f222589a;

    /* renamed from: b */
    public final /* synthetic */ BindMobileUI f222590b;

    public C75915n(BindMobileUI bindMobileUI, String str) {
        this.f222590b = bindMobileUI;
        this.f222589a = str;
    }

    /* renamed from: a */
    public void mo93913a(int i, Bundle bundle) {
        if (i == 2) {
            BindMobileUI bindMobileUI = this.f222590b;
            if (bindMobileUI.f196460A) {
                BindMobileStatusUI.m80724N7(bindMobileUI, !bindMobileUI.f196474u.isChecked(), !this.f222590b.f196475v.isChecked());
                this.f222590b.mo7679I7(-1);
                return;
            }
            Intent intent = new Intent(this.f222590b, BindMobileStatusUI.class);
            intent.putExtra("kstyle_bind_wording", this.f222590b.f196478y);
            intent.putExtra("kstyle_bind_recommend_show", this.f222590b.f196479z);
            intent.putExtra("Kfind_friend_by_mobile_flag", this.f222590b.f196474u.isChecked());
            intent.putExtra("Krecom_friends_by_mobile_flag", this.f222590b.f196475v.isChecked());
            MMWizardActivity.m7017L7(this.f222590b, intent);
        } else if (i == 1) {
            BindMobileUI bindMobileUI2 = this.f222590b;
            String str = this.f222589a;
            int i2 = BindMobileUI.f196459B;
            bindMobileUI2.getClass();
            Intent intent2 = new Intent(bindMobileUI2, BindMobileVerifyUI.class);
            intent2.putExtra("bindmcontact_mobile", str);
            intent2.putExtra("kstyle_bind_wording", bindMobileUI2.f196478y);
            intent2.putExtra("kstyle_bind_recommend_show", bindMobileUI2.f196479z);
            intent2.putExtra("Kfind_friend_by_mobile_flag", bindMobileUI2.f196474u.isChecked());
            intent2.putExtra("Krecom_friends_by_mobile_flag", bindMobileUI2.f196475v.isChecked());
            if (bindMobileUI2.f196460A) {
                intent2.putExtra("bind_scene", 6);
            }
            MMWizardActivity.m7017L7(bindMobileUI2, intent2);
        }
    }
}
