package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.Dialog;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import j20.C117292a;
import java.util.ArrayList;
import tc0.C77885p;
import te3.C64266br1;
import tm2.C14049d;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.o1 */
public class C5386o1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f21064d;

    /* renamed from: e */
    public final /* synthetic */ SettingsAboutSystemUI f21065e;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.o1$a */
    public class C5387a implements Runnable {
        public C5387a() {
        }

        public void run() {
            ((Dialog) C5386o1.this.f21064d.getTag()).dismiss();
            SettingsAboutSystemUI settingsAboutSystemUI = C5386o1.this.f21065e;
            int i = SettingsAboutSystemUI.f205661i;
            settingsAboutSystemUI.mo97722M7();
        }
    }

    public C5386o1(SettingsAboutSystemUI settingsAboutSystemUI, LinearLayout linearLayout) {
        this.f21065e = settingsAboutSystemUI;
        this.f21064d = linearLayout;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z = false;
        for (int i = 0; i < this.f21064d.getChildCount(); i++) {
            TextView textView = (TextView) this.f21064d.getChildAt(i);
            if (C0966R.C0970id.knp != textView.getId()) {
                textView.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_off, 0, 0, 0);
            }
        }
        ((TextView) view).setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_on, 0, 0, 0);
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(7, 0)).intValue();
        int intValue2 = ((Integer) view.getTag()).intValue();
        int i2 = 1;
        Log.m105919d("MicroMsg.SettingsAboutSystemUI", "settings_silence_update_mode choice: %d", Integer.valueOf(intValue2));
        if ((intValue2 == 0) == ((intValue & TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (intValue2 == 0) {
            z = true;
        }
        int i3 = z ? intValue & -16777217 : intValue | TPMediaCodecProfileLevel.HEVCMainTierLevel62;
        if (z) {
            i2 = 2;
        }
        C86709a0.m107535s().mo121142i().mo119676J(7, Integer.valueOf(i3));
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 35;
        br12.f182325e = i2;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
        C14049d.m13402a().mo93136Bk();
        view.post(new C5387a());
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
