package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import b63.C67189i;
import b63.C67210w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75102b0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tencent.xweb.WCWebUpdater;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI */
public class WalletVerifyIdCardUI extends WalletBaseUI {

    /* renamed from: d */
    public TextView f210339d;

    /* renamed from: e */
    public EditHintPasswdView f210340e;

    /* renamed from: f */
    public C67189i f210341f = new C67189i();

    /* renamed from: g */
    public boolean f210342g = false;

    /* renamed from: h */
    public C75102b0.C75103a f210343h = new C72334d();

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI$a */
    public class C72330a implements MenuItem.OnMenuItemClickListener {
        public C72330a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletVerifyIdCardUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI$b */
    public class C72331b implements EditHintPasswdView.C75206c {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI$b$a */
        public class C72332a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f210346d;

            public C72332a(boolean z) {
                this.f210346d = z;
            }

            public void run() {
                if (this.f210346d) {
                    WalletVerifyIdCardUI walletVerifyIdCardUI = WalletVerifyIdCardUI.this;
                    C75102b0.C75103a aVar = walletVerifyIdCardUI.f210343h;
                    boolean z = false;
                    if (walletVerifyIdCardUI.f210342g) {
                        Log.m105924i("MicroMsg.WalletVerifyIdCardUI", "isCertInstalled passed");
                    } else {
                        String string = walletVerifyIdCardUI.getInput().getString("key_cre_type");
                        String text = walletVerifyIdCardUI.f210340e.getText();
                        C67189i iVar = walletVerifyIdCardUI.f210341f;
                        int i = iVar.f192900a;
                        if ((i == 1) && iVar.f192903d == 0) {
                            Log.m105925i("MicroMsg.WalletVerifyIdCardUI", "tryToinstallCert isBlockInstall %s", aVar);
                            if (!Util.isNullOrNil(text)) {
                                C115669n.INSTANCE.mo160131h(13731, 6);
                                walletVerifyIdCardUI.doSceneProgress(new C75102b0(string, text, walletVerifyIdCardUI.getPayReqKey(), aVar, true));
                            } else {
                                Log.m105925i("MicroMsg.WalletVerifyIdCardUI", "tryToinstallCert isBlockInstall sms error %s", aVar);
                            }
                        } else {
                            if (i == 1) {
                                Log.m105925i("MicroMsg.WalletVerifyIdCardUI", "tryToinstallCert isNeedInstall %s", aVar);
                                C115669n.INSTANCE.mo160131h(13731, 6);
                                walletVerifyIdCardUI.doSceneProgress(new C75102b0(string, text, walletVerifyIdCardUI.getPayReqKey(), aVar, false));
                            } else {
                                Log.m105924i("MicroMsg.WalletVerifyIdCardUI", "no need installcert");
                            }
                        }
                        z = true;
                    }
                    if (!z) {
                        WalletVerifyIdCardUI.m84656H7(WalletVerifyIdCardUI.this);
                    }
                }
            }
        }

        public C72331b() {
        }

