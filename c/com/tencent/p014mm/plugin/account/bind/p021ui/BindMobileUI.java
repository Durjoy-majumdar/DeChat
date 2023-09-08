package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelsimple.BindWordingContent;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gg0.C75914m;
import ig0.C76343k;
import j20.C117292a;
import java.util.ArrayList;
import nc0.C76850a;
import nj3.C76879j;
import p214om.C11502f;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileUI */
public class BindMobileUI extends MMWizardActivity {

    /* renamed from: B */
    public static final /* synthetic */ int f196459B = 0;

    /* renamed from: A */
    public boolean f196460A;

    /* renamed from: e */
    public EditText f196461e;

    /* renamed from: f */
    public LinearLayout f196462f;

    /* renamed from: g */
    public TextView f196463g;

    /* renamed from: h */
    public TextView f196464h;

    /* renamed from: i */
    public String f196465i;

    /* renamed from: j */
    public C76343k f196466j;

    /* renamed from: n */
    public String f196467n = null;

    /* renamed from: o */
    public String f196468o = null;

    /* renamed from: p */
    public String f196469p = null;

    /* renamed from: q */
    public TextView f196470q;

    /* renamed from: r */
    public Button f196471r;

    /* renamed from: s */
    public TextView f196472s;

    /* renamed from: t */
    public TextView f196473t;

    /* renamed from: u */
    public CheckBox f196474u;

    /* renamed from: v */
    public CheckBox f196475v;

    /* renamed from: w */
    public LinearLayout f196476w;

    /* renamed from: x */
    public ImageView f196477x;

    /* renamed from: y */
    public BindWordingContent f196478y;

