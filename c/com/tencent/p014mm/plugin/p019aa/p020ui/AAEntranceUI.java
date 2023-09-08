package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C75592q0;
import f40.C86709a0;
import f40.C86737h0;
import j20.C117292a;
import java.util.HashSet;
import k20.C9556a;
import ke3.C88144b;
import yf0.C79090a;

@C86737h0
/* renamed from: com.tencent.mm.plugin.aa.ui.AAEntranceUI */
public class AAEntranceUI extends MMActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f195934f = 0;

    /* renamed from: d */
    public Button f195935d;

    /* renamed from: e */
    public TextView f195936e;

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAEntranceUI$a */
    public class C68167a extends C7089c0 {
        public C68167a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            AAEntranceUI aAEntranceUI = AAEntranceUI.this;
            int i = AAEntranceUI.f195934f;
            aAEntranceUI.getClass();
            Log.m105924i("MicroMsg.AAEntranceUI", "go to contact");
            Intent intent = new Intent();
            intent.putExtra("key_from_scene", 1);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", false);
            intent.putExtra("mutil_select_is_ret", false);
            intent.putExtra("Select_block_List", C75592q0.m90789s());
            C86709a0.m107528h();
            intent.putExtra("recent_remittance_contact_list", Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_RECENT_LAUNCH_AA_GROUP_STRING_SYNC, (Object) null)));
            C88144b.m109795m(aAEntranceUI.getContext(), "remittance", ".ui.SelectRemittanceContactUI", intent, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAEntranceUI$b */
    public class C68168b implements C7092q.C7093a {
        public C68168b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(AAEntranceUI.this.getContext(), AAQueryListUI.class);
            AAEntranceUI aAEntranceUI = AAEntranceUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AAEntranceUI aAEntranceUI2 = aAEntranceUI;
            C117292a.m165358d(aAEntranceUI2, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/AAEntranceUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            aAEntranceUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(aAEntranceUI2, "com/tencent/mm/plugin/aa/ui/AAEntranceUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAEntranceUI$c */
    public class C68169c implements MenuItem.OnMenuItemClickListener {
        public C68169c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AAEntranceUI.this.finish();
            return false;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6258w;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 1) {
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                Log.m105925i("MicroMsg.AAEntranceUI", "select chatroom：%s", stringExtra);
                if (!Util.isNullOrNil(stringExtra)) {
                    Intent intent2 = new Intent(getContext(), LaunchAAUI.class);
                    intent2.putExtra("enter_scene", 2);
                    intent2.putExtra("chatroom_name", stringExtra);
                    if (getIntent().getExtras() != null) {
                        intent2.putExtras(getIntent().getExtras());
                    }
                    startActivityForResult(intent2, 2);
                }
            } else if (i == 2) {
                finish();
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        setMMTitle("");
        this.f195935d = (Button) findViewById(C0966R.C0970id.fis);
        this.f195936e = (TextView) findViewById(C0966R.C0970id.b_6);
        this.f195935d.setOnClickListener(new C68167a());
        String string = getString(C0966R.string.bcn);
        C75228t.m90253j0(this.f195936e, string, 0, string.length(), new C7092q((C7092q.C7093a) new C68168b(), true), getContext());
        setBackBtn(new C68169c());
        C85875k4.m106189j0(((TextView) findViewById(C0966R.C0970id.f5264ac)).getPaint(), 0.8f);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C79090a.class);
    }
}
