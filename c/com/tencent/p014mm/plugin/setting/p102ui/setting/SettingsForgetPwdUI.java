package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsForgetPwdUI */
public class SettingsForgetPwdUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsForgetPwdUI$a */
    public class C106137a implements MenuItem.OnMenuItemClickListener {
        public C106137a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsForgetPwdUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsForgetPwdUI$b */
    public class C106138b implements View.OnClickListener {
        public C106138b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsForgetPwdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsForgetPwdUI.this.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsForgetPwdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxe;
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackBtn(new C106137a());
        ((Button) findViewById(C0966R.C0970id.hfe)).setOnClickListener(new C106138b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
