package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.w2 */
public class C5407w2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsPersonalInfoUI f21093d;

    public C5407w2(SettingsPersonalInfoUI settingsPersonalInfoUI) {
        this.f21093d = settingsPersonalInfoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this.f21093d, PreviewHdHeadImg.class);
        AppCompatActivity context = this.f21093d.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