    /* renamed from: z */
    public int f196479z;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileUI$a */
    public class C68376a implements View.OnClickListener {
        public C68376a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMobileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (BindMobileUI.this.f196461e.getText().toString() == null || BindMobileUI.this.f196461e.getText().toString().length() == 0) {
                BindMobileUI bindMobileUI = BindMobileUI.this;
                C76701a.makeText((Context) bindMobileUI, (CharSequence) bindMobileUI.getString(C0966R.string.ajw), 0).show();
                C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            BindMobileUI bindMobileUI2 = BindMobileUI.this;
            bindMobileUI2.f196465i = BindMobileUI.this.f196464h.getText().toString().trim() + Util.trimPhoneNumber(BindMobileUI.this.f196461e.getText().toString());
            Log.m105924i("MicroMsg.BindMContactUI", "do next, send sms to self");
            BindMobileUI bindMobileUI3 = BindMobileUI.this;
            String str = bindMobileUI3.f196465i;
            String string = bindMobileUI3.getContext().getString(C0966R.string.alc);
            C76879j.m92750u(bindMobileUI3.getContext(), String.format("%s\n%s", new Object[]{bindMobileUI3.getContext().getString(C0966R.string.ald), str}), string, new C75914m(bindMobileUI3, str), (DialogInterface.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileUI$b */
    public class C68377b implements View.OnClickListener {
        public C68377b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMobileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindMobileUI bindMobileUI = BindMobileUI.this;
            int i = BindMobileUI.f196459B;
            bindMobileUI.mo7681K7(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileUI$c */
    public class C68378c implements MenuItem.OnMenuItemClickListener {
        public C68378c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindMobileUI bindMobileUI = BindMobileUI.this;
            int i = BindMobileUI.f196459B;
            bindMobileUI.mo7681K7(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileUI$d */
    public class C68379d implements View.OnClickListener {
        public C68379d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMobileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("country_name", BindMobileUI.this.f196467n);
            intent.putExtra("couttry_code", BindMobileUI.this.f196468o);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93177j(intent, BindMobileUI.this, 100);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileUI$e */
    public class C68380e implements View.OnClickListener {
        public C68380e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMobileUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("country_name", BindMobileUI.this.f196467n);
            intent.putExtra("couttry_code", BindMobileUI.this.f196468o);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93177j(intent, BindMobileUI.this, 100);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6567ii;
    }

    public void initView() {
        this.f196461e = (EditText) findViewById(C0966R.C0970id.a9p);
        this.f196462f = (LinearLayout) findViewById(C0966R.C0970id.bua);
        this.f196463g = (TextView) findViewById(C0966R.C0970id.buc);
        this.f196464h = (TextView) findViewById(C0966R.C0970id.bu8);
        this.f196470q = (TextView) findViewById(C0966R.C0970id.a9t);
        this.f196471r = (Button) findViewById(C0966R.C0970id.a9d);
        this.f196472s = (TextView) findViewById(C0966R.C0970id.a9q);
        this.f196470q.setText(getString(C0966R.string.akh));
        this.f196473t = (TextView) findViewById(C0966R.C0970id.a9e);
        this.f196476w = (LinearLayout) findViewById(C0966R.C0970id.a9s);
        this.f196475v = (CheckBox) findViewById(C0966R.C0970id.a9n);
        this.f196474u = (CheckBox) findViewById(C0966R.C0970id.a9m);
        this.f196477x = (ImageView) findViewById(C0966R.C0970id.a9o);
        BindWordingContent bindWordingContent = this.f196478y;
        if (bindWordingContent != null) {
            String str = bindWordingContent.f195809d;
            if (str != null && str.length() > 0) {
                this.f196470q.setText(this.f196478y.f195809d);
            }
            String str2 = this.f196478y.f195810e;
            if (str2 != null && str2.length() > 0) {
                this.f196473t.setText(this.f196478y.f195810e);
            }
            int intValue = this.f196478y.f195811f.intValue();
            if (intValue == 0) {
                this.f196477x.setImageResource(C0966R.C0969drawable.bdx);
            } else if (intValue == 1) {
                this.f196477x.setImageResource(C0966R.C0969drawable.f357103be0);
            } else if (intValue == 2) {
                this.f196477x.setImageResource(C0966R.C0969drawable.bdy);
            }
        }
        int i = this.f196479z;
        if (i == 0) {
            this.f196476w.setVisibility(0);
            this.f196475v.setVisibility(0);
            this.f196473t.setVisibility(8);
        } else if (i == 1) {
            this.f196476w.setVisibility(8);
            this.f196475v.setVisibility(8);
            this.f196473t.setVisibility(0);
        }
        if (Util.isNullOrNil(this.f196467n) && Util.isNullOrNil(this.f196468o)) {
            String simCountryIso = ((TelephonyManager) getSystemService("phone")).getSimCountryIso();
            Log.m105918d("MicroMsg.BindMContactUI", "tm.getSimCountryIso()" + simCountryIso);
            if (Util.isNullOrNil(simCountryIso)) {
                Log.m105920e("MicroMsg.BindMContactUI", "getDefaultCountryInfo error");
            } else {
                C76850a.C76851a a = C76850a.m92629a(this, simCountryIso, getString(C0966R.string.bvs));
                if (a == null) {
                    Log.m105920e("MicroMsg.BindMContactUI", "getDefaultCountryInfo error");
                } else {
                    this.f196467n = a.f224677c;
                    this.f196468o = a.f224676b;
                }
            }
        }
        String str3 = this.f196467n;
        if (str3 != null && !str3.equals("")) {
            this.f196463g.setText(this.f196467n);
        }
        String str4 = this.f196468o;
        if (str4 != null && !str4.equals("")) {
            TextView textView = this.f196464h;
            textView.setText("+" + this.f196468o);
        }
        String str5 = this.f196469p;
        if (str5 != null && !str5.equals("")) {
            this.f196461e.setText(this.f196469p);
        }
        this.f196471r.setOnClickListener(new C68376a());
        this.f196472s.setOnClickListener(new C68377b());
        if (this.f196460A) {
            setMMTitle((int) C0966R.string.ajj);
            this.f196477x.setVisibility(8);
            this.f196470q.setText(C0966R.string.ak4);
            this.f196476w.setVisibility(8);
            this.f196475v.setVisibility(8);
            this.f196475v.setChecked(false);
            this.f196474u.setVisibility(0);
            this.f196474u.setChecked(false);
            this.f196473t.setVisibility(8);
            this.f196473t.setText(getString(C0966R.string.ajl));
            this.f196472s.setVisibility(8);
            this.f196471r.setText(C0966R.string.ajj);
            setBackBtn(new C68378c());
        }
        this.f196462f.setOnClickListener(new C68379d());
        this.f196462f.setOnClickListener(new C68380e());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 100) {
            this.f196467n = Util.nullAs(intent.getStringExtra("country_name"), "");
            this.f196468o = Util.nullAs(intent.getStringExtra("couttry_code"), "");
            if (!this.f196467n.equals("")) {
                this.f196463g.setText(this.f196467n);
            }
            if (!this.f196468o.equals("")) {
                TextView textView = this.f196464h;
                textView.setText("+" + this.f196468o);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.akl);
        this.f196467n = Util.nullAs(getIntent().getStringExtra("country_name"), "");
        this.f196468o = Util.nullAs(getIntent().getStringExtra("couttry_code"), "");
        this.f196469p = Util.nullAs(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
        this.f196478y = (BindWordingContent) getIntent().getParcelableExtra("kstyle_bind_wording");
        this.f196479z = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
        this.f196460A = getIntent().getBooleanExtra("is_bind_for_chatroom_upgrade", false);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        C76343k kVar = this.f196466j;
        if (kVar != null) {
            kVar.mo106571b();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo7681K7(1);
        return true;
    }
}
