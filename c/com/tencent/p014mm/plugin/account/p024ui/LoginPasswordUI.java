package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import p148ei.C7660a;
import sf0.C90186h0;
import tc2.C118418g;
import tc2.C77890f;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginPasswordUI */
public class LoginPasswordUI extends LoginHistoryUI {

    /* renamed from: p0 */
    public static final /* synthetic */ int f344580p0 = 0;

    /* renamed from: Y */
    public String f344581Y = "";

    /* renamed from: Z */
    public C90186h0 f344582Z = new C90186h0();

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginPasswordUI$a */
    public class C114946a implements TextView.OnEditorActionListener {
        public C114946a() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 && i != 5) {
                return false;
            }
            LoginPasswordUI.this.mo1399K7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginPasswordUI$b */
    public class C114947b implements View.OnKeyListener {
        public C114947b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginPasswordUI$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (66 == i && keyEvent.getAction() == 0) {
                LoginPasswordUI.this.mo1399K7();
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/account/ui/LoginPasswordUI$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/LoginPasswordUI$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginPasswordUI$c */
    public class C114948c implements TextWatcher {
        public C114948c() {
        }

        public void afterTextChanged(Editable editable) {
            if (LoginPasswordUI.this.f344520e.getText().toString().length() > 0) {
                LoginPasswordUI.this.f344521f.setEnabled(true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginPasswordUI$d */
    public class C114949d implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f344586d;

        public C114949d(boolean[] zArr) {
            this.f344586d = zArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
            if (r11 != 6) goto L_0x0050;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            /*
                r10 = this;
                tc2.g r0 = tc2.C118418g.INSTANCE
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r1.add(r11)
                r1.add(r12)
                java.lang.Object[] r7 = r1.toArray()
                r1.clear()
                java.lang.String r2 = "com/tencent/mm/plugin/account/ui/LoginPasswordUI$4"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r6 = r10
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                int r11 = r12.getAction()
                r1 = 0
                r2 = 1
                java.lang.String r3 = "ce_login_id"
                if (r11 == 0) goto L_0x003a
                if (r11 == r2) goto L_0x0033
                r4 = 5
                if (r11 == r4) goto L_0x003a
                r2 = 6
                if (r11 == r2) goto L_0x0033
                goto L_0x0050
            L_0x0033:
                r0.mo175827n9(r3, r12)
                r0.ec0(r3)
                goto L_0x0050
            L_0x003a:
                boolean[] r11 = r10.f344586d
                r11[r1] = r2
                com.tencent.mm.plugin.account.ui.LoginPasswordUI r11 = com.tencent.p014mm.plugin.account.p024ui.LoginPasswordUI.this
                r12 = 2
                java.lang.String r12 = tc2.C77890f.m94019a(r12)
                r11.f344581Y = r12
                com.tencent.mm.plugin.account.ui.LoginPasswordUI r11 = com.tencent.p014mm.plugin.account.p024ui.LoginPasswordUI.this
                java.lang.String r11 = r11.f344581Y
                java.lang.String r12 = "<LoginByID>"
                r0.Ud0(r3, r12, r11)
            L_0x0050:
                r4 = 0
                java.lang.String r6 = "com/tencent/mm/plugin/account/ui/LoginPasswordUI$4"
                java.lang.String r7 = "android/view/View$OnTouchListener"
                java.lang.String r8 = "onTouch"
                java.lang.String r9 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r10
                j20.C117292a.m165362h(r4, r5, r6, r7, r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.LoginPasswordUI.C114949d.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginPasswordUI$e */
    public class C114950e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f344588d;

        public C114950e(boolean[] zArr) {
            this.f344588d = zArr;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginPasswordUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean[] zArr = this.f344588d;
            if (zArr[0]) {
                zArr[0] = false;
            } else {
                LoginPasswordUI.this.f344581Y = C77890f.m94019a(2);
                C118418g gVar = C118418g.INSTANCE;
                gVar.Ud0("ce_login_id", "<LoginByID>", LoginPasswordUI.this.f344581Y);
                gVar.mo175827n9("ce_login_id", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
                gVar.ec0("ce_login_id");
            }
            LoginPasswordUI.this.mo1399K7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginPasswordUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginPasswordUI$f */
    public class C114951f implements Runnable {
        public C114951f() {
        }

        public void run() {
            LoginPasswordUI.this.mo1399K7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginPasswordUI$g */
    public class C114952g implements Runnable {
        public C114952g() {
        }

        public void run() {
            LoginPasswordUI loginPasswordUI = LoginPasswordUI.this;
            int i = LoginPasswordUI.f344580p0;
            loginPasswordUI.mo174614J7();
            C115135m0 m0Var = loginPasswordUI.f344532t;
            C114735a0 a0Var = new C114735a0(m0Var.f345162b, m0Var.f345163c, loginPasswordUI.f344534v, 0);
            C86709a0.m107524d().mo123460f(a0Var);
            loginPasswordUI.f344530r = C76879j.m92723Q(loginPasswordUI, loginPasswordUI.getString(C0966R.string.a3h), loginPasswordUI.getString(C0966R.string.gda), true, true, new C68502l0(loginPasswordUI, a0Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginPasswordUI$h */
    public class C114953h implements DialogInterface.OnDismissListener {
        public C114953h(LoginPasswordUI loginPasswordUI) {
        }

        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: K7 */
    public void mo1399K7() {
        super.mo1399K7();
        if (isFinishing() || getWindow() == null) {
            Log.m105920e("MicroMsg.LoginPasswordUI", "LoginHistoryUI is finishing");
            return;
        }
        this.f344532t.f345163c = this.f344520e.getText().toString();
        if (this.f344532t.f345162b.equals("")) {
            C76879j.m92738i(this, C0966R.string.k_7, C0966R.string.gcw);
        } else if (this.f344532t.f345163c.equals("")) {
            C76879j.m92738i(this, C0966R.string.k9z, C0966R.string.gcw);
        } else {
            hideVKB();
            this.f344582Z.mo124429a(this, new C114952g());
        }
    }

    public void initView() {
        C7660a a;
        super.initView();
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("key_errType", 0);
            int intExtra2 = getIntent().getIntExtra("key_errCode", 0);
            String stringExtra = getIntent().getStringExtra("key_errMsg");
            Log.m105925i("MicroMsg.LoginPasswordUI", "initView,errType %d,errCode %d", Integer.valueOf(intExtra), Integer.valueOf(intExtra2));
            if (C1468a.m1501b(intExtra, intExtra2) && (a = C7660a.m7782a(stringExtra)) != null) {
                a.mo8793c(this, new C114953h(this));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f344513R = 2;
        this.f344506J.setVisibility(0);
        this.f344521f.setVisibility(0);
        this.f344520e.setTypeface(Typeface.DEFAULT);
        this.f344520e.setTransformationMethod(new PasswordTransformationMethod());
        this.f344520e.setOnEditorActionListener(new C114946a());
        this.f344520e.setOnKeyListener(new C114947b());
        this.f344520e.addTextChangedListener(new C114948c());
        if (this.f344520e.getText().toString().length() > 0) {
            this.f344521f.setEnabled(true);
        }
        boolean[] zArr = {false};
        this.f344521f.setOnTouchListener(new C114949d(zArr));
        this.f344521f.setOnClickListener(new C114950e(zArr));
        String stringExtra = getIntent().getStringExtra("auth_ticket");
        this.f344534v = stringExtra;
        if (!Util.isNullOrNil(stringExtra)) {
            this.f344519d.setText(Util.nullAsNil(C115135m0.m161943c()));
            this.f344520e.setText(Util.nullAsNil(C115135m0.m161944d()));
            new MMHandler().postDelayed(new C114951f(), 500);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f344582Z.mo124431c(this, i, strArr, iArr);
    }
}
