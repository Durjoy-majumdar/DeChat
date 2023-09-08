package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ModifyAliasLogStruct;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import lc3.C10485b;
import qg0.C12215a;
import te3.C49750ht;
import tm2.C78046e;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasCheckUI */
public class SettingsModifyAliasCheckUI extends MMWizardActivity {

    /* renamed from: e */
    public LinearLayout f20846e;

    /* renamed from: f */
    public List<C49750ht> f20847f = null;

    /* renamed from: g */
    public List<View> f20848g = new ArrayList();

    /* renamed from: h */
    public boolean f20849h = false;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasCheckUI$a */
    public class C5273a implements MenuItem.OnMenuItemClickListener {
        public C5273a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ModifyAliasLogStruct modifyAliasLogStruct = new ModifyAliasLogStruct();
            modifyAliasLogStruct.mo1043s(SettingsAliasUI.f20811q);
            modifyAliasLogStruct.f9998e = 7;
            modifyAliasLogStruct.mo86054n();
            SettingsModifyAliasCheckUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasCheckUI$b */
    public class C5274b implements View.OnClickListener {
        public C5274b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsModifyAliasCheckUI settingsModifyAliasCheckUI = SettingsModifyAliasCheckUI.this;
            C12215a.m11778c(settingsModifyAliasCheckUI, settingsModifyAliasCheckUI.getString(C0966R.string.imb, new Object[]{LocaleUtil.getApplicationLanguage()}), -1, true);
            ModifyAliasLogStruct modifyAliasLogStruct = new ModifyAliasLogStruct();
            modifyAliasLogStruct.mo1043s(SettingsAliasUI.f20811q);
            modifyAliasLogStruct.f9998e = 8;
            modifyAliasLogStruct.mo86054n();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bx4;
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackBtn(new C5273a());
        this.f20846e = (LinearLayout) findViewById(C0966R.C0970id.jeu);
        ((TextView) findViewById(C0966R.C0970id.jev)).setOnClickListener(new C5274b());
        List<C49750ht> list = C78046e.f228784e;
        this.f20847f = list;
        if (list == null || list.isEmpty()) {
            this.f20849h = false;
            this.f20846e.removeAllViews();
            return;
        }
        Log.m105925i("MicroMsg.SettingsModifyAliasCheckUI", "conditions %s", Integer.valueOf(this.f20847f.size()));
        this.f20846e.removeAllViews();
        this.f20849h = true;
        for (int i = 0; i < this.f20847f.size(); i++) {
            View inflate = View.inflate(this, C0966R.C0971layout.bxk, (ViewGroup) null);
            ((ArrayList) this.f20848g).add(inflate);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gy5);
            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.gy6);
            ((TextView) inflate.findViewById(C0966R.C0970id.gy7)).setText(this.f20847f.get(i).f134867d);
            if (!Util.isNullOrNil(this.f20847f.get(i).f134868e)) {
                textView.setText(this.f20847f.get(i).f134868e);
                textView.setVisibility(0);
            }
            textView2.setText(this.f20847f.get(i).f134869f);
            if (this.f20847f.get(i).f134870g) {
                textView2.setTextColor(getResources().getColor(C0966R.color.f3536x0));
            } else {
                textView2.setTextColor(getResources().getColor(C0966R.color.a_3));
            }
            if (i % 2 == 0) {
                View findViewById = inflate.findViewById(C0966R.C0970id.gy8);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = inflate.findViewById(C0966R.C0970id.gy4);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view = findViewById2;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View findViewById3 = inflate.findViewById(C0966R.C0970id.gy4);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                C117292a.m165358d(findViewById3, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f20846e.addView(inflate, new LinearLayout.LayoutParams(-1, -2));
            this.f20849h = this.f20849h && this.f20847f.get(i).f134870g;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EnableModAlias", 0) == 0) {
            finish();
        }
    }
}
