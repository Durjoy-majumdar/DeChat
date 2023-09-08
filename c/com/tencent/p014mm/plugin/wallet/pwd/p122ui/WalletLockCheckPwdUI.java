package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartWalletLockUIEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.wallet_core.utils.C5811n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import j53.C33517e;
import j53.C46433r;
import java.util.HashSet;
import ob0.C117747y;
import v53.C78356x;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI */
public class WalletLockCheckPwdUI extends WalletBaseUI {

    /* renamed from: n */
    public static final /* synthetic */ int f208855n = 0;

    /* renamed from: d */
    public ScrollView f208856d;

    /* renamed from: e */
    public EditHintPasswdView f208857e;

    /* renamed from: f */
    public C78356x f208858f;

    /* renamed from: g */
    public TextView f208859g;

    /* renamed from: h */
    public TextView f208860h;

    /* renamed from: i */
    public int f208861i = -1;

    /* renamed from: j */
    public String f208862j;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI$a */
    public class C72001a implements MenuItem.OnMenuItemClickListener {
        public C72001a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.WalletLockCheckPwdUI", "alvinluo cancel by BackBtn");
            WalletLockCheckPwdUI walletLockCheckPwdUI = WalletLockCheckPwdUI.this;
            int i = WalletLockCheckPwdUI.f208855n;
            walletLockCheckPwdUI.mo99216H7(-1, 4);
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo99216H7(int i, int i2) {
        Intent intent = new Intent();
        intent.putExtra("key_err_code", i2);
        setResult(i, intent);
        finish();
    }

    public void cleanUiData(int i) {
        super.cleanUiData(i);
        this.f208857e.mo105043a();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cec;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        if (intent == null) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105927v("MicroMsg.WalletLockCheckPwdUI", "alvinluo WalletLockCheckPwdUI onActivityResult requestCode: %d, resultCode: %d, data == null: %b", objArr);
        setResult(i2, intent);
        finish();
    }

    public void onBackPressed() {
        Log.m105924i("MicroMsg.WalletLockCheckPwdUI", "alvinluo onBackPressed");
        mo99216H7(-1, 4);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setMMTitle("");
        hideActionbarLine();
        this.f208861i = getIntent().getIntExtra("key_wallet_lock_type", -1);
        this.f208862j = getIntent().getStringExtra("action");
        Log.m105927v("MicroMsg.WalletLockCheckPwdUI", "alvinluo wallet lock type: %d, action: %s", Integer.valueOf(this.f208861i), this.f208862j);
        this.f208857e = (EditHintPasswdView) findViewById(C0966R.C0970id.f7k);
        this.f208859g = (TextView) findViewById(C0966R.C0970id.lja);
        this.f208860h = (TextView) findViewById(C0966R.C0970id.lj6);
        this.f208856d = (ScrollView) findViewById(C0966R.C0970id.ll_);
        C75228t.m90240d(this.f208859g);
        this.f208859g.setText(C0966R.string.m9t);
        String stringExtra = getIntent().getStringExtra("key_wallet_lock_input_new_fp_tips");
        int i = this.f208861i;
        if (i == 2) {
            if (this.f208862j.equals("action.touchlock_verify_by_paypwd")) {
                this.f208859g.setText(C0966R.string.m9t);
            } else {
                this.f208859g.setText(C0966R.string.lbm);
            }
            if (this.f208862j.equals("action.touchlock_need_verify_paypwd") && !Util.isNullOrNil(stringExtra)) {
                this.f208860h.setText(stringExtra);
            }
        } else if (i == 1) {
            this.f208859g.setText(C0966R.string.m9t);
        }
        this.f208857e.setOnInputValidListener(new C72044m(this));
        setTenpayKBStateListener(new C72045n(this));
        hideKeyboardPushDownBtn();
        setEditFocusListener(this.f208857e, 0, false);
        showTenpayKB();
        setBackBtn(new C72001a());
        int i2 = Build.VERSION.SDK_INT;
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(C0966R.color.al6));
        if (i2 >= 23) {
            window.getDecorView().setSystemUiVisibility(8192);
        }
        getContentView().setFitsSystemWindows(true);
        if (C75228t.m90212E()) {
            getWindow().addFlags(8192);
        }
    }

    public boolean onProgressFinish() {
        return true;
    }

    public void onResume() {
        super.onResume();
        EditHintPasswdView editHintPasswdView = this.f208857e;
        if (editHintPasswdView != null) {
            editHintPasswdView.mo105043a();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.WalletLockCheckPwdUI", "alvinluo WalletLockCheckPwdUI errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar instanceof C78356x) {
            C78356x xVar = (C78356x) yVar;
            if (i == 0 && i2 == 0) {
                if ("next_action.switch_on_pattern".equals(getIntent().getStringExtra("next_action"))) {
                    Log.m105924i("MicroMsg.WalletLockCheckPwdUI", "alvinluo start to open wallet lock after check pwd");
                    Intent intent = new Intent();
                    intent.putExtra("action", "action.switch_on_pattern");
                    intent.putExtra("next_action", "next_action.switch_on_pattern");
                    intent.putExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, xVar.f229615e);
                    intent.putExtra("type", xVar.f229616f);
                    intent.putExtra("key_wallet_lock_type", this.f208861i);
                    intent.setPackage(MMApplicationContext.getPackageName());
                    if (this.f208861i == 2) {
                        intent.putExtra("key_pay_passwd", this.f208857e.getText());
                    }
                    StartWalletLockUIEvent startWalletLockUIEvent = new StartWalletLockUIEvent();
                    StartWalletLockUIEvent.C67793a aVar = startWalletLockUIEvent.f193942d;
                    aVar.f193945b = intent;
                    aVar.f193944a = this;
                    aVar.f193946c = 1;
                    startWalletLockUIEvent.publish();
                } else {
                    String str2 = xVar.f229615e;
                    String str3 = xVar.f229616f;
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_err_code", 0);
                    intent2.putExtra("key_token", str2);
                    intent2.putExtra("key_type", str3);
                    setResult(-1, intent2);
                    finish();
                }
                return true;
            } else if (i == 1000 && i2 == 3) {
                Intent intent3 = new Intent();
                intent3.putExtra("key_err_code", -1);
                intent3.putExtra("key_token", (String) null);
                intent3.putExtra("key_type", (String) null);
                setResult(-1, intent3);
                finish();
                return true;
            }
        } else if (yVar instanceof C46433r) {
            if (i == 0 && i2 == 0) {
                mo99216H7(-1, 0);
            } else {
                mo99216H7(-1, -1);
            }
            return true;
        } else if (yVar instanceof C33517e) {
            if (i == 0 && i2 == 0) {
                mo99216H7(-1, 0);
            } else {
                mo99216H7(-1, -1);
            }
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5811n.class);
    }
}
