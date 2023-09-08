package com.tencent.p014mm.plugin.collect.p038ui;

import a21.C0005a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import di3.C86312j;
import e21.C75481j0;
import e21.C75488p0;
import g63.C45890a;
import gr3.C76024a;
import h21.C76111i0;
import h21.C76115j0;
import h21.C76118k0;
import h21.C76121l0;
import h21.C76123m0;
import h21.C76125n0;
import h21.C76129o0;
import h21.C76131p0;
import h21.C76132q0;
import h21.C76133r0;
import java.util.HashSet;
import nj3.C76879j;
import ob0.C117747y;
import p629ny.C76979h;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI */
public class WalletCollectQrCodeSettingUI extends WalletBaseUI {

    /* renamed from: d */
    public WalletFormView f197819d;

    /* renamed from: e */
    public TextView f197820e;

    /* renamed from: f */
    public TextView f197821f;

    /* renamed from: g */
    public String f197822g = "";

    /* renamed from: h */
    public WcPayKeyboard f197823h;

    /* renamed from: i */
    public int f197824i = 0;

    /* renamed from: j */
    public Runnable f197825j = new C68851b();

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI$a */
    public class C68850a implements C7092q.C7093a {
        public C68850a() {
        }

        public void onClick(View view) {
            WalletCollectQrCodeSettingUI.m81120J7(WalletCollectQrCodeSettingUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI$b */
    public class C68851b implements Runnable {
        public C68851b() {
        }

        public void run() {
            WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI = WalletCollectQrCodeSettingUI.this;
            if (walletCollectQrCodeSettingUI.f197824i == 2 && walletCollectQrCodeSettingUI.isHandleAutoShowNormalStWcKb()) {
                WalletCollectQrCodeSettingUI.this.showNormalStWcKb();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI$c */
    public class C68852c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C75481j0 f197828d;

        public C68852c(C75481j0 j0Var) {
            this.f197828d = j0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!Util.isNullOrNil(this.f197828d.f221816p)) {
                Log.m105925i("MicroMsg.WalletCollectQrCodeSettingUI", "goto h5: %s", this.f197828d.f221816p);
                C75228t.m90219L(WalletCollectQrCodeSettingUI.this.getContext(), this.f197828d.f221816p, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI$d */
    public class C68853d implements DialogInterface.OnClickListener {
        public C68853d(WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI$e */
    public class C68854e implements C7092q.C7093a {
        public C68854e() {
        }

        public void onClick(View view) {
            WalletCollectQrCodeSettingUI.m81120J7(WalletCollectQrCodeSettingUI.this);
        }
    }

    /* renamed from: H7 */
    public static void m81118H7(WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI, String str) {
        walletCollectQrCodeSettingUI.getClass();
        Log.m105925i("MicroMsg.WalletCollectQrCodeSettingUI", "showErrorDialog,errMsg:%s", str);
        C77426q qVar = new C77426q(walletCollectQrCodeSettingUI.getContext());
        qVar.mo107606r("");
        qVar.mo107595g(str);
        qVar.mo107589a(true);
        qVar.mo107601m(C0966R.string.lkg);
        qVar.mo107600l(new C76118k0(walletCollectQrCodeSettingUI));
        qVar.mo107603o();
    }

    /* renamed from: I7 */
    public static void m81119I7(WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI, String str) {
        C77426q qVar = new C77426q(walletCollectQrCodeSettingUI.getContext());
        if (Util.isNullOrNil(str)) {
            str = walletCollectQrCodeSettingUI.getContext().getString(C0966R.string.l_3);
        }
        qVar.mo107595g(str);
        qVar.mo107600l(new C76121l0(walletCollectQrCodeSettingUI));
        qVar.mo107602n(walletCollectQrCodeSettingUI.getContext().getString(C0966R.string.kke));
        qVar.mo107603o();
    }

    /* renamed from: J7 */
    public static void m81120J7(WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        walletCollectQrCodeSettingUI.getClass();
        Log.m105924i("MicroMsg.WalletCollectQrCodeSettingUI", "onClick() edit desc");
        walletCollectQrCodeSettingUI.hideTenpayKB();
        walletCollectQrCodeSettingUI.hideWcKb();
        C45890a.m51175a(walletCollectQrCodeSettingUI, walletCollectQrCodeSettingUI.getString(C0966R.string.bga), walletCollectQrCodeSettingUI.f197822g, "", true, 32, new C76111i0(walletCollectQrCodeSettingUI), new C76115j0(walletCollectQrCodeSettingUI));
    }

    /* renamed from: K7 */
    public final void mo94706K7() {
        if (!Util.isNullOrNil(this.f197822g)) {
            String string = getString(C0966R.string.bgc);
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, getString(C0966R.string.bgb, new Object[]{this.f197822g, string}));
            C75228t.m90253j0(this.f197821f, T1.toString(), T1.length() - string.length(), T1.length(), new C7092q((C7092q.C7093a) new C68854e(), true), getContext());
            this.f197820e.setVisibility(8);
            this.f197821f.setVisibility(0);
            return;
        }
        String string2 = getString(C0966R.string.bga);
        C75228t.m90253j0(this.f197820e, string2, 0, string2.length(), new C7092q((C7092q.C7093a) new C68850a(), true), getContext());
        this.f197820e.setVisibility(0);
        this.f197821f.setVisibility(8);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7019v4;
    }

    public void initView() {
        this.f197819d = (WalletFormView) findViewById(C0966R.C0970id.gym);
        EditText editText = (EditText) findViewById(C0966R.C0970id.lg_);
        ((TextView) findViewById(C0966R.C0970id.ljn)).setTextSize(1, 56.0f);
        editText.setTextSize(1, 56.0f);
        if (Build.VERSION.SDK_INT >= 29) {
            editText.setTextCursorDrawable(C0966R.C0969drawable.a_5);
        }
        C76024a.m91326g(this.f197819d);
        C75228t.m90251i0(this.f197819d.getContentEt());
        String stringExtra = getIntent().getStringExtra("key_currency_unit");
        if (!Util.isNullOrNil(stringExtra)) {
            this.f197819d.getTitleTv().setText(stringExtra);
        } else {
            this.f197819d.getTitleTv().setText(C45121z0.m49962b());
        }
        this.f197819d.mo105069a(new C76123m0(this));
        this.f197819d.mo105097o(7, 2);
        this.f197821f = (TextView) findViewById(C0966R.C0970id.bh9);
        this.f197820e = (TextView) findViewById(C0966R.C0970id.bh8);
        mo94706K7();
        WcPayKeyboard wcPayKeyboard = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
        this.f197823h = wcPayKeyboard;
        wcPayKeyboard.mo104740e();
        this.f197823h.setActionText(getString(C0966R.string.bg6));
        this.f197819d.getContentEt().setOnEditorActionListener(new C76129o0(this, new C76125n0(this)));
        ((RelativeLayout.LayoutParams) this.f197823h.getLayoutParams()).addRule(12);
        this.f197823h.mo104738c(false);
        setWPKeyboard(this.f197819d.getContentEt(), true, false);
        this.f197819d.setmContentAbnormalMoneyCheck(true);
        this.f197819d.post(new C76131p0(this));
        setMMTitle((int) C0966R.string.bg9);
        setBackBtn(new C76132q0(this));
        ((ScrollView) findViewById(C0966R.C0970id.iwq)).setOnTouchListener(new C76133r0(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1335);
        addSceneEndListener(1660);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1335);
        removeSceneEndListener(1660);
    }

    public void onDialogDismiss(Dialog dialog) {
        Log.m105924i("MicroMsg.WalletCollectQrCodeSettingUI", "onDialogDismiss()");
        MMHandlerThread.postToMainThreadDelayed(this.f197825j, 300);
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.WalletCollectQrCodeSettingUI", "onPause()");
        if (!this.f197823h.mo104747k()) {
            this.f197824i = 3;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.WalletCollectQrCodeSettingUI", "onResume()");
        if (this.f197824i == 3 && isHandleAutoShowNormalStWcKb()) {
            showNormalStWcKb();
        }
        this.f197824i = 2;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.WalletCollectQrCodeSettingUI", "errType: %s ，errCode：%s, errMsg：%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar instanceof C75488p0) {
            if (i == 0 && i2 == 0) {
                C75488p0 p0Var = (C75488p0) yVar;
                Intent intent = new Intent();
                intent.putExtra("ftf_pay_url", p0Var.f221847d);
                intent.putExtra("key_error_level", p0Var.f221851h);
                intent.putExtra("ftf_fixed_fee", p0Var.f221848e);
                intent.putExtra("ftf_fixed_fee_type", p0Var.f221849f);
                intent.putExtra("ftf_fixed_desc", p0Var.f221850g);
                setResult(-1, intent);
                hideVKB();
                finish();
                return true;
            }
        } else if (yVar instanceof C75481j0) {
            C75481j0 j0Var = (C75481j0) yVar;
            if (i != 0 || i2 != 0) {
                Log.m105921e("MicroMsg.WalletCollectQrCodeSettingUI", "net error: %s", j0Var);
            } else if (j0Var.f221809f == 0) {
                Intent intent2 = new Intent();
                intent2.putExtra("ftf_pay_url", j0Var.f221811h);
                intent2.putExtra("ftf_fixed_fee", ((double) j0Var.f221824x) / 100.0d);
                intent2.putExtra("ftf_fixed_desc", j0Var.f221825y);
                intent2.putExtra("key_currency_unit", j0Var.f221820t);
                setResult(-1, intent2);
                hideVKB();
                finish();
                return true;
            } else {
                int i3 = j0Var.f221812i;
                if (i3 == 0) {
                    C76879j.m92712F(getContext(), j0Var.f221810g, j0Var.f221813j, false);
                    return true;
                } else if (i3 == 1) {
                    if (!Util.isNullOrNil(j0Var.f221814n) && !Util.isNullOrNil(j0Var.f221815o)) {
                        C76879j.m92707A(getContext(), j0Var.f221810g, j0Var.f221813j, j0Var.f221815o, j0Var.f221814n, new C68852c(j0Var), new C68853d(this));
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C0005a.class);
    }
}
