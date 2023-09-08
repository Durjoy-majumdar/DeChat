package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75102b0;
import com.tencent.p014mm.wallet_core.model.C75108e;
import com.tencent.p014mm.wallet_core.model.C75140t0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import di3.C86312j;
import gr3.C76024a;
import i53.C76286a;
import j53.C76394s;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;
import v53.C78342e0;
import yq3.C79143a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI */
public class WalletForgotPwdVerifyIdUI extends WalletBaseUI implements View.OnLayoutChangeListener {

    /* renamed from: u */
    public static final /* synthetic */ int f208826u = 0;

    /* renamed from: d */
    public MMEditText f208827d;

    /* renamed from: e */
    public TextView f208828e;

    /* renamed from: f */
    public TextView f208829f;

    /* renamed from: g */
    public WalletFormView f208830g;

    /* renamed from: h */
    public Button f208831h;

    /* renamed from: i */
    public TextView f208832i;

    /* renamed from: j */
    public View f208833j;

    /* renamed from: n */
    public LinearLayout f208834n;

    /* renamed from: o */
    public ViewGroup.MarginLayoutParams f208835o;

    /* renamed from: p */
    public ViewGroup.MarginLayoutParams f208836p;

    /* renamed from: q */
    public View f208837q;

    /* renamed from: r */
    public int f208838r = 0;

    /* renamed from: s */
    public boolean f208839s = false;

    /* renamed from: t */
    public boolean f208840t = false;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI$a */
    public class C71994a implements Runnable {
        public C71994a() {
        }

        public void run() {
            WalletForgotPwdVerifyIdUI.this.f208829f.setVisibility(8);
            WalletForgotPwdVerifyIdUI.this.f208832i.setVisibility(8);
            WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI = WalletForgotPwdVerifyIdUI.this;
            walletForgotPwdVerifyIdUI.f208835o = (ViewGroup.MarginLayoutParams) walletForgotPwdVerifyIdUI.f208834n.getLayoutParams();
            WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI2 = WalletForgotPwdVerifyIdUI.this;
            walletForgotPwdVerifyIdUI2.f208835o.topMargin = C74942w4.m89784a(walletForgotPwdVerifyIdUI2, 47);
            WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI3 = WalletForgotPwdVerifyIdUI.this;
            walletForgotPwdVerifyIdUI3.f208834n.setLayoutParams(walletForgotPwdVerifyIdUI3.f208835o);
            WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI4 = WalletForgotPwdVerifyIdUI.this;
            walletForgotPwdVerifyIdUI4.f208836p = (ViewGroup.MarginLayoutParams) walletForgotPwdVerifyIdUI4.f208831h.getLayoutParams();
            WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI5 = WalletForgotPwdVerifyIdUI.this;
            walletForgotPwdVerifyIdUI5.f208836p.topMargin = C74942w4.m89784a(walletForgotPwdVerifyIdUI5, 48);
            WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI6 = WalletForgotPwdVerifyIdUI.this;
            walletForgotPwdVerifyIdUI6.f208831h.setLayoutParams(walletForgotPwdVerifyIdUI6.f208836p);
        }
    }

    /* renamed from: H7 */
    public static void m84414H7(WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        walletForgotPwdVerifyIdUI.getClass();
        Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", " haveIdentityText：" + walletForgotPwdVerifyIdUI.f208840t);
        Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", " haveNameText：" + walletForgotPwdVerifyIdUI.f208839s);
        if (!walletForgotPwdVerifyIdUI.f208840t || !walletForgotPwdVerifyIdUI.f208839s) {
            walletForgotPwdVerifyIdUI.f208831h.setEnabled(false);
        } else {
            walletForgotPwdVerifyIdUI.f208831h.setEnabled(true);
        }
    }

    /* renamed from: I7 */
    public final void mo99207I7() {
        Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", " setChangParams()");
        new MMHandler().postDelayed(new C71994a(), 100);
    }

