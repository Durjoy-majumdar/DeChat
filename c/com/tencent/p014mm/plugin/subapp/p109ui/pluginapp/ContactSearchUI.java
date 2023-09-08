package com.tencent.p014mm.plugin.subapp.p109ui.pluginapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C45286l;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import java.io.IOException;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p910lj.C76701a;
import sf0.C48374j0;
import te3.C77967mx3;
import wc3.C53150x;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI */
public class ContactSearchUI extends MMActivity implements C11385n {

    /* renamed from: f */
    public static final /* synthetic */ int f206363f = 0;

    /* renamed from: d */
    public EditText f206364d;

    /* renamed from: e */
    public ProgressDialog f206365e = null;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI$a */
    public class C71286a implements TextWatcher {
        public C71286a() {
        }

        public void afterTextChanged(Editable editable) {
            ContactSearchUI.this.enableOptionMenu(editable.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI$b */
    public class C71287b implements TextView.OnEditorActionListener {
        public C71287b() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 66 || Util.isNullOrNil(ContactSearchUI.this.f206364d.getText().toString().trim())) {
                return false;
            }
            ContactSearchUI.this.mo98139H7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI$c */
    public class C71288c implements MenuItem.OnMenuItemClickListener {
        public C71288c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactSearchUI contactSearchUI = ContactSearchUI.this;
            int i = ContactSearchUI.f206363f;
            contactSearchUI.mo98139H7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI$d */
    public class C71289d implements MenuItem.OnMenuItemClickListener {
        public C71289d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactSearchUI.this.hideVKB();
            ContactSearchUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI$e */
    public class C71290e implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C45286l f206370d;

        public C71290e(ContactSearchUI contactSearchUI, C45286l lVar) {
            this.f206370d = lVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123458d(this.f206370d);
        }
    }

    /* renamed from: H7 */
    public final void mo98139H7() {
        String trim = this.f206364d.getText().toString().trim();
        if (trim == null || trim.length() <= 0) {
            C76879j.m92738i(getContext(), C0966R.string.k9x, C0966R.string.a3h);
            return;
        }
        Log.m105918d("MicroMsg.ContactSearchUI", "always search contact from internet!!!");
        C45286l lVar = new C45286l(trim, 1);
        C97625j3.m125815e().mo123460f(lVar);
        this.f206365e = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f7486hk), true, true, new C71290e(this, lVar));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7093y1;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.buh);
        EditText editText = (EditText) findViewById(C0966R.C0970id.bqf);
        this.f206364d = editText;
        editText.addTextChangedListener(new C71286a());
        this.f206364d.setImeOptions(3);
        this.f206364d.setOnEditorActionListener(new C71287b());
        addTextOptionMenu(0, getString(C0966R.string.f8008z4), new C71288c());
        setBackBtn(new C71289d());
        if (getIntent().getBooleanExtra("from_webview", false)) {
            this.f206364d.setText(getIntent().getStringExtra("userName"));
            mo98139H7();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onPause() {
        C97625j3.m125815e().mo123470p(106, this);
        super.onPause();
    }

    public void onResume() {
        C97625j3.m125815e().mo123455a(106, this);
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        Log.m105924i("MicroMsg.ContactSearchUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        ProgressDialog progressDialog = this.f206365e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f206365e = null;
        }
        if (!((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93165v5(getContext(), i, i2, str)) {
            if (i == 4 && i2 == -4) {
                C76879j.m92738i(getContext(), C0966R.string.f7481he, C0966R.string.a3h);
                return;
            }
            int i4 = 1;
            if (i == 0 && i2 == 0) {
                C77967mx3 l0 = ((C45286l) yVar).mo70811l0();
                if (l0.f227845D > 0) {
                    Intent intent = new Intent();
                    intent.setClass(this, ContactSearchResultUI.class);
                    try {
                        intent.putExtra("result", l0.toByteArray());
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.ContactSearchUI", e, "", new Object[0]);
                    }
                } else {
                    String g = C48374j0.m53718g(l0.f227857d);
                    Intent intent2 = new Intent();
                    C53150x xVar = (C53150x) C86312j.m106911c(C53150x.class);
                    String trim = this.f206364d.getText().toString().trim();
                    if (Util.isValidQQNum(trim)) {
                        i3 = 1;
                    } else if (Util.isValidEmail(trim)) {
                        i3 = 2;
                    } else {
                        Util.isValidAccount(trim);
                        i3 = 3;
                    }
                    xVar.mo73832B0(intent2, l0, i3);
                    if (Util.nullAsNil(g).length() > 0) {
                        if ((l0.f227867q & 8) > 0) {
                            C115669n nVar = C115669n.INSTANCE;
                            StringBuilder sb = new StringBuilder();
                            sb.append(g);
                            sb.append(",");
                            String trim2 = this.f206364d.getText().toString().trim();
                            if (!Util.isValidQQNum(trim2)) {
                                if (Util.isValidEmail(trim2)) {
                                    i4 = 2;
                                } else {
                                    Util.isValidAccount(trim2);
                                    i4 = 3;
                                }
                            }
                            sb.append(i4);
                            nVar.kvStat(10298, sb.toString());
                        }
                        C88144b.m109791i(this, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                    }
                }
            } else {
                String errMsgContent = Util.getErrMsgContent(str);
                if (Util.isNullOrNil(errMsgContent)) {
                    errMsgContent = getString(C0966R.string.f09, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                }
                C76701a.makeText((Context) this, (CharSequence) errMsgContent, 0).show();
            }
        }
    }
}
