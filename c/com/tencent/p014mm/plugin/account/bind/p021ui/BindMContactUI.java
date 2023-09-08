package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import f40.C86709a0;
import ig0.C76343k;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import nc0.C76850a;
import nj3.C76879j;
import nj3.C88990b;
import p214om.C11502f;
import qg0.C12215a;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactUI */
public class BindMContactUI extends MMWizardActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f196402t = 0;

    /* renamed from: e */
    public EditText f196403e;

    /* renamed from: f */
    public LinearLayout f196404f;

    /* renamed from: g */
    public TextView f196405g;

    /* renamed from: h */
    public TextView f196406h;

    /* renamed from: i */
    public TextView f196407i;

    /* renamed from: j */
    public String f196408j;

    /* renamed from: n */
    public C76343k f196409n;

    /* renamed from: o */
    public String f196410o = null;

    /* renamed from: p */
    public String f196411p = null;

    /* renamed from: q */
    public String f196412q = null;

    /* renamed from: r */
    public boolean f196413r = false;

    /* renamed from: s */
    public int f196414s = 0;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactUI$a */
    public class C68361a implements DialogInterface.OnClickListener {
        public C68361a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            BindMContactUI bindMContactUI = BindMContactUI.this;
            int i2 = BindMContactUI.f196402t;
            bindMContactUI.mo7681K7(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactUI$b */
    public class C68362b implements MMHandlerThread.IWaitWorkThread {
        public C68362b() {
        }

        public boolean doInBackground() {
            return true;
        }

        public boolean onPostExecute() {
            if (!Util.isNullOrNil(("" + BindMContactUI.this.f196403e.getText()).trim())) {
                return true;
            }
            if (Util.isNullOrNil((String) null)) {
                BindMContactUI.this.f196403e.setText("");
                return true;
            }
            BindMContactUI.this.f196403e.setText((CharSequence) null);
            EditText editText = BindMContactUI.this.f196403e;
            throw null;
        }

        public String toString() {
            return super.toString() + "|initView";
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactUI$c */
    public class C68363c implements MenuItem.OnMenuItemClickListener {
        public C68363c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindMContactUI bindMContactUI = BindMContactUI.this;
            bindMContactUI.f196408j = BindMContactUI.this.f196407i.getText().toString().trim() + Util.trimPhoneNumber(BindMContactUI.this.f196403e.getText().toString());
            if (!(BindMContactUI.this.f196408j.length() > 0) || Util.trimPhoneNumber(BindMContactUI.this.f196403e.getText().toString()).length() <= 0) {
                C76879j.m92738i(BindMContactUI.this, C0966R.string.akf, C0966R.string.a3h);
                return true;
            }
            BindMContactUI bindMContactUI2 = BindMContactUI.this;
            bindMContactUI2.mo93905N7(bindMContactUI2.f196408j);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactUI$d */
    public class C68364d implements MenuItem.OnMenuItemClickListener {
        public C68364d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindMContactUI bindMContactUI = BindMContactUI.this;
            int i = BindMContactUI.f196402t;
            bindMContactUI.mo93906O7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactUI$e */
    public class C68365e implements View.OnClickListener {
        public C68365e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMContactUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("country_name", BindMContactUI.this.f196410o);
            intent.putExtra("couttry_code", BindMContactUI.this.f196411p);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93177j(intent, BindMContactUI.this, 100);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactUI$f */
    public class C68366f implements Runnable {
        public C68366f() {
        }

        public void run() {
            C12215a.m11778c(BindMContactUI.this, BindMContactUI.this.getString(C0966R.string.fdp, new Object[]{LocaleUtil.getApplicationLanguage()}), 30765, true);
            C88990b.m111197f(BindMContactUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactUI$g */
    public class C68367g implements C76343k.C76347d {

        /* renamed from: a */
        public final /* synthetic */ String f196421a;

        public C68367g(String str) {
            this.f196421a = str;
        }

        /* renamed from: a */
        public void mo93913a(int i, Bundle bundle) {
            if (i == 1) {
                Log.m105924i("MicroMsg.BindMContactUI", "next to BindMContactVerifyUI for bind mobile");
                Intent intent = new Intent(BindMContactUI.this, BindMContactVerifyUI.class);
                intent.putExtra("policy_ticket", bundle.getString("policyTicket", ""));
                intent.putExtra("bindmcontact_mobile", this.f196421a);
                intent.putExtra("KEnterFromBanner", BindMContactUI.this.f196413r);
                intent.putExtra("bind_scene", BindMContactUI.this.f196414s);
                intent.addFlags(TPMediaCodecProfileLevel.HEVCHighTierLevel62);
                MMWizardActivity.m7017L7(BindMContactUI.this, intent);
                BindMContactUI.this.finish();
            }
        }
    }

    /* renamed from: N7 */
    public final void mo93905N7(String str) {
        Log.m105925i("MicroMsg.BindMContactUI", "sendSmsToSelf %s", str);
        if (this.f196409n == null) {
            C76343k.C76348e eVar = C76343k.C76348e.BINDMOBILE;
            if (this.f196414s == 3) {
                eVar = C76343k.C76348e.CHANGEMOBILE;
            }
            this.f196409n = new C76343k(eVar, this, new C68367g(str));
        }
        this.f196409n.mo106573d(str);
    }

    /* renamed from: O7 */
    public final void mo93906O7() {
        int i = this.f196414s;
        if (i == 0 || i == 3) {
            C76879j.m92743n(this, i == 3 ? C0966R.string.f360167ak1 : C0966R.string.f360166ak0, i == 3 ? C0966R.string.f360169ak3 : C0966R.string.f360168ak2, new C68361a(), (DialogInterface.OnClickListener) null);
            return;
        }
        ((HashMap) MMWizardActivity.f24166d).clear();
        mo7681K7(1);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6572io;
    }

    public void initView() {
        String str;
        this.f196413r = getIntent().getBooleanExtra("KEnterFromBanner", false);
        int intExtra = getIntent().getIntExtra("bind_scene", 0);
        this.f196414s = intExtra;
        Log.m105925i("MicroMsg.BindMContactUI", "bindScene:%d", Integer.valueOf(intExtra));
        this.f196403e = (EditText) findViewById(C0966R.C0970id.a9p);
        this.f196404f = (LinearLayout) findViewById(C0966R.C0970id.bua);
        this.f196406h = (TextView) findViewById(C0966R.C0970id.buc);
        this.f196407i = (TextView) findViewById(C0966R.C0970id.bu8);
        this.f196405g = (TextView) findViewById(C0966R.C0970id.jdc);
        if (this.f196414s == 3) {
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
            if (!Util.isNullOrNil(str2)) {
                if (str2.startsWith("+")) {
                    str = PhoneFormater.extractCountryCode(str2);
                    if (!Util.isNullOrNil(str)) {
                        str2 = str2.substring(str.length() + 1);
                    }
                } else {
                    str = "86";
                }
                String formatNumber = new PhoneFormater().formatNumber(str, str2);
                this.f196405g.setText(getString(C0966R.string.ajp, new Object[]{formatNumber}));
            }
        }
        if (WeChatSomeFeatureSwitch.onlyUSMobile()) {
            this.f196411p = "1";
            this.f196410o = C76850a.m92631c(this, "1", getString(C0966R.string.bvs));
        }
        if (!Util.isNullOrNil(this.f196410o)) {
            this.f196406h.setText(this.f196410o);
        }
        if (Util.isNullOrNil(this.f196411p)) {
            String string = getString(C0966R.string.bvt);
            this.f196411p = string;
            if (string.startsWith("+")) {
                this.f196411p = this.f196411p.substring(1);
            }
        }
        TextView textView = this.f196407i;
        textView.setText("+" + this.f196411p);
        String str3 = this.f196412q;
        if (str3 == null || str3.equals("")) {
            C86709a0.m107525e().postAtFrontOfWorker(new C68362b());
        } else {
            this.f196403e.setText(this.f196412q);
            this.f196403e.setSelection(this.f196412q.length());
        }
        addTextOptionMenu(0, getString(C0966R.string.f360089a13), new C68363c());
        this.f196403e.requestFocus();
        setBackBtn(new C68364d());
        this.f196404f.setOnClickListener(new C68365e());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        Bundle bundleExtra2;
        Bundle bundleExtra3;
        super.onActivityResult(i, i2, intent);
        if (i2 == 100) {
            this.f196410o = Util.nullAs(intent.getStringExtra("country_name"), "");
            this.f196411p = Util.nullAs(intent.getStringExtra("couttry_code"), "");
            if (!this.f196410o.equals("")) {
                this.f196406h.setText(this.f196410o);
            }
            if (!this.f196411p.equals("")) {
                TextView textView = this.f196407i;
                textView.setText("+" + this.f196411p);
            }
        }
        switch (i) {
            case 30765:
                if (intent != null && (bundleExtra = intent.getBundleExtra("result_data")) != null && bundleExtra.getString("go_next", "").equals("birthdayComfirmOK")) {
                    mo93905N7(this.f196408j);
                    return;
                }
                return;
            case 30766:
                if (intent != null && (bundleExtra2 = intent.getBundleExtra("result_data")) != null && bundleExtra2.getString("go_next", "").equals("agree_privacy")) {
                    MMHandlerThread.postToMainThreadDelayed(new C68366f(), 100);
                    return;
                }
                return;
            case 30767:
                if (intent != null && (bundleExtra3 = intent.getBundleExtra("result_data")) != null && bundleExtra3.getString("go_next", "").equals("agree_privacy")) {
                    mo93905N7(this.f196408j);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.ako);
        this.f196410o = Util.nullAs(getIntent().getStringExtra("country_name"), "");
        this.f196411p = Util.nullAs(getIntent().getStringExtra("couttry_code"), "");
        this.f196412q = Util.nullAs(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        C76343k kVar = this.f196409n;
        if (kVar != null) {
            kVar.mo106571b();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo93906O7();
        return true;
    }
}
