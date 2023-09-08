package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountUI */
public class SettingDeleteAccountUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountUI$a */
    public class C42927a implements MenuItem.OnMenuItemClickListener {
        public C42927a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingDeleteAccountUI.this.hideVKB();
            SettingDeleteAccountUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountUI$b */
    public class C42928b implements View.OnClickListener {
        public C42928b(SettingDeleteAccountUI settingDeleteAccountUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingDeleteAccountUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingDeleteAccountUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bwu;
    }

    public void initView() {
        setBackBtn(new C42927a());
        ((TextView) findViewById(C0966R.C0970id.c18)).setOnClickListener(new C42928b(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.imu);
        initView();
    }
}
