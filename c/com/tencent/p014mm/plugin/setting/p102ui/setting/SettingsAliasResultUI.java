package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.account.p024ui.RegByMobileSetPwdUI;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAliasResultUI */
public class SettingsAliasResultUI extends MMActivity {

    /* renamed from: d */
    public String f20804d;

    /* renamed from: e */
    public TextView f20805e;

    /* renamed from: f */
    public TextView f20806f;

    /* renamed from: g */
    public Button f20807g;

    /* renamed from: h */
    public boolean f20808h;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAliasResultUI$a */
    public class C5259a implements MenuItem.OnMenuItemClickListener {
        public C5259a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsAliasResultUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAliasResultUI$b */
    public class C5260b implements View.OnClickListener {
        public C5260b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAliasResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(SettingsAliasResultUI.this.getContext(), RegByMobileSetPwdUI.class);
            intent.putExtra("kintent_hint", SettingsAliasResultUI.this.getString(C0966R.string.hxx));
            SettingsAliasResultUI.this.startActivityForResult(intent, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAliasResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bx5;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.gvh);
        this.f20805e = (TextView) findViewById(C0966R.C0970id.c2h);
        this.f20806f = (TextView) findViewById(C0966R.C0970id.f5785ok);
        this.f20807g = (Button) findViewById(C0966R.C0970id.f359169jd2);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.hln);
        setBackBtn(new C5259a());
        this.f20806f.setText(this.f20804d);
        if (!this.f20808h) {
            this.f20807g.setVisibility(0);
            this.f20805e.setText(getString(C0966R.string.gvm));
        } else {
            this.f20807g.setVisibility(8);
            this.f20805e.setText(getString(C0966R.string.gvn));
        }
        this.f20807g.setOnClickListener(new C5260b());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20804d = (String) C86709a0.m107535s().mo121142i().mo119684e(42, (Object) null);
        this.f20808h = Boolean.valueOf(getIntent().getBooleanExtra("has_pwd", true)).booleanValue();
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }
}
