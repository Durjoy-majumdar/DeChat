package com.tencent.p014mm.plugin.teenmode.p111ui;

import android.content.DialogInterface;
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
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import ky2.C10432i;
import ky2.C10437m;
import ly2.C10685q;
import my2.C11098e;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI */
public class TeenModeVerifyPwdUI extends MMWizardActivity implements C11385n, C74965a.C74969d {

    /* renamed from: p */
    public static final /* synthetic */ int f21548p = 0;

    /* renamed from: e */
    public View f21549e;

    /* renamed from: f */
    public TextView f21550f;

    /* renamed from: g */
    public Button f21551g;

    /* renamed from: h */
    public EditText f21552h;

    /* renamed from: i */
    public ScrollView f21553i;

    /* renamed from: j */
    public InputPanelLinearLayout f21554j;

    /* renamed from: n */
    public C89779i0 f21555n;

    /* renamed from: o */
    public int f21556o;

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI$a */
    public class C5618a implements TextWatcher {
        public C5618a() {
        }

        public void afterTextChanged(Editable editable) {
            if (!Util.isNullOrNil(editable.toString())) {
                TeenModeVerifyPwdUI.this.f21551g.setEnabled(true);
                return;
            }
            TeenModeVerifyPwdUI.this.f21551g.setEnabled(false);
            TeenModeVerifyPwdUI.this.mo6647N7("");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI$b */
    public class C5619b implements View.OnClickListener {
        public C5619b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/TeenModeVerifyPwdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TeenModeVerifyPwdUI teenModeVerifyPwdUI = TeenModeVerifyPwdUI.this;
            int i = TeenModeVerifyPwdUI.f21548p;
            teenModeVerifyPwdUI.mo6647N7("");
            TeenModeVerifyPwdUI.this.hideVKB();
            TeenModeVerifyPwdUI teenModeVerifyPwdUI2 = TeenModeVerifyPwdUI.this;
            C86709a0.m107524d().mo123460f(new C1307j0(1, teenModeVerifyPwdUI2.f21552h.getText().toString(), "", "", "", false, teenModeVerifyPwdUI2.f21556o));
            teenModeVerifyPwdUI2.f21555n = C76879j.m92723Q(teenModeVerifyPwdUI2, teenModeVerifyPwdUI2.getString(C0966R.string.a3h), teenModeVerifyPwdUI2.getString(C0966R.string.a2w), true, false, (DialogInterface.OnCancelListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/TeenModeVerifyPwdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI$c */
    public class C5620c implements View.OnClickListener {
        public C5620c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/TeenModeVerifyPwdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TeenModeVerifyPwdUI.this.hideVKB();
            C88144b.m109789g(TeenModeVerifyPwdUI.this, "setting", ".ui.setting.SettingsForgetPwdUI");
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/TeenModeVerifyPwdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI$d */
    public class C5621d implements MenuItem.OnMenuItemClickListener {
        public C5621d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            TeenModeVerifyPwdUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI$e */
    public class C5622e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f21561d;

        public C5622e(int i) {
            this.f21561d = i;
        }

        public void run() {
            Log.m105925i("MicroMsg.VerifyPwdUI", "inputContainer.height: %d, screenHeight: %d", Integer.valueOf(TeenModeVerifyPwdUI.this.f21554j.getHeight()), Integer.valueOf(this.f21561d));
            if (TeenModeVerifyPwdUI.this.f21554j.getHeight() > this.f21561d) {
                TeenModeVerifyPwdUI teenModeVerifyPwdUI = TeenModeVerifyPwdUI.this;
                teenModeVerifyPwdUI.f21553i.scrollBy(0, teenModeVerifyPwdUI.f21554j.getHeight() - this.f21561d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI$f */
    public class C5623f implements Runnable {
        public C5623f() {
        }

        public void run() {
            Class cls = C10432i.class;
            TeenModeVerifyPwdUI.this.hideVKB();
            TeenModeVerifyPwdUI.this.setResult(-1);
            TeenModeVerifyPwdUI teenModeVerifyPwdUI = TeenModeVerifyPwdUI.this;
            int i = TeenModeVerifyPwdUI.f21548p;
            teenModeVerifyPwdUI.mo7681K7(1);
            if (TeenModeVerifyPwdUI.this.getIntent().getIntExtra("intent_extra_biz_type", 0) != 0) {
                C10437m mVar = new C10437m();
                mVar.field_businessType = TeenModeVerifyPwdUI.this.getIntent().getIntExtra("intent_extra_biz_type", Integer.MAX_VALUE);
                mVar.field_businessKey = TeenModeVerifyPwdUI.this.getIntent().getStringExtra("intent_extra_biz_key");
                C72996z1 BD = ((C10432i) C86312j.m106911c(cls)).mo10736BD();
                if (BD != null) {
                    mVar.field_guardianUserName = BD.getUsername();
                }
                mVar.field_wardUserName = C75592q0.m90789s();
                mVar.field_time = C31543z5.m39453c();
                C11098e.f32878a.mo11232a().replace(mVar);
                ((C10432i) C86312j.m106911c(cls)).I40();
            }
        }
    }

    /* renamed from: N7 */
    public final void mo6647N7(String str) {
        if (Util.isNullOrNil(str)) {
            this.f21550f.setVisibility(8);
            return;
        }
        this.f21550f.setVisibility(0);
        this.f21550f.setText(str);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cbb;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        Log.m105925i("MicroMsg.VerifyPwdUI", "keyboard show %s, keyboardHeight %d", Boolean.valueOf(z), Integer.valueOf(i));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21551g.getLayoutParams();
        if (z) {
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3761db);
            layoutParams.topMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3753d4);
            this.f21551g.setLayoutParams(layoutParams);
            InputPanelLinearLayout inputPanelLinearLayout = this.f21554j;
            inputPanelLinearLayout.setPadding(inputPanelLinearLayout.getPaddingLeft(), this.f21554j.getPaddingTop(), this.f21554j.getPaddingRight(), i);
            int height = this.f21553i.getHeight();
            this.f21554j.requestLayout();
            this.f21554j.post(new C5622e(height));
            return;
        }
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3709c2);
        layoutParams.topMargin = 0;
        this.f21551g.setLayoutParams(layoutParams);
        InputPanelLinearLayout inputPanelLinearLayout2 = this.f21554j;
        inputPanelLinearLayout2.setPadding(inputPanelLinearLayout2.getPaddingLeft(), this.f21554j.getPaddingTop(), this.f21554j.getPaddingRight(), 0);
        this.f21553i.scrollBy(0, 0);
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        this.f21553i = (ScrollView) findViewById(C0966R.C0970id.j48);
        InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) findViewById(C0966R.C0970id.f7j);
        this.f21554j = inputPanelLinearLayout;
        inputPanelLinearLayout.mo104200a(this);
        this.f21550f = (TextView) findViewById(C0966R.C0970id.ckx);
        this.f21549e = findViewById(C0966R.C0970id.f358319ee3);
        EditText editText = (EditText) findViewById(C0966R.C0970id.i8v);
        this.f21552h = editText;
        editText.requestFocus();
        this.f21552h.addTextChangedListener(new C5618a());
        Button button = (Button) findViewById(C0966R.C0970id.hfe);
        this.f21551g = button;
        button.setOnClickListener(new C5619b());
        this.f21549e.setOnClickListener(new C5620c());
        setBackBtn(new C5621d());
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(384, this);
        ((C10432i) C86312j.m106911c(C10432i.class)).mo10757ri(7);
        this.f21556o = getIntent().getIntExtra("key_scenen", 3);
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
        Class cls = C10685q.class;
        Log.m105925i("MicroMsg.VerifyPwdUI", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C89779i0 i0Var = this.f21555n;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (i == 0 && i2 == 0) {
            ((C10685q) C86312j.m106911c(cls)).mo10757ri(2);
            C76912y0.m92768g(this, getString(C0966R.string.k_0));
            MMHandlerThread.postToMainThreadDelayed(new C5623f(), 2000);
            return;
        }
        ((C10685q) C86312j.m106911c(cls)).mo10757ri(6);
        if (i != 4) {
            mo6647N7(getString(C0966R.string.f7966xq));
        } else if (!Util.isNullOrNil(str)) {
            C7660a a = C7660a.m7782a(str);
            if (a != null) {
                mo6647N7(a.f26001b);
            } else {
                mo6647N7(str);
            }
        } else {
            mo6647N7(getString(C0966R.string.f7966xq));
        }
    }
}
