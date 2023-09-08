package com.tencent.p014mm.plugin.wallet_payu.create.p807ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMFormMobileInputView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import eb0.C75592q0;
import nj3.C88989a;
import ob0.C117747y;
import t63.C77874a;
import u63.C78133b;
import u63.C78134c;
import v63.C78359a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI */
public class WalletPayUStartOpenUI extends WalletBaseUI {

    /* renamed from: j */
    public static final /* synthetic */ int f211165j = 0;

    /* renamed from: d */
    public MMFormMobileInputView f211166d;

    /* renamed from: e */
    public EditText f211167e;

    /* renamed from: f */
    public EditText f211168f;

    /* renamed from: g */
    public Button f211169g;

    /* renamed from: h */
    public String f211170h;

    /* renamed from: i */
    public String f211171i;

    /* renamed from: H7 */
    public final void mo99984H7() {
        if (this.f211166d.getVisibility() == 0) {
            if (!Util.isNullOrNil(mo99985I7()) && !Util.isNullOrNil(this.f211168f.getText().toString())) {
                this.f211171i = mo99985I7();
                this.f211170h = this.f211166d.getMobileNumber();
                this.f211169g.setEnabled(true);
                return;
            }
            this.f211169g.setEnabled(false);
        }
    }

    /* renamed from: I7 */
    public final String mo99985I7() {
        return this.f211166d.getCountryCode().startsWith("+") ? this.f211166d.getCountryCode().substring(1) : this.f211166d.getCountryCode();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bmj;
    }

    public boolean needConfirmFinish() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f211170h = getInput().getString("key_mobile");
        String string = getInput().getString("dial_code");
        this.f211171i = string;
        if (Util.isNullOrNil(string)) {
            this.f211171i = "27";
        }
        ((WalletPayUOpenIntroView) findViewById(C0966R.C0970id.f8i)).setPagerData(new C77874a[]{new C77874a(C0966R.C0969drawable.c_7, C0966R.string.l5g, C0966R.string.l5a), new C77874a(C0966R.C0969drawable.c_8, C0966R.string.l5h, C0966R.string.l5b), new C77874a(C0966R.C0969drawable.c_9, C0966R.string.l5i, C0966R.string.l5c)});
        this.f211166d = (MMFormMobileInputView) findViewById(C0966R.C0970id.k0i);
        this.f211169g = (Button) findViewById(C0966R.C0970id.k0c);
        this.f211167e = this.f211166d.getCountryCodeEditText();
        this.f211168f = this.f211166d.getMobileNumberEditText();
        if (!Util.isNullOrNil(this.f211170h)) {
            this.f211168f.setText(this.f211170h);
        }
        if (!Util.isNullOrNil(this.f211171i)) {
            this.f211167e.setText(this.f211171i);
        }
        C78133b bVar = new C78133b(this);
        this.f211168f.addTextChangedListener(bVar);
        this.f211167e.addTextChangedListener(bVar);
        this.f211169g.setOnClickListener(new C78134c(this));
        C78359a.m94632a(this, (TextView) findViewById(C0966R.C0970id.k0g));
        ((TextView) findViewById(C0966R.C0970id.k0j)).setText(C75592q0.m90763K() ? C0966R.string.l5m : C0966R.string.l5n);
    }

    public void onResume() {
        super.onResume();
        mo99984H7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
