package com.tencent.p014mm.plugin.wallet_ecard.p126ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import gr3.C76024a;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI */
public class WalletECardCheckOtherCardUI extends WalletECardBaseUI implements WalletFormView.C75209c {

    /* renamed from: d */
    public WalletFormView f210957d;

    /* renamed from: e */
    public WalletFormView f210958e;

    /* renamed from: f */
    public Button f210959f;

    /* renamed from: g */
    public String f210960g;

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI$a */
    public class C72525a implements View.OnClickListener {
        public C72525a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardCheckOtherCardUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletECardCheckOtherCardUI", "do check card");
            if (!WalletECardCheckOtherCardUI.this.f210957d.mo105094l() || !WalletECardCheckOtherCardUI.this.f210958e.mo105094l()) {
                Log.m105928w("MicroMsg.WalletECardCheckOtherCardUI", "input invalid");
            } else {
                String text = WalletECardCheckOtherCardUI.this.f210957d.getText();
                String text2 = WalletECardCheckOtherCardUI.this.f210958e.getText();
                WalletECardCheckOtherCardUI.this.getNetController().mo91271d(text, text2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardCheckOtherCardUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359643a04;
    }

    public void initView() {
        this.f210957d = (WalletFormView) findViewById(C0966R.C0970id.b_o);
        this.f210958e = (WalletFormView) findViewById(C0966R.C0970id.b_p);
        this.f210959f = (Button) findViewById(C0966R.C0970id.b_q);
        C76024a.m91320a(this.f210957d);
        C76024a.m91325f(this, this.f210958e);
        if (!Util.isNullOrNil(this.f210960g)) {
            this.f210957d.setHint(getString(C0966R.string.c2v, new Object[]{this.f210960g}));
        } else {
            this.f210957d.setHint(getString(C0966R.string.c2w));
        }
        this.f210958e.setHint(getString(C0966R.string.c2x));
        this.f210957d.setOnInputValidChangeListener(this);
        this.f210958e.setOnInputValidChangeListener(this);
        setEditFocusListener(this.f210957d, 0, false);
        setEditFocusListener(this.f210958e, 0, false);
        this.f210959f.setEnabled(false);
        this.f210959f.setClickable(false);
        this.f210959f.setOnClickListener(new C72525a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f210960g = getInput().getString("key_true_name", "");
        setMMTitle(getString(C0966R.string.c2y));
        this.mNetSceneMgr.mo105624c(385);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        this.mNetSceneMgr.mo105630i(385);
    }

    public void onInputValidChange(boolean z) {
        Log.m105919d("MicroMsg.WalletECardCheckOtherCardUI", "is valid: %s", Boolean.valueOf(z));
        if (!this.f210957d.mo105094l() || !this.f210958e.mo105094l()) {
            this.f210959f.setEnabled(false);
            this.f210959f.setClickable(false);
            return;
        }
        this.f210959f.setEnabled(true);
        this.f210959f.setClickable(true);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
