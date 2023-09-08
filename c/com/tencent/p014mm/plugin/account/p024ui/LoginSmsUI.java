package com.tencent.p014mm.plugin.account.p024ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import sf0.C90186h0;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginSmsUI */
public class LoginSmsUI extends LoginHistoryUI {

    /* renamed from: Z */
    public static final /* synthetic */ int f344592Z = 0;

    /* renamed from: Y */
    public C90186h0 f344593Y = new C90186h0();

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginSmsUI$a */
    public class C114954a implements View.OnClickListener {
        public C114954a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginSmsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LoginSmsUI loginSmsUI = LoginSmsUI.this;
            String str = loginSmsUI.f344536x;
            int i = LoginSmsUI.f344592Z;
            loginSmsUI.getClass();
            if (!Util.isNullOrNil(str)) {
                C67216a aVar = new C67216a(str, 13, "", 0, "");
                C86709a0.m107524d().mo123460f(aVar);
                loginSmsUI.f344530r = C76879j.m92723Q(loginSmsUI, loginSmsUI.getString(C0966R.string.a3h), loginSmsUI.getString(C0966R.string.a4d), true, true, new C115139n0(loginSmsUI, aVar));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginSmsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginSmsUI$b */
    public class C114955b implements TextWatcher {
        public C114955b() {
        }

        public void afterTextChanged(Editable editable) {
            if (LoginSmsUI.this.f344507K.getText().toString().length() > 0) {
                LoginSmsUI.this.f344521f.setEnabled(true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginSmsUI$c */
    public class C114956c implements View.OnClickListener {
        public C114956c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginSmsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LoginSmsUI.this.mo1399K7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginSmsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginSmsUI$d */
    public class C114957d implements Runnable {
        public C114957d() {
        }

        public void run() {
            LoginSmsUI loginSmsUI = LoginSmsUI.this;
            int i = LoginSmsUI.f344592Z;
            loginSmsUI.mo174614J7();
            C67216a aVar = new C67216a(loginSmsUI.f344536x, 17, loginSmsUI.f344507K.getText().toString().trim(), 0, "");
            C86709a0.m107524d().mo123460f(aVar);
            loginSmsUI.f344530r = C76879j.m92723Q(loginSmsUI, loginSmsUI.getString(C0966R.string.a3h), loginSmsUI.getString(C0966R.string.gda), true, true, new C115146o0(loginSmsUI, aVar));
        }
    }

    /* renamed from: K7 */
    public void mo1399K7() {
        super.mo1399K7();
        if (isFinishing() || getWindow() == null) {
            Log.m105920e("LoginSmsUI", "LoginHistoryUI is finishing");
        } else if (!Util.isNullOrNil(this.f344536x)) {
            this.f344532t.f345162b = this.f344536x;
            hideVKB();
            this.f344593Y.mo124429a(this, new C114957d());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f344513R = 3;
        if (!Util.isPhoneNumber(this.f344498B).booleanValue() && Util.isPhoneNumber(this.f344536x).booleanValue()) {
            this.f344519d.setText(mo174615L7(this.f344536x));
        }
        this.f344507K.setVisibility(0);
        this.f344507K.setInputType(3);
        this.f344507K.setSendSmsBtnClickListener(new C114954a());
        this.f344507K.mo101692a(new C114955b());
        if (this.f344507K.getText().toString().length() > 0) {
            this.f344521f.setEnabled(true);
        }
        this.f344521f.setVisibility(0);
        this.f344521f.setOnClickListener(new C114956c());
    }

    public void onDestroy() {
        super.onDestroy();
        this.f344507K.mo101694c();
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(145, this);
    }

    public void onStop() {
        super.onStop();
        C86709a0.m107524d().mo123470p(145, this);
    }
}
