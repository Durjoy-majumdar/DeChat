package com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui;

import android.os.Bundle;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C74866y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import nj3.C88989a;
import ob0.C117747y;
import z63.C79315b;
import z63.C79316c;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI */
public class WalletPayUSecurityQuestionSettingUI extends WalletBaseUI {

    /* renamed from: j */
    public static final /* synthetic */ int f211183j = 0;

    /* renamed from: d */
    public WalletPayUSecurityQuestionView f211184d;

    /* renamed from: e */
    public WalletFormView f211185e;

    /* renamed from: f */
    public Button f211186f;

    /* renamed from: g */
    public C74866y0 f211187g;

    /* renamed from: h */
    public String f211188h = "";

    /* renamed from: i */
    public C72587a f211189i;

    /* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI$a */
    public class C72587a {
        public C72587a() {
        }

        /* renamed from: a */
        public static void m84958a(C72587a aVar) {
            if ((Util.isNullOrNil(WalletPayUSecurityQuestionSettingUI.this.f211184d.f211194g) ^ true) && WalletPayUSecurityQuestionSettingUI.this.f211185e.mo105094l()) {
                WalletPayUSecurityQuestionSettingUI.this.f211186f.setEnabled(true);
            } else {
                WalletPayUSecurityQuestionSettingUI.this.f211186f.setEnabled(false);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bmi;
    }

    public boolean needConfirmFinish() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C74866y0 y0Var = new C74866y0(this);
        this.f211187g = y0Var;
        y0Var.f220078n = true;
        y0Var.f220079o = C0966R.style.f8381gh;
        y0Var.f220117u = new C79315b(this);
        y0Var.f220118v = new C72589b(this);
        this.f211189i = new C72587a();
        this.f211184d = (WalletPayUSecurityQuestionView) findViewById(C0966R.C0970id.htw);
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.htv);
        this.f211185e = walletFormView;
        if (walletFormView == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setIsSecretAnswer(true);
        }
        this.f211186f = (Button) findViewById(C0966R.C0970id.htu);
        this.f211184d.setOnClickListener(new C79316c(this));
        this.f211185e.setOnInputValidChangeListener(new C72590c(this));
        this.f211186f.setOnClickListener(new C72591d(this));
        C72587a.m84958a(this.f211189i);
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
