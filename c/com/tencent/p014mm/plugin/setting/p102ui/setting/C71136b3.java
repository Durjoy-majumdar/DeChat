package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.Dialog;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import j20.C117292a;
import java.util.ArrayList;
import jr2.C46570n;
import jr2.C99019x;
import os2.C100399d0;
import tc0.C77885p;
import te3.a94;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.b3 */
public class C71136b3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f205924d;

    /* renamed from: e */
    public final /* synthetic */ SettingsPrivacyUI f205925e;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.b3$a */
    public class C71137a implements Runnable {
        public C71137a() {
        }

        public void run() {
            ((Dialog) C71136b3.this.f205924d.getTag()).dismiss();
            SettingsPrivacyUI settingsPrivacyUI = C71136b3.this.f205925e;
            int i = SettingsPrivacyUI.f205769v;
            settingsPrivacyUI.mo97765J7();
        }
    }

    public C71136b3(SettingsPrivacyUI settingsPrivacyUI, LinearLayout linearLayout) {
        this.f205925e = settingsPrivacyUI;
        this.f205924d = linearLayout;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        for (int i = 0; i < this.f205924d.getChildCount(); i++) {
            TextView textView = (TextView) this.f205924d.getChildAt(i);
            if (C0966R.C0970id.knp != textView.getId()) {
                textView.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_off, 0, 0, 0);
            }
        }
        ((TextView) view).setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_on, 0, 0, 0);
        a94 a94 = new a94();
        if (C99019x.m128971c() != null) {
            a94 = ((C100399d0) C99019x.m128971c()).mo139779SE(this.f205925e.f205775i);
        }
        if (a94 == null) {
            Log.m105920e("MicroMsg.SettingPrivacy", "userinfo is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        Log.m105925i("MicroMsg.SettingPrivacy", "settings_silence_update_mode choice: %d", Integer.valueOf(intValue));
        if (intValue == 0) {
            if (this.f205925e.f205784u == 1) {
                C115669n.INSTANCE.mo160131h(14090, 4);
            }
            SettingsPrivacyUI settingsPrivacyUI = this.f205925e;
            settingsPrivacyUI.f205777n = false;
            settingsPrivacyUI.f205778o = true;
            settingsPrivacyUI.f205780q = false;
            settingsPrivacyUI.f205779p = true;
        } else if (intValue == 1) {
            if (this.f205925e.f205784u == 1) {
                C115669n.INSTANCE.mo160131h(14090, 5);
            }
            SettingsPrivacyUI settingsPrivacyUI2 = this.f205925e;
            settingsPrivacyUI2.f205777n = true;
            settingsPrivacyUI2.f205778o = false;
            settingsPrivacyUI2.f205780q = false;
            settingsPrivacyUI2.f205779p = true;
        } else if (intValue == 3) {
            SettingsPrivacyUI settingsPrivacyUI3 = this.f205925e;
            settingsPrivacyUI3.f205777n = false;
            settingsPrivacyUI3.f205778o = false;
            settingsPrivacyUI3.f205780q = true;
            settingsPrivacyUI3.f205779p = true;
        } else {
            if (this.f205925e.f205784u == 1) {
                C115669n.INSTANCE.mo160131h(14090, 6);
            }
            SettingsPrivacyUI settingsPrivacyUI4 = this.f205925e;
            settingsPrivacyUI4.f205777n = false;
            settingsPrivacyUI4.f205778o = false;
            settingsPrivacyUI4.f205780q = false;
            settingsPrivacyUI4.f205779p = true;
        }
        if (C99019x.m128971c() != null) {
            C46570n c = C99019x.m128971c();
            SettingsPrivacyUI settingsPrivacyUI5 = this.f205925e;
            ((C100399d0) c).mo139773CP(settingsPrivacyUI5.f205775i, settingsPrivacyUI5.f205777n, settingsPrivacyUI5.f205778o, settingsPrivacyUI5.f205779p, settingsPrivacyUI5.f205780q);
        }
        if (C99019x.m128971c() != null) {
            C46570n c2 = C99019x.m128971c();
            SettingsPrivacyUI settingsPrivacyUI6 = this.f205925e;
            a94 kD = ((C100399d0) c2).mo139787kD(settingsPrivacyUI6.f205775i, settingsPrivacyUI6.f205777n, settingsPrivacyUI6.f205778o, settingsPrivacyUI6.f205779p, settingsPrivacyUI6.f205780q);
            if (kD == null) {
                Log.m105920e("MicroMsg.SettingPrivacy", "userinfo in null !");
                C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105918d("MicroMsg.SettingPrivacy", "dancy userinfo " + kD.toString());
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(51, kD));
        }
        view.post(new C71137a());
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
