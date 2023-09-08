package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1307j0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.account.ui.VerifyPwdUI */
public class VerifyPwdUI extends MMActivity implements C11385n, C74965a.C74969d {

    /* renamed from: o */
    public static final /* synthetic */ int f10790o = 0;

    /* renamed from: d */
    public View f10791d;

    /* renamed from: e */
    public TextView f10792e;

    /* renamed from: f */
    public Button f10793f;

    /* renamed from: g */
    public EditText f10794g;

    /* renamed from: h */
    public ScrollView f10795h;

    /* renamed from: i */
    public InputPanelLinearLayout f10796i;

    /* renamed from: j */
    public C89779i0 f10797j;

    /* renamed from: n */
    public int f10798n;

    /* renamed from: com.tencent.mm.plugin.account.ui.VerifyPwdUI$a */
    public class C1462a implements TextWatcher {
        public C1462a() {
        }

        public void afterTextChanged(Editable editable) {
            if (!Util.isNullOrNil(editable.toString())) {
                VerifyPwdUI.this.f10793f.setEnabled(true);
                return;
            }
            VerifyPwdUI.this.f10793f.setEnabled(false);
            VerifyPwdUI.this.mo1466H7("");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.VerifyPwdUI$b */
    public class C1463b implements View.OnClickListener {
        public C1463b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/VerifyPwdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            VerifyPwdUI verifyPwdUI = VerifyPwdUI.this;
            int i = VerifyPwdUI.f10790o;
            verifyPwdUI.mo1466H7("");
            VerifyPwdUI verifyPwdUI2 = VerifyPwdUI.this;
            C86709a0.m107524d().mo123460f(new C1307j0(1, verifyPwdUI2.f10794g.getText().toString(), "", "", "", false, verifyPwdUI2.f10798n));
            verifyPwdUI2.f10797j = C76879j.m92723Q(verifyPwdUI2, verifyPwdUI2.getString(C0966R.string.a3h), verifyPwdUI2.getString(C0966R.string.a2w), true, false, (DialogInterface.OnCancelListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/VerifyPwdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.VerifyPwdUI$c */
    public class C1464c implements View.OnClickListener {
        public C1464c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/VerifyPwdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            VerifyPwdUI.this.hideVKB();
            C88144b.m109789g(VerifyPwdUI.this, "setting", ".ui.setting.SettingsForgetPwdUI");
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/VerifyPwdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.VerifyPwdUI$d */
    public class C1465d implements MenuItem.OnMenuItemClickListener {
        public C1465d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            VerifyPwdUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.VerifyPwdUI$e */
    public class C1466e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f10803d;

        public C1466e(int i) {
            this.f10803d = i;
        }

        public void run() {
            Log.m105925i("MicroMsg.VerifyPwdUI", "inputContainer.height: %d, screenHeight: %d", Integer.valueOf(VerifyPwdUI.this.f10796i.getHeight()), Integer.valueOf(this.f10803d));
            if (VerifyPwdUI.this.f10796i.getHeight() > this.f10803d) {
                VerifyPwdUI verifyPwdUI = VerifyPwdUI.this;
                verifyPwdUI.f10795h.scrollBy(0, verifyPwdUI.f10796i.getHeight() - this.f10803d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.VerifyPwdUI$f */
    public class C1467f implements Runnable {
        public C1467f() {
        }

        public void run() {
            VerifyPwdUI.this.hideVKB();
            VerifyPwdUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public final void mo1466H7(String str) {
        if (Util.isNullOrNil(str)) {
            this.f10792e.setVisibility(8);
            return;
        }
        this.f10792e.setVisibility(0);
        this.f10792e.setText(str);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cba;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        Log.m105925i("MicroMsg.VerifyPwdUI", "keyboard show %s, keyboardHeight %d", Boolean.valueOf(z), Integer.valueOf(i));
        if (z) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10793f.getLayoutParams();
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            layoutParams.topMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            this.f10793f.setLayoutParams(layoutParams);
            InputPanelLinearLayout inputPanelLinearLayout = this.f10796i;
            inputPanelLinearLayout.setPadding(inputPanelLinearLayout.getPaddingLeft(), this.f10796i.getPaddingTop(), this.f10796i.getPaddingRight(), i);
            int height = this.f10795h.getHeight();
            this.f10796i.requestLayout();
            this.f10796i.post(new C1466e(height));
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f10793f.getLayoutParams();
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3709c2);
        layoutParams2.topMargin = 0;
        this.f10793f.setLayoutParams(layoutParams2);
        InputPanelLinearLayout inputPanelLinearLayout2 = this.f10796i;
        inputPanelLinearLayout2.setPadding(inputPanelLinearLayout2.getPaddingLeft(), this.f10796i.getPaddingTop(), this.f10796i.getPaddingRight(), 0);
        this.f10795h.scrollBy(0, 0);
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        this.f10795h = (ScrollView) findViewById(C0966R.C0970id.j48);
        InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) findViewById(C0966R.C0970id.f7j);
        this.f10796i = inputPanelLinearLayout;
        inputPanelLinearLayout.mo104200a(this);
        this.f10792e = (TextView) findViewById(C0966R.C0970id.ckx);
        this.f10791d = findViewById(C0966R.C0970id.f358319ee3);
        EditText editText = (EditText) findViewById(C0966R.C0970id.i8v);
        this.f10794g = editText;
        editText.addTextChangedListener(new C1462a());
        Button button = (Button) findViewById(C0966R.C0970id.hfe);
        this.f10793f = button;
        button.setOnClickListener(new C1463b());
        this.f10791d.setOnClickListener(new C1464c());
        setBackBtn(new C1465d());
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(384, this);
        this.f10798n = getIntent().getIntExtra("key_scenen", 0);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(384, this);
        hideVKB();
    }

    public void onPointerCaptureChanged(boolean z) {
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.VerifyPwdUI", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C89779i0 i0Var = this.f10797j;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (i == 0 && i2 == 0) {
            Intent intent = new Intent();
            intent.putExtra("key_ticket", ((C1307j0) yVar).mo1225j1());
            setResult(-1, intent);
            C76912y0.m92768g(this, getString(C0966R.string.k_0));
            MMHandlerThread.postToMainThreadDelayed(new C1467f(), 500);
        } else if (i != 4) {
            mo1466H7(getString(C0966R.string.f7966xq));
        } else if (!Util.isNullOrNil(str)) {
            C7660a a = C7660a.m7782a(str);
            if (a != null) {
                mo1466H7(a.f26001b);
            } else {
                mo1466H7(str);
            }
        } else {
            mo1466H7(getString(C0966R.string.f7966xq));
        }
    }
}
