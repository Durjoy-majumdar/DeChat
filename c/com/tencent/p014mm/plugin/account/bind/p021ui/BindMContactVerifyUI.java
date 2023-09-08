package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gg0.C75911j;
import ig0.C76343k;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import nc0.C76850a;
import nj3.C76879j;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI */
public class BindMContactVerifyUI extends MMWizardActivity {

    /* renamed from: q */
    public static final /* synthetic */ int f196423q = 0;

    /* renamed from: e */
    public EditText f196424e;

    /* renamed from: f */
    public String f196425f;

    /* renamed from: g */
    public Button f196426g;

    /* renamed from: h */
    public String f196427h;

    /* renamed from: i */
    public boolean f196428i = false;

    /* renamed from: j */
    public SharedPreferences f196429j;

    /* renamed from: n */
    public int f196430n = 0;

    /* renamed from: o */
    public C76343k f196431o;

    /* renamed from: p */
    public String f196432p;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI$a */
    public class C68368a implements InputFilter {
        public C68368a(BindMContactVerifyUI bindMContactVerifyUI) {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return Util.filterNumber(charSequence);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI$b */
    public class C68369b implements View.OnClickListener {
        public C68369b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMContactVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String trim = BindMContactVerifyUI.this.f196424e.getText().toString().trim();
            if (Util.isNullOrNil(trim)) {
                C76879j.m92738i(BindMContactVerifyUI.this, C0966R.string.alf, C0966R.string.a3h);
                C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            BindMContactVerifyUI.this.hideVKB();
            BindMContactVerifyUI bindMContactVerifyUI = BindMContactVerifyUI.this;
            C76343k.C76348e eVar = C76343k.C76348e.BINDMOBILE;
            if (bindMContactVerifyUI.f196430n == 3) {
                eVar = C76343k.C76348e.CHANGEMOBILE;
            }
            C76343k kVar = new C76343k(eVar, bindMContactVerifyUI, new C75911j(bindMContactVerifyUI));
            bindMContactVerifyUI.f196431o = kVar;
            kVar.f223603o = bindMContactVerifyUI.f196427h;
            int i = bindMContactVerifyUI.f196430n;
            kVar.f223602n = i == 0 || i == 3;
            kVar.mo106574e(bindMContactVerifyUI.f196425f, trim, 2, "");
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI$c */
    public class C68370c implements MenuItem.OnMenuItemClickListener {
        public C68370c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindMContactVerifyUI bindMContactVerifyUI = BindMContactVerifyUI.this;
            int i = BindMContactVerifyUI.f196423q;
            bindMContactVerifyUI.mo7681K7(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI$d */
    public class C68371d implements View.OnClickListener {
        public C68371d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMContactVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindMContactVerifyUI.this.hideVKB();
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("bindmcontact_mobile", BindMContactVerifyUI.this.f196425f);
            bundle.putInt("voice_verify_type", 4);
            intent.putExtras(bundle);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93185r(BindMContactVerifyUI.this, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6575ir;
    }

    public void initView() {
        this.f196425f = (String) C86709a0.m107535s().mo121142i().mo119684e(4097, (Object) null);
        this.f196424e = (EditText) findViewById(C0966R.C0970id.a9x);
        int i = 0;
        this.f196428i = getIntent().getBooleanExtra("KEnterFromBanner", false);
        this.f196430n = getIntent().getIntExtra("bind_scene", 0);
        this.f196427h = getIntent().getStringExtra("policy_ticket");
        Button button = (Button) findViewById(C0966R.C0970id.a9u);
        String str = this.f196425f;
        if (str == null || str.equals("")) {
            this.f196425f = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        }
        if (Util.isNullOrNil(this.f196425f)) {
            this.f196425f = getIntent().getStringExtra("bindmcontact_mobile");
        }
        Log.m105925i("MicroMsg.BindMContactVerifyUI", "mobile %s", this.f196425f);
        this.f196424e.setFilters(new InputFilter[]{new C68368a(this)});
        this.f196426g = (Button) findViewById(C0966R.C0970id.a9z);
        ((TextView) findViewById(C0966R.C0970id.a9v)).setVisibility(8);
        button.setOnClickListener(new C68369b());
        setBackBtn(new C68370c());
        Button button2 = this.f196426g;
        if (!C76850a.m92635g(this.f196425f)) {
            i = 8;
        }
        button2.setVisibility(i);
        this.f196426g.setOnClickListener(new C68371d());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Map map;
        super.onActivityResult(i, i2, intent);
        if (i == 100 && intent != null && (map = (Map) intent.getBundleExtra("result_data").getSerializable("next_params")) != null) {
            String str = (String) map.get("next_step");
            if ("end_bind_mobile".equalsIgnoreCase(str)) {
                BindMobilePolicyUI.m161790T7();
                Intent intent2 = new Intent();
                intent2.addFlags(67108864);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(intent2, this);
            } else if ("bind_mobile_take_over".equalsIgnoreCase(str)) {
                Log.m105924i("MicroMsg.BindMContactVerifyUI", "bind_mobile_take_over");
                this.f196431o.mo106574e(this.f196425f, this.f196424e.getText().toString().trim(), 25, this.f196432p);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.akr);
        this.f196429j = getSharedPreferences(getPackageName() + "_preferences", 0);
        C75592q0.m90787q();
        initView();
    }

    public void onDestroy() {
        C76343k kVar = this.f196431o;
        if (kVar != null) {
            kVar.mo106571b();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo7681K7(1);
        return true;
    }
}
