package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import nj3.C88990b;
import p214om.C11502f;
import wc3.C15141z;

@Deprecated
/* renamed from: com.tencent.mm.plugin.account.ui.LoginSelectorUI */
public class LoginSelectorUI extends MMActivity implements View.OnClickListener {

    /* renamed from: d */
    public TextView f10697d;

    /* renamed from: e */
    public View f10698e;

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginSelectorUI$a */
    public class C1435a implements View.OnClickListener {
        public C1435a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginSelectorUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("not_auth_setting", true);
            C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
            AppCompatActivity context = LoginSelectorUI.this.getContext();
            ((C67654r1) yM).getClass();
            if (context != null) {
                C88144b.m109791i(context, "setting", ".ui.setting.SettingsLanguageUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginSelectorUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bw5;
    }

    public void initView() {
        Class cls = C11502f.class;
        this.f10697d = (TextView) findViewById(C0966R.C0970id.j9q);
        this.f10698e = findViewById(C0966R.C0970id.j9r);
        ((Button) findViewById(C0966R.C0970id.j_9)).setOnClickListener(this);
        ((Button) findViewById(C0966R.C0970id.j_r)).setOnClickListener(this);
        this.f10697d.setText(LocaleUtil.getLanguageName(getContext(), C0966R.array.f2581p, C0966R.string.f8037zz));
        this.f10698e.setOnClickListener(new C1435a());
        if (ChannelUtil.shouldShowGprsAlert) {
            ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93143Kn(this);
        } else {
            ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93145Oa(this);
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginSelectorUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C0966R.C0970id.j_9 == view.getId()) {
            Intent intent = new Intent(this, MobileInputUI.class);
            intent.putExtra("mobile_input_purpose", 1);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginSelectorUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/LoginSelectorUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (C0966R.C0970id.j_r == view.getId()) {
            Intent intent2 = new Intent(this, RegByMobileRegAIOUI.class);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginSelectorUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/LoginSelectorUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginSelectorUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitleVisibility(8);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
        C86709a0.m107523b();
        C86718e.m107553z();
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this);
            b.addFlags(67108864);
            b.putExtra("can_finish", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginSelectorUI", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/LoginSelectorUI", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            C88990b.m111200i(this);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107523b();
        C86718e.m107553z();
    }
}
