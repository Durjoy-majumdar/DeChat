package com.tencent.p014mm.plugin.wallet_ecard.p126ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardSelectUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C117747y;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI */
public class WalletECardElementInputUI extends WalletECardBaseUI {

    /* renamed from: d */
    public WalletFormView f210962d;

    /* renamed from: e */
    public ElementQuery f210963e;

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI$a */
    public class C72526a implements View.OnClickListener {
        public C72526a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardElementInputUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Bundle bundle = new Bundle();
            bundle.putInt("key_support_bankcard", WalletECardElementInputUI.this.getInput().getInt("key_support_bankcard", 3));
            bundle.putInt("key_bind_scene", WalletECardElementInputUI.this.getInput().getInt("key_bind_scene", -1));
            if (!Util.isNullOrNil(WalletECardElementInputUI.this.f210962d.getText())) {
                bundle.putString("key_bank_type", WalletECardElementInputUI.this.f210963e.f209516s);
                bundle.putInt("key_bankcard_type", WalletECardElementInputUI.this.f210963e.f209515r);
            }
            C79148e g = C79143a.m95768g(WalletECardElementInputUI.this);
            if (g != null) {
                g.mo109106E(WalletECardElementInputUI.this, WalletCardSelectUI.class, bundle, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardElementInputUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI$b */
    public class C72527b implements View.OnClickListener {
        public C72527b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardElementInputUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("MicroMsg.WalletECardElementInputUI", "goto next: %s", WalletECardElementInputUI.this.f210963e.f209516s);
            WalletECardElementInputUI.this.getNetController().mo91271d(WalletECardElementInputUI.this.f210963e);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardElementInputUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public final void mo99929H7() {
        if (this.f210963e == null) {
            this.f210963e = new ElementQuery();
        }
        if (Util.isNullOrNil(this.f210963e.f209505e)) {
            this.f210962d.setText("");
        } else if (!Util.isNullOrNil(this.f210963e.f209517t)) {
            WalletFormView walletFormView = this.f210962d;
            walletFormView.setText(this.f210963e.f209505e + " " + this.f210963e.f209517t);
        } else if (2 == this.f210963e.f209515r) {
            WalletFormView walletFormView2 = this.f210962d;
            walletFormView2.setText(this.f210963e.f209505e + " " + getString(C0966R.string.krm));
        } else {
            WalletFormView walletFormView3 = this.f210962d;
            walletFormView3.setText(this.f210963e.f209505e + " " + getString(C0966R.string.ksc));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a05;
    }

    public void initView() {
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.lg7);
        this.f210962d = walletFormView;
        walletFormView.setOnClickListener(new C72526a());
        ((Button) findViewById(C0966R.C0970id.hfe)).setOnClickListener(new C72527b());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.WalletECardElementInputUI", "onAcvityResult requestCode:" + i);
        if (i2 == -1) {
            if (i != 1) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            this.f210963e = (ElementQuery) intent.getParcelableExtra("elemt_query");
            mo99929H7();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.c2z);
        initView();
        mo99929H7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
