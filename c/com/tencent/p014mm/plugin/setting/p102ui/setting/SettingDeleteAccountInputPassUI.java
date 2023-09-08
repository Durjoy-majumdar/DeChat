package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI */
public class SettingDeleteAccountInputPassUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI$a */
    public class C42925a implements MenuItem.OnMenuItemClickListener {
        public C42925a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingDeleteAccountInputPassUI.this.hideVKB();
            SettingDeleteAccountInputPassUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI$b */
    public class C42926b implements MenuItem.OnMenuItemClickListener {
        public C42926b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingDeleteAccountInputPassUI.this.hideVKB();
            SettingDeleteAccountInputPassUI settingDeleteAccountInputPassUI = SettingDeleteAccountInputPassUI.this;
            Intent intent = new Intent(SettingDeleteAccountInputPassUI.this, SettingDeleteAccountUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(settingDeleteAccountInputPassUI, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingDeleteAccountInputPassUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingDeleteAccountInputPassUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingDeleteAccountInputPassUI, "com/tencent/mm/plugin/setting/ui/setting/SettingDeleteAccountInputPassUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bww;
    }

    public void initView() {
        setBackBtn(new C42925a());
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C42926b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.imu);
        initView();
    }
}
