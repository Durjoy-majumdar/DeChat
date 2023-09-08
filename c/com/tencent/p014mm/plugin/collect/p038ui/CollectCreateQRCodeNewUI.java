package com.tencent.p014mm.plugin.collect.p038ui;

import a21.C0005a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
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
import h21.C76107h;
import h21.C76109i;
import h21.C76113j;
import h21.C76117k;
import h21.C76120l;
import h21.C76122m;
import h21.C76124n;
import h21.C76128o;
import h21.C76130p;
import java.util.HashSet;
import nj3.C76879j;
import ob0.C117747y;
import p629ny.C76979h;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI */
public class CollectCreateQRCodeNewUI extends WalletBaseUI {

    /* renamed from: d */
    public WalletFormView f197797d;

    /* renamed from: e */
    public TextView f197798e;

    /* renamed from: f */
    public TextView f197799f;

    /* renamed from: g */
    public String f197800g = "";

    /* renamed from: h */
    public WcPayKeyboard f197801h;

    /* renamed from: i */
    public int f197802i = 0;

    /* renamed from: j */
    public Runnable f197803j = new C68839b();

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI$a */
    public class C68838a implements C7092q.C7093a {
        public C68838a() {
        }

        public void onClick(View view) {
            CollectCreateQRCodeNewUI.m81104I7(CollectCreateQRCodeNewUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI$b */
    public class C68839b implements Runnable {
        public C68839b() {
        }

        public void run() {
            CollectCreateQRCodeNewUI collectCreateQRCodeNewUI = CollectCreateQRCodeNewUI.this;
            if (collectCreateQRCodeNewUI.f197802i == 2 && collectCreateQRCodeNewUI.isHandleAutoShowNormalStWcKb()) {
                CollectCreateQRCodeNewUI.this.showNormalStWcKb();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI$c */
    public class C68840c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C75481j0 f197806d;

        public C68840c(C75481j0 j0Var) {
            this.f197806d = j0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!Util.isNullOrNil(this.f197806d.f221816p)) {
                Log.m105925i("MicroMsg.CollectCreateQRCodeNewUI", "goto h5: %s", this.f197806d.f221816p);
                C75228t.m90219L(CollectCreateQRCodeNewUI.this.getContext(), this.f197806d.f221816p, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI$d */
    public class C68841d implements DialogInterface.OnClickListener {
        public C68841d(CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI$e */
    public class C68842e implements C7092q.C7093a {
        public C68842e() {
        }

        public void onClick(View view) {
            CollectCreateQRCodeNewUI.m81104I7(CollectCreateQRCodeNewUI.this);
        }
    }

    /* renamed from: H7 */
    public static void m81103H7(CollectCreateQRCodeNewUI collectCreateQRCodeNewUI, String str) {
        collectCreateQRCodeNewUI.getClass();
        Log.m105925i("MicroMsg.CollectCreateQRCodeNewUI", "showErrorDialog,errMsg:%s", str);
        C77426q qVar = new C77426q(collectCreateQRCodeNewUI.getContext());
        qVar.mo107606r("");
        qVar.mo107595g(str);
        qVar.mo107589a(true);
        qVar.mo107601m(C0966R.string.lkg);
        qVar.mo107600l(new C76113j(collectCreateQRCodeNewUI));
        qVar.mo107603o();
    }

    /* renamed from: I7 */
    public static void m81104I7(CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        collectCreateQRCodeNewUI.getClass();
        Log.m105924i("MicroMsg.CollectCreateQRCodeNewUI", "onClick() edit desc");
        collectCreateQRCodeNewUI.hideTenpayKB();
        collectCreateQRCodeNewUI.hideWcKb();
        C45890a.m51175a(collectCreateQRCodeNewUI, collectCreateQRCodeNewUI.getString(C0966R.string.bga), collectCreateQRCodeNewUI.f197800g, "", true, 32, new C76107h(collectCreateQRCodeNewUI), new C76109i(collectCreateQRCodeNewUI));
    }

    /* renamed from: J7 */
    public final void mo94692J7() {
        if (!Util.isNullOrNil(this.f197800g)) {
            String string = getString(C0966R.string.bgc);
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, getString(C0966R.string.bgb, new Object[]{this.f197800g, string}));
            C75228t.m90253j0(this.f197799f, T1.toString(), T1.length() - string.length(), T1.length(), new C7092q((C7092q.C7093a) new C68842e(), true), getContext());
            this.f197798e.setVisibility(8);
            this.f197799f.setVisibility(0);
            return;
        }
        String string2 = getString(C0966R.string.bga);
        C75228t.m90253j0(this.f197798e, string2, 0, string2.length(), new C7092q((C7092q.C7093a) new C68838a(), true), getContext());
        this.f197798e.setVisibility(0);
        this.f197799f.setVisibility(8);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7019v4;
    }

    public void initView() {
        this.f197797d = (WalletFormView) findViewById(C0966R.C0970id.gym);
        ((TextView) findViewById(C0966R.C0970id.ljn)).setTextSize(1, 56.0f);
        ((EditText) findViewById(C0966R.C0970id.lg_)).setTextSize(1, 56.0f);
        C76024a.m91326g(this.f197797d);
        C75228t.m90251i0(this.f197797d.getContentEt());
        String stringExtra = getIntent().getStringExtra("key_currency_unit");
        if (!Util.isNullOrNil(stringExtra)) {
            this.f197797d.getTitleTv().setText(stringExtra);
        } else {
            this.f197797d.getTitleTv().setText(C45121z0.m49962b());
        }
        this.f197797d.mo105069a(new C76117k(this));
        this.f197797d.mo105097o(7, 2);
        this.f197799f = (TextView) findViewById(C0966R.C0970id.bh9);
        this.f197798e = (TextView) findViewById(C0966R.C0970id.bh8);
        mo94692J7();
        WcPayKeyboard wcPayKeyboard = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
        this.f197801h = wcPayKeyboard;
        wcPayKeyboard.mo104740e();
        this.f197801h.setActionText(getString(C0966R.string.bg6));
        this.f197797d.getContentEt().setOnEditorActionListener(new C76122m(this, new C76120l(this)));
        ((RelativeLayout.LayoutParams) this.f197801h.getLayoutParams()).addRule(12);
        this.f197801h.mo104738c(false);
        setWPKeyboard(this.f197797d.getContentEt(), true, false);
        this.f197797d.setmContentAbnormalMoneyCheck(true);
        this.f197797d.post(new C76124n(this));
        setMMTitle((int) C0966R.string.bg9);
        setBackBtn(new C76128o(this));
        ((ScrollView) findViewById(C0966R.C0970id.iwq)).setOnTouchListener(new C76130p(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1335);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1335);
    }

    public void onDialogDismiss(Dialog dialog) {
        Log.m105924i("MicroMsg.CollectCreateQRCodeNewUI", "onDialogDismiss()");
        MMHandlerThread.postToMainThreadDelayed(this.f197803j, 300);
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.CollectCreateQRCodeNewUI", "onPause()");
        if (!this.f197801h.mo104747k()) {
            this.f197802i = 3;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.CollectCreateQRCodeNewUI", "onResume()");
        if (this.f197802i == 3 && isHandleAutoShowNormalStWcKb()) {
            showNormalStWcKb();
        }
        this.f197802i = 2;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.CollectCreateQRCodeNewUI", "errType: %s ，errCode：%s, errMsg：%s", Integer.valueOf(i), Integer.valueOf(i2), str);
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
                Log.m105921e("MicroMsg.CollectCreateQRCodeNewUI", "net error: %s", j0Var);
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
                        C76879j.m92707A(getContext(), j0Var.f221810g, j0Var.f221813j, j0Var.f221815o, j0Var.f221814n, new C68840c(j0Var), new C68841d(this));
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
