package com.tencent.p014mm.plugin.account.security.p023ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.security.ui.BindSafeDeviceUI */
public class BindSafeDeviceUI extends MMWizardActivity {

    /* renamed from: com.tencent.mm.plugin.account.security.ui.BindSafeDeviceUI$a */
    public class C68434a implements MenuItem.OnMenuItemClickListener {
        public C68434a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindSafeDeviceUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.BindSafeDeviceUI$b */
    public class C68435b implements View.OnClickListener {
        public C68435b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/security/ui/BindSafeDeviceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("bind_scene", 1);
            intent.setClass(BindSafeDeviceUI.this, BindMContactUI.class);
            MMWizardActivity.m7017L7(BindSafeDeviceUI.this, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/security/ui/BindSafeDeviceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bvm;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.i_m);
        setBackBtn(new C68434a());
        ((ImageView) findViewById(C0966R.C0970id.j87)).setImageResource(C0966R.raw.accounts_saftphone_icon);
        ((TextView) findViewById(C0966R.C0970id.j88)).setText(C0966R.string.i_s);
        ((TextView) findViewById(C0966R.C0970id.kmq)).setText(C0966R.string.i_t);
        findViewById(C0966R.C0970id.kmq).setOnClickListener(new C68435b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