        public void onInputValidChange(boolean z) {
            WalletVerifyIdCardUI.this.f210340e.postDelayed(new C72332a(z), 50);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI$c */
    public class C72333c implements DialogInterface.OnClickListener {
        public C72333c(WalletVerifyIdCardUI walletVerifyIdCardUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI$d */
    public class C72334d implements C75102b0.C75103a {
        public C72334d() {
        }

        /* renamed from: a */
        public void mo99663a(C117747y yVar, boolean z) {
            if (z) {
                WalletVerifyIdCardUI.m84656H7(WalletVerifyIdCardUI.this);
            }
        }
    }

    /* renamed from: H7 */
    public static void m84656H7(WalletVerifyIdCardUI walletVerifyIdCardUI) {
        if (walletVerifyIdCardUI.getNetController() != null) {
            Log.m105919d("MicroMsg.WalletVerifyIdCardUI", "3des text: %s", walletVerifyIdCardUI.f210340e.getText());
            C67210w wVar = new C67210w();
            wVar.f192984b = walletVerifyIdCardUI.getInput().getString("key_pwd1");
            wVar.f192996n = (PayInfo) walletVerifyIdCardUI.getInput().getParcelable("key_pay_info");
            wVar.f192993k = 1;
            wVar.f192995m = walletVerifyIdCardUI.getInput().getString("key_cre_type");
            wVar.f192994l = walletVerifyIdCardUI.f210340e.getText();
            wVar.f192986d = Util.nullAs(walletVerifyIdCardUI.getInput().getString("kreq_token"), "");
            int i = walletVerifyIdCardUI.getInput().getInt("key_pay_flag", 0);
            if (i == 1) {
                wVar.f192983a = "1";
            } else if (i != 2) {
                if (i == 3) {
                    if (!walletVerifyIdCardUI.getInput().getBoolean("key_is_oversea", false)) {
                        wVar.f192983a = "3";
                    } else {
                        wVar.f192983a = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN;
                    }
                }
            } else if (!walletVerifyIdCardUI.getInput().getBoolean("key_is_oversea", false)) {
                wVar.f192983a = "2";
            } else {
                wVar.f192983a = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY;
            }
            Bankcard bankcard = (Bankcard) walletVerifyIdCardUI.getInput().getParcelable("key_bankcard");
            if (bankcard != null) {
                wVar.f192987e = bankcard.field_bankcardType;
                wVar.f192988f = bankcard.field_bindSerial;
                wVar.f192990h = Util.nullAs(bankcard.field_arrive_type, "");
            } else {
                String string = walletVerifyIdCardUI.getInput().getString("key_bank_type");
                wVar.f192987e = string;
                if (Util.isNullOrNil(string)) {
                    wVar.f192987e = walletVerifyIdCardUI.getInput().getString("key_bind_card_type", "");
                }
            }
            walletVerifyIdCardUI.getNetController().mo91271d(wVar);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgs;
    }

    public void initView() {
        this.f210339d = (TextView) findViewById(C0966R.C0970id.f359609lu0);
        this.f210340e = (EditHintPasswdView) findViewById(C0966R.C0970id.ltz);
        String string = getInput().getString("key_true_name");
        String string2 = getInput().getString("key_cre_name");
        String string3 = getInput().getString("key_cre_type");
        this.f210339d.setText(getString(C0966R.string.ktt, new Object[]{string, string2}));
        this.f210340e.setEditTextMaxLength(4);
        this.f210340e.setEditTextSize(34.0f);
        this.f210340e.setOnInputValidListener(new C72331b());
        if ("1".equals(string3)) {
            setEditFocusListener(this.f210340e, 1, false);
        } else {
            setEditFocusListener(this.f210340e, 1, true);
        }
    }

    public void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        this.f210341f = new C67189i(getInput());
        initView();
        getSupportActionBar().mo91112w(new ColorDrawable(getResources().getColor(C0966R.color.al6)));
        View j = getSupportActionBar().mo91099j();
        if (!(j == null || (findViewById = j.findViewById(C0966R.C0970id.c7p)) == null)) {
            findViewById.setBackgroundColor(getResources().getColor(C0966R.color.ahf));
        }
        if (C11171e.m11046c(21)) {
            if (C11171e.m11046c(23)) {
                getWindow().setStatusBarColor(getResources().getColor(C0966R.color.al6));
            } else {
                getWindow().setStatusBarColor(getResources().getColor(C0966R.color.BW_90));
            }
        }
        setMMTitle("");
        setBackBtn(new C72330a(), C0966R.raw.actionbar_icon_dark_back);
    }

    public boolean onPreSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.WalletVerifyIdCardUI", "onPreSceneEnd %s %s", Integer.valueOf(i2), yVar);
        if ((yVar instanceof C75102b0) && i2 == 0) {
            this.f210342g = true;
            C76912y0.makeText((Context) this, (int) C0966R.string.l2c, 0).show();
            Log.m105924i("MicroMsg.WalletVerifyIdCardUI", "tag it isCertInstalled ok");
        }
        return true;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C75102b0)) {
            return false;
        }
        if (i2 == 0 || !((C75102b0) yVar).f221014f) {
            this.f210340e.mo105043a();
            return true;
        }
        C76879j.m92713G(getContext(), str, (String) null, false, new C72333c(this));
        return true;
    }
}
