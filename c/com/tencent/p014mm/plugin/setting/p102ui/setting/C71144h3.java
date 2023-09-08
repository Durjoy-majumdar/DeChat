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

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.h3 */
public class C71144h3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f205938d;

    /* renamed from: e */
    public final /* synthetic */ SettingsSnsPrivacyUI f205939e;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.h3$a */
    public class C71145a implements Runnable {
        public C71145a() {
        }

        public void run() {
            ((Dialog) C71144h3.this.f205938d.getTag()).dismiss();
            SettingsSnsPrivacyUI settingsSnsPrivacyUI = C71144h3.this.f205939e;
            int i = SettingsSnsPrivacyUI.f205797u;
            settingsSnsPrivacyUI.mo97775I7();
        }
    }

    public C71144h3(SettingsSnsPrivacyUI settingsSnsPrivacyUI, LinearLayout linearLayout) {
        this.f205939e = settingsSnsPrivacyUI;
        this.f205938d = linearLayout;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        for (int i = 0; i < this.f205938d.getChildCount(); i++) {
            TextView textView = (TextView) this.f205938d.getChildAt(i);
            if (C0966R.C0970id.knp != textView.getId()) {
                textView.setContentDescription(textView.getText() + textView.getContext().getString(C0966R.string.f7400f9));
                textView.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_off, 0, 0, 0);
            }
        }
        TextView textView2 = (TextView) view;
        textView2.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_on, 0, 0, 0);
        textView2.setContentDescription(textView2.getText() + textView2.getContext().getString(C0966R.string.f7398f7));
        a94 a94 = new a94();
        if (C99019x.m128971c() != null) {
            a94 = ((C100399d0) C99019x.m128971c()).mo139779SE(this.f205939e.f205803i);
        }
        if (a94 == null) {
            Log.m105920e("MicroMsg.SettingsSnsPrivacyUI", "userinfo is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        Log.m105925i("MicroMsg.SettingsSnsPrivacyUI", "settings_silence_update_mode choice: %d", Integer.valueOf(intValue));
        if (intValue == 0) {
            if (this.f205939e.f205811t == 1) {
                C115669n.INSTANCE.mo160131h(14090, 4);
            }
            SettingsSnsPrivacyUI settingsSnsPrivacyUI = this.f205939e;
            settingsSnsPrivacyUI.f205805n = false;
            settingsSnsPrivacyUI.f205806o = true;
            settingsSnsPrivacyUI.f205808q = false;
            settingsSnsPrivacyUI.f205807p = true;
        } else if (intValue == 1) {
            if (this.f205939e.f205811t == 1) {
                C115669n.INSTANCE.mo160131h(14090, 5);
            }
            SettingsSnsPrivacyUI settingsSnsPrivacyUI2 = this.f205939e;
            settingsSnsPrivacyUI2.f205805n = true;
            settingsSnsPrivacyUI2.f205806o = false;
            settingsSnsPrivacyUI2.f205808q = false;
            settingsSnsPrivacyUI2.f205807p = true;
        } else if (intValue == 3) {
            SettingsSnsPrivacyUI settingsSnsPrivacyUI3 = this.f205939e;
            settingsSnsPrivacyUI3.f205805n = false;
            settingsSnsPrivacyUI3.f205806o = false;
            settingsSnsPrivacyUI3.f205808q = true;
            settingsSnsPrivacyUI3.f205807p = true;
        } else {
            if (this.f205939e.f205811t == 1) {
                C115669n.INSTANCE.mo160131h(14090, 6);
            }
            SettingsSnsPrivacyUI settingsSnsPrivacyUI4 = this.f205939e;
            settingsSnsPrivacyUI4.f205805n = false;
            settingsSnsPrivacyUI4.f205806o = false;
            settingsSnsPrivacyUI4.f205808q = false;
            settingsSnsPrivacyUI4.f205807p = true;
        }
        if (C99019x.m128971c() != null) {
            C46570n c = C99019x.m128971c();
            SettingsSnsPrivacyUI settingsSnsPrivacyUI5 = this.f205939e;
            ((C100399d0) c).mo139773CP(settingsSnsPrivacyUI5.f205803i, settingsSnsPrivacyUI5.f205805n, settingsSnsPrivacyUI5.f205806o, settingsSnsPrivacyUI5.f205807p, settingsSnsPrivacyUI5.f205808q);
        }
        if (C99019x.m128971c() != null) {
            C46570n c2 = C99019x.m128971c();
            SettingsSnsPrivacyUI settingsSnsPrivacyUI6 = this.f205939e;
            a94 kD = ((C100399d0) c2).mo139787kD(settingsSnsPrivacyUI6.f205803i, settingsSnsPrivacyUI6.f205805n, settingsSnsPrivacyUI6.f205806o, settingsSnsPrivacyUI6.f205807p, settingsSnsPrivacyUI6.f205808q);
            if (kD == null) {
                Log.m105920e("MicroMsg.SettingsSnsPrivacyUI", "userinfo in null !");
                C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105918d("MicroMsg.SettingsSnsPrivacyUI", "dancy userinfo " + kD.toString());
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(51, kD));
        }
        view.post(new C71145a());
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSnsPrivacyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