    /* renamed from: J7 */
    public final void mo99208J7() {
        Class cls = C79173v.class;
        Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", "updateView");
        int i = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_cre_type;
        String str = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_cre_name;
        String str2 = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_true_name;
        this.f208827d.setHint(getString(C0966R.string.kqg, new Object[]{C75228t.m90270s(str2)}));
        if (!Util.isNullOrNil(str)) {
            this.f208828e.setText(str);
        } else {
            Log.m105928w("MicroMsg.WalletForgotPwdVerifyIdUI", "creName is null");
        }
        if (i == 1) {
            C76024a.m91324e(this.f208830g);
            setEditFocusListener(this.f208830g, 1, false, false, true);
            return;
        }
        Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", "no need tenpay keyboard");
    }

    public void finish() {
        C76286a.C76293g gVar;
        super.finish();
        getIntent().putExtra("process_id", C76286a.class.hashCode());
        C76286a aVar = (C76286a) C79143a.m95768g(this);
        if (aVar != null && (gVar = aVar.f223481d) != null) {
            gVar.run(-1);
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cev;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", "onCreate");
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        setMMTitleVisibility(8);
        this.f208837q = findViewById(C0966R.C0970id.iwk);
        this.f208838r = getWindowManager().getDefaultDisplay().getHeight() / 3;
        this.f208837q.addOnLayoutChangeListener(this);
        if (!getInput().getBoolean("key_is_force_bind", false)) {
            doSceneProgress(new C78342e0((String) null, 6));
            setContentViewVisibility(4);
        }
        this.f208827d = (MMEditText) findViewById(C0966R.C0970id.h_8);
        this.f208828e = (TextView) findViewById(C0966R.C0970id.f35);
        this.f208830g = (WalletFormView) findViewById(C0966R.C0970id.f358436f34);
        this.f208831h = (Button) findViewById(C0966R.C0970id.hfe);
        this.f208832i = (TextView) findViewById(C0966R.C0970id.i8y);
        this.f208833j = findViewById(C0966R.C0970id.iwc);
        this.f208829f = (TextView) findViewById(C0966R.C0970id.knx);
        this.f208834n = (LinearLayout) findViewById(C0966R.C0970id.h__);
        this.f208830g.setEnabled(false);
        this.f208830g.setFocusable(false);
        this.f208831h.setOnClickListener(new C72035e(this));
        this.f208832i.setOnClickListener(new C5763f(this));
        mo99208J7();
        setTenpayKBStateListener(new C72040i(this));
        this.f208827d.setOnFocusChangeListener(new C72041j(this));
        this.f208827d.addTextChangedListener(new C72038g(this));
        this.f208830g.mo105069a(new C72039h(this));
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i8 != 0 && i4 != 0 && i8 - i4 > this.f208838r) {
            Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", " up");
            mo99207I7();
        } else if (i8 != 0 && i4 != 0 && i4 - i8 > this.f208838r) {
            Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", " down");
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.WalletForgotPwdVerifyIdUI", " errCode: %s errMsg: %s  scene: %s", Integer.valueOf(i2), str, yVar);
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C78342e0) {
                mo99208J7();
                setContentViewVisibility(0);
            } else if (yVar instanceof C76394s) {
                C76394s sVar = (C76394s) yVar;
                getInput().putInt("key_is_support_face", sVar.f223696g);
                getInput().putInt("key_face_action_scene", sVar.f223697h);
                getInput().putString("key_face_action_package", sVar.f223698i);
                getInput().putString("key_face_action_package_sign", sVar.f223700n);
                if (sVar.f223699j == 1) {
                    C75140t0.m90124c().getClass();
                    if (!C75108e.m90085b().mo104815f(C75140t0.m90123b())) {
                        Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", "checkInstallCert, crt not installed");
                        doSceneForceProgress(new C75102b0(sVar.f223693d, sVar.f223694e, sVar.f223695f, C75140t0.m90124c().f221094f));
                    } else {
                        Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", "already install cert, go to next process");
                        getProcess().mo91264o(this, 0, getInput());
                    }
                } else {
                    Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", "verify realname info finish, go to next process");
                    getProcess().mo91264o(this, 0, getInput());
                }
            } else if (yVar instanceof C75102b0) {
                Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", "install cert finish, go to next process");
                getProcess().mo91264o(this, 0, getInput());
            }
        }
        return false;
    }
}
