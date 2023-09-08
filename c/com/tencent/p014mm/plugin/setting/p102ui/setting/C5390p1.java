package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.Dialog;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.p1 */
public class C5390p1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f21071d;

    /* renamed from: e */
    public final /* synthetic */ int f21072e;

    /* renamed from: f */
    public final /* synthetic */ SettingsAboutSystemUI f21073f;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.p1$a */
    public class C5391a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f21074d;

        public C5391a(int i) {
            this.f21074d = i;
        }

        public void run() {
            ((Dialog) C5390p1.this.f21071d.getTag()).dismiss();
            C86709a0.m107535s().mo121142i().mo119676J(327686, Integer.valueOf(this.f21074d));
            C86709a0.m107535s().mo121142i().mo119681a(true);
            SettingsAboutSystemUI settingsAboutSystemUI = C5390p1.this.f21073f;
            int i = SettingsAboutSystemUI.f205661i;
            settingsAboutSystemUI.mo97723N7();
        }
    }

    public C5390p1(SettingsAboutSystemUI settingsAboutSystemUI, LinearLayout linearLayout, int i) {
        this.f21073f = settingsAboutSystemUI;
        this.f21071d = linearLayout;
        this.f21072e = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        for (int i = 0; i < this.f21071d.getChildCount(); i++) {
            TextView textView = (TextView) this.f21071d.getChildAt(i);
            if (C0966R.C0970id.knp != textView.getId()) {
                textView.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_off, 0, 0, 0);
            }
        }
        ((TextView) view).setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_on, 0, 0, 0);
        int intValue = ((Integer) view.getTag()).intValue();
        Log.m105925i("MicroMsg.SettingsAboutSystemUI", "choice: %d, %d", Integer.valueOf(this.f21072e), Integer.valueOf(intValue));
        if (this.f21072e == intValue) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        view.post(new C5391a(intValue));
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
